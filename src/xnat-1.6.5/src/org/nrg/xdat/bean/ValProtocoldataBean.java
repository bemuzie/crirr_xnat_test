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
public class ValProtocoldataBean extends XnatImageassessordataBean implements java.io.Serializable, org.nrg.xdat.model.ValProtocoldataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ValProtocoldataBean.class);
	public static String SCHEMA_ELEMENT_NAME="val:protocolData";

	public String getSchemaElementName(){
		return "protocolData";
	}

	public String getFullSchemaElementName(){
		return "val:protocolData";
	}
	 private List<org.nrg.xdat.bean.ValProtocoldataConditionBean> _Check_conditions_condition =new ArrayList<org.nrg.xdat.bean.ValProtocoldataConditionBean>();

	/**
	 * check/conditions/condition
	 * @return Returns an List of org.nrg.xdat.bean.ValProtocoldataConditionBean
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataConditionI> List<A> getCheck_conditions_condition() {
		return (List<A>) _Check_conditions_condition;
	}

	/**
	 * Sets the value for check/conditions/condition.
	 * @param v Value to Set.
	 */
	public void setCheck_conditions_condition(ArrayList<org.nrg.xdat.bean.ValProtocoldataConditionBean> v){
		_Check_conditions_condition=v;
	}

	/**
	 * Adds the value for check/conditions/condition.
	 * @param v Value to Set.
	 */
	public void addCheck_conditions_condition(org.nrg.xdat.bean.ValProtocoldataConditionBean v){
		_Check_conditions_condition.add(v);
	}

	/**
	 * check/conditions/condition
	 * Adds org.nrg.xdat.model.ValProtocoldataConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataConditionI> void addCheck_conditions_condition(A item) throws Exception{
	_Check_conditions_condition.add((org.nrg.xdat.bean.ValProtocoldataConditionBean)item);
	}

	/**
	 * Adds the value for check/conditions/condition.
	 * @param v Value to Set.
	 */
	public void addCheck_conditions_condition(Object v){
		if (v instanceof org.nrg.xdat.bean.ValProtocoldataConditionBean)
			_Check_conditions_condition.add((org.nrg.xdat.bean.ValProtocoldataConditionBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValProtocoldataConditionBean");
	}
	 private List<org.nrg.xdat.bean.ValProtocoldataCommentBean> _Check_comments_comment =new ArrayList<org.nrg.xdat.bean.ValProtocoldataCommentBean>();

	/**
	 * check/comments/comment
	 * @return Returns an List of org.nrg.xdat.bean.ValProtocoldataCommentBean
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataCommentI> List<A> getCheck_comments_comment() {
		return (List<A>) _Check_comments_comment;
	}

	/**
	 * Sets the value for check/comments/comment.
	 * @param v Value to Set.
	 */
	public void setCheck_comments_comment(ArrayList<org.nrg.xdat.bean.ValProtocoldataCommentBean> v){
		_Check_comments_comment=v;
	}

	/**
	 * Adds the value for check/comments/comment.
	 * @param v Value to Set.
	 */
	public void addCheck_comments_comment(org.nrg.xdat.bean.ValProtocoldataCommentBean v){
		_Check_comments_comment.add(v);
	}

	/**
	 * check/comments/comment
	 * Adds org.nrg.xdat.model.ValProtocoldataCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataCommentI> void addCheck_comments_comment(A item) throws Exception{
	_Check_comments_comment.add((org.nrg.xdat.bean.ValProtocoldataCommentBean)item);
	}

	/**
	 * Adds the value for check/comments/comment.
	 * @param v Value to Set.
	 */
	public void addCheck_comments_comment(Object v){
		if (v instanceof org.nrg.xdat.bean.ValProtocoldataCommentBean)
			_Check_comments_comment.add((org.nrg.xdat.bean.ValProtocoldataCommentBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValProtocoldataCommentBean");
	}
	 private org.nrg.xdat.bean.ValAdditionalvalBean _Check_additionalval =null;

	/**
	 * check/additionalVal
	 * @return org.nrg.xdat.bean.ValAdditionalvalBean
	 */
	public org.nrg.xdat.bean.ValAdditionalvalBean getCheck_additionalval() {
		return _Check_additionalval;
	}

	/**
	 * Sets the value for check/additionalVal.
	 * @param v Value to Set.
	 */
	public void setCheck_additionalval(org.nrg.xdat.bean.ValAdditionalvalBean v){
		_Check_additionalval =v;
	}

	/**
	 * Sets the value for check/additionalVal.
	 * @param v Value to Set.
	 */
	public void setCheck_additionalval(Object v) {
		if (v instanceof org.nrg.xdat.bean.ValAdditionalvalBean)
			_Check_additionalval =(org.nrg.xdat.bean.ValAdditionalvalBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValAdditionalvalBean");
	}

	/**
	 * check/additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public <A extends org.nrg.xdat.model.ValAdditionalvalI> void setCheck_additionalval(A item) throws Exception{
	setCheck_additionalval((org.nrg.xdat.bean.ValAdditionalvalBean)item);
	}

	//FIELD

	private Integer _Check_additionalvalFK=null;

	/**
	 * @return Returns the val:protocolData/check_additionalval_val_additionalval_id.
	 */
	public Integer getCheck_additionalvalFK(){
		return _Check_additionalvalFK;
	}

	/**
	 * Sets the value for val:protocolData/check_additionalval_val_additionalval_id.
	 * @param v Value to Set.
	 */
	public void setCheck_additionalvalFK(Integer v) {
		_Check_additionalvalFK=v;
	}

	//FIELD

	private String _Check_status=null;

	/**
	 * @return Returns the check/status.
	 */
	public String getCheck_status(){
		return _Check_status;
	}

	/**
	 * Sets the value for check/status.
	 * @param v Value to Set.
	 */
	public void setCheck_status(String v){
		_Check_status=v;
	}
	 private List<org.nrg.xdat.bean.ValProtocoldataScanCheckBean> _Scans_scanCheck =new ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckBean>();

	/**
	 * scans/scan_check
	 * @return Returns an List of org.nrg.xdat.bean.ValProtocoldataScanCheckBean
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckI> List<A> getScans_scanCheck() {
		return (List<A>) _Scans_scanCheck;
	}

	/**
	 * Sets the value for scans/scan_check.
	 * @param v Value to Set.
	 */
	public void setScans_scanCheck(ArrayList<org.nrg.xdat.bean.ValProtocoldataScanCheckBean> v){
		_Scans_scanCheck=v;
	}

	/**
	 * Adds the value for scans/scan_check.
	 * @param v Value to Set.
	 */
	public void addScans_scanCheck(org.nrg.xdat.bean.ValProtocoldataScanCheckBean v){
		_Scans_scanCheck.add(v);
	}

	/**
	 * scans/scan_check
	 * Adds org.nrg.xdat.model.ValProtocoldataScanCheckI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckI> void addScans_scanCheck(A item) throws Exception{
	_Scans_scanCheck.add((org.nrg.xdat.bean.ValProtocoldataScanCheckBean)item);
	}

	/**
	 * Adds the value for scans/scan_check.
	 * @param v Value to Set.
	 */
	public void addScans_scanCheck(Object v){
		if (v instanceof org.nrg.xdat.bean.ValProtocoldataScanCheckBean)
			_Scans_scanCheck.add((org.nrg.xdat.bean.ValProtocoldataScanCheckBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ValProtocoldataScanCheckBean");
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("check/status")){
			setCheck_status(v);
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
		if (xmlPath.equals("check/conditions/condition")){
			addCheck_conditions_condition(v);
		}else if (xmlPath.equals("check/comments/comment")){
			addCheck_comments_comment(v);
		}else if (xmlPath.equals("check/additionalVal")){
			setCheck_additionalval(v);
		}else if (xmlPath.equals("scans/scan_check")){
			addScans_scanCheck(v);
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
		if (xmlPath.equals("check/status")){
			return getCheck_status();
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
		if (xmlPath.equals("check/conditions/condition")){
			return getCheck_conditions_condition();
		}else if (xmlPath.equals("check/comments/comment")){
			return getCheck_comments_comment();
		}else if (xmlPath.equals("check/additionalVal")){
			return getCheck_additionalval();
		}else if (xmlPath.equals("scans/scan_check")){
			return getScans_scanCheck();
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
		if (xmlPath.equals("check/conditions/condition")){
			return "http://nrg.wustl.edu/val:protocolData_condition";
		}else if (xmlPath.equals("check/comments/comment")){
			return "http://nrg.wustl.edu/val:protocolData_comment";
		}else if (xmlPath.equals("check/additionalVal")){
			return "http://nrg.wustl.edu/val:additionalVal";
		}else if (xmlPath.equals("scans/scan_check")){
			return "http://nrg.wustl.edu/val:protocolData_scan_check";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("check/conditions/condition")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("check/comments/comment")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("check/additionalVal")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("check/status")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("scans/scan_check")){
			return BaseElement.field_multi_reference;
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
		all_fields.add("check/conditions/condition");
		all_fields.add("check/comments/comment");
		all_fields.add("check/additionalVal");
		all_fields.add("check/status");
		all_fields.add("scans/scan_check");
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
		writer.write("\n<val:ProtocolVal");
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
		writer.write("\n</val:ProtocolVal>");
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
		//REFERENCE FROM protocolData -> imageAssessorData
		TreeMap CheckATTMap = new TreeMap();
		String CheckATT = new String();
		if (_Check_status!=null)
			CheckATTMap.put("status",ValueParser(_Check_status,"string"));
		else CheckATTMap.put("status",ValueParser(_Check_status,"string"));//REQUIRED FIELD

		java.util.Iterator iter0 =CheckATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			CheckATT +=" " + key + "=\"" + CheckATTMap.get(key) + "\"";
		}
			int child1=0;
			int att1=0;
			child1+=_Check_comments_comment.size();
			if(_Check_additionalval!=null)
			child1++;
			child1+=_Check_conditions_condition.size();
			if(_Check_status!=null)
			att1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<val:check");
				writer.write(CheckATT);
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
			int child2=0;
			int att2=0;
			child2+=_Check_conditions_condition.size();
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<val:conditions");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM protocolData -> check/conditions/condition
		java.util.Iterator iter3=_Check_conditions_condition.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.ValProtocoldataConditionBean child = (org.nrg.xdat.bean.ValProtocoldataConditionBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<val:condition");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("val:protocolData_condition")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
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

			int child4=0;
			int att4=0;
			child4+=_Check_comments_comment.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<val:comments");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM protocolData -> check/comments/comment
		java.util.Iterator iter5=_Check_comments_comment.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.ValProtocoldataCommentBean child = (org.nrg.xdat.bean.ValProtocoldataCommentBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<val:comment");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("val:protocolData_comment")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
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

		//REFERENCE FROM protocolData -> check/additionalVal
		//DATA-FIELD FROM protocolData -> check/additionalVal
		if (_Check_additionalval!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<val:additionalVal");
			_Check_additionalval.addXMLAtts(writer);
			if(!_Check_additionalval.getFullSchemaElementName().equals("val:additionalVal")){
				writer.write(" xsi:type=\"" + _Check_additionalval.getFullSchemaElementName() + "\"");
			}
			if (_Check_additionalval.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =_Check_additionalval.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</val:additionalVal>");
				}else{
					writer.write("</val:additionalVal>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

				writer.write("\n" + createHeader(--header) + "</val:check>");
			}
			}

			int child6=0;
			int att6=0;
			child6+=_Scans_scanCheck.size();
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<val:scans");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM protocolData -> scans/scan_check
		java.util.Iterator iter7=_Scans_scanCheck.iterator();
		while(iter7.hasNext()){
			org.nrg.xdat.bean.ValProtocoldataScanCheckBean child = (org.nrg.xdat.bean.ValProtocoldataScanCheckBean)iter7.next();
			writer.write("\n" + createHeader(header++) + "<val:scan_check");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("val:protocolData_scan_check")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =child.addXMLBody(writer,header);
				if(return8){
					writer.write("\n" + createHeader(--header) + "</val:scan_check>");
				}else{
					writer.write("</val:scan_check>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</val:scans>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Check_status!=null)
			return true;
		return true;//REQUIRED check/status
	}
}
