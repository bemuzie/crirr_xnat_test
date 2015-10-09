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
public class ScrScreeningscandataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ScrScreeningscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ScrScreeningscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="scr:screeningScanData";

	public String getSchemaElementName(){
		return "screeningScanData";
	}

	public String getFullSchemaElementName(){
		return "scr:screeningScanData";
	}

	//FIELD

	private String _ImagescanId=null;

	/**
	 * @return Returns the imageScan_ID.
	 */
	public String getImagescanId(){
		return _ImagescanId;
	}

	/**
	 * Sets the value for imageScan_ID.
	 * @param v Value to Set.
	 */
	public void setImagescanId(String v){
		_ImagescanId=v;
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

	private String _Pass=null;

	/**
	 * @return Returns the pass.
	 */
	public String getPass(){
		return _Pass;
	}

	/**
	 * Sets the value for pass.
	 * @param v Value to Set.
	 */
	public void setPass(String v){
		_Pass=v;
	}

	//FIELD

	private Integer _ScrScreeningscandataId=null;

	/**
	 * @return Returns the scr_screeningScanData_id.
	 */
	public Integer getScrScreeningscandataId() {
		return _ScrScreeningscandataId;
	}

	/**
	 * Sets the value for scr_screeningScanData_id.
	 * @param v Value to Set.
	 */
	public void setScrScreeningscandataId(Integer v){
		_ScrScreeningscandataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("imageScan_ID")){
			setImagescanId(v);
		}else if (xmlPath.equals("comments")){
			setComments(v);
		}else if (xmlPath.equals("pass")){
			setPass(v);
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
		if (xmlPath.equals("imageScan_ID")){
			return getImagescanId();
		}else if (xmlPath.equals("comments")){
			return getComments();
		}else if (xmlPath.equals("pass")){
			return getPass();
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
		if (xmlPath.equals("imageScan_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("pass")){
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
		all_fields.add("imageScan_ID");
		all_fields.add("comments");
		all_fields.add("pass");
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
		writer.write("\n<scr:screeningScanData");
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
		writer.write("\n</scr:screeningScanData>");
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
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_ImagescanId!=null){
			writer.write("\n" + createHeader(header++) + "<scr:imageScan_ID");
			writer.write(">");
			writer.write(ValueParser(_ImagescanId,"string"));
			writer.write("</scr:imageScan_ID>");
			header--;
		}
		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<scr:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</scr:comments>");
			header--;
		}
		if (_Pass!=null){
			writer.write("\n" + createHeader(header++) + "<scr:pass");
			writer.write(">");
			writer.write(ValueParser(_Pass,"string"));
			writer.write("</scr:pass>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_ImagescanId!=null) return true;
		if (_Comments!=null) return true;
		if (_Pass!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
