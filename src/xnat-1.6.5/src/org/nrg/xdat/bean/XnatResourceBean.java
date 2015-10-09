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
public class XnatResourceBean extends XnatAbstractresourceBean implements java.io.Serializable, org.nrg.xdat.model.XnatResourceI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatResourceBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:resource";

	public String getSchemaElementName(){
		return "resource";
	}

	public String getFullSchemaElementName(){
		return "xnat:resource";
	}
	 private org.nrg.xdat.bean.ProvProcessBean _Provenance =null;

	/**
	 * provenance
	 * @return org.nrg.xdat.bean.ProvProcessBean
	 */
	public org.nrg.xdat.bean.ProvProcessBean getProvenance() {
		return _Provenance;
	}

	/**
	 * Sets the value for provenance.
	 * @param v Value to Set.
	 */
	public void setProvenance(org.nrg.xdat.bean.ProvProcessBean v){
		_Provenance =v;
	}

	/**
	 * Sets the value for provenance.
	 * @param v Value to Set.
	 */
	public void setProvenance(Object v) {
		if (v instanceof org.nrg.xdat.bean.ProvProcessBean)
			_Provenance =(org.nrg.xdat.bean.ProvProcessBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ProvProcessBean");
	}

	/**
	 * provenance
	 * @return org.nrg.xdat.model.ProvProcessI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessI> void setProvenance(A item) throws Exception{
	setProvenance((org.nrg.xdat.bean.ProvProcessBean)item);
	}

	//FIELD

	private Integer _ProvenanceFK=null;

	/**
	 * @return Returns the xnat:resource/provenance_prov_process_id.
	 */
	public Integer getProvenanceFK(){
		return _ProvenanceFK;
	}

	/**
	 * Sets the value for xnat:resource/provenance_prov_process_id.
	 * @param v Value to Set.
	 */
	public void setProvenanceFK(Integer v) {
		_ProvenanceFK=v;
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

	private String _Format=null;

	/**
	 * @return Returns the format.
	 */
	public String getFormat(){
		return _Format;
	}

	/**
	 * Sets the value for format.
	 * @param v Value to Set.
	 */
	public void setFormat(String v){
		_Format=v;
	}

	//FIELD

	private String _Description=null;

	/**
	 * @return Returns the description.
	 */
	public String getDescription(){
		return _Description;
	}

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v){
		_Description=v;
	}

	//FIELD

	private String _Content=null;

	/**
	 * @return Returns the content.
	 */
	public String getContent(){
		return _Content;
	}

	/**
	 * Sets the value for content.
	 * @param v Value to Set.
	 */
	public void setContent(String v){
		_Content=v;
	}

	//FIELD

	private String _Cachepath=null;

	/**
	 * @return Returns the cachePath.
	 */
	public String getCachepath(){
		return _Cachepath;
	}

	/**
	 * Sets the value for cachePath.
	 * @param v Value to Set.
	 */
	public void setCachepath(String v){
		_Cachepath=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("URI")){
			setUri(v);
		}else if (xmlPath.equals("format")){
			setFormat(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("content")){
			setContent(v);
		}else if (xmlPath.equals("cachePath")){
			setCachepath(v);
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
		if (xmlPath.equals("provenance")){
			setProvenance(v);
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
		if (xmlPath.equals("URI")){
			return getUri();
		}else if (xmlPath.equals("format")){
			return getFormat();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("content")){
			return getContent();
		}else if (xmlPath.equals("cachePath")){
			return getCachepath();
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
		if (xmlPath.equals("provenance")){
			return getProvenance();
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
		if (xmlPath.equals("provenance")){
			return "http://www.nbirn.net/prov:process";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("provenance")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("URI")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("format")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("content")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cachePath")){
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
		all_fields.add("provenance");
		all_fields.add("URI");
		all_fields.add("format");
		all_fields.add("description");
		all_fields.add("content");
		all_fields.add("cachePath");
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
		writer.write("\n<xnat:resource");
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
		writer.write("\n</xnat:resource>");
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

		if (_Format!=null)
			map.put("format",ValueParser(_Format,"string"));
		//NOT REQUIRED FIELD

		if (_Description!=null)
			map.put("description",ValueParser(_Description,"string"));
		//NOT REQUIRED FIELD

		if (_Content!=null)
			map.put("content",ValueParser(_Content,"string"));
		//NOT REQUIRED FIELD

		if (_Cachepath!=null)
			map.put("cachePath",ValueParser(_Cachepath,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM resource -> abstractResource
		//REFERENCE FROM resource -> provenance
		//DATA-FIELD FROM resource -> provenance
		if (_Provenance!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:provenance");
			_Provenance.addXMLAtts(writer);
			if(!_Provenance.getFullSchemaElementName().equals("prov:process")){
				writer.write(" xsi:type=\"" + _Provenance.getFullSchemaElementName() + "\"");
			}
			if (_Provenance.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Provenance.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</xnat:provenance>");
				}else{
					writer.write("</xnat:provenance>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Provenance!=null){
			if (_Provenance.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
