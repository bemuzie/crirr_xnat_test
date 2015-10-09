/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:37 UTC 2015
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface ArcArchivespecificationI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * globalPaths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public org.nrg.xdat.model.ArcPathinfoI getGlobalpaths();

	/**
	 * globalPaths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public <A extends org.nrg.xdat.model.ArcPathinfoI> void setGlobalpaths(A item) throws Exception;

	/**
	 * @return Returns the arc:ArchiveSpecification/globalpaths_arc_pathinfo_id.
	 */
	public Integer getGlobalpathsFK();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> List<A> getFieldspecifications_fieldspecification();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> void addFieldspecifications_fieldspecification(A item) throws Exception;

	/**
	 * projects/project
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectI> List<A> getProjects_project();

	/**
	 * projects/project
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectI> void addProjects_project(A item) throws Exception;

	/**
	 * @return Returns the emailSpecifications/new_user_registration.
	 */
	public Boolean getEmailspecifications_newUserRegistration();

	/**
	 * Sets the value for emailSpecifications/new_user_registration.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_newUserRegistration(Object v);

	/**
	 * @return Returns the emailSpecifications/pipeline.
	 */
	public Boolean getEmailspecifications_pipeline();

	/**
	 * Sets the value for emailSpecifications/pipeline.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_pipeline(Object v);

	/**
	 * @return Returns the emailSpecifications/project_access.
	 */
	public Boolean getEmailspecifications_projectAccess();

	/**
	 * Sets the value for emailSpecifications/project_access.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_projectAccess(Object v);

	/**
	 * @return Returns the emailSpecifications/transfer.
	 */
	public Boolean getEmailspecifications_transfer();

	/**
	 * Sets the value for emailSpecifications/transfer.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_transfer(Object v);

	/**
	 * @return Returns the emailSpecifications/page_email.
	 */
	public Boolean getEmailspecifications_pageEmail();

	/**
	 * Sets the value for emailSpecifications/page_email.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_pageEmail(Object v);

	/**
	 * notification_types/notification_type
	 * @return Returns an List of org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI
	 */
	public <A extends org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI> List<A> getNotificationTypes_notificationType();

	/**
	 * notification_types/notification_type
	 * @return Returns an List of org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI
	 */
	public <A extends org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI> void addNotificationTypes_notificationType(A item) throws Exception;

	/**
	 * @return Returns the dcm/dcm_host.
	 */
	public String getDcm_dcmHost();

	/**
	 * Sets the value for dcm/dcm_host.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmHost(String v);

	/**
	 * @return Returns the dcm/dcm_port.
	 */
	public String getDcm_dcmPort();

	/**
	 * Sets the value for dcm/dcm_port.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmPort(String v);

	/**
	 * @return Returns the dcm/dcm_ae.
	 */
	public String getDcm_dcmAe();

	/**
	 * Sets the value for dcm/dcm_ae.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmAe(String v);

	/**
	 * @return Returns the dcm/http_url.
	 */
	public String getDcm_httpUrl();

	/**
	 * Sets the value for dcm/http_url.
	 * @param v Value to Set.
	 */
	public void setDcm_httpUrl(String v);

	/**
	 * @return Returns the dcm/applet_link.
	 */
	public Boolean getDcm_appletLink();

	/**
	 * Sets the value for dcm/applet_link.
	 * @param v Value to Set.
	 */
	public void setDcm_appletLink(Object v);

	/**
	 * @return Returns the site_id.
	 */
	public String getSiteId();

	/**
	 * Sets the value for site_id.
	 * @param v Value to Set.
	 */
	public void setSiteId(String v);

	/**
	 * @return Returns the site_admin_email.
	 */
	public String getSiteAdminEmail();

	/**
	 * Sets the value for site_admin_email.
	 * @param v Value to Set.
	 */
	public void setSiteAdminEmail(String v);

	/**
	 * @return Returns the site_url.
	 */
	public String getSiteUrl();

	/**
	 * Sets the value for site_url.
	 * @param v Value to Set.
	 */
	public void setSiteUrl(String v);

	/**
	 * @return Returns the smtp_host.
	 */
	public String getSmtpHost();

	/**
	 * Sets the value for smtp_host.
	 * @param v Value to Set.
	 */
	public void setSmtpHost(String v);

	/**
	 * @return Returns the require_login.
	 */
	public Boolean getRequireLogin();

	/**
	 * Sets the value for require_login.
	 * @param v Value to Set.
	 */
	public void setRequireLogin(Object v);

	/**
	 * @return Returns the enable_new_registrations.
	 */
	public Boolean getEnableNewRegistrations();

	/**
	 * Sets the value for enable_new_registrations.
	 * @param v Value to Set.
	 */
	public void setEnableNewRegistrations(Object v);

	/**
	 * @return Returns the enable_csrf_token.
	 */
	public Boolean getEnableCsrfToken();

	/**
	 * Sets the value for enable_csrf_token.
	 * @param v Value to Set.
	 */
	public void setEnableCsrfToken(Object v);

	/**
	 * @return Returns the quarantine_code.
	 */
	public Integer getQuarantineCode();

	/**
	 * Sets the value for arc:ArchiveSpecification/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(Integer v) ;

	/**
	 * @return Returns the prearchive_code.
	 */
	public Integer getPrearchiveCode();

	/**
	 * Sets the value for arc:ArchiveSpecification/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(Integer v) ;

	/**
	 * @return Returns the arc_ArchiveSpecification_id.
	 */
	public Integer getArcArchivespecificationId();
}
