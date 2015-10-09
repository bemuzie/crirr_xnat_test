/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
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
public class XnatAybocsdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatAybocsdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatAybocsdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat_a:ybocsData";

	public String getSchemaElementName(){
		return "ybocsData";
	}

	public String getFullSchemaElementName(){
		return "xnat_a:ybocsData";
	}

	//FIELD

	private String _Currentorworstever=null;

	/**
	 * @return Returns the currentOrWorstEver.
	 */
	public String getCurrentorworstever(){
		return _Currentorworstever;
	}

	/**
	 * Sets the value for currentOrWorstEver.
	 * @param v Value to Set.
	 */
	public void setCurrentorworstever(String v){
		_Currentorworstever=v;
	}

	//FIELD

	private Integer _Timeoccupiedwiththoughts=null;

	/**
	 * @return Returns the timeOccupiedWithThoughts.
	 */
	public Integer getTimeoccupiedwiththoughts(){
		return _Timeoccupiedwiththoughts;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/timeOccupiedWithThoughts.
	 * @param v Value to Set.
	 */
	public void setTimeoccupiedwiththoughts(Integer v) {
		_Timeoccupiedwiththoughts=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/timeOccupiedWithThoughts.
	 * @param v Value to Set.
	 */
	public void setTimeoccupiedwiththoughts(String v)  {
		_Timeoccupiedwiththoughts=formatInteger(v);
	}

	//FIELD

	private Integer _Thoughtsinterferefunctioning=null;

	/**
	 * @return Returns the thoughtsInterfereFunctioning.
	 */
	public Integer getThoughtsinterferefunctioning(){
		return _Thoughtsinterferefunctioning;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/thoughtsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setThoughtsinterferefunctioning(Integer v) {
		_Thoughtsinterferefunctioning=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/thoughtsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setThoughtsinterferefunctioning(String v)  {
		_Thoughtsinterferefunctioning=formatInteger(v);
	}

	//FIELD

	private Integer _Distresscaused=null;

	/**
	 * @return Returns the distressCaused.
	 */
	public Integer getDistresscaused(){
		return _Distresscaused;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/distressCaused.
	 * @param v Value to Set.
	 */
	public void setDistresscaused(Integer v) {
		_Distresscaused=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/distressCaused.
	 * @param v Value to Set.
	 */
	public void setDistresscaused(String v)  {
		_Distresscaused=formatInteger(v);
	}

	//FIELD

	private Integer _Efforttoresistthoughts=null;

	/**
	 * @return Returns the effortToResistThoughts.
	 */
	public Integer getEfforttoresistthoughts(){
		return _Efforttoresistthoughts;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistThoughts.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistthoughts(Integer v) {
		_Efforttoresistthoughts=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistThoughts.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistthoughts(String v)  {
		_Efforttoresistthoughts=formatInteger(v);
	}

	//FIELD

	private Integer _Controloverthoughts=null;

	/**
	 * @return Returns the controlOverThoughts.
	 */
	public Integer getControloverthoughts(){
		return _Controloverthoughts;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/controlOverThoughts.
	 * @param v Value to Set.
	 */
	public void setControloverthoughts(Integer v) {
		_Controloverthoughts=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/controlOverThoughts.
	 * @param v Value to Set.
	 */
	public void setControloverthoughts(String v)  {
		_Controloverthoughts=formatInteger(v);
	}

	//FIELD

	private Integer _Timeperforming=null;

	/**
	 * @return Returns the timePerforming.
	 */
	public Integer getTimeperforming(){
		return _Timeperforming;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/timePerforming.
	 * @param v Value to Set.
	 */
	public void setTimeperforming(Integer v) {
		_Timeperforming=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/timePerforming.
	 * @param v Value to Set.
	 */
	public void setTimeperforming(String v)  {
		_Timeperforming=formatInteger(v);
	}

	//FIELD

	private Integer _Behaviorsinterferefunctioning=null;

	/**
	 * @return Returns the behaviorsInterfereFunctioning.
	 */
	public Integer getBehaviorsinterferefunctioning(){
		return _Behaviorsinterferefunctioning;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setBehaviorsinterferefunctioning(Integer v) {
		_Behaviorsinterferefunctioning=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setBehaviorsinterferefunctioning(String v)  {
		_Behaviorsinterferefunctioning=formatInteger(v);
	}

	//FIELD

	private Integer _Feelingifprevented=null;

	/**
	 * @return Returns the feelingIfPrevented.
	 */
	public Integer getFeelingifprevented(){
		return _Feelingifprevented;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/feelingIfPrevented.
	 * @param v Value to Set.
	 */
	public void setFeelingifprevented(Integer v) {
		_Feelingifprevented=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/feelingIfPrevented.
	 * @param v Value to Set.
	 */
	public void setFeelingifprevented(String v)  {
		_Feelingifprevented=formatInteger(v);
	}

	//FIELD

	private Integer _Efforttoresistbehaviors=null;

	/**
	 * @return Returns the effortToResistBehaviors.
	 */
	public Integer getEfforttoresistbehaviors(){
		return _Efforttoresistbehaviors;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistBehaviors.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistbehaviors(Integer v) {
		_Efforttoresistbehaviors=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistBehaviors.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistbehaviors(String v)  {
		_Efforttoresistbehaviors=formatInteger(v);
	}

	//FIELD

	private Integer _Behaviordrivestrength=null;

	/**
	 * @return Returns the behaviorDriveStrength.
	 */
	public Integer getBehaviordrivestrength(){
		return _Behaviordrivestrength;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorDriveStrength.
	 * @param v Value to Set.
	 */
	public void setBehaviordrivestrength(Integer v) {
		_Behaviordrivestrength=v;
	}

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorDriveStrength.
	 * @param v Value to Set.
	 */
	public void setBehaviordrivestrength(String v)  {
		_Behaviordrivestrength=formatInteger(v);
	}

	//FIELD

	private Boolean _Untiljustright=null;

	/**
	 * @return Returns the untilJustRight.
	 */
	public Boolean getUntiljustright() {
		return _Untiljustright;
	}

	/**
	 * Sets the value for untilJustRight.
	 * @param v Value to Set.
	 */
	public void setUntiljustright(Object v){
		if(v instanceof Boolean){
			_Untiljustright=(Boolean)v;
		}else if(v instanceof String){
			_Untiljustright=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private String _Untiljustrightawareness=null;

	/**
	 * @return Returns the untilJustRightAwareness.
	 */
	public String getUntiljustrightawareness(){
		return _Untiljustrightawareness;
	}

	/**
	 * Sets the value for untilJustRightAwareness.
	 * @param v Value to Set.
	 */
	public void setUntiljustrightawareness(String v){
		_Untiljustrightawareness=v;
	}

	//FIELD

	private String _Untiljustrightperceptions=null;

	/**
	 * @return Returns the untilJustRightPerceptions.
	 */
	public String getUntiljustrightperceptions(){
		return _Untiljustrightperceptions;
	}

	/**
	 * Sets the value for untilJustRightPerceptions.
	 * @param v Value to Set.
	 */
	public void setUntiljustrightperceptions(String v){
		_Untiljustrightperceptions=v;
	}

	//FIELD

	private String _Whenstartuntiljustright=null;

	/**
	 * @return Returns the whenStartUntilJustRight.
	 */
	public String getWhenstartuntiljustright(){
		return _Whenstartuntiljustright;
	}

	/**
	 * Sets the value for whenStartUntilJustRight.
	 * @param v Value to Set.
	 */
	public void setWhenstartuntiljustright(String v){
		_Whenstartuntiljustright=v;
	}

	//FIELD

	private String _Frequencyuntiljustright=null;

	/**
	 * @return Returns the frequencyUntilJustRight.
	 */
	public String getFrequencyuntiljustright(){
		return _Frequencyuntiljustright;
	}

	/**
	 * Sets the value for frequencyUntilJustRight.
	 * @param v Value to Set.
	 */
	public void setFrequencyuntiljustright(String v){
		_Frequencyuntiljustright=v;
	}

	//FIELD

	private Double _Firstuntiljustrightage=null;

	/**
	 * @return Returns the firstUntilJustRightAge.
	 */
	public Double getFirstuntiljustrightage() {
		return _Firstuntiljustrightage;
	}

	/**
	 * Sets the value for firstUntilJustRightAge.
	 * @param v Value to Set.
	 */
	public void setFirstuntiljustrightage(Double v){
		_Firstuntiljustrightage=v;
	}

	/**
	 * Sets the value for firstUntilJustRightAge.
	 * @param v Value to Set.
	 */
	public void setFirstuntiljustrightage(String v)  {
		_Firstuntiljustrightage=formatDouble(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("currentOrWorstEver")){
			setCurrentorworstever(v);
		}else if (xmlPath.equals("timeOccupiedWithThoughts")){
			setTimeoccupiedwiththoughts(v);
		}else if (xmlPath.equals("thoughtsInterfereFunctioning")){
			setThoughtsinterferefunctioning(v);
		}else if (xmlPath.equals("distressCaused")){
			setDistresscaused(v);
		}else if (xmlPath.equals("effortToResistThoughts")){
			setEfforttoresistthoughts(v);
		}else if (xmlPath.equals("controlOverThoughts")){
			setControloverthoughts(v);
		}else if (xmlPath.equals("timePerforming")){
			setTimeperforming(v);
		}else if (xmlPath.equals("behaviorsInterfereFunctioning")){
			setBehaviorsinterferefunctioning(v);
		}else if (xmlPath.equals("feelingIfPrevented")){
			setFeelingifprevented(v);
		}else if (xmlPath.equals("effortToResistBehaviors")){
			setEfforttoresistbehaviors(v);
		}else if (xmlPath.equals("behaviorDriveStrength")){
			setBehaviordrivestrength(v);
		}else if (xmlPath.equals("untilJustRight")){
			setUntiljustright(v);
		}else if (xmlPath.equals("untilJustRightAwareness")){
			setUntiljustrightawareness(v);
		}else if (xmlPath.equals("untilJustRightPerceptions")){
			setUntiljustrightperceptions(v);
		}else if (xmlPath.equals("whenStartUntilJustRight")){
			setWhenstartuntiljustright(v);
		}else if (xmlPath.equals("frequencyUntilJustRight")){
			setFrequencyuntiljustright(v);
		}else if (xmlPath.equals("firstUntilJustRightAge")){
			setFirstuntiljustrightage(v);
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
		if (xmlPath.equals("currentOrWorstEver")){
			return getCurrentorworstever();
		}else if (xmlPath.equals("timeOccupiedWithThoughts")){
			return getTimeoccupiedwiththoughts();
		}else if (xmlPath.equals("thoughtsInterfereFunctioning")){
			return getThoughtsinterferefunctioning();
		}else if (xmlPath.equals("distressCaused")){
			return getDistresscaused();
		}else if (xmlPath.equals("effortToResistThoughts")){
			return getEfforttoresistthoughts();
		}else if (xmlPath.equals("controlOverThoughts")){
			return getControloverthoughts();
		}else if (xmlPath.equals("timePerforming")){
			return getTimeperforming();
		}else if (xmlPath.equals("behaviorsInterfereFunctioning")){
			return getBehaviorsinterferefunctioning();
		}else if (xmlPath.equals("feelingIfPrevented")){
			return getFeelingifprevented();
		}else if (xmlPath.equals("effortToResistBehaviors")){
			return getEfforttoresistbehaviors();
		}else if (xmlPath.equals("behaviorDriveStrength")){
			return getBehaviordrivestrength();
		}else if (xmlPath.equals("untilJustRight")){
			return getUntiljustright();
		}else if (xmlPath.equals("untilJustRightAwareness")){
			return getUntiljustrightawareness();
		}else if (xmlPath.equals("untilJustRightPerceptions")){
			return getUntiljustrightperceptions();
		}else if (xmlPath.equals("whenStartUntilJustRight")){
			return getWhenstartuntiljustright();
		}else if (xmlPath.equals("frequencyUntilJustRight")){
			return getFrequencyuntiljustright();
		}else if (xmlPath.equals("firstUntilJustRightAge")){
			return getFirstuntiljustrightage();
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
		if (xmlPath.equals("currentOrWorstEver")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("timeOccupiedWithThoughts")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("thoughtsInterfereFunctioning")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("distressCaused")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("effortToResistThoughts")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("controlOverThoughts")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("timePerforming")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("behaviorsInterfereFunctioning")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("feelingIfPrevented")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("effortToResistBehaviors")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("behaviorDriveStrength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("untilJustRight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("untilJustRightAwareness")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("untilJustRightPerceptions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("whenStartUntilJustRight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("frequencyUntilJustRight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("firstUntilJustRightAge")){
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
		all_fields.add("currentOrWorstEver");
		all_fields.add("timeOccupiedWithThoughts");
		all_fields.add("thoughtsInterfereFunctioning");
		all_fields.add("distressCaused");
		all_fields.add("effortToResistThoughts");
		all_fields.add("controlOverThoughts");
		all_fields.add("timePerforming");
		all_fields.add("behaviorsInterfereFunctioning");
		all_fields.add("feelingIfPrevented");
		all_fields.add("effortToResistBehaviors");
		all_fields.add("behaviorDriveStrength");
		all_fields.add("untilJustRight");
		all_fields.add("untilJustRightAwareness");
		all_fields.add("untilJustRightPerceptions");
		all_fields.add("whenStartUntilJustRight");
		all_fields.add("frequencyUntilJustRight");
		all_fields.add("firstUntilJustRightAge");
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
		writer.write("\n<xnat_a:YBOCS");
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
		writer.write("\n</xnat_a:YBOCS>");
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
		//REFERENCE FROM ybocsData -> subjectAssessorData
		if (_Currentorworstever!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOrWorstEver");
			writer.write(">");
			writer.write(ValueParser(_Currentorworstever,"string"));
			writer.write("</xnat_a:currentOrWorstEver>");
			header--;
		}
		if (_Timeoccupiedwiththoughts!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:timeOccupiedWithThoughts");
			writer.write(">");
			writer.write(ValueParser(_Timeoccupiedwiththoughts,"integer"));
			writer.write("</xnat_a:timeOccupiedWithThoughts>");
			header--;
		}
		if (_Thoughtsinterferefunctioning!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:thoughtsInterfereFunctioning");
			writer.write(">");
			writer.write(ValueParser(_Thoughtsinterferefunctioning,"integer"));
			writer.write("</xnat_a:thoughtsInterfereFunctioning>");
			header--;
		}
		if (_Distresscaused!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:distressCaused");
			writer.write(">");
			writer.write(ValueParser(_Distresscaused,"integer"));
			writer.write("</xnat_a:distressCaused>");
			header--;
		}
		if (_Efforttoresistthoughts!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:effortToResistThoughts");
			writer.write(">");
			writer.write(ValueParser(_Efforttoresistthoughts,"integer"));
			writer.write("</xnat_a:effortToResistThoughts>");
			header--;
		}
		if (_Controloverthoughts!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:controlOverThoughts");
			writer.write(">");
			writer.write(ValueParser(_Controloverthoughts,"integer"));
			writer.write("</xnat_a:controlOverThoughts>");
			header--;
		}
		if (_Timeperforming!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:timePerforming");
			writer.write(">");
			writer.write(ValueParser(_Timeperforming,"integer"));
			writer.write("</xnat_a:timePerforming>");
			header--;
		}
		if (_Behaviorsinterferefunctioning!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:behaviorsInterfereFunctioning");
			writer.write(">");
			writer.write(ValueParser(_Behaviorsinterferefunctioning,"integer"));
			writer.write("</xnat_a:behaviorsInterfereFunctioning>");
			header--;
		}
		if (_Feelingifprevented!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:feelingIfPrevented");
			writer.write(">");
			writer.write(ValueParser(_Feelingifprevented,"integer"));
			writer.write("</xnat_a:feelingIfPrevented>");
			header--;
		}
		if (_Efforttoresistbehaviors!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:effortToResistBehaviors");
			writer.write(">");
			writer.write(ValueParser(_Efforttoresistbehaviors,"integer"));
			writer.write("</xnat_a:effortToResistBehaviors>");
			header--;
		}
		if (_Behaviordrivestrength!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:behaviorDriveStrength");
			writer.write(">");
			writer.write(ValueParser(_Behaviordrivestrength,"integer"));
			writer.write("</xnat_a:behaviorDriveStrength>");
			header--;
		}
		if (_Untiljustright!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:untilJustRight");
			writer.write(">");
			writer.write(ValueParser(_Untiljustright,"boolean"));
			writer.write("</xnat_a:untilJustRight>");
			header--;
		}
		if (_Untiljustrightawareness!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:untilJustRightAwareness");
			writer.write(">");
			writer.write(ValueParser(_Untiljustrightawareness,"string"));
			writer.write("</xnat_a:untilJustRightAwareness>");
			header--;
		}
		if (_Untiljustrightperceptions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:untilJustRightPerceptions");
			writer.write(">");
			writer.write(ValueParser(_Untiljustrightperceptions,"string"));
			writer.write("</xnat_a:untilJustRightPerceptions>");
			header--;
		}
		if (_Whenstartuntiljustright!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:whenStartUntilJustRight");
			writer.write(">");
			writer.write(ValueParser(_Whenstartuntiljustright,"string"));
			writer.write("</xnat_a:whenStartUntilJustRight>");
			header--;
		}
		if (_Frequencyuntiljustright!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:frequencyUntilJustRight");
			writer.write(">");
			writer.write(ValueParser(_Frequencyuntiljustright,"string"));
			writer.write("</xnat_a:frequencyUntilJustRight>");
			header--;
		}
		if (_Firstuntiljustrightage!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:firstUntilJustRightAge");
			writer.write(">");
			writer.write(ValueParser(_Firstuntiljustrightage,"float"));
			writer.write("</xnat_a:firstUntilJustRightAge>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Currentorworstever!=null) return true;
		if (_Timeoccupiedwiththoughts!=null) return true;
		if (_Thoughtsinterferefunctioning!=null) return true;
		if (_Distresscaused!=null) return true;
		if (_Efforttoresistthoughts!=null) return true;
		if (_Controloverthoughts!=null) return true;
		if (_Timeperforming!=null) return true;
		if (_Behaviorsinterferefunctioning!=null) return true;
		if (_Feelingifprevented!=null) return true;
		if (_Efforttoresistbehaviors!=null) return true;
		if (_Behaviordrivestrength!=null) return true;
		if (_Untiljustright!=null) return true;
		if (_Untiljustrightawareness!=null) return true;
		if (_Untiljustrightperceptions!=null) return true;
		if (_Whenstartuntiljustright!=null) return true;
		if (_Frequencyuntiljustright!=null) return true;
		if (_Firstuntiljustrightage!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
