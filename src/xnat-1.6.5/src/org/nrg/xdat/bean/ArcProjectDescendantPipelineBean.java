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
public class ArcProjectDescendantPipelineBean extends ArcPipelinedataBean implements java.io.Serializable, org.nrg.xdat.model.ArcProjectDescendantPipelineI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcProjectDescendantPipelineBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:project_descendant_pipeline";

	public String getSchemaElementName(){
		return "project_descendant_pipeline";
	}

	public String getFullSchemaElementName(){
		return "arc:project_descendant_pipeline";
	}

	//FIELD

	private String _Stepid=null;

	/**
	 * @return Returns the stepId.
	 */
	public String getStepid(){
		return _Stepid;
	}

	/**
	 * Sets the value for stepId.
	 * @param v Value to Set.
	 */
	public void setStepid(String v){
		_Stepid=v;
	}

	//FIELD

	private Boolean _Dependent=null;

	/**
	 * @return Returns the dependent.
	 */
	public Boolean getDependent() {
		return _Dependent;
	}

	/**
	 * Sets the value for dependent.
	 * @param v Value to Set.
	 */
	public void setDependent(Object v){
		if(v instanceof Boolean){
			_Dependent=(Boolean)v;
		}else if(v instanceof String){
			_Dependent=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("stepId")){
			setStepid(v);
		}else if (xmlPath.equals("dependent")){
			setDependent(v);
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
		if (xmlPath.equals("stepId")){
			return getStepid();
		}else if (xmlPath.equals("dependent")){
			return getDependent();
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
		if (xmlPath.equals("stepId")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dependent")){
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
		all_fields.add("stepId");
		all_fields.add("dependent");
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
		writer.write("\n<arc:project_descendant_pipeline");
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
		writer.write("\n</arc:project_descendant_pipeline>");
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
		if (_Stepid!=null)
			map.put("stepId",ValueParser(_Stepid,"string"));
		else map.put("stepId","");//REQUIRED FIELD

		if (_Dependent!=null)
			map.put("dependent",ValueParser(_Dependent,"boolean"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM project_descendant_pipeline -> pipelineData
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
