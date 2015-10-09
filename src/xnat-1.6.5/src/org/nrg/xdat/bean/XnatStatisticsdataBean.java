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
public class XnatStatisticsdataBean extends XnatAbstractstatisticsBean implements java.io.Serializable, org.nrg.xdat.model.XnatStatisticsdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatStatisticsdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:statisticsData";

	public String getSchemaElementName(){
		return "statisticsData";
	}

	public String getFullSchemaElementName(){
		return "xnat:statisticsData";
	}

	//FIELD

	private Double _Mean=null;

	/**
	 * @return Returns the mean.
	 */
	public Double getMean() {
		return _Mean;
	}

	/**
	 * Sets the value for mean.
	 * @param v Value to Set.
	 */
	public void setMean(Double v){
		_Mean=v;
	}

	/**
	 * Sets the value for mean.
	 * @param v Value to Set.
	 */
	public void setMean(String v)  {
		_Mean=formatDouble(v);
	}

	//FIELD

	private Double _Snr=null;

	/**
	 * @return Returns the snr.
	 */
	public Double getSnr() {
		return _Snr;
	}

	/**
	 * Sets the value for snr.
	 * @param v Value to Set.
	 */
	public void setSnr(Double v){
		_Snr=v;
	}

	/**
	 * Sets the value for snr.
	 * @param v Value to Set.
	 */
	public void setSnr(String v)  {
		_Snr=formatDouble(v);
	}

	//FIELD

	private Double _Min=null;

	/**
	 * @return Returns the min.
	 */
	public Double getMin() {
		return _Min;
	}

	/**
	 * Sets the value for min.
	 * @param v Value to Set.
	 */
	public void setMin(Double v){
		_Min=v;
	}

	/**
	 * Sets the value for min.
	 * @param v Value to Set.
	 */
	public void setMin(String v)  {
		_Min=formatDouble(v);
	}

	//FIELD

	private Double _Max=null;

	/**
	 * @return Returns the max.
	 */
	public Double getMax() {
		return _Max;
	}

	/**
	 * Sets the value for max.
	 * @param v Value to Set.
	 */
	public void setMax(Double v){
		_Max=v;
	}

	/**
	 * Sets the value for max.
	 * @param v Value to Set.
	 */
	public void setMax(String v)  {
		_Max=formatDouble(v);
	}

	//FIELD

	private Double _Stddev=null;

	/**
	 * @return Returns the stddev.
	 */
	public Double getStddev() {
		return _Stddev;
	}

	/**
	 * Sets the value for stddev.
	 * @param v Value to Set.
	 */
	public void setStddev(Double v){
		_Stddev=v;
	}

	/**
	 * Sets the value for stddev.
	 * @param v Value to Set.
	 */
	public void setStddev(String v)  {
		_Stddev=formatDouble(v);
	}

	//FIELD

	private Integer _NoOfVoxels=null;

	/**
	 * @return Returns the no_of_voxels.
	 */
	public Integer getNoOfVoxels(){
		return _NoOfVoxels;
	}

	/**
	 * Sets the value for xnat:statisticsData/no_of_voxels.
	 * @param v Value to Set.
	 */
	public void setNoOfVoxels(Integer v) {
		_NoOfVoxels=v;
	}

	/**
	 * Sets the value for xnat:statisticsData/no_of_voxels.
	 * @param v Value to Set.
	 */
	public void setNoOfVoxels(String v)  {
		_NoOfVoxels=formatInteger(v);
	}
	 private List<org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean> _Additionalstatistics =new ArrayList<org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean>();

	/**
	 * additionalStatistics
	 * @return Returns an List of org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI> List<A> getAdditionalstatistics() {
		return (List<A>) _Additionalstatistics;
	}

	/**
	 * Sets the value for additionalStatistics.
	 * @param v Value to Set.
	 */
	public void setAdditionalstatistics(ArrayList<org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean> v){
		_Additionalstatistics=v;
	}

	/**
	 * Adds the value for additionalStatistics.
	 * @param v Value to Set.
	 */
	public void addAdditionalstatistics(org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean v){
		_Additionalstatistics.add(v);
	}

	/**
	 * additionalStatistics
	 * Adds org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI> void addAdditionalstatistics(A item) throws Exception{
	_Additionalstatistics.add((org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean)item);
	}

	/**
	 * Adds the value for additionalStatistics.
	 * @param v Value to Set.
	 */
	public void addAdditionalstatistics(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean)
			_Additionalstatistics.add((org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean");
	}
	 private List<org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean> _Addfield =new ArrayList<org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean>();

	/**
	 * addField
	 * @return Returns an List of org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAddfieldI> List<A> getAddfield() {
		return (List<A>) _Addfield;
	}

	/**
	 * Sets the value for addField.
	 * @param v Value to Set.
	 */
	public void setAddfield(ArrayList<org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean> v){
		_Addfield=v;
	}

	/**
	 * Adds the value for addField.
	 * @param v Value to Set.
	 */
	public void addAddfield(org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean v){
		_Addfield.add(v);
	}

	/**
	 * addField
	 * Adds org.nrg.xdat.model.XnatStatisticsdataAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAddfieldI> void addAddfield(A item) throws Exception{
	_Addfield.add((org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean)item);
	}

	/**
	 * Adds the value for addField.
	 * @param v Value to Set.
	 */
	public void addAddfield(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean)
			_Addfield.add((org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean");
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("mean")){
			setMean(v);
		}else if (xmlPath.equals("snr")){
			setSnr(v);
		}else if (xmlPath.equals("min")){
			setMin(v);
		}else if (xmlPath.equals("max")){
			setMax(v);
		}else if (xmlPath.equals("stddev")){
			setStddev(v);
		}else if (xmlPath.equals("no_of_voxels")){
			setNoOfVoxels(v);
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
		if (xmlPath.equals("additionalStatistics")){
			addAdditionalstatistics(v);
		}else if (xmlPath.equals("addField")){
			addAddfield(v);
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
		if (xmlPath.equals("mean")){
			return getMean();
		}else if (xmlPath.equals("snr")){
			return getSnr();
		}else if (xmlPath.equals("min")){
			return getMin();
		}else if (xmlPath.equals("max")){
			return getMax();
		}else if (xmlPath.equals("stddev")){
			return getStddev();
		}else if (xmlPath.equals("no_of_voxels")){
			return getNoOfVoxels();
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
		if (xmlPath.equals("additionalStatistics")){
			return getAdditionalstatistics();
		}else if (xmlPath.equals("addField")){
			return getAddfield();
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
		if (xmlPath.equals("additionalStatistics")){
			return "http://nrg.wustl.edu/xnat:statisticsData_additionalStatistics";
		}else if (xmlPath.equals("addField")){
			return "http://nrg.wustl.edu/xnat:statisticsData_addField";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("mean")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("snr")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("min")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("max")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("stddev")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("no_of_voxels")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("additionalStatistics")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("addField")){
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
		all_fields.add("mean");
		all_fields.add("snr");
		all_fields.add("min");
		all_fields.add("max");
		all_fields.add("stddev");
		all_fields.add("no_of_voxels");
		all_fields.add("additionalStatistics");
		all_fields.add("addField");
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
		writer.write("\n<xnat:statisticsData");
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
		writer.write("\n</xnat:statisticsData>");
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
		//REFERENCE FROM statisticsData -> abstractStatistics
		if (_Mean!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:mean");
			writer.write(">");
			writer.write(ValueParser(_Mean,"double"));
			writer.write("</xnat:mean>");
			header--;
		}
		if (_Snr!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:snr");
			writer.write(">");
			writer.write(ValueParser(_Snr,"double"));
			writer.write("</xnat:snr>");
			header--;
		}
		if (_Min!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:min");
			writer.write(">");
			writer.write(ValueParser(_Min,"double"));
			writer.write("</xnat:min>");
			header--;
		}
		if (_Max!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:max");
			writer.write(">");
			writer.write(ValueParser(_Max,"double"));
			writer.write("</xnat:max>");
			header--;
		}
		if (_Stddev!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:stddev");
			writer.write(">");
			writer.write(ValueParser(_Stddev,"double"));
			writer.write("</xnat:stddev>");
			header--;
		}
		if (_NoOfVoxels!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:no_of_voxels");
			writer.write(">");
			writer.write(ValueParser(_NoOfVoxels,"integer"));
			writer.write("</xnat:no_of_voxels>");
			header--;
		}
		//REFERENCE FROM statisticsData -> additionalStatistics
		java.util.Iterator iter0=_Additionalstatistics.iterator();
		while(iter0.hasNext()){
			org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean child = (org.nrg.xdat.bean.XnatStatisticsdataAdditionalstatisticsBean)iter0.next();
			writer.write("\n" + createHeader(header++) + "<xnat:additionalStatistics");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:statisticsData_additionalStatistics")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return1 =child.addXMLBody(writer,header);
				if(return1){
					writer.write("\n" + createHeader(--header) + "</xnat:additionalStatistics>");
				}else{
					writer.write("</xnat:additionalStatistics>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//REFERENCE FROM statisticsData -> addField
		java.util.Iterator iter1=_Addfield.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean child = (org.nrg.xdat.bean.XnatStatisticsdataAddfieldBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addField");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:statisticsData_addField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:addField>");
				}else{
					writer.write("</xnat:addField>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Mean!=null) return true;
		if (_Snr!=null) return true;
		if (_Min!=null) return true;
		if (_Max!=null) return true;
		if (_Stddev!=null) return true;
		if (_NoOfVoxels!=null) return true;
		if(_Additionalstatistics.size()>0) return true;
		if(_Addfield.size()>0) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
