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
public class XnatExperimentdataShareBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatExperimentdataShareI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatExperimentdataShareBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:experimentData_share";

	public String getSchemaElementName(){
		return "experimentData_share";
	}

	public String getFullSchemaElementName(){
		return "xnat:experimentData_share";
	}

	//FIELD

	private String _Share=null;

	/**
	 * @return Returns the share.
	 */
	public String getShare(){
		return _Share;
	}

	/**
	 * Sets the value for share.
	 * @param v Value to Set.
	 */
	public void setShare(String v){
		_Share=v;
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

	private String _Project=null;

	/**
	 * @return Returns the project.
	 */
	public String getProject(){
		return _Project;
	}

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v){
		_Project=v;
	}

	//FIELD

	private String _Visit=null;

	/**
	 * @return Returns the visit.
	 */
	public String getVisit(){
		return _Visit;
	}

	/**
	 * Sets the value for visit.
	 * @param v Value to Set.
	 */
	public void setVisit(String v){
		_Visit=v;
	}

	//FIELD

	private String _Protocol=null;

	/**
	 * @return Returns the protocol.
	 */
	public String getProtocol(){
		return _Protocol;
	}

	/**
	 * Sets the value for protocol.
	 * @param v Value to Set.
	 */
	public void setProtocol(String v){
		_Protocol=v;
	}

	//FIELD

	private Integer _XnatExperimentdataShareId=null;

	/**
	 * @return Returns the xnat_experimentData_share_id.
	 */
	public Integer getXnatExperimentdataShareId() {
		return _XnatExperimentdataShareId;
	}

	/**
	 * Sets the value for xnat_experimentData_share_id.
	 * @param v Value to Set.
	 */
	public void setXnatExperimentdataShareId(Integer v){
		_XnatExperimentdataShareId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("share")){
			setShare(v);
		}else if (xmlPath.equals("label")){
			setLabel(v);
		}else if (xmlPath.equals("project")){
			setProject(v);
		}else if (xmlPath.equals("visit")){
			setVisit(v);
		}else if (xmlPath.equals("protocol")){
			setProtocol(v);
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
		if (xmlPath.equals("share")){
			return getShare();
		}else if (xmlPath.equals("label")){
			return getLabel();
		}else if (xmlPath.equals("project")){
			return getProject();
		}else if (xmlPath.equals("visit")){
			return getVisit();
		}else if (xmlPath.equals("protocol")){
			return getProtocol();
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
		if (xmlPath.equals("share")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("label")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("project")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("visit")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("protocol")){
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
		all_fields.add("share");
		all_fields.add("label");
		all_fields.add("project");
		all_fields.add("visit");
		all_fields.add("protocol");
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
		writer.write("\n<xnat:experimentData_share");
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
		writer.write("\n</xnat:experimentData_share>");
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

		if (_Project!=null)
			map.put("project",ValueParser(_Project,"string"));
		//NOT REQUIRED FIELD

		if (_Visit!=null)
			map.put("visit",ValueParser(_Visit,"string"));
		//NOT REQUIRED FIELD

		if (_Protocol!=null)
			map.put("protocol",ValueParser(_Protocol,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Share!=null){
			writer.write(ValueParser(_Share,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_Share!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
