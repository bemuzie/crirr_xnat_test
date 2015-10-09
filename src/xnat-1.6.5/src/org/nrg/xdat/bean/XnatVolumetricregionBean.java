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
public class XnatVolumetricregionBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatVolumetricregionI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatVolumetricregionBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:volumetricRegion";

	public String getSchemaElementName(){
		return "volumetricRegion";
	}

	public String getFullSchemaElementName(){
		return "xnat:volumetricRegion";
	}
	 private List<org.nrg.xdat.bean.XnatVolumetricregionSubregionBean> _Subregions_subregion =new ArrayList<org.nrg.xdat.bean.XnatVolumetricregionSubregionBean>();

	/**
	 * subregions/subregion
	 * @return Returns an List of org.nrg.xdat.bean.XnatVolumetricregionSubregionBean
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionSubregionI> List<A> getSubregions_subregion() {
		return (List<A>) _Subregions_subregion;
	}

	/**
	 * Sets the value for subregions/subregion.
	 * @param v Value to Set.
	 */
	public void setSubregions_subregion(ArrayList<org.nrg.xdat.bean.XnatVolumetricregionSubregionBean> v){
		_Subregions_subregion=v;
	}

	/**
	 * Adds the value for subregions/subregion.
	 * @param v Value to Set.
	 */
	public void addSubregions_subregion(org.nrg.xdat.bean.XnatVolumetricregionSubregionBean v){
		_Subregions_subregion.add(v);
	}

	/**
	 * subregions/subregion
	 * Adds org.nrg.xdat.model.XnatVolumetricregionSubregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionSubregionI> void addSubregions_subregion(A item) throws Exception{
	_Subregions_subregion.add((org.nrg.xdat.bean.XnatVolumetricregionSubregionBean)item);
	}

	/**
	 * Adds the value for subregions/subregion.
	 * @param v Value to Set.
	 */
	public void addSubregions_subregion(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatVolumetricregionSubregionBean)
			_Subregions_subregion.add((org.nrg.xdat.bean.XnatVolumetricregionSubregionBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatVolumetricregionSubregionBean");
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

	private String _Units=null;

	/**
	 * @return Returns the units.
	 */
	public String getUnits(){
		return _Units;
	}

	/**
	 * Sets the value for units.
	 * @param v Value to Set.
	 */
	public void setUnits(String v){
		_Units=v;
	}

	//FIELD

	private Integer _Voxels=null;

	/**
	 * @return Returns the voxels.
	 */
	public Integer getVoxels(){
		return _Voxels;
	}

	/**
	 * Sets the value for xnat:volumetricRegion/voxels.
	 * @param v Value to Set.
	 */
	public void setVoxels(Integer v) {
		_Voxels=v;
	}

	/**
	 * Sets the value for xnat:volumetricRegion/voxels.
	 * @param v Value to Set.
	 */
	public void setVoxels(String v)  {
		_Voxels=formatInteger(v);
	}

	//FIELD

	private String _Hemisphere=null;

	/**
	 * @return Returns the hemisphere.
	 */
	public String getHemisphere(){
		return _Hemisphere;
	}

	/**
	 * Sets the value for hemisphere.
	 * @param v Value to Set.
	 */
	public void setHemisphere(String v){
		_Hemisphere=v;
	}

	//FIELD

	private Integer _XnatVolumetricregionId=null;

	/**
	 * @return Returns the xnat_volumetricRegion_id.
	 */
	public Integer getXnatVolumetricregionId() {
		return _XnatVolumetricregionId;
	}

	/**
	 * Sets the value for xnat_volumetricRegion_id.
	 * @param v Value to Set.
	 */
	public void setXnatVolumetricregionId(Integer v){
		_XnatVolumetricregionId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("units")){
			setUnits(v);
		}else if (xmlPath.equals("voxels")){
			setVoxels(v);
		}else if (xmlPath.equals("hemisphere")){
			setHemisphere(v);
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
		if (xmlPath.equals("subregions/subregion")){
			addSubregions_subregion(v);
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
		if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("units")){
			return getUnits();
		}else if (xmlPath.equals("voxels")){
			return getVoxels();
		}else if (xmlPath.equals("hemisphere")){
			return getHemisphere();
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
		if (xmlPath.equals("subregions/subregion")){
			return getSubregions_subregion();
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
		if (xmlPath.equals("subregions/subregion")){
			return "http://nrg.wustl.edu/xnat:volumetricRegion_subregion";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("subregions/subregion")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("voxels")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("hemisphere")){
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
		all_fields.add("subregions/subregion");
		all_fields.add("name");
		all_fields.add("units");
		all_fields.add("voxels");
		all_fields.add("hemisphere");
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
		writer.write("\n<xnat:volumetricRegion");
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
		writer.write("\n</xnat:volumetricRegion>");
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

		if (_Units!=null)
			map.put("units",ValueParser(_Units,"string"));
		//NOT REQUIRED FIELD

		if (_Voxels!=null)
			map.put("voxels",ValueParser(_Voxels,"integer"));
		//NOT REQUIRED FIELD

		if (_Hemisphere!=null)
			map.put("hemisphere",ValueParser(_Hemisphere,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Subregions_subregion.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:subregions");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM volumetricRegion -> subregions/subregion
		java.util.Iterator iter1=_Subregions_subregion.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatVolumetricregionSubregionBean child = (org.nrg.xdat.bean.XnatVolumetricregionSubregionBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:subregion");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:volumetricRegion_subregion")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:subregion>");
				}else{
					writer.write("</xnat:subregion>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:subregions>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Subregions_subregion.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
