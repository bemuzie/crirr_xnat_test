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
public class ArcPipelinedataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcPipelinedataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcPipelinedataBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:pipelineData";

	public String getSchemaElementName(){
		return "pipelineData";
	}

	public String getFullSchemaElementName(){
		return "arc:pipelineData";
	}

	//FIELD

	private String _Displaytext=null;

	/**
	 * @return Returns the displayText.
	 */
	public String getDisplaytext(){
		return _Displaytext;
	}

	/**
	 * Sets the value for displayText.
	 * @param v Value to Set.
	 */
	public void setDisplaytext(String v){
		_Displaytext=v;
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

	private String _Location=null;

	/**
	 * @return Returns the location.
	 */
	public String getLocation(){
		return _Location;
	}

	/**
	 * Sets the value for location.
	 * @param v Value to Set.
	 */
	public void setLocation(String v){
		_Location=v;
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
	 private List<org.nrg.xdat.bean.ArcPipelineparameterdataBean> _Parameters_parameter =new ArrayList<org.nrg.xdat.bean.ArcPipelineparameterdataBean>();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.bean.ArcPipelineparameterdataBean
	 */
	public <A extends org.nrg.xdat.model.ArcPipelineparameterdataI> List<A> getParameters_parameter() {
		return (List<A>) _Parameters_parameter;
	}

	/**
	 * Sets the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void setParameters_parameter(ArrayList<org.nrg.xdat.bean.ArcPipelineparameterdataBean> v){
		_Parameters_parameter=v;
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(org.nrg.xdat.bean.ArcPipelineparameterdataBean v){
		_Parameters_parameter.add(v);
	}

	/**
	 * parameters/parameter
	 * Adds org.nrg.xdat.model.ArcPipelineparameterdataI
	 */
	public <A extends org.nrg.xdat.model.ArcPipelineparameterdataI> void addParameters_parameter(A item) throws Exception{
	_Parameters_parameter.add((org.nrg.xdat.bean.ArcPipelineparameterdataBean)item);
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcPipelineparameterdataBean)
			_Parameters_parameter.add((org.nrg.xdat.bean.ArcPipelineparameterdataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcPipelineparameterdataBean");
	}

	//FIELD

	private String _Customwebpage=null;

	/**
	 * @return Returns the customwebpage.
	 */
	public String getCustomwebpage(){
		return _Customwebpage;
	}

	/**
	 * Sets the value for customwebpage.
	 * @param v Value to Set.
	 */
	public void setCustomwebpage(String v){
		_Customwebpage=v;
	}

	//FIELD

	private Integer _ArcPipelinedataId=null;

	/**
	 * @return Returns the arc_pipelineData_id.
	 */
	public Integer getArcPipelinedataId() {
		return _ArcPipelinedataId;
	}

	/**
	 * Sets the value for arc_pipelineData_id.
	 * @param v Value to Set.
	 */
	public void setArcPipelinedataId(Integer v){
		_ArcPipelinedataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("displayText")){
			setDisplaytext(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("location")){
			setLocation(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("customwebpage")){
			setCustomwebpage(v);
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
		if (xmlPath.equals("parameters/parameter")){
			addParameters_parameter(v);
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
		if (xmlPath.equals("displayText")){
			return getDisplaytext();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("location")){
			return getLocation();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("customwebpage")){
			return getCustomwebpage();
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
		if (xmlPath.equals("parameters/parameter")){
			return getParameters_parameter();
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
		if (xmlPath.equals("parameters/parameter")){
			return "http://nrg.wustl.edu/arc:pipelineParameterData";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("displayText")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("location")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/parameter")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("customwebpage")){
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
		all_fields.add("displayText");
		all_fields.add("name");
		all_fields.add("location");
		all_fields.add("description");
		all_fields.add("parameters/parameter");
		all_fields.add("customwebpage");
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
		writer.write("\n<arc:pipelineData");
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
		writer.write("\n</arc:pipelineData>");
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
		if (_Displaytext!=null){
			writer.write("\n" + createHeader(header++) + "<arc:displayText");
			writer.write(">");
			writer.write(ValueParser(_Displaytext,"string"));
			writer.write("</arc:displayText>");
			header--;
		}
		if (_Name!=null){
			writer.write("\n" + createHeader(header++) + "<arc:name");
			writer.write(">");
			writer.write(ValueParser(_Name,"string"));
			writer.write("</arc:name>");
			header--;
		}
		if (_Location!=null){
			writer.write("\n" + createHeader(header++) + "<arc:location");
			writer.write(">");
			writer.write(ValueParser(_Location,"string"));
			writer.write("</arc:location>");
			header--;
		}
		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<arc:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</arc:description>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Parameters_parameter.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<arc:parameters");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM pipelineData -> parameters/parameter
		java.util.Iterator iter1=_Parameters_parameter.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.ArcPipelineparameterdataBean child = (org.nrg.xdat.bean.ArcPipelineparameterdataBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<arc:parameter");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:pipelineParameterData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</arc:parameter>");
				}else{
					writer.write("</arc:parameter>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:parameters>");
			}
			}

		if (_Customwebpage!=null){
			writer.write("\n" + createHeader(header++) + "<arc:customwebpage");
			writer.write(">");
			writer.write(ValueParser(_Customwebpage,"string"));
			writer.write("</arc:customwebpage>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Displaytext!=null) return true;
		if (_Name!=null) return true;
		if (_Location!=null) return true;
		if (_Description!=null) return true;
			if(_Parameters_parameter.size()>0)return true;
		if (_Customwebpage!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
