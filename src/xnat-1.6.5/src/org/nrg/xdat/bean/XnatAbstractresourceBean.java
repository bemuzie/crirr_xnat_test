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
public class XnatAbstractresourceBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatAbstractresourceI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatAbstractresourceBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:abstractResource";

	public String getSchemaElementName(){
		return "abstractResource";
	}

	public String getFullSchemaElementName(){
		return "xnat:abstractResource";
	}

	//FIELD

	private String _Note=null;

	/**
	 * @return Returns the note.
	 */
	public String getNote(){
		return _Note;
	}

	/**
	 * Sets the value for note.
	 * @param v Value to Set.
	 */
	public void setNote(String v){
		_Note=v;
	}
	 private List<org.nrg.xdat.bean.XnatAbstractresourceTagBean> _Tags_tag =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceTagBean>();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceTagBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceTagI> List<A> getTags_tag() {
		return (List<A>) _Tags_tag;
	}

	/**
	 * Sets the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void setTags_tag(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceTagBean> v){
		_Tags_tag=v;
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(org.nrg.xdat.bean.XnatAbstractresourceTagBean v){
		_Tags_tag.add(v);
	}

	/**
	 * tags/tag
	 * Adds org.nrg.xdat.model.XnatAbstractresourceTagI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceTagI> void addTags_tag(A item) throws Exception{
	_Tags_tag.add((org.nrg.xdat.bean.XnatAbstractresourceTagBean)item);
	}

	/**
	 * Adds the value for tags/tag.
	 * @param v Value to Set.
	 */
	public void addTags_tag(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceTagBean)
			_Tags_tag.add((org.nrg.xdat.bean.XnatAbstractresourceTagBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceTagBean");
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

	private Integer _FileCount=null;

	/**
	 * @return Returns the file_count.
	 */
	public Integer getFileCount(){
		return _FileCount;
	}

	/**
	 * Sets the value for xnat:abstractResource/file_count.
	 * @param v Value to Set.
	 */
	public void setFileCount(Integer v) {
		_FileCount=v;
	}

	/**
	 * Sets the value for xnat:abstractResource/file_count.
	 * @param v Value to Set.
	 */
	public void setFileCount(String v)  {
		_FileCount=formatInteger(v);
	}

	//FIELD

	private Object _FileSize=null;

	/**
	 * @return Returns the file_size.
	 */
	public Object getFileSize(){
		return _FileSize;
	}

	/**
	 * Sets the value for file_size.
	 * @param v Value to Set.
	 */
	public void setFileSize(Object v){
		_FileSize=v;
	}

	//FIELD

	private Integer _XnatAbstractresourceId=null;

	/**
	 * @return Returns the xnat_abstractResource_id.
	 */
	public Integer getXnatAbstractresourceId() {
		return _XnatAbstractresourceId;
	}

	/**
	 * Sets the value for xnat_abstractResource_id.
	 * @param v Value to Set.
	 */
	public void setXnatAbstractresourceId(Integer v){
		_XnatAbstractresourceId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("note")){
			setNote(v);
		}else if (xmlPath.equals("label")){
			setLabel(v);
		}else if (xmlPath.equals("file_count")){
			setFileCount(v);
		}else if (xmlPath.equals("file_size")){
			setFileSize(v);
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
		if (xmlPath.equals("tags/tag")){
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
		if (xmlPath.equals("note")){
			return getNote();
		}else if (xmlPath.equals("label")){
			return getLabel();
		}else if (xmlPath.equals("file_count")){
			return getFileCount();
		}else if (xmlPath.equals("file_size")){
			return getFileSize();
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
		if (xmlPath.equals("tags/tag")){
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
		if (xmlPath.equals("tags/tag")){
			return "http://nrg.wustl.edu/xnat:abstractResource_tag";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("note")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("tags/tag")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("label")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("file_count")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("file_size")){
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
		all_fields.add("note");
		all_fields.add("tags/tag");
		all_fields.add("label");
		all_fields.add("file_count");
		all_fields.add("file_size");
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
		writer.write("\n<xnat:abstractResource");
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
		writer.write("\n</xnat:abstractResource>");
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
		if (_Label!=null)
			map.put("label",ValueParser(_Label,"string"));
		//NOT REQUIRED FIELD

		if (_FileCount!=null)
			map.put("file_count",ValueParser(_FileCount,"integer"));
		//NOT REQUIRED FIELD

		if (_FileSize!=null)
			map.put("file_size",ValueParser(_FileSize,"long"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Note!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:note");
			writer.write(">");
			writer.write(ValueParser(_Note,"string"));
			writer.write("</xnat:note>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Tags_tag.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:tags");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM abstractResource -> tags/tag
		java.util.Iterator iter1=_Tags_tag.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceTagBean child = (org.nrg.xdat.bean.XnatAbstractresourceTagBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:tag");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource_tag")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:tag>");
				}else{
					writer.write("</xnat:tag>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:tags>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Note!=null) return true;
			if(_Tags_tag.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
