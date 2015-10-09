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
public class XnatPvisitdataBean extends XnatGenericdataBean implements java.io.Serializable, org.nrg.xdat.model.XnatPvisitdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPvisitdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:pVisitData";

	public String getSchemaElementName(){
		return "pVisitData";
	}

	public String getFullSchemaElementName(){
		return "xnat:pVisitData";
	}

	//FIELD

	private String _SubjectId=null;

	/**
	 * @return Returns the subject_ID.
	 */
	public String getSubjectId(){
		return _SubjectId;
	}

	/**
	 * Sets the value for subject_ID.
	 * @param v Value to Set.
	 */
	public void setSubjectId(String v){
		_SubjectId=v;
	}

	//FIELD

	private String _VisitType=null;

	/**
	 * @return Returns the visit_type.
	 */
	public String getVisitType(){
		return _VisitType;
	}

	/**
	 * Sets the value for visit_type.
	 * @param v Value to Set.
	 */
	public void setVisitType(String v){
		_VisitType=v;
	}

	//FIELD

	private String _VisitName=null;

	/**
	 * @return Returns the visit_name.
	 */
	public String getVisitName(){
		return _VisitName;
	}

	/**
	 * Sets the value for visit_name.
	 * @param v Value to Set.
	 */
	public void setVisitName(String v){
		_VisitName=v;
	}

	//FIELD

	private String _Notes=null;

	/**
	 * @return Returns the notes.
	 */
	public String getNotes(){
		return _Notes;
	}

	/**
	 * Sets the value for notes.
	 * @param v Value to Set.
	 */
	public void setNotes(String v){
		_Notes=v;
	}

	//FIELD

	private Date _StartDate=null;

	/**
	 * @return Returns the start_date.
	 */
	public Date getStartDate(){
		return _StartDate;
	}

	/**
	 * Sets the value for start_date.
	 * @param v Value to Set.
	 */
	public void setStartDate(Date v){
		_StartDate=v;
	}

	/**
	 * Sets the value for start_date.
	 * @param v Value to Set.
	 */
	public void setStartDate(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for start_date.
	 * @param v Value to Set.
	 */
	public void setStartDate(String v)  {
		_StartDate=formatDateTime(v);
	}

	//FIELD

	private Date _EndDate=null;

	/**
	 * @return Returns the end_date.
	 */
	public Date getEndDate(){
		return _EndDate;
	}

	/**
	 * Sets the value for end_date.
	 * @param v Value to Set.
	 */
	public void setEndDate(Date v){
		_EndDate=v;
	}

	/**
	 * Sets the value for end_date.
	 * @param v Value to Set.
	 */
	public void setEndDate(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for end_date.
	 * @param v Value to Set.
	 */
	public void setEndDate(String v)  {
		_EndDate=formatDateTime(v);
	}

	//FIELD

	private Boolean _Closed=null;

	/**
	 * @return Returns the closed.
	 */
	public Boolean getClosed() {
		return _Closed;
	}

	/**
	 * Sets the value for closed.
	 * @param v Value to Set.
	 */
	public void setClosed(Object v){
		if(v instanceof Boolean){
			_Closed=(Boolean)v;
		}else if(v instanceof String){
			_Closed=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Terminal=null;

	/**
	 * @return Returns the terminal.
	 */
	public Boolean getTerminal() {
		return _Terminal;
	}

	/**
	 * Sets the value for terminal.
	 * @param v Value to Set.
	 */
	public void setTerminal(Object v){
		if(v instanceof Boolean){
			_Terminal=(Boolean)v;
		}else if(v instanceof String){
			_Terminal=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
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

	private Integer _Protocolversion=null;

	/**
	 * @return Returns the protocolVersion.
	 */
	public Integer getProtocolversion(){
		return _Protocolversion;
	}

	/**
	 * Sets the value for xnat:pVisitData/protocolVersion.
	 * @param v Value to Set.
	 */
	public void setProtocolversion(Integer v) {
		_Protocolversion=v;
	}

	/**
	 * Sets the value for xnat:pVisitData/protocolVersion.
	 * @param v Value to Set.
	 */
	public void setProtocolversion(String v)  {
		_Protocolversion=formatInteger(v);
	}

	//FIELD

	private String _Protocolid=null;

	/**
	 * @return Returns the protocolId.
	 */
	public String getProtocolid(){
		return _Protocolid;
	}

	/**
	 * Sets the value for protocolId.
	 * @param v Value to Set.
	 */
	public void setProtocolid(String v){
		_Protocolid=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("subject_ID")){
			setSubjectId(v);
		}else if (xmlPath.equals("visit_type")){
			setVisitType(v);
		}else if (xmlPath.equals("visit_name")){
			setVisitName(v);
		}else if (xmlPath.equals("notes")){
			setNotes(v);
		}else if (xmlPath.equals("start_date")){
			setStartDate(v);
		}else if (xmlPath.equals("end_date")){
			setEndDate(v);
		}else if (xmlPath.equals("closed")){
			setClosed(v);
		}else if (xmlPath.equals("terminal")){
			setTerminal(v);
		}else if (xmlPath.equals("status")){
			setStatus(v);
		}else if (xmlPath.equals("protocolVersion")){
			setProtocolversion(v);
		}else if (xmlPath.equals("protocolId")){
			setProtocolid(v);
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
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("subject_ID")){
			return getSubjectId();
		}else if (xmlPath.equals("visit_type")){
			return getVisitType();
		}else if (xmlPath.equals("visit_name")){
			return getVisitName();
		}else if (xmlPath.equals("notes")){
			return getNotes();
		}else if (xmlPath.equals("start_date")){
			return getStartDate();
		}else if (xmlPath.equals("end_date")){
			return getEndDate();
		}else if (xmlPath.equals("closed")){
			return getClosed();
		}else if (xmlPath.equals("terminal")){
			return getTerminal();
		}else if (xmlPath.equals("status")){
			return getStatus();
		}else if (xmlPath.equals("protocolVersion")){
			return getProtocolversion();
		}else if (xmlPath.equals("protocolId")){
			return getProtocolid();
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
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("subject_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("visit_type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("visit_name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("notes")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("start_date")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("end_date")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("closed")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("terminal")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("status")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("protocolVersion")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("protocolId")){
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
		all_fields.add("subject_ID");
		all_fields.add("visit_type");
		all_fields.add("visit_name");
		all_fields.add("notes");
		all_fields.add("start_date");
		all_fields.add("end_date");
		all_fields.add("closed");
		all_fields.add("terminal");
		all_fields.add("status");
		all_fields.add("protocolVersion");
		all_fields.add("protocolId");
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
		writer.write("\n<xnat:PVisit");
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
		writer.write("\n</xnat:PVisit>");
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
		if (_Closed!=null)
			map.put("closed",ValueParser(_Closed,"boolean"));
		//NOT REQUIRED FIELD

		if (_Terminal!=null)
			map.put("terminal",ValueParser(_Terminal,"boolean"));
		//NOT REQUIRED FIELD

		if (_Status!=null)
			map.put("status",ValueParser(_Status,"string"));
		//NOT REQUIRED FIELD

		if (_Protocolversion!=null)
			map.put("protocolVersion",ValueParser(_Protocolversion,"integer"));
		//NOT REQUIRED FIELD

		if (_Protocolid!=null)
			map.put("protocolId",ValueParser(_Protocolid,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM pVisitData -> genericData
		if (_SubjectId!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:subject_ID");
			writer.write(">");
			writer.write(ValueParser(_SubjectId,"string"));
			writer.write("</xnat:subject_ID>");
			header--;
		}
		if (_VisitType!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:visit_type");
			writer.write(">");
			writer.write(ValueParser(_VisitType,"string"));
			writer.write("</xnat:visit_type>");
			header--;
		}
		if (_VisitName!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:visit_name");
			writer.write(">");
			writer.write(ValueParser(_VisitName,"string"));
			writer.write("</xnat:visit_name>");
			header--;
		}
		if (_Notes!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:notes");
			writer.write(">");
			writer.write(ValueParser(_Notes,"string"));
			writer.write("</xnat:notes>");
			header--;
		}
		if (_StartDate!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:start_date");
			writer.write(">");
			writer.write(ValueParser(_StartDate,"dateTime"));
			writer.write("</xnat:start_date>");
			header--;
		}
		if (_EndDate!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:end_date");
			writer.write(">");
			writer.write(ValueParser(_EndDate,"dateTime"));
			writer.write("</xnat:end_date>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_SubjectId!=null) return true;
		if (_VisitType!=null) return true;
		if (_VisitName!=null) return true;
		if (_Notes!=null) return true;
		if (_StartDate!=null) return true;
		if (_EndDate!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
