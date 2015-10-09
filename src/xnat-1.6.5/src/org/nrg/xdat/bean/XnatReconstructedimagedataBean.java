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
public class XnatReconstructedimagedataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatReconstructedimagedataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatReconstructedimagedataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:reconstructedImageData";

	public String getSchemaElementName(){
		return "reconstructedImageData";
	}

	public String getFullSchemaElementName(){
		return "xnat:reconstructedImageData";
	}

	//FIELD

	private String _ImageSessionId=null;

	/**
	 * @return Returns the image_session_ID.
	 */
	public String getImageSessionId(){
		return _ImageSessionId;
	}

	/**
	 * Sets the value for image_session_ID.
	 * @param v Value to Set.
	 */
	public void setImageSessionId(String v){
		_ImageSessionId=v;
	}
	 private List<org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean> _Inscans_scanid =new ArrayList<org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean>();

	/**
	 * inScans/scanID
	 * @return Returns an List of org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataScanidI> List<A> getInscans_scanid() {
		return (List<A>) _Inscans_scanid;
	}

	/**
	 * Sets the value for inScans/scanID.
	 * @param v Value to Set.
	 */
	public void setInscans_scanid(ArrayList<org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean> v){
		_Inscans_scanid=v;
	}

	/**
	 * Adds the value for inScans/scanID.
	 * @param v Value to Set.
	 */
	public void addInscans_scanid(org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean v){
		_Inscans_scanid.add(v);
	}

	/**
	 * inScans/scanID
	 * Adds org.nrg.xdat.model.XnatReconstructedimagedataScanidI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataScanidI> void addInscans_scanid(A item) throws Exception{
	_Inscans_scanid.add((org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean)item);
	}

	/**
	 * Adds the value for inScans/scanID.
	 * @param v Value to Set.
	 */
	public void addInscans_scanid(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean)
			_Inscans_scanid.add((org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean");
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
	 private org.nrg.xdat.bean.ProvProcessBean _Provenance =null;

	/**
	 * provenance
	 * @return org.nrg.xdat.bean.ProvProcessBean
	 */
	public org.nrg.xdat.bean.ProvProcessBean getProvenance() {
		return _Provenance;
	}

	/**
	 * Sets the value for provenance.
	 * @param v Value to Set.
	 */
	public void setProvenance(org.nrg.xdat.bean.ProvProcessBean v){
		_Provenance =v;
	}

	/**
	 * Sets the value for provenance.
	 * @param v Value to Set.
	 */
	public void setProvenance(Object v) {
		if (v instanceof org.nrg.xdat.bean.ProvProcessBean)
			_Provenance =(org.nrg.xdat.bean.ProvProcessBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ProvProcessBean");
	}

	/**
	 * provenance
	 * @return org.nrg.xdat.model.ProvProcessI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessI> void setProvenance(A item) throws Exception{
	setProvenance((org.nrg.xdat.bean.ProvProcessBean)item);
	}

	//FIELD

	private Integer _ProvenanceFK=null;

	/**
	 * @return Returns the xnat:reconstructedImageData/provenance_prov_process_id.
	 */
	public Integer getProvenanceFK(){
		return _ProvenanceFK;
	}

	/**
	 * Sets the value for xnat:reconstructedImageData/provenance_prov_process_id.
	 * @param v Value to Set.
	 */
	public void setProvenanceFK(Integer v) {
		_ProvenanceFK=v;
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
	 private List<org.nrg.xdat.bean.XnatComputationdataBean> _Computations_datum =new ArrayList<org.nrg.xdat.bean.XnatComputationdataBean>();

	/**
	 * computations/datum
	 * @return Returns an List of org.nrg.xdat.bean.XnatComputationdataBean
	 */
	public <A extends org.nrg.xdat.model.XnatComputationdataI> List<A> getComputations_datum() {
		return (List<A>) _Computations_datum;
	}

	/**
	 * Sets the value for computations/datum.
	 * @param v Value to Set.
	 */
	public void setComputations_datum(ArrayList<org.nrg.xdat.bean.XnatComputationdataBean> v){
		_Computations_datum=v;
	}

	/**
	 * Adds the value for computations/datum.
	 * @param v Value to Set.
	 */
	public void addComputations_datum(org.nrg.xdat.bean.XnatComputationdataBean v){
		_Computations_datum.add(v);
	}

	/**
	 * computations/datum
	 * Adds org.nrg.xdat.model.XnatComputationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatComputationdataI> void addComputations_datum(A item) throws Exception{
	_Computations_datum.add((org.nrg.xdat.bean.XnatComputationdataBean)item);
	}

	/**
	 * Adds the value for computations/datum.
	 * @param v Value to Set.
	 */
	public void addComputations_datum(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatComputationdataBean)
			_Computations_datum.add((org.nrg.xdat.bean.XnatComputationdataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatComputationdataBean");
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

	private String _Type=null;

	/**
	 * @return Returns the type.
	 */
	public String getType(){
		return _Type;
	}

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v){
		_Type=v;
	}

	//FIELD

	private String _Basescantype=null;

	/**
	 * @return Returns the baseScanType.
	 */
	public String getBasescantype(){
		return _Basescantype;
	}

	/**
	 * Sets the value for baseScanType.
	 * @param v Value to Set.
	 */
	public void setBasescantype(String v){
		_Basescantype=v;
	}

	//FIELD

	private Integer _XnatReconstructedimagedataId=null;

	/**
	 * @return Returns the xnat_reconstructedImageData_id.
	 */
	public Integer getXnatReconstructedimagedataId() {
		return _XnatReconstructedimagedataId;
	}

	/**
	 * Sets the value for xnat_reconstructedImageData_id.
	 * @param v Value to Set.
	 */
	public void setXnatReconstructedimagedataId(Integer v){
		_XnatReconstructedimagedataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_session_ID")){
			setImageSessionId(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("type")){
			setType(v);
		}else if (xmlPath.equals("baseScanType")){
			setBasescantype(v);
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
		if (xmlPath.equals("inScans/scanID")){
			addInscans_scanid(v);
		}else if (xmlPath.equals("in/file")){
			addIn_file(v);
		}else if (xmlPath.equals("out/file")){
			addOut_file(v);
		}else if (xmlPath.equals("provenance")){
			setProvenance(v);
		}else if (xmlPath.equals("parameters/addParam")){
			addParameters_addparam(v);
		}else if (xmlPath.equals("computations/datum")){
			addComputations_datum(v);
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
		if (xmlPath.equals("image_session_ID")){
			return getImageSessionId();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("baseScanType")){
			return getBasescantype();
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
		if (xmlPath.equals("inScans/scanID")){
			return getInscans_scanid();
		}else if (xmlPath.equals("in/file")){
			return getIn_file();
		}else if (xmlPath.equals("out/file")){
			return getOut_file();
		}else if (xmlPath.equals("provenance")){
			return getProvenance();
		}else if (xmlPath.equals("parameters/addParam")){
			return getParameters_addparam();
		}else if (xmlPath.equals("computations/datum")){
			return getComputations_datum();
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
		if (xmlPath.equals("inScans/scanID")){
			return "http://nrg.wustl.edu/xnat:reconstructedImageData_scanID";
		}else if (xmlPath.equals("in/file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("out/file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("provenance")){
			return "http://www.nbirn.net/prov:process";
		}else if (xmlPath.equals("parameters/addParam")){
			return "http://nrg.wustl.edu/xnat:addField";
		}else if (xmlPath.equals("computations/datum")){
			return "http://nrg.wustl.edu/xnat:computationData";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_session_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("inScans/scanID")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("in/file")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("out/file")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("provenance")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("parameters/addParam")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("computations/datum")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("baseScanType")){
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
		all_fields.add("image_session_ID");
		all_fields.add("inScans/scanID");
		all_fields.add("in/file");
		all_fields.add("out/file");
		all_fields.add("provenance");
		all_fields.add("parameters/addParam");
		all_fields.add("computations/datum");
		all_fields.add("ID");
		all_fields.add("type");
		all_fields.add("baseScanType");
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
		writer.write("\n<xnat:ReconstructedImage");
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
		writer.write("\n</xnat:ReconstructedImage>");
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
		//NOT REQUIRED FIELD

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		if (_Basescantype!=null)
			map.put("baseScanType",ValueParser(_Basescantype,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_ImageSessionId!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:image_session_ID");
			writer.write(">");
			writer.write(ValueParser(_ImageSessionId,"string"));
			writer.write("</xnat:image_session_ID>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Inscans_scanid.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:inScans");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM reconstructedImageData -> inScans/scanID
		//IN-LINE REPEATER
		java.util.Iterator iter1=_Inscans_scanid.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean child = (org.nrg.xdat.bean.XnatReconstructedimagedataScanidBean)iter1.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</xnat:inScans>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_In_file.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat:in");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM reconstructedImageData -> in/file
		java.util.Iterator iter3=_In_file.iterator();
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
				writer.write("\n" + createHeader(--header) + "</xnat:in>");
			}
			}

			int child4=0;
			int att4=0;
			child4+=_Out_file.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:out");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM reconstructedImageData -> out/file
		java.util.Iterator iter5=_Out_file.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatAbstractresourceBean child = (org.nrg.xdat.bean.XnatAbstractresourceBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<xnat:file");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:abstractResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
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

		//REFERENCE FROM reconstructedImageData -> provenance
		//DATA-FIELD FROM reconstructedImageData -> provenance
		if (_Provenance!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:provenance");
			_Provenance.addXMLAtts(writer);
			if(!_Provenance.getFullSchemaElementName().equals("prov:process")){
				writer.write(" xsi:type=\"" + _Provenance.getFullSchemaElementName() + "\"");
			}
			if (_Provenance.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =_Provenance.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</xnat:provenance>");
				}else{
					writer.write("</xnat:provenance>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

			int child6=0;
			int att6=0;
			child6+=_Parameters_addparam.size();
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<xnat:parameters");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM reconstructedImageData -> parameters/addParam
		java.util.Iterator iter7=_Parameters_addparam.iterator();
		while(iter7.hasNext()){
			org.nrg.xdat.bean.XnatAddfieldBean child = (org.nrg.xdat.bean.XnatAddfieldBean)iter7.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addParam");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:addField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =child.addXMLBody(writer,header);
				if(return8){
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

			int child8=0;
			int att8=0;
			child8+=_Computations_datum.size();
			if(child8>0 || att8>0){
				writer.write("\n" + createHeader(header++) + "<xnat:computations");
			if(child8==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM reconstructedImageData -> computations/datum
		java.util.Iterator iter9=_Computations_datum.iterator();
		while(iter9.hasNext()){
			org.nrg.xdat.bean.XnatComputationdataBean child = (org.nrg.xdat.bean.XnatComputationdataBean)iter9.next();
			writer.write("\n" + createHeader(header++) + "<xnat:datum");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:computationData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return10 =child.addXMLBody(writer,header);
				if(return10){
					writer.write("\n" + createHeader(--header) + "</xnat:datum>");
				}else{
					writer.write("</xnat:datum>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:computations>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_ImageSessionId!=null) return true;
			if(_Inscans_scanid.size()>0)return true;
			if(_In_file.size()>0)return true;
			if(_Out_file.size()>0)return true;
		if (_Provenance!=null){
			if (_Provenance.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

			if(_Parameters_addparam.size()>0)return true;
			if(_Computations_datum.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
