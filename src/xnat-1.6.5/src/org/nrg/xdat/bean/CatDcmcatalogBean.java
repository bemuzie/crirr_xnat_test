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
public class CatDcmcatalogBean extends CatCatalogBean implements java.io.Serializable, org.nrg.xdat.model.CatDcmcatalogI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CatDcmcatalogBean.class);
	public static String SCHEMA_ELEMENT_NAME="cat:dcmCatalog";

	public String getSchemaElementName(){
		return "dcmCatalog";
	}

	public String getFullSchemaElementName(){
		return "cat:dcmCatalog";
	}

	//FIELD

	private Integer _Dimensions_x=null;

	/**
	 * @return Returns the dimensions/x.
	 */
	public Integer getDimensions_x(){
		return _Dimensions_x;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setDimensions_x(Integer v) {
		_Dimensions_x=v;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setDimensions_x(String v)  {
		_Dimensions_x=formatInteger(v);
	}

	//FIELD

	private Integer _Dimensions_y=null;

	/**
	 * @return Returns the dimensions/y.
	 */
	public Integer getDimensions_y(){
		return _Dimensions_y;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setDimensions_y(Integer v) {
		_Dimensions_y=v;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setDimensions_y(String v)  {
		_Dimensions_y=formatInteger(v);
	}

	//FIELD

	private Integer _Dimensions_z=null;

	/**
	 * @return Returns the dimensions/z.
	 */
	public Integer getDimensions_z(){
		return _Dimensions_z;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setDimensions_z(Integer v) {
		_Dimensions_z=v;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setDimensions_z(String v)  {
		_Dimensions_z=formatInteger(v);
	}

	//FIELD

	private Integer _Dimensions_volumes=null;

	/**
	 * @return Returns the dimensions/volumes.
	 */
	public Integer getDimensions_volumes(){
		return _Dimensions_volumes;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/volumes.
	 * @param v Value to Set.
	 */
	public void setDimensions_volumes(Integer v) {
		_Dimensions_volumes=v;
	}

	/**
	 * Sets the value for cat:dcmCatalog/dimensions/volumes.
	 * @param v Value to Set.
	 */
	public void setDimensions_volumes(String v)  {
		_Dimensions_volumes=formatInteger(v);
	}

	//FIELD

	private Double _Voxelres_x=null;

	/**
	 * @return Returns the voxelRes/x.
	 */
	public Double getVoxelres_x() {
		return _Voxelres_x;
	}

	/**
	 * Sets the value for voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setVoxelres_x(Double v){
		_Voxelres_x=v;
	}

	/**
	 * Sets the value for voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setVoxelres_x(String v)  {
		_Voxelres_x=formatDouble(v);
	}

	//FIELD

	private Double _Voxelres_y=null;

	/**
	 * @return Returns the voxelRes/y.
	 */
	public Double getVoxelres_y() {
		return _Voxelres_y;
	}

	/**
	 * Sets the value for voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setVoxelres_y(Double v){
		_Voxelres_y=v;
	}

	/**
	 * Sets the value for voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setVoxelres_y(String v)  {
		_Voxelres_y=formatDouble(v);
	}

	//FIELD

	private Double _Voxelres_z=null;

	/**
	 * @return Returns the voxelRes/z.
	 */
	public Double getVoxelres_z() {
		return _Voxelres_z;
	}

	/**
	 * Sets the value for voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setVoxelres_z(Double v){
		_Voxelres_z=v;
	}

	/**
	 * Sets the value for voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setVoxelres_z(String v)  {
		_Voxelres_z=formatDouble(v);
	}

	//FIELD

	private String _Voxelres_units=null;

	/**
	 * @return Returns the voxelRes/units.
	 */
	public String getVoxelres_units(){
		return _Voxelres_units;
	}

	/**
	 * Sets the value for voxelRes/units.
	 * @param v Value to Set.
	 */
	public void setVoxelres_units(String v){
		_Voxelres_units=v;
	}

	//FIELD

	private String _Orientation=null;

	/**
	 * @return Returns the orientation.
	 */
	public String getOrientation(){
		return _Orientation;
	}

	/**
	 * Sets the value for orientation.
	 * @param v Value to Set.
	 */
	public void setOrientation(String v){
		_Orientation=v;
	}

	//FIELD

	private String _Uid=null;

	/**
	 * @return Returns the UID.
	 */
	public String getUid(){
		return _Uid;
	}

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v){
		_Uid=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("dimensions/x")){
			setDimensions_x(v);
		}else if (xmlPath.equals("dimensions/y")){
			setDimensions_y(v);
		}else if (xmlPath.equals("dimensions/z")){
			setDimensions_z(v);
		}else if (xmlPath.equals("dimensions/volumes")){
			setDimensions_volumes(v);
		}else if (xmlPath.equals("voxelRes/x")){
			setVoxelres_x(v);
		}else if (xmlPath.equals("voxelRes/y")){
			setVoxelres_y(v);
		}else if (xmlPath.equals("voxelRes/z")){
			setVoxelres_z(v);
		}else if (xmlPath.equals("voxelRes/units")){
			setVoxelres_units(v);
		}else if (xmlPath.equals("orientation")){
			setOrientation(v);
		}else if (xmlPath.equals("UID")){
			setUid(v);
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
		if (xmlPath.equals("dimensions/x")){
			return getDimensions_x();
		}else if (xmlPath.equals("dimensions/y")){
			return getDimensions_y();
		}else if (xmlPath.equals("dimensions/z")){
			return getDimensions_z();
		}else if (xmlPath.equals("dimensions/volumes")){
			return getDimensions_volumes();
		}else if (xmlPath.equals("voxelRes/x")){
			return getVoxelres_x();
		}else if (xmlPath.equals("voxelRes/y")){
			return getVoxelres_y();
		}else if (xmlPath.equals("voxelRes/z")){
			return getVoxelres_z();
		}else if (xmlPath.equals("voxelRes/units")){
			return getVoxelres_units();
		}else if (xmlPath.equals("orientation")){
			return getOrientation();
		}else if (xmlPath.equals("UID")){
			return getUid();
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
		if (xmlPath.equals("dimensions/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dimensions/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dimensions/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dimensions/volumes")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("voxelRes/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("voxelRes/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("voxelRes/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("voxelRes/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("orientation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("UID")){
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
		all_fields.add("dimensions/x");
		all_fields.add("dimensions/y");
		all_fields.add("dimensions/z");
		all_fields.add("dimensions/volumes");
		all_fields.add("voxelRes/x");
		all_fields.add("voxelRes/y");
		all_fields.add("voxelRes/z");
		all_fields.add("voxelRes/units");
		all_fields.add("orientation");
		all_fields.add("UID");
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
		writer.write("\n<cat:DCMCatalog");
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
		writer.write("\n</cat:DCMCatalog>");
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
		if (_Uid!=null)
			map.put("UID",ValueParser(_Uid,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM dcmCatalog -> catalog
		TreeMap DimensionsATTMap = new TreeMap();
		String DimensionsATT = new String();
		if (_Dimensions_x!=null)
			DimensionsATTMap.put("x",ValueParser(_Dimensions_x,"integer"));
		if (_Dimensions_y!=null)
			DimensionsATTMap.put("y",ValueParser(_Dimensions_y,"integer"));
		if (_Dimensions_z!=null)
			DimensionsATTMap.put("z",ValueParser(_Dimensions_z,"integer"));
		if (_Dimensions_volumes!=null)
			DimensionsATTMap.put("volumes",ValueParser(_Dimensions_volumes,"integer"));
		java.util.Iterator iter0 =DimensionsATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			DimensionsATT +=" " + key + "=\"" + DimensionsATTMap.get(key) + "\"";
		}
		if(!DimensionsATT.equals("")){
			writer.write("\n" + createHeader(header) + "<cat:dimensions");
			writer.write(DimensionsATT);
			writer.write("/>");
		}

		TreeMap VoxelresATTMap = new TreeMap();
		String VoxelresATT = new String();
		if (_Voxelres_x!=null)
			VoxelresATTMap.put("x",ValueParser(_Voxelres_x,"float"));
		if (_Voxelres_y!=null)
			VoxelresATTMap.put("y",ValueParser(_Voxelres_y,"float"));
		if (_Voxelres_z!=null)
			VoxelresATTMap.put("z",ValueParser(_Voxelres_z,"float"));
		if (_Voxelres_units!=null)
			VoxelresATTMap.put("units",ValueParser(_Voxelres_units,"string"));
		java.util.Iterator iter1 =VoxelresATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			VoxelresATT +=" " + key + "=\"" + VoxelresATTMap.get(key) + "\"";
		}
		if(!VoxelresATT.equals("")){
			writer.write("\n" + createHeader(header) + "<cat:voxelRes");
			writer.write(VoxelresATT);
			writer.write("/>");
		}

		if (_Orientation!=null){
			writer.write("\n" + createHeader(header++) + "<cat:orientation");
			writer.write(">");
			writer.write(ValueParser(_Orientation,"string"));
			writer.write("</cat:orientation>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Dimensions_x!=null)
			return true;
		if (_Dimensions_y!=null)
			return true;
		if (_Dimensions_z!=null)
			return true;
		if (_Dimensions_volumes!=null)
			return true;
		if (_Voxelres_x!=null)
			return true;
		if (_Voxelres_y!=null)
			return true;
		if (_Voxelres_z!=null)
			return true;
		if (_Voxelres_units!=null)
			return true;
		if (_Orientation!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
