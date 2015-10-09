/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:50 UTC 2015
 *
 */
package org.nrg.xdat.om.base.auto;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoExtClinicalassessmentdataMedication extends org.nrg.xdat.base.BaseElement implements org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoExtClinicalassessmentdataMedication.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData_Medication";

	public AutoExtClinicalassessmentdataMedication(ItemI item)
	{
		super(item);
	}

	public AutoExtClinicalassessmentdataMedication(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExtClinicalassessmentdataMedication(UserI user)
	 **/
	public AutoExtClinicalassessmentdataMedication(){}

	public AutoExtClinicalassessmentdataMedication(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ext:clinicalAssessmentData_Medication";
	}

	//FIELD

	private String _Name=null;

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		try{
			if (_Name==null){
				_Name=getStringProperty("name");
				return _Name;
			}else {
				return _Name;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/name",v);
		_Name=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Type=null;

	/**
	 * @return Returns the type.
	 */
	public String getType(){
		try{
			if (_Type==null){
				_Type=getStringProperty("type");
				return _Type;
			}else {
				return _Type;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/type",v);
		_Type=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Dose=null;

	/**
	 * @return Returns the dose.
	 */
	public String getDose(){
		try{
			if (_Dose==null){
				_Dose=getStringProperty("dose");
				return _Dose;
			}else {
				return _Dose;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for dose.
	 * @param v Value to Set.
	 */
	public void setDose(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/dose",v);
		_Dose=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _History=null;

	/**
	 * @return Returns the history.
	 */
	public String getHistory(){
		try{
			if (_History==null){
				_History=getStringProperty("history");
				return _History;
			}else {
				return _History;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/history",v);
		_History=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _ExtClinicalassessmentdataMedicationId=null;

	/**
	 * @return Returns the ext_clinicalAssessmentData_Medication_id.
	 */
	public Integer getExtClinicalassessmentdataMedicationId() {
		try{
			if (_ExtClinicalassessmentdataMedicationId==null){
				_ExtClinicalassessmentdataMedicationId=getIntegerProperty("ext_clinicalAssessmentData_Medication_id");
				return _ExtClinicalassessmentdataMedicationId;
			}else {
				return _ExtClinicalassessmentdataMedicationId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for ext_clinicalAssessmentData_Medication_id.
	 * @param v Value to Set.
	 */
	public void setExtClinicalassessmentdataMedicationId(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/ext_clinicalAssessmentData_Medication_id",v);
		_ExtClinicalassessmentdataMedicationId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> getAllExtClinicalassessmentdataMedications(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> getExtClinicalassessmentdataMedicationsByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> getExtClinicalassessmentdataMedicationsByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExtClinicalassessmentdataMedication getExtClinicalassessmentdataMedicationsByExtClinicalassessmentdataMedicationId(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ext:clinicalAssessmentData_Medication/ext_clinicalAssessmentData_Medication_id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExtClinicalassessmentdataMedication) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	return _return;
}
}
