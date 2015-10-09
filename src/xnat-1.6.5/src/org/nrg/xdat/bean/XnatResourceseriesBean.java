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
public class XnatResourceseriesBean extends XnatAbstractresourceBean implements java.io.Serializable, org.nrg.xdat.model.XnatResourceseriesI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatResourceseriesBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:resourceSeries";

	public String getSchemaElementName(){
		return "resourceSeries";
	}

	public String getFullSchemaElementName(){
		return "xnat:resourceSeries";
	}

	//FIELD

	private String _Path=null;

	/**
	 * @return Returns the path.
	 */
	public String getPath(){
		return _Path;
	}

	/**
	 * Sets the value for path.
	 * @param v Value to Set.
	 */
	public void setPath(String v){
		_Path=v;
	}

	//FIELD

	private String _Pattern=null;

	/**
	 * @return Returns the pattern.
	 */
	public String getPattern(){
		return _Pattern;
	}

	/**
	 * Sets the value for pattern.
	 * @param v Value to Set.
	 */
	public void setPattern(String v){
		_Pattern=v;
	}

	//FIELD

	private Integer _Count=null;

	/**
	 * @return Returns the count.
	 */
	public Integer getCount(){
		return _Count;
	}

	/**
	 * Sets the value for xnat:resourceSeries/count.
	 * @param v Value to Set.
	 */
	public void setCount(Integer v) {
		_Count=v;
	}

	/**
	 * Sets the value for xnat:resourceSeries/count.
	 * @param v Value to Set.
	 */
	public void setCount(String v)  {
		_Count=formatInteger(v);
	}

	//FIELD

	private String _Name=null;

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		return _Name;
	}

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v){
		_Name=v;
	}

	//FIELD

	private String _Format=null;

	/**
	 * @return Returns the format.
	 */
	public String getFormat(){
		return _Format;
	}

	/**
	 * Sets the value for format.
	 * @param v Value to Set.
	 */
	public void setFormat(String v){
		_Format=v;
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

	private String _Content=null;

	/**
	 * @return Returns the content.
	 */
	public String getContent(){
		return _Content;
	}

	/**
	 * Sets the value for content.
	 * @param v Value to Set.
	 */
	public void setContent(String v){
		_Content=v;
	}

	//FIELD

	private String _Cachepath=null;

	/**
	 * @return Returns the cachePath.
	 */
	public String getCachepath(){
		return _Cachepath;
	}

	/**
	 * Sets the value for cachePath.
	 * @param v Value to Set.
	 */
	public void setCachepath(String v){
		_Cachepath=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("path")){
			setPath(v);
		}else if (xmlPath.equals("pattern")){
			setPattern(v);
		}else if (xmlPath.equals("count")){
			setCount(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("format")){
			setFormat(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("content")){
			setContent(v);
		}else if (xmlPath.equals("cachePath")){
			setCachepath(v);
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
		if (xmlPath.equals("path")){
			return getPath();
		}else if (xmlPath.equals("pattern")){
			return getPattern();
		}else if (xmlPath.equals("count")){
			return getCount();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("format")){
			return getFormat();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("content")){
			return getContent();
		}else if (xmlPath.equals("cachePath")){
			return getCachepath();
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
		if (xmlPath.equals("path")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("pattern")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("count")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("format")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("content")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cachePath")){
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
		all_fields.add("path");
		all_fields.add("pattern");
		all_fields.add("count");
		all_fields.add("name");
		all_fields.add("format");
		all_fields.add("description");
		all_fields.add("content");
		all_fields.add("cachePath");
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
		writer.write("\n<xnat:resourceSeries");
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
		writer.write("\n</xnat:resourceSeries>");
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
		if (_Path!=null)
			map.put("path",ValueParser(_Path,"string"));
		else map.put("path","");//REQUIRED FIELD

		if (_Pattern!=null)
			map.put("pattern",ValueParser(_Pattern,"string"));
		else map.put("pattern","");//REQUIRED FIELD

		if (_Count!=null)
			map.put("count",ValueParser(_Count,"integer"));
		//NOT REQUIRED FIELD

		if (_Name!=null)
			map.put("name",ValueParser(_Name,"string"));
		//NOT REQUIRED FIELD

		if (_Format!=null)
			map.put("format",ValueParser(_Format,"string"));
		//NOT REQUIRED FIELD

		if (_Description!=null)
			map.put("description",ValueParser(_Description,"string"));
		//NOT REQUIRED FIELD

		if (_Content!=null)
			map.put("content",ValueParser(_Content,"string"));
		//NOT REQUIRED FIELD

		if (_Cachepath!=null)
			map.put("cachePath",ValueParser(_Cachepath,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM resourceSeries -> abstractResource
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
