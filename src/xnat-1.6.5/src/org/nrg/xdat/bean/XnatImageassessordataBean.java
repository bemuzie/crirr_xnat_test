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
public class XnatImageassessordataBean extends XnatDeriveddataBean implements java.io.Serializable, org.nrg.xdat.model.XnatImageassessordataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatImageassessordataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:imageAssessorData";

	public String getSchemaElementName(){
		return "imageAssessorData";
	}

	public String getFullSchemaElementName(){
		return "xnat:imageAssessorData";
	}
	 private List<org.nrg.xdat.bean.XnatAbstractresourceBean> _In_file =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean>();

	/**
	 * in/file
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getIn_file() {
		return (List<A>) _In_file;
	}

	/**
	 * Sets the value for in/file.
	 * @param v Value to Set.
	 */
	public void setIn_file(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean> v){
		_In_file=v;
	}

	/**
	 * Adds the value for in/file.
	 * @param v Value to Set.
	 */
	public void addIn_file(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_In_file.add(v);
	}

	/**
	 * in/file
	 * Adds org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addIn_file(A item) throws Exception{
	_In_file.add((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	/**
	 * Adds the value for in/file.
	 * @param v Value to Set.
	 */
	public void addIn_file(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_In_file.add((org.nrg.xdat.bean.XnatAbstractresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}
	 private List<org.nrg.xdat.bean.XnatAbstractresourceBean> _Out_file =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean>();

	/**
	 * out/file
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getOut_file() {
		return (List<A>) _Out_file;
	}

	/**
	 * Sets the value for out/file.
	 * @param v Value to Set.
	 */
	public void setOut_file(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean> v){
		_Out_file=v;
	}

	/**
	 * Adds the value for out/file.
	 * @param v Value to Set.
	 */
	public void addOut_file(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_Out_file.add(v);
	}

	/**
	 * out/file
	 * Adds org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addOut_file(A item) throws Exception{
	_Out_file.add((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	/**
	 * Adds the value for out/file.
	 * @param v Value to Set.
	 */
	public void addOut_file(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_Out_file.add((org.nrg.xdat.bean.XnatAbstractresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}

	//FIELD

	private String _ImagesessionId=null;

	/**
	 * @return Returns the imageSession_ID.
	 */
	public String getImagesessionId(){
		return _ImagesessionId;
	}

	/**
	 * Sets the value for imageSession_ID.
	 * @param v Value to Set.
	 */
	public void setImagesessionId(String v){
		_ImagesessionId=v;
	}
	 private List<org.nrg.xdat.bean.XnatAddfieldBean> _Parameters_addparam =new ArrayList<org.nrg.xdat.bean.XnatAddfieldBean>();

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.bean.XnatAddfieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> List<A> getParameters_addparam() {
		return (List<A>) _Parameters_addparam;
	}

	/**
	 * Sets the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void setParameters_addparam(ArrayList<org.nrg.xdat.bean.XnatAddfieldBean> v){
		_Parameters_addparam=v;
	}

	/**
	 * Adds the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void addParameters_addparam(org.nrg.xdat.bean.XnatAddfieldBean v){
		_Parameters_addparam.add(v);
	}

	/**
	 * parameters/addParam
	 * Adds org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> void addParameters_addparam(A item) throws Exception{
	_Parameters_addparam.add((org.nrg.xdat.bean.XnatAddfieldBean)item);
	}

	/**
	 * Adds the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void addParameters_addparam(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAddfieldBean)
			_Parameters_addparam.add((org.nrg.xdat.bean.XnatAddfieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAddfieldBean");
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("imageSession_ID")){
			setImagesessionId(v);
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
		if (xmlPath.equals("in/file")){
			addIn_file(v);
		}else if (xmlPath.equals("out/file")){
			addOut_file(v);
		}else if (xmlPath.equals("parameters/addParam")){
			addParameters_addparam(v);
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
		if (xmlPath.equals("imageSession_ID")){
			return getImagesessionId();
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
		if (xmlPath.equals("in/file")){
			return getIn_file();
		}else if (xmlPath.equals("out/file")){
			return getOut_file();
		}else if (xmlPath.equals("parameters/addParam")){
			return getParameters_addparam();
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
		if (xmlPath.equals("in/file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("out/file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("parameters/addParam")){
			return "http://nrg.wustl.edu/xnat:addField";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("in/file")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("out/file")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("imageSession_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/addParam")){
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
		all_fields.add("in/file");
		all_fields.add("out/file");
		all_fields.add("imageSession_ID");
		all_fields.add("parameters/addParam");
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
		writer.write("\n<xnat:imageAssessorData");
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
		writer.write("\n</xnat:imageAssessorData>");
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
		//REFERENCE FROM imageAssessorData -> derivedData
			int child0=0;
			int att0=0;
			child0+=_In_file.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:in");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageAssessorData -> in/file
		java.util.Iterator iter1=_In_file.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:file");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:file>");
				}else{
					writer.write("</xnat:file>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:in>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Out_file.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat:out");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageAssessorData -> out/file
		java.util.Iterator iter3=_Out_file.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<xnat:file");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:file>");
				}else{
					writer.write("</xnat:file>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:out>");
			}
			}

		if (_ImagesessionId!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageSession_ID");
			writer.write(">");
			writer.write(ValueParser(_ImagesessionId,"string"));
			writer.write("</xnat:imageSession_ID>");
			header--;
		}
			int child4=0;
			int att4=0;
			child4+=_Parameters_addparam.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:parameters");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageAssessorData -> parameters/addParam
		java.util.Iterator iter5=_Parameters_addparam.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatAddfieldBean child = (org.nrg.xdat.bean.XnatAddfieldBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addParam");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:addField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</xnat:addParam>");
				}else{
					writer.write("</xnat:addParam>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_In_file.size()>0)return true;
			if(_Out_file.size()>0)return true;
		if (_ImagesessionId!=null) return true;
			if(_Parameters_addparam.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
