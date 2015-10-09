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
public class ArcPathinfoBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcPathinfoI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcPathinfoBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:pathInfo";

	public String getSchemaElementName(){
		return "pathInfo";
	}

	public String getFullSchemaElementName(){
		return "arc:pathInfo";
	}

	//FIELD

	private String _Archivepath=null;

	/**
	 * @return Returns the archivePath.
	 */
	public String getArchivepath(){
		return _Archivepath;
	}

	/**
	 * Sets the value for archivePath.
	 * @param v Value to Set.
	 */
	public void setArchivepath(String v){
		_Archivepath=v;
	}

	//FIELD

	private String _Prearchivepath=null;

	/**
	 * @return Returns the prearchivePath.
	 */
	public String getPrearchivepath(){
		return _Prearchivepath;
	}

	/**
	 * Sets the value for prearchivePath.
	 * @param v Value to Set.
	 */
	public void setPrearchivepath(String v){
		_Prearchivepath=v;
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

	private String _Buildpath=null;

	/**
	 * @return Returns the buildPath.
	 */
	public String getBuildpath(){
		return _Buildpath;
	}

	/**
	 * Sets the value for buildPath.
	 * @param v Value to Set.
	 */
	public void setBuildpath(String v){
		_Buildpath=v;
	}

	//FIELD

	private String _Ftppath=null;

	/**
	 * @return Returns the ftpPath.
	 */
	public String getFtppath(){
		return _Ftppath;
	}

	/**
	 * Sets the value for ftpPath.
	 * @param v Value to Set.
	 */
	public void setFtppath(String v){
		_Ftppath=v;
	}

	//FIELD

	private String _Pipelinepath=null;

	/**
	 * @return Returns the pipelinePath.
	 */
	public String getPipelinepath(){
		return _Pipelinepath;
	}

	/**
	 * Sets the value for pipelinePath.
	 * @param v Value to Set.
	 */
	public void setPipelinepath(String v){
		_Pipelinepath=v;
	}

	//FIELD

	private Integer _ArcPathinfoId=null;

	/**
	 * @return Returns the arc_pathInfo_id.
	 */
	public Integer getArcPathinfoId() {
		return _ArcPathinfoId;
	}

	/**
	 * Sets the value for arc_pathInfo_id.
	 * @param v Value to Set.
	 */
	public void setArcPathinfoId(Integer v){
		_ArcPathinfoId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("archivePath")){
			setArchivepath(v);
		}else if (xmlPath.equals("prearchivePath")){
			setPrearchivepath(v);
		}else if (xmlPath.equals("cachePath")){
			setCachepath(v);
		}else if (xmlPath.equals("buildPath")){
			setBuildpath(v);
		}else if (xmlPath.equals("ftpPath")){
			setFtppath(v);
		}else if (xmlPath.equals("pipelinePath")){
			setPipelinepath(v);
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
		if (xmlPath.equals("archivePath")){
			return getArchivepath();
		}else if (xmlPath.equals("prearchivePath")){
			return getPrearchivepath();
		}else if (xmlPath.equals("cachePath")){
			return getCachepath();
		}else if (xmlPath.equals("buildPath")){
			return getBuildpath();
		}else if (xmlPath.equals("ftpPath")){
			return getFtppath();
		}else if (xmlPath.equals("pipelinePath")){
			return getPipelinepath();
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
		if (xmlPath.equals("archivePath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("prearchivePath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cachePath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("buildPath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ftpPath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("pipelinePath")){
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
		all_fields.add("archivePath");
		all_fields.add("prearchivePath");
		all_fields.add("cachePath");
		all_fields.add("buildPath");
		all_fields.add("ftpPath");
		all_fields.add("pipelinePath");
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
		writer.write("\n<arc:pathInfo");
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
		writer.write("\n</arc:pathInfo>");
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
		if (_Archivepath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:archivePath");
			writer.write(">");
			writer.write(ValueParser(_Archivepath,"string"));
			writer.write("</arc:archivePath>");
			header--;
		}
		if (_Prearchivepath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:prearchivePath");
			writer.write(">");
			writer.write(ValueParser(_Prearchivepath,"string"));
			writer.write("</arc:prearchivePath>");
			header--;
		}
		if (_Cachepath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:cachePath");
			writer.write(">");
			writer.write(ValueParser(_Cachepath,"string"));
			writer.write("</arc:cachePath>");
			header--;
		}
		if (_Buildpath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:buildPath");
			writer.write(">");
			writer.write(ValueParser(_Buildpath,"string"));
			writer.write("</arc:buildPath>");
			header--;
		}
		if (_Ftppath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:ftpPath");
			writer.write(">");
			writer.write(ValueParser(_Ftppath,"string"));
			writer.write("</arc:ftpPath>");
			header--;
		}
		if (_Pipelinepath!=null){
			writer.write("\n" + createHeader(header++) + "<arc:pipelinePath");
			writer.write(">");
			writer.write(ValueParser(_Pipelinepath,"string"));
			writer.write("</arc:pipelinePath>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Archivepath!=null) return true;
		if (_Prearchivepath!=null) return true;
		if (_Cachepath!=null) return true;
		if (_Buildpath!=null) return true;
		if (_Ftppath!=null) return true;
		if (_Pipelinepath!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
