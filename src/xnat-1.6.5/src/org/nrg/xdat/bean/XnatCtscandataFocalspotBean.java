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
public class XnatCtscandataFocalspotBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatCtscandataFocalspotI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatCtscandataFocalspotBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:ctScanData_focalSpot";

	public String getSchemaElementName(){
		return "ctScanData_focalSpot";
	}

	public String getFullSchemaElementName(){
		return "xnat:ctScanData_focalSpot";
	}

	//FIELD

	private Double _Focalspot=null;

	/**
	 * @return Returns the focalSpot.
	 */
	public Double getFocalspot() {
		return _Focalspot;
	}

	/**
	 * Sets the value for focalSpot.
	 * @param v Value to Set.
	 */
	public void setFocalspot(Double v){
		_Focalspot=v;
	}

	/**
	 * Sets the value for focalSpot.
	 * @param v Value to Set.
	 */
	public void setFocalspot(String v)  {
		_Focalspot=formatDouble(v);
	}

	//FIELD

	private Integer _XnatCtscandataFocalspotId=null;

	/**
	 * @return Returns the xnat_ctScanData_focalSpot_id.
	 */
	public Integer getXnatCtscandataFocalspotId() {
		return _XnatCtscandataFocalspotId;
	}

	/**
	 * Sets the value for xnat_ctScanData_focalSpot_id.
	 * @param v Value to Set.
	 */
	public void setXnatCtscandataFocalspotId(Integer v){
		_XnatCtscandataFocalspotId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("focalSpot")){
			setFocalspot(v);
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
		if (xmlPath.equals("focalSpot")){
			return getFocalspot();
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
		if (xmlPath.equals("focalSpot")){
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
		all_fields.add("focalSpot");
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
		writer.write("\n<xnat:ctScanData_focalSpot");
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
		writer.write("\n</xnat:ctScanData_focalSpot>");
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
		if (_Focalspot!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:focalSpot");
			writer.write(">");
			writer.write(ValueParser(_Focalspot,"float"));
			writer.write("</xnat:focalSpot>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<xnat:focalSpot");
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Focalspot!=null) return true;
		return true;//REQUIRED focalSpot
	}
}
