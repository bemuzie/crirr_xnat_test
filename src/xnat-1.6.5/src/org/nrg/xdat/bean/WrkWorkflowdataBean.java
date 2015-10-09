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
public class WrkWorkflowdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.WrkWorkflowdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(WrkWorkflowdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="wrk:workflowData";

	public String getSchemaElementName(){
		return "workflowData";
	}

	public String getFullSchemaElementName(){
		return "wrk:workflowData";
	}
	 private org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean _Executionenvironment =null;

	/**
	 * executionEnvironment
	 * @return org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean
	 */
	public org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean getExecutionenvironment() {
		return _Executionenvironment;
	}

	/**
	 * Sets the value for executionEnvironment.
	 * @param v Value to Set.
	 */
	public void setExecutionenvironment(org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean v){
		_Executionenvironment =v;
	}

	/**
	 * Sets the value for executionEnvironment.
	 * @param v Value to Set.
	 */
	public void setExecutionenvironment(Object v) {
		if (v instanceof org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean)
			_Executionenvironment =(org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean");
	}

	/**
	 * executionEnvironment
	 * @return org.nrg.xdat.model.WrkAbstractexecutionenvironmentI
	 */
	public <A extends org.nrg.xdat.model.WrkAbstractexecutionenvironmentI> void setExecutionenvironment(A item) throws Exception{
	setExecutionenvironment((org.nrg.xdat.bean.WrkAbstractexecutionenvironmentBean)item);
	}

	//FIELD

	private Integer _ExecutionenvironmentFK=null;

	/**
	 * @return Returns the wrk:workflowData/executionenvironment_wrk_abstractexecutionenvironment_id.
	 */
	public Integer getExecutionenvironmentFK(){
		return _ExecutionenvironmentFK;
	}

	/**
	 * Sets the value for wrk:workflowData/executionenvironment_wrk_abstractexecutionenvironment_id.
	 * @param v Value to Set.
	 */
	public void setExecutionenvironmentFK(Integer v) {
		_ExecutionenvironmentFK=v;
	}

	//FIELD

	private String _Comments=null;

	/**
	 * @return Returns the comments.
	 */
	public String getComments(){
		return _Comments;
	}

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v){
		_Comments=v;
	}

	//FIELD

	private String _Details=null;

	/**
	 * @return Returns the details.
	 */
	public String getDetails(){
		return _Details;
	}

	/**
	 * Sets the value for details.
	 * @param v Value to Set.
	 */
	public void setDetails(String v){
		_Details=v;
	}

	//FIELD

	private String _Justification=null;

	/**
	 * @return Returns the justification.
	 */
	public String getJustification(){
		return _Justification;
	}

	/**
	 * Sets the value for justification.
	 * @param v Value to Set.
	 */
	public void setJustification(String v){
		_Justification=v;
	}

	//FIELD

	private String _Description=null;

	/**
	 * @return Returns the description.
	 */
	public String getDescription(){
		return _Description;
	}

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v){
		_Description=v;
	}

	//FIELD

	private String _Src=null;

	/**
	 * @return Returns the src.
	 */
	public String getSrc(){
		return _Src;
	}

	/**
	 * Sets the value for src.
	 * @param v Value to Set.
	 */
	public void setSrc(String v){
		_Src=v;
	}

	//FIELD

	private String _Type=null;

	/**
	 * @return Returns the type.
	 */
	public String getType(){
		return _Type;
	}

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v){
		_Type=v;
	}

	//FIELD

	private String _Category=null;

	/**
	 * @return Returns the category.
	 */
	public String getCategory(){
		return _Category;
	}

	/**
	 * Sets the value for category.
	 * @param v Value to Set.
	 */
	public void setCategory(String v){
		_Category=v;
	}

	//FIELD

	private String _DataType=null;

	/**
	 * @return Returns the data_type.
	 */
	public String getDataType(){
		return _DataType;
	}

	/**
	 * Sets the value for data_type.
	 * @param v Value to Set.
	 */
	public void setDataType(String v){
		_DataType=v;
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

	private String _Externalid=null;

	/**
	 * @return Returns the ExternalID.
	 */
	public String getExternalid(){
		return _Externalid;
	}

	/**
	 * Sets the value for ExternalID.
	 * @param v Value to Set.
	 */
	public void setExternalid(String v){
		_Externalid=v;
	}

	//FIELD

	private Date _CurrentStepLaunchTime=null;

	/**
	 * @return Returns the current_step_launch_time.
	 */
	public Date getCurrentStepLaunchTime(){
		return _CurrentStepLaunchTime;
	}

	/**
	 * Sets the value for current_step_launch_time.
	 * @param v Value to Set.
	 */
	public void setCurrentStepLaunchTime(Date v){
		_CurrentStepLaunchTime=v;
	}

	/**
	 * Sets the value for current_step_launch_time.
	 * @param v Value to Set.
	 */
	public void setCurrentStepLaunchTime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for current_step_launch_time.
	 * @param v Value to Set.
	 */
	public void setCurrentStepLaunchTime(String v)  {
		_CurrentStepLaunchTime=formatDateTime(v);
	}

	//FIELD

	private String _CurrentStepId=null;

	/**
	 * @return Returns the current_step_id.
	 */
	public String getCurrentStepId(){
		return _CurrentStepId;
	}

	/**
	 * Sets the value for current_step_id.
	 * @param v Value to Set.
	 */
	public void setCurrentStepId(String v){
		_CurrentStepId=v;
	}

	//FIELD

	private String _Status=null;

	/**
	 * @return Returns the status.
	 */
	public String getStatus(){
		return _Status;
	}

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v){
		_Status=v;
	}

	//FIELD

	private String _CreateUser=null;

	/**
	 * @return Returns the create_user.
	 */
	public String getCreateUser(){
		return _CreateUser;
	}

	/**
	 * Sets the value for create_user.
	 * @param v Value to Set.
	 */
	public void setCreateUser(String v){
		_CreateUser=v;
	}

	//FIELD

	private String _PipelineName=null;

	/**
	 * @return Returns the pipeline_name.
	 */
	public String getPipelineName(){
		return _PipelineName;
	}

	/**
	 * Sets the value for pipeline_name.
	 * @param v Value to Set.
	 */
	public void setPipelineName(String v){
		_PipelineName=v;
	}

	//FIELD

	private String _NextStepId=null;

	/**
	 * @return Returns the next_step_id.
	 */
	public String getNextStepId(){
		return _NextStepId;
	}

	/**
	 * Sets the value for next_step_id.
	 * @param v Value to Set.
	 */
	public void setNextStepId(String v){
		_NextStepId=v;
	}

	//FIELD

	private String _StepDescription=null;

	/**
	 * @return Returns the step_description.
	 */
	public String getStepDescription(){
		return _StepDescription;
	}

	/**
	 * Sets the value for step_description.
	 * @param v Value to Set.
	 */
	public void setStepDescription(String v){
		_StepDescription=v;
	}

	//FIELD

	private Date _LaunchTime=null;

	/**
	 * @return Returns the launch_time.
	 */
	public Date getLaunchTime(){
		return _LaunchTime;
	}

	/**
	 * Sets the value for launch_time.
	 * @param v Value to Set.
	 */
	public void setLaunchTime(Date v){
		_LaunchTime=v;
	}

	/**
	 * Sets the value for launch_time.
	 * @param v Value to Set.
	 */
	public void setLaunchTime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for launch_time.
	 * @param v Value to Set.
	 */
	public void setLaunchTime(String v)  {
		_LaunchTime=formatDateTime(v);
	}

	//FIELD

	private String _Percentagecomplete=null;

	/**
	 * @return Returns the percentageComplete.
	 */
	public String getPercentagecomplete(){
		return _Percentagecomplete;
	}

	/**
	 * Sets the value for percentageComplete.
	 * @param v Value to Set.
	 */
	public void setPercentagecomplete(String v){
		_Percentagecomplete=v;
	}

	//FIELD

	private String _Jobid=null;

	/**
	 * @return Returns the jobID.
	 */
	public String getJobid(){
		return _Jobid;
	}

	/**
	 * Sets the value for jobID.
	 * @param v Value to Set.
	 */
	public void setJobid(String v){
		_Jobid=v;
	}

	//FIELD

	private Integer _WrkWorkflowdataId=null;

	/**
	 * @return Returns the wrk_workflowData_id.
	 */
	public Integer getWrkWorkflowdataId() {
		return _WrkWorkflowdataId;
	}

	/**
	 * Sets the value for wrk_workflowData_id.
	 * @param v Value to Set.
	 */
	public void setWrkWorkflowdataId(Integer v){
		_WrkWorkflowdataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("comments")){
			setComments(v);
		}else if (xmlPath.equals("details")){
			setDetails(v);
		}else if (xmlPath.equals("justification")){
			setJustification(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("src")){
			setSrc(v);
		}else if (xmlPath.equals("type")){
			setType(v);
		}else if (xmlPath.equals("category")){
			setCategory(v);
		}else if (xmlPath.equals("data_type")){
			setDataType(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("ExternalID")){
			setExternalid(v);
		}else if (xmlPath.equals("current_step_launch_time")){
			setCurrentStepLaunchTime(v);
		}else if (xmlPath.equals("current_step_id")){
			setCurrentStepId(v);
		}else if (xmlPath.equals("status")){
			setStatus(v);
		}else if (xmlPath.equals("create_user")){
			setCreateUser(v);
		}else if (xmlPath.equals("pipeline_name")){
			setPipelineName(v);
		}else if (xmlPath.equals("next_step_id")){
			setNextStepId(v);
		}else if (xmlPath.equals("step_description")){
			setStepDescription(v);
		}else if (xmlPath.equals("launch_time")){
			setLaunchTime(v);
		}else if (xmlPath.equals("percentageComplete")){
			setPercentagecomplete(v);
		}else if (xmlPath.equals("jobID")){
			setJobid(v);
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
		if (xmlPath.equals("executionEnvironment")){
			setExecutionenvironment(v);
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
		if (xmlPath.equals("comments")){
			return getComments();
		}else if (xmlPath.equals("details")){
			return getDetails();
		}else if (xmlPath.equals("justification")){
			return getJustification();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("src")){
			return getSrc();
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("category")){
			return getCategory();
		}else if (xmlPath.equals("data_type")){
			return getDataType();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("ExternalID")){
			return getExternalid();
		}else if (xmlPath.equals("current_step_launch_time")){
			return getCurrentStepLaunchTime();
		}else if (xmlPath.equals("current_step_id")){
			return getCurrentStepId();
		}else if (xmlPath.equals("status")){
			return getStatus();
		}else if (xmlPath.equals("create_user")){
			return getCreateUser();
		}else if (xmlPath.equals("pipeline_name")){
			return getPipelineName();
		}else if (xmlPath.equals("next_step_id")){
			return getNextStepId();
		}else if (xmlPath.equals("step_description")){
			return getStepDescription();
		}else if (xmlPath.equals("launch_time")){
			return getLaunchTime();
		}else if (xmlPath.equals("percentageComplete")){
			return getPercentagecomplete();
		}else if (xmlPath.equals("jobID")){
			return getJobid();
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
		if (xmlPath.equals("executionEnvironment")){
			return getExecutionenvironment();
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
		if (xmlPath.equals("executionEnvironment")){
			return "http://nrg.wustl.edu/workflow:abstractExecutionEnvironment";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("executionEnvironment")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("details")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("justification")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("src")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("category")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("data_type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ExternalID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("current_step_launch_time")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("current_step_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("status")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("create_user")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("pipeline_name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("next_step_id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("step_description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("launch_time")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("percentageComplete")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("jobID")){
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
		all_fields.add("executionEnvironment");
		all_fields.add("comments");
		all_fields.add("details");
		all_fields.add("justification");
		all_fields.add("description");
		all_fields.add("src");
		all_fields.add("type");
		all_fields.add("category");
		all_fields.add("data_type");
		all_fields.add("ID");
		all_fields.add("ExternalID");
		all_fields.add("current_step_launch_time");
		all_fields.add("current_step_id");
		all_fields.add("status");
		all_fields.add("create_user");
		all_fields.add("pipeline_name");
		all_fields.add("next_step_id");
		all_fields.add("step_description");
		all_fields.add("launch_time");
		all_fields.add("percentageComplete");
		all_fields.add("jobID");
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
		writer.write("\n<wrk:Workflow");
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
		writer.write("\n</wrk:Workflow>");
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
		if (_Src!=null)
			map.put("src",ValueParser(_Src,"string"));
		//NOT REQUIRED FIELD

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		if (_Category!=null)
			map.put("category",ValueParser(_Category,"string"));
		//NOT REQUIRED FIELD

		if (_DataType!=null)
			map.put("data_type",ValueParser(_DataType,"string"));
		else map.put("data_type","");//REQUIRED FIELD

		if (_Id!=null)
			map.put("ID",ValueParser(_Id,"string"));
		else map.put("ID","");//REQUIRED FIELD

		if (_Externalid!=null)
			map.put("ExternalID",ValueParser(_Externalid,"string"));
		//NOT REQUIRED FIELD

		if (_CurrentStepLaunchTime!=null)
			map.put("current_step_launch_time",ValueParser(_CurrentStepLaunchTime,"dateTime"));
		//NOT REQUIRED FIELD

		if (_CurrentStepId!=null)
			map.put("current_step_id",ValueParser(_CurrentStepId,"string"));
		//NOT REQUIRED FIELD

		if (_Status!=null)
			map.put("status",ValueParser(_Status,"string"));
		else map.put("status","");//REQUIRED FIELD

		if (_CreateUser!=null)
			map.put("create_user",ValueParser(_CreateUser,"string"));
		//NOT REQUIRED FIELD

		if (_PipelineName!=null)
			map.put("pipeline_name",ValueParser(_PipelineName,"string"));
		else map.put("pipeline_name","");//REQUIRED FIELD

		if (_NextStepId!=null)
			map.put("next_step_id",ValueParser(_NextStepId,"string"));
		//NOT REQUIRED FIELD

		if (_StepDescription!=null)
			map.put("step_description",ValueParser(_StepDescription,"string"));
		//NOT REQUIRED FIELD

		if (_LaunchTime!=null)
			map.put("launch_time",ValueParser(_LaunchTime,"dateTime"));
		else map.put("launch_time","");//REQUIRED FIELD

		if (_Percentagecomplete!=null)
			map.put("percentageComplete",ValueParser(_Percentagecomplete,"string"));
		//NOT REQUIRED FIELD

		if (_Jobid!=null)
			map.put("jobID",ValueParser(_Jobid,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM workflowData -> executionEnvironment
		//DATA-FIELD FROM workflowData -> executionEnvironment
		if (_Executionenvironment!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<wrk:executionEnvironment");
			_Executionenvironment.addXMLAtts(writer);
			if(!_Executionenvironment.getFullSchemaElementName().equals("wrk:abstractExecutionEnvironment")){
				writer.write(" xsi:type=\"" + _Executionenvironment.getFullSchemaElementName() + "\"");
			}
			if (_Executionenvironment.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Executionenvironment.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</wrk:executionEnvironment>");
				}else{
					writer.write("</wrk:executionEnvironment>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</wrk:comments>");
			header--;
		}
		if (_Details!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:details");
			writer.write(">");
			writer.write(ValueParser(_Details,"string"));
			writer.write("</wrk:details>");
			header--;
		}
		if (_Justification!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:justification");
			writer.write(">");
			writer.write(ValueParser(_Justification,"string"));
			writer.write("</wrk:justification>");
			header--;
		}
		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</wrk:description>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Executionenvironment!=null){
			if (_Executionenvironment.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if (_Comments!=null) return true;
		if (_Details!=null) return true;
		if (_Justification!=null) return true;
		if (_Description!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
