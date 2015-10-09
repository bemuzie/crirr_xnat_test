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
public class WrkXnatexecutionenvironmentBean extends WrkAbstractexecutionenvironmentBean implements java.io.Serializable, org.nrg.xdat.model.WrkXnatexecutionenvironmentI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(WrkXnatexecutionenvironmentBean.class);
	public static String SCHEMA_ELEMENT_NAME="wrk:xnatExecutionEnvironment";

	public String getSchemaElementName(){
		return "xnatExecutionEnvironment";
	}

	public String getFullSchemaElementName(){
		return "wrk:xnatExecutionEnvironment";
	}

	//FIELD

	private String _Pipeline=null;

	/**
	 * @return Returns the pipeline.
	 */
	public String getPipeline(){
		return _Pipeline;
	}

	/**
	 * Sets the value for pipeline.
	 * @param v Value to Set.
	 */
	public void setPipeline(String v){
		_Pipeline=v;
	}

	//FIELD

	private String _Xnatuser=null;

	/**
	 * @return Returns the xnatuser.
	 */
	public String getXnatuser(){
		return _Xnatuser;
	}

	/**
	 * Sets the value for xnatuser.
	 * @param v Value to Set.
	 */
	public void setXnatuser(String v){
		_Xnatuser=v;
	}

	//FIELD

	private String _Host=null;

	/**
	 * @return Returns the host.
	 */
	public String getHost(){
		return _Host;
	}

	/**
	 * Sets the value for host.
	 * @param v Value to Set.
	 */
	public void setHost(String v){
		_Host=v;
	}

	//FIELD

	private String _Startat=null;

	/**
	 * @return Returns the startAt.
	 */
	public String getStartat(){
		return _Startat;
	}

	/**
	 * Sets the value for startAt.
	 * @param v Value to Set.
	 */
	public void setStartat(String v){
		_Startat=v;
	}
	 private List<org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean> _Parameters_parameter =new ArrayList<org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean>();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI> List<A> getParameters_parameter() {
		return (List<A>) _Parameters_parameter;
	}

	/**
	 * Sets the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void setParameters_parameter(ArrayList<org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean> v){
		_Parameters_parameter=v;
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean v){
		_Parameters_parameter.add(v);
	}

	/**
	 * parameters/parameter
	 * Adds org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI> void addParameters_parameter(A item) throws Exception{
	_Parameters_parameter.add((org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean)item);
	}

	/**
	 * Adds the value for parameters/parameter.
	 * @param v Value to Set.
	 */
	public void addParameters_parameter(Object v){
		if (v instanceof org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean)
			_Parameters_parameter.add((org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean");
	}
	 private List<org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean> _Notify =new ArrayList<org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean>();

	/**
	 * notify
	 * @return Returns an List of org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI> List<A> getNotify() {
		return (List<A>) _Notify;
	}

	/**
	 * Sets the value for notify.
	 * @param v Value to Set.
	 */
	public void setNotify(ArrayList<org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean> v){
		_Notify=v;
	}

	/**
	 * Adds the value for notify.
	 * @param v Value to Set.
	 */
	public void addNotify(org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean v){
		_Notify.add(v);
	}

	/**
	 * notify
	 * Adds org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI> void addNotify(A item) throws Exception{
	_Notify.add((org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean)item);
	}

	/**
	 * Adds the value for notify.
	 * @param v Value to Set.
	 */
	public void addNotify(Object v){
		if (v instanceof org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean)
			_Notify.add((org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean");
	}

	//FIELD

	private String _Datatype=null;

	/**
	 * @return Returns the dataType.
	 */
	public String getDatatype(){
		return _Datatype;
	}

	/**
	 * Sets the value for dataType.
	 * @param v Value to Set.
	 */
	public void setDatatype(String v){
		_Datatype=v;
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the id.
	 */
	public String getId(){
		return _Id;
	}

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		_Id=v;
	}

	//FIELD

	private Boolean _Supressnotification=null;

	/**
	 * @return Returns the supressNotification.
	 */
	public Boolean getSupressnotification() {
		return _Supressnotification;
	}

	/**
	 * Sets the value for supressNotification.
	 * @param v Value to Set.
	 */
	public void setSupressnotification(Object v){
		if(v instanceof Boolean){
			_Supressnotification=(Boolean)v;
		}else if(v instanceof String){
			_Supressnotification=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private String _Log=null;

	/**
	 * @return Returns the log.
	 */
	public String getLog(){
		return _Log;
	}

	/**
	 * Sets the value for log.
	 * @param v Value to Set.
	 */
	public void setLog(String v){
		_Log=v;
	}

	//FIELD

	private String _Catalogpath=null;

	/**
	 * @return Returns the catalogPath.
	 */
	public String getCatalogpath(){
		return _Catalogpath;
	}

	/**
	 * Sets the value for catalogPath.
	 * @param v Value to Set.
	 */
	public void setCatalogpath(String v){
		_Catalogpath=v;
	}

	//FIELD

	private String _Parameterfile_xml=null;

	/**
	 * @return Returns the parameterFile/xml.
	 */
	public String getParameterfile_xml(){
		return _Parameterfile_xml;
	}

	/**
	 * Sets the value for parameterFile/xml.
	 * @param v Value to Set.
	 */
	public void setParameterfile_xml(String v){
		_Parameterfile_xml=v;
	}

	//FIELD

	private String _Parameterfile_path=null;

	/**
	 * @return Returns the parameterFile/path.
	 */
	public String getParameterfile_path(){
		return _Parameterfile_path;
	}

	/**
	 * Sets the value for parameterFile/path.
	 * @param v Value to Set.
	 */
	public void setParameterfile_path(String v){
		_Parameterfile_path=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("pipeline")){
			setPipeline(v);
		}else if (xmlPath.equals("xnatuser")){
			setXnatuser(v);
		}else if (xmlPath.equals("host")){
			setHost(v);
		}else if (xmlPath.equals("startAt")){
			setStartat(v);
		}else if (xmlPath.equals("dataType")){
			setDatatype(v);
		}else if (xmlPath.equals("id")){
			setId(v);
		}else if (xmlPath.equals("supressNotification")){
			setSupressnotification(v);
		}else if (xmlPath.equals("log")){
			setLog(v);
		}else if (xmlPath.equals("catalogPath")){
			setCatalogpath(v);
		}else if (xmlPath.equals("parameterFile/xml")){
			setParameterfile_xml(v);
		}else if (xmlPath.equals("parameterFile/path")){
			setParameterfile_path(v);
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
		if (xmlPath.equals("parameters/parameter")){
			addParameters_parameter(v);
		}else if (xmlPath.equals("notify")){
			addNotify(v);
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
		if (xmlPath.equals("pipeline")){
			return getPipeline();
		}else if (xmlPath.equals("xnatuser")){
			return getXnatuser();
		}else if (xmlPath.equals("host")){
			return getHost();
		}else if (xmlPath.equals("startAt")){
			return getStartat();
		}else if (xmlPath.equals("dataType")){
			return getDatatype();
		}else if (xmlPath.equals("id")){
			return getId();
		}else if (xmlPath.equals("supressNotification")){
			return getSupressnotification();
		}else if (xmlPath.equals("log")){
			return getLog();
		}else if (xmlPath.equals("catalogPath")){
			return getCatalogpath();
		}else if (xmlPath.equals("parameterFile/xml")){
			return getParameterfile_xml();
		}else if (xmlPath.equals("parameterFile/path")){
			return getParameterfile_path();
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
		if (xmlPath.equals("parameters/parameter")){
			return getParameters_parameter();
		}else if (xmlPath.equals("notify")){
			return getNotify();
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
		if (xmlPath.equals("parameters/parameter")){
			return "http://nrg.wustl.edu/workflow:xnatExecutionEnvironment_parameter";
		}else if (xmlPath.equals("notify")){
			return "http://nrg.wustl.edu/workflow:xnatExecutionEnvironment_notify";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("pipeline")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("xnatuser")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("host")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("startAt")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/parameter")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("notify")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("dataType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("id")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("supressNotification")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("log")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("catalogPath")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameterFile/xml")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("parameterFile/path")){
			return BaseElement.field_LONG_DATA;
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
		all_fields.add("pipeline");
		all_fields.add("xnatuser");
		all_fields.add("host");
		all_fields.add("startAt");
		all_fields.add("parameters/parameter");
		all_fields.add("notify");
		all_fields.add("dataType");
		all_fields.add("id");
		all_fields.add("supressNotification");
		all_fields.add("log");
		all_fields.add("catalogPath");
		all_fields.add("parameterFile/xml");
		all_fields.add("parameterFile/path");
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
		writer.write("\n<wrk:xnatExecutionEnvironment");
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
		writer.write("\n</wrk:xnatExecutionEnvironment>");
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
		//REFERENCE FROM xnatExecutionEnvironment -> abstractExecutionEnvironment
		if (_Pipeline!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:pipeline");
			writer.write(">");
			writer.write(ValueParser(_Pipeline,"string"));
			writer.write("</wrk:pipeline>");
			header--;
		}
		if (_Xnatuser!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:xnatuser");
			writer.write(">");
			writer.write(ValueParser(_Xnatuser,"string"));
			writer.write("</wrk:xnatuser>");
			header--;
		}
		if (_Host!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:host");
			writer.write(">");
			writer.write(ValueParser(_Host,"string"));
			writer.write("</wrk:host>");
			header--;
		}
		if (_Startat!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:startAt");
			writer.write(">");
			writer.write(ValueParser(_Startat,"string"));
			writer.write("</wrk:startAt>");
			header--;
		}
			int child0=0;
			int att0=0;
			child0+=_Parameters_parameter.size();
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<wrk:parameters");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM xnatExecutionEnvironment -> parameters/parameter
		java.util.Iterator iter1=_Parameters_parameter.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean child = (org.nrg.xdat.bean.WrkXnatexecutionenvironmentParameterBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<wrk:parameter");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("wrk:xnatExecutionEnvironment_parameter")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</wrk:parameter>");
				}else{
					writer.write("</wrk:parameter>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</wrk:parameters>");
			}
			}

		//REFERENCE FROM xnatExecutionEnvironment -> notify
		//IN-LINE REPEATER
		java.util.Iterator iter2=_Notify.iterator();
		while(iter2.hasNext()){
			org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean child = (org.nrg.xdat.bean.WrkXnatexecutionenvironmentNotifyBean)iter2.next();
			child.addXMLBody(writer,header);
		}
		if (_Datatype!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:dataType");
			writer.write(">");
			writer.write(ValueParser(_Datatype,"string"));
			writer.write("</wrk:dataType>");
			header--;
		}
		if (_Id!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:id");
			writer.write(">");
			writer.write(ValueParser(_Id,"string"));
			writer.write("</wrk:id>");
			header--;
		}
		if (_Supressnotification!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:supressNotification");
			writer.write(">");
			writer.write(ValueParser(_Supressnotification,"boolean"));
			writer.write("</wrk:supressNotification>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<wrk:supressNotification");
			writer.write("/>");
			header--;
		}

		if (_Log!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:log");
			writer.write(">");
			writer.write(ValueParser(_Log,"string"));
			writer.write("</wrk:log>");
			header--;
		}
		if (_Catalogpath!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:catalogPath");
			writer.write(">");
			writer.write(ValueParser(_Catalogpath,"string"));
			writer.write("</wrk:catalogPath>");
			header--;
		}
		TreeMap ParameterfileATTMap = new TreeMap();
		String ParameterfileATT = new String();
		if (_Parameterfile_path!=null)
			ParameterfileATTMap.put("path",ValueParser(_Parameterfile_path,"string"));
		java.util.Iterator iter3 =ParameterfileATTMap.keySet().iterator();
		while(iter3.hasNext()){
			String key = (String)iter3.next();
			ParameterfileATT +=" " + key + "=\"" + ParameterfileATTMap.get(key) + "\"";
		}
			int child4=0;
			int att4=0;
			if(_Parameterfile_path!=null)
			att4++;
			if(_Parameterfile_xml!=null)
			child4++;
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<wrk:parameterFile");
				writer.write(ParameterfileATT);
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Parameterfile_xml!=null){
			writer.write("\n" + createHeader(header++) + "<wrk:xml");
			writer.write(">");
			writer.write(ValueParser(_Parameterfile_xml,"string"));
			writer.write("</wrk:xml>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</wrk:parameterFile>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Pipeline!=null) return true;
		if (_Xnatuser!=null) return true;
		if (_Host!=null) return true;
		if (_Startat!=null) return true;
			if(_Parameters_parameter.size()>0)return true;
		if(_Notify.size()>0) return true;
		if (_Datatype!=null) return true;
		if (_Id!=null) return true;
		if (_Supressnotification!=null) return true;
		return true;//REQUIRED supressNotification
	}
}
