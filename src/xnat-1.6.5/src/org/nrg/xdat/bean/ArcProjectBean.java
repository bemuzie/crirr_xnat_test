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
public class ArcProjectBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcProjectI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcProjectBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:project";

	public String getSchemaElementName(){
		return "project";
	}

	public String getFullSchemaElementName(){
		return "arc:project";
	}
	 private org.nrg.xdat.bean.ArcPathinfoBean _Paths =null;

	/**
	 * paths
	 * @return org.nrg.xdat.bean.ArcPathinfoBean
	 */
	public org.nrg.xdat.bean.ArcPathinfoBean getPaths() {
		return _Paths;
	}

	/**
	 * Sets the value for paths.
	 * @param v Value to Set.
	 */
	public void setPaths(org.nrg.xdat.bean.ArcPathinfoBean v){
		_Paths =v;
	}

	/**
	 * Sets the value for paths.
	 * @param v Value to Set.
	 */
	public void setPaths(Object v) {
		if (v instanceof org.nrg.xdat.bean.ArcPathinfoBean)
			_Paths =(org.nrg.xdat.bean.ArcPathinfoBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcPathinfoBean");
	}

	/**
	 * paths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public <A extends org.nrg.xdat.model.ArcPathinfoI> void setPaths(A item) throws Exception{
	setPaths((org.nrg.xdat.bean.ArcPathinfoBean)item);
	}

	//FIELD

	private Integer _PathsFK=null;

	/**
	 * @return Returns the arc:project/paths_arc_pathinfo_id.
	 */
	public Integer getPathsFK(){
		return _PathsFK;
	}

	/**
	 * Sets the value for arc:project/paths_arc_pathinfo_id.
	 * @param v Value to Set.
	 */
	public void setPathsFK(Integer v) {
		_PathsFK=v;
	}
	 private List<org.nrg.xdat.bean.ArcFieldspecificationBean> _Fieldspecifications_fieldspecification =new ArrayList<org.nrg.xdat.bean.ArcFieldspecificationBean>();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.bean.ArcFieldspecificationBean
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> List<A> getFieldspecifications_fieldspecification() {
		return (List<A>) _Fieldspecifications_fieldspecification;
	}

	/**
	 * Sets the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void setFieldspecifications_fieldspecification(ArrayList<org.nrg.xdat.bean.ArcFieldspecificationBean> v){
		_Fieldspecifications_fieldspecification=v;
	}

	/**
	 * Adds the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void addFieldspecifications_fieldspecification(org.nrg.xdat.bean.ArcFieldspecificationBean v){
		_Fieldspecifications_fieldspecification.add(v);
	}

	/**
	 * fieldSpecifications/fieldSpecification
	 * Adds org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> void addFieldspecifications_fieldspecification(A item) throws Exception{
	_Fieldspecifications_fieldspecification.add((org.nrg.xdat.bean.ArcFieldspecificationBean)item);
	}

	/**
	 * Adds the value for fieldSpecifications/fieldSpecification.
	 * @param v Value to Set.
	 */
	public void addFieldspecifications_fieldspecification(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcFieldspecificationBean)
			_Fieldspecifications_fieldspecification.add((org.nrg.xdat.bean.ArcFieldspecificationBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcFieldspecificationBean");
	}
	 private List<org.nrg.xdat.bean.ArcPropertyBean> _Properties_property =new ArrayList<org.nrg.xdat.bean.ArcPropertyBean>();

	/**
	 * properties/property
	 * @return Returns an List of org.nrg.xdat.bean.ArcPropertyBean
	 */
	public <A extends org.nrg.xdat.model.ArcPropertyI> List<A> getProperties_property() {
		return (List<A>) _Properties_property;
	}

	/**
	 * Sets the value for properties/property.
	 * @param v Value to Set.
	 */
	public void setProperties_property(ArrayList<org.nrg.xdat.bean.ArcPropertyBean> v){
		_Properties_property=v;
	}

	/**
	 * Adds the value for properties/property.
	 * @param v Value to Set.
	 */
	public void addProperties_property(org.nrg.xdat.bean.ArcPropertyBean v){
		_Properties_property.add(v);
	}

	/**
	 * properties/property
	 * Adds org.nrg.xdat.model.ArcPropertyI
	 */
	public <A extends org.nrg.xdat.model.ArcPropertyI> void addProperties_property(A item) throws Exception{
	_Properties_property.add((org.nrg.xdat.bean.ArcPropertyBean)item);
	}

	/**
	 * Adds the value for properties/property.
	 * @param v Value to Set.
	 */
	public void addProperties_property(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcPropertyBean)
			_Properties_property.add((org.nrg.xdat.bean.ArcPropertyBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcPropertyBean");
	}
	 private List<org.nrg.xdat.bean.ArcProjectDescendantBean> _Pipelines_descendants_descendant =new ArrayList<org.nrg.xdat.bean.ArcProjectDescendantBean>();

	/**
	 * pipelines/descendants/descendant
	 * @return Returns an List of org.nrg.xdat.bean.ArcProjectDescendantBean
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantI> List<A> getPipelines_descendants_descendant() {
		return (List<A>) _Pipelines_descendants_descendant;
	}

	/**
	 * Sets the value for pipelines/descendants/descendant.
	 * @param v Value to Set.
	 */
	public void setPipelines_descendants_descendant(ArrayList<org.nrg.xdat.bean.ArcProjectDescendantBean> v){
		_Pipelines_descendants_descendant=v;
	}

	/**
	 * Adds the value for pipelines/descendants/descendant.
	 * @param v Value to Set.
	 */
	public void addPipelines_descendants_descendant(org.nrg.xdat.bean.ArcProjectDescendantBean v){
		_Pipelines_descendants_descendant.add(v);
	}

	/**
	 * pipelines/descendants/descendant
	 * Adds org.nrg.xdat.model.ArcProjectDescendantI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantI> void addPipelines_descendants_descendant(A item) throws Exception{
	_Pipelines_descendants_descendant.add((org.nrg.xdat.bean.ArcProjectDescendantBean)item);
	}

	/**
	 * Adds the value for pipelines/descendants/descendant.
	 * @param v Value to Set.
	 */
	public void addPipelines_descendants_descendant(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcProjectDescendantBean)
			_Pipelines_descendants_descendant.add((org.nrg.xdat.bean.ArcProjectDescendantBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcProjectDescendantBean");
	}
	 private List<org.nrg.xdat.bean.ArcProjectPipelineBean> _Pipelines_pipeline =new ArrayList<org.nrg.xdat.bean.ArcProjectPipelineBean>();

	/**
	 * pipelines/pipeline
	 * @return Returns an List of org.nrg.xdat.bean.ArcProjectPipelineBean
	 */
	public <A extends org.nrg.xdat.model.ArcProjectPipelineI> List<A> getPipelines_pipeline() {
		return (List<A>) _Pipelines_pipeline;
	}

	/**
	 * Sets the value for pipelines/pipeline.
	 * @param v Value to Set.
	 */
	public void setPipelines_pipeline(ArrayList<org.nrg.xdat.bean.ArcProjectPipelineBean> v){
		_Pipelines_pipeline=v;
	}

	/**
	 * Adds the value for pipelines/pipeline.
	 * @param v Value to Set.
	 */
	public void addPipelines_pipeline(org.nrg.xdat.bean.ArcProjectPipelineBean v){
		_Pipelines_pipeline.add(v);
	}

	/**
	 * pipelines/pipeline
	 * Adds org.nrg.xdat.model.ArcProjectPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectPipelineI> void addPipelines_pipeline(A item) throws Exception{
	_Pipelines_pipeline.add((org.nrg.xdat.bean.ArcProjectPipelineBean)item);
	}

	/**
	 * Adds the value for pipelines/pipeline.
	 * @param v Value to Set.
	 */
	public void addPipelines_pipeline(Object v){
		if (v instanceof org.nrg.xdat.bean.ArcProjectPipelineBean)
			_Pipelines_pipeline.add((org.nrg.xdat.bean.ArcProjectPipelineBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ArcProjectPipelineBean");
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the id.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private String _CurrentArc=null;

	/**
	 * @return Returns the current_arc.
	 */
	public String getCurrentArc(){
		return _CurrentArc;
	}

	/**
	 * Sets the value for current_arc.
	 * @param v Value to Set.
	 */
	public void setCurrentArc(String v){
		_CurrentArc=v;
	}

	//FIELD

	private Integer _QuarantineCode=null;

	/**
	 * @return Returns the quarantine_code.
	 */
	public Integer getQuarantineCode(){
		return _QuarantineCode;
	}

	/**
	 * Sets the value for arc:project/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(Integer v) {
		_QuarantineCode=v;
	}

	/**
	 * Sets the value for arc:project/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(String v)  {
		_QuarantineCode=formatInteger(v);
	}

	//FIELD

	private Integer _PrearchiveCode=null;

	/**
	 * @return Returns the prearchive_code.
	 */
	public Integer getPrearchiveCode(){
		return _PrearchiveCode;
	}

	/**
	 * Sets the value for arc:project/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(Integer v) {
		_PrearchiveCode=v;
	}

	/**
	 * Sets the value for arc:project/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(String v)  {
		_PrearchiveCode=formatInteger(v);
	}

	//FIELD

	private Integer _ArcProjectId=null;

	/**
	 * @return Returns the arc_project_id.
	 */
	public Integer getArcProjectId() {
		return _ArcProjectId;
	}

	/**
	 * Sets the value for arc_project_id.
	 * @param v Value to Set.
	 */
	public void setArcProjectId(Integer v){
		_ArcProjectId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("id")){
			setId(v);
		}else if (xmlPath.equals("current_arc")){
			setCurrentArc(v);
		}else if (xmlPath.equals("quarantine_code")){
			setQuarantineCode(v);
		}else if (xmlPath.equals("prearchive_code")){
			setPrearchiveCode(v);
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
		if (xmlPath.equals("paths")){
			setPaths(v);
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			addFieldspecifications_fieldspecification(v);
		}else if (xmlPath.equals("properties/property")){
			addProperties_property(v);
		}else if (xmlPath.equals("pipelines/descendants/descendant")){
			addPipelines_descendants_descendant(v);
		}else if (xmlPath.equals("pipelines/pipeline")){
			addPipelines_pipeline(v);
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
		if (xmlPath.equals("id")){
			return getId();
		}else if (xmlPath.equals("current_arc")){
			return getCurrentArc();
		}else if (xmlPath.equals("quarantine_code")){
			return getQuarantineCode();
		}else if (xmlPath.equals("prearchive_code")){
			return getPrearchiveCode();
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
		if (xmlPath.equals("paths")){
			return getPaths();
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return getFieldspecifications_fieldspecification();
		}else if (xmlPath.equals("properties/property")){
			return getProperties_property();
		}else if (xmlPath.equals("pipelines/descendants/descendant")){
			return getPipelines_descendants_descendant();
		}else if (xmlPath.equals("pipelines/pipeline")){
			return getPipelines_pipeline();
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
		if (xmlPath.equals("paths")){
			return "http://nrg.wustl.edu/arc:pathInfo";
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return "http://nrg.wustl.edu/arc:fieldSpecification";
		}else if (xmlPath.equals("properties/property")){
			return "http://nrg.wustl.edu/arc:property";
		}else if (xmlPath.equals("pipelines/descendants/descendant")){
			return "http://nrg.wustl.edu/arc:project_descendant";
		}else if (xmlPath.equals("pipelines/pipeline")){
			return "http://nrg.wustl.edu/arc:project_pipeline";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("paths")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("fieldSpecifications/fieldSpecification")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("properties/property")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("pipelines/descendants/descendant")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("pipelines/pipeline")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("current_arc")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("quarantine_code")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("prearchive_code")){
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
		all_fields.add("paths");
		all_fields.add("fieldSpecifications/fieldSpecification");
		all_fields.add("properties/property");
		all_fields.add("pipelines/descendants/descendant");
		all_fields.add("pipelines/pipeline");
		all_fields.add("id");
		all_fields.add("current_arc");
		all_fields.add("quarantine_code");
		all_fields.add("prearchive_code");
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
		writer.write("\n<arc:project");
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
		writer.write("\n</arc:project>");
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
		if (_Id!=null)
			map.put("id",ValueParser(_Id,"string"));
		else map.put("id","");//REQUIRED FIELD

		if (_CurrentArc!=null)
			map.put("current_arc",ValueParser(_CurrentArc,"string"));
		//NOT REQUIRED FIELD

		if (_QuarantineCode!=null)
			map.put("quarantine_code",ValueParser(_QuarantineCode,"integer"));
		//NOT REQUIRED FIELD

		if (_PrearchiveCode!=null)
			map.put("prearchive_code",ValueParser(_PrearchiveCode,"integer"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM project -> paths
		//DATA-FIELD FROM project -> paths
		if (_Paths!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<arc:paths");
			_Paths.addXMLAtts(writer);
			if(!_Paths.getFullSchemaElementName().equals("arc:pathInfo")){
				writer.write(" xsi:type=\"" + _Paths.getFullSchemaElementName() + "\"");
			}
			if (_Paths.hasXMLBodyContent()){
				writer.write(">");
				boolean return0 =_Paths.addXMLBody(writer,header);
				if(return0){
					writer.write("\n" + createHeader(--header) + "</arc:paths>");
				}else{
					writer.write("</arc:paths>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

			int child0=0;
			int att0=0;
			child0+=_Fieldspecifications_fieldspecification.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<arc:fieldSpecifications");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM project -> fieldSpecifications/fieldSpecification
		java.util.Iterator iter1=_Fieldspecifications_fieldspecification.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.ArcFieldspecificationBean child = (org.nrg.xdat.bean.ArcFieldspecificationBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<arc:fieldSpecification");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:fieldSpecification")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</arc:fieldSpecification>");
				}else{
					writer.write("</arc:fieldSpecification>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:fieldSpecifications>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Properties_property.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<arc:properties");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM project -> properties/property
		java.util.Iterator iter3=_Properties_property.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.ArcPropertyBean child = (org.nrg.xdat.bean.ArcPropertyBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<arc:property");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:property")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</arc:property>");
				}else{
					writer.write("</arc:property>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:properties>");
			}
			}

			int child4=0;
			int att4=0;
			child4+=_Pipelines_pipeline.size();
			child4+=_Pipelines_descendants_descendant.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<arc:pipelines");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
			int child5=0;
			int att5=0;
			child5+=_Pipelines_descendants_descendant.size();
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<arc:descendants");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM project -> pipelines/descendants/descendant
		java.util.Iterator iter6=_Pipelines_descendants_descendant.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.ArcProjectDescendantBean child = (org.nrg.xdat.bean.ArcProjectDescendantBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<arc:descendant");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:project_descendant")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</arc:descendant>");
				}else{
					writer.write("</arc:descendant>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:descendants>");
			}
			}

		//REFERENCE FROM project -> pipelines/pipeline
		java.util.Iterator iter7=_Pipelines_pipeline.iterator();
		while(iter7.hasNext()){
			org.nrg.xdat.bean.ArcProjectPipelineBean child = (org.nrg.xdat.bean.ArcProjectPipelineBean)iter7.next();
			writer.write("\n" + createHeader(header++) + "<arc:pipeline");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("arc:project_pipeline")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =child.addXMLBody(writer,header);
				if(return8){
					writer.write("\n" + createHeader(--header) + "</arc:pipeline>");
				}else{
					writer.write("</arc:pipeline>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</arc:pipelines>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Paths!=null){
			if (_Paths.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

			if(_Fieldspecifications_fieldspecification.size()>0)return true;
			if(_Properties_property.size()>0)return true;
			if(_Pipelines_pipeline.size()>0)return true;
			if(_Pipelines_descendants_descendant.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
