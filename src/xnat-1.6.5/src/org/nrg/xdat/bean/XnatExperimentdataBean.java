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
public class XnatExperimentdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatExperimentdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatExperimentdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:experimentData";

	public String getSchemaElementName(){
		return "experimentData";
	}

	public String getFullSchemaElementName(){
		return "xnat:experimentData";
	}
	 private List<org.nrg.xdat.bean.XnatExperimentdataShareBean> _Sharing_share =new ArrayList<org.nrg.xdat.bean.XnatExperimentdataShareBean>();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.bean.XnatExperimentdataShareBean
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataShareI> List<A> getSharing_share() {
		return (List<A>) _Sharing_share;
	}

	/**
	 * Sets the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void setSharing_share(ArrayList<org.nrg.xdat.bean.XnatExperimentdataShareBean> v){
		_Sharing_share=v;
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(org.nrg.xdat.bean.XnatExperimentdataShareBean v){
		_Sharing_share.add(v);
	}

	/**
	 * sharing/share
	 * Adds org.nrg.xdat.model.XnatExperimentdataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataShareI> void addSharing_share(A item) throws Exception{
	_Sharing_share.add((org.nrg.xdat.bean.XnatExperimentdataShareBean)item);
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatExperimentdataShareBean)
			_Sharing_share.add((org.nrg.xdat.bean.XnatExperimentdataShareBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatExperimentdataShareBean");
	}

	//FIELD

	private Date _Date=null;

	/**
	 * @return Returns the date.
	 */
	public Date getDate(){
		return _Date;
	}

	/**
	 * Sets the value for date.
	 * @param v Value to Set.
	 */
	public void setDate(Date v){
		_Date=v;
	}

	/**
	 * Sets the value for date.
	 * @param v Value to Set.
	 */
	public void setDate(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for date.
	 * @param v Value to Set.
	 */
	public void setDate(String v)  {
		_Date=formatDate(v);
	}

	//FIELD

	private Object _Time=null;

	/**
	 * @return Returns the time.
	 */
	public Object getTime(){
		return _Time;
	}

	/**
	 * Sets the value for time.
	 * @param v Value to Set.
	 */
	public void setTime(Object v){
		_Time=v;
	}

	//FIELD

	private Object _Duration=null;

	/**
	 * @return Returns the duration.
	 */
	public Object getDuration(){
		return _Duration;
	}

	/**
	 * Sets the value for duration.
	 * @param v Value to Set.
	 */
	public void setDuration(Object v){
		_Duration=v;
	}

	//FIELD

	private Integer _Delay=null;

	/**
	 * @return Returns the delay.
	 */
	public Integer getDelay(){
		return _Delay;
	}

	/**
	 * Sets the value for xnat:experimentData/delay.
	 * @param v Value to Set.
	 */
	public void setDelay(Integer v) {
		_Delay=v;
	}

	/**
	 * Sets the value for xnat:experimentData/delay.
	 * @param v Value to Set.
	 */
	public void setDelay(String v)  {
		_Delay=formatInteger(v);
	}

	//FIELD

	private String _Delay_refExptId=null;

	/**
	 * @return Returns the delay/ref_expt_id.
	 */
	public String getDelay_refExptId(){
		return _Delay_refExptId;
	}

	/**
	 * Sets the value for delay/ref_expt_id.
	 * @param v Value to Set.
	 */
	public void setDelay_refExptId(String v){
		_Delay_refExptId=v;
	}

	//FIELD

	private String _Note=null;

	/**
	 * @return Returns the note.
	 */
	public String getNote(){
		return _Note;
	}

	/**
	 * Sets the value for note.
	 * @param v Value to Set.
	 */
	public void setNote(String v){
		_Note=v;
	}
	 private org.nrg.xdat.bean.XnatInvestigatordataBean _Investigator =null;

	/**
	 * investigator
	 * @return org.nrg.xdat.bean.XnatInvestigatordataBean
	 */
	public org.nrg.xdat.bean.XnatInvestigatordataBean getInvestigator() {
		return _Investigator;
	}

	/**
	 * Sets the value for investigator.
	 * @param v Value to Set.
	 */
	public void setInvestigator(org.nrg.xdat.bean.XnatInvestigatordataBean v){
		_Investigator =v;
	}

	/**
	 * Sets the value for investigator.
	 * @param v Value to Set.
	 */
	public void setInvestigator(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatInvestigatordataBean)
			_Investigator =(org.nrg.xdat.bean.XnatInvestigatordataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatInvestigatordataBean");
	}

	/**
	 * investigator
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void setInvestigator(A item) throws Exception{
	setInvestigator((org.nrg.xdat.bean.XnatInvestigatordataBean)item);
	}

	//FIELD

	private Integer _InvestigatorFK=null;

	/**
	 * @return Returns the xnat:experimentData/investigator_xnat_investigatordata_id.
	 */
	public Integer getInvestigatorFK(){
		return _InvestigatorFK;
	}

	/**
	 * Sets the value for xnat:experimentData/investigator_xnat_investigatordata_id.
	 * @param v Value to Set.
	 */
	public void setInvestigatorFK(Integer v) {
		_InvestigatorFK=v;
	}
	 private org.nrg.xdat.bean.XnatValidationdataBean _Validation =null;

	/**
	 * validation
	 * @return org.nrg.xdat.bean.XnatValidationdataBean
	 */
	public org.nrg.xdat.bean.XnatValidationdataBean getValidation() {
		return _Validation;
	}

	/**
	 * Sets the value for validation.
	 * @param v Value to Set.
	 */
	public void setValidation(org.nrg.xdat.bean.XnatValidationdataBean v){
		_Validation =v;
	}

	/**
	 * Sets the value for validation.
	 * @param v Value to Set.
	 */
	public void setValidation(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatValidationdataBean)
			_Validation =(org.nrg.xdat.bean.XnatValidationdataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatValidationdataBean");
	}

	/**
	 * validation
	 * @return org.nrg.xdat.model.XnatValidationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatValidationdataI> void setValidation(A item) throws Exception{
	setValidation((org.nrg.xdat.bean.XnatValidationdataBean)item);
	}

	//FIELD

	private Integer _ValidationFK=null;

	/**
	 * @return Returns the xnat:experimentData/validation_xnat_validationdata_id.
	 */
	public Integer getValidationFK(){
		return _ValidationFK;
	}

	/**
	 * Sets the value for xnat:experimentData/validation_xnat_validationdata_id.
	 * @param v Value to Set.
	 */
	public void setValidationFK(Integer v) {
		_ValidationFK=v;
	}
	 private List<org.nrg.xdat.bean.XnatAbstractresourceBean> _Resources_resource =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean>();

	/**
	 * resources/resource
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getResources_resource() {
		return (List<A>) _Resources_resource;
	}

	/**
	 * Sets the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void setResources_resource(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean> v){
		_Resources_resource=v;
	}

	/**
	 * Adds the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void addResources_resource(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_Resources_resource.add(v);
	}

	/**
	 * resources/resource
	 * Adds org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addResources_resource(A item) throws Exception{
	_Resources_resource.add((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	/**
	 * Adds the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void addResources_resource(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_Resources_resource.add((org.nrg.xdat.bean.XnatAbstractresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}
	 private List<org.nrg.xdat.bean.XnatExperimentdataFieldBean> _Fields_field =new ArrayList<org.nrg.xdat.bean.XnatExperimentdataFieldBean>();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.bean.XnatExperimentdataFieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataFieldI> List<A> getFields_field() {
		return (List<A>) _Fields_field;
	}

	/**
	 * Sets the value for fields/field.
	 * @param v Value to Set.
	 */
	public void setFields_field(ArrayList<org.nrg.xdat.bean.XnatExperimentdataFieldBean> v){
		_Fields_field=v;
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(org.nrg.xdat.bean.XnatExperimentdataFieldBean v){
		_Fields_field.add(v);
	}

	/**
	 * fields/field
	 * Adds org.nrg.xdat.model.XnatExperimentdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataFieldI> void addFields_field(A item) throws Exception{
	_Fields_field.add((org.nrg.xdat.bean.XnatExperimentdataFieldBean)item);
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatExperimentdataFieldBean)
			_Fields_field.add((org.nrg.xdat.bean.XnatExperimentdataFieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatExperimentdataFieldBean");
	}

	//FIELD

	private String _AcquisitionSite=null;

	/**
	 * @return Returns the acquisition_site.
	 */
	public String getAcquisitionSite(){
		return _AcquisitionSite;
	}

	/**
	 * Sets the value for acquisition_site.
	 * @param v Value to Set.
	 */
	public void setAcquisitionSite(String v){
		_AcquisitionSite=v;
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the ID.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private String _Project=null;

	/**
	 * @return Returns the project.
	 */
	public String getProject(){
		return _Project;
	}

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v){
		_Project=v;
	}

	//FIELD

	private String _VisitId=null;

	/**
	 * @return Returns the visit_id.
	 */
	public String getVisitId(){
		return _VisitId;
	}

	/**
	 * Sets the value for visit_id.
	 * @param v Value to Set.
	 */
	public void setVisitId(String v){
		_VisitId=v;
	}

	//FIELD

	private String _Visit=null;

	/**
	 * @return Returns the visit.
	 */
	public String getVisit(){
		return _Visit;
	}

	/**
	 * Sets the value for visit.
	 * @param v Value to Set.
	 */
	public void setVisit(String v){
		_Visit=v;
	}

	//FIELD

	private Integer _Version=null;

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion(){
		return _Version;
	}

	/**
	 * Sets the value for xnat:experimentData/version.
	 * @param v Value to Set.
	 */
	public void setVersion(Integer v) {
		_Version=v;
	}

	/**
	 * Sets the value for xnat:experimentData/version.
	 * @param v Value to Set.
	 */
	public void setVersion(String v)  {
		_Version=formatInteger(v);
	}

	//FIELD

	private String _Original=null;

	/**
	 * @return Returns the original.
	 */
	public String getOriginal(){
		return _Original;
	}

	/**
	 * Sets the value for original.
	 * @param v Value to Set.
	 */
	public void setOriginal(String v){
		_Original=v;
	}

	//FIELD

	private String _Protocol=null;

	/**
	 * @return Returns the protocol.
	 */
	public String getProtocol(){
		return _Protocol;
	}

	/**
	 * Sets the value for protocol.
	 * @param v Value to Set.
	 */
	public void setProtocol(String v){
		_Protocol=v;
	}

	//FIELD

	private String _Label=null;

	/**
	 * @return Returns the label.
	 */
	public String getLabel(){
		return _Label;
	}

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v){
		_Label=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("date")){
			setDate(v);
		}else if (xmlPath.equals("time")){
			setTime(v);
		}else if (xmlPath.equals("duration")){
			setDuration(v);
		}else if (xmlPath.equals("delay")){
			setDelay(v);
		}else if (xmlPath.equals("delay/ref_expt_id")){
			setDelay_refExptId(v);
		}else if (xmlPath.equals("note")){
			setNote(v);
		}else if (xmlPath.equals("acquisition_site")){
			setAcquisitionSite(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("project")){
			setProject(v);
		}else if (xmlPath.equals("visit_id")){
			setVisitId(v);
		}else if (xmlPath.equals("visit")){
			setVisit(v);
		}else if (xmlPath.equals("version")){
			setVersion(v);
		}else if (xmlPath.equals("original")){
			setOriginal(v);
		}else if (xmlPath.equals("protocol")){
			setProtocol(v);
		}else if (xmlPath.equals("label")){
			setLabel(v);
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
		if (xmlPath.equals("sharing/share")){
			addSharing_share(v);
		}else if (xmlPath.equals("investigator")){
			setInvestigator(v);
		}else if (xmlPath.equals("validation")){
			setValidation(v);
		}else if (xmlPath.equals("resources/resource")){
			addResources_resource(v);
		}else if (xmlPath.equals("fields/field")){
			addFields_field(v);
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
		if (xmlPath.equals("date")){
			return getDate();
		}else if (xmlPath.equals("time")){
			return getTime();
		}else if (xmlPath.equals("duration")){
			return getDuration();
		}else if (xmlPath.equals("delay")){
			return getDelay();
		}else if (xmlPath.equals("delay/ref_expt_id")){
			return getDelay_refExptId();
		}else if (xmlPath.equals("note")){
			return getNote();
		}else if (xmlPath.equals("acquisition_site")){
			return getAcquisitionSite();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("project")){
			return getProject();
		}else if (xmlPath.equals("visit_id")){
			return getVisitId();
		}else if (xmlPath.equals("visit")){
			return getVisit();
		}else if (xmlPath.equals("version")){
			return getVersion();
		}else if (xmlPath.equals("original")){
			return getOriginal();
		}else if (xmlPath.equals("protocol")){
			return getProtocol();
		}else if (xmlPath.equals("label")){
			return getLabel();
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
		if (xmlPath.equals("sharing/share")){
			return getSharing_share();
		}else if (xmlPath.equals("investigator")){
			return getInvestigator();
		}else if (xmlPath.equals("validation")){
			return getValidation();
		}else if (xmlPath.equals("resources/resource")){
			return getResources_resource();
		}else if (xmlPath.equals("fields/field")){
			return getFields_field();
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
		if (xmlPath.equals("sharing/share")){
			return "http://nrg.wustl.edu/xnat:experimentData_share";
		}else if (xmlPath.equals("investigator")){
			return "http://nrg.wustl.edu/xnat:investigatorData";
		}else if (xmlPath.equals("validation")){
			return "http://nrg.wustl.edu/xnat:validationData";
		}else if (xmlPath.equals("resources/resource")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("fields/field")){
			return "http://nrg.wustl.edu/xnat:experimentData_field";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("sharing/share")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("date")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("time")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("duration")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("delay")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("delay/ref_expt_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("note")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("investigator")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("validation")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("resources/resource")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("fields/field")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("acquisition_site")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("project")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("visit_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("visit")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("version")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("original")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("protocol")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("label")){
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
		all_fields.add("sharing/share");
		all_fields.add("date");
		all_fields.add("time");
		all_fields.add("duration");
		all_fields.add("delay");
		all_fields.add("delay/ref_expt_id");
		all_fields.add("note");
		all_fields.add("investigator");
		all_fields.add("validation");
		all_fields.add("resources/resource");
		all_fields.add("fields/field");
		all_fields.add("acquisition_site");
		all_fields.add("ID");
		all_fields.add("project");
		all_fields.add("visit_id");
		all_fields.add("visit");
		all_fields.add("version");
		all_fields.add("original");
		all_fields.add("protocol");
		all_fields.add("label");
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
		writer.write("\n<xnat:experimentData");
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
		writer.write("\n</xnat:experimentData>");
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
		if (_Id!=null)
			map.put("ID",ValueParser(_Id,"string"));
		else map.put("ID","");//REQUIRED FIELD

		if (_Project!=null)
			map.put("project",ValueParser(_Project,"string"));
		//NOT REQUIRED FIELD

		if (_VisitId!=null)
			map.put("visit_id",ValueParser(_VisitId,"string"));
		//NOT REQUIRED FIELD

		if (_Visit!=null)
			map.put("visit",ValueParser(_Visit,"string"));
		//NOT REQUIRED FIELD

		if (_Version!=null)
			map.put("version",ValueParser(_Version,"integer"));
		//NOT REQUIRED FIELD

		if (_Original!=null)
			map.put("original",ValueParser(_Original,"string"));
		//NOT REQUIRED FIELD

		if (_Protocol!=null)
			map.put("protocol",ValueParser(_Protocol,"string"));
		//NOT REQUIRED FIELD

		if (_Label!=null)
			map.put("label",ValueParser(_Label,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Sharing_share.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:sharing");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM experimentData -> sharing/share
		java.util.Iterator iter1=_Sharing_share.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatExperimentdataShareBean child = (org.nrg.xdat.bean.XnatExperimentdataShareBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:share");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:experimentData_share")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:share>");
				}else{
					writer.write("</xnat:share>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:sharing>");
			}
			}

		if (_Date!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:date");
			writer.write(">");
			writer.write(ValueParser(_Date,"date"));
			writer.write("</xnat:date>");
			header--;
		}
		if (_Time!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:time");
			writer.write(">");
			writer.write(ValueParser(_Time,"time"));
			writer.write("</xnat:time>");
			header--;
		}
		if (_Duration!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:duration");
			writer.write(">");
			writer.write(ValueParser(_Duration,"duration"));
			writer.write("</xnat:duration>");
			header--;
		}
		TreeMap DelayATTMap = new TreeMap();
		String DelayATT = new String();
		if (_Delay_refExptId!=null)
			DelayATTMap.put("ref_expt_id",ValueParser(_Delay_refExptId,"string"));
		java.util.Iterator iter2 =DelayATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			DelayATT +=" " + key + "=\"" + DelayATTMap.get(key) + "\"";
		}
		if (_Delay!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:delay");
			writer.write(DelayATT);
			writer.write(">");
			writer.write(ValueParser(_Delay,"integer"));
			writer.write("</xnat:delay>");
			header--;
		}
		else if(!DelayATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:delay");
			writer.write(DelayATT);
			writer.write("/>");
			header--;
		}

		if (_Note!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:note");
			writer.write(">");
			writer.write(ValueParser(_Note,"string"));
			writer.write("</xnat:note>");
			header--;
		}
		//REFERENCE FROM experimentData -> investigator
		//DATA-FIELD FROM experimentData -> investigator
		if (_Investigator!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:investigator");
			_Investigator.addXMLAtts(writer);
			if(!_Investigator.getFullSchemaElementName().equals("xnat:investigatorData")){
				writer.write(" xsi:type=\"" + _Investigator.getFullSchemaElementName() + "\"");
			}
			if (_Investigator.hasXMLBodyContent()){
				writer.write(">");
				boolean return3 =_Investigator.addXMLBody(writer,header);
				if(return3){
					writer.write("\n" + createHeader(--header) + "</xnat:investigator>");
				}else{
					writer.write("</xnat:investigator>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		//REFERENCE FROM experimentData -> validation
		//DATA-FIELD FROM experimentData -> validation
		if (_Validation!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:validation");
			_Validation.addXMLAtts(writer);
			if(!_Validation.getFullSchemaElementName().equals("xnat:validationData")){
				writer.write(" xsi:type=\"" + _Validation.getFullSchemaElementName() + "\"");
			}
			if (_Validation.hasXMLBodyContent()){
				writer.write(">");
				boolean return3 =_Validation.addXMLBody(writer,header);
				if(return3){
					writer.write("\n" + createHeader(--header) + "</xnat:validation>");
				}else{
					writer.write("</xnat:validation>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

			int child3=0;
			int att3=0;
			child3+=_Resources_resource.size();
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat:resources");
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM experimentData -> resources/resource
		java.util.Iterator iter4=_Resources_resource.iterator();
		while(iter4.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter4.next();
			writer.write("\n" + createHeader(header++) + "<xnat:resource");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return5 =child.addXMLBody(writer,header);
				if(return5){
					writer.write("\n" + createHeader(--header) + "</xnat:resource>");
				}else{
					writer.write("</xnat:resource>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:resources>");
			}
			}

			int child5=0;
			int att5=0;
			child5+=_Fields_field.size();
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<xnat:fields");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM experimentData -> fields/field
		java.util.Iterator iter6=_Fields_field.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.XnatExperimentdataFieldBean child = (org.nrg.xdat.bean.XnatExperimentdataFieldBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<xnat:field");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:experimentData_field")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</xnat:field>");
				}else{
					writer.write("</xnat:field>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:fields>");
			}
			}

		if (_AcquisitionSite!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acquisition_site");
			writer.write(">");
			writer.write(ValueParser(_AcquisitionSite,"string"));
			writer.write("</xnat:acquisition_site>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Sharing_share.size()>0)return true;
		if (_Date!=null) return true;
		if (_Time!=null) return true;
		if (_Duration!=null) return true;
		if (_Delay_refExptId!=null)
			return true;
		if (_Delay!=null) return true;
		if (_Note!=null) return true;
		if (_Investigator!=null){
			if (_Investigator.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if (_Validation!=null){
			if (_Validation.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

			if(_Resources_resource.size()>0)return true;
			if(_Fields_field.size()>0)return true;
		if (_AcquisitionSite!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
