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
public class XnatDicomseriesImageBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatDicomseriesImageI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatDicomseriesImageBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:dicomSeries_image";

	public String getSchemaElementName(){
		return "dicomSeries_image";
	}

	public String getFullSchemaElementName(){
		return "xnat:dicomSeries_image";
	}

	//FIELD

	private String _Uri=null;

	/**
	 * @return Returns the URI.
	 */
	public String getUri(){
		return _Uri;
	}

	/**
	 * Sets the value for URI.
	 * @param v Value to Set.
	 */
	public void setUri(String v){
		_Uri=v;
	}

	//FIELD

	private String _SopInstanceUid=null;

	/**
	 * @return Returns the sop_instance_UID.
	 */
	public String getSopInstanceUid(){
		return _SopInstanceUid;
	}

	/**
	 * Sets the value for sop_instance_UID.
	 * @param v Value to Set.
	 */
	public void setSopInstanceUid(String v){
		_SopInstanceUid=v;
	}

	//FIELD

	private Integer _InstanceNumber=null;

	/**
	 * @return Returns the instance_number.
	 */
	public Integer getInstanceNumber(){
		return _InstanceNumber;
	}

	/**
	 * Sets the value for xnat:dicomSeries_image/instance_number.
	 * @param v Value to Set.
	 */
	public void setInstanceNumber(Integer v) {
		_InstanceNumber=v;
	}

	/**
	 * Sets the value for xnat:dicomSeries_image/instance_number.
	 * @param v Value to Set.
	 */
	public void setInstanceNumber(String v)  {
		_InstanceNumber=formatInteger(v);
	}

	//FIELD

	private Integer _XnatDicomseriesImageId=null;

	/**
	 * @return Returns the xnat_dicomSeries_image_id.
	 */
	public Integer getXnatDicomseriesImageId() {
		return _XnatDicomseriesImageId;
	}

	/**
	 * Sets the value for xnat_dicomSeries_image_id.
	 * @param v Value to Set.
	 */
	public void setXnatDicomseriesImageId(Integer v){
		_XnatDicomseriesImageId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("URI")){
			setUri(v);
		}else if (xmlPath.equals("sop_instance_UID")){
			setSopInstanceUid(v);
		}else if (xmlPath.equals("instance_number")){
			setInstanceNumber(v);
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
		if (xmlPath.equals("URI")){
			return getUri();
		}else if (xmlPath.equals("sop_instance_UID")){
			return getSopInstanceUid();
		}else if (xmlPath.equals("instance_number")){
			return getInstanceNumber();
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
		if (xmlPath.equals("URI")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("sop_instance_UID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("instance_number")){
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
		all_fields.add("URI");
		all_fields.add("sop_instance_UID");
		all_fields.add("instance_number");
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
		writer.write("\n<xnat:dicomSeries_image");
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
		writer.write("\n</xnat:dicomSeries_image>");
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
		if (_Uri!=null)
			map.put("URI",ValueParser(_Uri,"string"));
		else map.put("URI","");//REQUIRED FIELD

		if (_SopInstanceUid!=null)
			map.put("sop_instance_UID",ValueParser(_SopInstanceUid,"string"));
		else map.put("sop_instance_UID","");//REQUIRED FIELD

		if (_InstanceNumber!=null)
			map.put("instance_number",ValueParser(_InstanceNumber,"integer"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
