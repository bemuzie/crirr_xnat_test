/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
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
public class XnatPetqcscandataBean extends XnatQcscandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatPetqcscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPetqcscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:petQcScanData";

	public String getSchemaElementName(){
		return "petQcScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:petQcScanData";
	}

	//FIELD

	private String _Acquisition=null;

	/**
	 * @return Returns the acquisition.
	 */
	public String getAcquisition(){
		return _Acquisition;
	}

	/**
	 * Sets the value for acquisition.
	 * @param v Value to Set.
	 */
	public void setAcquisition(String v){
		_Acquisition=v;
	}

	//FIELD

	private String _Correctreconstructionalgorithm=null;

	/**
	 * @return Returns the correctReconstructionAlgorithm.
	 */
	public String getCorrectreconstructionalgorithm(){
		return _Correctreconstructionalgorithm;
	}

	/**
	 * Sets the value for correctReconstructionAlgorithm.
	 * @param v Value to Set.
	 */
	public void setCorrectreconstructionalgorithm(String v){
		_Correctreconstructionalgorithm=v;
	}

	//FIELD

	private String _Reconstructionalgorithmused=null;

	/**
	 * @return Returns the reconstructionAlgorithmUsed.
	 */
	public String getReconstructionalgorithmused(){
		return _Reconstructionalgorithmused;
	}

	/**
	 * Sets the value for reconstructionAlgorithmUsed.
	 * @param v Value to Set.
	 */
	public void setReconstructionalgorithmused(String v){
		_Reconstructionalgorithmused=v;
	}

	//FIELD

	private String _Correctiterationsandsubsets=null;

	/**
	 * @return Returns the correctIterationsAndSubsets.
	 */
	public String getCorrectiterationsandsubsets(){
		return _Correctiterationsandsubsets;
	}

	/**
	 * Sets the value for correctIterationsAndSubsets.
	 * @param v Value to Set.
	 */
	public void setCorrectiterationsandsubsets(String v){
		_Correctiterationsandsubsets=v;
	}

	//FIELD

	private String _Correctfilters=null;

	/**
	 * @return Returns the correctFilters.
	 */
	public String getCorrectfilters(){
		return _Correctfilters;
	}

	/**
	 * Sets the value for correctFilters.
	 * @param v Value to Set.
	 */
	public void setCorrectfilters(String v){
		_Correctfilters=v;
	}

	//FIELD

	private String _Correctslicethickness=null;

	/**
	 * @return Returns the correctSliceThickness.
	 */
	public String getCorrectslicethickness(){
		return _Correctslicethickness;
	}

	/**
	 * Sets the value for correctSliceThickness.
	 * @param v Value to Set.
	 */
	public void setCorrectslicethickness(String v){
		_Correctslicethickness=v;
	}

	//FIELD

	private String _Acceptablevoxelsize=null;

	/**
	 * @return Returns the acceptableVoxelSize.
	 */
	public String getAcceptablevoxelsize(){
		return _Acceptablevoxelsize;
	}

	/**
	 * Sets the value for acceptableVoxelSize.
	 * @param v Value to Set.
	 */
	public void setAcceptablevoxelsize(String v){
		_Acceptablevoxelsize=v;
	}

	//FIELD

	private String _Unacceptableframes=null;

	/**
	 * @return Returns the unacceptableFrames.
	 */
	public String getUnacceptableframes(){
		return _Unacceptableframes;
	}

	/**
	 * Sets the value for unacceptableFrames.
	 * @param v Value to Set.
	 */
	public void setUnacceptableframes(String v){
		_Unacceptableframes=v;
	}

	//FIELD

	private String _Reasonframesunacceptable=null;

	/**
	 * @return Returns the reasonFramesUnacceptable.
	 */
	public String getReasonframesunacceptable(){
		return _Reasonframesunacceptable;
	}

	/**
	 * Sets the value for reasonFramesUnacceptable.
	 * @param v Value to Set.
	 */
	public void setReasonframesunacceptable(String v){
		_Reasonframesunacceptable=v;
	}
	 private List<org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean> _Processingerrors_processingerror =new ArrayList<org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean>();

	/**
	 * processingErrors/processingError
	 * @return Returns an List of org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean
	 */
	public <A extends org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI> List<A> getProcessingerrors_processingerror() {
		return (List<A>) _Processingerrors_processingerror;
	}

	/**
	 * Sets the value for processingErrors/processingError.
	 * @param v Value to Set.
	 */
	public void setProcessingerrors_processingerror(ArrayList<org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean> v){
		_Processingerrors_processingerror=v;
	}

	/**
	 * Adds the value for processingErrors/processingError.
	 * @param v Value to Set.
	 */
	public void addProcessingerrors_processingerror(org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean v){
		_Processingerrors_processingerror.add(v);
	}

	/**
	 * processingErrors/processingError
	 * Adds org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI
	 */
	public <A extends org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI> void addProcessingerrors_processingerror(A item) throws Exception{
	_Processingerrors_processingerror.add((org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean)item);
	}

	/**
	 * Adds the value for processingErrors/processingError.
	 * @param v Value to Set.
	 */
	public void addProcessingerrors_processingerror(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean)
			_Processingerrors_processingerror.add((org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean");
	}

	//FIELD

	private String _Qcoutcome=null;

	/**
	 * @return Returns the qcOutcome.
	 */
	public String getQcoutcome(){
		return _Qcoutcome;
	}

	/**
	 * Sets the value for qcOutcome.
	 * @param v Value to Set.
	 */
	public void setQcoutcome(String v){
		_Qcoutcome=v;
	}

	//FIELD

	private String _Qcoutcomereason=null;

	/**
	 * @return Returns the qcOutcomeReason.
	 */
	public String getQcoutcomereason(){
		return _Qcoutcomereason;
	}

	/**
	 * Sets the value for qcOutcomeReason.
	 * @param v Value to Set.
	 */
	public void setQcoutcomereason(String v){
		_Qcoutcomereason=v;
	}

	//FIELD

	private String _Topcutoff=null;

	/**
	 * @return Returns the topCutoff.
	 */
	public String getTopcutoff(){
		return _Topcutoff;
	}

	/**
	 * Sets the value for topCutoff.
	 * @param v Value to Set.
	 */
	public void setTopcutoff(String v){
		_Topcutoff=v;
	}

	//FIELD

	private String _Bottomcutoff=null;

	/**
	 * @return Returns the bottomCutoff.
	 */
	public String getBottomcutoff(){
		return _Bottomcutoff;
	}

	/**
	 * Sets the value for bottomCutoff.
	 * @param v Value to Set.
	 */
	public void setBottomcutoff(String v){
		_Bottomcutoff=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("acquisition")){
			setAcquisition(v);
		}else if (xmlPath.equals("correctReconstructionAlgorithm")){
			setCorrectreconstructionalgorithm(v);
		}else if (xmlPath.equals("reconstructionAlgorithmUsed")){
			setReconstructionalgorithmused(v);
		}else if (xmlPath.equals("correctIterationsAndSubsets")){
			setCorrectiterationsandsubsets(v);
		}else if (xmlPath.equals("correctFilters")){
			setCorrectfilters(v);
		}else if (xmlPath.equals("correctSliceThickness")){
			setCorrectslicethickness(v);
		}else if (xmlPath.equals("acceptableVoxelSize")){
			setAcceptablevoxelsize(v);
		}else if (xmlPath.equals("unacceptableFrames")){
			setUnacceptableframes(v);
		}else if (xmlPath.equals("reasonFramesUnacceptable")){
			setReasonframesunacceptable(v);
		}else if (xmlPath.equals("qcOutcome")){
			setQcoutcome(v);
		}else if (xmlPath.equals("qcOutcomeReason")){
			setQcoutcomereason(v);
		}else if (xmlPath.equals("topCutoff")){
			setTopcutoff(v);
		}else if (xmlPath.equals("bottomCutoff")){
			setBottomcutoff(v);
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
		if (xmlPath.equals("processingErrors/processingError")){
			addProcessingerrors_processingerror(v);
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
		if (xmlPath.equals("acquisition")){
			return getAcquisition();
		}else if (xmlPath.equals("correctReconstructionAlgorithm")){
			return getCorrectreconstructionalgorithm();
		}else if (xmlPath.equals("reconstructionAlgorithmUsed")){
			return getReconstructionalgorithmused();
		}else if (xmlPath.equals("correctIterationsAndSubsets")){
			return getCorrectiterationsandsubsets();
		}else if (xmlPath.equals("correctFilters")){
			return getCorrectfilters();
		}else if (xmlPath.equals("correctSliceThickness")){
			return getCorrectslicethickness();
		}else if (xmlPath.equals("acceptableVoxelSize")){
			return getAcceptablevoxelsize();
		}else if (xmlPath.equals("unacceptableFrames")){
			return getUnacceptableframes();
		}else if (xmlPath.equals("reasonFramesUnacceptable")){
			return getReasonframesunacceptable();
		}else if (xmlPath.equals("qcOutcome")){
			return getQcoutcome();
		}else if (xmlPath.equals("qcOutcomeReason")){
			return getQcoutcomereason();
		}else if (xmlPath.equals("topCutoff")){
			return getTopcutoff();
		}else if (xmlPath.equals("bottomCutoff")){
			return getBottomcutoff();
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
		if (xmlPath.equals("processingErrors/processingError")){
			return getProcessingerrors_processingerror();
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
		if (xmlPath.equals("processingErrors/processingError")){
			return "http://nrg.wustl.edu/xnat:petQcScanData_processingError";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("acquisition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("correctReconstructionAlgorithm")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("reconstructionAlgorithmUsed")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("correctIterationsAndSubsets")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("correctFilters")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("correctSliceThickness")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("acceptableVoxelSize")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("unacceptableFrames")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("reasonFramesUnacceptable")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("processingErrors/processingError")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("qcOutcome")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("qcOutcomeReason")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("topCutoff")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bottomCutoff")){
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
		all_fields.add("acquisition");
		all_fields.add("correctReconstructionAlgorithm");
		all_fields.add("reconstructionAlgorithmUsed");
		all_fields.add("correctIterationsAndSubsets");
		all_fields.add("correctFilters");
		all_fields.add("correctSliceThickness");
		all_fields.add("acceptableVoxelSize");
		all_fields.add("unacceptableFrames");
		all_fields.add("reasonFramesUnacceptable");
		all_fields.add("processingErrors/processingError");
		all_fields.add("qcOutcome");
		all_fields.add("qcOutcomeReason");
		all_fields.add("topCutoff");
		all_fields.add("bottomCutoff");
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
		writer.write("\n<xnat:petQcScanData");
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
		writer.write("\n</xnat:petQcScanData>");
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
		//REFERENCE FROM petQcScanData -> qcScanData
		if (_Acquisition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acquisition");
			writer.write(">");
			writer.write(ValueParser(_Acquisition,"string"));
			writer.write("</xnat:acquisition>");
			header--;
		}
		if (_Correctreconstructionalgorithm!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:correctReconstructionAlgorithm");
			writer.write(">");
			writer.write(ValueParser(_Correctreconstructionalgorithm,"string"));
			writer.write("</xnat:correctReconstructionAlgorithm>");
			header--;
		}
		if (_Reconstructionalgorithmused!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:reconstructionAlgorithmUsed");
			writer.write(">");
			writer.write(ValueParser(_Reconstructionalgorithmused,"string"));
			writer.write("</xnat:reconstructionAlgorithmUsed>");
			header--;
		}
		if (_Correctiterationsandsubsets!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:correctIterationsAndSubsets");
			writer.write(">");
			writer.write(ValueParser(_Correctiterationsandsubsets,"string"));
			writer.write("</xnat:correctIterationsAndSubsets>");
			header--;
		}
		if (_Correctfilters!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:correctFilters");
			writer.write(">");
			writer.write(ValueParser(_Correctfilters,"string"));
			writer.write("</xnat:correctFilters>");
			header--;
		}
		if (_Correctslicethickness!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:correctSliceThickness");
			writer.write(">");
			writer.write(ValueParser(_Correctslicethickness,"string"));
			writer.write("</xnat:correctSliceThickness>");
			header--;
		}
		if (_Acceptablevoxelsize!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acceptableVoxelSize");
			writer.write(">");
			writer.write(ValueParser(_Acceptablevoxelsize,"string"));
			writer.write("</xnat:acceptableVoxelSize>");
			header--;
		}
		if (_Unacceptableframes!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:unacceptableFrames");
			writer.write(">");
			writer.write(ValueParser(_Unacceptableframes,"string"));
			writer.write("</xnat:unacceptableFrames>");
			header--;
		}
		if (_Reasonframesunacceptable!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:reasonFramesUnacceptable");
			writer.write(">");
			writer.write(ValueParser(_Reasonframesunacceptable,"string"));
			writer.write("</xnat:reasonFramesUnacceptable>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Processingerrors_processingerror.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:processingErrors");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM petQcScanData -> processingErrors/processingError
		//IN-LINE REPEATER
		java.util.Iterator iter1=_Processingerrors_processingerror.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean child = (org.nrg.xdat.bean.XnatPetqcscandataProcessingerrorBean)iter1.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</xnat:processingErrors>");
			}
			}

		if (_Qcoutcome!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:qcOutcome");
			writer.write(">");
			writer.write(ValueParser(_Qcoutcome,"string"));
			writer.write("</xnat:qcOutcome>");
			header--;
		}
		if (_Qcoutcomereason!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:qcOutcomeReason");
			writer.write(">");
			writer.write(ValueParser(_Qcoutcomereason,"string"));
			writer.write("</xnat:qcOutcomeReason>");
			header--;
		}
		if (_Topcutoff!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:topCutoff");
			writer.write(">");
			writer.write(ValueParser(_Topcutoff,"string"));
			writer.write("</xnat:topCutoff>");
			header--;
		}
		if (_Bottomcutoff!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:bottomCutoff");
			writer.write(">");
			writer.write(ValueParser(_Bottomcutoff,"string"));
			writer.write("</xnat:bottomCutoff>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Acquisition!=null) return true;
		if (_Correctreconstructionalgorithm!=null) return true;
		if (_Reconstructionalgorithmused!=null) return true;
		if (_Correctiterationsandsubsets!=null) return true;
		if (_Correctfilters!=null) return true;
		if (_Correctslicethickness!=null) return true;
		if (_Acceptablevoxelsize!=null) return true;
		if (_Unacceptableframes!=null) return true;
		if (_Reasonframesunacceptable!=null) return true;
			if(_Processingerrors_processingerror.size()>0)return true;
		if (_Qcoutcome!=null) return true;
		if (_Qcoutcomereason!=null) return true;
		if (_Topcutoff!=null) return true;
		if (_Bottomcutoff!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
