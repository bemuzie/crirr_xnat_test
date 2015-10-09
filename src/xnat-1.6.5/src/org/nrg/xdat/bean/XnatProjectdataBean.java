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
public class XnatProjectdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatProjectdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatProjectdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:projectData";

	public String getSchemaElementName(){
		return "projectData";
	}

	public String getFullSchemaElementName(){
		return "xnat:projectData";
	}

	//FIELD

	private String _Name=null;

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		return _Name;
	}

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v){
		_Name=v;
	}

	//FIELD

	private String _Description=null;

	/**
	 * @return Returns the description.
	 */
	public String getDescription(){
		return _Description;
	}

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v){
		_Description=v;
	}

	//FIELD

	private String _Keywords=null;

	/**
	 * @return Returns the keywords.
	 */
	public String getKeywords(){
		return _Keywords;
	}

	/**
	 * Sets the value for keywords.
	 * @param v Value to Set.
	 */
	public void setKeywords(String v){
		_Keywords=v;
	}
	 private List<org.nrg.xdat.bean.XnatProjectdataAliasBean> _Aliases_alias =new ArrayList<org.nrg.xdat.bean.XnatProjectdataAliasBean>();

	/**
	 * aliases/alias
	 * @return Returns an List of org.nrg.xdat.bean.XnatProjectdataAliasBean
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataAliasI> List<A> getAliases_alias() {
		return (List<A>) _Aliases_alias;
	}

	/**
	 * Sets the value for aliases/alias.
	 * @param v Value to Set.
	 */
	public void setAliases_alias(ArrayList<org.nrg.xdat.bean.XnatProjectdataAliasBean> v){
		_Aliases_alias=v;
	}

	/**
	 * Adds the value for aliases/alias.
	 * @param v Value to Set.
	 */
	public void addAliases_alias(org.nrg.xdat.bean.XnatProjectdataAliasBean v){
		_Aliases_alias.add(v);
	}

	/**
	 * aliases/alias
	 * Adds org.nrg.xdat.model.XnatProjectdataAliasI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataAliasI> void addAliases_alias(A item) throws Exception{
	_Aliases_alias.add((org.nrg.xdat.bean.XnatProjectdataAliasBean)item);
	}

	/**
	 * Adds the value for aliases/alias.
	 * @param v Value to Set.
	 */
	public void addAliases_alias(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatProjectdataAliasBean)
			_Aliases_alias.add((org.nrg.xdat.bean.XnatProjectdataAliasBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatProjectdataAliasBean");
	}
	 private List<org.nrg.xdat.bean.XnatPublicationresourceBean> _Publications_publication =new ArrayList<org.nrg.xdat.bean.XnatPublicationresourceBean>();

	/**
	 * publications/publication
	 * @return Returns an List of org.nrg.xdat.bean.XnatPublicationresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatPublicationresourceI> List<A> getPublications_publication() {
		return (List<A>) _Publications_publication;
	}

	/**
	 * Sets the value for publications/publication.
	 * @param v Value to Set.
	 */
	public void setPublications_publication(ArrayList<org.nrg.xdat.bean.XnatPublicationresourceBean> v){
		_Publications_publication=v;
	}

	/**
	 * Adds the value for publications/publication.
	 * @param v Value to Set.
	 */
	public void addPublications_publication(org.nrg.xdat.bean.XnatPublicationresourceBean v){
		_Publications_publication.add(v);
	}

	/**
	 * publications/publication
	 * Adds org.nrg.xdat.model.XnatPublicationresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatPublicationresourceI> void addPublications_publication(A item) throws Exception{
	_Publications_publication.add((org.nrg.xdat.bean.XnatPublicationresourceBean)item);
	}

	/**
	 * Adds the value for publications/publication.
	 * @param v Value to Set.
	 */
	public void addPublications_publication(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatPublicationresourceBean)
			_Publications_publication.add((org.nrg.xdat.bean.XnatPublicationresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatPublicationresourceBean");
	}
	 private List<org.nrg.xdat.bean.XnatAbstractresourceBean> _Resources_resource =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean>();

	/**
	 * resources/resource
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getResources_resource() {
		return (List<A>) _Resources_resource;
	}

	/**
	 * Sets the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void setResources_resource(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean> v){
		_Resources_resource=v;
	}

	/**
	 * Adds the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void addResources_resource(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_Resources_resource.add(v);
	}

	/**
	 * resources/resource
	 * Adds org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addResources_resource(A item) throws Exception{
	_Resources_resource.add((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	/**
	 * Adds the value for resources/resource.
	 * @param v Value to Set.
	 */
	public void addResources_resource(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_Resources_resource.add((org.nrg.xdat.bean.XnatAbstractresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}
	 private List<org.nrg.xdat.bean.XnatAbstractprotocolBean> _Studyprotocol =new ArrayList<org.nrg.xdat.bean.XnatAbstractprotocolBean>();

	/**
	 * studyProtocol
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractprotocolBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractprotocolI> List<A> getStudyprotocol() {
		return (List<A>) _Studyprotocol;
	}

	/**
	 * Sets the value for studyProtocol.
	 * @param v Value to Set.
	 */
	public void setStudyprotocol(ArrayList<org.nrg.xdat.bean.XnatAbstractprotocolBean> v){
		_Studyprotocol=v;
	}

	/**
	 * Adds the value for studyProtocol.
	 * @param v Value to Set.
	 */
	public void addStudyprotocol(org.nrg.xdat.bean.XnatAbstractprotocolBean v){
		_Studyprotocol.add(v);
	}

	/**
	 * studyProtocol
	 * Adds org.nrg.xdat.model.XnatAbstractprotocolI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractprotocolI> void addStudyprotocol(A item) throws Exception{
	_Studyprotocol.add((org.nrg.xdat.bean.XnatAbstractprotocolBean)item);
	}

	/**
	 * Adds the value for studyProtocol.
	 * @param v Value to Set.
	 */
	public void addStudyprotocol(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractprotocolBean)
			_Studyprotocol.add((org.nrg.xdat.bean.XnatAbstractprotocolBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractprotocolBean");
	}
	 private org.nrg.xdat.bean.XnatInvestigatordataBean _Pi =null;

	/**
	 * PI
	 * @return org.nrg.xdat.bean.XnatInvestigatordataBean
	 */
	public org.nrg.xdat.bean.XnatInvestigatordataBean getPi() {
		return _Pi;
	}

	/**
	 * Sets the value for PI.
	 * @param v Value to Set.
	 */
	public void setPi(org.nrg.xdat.bean.XnatInvestigatordataBean v){
		_Pi =v;
	}

	/**
	 * Sets the value for PI.
	 * @param v Value to Set.
	 */
	public void setPi(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatInvestigatordataBean)
			_Pi =(org.nrg.xdat.bean.XnatInvestigatordataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatInvestigatordataBean");
	}

	/**
	 * PI
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void setPi(A item) throws Exception{
	setPi((org.nrg.xdat.bean.XnatInvestigatordataBean)item);
	}

	//FIELD

	private Integer _PiFK=null;

	/**
	 * @return Returns the xnat:projectData/pi_xnat_investigatordata_id.
	 */
	public Integer getPiFK(){
		return _PiFK;
	}

	/**
	 * Sets the value for xnat:projectData/pi_xnat_investigatordata_id.
	 * @param v Value to Set.
	 */
	public void setPiFK(Integer v) {
		_PiFK=v;
	}
	 private List<org.nrg.xdat.bean.XnatInvestigatordataBean> _Investigators_investigator =new ArrayList<org.nrg.xdat.bean.XnatInvestigatordataBean>();

	/**
	 * investigators/investigator
	 * @return Returns an List of org.nrg.xdat.bean.XnatInvestigatordataBean
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> List<A> getInvestigators_investigator() {
		return (List<A>) _Investigators_investigator;
	}

	/**
	 * Sets the value for investigators/investigator.
	 * @param v Value to Set.
	 */
	public void setInvestigators_investigator(ArrayList<org.nrg.xdat.bean.XnatInvestigatordataBean> v){
		_Investigators_investigator=v;
	}

	/**
	 * Adds the value for investigators/investigator.
	 * @param v Value to Set.
	 */
	public void addInvestigators_investigator(org.nrg.xdat.bean.XnatInvestigatordataBean v){
		_Investigators_investigator.add(v);
	}

	/**
	 * investigators/investigator
	 * Adds org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void addInvestigators_investigator(A item) throws Exception{
	_Investigators_investigator.add((org.nrg.xdat.bean.XnatInvestigatordataBean)item);
	}

	/**
	 * Adds the value for investigators/investigator.
	 * @param v Value to Set.
	 */
	public void addInvestigators_investigator(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatInvestigatordataBean)
			_Investigators_investigator.add((org.nrg.xdat.bean.XnatInvestigatordataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatInvestigatordataBean");
	}
	 private List<org.nrg.xdat.bean.XnatProjectdataFieldBean> _Fields_field =new ArrayList<org.nrg.xdat.bean.XnatProjectdataFieldBean>();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.bean.XnatProjectdataFieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataFieldI> List<A> getFields_field() {
		return (List<A>) _Fields_field;
	}

	/**
	 * Sets the value for fields/field.
	 * @param v Value to Set.
	 */
	public void setFields_field(ArrayList<org.nrg.xdat.bean.XnatProjectdataFieldBean> v){
		_Fields_field=v;
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(org.nrg.xdat.bean.XnatProjectdataFieldBean v){
		_Fields_field.add(v);
	}

	/**
	 * fields/field
	 * Adds org.nrg.xdat.model.XnatProjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataFieldI> void addFields_field(A item) throws Exception{
	_Fields_field.add((org.nrg.xdat.bean.XnatProjectdataFieldBean)item);
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatProjectdataFieldBean)
			_Fields_field.add((org.nrg.xdat.bean.XnatProjectdataFieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatProjectdataFieldBean");
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the ID.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private String _SecondaryId=null;

	/**
	 * @return Returns the secondary_ID.
	 */
	public String getSecondaryId(){
		return _SecondaryId;
	}

	/**
	 * Sets the value for secondary_ID.
	 * @param v Value to Set.
	 */
	public void setSecondaryId(String v){
		_SecondaryId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("name")){
			setName(v);
		}else if (xmlPath.equals("description")){
			setDescription(v);
		}else if (xmlPath.equals("keywords")){
			setKeywords(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("secondary_ID")){
			setSecondaryId(v);
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
		if (xmlPath.equals("aliases/alias")){
			addAliases_alias(v);
		}else if (xmlPath.equals("publications/publication")){
			addPublications_publication(v);
		}else if (xmlPath.equals("resources/resource")){
			addResources_resource(v);
		}else if (xmlPath.equals("studyProtocol")){
			addStudyprotocol(v);
		}else if (xmlPath.equals("PI")){
			setPi(v);
		}else if (xmlPath.equals("investigators/investigator")){
			addInvestigators_investigator(v);
		}else if (xmlPath.equals("fields/field")){
			addFields_field(v);
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
		if (xmlPath.equals("name")){
			return getName();
		}else if (xmlPath.equals("description")){
			return getDescription();
		}else if (xmlPath.equals("keywords")){
			return getKeywords();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("secondary_ID")){
			return getSecondaryId();
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
		if (xmlPath.equals("aliases/alias")){
			return getAliases_alias();
		}else if (xmlPath.equals("publications/publication")){
			return getPublications_publication();
		}else if (xmlPath.equals("resources/resource")){
			return getResources_resource();
		}else if (xmlPath.equals("studyProtocol")){
			return getStudyprotocol();
		}else if (xmlPath.equals("PI")){
			return getPi();
		}else if (xmlPath.equals("investigators/investigator")){
			return getInvestigators_investigator();
		}else if (xmlPath.equals("fields/field")){
			return getFields_field();
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
		if (xmlPath.equals("aliases/alias")){
			return "http://nrg.wustl.edu/xnat:projectData_alias";
		}else if (xmlPath.equals("publications/publication")){
			return "http://nrg.wustl.edu/xnat:publicationResource";
		}else if (xmlPath.equals("resources/resource")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("studyProtocol")){
			return "http://nrg.wustl.edu/xnat:abstractProtocol";
		}else if (xmlPath.equals("PI")){
			return "http://nrg.wustl.edu/xnat:investigatorData";
		}else if (xmlPath.equals("investigators/investigator")){
			return "http://nrg.wustl.edu/xnat:investigatorData";
		}else if (xmlPath.equals("fields/field")){
			return "http://nrg.wustl.edu/xnat:projectData_field";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("name")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("description")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("keywords")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("aliases/alias")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("publications/publication")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("resources/resource")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("studyProtocol")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("PI")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("investigators/investigator")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("fields/field")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("secondary_ID")){
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
		all_fields.add("name");
		all_fields.add("description");
		all_fields.add("keywords");
		all_fields.add("aliases/alias");
		all_fields.add("publications/publication");
		all_fields.add("resources/resource");
		all_fields.add("studyProtocol");
		all_fields.add("PI");
		all_fields.add("investigators/investigator");
		all_fields.add("fields/field");
		all_fields.add("ID");
		all_fields.add("secondary_ID");
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
		writer.write("\n<xnat:Project");
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
		writer.write("\n</xnat:Project>");
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
			map.put("ID",ValueParser(_Id,"string"));
		else map.put("ID","");//REQUIRED FIELD

		if (_SecondaryId!=null)
			map.put("secondary_ID",ValueParser(_SecondaryId,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Name!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:name");
			writer.write(">");
			writer.write(ValueParser(_Name,"string"));
			writer.write("</xnat:name>");
			header--;
		}
		if (_Description!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:description");
			writer.write(">");
			writer.write(ValueParser(_Description,"string"));
			writer.write("</xnat:description>");
			header--;
		}
		if (_Keywords!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:keywords");
			writer.write(">");
			writer.write(ValueParser(_Keywords,"string"));
			writer.write("</xnat:keywords>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Aliases_alias.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:aliases");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM projectData -> aliases/alias
		java.util.Iterator iter1=_Aliases_alias.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatProjectdataAliasBean child = (org.nrg.xdat.bean.XnatProjectdataAliasBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:alias");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:projectData_alias")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:alias>");
				}else{
					writer.write("</xnat:alias>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:aliases>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Publications_publication.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat:publications");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM projectData -> publications/publication
		java.util.Iterator iter3=_Publications_publication.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.XnatPublicationresourceBean child = (org.nrg.xdat.bean.XnatPublicationresourceBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<xnat:publication");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:publicationResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:publication>");
				}else{
					writer.write("</xnat:publication>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:publications>");
			}
			}

			int child4=0;
			int att4=0;
			child4+=_Resources_resource.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:resources");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM projectData -> resources/resource
		java.util.Iterator iter5=_Resources_resource.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<xnat:resource");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</xnat:resource>");
				}else{
					writer.write("</xnat:resource>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:resources>");
			}
			}

		//REFERENCE FROM projectData -> studyProtocol
		java.util.Iterator iter6=_Studyprotocol.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.XnatAbstractprotocolBean child = (org.nrg.xdat.bean.XnatAbstractprotocolBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<xnat:studyProtocol");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractProtocol")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</xnat:studyProtocol>");
				}else{
					writer.write("</xnat:studyProtocol>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//REFERENCE FROM projectData -> PI
		//DATA-FIELD FROM projectData -> PI
		if (_Pi!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:PI");
			_Pi.addXMLAtts(writer);
			if(!_Pi.getFullSchemaElementName().equals("xnat:investigatorData")){
				writer.write(" xsi:type=\"" + _Pi.getFullSchemaElementName() + "\"");
			}
			if (_Pi.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =_Pi.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</xnat:PI>");
				}else{
					writer.write("</xnat:PI>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

			int child7=0;
			int att7=0;
			child7+=_Investigators_investigator.size();
			if(child7>0 || att7>0){
				writer.write("\n" + createHeader(header++) + "<xnat:investigators");
			if(child7==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM projectData -> investigators/investigator
		java.util.Iterator iter8=_Investigators_investigator.iterator();
		while(iter8.hasNext()){
			org.nrg.xdat.bean.XnatInvestigatordataBean child = (org.nrg.xdat.bean.XnatInvestigatordataBean)iter8.next();
			writer.write("\n" + createHeader(header++) + "<xnat:investigator");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:investigatorData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return9 =child.addXMLBody(writer,header);
				if(return9){
					writer.write("\n" + createHeader(--header) + "</xnat:investigator>");
				}else{
					writer.write("</xnat:investigator>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:investigators>");
			}
			}

			int child9=0;
			int att9=0;
			child9+=_Fields_field.size();
			if(child9>0 || att9>0){
				writer.write("\n" + createHeader(header++) + "<xnat:fields");
			if(child9==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM projectData -> fields/field
		java.util.Iterator iter10=_Fields_field.iterator();
		while(iter10.hasNext()){
			org.nrg.xdat.bean.XnatProjectdataFieldBean child = (org.nrg.xdat.bean.XnatProjectdataFieldBean)iter10.next();
			writer.write("\n" + createHeader(header++) + "<xnat:field");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:projectData_field")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return11 =child.addXMLBody(writer,header);
				if(return11){
					writer.write("\n" + createHeader(--header) + "</xnat:field>");
				}else{
					writer.write("</xnat:field>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:fields>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Name!=null) return true;
		if (_Description!=null) return true;
		if (_Keywords!=null) return true;
			if(_Aliases_alias.size()>0)return true;
			if(_Publications_publication.size()>0)return true;
			if(_Resources_resource.size()>0)return true;
		if(_Studyprotocol.size()>0) return true;
		if (_Pi!=null){
			if (_Pi.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

			if(_Investigators_investigator.size()>0)return true;
			if(_Fields_field.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
