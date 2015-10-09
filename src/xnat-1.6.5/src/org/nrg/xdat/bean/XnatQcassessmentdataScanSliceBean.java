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
public class XnatQcassessmentdataScanSliceBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatQcassessmentdataScanSliceI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatQcassessmentdataScanSliceBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:qcAssessmentData_scan_slice";

	public String getSchemaElementName(){
		return "qcAssessmentData_scan_slice";
	}

	public String getFullSchemaElementName(){
		return "xnat:qcAssessmentData_scan_slice";
	}
	 private org.nrg.xdat.bean.XnatAbstractstatisticsBean _Slicestatistics =null;

	/**
	 * sliceStatistics
	 * @return org.nrg.xdat.bean.XnatAbstractstatisticsBean
	 */
	public org.nrg.xdat.bean.XnatAbstractstatisticsBean getSlicestatistics() {
		return _Slicestatistics;
	}

	/**
	 * Sets the value for sliceStatistics.
	 * @param v Value to Set.
	 */
	public void setSlicestatistics(org.nrg.xdat.bean.XnatAbstractstatisticsBean v){
		_Slicestatistics =v;
	}

	/**
	 * Sets the value for sliceStatistics.
	 * @param v Value to Set.
	 */
	public void setSlicestatistics(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractstatisticsBean)
			_Slicestatistics =(org.nrg.xdat.bean.XnatAbstractstatisticsBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractstatisticsBean");
	}

	/**
	 * sliceStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractstatisticsI> void setSlicestatistics(A item) throws Exception{
	setSlicestatistics((org.nrg.xdat.bean.XnatAbstractstatisticsBean)item);
	}

	//FIELD

	private Integer _SlicestatisticsFK=null;

	/**
	 * @return Returns the xnat:qcAssessmentData_scan_slice/slicestatistics_xnat_abstractstatistics_id.
	 */
	public Integer getSlicestatisticsFK(){
		return _SlicestatisticsFK;
	}

	/**
	 * Sets the value for xnat:qcAssessmentData_scan_slice/slicestatistics_xnat_abstractstatistics_id.
	 * @param v Value to Set.
	 */
	public void setSlicestatisticsFK(Integer v) {
		_SlicestatisticsFK=v;
	}

	//FIELD

	private String _Number=null;

	/**
	 * @return Returns the number.
	 */
	public String getNumber(){
		return _Number;
	}

	/**
	 * Sets the value for number.
	 * @param v Value to Set.
	 */
	public void setNumber(String v){
		_Number=v;
	}

	//FIELD

	private Integer _XnatQcassessmentdataScanSliceId=null;

	/**
	 * @return Returns the xnat_qcAssessmentData_scan_slice_id.
	 */
	public Integer getXnatQcassessmentdataScanSliceId() {
		return _XnatQcassessmentdataScanSliceId;
	}

	/**
	 * Sets the value for xnat_qcAssessmentData_scan_slice_id.
	 * @param v Value to Set.
	 */
	public void setXnatQcassessmentdataScanSliceId(Integer v){
		_XnatQcassessmentdataScanSliceId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("number")){
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
		if (xmlPath.equals("sliceStatistics")){
			setSlicestatistics(v);
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
		if (xmlPath.equals("number")){
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
		if (xmlPath.equals("sliceStatistics")){
			return getSlicestatistics();
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
		if (xmlPath.equals("sliceStatistics")){
			return "http://nrg.wustl.edu/xnat:abstractStatistics";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("sliceStatistics")){
			return BaseElement.field_single_reference;
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
		all_fields.add("sliceStatistics");
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
		writer.write("\n<xnat:qcAssessmentData_scan_slice");
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
		writer.write("\n</xnat:qcAssessmentData_scan_slice>");
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
		if (_Number!=null)
			map.put("number",ValueParser(_Number,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM qcAssessmentData_scan_slice -> sliceStatistics
		//DATA-FIELD FROM qcAssessmentData_scan_slice -> sliceStatistics
		if (_Slicestatistics!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:sliceStatistics");
			_Slicestatistics.addXMLAtts(writer);
			if(!_Slicestatistics.getFullSchemaElementName().equals("xnat:abstractStatistics")){
				writer.write(" xsi:type=\"" + _Slicestatistics.getFullSchemaElementName() + "\"");
			}
			if (_Slicestatistics.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Slicestatistics.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</xnat:sliceStatistics>");
				}else{
					writer.write("</xnat:sliceStatistics>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Slicestatistics!=null){
			if (_Slicestatistics.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
