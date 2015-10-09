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
public class XnatMrqcscandataBean extends XnatQcscandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatMrqcscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatMrqcscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:mrQcScanData";

	public String getSchemaElementName(){
		return "mrQcScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:mrQcScanData";
	}

	//FIELD

	private String _Blurring=null;

	/**
	 * @return Returns the blurring.
	 */
	public String getBlurring(){
		return _Blurring;
	}

	/**
	 * Sets the value for blurring.
	 * @param v Value to Set.
	 */
	public void setBlurring(String v){
		_Blurring=v;
	}

	//FIELD

	private String _Flow=null;

	/**
	 * @return Returns the flow.
	 */
	public String getFlow(){
		return _Flow;
	}

	/**
	 * Sets the value for flow.
	 * @param v Value to Set.
	 */
	public void setFlow(String v){
		_Flow=v;
	}

	//FIELD

	private String _Imagecontrast=null;

	/**
	 * @return Returns the imageContrast.
	 */
	public String getImagecontrast(){
		return _Imagecontrast;
	}

	/**
	 * Sets the value for imageContrast.
	 * @param v Value to Set.
	 */
	public void setImagecontrast(String v){
		_Imagecontrast=v;
	}

	//FIELD

	private String _Inhomogeneity=null;

	/**
	 * @return Returns the inhomogeneity.
	 */
	public String getInhomogeneity(){
		return _Inhomogeneity;
	}

	/**
	 * Sets the value for inhomogeneity.
	 * @param v Value to Set.
	 */
	public void setInhomogeneity(String v){
		_Inhomogeneity=v;
	}

	//FIELD

	private String _Wrap=null;

	/**
	 * @return Returns the wrap.
	 */
	public String getWrap(){
		return _Wrap;
	}

	/**
	 * Sets the value for wrap.
	 * @param v Value to Set.
	 */
	public void setWrap(String v){
		_Wrap=v;
	}

	//FIELD

	private String _Susceptibility=null;

	/**
	 * @return Returns the susceptibility.
	 */
	public String getSusceptibility(){
		return _Susceptibility;
	}

	/**
	 * Sets the value for susceptibility.
	 * @param v Value to Set.
	 */
	public void setSusceptibility(String v){
		_Susceptibility=v;
	}

	//FIELD

	private String _Interpacmotion=null;

	/**
	 * @return Returns the interpacMotion.
	 */
	public String getInterpacmotion(){
		return _Interpacmotion;
	}

	/**
	 * Sets the value for interpacMotion.
	 * @param v Value to Set.
	 */
	public void setInterpacmotion(String v){
		_Interpacmotion=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("blurring")){
			setBlurring(v);
		}else if (xmlPath.equals("flow")){
			setFlow(v);
		}else if (xmlPath.equals("imageContrast")){
			setImagecontrast(v);
		}else if (xmlPath.equals("inhomogeneity")){
			setInhomogeneity(v);
		}else if (xmlPath.equals("wrap")){
			setWrap(v);
		}else if (xmlPath.equals("susceptibility")){
			setSusceptibility(v);
		}else if (xmlPath.equals("interpacMotion")){
			setInterpacmotion(v);
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
		if (xmlPath.equals("blurring")){
			return getBlurring();
		}else if (xmlPath.equals("flow")){
			return getFlow();
		}else if (xmlPath.equals("imageContrast")){
			return getImagecontrast();
		}else if (xmlPath.equals("inhomogeneity")){
			return getInhomogeneity();
		}else if (xmlPath.equals("wrap")){
			return getWrap();
		}else if (xmlPath.equals("susceptibility")){
			return getSusceptibility();
		}else if (xmlPath.equals("interpacMotion")){
			return getInterpacmotion();
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
		if (xmlPath.equals("blurring")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("flow")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("imageContrast")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("inhomogeneity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("wrap")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("susceptibility")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("interpacMotion")){
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
		all_fields.add("blurring");
		all_fields.add("flow");
		all_fields.add("imageContrast");
		all_fields.add("inhomogeneity");
		all_fields.add("wrap");
		all_fields.add("susceptibility");
		all_fields.add("interpacMotion");
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
		writer.write("\n<xnat:mrQcScanData");
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
		writer.write("\n</xnat:mrQcScanData>");
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
		//REFERENCE FROM mrQcScanData -> qcScanData
		if (_Blurring!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:blurring");
			writer.write(">");
			writer.write(ValueParser(_Blurring,"string"));
			writer.write("</xnat:blurring>");
			header--;
		}
		if (_Flow!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:flow");
			writer.write(">");
			writer.write(ValueParser(_Flow,"string"));
			writer.write("</xnat:flow>");
			header--;
		}
		if (_Imagecontrast!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageContrast");
			writer.write(">");
			writer.write(ValueParser(_Imagecontrast,"string"));
			writer.write("</xnat:imageContrast>");
			header--;
		}
		if (_Inhomogeneity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:inhomogeneity");
			writer.write(">");
			writer.write(ValueParser(_Inhomogeneity,"string"));
			writer.write("</xnat:inhomogeneity>");
			header--;
		}
		if (_Wrap!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:wrap");
			writer.write(">");
			writer.write(ValueParser(_Wrap,"string"));
			writer.write("</xnat:wrap>");
			header--;
		}
		if (_Susceptibility!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:susceptibility");
			writer.write(">");
			writer.write(ValueParser(_Susceptibility,"string"));
			writer.write("</xnat:susceptibility>");
			header--;
		}
		if (_Interpacmotion!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:interpacMotion");
			writer.write(">");
			writer.write(ValueParser(_Interpacmotion,"string"));
			writer.write("</xnat:interpacMotion>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Blurring!=null) return true;
		if (_Flow!=null) return true;
		if (_Imagecontrast!=null) return true;
		if (_Inhomogeneity!=null) return true;
		if (_Wrap!=null) return true;
		if (_Susceptibility!=null) return true;
		if (_Interpacmotion!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
