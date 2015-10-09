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
public class ProvProcessstepLibraryBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ProvProcessstepLibraryI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ProvProcessstepLibraryBean.class);
	public static String SCHEMA_ELEMENT_NAME="prov:processStep_library";

	public String getSchemaElementName(){
		return "processStep_library";
	}

	public String getFullSchemaElementName(){
		return "prov:processStep_library";
	}

	//FIELD

	private String _Library=null;

	/**
	 * @return Returns the library.
	 */
	public String getLibrary(){
		return _Library;
	}

	/**
	 * Sets the value for library.
	 * @param v Value to Set.
	 */
	public void setLibrary(String v){
		_Library=v;
	}

	//FIELD

	private String _Version=null;

	/**
	 * @return Returns the version.
	 */
	public String getVersion(){
		return _Version;
	}

	/**
	 * Sets the value for version.
	 * @param v Value to Set.
	 */
	public void setVersion(String v){
		_Version=v;
	}

	//FIELD

	private Integer _ProvProcessstepLibraryId=null;

	/**
	 * @return Returns the prov_processStep_library_id.
	 */
	public Integer getProvProcessstepLibraryId() {
		return _ProvProcessstepLibraryId;
	}

	/**
	 * Sets the value for prov_processStep_library_id.
	 * @param v Value to Set.
	 */
	public void setProvProcessstepLibraryId(Integer v){
		_ProvProcessstepLibraryId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("library")){
			setLibrary(v);
		}else if (xmlPath.equals("version")){
			setVersion(v);
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
		if (xmlPath.equals("library")){
			return getLibrary();
		}else if (xmlPath.equals("version")){
			return getVersion();
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
		if (xmlPath.equals("library")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("version")){
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
		all_fields.add("library");
		all_fields.add("version");
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
		writer.write("\n<prov:processStep_library");
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
		writer.write("\n</prov:processStep_library>");
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
		if (_Version!=null)
			map.put("version",ValueParser(_Version,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Library!=null){
			writer.write(ValueParser(_Library,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Library!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
