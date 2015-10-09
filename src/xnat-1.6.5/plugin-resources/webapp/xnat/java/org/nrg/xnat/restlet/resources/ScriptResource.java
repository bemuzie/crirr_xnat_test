package org.nrg.xnat.restlet.resources;

import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.nrg.action.ClientException;
import org.nrg.action.ServerException;
import org.nrg.automation.entities.Script;
import org.nrg.automation.services.ScriptRunnerService;
import org.nrg.automation.services.ScriptService;
import org.nrg.framework.exceptions.NrgServiceException;
import org.nrg.xdat.XDAT;
import org.nrg.xft.XFTTable;
import org.nrg.xnat.helpers.prearchive.PrearcDatabase;
import org.restlet.Context;
import org.restlet.data.*;
import org.restlet.resource.Representation;
import org.restlet.resource.ResourceException;
import org.restlet.resource.StringRepresentation;
import org.restlet.resource.Variant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

public class ScriptResource extends AutomationResource {

    public ScriptResource(Context context, Request request, Response response) throws ResourceException {
        super(context, request, response);

        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        getVariants().add(new Variant(MediaType.TEXT_HTML));
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.TEXT_PLAIN));

        _scriptService = XDAT.getContextService().getBean(ScriptService.class);
        _runnerService = XDAT.getContextService().getBean(ScriptRunnerService.class);

        _scriptId = (String) getRequest().getAttributes().get(SCRIPT_ID);

        // If the user isn't a site admin, there's a limited set of operations they are permitted to perform.
        if (!user.isSiteAdmin()) {
            // You can't put or post or delete a script and you can't retrieve a specific script OTHER THAN the split
            // PET/MR script, which is used by the upload applet.
            if (!request.getMethod().equals(Method.GET) || (StringUtils.isNotBlank(_scriptId) && !_scriptId.equals(PrearcDatabase.SPLIT_PETMR_SESSION_ID))) {
                _log.warn(getRequestContext("User " + user.getLogin() + " attempted to access forbidden script trigger template resources"));
                response.setStatus(Status.CLIENT_ERROR_FORBIDDEN, "Only site admins can view or update script resources.");
                throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, "Only site admins can view or update script resources.");
            }
        }

        if (!request.getMethod().equals(Method.GET) && StringUtils.isBlank(_scriptId)) {
            response.setStatus(Status.CLIENT_ERROR_METHOD_NOT_ALLOWED, "You must specify a specific script ID to update or delete a script.");
            throw new ResourceException(Status.CLIENT_ERROR_METHOD_NOT_ALLOWED, "You must specify a specific script ID to update or delete a script.");
        }

        if (_log.isDebugEnabled()) {
            _log.debug(getRequestContext("Servicing script request for user " + user.getLogin()));
        }
    }

    @Override
    protected String getResourceType() {
        return Script.class.getSimpleName();
    }

    @Override
    protected String getResourceId() {
        return _scriptId;
    }

    @Override
    public boolean allowPut() {
        return true;
    }

    @Override
    public boolean allowDelete() {
        return true;
    }

    @Override
    public Representation represent(Variant variant) throws ResourceException {
        final MediaType mediaType = overrideVariant(variant);

        if (StringUtils.isNotBlank(_scriptId)) {
            try {
                // They're requesting a specific script, so return that to them.
                Script script = getScript();

                // Here's a special case: if they're trying to get the split PET/MR script and it doesn't exist, give
                // them the default implementation.
                // TODO This should be expanded into a default script repository function.
                if (script == null && _scriptId.equalsIgnoreCase(PrearcDatabase.SPLIT_PETMR_SESSION_ID)) {
                    script = PrearcDatabase.DEFAULT_SPLIT_PETMR_SESSION_SCRIPT;
                }

                // have to check if it's null, or else it will return a StringRepresentation containing the word null instead of a 404
                if (script != null) {
                    return new StringRepresentation(MAPPER.writeValueAsString(script), mediaType);
                } else {
                    return null;
                }
            } catch (IOException e) {
                throw new ResourceException(Status.SERVER_ERROR_INTERNAL, "An error occurred marshalling the script data to JSON", e);
            }
        } else {
            // They're asking for list of available scripts, so give them that.
            return listScripts(mediaType);
        }
    }

    @Override
    public void handlePut() {
        try {
            if (_log.isDebugEnabled()) {
                _log.debug("Preparing to PUT script: " + _scriptId);
            }
            putScript();
        } catch (ClientException e) {
            _log.error("Client error occurred trying to store a script resource: " + _scriptId, e);
            getResponse().setStatus(e.getStatus(), e.getMessage());
        } catch (ServerException e) {
            _log.error("Server error occurred trying to store a script resource: " + _scriptId, e);
            getResponse().setStatus(e.getStatus(), e.getMessage());
        }
    }

    @Override
    public void handleDelete() {
        try {
            if (_log.isDebugEnabled()) {
                _log.debug("Preparing to delete script: " + _scriptId + " and its associated triggers.");
            }
            _runnerService.deleteScript(_scriptId);
            recordAutomationEvent(_scriptId, SITE_SCOPE, "Delete", Script.class);
        } catch (NrgServiceException e) {
            _log.warn(e.getMessage());
            getResponse().setStatus(Status.SERVER_ERROR_INTERNAL, e, "A service exception occurred trying to delete (disable) script");
        }
    }

    /**
     * Lists the scripts at the specified scope and entity ID.
     *
     * @return A representation of the scripts available at the specified scope and entity ID (if specified).
     */
    private Representation listScripts(final MediaType mediaType) {
        Hashtable<String, Object> params = new Hashtable<>();

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Script ID");
        columns.add("Language");
        columns.add("Description");

        XFTTable table = new XFTTable();
        table.initTable(columns);

        final List<Script> scripts = _scriptService.getAll();
        for (final Script script : scripts) {
            table.insertRowItems(script.getScriptId(),
                    script.getLanguage(),
                    script.getDescription());
        }

        return representTable(table, mediaType, params);
    }

    private Script getScript() {
        return _runnerService.getScript(_scriptId);
    }

    private void putScript() throws ClientException, ServerException {
        // TODO: this needs to properly handle a PUT to an existing script as well as an existing but disabled script.
        final Representation entity = getRequest().getEntity();
        if (entity.getSize() == 0) {
            logger.warn("Unable to find script parameters: no data sent?");
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "Unable to find script parameters: no data sent?");
            return;
        }

        MediaType mediaType = entity.getMediaType();
        if (!mediaType.equals(MediaType.APPLICATION_WWW_FORM) && !mediaType.equals(MediaType.APPLICATION_JSON)) {
            throw new ClientException(Status.CLIENT_ERROR_UNSUPPORTED_MEDIA_TYPE, "This function currently only supports " + MediaType.APPLICATION_WWW_FORM + " and " + MediaType.APPLICATION_JSON);
        }

        final Properties properties;
        if (mediaType.equals(MediaType.APPLICATION_WWW_FORM)) {
            try {
                final List<NameValuePair> formMap = URLEncodedUtils.parse(entity.getText(), DEFAULT_CHARSET);
                properties = new Properties();
                for (final NameValuePair entry : formMap) {
                    properties.setProperty(entry.getName(), entry.getValue());
                }
            } catch (IOException e) {
                throw new ServerException(Status.SERVER_ERROR_INTERNAL, "An error occurred trying to read the submitted form body.", e);
            }
        } else {
            try {
                final String text = entity.getText();
                properties = MAPPER.readValue(text, Properties.class);
            } catch (IOException e) {
                throw new ServerException(Status.SERVER_ERROR_INTERNAL, "An error occurred processing the script properties", e);
            }
        }

        if (properties.containsKey("scriptId")) {
            properties.remove("scriptId");
        }

        try {
            _runnerService.setScript(_scriptId, properties);
            recordAutomationEvent(_scriptId, SITE_SCOPE, "Update", Script.class);
        } catch (NrgServiceException e) {
            getResponse().setStatus(Status.CLIENT_ERROR_UNPROCESSABLE_ENTITY, e, "An error occurred saving the script " + _scriptId);
        }
    }

    private static final Logger _log = LoggerFactory.getLogger(ScriptResource.class);

    private static final String SCRIPT_ID = "SCRIPT_ID";
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private final ScriptService _scriptService;
    private final ScriptRunnerService _runnerService;
    private final String _scriptId;
}
