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
public class XnatSubjectvariablesdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatSubjectvariablesdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatSubjectvariablesdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:subjectVariablesData";

	public String getSchemaElementName(){
		return "subjectVariablesData";
	}

	public String getFullSchemaElementName(){
		return "xnat:subjectVariablesData";
	}
	 private List<org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean> _Variables_variable =new ArrayList<org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean>();

	/**
	 * variables/variable
	 * @return Returns an List of org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectvariablesdataVariableI> List<A> getVariables_variable() {
		return (List<A>) _Variables_variable;
	}

	/**
	 * Sets the value for variables/variable.
	 * @param v Value to Set.
	 */
	public void setVariables_variable(ArrayList<org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean> v){
		_Variables_variable=v;
	}

	/**
	 * Adds the value for variables/variable.
	 * @param v Value to Set.
	 */
	public void addVariables_variable(org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean v){
		_Variables_variable.add(v);
	}

	/**
	 * variables/variable
	 * Adds org.nrg.xdat.model.XnatSubjectvariablesdataVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectvariablesdataVariableI> void addVariables_variable(A item) throws Exception{
	_Variables_variable.add((org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean)item);
	}

	/**
	 * Adds the value for variables/variable.
	 * @param v Value to Set.
	 */
	public void addVariables_variable(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean)
			_Variables_variable.add((org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean");
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
		if (xmlPath.equals("variables/variable")){
			addVariables_variable(v);
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
		if (xmlPath.equals("variables/variable")){
			return getVariables_variable();
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
		if (xmlPath.equals("variables/variable")){
			return "http://nrg.wustl.edu/xnat:subjectVariablesData_variable";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("variables/variable")){
			return BaseElement.field_NO_CHILD;
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
		all_fields.add("variables/variable");
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
		writer.write("\n<xnat:SubjectVariables");
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
		writer.write("\n</xnat:SubjectVariables>");
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
		//REFERENCE FROM subjectVariablesData -> subjectAssessorData
			int child0=0;
			int att0=0;
			child0+=_Variables_variable.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:variables");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM subjectVariablesData -> variables/variable
		java.util.Iterator iter1=_Variables_variable.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean child = (org.nrg.xdat.bean.XnatSubjectvariablesdataVariableBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:variable");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:subjectVariablesData_variable")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:variable>");
				}else{
					writer.write("</xnat:variable>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:variables>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Variables_variable.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
