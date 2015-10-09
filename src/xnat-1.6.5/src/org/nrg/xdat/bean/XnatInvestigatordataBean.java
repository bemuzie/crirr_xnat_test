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
public class XnatInvestigatordataBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.XnatInvestigatordataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatInvestigatordataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:investigatorData";

	public String getSchemaElementName(){
		return "investigatorData";
	}

	public String getFullSchemaElementName(){
		return "xnat:investigatorData";
	}

	//FIELD

	private String _Title=null;

	/**
	 * @return Returns the title.
	 */
	public String getTitle(){
		return _Title;
	}

	/**
	 * Sets the value for title.
	 * @param v Value to Set.
	 */
	public void setTitle(String v){
		_Title=v;
	}

	//FIELD

	private String _Firstname=null;

	/**
	 * @return Returns the firstname.
	 */
	public String getFirstname(){
		return _Firstname;
	}

	/**
	 * Sets the value for firstname.
	 * @param v Value to Set.
	 */
	public void setFirstname(String v){
		_Firstname=v;
	}

	//FIELD

	private String _Lastname=null;

	/**
	 * @return Returns the lastname.
	 */
	public String getLastname(){
		return _Lastname;
	}

	/**
	 * Sets the value for lastname.
	 * @param v Value to Set.
	 */
	public void setLastname(String v){
		_Lastname=v;
	}

	//FIELD

	private String _Institution=null;

	/**
	 * @return Returns the institution.
	 */
	public String getInstitution(){
		return _Institution;
	}

	/**
	 * Sets the value for institution.
	 * @param v Value to Set.
	 */
	public void setInstitution(String v){
		_Institution=v;
	}

	//FIELD

	private String _Department=null;

	/**
	 * @return Returns the department.
	 */
	public String getDepartment(){
		return _Department;
	}

	/**
	 * Sets the value for department.
	 * @param v Value to Set.
	 */
	public void setDepartment(String v){
		_Department=v;
	}

	//FIELD

	private String _Email=null;

	/**
	 * @return Returns the email.
	 */
	public String getEmail(){
		return _Email;
	}

	/**
	 * Sets the value for email.
	 * @param v Value to Set.
	 */
	public void setEmail(String v){
		_Email=v;
	}

	//FIELD

	private String _Phone=null;

	/**
	 * @return Returns the phone.
	 */
	public String getPhone(){
		return _Phone;
	}

	/**
	 * Sets the value for phone.
	 * @param v Value to Set.
	 */
	public void setPhone(String v){
		_Phone=v;
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

	private Integer _XnatInvestigatordataId=null;

	/**
	 * @return Returns the xnat_investigatorData_id.
	 */
	public Integer getXnatInvestigatordataId() {
		return _XnatInvestigatordataId;
	}

	/**
	 * Sets the value for xnat_investigatorData_id.
	 * @param v Value to Set.
	 */
	public void setXnatInvestigatordataId(Integer v){
		_XnatInvestigatordataId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("title")){
			setTitle(v);
		}else if (xmlPath.equals("firstname")){
			setFirstname(v);
		}else if (xmlPath.equals("lastname")){
			setLastname(v);
		}else if (xmlPath.equals("institution")){
			setInstitution(v);
		}else if (xmlPath.equals("department")){
			setDepartment(v);
		}else if (xmlPath.equals("email")){
			setEmail(v);
		}else if (xmlPath.equals("phone")){
			setPhone(v);
		}else if (xmlPath.equals("ID")){
			setId(v);
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
		if (xmlPath.equals("title")){
			return getTitle();
		}else if (xmlPath.equals("firstname")){
			return getFirstname();
		}else if (xmlPath.equals("lastname")){
			return getLastname();
		}else if (xmlPath.equals("institution")){
			return getInstitution();
		}else if (xmlPath.equals("department")){
			return getDepartment();
		}else if (xmlPath.equals("email")){
			return getEmail();
		}else if (xmlPath.equals("phone")){
			return getPhone();
		}else if (xmlPath.equals("ID")){
			return getId();
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
		if (xmlPath.equals("title")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("firstname")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("lastname")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("institution")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("department")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("email")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("phone")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ID")){
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
		all_fields.add("title");
		all_fields.add("firstname");
		all_fields.add("lastname");
		all_fields.add("institution");
		all_fields.add("department");
		all_fields.add("email");
		all_fields.add("phone");
		all_fields.add("ID");
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
		writer.write("\n<xnat:Investigator");
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
		writer.write("\n</xnat:Investigator>");
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

		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		if (_Title!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:title");
			writer.write(">");
			writer.write(ValueParser(_Title,"string"));
			writer.write("</xnat:title>");
			header--;
		}
		if (_Firstname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:firstname");
			writer.write(">");
			writer.write(ValueParser(_Firstname,"string"));
			writer.write("</xnat:firstname>");
			header--;
		}
		if (_Lastname!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:lastname");
			writer.write(">");
			writer.write(ValueParser(_Lastname,"string"));
			writer.write("</xnat:lastname>");
			header--;
		}
		if (_Institution!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:institution");
			writer.write(">");
			writer.write(ValueParser(_Institution,"string"));
			writer.write("</xnat:institution>");
			header--;
		}
		if (_Department!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:department");
			writer.write(">");
			writer.write(ValueParser(_Department,"string"));
			writer.write("</xnat:department>");
			header--;
		}
		if (_Email!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:email");
			writer.write(">");
			writer.write(ValueParser(_Email,"string"));
			writer.write("</xnat:email>");
			header--;
		}
		if (_Phone!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:phone");
			writer.write(">");
			writer.write(ValueParser(_Phone,"string"));
			writer.write("</xnat:phone>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Title!=null) return true;
		if (_Firstname!=null) return true;
		if (_Lastname!=null) return true;
		if (_Institution!=null) return true;
		if (_Department!=null) return true;
		if (_Email!=null) return true;
		if (_Phone!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
