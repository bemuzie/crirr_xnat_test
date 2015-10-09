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
public class ValProtocoldataScanCheckBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ValProtocoldataScanCheckI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ValProtocoldataScanCheckBean.class);
	public static String SCHEMA_ELEMENT_NAME="val:protocolData_scan_check";

	public String getSchemaElementName(){
		return "protocolData_scan_check";
	}

	public String getFullSchemaElementName(){
		return "val:protocolData_scan_check";
	}
	 private List<org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean> _Conditions_condition =new ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean>();

	/**
	 * conditions/condition
	 * @return Returns an List of org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckConditionI> List<A> getConditions_condition() {
		return (List<A>) _Conditions_condition;
	}

	/**
	 * Sets the value for conditions/condition.
	 * @param v Value to Set.
	 */
	public void setConditions_condition(ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean> v){
		_Conditions_condition=v;
	}

	/**
	 * Adds the value for conditions/condition.
	 * @param v Value to Set.
	 */
	public void addConditions_condition(org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean v){
		_Conditions_condition.add(v);
	}

	/**
	 * conditions/condition
	 * Adds org.nrg.xdat.model.ValProtocoldataScanCheckConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckConditionI> void addConditions_condition(A item) throws Exception{
	_Conditions_condition.add((org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean)item);
	}

	/**
	 * Adds the value for conditions/condition.
	 * @param v Value to Set.
	 */
	public void addConditions_condition(Object v){
		if (v instanceof org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean)
			_Conditions_condition.add((org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean");
	}
	 private List<org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean> _Comments_comment =new ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean>();

	/**
	 * comments/comment
	 * @return Returns an List of org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckCommentI> List<A> getComments_comment() {
		return (List<A>) _Comments_comment;
	}

	/**
	 * Sets the value for comments/comment.
	 * @param v Value to Set.
	 */
	public void setComments_comment(ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean> v){
		_Comments_comment=v;
	}

	/**
	 * Adds the value for comments/comment.
	 * @param v Value to Set.
	 */
	public void addComments_comment(org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean v){
		_Comments_comment.add(v);
	}

	/**
	 * comments/comment
	 * Adds org.nrg.xdat.model.ValProtocoldataScanCheckCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckCommentI> void addComments_comment(A item) throws Exception{
	_Comments_comment.add((org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean)item);
	}

	/**
	 * Adds the value for comments/comment.
	 * @param v Value to Set.
	 */
	public void addComments_comment(Object v){
		if (v instanceof org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean)
			_Comments_comment.add((org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean");
	}
	 private org.nrg.xdat.bean.ValAdditionalvalBean _Additionalval =null;

	/**
	 * additionalVal
	 * @return org.nrg.xdat.bean.ValAdditionalvalBean
	 */
	public org.nrg.xdat.bean.ValAdditionalvalBean getAdditionalval() {
		return _Additionalval;
	}

	/**
	 * Sets the value for additionalVal.
	 * @param v Value to Set.
	 */
	public void setAdditionalval(org.nrg.xdat.bean.ValAdditionalvalBean v){
		_Additionalval =v;
	}

	/**
	 * Sets the value for additionalVal.
	 * @param v Value to Set.
	 */
	public void setAdditionalval(Object v) {
		if (v instanceof org.nrg.xdat.bean.ValAdditionalvalBean)
			_Additionalval =(org.nrg.xdat.bean.ValAdditionalvalBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValAdditionalvalBean");
	}

	/**
	 * additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public <A extends org.nrg.xdat.model.ValAdditionalvalI> void setAdditionalval(A item) throws Exception{
	setAdditionalval((org.nrg.xdat.bean.ValAdditionalvalBean)item);
	}

	//FIELD

	private Integer _AdditionalvalFK=null;

	/**
	 * @return Returns the val:protocolData_scan_check/additionalval_val_additionalval_id.
	 */
	public Integer getAdditionalvalFK(){
		return _AdditionalvalFK;
	}

	/**
	 * Sets the value for val:protocolData_scan_check/additionalval_val_additionalval_id.
	 * @param v Value to Set.
	 */
	public void setAdditionalvalFK(Integer v) {
		_AdditionalvalFK=v;
	}

	//FIELD

	private String _ScanId=null;

	/**
	 * @return Returns the SCAN_ID.
	 */
	public String getScanId(){
		return _ScanId;
	}

	/**
	 * Sets the value for SCAN_ID.
	 * @param v Value to Set.
	 */
	public void setScanId(String v){
		_ScanId=v;
	}

	//FIELD

	private String _Status=null;

	/**
	 * @return Returns the status.
	 */
	public String getStatus(){
		return _Status;
	}

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v){
		_Status=v;
	}

	//FIELD

	private Integer _ValProtocoldataScanCheckId=null;

	/**
	 * @return Returns the val_protocolData_scan_check_id.
	 */
	public Integer getValProtocoldataScanCheckId() {
		return _ValProtocoldataScanCheckId;
	}

	/**
	 * Sets the value for val_protocolData_scan_check_id.
	 * @param v Value to Set.
	 */
	public void setValProtocoldataScanCheckId(Integer v){
		_ValProtocoldataScanCheckId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("SCAN_ID")){
			setScanId(v);
		}else if (xmlPath.equals("status")){
			setStatus(v);
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
		if (xmlPath.equals("conditions/condition")){
			addConditions_condition(v);
		}else if (xmlPath.equals("comments/comment")){
			addComments_comment(v);
		}else if (xmlPath.equals("additionalVal")){
			setAdditionalval(v);
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
		if (xmlPath.equals("SCAN_ID")){
			return getScanId();
		}else if (xmlPath.equals("status")){
			return getStatus();
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
		if (xmlPath.equals("conditions/condition")){
			return getConditions_condition();
		}else if (xmlPath.equals("comments/comment")){
			return getComments_comment();
		}else if (xmlPath.equals("additionalVal")){
			return getAdditionalval();
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
		if (xmlPath.equals("conditions/condition")){
			return "http://nrg.wustl.edu/val:protocolData_scan_check_condition";
		}else if (xmlPath.equals("comments/comment")){
			return "http://nrg.wustl.edu/val:protocolData_scan_check_comment";
		}else if (xmlPath.equals("additionalVal")){
			return "http://nrg.wustl.edu/val:additionalVal";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("conditions/condition")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("comments/comment")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("additionalVal")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("SCAN_ID")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("status")){
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
		all_fields.add("conditions/condition");
		all_fields.add("comments/comment");
		all_fields.add("additionalVal");
		all_fields.add("SCAN_ID");
		all_fields.add("status");
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
		writer.write("\n<val:protocolData_scan_check");
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
		writer.write("\n</val:protocolData_scan_check>");
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
		if (_ScanId!=null)
			map.put("SCAN_ID",ValueParser(_ScanId,"string"));
		else map.put("SCAN_ID","");//REQUIRED FIELD

		if (_Status!=null)
			map.put("status",ValueParser(_Status,"string"));
		else map.put("status","");//REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
			int child0=0;
			int att0=0;
			child0+=_Conditions_condition.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<val:conditions");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM protocolData_scan_check -> conditions/condition
		java.util.Iterator iter1=_Conditions_condition.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean child = (org.nrg.xdat.bean.ValProtocoldataScanCheckConditionBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<val:condition");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("val:protocolData_scan_check_condition")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</val:condition>");
				}else{
					writer.write("</val:condition>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</val:conditions>");
			}
			}

			int child2=0;
			int att2=0;
			child2+=_Comments_comment.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<val:comments");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM protocolData_scan_check -> comments/comment
		java.util.Iterator iter3=_Comments_comment.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean child = (org.nrg.xdat.bean.ValProtocoldataScanCheckCommentBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<val:comment");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("val:protocolData_scan_check_comment")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</val:comment>");
				}else{
					writer.write("</val:comment>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</val:comments>");
			}
			}

		//REFERENCE FROM protocolData_scan_check -> additionalVal
		//DATA-FIELD FROM protocolData_scan_check -> additionalVal
		if (_Additionalval!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<val:additionalVal");
			_Additionalval.addXMLAtts(writer);
			if(!_Additionalval.getFullSchemaElementName().equals("val:additionalVal")){
				writer.write(" xsi:type=\"" + _Additionalval.getFullSchemaElementName() + "\"");
			}
			if (_Additionalval.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =_Additionalval.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</val:additionalVal>");
				}else{
					writer.write("</val:additionalVal>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Conditions_condition.size()>0)return true;
			if(_Comments_comment.size()>0)return true;
		if (_Additionalval!=null){
			if (_Additionalval.hasXMLBodyContent()) return true;
		}
		//NOT REQUIRED

		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
