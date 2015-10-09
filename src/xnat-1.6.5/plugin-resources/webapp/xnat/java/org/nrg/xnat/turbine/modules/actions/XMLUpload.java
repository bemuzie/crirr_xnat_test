/*
 * org.nrg.xnat.turbine.modules.actions.XMLUpload
 * XNAT http://www.xnat.org
 * Copyright (c) 2014, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 *
 * Last modified 7/10/13 9:04 PM
 */
package org.nrg.xnat.turbine.modules.actions;

import org.apache.commons.fileupload.DefaultFileItem;
import org.apache.commons.fileupload.FileItem;
import org.apache.log4j.Logger;
import org.apache.turbine.services.pull.tools.TemplateLink;
import org.apache.turbine.util.RunData;
import org.apache.turbine.util.parser.ParameterParser;
import org.apache.velocity.context.Context;
import org.nrg.xdat.om.ArcProject;
import org.nrg.xdat.om.XnatProjectdata;
import org.nrg.xdat.schema.SchemaElement;
import org.nrg.xdat.security.ElementSecurity;
import org.nrg.xdat.security.XDATUser;
import org.nrg.xdat.turbine.modules.actions.DisplayItemAction;
import org.nrg.xdat.turbine.modules.actions.SecureAction;
import org.nrg.xdat.turbine.utils.PopulateItem;
import org.nrg.xdat.turbine.utils.TurbineUtils;
import org.nrg.xft.XFT;
import org.nrg.xft.XFTItem;
import org.nrg.xft.event.EventMetaI;
import org.nrg.xft.event.EventUtils;
import org.nrg.xft.event.persist.PersistentWorkflowI;
import org.nrg.xft.event.persist.PersistentWorkflowUtils;
import org.nrg.xft.exception.*;
import org.nrg.xft.schema.Wrappers.XMLWrapper.SAXReader;
import org.nrg.xft.schema.design.SchemaElementI;
import org.nrg.xft.utils.SaveItemHelper;
import org.nrg.xft.utils.ValidationUtils.ValidationResults;
import org.nrg.xft.utils.ValidationUtils.XFTValidator;
import org.nrg.xft.utils.XMLValidator;
import org.xml.sax.SAXParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tim
 * 
 */
public class XMLUpload extends SecureAction {
	static org.apache.log4j.Logger logger = Logger.getLogger(XMLUpload.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.turbine.modules.actions.VelocityAction#doPerform(org.apache
	 * .turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void doPerform(RunData data, Context context) throws Exception {
		// get the ParameterParser from RunData
		ParameterParser params = data.getParameters();

		// grab the FileItems available in ParameterParser
		FileItem fi = params.getFileItem("xml_to_store");

		String allowDeletion = (String) TurbineUtils.GetPassedParameter("allowdeletion", data);
		if (fi != null && allowDeletion != null) {
			if (fi.getSize() == 0) {
				data.setScreenTemplate("Error.vm");
				data.setMessage("The file you uploaded appears to be empty. Please verify that your file contains valid XML.");
				final Map<String, String> links = new HashMap<>();
				links.put(getLink(context, "XMLUpload.vm"), "Return to the XML Upload page");
				context.put("links", links);
				return;
			}

			XFTItem item = null;
			try {
				final XMLValidator.ValidationHandler handler = new XMLValidator().validateInputStream(fi.getInputStream());

				if (!handler.assertValid()) {
					throw handler.getErrors().get(0);
				}

				// Document doc = XMLUtils.GetDOM(fi.getInputStream());
				// item =
				// XMLReader.TranslateDomToItem(doc,TurbineUtils.getUser(data));
				SAXReader reader = new SAXReader(TurbineUtils.getUser(data));
				item = reader.parse(fi.getInputStream());
				if (XFT.VERBOSE)
					System.out.println("Loaded XML Item:"
							+ item.getProperName());
				logger.info("Loaded XML Item:" + item.getProperName());

				ValidationResults vr = XFTValidator.Validate(item);
				if (vr.isValid()) {
					if (XFT.VERBOSE)
						System.out.println("Validation: PASSED");
					logger.info("Validation: PASSED");

					boolean q;
					boolean override;
					q = item.getGenericSchemaElement().isQuarantine();
					override = false;

					PersistentWorkflowI wrk = null;
					if (item.getItem().instanceOf("xnat:experimentData")
							|| item.getItem().instanceOf("xnat:subjectData")) {
						wrk = PersistentWorkflowUtils.buildOpenWorkflow(
								TurbineUtils.getUser(data),
								item.getItem(),
								newEventInstance(data,
										EventUtils.CATEGORY.SIDE_ADMIN,
										EventUtils.STORE_XML));
					}

					SaveItemHelper.unauthorizedSave(item,TurbineUtils.getUser(data),false,q,override,allowDeletion.equalsIgnoreCase("true"),newEventInstance(data, EventUtils.CATEGORY.SIDE_ADMIN, EventUtils.STORE_XML));
                	
					if (XFT.VERBOSE) {
						System.out.println("Item Successfully Stored.");
						logger.info("Item Successfully Stored.");

					}
					
					if(item.instanceOf("xnat:projectData")){
						// Here is where my change was
						//XFTItem item = populater.getItem();
			            XnatProjectdata  project = new XnatProjectdata(item);
			        	XDATUser user = TurbineUtils.getUser(data);
			        	final PersistentWorkflowI wrk2=PersistentWorkflowUtils.getOrCreateWorkflowData(null, user, project.SCHEMA_ELEMENT_NAME,project.getId(),project.getId(),newEventInstance(data,EventUtils.CATEGORY.PROJECT_ADMIN));
				    	EventMetaI c=wrk2.buildEvent();
			        	SaveItemHelper.authorizedSave(item,user, false, false,c);
			        	XnatProjectdata postSave = new XnatProjectdata(item);
			            postSave.getItem().setUser(user);
			            
			            postSave.initGroups();
			            PopulateItem populater = PopulateItem.Populate(data,"arc:project",true);
			            XFTItem item2 = populater.getItem();
			            item2.setProperty("arc:project.current_arc", "arc001");
			            ArcProject arcP = new ArcProject(item2);
			            postSave.initArcProject(arcP, user, c);
			            
			            user.initGroups();
			        	
			    		user.clearLocalCache();
			    		//end change here
					}
		    		
					DisplayItemAction dia = new DisplayItemAction();
					data = TurbineUtils.SetSearchProperties(data, item);
					dia.doPerform(data, context);

					postProcessing(item, data, context);

					return;
				} else {
					throw new ValidationException(vr);
				}
			} catch (IOException e) {
				logger.error("", e);
				data.setScreenTemplate("Error.vm");
				data.setMessage("Error loading document.");
			} catch (XFTInitException | ElementNotFoundException | FieldNotFoundException e) {
				logger.error("", e);
			} catch (ValidationException e) {
				logger.error("", e);
				data.setScreenTemplate("Error.vm");
				data.setMessage("XML Validation Exception.<BR>" + e.VALIDATION_RESULTS.toHTML());
			} catch (SAXParseException e) {
				if (e.getLineNumber() == -1 && e.getColumnNumber() == -1) {
					// This probably means they uploaded an empty file.
					data.setMessage("XNAT was unable to parse the uploaded document. The document appears to be empty.");
				} else if (e.getLineNumber() == 1 && e.getColumnNumber() == 1) {
					// This probably means they uploaded a non-XML file.
					data.setMessage("XNAT was unable to parse the uploaded document. Check that your uploaded file is valid XML.");
				} else {
					// This probably means they uploaded an XML file with errors.
					data.setMessage("<p>XNAT failed while parsing the uploaded document. Error found at line " + e.getLineNumber() + ", column " + e.getColumnNumber() + ". The specific error message was:</p><p>" + e.getMessage() + "</p>");
				}
				data.setScreenTemplate("Error.vm");
				final Map<String, String> links = new HashMap<>();
				links.put(getLink(context, "XMLUpload.vm"), "Return to the XML Upload page");
				context.put("links", links);
				logger.error("", e);
			} catch (InvalidPermissionException e) {
				logger.error("", e);
				data.setScreenTemplate("Error.vm");
				String message = "Permissions Exception.<BR><BR>"
						+ e.getMessage();
				if (item != null) {
					final SchemaElement se = SchemaElement.GetElement(item.getXSIType());
					final ElementSecurity es = se.getElementSecurity();
					if (es != null && es.getSecurityFields() != null) {
                        message += "<BR><BR>Please review the security field ("
                                + se.getElementSecurity().getSecurityFields()
                                + ") for this data type.";
                        message += " Verify that the data reflects a currently stored value and the user has relevant permissions for this data.";
                    }
				}
				data.setMessage(message);

			} catch (Exception e) {
					logger.error("", e);
					data.setScreenTemplate("Error.vm");
					data.setMessage(e.getMessage());
			}
		}
	}

	private String getLink(final Context context, final String template) {
		return ((TemplateLink) context.get("link")).setPage(template).getLink();
	}

	public void postProcessing(XFTItem item, RunData data, Context context)
			throws Exception {
		SchemaElementI se = SchemaElement.GetElement(item.getXSIType());
		if (se.getGenericXFTElement().getType().getLocalPrefix()
				.equalsIgnoreCase("xdat")) {
			ElementSecurity.refresh();
		} else if (se.getFullXMLName().equals("xnat:investigatorData")
				|| se.getFullXMLName().equals("xnat:projectData")) {
			ElementSecurity.refresh();
		}
	}
}
