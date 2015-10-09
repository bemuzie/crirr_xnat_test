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
public class XnatContrastbolusBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatContrastbolusI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatContrastbolusBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:contrastBolus";

	public String getSchemaElementName(){
		return "contrastBolus";
	}

	public String getFullSchemaElementName(){
		return "xnat:contrastBolus";
	}

	//FIELD

	private String _Agent=null;

	/**
	 * @return Returns the agent.
	 */
	public String getAgent(){
		return _Agent;
	}

	/**
	 * Sets the value for agent.
	 * @param v Value to Set.
	 */
	public void setAgent(String v){
		_Agent=v;
	}

	//FIELD

	private String _Route=null;

	/**
	 * @return Returns the route.
	 */
	public String getRoute(){
		return _Route;
	}

	/**
	 * Sets the value for route.
	 * @param v Value to Set.
	 */
	public void setRoute(String v){
		_Route=v;
	}

	//FIELD

	private Double _Volume=null;

	/**
	 * @return Returns the volume.
	 */
	public Double getVolume() {
		return _Volume;
	}

	/**
	 * Sets the value for volume.
	 * @param v Value to Set.
	 */
	public void setVolume(Double v){
		_Volume=v;
	}

	/**
	 * Sets the value for volume.
	 * @param v Value to Set.
	 */
	public void setVolume(String v)  {
		_Volume=formatDouble(v);
	}

	//FIELD

	private Double _Totaldose=null;

	/**
	 * @return Returns the totalDose.
	 */
	public Double getTotaldose() {
		return _Totaldose;
	}

	/**
	 * Sets the value for totalDose.
	 * @param v Value to Set.
	 */
	public void setTotaldose(Double v){
		_Totaldose=v;
	}

	/**
	 * Sets the value for totalDose.
	 * @param v Value to Set.
	 */
	public void setTotaldose(String v)  {
		_Totaldose=formatDouble(v);
	}

	//FIELD

	private Double _Flowrate=null;

	/**
	 * @return Returns the flowRate.
	 */
	public Double getFlowrate() {
		return _Flowrate;
	}

	/**
	 * Sets the value for flowRate.
	 * @param v Value to Set.
	 */
	public void setFlowrate(Double v){
		_Flowrate=v;
	}

	/**
	 * Sets the value for flowRate.
	 * @param v Value to Set.
	 */
	public void setFlowrate(String v)  {
		_Flowrate=formatDouble(v);
	}

	//FIELD

	private Double _Flowduration=null;

	/**
	 * @return Returns the flowDuration.
	 */
	public Double getFlowduration() {
		return _Flowduration;
	}

	/**
	 * Sets the value for flowDuration.
	 * @param v Value to Set.
	 */
	public void setFlowduration(Double v){
		_Flowduration=v;
	}

	/**
	 * Sets the value for flowDuration.
	 * @param v Value to Set.
	 */
	public void setFlowduration(String v)  {
		_Flowduration=formatDouble(v);
	}

	//FIELD

	private String _Activeingredient=null;

	/**
	 * @return Returns the activeIngredient.
	 */
	public String getActiveingredient(){
		return _Activeingredient;
	}

	/**
	 * Sets the value for activeIngredient.
	 * @param v Value to Set.
	 */
	public void setActiveingredient(String v){
		_Activeingredient=v;
	}

	//FIELD

	private Double _Concentration=null;

	/**
	 * @return Returns the concentration.
	 */
	public Double getConcentration() {
		return _Concentration;
	}

	/**
	 * Sets the value for concentration.
	 * @param v Value to Set.
	 */
	public void setConcentration(Double v){
		_Concentration=v;
	}

	/**
	 * Sets the value for concentration.
	 * @param v Value to Set.
	 */
	public void setConcentration(String v)  {
		_Concentration=formatDouble(v);
	}

	//FIELD

	private Integer _XnatContrastbolusId=null;

	/**
	 * @return Returns the xnat_contrastBolus_id.
	 */
	public Integer getXnatContrastbolusId() {
		return _XnatContrastbolusId;
	}

	/**
	 * Sets the value for xnat_contrastBolus_id.
	 * @param v Value to Set.
	 */
	public void setXnatContrastbolusId(Integer v){
		_XnatContrastbolusId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("agent")){
			setAgent(v);
		}else if (xmlPath.equals("route")){
			setRoute(v);
		}else if (xmlPath.equals("volume")){
			setVolume(v);
		}else if (xmlPath.equals("totalDose")){
			setTotaldose(v);
		}else if (xmlPath.equals("flowRate")){
			setFlowrate(v);
		}else if (xmlPath.equals("flowDuration")){
			setFlowduration(v);
		}else if (xmlPath.equals("activeIngredient")){
			setActiveingredient(v);
		}else if (xmlPath.equals("concentration")){
			setConcentration(v);
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
		if (xmlPath.equals("agent")){
			return getAgent();
		}else if (xmlPath.equals("route")){
			return getRoute();
		}else if (xmlPath.equals("volume")){
			return getVolume();
		}else if (xmlPath.equals("totalDose")){
			return getTotaldose();
		}else if (xmlPath.equals("flowRate")){
			return getFlowrate();
		}else if (xmlPath.equals("flowDuration")){
			return getFlowduration();
		}else if (xmlPath.equals("activeIngredient")){
			return getActiveingredient();
		}else if (xmlPath.equals("concentration")){
			return getConcentration();
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
		if (xmlPath.equals("agent")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("route")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("volume")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("totalDose")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("flowRate")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("flowDuration")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("activeIngredient")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("concentration")){
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
		all_fields.add("agent");
		all_fields.add("route");
		all_fields.add("volume");
		all_fields.add("totalDose");
		all_fields.add("flowRate");
		all_fields.add("flowDuration");
		all_fields.add("activeIngredient");
		all_fields.add("concentration");
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
		writer.write("\n<xnat:contrastBolus");
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
		writer.write("\n</xnat:contrastBolus>");
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
		if (_Agent!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:agent");
			writer.write(">");
			writer.write(ValueParser(_Agent,"string"));
			writer.write("</xnat:agent>");
			header--;
		}
		if (_Route!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:route");
			writer.write(">");
			writer.write(ValueParser(_Route,"string"));
			writer.write("</xnat:route>");
			header--;
		}
		if (_Volume!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:volume");
			writer.write(">");
			writer.write(ValueParser(_Volume,"float"));
			writer.write("</xnat:volume>");
			header--;
		}
		if (_Totaldose!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:totalDose");
			writer.write(">");
			writer.write(ValueParser(_Totaldose,"float"));
			writer.write("</xnat:totalDose>");
			header--;
		}
		if (_Flowrate!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:flowRate");
			writer.write(">");
			writer.write(ValueParser(_Flowrate,"float"));
			writer.write("</xnat:flowRate>");
			header--;
		}
		if (_Flowduration!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:flowDuration");
			writer.write(">");
			writer.write(ValueParser(_Flowduration,"float"));
			writer.write("</xnat:flowDuration>");
			header--;
		}
		if (_Activeingredient!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:activeIngredient");
			writer.write(">");
			writer.write(ValueParser(_Activeingredient,"string"));
			writer.write("</xnat:activeIngredient>");
			header--;
		}
		if (_Concentration!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:concentration");
			writer.write(">");
			writer.write(ValueParser(_Concentration,"float"));
			writer.write("</xnat:concentration>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Agent!=null) return true;
		if (_Route!=null) return true;
		if (_Volume!=null) return true;
		if (_Totaldose!=null) return true;
		if (_Flowrate!=null) return true;
		if (_Flowduration!=null) return true;
		if (_Activeingredient!=null) return true;
		if (_Concentration!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
