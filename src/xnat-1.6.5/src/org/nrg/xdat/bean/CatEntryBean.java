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
public class CatEntryBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.CatEntryI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CatEntryBean.class);
	public static String SCHEMA_ELEMENT_NAME="cat:entry";

	public String getSchemaElementName(){
		return "entry";
	}

	public String getFullSchemaElementName(){
		return "cat:entry";
	}
	 private List<org.nrg.xdat.bean.CatEntryMetafieldBean> _Metafields_metafield =new ArrayList<org.nrg.xdat.bean.CatEntryMetafieldBean>();

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.bean.CatEntryMetafieldBean
	 */
	public <A extends org.nrg.xdat.model.CatEntryMetafieldI> List<A> getMetafields_metafield() {
		return (List<A>) _Metafields_metafield;
	}

	/**
	 * Sets the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void setMetafields_metafield(ArrayList<org.nrg.xdat.bean.CatEntryMetafieldBean> v){
		_Metafields_metafield=v;
	}

	/**
	 * Adds the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void addMetafields_metafield(org.nrg.xdat.bean.CatEntryMetafieldBean v){
		_Metafields_metafield.add(v);
	}

	/**
	 * metaFields/metaField
	 * Adds org.nrg.xdat.model.CatEntryMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatEntryMetafieldI> void addMetafields_metafield(A item) throws Exception{
	_Metafields_metafield.add((org.nrg.xdat.bean.CatEntryMetafieldBean)item);
	}

	/**
	 * Adds the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void addMetafields_metafield(Object v){
		if (v instanceof org.nrg.xdat.bean.CatEntryMetafieldBean)
			_Metafields_metafield.add((org.nrg.xdat.bean.CatEntryMetafieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatEntryMetafieldBean");
	}
	 private List<org.nrg.xdat.bean.CatEntryTagBean> _Tags_tag =new ArrayList<org.nrg.xdat.bean.CatEntryTagBean>();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.bean.CatEntryTagBean
	 */
	public <A extends org.nrg.xdat.model.CatEntryTagI> List<A> getTags_tag() {
		return (List<A>) _Tags_tag;
	}

	/**
	 * Sets the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void setTags_tag(ArrayList<org.nrg.xdat.bean.CatEntryTagBean> v){
		_Tags_tag=v;
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(org.nrg.xdat.bean.CatEntryTagBean v){
		_Tags_tag.add(v);
	}

	/**
	 * tags/tag
	 * Adds org.nrg.xdat.model.CatEntryTagI
	 */
	public <A extends org.nrg.xdat.model.CatEntryTagI> void addTags_tag(A item) throws Exception{
	_Tags_tag.add((org.nrg.xdat.bean.CatEntryTagBean)item);
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(Object v){
		if (v instanceof org.nrg.xdat.bean.CatEntryTagBean)
			_Tags_tag.add((org.nrg.xdat.bean.CatEntryTagBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatEntryTagBean");
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

	private String _Id=null;

	/**
	 * @return Returns the ID.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private String _Name=null;

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		return _Name;
	}

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v){
		_Name=v;
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

	//FIELD

	private Date _Createdtime=null;

	/**
	 * @return Returns the createdTime.
	 */
	public Date getCreatedtime(){
		return _Createdtime;
	}

	/**
	 * Sets the value for createdTime.
	 * @param v Value to Set.
	 */
	public void setCreatedtime(Date v){
		_Createdtime=v;
	}

	/**
	 * Sets the value for createdTime.
	 * @param v Value to Set.
	 */
	public void setCreatedtime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for createdTime.
	 * @param v Value to Set.
	 */
	public void setCreatedtime(String v)  {
		_Createdtime=formatDateTime(v);
	}

	//FIELD

	private String _Createdby=null;

	/**
	 * @return Returns the createdBy.
	 */
	public String getCreatedby(){
		return _Createdby;
	}

	/**
	 * Sets the value for createdBy.
	 * @param v Value to Set.
	 */
	public void setCreatedby(String v){
		_Createdby=v;
	}

	//FIELD

	private Integer _Createdeventid=null;

	/**
	 * @return Returns the createdEventId.
	 */
	public Integer getCreatedeventid(){
		return _Createdeventid;
	}

	/**
	 * Sets the value for cat:entry/createdEventId.
	 * @param v Value to Set.
	 */
	public void setCreatedeventid(Integer v) {
		_Createdeventid=v;
	}

	/**
	 * Sets the value for cat:entry/createdEventId.
	 * @param v Value to Set.
	 */
	public void setCreatedeventid(String v)  {
		_Createdeventid=formatInteger(v);
	}

	//FIELD

	private Date _Modifiedtime=null;

	/**
	 * @return Returns the modifiedTime.
	 */
	public Date getModifiedtime(){
		return _Modifiedtime;
	}

	/**
	 * Sets the value for modifiedTime.
	 * @param v Value to Set.
	 */
	public void setModifiedtime(Date v){
		_Modifiedtime=v;
	}

	/**
	 * Sets the value for modifiedTime.
	 * @param v Value to Set.
	 */
	public void setModifiedtime(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for modifiedTime.
	 * @param v Value to Set.
	 */
	public void setModifiedtime(String v)  {
		_Modifiedtime=formatDateTime(v);
	}

	//FIELD

	private String _Modifiedby=null;

	/**
	 * @return Returns the modifiedBy.
	 */
	public String getModifiedby(){
		return _Modifiedby;
	}

	/**
	 * Sets the value for modifiedBy.
	 * @param v Value to Set.
	 */
	public void setModifiedby(String v){
		_Modifiedby=v;
	}

	//FIELD

	private Integer _Modifiedeventid=null;

	/**
	 * @return Returns the modifiedEventId.
	 */
	public Integer getModifiedeventid(){
		return _Modifiedeventid;
	}

	/**
	 * Sets the value for cat:entry/modifiedEventId.
	 * @param v Value to Set.
	 */
	public void setModifiedeventid(Integer v) {
		_Modifiedeventid=v;
	}

	/**
	 * Sets the value for cat:entry/modifiedEventId.
	 * @param v Value to Set.
	 */
	public void setModifiedeventid(String v)  {
		_Modifiedeventid=formatInteger(v);
	}

	//FIELD

	private String _Digest=null;

	/**
	 * @return Returns the digest.
	 */
	public String getDigest(){
		return _Digest;
	}

	/**
	 * Sets the value for digest.
	 * @param v Value to Set.
	 */
	public void setDigest(String v){
		_Digest=v;
	}

	//FIELD

	private Integer _CatEntryId=null;

	/**
	 * @return Returns the cat_entry_id.
	 */
	public Integer getCatEntryId() {
		return _CatEntryId;
	}

	/**
	 * Sets the value for cat_entry_id.
	 * @param v Value to Set.
	 */
	public void setCatEntryId(Integer v){
		_CatEntryId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("URI")){
			setUri(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("format")){
			setFormat(v);
		}else if (xmlPath.equals("content")){
			setContent(v);
		}else if (xmlPath.equals("cachePath")){
			setCachepath(v);
		}else if (xmlPath.equals("createdTime")){
			setCreatedtime(v);
		}else if (xmlPath.equals("createdBy")){
			setCreatedby(v);
		}else if (xmlPath.equals("createdEventId")){
			setCreatedeventid(v);
		}else if (xmlPath.equals("modifiedTime")){
			setModifiedtime(v);
		}else if (xmlPath.equals("modifiedBy")){
			setModifiedby(v);
		}else if (xmlPath.equals("modifiedEventId")){
			setModifiedeventid(v);
		}else if (xmlPath.equals("digest")){
			setDigest(v);
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
		if (xmlPath.equals("metaFields/metaField")){
			addMetafields_metafield(v);
		}else if (xmlPath.equals("tags/tag")){
			addTags_tag(v);
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
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("format")){
			return getFormat();
		}else if (xmlPath.equals("content")){
			return getContent();
		}else if (xmlPath.equals("cachePath")){
			return getCachepath();
		}else if (xmlPath.equals("createdTime")){
			return getCreatedtime();
		}else if (xmlPath.equals("createdBy")){
			return getCreatedby();
		}else if (xmlPath.equals("createdEventId")){
			return getCreatedeventid();
		}else if (xmlPath.equals("modifiedTime")){
			return getModifiedtime();
		}else if (xmlPath.equals("modifiedBy")){
			return getModifiedby();
		}else if (xmlPath.equals("modifiedEventId")){
			return getModifiedeventid();
		}else if (xmlPath.equals("digest")){
			return getDigest();
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
		if (xmlPath.equals("metaFields/metaField")){
			return getMetafields_metafield();
		}else if (xmlPath.equals("tags/tag")){
			return getTags_tag();
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
		if (xmlPath.equals("metaFields/metaField")){
			return "http://nrg.wustl.edu/catalog:entry_metaField";
		}else if (xmlPath.equals("tags/tag")){
			return "http://nrg.wustl.edu/catalog:entry_tag";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("metaFields/metaField")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("tags/tag")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("URI")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("format")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("content")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cachePath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("createdTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("createdBy")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("createdEventId")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("modifiedTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("modifiedBy")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("modifiedEventId")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("digest")){
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
		all_fields.add("metaFields/metaField");
		all_fields.add("tags/tag");
		all_fields.add("URI");
		all_fields.add("ID");
		all_fields.add("name");
		all_fields.add("description");
		all_fields.add("format");
		all_fields.add("content");
		all_fields.add("cachePath");
		all_fields.add("createdTime");
		all_fields.add("createdBy");
		all_fields.add("createdEventId");
		all_fields.add("modifiedTime");
		all_fields.add("modifiedBy");
		all_fields.add("modifiedEventId");
		all_fields.add("digest");
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
		writer.write("\n<cat:Entry");
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
		writer.write("\n</cat:Entry>");
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

		if (_Id!=null)
			map.put("ID",ValueParser(_Id,"string"));
		//NOT REQUIRED FIELD

		if (_Name!=null)
			map.put("name",ValueParser(_Name,"string"));
		//NOT REQUIRED FIELD

		if (_Description!=null)
			map.put("description",ValueParser(_Description,"string"));
		//NOT REQUIRED FIELD

		if (_Format!=null)
			map.put("format",ValueParser(_Format,"string"));
		//NOT REQUIRED FIELD

		if (_Content!=null)
			map.put("content",ValueParser(_Content,"string"));
		//NOT REQUIRED FIELD

		if (_Cachepath!=null)
			map.put("cachePath",ValueParser(_Cachepath,"string"));
		//NOT REQUIRED FIELD

		if (_Createdtime!=null)
			map.put("createdTime",ValueParser(_Createdtime,"dateTime"));
		//NOT REQUIRED FIELD

		if (_Createdby!=null)
			map.put("createdBy",ValueParser(_Createdby,"string"));
		//NOT REQUIRED FIELD

		if (_Createdeventid!=null)
			map.put("createdEventId",ValueParser(_Createdeventid,"integer"));
		//NOT REQUIRED FIELD

		if (_Modifiedtime!=null)
			map.put("modifiedTime",ValueParser(_Modifiedtime,"dateTime"));
		//NOT REQUIRED FIELD

		if (_Modifiedby!=null)
			map.put("modifiedBy",ValueParser(_Modifiedby,"string"));
		//NOT REQUIRED FIELD

		if (_Modifiedeventid!=null)
			map.put("modifiedEventId",ValueParser(_Modifiedeventid,"integer"));
		//NOT REQUIRED FIELD

		if (_Digest!=null)
			map.put("digest",ValueParser(_Digest,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Metafields_metafield.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<cat:metaFields");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM entry -> metaFields/metaField
		java.util.Iterator iter1=_Metafields_metafield.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.CatEntryMetafieldBean child = (org.nrg.xdat.bean.CatEntryMetafieldBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<cat:metaField");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("cat:entry_metaField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</cat:metaField>");
				}else{
					writer.write("</cat:metaField>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</cat:metaFields>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Tags_tag.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<cat:tags");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM entry -> tags/tag
		//IN-LINE REPEATER
		java.util.Iterator iter3=_Tags_tag.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.CatEntryTagBean child = (org.nrg.xdat.bean.CatEntryTagBean)iter3.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</cat:tags>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Metafields_metafield.size()>0)return true;
			if(_Tags_tag.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
