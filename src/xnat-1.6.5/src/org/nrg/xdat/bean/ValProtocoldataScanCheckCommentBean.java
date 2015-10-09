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
public class ValProtocoldataScanCheckCommentBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ValProtocoldataScanCheckCommentI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ValProtocoldataScanCheckCommentBean.class);
	public static String SCHEMA_ELEMENT_NAME="val:protocolData_scan_check_comment";

	public String getSchemaElementName(){
		return "protocolData_scan_check_comment";
	}

	public String getFullSchemaElementName(){
		return "val:protocolData_scan_check_comment";
	}

	//FIELD

	private String _Comment=null;

	/**
	 * @return Returns the comment.
	 */
	public String getComment(){
		return _Comment;
	}

	/**
	 * Sets the value for comment.
	 * @param v Value to Set.
	 */
	public void setComment(String v){
		_Comment=v;
	}

	//FIELD

	private String _Username=null;

	/**
	 * @return Returns the username.
	 */
	public String getUsername(){
		return _Username;
	}

	/**
	 * Sets the value for username.
	 * @param v Value to Set.
	 */
	public void setUsername(String v){
		_Username=v;
	}

	//FIELD

	private Date _Datetime=null;

	/**
	 * @return Returns the dateTime.
	 */
	public Date getDatetime(){
		return _Datetime;
	}

	/**
	 * Sets the value for dateTime.
	 * @param v Value to Set.
	 */
	public void setDatetime(Date v){
		_Datetime=v;
	}

	/**
	 * Sets the value for dateTime.
	 * @param v Value to Set.
	 */
	public void setDatetime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for dateTime.
	 * @param v Value to Set.
	 */
	public void setDatetime(String v)  {
		_Datetime=formatDateTime(v);
	}

	//FIELD

	private Integer _ValProtocoldataScanCheckCommentId=null;

	/**
	 * @return Returns the val_protocolData_scan_check_comment_id.
	 */
	public Integer getValProtocoldataScanCheckCommentId() {
		return _ValProtocoldataScanCheckCommentId;
	}

	/**
	 * Sets the value for val_protocolData_scan_check_comment_id.
	 * @param v Value to Set.
	 */
	public void setValProtocoldataScanCheckCommentId(Integer v){
		_ValProtocoldataScanCheckCommentId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("comment")){
			setComment(v);
		}else if (xmlPath.equals("username")){
			setUsername(v);
		}else if (xmlPath.equals("dateTime")){
			setDatetime(v);
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
		if (xmlPath.equals("comment")){
			return getComment();
		}else if (xmlPath.equals("username")){
			return getUsername();
		}else if (xmlPath.equals("dateTime")){
			return getDatetime();
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
		if (xmlPath.equals("comment")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("username")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dateTime")){
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
		all_fields.add("comment");
		all_fields.add("username");
		all_fields.add("dateTime");
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
		writer.write("\n<val:protocolData_scan_check_comment");
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
		writer.write("\n</val:protocolData_scan_check_comment>");
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
		if (_Username!=null)
			map.put("username",ValueParser(_Username,"string"));
		//NOT REQUIRED FIELD

		if (_Datetime!=null)
			map.put("dateTime",ValueParser(_Datetime,"dateTime"));
		else map.put("dateTime","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Comment!=null){
			writer.write(ValueParser(_Comment,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Comment!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
