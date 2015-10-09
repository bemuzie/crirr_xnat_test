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
public class CatCatalogBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.CatCatalogI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CatCatalogBean.class);
	public static String SCHEMA_ELEMENT_NAME="cat:catalog";

	public String getSchemaElementName(){
		return "catalog";
	}

	public String getFullSchemaElementName(){
		return "cat:catalog";
	}
	 private List<org.nrg.xdat.bean.CatCatalogMetafieldBean> _Metafields_metafield =new ArrayList<org.nrg.xdat.bean.CatCatalogMetafieldBean>();

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.bean.CatCatalogMetafieldBean
	 */
	public <A extends org.nrg.xdat.model.CatCatalogMetafieldI> List<A> getMetafields_metafield() {
		return (List<A>) _Metafields_metafield;
	}

	/**
	 * Sets the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void setMetafields_metafield(ArrayList<org.nrg.xdat.bean.CatCatalogMetafieldBean> v){
		_Metafields_metafield=v;
	}

	/**
	 * Adds the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void addMetafields_metafield(org.nrg.xdat.bean.CatCatalogMetafieldBean v){
		_Metafields_metafield.add(v);
	}

	/**
	 * metaFields/metaField
	 * Adds org.nrg.xdat.model.CatCatalogMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogMetafieldI> void addMetafields_metafield(A item) throws Exception{
	_Metafields_metafield.add((org.nrg.xdat.bean.CatCatalogMetafieldBean)item);
	}

	/**
	 * Adds the value for metaFields/metaField.
	 * @param v Value to Set.
	 */
	public void addMetafields_metafield(Object v){
		if (v instanceof org.nrg.xdat.bean.CatCatalogMetafieldBean)
			_Metafields_metafield.add((org.nrg.xdat.bean.CatCatalogMetafieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatCatalogMetafieldBean");
	}
	 private List<org.nrg.xdat.bean.CatCatalogTagBean> _Tags_tag =new ArrayList<org.nrg.xdat.bean.CatCatalogTagBean>();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.bean.CatCatalogTagBean
	 */
	public <A extends org.nrg.xdat.model.CatCatalogTagI> List<A> getTags_tag() {
		return (List<A>) _Tags_tag;
	}

	/**
	 * Sets the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void setTags_tag(ArrayList<org.nrg.xdat.bean.CatCatalogTagBean> v){
		_Tags_tag=v;
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(org.nrg.xdat.bean.CatCatalogTagBean v){
		_Tags_tag.add(v);
	}

	/**
	 * tags/tag
	 * Adds org.nrg.xdat.model.CatCatalogTagI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogTagI> void addTags_tag(A item) throws Exception{
	_Tags_tag.add((org.nrg.xdat.bean.CatCatalogTagBean)item);
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(Object v){
		if (v instanceof org.nrg.xdat.bean.CatCatalogTagBean)
			_Tags_tag.add((org.nrg.xdat.bean.CatCatalogTagBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatCatalogTagBean");
	}
	 private List<org.nrg.xdat.bean.CatCatalogBean> _Sets_entryset =new ArrayList<org.nrg.xdat.bean.CatCatalogBean>();

	/**
	 * sets/entrySet
	 * @return Returns an List of org.nrg.xdat.bean.CatCatalogBean
	 */
	public <A extends org.nrg.xdat.model.CatCatalogI> List<A> getSets_entryset() {
		return (List<A>) _Sets_entryset;
	}

	/**
	 * Sets the value for sets/entrySet.
	 * @param v Value to Set.
	 */
	public void setSets_entryset(ArrayList<org.nrg.xdat.bean.CatCatalogBean> v){
		_Sets_entryset=v;
	}

	/**
	 * Adds the value for sets/entrySet.
	 * @param v Value to Set.
	 */
	public void addSets_entryset(org.nrg.xdat.bean.CatCatalogBean v){
		_Sets_entryset.add(v);
	}

	/**
	 * sets/entrySet
	 * Adds org.nrg.xdat.model.CatCatalogI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogI> void addSets_entryset(A item) throws Exception{
	_Sets_entryset.add((org.nrg.xdat.bean.CatCatalogBean)item);
	}

	/**
	 * Adds the value for sets/entrySet.
	 * @param v Value to Set.
	 */
	public void addSets_entryset(Object v){
		if (v instanceof org.nrg.xdat.bean.CatCatalogBean)
			_Sets_entryset.add((org.nrg.xdat.bean.CatCatalogBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatCatalogBean");
	}
	 private List<org.nrg.xdat.bean.CatEntryBean> _Entries_entry =new ArrayList<org.nrg.xdat.bean.CatEntryBean>();

	/**
	 * entries/entry
	 * @return Returns an List of org.nrg.xdat.bean.CatEntryBean
	 */
	public <A extends org.nrg.xdat.model.CatEntryI> List<A> getEntries_entry() {
		return (List<A>) _Entries_entry;
	}

	/**
	 * Sets the value for entries/entry.
	 * @param v Value to Set.
	 */
	public void setEntries_entry(ArrayList<org.nrg.xdat.bean.CatEntryBean> v){
		_Entries_entry=v;
	}

	/**
	 * Adds the value for entries/entry.
	 * @param v Value to Set.
	 */
	public void addEntries_entry(org.nrg.xdat.bean.CatEntryBean v){
		_Entries_entry.add(v);
	}

	/**
	 * entries/entry
	 * Adds org.nrg.xdat.model.CatEntryI
	 */
	public <A extends org.nrg.xdat.model.CatEntryI> void addEntries_entry(A item) throws Exception{
	_Entries_entry.add((org.nrg.xdat.bean.CatEntryBean)item);
	}

	/**
	 * Adds the value for entries/entry.
	 * @param v Value to Set.
	 */
	public void addEntries_entry(Object v){
		if (v instanceof org.nrg.xdat.bean.CatEntryBean)
			_Entries_entry.add((org.nrg.xdat.bean.CatEntryBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.CatEntryBean");
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

	private Integer _CatCatalogId=null;

	/**
	 * @return Returns the cat_catalog_id.
	 */
	public Integer getCatCatalogId() {
		return _CatCatalogId;
	}

	/**
	 * Sets the value for cat_catalog_id.
	 * @param v Value to Set.
	 */
	public void setCatCatalogId(Integer v){
		_CatCatalogId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
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
		}else if (xmlPath.equals("sets/entrySet")){
			addSets_entryset(v);
		}else if (xmlPath.equals("entries/entry")){
			addEntries_entry(v);
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
		if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("description")){
			return getDescription();
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
		}else if (xmlPath.equals("sets/entrySet")){
			return getSets_entryset();
		}else if (xmlPath.equals("entries/entry")){
			return getEntries_entry();
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
			return "http://nrg.wustl.edu/catalog:catalog_metaField";
		}else if (xmlPath.equals("tags/tag")){
			return "http://nrg.wustl.edu/catalog:catalog_tag";
		}else if (xmlPath.equals("sets/entrySet")){
			return "http://nrg.wustl.edu/catalog:catalog";
		}else if (xmlPath.equals("entries/entry")){
			return "http://nrg.wustl.edu/catalog:entry";
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
		}else if (xmlPath.equals("sets/entrySet")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("entries/entry")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
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
		all_fields.add("sets/entrySet");
		all_fields.add("entries/entry");
		all_fields.add("ID");
		all_fields.add("name");
		all_fields.add("description");
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
		writer.write("\n<cat:Catalog");
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
		writer.write("\n</cat:Catalog>");
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
			map.put("ID",ValueParser(_Id,"string"));
		//NOT REQUIRED FIELD

		if (_Name!=null)
			map.put("name",ValueParser(_Name,"string"));
		//NOT REQUIRED FIELD

		if (_Description!=null)
			map.put("description",ValueParser(_Description,"string"));
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
		//REFERENCE FROM catalog -> metaFields/metaField
		java.util.Iterator iter1=_Metafields_metafield.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.CatCatalogMetafieldBean child = (org.nrg.xdat.bean.CatCatalogMetafieldBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<cat:metaField");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("cat:catalog_metaField")){
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
		//REFERENCE FROM catalog -> tags/tag
		//IN-LINE REPEATER
		java.util.Iterator iter3=_Tags_tag.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.CatCatalogTagBean child = (org.nrg.xdat.bean.CatCatalogTagBean)iter3.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</cat:tags>");
			}
			}

			int child4=0;
			int att4=0;
			child4+=_Sets_entryset.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<cat:sets");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM catalog -> sets/entrySet
		java.util.Iterator iter5=_Sets_entryset.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.CatCatalogBean child = (org.nrg.xdat.bean.CatCatalogBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<cat:entrySet");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("cat:catalog")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</cat:entrySet>");
				}else{
					writer.write("</cat:entrySet>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</cat:sets>");
			}
			}

			int child6=0;
			int att6=0;
			child6+=_Entries_entry.size();
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<cat:entries");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM catalog -> entries/entry
		java.util.Iterator iter7=_Entries_entry.iterator();
		while(iter7.hasNext()){
			org.nrg.xdat.bean.CatEntryBean child = (org.nrg.xdat.bean.CatEntryBean)iter7.next();
			writer.write("\n" + createHeader(header++) + "<cat:entry");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("cat:entry")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =child.addXMLBody(writer,header);
				if(return8){
					writer.write("\n" + createHeader(--header) + "</cat:entry>");
				}else{
					writer.write("</cat:entry>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</cat:entries>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Metafields_metafield.size()>0)return true;
			if(_Tags_tag.size()>0)return true;
			if(_Sets_entryset.size()>0)return true;
			if(_Entries_entry.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
