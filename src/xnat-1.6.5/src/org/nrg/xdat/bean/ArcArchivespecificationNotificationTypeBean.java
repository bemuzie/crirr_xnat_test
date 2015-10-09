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
public class ArcArchivespecificationNotificationTypeBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ArcArchivespecificationNotificationTypeI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ArcArchivespecificationNotificationTypeBean.class);
	public static String SCHEMA_ELEMENT_NAME="arc:ArchiveSpecification_notification_type";

	public String getSchemaElementName(){
		return "ArchiveSpecification_notification_type";
	}

	public String getFullSchemaElementName(){
		return "arc:ArchiveSpecification_notification_type";
	}

	//FIELD

	private String _NotificationType=null;

	/**
	 * @return Returns the notification_type.
	 */
	public String getNotificationType(){
		return _NotificationType;
	}

	/**
	 * Sets the value for notification_type.
	 * @param v Value to Set.
	 */
	public void setNotificationType(String v){
		_NotificationType=v;
	}

	//FIELD

	private String _EmailAddresses=null;

	/**
	 * @return Returns the email_addresses.
	 */
	public String getEmailAddresses(){
		return _EmailAddresses;
	}

	/**
	 * Sets the value for email_addresses.
	 * @param v Value to Set.
	 */
	public void setEmailAddresses(String v){
		_EmailAddresses=v;
	}

	//FIELD

	private Integer _ArcArchivespecificationNotificationTypeId=null;

	/**
	 * @return Returns the arc_ArchiveSpecification_notification_type_id.
	 */
	public Integer getArcArchivespecificationNotificationTypeId() {
		return _ArcArchivespecificationNotificationTypeId;
	}

	/**
	 * Sets the value for arc_ArchiveSpecification_notification_type_id.
	 * @param v Value to Set.
	 */
	public void setArcArchivespecificationNotificationTypeId(Integer v){
		_ArcArchivespecificationNotificationTypeId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("notification_type")){
			setNotificationType(v);
		}else if (xmlPath.equals("email_addresses")){
			setEmailAddresses(v);
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
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("notification_type")){
			return getNotificationType();
		}else if (xmlPath.equals("email_addresses")){
			return getEmailAddresses();
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
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("notification_type")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("email_addresses")){
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
		all_fields.add("notification_type");
		all_fields.add("email_addresses");
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
		writer.write("\n<arc:ArchiveSpecification_notification_type");
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
		writer.write("\n</arc:ArchiveSpecification_notification_type>");
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
		if (_EmailAddresses!=null)
			map.put("email_addresses",ValueParser(_EmailAddresses,"string"));
		//NOT REQUIRED FIELD

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_NotificationType!=null){
			writer.write(ValueParser(_NotificationType,"string"));
			header--;
		}
	return false;
	}


	protected boolean hasXMLBodyContent(){
		if (_NotificationType!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
