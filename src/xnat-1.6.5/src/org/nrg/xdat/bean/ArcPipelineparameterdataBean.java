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
public class ArcPipelineparameterdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcPipelineparameterdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcPipelineparameterdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:pipelineParameterData";

	public String getSchemaElementName(){
		return "pipelineParameterData";
	}

	public String getFullSchemaElementName(){
		return "arc:pipelineParameterData";
	}

	//FIELD

	private String _Schemalink=null;

	/**
	 * @return Returns the schemaLink.
	 */
	public String getSchemalink(){
		return _Schemalink;
	}

	/**
	 * Sets the value for schemaLink.
	 * @param v Value to Set.
	 */
	public void setSchemalink(String v){
		_Schemalink=v;
	}

	//FIELD

	private String _Csvvalues=null;

	/**
	 * @return Returns the csvValues.
	 */
	public String getCsvvalues(){
		return _Csvvalues;
	}

	/**
	 * Sets the value for csvValues.
	 * @param v Value to Set.
	 */
	public void setCsvvalues(String v){
		_Csvvalues=v;
	}

	//FIELD

	private String _Csvvalues_selected=null;

	/**
	 * @return Returns the csvValues/selected.
	 */
	public String getCsvvalues_selected(){
		return _Csvvalues_selected;
	}

	/**
	 * Sets the value for csvValues/selected.
	 * @param v Value to Set.
	 */
	public void setCsvvalues_selected(String v){
		_Csvvalues_selected=v;
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

	private Boolean _Multiplevalues=null;

	/**
	 * @return Returns the multipleValues.
	 */
	public Boolean getMultiplevalues() {
		return _Multiplevalues;
	}

	/**
	 * Sets the value for multipleValues.
	 * @param v Value to Set.
	 */
	public void setMultiplevalues(Object v){
		if(v instanceof Boolean){
			_Multiplevalues=(Boolean)v;
		}else if(v instanceof String){
			_Multiplevalues=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Editable=null;

	/**
	 * @return Returns the editable.
	 */
	public Boolean getEditable() {
		return _Editable;
	}

	/**
	 * Sets the value for editable.
	 * @param v Value to Set.
	 */
	public void setEditable(Object v){
		if(v instanceof Boolean){
			_Editable=(Boolean)v;
		}else if(v instanceof String){
			_Editable=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Batchparam=null;

	/**
	 * @return Returns the batchParam.
	 */
	public Boolean getBatchparam() {
		return _Batchparam;
	}

	/**
	 * Sets the value for batchParam.
	 * @param v Value to Set.
	 */
	public void setBatchparam(Object v){
		if(v instanceof Boolean){
			_Batchparam=(Boolean)v;
		}else if(v instanceof String){
			_Batchparam=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _ArcPipelineparameterdataId=null;

	/**
	 * @return Returns the arc_pipelineParameterData_id.
	 */
	public Integer getArcPipelineparameterdataId() {
		return _ArcPipelineparameterdataId;
	}

	/**
	 * Sets the value for arc_pipelineParameterData_id.
	 * @param v Value to Set.
	 */
	public void setArcPipelineparameterdataId(Integer v){
		_ArcPipelineparameterdataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("schemaLink")){
			setSchemalink(v);
		}else if (xmlPath.equals("csvValues")){
			setCsvvalues(v);
		}else if (xmlPath.equals("csvValues/selected")){
			setCsvvalues_selected(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("multipleValues")){
			setMultiplevalues(v);
		}else if (xmlPath.equals("editable")){
			setEditable(v);
		}else if (xmlPath.equals("batchParam")){
			setBatchparam(v);
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
		if (xmlPath.equals("schemaLink")){
			return getSchemalink();
		}else if (xmlPath.equals("csvValues")){
			return getCsvvalues();
		}else if (xmlPath.equals("csvValues/selected")){
			return getCsvvalues_selected();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("multipleValues")){
			return getMultiplevalues();
		}else if (xmlPath.equals("editable")){
			return getEditable();
		}else if (xmlPath.equals("batchParam")){
			return getBatchparam();
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
		if (xmlPath.equals("schemaLink")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("csvValues")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("csvValues/selected")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("multipleValues")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("editable")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("batchParam")){
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
		all_fields.add("schemaLink");
		all_fields.add("csvValues");
		all_fields.add("csvValues/selected");
		all_fields.add("description");
		all_fields.add("name");
		all_fields.add("multipleValues");
		all_fields.add("editable");
		all_fields.add("batchParam");
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
		writer.write("\n<arc:pipelineParameterData");
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
		writer.write("\n</arc:pipelineParameterData>");
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
		if (_Name!=null)
			map.put("name",ValueParser(_Name,"string"));
		else map.put("name","");//REQUIRED FIELD

		if (_Multiplevalues!=null)
			map.put("multipleValues",ValueParser(_Multiplevalues,"boolean"));
		//NOT REQUIRED FIELD

		if (_Editable!=null)
			map.put("editable",ValueParser(_Editable,"boolean"));
		//NOT REQUIRED FIELD

		if (_Batchparam!=null)
			map.put("batchParam",ValueParser(_Batchparam,"boolean"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Schemalink!=null){
			writer.write("\n" + createHeader(header++) + "<arc:schemaLink");
			writer.write(">");
			writer.write(ValueParser(_Schemalink,"string"));
			writer.write("</arc:schemaLink>");
			header--;
		}
		TreeMap CsvvaluesATTMap = new TreeMap();
		String CsvvaluesATT = new String();
		if (_Csvvalues_selected!=null)
			CsvvaluesATTMap.put("selected",ValueParser(_Csvvalues_selected,"string"));
		java.util.Iterator iter0 =CsvvaluesATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			CsvvaluesATT +=" " + key + "=\"" + CsvvaluesATTMap.get(key) + "\"";
		}
		if (_Csvvalues!=null){
			writer.write("\n" + createHeader(header++) + "<arc:csvValues");
			writer.write(CsvvaluesATT);
			writer.write(">");
			writer.write(ValueParser(_Csvvalues,"string"));
			writer.write("</arc:csvValues>");
			header--;
		}
		else if(!CsvvaluesATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<arc:csvValues");
			writer.write(CsvvaluesATT);
			writer.write("/>");
			header--;
		}

		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<arc:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</arc:description>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Schemalink!=null) return true;
		if (_Csvvalues_selected!=null)
			return true;
		if (_Csvvalues!=null) return true;
		if (_Description!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
