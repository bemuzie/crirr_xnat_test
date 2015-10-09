package org.nrg.xnat.restlet.resources;

import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.nrg.action.ClientException;
import org.nrg.action.ServerException;
import org.nrg.automation.entities.ScriptTrigger;
import org.nrg.automation.services.EventService;
import org.nrg.automation.services.ScriptTriggerService;
import org.nrg.framework.constants.Scope;
import org.nrg.xdat.XDAT;
import org.nrg.xft.XFTTable;
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
import java.util.*;

public class ScriptTriggerResource extends AutomationResource {

    public ScriptTriggerResource(Context context, Request request, Response response) throws ResourceException {
        super(context, request, response);

        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        getVariants().add(new Variant(MediaType.TEXT_HTML));
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.TEXT_PLAIN));

        _eventService = XDAT.getContextService().getBean(EventService.class);
        _scriptTriggerService = XDAT.getContextService().getBean(ScriptTriggerService.class);

        _eventId = (String) getRequest().getAttributes().get(EVENT_ID);
        final String triggerId = (String) getRequest().getAttributes().get(TRIGGER_ID);

        final boolean hasEvent = StringUtils.isNotBlank(_eventId);
        final boolean hasTriggerId = StringUtils.isNotBlank(triggerId);

        final String projectId;
        if (!hasTriggerId && !hasEvent) {
            projectId = getProjectId();
            _trigger = null;
        } else {
            if (hasTriggerId) {
                _trigger = _scriptTriggerService.getByTriggerId(triggerId);
                if (_trigger == null) {
                    throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND, "Can't find script trigger with ID: " + triggerId);
                }
                if (StringUtils.isNotBlank(_trigger.getAssociation())) {
                    setAssociation(_trigger.getAssociation());
                    projectId = getScope() == Scope.Site ? null : getProjectId();
                } else {
                    projectId = null;
                }
            } else if (hasProjectId()) {
                projectId = getProjectId();
                _trigger = _scriptTriggerService.getByAssociationAndEvent(Scope.encode(Scope.Project, projectId), _eventId);
            } else {
                projectId = null;
                _trigger = _scriptTriggerService.getByAssociationAndEvent(Scope.Site.code(), _eventId);
            }
        }

        if (StringUtils.isNotBlank(projectId)) {
            validateProjectAccess(projectId);
            setProjectId(projectId);
        } else if (!user.isSiteAdmin()) {
            final String message = "User " + user.getLogin() + " attempted to access forbidden script trigger resource at the site level.";
            _log.warn(message);
            throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN, message);
        }

        final Method method = request.getMethod();

        // You can't delete a trigger that you can't find.
        if (method.equals(Method.DELETE) && _trigger == null) {
            if (hasEvent) {
                throw new ResourceException(Status.CLIENT_ERROR_METHOD_NOT_ALLOWED, "You specified an invalid specific scope and event when trying to delete a script trigger: " + formatScopeEntityIdAndEvent());
            }
            throw new ResourceException(Status.CLIENT_ERROR_METHOD_NOT_ALLOWED, "You must specify a specific scope and event or trigger ID to delete a script trigger.");
        }
        // You can't get a trigger when you requested a specific trigger but that doesn't exist.
        if (method.equals(Method.GET) && _trigger == null && hasEvent) {
            throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND, "Can't find script trigger for " + formatScopeEntityIdAndEvent() + " to perform the " + method.toString() + " operation. ");
        }

        if (_log.isDebugEnabled()) {
            _log.debug("Servicing script trigger request " + formatScopeEntityIdAndEvent() + " for user " + user.getLogin());
        }
    }

    @Override
    protected String getResourceType() {
        return ScriptTrigger.class.getSimpleName();
    }

    @Override
    protected String getResourceId() {
        return _trigger == null ? null : _trigger.getEvent().getEventId();
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

        if (_trigger != null) {
            try {
                // They're requesting a specific trigger, so return that to them.
                return new StringRepresentation(MAPPER.writeValueAsString(mapTrigger(_trigger)), mediaType);
            } catch (IOException e) {
                throw new ResourceException(Status.SERVER_ERROR_INTERNAL, "An error occurred marshalling the script trigger data to JSON", e);
            }
        } else {
            // They're asking for list of existing script triggers, so give them that.
            return listScriptTriggers(mediaType);
        }
    }

    @Override
    public void handlePut() {
        try {
            putScriptTrigger();
        } catch (ClientException e) {
            getResponse().setStatus(e.getStatus(), e.getMessage());
        } catch (ServerException e) {
            _log.error("Server error occurred trying to store a script trigger resource", e);
            getResponse().setStatus(e.getStatus(), e.getMessage());
        }
    }

    @Override
    public void handleDelete() {
        if (_log.isDebugEnabled()) {
            _log.debug("Preparing to delete script trigger for " + formatScopeEntityIdAndEvent() + " and its associated triggers.");
        }
        final String triggerId = _trigger.getTriggerId();
        final String containerId = _trigger.getAssociation();
        _scriptTriggerService.delete(_trigger);
        recordAutomationEvent(triggerId, containerId, "Delete", ScriptTrigger.class);
    }

    private Map<String, String> mapTrigger(final ScriptTrigger trigger) {
        final Map<String, String> association = Scope.decode(trigger.getAssociation());

        final Map<String, String> properties = new HashMap<>();
        properties.put("triggerId", trigger.getTriggerId());
        properties.put("scope", association.get("scope"));
        properties.put("entityId", association.get("entityId"));
        properties.put("event", trigger.getEvent().getEventId());
        properties.put("scriptId", trigger.getScriptId());
        properties.put("description", trigger.getDescription());

        return properties;
    }

    /**
     * Lists the script triggers with the specified scope and entity ID and event.
     *
     * @return A representation of the script triggers available for the specified scope, entity ID (if specified), and event.
     */
    private Representation listScriptTriggers(final MediaType mediaType) {
        Hashtable<String, Object> params = new Hashtable<>();
        final boolean restrictToScope;
        if (getScope() == Scope.Site) {
            final List<String> segments = getRequest().getResourceRef().getSegments();
            final String function = segments.get(segments.size() - 1);
            if (!function.equals("triggers")) {
                params.put("scope", Scope.Site);
                restrictToScope = true;
            } else {
                restrictToScope = false;
            }
        } else {
            params.put("scope", getScope());
            params.put("projectId", getProjectId());
            restrictToScope = true;
        }

        ArrayList<String> columns = new ArrayList<>();
        columns.add("triggerId");
        columns.add("scope");
        columns.add("entityId");
        columns.add("event");
        columns.add("scriptId");
        columns.add("description");

        XFTTable table = new XFTTable();
        table.initTable(columns);

        final List<ScriptTrigger> triggers;
        if (!restrictToScope) {
            triggers = _scriptTriggerService.getAll();
        } else if (getScope() == Scope.Site) {
            triggers = _scriptTriggerService.getSiteTriggers();
        } else {
            triggers = _scriptTriggerService.getByScope(getScope(), getProjectId());
        }

        for (final ScriptTrigger trigger : triggers) {
            final Map<String, String> atoms = Scope.decode(trigger.getAssociation());
            final String scope = atoms.get("scope");
            final String entityId = scope.equals(Scope.Site.code()) ? "" : atoms.get("entityId");
            table.insertRowItems(trigger.getTriggerId(),
                    scope,
                    entityId,
                    trigger.getEvent().getEventId(),
                    trigger.getScriptId(),
                    trigger.getDescription());
        }

        table.sort("event", "ASC");

        return representTable(table, mediaType, params);
    }

    private void putScriptTrigger() throws ClientException, ServerException {
        // TODO: this needs to properly handle a PUT to an existing script as well as an existing but disabled script.
        final Representation entity = getRequest().getEntity();
        if (entity.getSize() == 0) {
            logger.warn("Unable to find script trigger parameters: no data sent?");
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "Unable to find script trigger parameters: no data sent?");
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

        // TODO: These remove definitions of scope, entity ID, and script ID that may be passed in on the API call.
        // TODO: We may consider throwing an exception if something in the body parameters contradicts the URI
        // TODO: parameters. For example, if the URL indicates site scope, but the body parameters specify project and
        // TODO: ID, it may be worth throwing an exception and indicating that you should only specify that stuff in the
        // TODO: URL. For now, though, we'll just ignore the payload parameters for simplicity.
        if (getScope() == Scope.Project) {
            properties.setProperty("scope", Scope.Project.code());
            properties.setProperty("entityId", getProjectId());
        } else {
            properties.setProperty("scope", Scope.Site.code());
            properties.remove("entityId");
        }

        if (_trigger == null) {
            if (!properties.containsKey("event")) {
                throw new ClientException(Status.CLIENT_ERROR_BAD_REQUEST, "You must specify the event for your new script trigger.");
            }
            if (!properties.containsKey("scriptId")) {
                throw new ClientException(Status.CLIENT_ERROR_BAD_REQUEST, "You must specify the script ID for your new script trigger.");
            }
            if (_log.isDebugEnabled()) {
                _log.debug("Creating new script trigger");
            }
            final String scriptId = properties.getProperty("scriptId");
            final String event = properties.getProperty("event");
            final String triggerId = properties.getProperty("triggerId", _scriptTriggerService.getDefaultTriggerName(scriptId, getScope(), getProjectId(), event));
            final String description = properties.getProperty("description", null);
            final ScriptTrigger trigger = _scriptTriggerService.newEntity(triggerId, description, scriptId, getAssociation(), event);
            if (_log.isInfoEnabled()) {
                _log.info("Created a new trigger: " + trigger.toString());
            }
            recordAutomationEvent(triggerId, getAssociation(), "Create", ScriptTrigger.class);
        } else {
            final String scriptId = properties.getProperty("scriptId");
            final String event = properties.getProperty("event");
            final String triggerId = properties.getProperty("triggerId");
            final String description = properties.getProperty("description", null);
            boolean isDirty = false;
            if (StringUtils.isNotBlank(scriptId) && !scriptId.equals(_trigger.getScriptId())) {
                _trigger.setScriptId(scriptId);
                isDirty = true;
            }
            if (StringUtils.isNotBlank(event) && !event.equals(_trigger.getEvent().getEventId())) {
                _trigger.setEvent(_eventService.getByEventId(event));
                isDirty = true;
            }
            if (StringUtils.isNotBlank(triggerId) && !triggerId.equals(_trigger.getTriggerId())) {
                _trigger.setTriggerId(triggerId);
                isDirty = true;
            }
            // Description is a little different because you could specify an empty description.
            if (description != null && !description.equals(_trigger.getDescription())) {
                _trigger.setDescription(description);
                isDirty = true;
            }
            if (!getAssociation().equals(getAssociation())) {
                _trigger.setAssociation(getAssociation());
                isDirty = true;
            }
            if (isDirty) {
                _scriptTriggerService.update(_trigger);
                recordAutomationEvent(triggerId, getAssociation(), "Update", ScriptTrigger.class);
            }
        }
    }

    private String formatScopeEntityIdAndEvent() {
        final StringBuilder buffer = new StringBuilder();
        if (_trigger != null) {
            final Map<String, String> atoms = Scope.decode(_trigger.getAssociation());
            if (atoms.get("scope").equals(Scope.Site.code())) {
                buffer.append("site");
            } else {
                buffer.append("project ").append(atoms.get("entityId"));
            }
            if (_trigger.getEvent() != null) {
                buffer.append(" and event ").append(_trigger.getEvent().getEventId());
            } else {
                buffer.append(", no event");
            }
        } else {
            if (getScope() == Scope.Site) {
                buffer.append("site");
            } else {
                buffer.append("project ").append(getProjectId());
            }
            if (StringUtils.isNotBlank(_eventId)) {
                buffer.append(" and event ").append(_eventId);
            } else {
                buffer.append(", no event");
            }
        }
        return buffer.toString();
    }

    private static final Logger _log = LoggerFactory.getLogger(ScriptTriggerResource.class);

    private static final String EVENT_ID = "EVENT_ID";
    private static final String TRIGGER_ID = "TRIGGER_ID";
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private final EventService _eventService;
    private final ScriptTriggerService _scriptTriggerService;

    private final String _eventId;
    private final ScriptTrigger _trigger;
}
