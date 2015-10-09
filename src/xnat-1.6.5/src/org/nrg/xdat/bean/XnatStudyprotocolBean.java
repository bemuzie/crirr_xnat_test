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
public class XnatStudyprotocolBean extends XnatAbstractprotocolBean implements java.io.Serializable, org.nrg.xdat.model.XnatStudyprotocolI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatStudyprotocolBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:studyProtocol";

	public String getSchemaElementName(){
		return "studyProtocol";
	}

	public String getFullSchemaElementName(){
		return "xnat:studyProtocol";
	}
	 private List<org.nrg.xdat.bean.XnatStudyprotocolConditionBean> _Acqconditions_condition =new ArrayList<org.nrg.xdat.bean.XnatStudyprotocolConditionBean>();

	/**
	 * acqConditions/condition
	 * @return Returns an List of org.nrg.xdat.bean.XnatStudyprotocolConditionBean
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolConditionI> List<A> getAcqconditions_condition() {
		return (List<A>) _Acqconditions_condition;
	}

	/**
	 * Sets the value for acqConditions/condition.
	 * @param v Value to Set.
	 */
	public void setAcqconditions_condition(ArrayList<org.nrg.xdat.bean.XnatStudyprotocolConditionBean> v){
		_Acqconditions_condition=v;
	}

	/**
	 * Adds the value for acqConditions/condition.
	 * @param v Value to Set.
	 */
	public void addAcqconditions_condition(org.nrg.xdat.bean.XnatStudyprotocolConditionBean v){
		_Acqconditions_condition.add(v);
	}

	/**
	 * acqConditions/condition
	 * Adds org.nrg.xdat.model.XnatStudyprotocolConditionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolConditionI> void addAcqconditions_condition(A item) throws Exception{
	_Acqconditions_condition.add((org.nrg.xdat.bean.XnatStudyprotocolConditionBean)item);
	}

	/**
	 * Adds the value for acqConditions/condition.
	 * @param v Value to Set.
	 */
	public void addAcqconditions_condition(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStudyprotocolConditionBean)
			_Acqconditions_condition.add((org.nrg.xdat.bean.XnatStudyprotocolConditionBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStudyprotocolConditionBean");
	}
	 private List<org.nrg.xdat.bean.XnatStudyprotocolGroupBean> _Subjectgroups_group =new ArrayList<org.nrg.xdat.bean.XnatStudyprotocolGroupBean>();

	/**
	 * subjectGroups/group
	 * @return Returns an List of org.nrg.xdat.bean.XnatStudyprotocolGroupBean
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolGroupI> List<A> getSubjectgroups_group() {
		return (List<A>) _Subjectgroups_group;
	}

	/**
	 * Sets the value for subjectGroups/group.
	 * @param v Value to Set.
	 */
	public void setSubjectgroups_group(ArrayList<org.nrg.xdat.bean.XnatStudyprotocolGroupBean> v){
		_Subjectgroups_group=v;
	}

	/**
	 * Adds the value for subjectGroups/group.
	 * @param v Value to Set.
	 */
	public void addSubjectgroups_group(org.nrg.xdat.bean.XnatStudyprotocolGroupBean v){
		_Subjectgroups_group.add(v);
	}

	/**
	 * subjectGroups/group
	 * Adds org.nrg.xdat.model.XnatStudyprotocolGroupI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolGroupI> void addSubjectgroups_group(A item) throws Exception{
	_Subjectgroups_group.add((org.nrg.xdat.bean.XnatStudyprotocolGroupBean)item);
	}

	/**
	 * Adds the value for subjectGroups/group.
	 * @param v Value to Set.
	 */
	public void addSubjectgroups_group(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStudyprotocolGroupBean)
			_Subjectgroups_group.add((org.nrg.xdat.bean.XnatStudyprotocolGroupBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStudyprotocolGroupBean");
	}
	 private List<org.nrg.xdat.bean.XnatStudyprotocolVariableBean> _Subjectvariables_variable =new ArrayList<org.nrg.xdat.bean.XnatStudyprotocolVariableBean>();

	/**
	 * subjectVariables/variable
	 * @return Returns an List of org.nrg.xdat.bean.XnatStudyprotocolVariableBean
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolVariableI> List<A> getSubjectvariables_variable() {
		return (List<A>) _Subjectvariables_variable;
	}

	/**
	 * Sets the value for subjectVariables/variable.
	 * @param v Value to Set.
	 */
	public void setSubjectvariables_variable(ArrayList<org.nrg.xdat.bean.XnatStudyprotocolVariableBean> v){
		_Subjectvariables_variable=v;
	}

	/**
	 * Adds the value for subjectVariables/variable.
	 * @param v Value to Set.
	 */
	public void addSubjectvariables_variable(org.nrg.xdat.bean.XnatStudyprotocolVariableBean v){
		_Subjectvariables_variable.add(v);
	}

	/**
	 * subjectVariables/variable
	 * Adds org.nrg.xdat.model.XnatStudyprotocolVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolVariableI> void addSubjectvariables_variable(A item) throws Exception{
	_Subjectvariables_variable.add((org.nrg.xdat.bean.XnatStudyprotocolVariableBean)item);
	}

	/**
	 * Adds the value for subjectVariables/variable.
	 * @param v Value to Set.
	 */
	public void addSubjectvariables_variable(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStudyprotocolVariableBean)
			_Subjectvariables_variable.add((org.nrg.xdat.bean.XnatStudyprotocolVariableBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStudyprotocolVariableBean");
	}
	 private List<org.nrg.xdat.bean.XnatStudyprotocolSessionBean> _Imagesessiontypes_session =new ArrayList<org.nrg.xdat.bean.XnatStudyprotocolSessionBean>();

	/**
	 * imageSessionTypes/session
	 * @return Returns an List of org.nrg.xdat.bean.XnatStudyprotocolSessionBean
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolSessionI> List<A> getImagesessiontypes_session() {
		return (List<A>) _Imagesessiontypes_session;
	}

	/**
	 * Sets the value for imageSessionTypes/session.
	 * @param v Value to Set.
	 */
	public void setImagesessiontypes_session(ArrayList<org.nrg.xdat.bean.XnatStudyprotocolSessionBean> v){
		_Imagesessiontypes_session=v;
	}

	/**
	 * Adds the value for imageSessionTypes/session.
	 * @param v Value to Set.
	 */
	public void addImagesessiontypes_session(org.nrg.xdat.bean.XnatStudyprotocolSessionBean v){
		_Imagesessiontypes_session.add(v);
	}

	/**
	 * imageSessionTypes/session
	 * Adds org.nrg.xdat.model.XnatStudyprotocolSessionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolSessionI> void addImagesessiontypes_session(A item) throws Exception{
	_Imagesessiontypes_session.add((org.nrg.xdat.bean.XnatStudyprotocolSessionBean)item);
	}

	/**
	 * Adds the value for imageSessionTypes/session.
	 * @param v Value to Set.
	 */
	public void addImagesessiontypes_session(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStudyprotocolSessionBean)
			_Imagesessiontypes_session.add((org.nrg.xdat.bean.XnatStudyprotocolSessionBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStudyprotocolSessionBean");
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
		if (xmlPath.equals("acqConditions/condition")){
			addAcqconditions_condition(v);
		}else if (xmlPath.equals("subjectGroups/group")){
			addSubjectgroups_group(v);
		}else if (xmlPath.equals("subjectVariables/variable")){
			addSubjectvariables_variable(v);
		}else if (xmlPath.equals("imageSessionTypes/session")){
			addImagesessiontypes_session(v);
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
		if (xmlPath.equals("acqConditions/condition")){
			return getAcqconditions_condition();
		}else if (xmlPath.equals("subjectGroups/group")){
			return getSubjectgroups_group();
		}else if (xmlPath.equals("subjectVariables/variable")){
			return getSubjectvariables_variable();
		}else if (xmlPath.equals("imageSessionTypes/session")){
			return getImagesessiontypes_session();
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
		if (xmlPath.equals("acqConditions/condition")){
			return "http://nrg.wustl.edu/xnat:studyProtocol_condition";
		}else if (xmlPath.equals("subjectGroups/group")){
			return "http://nrg.wustl.edu/xnat:studyProtocol_group";
		}else if (xmlPath.equals("subjectVariables/variable")){
			return "http://nrg.wustl.edu/xnat:studyProtocol_variable";
		}else if (xmlPath.equals("imageSessionTypes/session")){
			return "http://nrg.wustl.edu/xnat:studyProtocol_session";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("acqConditions/condition")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("subjectGroups/group")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("subjectVariables/variable")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("imageSessionTypes/session")){
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
		all_fields.add("acqConditions/condition");
		all_fields.add("subjectGroups/group");
		all_fields.add("subjectVariables/variable");
		all_fields.add("imageSessionTypes/session");
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
		writer.write("\n<xnat:studyProtocol");
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
		writer.write("\n</xnat:studyProtocol>");
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
		//REFERENCE FROM studyProtocol -> abstractProtocol
			int child0=0;
			int att0=0;
			child0+=_Acqconditions_condition.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:acqConditions");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM studyProtocol -> acqConditions/condition
		java.util.Iterator iter1=_Acqconditions_condition.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatStudyprotocolConditionBean child = (org.nrg.xdat.bean.XnatStudyprotocolConditionBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:condition");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:studyProtocol_condition")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:condition>");
				}else{
					writer.write("</xnat:condition>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:acqConditions>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Subjectgroups_group.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat:subjectGroups");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM studyProtocol -> subjectGroups/group
		java.util.Iterator iter3=_Subjectgroups_group.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.XnatStudyprotocolGroupBean child = (org.nrg.xdat.bean.XnatStudyprotocolGroupBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<xnat:group");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:studyProtocol_group")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:group>");
				}else{
					writer.write("</xnat:group>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:subjectGroups>");
			}
			}

			int child4=0;
			int att4=0;
			child4+=_Subjectvariables_variable.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:subjectVariables");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM studyProtocol -> subjectVariables/variable
		java.util.Iterator iter5=_Subjectvariables_variable.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatStudyprotocolVariableBean child = (org.nrg.xdat.bean.XnatStudyprotocolVariableBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<xnat:variable");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:studyProtocol_variable")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</xnat:variable>");
				}else{
					writer.write("</xnat:variable>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:subjectVariables>");
			}
			}

			int child6=0;
			int att6=0;
			child6+=_Imagesessiontypes_session.size();
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<xnat:imageSessionTypes");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM studyProtocol -> imageSessionTypes/session
		java.util.Iterator iter7=_Imagesessiontypes_session.iterator();
		while(iter7.hasNext()){
			org.nrg.xdat.bean.XnatStudyprotocolSessionBean child = (org.nrg.xdat.bean.XnatStudyprotocolSessionBean)iter7.next();
			writer.write("\n" + createHeader(header++) + "<xnat:session");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:studyProtocol_session")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =child.addXMLBody(writer,header);
				if(return8){
					writer.write("\n" + createHeader(--header) + "</xnat:session>");
				}else{
					writer.write("</xnat:session>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:imageSessionTypes>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Acqconditions_condition.size()>0)return true;
			if(_Subjectgroups_group.size()>0)return true;
			if(_Subjectvariables_variable.size()>0)return true;
			if(_Imagesessiontypes_session.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
