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
public class XnatRegionresourceLabelBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatRegionresourceLabelI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatRegionresourceLabelBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:regionResource_label";

	public String getSchemaElementName(){
		return "regionResource_label";
	}

	public String getFullSchemaElementName(){
		return "xnat:regionResource_label";
	}

	//FIELD

	private String _Label=null;

	/**
	 * @return Returns the label.
	 */
	public String getLabel(){
		return _Label;
	}

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v){
		_Label=v;
	}

	//FIELD

	private Object _Id=null;

	/**
	 * @return Returns the id.
	 */
	public Object getId(){
		return _Id;
	}

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(Object v){
		_Id=v;
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

	private Integer _XnatRegionresourceLabelId=null;

	/**
	 * @return Returns the xnat_regionResource_label_id.
	 */
	public Integer getXnatRegionresourceLabelId() {
		return _XnatRegionresourceLabelId;
	}

	/**
	 * Sets the value for xnat_regionResource_label_id.
	 * @param v Value to Set.
	 */
	public void setXnatRegionresourceLabelId(Integer v){
		_XnatRegionresourceLabelId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("label")){
			setLabel(v);
		}else if (xmlPath.equals("id")){
			setId(v);
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
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("label")){
			return getLabel();
		}else if (xmlPath.equals("id")){
			return getId();
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
		if (xmlPath.equals("label")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("id")){
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
		all_fields.add("label");
		all_fields.add("id");
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
		writer.write("\n<xnat:regionResource_label");
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
		writer.write("\n</xnat:regionResource_label>");
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
			map.put("id",ValueParser(_Id,"int"));
		else map.put("id","");//REQUIRED FIELD

		if (_Hemisphere!=null)
			map.put("hemisphere",ValueParser(_Hemisphere,"string"));
		else map.put("hemisphere","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Label!=null){
			writer.write(ValueParser(_Label,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Label!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
