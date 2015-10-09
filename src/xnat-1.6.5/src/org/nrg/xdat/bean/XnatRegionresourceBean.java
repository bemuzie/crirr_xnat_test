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
public class XnatRegionresourceBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatRegionresourceI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatRegionresourceBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:regionResource";

	public String getSchemaElementName(){
		return "regionResource";
	}

	public String getFullSchemaElementName(){
		return "xnat:regionResource";
	}
	 private org.nrg.xdat.bean.XnatAbstractresourceBean _File =null;

	/**
	 * file
	 * @return org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public org.nrg.xdat.bean.XnatAbstractresourceBean getFile() {
		return _File;
	}

	/**
	 * Sets the value for file.
	 * @param v Value to Set.
	 */
	public void setFile(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_File =v;
	}

	/**
	 * Sets the value for file.
	 * @param v Value to Set.
	 */
	public void setFile(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_File =(org.nrg.xdat.bean.XnatAbstractresourceBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}

	/**
	 * file
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void setFile(A item) throws Exception{
	setFile((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	//FIELD

	private Integer _FileFK=null;

	/**
	 * @return Returns the xnat:regionResource/file_xnat_abstractresource_id.
	 */
	public Integer getFileFK(){
		return _FileFK;
	}

	/**
	 * Sets the value for xnat:regionResource/file_xnat_abstractresource_id.
	 * @param v Value to Set.
	 */
	public void setFileFK(Integer v) {
		_FileFK=v;
	}
	 private org.nrg.xdat.bean.XnatAbstractresourceBean _Baseimage =null;

	/**
	 * baseimage
	 * @return org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public org.nrg.xdat.bean.XnatAbstractresourceBean getBaseimage() {
		return _Baseimage;
	}

	/**
	 * Sets the value for baseimage.
	 * @param v Value to Set.
	 */
	public void setBaseimage(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_Baseimage =v;
	}

	/**
	 * Sets the value for baseimage.
	 * @param v Value to Set.
	 */
	public void setBaseimage(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_Baseimage =(org.nrg.xdat.bean.XnatAbstractresourceBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}

	/**
	 * baseimage
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void setBaseimage(A item) throws Exception{
	setBaseimage((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	//FIELD

	private Integer _BaseimageFK=null;

	/**
	 * @return Returns the xnat:regionResource/baseimage_xnat_abstractresource_id.
	 */
	public Integer getBaseimageFK(){
		return _BaseimageFK;
	}

	/**
	 * Sets the value for xnat:regionResource/baseimage_xnat_abstractresource_id.
	 * @param v Value to Set.
	 */
	public void setBaseimageFK(Integer v) {
		_BaseimageFK=v;
	}

	//FIELD

	private String _Creator_firstname=null;

	/**
	 * @return Returns the creator/firstname.
	 */
	public String getCreator_firstname(){
		return _Creator_firstname;
	}

	/**
	 * Sets the value for creator/firstname.
	 * @param v Value to Set.
	 */
	public void setCreator_firstname(String v){
		_Creator_firstname=v;
	}

	//FIELD

	private String _Creator_lastname=null;

	/**
	 * @return Returns the creator/lastname.
	 */
	public String getCreator_lastname(){
		return _Creator_lastname;
	}

	/**
	 * Sets the value for creator/lastname.
	 * @param v Value to Set.
	 */
	public void setCreator_lastname(String v){
		_Creator_lastname=v;
	}
	 private List<org.nrg.xdat.bean.XnatRegionresourceLabelBean> _Subregionlabels_label =new ArrayList<org.nrg.xdat.bean.XnatRegionresourceLabelBean>();

	/**
	 * subregionlabels/label
	 * @return Returns an List of org.nrg.xdat.bean.XnatRegionresourceLabelBean
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceLabelI> List<A> getSubregionlabels_label() {
		return (List<A>) _Subregionlabels_label;
	}

	/**
	 * Sets the value for subregionlabels/label.
	 * @param v Value to Set.
	 */
	public void setSubregionlabels_label(ArrayList<org.nrg.xdat.bean.XnatRegionresourceLabelBean> v){
		_Subregionlabels_label=v;
	}

	/**
	 * Adds the value for subregionlabels/label.
	 * @param v Value to Set.
	 */
	public void addSubregionlabels_label(org.nrg.xdat.bean.XnatRegionresourceLabelBean v){
		_Subregionlabels_label.add(v);
	}

	/**
	 * subregionlabels/label
	 * Adds org.nrg.xdat.model.XnatRegionresourceLabelI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceLabelI> void addSubregionlabels_label(A item) throws Exception{
	_Subregionlabels_label.add((org.nrg.xdat.bean.XnatRegionresourceLabelBean)item);
	}

	/**
	 * Adds the value for subregionlabels/label.
	 * @param v Value to Set.
	 */
	public void addSubregionlabels_label(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatRegionresourceLabelBean)
			_Subregionlabels_label.add((org.nrg.xdat.bean.XnatRegionresourceLabelBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatRegionresourceLabelBean");
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

	private String _SessionId=null;

	/**
	 * @return Returns the session_id.
	 */
	public String getSessionId(){
		return _SessionId;
	}

	/**
	 * Sets the value for session_id.
	 * @param v Value to Set.
	 */
	public void setSessionId(String v){
		_SessionId=v;
	}

	//FIELD

	private Integer _XnatRegionresourceId=null;

	/**
	 * @return Returns the xnat_regionResource_id.
	 */
	public Integer getXnatRegionresourceId() {
		return _XnatRegionresourceId;
	}

	/**
	 * Sets the value for xnat_regionResource_id.
	 * @param v Value to Set.
	 */
	public void setXnatRegionresourceId(Integer v){
		_XnatRegionresourceId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("creator/firstname")){
			setCreator_firstname(v);
		}else if (xmlPath.equals("creator/lastname")){
			setCreator_lastname(v);
		}else if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("hemisphere")){
			setHemisphere(v);
		}else if (xmlPath.equals("session_id")){
			setSessionId(v);
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
		if (xmlPath.equals("file")){
			setFile(v);
		}else if (xmlPath.equals("baseimage")){
			setBaseimage(v);
		}else if (xmlPath.equals("subregionlabels/label")){
			addSubregionlabels_label(v);
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
		if (xmlPath.equals("creator/firstname")){
			return getCreator_firstname();
		}else if (xmlPath.equals("creator/lastname")){
			return getCreator_lastname();
		}else if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("hemisphere")){
			return getHemisphere();
		}else if (xmlPath.equals("session_id")){
			return getSessionId();
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
		if (xmlPath.equals("file")){
			return getFile();
		}else if (xmlPath.equals("baseimage")){
			return getBaseimage();
		}else if (xmlPath.equals("subregionlabels/label")){
			return getSubregionlabels_label();
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
		if (xmlPath.equals("file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("baseimage")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("subregionlabels/label")){
			return "http://nrg.wustl.edu/xnat:regionResource_label";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("file")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("baseimage")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("creator/firstname")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("creator/lastname")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("subregionlabels/label")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("hemisphere")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("session_id")){
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
		all_fields.add("file");
		all_fields.add("baseimage");
		all_fields.add("creator/firstname");
		all_fields.add("creator/lastname");
		all_fields.add("subregionlabels/label");
		all_fields.add("name");
		all_fields.add("hemisphere");
		all_fields.add("session_id");
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
		writer.write("\n<xnat:ImageRegionResource");
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
		writer.write("\n</xnat:ImageRegionResource>");
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
		if (_Name!=null)
			map.put("name",ValueParser(_Name,"string"));
		else map.put("name","");//REQUIRED FIELD

		if (_Hemisphere!=null)
			map.put("hemisphere",ValueParser(_Hemisphere,"string"));
		else map.put("hemisphere","");//REQUIRED FIELD

		if (_SessionId!=null)
			map.put("session_id",ValueParser(_SessionId,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM regionResource -> file
		//DATA-FIELD FROM regionResource -> file
		if (_File!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:file");
			_File.addXMLAtts(writer);
			if(!_File.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + _File.getFullSchemaElementName() + "\"");
			}
			if (_File.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_File.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</xnat:file>");
				}else{
					writer.write("</xnat:file>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		else{
			writer.write("\n" + createHeader(header) + "<xnat:file/>");//REQUIRED
		}
		//REFERENCE FROM regionResource -> baseimage
		//DATA-FIELD FROM regionResource -> baseimage
		if (_Baseimage!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:baseimage");
			_Baseimage.addXMLAtts(writer);
			if(!_Baseimage.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + _Baseimage.getFullSchemaElementName() + "\"");
			}
			if (_Baseimage.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Baseimage.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</xnat:baseimage>");
				}else{
					writer.write("</xnat:baseimage>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		else{
			writer.write("\n" + createHeader(header) + "<xnat:baseimage/>");//REQUIRED
		}
			int child0=0;
			int att0=0;
			if(_Creator_lastname!=null)
			child0++;
			if(_Creator_firstname!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:creator");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Creator_firstname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:firstname");
			writer.write(">");
			writer.write(ValueParser(_Creator_firstname,"string"));
			writer.write("</xnat:firstname>");
			header--;
		}
		if (_Creator_lastname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:lastname");
			writer.write(">");
			writer.write(ValueParser(_Creator_lastname,"string"));
			writer.write("</xnat:lastname>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:creator>");
			}
			}

			int child1=0;
			int att1=0;
			child1+=_Subregionlabels_label.size();
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat:subregionlabels");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM regionResource -> subregionlabels/label
		java.util.Iterator iter2=_Subregionlabels_label.iterator();
		while(iter2.hasNext()){
			org.nrg.xdat.bean.XnatRegionresourceLabelBean child = (org.nrg.xdat.bean.XnatRegionresourceLabelBean)iter2.next();
			writer.write("\n" + createHeader(header++) + "<xnat:label");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:regionResource_label")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return3 =child.addXMLBody(writer,header);
				if(return3){
					writer.write("\n" + createHeader(--header) + "</xnat:label>");
				}else{
					writer.write("</xnat:label>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:subregionlabels>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_File!=null){
			if (_File.hasXMLBodyContent()) return true;
		}
		return true;//REQUIRED file
	}
}
