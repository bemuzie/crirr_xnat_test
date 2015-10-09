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
public class ScrScreeningassessmentBean extends XnatImageassessordataBean implements java.io.Serializable, org.nrg.xdat.model.ScrScreeningassessmentI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ScrScreeningassessmentBean.class);
	public static String SCHEMA_ELEMENT_NAME="scr:screeningAssessment";

	public String getSchemaElementName(){
		return "screeningAssessment";
	}

	public String getFullSchemaElementName(){
		return "scr:screeningAssessment";
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
	 private List<org.nrg.xdat.bean.ScrScreeningscandataBean> _Scans_scan =new ArrayList<org.nrg.xdat.bean.ScrScreeningscandataBean>();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.bean.ScrScreeningscandataBean
	 */
	public <A extends org.nrg.xdat.model.ScrScreeningscandataI> List<A> getScans_scan() {
		return (List<A>) _Scans_scan;
	}

	/**
	 * Sets the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void setScans_scan(ArrayList<org.nrg.xdat.bean.ScrScreeningscandataBean> v){
		_Scans_scan=v;
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(org.nrg.xdat.bean.ScrScreeningscandataBean v){
		_Scans_scan.add(v);
	}

	/**
	 * scans/scan
	 * Adds org.nrg.xdat.model.ScrScreeningscandataI
	 */
	public <A extends org.nrg.xdat.model.ScrScreeningscandataI> void addScans_scan(A item) throws Exception{
	_Scans_scan.add((org.nrg.xdat.bean.ScrScreeningscandataBean)item);
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(Object v){
		if (v instanceof org.nrg.xdat.bean.ScrScreeningscandataBean)
			_Scans_scan.add((org.nrg.xdat.bean.ScrScreeningscandataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ScrScreeningscandataBean");
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("rater")){
			setRater(v);
		}else if (xmlPath.equals("comments")){
			setComments(v);
		}else if (xmlPath.equals("pass")){
			setPass(v);
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
		}else if (xmlPath.equals("comments")){
			return getComments();
		}else if (xmlPath.equals("pass")){
			return getPass();
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
			return "http://nrg.wustl.edu/scr:screeningScanData";
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
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("pass")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scans/scan")){
			return BaseElement.field_multi_reference;
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
		all_fields.add("comments");
		all_fields.add("pass");
		all_fields.add("scans/scan");
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
		writer.write("\n<scr:ScreeningAssessment");
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
		writer.write("\n</scr:ScreeningAssessment>");
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
		//REFERENCE FROM screeningAssessment -> imageAssessorData
		if (_Rater!=null){
			writer.write("\n" + createHeader(header++) + "<scr:rater");
			writer.write(">");
			writer.write(ValueParser(_Rater,"string"));
			writer.write("</scr:rater>");
			header--;
		}
		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<scr:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</scr:comments>");
			header--;
		}
		if (_Pass!=null){
			writer.write("\n" + createHeader(header++) + "<scr:pass");
			writer.write(">");
			writer.write(ValueParser(_Pass,"string"));
			writer.write("</scr:pass>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Scans_scan.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<scr:scans");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM screeningAssessment -> scans/scan
		java.util.Iterator iter1=_Scans_scan.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.ScrScreeningscandataBean child = (org.nrg.xdat.bean.ScrScreeningscandataBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<scr:scan");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("scr:screeningScanData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</scr:scan>");
				}else{
					writer.write("</scr:scan>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</scr:scans>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Rater!=null) return true;
		if (_Comments!=null) return true;
		if (_Pass!=null) return true;
			if(_Scans_scan.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
