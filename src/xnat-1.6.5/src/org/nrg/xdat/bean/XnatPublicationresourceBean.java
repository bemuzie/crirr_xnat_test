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
public class XnatPublicationresourceBean extends XnatAbstractresourceBean implements java.io.Serializable, org.nrg.xdat.model.XnatPublicationresourceI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPublicationresourceBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:publicationResource";

	public String getSchemaElementName(){
		return "publicationResource";
	}

	public String getFullSchemaElementName(){
		return "xnat:publicationResource";
	}

	//FIELD

	private String _Title=null;

	/**
	 * @return Returns the title.
	 */
	public String getTitle(){
		return _Title;
	}

	/**
	 * Sets the value for title.
	 * @param v Value to Set.
	 */
	public void setTitle(String v){
		_Title=v;
	}

	//FIELD

	private String _Citation=null;

	/**
	 * @return Returns the citation.
	 */
	public String getCitation(){
		return _Citation;
	}

	/**
	 * Sets the value for citation.
	 * @param v Value to Set.
	 */
	public void setCitation(String v){
		_Citation=v;
	}

	//FIELD

	private String _Abstract=null;

	/**
	 * @return Returns the abstract.
	 */
	public String getAbstract(){
		return _Abstract;
	}

	/**
	 * Sets the value for abstract.
	 * @param v Value to Set.
	 */
	public void setAbstract(String v){
		_Abstract=v;
	}

	//FIELD

	private String _Commentary=null;

	/**
	 * @return Returns the commentary.
	 */
	public String getCommentary(){
		return _Commentary;
	}

	/**
	 * Sets the value for commentary.
	 * @param v Value to Set.
	 */
	public void setCommentary(String v){
		_Commentary=v;
	}

	//FIELD

	private Boolean _Isprimary=null;

	/**
	 * @return Returns the isPrimary.
	 */
	public Boolean getIsprimary() {
		return _Isprimary;
	}

	/**
	 * Sets the value for isPrimary.
	 * @param v Value to Set.
	 */
	public void setIsprimary(Object v){
		if(v instanceof Boolean){
			_Isprimary=(Boolean)v;
		}else if(v instanceof String){
			_Isprimary=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private String _Doi=null;

	/**
	 * @return Returns the doi.
	 */
	public String getDoi(){
		return _Doi;
	}

	/**
	 * Sets the value for doi.
	 * @param v Value to Set.
	 */
	public void setDoi(String v){
		_Doi=v;
	}

	//FIELD

	private String _Pubmed=null;

	/**
	 * @return Returns the pubmed.
	 */
	public String getPubmed(){
		return _Pubmed;
	}

	/**
	 * Sets the value for pubmed.
	 * @param v Value to Set.
	 */
	public void setPubmed(String v){
		_Pubmed=v;
	}

	//FIELD

	private String _Medline=null;

	/**
	 * @return Returns the medline.
	 */
	public String getMedline(){
		return _Medline;
	}

	/**
	 * Sets the value for medline.
	 * @param v Value to Set.
	 */
	public void setMedline(String v){
		_Medline=v;
	}

	//FIELD

	private String _Uri=null;

	/**
	 * @return Returns the uri.
	 */
	public String getUri(){
		return _Uri;
	}

	/**
	 * Sets the value for uri.
	 * @param v Value to Set.
	 */
	public void setUri(String v){
		_Uri=v;
	}

	//FIELD

	private String _Other=null;

	/**
	 * @return Returns the other.
	 */
	public String getOther(){
		return _Other;
	}

	/**
	 * Sets the value for other.
	 * @param v Value to Set.
	 */
	public void setOther(String v){
		_Other=v;
	}

	//FIELD

	private String _Type=null;

	/**
	 * @return Returns the type.
	 */
	public String getType(){
		return _Type;
	}

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v){
		_Type=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("title")){
			setTitle(v);
		}else if (xmlPath.equals("citation")){
			setCitation(v);
		}else if (xmlPath.equals("abstract")){
			setAbstract(v);
		}else if (xmlPath.equals("commentary")){
			setCommentary(v);
		}else if (xmlPath.equals("isPrimary")){
			setIsprimary(v);
		}else if (xmlPath.equals("doi")){
			setDoi(v);
		}else if (xmlPath.equals("pubmed")){
			setPubmed(v);
		}else if (xmlPath.equals("medline")){
			setMedline(v);
		}else if (xmlPath.equals("uri")){
			setUri(v);
		}else if (xmlPath.equals("other")){
			setOther(v);
		}else if (xmlPath.equals("type")){
			setType(v);
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
		if (xmlPath.equals("title")){
			return getTitle();
		}else if (xmlPath.equals("citation")){
			return getCitation();
		}else if (xmlPath.equals("abstract")){
			return getAbstract();
		}else if (xmlPath.equals("commentary")){
			return getCommentary();
		}else if (xmlPath.equals("isPrimary")){
			return getIsprimary();
		}else if (xmlPath.equals("doi")){
			return getDoi();
		}else if (xmlPath.equals("pubmed")){
			return getPubmed();
		}else if (xmlPath.equals("medline")){
			return getMedline();
		}else if (xmlPath.equals("uri")){
			return getUri();
		}else if (xmlPath.equals("other")){
			return getOther();
		}else if (xmlPath.equals("type")){
			return getType();
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
		if (xmlPath.equals("title")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("citation")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("abstract")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("commentary")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("isPrimary")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("doi")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("pubmed")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("medline")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("uri")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("other")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("type")){
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
		all_fields.add("title");
		all_fields.add("citation");
		all_fields.add("abstract");
		all_fields.add("commentary");
		all_fields.add("isPrimary");
		all_fields.add("doi");
		all_fields.add("pubmed");
		all_fields.add("medline");
		all_fields.add("uri");
		all_fields.add("other");
		all_fields.add("type");
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
		writer.write("\n<xnat:publicationResource");
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
		writer.write("\n</xnat:publicationResource>");
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
		if (_Isprimary!=null)
			map.put("isPrimary",ValueParser(_Isprimary,"boolean"));
		//NOT REQUIRED FIELD

		if (_Doi!=null)
			map.put("doi",ValueParser(_Doi,"string"));
		//NOT REQUIRED FIELD

		if (_Pubmed!=null)
			map.put("pubmed",ValueParser(_Pubmed,"string"));
		//NOT REQUIRED FIELD

		if (_Medline!=null)
			map.put("medline",ValueParser(_Medline,"string"));
		//NOT REQUIRED FIELD

		if (_Uri!=null)
			map.put("uri",ValueParser(_Uri,"string"));
		//NOT REQUIRED FIELD

		if (_Other!=null)
			map.put("other",ValueParser(_Other,"string"));
		//NOT REQUIRED FIELD

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM publicationResource -> abstractResource
		if (_Title!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:title");
			writer.write(">");
			writer.write(ValueParser(_Title,"string"));
			writer.write("</xnat:title>");
			header--;
		}
		if (_Citation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:citation");
			writer.write(">");
			writer.write(ValueParser(_Citation,"string"));
			writer.write("</xnat:citation>");
			header--;
		}
		if (_Abstract!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:abstract");
			writer.write(">");
			writer.write(ValueParser(_Abstract,"string"));
			writer.write("</xnat:abstract>");
			header--;
		}
		if (_Commentary!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:commentary");
			writer.write(">");
			writer.write(ValueParser(_Commentary,"string"));
			writer.write("</xnat:commentary>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Title!=null) return true;
		if (_Citation!=null) return true;
		if (_Abstract!=null) return true;
		if (_Commentary!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
