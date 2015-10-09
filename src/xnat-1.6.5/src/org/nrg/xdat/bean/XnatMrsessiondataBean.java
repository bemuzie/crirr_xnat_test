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
public class XnatMrsessiondataBean extends XnatImagesessiondataBean implements java.io.Serializable, org.nrg.xdat.model.XnatMrsessiondataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatMrsessiondataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:mrSessionData";

	public String getSchemaElementName(){
		return "mrSessionData";
	}

	public String getFullSchemaElementName(){
		return "xnat:mrSessionData";
	}

	//FIELD

	private String _Coil=null;

	/**
	 * @return Returns the coil.
	 */
	public String getCoil(){
		return _Coil;
	}

	/**
	 * Sets the value for coil.
	 * @param v Value to Set.
	 */
	public void setCoil(String v){
		_Coil=v;
	}

	//FIELD

	private String _Fieldstrength=null;

	/**
	 * @return Returns the fieldStrength.
	 */
	public String getFieldstrength(){
		return _Fieldstrength;
	}

	/**
	 * Sets the value for fieldStrength.
	 * @param v Value to Set.
	 */
	public void setFieldstrength(String v){
		_Fieldstrength=v;
	}

	//FIELD

	private String _Marker=null;

	/**
	 * @return Returns the marker.
	 */
	public String getMarker(){
		return _Marker;
	}

	/**
	 * Sets the value for marker.
	 * @param v Value to Set.
	 */
	public void setMarker(String v){
		_Marker=v;
	}

	//FIELD

	private String _Stabilization=null;

	/**
	 * @return Returns the stabilization.
	 */
	public String getStabilization(){
		return _Stabilization;
	}

	/**
	 * Sets the value for stabilization.
	 * @param v Value to Set.
	 */
	public void setStabilization(String v){
		_Stabilization=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("coil")){
			setCoil(v);
		}else if (xmlPath.equals("fieldStrength")){
			setFieldstrength(v);
		}else if (xmlPath.equals("marker")){
			setMarker(v);
		}else if (xmlPath.equals("stabilization")){
			setStabilization(v);
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
		if (xmlPath.equals("coil")){
			return getCoil();
		}else if (xmlPath.equals("fieldStrength")){
			return getFieldstrength();
		}else if (xmlPath.equals("marker")){
			return getMarker();
		}else if (xmlPath.equals("stabilization")){
			return getStabilization();
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
		if (xmlPath.equals("coil")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fieldStrength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("marker")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("stabilization")){
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
		all_fields.add("coil");
		all_fields.add("fieldStrength");
		all_fields.add("marker");
		all_fields.add("stabilization");
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
		writer.write("\n<xnat:MRSession");
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
		writer.write("\n</xnat:MRSession>");
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
		//REFERENCE FROM mrSessionData -> imageSessionData
		if (_Coil!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:coil");
			writer.write(">");
			writer.write(ValueParser(_Coil,"string"));
			writer.write("</xnat:coil>");
			header--;
		}
		if (_Fieldstrength!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:fieldStrength");
			writer.write(">");
			writer.write(ValueParser(_Fieldstrength,"string"));
			writer.write("</xnat:fieldStrength>");
			header--;
		}
		if (_Marker!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:marker");
			writer.write(">");
			writer.write(ValueParser(_Marker,"string"));
			writer.write("</xnat:marker>");
			header--;
		}
		if (_Stabilization!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:stabilization");
			writer.write(">");
			writer.write(ValueParser(_Stabilization,"string"));
			writer.write("</xnat:stabilization>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Coil!=null) return true;
		if (_Fieldstrength!=null) return true;
		if (_Marker!=null) return true;
		if (_Stabilization!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
