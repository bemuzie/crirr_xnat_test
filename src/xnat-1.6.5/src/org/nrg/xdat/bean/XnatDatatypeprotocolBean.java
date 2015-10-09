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
public class XnatDatatypeprotocolBean extends XnatAbstractprotocolBean implements java.io.Serializable, org.nrg.xdat.model.XnatDatatypeprotocolI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatDatatypeprotocolBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:datatypeProtocol";

	public String getSchemaElementName(){
		return "datatypeProtocol";
	}

	public String getFullSchemaElementName(){
		return "xnat:datatypeProtocol";
	}
	 private List<org.nrg.xdat.bean.XnatFielddefinitiongroupBean> _Definitions_definition =new ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupBean>();

	/**
	 * definitions/definition
	 * @return Returns an List of org.nrg.xdat.bean.XnatFielddefinitiongroupBean
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupI> List<A> getDefinitions_definition() {
		return (List<A>) _Definitions_definition;
	}

	/**
	 * Sets the value for definitions/definition.
	 * @param v Value to Set.
	 */
	public void setDefinitions_definition(ArrayList<org.nrg.xdat.bean.XnatFielddefinitiongroupBean> v){
		_Definitions_definition=v;
	}

	/**
	 * Adds the value for definitions/definition.
	 * @param v Value to Set.
	 */
	public void addDefinitions_definition(org.nrg.xdat.bean.XnatFielddefinitiongroupBean v){
		_Definitions_definition.add(v);
	}

	/**
	 * definitions/definition
	 * Adds org.nrg.xdat.model.XnatFielddefinitiongroupI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupI> void addDefinitions_definition(A item) throws Exception{
	_Definitions_definition.add((org.nrg.xdat.bean.XnatFielddefinitiongroupBean)item);
	}

	/**
	 * Adds the value for definitions/definition.
	 * @param v Value to Set.
	 */
	public void addDefinitions_definition(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatFielddefinitiongroupBean)
			_Definitions_definition.add((org.nrg.xdat.bean.XnatFielddefinitiongroupBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatFielddefinitiongroupBean");
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
		if (xmlPath.equals("definitions/definition")){
			addDefinitions_definition(v);
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
		if (xmlPath.equals("definitions/definition")){
			return getDefinitions_definition();
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
		if (xmlPath.equals("definitions/definition")){
			return "http://nrg.wustl.edu/xnat:fieldDefinitionGroup";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("definitions/definition")){
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
		all_fields.add("definitions/definition");
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
		writer.write("\n<xnat:datatypeProtocol");
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
		writer.write("\n</xnat:datatypeProtocol>");
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
		//REFERENCE FROM datatypeProtocol -> abstractProtocol
			int child0=0;
			int att0=0;
			child0+=_Definitions_definition.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:definitions");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM datatypeProtocol -> definitions/definition
		java.util.Iterator iter1=_Definitions_definition.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatFielddefinitiongroupBean child = (org.nrg.xdat.bean.XnatFielddefinitiongroupBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:definition");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:fieldDefinitionGroup")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:definition>");
				}else{
					writer.write("</xnat:definition>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:definitions>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Definitions_definition.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
