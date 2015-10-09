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
public class PipePipelinedetailsBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.PipePipelinedetailsI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PipePipelinedetailsBean.class);
	public static String SCHEMA_ELEMENT_NAME="pipe:pipelineDetails";

	public String getSchemaElementName(){
		return "pipelineDetails";
	}

	public String getFullSchemaElementName(){
		return "pipe:pipelineDetails";
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
	 private List<org.nrg.xdat.bean.PipePipelinedetailsElementBean> _Generateselements_element =new ArrayList<org.nrg.xdat.bean.PipePipelinedetailsElementBean>();

	/**
	 * generatesElements/element
	 * @return Returns an List of org.nrg.xdat.bean.PipePipelinedetailsElementBean
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsElementI> List<A> getGenerateselements_element() {
		return (List<A>) _Generateselements_element;
	}

	/**
	 * Sets the value for generatesElements/element.
	 * @param v Value to Set.
	 */
	public void setGenerateselements_element(ArrayList<org.nrg.xdat.bean.PipePipelinedetailsElementBean> v){
		_Generateselements_element=v;
	}

	/**
	 * Adds the value for generatesElements/element.
	 * @param v Value to Set.
	 */
	public void addGenerateselements_element(org.nrg.xdat.bean.PipePipelinedetailsElementBean v){
		_Generateselements_element.add(v);
	}

	/**
	 * generatesElements/element
	 * Adds org.nrg.xdat.model.PipePipelinedetailsElementI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsElementI> void addGenerateselements_element(A item) throws Exception{
	_Generateselements_element.add((org.nrg.xdat.bean.PipePipelinedetailsElementBean)item);
	}

	/**
	 * Adds the value for generatesElements/element.
	 * @param v Value to Set.
	 */
	public void addGenerateselements_element(Object v){
		if (v instanceof org.nrg.xdat.bean.PipePipelinedetailsElementBean)
			_Generateselements_element.add((org.nrg.xdat.bean.PipePipelinedetailsElementBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.PipePipelinedetailsElementBean");
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
	 private List<org.nrg.xdat.bean.PipePipelinedetailsParameterBean> _Parameters_parameter =new ArrayList<org.nrg.xdat.bean.PipePipelinedetailsParameterBean>();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.bean.PipePipelinedetailsParameterBean
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsParameterI> List<A> getParameters_parameter() {
		return (List<A>) _Parameters_parameter;
	}

	/**
	 * Sets the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void setParameters_parameter(ArrayList<org.nrg.xdat.bean.PipePipelinedetailsParameterBean> v){
		_Parameters_parameter=v;
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(org.nrg.xdat.bean.PipePipelinedetailsParameterBean v){
		_Parameters_parameter.add(v);
	}

	/**
	 * parameters/parameter
	 * Adds org.nrg.xdat.model.PipePipelinedetailsParameterI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsParameterI> void addParameters_parameter(A item) throws Exception{
	_Parameters_parameter.add((org.nrg.xdat.bean.PipePipelinedetailsParameterBean)item);
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(Object v){
		if (v instanceof org.nrg.xdat.bean.PipePipelinedetailsParameterBean)
			_Parameters_parameter.add((org.nrg.xdat.bean.PipePipelinedetailsParameterBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.PipePipelinedetailsParameterBean");
	}

	//FIELD

	private String _Appliesto=null;

	/**
	 * @return Returns the appliesTo.
	 */
	public String getAppliesto(){
		return _Appliesto;
	}

	/**
	 * Sets the value for appliesTo.
	 * @param v Value to Set.
	 */
	public void setAppliesto(String v){
		_Appliesto=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("path")){
			setPath(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("customwebpage")){
			setCustomwebpage(v);
		}else if (xmlPath.equals("appliesTo")){
			setAppliesto(v);
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
		if (xmlPath.equals("generatesElements/element")){
			addGenerateselements_element(v);
		}else if (xmlPath.equals("parameters/parameter")){
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
		if (xmlPath.equals("path")){
			return getPath();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("customwebpage")){
			return getCustomwebpage();
		}else if (xmlPath.equals("appliesTo")){
			return getAppliesto();
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
		if (xmlPath.equals("generatesElements/element")){
			return getGenerateselements_element();
		}else if (xmlPath.equals("parameters/parameter")){
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
		if (xmlPath.equals("generatesElements/element")){
			return "http://nrg.wustl.edu/pipe:pipelineDetails_element";
		}else if (xmlPath.equals("parameters/parameter")){
			return "http://nrg.wustl.edu/pipe:pipelineDetails_parameter";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("path")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("generatesElements/element")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("customwebpage")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/parameter")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("appliesTo")){
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
		all_fields.add("description");
		all_fields.add("generatesElements/element");
		all_fields.add("customwebpage");
		all_fields.add("parameters/parameter");
		all_fields.add("appliesTo");
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
		writer.write("\n<pipe:pipelineDetails");
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
		writer.write("\n</pipe:pipelineDetails>");
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
		if (_Appliesto!=null)
			map.put("appliesTo",ValueParser(_Appliesto,"string"));
		else map.put("appliesTo","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Path!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:path");
			writer.write(">");
			writer.write(ValueParser(_Path,"string"));
			writer.write("</pipe:path>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<pipe:path");
			writer.write("/>");
			header--;
		}

		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</pipe:description>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Generateselements_element.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<pipe:generatesElements");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM pipelineDetails -> generatesElements/element
		//IN-LINE REPEATER
		java.util.Iterator iter1=_Generateselements_element.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.PipePipelinedetailsElementBean child = (org.nrg.xdat.bean.PipePipelinedetailsElementBean)iter1.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</pipe:generatesElements>");
			}
			}

		if (_Customwebpage!=null){
			writer.write("\n" + createHeader(header++) + "<pipe:customwebpage");
			writer.write(">");
			writer.write(ValueParser(_Customwebpage,"string"));
			writer.write("</pipe:customwebpage>");
			header--;
		}
			int child2=0;
			int att2=0;
			child2+=_Parameters_parameter.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<pipe:parameters");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM pipelineDetails -> parameters/parameter
		java.util.Iterator iter3=_Parameters_parameter.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.PipePipelinedetailsParameterBean child = (org.nrg.xdat.bean.PipePipelinedetailsParameterBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<pipe:parameter");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("pipe:pipelineDetails_parameter")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</pipe:parameter>");
				}else{
					writer.write("</pipe:parameter>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</pipe:parameters>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Path!=null) return true;
		return true;//REQUIRED path
	}
}
