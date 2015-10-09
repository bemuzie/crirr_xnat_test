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
public abstract class AutoExtClinicalassessmentdataDiagnosis extends org.nrg.xdat.base.BaseElement implements org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoExtClinicalassessmentdataDiagnosis.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData_Diagnosis";

	public AutoExtClinicalassessmentdataDiagnosis(ItemI item)
	{
		super(item);
	}

	public AutoExtClinicalassessmentdataDiagnosis(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExtClinicalassessmentdataDiagnosis(UserI user)
	 **/
	public AutoExtClinicalassessmentdataDiagnosis(){}

	public AutoExtClinicalassessmentdataDiagnosis(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ext:clinicalAssessmentData_Diagnosis";
	}

	//FIELD

	private String _Diagnosis=null;

	/**
	 * @return Returns the Diagnosis.
	 */
	public String getDiagnosis(){
		try{
			if (_Diagnosis==null){
				_Diagnosis=getStringProperty("Diagnosis");
				return _Diagnosis;
			}else {
				return _Diagnosis;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Diagnosis",v);
		_Diagnosis=null;
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

	private Integer _Number=null;

	/**
	 * @return Returns the number.
	 */
	public Integer getNumber() {
		try{
			if (_Number==null){
				_Number=getIntegerProperty("number");
				return _Number;
			}else {
				return _Number;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for number.
	 * @param v Value to Set.
	 */
	public void setNumber(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/number",v);
		_Number=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _ExtClinicalassessmentdataDiagnosisId=null;

	/**
	 * @return Returns the ext_clinicalAssessmentData_Diagnosis_id.
	 */
	public Integer getExtClinicalassessmentdataDiagnosisId() {
		try{
			if (_ExtClinicalassessmentdataDiagnosisId==null){
				_ExtClinicalassessmentdataDiagnosisId=getIntegerProperty("ext_clinicalAssessmentData_Diagnosis_id");
				return _ExtClinicalassessmentdataDiagnosisId;
			}else {
				return _ExtClinicalassessmentdataDiagnosisId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for ext_clinicalAssessmentData_Diagnosis_id.
	 * @param v Value to Set.
	 */
	public void setExtClinicalassessmentdataDiagnosisId(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/ext_clinicalAssessmentData_Diagnosis_id",v);
		_ExtClinicalassessmentdataDiagnosisId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> getAllExtClinicalassessmentdataDiagnosiss(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> getExtClinicalassessmentdataDiagnosissByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> getExtClinicalassessmentdataDiagnosissByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExtClinicalassessmentdataDiagnosis getExtClinicalassessmentdataDiagnosissByExtClinicalassessmentdataDiagnosisId(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ext:clinicalAssessmentData_Diagnosis/ext_clinicalAssessmentData_Diagnosis_id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExtClinicalassessmentdataDiagnosis) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
