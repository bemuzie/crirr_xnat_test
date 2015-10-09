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
public class XnatQcassessmentdataScanBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatQcassessmentdataScanI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatQcassessmentdataScanBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:qcAssessmentData_scan";

	public String getSchemaElementName(){
		return "qcAssessmentData_scan";
	}

	public String getFullSchemaElementName(){
		return "xnat:qcAssessmentData_scan";
	}
	 private List<org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean> _Sliceqc_slice =new ArrayList<org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean>();

	/**
	 * sliceQC/slice
	 * @return Returns an List of org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanSliceI> List<A> getSliceqc_slice() {
		return (List<A>) _Sliceqc_slice;
	}

	/**
	 * Sets the value for sliceQC/slice.
	 * @param v Value to Set.
	 */
	public void setSliceqc_slice(ArrayList<org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean> v){
		_Sliceqc_slice=v;
	}

	/**
	 * Adds the value for sliceQC/slice.
	 * @param v Value to Set.
	 */
	public void addSliceqc_slice(org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean v){
		_Sliceqc_slice.add(v);
	}

	/**
	 * sliceQC/slice
	 * Adds org.nrg.xdat.model.XnatQcassessmentdataScanSliceI
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanSliceI> void addSliceqc_slice(A item) throws Exception{
	_Sliceqc_slice.add((org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean)item);
	}

	/**
	 * Adds the value for sliceQC/slice.
	 * @param v Value to Set.
	 */
	public void addSliceqc_slice(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean)
			_Sliceqc_slice.add((org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean");
	}
	 private org.nrg.xdat.bean.XnatAbstractstatisticsBean _Scanstatistics =null;

	/**
	 * scanStatistics
	 * @return org.nrg.xdat.bean.XnatAbstractstatisticsBean
	 */
	public org.nrg.xdat.bean.XnatAbstractstatisticsBean getScanstatistics() {
		return _Scanstatistics;
	}

	/**
	 * Sets the value for scanStatistics.
	 * @param v Value to Set.
	 */
	public void setScanstatistics(org.nrg.xdat.bean.XnatAbstractstatisticsBean v){
		_Scanstatistics =v;
	}

	/**
	 * Sets the value for scanStatistics.
	 * @param v Value to Set.
	 */
	public void setScanstatistics(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractstatisticsBean)
			_Scanstatistics =(org.nrg.xdat.bean.XnatAbstractstatisticsBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractstatisticsBean");
	}

	/**
	 * scanStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractstatisticsI> void setScanstatistics(A item) throws Exception{
	setScanstatistics((org.nrg.xdat.bean.XnatAbstractstatisticsBean)item);
	}

	//FIELD

	private Integer _ScanstatisticsFK=null;

	/**
	 * @return Returns the xnat:qcAssessmentData_scan/scanstatistics_xnat_abstractstatistics_id.
	 */
	public Integer getScanstatisticsFK(){
		return _ScanstatisticsFK;
	}

	/**
	 * Sets the value for xnat:qcAssessmentData_scan/scanstatistics_xnat_abstractstatistics_id.
	 * @param v Value to Set.
	 */
	public void setScanstatisticsFK(Integer v) {
		_ScanstatisticsFK=v;
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the id.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private Integer _XnatQcassessmentdataScanId=null;

	/**
	 * @return Returns the xnat_qcAssessmentData_scan_id.
	 */
	public Integer getXnatQcassessmentdataScanId() {
		return _XnatQcassessmentdataScanId;
	}

	/**
	 * Sets the value for xnat_qcAssessmentData_scan_id.
	 * @param v Value to Set.
	 */
	public void setXnatQcassessmentdataScanId(Integer v){
		_XnatQcassessmentdataScanId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("id")){
			setId(v);
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
		if (xmlPath.equals("sliceQC/slice")){
			addSliceqc_slice(v);
		}else if (xmlPath.equals("scanStatistics")){
			setScanstatistics(v);
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
		if (xmlPath.equals("id")){
			return getId();
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
		if (xmlPath.equals("sliceQC/slice")){
			return getSliceqc_slice();
		}else if (xmlPath.equals("scanStatistics")){
			return getScanstatistics();
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
		if (xmlPath.equals("sliceQC/slice")){
			return "http://nrg.wustl.edu/xnat:qcAssessmentData_scan_slice";
		}else if (xmlPath.equals("scanStatistics")){
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
		if (xmlPath.equals("sliceQC/slice")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("scanStatistics")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("id")){
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
		all_fields.add("sliceQC/slice");
		all_fields.add("scanStatistics");
		all_fields.add("id");
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
		writer.write("\n<xnat:qcAssessmentData_scan");
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
		writer.write("\n</xnat:qcAssessmentData_scan>");
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
		if (_Id!=null)
			map.put("id",ValueParser(_Id,"string"));
		else map.put("id","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Sliceqc_slice.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:sliceQC");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM qcAssessmentData_scan -> sliceQC/slice
		java.util.Iterator iter1=_Sliceqc_slice.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean child = (org.nrg.xdat.bean.XnatQcassessmentdataScanSliceBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:slice");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:qcAssessmentData_scan_slice")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:slice>");
				}else{
					writer.write("</xnat:slice>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:sliceQC>");
			}
			}

		//REFERENCE FROM qcAssessmentData_scan -> scanStatistics
		//DATA-FIELD FROM qcAssessmentData_scan -> scanStatistics
		if (_Scanstatistics!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:scanStatistics");
			_Scanstatistics.addXMLAtts(writer);
			if(!_Scanstatistics.getFullSchemaElementName().equals("xnat:abstractStatistics")){
				writer.write(" xsi:type=\"" + _Scanstatistics.getFullSchemaElementName() + "\"");
			}
			if (_Scanstatistics.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =_Scanstatistics.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:scanStatistics>");
				}else{
					writer.write("</xnat:scanStatistics>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Sliceqc_slice.size()>0)return true;
		if (_Scanstatistics!=null){
			if (_Scanstatistics.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
