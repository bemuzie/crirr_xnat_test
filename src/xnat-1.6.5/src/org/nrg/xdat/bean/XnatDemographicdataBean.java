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
public class XnatDemographicdataBean extends XnatAbstractdemographicdataBean implements java.io.Serializable, org.nrg.xdat.model.XnatDemographicdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatDemographicdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:demographicData";

	public String getSchemaElementName(){
		return "demographicData";
	}

	public String getFullSchemaElementName(){
		return "xnat:demographicData";
	}

	//FIELD

	private Date _Dob=null;

	/**
	 * @return Returns the dob.
	 */
	public Date getDob(){
		return _Dob;
	}

	/**
	 * Sets the value for dob.
	 * @param v Value to Set.
	 */
	public void setDob(Date v){
		_Dob=v;
	}

	/**
	 * Sets the value for dob.
	 * @param v Value to Set.
	 */
	public void setDob(Object v){
		throw new IllegalArgumentException();
	}

	/**
	 * Sets the value for dob.
	 * @param v Value to Set.
	 */
	public void setDob(String v)  {
		_Dob=formatDate(v);
	}

	//FIELD

	private Integer _Yob=null;

	/**
	 * @return Returns the yob.
	 */
	public Integer getYob(){
		return _Yob;
	}

	/**
	 * Sets the value for xnat:demographicData/yob.
	 * @param v Value to Set.
	 */
	public void setYob(Integer v) {
		_Yob=v;
	}

	/**
	 * Sets the value for xnat:demographicData/yob.
	 * @param v Value to Set.
	 */
	public void setYob(String v)  {
		_Yob=formatInteger(v);
	}

	//FIELD

	private Integer _Age=null;

	/**
	 * @return Returns the age.
	 */
	public Integer getAge(){
		return _Age;
	}

	/**
	 * Sets the value for xnat:demographicData/age.
	 * @param v Value to Set.
	 */
	public void setAge(Integer v) {
		_Age=v;
	}

	/**
	 * Sets the value for xnat:demographicData/age.
	 * @param v Value to Set.
	 */
	public void setAge(String v)  {
		_Age=formatInteger(v);
	}

	//FIELD

	private String _Gender=null;

	/**
	 * @return Returns the gender.
	 */
	public String getGender(){
		return _Gender;
	}

	/**
	 * Sets the value for gender.
	 * @param v Value to Set.
	 */
	public void setGender(String v){
		_Gender=v;
	}

	//FIELD

	private String _Handedness=null;

	/**
	 * @return Returns the handedness.
	 */
	public String getHandedness(){
		return _Handedness;
	}

	/**
	 * Sets the value for handedness.
	 * @param v Value to Set.
	 */
	public void setHandedness(String v){
		_Handedness=v;
	}

	//FIELD

	private Integer _Ses=null;

	/**
	 * @return Returns the ses.
	 */
	public Integer getSes(){
		return _Ses;
	}

	/**
	 * Sets the value for xnat:demographicData/ses.
	 * @param v Value to Set.
	 */
	public void setSes(Integer v) {
		_Ses=v;
	}

	/**
	 * Sets the value for xnat:demographicData/ses.
	 * @param v Value to Set.
	 */
	public void setSes(String v)  {
		_Ses=formatInteger(v);
	}

	//FIELD

	private Integer _Employment=null;

	/**
	 * @return Returns the employment.
	 */
	public Integer getEmployment(){
		return _Employment;
	}

	/**
	 * Sets the value for xnat:demographicData/employment.
	 * @param v Value to Set.
	 */
	public void setEmployment(Integer v) {
		_Employment=v;
	}

	/**
	 * Sets the value for xnat:demographicData/employment.
	 * @param v Value to Set.
	 */
	public void setEmployment(String v)  {
		_Employment=formatInteger(v);
	}

	//FIELD

	private Integer _Education=null;

	/**
	 * @return Returns the education.
	 */
	public Integer getEducation(){
		return _Education;
	}

	/**
	 * Sets the value for xnat:demographicData/education.
	 * @param v Value to Set.
	 */
	public void setEducation(Integer v) {
		_Education=v;
	}

	/**
	 * Sets the value for xnat:demographicData/education.
	 * @param v Value to Set.
	 */
	public void setEducation(String v)  {
		_Education=formatInteger(v);
	}

	//FIELD

	private String _Educationdesc=null;

	/**
	 * @return Returns the educationDesc.
	 */
	public String getEducationdesc(){
		return _Educationdesc;
	}

	/**
	 * Sets the value for educationDesc.
	 * @param v Value to Set.
	 */
	public void setEducationdesc(String v){
		_Educationdesc=v;
	}

	//FIELD

	private String _Race=null;

	/**
	 * @return Returns the race.
	 */
	public String getRace(){
		return _Race;
	}

	/**
	 * Sets the value for race.
	 * @param v Value to Set.
	 */
	public void setRace(String v){
		_Race=v;
	}

	//FIELD

	private String _Race2=null;

	/**
	 * @return Returns the race2.
	 */
	public String getRace2(){
		return _Race2;
	}

	/**
	 * Sets the value for race2.
	 * @param v Value to Set.
	 */
	public void setRace2(String v){
		_Race2=v;
	}

	//FIELD

	private String _Race3=null;

	/**
	 * @return Returns the race3.
	 */
	public String getRace3(){
		return _Race3;
	}

	/**
	 * Sets the value for race3.
	 * @param v Value to Set.
	 */
	public void setRace3(String v){
		_Race3=v;
	}

	//FIELD

	private String _Race4=null;

	/**
	 * @return Returns the race4.
	 */
	public String getRace4(){
		return _Race4;
	}

	/**
	 * Sets the value for race4.
	 * @param v Value to Set.
	 */
	public void setRace4(String v){
		_Race4=v;
	}

	//FIELD

	private String _Race5=null;

	/**
	 * @return Returns the race5.
	 */
	public String getRace5(){
		return _Race5;
	}

	/**
	 * Sets the value for race5.
	 * @param v Value to Set.
	 */
	public void setRace5(String v){
		_Race5=v;
	}

	//FIELD

	private String _Race6=null;

	/**
	 * @return Returns the race6.
	 */
	public String getRace6(){
		return _Race6;
	}

	/**
	 * Sets the value for race6.
	 * @param v Value to Set.
	 */
	public void setRace6(String v){
		_Race6=v;
	}

	//FIELD

	private String _Ethnicity=null;

	/**
	 * @return Returns the ethnicity.
	 */
	public String getEthnicity(){
		return _Ethnicity;
	}

	/**
	 * Sets the value for ethnicity.
	 * @param v Value to Set.
	 */
	public void setEthnicity(String v){
		_Ethnicity=v;
	}

	//FIELD

	private Double _Weight=null;

	/**
	 * @return Returns the weight.
	 */
	public Double getWeight() {
		return _Weight;
	}

	/**
	 * Sets the value for weight.
	 * @param v Value to Set.
	 */
	public void setWeight(Double v){
		_Weight=v;
	}

	/**
	 * Sets the value for weight.
	 * @param v Value to Set.
	 */
	public void setWeight(String v)  {
		_Weight=formatDouble(v);
	}

	//FIELD

	private String _Weight_units=null;

	/**
	 * @return Returns the weight/units.
	 */
	public String getWeight_units(){
		return _Weight_units;
	}

	/**
	 * Sets the value for weight/units.
	 * @param v Value to Set.
	 */
	public void setWeight_units(String v){
		_Weight_units=v;
	}

	//FIELD

	private Double _Height=null;

	/**
	 * @return Returns the height.
	 */
	public Double getHeight() {
		return _Height;
	}

	/**
	 * Sets the value for height.
	 * @param v Value to Set.
	 */
	public void setHeight(Double v){
		_Height=v;
	}

	/**
	 * Sets the value for height.
	 * @param v Value to Set.
	 */
	public void setHeight(String v)  {
		_Height=formatDouble(v);
	}

	//FIELD

	private String _Height_units=null;

	/**
	 * @return Returns the height/units.
	 */
	public String getHeight_units(){
		return _Height_units;
	}

	/**
	 * Sets the value for height/units.
	 * @param v Value to Set.
	 */
	public void setHeight_units(String v){
		_Height_units=v;
	}

	//FIELD

	private Double _GestationalAge=null;

	/**
	 * @return Returns the gestational_age.
	 */
	public Double getGestationalAge() {
		return _GestationalAge;
	}

	/**
	 * Sets the value for gestational_age.
	 * @param v Value to Set.
	 */
	public void setGestationalAge(Double v){
		_GestationalAge=v;
	}

	/**
	 * Sets the value for gestational_age.
	 * @param v Value to Set.
	 */
	public void setGestationalAge(String v)  {
		_GestationalAge=formatDouble(v);
	}

	//FIELD

	private Double _PostMenstrualAge=null;

	/**
	 * @return Returns the post_menstrual_age.
	 */
	public Double getPostMenstrualAge() {
		return _PostMenstrualAge;
	}

	/**
	 * Sets the value for post_menstrual_age.
	 * @param v Value to Set.
	 */
	public void setPostMenstrualAge(Double v){
		_PostMenstrualAge=v;
	}

	/**
	 * Sets the value for post_menstrual_age.
	 * @param v Value to Set.
	 */
	public void setPostMenstrualAge(String v)  {
		_PostMenstrualAge=formatDouble(v);
	}

	//FIELD

	private Double _BirthWeight=null;

	/**
	 * @return Returns the birth_weight.
	 */
	public Double getBirthWeight() {
		return _BirthWeight;
	}

	/**
	 * Sets the value for birth_weight.
	 * @param v Value to Set.
	 */
	public void setBirthWeight(Double v){
		_BirthWeight=v;
	}

	/**
	 * Sets the value for birth_weight.
	 * @param v Value to Set.
	 */
	public void setBirthWeight(String v)  {
		_BirthWeight=formatDouble(v);
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("dob")){
			setDob(v);
		}else if (xmlPath.equals("yob")){
			setYob(v);
		}else if (xmlPath.equals("age")){
			setAge(v);
		}else if (xmlPath.equals("gender")){
			setGender(v);
		}else if (xmlPath.equals("handedness")){
			setHandedness(v);
		}else if (xmlPath.equals("ses")){
			setSes(v);
		}else if (xmlPath.equals("employment")){
			setEmployment(v);
		}else if (xmlPath.equals("education")){
			setEducation(v);
		}else if (xmlPath.equals("educationDesc")){
			setEducationdesc(v);
		}else if (xmlPath.equals("race")){
			setRace(v);
		}else if (xmlPath.equals("race2")){
			setRace2(v);
		}else if (xmlPath.equals("race3")){
			setRace3(v);
		}else if (xmlPath.equals("race4")){
			setRace4(v);
		}else if (xmlPath.equals("race5")){
			setRace5(v);
		}else if (xmlPath.equals("race6")){
			setRace6(v);
		}else if (xmlPath.equals("ethnicity")){
			setEthnicity(v);
		}else if (xmlPath.equals("weight")){
			setWeight(v);
		}else if (xmlPath.equals("weight/units")){
			setWeight_units(v);
		}else if (xmlPath.equals("height")){
			setHeight(v);
		}else if (xmlPath.equals("height/units")){
			setHeight_units(v);
		}else if (xmlPath.equals("gestational_age")){
			setGestationalAge(v);
		}else if (xmlPath.equals("post_menstrual_age")){
			setPostMenstrualAge(v);
		}else if (xmlPath.equals("birth_weight")){
			setBirthWeight(v);
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
		if (xmlPath.equals("dob")){
			return getDob();
		}else if (xmlPath.equals("yob")){
			return getYob();
		}else if (xmlPath.equals("age")){
			return getAge();
		}else if (xmlPath.equals("gender")){
			return getGender();
		}else if (xmlPath.equals("handedness")){
			return getHandedness();
		}else if (xmlPath.equals("ses")){
			return getSes();
		}else if (xmlPath.equals("employment")){
			return getEmployment();
		}else if (xmlPath.equals("education")){
			return getEducation();
		}else if (xmlPath.equals("educationDesc")){
			return getEducationdesc();
		}else if (xmlPath.equals("race")){
			return getRace();
		}else if (xmlPath.equals("race2")){
			return getRace2();
		}else if (xmlPath.equals("race3")){
			return getRace3();
		}else if (xmlPath.equals("race4")){
			return getRace4();
		}else if (xmlPath.equals("race5")){
			return getRace5();
		}else if (xmlPath.equals("race6")){
			return getRace6();
		}else if (xmlPath.equals("ethnicity")){
			return getEthnicity();
		}else if (xmlPath.equals("weight")){
			return getWeight();
		}else if (xmlPath.equals("weight/units")){
			return getWeight_units();
		}else if (xmlPath.equals("height")){
			return getHeight();
		}else if (xmlPath.equals("height/units")){
			return getHeight_units();
		}else if (xmlPath.equals("gestational_age")){
			return getGestationalAge();
		}else if (xmlPath.equals("post_menstrual_age")){
			return getPostMenstrualAge();
		}else if (xmlPath.equals("birth_weight")){
			return getBirthWeight();
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
		if (xmlPath.equals("dob")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("yob")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("age")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("gender")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("handedness")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ses")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("employment")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("education")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("educationDesc")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race2")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race3")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race4")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race5")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("race6")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ethnicity")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("weight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("weight/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("height")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("height/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("gestational_age")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("post_menstrual_age")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("birth_weight")){
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
		all_fields.add("dob");
		all_fields.add("yob");
		all_fields.add("age");
		all_fields.add("gender");
		all_fields.add("handedness");
		all_fields.add("ses");
		all_fields.add("employment");
		all_fields.add("education");
		all_fields.add("educationDesc");
		all_fields.add("race");
		all_fields.add("race2");
		all_fields.add("race3");
		all_fields.add("race4");
		all_fields.add("race5");
		all_fields.add("race6");
		all_fields.add("ethnicity");
		all_fields.add("weight");
		all_fields.add("weight/units");
		all_fields.add("height");
		all_fields.add("height/units");
		all_fields.add("gestational_age");
		all_fields.add("post_menstrual_age");
		all_fields.add("birth_weight");
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
		writer.write("\n<xnat:demographicData");
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
		writer.write("\n</xnat:demographicData>");
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
		//REFERENCE FROM demographicData -> abstractDemographicData
		if (_Dob!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dob");
			writer.write(">");
			writer.write(ValueParser(_Dob,"date"));
			writer.write("</xnat:dob>");
			header--;
		}
		if (_Yob!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:yob");
			writer.write(">");
			writer.write(ValueParser(_Yob,"integer"));
			writer.write("</xnat:yob>");
			header--;
		}
		if (_Age!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:age");
			writer.write(">");
			writer.write(ValueParser(_Age,"integer"));
			writer.write("</xnat:age>");
			header--;
		}
		if (_Gender!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:gender");
			writer.write(">");
			writer.write(ValueParser(_Gender,"string"));
			writer.write("</xnat:gender>");
			header--;
		}
		if (_Handedness!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:handedness");
			writer.write(">");
			writer.write(ValueParser(_Handedness,"string"));
			writer.write("</xnat:handedness>");
			header--;
		}
		if (_Ses!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ses");
			writer.write(">");
			writer.write(ValueParser(_Ses,"integer"));
			writer.write("</xnat:ses>");
			header--;
		}
		if (_Employment!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:employment");
			writer.write(">");
			writer.write(ValueParser(_Employment,"integer"));
			writer.write("</xnat:employment>");
			header--;
		}
		if (_Education!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:education");
			writer.write(">");
			writer.write(ValueParser(_Education,"integer"));
			writer.write("</xnat:education>");
			header--;
		}
		if (_Educationdesc!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:educationDesc");
			writer.write(">");
			writer.write(ValueParser(_Educationdesc,"string"));
			writer.write("</xnat:educationDesc>");
			header--;
		}
		if (_Race!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race");
			writer.write(">");
			writer.write(ValueParser(_Race,"string"));
			writer.write("</xnat:race>");
			header--;
		}
		if (_Race2!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race2");
			writer.write(">");
			writer.write(ValueParser(_Race2,"string"));
			writer.write("</xnat:race2>");
			header--;
		}
		if (_Race3!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race3");
			writer.write(">");
			writer.write(ValueParser(_Race3,"string"));
			writer.write("</xnat:race3>");
			header--;
		}
		if (_Race4!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race4");
			writer.write(">");
			writer.write(ValueParser(_Race4,"string"));
			writer.write("</xnat:race4>");
			header--;
		}
		if (_Race5!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race5");
			writer.write(">");
			writer.write(ValueParser(_Race5,"string"));
			writer.write("</xnat:race5>");
			header--;
		}
		if (_Race6!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:race6");
			writer.write(">");
			writer.write(ValueParser(_Race6,"string"));
			writer.write("</xnat:race6>");
			header--;
		}
		if (_Ethnicity!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ethnicity");
			writer.write(">");
			writer.write(ValueParser(_Ethnicity,"string"));
			writer.write("</xnat:ethnicity>");
			header--;
		}
		TreeMap WeightATTMap = new TreeMap();
		String WeightATT = new String();
		if (_Weight_units!=null)
			WeightATTMap.put("units",ValueParser(_Weight_units,"string"));
		java.util.Iterator iter0 =WeightATTMap.keySet().iterator();
		while(iter0.hasNext()){
			String key = (String)iter0.next();
			WeightATT +=" " + key + "=\"" + WeightATTMap.get(key) + "\"";
		}
		if (_Weight!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:weight");
			writer.write(WeightATT);
			writer.write(">");
			writer.write(ValueParser(_Weight,"float"));
			writer.write("</xnat:weight>");
			header--;
		}
		else if(!WeightATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:weight");
			writer.write(WeightATT);
			writer.write("/>");
			header--;
		}

		TreeMap HeightATTMap = new TreeMap();
		String HeightATT = new String();
		if (_Height_units!=null)
			HeightATTMap.put("units",ValueParser(_Height_units,"string"));
		java.util.Iterator iter1 =HeightATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			HeightATT +=" " + key + "=\"" + HeightATTMap.get(key) + "\"";
		}
		if (_Height!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:height");
			writer.write(HeightATT);
			writer.write(">");
			writer.write(ValueParser(_Height,"float"));
			writer.write("</xnat:height>");
			header--;
		}
		else if(!HeightATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:height");
			writer.write(HeightATT);
			writer.write("/>");
			header--;
		}

		if (_GestationalAge!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:gestational_age");
			writer.write(">");
			writer.write(ValueParser(_GestationalAge,"float"));
			writer.write("</xnat:gestational_age>");
			header--;
		}
		if (_PostMenstrualAge!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:post_menstrual_age");
			writer.write(">");
			writer.write(ValueParser(_PostMenstrualAge,"float"));
			writer.write("</xnat:post_menstrual_age>");
			header--;
		}
		if (_BirthWeight!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:birth_weight");
			writer.write(">");
			writer.write(ValueParser(_BirthWeight,"float"));
			writer.write("</xnat:birth_weight>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Dob!=null) return true;
		if (_Yob!=null) return true;
		if (_Age!=null) return true;
		if (_Gender!=null) return true;
		if (_Handedness!=null) return true;
		if (_Ses!=null) return true;
		if (_Employment!=null) return true;
		if (_Education!=null) return true;
		if (_Educationdesc!=null) return true;
		if (_Race!=null) return true;
		if (_Race2!=null) return true;
		if (_Race3!=null) return true;
		if (_Race4!=null) return true;
		if (_Race5!=null) return true;
		if (_Race6!=null) return true;
		if (_Ethnicity!=null) return true;
		if (_Weight_units!=null)
			return true;
		if (_Weight!=null) return true;
		if (_Height_units!=null)
			return true;
		if (_Height!=null) return true;
		if (_GestationalAge!=null) return true;
		if (_PostMenstrualAge!=null) return true;
		if (_BirthWeight!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
