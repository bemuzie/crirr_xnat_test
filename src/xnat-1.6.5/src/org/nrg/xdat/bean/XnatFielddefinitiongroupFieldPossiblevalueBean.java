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
public class XnatFielddefinitiongroupFieldPossiblevalueBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatFielddefinitiongroupFieldPossiblevalueBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:fieldDefinitionGroup_field_possibleValue";

	public String getSchemaElementName(){
		return "fieldDefinitionGroup_field_possibleValue";
	}

	public String getFullSchemaElementName(){
		return "xnat:fieldDefinitionGroup_field_possibleValue";
	}

	//FIELD

	private String _Possiblevalue=null;

	/**
	 * @return Returns the possibleValue.
	 */
	public String getPossiblevalue(){
		return _Possiblevalue;
	}

	/**
	 * Sets the value for possibleValue.
	 * @param v Value to Set.
	 */
	public void setPossiblevalue(String v){
		_Possiblevalue=v;
	}

	//FIELD

	private String _Display=null;

	/**
	 * @return Returns the display.
	 */
	public String getDisplay(){
		return _Display;
	}

	/**
	 * Sets the value for display.
	 * @param v Value to Set.
	 */
	public void setDisplay(String v){
		_Display=v;
	}

	//FIELD

	private Integer _XnatFielddefinitiongroupFieldPossiblevalueId=null;

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_field_possibleValue_id.
	 */
	public Integer getXnatFielddefinitiongroupFieldPossiblevalueId() {
		return _XnatFielddefinitiongroupFieldPossiblevalueId;
	}

	/**
	 * Sets the value for xnat_fieldDefinitionGroup_field_possibleValue_id.
	 * @param v Value to Set.
	 */
	public void setXnatFielddefinitiongroupFieldPossiblevalueId(Integer v){
		_XnatFielddefinitiongroupFieldPossiblevalueId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("possibleValue")){
			setPossiblevalue(v);
		}else if (xmlPath.equals("display")){
			setDisplay(v);
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
		if (xmlPath.equals("possibleValue")){
			return getPossiblevalue();
		}else if (xmlPath.equals("display")){
			return getDisplay();
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
		if (xmlPath.equals("possibleValue")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("display")){
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
		all_fields.add("possibleValue");
		all_fields.add("display");
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
		writer.write("\n<xnat:fieldDefinitionGroup_field_possibleValue");
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
		writer.write("\n</xnat:fieldDefinitionGroup_field_possibleValue>");
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
		if (_Display!=null)
			map.put("display",ValueParser(_Display,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Possiblevalue!=null){
			writer.write(ValueParser(_Possiblevalue,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Possiblevalue!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
