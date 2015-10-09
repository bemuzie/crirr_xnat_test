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
public class XnatImagesessiondataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatImagesessiondataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatImagesessiondataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:imageSessionData";

	public String getSchemaElementName(){
		return "imageSessionData";
	}

	public String getFullSchemaElementName(){
		return "xnat:imageSessionData";
	}
	 private List<org.nrg.xdat.bean.XnatRegionresourceBean> _Regions_region =new ArrayList<org.nrg.xdat.bean.XnatRegionresourceBean>();

	/**
	 * regions/region
	 * @return Returns an List of org.nrg.xdat.bean.XnatRegionresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceI> List<A> getRegions_region() {
		return (List<A>) _Regions_region;
	}

	/**
	 * Sets the value for regions/region.
	 * @param v Value to Set.
	 */
	public void setRegions_region(ArrayList<org.nrg.xdat.bean.XnatRegionresourceBean> v){
		_Regions_region=v;
	}

	/**
	 * Adds the value for regions/region.
	 * @param v Value to Set.
	 */
	public void addRegions_region(org.nrg.xdat.bean.XnatRegionresourceBean v){
		_Regions_region.add(v);
	}

	/**
	 * regions/region
	 * Adds org.nrg.xdat.model.XnatRegionresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceI> void addRegions_region(A item) throws Exception{
	_Regions_region.add((org.nrg.xdat.bean.XnatRegionresourceBean)item);
	}

	/**
	 * Adds the value for regions/region.
	 * @param v Value to Set.
	 */
	public void addRegions_region(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatRegionresourceBean)
			_Regions_region.add((org.nrg.xdat.bean.XnatRegionresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatRegionresourceBean");
	}

	//FIELD

	private String _Scanner=null;

	/**
	 * @return Returns the scanner.
	 */
	public String getScanner(){
		return _Scanner;
	}

	/**
	 * Sets the value for scanner.
	 * @param v Value to Set.
	 */
	public void setScanner(String v){
		_Scanner=v;
	}

	//FIELD

	private String _Scanner_manufacturer=null;

	/**
	 * @return Returns the scanner/manufacturer.
	 */
	public String getScanner_manufacturer(){
		return _Scanner_manufacturer;
	}

	/**
	 * Sets the value for scanner/manufacturer.
	 * @param v Value to Set.
	 */
	public void setScanner_manufacturer(String v){
		_Scanner_manufacturer=v;
	}

	//FIELD

	private String _Scanner_model=null;

	/**
	 * @return Returns the scanner/model.
	 */
	public String getScanner_model(){
		return _Scanner_model;
	}

	/**
	 * Sets the value for scanner/model.
	 * @param v Value to Set.
	 */
	public void setScanner_model(String v){
		_Scanner_model=v;
	}

	//FIELD

	private String _Operator=null;

	/**
	 * @return Returns the operator.
	 */
	public String getOperator(){
		return _Operator;
	}

	/**
	 * Sets the value for operator.
	 * @param v Value to Set.
	 */
	public void setOperator(String v){
		_Operator=v;
	}

	//FIELD

	private String _Prearchivepath=null;

	/**
	 * @return Returns the prearchivePath.
	 */
	public String getPrearchivepath(){
		return _Prearchivepath;
	}

	/**
	 * Sets the value for prearchivePath.
	 * @param v Value to Set.
	 */
	public void setPrearchivepath(String v){
		_Prearchivepath=v;
	}
	 private List<org.nrg.xdat.bean.XnatImagescandataBean> _Scans_scan =new ArrayList<org.nrg.xdat.bean.XnatImagescandataBean>();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.bean.XnatImagescandataBean
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataI> List<A> getScans_scan() {
		return (List<A>) _Scans_scan;
	}

	/**
	 * Sets the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void setScans_scan(ArrayList<org.nrg.xdat.bean.XnatImagescandataBean> v){
		_Scans_scan=v;
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(org.nrg.xdat.bean.XnatImagescandataBean v){
		_Scans_scan.add(v);
	}

	/**
	 * scans/scan
	 * Adds org.nrg.xdat.model.XnatImagescandataI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataI> void addScans_scan(A item) throws Exception{
	_Scans_scan.add((org.nrg.xdat.bean.XnatImagescandataBean)item);
	}

	/**
	 * Adds the value for scans/scan.
	 * @param v Value to Set.
	 */
	public void addScans_scan(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatImagescandataBean)
			_Scans_scan.add((org.nrg.xdat.bean.XnatImagescandataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatImagescandataBean");
	}
	 private List<org.nrg.xdat.bean.XnatReconstructedimagedataBean> _Reconstructions_reconstructedimage =new ArrayList<org.nrg.xdat.bean.XnatReconstructedimagedataBean>();

	/**
	 * reconstructions/reconstructedImage
	 * @return Returns an List of org.nrg.xdat.bean.XnatReconstructedimagedataBean
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataI> List<A> getReconstructions_reconstructedimage() {
		return (List<A>) _Reconstructions_reconstructedimage;
	}

	/**
	 * Sets the value for reconstructions/reconstructedImage.
	 * @param v Value to Set.
	 */
	public void setReconstructions_reconstructedimage(ArrayList<org.nrg.xdat.bean.XnatReconstructedimagedataBean> v){
		_Reconstructions_reconstructedimage=v;
	}

	/**
	 * Adds the value for reconstructions/reconstructedImage.
	 * @param v Value to Set.
	 */
	public void addReconstructions_reconstructedimage(org.nrg.xdat.bean.XnatReconstructedimagedataBean v){
		_Reconstructions_reconstructedimage.add(v);
	}

	/**
	 * reconstructions/reconstructedImage
	 * Adds org.nrg.xdat.model.XnatReconstructedimagedataI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataI> void addReconstructions_reconstructedimage(A item) throws Exception{
	_Reconstructions_reconstructedimage.add((org.nrg.xdat.bean.XnatReconstructedimagedataBean)item);
	}

	/**
	 * Adds the value for reconstructions/reconstructedImage.
	 * @param v Value to Set.
	 */
	public void addReconstructions_reconstructedimage(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatReconstructedimagedataBean)
			_Reconstructions_reconstructedimage.add((org.nrg.xdat.bean.XnatReconstructedimagedataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatReconstructedimagedataBean");
	}
	 private List<org.nrg.xdat.bean.XnatImageassessordataBean> _Assessors_assessor =new ArrayList<org.nrg.xdat.bean.XnatImageassessordataBean>();

	/**
	 * assessors/assessor
	 * @return Returns an List of org.nrg.xdat.bean.XnatImageassessordataBean
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> List<A> getAssessors_assessor() {
		return (List<A>) _Assessors_assessor;
	}

	/**
	 * Sets the value for assessors/assessor.
	 * @param v Value to Set.
	 */
	public void setAssessors_assessor(ArrayList<org.nrg.xdat.bean.XnatImageassessordataBean> v){
		_Assessors_assessor=v;
	}

	/**
	 * Adds the value for assessors/assessor.
	 * @param v Value to Set.
	 */
	public void addAssessors_assessor(org.nrg.xdat.bean.XnatImageassessordataBean v){
		_Assessors_assessor.add(v);
	}

	/**
	 * assessors/assessor
	 * Adds org.nrg.xdat.model.XnatImageassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> void addAssessors_assessor(A item) throws Exception{
	_Assessors_assessor.add((org.nrg.xdat.bean.XnatImageassessordataBean)item);
	}

	/**
	 * Adds the value for assessors/assessor.
	 * @param v Value to Set.
	 */
	public void addAssessors_assessor(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatImageassessordataBean)
			_Assessors_assessor.add((org.nrg.xdat.bean.XnatImageassessordataBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatImageassessordataBean");
	}

	//FIELD

	private String _Dcmaccessionnumber=null;

	/**
	 * @return Returns the dcmAccessionNumber.
	 */
	public String getDcmaccessionnumber(){
		return _Dcmaccessionnumber;
	}

	/**
	 * Sets the value for dcmAccessionNumber.
	 * @param v Value to Set.
	 */
	public void setDcmaccessionnumber(String v){
		_Dcmaccessionnumber=v;
	}

	//FIELD

	private String _Dcmpatientid=null;

	/**
	 * @return Returns the dcmPatientId.
	 */
	public String getDcmpatientid(){
		return _Dcmpatientid;
	}

	/**
	 * Sets the value for dcmPatientId.
	 * @param v Value to Set.
	 */
	public void setDcmpatientid(String v){
		_Dcmpatientid=v;
	}

	//FIELD

	private String _Dcmpatientname=null;

	/**
	 * @return Returns the dcmPatientName.
	 */
	public String getDcmpatientname(){
		return _Dcmpatientname;
	}

	/**
	 * Sets the value for dcmPatientName.
	 * @param v Value to Set.
	 */
	public void setDcmpatientname(String v){
		_Dcmpatientname=v;
	}

	//FIELD

	private Date _Dcmpatientbirthdate=null;

	/**
	 * @return Returns the dcmPatientBirthDate.
	 */
	public Date getDcmpatientbirthdate(){
		return _Dcmpatientbirthdate;
	}

	/**
	 * Sets the value for dcmPatientBirthDate.
	 * @param v Value to Set.
	 */
	public void setDcmpatientbirthdate(Date v){
		_Dcmpatientbirthdate=v;
	}

	/**
	 * Sets the value for dcmPatientBirthDate.
	 * @param v Value to Set.
	 */
	public void setDcmpatientbirthdate(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for dcmPatientBirthDate.
	 * @param v Value to Set.
	 */
	public void setDcmpatientbirthdate(String v)  {
		_Dcmpatientbirthdate=formatDate(v);
	}

	//FIELD

	private String _SessionType=null;

	/**
	 * @return Returns the session_type.
	 */
	public String getSessionType(){
		return _SessionType;
	}

	/**
	 * Sets the value for session_type.
	 * @param v Value to Set.
	 */
	public void setSessionType(String v){
		_SessionType=v;
	}

	//FIELD

	private String _Modality=null;

	/**
	 * @return Returns the modality.
	 */
	public String getModality(){
		return _Modality;
	}

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v){
		_Modality=v;
	}

	//FIELD

	private String _Uid=null;

	/**
	 * @return Returns the UID.
	 */
	public String getUid(){
		return _Uid;
	}

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v){
		_Uid=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("scanner")){
			setScanner(v);
		}else if (xmlPath.equals("scanner/manufacturer")){
			setScanner_manufacturer(v);
		}else if (xmlPath.equals("scanner/model")){
			setScanner_model(v);
		}else if (xmlPath.equals("operator")){
			setOperator(v);
		}else if (xmlPath.equals("prearchivePath")){
			setPrearchivepath(v);
		}else if (xmlPath.equals("dcmAccessionNumber")){
			setDcmaccessionnumber(v);
		}else if (xmlPath.equals("dcmPatientId")){
			setDcmpatientid(v);
		}else if (xmlPath.equals("dcmPatientName")){
			setDcmpatientname(v);
		}else if (xmlPath.equals("dcmPatientBirthDate")){
			setDcmpatientbirthdate(v);
		}else if (xmlPath.equals("session_type")){
			setSessionType(v);
		}else if (xmlPath.equals("modality")){
			setModality(v);
		}else if (xmlPath.equals("UID")){
			setUid(v);
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
		if (xmlPath.equals("regions/region")){
			addRegions_region(v);
		}else if (xmlPath.equals("scans/scan")){
			addScans_scan(v);
		}else if (xmlPath.equals("reconstructions/reconstructedImage")){
			addReconstructions_reconstructedimage(v);
		}else if (xmlPath.equals("assessors/assessor")){
			addAssessors_assessor(v);
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
		if (xmlPath.equals("scanner")){
			return getScanner();
		}else if (xmlPath.equals("scanner/manufacturer")){
			return getScanner_manufacturer();
		}else if (xmlPath.equals("scanner/model")){
			return getScanner_model();
		}else if (xmlPath.equals("operator")){
			return getOperator();
		}else if (xmlPath.equals("prearchivePath")){
			return getPrearchivepath();
		}else if (xmlPath.equals("dcmAccessionNumber")){
			return getDcmaccessionnumber();
		}else if (xmlPath.equals("dcmPatientId")){
			return getDcmpatientid();
		}else if (xmlPath.equals("dcmPatientName")){
			return getDcmpatientname();
		}else if (xmlPath.equals("dcmPatientBirthDate")){
			return getDcmpatientbirthdate();
		}else if (xmlPath.equals("session_type")){
			return getSessionType();
		}else if (xmlPath.equals("modality")){
			return getModality();
		}else if (xmlPath.equals("UID")){
			return getUid();
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
		if (xmlPath.equals("regions/region")){
			return getRegions_region();
		}else if (xmlPath.equals("scans/scan")){
			return getScans_scan();
		}else if (xmlPath.equals("reconstructions/reconstructedImage")){
			return getReconstructions_reconstructedimage();
		}else if (xmlPath.equals("assessors/assessor")){
			return getAssessors_assessor();
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
		if (xmlPath.equals("regions/region")){
			return "http://nrg.wustl.edu/xnat:regionResource";
		}else if (xmlPath.equals("scans/scan")){
			return "http://nrg.wustl.edu/xnat:imageScanData";
		}else if (xmlPath.equals("reconstructions/reconstructedImage")){
			return "http://nrg.wustl.edu/xnat:reconstructedImageData";
		}else if (xmlPath.equals("assessors/assessor")){
			return "http://nrg.wustl.edu/xnat:imageAssessorData";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("regions/region")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("scanner")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scanner/manufacturer")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scanner/model")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("operator")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("prearchivePath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scans/scan")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("reconstructions/reconstructedImage")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("assessors/assessor")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("dcmAccessionNumber")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmPatientId")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmPatientName")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmPatientBirthDate")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("session_type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("modality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("UID")){
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
		all_fields.add("regions/region");
		all_fields.add("scanner");
		all_fields.add("scanner/manufacturer");
		all_fields.add("scanner/model");
		all_fields.add("operator");
		all_fields.add("prearchivePath");
		all_fields.add("scans/scan");
		all_fields.add("reconstructions/reconstructedImage");
		all_fields.add("assessors/assessor");
		all_fields.add("dcmAccessionNumber");
		all_fields.add("dcmPatientId");
		all_fields.add("dcmPatientName");
		all_fields.add("dcmPatientBirthDate");
		all_fields.add("session_type");
		all_fields.add("modality");
		all_fields.add("UID");
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
		writer.write("\n<xnat:imageSessionData");
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
		writer.write("\n</xnat:imageSessionData>");
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
		if (_SessionType!=null)
			map.put("session_type",ValueParser(_SessionType,"string"));
		//NOT REQUIRED FIELD

		if (_Modality!=null)
			map.put("modality",ValueParser(_Modality,"string"));
		//NOT REQUIRED FIELD

		if (_Uid!=null)
			map.put("UID",ValueParser(_Uid,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM imageSessionData -> subjectAssessorData
			int child0=0;
			int att0=0;
			child0+=_Regions_region.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:regions");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageSessionData -> regions/region
		java.util.Iterator iter1=_Regions_region.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatRegionresourceBean child = (org.nrg.xdat.bean.XnatRegionresourceBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:region");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:regionResource")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:region>");
				}else{
					writer.write("</xnat:region>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:regions>");
			}
			}

		TreeMap ScannerATTMap = new TreeMap();
		String ScannerATT = new String();
		if (_Scanner_manufacturer!=null)
			ScannerATTMap.put("manufacturer",ValueParser(_Scanner_manufacturer,"string"));
		if (_Scanner_model!=null)
			ScannerATTMap.put("model",ValueParser(_Scanner_model,"string"));
		java.util.Iterator iter2 =ScannerATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			ScannerATT +=" " + key + "=\"" + ScannerATTMap.get(key) + "\"";
		}
		if (_Scanner!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:scanner");
			writer.write(ScannerATT);
			writer.write(">");
			writer.write(ValueParser(_Scanner,"string"));
			writer.write("</xnat:scanner>");
			header--;
		}
		else if(!ScannerATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:scanner");
			writer.write(ScannerATT);
			writer.write("/>");
			header--;
		}

		if (_Operator!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:operator");
			writer.write(">");
			writer.write(ValueParser(_Operator,"string"));
			writer.write("</xnat:operator>");
			header--;
		}
		if (_Prearchivepath!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:prearchivePath");
			writer.write(">");
			writer.write(ValueParser(_Prearchivepath,"string"));
			writer.write("</xnat:prearchivePath>");
			header--;
		}
			int child3=0;
			int att3=0;
			child3+=_Scans_scan.size();
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat:scans");
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageSessionData -> scans/scan
		java.util.Iterator iter4=_Scans_scan.iterator();
		while(iter4.hasNext()){
			org.nrg.xdat.bean.XnatImagescandataBean child = (org.nrg.xdat.bean.XnatImagescandataBean)iter4.next();
			writer.write("\n" + createHeader(header++) + "<xnat:scan");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:imageScanData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return5 =child.addXMLBody(writer,header);
				if(return5){
					writer.write("\n" + createHeader(--header) + "</xnat:scan>");
				}else{
					writer.write("</xnat:scan>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:scans>");
			}
			}

			int child5=0;
			int att5=0;
			child5+=_Reconstructions_reconstructedimage.size();
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<xnat:reconstructions");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageSessionData -> reconstructions/reconstructedImage
		java.util.Iterator iter6=_Reconstructions_reconstructedimage.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.XnatReconstructedimagedataBean child = (org.nrg.xdat.bean.XnatReconstructedimagedataBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<xnat:reconstructedImage");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:reconstructedImageData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</xnat:reconstructedImage>");
				}else{
					writer.write("</xnat:reconstructedImage>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:reconstructions>");
			}
			}

			int child7=0;
			int att7=0;
			child7+=_Assessors_assessor.size();
			if(child7>0 || att7>0){
				writer.write("\n" + createHeader(header++) + "<xnat:assessors");
			if(child7==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM imageSessionData -> assessors/assessor
		java.util.Iterator iter8=_Assessors_assessor.iterator();
		while(iter8.hasNext()){
			org.nrg.xdat.bean.XnatImageassessordataBean child = (org.nrg.xdat.bean.XnatImageassessordataBean)iter8.next();
			writer.write("\n" + createHeader(header++) + "<xnat:assessor");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:imageAssessorData")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return9 =child.addXMLBody(writer,header);
				if(return9){
					writer.write("\n" + createHeader(--header) + "</xnat:assessor>");
				}else{
					writer.write("</xnat:assessor>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:assessors>");
			}
			}

		if (_Dcmaccessionnumber!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmAccessionNumber");
			writer.write(">");
			writer.write(ValueParser(_Dcmaccessionnumber,"string"));
			writer.write("</xnat:dcmAccessionNumber>");
			header--;
		}
		if (_Dcmpatientid!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmPatientId");
			writer.write(">");
			writer.write(ValueParser(_Dcmpatientid,"string"));
			writer.write("</xnat:dcmPatientId>");
			header--;
		}
		if (_Dcmpatientname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmPatientName");
			writer.write(">");
			writer.write(ValueParser(_Dcmpatientname,"string"));
			writer.write("</xnat:dcmPatientName>");
			header--;
		}
		if (_Dcmpatientbirthdate!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmPatientBirthDate");
			writer.write(">");
			writer.write(ValueParser(_Dcmpatientbirthdate,"date"));
			writer.write("</xnat:dcmPatientBirthDate>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Regions_region.size()>0)return true;
		if (_Scanner_manufacturer!=null)
			return true;
		if (_Scanner_model!=null)
			return true;
		if (_Scanner!=null) return true;
		if (_Operator!=null) return true;
		if (_Prearchivepath!=null) return true;
			if(_Scans_scan.size()>0)return true;
			if(_Reconstructions_reconstructedimage.size()>0)return true;
			if(_Assessors_assessor.size()>0)return true;
		if (_Dcmaccessionnumber!=null) return true;
		if (_Dcmpatientid!=null) return true;
		if (_Dcmpatientname!=null) return true;
		if (_Dcmpatientbirthdate!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
