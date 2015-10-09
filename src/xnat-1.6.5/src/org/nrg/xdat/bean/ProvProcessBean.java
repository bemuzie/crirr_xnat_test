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
public class ProvProcessBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ProvProcessI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ProvProcessBean.class);
	public static String SCHEMA_ELEMENT_NAME="prov:process";

	public String getSchemaElementName(){
		return "process";
	}

	public String getFullSchemaElementName(){
		return "prov:process";
	}
	 private List<org.nrg.xdat.bean.ProvProcessstepBean> _Processstep =new ArrayList<org.nrg.xdat.bean.ProvProcessstepBean>();

	/**
	 * processStep
	 * @return Returns an List of org.nrg.xdat.bean.ProvProcessstepBean
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepI> List<A> getProcessstep() {
		return (List<A>) _Processstep;
	}

	/**
	 * Sets the value for processStep.
	 * @param v Value to Set.
	 */
	public void setProcessstep(ArrayList<org.nrg.xdat.bean.ProvProcessstepBean> v){
		_Processstep=v;
	}

	/**
	 * Adds the value for processStep.
	 * @param v Value to Set.
	 */
	public void addProcessstep(org.nrg.xdat.bean.ProvProcessstepBean v){
		_Processstep.add(v);
	}

	/**
	 * processStep
	 * Adds org.nrg.xdat.model.ProvProcessstepI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepI> void addProcessstep(A item) throws Exception{
	_Processstep.add((org.nrg.xdat.bean.ProvProcessstepBean)item);
	}

	/**
	 * Adds the value for processStep.
	 * @param v Value to Set.
	 */
	public void addProcessstep(Object v){
		if (v instanceof org.nrg.xdat.bean.ProvProcessstepBean)
			_Processstep.add((org.nrg.xdat.bean.ProvProcessstepBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ProvProcessstepBean");
	}

	//FIELD

	private Integer _ProvProcessId=null;

	/**
	 * @return Returns the prov_process_id.
	 */
	public Integer getProvProcessId() {
		return _ProvProcessId;
	}

	/**
	 * Sets the value for prov_process_id.
	 * @param v Value to Set.
	 */
	public void setProvProcessId(Integer v){
		_ProvProcessId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
			super.setDataField(xmlPath,v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("processStep")){
			addProcessstep(v);
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
			return super.getDataFieldValue(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("processStep")){
			return getProcessstep();
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
		if (xmlPath.equals("processStep")){
			return "http://www.nbirn.net/prov:processStep";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("processStep")){
			return BaseElement.field_multi_reference;
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
		all_fields.add("processStep");
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
		writer.write("\n<prov:process");
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
		writer.write("\n</prov:process>");
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
		//REFERENCE FROM process -> processStep
		java.util.Iterator iter0=_Processstep.iterator();
		while(iter0.hasNext()){
			org.nrg.xdat.bean.ProvProcessstepBean child = (org.nrg.xdat.bean.ProvProcessstepBean)iter0.next();
			writer.write("\n" + createHeader(header++) + "<prov:processStep");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("prov:processStep")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return1 =child.addXMLBody(writer,header);
				if(return1){
					writer.write("\n" + createHeader(--header) + "</prov:processStep>");
				}else{
					writer.write("</prov:processStep>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(_Processstep.size()>0) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
