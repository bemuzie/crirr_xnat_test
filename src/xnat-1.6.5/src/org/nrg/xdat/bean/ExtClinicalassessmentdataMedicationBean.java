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
public class ExtClinicalassessmentdataMedicationBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ExtClinicalassessmentdataMedicationBean.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData_Medication";

	public String getSchemaElementName(){
		return "clinicalAssessmentData_Medication";
	}

	public String getFullSchemaElementName(){
		return "ext:clinicalAssessmentData_Medication";
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

	private String _Dose=null;

	/**
	 * @return Returns the dose.
	 */
	public String getDose(){
		return _Dose;
	}

	/**
	 * Sets the value for dose.
	 * @param v Value to Set.
	 */
	public void setDose(String v){
		_Dose=v;
	}

	//FIELD

	private String _History=null;

	/**
	 * @return Returns the history.
	 */
	public String getHistory(){
		return _History;
	}

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v){
		_History=v;
	}

	//FIELD

	private Integer _ExtClinicalassessmentdataMedicationId=null;

	/**
	 * @return Returns the ext_clinicalAssessmentData_Medication_id.
	 */
	public Integer getExtClinicalassessmentdataMedicationId() {
		return _ExtClinicalassessmentdataMedicationId;
	}

	/**
	 * Sets the value for ext_clinicalAssessmentData_Medication_id.
	 * @param v Value to Set.
	 */
	public void setExtClinicalassessmentdataMedicationId(Integer v){
		_ExtClinicalassessmentdataMedicationId=v;
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
		}else if (xmlPath.equals("dose")){
			setDose(v);
		}else if (xmlPath.equals("history")){
			setHistory(v);
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
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("dose")){
			return getDose();
		}else if (xmlPath.equals("history")){
			return getHistory();
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
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dose")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("history")){
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
		all_fields.add("name");
		all_fields.add("type");
		all_fields.add("dose");
		all_fields.add("history");
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
		writer.write("\n<ext:clinicalAssessmentData_Medication");
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
		writer.write("\n</ext:clinicalAssessmentData_Medication>");
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
		//NOT REQUIRED FIELD

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		if (_Dose!=null)
			map.put("dose",ValueParser(_Dose,"string"));
		//NOT REQUIRED FIELD

		if (_History!=null)
			map.put("history",ValueParser(_History,"string"));
		//NOT REQUIRED FIELD

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
