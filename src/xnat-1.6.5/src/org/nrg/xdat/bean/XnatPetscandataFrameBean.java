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
public class XnatPetscandataFrameBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatPetscandataFrameI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPetscandataFrameBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:petScanData_frame";

	public String getSchemaElementName(){
		return "petScanData_frame";
	}

	public String getFullSchemaElementName(){
		return "xnat:petScanData_frame";
	}

	//FIELD

	private Object _Number=null;

	/**
	 * @return Returns the number.
	 */
	public Object getNumber(){
		return _Number;
	}

	/**
	 * Sets the value for number.
	 * @param v Value to Set.
	 */
	public void setNumber(Object v){
		_Number=v;
	}

	//FIELD

	private Double _Starttime=null;

	/**
	 * @return Returns the starttime.
	 */
	public Double getStarttime() {
		return _Starttime;
	}

	/**
	 * Sets the value for starttime.
	 * @param v Value to Set.
	 */
	public void setStarttime(Double v){
		_Starttime=v;
	}

	/**
	 * Sets the value for starttime.
	 * @param v Value to Set.
	 */
	public void setStarttime(String v)  {
		_Starttime=formatDouble(v);
	}

	//FIELD

	private Double _Length=null;

	/**
	 * @return Returns the length.
	 */
	public Double getLength() {
		return _Length;
	}

	/**
	 * Sets the value for length.
	 * @param v Value to Set.
	 */
	public void setLength(Double v){
		_Length=v;
	}

	/**
	 * Sets the value for length.
	 * @param v Value to Set.
	 */
	public void setLength(String v)  {
		_Length=formatDouble(v);
	}

	//FIELD

	private String _Units=null;

	/**
	 * @return Returns the units.
	 */
	public String getUnits(){
		return _Units;
	}

	/**
	 * Sets the value for units.
	 * @param v Value to Set.
	 */
	public void setUnits(String v){
		_Units=v;
	}

	//FIELD

	private Integer _XnatPetscandataFrameId=null;

	/**
	 * @return Returns the xnat_petScanData_frame_id.
	 */
	public Integer getXnatPetscandataFrameId() {
		return _XnatPetscandataFrameId;
	}

	/**
	 * Sets the value for xnat_petScanData_frame_id.
	 * @param v Value to Set.
	 */
	public void setXnatPetscandataFrameId(Integer v){
		_XnatPetscandataFrameId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("number")){
			setNumber(v);
		}else if (xmlPath.equals("starttime")){
			setStarttime(v);
		}else if (xmlPath.equals("length")){
			setLength(v);
		}else if (xmlPath.equals("units")){
			setUnits(v);
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
		if (xmlPath.equals("number")){
			return getNumber();
		}else if (xmlPath.equals("starttime")){
			return getStarttime();
		}else if (xmlPath.equals("length")){
			return getLength();
		}else if (xmlPath.equals("units")){
			return getUnits();
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
		if (xmlPath.equals("number")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("starttime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("length")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("units")){
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
		all_fields.add("number");
		all_fields.add("starttime");
		all_fields.add("length");
		all_fields.add("units");
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
		writer.write("\n<xnat:petScanData_frame");
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
		writer.write("\n</xnat:petScanData_frame>");
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
		if (_Number!=null)
			map.put("number",ValueParser(_Number,"int"));
		else map.put("number","");//REQUIRED FIELD

		if (_Starttime!=null)
			map.put("starttime",ValueParser(_Starttime,"float"));
		else map.put("starttime","");//REQUIRED FIELD

		if (_Length!=null)
			map.put("length",ValueParser(_Length,"float"));
		else map.put("length","");//REQUIRED FIELD

		if (_Units!=null)
			map.put("units",ValueParser(_Units,"string"));
		else map.put("units","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
