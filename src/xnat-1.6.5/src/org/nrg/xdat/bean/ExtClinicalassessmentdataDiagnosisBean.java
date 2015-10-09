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
public class ExtClinicalassessmentdataDiagnosisBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ExtClinicalassessmentdataDiagnosisBean.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData_Diagnosis";

	public String getSchemaElementName(){
		return "clinicalAssessmentData_Diagnosis";
	}

	public String getFullSchemaElementName(){
		return "ext:clinicalAssessmentData_Diagnosis";
	}

	//FIELD

	private String _Diagnosis=null;

	/**
	 * @return Returns the Diagnosis.
	 */
	public String getDiagnosis(){
		return _Diagnosis;
	}

	/**
	 * Sets the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v){
		_Diagnosis=v;
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

	private Integer _Number=null;

	/**
	 * @return Returns the number.
	 */
	public Integer getNumber(){
		return _Number;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData_Diagnosis/number.
	 * @param v Value to Set.
	 */
	public void setNumber(Integer v) {
		_Number=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData_Diagnosis/number.
	 * @param v Value to Set.
	 */
	public void setNumber(String v)  {
		_Number=formatInteger(v);
	}

	//FIELD

	private Integer _ExtClinicalassessmentdataDiagnosisId=null;

	/**
	 * @return Returns the ext_clinicalAssessmentData_Diagnosis_id.
	 */
	public Integer getExtClinicalassessmentdataDiagnosisId() {
		return _ExtClinicalassessmentdataDiagnosisId;
	}

	/**
	 * Sets the value for ext_clinicalAssessmentData_Diagnosis_id.
	 * @param v Value to Set.
	 */
	public void setExtClinicalassessmentdataDiagnosisId(Integer v){
		_ExtClinicalassessmentdataDiagnosisId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("Diagnosis")){
			setDiagnosis(v);
		}else if (xmlPath.equals("type")){
			setType(v);
		}else if (xmlPath.equals("number")){
			setNumber(v);
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
		if (xmlPath.equals("Diagnosis")){
			return getDiagnosis();
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("number")){
			return getNumber();
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
		if (xmlPath.equals("Diagnosis")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("number")){
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
		all_fields.add("Diagnosis");
		all_fields.add("type");
		all_fields.add("number");
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
		writer.write("\n<ext:clinicalAssessmentData_Diagnosis");
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
		writer.write("\n</ext:clinicalAssessmentData_Diagnosis>");
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
		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		else map.put("type","");//REQUIRED FIELD

		if (_Number!=null)
			map.put("number",ValueParser(_Number,"integer"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Diagnosis!=null){
			writer.write(ValueParser(_Diagnosis,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Diagnosis!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
