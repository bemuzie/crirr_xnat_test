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
public class XnatOptscandataBean extends XnatImagescandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatOptscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatOptscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:optScanData";

	public String getSchemaElementName(){
		return "optScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:optScanData";
	}

	//FIELD

	private String _Parameters_voxelres_units=null;

	/**
	 * @return Returns the parameters/voxelRes/units.
	 */
	public String getParameters_voxelres_units(){
		return _Parameters_voxelres_units;
	}

	/**
	 * Sets the value for parameters/voxelRes/units.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_units(String v){
		_Parameters_voxelres_units=v;
	}

	//FIELD

	private Double _Parameters_voxelres_x=null;

	/**
	 * @return Returns the parameters/voxelRes/x.
	 */
	public Double getParameters_voxelres_x() {
		return _Parameters_voxelres_x;
	}

	/**
	 * Sets the value for parameters/voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_x(Double v){
		_Parameters_voxelres_x=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_x(String v)  {
		_Parameters_voxelres_x=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_voxelres_y=null;

	/**
	 * @return Returns the parameters/voxelRes/y.
	 */
	public Double getParameters_voxelres_y() {
		return _Parameters_voxelres_y;
	}

	/**
	 * Sets the value for parameters/voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_y(Double v){
		_Parameters_voxelres_y=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_y(String v)  {
		_Parameters_voxelres_y=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_voxelres_z=null;

	/**
	 * @return Returns the parameters/voxelRes/z.
	 */
	public Double getParameters_voxelres_z() {
		return _Parameters_voxelres_z;
	}

	/**
	 * Sets the value for parameters/voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_z(Double v){
		_Parameters_voxelres_z=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_z(String v)  {
		_Parameters_voxelres_z=formatDouble(v);
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
	 * Sets the value for xnat:optScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) {
		_Parameters_fov_x=v;
	}

	/**
	 * Sets the value for xnat:optScanData/parameters/fov/x.
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
	 * Sets the value for xnat:optScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) {
		_Parameters_fov_y=v;
	}

	/**
	 * Sets the value for xnat:optScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(String v)  {
		_Parameters_fov_y=formatInteger(v);
	}

	//FIELD

	private String _Parameters_laterality=null;

	/**
	 * @return Returns the parameters/laterality.
	 */
	public String getParameters_laterality(){
		return _Parameters_laterality;
	}

	/**
	 * Sets the value for parameters/laterality.
	 * @param v Value to Set.
	 */
	public void setParameters_laterality(String v){
		_Parameters_laterality=v;
	}

	//FIELD

	private String _Parameters_illuminationWavelength=null;

	/**
	 * @return Returns the parameters/illumination_wavelength.
	 */
	public String getParameters_illuminationWavelength(){
		return _Parameters_illuminationWavelength;
	}

	/**
	 * Sets the value for parameters/illumination_wavelength.
	 * @param v Value to Set.
	 */
	public void setParameters_illuminationWavelength(String v){
		_Parameters_illuminationWavelength=v;
	}

	//FIELD

	private String _Parameters_illuminationPower=null;

	/**
	 * @return Returns the parameters/illumination_power.
	 */
	public String getParameters_illuminationPower(){
		return _Parameters_illuminationPower;
	}

	/**
	 * Sets the value for parameters/illumination_power.
	 * @param v Value to Set.
	 */
	public void setParameters_illuminationPower(String v){
		_Parameters_illuminationPower=v;
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

	private String _Dcmvalidation=null;

	/**
	 * @return Returns the dcmValidation.
	 */
	public String getDcmvalidation(){
		return _Dcmvalidation;
	}

	/**
	 * Sets the value for dcmValidation.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation(String v){
		_Dcmvalidation=v;
	}

	//FIELD

	private Boolean _Dcmvalidation_status=null;

	/**
	 * @return Returns the dcmValidation/status.
	 */
	public Boolean getDcmvalidation_status() {
		return _Dcmvalidation_status;
	}

	/**
	 * Sets the value for dcmValidation/status.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation_status(Object v){
		if(v instanceof Boolean){
			_Dcmvalidation_status=(Boolean)v;
		}else if(v instanceof String){
			_Dcmvalidation_status=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/voxelRes/units")){
			setParameters_voxelres_units(v);
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			setParameters_voxelres_x(v);
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			setParameters_voxelres_y(v);
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			setParameters_voxelres_z(v);
		}else if (xmlPath.equals("parameters/fov/x")){
			setParameters_fov_x(v);
		}else if (xmlPath.equals("parameters/fov/y")){
			setParameters_fov_y(v);
		}else if (xmlPath.equals("parameters/laterality")){
			setParameters_laterality(v);
		}else if (xmlPath.equals("parameters/illumination_wavelength")){
			setParameters_illuminationWavelength(v);
		}else if (xmlPath.equals("parameters/illumination_power")){
			setParameters_illuminationPower(v);
		}else if (xmlPath.equals("parameters/imageType")){
			setParameters_imagetype(v);
		}else if (xmlPath.equals("dcmValidation")){
			setDcmvalidation(v);
		}else if (xmlPath.equals("dcmValidation/status")){
			setDcmvalidation_status(v);
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
		if (xmlPath.equals("parameters/voxelRes/units")){
			return getParameters_voxelres_units();
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			return getParameters_voxelres_x();
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			return getParameters_voxelres_y();
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			return getParameters_voxelres_z();
		}else if (xmlPath.equals("parameters/fov/x")){
			return getParameters_fov_x();
		}else if (xmlPath.equals("parameters/fov/y")){
			return getParameters_fov_y();
		}else if (xmlPath.equals("parameters/laterality")){
			return getParameters_laterality();
		}else if (xmlPath.equals("parameters/illumination_wavelength")){
			return getParameters_illuminationWavelength();
		}else if (xmlPath.equals("parameters/illumination_power")){
			return getParameters_illuminationPower();
		}else if (xmlPath.equals("parameters/imageType")){
			return getParameters_imagetype();
		}else if (xmlPath.equals("dcmValidation")){
			return getDcmvalidation();
		}else if (xmlPath.equals("dcmValidation/status")){
			return getDcmvalidation_status();
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
		if (xmlPath.equals("parameters/voxelRes/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/laterality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/illumination_wavelength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/illumination_power")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/imageType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmValidation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmValidation/status")){
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
		all_fields.add("parameters/voxelRes/units");
		all_fields.add("parameters/voxelRes/x");
		all_fields.add("parameters/voxelRes/y");
		all_fields.add("parameters/voxelRes/z");
		all_fields.add("parameters/fov/x");
		all_fields.add("parameters/fov/y");
		all_fields.add("parameters/laterality");
		all_fields.add("parameters/illumination_wavelength");
		all_fields.add("parameters/illumination_power");
		all_fields.add("parameters/imageType");
		all_fields.add("dcmValidation");
		all_fields.add("dcmValidation/status");
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
		writer.write("\n<xnat:OPTScan");
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
		writer.write("\n</xnat:OPTScan>");
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
		//REFERENCE FROM optScanData -> imageScanData
			int child0=0;
			int att0=0;
			if(_Parameters_laterality!=null)
			child0++;
			if(_Parameters_voxelres_units!=null)
			child0++;
			if(_Parameters_voxelres_z!=null)
			child0++;
			if(_Parameters_illuminationPower!=null)
			child0++;
			if(_Parameters_voxelres_y!=null)
			child0++;
			if(_Parameters_voxelres_x!=null)
			child0++;
			if(_Parameters_fov_y!=null)
			child0++;
			if(_Parameters_illuminationWavelength!=null)
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
		TreeMap Parameters_voxelresATTMap = new TreeMap();
		String Parameters_voxelresATT = new String();
		if (_Parameters_voxelres_units!=null)
			Parameters_voxelresATTMap.put("units",ValueParser(_Parameters_voxelres_units,"string"));
		if (_Parameters_voxelres_x!=null)
			Parameters_voxelresATTMap.put("x",ValueParser(_Parameters_voxelres_x,"float"));
		if (_Parameters_voxelres_y!=null)
			Parameters_voxelresATTMap.put("y",ValueParser(_Parameters_voxelres_y,"float"));
		if (_Parameters_voxelres_z!=null)
			Parameters_voxelresATTMap.put("z",ValueParser(_Parameters_voxelres_z,"float"));
		java.util.Iterator iter1 =Parameters_voxelresATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			Parameters_voxelresATT +=" " + key + "=\"" + Parameters_voxelresATTMap.get(key) + "\"";
		}
		if(!Parameters_voxelresATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:voxelRes");
			writer.write(Parameters_voxelresATT);
			writer.write("/>");
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

		if (_Parameters_laterality!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:laterality");
			writer.write(">");
			writer.write(ValueParser(_Parameters_laterality,"string"));
			writer.write("</xnat:laterality>");
			header--;
		}
		if (_Parameters_illuminationWavelength!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:illumination_wavelength");
			writer.write(">");
			writer.write(ValueParser(_Parameters_illuminationWavelength,"string"));
			writer.write("</xnat:illumination_wavelength>");
			header--;
		}
		if (_Parameters_illuminationPower!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:illumination_power");
			writer.write(">");
			writer.write(ValueParser(_Parameters_illuminationPower,"string"));
			writer.write("</xnat:illumination_power>");
			header--;
		}
		if (_Parameters_imagetype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_imagetype,"string"));
			writer.write("</xnat:imageType>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

		TreeMap DcmvalidationATTMap = new TreeMap();
		String DcmvalidationATT = new String();
		if (_Dcmvalidation_status!=null)
			DcmvalidationATTMap.put("status",ValueParser(_Dcmvalidation_status,"boolean"));
		java.util.Iterator iter3 =DcmvalidationATTMap.keySet().iterator();
		while(iter3.hasNext()){
			String key = (String)iter3.next();
			DcmvalidationATT +=" " + key + "=\"" + DcmvalidationATTMap.get(key) + "\"";
		}
		if (_Dcmvalidation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmValidation");
			writer.write(DcmvalidationATT);
			writer.write(">");
			writer.write(ValueParser(_Dcmvalidation,"string"));
			writer.write("</xnat:dcmValidation>");
			header--;
		}
		else if(!DcmvalidationATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmValidation");
			writer.write(DcmvalidationATT);
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Parameters_laterality!=null) return true;
			if(_Parameters_voxelres_units!=null) return true;
			if(_Parameters_voxelres_z!=null) return true;
			if(_Parameters_illuminationPower!=null) return true;
			if(_Parameters_voxelres_y!=null) return true;
			if(_Parameters_voxelres_x!=null) return true;
			if(_Parameters_fov_y!=null) return true;
			if(_Parameters_illuminationWavelength!=null) return true;
			if(_Parameters_imagetype!=null) return true;
			if(_Parameters_fov_x!=null) return true;
		if (_Dcmvalidation_status!=null)
			return true;
		if (_Dcmvalidation!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
