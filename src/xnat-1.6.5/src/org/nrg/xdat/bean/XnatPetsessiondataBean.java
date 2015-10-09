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
public class XnatPetsessiondataBean extends XnatImagesessiondataBean implements java.io.Serializable, org.nrg.xdat.model.XnatPetsessiondataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPetsessiondataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:petSessionData";

	public String getSchemaElementName(){
		return "petSessionData";
	}

	public String getFullSchemaElementName(){
		return "xnat:petSessionData";
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

	//FIELD

	private String _Studytype=null;

	/**
	 * @return Returns the studyType.
	 */
	public String getStudytype(){
		return _Studytype;
	}

	/**
	 * Sets the value for studyType.
	 * @param v Value to Set.
	 */
	public void setStudytype(String v){
		_Studytype=v;
	}

	//FIELD

	private String _Patientid=null;

	/**
	 * @return Returns the patientID.
	 */
	public String getPatientid(){
		return _Patientid;
	}

	/**
	 * Sets the value for patientID.
	 * @param v Value to Set.
	 */
	public void setPatientid(String v){
		_Patientid=v;
	}

	//FIELD

	private String _Patientname=null;

	/**
	 * @return Returns the patientName.
	 */
	public String getPatientname(){
		return _Patientname;
	}

	/**
	 * Sets the value for patientName.
	 * @param v Value to Set.
	 */
	public void setPatientname(String v){
		_Patientname=v;
	}

	//FIELD

	private String _Tracer_dose_units=null;

	/**
	 * @return Returns the tracer/dose/units.
	 */
	public String getTracer_dose_units(){
		return _Tracer_dose_units;
	}

	/**
	 * Sets the value for tracer/dose/units.
	 * @param v Value to Set.
	 */
	public void setTracer_dose_units(String v){
		_Tracer_dose_units=v;
	}

	//FIELD

	private Double _Tracer_dose=null;

	/**
	 * @return Returns the tracer/dose.
	 */
	public Double getTracer_dose() {
		return _Tracer_dose;
	}

	/**
	 * Sets the value for tracer/dose.
	 * @param v Value to Set.
	 */
	public void setTracer_dose(Double v){
		_Tracer_dose=v;
	}

	/**
	 * Sets the value for tracer/dose.
	 * @param v Value to Set.
	 */
	public void setTracer_dose(String v)  {
		_Tracer_dose=formatDouble(v);
	}

	//FIELD

	private Double _Tracer_specificactivity=null;

	/**
	 * @return Returns the tracer/specificActivity.
	 */
	public Double getTracer_specificactivity() {
		return _Tracer_specificactivity;
	}

	/**
	 * Sets the value for tracer/specificActivity.
	 * @param v Value to Set.
	 */
	public void setTracer_specificactivity(Double v){
		_Tracer_specificactivity=v;
	}

	/**
	 * Sets the value for tracer/specificActivity.
	 * @param v Value to Set.
	 */
	public void setTracer_specificactivity(String v)  {
		_Tracer_specificactivity=formatDouble(v);
	}

	//FIELD

	private String _Tracer_totalmass_units=null;

	/**
	 * @return Returns the tracer/totalMass/units.
	 */
	public String getTracer_totalmass_units(){
		return _Tracer_totalmass_units;
	}

	/**
	 * Sets the value for tracer/totalMass/units.
	 * @param v Value to Set.
	 */
	public void setTracer_totalmass_units(String v){
		_Tracer_totalmass_units=v;
	}

	//FIELD

	private Double _Tracer_totalmass=null;

	/**
	 * @return Returns the tracer/totalMass.
	 */
	public Double getTracer_totalmass() {
		return _Tracer_totalmass;
	}

	/**
	 * Sets the value for tracer/totalMass.
	 * @param v Value to Set.
	 */
	public void setTracer_totalmass(Double v){
		_Tracer_totalmass=v;
	}

	/**
	 * Sets the value for tracer/totalMass.
	 * @param v Value to Set.
	 */
	public void setTracer_totalmass(String v)  {
		_Tracer_totalmass=formatDouble(v);
	}

	//FIELD

	private String _Tracer_intermediate_units=null;

	/**
	 * @return Returns the tracer/intermediate/units.
	 */
	public String getTracer_intermediate_units(){
		return _Tracer_intermediate_units;
	}

	/**
	 * Sets the value for tracer/intermediate/units.
	 * @param v Value to Set.
	 */
	public void setTracer_intermediate_units(String v){
		_Tracer_intermediate_units=v;
	}

	//FIELD

	private Double _Tracer_intermediate=null;

	/**
	 * @return Returns the tracer/intermediate.
	 */
	public Double getTracer_intermediate() {
		return _Tracer_intermediate;
	}

	/**
	 * Sets the value for tracer/intermediate.
	 * @param v Value to Set.
	 */
	public void setTracer_intermediate(Double v){
		_Tracer_intermediate=v;
	}

	/**
	 * Sets the value for tracer/intermediate.
	 * @param v Value to Set.
	 */
	public void setTracer_intermediate(String v)  {
		_Tracer_intermediate=formatDouble(v);
	}

	//FIELD

	private Double _Tracer_isotope_halfLife=null;

	/**
	 * @return Returns the tracer/isotope/half-life.
	 */
	public Double getTracer_isotope_halfLife() {
		return _Tracer_isotope_halfLife;
	}

	/**
	 * Sets the value for tracer/isotope/half-life.
	 * @param v Value to Set.
	 */
	public void setTracer_isotope_halfLife(Double v){
		_Tracer_isotope_halfLife=v;
	}

	/**
	 * Sets the value for tracer/isotope/half-life.
	 * @param v Value to Set.
	 */
	public void setTracer_isotope_halfLife(String v)  {
		_Tracer_isotope_halfLife=formatDouble(v);
	}

	//FIELD

	private String _Tracer_isotope=null;

	/**
	 * @return Returns the tracer/isotope.
	 */
	public String getTracer_isotope(){
		return _Tracer_isotope;
	}

	/**
	 * Sets the value for tracer/isotope.
	 * @param v Value to Set.
	 */
	public void setTracer_isotope(String v){
		_Tracer_isotope=v;
	}

	//FIELD

	private Integer _Tracer_transmissions=null;

	/**
	 * @return Returns the tracer/transmissions.
	 */
	public Integer getTracer_transmissions(){
		return _Tracer_transmissions;
	}

	/**
	 * Sets the value for xnat:petSessionData/tracer/transmissions.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissions(Integer v) {
		_Tracer_transmissions=v;
	}

	/**
	 * Sets the value for xnat:petSessionData/tracer/transmissions.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissions(String v)  {
		_Tracer_transmissions=formatInteger(v);
	}

	//FIELD

	private Date _Tracer_transmissionsStarttime=null;

	/**
	 * @return Returns the tracer/transmissions_starttime.
	 */
	public Date getTracer_transmissionsStarttime(){
		return _Tracer_transmissionsStarttime;
	}

	/**
	 * Sets the value for tracer/transmissions_starttime.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissionsStarttime(Date v){
		_Tracer_transmissionsStarttime=v;
	}

	/**
	 * Sets the value for tracer/transmissions_starttime.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissionsStarttime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for tracer/transmissions_starttime.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissionsStarttime(String v)  {
		_Tracer_transmissionsStarttime=formatDateTime(v);
	}

	//FIELD

	private String _Tracer_name=null;

	/**
	 * @return Returns the tracer/name.
	 */
	public String getTracer_name(){
		return _Tracer_name;
	}

	/**
	 * Sets the value for tracer/name.
	 * @param v Value to Set.
	 */
	public void setTracer_name(String v){
		_Tracer_name=v;
	}

	//FIELD

	private Date _Tracer_starttime=null;

	/**
	 * @return Returns the tracer/startTime.
	 */
	public Date getTracer_starttime(){
		return _Tracer_starttime;
	}

	/**
	 * Sets the value for tracer/startTime.
	 * @param v Value to Set.
	 */
	public void setTracer_starttime(Date v){
		_Tracer_starttime=v;
	}

	/**
	 * Sets the value for tracer/startTime.
	 * @param v Value to Set.
	 */
	public void setTracer_starttime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for tracer/startTime.
	 * @param v Value to Set.
	 */
	public void setTracer_starttime(String v)  {
		_Tracer_starttime=formatDateTime(v);
	}

	//FIELD

	private Date _StartTime=null;

	/**
	 * @return Returns the start_time.
	 */
	public Date getStartTime(){
		return _StartTime;
	}

	/**
	 * Sets the value for start_time.
	 * @param v Value to Set.
	 */
	public void setStartTime(Date v){
		_StartTime=v;
	}

	/**
	 * Sets the value for start_time.
	 * @param v Value to Set.
	 */
	public void setStartTime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for start_time.
	 * @param v Value to Set.
	 */
	public void setStartTime(String v)  {
		_StartTime=formatDateTime(v);
	}

	//FIELD

	private Date _StartTimeScan=null;

	/**
	 * @return Returns the start_time_scan.
	 */
	public Date getStartTimeScan(){
		return _StartTimeScan;
	}

	/**
	 * Sets the value for start_time_scan.
	 * @param v Value to Set.
	 */
	public void setStartTimeScan(Date v){
		_StartTimeScan=v;
	}

	/**
	 * Sets the value for start_time_scan.
	 * @param v Value to Set.
	 */
	public void setStartTimeScan(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for start_time_scan.
	 * @param v Value to Set.
	 */
	public void setStartTimeScan(String v)  {
		_StartTimeScan=formatDateTime(v);
	}

	//FIELD

	private Date _StartTimeInjection=null;

	/**
	 * @return Returns the start_time_injection.
	 */
	public Date getStartTimeInjection(){
		return _StartTimeInjection;
	}

	/**
	 * Sets the value for start_time_injection.
	 * @param v Value to Set.
	 */
	public void setStartTimeInjection(Date v){
		_StartTimeInjection=v;
	}

	/**
	 * Sets the value for start_time_injection.
	 * @param v Value to Set.
	 */
	public void setStartTimeInjection(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for start_time_injection.
	 * @param v Value to Set.
	 */
	public void setStartTimeInjection(String v)  {
		_StartTimeInjection=formatDateTime(v);
	}

	//FIELD

	private Double _BloodGlucose=null;

	/**
	 * @return Returns the blood_glucose.
	 */
	public Double getBloodGlucose() {
		return _BloodGlucose;
	}

	/**
	 * Sets the value for blood_glucose.
	 * @param v Value to Set.
	 */
	public void setBloodGlucose(Double v){
		_BloodGlucose=v;
	}

	/**
	 * Sets the value for blood_glucose.
	 * @param v Value to Set.
	 */
	public void setBloodGlucose(String v)  {
		_BloodGlucose=formatDouble(v);
	}

	//FIELD

	private String _BloodGlucoseUnits=null;

	/**
	 * @return Returns the blood_glucose_units.
	 */
	public String getBloodGlucoseUnits(){
		return _BloodGlucoseUnits;
	}

	/**
	 * Sets the value for blood_glucose_units.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseUnits(String v){
		_BloodGlucoseUnits=v;
	}

	//FIELD

	private Date _BloodGlucoseTime=null;

	/**
	 * @return Returns the blood_glucose_time.
	 */
	public Date getBloodGlucoseTime(){
		return _BloodGlucoseTime;
	}

	/**
	 * Sets the value for blood_glucose_time.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseTime(Date v){
		_BloodGlucoseTime=v;
	}

	/**
	 * Sets the value for blood_glucose_time.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseTime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for blood_glucose_time.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseTime(String v)  {
		_BloodGlucoseTime=formatDateTime(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("stabilization")){
			setStabilization(v);
		}else if (xmlPath.equals("studyType")){
			setStudytype(v);
		}else if (xmlPath.equals("patientID")){
			setPatientid(v);
		}else if (xmlPath.equals("patientName")){
			setPatientname(v);
		}else if (xmlPath.equals("tracer/dose/units")){
			setTracer_dose_units(v);
		}else if (xmlPath.equals("tracer/dose")){
			setTracer_dose(v);
		}else if (xmlPath.equals("tracer/specificActivity")){
			setTracer_specificactivity(v);
		}else if (xmlPath.equals("tracer/totalMass/units")){
			setTracer_totalmass_units(v);
		}else if (xmlPath.equals("tracer/totalMass")){
			setTracer_totalmass(v);
		}else if (xmlPath.equals("tracer/intermediate/units")){
			setTracer_intermediate_units(v);
		}else if (xmlPath.equals("tracer/intermediate")){
			setTracer_intermediate(v);
		}else if (xmlPath.equals("tracer/isotope/half-life")){
			setTracer_isotope_halfLife(v);
		}else if (xmlPath.equals("tracer/isotope")){
			setTracer_isotope(v);
		}else if (xmlPath.equals("tracer/transmissions")){
			setTracer_transmissions(v);
		}else if (xmlPath.equals("tracer/transmissions_starttime")){
			setTracer_transmissionsStarttime(v);
		}else if (xmlPath.equals("tracer/name")){
			setTracer_name(v);
		}else if (xmlPath.equals("tracer/startTime")){
			setTracer_starttime(v);
		}else if (xmlPath.equals("start_time")){
			setStartTime(v);
		}else if (xmlPath.equals("start_time_scan")){
			setStartTimeScan(v);
		}else if (xmlPath.equals("start_time_injection")){
			setStartTimeInjection(v);
		}else if (xmlPath.equals("blood_glucose")){
			setBloodGlucose(v);
		}else if (xmlPath.equals("blood_glucose_units")){
			setBloodGlucoseUnits(v);
		}else if (xmlPath.equals("blood_glucose_time")){
			setBloodGlucoseTime(v);
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
		if (xmlPath.equals("stabilization")){
			return getStabilization();
		}else if (xmlPath.equals("studyType")){
			return getStudytype();
		}else if (xmlPath.equals("patientID")){
			return getPatientid();
		}else if (xmlPath.equals("patientName")){
			return getPatientname();
		}else if (xmlPath.equals("tracer/dose/units")){
			return getTracer_dose_units();
		}else if (xmlPath.equals("tracer/dose")){
			return getTracer_dose();
		}else if (xmlPath.equals("tracer/specificActivity")){
			return getTracer_specificactivity();
		}else if (xmlPath.equals("tracer/totalMass/units")){
			return getTracer_totalmass_units();
		}else if (xmlPath.equals("tracer/totalMass")){
			return getTracer_totalmass();
		}else if (xmlPath.equals("tracer/intermediate/units")){
			return getTracer_intermediate_units();
		}else if (xmlPath.equals("tracer/intermediate")){
			return getTracer_intermediate();
		}else if (xmlPath.equals("tracer/isotope/half-life")){
			return getTracer_isotope_halfLife();
		}else if (xmlPath.equals("tracer/isotope")){
			return getTracer_isotope();
		}else if (xmlPath.equals("tracer/transmissions")){
			return getTracer_transmissions();
		}else if (xmlPath.equals("tracer/transmissions_starttime")){
			return getTracer_transmissionsStarttime();
		}else if (xmlPath.equals("tracer/name")){
			return getTracer_name();
		}else if (xmlPath.equals("tracer/startTime")){
			return getTracer_starttime();
		}else if (xmlPath.equals("start_time")){
			return getStartTime();
		}else if (xmlPath.equals("start_time_scan")){
			return getStartTimeScan();
		}else if (xmlPath.equals("start_time_injection")){
			return getStartTimeInjection();
		}else if (xmlPath.equals("blood_glucose")){
			return getBloodGlucose();
		}else if (xmlPath.equals("blood_glucose_units")){
			return getBloodGlucoseUnits();
		}else if (xmlPath.equals("blood_glucose_time")){
			return getBloodGlucoseTime();
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
		if (xmlPath.equals("stabilization")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("studyType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("patientID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("patientName")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/dose/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/dose")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/specificActivity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/totalMass/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/totalMass")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/intermediate/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/intermediate")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/isotope/half-life")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/isotope")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/transmissions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/transmissions_starttime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tracer/startTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("start_time")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("start_time_scan")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("start_time_injection")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("blood_glucose")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("blood_glucose_units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("blood_glucose_time")){
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
		all_fields.add("stabilization");
		all_fields.add("studyType");
		all_fields.add("patientID");
		all_fields.add("patientName");
		all_fields.add("tracer/dose/units");
		all_fields.add("tracer/dose");
		all_fields.add("tracer/specificActivity");
		all_fields.add("tracer/totalMass/units");
		all_fields.add("tracer/totalMass");
		all_fields.add("tracer/intermediate/units");
		all_fields.add("tracer/intermediate");
		all_fields.add("tracer/isotope/half-life");
		all_fields.add("tracer/isotope");
		all_fields.add("tracer/transmissions");
		all_fields.add("tracer/transmissions_starttime");
		all_fields.add("tracer/name");
		all_fields.add("tracer/startTime");
		all_fields.add("start_time");
		all_fields.add("start_time_scan");
		all_fields.add("start_time_injection");
		all_fields.add("blood_glucose");
		all_fields.add("blood_glucose_units");
		all_fields.add("blood_glucose_time");
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
		writer.write("\n<xnat:PETSession");
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
		writer.write("\n</xnat:PETSession>");
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
		//REFERENCE FROM petSessionData -> imageSessionData
		if (_Stabilization!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:stabilization");
			writer.write(">");
			writer.write(ValueParser(_Stabilization,"string"));
			writer.write("</xnat:stabilization>");
			header--;
		}
		if (_Studytype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:studyType");
			writer.write(">");
			writer.write(ValueParser(_Studytype,"string"));
			writer.write("</xnat:studyType>");
			header--;
		}
		if (_Patientid!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:patientID");
			writer.write(">");
			writer.write(ValueParser(_Patientid,"string"));
			writer.write("</xnat:patientID>");
			header--;
		}
		if (_Patientname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:patientName");
			writer.write(">");
			writer.write(ValueParser(_Patientname,"string"));
			writer.write("</xnat:patientName>");
			header--;
		}
		TreeMap TracerATTMap = new TreeMap();
		String TracerATT = new String();
		if (_Tracer_name!=null)
			TracerATTMap.put("name",ValueParser(_Tracer_name,"string"));
		if (_Tracer_starttime!=null)
			TracerATTMap.put("startTime",ValueParser(_Tracer_starttime,"dateTime"));
		java.util.Iterator iter0 =TracerATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			TracerATT +=" " + key + "=\"" + TracerATTMap.get(key) + "\"";
		}
			int child1=0;
			int att1=0;
			if(_Tracer_dose!=null)
			child1++;
			if(_Tracer_isotope_halfLife!=null)
			child1++;
			if(_Tracer_totalmass_units!=null)
			child1++;
			if(_Tracer_totalmass!=null)
			child1++;
			if(_Tracer_name!=null)
			att1++;
			if(_Tracer_specificactivity!=null)
			child1++;
			if(_Tracer_dose_units!=null)
			child1++;
			if(_Tracer_intermediate!=null)
			child1++;
			if(_Tracer_isotope!=null)
			child1++;
			if(_Tracer_intermediate_units!=null)
			child1++;
			if(_Tracer_transmissionsStarttime!=null)
			child1++;
			if(_Tracer_transmissions!=null)
			child1++;
			if(_Tracer_starttime!=null)
			att1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat:tracer");
				writer.write(TracerATT);
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		TreeMap Tracer_doseATTMap = new TreeMap();
		String Tracer_doseATT = new String();
		if (_Tracer_dose_units!=null)
			Tracer_doseATTMap.put("units",ValueParser(_Tracer_dose_units,"string"));
		java.util.Iterator iter2 =Tracer_doseATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			Tracer_doseATT +=" " + key + "=\"" + Tracer_doseATTMap.get(key) + "\"";
		}
		if (_Tracer_dose!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dose");
			writer.write(Tracer_doseATT);
			writer.write(">");
			writer.write(ValueParser(_Tracer_dose,"float"));
			writer.write("</xnat:dose>");
			header--;
		}
		else if(!Tracer_doseATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:dose");
			writer.write(Tracer_doseATT);
			writer.write("/>");
			header--;
		}

		if (_Tracer_specificactivity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:specificActivity");
			writer.write(">");
			writer.write(ValueParser(_Tracer_specificactivity,"float"));
			writer.write("</xnat:specificActivity>");
			header--;
		}
		TreeMap Tracer_totalmassATTMap = new TreeMap();
		String Tracer_totalmassATT = new String();
		if (_Tracer_totalmass_units!=null)
			Tracer_totalmassATTMap.put("units",ValueParser(_Tracer_totalmass_units,"string"));
		java.util.Iterator iter3 =Tracer_totalmassATTMap.keySet().iterator();
		while(iter3.hasNext()){
			String key = (String)iter3.next();
			Tracer_totalmassATT +=" " + key + "=\"" + Tracer_totalmassATTMap.get(key) + "\"";
		}
		if (_Tracer_totalmass!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:totalMass");
			writer.write(Tracer_totalmassATT);
			writer.write(">");
			writer.write(ValueParser(_Tracer_totalmass,"float"));
			writer.write("</xnat:totalMass>");
			header--;
		}
		else if(!Tracer_totalmassATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:totalMass");
			writer.write(Tracer_totalmassATT);
			writer.write("/>");
			header--;
		}

		TreeMap Tracer_intermediateATTMap = new TreeMap();
		String Tracer_intermediateATT = new String();
		if (_Tracer_intermediate_units!=null)
			Tracer_intermediateATTMap.put("units",ValueParser(_Tracer_intermediate_units,"string"));
		java.util.Iterator iter4 =Tracer_intermediateATTMap.keySet().iterator();
		while(iter4.hasNext()){
			String key = (String)iter4.next();
			Tracer_intermediateATT +=" " + key + "=\"" + Tracer_intermediateATTMap.get(key) + "\"";
		}
		if (_Tracer_intermediate!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:intermediate");
			writer.write(Tracer_intermediateATT);
			writer.write(">");
			writer.write(ValueParser(_Tracer_intermediate,"float"));
			writer.write("</xnat:intermediate>");
			header--;
		}
		else if(!Tracer_intermediateATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:intermediate");
			writer.write(Tracer_intermediateATT);
			writer.write("/>");
			header--;
		}

		TreeMap Tracer_isotopeATTMap = new TreeMap();
		String Tracer_isotopeATT = new String();
		if (_Tracer_isotope_halfLife!=null)
			Tracer_isotopeATTMap.put("half-life",ValueParser(_Tracer_isotope_halfLife,"float"));
		java.util.Iterator iter5 =Tracer_isotopeATTMap.keySet().iterator();
		while(iter5.hasNext()){
			String key = (String)iter5.next();
			Tracer_isotopeATT +=" " + key + "=\"" + Tracer_isotopeATTMap.get(key) + "\"";
		}
		if (_Tracer_isotope!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:isotope");
			writer.write(Tracer_isotopeATT);
			writer.write(">");
			writer.write(ValueParser(_Tracer_isotope,"string"));
			writer.write("</xnat:isotope>");
			header--;
		}
		else if(!Tracer_isotopeATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:isotope");
			writer.write(Tracer_isotopeATT);
			writer.write("/>");
			header--;
		}

		if (_Tracer_transmissions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:transmissions");
			writer.write(">");
			writer.write(ValueParser(_Tracer_transmissions,"integer"));
			writer.write("</xnat:transmissions>");
			header--;
		}
		if (_Tracer_transmissionsStarttime!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:transmissions_starttime");
			writer.write(">");
			writer.write(ValueParser(_Tracer_transmissionsStarttime,"dateTime"));
			writer.write("</xnat:transmissions_starttime>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:tracer>");
			}
			}

		if (_StartTime!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:start_time");
			writer.write(">");
			writer.write(ValueParser(_StartTime,"dateTime"));
			writer.write("</xnat:start_time>");
			header--;
		}
		if (_StartTimeScan!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:start_time_scan");
			writer.write(">");
			writer.write(ValueParser(_StartTimeScan,"dateTime"));
			writer.write("</xnat:start_time_scan>");
			header--;
		}
		if (_StartTimeInjection!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:start_time_injection");
			writer.write(">");
			writer.write(ValueParser(_StartTimeInjection,"dateTime"));
			writer.write("</xnat:start_time_injection>");
			header--;
		}
		if (_BloodGlucose!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:blood_glucose");
			writer.write(">");
			writer.write(ValueParser(_BloodGlucose,"float"));
			writer.write("</xnat:blood_glucose>");
			header--;
		}
		if (_BloodGlucoseUnits!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:blood_glucose_units");
			writer.write(">");
			writer.write(ValueParser(_BloodGlucoseUnits,"string"));
			writer.write("</xnat:blood_glucose_units>");
			header--;
		}
		if (_BloodGlucoseTime!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:blood_glucose_time");
			writer.write(">");
			writer.write(ValueParser(_BloodGlucoseTime,"dateTime"));
			writer.write("</xnat:blood_glucose_time>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Stabilization!=null) return true;
		if (_Studytype!=null) return true;
		if (_Patientid!=null) return true;
		if (_Patientname!=null) return true;
		if (_Tracer_name!=null)
			return true;
		if (_Tracer_starttime!=null)
			return true;
			if(_Tracer_dose!=null) return true;
			if(_Tracer_isotope_halfLife!=null) return true;
			if(_Tracer_totalmass_units!=null) return true;
			if(_Tracer_totalmass!=null) return true;
			if(_Tracer_name!=null) return true;
			if(_Tracer_specificactivity!=null) return true;
			if(_Tracer_dose_units!=null) return true;
			if(_Tracer_intermediate!=null) return true;
			if(_Tracer_isotope!=null) return true;
			if(_Tracer_intermediate_units!=null) return true;
			if(_Tracer_transmissionsStarttime!=null) return true;
			if(_Tracer_transmissions!=null) return true;
			if(_Tracer_starttime!=null) return true;
		if (_StartTime!=null) return true;
		if (_StartTimeScan!=null) return true;
		if (_StartTimeInjection!=null) return true;
		if (_BloodGlucose!=null) return true;
		if (_BloodGlucoseUnits!=null) return true;
		if (_BloodGlucoseTime!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
