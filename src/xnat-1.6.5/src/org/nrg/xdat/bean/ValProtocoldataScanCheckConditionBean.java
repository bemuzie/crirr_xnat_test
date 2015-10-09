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
public class ValProtocoldataScanCheckConditionBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ValProtocoldataScanCheckConditionI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ValProtocoldataScanCheckConditionBean.class);
	public static String SCHEMA_ELEMENT_NAME="val:protocolData_scan_check_condition";

	public String getSchemaElementName(){
		return "protocolData_scan_check_condition";
	}

	public String getFullSchemaElementName(){
		return "val:protocolData_scan_check_condition";
	}

	//FIELD

	private String _Verified=null;

	/**
	 * @return Returns the verified.
	 */
	public String getVerified(){
		return _Verified;
	}

	/**
	 * Sets the value for verified.
	 * @param v Value to Set.
	 */
	public void setVerified(String v){
		_Verified=v;
	}

	//FIELD

	private String _Diagnosis=null;

	/**
	 * @return Returns the diagnosis.
	 */
	public String getDiagnosis(){
		return _Diagnosis;
	}

	/**
	 * Sets the value for diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v){
		_Diagnosis=v;
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the ID.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private String _Status=null;

	/**
	 * @return Returns the status.
	 */
	public String getStatus(){
		return _Status;
	}

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v){
		_Status=v;
	}

	//FIELD

	private String _Xmlpath=null;

	/**
	 * @return Returns the xmlpath.
	 */
	public String getXmlpath(){
		return _Xmlpath;
	}

	/**
	 * Sets the value for xmlpath.
	 * @param v Value to Set.
	 */
	public void setXmlpath(String v){
		_Xmlpath=v;
	}

	//FIELD

	private Integer _ValProtocoldataScanCheckConditionId=null;

	/**
	 * @return Returns the val_protocolData_scan_check_condition_id.
	 */
	public Integer getValProtocoldataScanCheckConditionId() {
		return _ValProtocoldataScanCheckConditionId;
	}

	/**
	 * Sets the value for val_protocolData_scan_check_condition_id.
	 * @param v Value to Set.
	 */
	public void setValProtocoldataScanCheckConditionId(Integer v){
		_ValProtocoldataScanCheckConditionId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("verified")){
			setVerified(v);
		}else if (xmlPath.equals("diagnosis")){
			setDiagnosis(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("status")){
			setStatus(v);
		}else if (xmlPath.equals("xmlpath")){
			setXmlpath(v);
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
		if (xmlPath.equals("verified")){
			return getVerified();
		}else if (xmlPath.equals("diagnosis")){
			return getDiagnosis();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("status")){
			return getStatus();
		}else if (xmlPath.equals("xmlpath")){
			return getXmlpath();
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
		if (xmlPath.equals("verified")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("diagnosis")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("status")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("xmlpath")){
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
		all_fields.add("verified");
		all_fields.add("diagnosis");
		all_fields.add("ID");
		all_fields.add("status");
		all_fields.add("xmlpath");
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
		writer.write("\n<val:protocolData_scan_check_condition");
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
		writer.write("\n</val:protocolData_scan_check_condition>");
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
		if (_Id!=null)
			map.put("ID",ValueParser(_Id,"string"));
		//NOT REQUIRED FIELD

		if (_Status!=null)
			map.put("status",ValueParser(_Status,"string"));
		//NOT REQUIRED FIELD

		if (_Xmlpath!=null)
			map.put("xmlpath",ValueParser(_Xmlpath,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Verified!=null){
			writer.write("\n" + createHeader(header++) + "<val:verified");
			writer.write(">");
			writer.write(ValueParser(_Verified,"string"));
			writer.write("</val:verified>");
			header--;
		}
		if (_Diagnosis!=null){
			writer.write("\n" + createHeader(header++) + "<val:diagnosis");
			writer.write(">");
			writer.write(ValueParser(_Diagnosis,"string"));
			writer.write("</val:diagnosis>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Verified!=null) return true;
		if (_Diagnosis!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
