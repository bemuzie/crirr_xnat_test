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
public class XnatQcmanualassessordataBean extends XnatImageassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatQcmanualassessordataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatQcmanualassessordataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:qcManualAssessorData";

	public String getSchemaElementName(){
		return "qcManualAssessorData";
	}

	public String getFullSchemaElementName(){
		return "xnat:qcManualAssessorData";
	}

	//FIELD

	private String _Rater=null;

	/**
	 * @return Returns the rater.
	 */
	public String getRater(){
		return _Rater;
	}

	/**
	 * Sets the value for rater.
	 * @param v Value to Set.
	 */
	public void setRater(String v){
		_Rater=v;
	}

	//FIELD

	private String _Stereotacticmarker=null;

	/**
	 * @return Returns the stereotacticMarker.
	 */
	public String getStereotacticmarker(){
		return _Stereotacticmarker;
	}

	/**
	 * Sets the value for stereotacticMarker.
	 * @param v Value to Set.
	 */
	public void setStereotacticmarker(String v){
		_Stereotacticmarker=v;
	}

	//FIELD

	private String _Incidentalfindings=null;

	/**
	 * @return Returns the incidentalFindings.
	 */
	public String getIncidentalfindings(){
		return _Incidentalfindings;
	}

	/**
	 * Sets the value for incidentalFindings.
	 * @param v Value to Set.
	 */
	public void setIncidentalfindings(String v){
		_Incidentalfindings=v;
	}
	 private List<org.nrg.xdat.bean.XnatQcscandataBean> _Scans_scan =new ArrayList<org.nrg.xdat.bean.XnatQcscandataBean>();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.bean.XnatQcscandataBean
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataI> List<A> getScans_scan() {
		return (List<A>) _Scans_scan;
	}

	/**
	 * Sets the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void setScans_scan(ArrayList<org.nrg.xdat.bean.XnatQcscandataBean> v){
		_Scans_scan=v;
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(org.nrg.xdat.bean.XnatQcscandataBean v){
		_Scans_scan.add(v);
	}

	/**
	 * scans/scan
	 * Adds org.nrg.xdat.model.XnatQcscandataI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataI> void addScans_scan(A item) throws Exception{
	_Scans_scan.add((org.nrg.xdat.bean.XnatQcscandataBean)item);
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatQcscandataBean)
			_Scans_scan.add((org.nrg.xdat.bean.XnatQcscandataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatQcscandataBean");
	}

	//FIELD

	private String _Comments=null;

	/**
	 * @return Returns the comments.
	 */
	public String getComments(){
		return _Comments;
	}

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v){
		_Comments=v;
	}

	//FIELD

	private String _Pass=null;

	/**
	 * @return Returns the pass.
	 */
	public String getPass(){
		return _Pass;
	}

	/**
	 * Sets the value for pass.
	 * @param v Value to Set.
	 */
	public void setPass(String v){
		_Pass=v;
	}

	//FIELD

	private String _Payable=null;

	/**
	 * @return Returns the payable.
	 */
	public String getPayable(){
		return _Payable;
	}

	/**
	 * Sets the value for payable.
	 * @param v Value to Set.
	 */
	public void setPayable(String v){
		_Payable=v;
	}

	//FIELD

	private String _Rescan=null;

	/**
	 * @return Returns the rescan.
	 */
	public String getRescan(){
		return _Rescan;
	}

	/**
	 * Sets the value for rescan.
	 * @param v Value to Set.
	 */
	public void setRescan(String v){
		_Rescan=v;
	}

	//FIELD

	private String _Resolvable=null;

	/**
	 * @return Returns the resolvable.
	 */
	public String getResolvable(){
		return _Resolvable;
	}

	/**
	 * Sets the value for resolvable.
	 * @param v Value to Set.
	 */
	public void setResolvable(String v){
		_Resolvable=v;
	}

	//FIELD

	private String _Retrain=null;

	/**
	 * @return Returns the retrain.
	 */
	public String getRetrain(){
		return _Retrain;
	}

	/**
	 * Sets the value for retrain.
	 * @param v Value to Set.
	 */
	public void setRetrain(String v){
		_Retrain=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("rater")){
			setRater(v);
		}else if (xmlPath.equals("stereotacticMarker")){
			setStereotacticmarker(v);
		}else if (xmlPath.equals("incidentalFindings")){
			setIncidentalfindings(v);
		}else if (xmlPath.equals("comments")){
			setComments(v);
		}else if (xmlPath.equals("pass")){
			setPass(v);
		}else if (xmlPath.equals("payable")){
			setPayable(v);
		}else if (xmlPath.equals("rescan")){
			setRescan(v);
		}else if (xmlPath.equals("resolvable")){
			setResolvable(v);
		}else if (xmlPath.equals("retrain")){
			setRetrain(v);
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
		if (xmlPath.equals("scans/scan")){
			addScans_scan(v);
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
		if (xmlPath.equals("rater")){
			return getRater();
		}else if (xmlPath.equals("stereotacticMarker")){
			return getStereotacticmarker();
		}else if (xmlPath.equals("incidentalFindings")){
			return getIncidentalfindings();
		}else if (xmlPath.equals("comments")){
			return getComments();
		}else if (xmlPath.equals("pass")){
			return getPass();
		}else if (xmlPath.equals("payable")){
			return getPayable();
		}else if (xmlPath.equals("rescan")){
			return getRescan();
		}else if (xmlPath.equals("resolvable")){
			return getResolvable();
		}else if (xmlPath.equals("retrain")){
			return getRetrain();
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
		if (xmlPath.equals("scans/scan")){
			return getScans_scan();
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
		if (xmlPath.equals("scans/scan")){
			return "http://nrg.wustl.edu/xnat:qcScanData";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("rater")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("stereotacticMarker")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("incidentalFindings")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("scans/scan")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("pass")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("payable")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rescan")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("resolvable")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("retrain")){
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
		all_fields.add("rater");
		all_fields.add("stereotacticMarker");
		all_fields.add("incidentalFindings");
		all_fields.add("scans/scan");
		all_fields.add("comments");
		all_fields.add("pass");
		all_fields.add("payable");
		all_fields.add("rescan");
		all_fields.add("resolvable");
		all_fields.add("retrain");
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
		writer.write("\n<xnat:QCManualAssessment");
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
		writer.write("\n</xnat:QCManualAssessment>");
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
		//REFERENCE FROM qcManualAssessorData -> imageAssessorData
		if (_Rater!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rater");
			writer.write(">");
			writer.write(ValueParser(_Rater,"string"));
			writer.write("</xnat:rater>");
			header--;
		}
		if (_Stereotacticmarker!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:stereotacticMarker");
			writer.write(">");
			writer.write(ValueParser(_Stereotacticmarker,"string"));
			writer.write("</xnat:stereotacticMarker>");
			header--;
		}
		if (_Incidentalfindings!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:incidentalFindings");
			writer.write(">");
			writer.write(ValueParser(_Incidentalfindings,"string"));
			writer.write("</xnat:incidentalFindings>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Scans_scan.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:scans");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM qcManualAssessorData -> scans/scan
		java.util.Iterator iter1=_Scans_scan.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatQcscandataBean child = (org.nrg.xdat.bean.XnatQcscandataBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:scan");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:qcScanData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:scan>");
				}else{
					writer.write("</xnat:scan>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:scans>");
			}
			}

		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</xnat:comments>");
			header--;
		}
		if (_Pass!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:pass");
			writer.write(">");
			writer.write(ValueParser(_Pass,"string"));
			writer.write("</xnat:pass>");
			header--;
		}
		if (_Payable!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:payable");
			writer.write(">");
			writer.write(ValueParser(_Payable,"string"));
			writer.write("</xnat:payable>");
			header--;
		}
		if (_Rescan!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rescan");
			writer.write(">");
			writer.write(ValueParser(_Rescan,"string"));
			writer.write("</xnat:rescan>");
			header--;
		}
		if (_Resolvable!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:resolvable");
			writer.write(">");
			writer.write(ValueParser(_Resolvable,"string"));
			writer.write("</xnat:resolvable>");
			header--;
		}
		if (_Retrain!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:retrain");
			writer.write(">");
			writer.write(ValueParser(_Retrain,"string"));
			writer.write("</xnat:retrain>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Rater!=null) return true;
		if (_Stereotacticmarker!=null) return true;
		if (_Incidentalfindings!=null) return true;
			if(_Scans_scan.size()>0)return true;
		if (_Comments!=null) return true;
		if (_Pass!=null) return true;
		if (_Payable!=null) return true;
		if (_Rescan!=null) return true;
		if (_Resolvable!=null) return true;
		if (_Retrain!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
