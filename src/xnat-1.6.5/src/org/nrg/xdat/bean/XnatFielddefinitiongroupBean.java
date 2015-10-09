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
public class XnatFielddefinitiongroupBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatFielddefinitiongroupI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatFielddefinitiongroupBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:fieldDefinitionGroup";

	public String getSchemaElementName(){
		return "fieldDefinitionGroup";
	}

	public String getFullSchemaElementName(){
		return "xnat:fieldDefinitionGroup";
	}
	 private List<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean> _Fields_field =new ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean>();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldI> List<A> getFields_field() {
		return (List<A>) _Fields_field;
	}

	/**
	 * Sets the value for fields/field.
	 * @param v Value to Set.
	 */
	public void setFields_field(ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean> v){
		_Fields_field=v;
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean v){
		_Fields_field.add(v);
	}

	/**
	 * fields/field
	 * Adds org.nrg.xdat.model.XnatFielddefinitiongroupFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldI> void addFields_field(A item) throws Exception{
	_Fields_field.add((org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean)item);
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean)
			_Fields_field.add((org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean");
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

	private String _DataType=null;

	/**
	 * @return Returns the data-type.
	 */
	public String getDataType(){
		return _DataType;
	}

	/**
	 * Sets the value for data-type.
	 * @param v Value to Set.
	 */
	public void setDataType(String v){
		_DataType=v;
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

	private Boolean _Shareable=null;

	/**
	 * @return Returns the shareable.
	 */
	public Boolean getShareable() {
		return _Shareable;
	}

	/**
	 * Sets the value for shareable.
	 * @param v Value to Set.
	 */
	public void setShareable(Object v){
		if(v instanceof Boolean){
			_Shareable=(Boolean)v;
		}else if(v instanceof String){
			_Shareable=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _ProjectSpecific=null;

	/**
	 * @return Returns the project-specific.
	 */
	public Boolean getProjectSpecific() {
		return _ProjectSpecific;
	}

	/**
	 * Sets the value for project-specific.
	 * @param v Value to Set.
	 */
	public void setProjectSpecific(Object v){
		if(v instanceof Boolean){
			_ProjectSpecific=(Boolean)v;
		}else if(v instanceof String){
			_ProjectSpecific=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _XnatFielddefinitiongroupId=null;

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_id.
	 */
	public Integer getXnatFielddefinitiongroupId() {
		return _XnatFielddefinitiongroupId;
	}

	/**
	 * Sets the value for xnat_fieldDefinitionGroup_id.
	 * @param v Value to Set.
	 */
	public void setXnatFielddefinitiongroupId(Integer v){
		_XnatFielddefinitiongroupId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("data-type")){
			setDataType(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("shareable")){
			setShareable(v);
		}else if (xmlPath.equals("project-specific")){
			setProjectSpecific(v);
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
		if (xmlPath.equals("fields/field")){
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
		if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("data-type")){
			return getDataType();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("shareable")){
			return getShareable();
		}else if (xmlPath.equals("project-specific")){
			return getProjectSpecific();
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
		if (xmlPath.equals("fields/field")){
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
		if (xmlPath.equals("fields/field")){
			return "http://nrg.wustl.edu/xnat:fieldDefinitionGroup_field";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("fields/field")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("data-type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("shareable")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("project-specific")){
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
		all_fields.add("fields/field");
		all_fields.add("ID");
		all_fields.add("data-type");
		all_fields.add("description");
		all_fields.add("shareable");
		all_fields.add("project-specific");
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
		writer.write("\n<xnat:FieldDefinitionSet");
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
		writer.write("\n</xnat:FieldDefinitionSet>");
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
		//NOT REQUIRED FIELD

		if (_DataType!=null)
			map.put("data-type",ValueParser(_DataType,"string"));
		//NOT REQUIRED FIELD

		if (_Description!=null)
			map.put("description",ValueParser(_Description,"string"));
		//NOT REQUIRED FIELD

		if (_Shareable!=null)
			map.put("shareable",ValueParser(_Shareable,"boolean"));
		//NOT REQUIRED FIELD

		if (_ProjectSpecific!=null)
			map.put("project-specific",ValueParser(_ProjectSpecific,"boolean"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Fields_field.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:fields");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM fieldDefinitionGroup -> fields/field
		java.util.Iterator iter1=_Fields_field.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean child = (org.nrg.xdat.bean.XnatFielddefinitiongroupFieldBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:field");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:fieldDefinitionGroup_field")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
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

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Fields_field.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
