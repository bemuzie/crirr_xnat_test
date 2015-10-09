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
public class ArcProjectDescendantBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcProjectDescendantI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcProjectDescendantBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:project_descendant";

	public String getSchemaElementName(){
		return "project_descendant";
	}

	public String getFullSchemaElementName(){
		return "arc:project_descendant";
	}
	 private List<org.nrg.xdat.bean.ArcProjectDescendantPipelineBean> _Pipeline =new ArrayList<org.nrg.xdat.bean.ArcProjectDescendantPipelineBean>();

	/**
	 * pipeline
	 * @return Returns an List of org.nrg.xdat.bean.ArcProjectDescendantPipelineBean
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantPipelineI> List<A> getPipeline() {
		return (List<A>) _Pipeline;
	}

	/**
	 * Sets the value for pipeline.
	 * @param v Value to Set.
	 */
	public void setPipeline(ArrayList<org.nrg.xdat.bean.ArcProjectDescendantPipelineBean> v){
		_Pipeline=v;
	}

	/**
	 * Adds the value for pipeline.
	 * @param v Value to Set.
	 */
	public void addPipeline(org.nrg.xdat.bean.ArcProjectDescendantPipelineBean v){
		_Pipeline.add(v);
	}

	/**
	 * pipeline
	 * Adds org.nrg.xdat.model.ArcProjectDescendantPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantPipelineI> void addPipeline(A item) throws Exception{
	_Pipeline.add((org.nrg.xdat.bean.ArcProjectDescendantPipelineBean)item);
	}

	/**
	 * Adds the value for pipeline.
	 * @param v Value to Set.
	 */
	public void addPipeline(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcProjectDescendantPipelineBean)
			_Pipeline.add((org.nrg.xdat.bean.ArcProjectDescendantPipelineBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcProjectDescendantPipelineBean");
	}

	//FIELD

	private String _Xsitype=null;

	/**
	 * @return Returns the xsiType.
	 */
	public String getXsitype(){
		return _Xsitype;
	}

	/**
	 * Sets the value for xsiType.
	 * @param v Value to Set.
	 */
	public void setXsitype(String v){
		_Xsitype=v;
	}

	//FIELD

	private Integer _ArcProjectDescendantId=null;

	/**
	 * @return Returns the arc_project_descendant_id.
	 */
	public Integer getArcProjectDescendantId() {
		return _ArcProjectDescendantId;
	}

	/**
	 * Sets the value for arc_project_descendant_id.
	 * @param v Value to Set.
	 */
	public void setArcProjectDescendantId(Integer v){
		_ArcProjectDescendantId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("xsiType")){
			setXsitype(v);
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
		if (xmlPath.equals("pipeline")){
			addPipeline(v);
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
		if (xmlPath.equals("xsiType")){
			return getXsitype();
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
		if (xmlPath.equals("pipeline")){
			return getPipeline();
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
		if (xmlPath.equals("pipeline")){
			return "http://nrg.wustl.edu/arc:project_descendant_pipeline";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("pipeline")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("xsiType")){
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
		all_fields.add("pipeline");
		all_fields.add("xsiType");
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
		writer.write("\n<arc:project_descendant");
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
		writer.write("\n</arc:project_descendant>");
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
		if (_Xsitype!=null)
			map.put("xsiType",ValueParser(_Xsitype,"string"));
		else map.put("xsiType","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM project_descendant -> pipeline
		java.util.Iterator iter0=_Pipeline.iterator();
		while(iter0.hasNext()){
			org.nrg.xdat.bean.ArcProjectDescendantPipelineBean child = (org.nrg.xdat.bean.ArcProjectDescendantPipelineBean)iter0.next();
			writer.write("\n" + createHeader(header++) + "<arc:pipeline");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:project_descendant_pipeline")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return1 =child.addXMLBody(writer,header);
				if(return1){
					writer.write("\n" + createHeader(--header) + "</arc:pipeline>");
				}else{
					writer.write("</arc:pipeline>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(_Pipeline.size()>0) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
