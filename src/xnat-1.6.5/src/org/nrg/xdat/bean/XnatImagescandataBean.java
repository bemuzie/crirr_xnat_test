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
public class XnatImagescandataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatImagescandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatImagescandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:imageScanData";

	public String getSchemaElementName(){
		return "imageScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:imageScanData";
	}
	 private List<org.nrg.xdat.bean.XnatImagescandataShareBean> _Sharing_share =new ArrayList<org.nrg.xdat.bean.XnatImagescandataShareBean>();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.bean.XnatImagescandataShareBean
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataShareI> List<A> getSharing_share() {
		return (List<A>) _Sharing_share;
	}

	/**
	 * Sets the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void setSharing_share(ArrayList<org.nrg.xdat.bean.XnatImagescandataShareBean> v){
		_Sharing_share=v;
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(org.nrg.xdat.bean.XnatImagescandataShareBean v){
		_Sharing_share.add(v);
	}

	/**
	 * sharing/share
	 * Adds org.nrg.xdat.model.XnatImagescandataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataShareI> void addSharing_share(A item) throws Exception{
	_Sharing_share.add((org.nrg.xdat.bean.XnatImagescandataShareBean)item);
	}

	/**
	 * Adds the value for sharing/share.
	 * @param v Value to Set.
	 */
	public void addSharing_share(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatImagescandataShareBean)
			_Sharing_share.add((org.nrg.xdat.bean.XnatImagescandataShareBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatImagescandataShareBean");
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

	//FIELD

	private String _Note=null;

	/**
	 * @return Returns the note.
	 */
	public String getNote(){
		return _Note;
	}

	/**
	 * Sets the value for note.
	 * @param v Value to Set.
	 */
	public void setNote(String v){
		_Note=v;
	}

	//FIELD

	private String _Quality=null;

	/**
	 * @return Returns the quality.
	 */
	public String getQuality(){
		return _Quality;
	}

	/**
	 * Sets the value for quality.
	 * @param v Value to Set.
	 */
	public void setQuality(String v){
		_Quality=v;
	}

	//FIELD

	private String _Condition=null;

	/**
	 * @return Returns the condition.
	 */
	public String getCondition(){
		return _Condition;
	}

	/**
	 * Sets the value for condition.
	 * @param v Value to Set.
	 */
	public void setCondition(String v){
		_Condition=v;
	}

	//FIELD

	private String _SeriesDescription=null;

	/**
	 * @return Returns the series_description.
	 */
	public String getSeriesDescription(){
		return _SeriesDescription;
	}

	/**
	 * Sets the value for series_description.
	 * @param v Value to Set.
	 */
	public void setSeriesDescription(String v){
		_SeriesDescription=v;
	}

	//FIELD

	private String _Documentation=null;

	/**
	 * @return Returns the documentation.
	 */
	public String getDocumentation(){
		return _Documentation;
	}

	/**
	 * Sets the value for documentation.
	 * @param v Value to Set.
	 */
	public void setDocumentation(String v){
		_Documentation=v;
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

	private Integer _Frames=null;

	/**
	 * @return Returns the frames.
	 */
	public Integer getFrames(){
		return _Frames;
	}

	/**
	 * Sets the value for xnat:imageScanData/frames.
	 * @param v Value to Set.
	 */
	public void setFrames(Integer v) {
		_Frames=v;
	}

	/**
	 * Sets the value for xnat:imageScanData/frames.
	 * @param v Value to Set.
	 */
	public void setFrames(String v)  {
		_Frames=formatInteger(v);
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
	 private List<org.nrg.xdat.bean.XnatAbstractresourceBean> _File =new ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean>();

	/**
	 * file
	 * @return Returns an List of org.nrg.xdat.bean.XnatAbstractresourceBean
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getFile() {
		return (List<A>) _File;
	}

	/**
	 * Sets the value for file.
	 * @param v Value to Set.
	 */
	public void setFile(ArrayList<org.nrg.xdat.bean.XnatAbstractresourceBean> v){
		_File=v;
	}

	/**
	 * Adds the value for file.
	 * @param v Value to Set.
	 */
	public void addFile(org.nrg.xdat.bean.XnatAbstractresourceBean v){
		_File.add(v);
	}

	/**
	 * file
	 * Adds org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addFile(A item) throws Exception{
	_File.add((org.nrg.xdat.bean.XnatAbstractresourceBean)item);
	}

	/**
	 * Adds the value for file.
	 * @param v Value to Set.
	 */
	public void addFile(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAbstractresourceBean)
			_File.add((org.nrg.xdat.bean.XnatAbstractresourceBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAbstractresourceBean");
	}
	 private org.nrg.xdat.bean.XnatValidationdataBean _Validation =null;

	/**
	 * validation
	 * @return org.nrg.xdat.bean.XnatValidationdataBean
	 */
	public org.nrg.xdat.bean.XnatValidationdataBean getValidation() {
		return _Validation;
	}

	/**
	 * Sets the value for validation.
	 * @param v Value to Set.
	 */
	public void setValidation(org.nrg.xdat.bean.XnatValidationdataBean v){
		_Validation =v;
	}

	/**
	 * Sets the value for validation.
	 * @param v Value to Set.
	 */
	public void setValidation(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatValidationdataBean)
			_Validation =(org.nrg.xdat.bean.XnatValidationdataBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatValidationdataBean");
	}

	/**
	 * validation
	 * @return org.nrg.xdat.model.XnatValidationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatValidationdataI> void setValidation(A item) throws Exception{
	setValidation((org.nrg.xdat.bean.XnatValidationdataBean)item);
	}

	//FIELD

	private Integer _ValidationFK=null;

	/**
	 * @return Returns the xnat:imageScanData/validation_xnat_validationdata_id.
	 */
	public Integer getValidationFK(){
		return _ValidationFK;
	}

	/**
	 * Sets the value for xnat:imageScanData/validation_xnat_validationdata_id.
	 * @param v Value to Set.
	 */
	public void setValidationFK(Integer v) {
		_ValidationFK=v;
	}

	//FIELD

	private Object _Starttime=null;

	/**
	 * @return Returns the startTime.
	 */
	public Object getStarttime(){
		return _Starttime;
	}

	/**
	 * Sets the value for startTime.
	 * @param v Value to Set.
	 */
	public void setStarttime(Object v){
		_Starttime=v;
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

	private Integer _XnatImagescandataId=null;

	/**
	 * @return Returns the xnat_imageScanData_id.
	 */
	public Integer getXnatImagescandataId() {
		return _XnatImagescandataId;
	}

	/**
	 * Sets the value for xnat_imageScanData_id.
	 * @param v Value to Set.
	 */
	public void setXnatImagescandataId(Integer v){
		_XnatImagescandataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("image_session_ID")){
			setImageSessionId(v);
		}else if (xmlPath.equals("note")){
			setNote(v);
		}else if (xmlPath.equals("quality")){
			setQuality(v);
		}else if (xmlPath.equals("condition")){
			setCondition(v);
		}else if (xmlPath.equals("series_description")){
			setSeriesDescription(v);
		}else if (xmlPath.equals("documentation")){
			setDocumentation(v);
		}else if (xmlPath.equals("scanner")){
			setScanner(v);
		}else if (xmlPath.equals("scanner/manufacturer")){
			setScanner_manufacturer(v);
		}else if (xmlPath.equals("scanner/model")){
			setScanner_model(v);
		}else if (xmlPath.equals("modality")){
			setModality(v);
		}else if (xmlPath.equals("frames")){
			setFrames(v);
		}else if (xmlPath.equals("operator")){
			setOperator(v);
		}else if (xmlPath.equals("startTime")){
			setStarttime(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
		}else if (xmlPath.equals("type")){
			setType(v);
		}else if (xmlPath.equals("UID")){
			setUid(v);
		}else if (xmlPath.equals("project")){
			setProject(v);
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
		}else if (xmlPath.equals("file")){
			addFile(v);
		}else if (xmlPath.equals("validation")){
			setValidation(v);
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
		}else if (xmlPath.equals("note")){
			return getNote();
		}else if (xmlPath.equals("quality")){
			return getQuality();
		}else if (xmlPath.equals("condition")){
			return getCondition();
		}else if (xmlPath.equals("series_description")){
			return getSeriesDescription();
		}else if (xmlPath.equals("documentation")){
			return getDocumentation();
		}else if (xmlPath.equals("scanner")){
			return getScanner();
		}else if (xmlPath.equals("scanner/manufacturer")){
			return getScanner_manufacturer();
		}else if (xmlPath.equals("scanner/model")){
			return getScanner_model();
		}else if (xmlPath.equals("modality")){
			return getModality();
		}else if (xmlPath.equals("frames")){
			return getFrames();
		}else if (xmlPath.equals("operator")){
			return getOperator();
		}else if (xmlPath.equals("startTime")){
			return getStarttime();
		}else if (xmlPath.equals("ID")){
			return getId();
		}else if (xmlPath.equals("type")){
			return getType();
		}else if (xmlPath.equals("UID")){
			return getUid();
		}else if (xmlPath.equals("project")){
			return getProject();
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
		}else if (xmlPath.equals("file")){
			return getFile();
		}else if (xmlPath.equals("validation")){
			return getValidation();
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
			return "http://nrg.wustl.edu/xnat:imageScanData_share";
		}else if (xmlPath.equals("file")){
			return "http://nrg.wustl.edu/xnat:abstractResource";
		}else if (xmlPath.equals("validation")){
			return "http://nrg.wustl.edu/xnat:validationData";
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
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("image_session_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("note")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("quality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("condition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("series_description")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("documentation")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("scanner")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scanner/manufacturer")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scanner/model")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("modality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("frames")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("operator")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("file")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("validation")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("startTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("UID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("project")){
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
		all_fields.add("image_session_ID");
		all_fields.add("note");
		all_fields.add("quality");
		all_fields.add("condition");
		all_fields.add("series_description");
		all_fields.add("documentation");
		all_fields.add("scanner");
		all_fields.add("scanner/manufacturer");
		all_fields.add("scanner/model");
		all_fields.add("modality");
		all_fields.add("frames");
		all_fields.add("operator");
		all_fields.add("file");
		all_fields.add("validation");
		all_fields.add("startTime");
		all_fields.add("ID");
		all_fields.add("type");
		all_fields.add("UID");
		all_fields.add("project");
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
		writer.write("\n<xnat:imageScanData");
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
		writer.write("\n</xnat:imageScanData>");
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

		if (_Type!=null)
			map.put("type",ValueParser(_Type,"string"));
		//NOT REQUIRED FIELD

		if (_Uid!=null)
			map.put("UID",ValueParser(_Uid,"string"));
		//NOT REQUIRED FIELD

		if (_Project!=null)
			map.put("project",ValueParser(_Project,"string"));
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
		//REFERENCE FROM imageScanData -> sharing/share
		java.util.Iterator iter1=_Sharing_share.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatImagescandataShareBean child = (org.nrg.xdat.bean.XnatImagescandataShareBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:share");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:imageScanData_share")){
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

		if (_ImageSessionId!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:image_session_ID");
			writer.write(">");
			writer.write(ValueParser(_ImageSessionId,"string"));
			writer.write("</xnat:image_session_ID>");
			header--;
		}
		if (_Note!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:note");
			writer.write(">");
			writer.write(ValueParser(_Note,"string"));
			writer.write("</xnat:note>");
			header--;
		}
		if (_Quality!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:quality");
			writer.write(">");
			writer.write(ValueParser(_Quality,"string"));
			writer.write("</xnat:quality>");
			header--;
		}
		if (_Condition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:condition");
			writer.write(">");
			writer.write(ValueParser(_Condition,"string"));
			writer.write("</xnat:condition>");
			header--;
		}
		if (_SeriesDescription!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:series_description");
			writer.write(">");
			writer.write(ValueParser(_SeriesDescription,"string"));
			writer.write("</xnat:series_description>");
			header--;
		}
		if (_Documentation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:documentation");
			writer.write(">");
			writer.write(ValueParser(_Documentation,"string"));
			writer.write("</xnat:documentation>");
			header--;
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

		if (_Modality!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:modality");
			writer.write(">");
			writer.write(ValueParser(_Modality,"string"));
			writer.write("</xnat:modality>");
			header--;
		}
		if (_Frames!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:frames");
			writer.write(">");
			writer.write(ValueParser(_Frames,"integer"));
			writer.write("</xnat:frames>");
			header--;
		}
		if (_Operator!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:operator");
			writer.write(">");
			writer.write(ValueParser(_Operator,"string"));
			writer.write("</xnat:operator>");
			header--;
		}
		//REFERENCE FROM imageScanData -> file
		java.util.Iterator iter3=_File.iterator();
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
		//REFERENCE FROM imageScanData -> validation
		//DATA-FIELD FROM imageScanData -> validation
		if (_Validation!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:validation");
			_Validation.addXMLAtts(writer);
			if(!_Validation.getFullSchemaElementName().equals("xnat:validationData")){
				writer.write(" xsi:type=\"" + _Validation.getFullSchemaElementName() + "\"");
			}
			if (_Validation.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =_Validation.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</xnat:validation>");
				}else{
					writer.write("</xnat:validation>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

		if (_Starttime!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:startTime");
			writer.write(">");
			writer.write(ValueParser(_Starttime,"time"));
			writer.write("</xnat:startTime>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Sharing_share.size()>0)return true;
		if (_ImageSessionId!=null) return true;
		if (_Note!=null) return true;
		if (_Quality!=null) return true;
		if (_Condition!=null) return true;
		if (_SeriesDescription!=null) return true;
		if (_Documentation!=null) return true;
		if (_Scanner_manufacturer!=null)
			return true;
		if (_Scanner_model!=null)
			return true;
		if (_Scanner!=null) return true;
		if (_Modality!=null) return true;
		if (_Frames!=null) return true;
		if (_Operator!=null) return true;
		if(_File.size()>0) return true;
		if (_Validation!=null){
			if (_Validation.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if (_Starttime!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
