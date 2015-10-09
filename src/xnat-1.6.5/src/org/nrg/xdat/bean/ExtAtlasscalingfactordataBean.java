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
public class ExtAtlasscalingfactordataBean extends XnatMrassessordataBean implements java.io.Serializable, org.nrg.xdat.model.ExtAtlasscalingfactordataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ExtAtlasscalingfactordataBean.class);
	public static String SCHEMA_ELEMENT_NAME="ext:atlasScalingFactorData";

	public String getSchemaElementName(){
		return "atlasScalingFactorData";
	}

	public String getFullSchemaElementName(){
		return "ext:atlasScalingFactorData";
	}

	//FIELD

	private Double _Scalingfactor=null;

	/**
	 * @return Returns the scalingFactor.
	 */
	public Double getScalingfactor() {
		return _Scalingfactor;
	}

	/**
	 * Sets the value for scalingFactor.
	 * @param v Value to Set.
	 */
	public void setScalingfactor(Double v){
		_Scalingfactor=v;
	}

	/**
	 * Sets the value for scalingFactor.
	 * @param v Value to Set.
	 */
	public void setScalingfactor(String v)  {
		_Scalingfactor=formatDouble(v);
	}

	//FIELD

	private Double _Eta=null;

	/**
	 * @return Returns the eta.
	 */
	public Double getEta() {
		return _Eta;
	}

	/**
	 * Sets the value for eta.
	 * @param v Value to Set.
	 */
	public void setEta(Double v){
		_Eta=v;
	}

	/**
	 * Sets the value for eta.
	 * @param v Value to Set.
	 */
	public void setEta(String v)  {
		_Eta=formatDouble(v);
	}

	//FIELD

	private Double _Eicv=null;

	/**
	 * @return Returns the eICV.
	 */
	public Double getEicv() {
		return _Eicv;
	}

	/**
	 * Sets the value for eICV.
	 * @param v Value to Set.
	 */
	public void setEicv(Double v){
		_Eicv=v;
	}

	/**
	 * Sets the value for eICV.
	 * @param v Value to Set.
	 */
	public void setEicv(String v)  {
		_Eicv=formatDouble(v);
	}

	//FIELD

	private String _Basescannumber=null;

	/**
	 * @return Returns the baseScanNumber.
	 */
	public String getBasescannumber(){
		return _Basescannumber;
	}

	/**
	 * Sets the value for baseScanNumber.
	 * @param v Value to Set.
	 */
	public void setBasescannumber(String v){
		_Basescannumber=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("scalingFactor")){
			setScalingfactor(v);
		}else if (xmlPath.equals("eta")){
			setEta(v);
		}else if (xmlPath.equals("eICV")){
			setEicv(v);
		}else if (xmlPath.equals("baseScanNumber")){
			setBasescannumber(v);
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
		if (xmlPath.equals("scalingFactor")){
			return getScalingfactor();
		}else if (xmlPath.equals("eta")){
			return getEta();
		}else if (xmlPath.equals("eICV")){
			return getEicv();
		}else if (xmlPath.equals("baseScanNumber")){
			return getBasescannumber();
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
		if (xmlPath.equals("scalingFactor")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eta")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eICV")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("baseScanNumber")){
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
		all_fields.add("scalingFactor");
		all_fields.add("eta");
		all_fields.add("eICV");
		all_fields.add("baseScanNumber");
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
		writer.write("\n<ext:AtlasScalingFactor");
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
		writer.write("\n</ext:AtlasScalingFactor>");
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
		//REFERENCE FROM atlasScalingFactorData -> mrAssessorData
		if (_Scalingfactor!=null){
			writer.write("\n" + createHeader(header++) + "<ext:scalingFactor");
			writer.write(">");
			writer.write(ValueParser(_Scalingfactor,"float"));
			writer.write("</ext:scalingFactor>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<ext:scalingFactor");
			writer.write("/>");
			header--;
		}

		if (_Eta!=null){
			writer.write("\n" + createHeader(header++) + "<ext:eta");
			writer.write(">");
			writer.write(ValueParser(_Eta,"float"));
			writer.write("</ext:eta>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<ext:eta");
			writer.write("/>");
			header--;
		}

		if (_Eicv!=null){
			writer.write("\n" + createHeader(header++) + "<ext:eICV");
			writer.write(">");
			writer.write(ValueParser(_Eicv,"float"));
			writer.write("</ext:eICV>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<ext:eICV");
			writer.write("/>");
			header--;
		}

		if (_Basescannumber!=null){
			writer.write("\n" + createHeader(header++) + "<ext:baseScanNumber");
			writer.write(">");
			writer.write(ValueParser(_Basescannumber,"string"));
			writer.write("</ext:baseScanNumber>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Scalingfactor!=null) return true;
		return true;//REQUIRED scalingFactor
	}
}
