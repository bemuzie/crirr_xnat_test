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
public class ProvProcessstepBean extends BaseElement implements java.io.Serializable, org.nrg.xdat.model.ProvProcessstepI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ProvProcessstepBean.class);
	public static String SCHEMA_ELEMENT_NAME="prov:processStep";

	public String getSchemaElementName(){
		return "processStep";
	}

	public String getFullSchemaElementName(){
		return "prov:processStep";
	}

	//FIELD

	private String _Program=null;

	/**
	 * @return Returns the program.
	 */
	public String getProgram(){
		return _Program;
	}

	/**
	 * Sets the value for program.
	 * @param v Value to Set.
	 */
	public void setProgram(String v){
		_Program=v;
	}

	//FIELD

	private String _Program_version=null;

	/**
	 * @return Returns the program/version.
	 */
	public String getProgram_version(){
		return _Program_version;
	}

	/**
	 * Sets the value for program/version.
	 * @param v Value to Set.
	 */
	public void setProgram_version(String v){
		_Program_version=v;
	}

	//FIELD

	private String _Program_arguments=null;

	/**
	 * @return Returns the program/arguments.
	 */
	public String getProgram_arguments(){
		return _Program_arguments;
	}

	/**
	 * Sets the value for program/arguments.
	 * @param v Value to Set.
	 */
	public void setProgram_arguments(String v){
		_Program_arguments=v;
	}

	//FIELD

	private Date _Timestamp=null;

	/**
	 * @return Returns the timestamp.
	 */
	public Date getTimestamp(){
		return _Timestamp;
	}

	/**
	 * Sets the value for timestamp.
	 * @param v Value to Set.
	 */
	public void setTimestamp(Date v){
		_Timestamp=v;
	}

	/**
	 * Sets the value for timestamp.
	 * @param v Value to Set.
	 */
	public void setTimestamp(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for timestamp.
	 * @param v Value to Set.
	 */
	public void setTimestamp(String v)  {
		_Timestamp=formatDateTime(v);
	}

	//FIELD

	private String _Cvs=null;

	/**
	 * @return Returns the cvs.
	 */
	public String getCvs(){
		return _Cvs;
	}

	/**
	 * Sets the value for cvs.
	 * @param v Value to Set.
	 */
	public void setCvs(String v){
		_Cvs=v;
	}

	//FIELD

	private String _userProperty=null;

	/**
	 * @return Returns the user.
	 */
	public String getuserProperty(){
		return _userProperty;
	}

	/**
	 * Sets the value for user.
	 * @param v Value to Set.
	 */
	public void setuserProperty(String v){
		_userProperty=v;
	}

	//FIELD

	private String _Machine=null;

	/**
	 * @return Returns the machine.
	 */
	public String getMachine(){
		return _Machine;
	}

	/**
	 * Sets the value for machine.
	 * @param v Value to Set.
	 */
	public void setMachine(String v){
		_Machine=v;
	}

	//FIELD

	private String _Platform=null;

	/**
	 * @return Returns the platform.
	 */
	public String getPlatform(){
		return _Platform;
	}

	/**
	 * Sets the value for platform.
	 * @param v Value to Set.
	 */
	public void setPlatform(String v){
		_Platform=v;
	}

	//FIELD

	private String _Platform_version=null;

	/**
	 * @return Returns the platform/version.
	 */
	public String getPlatform_version(){
		return _Platform_version;
	}

	/**
	 * Sets the value for platform/version.
	 * @param v Value to Set.
	 */
	public void setPlatform_version(String v){
		_Platform_version=v;
	}

	//FIELD

	private String _Compiler=null;

	/**
	 * @return Returns the compiler.
	 */
	public String getCompiler(){
		return _Compiler;
	}

	/**
	 * Sets the value for compiler.
	 * @param v Value to Set.
	 */
	public void setCompiler(String v){
		_Compiler=v;
	}

	//FIELD

	private String _Compiler_version=null;

	/**
	 * @return Returns the compiler/version.
	 */
	public String getCompiler_version(){
		return _Compiler_version;
	}

	/**
	 * Sets the value for compiler/version.
	 * @param v Value to Set.
	 */
	public void setCompiler_version(String v){
		_Compiler_version=v;
	}
	 private List<org.nrg.xdat.bean.ProvProcessstepLibraryBean> _Library =new ArrayList<org.nrg.xdat.bean.ProvProcessstepLibraryBean>();

	/**
	 * library
	 * @return Returns an List of org.nrg.xdat.bean.ProvProcessstepLibraryBean
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepLibraryI> List<A> getLibrary() {
		return (List<A>) _Library;
	}

	/**
	 * Sets the value for library.
	 * @param v Value to Set.
	 */
	public void setLibrary(ArrayList<org.nrg.xdat.bean.ProvProcessstepLibraryBean> v){
		_Library=v;
	}

	/**
	 * Adds the value for library.
	 * @param v Value to Set.
	 */
	public void addLibrary(org.nrg.xdat.bean.ProvProcessstepLibraryBean v){
		_Library.add(v);
	}

	/**
	 * library
	 * Adds org.nrg.xdat.model.ProvProcessstepLibraryI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepLibraryI> void addLibrary(A item) throws Exception{
	_Library.add((org.nrg.xdat.bean.ProvProcessstepLibraryBean)item);
	}

	/**
	 * Adds the value for library.
	 * @param v Value to Set.
	 */
	public void addLibrary(Object v){
		if (v instanceof org.nrg.xdat.bean.ProvProcessstepLibraryBean)
			_Library.add((org.nrg.xdat.bean.ProvProcessstepLibraryBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ProvProcessstepLibraryBean");
	}

	//FIELD

	private Integer _ProvProcessstepId=null;

	/**
	 * @return Returns the prov_processStep_id.
	 */
	public Integer getProvProcessstepId() {
		return _ProvProcessstepId;
	}

	/**
	 * Sets the value for prov_processStep_id.
	 * @param v Value to Set.
	 */
	public void setProvProcessstepId(Integer v){
		_ProvProcessstepId=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("program")){
			setProgram(v);
		}else if (xmlPath.equals("program/version")){
			setProgram_version(v);
		}else if (xmlPath.equals("program/arguments")){
			setProgram_arguments(v);
		}else if (xmlPath.equals("timestamp")){
			setTimestamp(v);
		}else if (xmlPath.equals("cvs")){
			setCvs(v);
		}else if (xmlPath.equals("user")){
			setuserProperty(v);
		}else if (xmlPath.equals("machine")){
			setMachine(v);
		}else if (xmlPath.equals("platform")){
			setPlatform(v);
		}else if (xmlPath.equals("platform/version")){
			setPlatform_version(v);
		}else if (xmlPath.equals("compiler")){
			setCompiler(v);
		}else if (xmlPath.equals("compiler/version")){
			setCompiler_version(v);
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
		if (xmlPath.equals("library")){
			addLibrary(v);
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
		if (xmlPath.equals("program")){
			return getProgram();
		}else if (xmlPath.equals("program/version")){
			return getProgram_version();
		}else if (xmlPath.equals("program/arguments")){
			return getProgram_arguments();
		}else if (xmlPath.equals("timestamp")){
			return getTimestamp();
		}else if (xmlPath.equals("cvs")){
			return getCvs();
		}else if (xmlPath.equals("user")){
			return getuserProperty();
		}else if (xmlPath.equals("machine")){
			return getMachine();
		}else if (xmlPath.equals("platform")){
			return getPlatform();
		}else if (xmlPath.equals("platform/version")){
			return getPlatform_version();
		}else if (xmlPath.equals("compiler")){
			return getCompiler();
		}else if (xmlPath.equals("compiler/version")){
			return getCompiler_version();
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
		if (xmlPath.equals("library")){
			return getLibrary();
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
		if (xmlPath.equals("library")){
			return "http://www.nbirn.net/prov:processStep_library";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("program")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("program/version")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("program/arguments")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("timestamp")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("cvs")){
			return BaseElement.field_LONG_DATA;
		}else if (xmlPath.equals("user")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("machine")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("platform")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("platform/version")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("compiler")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("compiler/version")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("library")){
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
		all_fields.add("program");
		all_fields.add("program/version");
		all_fields.add("program/arguments");
		all_fields.add("timestamp");
		all_fields.add("cvs");
		all_fields.add("user");
		all_fields.add("machine");
		all_fields.add("platform");
		all_fields.add("platform/version");
		all_fields.add("compiler");
		all_fields.add("compiler/version");
		all_fields.add("library");
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
		writer.write("\n<prov:processStep");
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
		writer.write("\n</prov:processStep>");
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
		TreeMap ProgramATTMap = new TreeMap();
		String ProgramATT = new String();
		if (_Program_version!=null)
			ProgramATTMap.put("version",ValueParser(_Program_version,"string"));
		if (_Program_arguments!=null)
			ProgramATTMap.put("arguments",ValueParser(_Program_arguments,"string"));
		java.util.Iterator iter0 =ProgramATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			ProgramATT +=" " + key + "=\"" + ProgramATTMap.get(key) + "\"";
		}
		if (_Program!=null){
			writer.write("\n" + createHeader(header++) + "<prov:program");
			writer.write(ProgramATT);
			writer.write(">");
			writer.write(ValueParser(_Program,"string"));
			writer.write("</prov:program>");
			header--;
		}
		else if(!ProgramATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<prov:program");
			writer.write(ProgramATT);
			writer.write("/>");
			header--;
		}

		if (_Timestamp!=null){
			writer.write("\n" + createHeader(header++) + "<prov:timestamp");
			writer.write(">");
			writer.write(ValueParser(_Timestamp,"dateTime"));
			writer.write("</prov:timestamp>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<prov:timestamp");
			writer.write("/>");
			header--;
		}

		if (_Cvs!=null){
			writer.write("\n" + createHeader(header++) + "<prov:cvs");
			writer.write(">");
			writer.write(ValueParser(_Cvs,"string"));
			writer.write("</prov:cvs>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<prov:cvs");
			writer.write("/>");
			header--;
		}

		if (_userProperty!=null){
			writer.write("\n" + createHeader(header++) + "<prov:user");
			writer.write(">");
			writer.write(ValueParser(_userProperty,"string"));
			writer.write("</prov:user>");
			header--;
		}
		if (_Machine!=null){
			writer.write("\n" + createHeader(header++) + "<prov:machine");
			writer.write(">");
			writer.write(ValueParser(_Machine,"string"));
			writer.write("</prov:machine>");
			header--;
		}
		TreeMap PlatformATTMap = new TreeMap();
		String PlatformATT = new String();
		if (_Platform_version!=null)
			PlatformATTMap.put("version",ValueParser(_Platform_version,"string"));
		java.util.Iterator iter1 =PlatformATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			PlatformATT +=" " + key + "=\"" + PlatformATTMap.get(key) + "\"";
		}
		if (_Platform!=null){
			writer.write("\n" + createHeader(header++) + "<prov:platform");
			writer.write(PlatformATT);
			writer.write(">");
			writer.write(ValueParser(_Platform,"string"));
			writer.write("</prov:platform>");
			header--;
		}
		else if(!PlatformATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<prov:platform");
			writer.write(PlatformATT);
			writer.write("/>");
			header--;
		}

		TreeMap CompilerATTMap = new TreeMap();
		String CompilerATT = new String();
		if (_Compiler_version!=null)
			CompilerATTMap.put("version",ValueParser(_Compiler_version,"string"));
		java.util.Iterator iter2 =CompilerATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			CompilerATT +=" " + key + "=\"" + CompilerATTMap.get(key) + "\"";
		}
		if (_Compiler!=null){
			writer.write("\n" + createHeader(header++) + "<prov:compiler");
			writer.write(CompilerATT);
			writer.write(">");
			writer.write(ValueParser(_Compiler,"string"));
			writer.write("</prov:compiler>");
			header--;
		}
		else if(!CompilerATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<prov:compiler");
			writer.write(CompilerATT);
			writer.write("/>");
			header--;
		}

		//REFERENCE FROM processStep -> library
		java.util.Iterator iter3=_Library.iterator();
		while(iter3.hasNext()){
			org.nrg.xdat.bean.ProvProcessstepLibraryBean child = (org.nrg.xdat.bean.ProvProcessstepLibraryBean)iter3.next();
			writer.write("\n" + createHeader(header++) + "<prov:library");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("prov:processStep_library")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return4 =child.addXMLBody(writer,header);
				if(return4){
					writer.write("\n" + createHeader(--header) + "</prov:library>");
				}else{
					writer.write("</prov:library>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Program_version!=null)
			return true;
		if (_Program_arguments!=null)
			return true;
		if (_Program!=null) return true;
		if (_Timestamp!=null) return true;
		return true;//REQUIRED timestamp
	}
}
