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
public class XnatFielddefinitiongroupFieldBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatFielddefinitiongroupFieldI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatFielddefinitiongroupFieldBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:fieldDefinitionGroup_field";

	public String getSchemaElementName(){
		return "fieldDefinitionGroup_field";
	}

	public String getFullSchemaElementName(){
		return "xnat:fieldDefinitionGroup_field";
	}
	 private List<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean> _Possiblevalues_possiblevalue =new ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean>();

	/**
	 * possibleValues/possibleValue
	 * @return Returns an List of org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI> List<A> getPossiblevalues_possiblevalue() {
		return (List<A>) _Possiblevalues_possiblevalue;
	}

	/**
	 * Sets the value for possibleValues/possibleValue.
	 * @param v Value to Set.
	 */
	public void setPossiblevalues_possiblevalue(ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean> v){
		_Possiblevalues_possiblevalue=v;
	}

	/**
	 * Adds the value for possibleValues/possibleValue.
	 * @param v Value to Set.
	 */
	public void addPossiblevalues_possiblevalue(org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean v){
		_Possiblevalues_possiblevalue.add(v);
	}

	/**
	 * possibleValues/possibleValue
	 * Adds org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI> void addPossiblevalues_possiblevalue(A item) throws Exception{
	_Possiblevalues_possiblevalue.add((org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean)item);
	}

	/**
	 * Adds the value for possibleValues/possibleValue.
	 * @param v Value to Set.
	 */
	public void addPossiblevalues_possiblevalue(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean)
			_Possiblevalues_possiblevalue.add((org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean");
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

	private String _Datatype=null;

	/**
	 * @return Returns the datatype.
	 */
	public String getDatatype(){
		return _Datatype;
	}

	/**
	 * Sets the value for datatype.
	 * @param v Value to Set.
	 */
	public void setDatatype(String v){
		_Datatype=v;
	}

	//FIELD

	private Boolean _Required=null;

	/**
	 * @return Returns the required.
	 */
	public Boolean getRequired() {
		return _Required;
	}

	/**
	 * Sets the value for required.
	 * @param v Value to Set.
	 */
	public void setRequired(Object v){
		if(v instanceof Boolean){
			_Required=(Boolean)v;
		}else if(v instanceof String){
			_Required=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _Sequence=null;

	/**
	 * @return Returns the sequence.
	 */
	public Integer getSequence(){
		return _Sequence;
	}

	/**
	 * Sets the value for xnat:fieldDefinitionGroup_field/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(Integer v) {
		_Sequence=v;
	}

	/**
	 * Sets the value for xnat:fieldDefinitionGroup_field/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(String v)  {
		_Sequence=formatInteger(v);
	}

	//FIELD

	private String _Xmlpath=null;

	/**
	 * @return Returns the xmlPath.
	 */
	public String getXmlpath(){
		return _Xmlpath;
	}

	/**
	 * Sets the value for xmlPath.
	 * @param v Value to Set.
	 */
	public void setXmlpath(String v){
		_Xmlpath=v;
	}

	//FIELD

	private String _Group=null;

	/**
	 * @return Returns the group.
	 */
	public String getGroup(){
		return _Group;
	}

	/**
	 * Sets the value for group.
	 * @param v Value to Set.
	 */
	public void setGroup(String v){
		_Group=v;
	}

	//FIELD

	private Integer _XnatFielddefinitiongroupFieldId=null;

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_field_id.
	 */
	public Integer getXnatFielddefinitiongroupFieldId() {
		return _XnatFielddefinitiongroupFieldId;
	}

	/**
	 * Sets the value for xnat_fieldDefinitionGroup_field_id.
	 * @param v Value to Set.
	 */
	public void setXnatFielddefinitiongroupFieldId(Integer v){
		_XnatFielddefinitiongroupFieldId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("type")){
			setType(v);
		}else if (xmlPath.equals("datatype")){
			setDatatype(v);
		}else if (xmlPath.equals("required")){
			setRequired(v);
		}else if (xmlPath.equals("sequence")){
			setSequence(v);
		}else if (xmlPath.equals("xmlPath")){
			setXmlpath(v);
		}else if (xmlPath.equals("group")){
			setGroup(v);
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
		if (xmlPath.equals("possibleValues/possibleValue")){
			addPossiblevalues_possiblevalue(v);
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
		if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("datatype")){
			return getDatatype();
		}else if (xmlPath.equals("required")){
			return getRequired();
		}else if (xmlPath.equals("sequence")){
			return getSequence();
		}else if (xmlPath.equals("xmlPath")){
			return getXmlpath();
		}else if (xmlPath.equals("group")){
			return getGroup();
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
		if (xmlPath.equals("possibleValues/possibleValue")){
			return getPossiblevalues_possiblevalue();
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
		if (xmlPath.equals("possibleValues/possibleValue")){
			return "http://nrg.wustl.edu/xnat:fieldDefinitionGroup_field_possibleValue";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("possibleValues/possibleValue")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("datatype")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("required")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("sequence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("xmlPath")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("group")){
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
		all_fields.add("possibleValues/possibleValue");
		all_fields.add("name");
		all_fields.add("type");
		all_fields.add("datatype");
		all_fields.add("required");
		all_fields.add("sequence");
		all_fields.add("xmlPath");
		all_fields.add("group");
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
		writer.write("\n<xnat:fieldDefinitionGroup_field");
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
		writer.write("\n</xnat:fieldDefinitionGroup_field>");
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

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		if (_Datatype!=null)
			map.put("datatype",ValueParser(_Datatype,"string"));
		//NOT REQUIRED FIELD

		if (_Required!=null)
			map.put("required",ValueParser(_Required,"boolean"));
		//NOT REQUIRED FIELD

		if (_Sequence!=null)
			map.put("sequence",ValueParser(_Sequence,"integer"));
		//NOT REQUIRED FIELD

		if (_Xmlpath!=null)
			map.put("xmlPath",ValueParser(_Xmlpath,"string"));
		//NOT REQUIRED FIELD

		if (_Group!=null)
			map.put("group",ValueParser(_Group,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Possiblevalues_possiblevalue.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:possibleValues");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM fieldDefinitionGroup_field -> possibleValues/possibleValue
		java.util.Iterator iter1=_Possiblevalues_possiblevalue.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean child = (org.nrg.xdat.bean.XnatFielddefinitiongroupFieldPossiblevalueBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:possibleValue");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:fieldDefinitionGroup_field_possibleValue")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:possibleValue>");
				}else{
					writer.write("</xnat:possibleValue>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:possibleValues>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Possiblevalues_possiblevalue.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
