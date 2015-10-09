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
public class XnatSubjectdataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatSubjectdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatSubjectdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:subjectData";

	public String getSchemaElementName(){
		return "subjectData";
	}

	public String getFullSchemaElementName(){
		return "xnat:subjectData";
	}
	 private List<org.nrg.xdat.bean.XnatProjectparticipantBean> _Sharing_share =new ArrayList<org.nrg.xdat.bean.XnatProjectparticipantBean>();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.bean.XnatProjectparticipantBean
	 */
	public <A extends org.nrg.xdat.model.XnatProjectparticipantI> List<A> getSharing_share() {
		return (List<A>) _Sharing_share;
	}

	/**
	 * Sets the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void setSharing_share(ArrayList<org.nrg.xdat.bean.XnatProjectparticipantBean> v){
		_Sharing_share=v;
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(org.nrg.xdat.bean.XnatProjectparticipantBean v){
		_Sharing_share.add(v);
	}

	/**
	 * sharing/share
	 * Adds org.nrg.xdat.model.XnatProjectparticipantI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectparticipantI> void addSharing_share(A item) throws Exception{
	_Sharing_share.add((org.nrg.xdat.bean.XnatProjectparticipantBean)item);
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatProjectparticipantBean)
			_Sharing_share.add((org.nrg.xdat.bean.XnatProjectparticipantBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatProjectparticipantBean");
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
	 private org.nrg.xdat.bean.XnatInvestigatordataBean _Investigator =null;

	/**
	 * investigator
	 * @return org.nrg.xdat.bean.XnatInvestigatordataBean
	 */
	public org.nrg.xdat.bean.XnatInvestigatordataBean getInvestigator() {
		return _Investigator;
	}

	/**
	 * Sets the value for investigator.
	 * @param v Value to Set.
	 */
	public void setInvestigator(org.nrg.xdat.bean.XnatInvestigatordataBean v){
		_Investigator =v;
	}

	/**
	 * Sets the value for investigator.
	 * @param v Value to Set.
	 */
	public void setInvestigator(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatInvestigatordataBean)
			_Investigator =(org.nrg.xdat.bean.XnatInvestigatordataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatInvestigatordataBean");
	}

	/**
	 * investigator
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void setInvestigator(A item) throws Exception{
	setInvestigator((org.nrg.xdat.bean.XnatInvestigatordataBean)item);
	}

	//FIELD

	private Integer _InvestigatorFK=null;

	/**
	 * @return Returns the xnat:subjectData/investigator_xnat_investigatordata_id.
	 */
	public Integer getInvestigatorFK(){
		return _InvestigatorFK;
	}

	/**
	 * Sets the value for xnat:subjectData/investigator_xnat_investigatordata_id.
	 * @param v Value to Set.
	 */
	public void setInvestigatorFK(Integer v) {
		_InvestigatorFK=v;
	}
	 private org.nrg.xdat.bean.XnatAbstractdemographicdataBean _Demographics =null;

	/**
	 * demographics
	 * @return org.nrg.xdat.bean.XnatAbstractdemographicdataBean
	 */
	public org.nrg.xdat.bean.XnatAbstractdemographicdataBean getDemographics() {
		return _Demographics;
	}

	/**
	 * Sets the value for demographics.
	 * @param v Value to Set.
	 */
	public void setDemographics(org.nrg.xdat.bean.XnatAbstractdemographicdataBean v){
		_Demographics =v;
	}

	/**
	 * Sets the value for demographics.
	 * @param v Value to Set.
	 */
	public void setDemographics(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractdemographicdataBean)
			_Demographics =(org.nrg.xdat.bean.XnatAbstractdemographicdataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractdemographicdataBean");
	}

	/**
	 * demographics
	 * @return org.nrg.xdat.model.XnatAbstractdemographicdataI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractdemographicdataI> void setDemographics(A item) throws Exception{
	setDemographics((org.nrg.xdat.bean.XnatAbstractdemographicdataBean)item);
	}

	//FIELD

	private Integer _DemographicsFK=null;

	/**
	 * @return Returns the xnat:subjectData/demographics_xnat_abstractdemographicdata_id.
	 */
	public Integer getDemographicsFK(){
		return _DemographicsFK;
	}

	/**
	 * Sets the value for xnat:subjectData/demographics_xnat_abstractdemographicdata_id.
	 * @param v Value to Set.
	 */
	public void setDemographicsFK(Integer v) {
		_DemographicsFK=v;
	}
	 private org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean _Metadata =null;

	/**
	 * metadata
	 * @return org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean
	 */
	public org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean getMetadata() {
		return _Metadata;
	}

	/**
	 * Sets the value for metadata.
	 * @param v Value to Set.
	 */
	public void setMetadata(org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean v){
		_Metadata =v;
	}

	/**
	 * Sets the value for metadata.
	 * @param v Value to Set.
	 */
	public void setMetadata(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean)
			_Metadata =(org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean");
	}

	/**
	 * metadata
	 * @return org.nrg.xdat.model.XnatAbstractsubjectmetadataI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractsubjectmetadataI> void setMetadata(A item) throws Exception{
	setMetadata((org.nrg.xdat.bean.XnatAbstractsubjectmetadataBean)item);
	}

	//FIELD

	private Integer _MetadataFK=null;

	/**
	 * @return Returns the xnat:subjectData/metadata_xnat_abstractsubjectmetadata_id.
	 */
	public Integer getMetadataFK(){
		return _MetadataFK;
	}

	/**
	 * Sets the value for xnat:subjectData/metadata_xnat_abstractsubjectmetadata_id.
	 * @param v Value to Set.
	 */
	public void setMetadataFK(Integer v) {
		_MetadataFK=v;
	}
	 private List<org.nrg.xdat.bean.XnatSubjectdataAddidBean> _Addid =new ArrayList<org.nrg.xdat.bean.XnatSubjectdataAddidBean>();

	/**
	 * addID
	 * @return Returns an List of org.nrg.xdat.bean.XnatSubjectdataAddidBean
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataAddidI> List<A> getAddid() {
		return (List<A>) _Addid;
	}

	/**
	 * Sets the value for addID.
	 * @param v Value to Set.
	 */
	public void setAddid(ArrayList<org.nrg.xdat.bean.XnatSubjectdataAddidBean> v){
		_Addid=v;
	}

	/**
	 * Adds the value for addID.
	 * @param v Value to Set.
	 */
	public void addAddid(org.nrg.xdat.bean.XnatSubjectdataAddidBean v){
		_Addid.add(v);
	}

	/**
	 * addID
	 * Adds org.nrg.xdat.model.XnatSubjectdataAddidI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataAddidI> void addAddid(A item) throws Exception{
	_Addid.add((org.nrg.xdat.bean.XnatSubjectdataAddidBean)item);
	}

	/**
	 * Adds the value for addID.
	 * @param v Value to Set.
	 */
	public void addAddid(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatSubjectdataAddidBean)
			_Addid.add((org.nrg.xdat.bean.XnatSubjectdataAddidBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatSubjectdataAddidBean");
	}
	 private List<org.nrg.xdat.bean.XnatSubjectdataFieldBean> _Fields_field =new ArrayList<org.nrg.xdat.bean.XnatSubjectdataFieldBean>();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.bean.XnatSubjectdataFieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataFieldI> List<A> getFields_field() {
		return (List<A>) _Fields_field;
	}

	/**
	 * Sets the value for fields/field.
	 * @param v Value to Set.
	 */
	public void setFields_field(ArrayList<org.nrg.xdat.bean.XnatSubjectdataFieldBean> v){
		_Fields_field=v;
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(org.nrg.xdat.bean.XnatSubjectdataFieldBean v){
		_Fields_field.add(v);
	}

	/**
	 * fields/field
	 * Adds org.nrg.xdat.model.XnatSubjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataFieldI> void addFields_field(A item) throws Exception{
	_Fields_field.add((org.nrg.xdat.bean.XnatSubjectdataFieldBean)item);
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatSubjectdataFieldBean)
			_Fields_field.add((org.nrg.xdat.bean.XnatSubjectdataFieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatSubjectdataFieldBean");
	}
	 private List<org.nrg.xdat.bean.XnatSubjectassessordataBean> _Experiments_experiment =new ArrayList<org.nrg.xdat.bean.XnatSubjectassessordataBean>();

	/**
	 * experiments/experiment
	 * @return Returns an List of org.nrg.xdat.bean.XnatSubjectassessordataBean
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> List<A> getExperiments_experiment() {
		return (List<A>) _Experiments_experiment;
	}

	/**
	 * Sets the value for experiments/experiment.
	 * @param v Value to Set.
	 */
	public void setExperiments_experiment(ArrayList<org.nrg.xdat.bean.XnatSubjectassessordataBean> v){
		_Experiments_experiment=v;
	}

	/**
	 * Adds the value for experiments/experiment.
	 * @param v Value to Set.
	 */
	public void addExperiments_experiment(org.nrg.xdat.bean.XnatSubjectassessordataBean v){
		_Experiments_experiment.add(v);
	}

	/**
	 * experiments/experiment
	 * Adds org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void addExperiments_experiment(A item) throws Exception{
	_Experiments_experiment.add((org.nrg.xdat.bean.XnatSubjectassessordataBean)item);
	}

	/**
	 * Adds the value for experiments/experiment.
	 * @param v Value to Set.
	 */
	public void addExperiments_experiment(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatSubjectassessordataBean)
			_Experiments_experiment.add((org.nrg.xdat.bean.XnatSubjectassessordataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatSubjectassessordataBean");
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

	private String _Group=null;

	/**
	 * @return Returns the group.
	 */
	public String getGroup(){
		return _Group;
	}

	/**
	 * Sets the value for group.
	 * @param v Value to Set.
	 */
	public void setGroup(String v){
		_Group=v;
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

	private String _Src=null;

	/**
	 * @return Returns the src.
	 */
	public String getSrc(){
		return _Src;
	}

	/**
	 * Sets the value for src.
	 * @param v Value to Set.
	 */
	public void setSrc(String v){
		_Src=v;
	}

	//FIELD

	private String _Initials=null;

	/**
	 * @return Returns the initials.
	 */
	public String getInitials(){
		return _Initials;
	}

	/**
	 * Sets the value for initials.
	 * @param v Value to Set.
	 */
	public void setInitials(String v){
		_Initials=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("project")){
			setProject(v);
		}else if (xmlPath.equals("group")){
			setGroup(v);
		}else if (xmlPath.equals("label")){
			setLabel(v);
		}else if (xmlPath.equals("src")){
			setSrc(v);
		}else if (xmlPath.equals("initials")){
			setInitials(v);
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
		if (xmlPath.equals("sharing/share")){
			addSharing_share(v);
		}else if (xmlPath.equals("resources/resource")){
			addResources_resource(v);
		}else if (xmlPath.equals("investigator")){
			setInvestigator(v);
		}else if (xmlPath.equals("demographics")){
			setDemographics(v);
		}else if (xmlPath.equals("metadata")){
			setMetadata(v);
		}else if (xmlPath.equals("addID")){
			addAddid(v);
		}else if (xmlPath.equals("fields/field")){
			addFields_field(v);
		}else if (xmlPath.equals("experiments/experiment")){
			addExperiments_experiment(v);
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
		if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("project")){
			return getProject();
		}else if (xmlPath.equals("group")){
			return getGroup();
		}else if (xmlPath.equals("label")){
			return getLabel();
		}else if (xmlPath.equals("src")){
			return getSrc();
		}else if (xmlPath.equals("initials")){
			return getInitials();
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
		if (xmlPath.equals("sharing/share")){
			return getSharing_share();
		}else if (xmlPath.equals("resources/resource")){
			return getResources_resource();
		}else if (xmlPath.equals("investigator")){
			return getInvestigator();
		}else if (xmlPath.equals("demographics")){
			return getDemographics();
		}else if (xmlPath.equals("metadata")){
			return getMetadata();
		}else if (xmlPath.equals("addID")){
			return getAddid();
		}else if (xmlPath.equals("fields/field")){
			return getFields_field();
		}else if (xmlPath.equals("experiments/experiment")){
			return getExperiments_experiment();
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
		if (xmlPath.equals("sharing/share")){
			return "http://nrg.wustl.edu/xnat:projectParticipant";
		}else if (xmlPath.equals("resources/resource")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("investigator")){
			return "http://nrg.wustl.edu/xnat:investigatorData";
		}else if (xmlPath.equals("demographics")){
			return "http://nrg.wustl.edu/xnat:abstractDemographicData";
		}else if (xmlPath.equals("metadata")){
			return "http://nrg.wustl.edu/xnat:abstractSubjectMetadata";
		}else if (xmlPath.equals("addID")){
			return "http://nrg.wustl.edu/xnat:subjectData_addID";
		}else if (xmlPath.equals("fields/field")){
			return "http://nrg.wustl.edu/xnat:subjectData_field";
		}else if (xmlPath.equals("experiments/experiment")){
			return "http://nrg.wustl.edu/xnat:subjectAssessorData";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("sharing/share")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("resources/resource")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("investigator")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("demographics")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("metadata")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("addID")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("fields/field")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("experiments/experiment")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("project")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("group")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("label")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("src")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("initials")){
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
		all_fields.add("sharing/share");
		all_fields.add("resources/resource");
		all_fields.add("investigator");
		all_fields.add("demographics");
		all_fields.add("metadata");
		all_fields.add("addID");
		all_fields.add("fields/field");
		all_fields.add("experiments/experiment");
		all_fields.add("ID");
		all_fields.add("project");
		all_fields.add("group");
		all_fields.add("label");
		all_fields.add("src");
		all_fields.add("initials");
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
		writer.write("\n<xnat:Subject");
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
		writer.write("\n</xnat:Subject>");
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

		if (_Project!=null)
			map.put("project",ValueParser(_Project,"string"));
		//NOT REQUIRED FIELD

		if (_Group!=null)
			map.put("group",ValueParser(_Group,"string"));
		//NOT REQUIRED FIELD

		if (_Label!=null)
			map.put("label",ValueParser(_Label,"string"));
		//NOT REQUIRED FIELD

		if (_Src!=null)
			map.put("src",ValueParser(_Src,"string"));
		//NOT REQUIRED FIELD

		if (_Initials!=null)
			map.put("initials",ValueParser(_Initials,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Sharing_share.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:sharing");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM subjectData -> sharing/share
		java.util.Iterator iter1=_Sharing_share.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatProjectparticipantBean child = (org.nrg.xdat.bean.XnatProjectparticipantBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:share");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:projectParticipant")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:share>");
				}else{
					writer.write("</xnat:share>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:sharing>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Resources_resource.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat:resources");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM subjectData -> resources/resource
		java.util.Iterator iter3=_Resources_resource.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<xnat:resource");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
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

		//REFERENCE FROM subjectData -> investigator
		//DATA-FIELD FROM subjectData -> investigator
		if (_Investigator!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:investigator");
			_Investigator.addXMLAtts(writer);
			if(!_Investigator.getFullSchemaElementName().equals("xnat:investigatorData")){
				writer.write(" xsi:type=\"" + _Investigator.getFullSchemaElementName() + "\"");
			}
			if (_Investigator.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =_Investigator.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:investigator>");
				}else{
					writer.write("</xnat:investigator>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		//REFERENCE FROM subjectData -> demographics
		//DATA-FIELD FROM subjectData -> demographics
		if (_Demographics!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:demographics");
			_Demographics.addXMLAtts(writer);
			if(!_Demographics.getFullSchemaElementName().equals("xnat:abstractDemographicData")){
				writer.write(" xsi:type=\"" + _Demographics.getFullSchemaElementName() + "\"");
			}
			if (_Demographics.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =_Demographics.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:demographics>");
				}else{
					writer.write("</xnat:demographics>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		//REFERENCE FROM subjectData -> metadata
		//DATA-FIELD FROM subjectData -> metadata
		if (_Metadata!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:metadata");
			_Metadata.addXMLAtts(writer);
			if(!_Metadata.getFullSchemaElementName().equals("xnat:abstractSubjectMetadata")){
				writer.write(" xsi:type=\"" + _Metadata.getFullSchemaElementName() + "\"");
			}
			if (_Metadata.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =_Metadata.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:metadata>");
				}else{
					writer.write("</xnat:metadata>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		//REFERENCE FROM subjectData -> addID
		java.util.Iterator iter4=_Addid.iterator();
		while(iter4.hasNext()){
			org.nrg.xdat.bean.XnatSubjectdataAddidBean child = (org.nrg.xdat.bean.XnatSubjectdataAddidBean)iter4.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addID");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:subjectData_addID")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return5 =child.addXMLBody(writer,header);
				if(return5){
					writer.write("\n" + createHeader(--header) + "</xnat:addID>");
				}else{
					writer.write("</xnat:addID>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
			int child5=0;
			int att5=0;
			child5+=_Fields_field.size();
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<xnat:fields");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM subjectData -> fields/field
		java.util.Iterator iter6=_Fields_field.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.XnatSubjectdataFieldBean child = (org.nrg.xdat.bean.XnatSubjectdataFieldBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<xnat:field");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:subjectData_field")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
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

			int child7=0;
			int att7=0;
			child7+=_Experiments_experiment.size();
			if(child7>0 || att7>0){
				writer.write("\n" + createHeader(header++) + "<xnat:experiments");
			if(child7==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM subjectData -> experiments/experiment
		java.util.Iterator iter8=_Experiments_experiment.iterator();
		while(iter8.hasNext()){
			org.nrg.xdat.bean.XnatSubjectassessordataBean child = (org.nrg.xdat.bean.XnatSubjectassessordataBean)iter8.next();
			writer.write("\n" + createHeader(header++) + "<xnat:experiment");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:subjectAssessorData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return9 =child.addXMLBody(writer,header);
				if(return9){
					writer.write("\n" + createHeader(--header) + "</xnat:experiment>");
				}else{
					writer.write("</xnat:experiment>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:experiments>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Sharing_share.size()>0)return true;
			if(_Resources_resource.size()>0)return true;
		if (_Investigator!=null){
			if (_Investigator.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if (_Demographics!=null){
			if (_Demographics.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if (_Metadata!=null){
			if (_Metadata.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if(_Addid.size()>0) return true;
			if(_Fields_field.size()>0)return true;
			if(_Experiments_experiment.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
