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
public class XnatQcscandataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatQcscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatQcscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:qcScanData";

	public String getSchemaElementName(){
		return "qcScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:qcScanData";
	}

	//FIELD

	private String _ImagescanId=null;

	/**
	 * @return Returns the imageScan_ID.
	 */
	public String getImagescanId(){
		return _ImagescanId;
	}

	/**
	 * Sets the value for imageScan_ID.
	 * @param v Value to Set.
	 */
	public void setImagescanId(String v){
		_ImagescanId=v;
	}

	//FIELD

	private String _Rater=null;

	/**
	 * @return Returns the rater.
	 */
	public String getRater(){
		return _Rater;
	}

	/**
	 * Sets the value for rater.
	 * @param v Value to Set.
	 */
	public void setRater(String v){
		_Rater=v;
	}

	//FIELD

	private String _Coverage=null;

	/**
	 * @return Returns the coverage.
	 */
	public String getCoverage(){
		return _Coverage;
	}

	/**
	 * Sets the value for coverage.
	 * @param v Value to Set.
	 */
	public void setCoverage(String v){
		_Coverage=v;
	}

	//FIELD

	private String _Motion=null;

	/**
	 * @return Returns the motion.
	 */
	public String getMotion(){
		return _Motion;
	}

	/**
	 * Sets the value for motion.
	 * @param v Value to Set.
	 */
	public void setMotion(String v){
		_Motion=v;
	}

	//FIELD

	private String _Otherimageartifacts=null;

	/**
	 * @return Returns the otherImageArtifacts.
	 */
	public String getOtherimageartifacts(){
		return _Otherimageartifacts;
	}

	/**
	 * Sets the value for otherImageArtifacts.
	 * @param v Value to Set.
	 */
	public void setOtherimageartifacts(String v){
		_Otherimageartifacts=v;
	}

	//FIELD

	private String _Comments=null;

	/**
	 * @return Returns the comments.
	 */
	public String getComments(){
		return _Comments;
	}

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v){
		_Comments=v;
	}

	//FIELD

	private String _Pass=null;

	/**
	 * @return Returns the pass.
	 */
	public String getPass(){
		return _Pass;
	}

	/**
	 * Sets the value for pass.
	 * @param v Value to Set.
	 */
	public void setPass(String v){
		_Pass=v;
	}

	//FIELD

	private String _Rating=null;

	/**
	 * @return Returns the rating.
	 */
	public String getRating(){
		return _Rating;
	}

	/**
	 * Sets the value for rating.
	 * @param v Value to Set.
	 */
	public void setRating(String v){
		_Rating=v;
	}

	//FIELD

	private String _Rating_scale=null;

	/**
	 * @return Returns the rating/scale.
	 */
	public String getRating_scale(){
		return _Rating_scale;
	}

	/**
	 * Sets the value for rating/scale.
	 * @param v Value to Set.
	 */
	public void setRating_scale(String v){
		_Rating_scale=v;
	}
	 private List<org.nrg.xdat.bean.XnatQcscandataFieldBean> _Fields_field =new ArrayList<org.nrg.xdat.bean.XnatQcscandataFieldBean>();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.bean.XnatQcscandataFieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataFieldI> List<A> getFields_field() {
		return (List<A>) _Fields_field;
	}

	/**
	 * Sets the value for fields/field.
	 * @param v Value to Set.
	 */
	public void setFields_field(ArrayList<org.nrg.xdat.bean.XnatQcscandataFieldBean> v){
		_Fields_field=v;
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(org.nrg.xdat.bean.XnatQcscandataFieldBean v){
		_Fields_field.add(v);
	}

	/**
	 * fields/field
	 * Adds org.nrg.xdat.model.XnatQcscandataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataFieldI> void addFields_field(A item) throws Exception{
	_Fields_field.add((org.nrg.xdat.bean.XnatQcscandataFieldBean)item);
	}

	/**
	 * Adds the value for fields/field.
	 * @param v Value to Set.
	 */
	public void addFields_field(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatQcscandataFieldBean)
			_Fields_field.add((org.nrg.xdat.bean.XnatQcscandataFieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatQcscandataFieldBean");
	}

	//FIELD

	private Integer _XnatQcscandataId=null;

	/**
	 * @return Returns the xnat_qcScanData_id.
	 */
	public Integer getXnatQcscandataId() {
		return _XnatQcscandataId;
	}

	/**
	 * Sets the value for xnat_qcScanData_id.
	 * @param v Value to Set.
	 */
	public void setXnatQcscandataId(Integer v){
		_XnatQcscandataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("imageScan_ID")){
			setImagescanId(v);
		}else if (xmlPath.equals("rater")){
			setRater(v);
		}else if (xmlPath.equals("coverage")){
			setCoverage(v);
		}else if (xmlPath.equals("motion")){
			setMotion(v);
		}else if (xmlPath.equals("otherImageArtifacts")){
			setOtherimageartifacts(v);
		}else if (xmlPath.equals("comments")){
			setComments(v);
		}else if (xmlPath.equals("pass")){
			setPass(v);
		}else if (xmlPath.equals("rating")){
			setRating(v);
		}else if (xmlPath.equals("rating/scale")){
			setRating_scale(v);
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
		if (xmlPath.equals("fields/field")){
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
		if (xmlPath.equals("imageScan_ID")){
			return getImagescanId();
		}else if (xmlPath.equals("rater")){
			return getRater();
		}else if (xmlPath.equals("coverage")){
			return getCoverage();
		}else if (xmlPath.equals("motion")){
			return getMotion();
		}else if (xmlPath.equals("otherImageArtifacts")){
			return getOtherimageartifacts();
		}else if (xmlPath.equals("comments")){
			return getComments();
		}else if (xmlPath.equals("pass")){
			return getPass();
		}else if (xmlPath.equals("rating")){
			return getRating();
		}else if (xmlPath.equals("rating/scale")){
			return getRating_scale();
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
		if (xmlPath.equals("fields/field")){
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
		if (xmlPath.equals("fields/field")){
			return "http://nrg.wustl.edu/xnat:qcScanData_field";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("imageScan_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rater")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("coverage")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("motion")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("otherImageArtifacts")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("comments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("pass")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rating")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rating/scale")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fields/field")){
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
		all_fields.add("imageScan_ID");
		all_fields.add("rater");
		all_fields.add("coverage");
		all_fields.add("motion");
		all_fields.add("otherImageArtifacts");
		all_fields.add("comments");
		all_fields.add("pass");
		all_fields.add("rating");
		all_fields.add("rating/scale");
		all_fields.add("fields/field");
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
		writer.write("\n<xnat:qcScanData");
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
		writer.write("\n</xnat:qcScanData>");
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
		if (_ImagescanId!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageScan_ID");
			writer.write(">");
			writer.write(ValueParser(_ImagescanId,"string"));
			writer.write("</xnat:imageScan_ID>");
			header--;
		}
		if (_Rater!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rater");
			writer.write(">");
			writer.write(ValueParser(_Rater,"string"));
			writer.write("</xnat:rater>");
			header--;
		}
		if (_Coverage!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:coverage");
			writer.write(">");
			writer.write(ValueParser(_Coverage,"string"));
			writer.write("</xnat:coverage>");
			header--;
		}
		if (_Motion!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:motion");
			writer.write(">");
			writer.write(ValueParser(_Motion,"string"));
			writer.write("</xnat:motion>");
			header--;
		}
		if (_Otherimageartifacts!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:otherImageArtifacts");
			writer.write(">");
			writer.write(ValueParser(_Otherimageartifacts,"string"));
			writer.write("</xnat:otherImageArtifacts>");
			header--;
		}
		if (_Comments!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:comments");
			writer.write(">");
			writer.write(ValueParser(_Comments,"string"));
			writer.write("</xnat:comments>");
			header--;
		}
		if (_Pass!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:pass");
			writer.write(">");
			writer.write(ValueParser(_Pass,"string"));
			writer.write("</xnat:pass>");
			header--;
		}
		TreeMap RatingATTMap = new TreeMap();
		String RatingATT = new String();
		if (_Rating_scale!=null)
			RatingATTMap.put("scale",ValueParser(_Rating_scale,"string"));
		java.util.Iterator iter0 =RatingATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			RatingATT +=" " + key + "=\"" + RatingATTMap.get(key) + "\"";
		}
		if (_Rating!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rating");
			writer.write(RatingATT);
			writer.write(">");
			writer.write(ValueParser(_Rating,"string"));
			writer.write("</xnat:rating>");
			header--;
		}
		else if(!RatingATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:rating");
			writer.write(RatingATT);
			writer.write("/>");
			header--;
		}

			int child1=0;
			int att1=0;
			child1+=_Fields_field.size();
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat:fields");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM qcScanData -> fields/field
		java.util.Iterator iter2=_Fields_field.iterator();
		while(iter2.hasNext()){
			org.nrg.xdat.bean.XnatQcscandataFieldBean child = (org.nrg.xdat.bean.XnatQcscandataFieldBean)iter2.next();
			writer.write("\n" + createHeader(header++) + "<xnat:field");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:qcScanData_field")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return3 =child.addXMLBody(writer,header);
				if(return3){
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
		if (_ImagescanId!=null) return true;
		if (_Rater!=null) return true;
		if (_Coverage!=null) return true;
		if (_Motion!=null) return true;
		if (_Otherimageartifacts!=null) return true;
		if (_Comments!=null) return true;
		if (_Pass!=null) return true;
		if (_Rating_scale!=null)
			return true;
		if (_Rating!=null) return true;
			if(_Fields_field.size()>0)return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
