/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:37 UTC 2015
 *
 */
package org.nrg.xdat.bean;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class ArcArchivespecificationBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcArchivespecificationI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcArchivespecificationBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:ArchiveSpecification";

	public String getSchemaElementName(){
		return "ArchiveSpecification";
	}

	public String getFullSchemaElementName(){
		return "arc:ArchiveSpecification";
	}
	 private org.nrg.xdat.bean.ArcPathinfoBean _Globalpaths =null;

	/**
	 * globalPaths
	 * @return org.nrg.xdat.bean.ArcPathinfoBean
	 */
	public org.nrg.xdat.bean.ArcPathinfoBean getGlobalpaths() {
		return _Globalpaths;
	}

	/**
	 * Sets the value for globalPaths.
	 * @param v Value to Set.
	 */
	public void setGlobalpaths(org.nrg.xdat.bean.ArcPathinfoBean v){
		_Globalpaths =v;
	}

	/**
	 * Sets the value for globalPaths.
	 * @param v Value to Set.
	 */
	public void setGlobalpaths(Object v) {
		if (v instanceof org.nrg.xdat.bean.ArcPathinfoBean)
			_Globalpaths =(org.nrg.xdat.bean.ArcPathinfoBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcPathinfoBean");
	}

	/**
	 * globalPaths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public <A extends org.nrg.xdat.model.ArcPathinfoI> void setGlobalpaths(A item) throws Exception{
	setGlobalpaths((org.nrg.xdat.bean.ArcPathinfoBean)item);
	}

	//FIELD

	private Integer _GlobalpathsFK=null;

	/**
	 * @return Returns the arc:ArchiveSpecification/globalpaths_arc_pathinfo_id.
	 */
	public Integer getGlobalpathsFK(){
		return _GlobalpathsFK;
	}

	/**
	 * Sets the value for arc:ArchiveSpecification/globalpaths_arc_pathinfo_id.
	 * @param v Value to Set.
	 */
	public void setGlobalpathsFK(Integer v) {
		_GlobalpathsFK=v;
	}
	 private List<org.nrg.xdat.bean.ArcFieldspecificationBean> _Fieldspecifications_fieldspecification =new ArrayList<org.nrg.xdat.bean.ArcFieldspecificationBean>();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.bean.ArcFieldspecificationBean
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> List<A> getFieldspecifications_fieldspecification() {
		return (List<A>) _Fieldspecifications_fieldspecification;
	}

	/**
	 * Sets the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void setFieldspecifications_fieldspecification(ArrayList<org.nrg.xdat.bean.ArcFieldspecificationBean> v){
		_Fieldspecifications_fieldspecification=v;
	}

	/**
	 * Adds the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void addFieldspecifications_fieldspecification(org.nrg.xdat.bean.ArcFieldspecificationBean v){
		_Fieldspecifications_fieldspecification.add(v);
	}

	/**
	 * fieldSpecifications/fieldSpecification
	 * Adds org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> void addFieldspecifications_fieldspecification(A item) throws Exception{
	_Fieldspecifications_fieldspecification.add((org.nrg.xdat.bean.ArcFieldspecificationBean)item);
	}

	/**
	 * Adds the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void addFieldspecifications_fieldspecification(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcFieldspecificationBean)
			_Fieldspecifications_fieldspecification.add((org.nrg.xdat.bean.ArcFieldspecificationBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcFieldspecificationBean");
	}
	 private List<org.nrg.xdat.bean.ArcProjectBean> _Projects_project =new ArrayList<org.nrg.xdat.bean.ArcProjectBean>();

	/**
	 * projects/project
	 * @return Returns an List of org.nrg.xdat.bean.ArcProjectBean
	 */
	public <A extends org.nrg.xdat.model.ArcProjectI> List<A> getProjects_project() {
		return (List<A>) _Projects_project;
	}

	/**
	 * Sets the value for projects/project.
	 * @param v Value to Set.
	 */
	public void setProjects_project(ArrayList<org.nrg.xdat.bean.ArcProjectBean> v){
		_Projects_project=v;
	}

	/**
	 * Adds the value for projects/project.
	 * @param v Value to Set.
	 */
	public void addProjects_project(org.nrg.xdat.bean.ArcProjectBean v){
		_Projects_project.add(v);
	}

	/**
	 * projects/project
	 * Adds org.nrg.xdat.model.ArcProjectI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectI> void addProjects_project(A item) throws Exception{
	_Projects_project.add((org.nrg.xdat.bean.ArcProjectBean)item);
	}

	/**
	 * Adds the value for projects/project.
	 * @param v Value to Set.
	 */
	public void addProjects_project(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcProjectBean)
			_Projects_project.add((org.nrg.xdat.bean.ArcProjectBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcProjectBean");
	}

	//FIELD

	private Boolean _Emailspecifications_newUserRegistration=null;

	/**
	 * @return Returns the emailSpecifications/new_user_registration.
	 */
	public Boolean getEmailspecifications_newUserRegistration() {
		return _Emailspecifications_newUserRegistration;
	}

	/**
	 * Sets the value for emailSpecifications/new_user_registration.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_newUserRegistration(Object v){
		if(v instanceof Boolean){
			_Emailspecifications_newUserRegistration=(Boolean)v;
		}else if(v instanceof String){
			_Emailspecifications_newUserRegistration=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Emailspecifications_pipeline=null;

	/**
	 * @return Returns the emailSpecifications/pipeline.
	 */
	public Boolean getEmailspecifications_pipeline() {
		return _Emailspecifications_pipeline;
	}

	/**
	 * Sets the value for emailSpecifications/pipeline.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_pipeline(Object v){
		if(v instanceof Boolean){
			_Emailspecifications_pipeline=(Boolean)v;
		}else if(v instanceof String){
			_Emailspecifications_pipeline=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Emailspecifications_projectAccess=null;

	/**
	 * @return Returns the emailSpecifications/project_access.
	 */
	public Boolean getEmailspecifications_projectAccess() {
		return _Emailspecifications_projectAccess;
	}

	/**
	 * Sets the value for emailSpecifications/project_access.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_projectAccess(Object v){
		if(v instanceof Boolean){
			_Emailspecifications_projectAccess=(Boolean)v;
		}else if(v instanceof String){
			_Emailspecifications_projectAccess=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Emailspecifications_transfer=null;

	/**
	 * @return Returns the emailSpecifications/transfer.
	 */
	public Boolean getEmailspecifications_transfer() {
		return _Emailspecifications_transfer;
	}

	/**
	 * Sets the value for emailSpecifications/transfer.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_transfer(Object v){
		if(v instanceof Boolean){
			_Emailspecifications_transfer=(Boolean)v;
		}else if(v instanceof String){
			_Emailspecifications_transfer=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Emailspecifications_pageEmail=null;

	/**
	 * @return Returns the emailSpecifications/page_email.
	 */
	public Boolean getEmailspecifications_pageEmail() {
		return _Emailspecifications_pageEmail;
	}

	/**
	 * Sets the value for emailSpecifications/page_email.
	 * @param v Value to Set.
	 */
	public void setEmailspecifications_pageEmail(Object v){
		if(v instanceof Boolean){
			_Emailspecifications_pageEmail=(Boolean)v;
		}else if(v instanceof String){
			_Emailspecifications_pageEmail=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}
	 private List<org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean> _NotificationTypes_notificationType =new ArrayList<org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean>();

	/**
	 * notification_types/notification_type
	 * @return Returns an List of org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean
	 */
	public <A extends org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI> List<A> getNotificationTypes_notificationType() {
		return (List<A>) _NotificationTypes_notificationType;
	}

	/**
	 * Sets the value for notification_types/notification_type.
	 * @param v Value to Set.
	 */
	public void setNotificationTypes_notificationType(ArrayList<org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean> v){
		_NotificationTypes_notificationType=v;
	}

	/**
	 * Adds the value for notification_types/notification_type.
	 * @param v Value to Set.
	 */
	public void addNotificationTypes_notificationType(org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean v){
		_NotificationTypes_notificationType.add(v);
	}

	/**
	 * notification_types/notification_type
	 * Adds org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI
	 */
	public <A extends org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI> void addNotificationTypes_notificationType(A item) throws Exception{
	_NotificationTypes_notificationType.add((org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean)item);
	}

	/**
	 * Adds the value for notification_types/notification_type.
	 * @param v Value to Set.
	 */
	public void addNotificationTypes_notificationType(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean)
			_NotificationTypes_notificationType.add((org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean");
	}

	//FIELD

	private String _Dcm_dcmHost=null;

	/**
	 * @return Returns the dcm/dcm_host.
	 */
	public String getDcm_dcmHost(){
		return _Dcm_dcmHost;
	}

	/**
	 * Sets the value for dcm/dcm_host.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmHost(String v){
		_Dcm_dcmHost=v;
	}

	//FIELD

	private String _Dcm_dcmPort=null;

	/**
	 * @return Returns the dcm/dcm_port.
	 */
	public String getDcm_dcmPort(){
		return _Dcm_dcmPort;
	}

	/**
	 * Sets the value for dcm/dcm_port.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmPort(String v){
		_Dcm_dcmPort=v;
	}

	//FIELD

	private String _Dcm_dcmAe=null;

	/**
	 * @return Returns the dcm/dcm_ae.
	 */
	public String getDcm_dcmAe(){
		return _Dcm_dcmAe;
	}

	/**
	 * Sets the value for dcm/dcm_ae.
	 * @param v Value to Set.
	 */
	public void setDcm_dcmAe(String v){
		_Dcm_dcmAe=v;
	}

	//FIELD

	private String _Dcm_httpUrl=null;

	/**
	 * @return Returns the dcm/http_url.
	 */
	public String getDcm_httpUrl(){
		return _Dcm_httpUrl;
	}

	/**
	 * Sets the value for dcm/http_url.
	 * @param v Value to Set.
	 */
	public void setDcm_httpUrl(String v){
		_Dcm_httpUrl=v;
	}

	//FIELD

	private Boolean _Dcm_appletLink=null;

	/**
	 * @return Returns the dcm/applet_link.
	 */
	public Boolean getDcm_appletLink() {
		return _Dcm_appletLink;
	}

	/**
	 * Sets the value for dcm/applet_link.
	 * @param v Value to Set.
	 */
	public void setDcm_appletLink(Object v){
		if(v instanceof Boolean){
			_Dcm_appletLink=(Boolean)v;
		}else if(v instanceof String){
			_Dcm_appletLink=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private String _SiteId=null;

	/**
	 * @return Returns the site_id.
	 */
	public String getSiteId(){
		return _SiteId;
	}

	/**
	 * Sets the value for site_id.
	 * @param v Value to Set.
	 */
	public void setSiteId(String v){
		_SiteId=v;
	}

	//FIELD

	private String _SiteAdminEmail=null;

	/**
	 * @return Returns the site_admin_email.
	 */
	public String getSiteAdminEmail(){
		return _SiteAdminEmail;
	}

	/**
	 * Sets the value for site_admin_email.
	 * @param v Value to Set.
	 */
	public void setSiteAdminEmail(String v){
		_SiteAdminEmail=v;
	}

	//FIELD

	private String _SiteUrl=null;

	/**
	 * @return Returns the site_url.
	 */
	public String getSiteUrl(){
		return _SiteUrl;
	}

	/**
	 * Sets the value for site_url.
	 * @param v Value to Set.
	 */
	public void setSiteUrl(String v){
		_SiteUrl=v;
	}

	//FIELD

	private String _SmtpHost=null;

	/**
	 * @return Returns the smtp_host.
	 */
	public String getSmtpHost(){
		return _SmtpHost;
	}

	/**
	 * Sets the value for smtp_host.
	 * @param v Value to Set.
	 */
	public void setSmtpHost(String v){
		_SmtpHost=v;
	}

	//FIELD

	private Boolean _RequireLogin=null;

	/**
	 * @return Returns the require_login.
	 */
	public Boolean getRequireLogin() {
		return _RequireLogin;
	}

	/**
	 * Sets the value for require_login.
	 * @param v Value to Set.
	 */
	public void setRequireLogin(Object v){
		if(v instanceof Boolean){
			_RequireLogin=(Boolean)v;
		}else if(v instanceof String){
			_RequireLogin=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _EnableNewRegistrations=null;

	/**
	 * @return Returns the enable_new_registrations.
	 */
	public Boolean getEnableNewRegistrations() {
		return _EnableNewRegistrations;
	}

	/**
	 * Sets the value for enable_new_registrations.
	 * @param v Value to Set.
	 */
	public void setEnableNewRegistrations(Object v){
		if(v instanceof Boolean){
			_EnableNewRegistrations=(Boolean)v;
		}else if(v instanceof String){
			_EnableNewRegistrations=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _EnableCsrfToken=null;

	/**
	 * @return Returns the enable_csrf_token.
	 */
	public Boolean getEnableCsrfToken() {
		return _EnableCsrfToken;
	}

	/**
	 * Sets the value for enable_csrf_token.
	 * @param v Value to Set.
	 */
	public void setEnableCsrfToken(Object v){
		if(v instanceof Boolean){
			_EnableCsrfToken=(Boolean)v;
		}else if(v instanceof String){
			_EnableCsrfToken=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _QuarantineCode=null;

	/**
	 * @return Returns the quarantine_code.
	 */
	public Integer getQuarantineCode(){
		return _QuarantineCode;
	}

	/**
	 * Sets the value for arc:ArchiveSpecification/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(Integer v) {
		_QuarantineCode=v;
	}

	/**
	 * Sets the value for arc:ArchiveSpecification/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(String v)  {
		_QuarantineCode=formatInteger(v);
	}

	//FIELD

	private Integer _PrearchiveCode=null;

	/**
	 * @return Returns the prearchive_code.
	 */
	public Integer getPrearchiveCode(){
		return _PrearchiveCode;
	}

	/**
	 * Sets the value for arc:ArchiveSpecification/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(Integer v) {
		_PrearchiveCode=v;
	}

	/**
	 * Sets the value for arc:ArchiveSpecification/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(String v)  {
		_PrearchiveCode=formatInteger(v);
	}

	//FIELD

	private Integer _ArcArchivespecificationId=null;

	/**
	 * @return Returns the arc_ArchiveSpecification_id.
	 */
	public Integer getArcArchivespecificationId() {
		return _ArcArchivespecificationId;
	}

	/**
	 * Sets the value for arc_ArchiveSpecification_id.
	 * @param v Value to Set.
	 */
	public void setArcArchivespecificationId(Integer v){
		_ArcArchivespecificationId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("emailSpecifications/new_user_registration")){
			setEmailspecifications_newUserRegistration(v);
		}else if (xmlPath.equals("emailSpecifications/pipeline")){
			setEmailspecifications_pipeline(v);
		}else if (xmlPath.equals("emailSpecifications/project_access")){
			setEmailspecifications_projectAccess(v);
		}else if (xmlPath.equals("emailSpecifications/transfer")){
			setEmailspecifications_transfer(v);
		}else if (xmlPath.equals("emailSpecifications/page_email")){
			setEmailspecifications_pageEmail(v);
		}else if (xmlPath.equals("dcm/dcm_host")){
			setDcm_dcmHost(v);
		}else if (xmlPath.equals("dcm/dcm_port")){
			setDcm_dcmPort(v);
		}else if (xmlPath.equals("dcm/dcm_ae")){
			setDcm_dcmAe(v);
		}else if (xmlPath.equals("dcm/http_url")){
			setDcm_httpUrl(v);
		}else if (xmlPath.equals("dcm/applet_link")){
			setDcm_appletLink(v);
		}else if (xmlPath.equals("site_id")){
			setSiteId(v);
		}else if (xmlPath.equals("site_admin_email")){
			setSiteAdminEmail(v);
		}else if (xmlPath.equals("site_url")){
			setSiteUrl(v);
		}else if (xmlPath.equals("smtp_host")){
			setSmtpHost(v);
		}else if (xmlPath.equals("require_login")){
			setRequireLogin(v);
		}else if (xmlPath.equals("enable_new_registrations")){
			setEnableNewRegistrations(v);
		}else if (xmlPath.equals("enable_csrf_token")){
			setEnableCsrfToken(v);
		}else if (xmlPath.equals("quarantine_code")){
			setQuarantineCode(v);
		}else if (xmlPath.equals("prearchive_code")){
			setPrearchiveCode(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("globalPaths")){
			setGlobalpaths(v);
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			addFieldspecifications_fieldspecification(v);
		}else if (xmlPath.equals("projects/project")){
			addProjects_project(v);
		}else if (xmlPath.equals("notification_types/notification_type")){
			addNotificationTypes_notificationType(v);
		}
		else{
			super.setReferenceField(xmlPath,v);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("emailSpecifications/new_user_registration")){
			return getEmailspecifications_newUserRegistration();
		}else if (xmlPath.equals("emailSpecifications/pipeline")){
			return getEmailspecifications_pipeline();
		}else if (xmlPath.equals("emailSpecifications/project_access")){
			return getEmailspecifications_projectAccess();
		}else if (xmlPath.equals("emailSpecifications/transfer")){
			return getEmailspecifications_transfer();
		}else if (xmlPath.equals("emailSpecifications/page_email")){
			return getEmailspecifications_pageEmail();
		}else if (xmlPath.equals("dcm/dcm_host")){
			return getDcm_dcmHost();
		}else if (xmlPath.equals("dcm/dcm_port")){
			return getDcm_dcmPort();
		}else if (xmlPath.equals("dcm/dcm_ae")){
			return getDcm_dcmAe();
		}else if (xmlPath.equals("dcm/http_url")){
			return getDcm_httpUrl();
		}else if (xmlPath.equals("dcm/applet_link")){
			return getDcm_appletLink();
		}else if (xmlPath.equals("site_id")){
			return getSiteId();
		}else if (xmlPath.equals("site_admin_email")){
			return getSiteAdminEmail();
		}else if (xmlPath.equals("site_url")){
			return getSiteUrl();
		}else if (xmlPath.equals("smtp_host")){
			return getSmtpHost();
		}else if (xmlPath.equals("require_login")){
			return getRequireLogin();
		}else if (xmlPath.equals("enable_new_registrations")){
			return getEnableNewRegistrations();
		}else if (xmlPath.equals("enable_csrf_token")){
			return getEnableCsrfToken();
		}else if (xmlPath.equals("quarantine_code")){
			return getQuarantineCode();
		}else if (xmlPath.equals("prearchive_code")){
			return getPrearchiveCode();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("globalPaths")){
			return getGlobalpaths();
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return getFieldspecifications_fieldspecification();
		}else if (xmlPath.equals("projects/project")){
			return getProjects_project();
		}else if (xmlPath.equals("notification_types/notification_type")){
			return getNotificationTypes_notificationType();
		}
		else{
			return super.getReferenceField(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("globalPaths")){
			return "http://nrg.wustl.edu/arc:pathInfo";
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return "http://nrg.wustl.edu/arc:fieldSpecification";
		}else if (xmlPath.equals("projects/project")){
			return "http://nrg.wustl.edu/arc:project";
		}else if (xmlPath.equals("notification_types/notification_type")){
			return "http://nrg.wustl.edu/arc:ArchiveSpecification_notification_type";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("globalPaths")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("projects/project")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("emailSpecifications/new_user_registration")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("emailSpecifications/pipeline")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("emailSpecifications/project_access")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("emailSpecifications/transfer")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("emailSpecifications/page_email")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("notification_types/notification_type")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("dcm/dcm_host")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcm/dcm_port")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcm/dcm_ae")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcm/http_url")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcm/applet_link")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("site_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("site_admin_email")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("site_url")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("smtp_host")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("require_login")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("enable_new_registrations")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("enable_csrf_token")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("quarantine_code")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("prearchive_code")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("globalPaths");
		all_fields.add("fieldSpecifications/fieldSpecification");
		all_fields.add("projects/project");
		all_fields.add("emailSpecifications/new_user_registration");
		all_fields.add("emailSpecifications/pipeline");
		all_fields.add("emailSpecifications/project_access");
		all_fields.add("emailSpecifications/transfer");
		all_fields.add("emailSpecifications/page_email");
		all_fields.add("notification_types/notification_type");
		all_fields.add("dcm/dcm_host");
		all_fields.add("dcm/dcm_port");
		all_fields.add("dcm/dcm_ae");
		all_fields.add("dcm/http_url");
		all_fields.add("dcm/applet_link");
		all_fields.add("site_id");
		all_fields.add("site_admin_email");
		all_fields.add("site_url");
		all_fields.add("smtp_host");
		all_fields.add("require_login");
		all_fields.add("enable_new_registrations");
		all_fields.add("enable_csrf_token");
		all_fields.add("quarantine_code");
		all_fields.add("prearchive_code");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<arc:ArchiveSpecification");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:ext","http://nrg.wustl.edu/ext");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</arc:ArchiveSpecification>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		if (_SiteId!=null)
			map.put("site_id",ValueParser(_SiteId,"string"));
		else map.put("site_id","");//REQUIRED FIELD

		if (_SiteAdminEmail!=null)
			map.put("site_admin_email",ValueParser(_SiteAdminEmail,"string"));
		//NOT REQUIRED FIELD

		if (_SiteUrl!=null)
			map.put("site_url",ValueParser(_SiteUrl,"string"));
		//NOT REQUIRED FIELD

		if (_SmtpHost!=null)
			map.put("smtp_host",ValueParser(_SmtpHost,"string"));
		//NOT REQUIRED FIELD

		if (_RequireLogin!=null)
			map.put("require_login",ValueParser(_RequireLogin,"boolean"));
		//NOT REQUIRED FIELD

		if (_EnableNewRegistrations!=null)
			map.put("enable_new_registrations",ValueParser(_EnableNewRegistrations,"boolean"));
		//NOT REQUIRED FIELD

		if (_EnableCsrfToken!=null)
			map.put("enable_csrf_token",ValueParser(_EnableCsrfToken,"boolean"));
		//NOT REQUIRED FIELD

		if (_QuarantineCode!=null)
			map.put("quarantine_code",ValueParser(_QuarantineCode,"integer"));
		//NOT REQUIRED FIELD

		if (_PrearchiveCode!=null)
			map.put("prearchive_code",ValueParser(_PrearchiveCode,"integer"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM ArchiveSpecification -> globalPaths
		//DATA-FIELD FROM ArchiveSpecification -> globalPaths
		if (_Globalpaths!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<arc:globalPaths");
			_Globalpaths.addXMLAtts(writer);
			if(!_Globalpaths.getFullSchemaElementName().equals("arc:pathInfo")){
				writer.write(" xsi:type=\"" + _Globalpaths.getFullSchemaElementName() + "\"");
			}
			if (_Globalpaths.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Globalpaths.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</arc:globalPaths>");
				}else{
					writer.write("</arc:globalPaths>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		else{
			writer.write("\n" + createHeader(header) + "<arc:globalPaths/>");//REQUIRED
		}
			int child0=0;
			int att0=0;
			child0+=_Fieldspecifications_fieldspecification.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<arc:fieldSpecifications");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM ArchiveSpecification -> fieldSpecifications/fieldSpecification
		java.util.Iterator iter1=_Fieldspecifications_fieldspecification.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.ArcFieldspecificationBean child = (org.nrg.xdat.bean.ArcFieldspecificationBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<arc:fieldSpecification");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:fieldSpecification")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</arc:fieldSpecification>");
				}else{
					writer.write("</arc:fieldSpecification>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:fieldSpecifications>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Projects_project.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<arc:projects");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM ArchiveSpecification -> projects/project
		java.util.Iterator iter3=_Projects_project.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.ArcProjectBean child = (org.nrg.xdat.bean.ArcProjectBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<arc:project");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:project")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</arc:project>");
				}else{
					writer.write("</arc:project>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:projects>");
			}
			}

		TreeMap EmailspecificationsATTMap = new TreeMap();
		String EmailspecificationsATT = new String();
		if (_Emailspecifications_newUserRegistration!=null)
			EmailspecificationsATTMap.put("new_user_registration",ValueParser(_Emailspecifications_newUserRegistration,"boolean"));
		if (_Emailspecifications_pipeline!=null)
			EmailspecificationsATTMap.put("pipeline",ValueParser(_Emailspecifications_pipeline,"boolean"));
		if (_Emailspecifications_projectAccess!=null)
			EmailspecificationsATTMap.put("project_access",ValueParser(_Emailspecifications_projectAccess,"boolean"));
		if (_Emailspecifications_transfer!=null)
			EmailspecificationsATTMap.put("transfer",ValueParser(_Emailspecifications_transfer,"boolean"));
		if (_Emailspecifications_pageEmail!=null)
			EmailspecificationsATTMap.put("page_email",ValueParser(_Emailspecifications_pageEmail,"boolean"));
		java.util.Iterator iter4 =EmailspecificationsATTMap.keySet().iterator();
		while(iter4.hasNext()){
			String key = (String)iter4.next();
			EmailspecificationsATT +=" " + key + "=\"" + EmailspecificationsATTMap.get(key) + "\"";
		}
		if(!EmailspecificationsATT.equals("")){
			writer.write("\n" + createHeader(header) + "<arc:emailSpecifications");
			writer.write(EmailspecificationsATT);
			writer.write("/>");
		}

			int child5=0;
			int att5=0;
			child5+=_NotificationTypes_notificationType.size();
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<arc:notification_types");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM ArchiveSpecification -> notification_types/notification_type
		java.util.Iterator iter6=_NotificationTypes_notificationType.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean child = (org.nrg.xdat.bean.ArcArchivespecificationNotificationTypeBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<arc:notification_type");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:ArchiveSpecification_notification_type")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</arc:notification_type>");
				}else{
					writer.write("</arc:notification_type>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:notification_types>");
			}
			}

		TreeMap DcmATTMap = new TreeMap();
		String DcmATT = new String();
		if (_Dcm_dcmHost!=null)
			DcmATTMap.put("dcm_host",ValueParser(_Dcm_dcmHost,"string"));
		if (_Dcm_dcmPort!=null)
			DcmATTMap.put("dcm_port",ValueParser(_Dcm_dcmPort,"string"));
		if (_Dcm_dcmAe!=null)
			DcmATTMap.put("dcm_ae",ValueParser(_Dcm_dcmAe,"string"));
		if (_Dcm_httpUrl!=null)
			DcmATTMap.put("http_url",ValueParser(_Dcm_httpUrl,"string"));
		if (_Dcm_appletLink!=null)
			DcmATTMap.put("applet_link",ValueParser(_Dcm_appletLink,"boolean"));
		java.util.Iterator iter7 =DcmATTMap.keySet().iterator();
		while(iter7.hasNext()){
			String key = (String)iter7.next();
			DcmATT +=" " + key + "=\"" + DcmATTMap.get(key) + "\"";
		}
		if(!DcmATT.equals("")){
			writer.write("\n" + createHeader(header) + "<arc:dcm");
			writer.write(DcmATT);
			writer.write("/>");
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Globalpaths!=null){
			if (_Globalpaths.hasXMLBodyContent()) return true;
		}
		return true;//REQUIRED globalPaths
	}
}
