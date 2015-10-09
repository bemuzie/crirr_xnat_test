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
public class ExtSegmentationfastdataBean extends XnatMrassessordataBean implements java.io.Serializable, org.nrg.xdat.model.ExtSegmentationfastdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ExtSegmentationfastdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="ext:segmentationFastData";

	public String getSchemaElementName(){
		return "segmentationFastData";
	}

	public String getFullSchemaElementName(){
		return "ext:segmentationFastData";
	}
	 private org.nrg.xdat.bean.XnatVolumetricregionBean _Brainvolume =null;

	/**
	 * brainVolume
	 * @return org.nrg.xdat.bean.XnatVolumetricregionBean
	 */
	public org.nrg.xdat.bean.XnatVolumetricregionBean getBrainvolume() {
		return _Brainvolume;
	}

	/**
	 * Sets the value for brainVolume.
	 * @param v Value to Set.
	 */
	public void setBrainvolume(org.nrg.xdat.bean.XnatVolumetricregionBean v){
		_Brainvolume =v;
	}

	/**
	 * Sets the value for brainVolume.
	 * @param v Value to Set.
	 */
	public void setBrainvolume(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatVolumetricregionBean)
			_Brainvolume =(org.nrg.xdat.bean.XnatVolumetricregionBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatVolumetricregionBean");
	}

	/**
	 * brainVolume
	 * @return org.nrg.xdat.model.XnatVolumetricregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionI> void setBrainvolume(A item) throws Exception{
	setBrainvolume((org.nrg.xdat.bean.XnatVolumetricregionBean)item);
	}

	//FIELD

	private Integer _BrainvolumeFK=null;

	/**
	 * @return Returns the ext:segmentationFastData/brainvolume_xnat_volumetricregion_id.
	 */
	public Integer getBrainvolumeFK(){
		return _BrainvolumeFK;
	}

	/**
	 * Sets the value for ext:segmentationFastData/brainvolume_xnat_volumetricregion_id.
	 * @param v Value to Set.
	 */
	public void setBrainvolumeFK(Integer v) {
		_BrainvolumeFK=v;
	}

	//FIELD

	private Double _Brainpercent=null;

	/**
	 * @return Returns the brainPercent.
	 */
	public Double getBrainpercent() {
		return _Brainpercent;
	}

	/**
	 * Sets the value for brainPercent.
	 * @param v Value to Set.
	 */
	public void setBrainpercent(Double v){
		_Brainpercent=v;
	}

	/**
	 * Sets the value for brainPercent.
	 * @param v Value to Set.
	 */
	public void setBrainpercent(String v)  {
		_Brainpercent=formatDouble(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("brainPercent")){
			setBrainpercent(v);
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
		if (xmlPath.equals("brainVolume")){
			setBrainvolume(v);
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
		if (xmlPath.equals("brainPercent")){
			return getBrainpercent();
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
		if (xmlPath.equals("brainVolume")){
			return getBrainvolume();
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
		if (xmlPath.equals("brainVolume")){
			return "http://nrg.wustl.edu/xnat:volumetricRegion";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("brainVolume")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("brainPercent")){
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
		all_fields.add("brainVolume");
		all_fields.add("brainPercent");
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
		writer.write("\n<ext:SegmentationFast");
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
		writer.write("\n</ext:SegmentationFast>");
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
		if (_Brainpercent!=null)
			map.put("brainPercent",ValueParser(_Brainpercent,"float"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM segmentationFastData -> mrAssessorData
		//REFERENCE FROM segmentationFastData -> brainVolume
		//DATA-FIELD FROM segmentationFastData -> brainVolume
		if (_Brainvolume!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<ext:brainVolume");
			_Brainvolume.addXMLAtts(writer);
			if(!_Brainvolume.getFullSchemaElementName().equals("xnat:volumetricRegion")){
				writer.write(" xsi:type=\"" + _Brainvolume.getFullSchemaElementName() + "\"");
			}
			if (_Brainvolume.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Brainvolume.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</ext:brainVolume>");
				}else{
					writer.write("</ext:brainVolume>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		else{
			writer.write("\n" + createHeader(header) + "<ext:brainVolume/>");//REQUIRED
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Brainvolume!=null){
			if (_Brainvolume.hasXMLBodyContent()) return true;
		}
		return true;//REQUIRED brainVolume
	}
}
