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
public class XnatXascandataBean extends XnatImagescandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatXascandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatXascandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:xaScanData";

	public String getSchemaElementName(){
		return "xaScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:xaScanData";
	}

	//FIELD

	private String _Parameters_pixelres_units=null;

	/**
	 * @return Returns the parameters/pixelRes/units.
	 */
	public String getParameters_pixelres_units(){
		return _Parameters_pixelres_units;
	}

	/**
	 * Sets the value for parameters/pixelRes/units.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_units(String v){
		_Parameters_pixelres_units=v;
	}

	//FIELD

	private Integer _Parameters_pixelres_x=null;

	/**
	 * @return Returns the parameters/pixelRes/x.
	 */
	public Integer getParameters_pixelres_x(){
		return _Parameters_pixelres_x;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_x(Integer v) {
		_Parameters_pixelres_x=v;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_x(String v)  {
		_Parameters_pixelres_x=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_pixelres_y=null;

	/**
	 * @return Returns the parameters/pixelRes/y.
	 */
	public Integer getParameters_pixelres_y(){
		return _Parameters_pixelres_y;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_y(Integer v) {
		_Parameters_pixelres_y=v;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_y(String v)  {
		_Parameters_pixelres_y=formatInteger(v);
	}

	//FIELD

	private String _Parameters_orientation=null;

	/**
	 * @return Returns the parameters/orientation.
	 */
	public String getParameters_orientation(){
		return _Parameters_orientation;
	}

	/**
	 * Sets the value for parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(String v){
		_Parameters_orientation=v;
	}

	//FIELD

	private Integer _Parameters_fov_x=null;

	/**
	 * @return Returns the parameters/fov/x.
	 */
	public Integer getParameters_fov_x(){
		return _Parameters_fov_x;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) {
		_Parameters_fov_x=v;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(String v)  {
		_Parameters_fov_x=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_fov_y=null;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y(){
		return _Parameters_fov_y;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) {
		_Parameters_fov_y=v;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(String v)  {
		_Parameters_fov_y=formatInteger(v);
	}

	//FIELD

	private String _Parameters_imagetype=null;

	/**
	 * @return Returns the parameters/imageType.
	 */
	public String getParameters_imagetype(){
		return _Parameters_imagetype;
	}

	/**
	 * Sets the value for parameters/imageType.
	 * @param v Value to Set.
	 */
	public void setParameters_imagetype(String v){
		_Parameters_imagetype=v;
	}

	//FIELD

	private String _Parameters_options=null;

	/**
	 * @return Returns the parameters/options.
	 */
	public String getParameters_options(){
		return _Parameters_options;
	}

	/**
	 * Sets the value for parameters/options.
	 * @param v Value to Set.
	 */
	public void setParameters_options(String v){
		_Parameters_options=v;
	}

	//FIELD

	private String _Parameters_derivation=null;

	/**
	 * @return Returns the parameters/derivation.
	 */
	public String getParameters_derivation(){
		return _Parameters_derivation;
	}

	/**
	 * Sets the value for parameters/derivation.
	 * @param v Value to Set.
	 */
	public void setParameters_derivation(String v){
		_Parameters_derivation=v;
	}
	 private org.nrg.xdat.bean.XnatContrastbolusBean _Parameters_contrastbolus =null;

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.bean.XnatContrastbolusBean
	 */
	public org.nrg.xdat.bean.XnatContrastbolusBean getParameters_contrastbolus() {
		return _Parameters_contrastbolus;
	}

	/**
	 * Sets the value for parameters/contrastBolus.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolus(org.nrg.xdat.bean.XnatContrastbolusBean v){
		_Parameters_contrastbolus =v;
	}

	/**
	 * Sets the value for parameters/contrastBolus.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolus(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatContrastbolusBean)
			_Parameters_contrastbolus =(org.nrg.xdat.bean.XnatContrastbolusBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatContrastbolusBean");
	}

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.model.XnatContrastbolusI
	 */
	public <A extends org.nrg.xdat.model.XnatContrastbolusI> void setParameters_contrastbolus(A item) throws Exception{
	setParameters_contrastbolus((org.nrg.xdat.bean.XnatContrastbolusBean)item);
	}

	//FIELD

	private Integer _Parameters_contrastbolusFK=null;

	/**
	 * @return Returns the xnat:xaScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 */
	public Integer getParameters_contrastbolusFK(){
		return _Parameters_contrastbolusFK;
	}

	/**
	 * Sets the value for xnat:xaScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolusFK(Integer v) {
		_Parameters_contrastbolusFK=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/pixelRes/units")){
			setParameters_pixelres_units(v);
		}else if (xmlPath.equals("parameters/pixelRes/x")){
			setParameters_pixelres_x(v);
		}else if (xmlPath.equals("parameters/pixelRes/y")){
			setParameters_pixelres_y(v);
		}else if (xmlPath.equals("parameters/orientation")){
			setParameters_orientation(v);
		}else if (xmlPath.equals("parameters/fov/x")){
			setParameters_fov_x(v);
		}else if (xmlPath.equals("parameters/fov/y")){
			setParameters_fov_y(v);
		}else if (xmlPath.equals("parameters/imageType")){
			setParameters_imagetype(v);
		}else if (xmlPath.equals("parameters/options")){
			setParameters_options(v);
		}else if (xmlPath.equals("parameters/derivation")){
			setParameters_derivation(v);
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
		if (xmlPath.equals("parameters/contrastBolus")){
			setParameters_contrastbolus(v);
		}
		else{
			super.setReferenceField(xmlPath,v);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/pixelRes/units")){
			return getParameters_pixelres_units();
		}else if (xmlPath.equals("parameters/pixelRes/x")){
			return getParameters_pixelres_x();
		}else if (xmlPath.equals("parameters/pixelRes/y")){
			return getParameters_pixelres_y();
		}else if (xmlPath.equals("parameters/orientation")){
			return getParameters_orientation();
		}else if (xmlPath.equals("parameters/fov/x")){
			return getParameters_fov_x();
		}else if (xmlPath.equals("parameters/fov/y")){
			return getParameters_fov_y();
		}else if (xmlPath.equals("parameters/imageType")){
			return getParameters_imagetype();
		}else if (xmlPath.equals("parameters/options")){
			return getParameters_options();
		}else if (xmlPath.equals("parameters/derivation")){
			return getParameters_derivation();
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
		if (xmlPath.equals("parameters/contrastBolus")){
			return getParameters_contrastbolus();
		}
		else{
			return super.getReferenceField(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/contrastBolus")){
			return "http://nrg.wustl.edu/xnat:contrastBolus";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/pixelRes/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelRes/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelRes/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/orientation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/imageType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/options")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/derivation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/contrastBolus")){
			return BaseElement.field_single_reference;
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
		all_fields.add("parameters/pixelRes/units");
		all_fields.add("parameters/pixelRes/x");
		all_fields.add("parameters/pixelRes/y");
		all_fields.add("parameters/orientation");
		all_fields.add("parameters/fov/x");
		all_fields.add("parameters/fov/y");
		all_fields.add("parameters/imageType");
		all_fields.add("parameters/options");
		all_fields.add("parameters/derivation");
		all_fields.add("parameters/contrastBolus");
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
		writer.write("\n<xnat:XAScan");
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
		writer.write("\n</xnat:XAScan>");
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
		//REFERENCE FROM xaScanData -> imageScanData
			int child0=0;
			int att0=0;
			if(_Parameters_options!=null)
			child0++;
			if(_Parameters_derivation!=null)
			child0++;
			if(_Parameters_contrastbolus!=null)
			child0++;
			if(_Parameters_pixelres_y!=null)
			child0++;
			if(_Parameters_pixelres_x!=null)
			child0++;
			if(_Parameters_pixelres_units!=null)
			child0++;
			if(_Parameters_orientation!=null)
			child0++;
			if(_Parameters_fov_y!=null)
			child0++;
			if(_Parameters_imagetype!=null)
			child0++;
			if(_Parameters_fov_x!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:parameters");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		TreeMap Parameters_pixelresATTMap = new TreeMap();
		String Parameters_pixelresATT = new String();
		if (_Parameters_pixelres_units!=null)
			Parameters_pixelresATTMap.put("units",ValueParser(_Parameters_pixelres_units,"string"));
		if (_Parameters_pixelres_x!=null)
			Parameters_pixelresATTMap.put("x",ValueParser(_Parameters_pixelres_x,"integer"));
		if (_Parameters_pixelres_y!=null)
			Parameters_pixelresATTMap.put("y",ValueParser(_Parameters_pixelres_y,"integer"));
		java.util.Iterator iter1 =Parameters_pixelresATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			Parameters_pixelresATT +=" " + key + "=\"" + Parameters_pixelresATTMap.get(key) + "\"";
		}
		if(!Parameters_pixelresATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:pixelRes");
			writer.write(Parameters_pixelresATT);
			writer.write("/>");
		}

		if (_Parameters_orientation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:orientation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_orientation,"string"));
			writer.write("</xnat:orientation>");
			header--;
		}
		TreeMap Parameters_fovATTMap = new TreeMap();
		String Parameters_fovATT = new String();
		if (_Parameters_fov_x!=null)
			Parameters_fovATTMap.put("x",ValueParser(_Parameters_fov_x,"integer"));
		if (_Parameters_fov_y!=null)
			Parameters_fovATTMap.put("y",ValueParser(_Parameters_fov_y,"integer"));
		java.util.Iterator iter2 =Parameters_fovATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			Parameters_fovATT +=" " + key + "=\"" + Parameters_fovATTMap.get(key) + "\"";
		}
		if(!Parameters_fovATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:fov");
			writer.write(Parameters_fovATT);
			writer.write("/>");
		}

		if (_Parameters_imagetype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_imagetype,"string"));
			writer.write("</xnat:imageType>");
			header--;
		}
		if (_Parameters_options!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:options");
			writer.write(">");
			writer.write(ValueParser(_Parameters_options,"string"));
			writer.write("</xnat:options>");
			header--;
		}
		if (_Parameters_derivation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:derivation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_derivation,"string"));
			writer.write("</xnat:derivation>");
			header--;
		}
		//REFERENCE FROM xaScanData -> parameters/contrastBolus
		//DATA-FIELD FROM xaScanData -> parameters/contrastBolus
		if (_Parameters_contrastbolus!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:contrastBolus");
			_Parameters_contrastbolus.addXMLAtts(writer);
			if(!_Parameters_contrastbolus.getFullSchemaElementName().equals("xnat:contrastBolus")){
				writer.write(" xsi:type=\"" + _Parameters_contrastbolus.getFullSchemaElementName() + "\"");
			}
			if (_Parameters_contrastbolus.hasXMLBodyContent()){
				writer.write(">");
				boolean return3 =_Parameters_contrastbolus.addXMLBody(writer,header);
				if(return3){
					writer.write("\n" + createHeader(--header) + "</xnat:contrastBolus>");
				}else{
					writer.write("</xnat:contrastBolus>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Parameters_options!=null) return true;
			if(_Parameters_derivation!=null) return true;
			if(_Parameters_contrastbolus!=null) return true;
			if(_Parameters_pixelres_y!=null) return true;
			if(_Parameters_pixelres_x!=null) return true;
			if(_Parameters_pixelres_units!=null) return true;
			if(_Parameters_orientation!=null) return true;
			if(_Parameters_fov_y!=null) return true;
			if(_Parameters_imagetype!=null) return true;
			if(_Parameters_fov_x!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
