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
public class PipePipelinedetailsParameterBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.PipePipelinedetailsParameterI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PipePipelinedetailsParameterBean.class);
	public static String SCHEMA_ELEMENT_NAME="pipe:pipelineDetails_parameter";

	public String getSchemaElementName(){
		return "pipelineDetails_parameter";
	}

	public String getFullSchemaElementName(){
		return "pipe:pipelineDetails_parameter";
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

	private String _Values_schemalink=null;

	/**
	 * @return Returns the values/schemaLink.
	 */
	public String getValues_schemalink(){
		return _Values_schemalink;
	}

	/**
	 * Sets the value for values/schemaLink.
	 * @param v Value to Set.
	 */
	public void setValues_schemalink(String v){
		_Values_schemalink=v;
	}

	//FIELD

	private String _Values_csvvalues=null;

	/**
	 * @return Returns the values/csvValues.
	 */
	public String getValues_csvvalues(){
		return _Values_csvvalues;
	}

	/**
	 * Sets the value for values/csvValues.
	 * @param v Value to Set.
	 */
	public void setValues_csvvalues(String v){
		_Values_csvvalues=v;
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

	private Integer _PipePipelinedetailsParameterId=null;

	/**
	 * @return Returns the pipe_pipelineDetails_parameter_id.
	 */
	public Integer getPipePipelinedetailsParameterId() {
		return _PipePipelinedetailsParameterId;
	}

	/**
	 * Sets the value for pipe_pipelineDetails_parameter_id.
	 * @param v Value to Set.
	 */
	public void setPipePipelinedetailsParameterId(Integer v){
		_PipePipelinedetailsParameterId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("values/schemaLink")){
			setValues_schemalink(v);
		}else if (xmlPath.equals("values/csvValues")){
			setValues_csvvalues(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
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
		if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("values/schemaLink")){
			return getValues_schemalink();
		}else if (xmlPath.equals("values/csvValues")){
			return getValues_csvvalues();
		}else if (xmlPath.equals("description")){
			return getDescription();
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
		if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("values/schemaLink")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("values/csvValues")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_LONG_DATA;
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
		all_fields.add("name");
		all_fields.add("values/schemaLink");
		all_fields.add("values/csvValues");
		all_fields.add("description");
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
		writer.write("\n<pipe:pipelineDetails_parameter");
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
		writer.write("\n</pipe:pipelineDetails_parameter>");
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
		if (_Name!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:name");
			writer.write(">");
			writer.write(ValueParser(_Name,"string"));
			writer.write("</pipe:name>");
			header--;
		}
			int child0=0;
			int att0=0;
			if(_Values_schemalink!=null)
			child0++;
			if(_Values_csvvalues!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<pipe:values");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Values_schemalink!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:schemaLink");
			writer.write(">");
			writer.write(ValueParser(_Values_schemalink,"string"));
			writer.write("</pipe:schemaLink>");
			header--;
		}
		if (_Values_csvvalues!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:csvValues");
			writer.write(">");
			writer.write(ValueParser(_Values_csvvalues,"string"));
			writer.write("</pipe:csvValues>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</pipe:values>");
			}
			}

		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</pipe:description>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Name!=null) return true;
			if(_Values_schemalink!=null) return true;
			if(_Values_csvvalues!=null) return true;
		if (_Description!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
