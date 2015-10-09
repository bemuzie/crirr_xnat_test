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
public class XnatValidationdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatValidationdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatValidationdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:validationData";

	public String getSchemaElementName(){
		return "validationData";
	}

	public String getFullSchemaElementName(){
		return "xnat:validationData";
	}

	//FIELD

	private String _Method=null;

	/**
	 * @return Returns the method.
	 */
	public String getMethod(){
		return _Method;
	}

	/**
	 * Sets the value for method.
	 * @param v Value to Set.
	 */
	public void setMethod(String v){
		_Method=v;
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

	private String _ValidatedBy=null;

	/**
	 * @return Returns the validated_by.
	 */
	public String getValidatedBy(){
		return _ValidatedBy;
	}

	/**
	 * Sets the value for validated_by.
	 * @param v Value to Set.
	 */
	public void setValidatedBy(String v){
		_ValidatedBy=v;
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

	private Integer _XnatValidationdataId=null;

	/**
	 * @return Returns the xnat_validationData_id.
	 */
	public Integer getXnatValidationdataId() {
		return _XnatValidationdataId;
	}

	/**
	 * Sets the value for xnat_validationData_id.
	 * @param v Value to Set.
	 */
	public void setXnatValidationdataId(Integer v){
		_XnatValidationdataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("method")){
			setMethod(v);
		}else if (xmlPath.equals("date")){
			setDate(v);
		}else if (xmlPath.equals("notes")){
			setNotes(v);
		}else if (xmlPath.equals("validated_by")){
			setValidatedBy(v);
		}else if (xmlPath.equals("status")){
			setStatus(v);
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
		if (xmlPath.equals("method")){
			return getMethod();
		}else if (xmlPath.equals("date")){
			return getDate();
		}else if (xmlPath.equals("notes")){
			return getNotes();
		}else if (xmlPath.equals("validated_by")){
			return getValidatedBy();
		}else if (xmlPath.equals("status")){
			return getStatus();
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
		if (xmlPath.equals("method")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("date")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("notes")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("validated_by")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("status")){
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
		all_fields.add("method");
		all_fields.add("date");
		all_fields.add("notes");
		all_fields.add("validated_by");
		all_fields.add("status");
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
		writer.write("\n<xnat:validationData");
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
		writer.write("\n</xnat:validationData>");
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
		if (_Status!=null)
			map.put("status",ValueParser(_Status,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Method!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:method");
			writer.write(">");
			writer.write(ValueParser(_Method,"string"));
			writer.write("</xnat:method>");
			header--;
		}
		if (_Date!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:date");
			writer.write(">");
			writer.write(ValueParser(_Date,"date"));
			writer.write("</xnat:date>");
			header--;
		}
		if (_Notes!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:notes");
			writer.write(">");
			writer.write(ValueParser(_Notes,"string"));
			writer.write("</xnat:notes>");
			header--;
		}
		if (_ValidatedBy!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:validated_by");
			writer.write(">");
			writer.write(ValueParser(_ValidatedBy,"string"));
			writer.write("</xnat:validated_by>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Method!=null) return true;
		if (_Date!=null) return true;
		if (_Notes!=null) return true;
		if (_ValidatedBy!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
