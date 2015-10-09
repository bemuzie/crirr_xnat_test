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
public class XnatAygtssdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatAygtssdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatAygtssdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat_a:ygtssData";

	public String getSchemaElementName(){
		return "ygtssData";
	}

	public String getFullSchemaElementName(){
		return "xnat_a:ygtssData";
	}

	//FIELD

	private String _Filledoutby=null;

	/**
	 * @return Returns the filledOutBy.
	 */
	public String getFilledoutby(){
		return _Filledoutby;
	}

	/**
	 * Sets the value for filledOutBy.
	 * @param v Value to Set.
	 */
	public void setFilledoutby(String v){
		_Filledoutby=v;
	}

	//FIELD

	private String _Period=null;

	/**
	 * @return Returns the period.
	 */
	public String getPeriod(){
		return _Period;
	}

	/**
	 * Sets the value for period.
	 * @param v Value to Set.
	 */
	public void setPeriod(String v){
		_Period=v;
	}

	//FIELD

	private Double _Worsteverage=null;

	/**
	 * @return Returns the worstEverAge.
	 */
	public Double getWorsteverage() {
		return _Worsteverage;
	}

	/**
	 * Sets the value for worstEverAge.
	 * @param v Value to Set.
	 */
	public void setWorsteverage(Double v){
		_Worsteverage=v;
	}

	/**
	 * Sets the value for worstEverAge.
	 * @param v Value to Set.
	 */
	public void setWorsteverage(String v)  {
		_Worsteverage=formatDouble(v);
	}

	//FIELD

	private Integer _Motor_number=null;

	/**
	 * @return Returns the motor/number.
	 */
	public Integer getMotor_number(){
		return _Motor_number;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/number.
	 * @param v Value to Set.
	 */
	public void setMotor_number(Integer v) {
		_Motor_number=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/number.
	 * @param v Value to Set.
	 */
	public void setMotor_number(String v)  {
		_Motor_number=formatInteger(v);
	}

	//FIELD

	private Integer _Motor_frequency=null;

	/**
	 * @return Returns the motor/frequency.
	 */
	public Integer getMotor_frequency(){
		return _Motor_frequency;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/frequency.
	 * @param v Value to Set.
	 */
	public void setMotor_frequency(Integer v) {
		_Motor_frequency=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/frequency.
	 * @param v Value to Set.
	 */
	public void setMotor_frequency(String v)  {
		_Motor_frequency=formatInteger(v);
	}

	//FIELD

	private Integer _Motor_intensity=null;

	/**
	 * @return Returns the motor/intensity.
	 */
	public Integer getMotor_intensity(){
		return _Motor_intensity;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/intensity.
	 * @param v Value to Set.
	 */
	public void setMotor_intensity(Integer v) {
		_Motor_intensity=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/intensity.
	 * @param v Value to Set.
	 */
	public void setMotor_intensity(String v)  {
		_Motor_intensity=formatInteger(v);
	}

	//FIELD

	private Integer _Motor_complexity=null;

	/**
	 * @return Returns the motor/complexity.
	 */
	public Integer getMotor_complexity(){
		return _Motor_complexity;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/complexity.
	 * @param v Value to Set.
	 */
	public void setMotor_complexity(Integer v) {
		_Motor_complexity=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/complexity.
	 * @param v Value to Set.
	 */
	public void setMotor_complexity(String v)  {
		_Motor_complexity=formatInteger(v);
	}

	//FIELD

	private Integer _Motor_interference=null;

	/**
	 * @return Returns the motor/interference.
	 */
	public Integer getMotor_interference(){
		return _Motor_interference;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/interference.
	 * @param v Value to Set.
	 */
	public void setMotor_interference(Integer v) {
		_Motor_interference=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/motor/interference.
	 * @param v Value to Set.
	 */
	public void setMotor_interference(String v)  {
		_Motor_interference=formatInteger(v);
	}

	//FIELD

	private String _Motor_inventory=null;

	/**
	 * @return Returns the motor/inventory.
	 */
	public String getMotor_inventory(){
		return _Motor_inventory;
	}

	/**
	 * Sets the value for motor/inventory.
	 * @param v Value to Set.
	 */
	public void setMotor_inventory(String v){
		_Motor_inventory=v;
	}

	//FIELD

	private Integer _Phonic_number=null;

	/**
	 * @return Returns the phonic/number.
	 */
	public Integer getPhonic_number(){
		return _Phonic_number;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/number.
	 * @param v Value to Set.
	 */
	public void setPhonic_number(Integer v) {
		_Phonic_number=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/number.
	 * @param v Value to Set.
	 */
	public void setPhonic_number(String v)  {
		_Phonic_number=formatInteger(v);
	}

	//FIELD

	private Integer _Phonic_frequency=null;

	/**
	 * @return Returns the phonic/frequency.
	 */
	public Integer getPhonic_frequency(){
		return _Phonic_frequency;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/frequency.
	 * @param v Value to Set.
	 */
	public void setPhonic_frequency(Integer v) {
		_Phonic_frequency=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/frequency.
	 * @param v Value to Set.
	 */
	public void setPhonic_frequency(String v)  {
		_Phonic_frequency=formatInteger(v);
	}

	//FIELD

	private Integer _Phonic_intensity=null;

	/**
	 * @return Returns the phonic/intensity.
	 */
	public Integer getPhonic_intensity(){
		return _Phonic_intensity;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/intensity.
	 * @param v Value to Set.
	 */
	public void setPhonic_intensity(Integer v) {
		_Phonic_intensity=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/intensity.
	 * @param v Value to Set.
	 */
	public void setPhonic_intensity(String v)  {
		_Phonic_intensity=formatInteger(v);
	}

	//FIELD

	private Integer _Phonic_complexity=null;

	/**
	 * @return Returns the phonic/complexity.
	 */
	public Integer getPhonic_complexity(){
		return _Phonic_complexity;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/complexity.
	 * @param v Value to Set.
	 */
	public void setPhonic_complexity(Integer v) {
		_Phonic_complexity=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/complexity.
	 * @param v Value to Set.
	 */
	public void setPhonic_complexity(String v)  {
		_Phonic_complexity=formatInteger(v);
	}

	//FIELD

	private Integer _Phonic_interference=null;

	/**
	 * @return Returns the phonic/interference.
	 */
	public Integer getPhonic_interference(){
		return _Phonic_interference;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/interference.
	 * @param v Value to Set.
	 */
	public void setPhonic_interference(Integer v) {
		_Phonic_interference=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/interference.
	 * @param v Value to Set.
	 */
	public void setPhonic_interference(String v)  {
		_Phonic_interference=formatInteger(v);
	}

	//FIELD

	private String _Phonic_inventory=null;

	/**
	 * @return Returns the phonic/inventory.
	 */
	public String getPhonic_inventory(){
		return _Phonic_inventory;
	}

	/**
	 * Sets the value for phonic/inventory.
	 * @param v Value to Set.
	 */
	public void setPhonic_inventory(String v){
		_Phonic_inventory=v;
	}

	//FIELD

	private Integer _Impairment=null;

	/**
	 * @return Returns the impairment.
	 */
	public Integer getImpairment(){
		return _Impairment;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/impairment.
	 * @param v Value to Set.
	 */
	public void setImpairment(Integer v) {
		_Impairment=v;
	}

	/**
	 * Sets the value for xnat_a:ygtssData/impairment.
	 * @param v Value to Set.
	 */
	public void setImpairment(String v)  {
		_Impairment=formatInteger(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("filledOutBy")){
			setFilledoutby(v);
		}else if (xmlPath.equals("period")){
			setPeriod(v);
		}else if (xmlPath.equals("worstEverAge")){
			setWorsteverage(v);
		}else if (xmlPath.equals("motor/number")){
			setMotor_number(v);
		}else if (xmlPath.equals("motor/frequency")){
			setMotor_frequency(v);
		}else if (xmlPath.equals("motor/intensity")){
			setMotor_intensity(v);
		}else if (xmlPath.equals("motor/complexity")){
			setMotor_complexity(v);
		}else if (xmlPath.equals("motor/interference")){
			setMotor_interference(v);
		}else if (xmlPath.equals("motor/inventory")){
			setMotor_inventory(v);
		}else if (xmlPath.equals("phonic/number")){
			setPhonic_number(v);
		}else if (xmlPath.equals("phonic/frequency")){
			setPhonic_frequency(v);
		}else if (xmlPath.equals("phonic/intensity")){
			setPhonic_intensity(v);
		}else if (xmlPath.equals("phonic/complexity")){
			setPhonic_complexity(v);
		}else if (xmlPath.equals("phonic/interference")){
			setPhonic_interference(v);
		}else if (xmlPath.equals("phonic/inventory")){
			setPhonic_inventory(v);
		}else if (xmlPath.equals("impairment")){
			setImpairment(v);
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
		if (xmlPath.equals("filledOutBy")){
			return getFilledoutby();
		}else if (xmlPath.equals("period")){
			return getPeriod();
		}else if (xmlPath.equals("worstEverAge")){
			return getWorsteverage();
		}else if (xmlPath.equals("motor/number")){
			return getMotor_number();
		}else if (xmlPath.equals("motor/frequency")){
			return getMotor_frequency();
		}else if (xmlPath.equals("motor/intensity")){
			return getMotor_intensity();
		}else if (xmlPath.equals("motor/complexity")){
			return getMotor_complexity();
		}else if (xmlPath.equals("motor/interference")){
			return getMotor_interference();
		}else if (xmlPath.equals("motor/inventory")){
			return getMotor_inventory();
		}else if (xmlPath.equals("phonic/number")){
			return getPhonic_number();
		}else if (xmlPath.equals("phonic/frequency")){
			return getPhonic_frequency();
		}else if (xmlPath.equals("phonic/intensity")){
			return getPhonic_intensity();
		}else if (xmlPath.equals("phonic/complexity")){
			return getPhonic_complexity();
		}else if (xmlPath.equals("phonic/interference")){
			return getPhonic_interference();
		}else if (xmlPath.equals("phonic/inventory")){
			return getPhonic_inventory();
		}else if (xmlPath.equals("impairment")){
			return getImpairment();
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
		if (xmlPath.equals("filledOutBy")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("period")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("worstEverAge")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/number")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/frequency")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/intensity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/complexity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/interference")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motor/inventory")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/number")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/frequency")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/intensity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/complexity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/interference")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phonic/inventory")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("impairment")){
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
		all_fields.add("filledOutBy");
		all_fields.add("period");
		all_fields.add("worstEverAge");
		all_fields.add("motor/number");
		all_fields.add("motor/frequency");
		all_fields.add("motor/intensity");
		all_fields.add("motor/complexity");
		all_fields.add("motor/interference");
		all_fields.add("motor/inventory");
		all_fields.add("phonic/number");
		all_fields.add("phonic/frequency");
		all_fields.add("phonic/intensity");
		all_fields.add("phonic/complexity");
		all_fields.add("phonic/interference");
		all_fields.add("phonic/inventory");
		all_fields.add("impairment");
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
		writer.write("\n<xnat_a:YGTSS");
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
		writer.write("\n</xnat_a:YGTSS>");
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
		//REFERENCE FROM ygtssData -> subjectAssessorData
		if (_Filledoutby!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:filledOutBy");
			writer.write(">");
			writer.write(ValueParser(_Filledoutby,"string"));
			writer.write("</xnat_a:filledOutBy>");
			header--;
		}
		if (_Period!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:period");
			writer.write(">");
			writer.write(ValueParser(_Period,"string"));
			writer.write("</xnat_a:period>");
			header--;
		}
		if (_Worsteverage!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:worstEverAge");
			writer.write(">");
			writer.write(ValueParser(_Worsteverage,"float"));
			writer.write("</xnat_a:worstEverAge>");
			header--;
		}
			int child0=0;
			int att0=0;
			if(_Motor_inventory!=null)
			child0++;
			if(_Motor_frequency!=null)
			child0++;
			if(_Motor_intensity!=null)
			child0++;
			if(_Motor_number!=null)
			child0++;
			if(_Motor_interference!=null)
			child0++;
			if(_Motor_complexity!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:motor");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Motor_number!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:number");
			writer.write(">");
			writer.write(ValueParser(_Motor_number,"integer"));
			writer.write("</xnat_a:number>");
			header--;
		}
		if (_Motor_frequency!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:frequency");
			writer.write(">");
			writer.write(ValueParser(_Motor_frequency,"integer"));
			writer.write("</xnat_a:frequency>");
			header--;
		}
		if (_Motor_intensity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:intensity");
			writer.write(">");
			writer.write(ValueParser(_Motor_intensity,"integer"));
			writer.write("</xnat_a:intensity>");
			header--;
		}
		if (_Motor_complexity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:complexity");
			writer.write(">");
			writer.write(ValueParser(_Motor_complexity,"integer"));
			writer.write("</xnat_a:complexity>");
			header--;
		}
		if (_Motor_interference!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:interference");
			writer.write(">");
			writer.write(ValueParser(_Motor_interference,"integer"));
			writer.write("</xnat_a:interference>");
			header--;
		}
		if (_Motor_inventory!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:inventory");
			writer.write(">");
			writer.write(ValueParser(_Motor_inventory,"string"));
			writer.write("</xnat_a:inventory>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:motor>");
			}
			}

			int child1=0;
			int att1=0;
			if(_Phonic_intensity!=null)
			child1++;
			if(_Phonic_number!=null)
			child1++;
			if(_Phonic_inventory!=null)
			child1++;
			if(_Phonic_interference!=null)
			child1++;
			if(_Phonic_complexity!=null)
			child1++;
			if(_Phonic_frequency!=null)
			child1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:phonic");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Phonic_number!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:number");
			writer.write(">");
			writer.write(ValueParser(_Phonic_number,"integer"));
			writer.write("</xnat_a:number>");
			header--;
		}
		if (_Phonic_frequency!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:frequency");
			writer.write(">");
			writer.write(ValueParser(_Phonic_frequency,"integer"));
			writer.write("</xnat_a:frequency>");
			header--;
		}
		if (_Phonic_intensity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:intensity");
			writer.write(">");
			writer.write(ValueParser(_Phonic_intensity,"integer"));
			writer.write("</xnat_a:intensity>");
			header--;
		}
		if (_Phonic_complexity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:complexity");
			writer.write(">");
			writer.write(ValueParser(_Phonic_complexity,"integer"));
			writer.write("</xnat_a:complexity>");
			header--;
		}
		if (_Phonic_interference!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:interference");
			writer.write(">");
			writer.write(ValueParser(_Phonic_interference,"integer"));
			writer.write("</xnat_a:interference>");
			header--;
		}
		if (_Phonic_inventory!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:inventory");
			writer.write(">");
			writer.write(ValueParser(_Phonic_inventory,"string"));
			writer.write("</xnat_a:inventory>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:phonic>");
			}
			}

		if (_Impairment!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:impairment");
			writer.write(">");
			writer.write(ValueParser(_Impairment,"integer"));
			writer.write("</xnat_a:impairment>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Filledoutby!=null) return true;
		if (_Period!=null) return true;
		if (_Worsteverage!=null) return true;
			if(_Motor_inventory!=null) return true;
			if(_Motor_frequency!=null) return true;
			if(_Motor_intensity!=null) return true;
			if(_Motor_number!=null) return true;
			if(_Motor_interference!=null) return true;
			if(_Motor_complexity!=null) return true;
			if(_Phonic_intensity!=null) return true;
			if(_Phonic_number!=null) return true;
			if(_Phonic_inventory!=null) return true;
			if(_Phonic_interference!=null) return true;
			if(_Phonic_complexity!=null) return true;
			if(_Phonic_frequency!=null) return true;
		if (_Impairment!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
