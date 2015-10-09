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
public abstract class AutoExtClinicalassessmentdata extends XnatSubjectassessordata implements org.nrg.xdat.model.ExtClinicalassessmentdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoExtClinicalassessmentdata.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData";

	public AutoExtClinicalassessmentdata(ItemI item)
	{
		super(item);
	}

	public AutoExtClinicalassessmentdata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExtClinicalassessmentdata(UserI user)
	 **/
	public AutoExtClinicalassessmentdata(){}

	public AutoExtClinicalassessmentdata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ext:clinicalAssessmentData";
	}
	 private org.nrg.xdat.om.XnatSubjectassessordata _Subjectassessordata =null;

	/**
	 * subjectAssessorData
	 * @return org.nrg.xdat.om.XnatSubjectassessordata
	 */
	public org.nrg.xdat.om.XnatSubjectassessordata getSubjectassessordata() {
		try{
			if (_Subjectassessordata==null){
				_Subjectassessordata=((XnatSubjectassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("subjectAssessorData")));
				return _Subjectassessordata;
			}else {
				return _Subjectassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for subjectAssessorData.
	 * @param v Value to Set.
	 */
	public void setSubjectassessordata(ItemI v) throws Exception{
		_Subjectassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * subjectAssessorData
	 * set org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void setSubjectassessordata(A item) throws Exception{
	setSubjectassessordata((ItemI)item);
	}

	/**
	 * Removes the subjectAssessorData.
	 * */
	public void removeSubjectassessordata() {
		_Subjectassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/subjectAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}
	 private ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis> _Diagnosis =null;

	/**
	 * Diagnosis
	 * @return Returns an List of org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> List<A> getDiagnosis() {
		try{
			if (_Diagnosis==null){
				_Diagnosis=org.nrg.xdat.base.BaseElement.WrapItems(getChildItems("Diagnosis"));
			}
			return (List<A>) _Diagnosis;
		} catch (Exception e1) {return (List<A>) new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataDiagnosis>();}
	}

	/**
	 * Sets the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(ItemI v) throws Exception{
		_Diagnosis =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/Diagnosis",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/Diagnosis",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * Diagnosis
	 * Adds org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> void addDiagnosis(A item) throws Exception{
	setDiagnosis((ItemI)item);
	}

	/**
	 * Removes the Diagnosis of the given index.
	 * @param index Index of child to remove.
	 */
	public void removeDiagnosis(int index) throws java.lang.IndexOutOfBoundsException {
		_Diagnosis =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/Diagnosis",index);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Bloodpressure_highbpCsBool=null;

	/**
	 * @return Returns the BloodPressure/HighBP_CS_Bool.
	 */
	public Boolean getBloodpressure_highbpCsBool() {
		try{
			if (_Bloodpressure_highbpCsBool==null){
				_Bloodpressure_highbpCsBool=getBooleanProperty("BloodPressure/HighBP_CS_Bool");
				return _Bloodpressure_highbpCsBool;
			}else {
				return _Bloodpressure_highbpCsBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for BloodPressure/HighBP_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_highbpCsBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/BloodPressure/HighBP_CS_Bool",v);
		_Bloodpressure_highbpCsBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Bloodpressure_systolic=null;

	/**
	 * @return Returns the BloodPressure/systolic.
	 */
	public Integer getBloodpressure_systolic() {
		try{
			if (_Bloodpressure_systolic==null){
				_Bloodpressure_systolic=getIntegerProperty("BloodPressure/systolic");
				return _Bloodpressure_systolic;
			}else {
				return _Bloodpressure_systolic;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for BloodPressure/systolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_systolic(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/BloodPressure/systolic",v);
		_Bloodpressure_systolic=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Bloodpressure_diastolic=null;

	/**
	 * @return Returns the BloodPressure/diastolic.
	 */
	public Integer getBloodpressure_diastolic() {
		try{
			if (_Bloodpressure_diastolic==null){
				_Bloodpressure_diastolic=getIntegerProperty("BloodPressure/diastolic");
				return _Bloodpressure_diastolic;
			}else {
				return _Bloodpressure_diastolic;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for BloodPressure/diastolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_diastolic(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/BloodPressure/diastolic",v);
		_Bloodpressure_diastolic=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Neuro_sbt=null;

	/**
	 * @return Returns the Neuro/SBT.
	 */
	public Integer getNeuro_sbt() {
		try{
			if (_Neuro_sbt==null){
				_Neuro_sbt=getIntegerProperty("Neuro/SBT");
				return _Neuro_sbt;
			}else {
				return _Neuro_sbt;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/SBT.
	 * @param v Value to Set.
	 */
	public void setNeuro_sbt(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/SBT",v);
		_Neuro_sbt=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Neuro_mmse=null;

	/**
	 * @return Returns the Neuro/MMSE.
	 */
	public Integer getNeuro_mmse() {
		try{
			if (_Neuro_mmse==null){
				_Neuro_mmse=getIntegerProperty("Neuro/MMSE");
				return _Neuro_mmse;
			}else {
				return _Neuro_mmse;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/MMSE.
	 * @param v Value to Set.
	 */
	public void setNeuro_mmse(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/MMSE",v);
		_Neuro_mmse=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_bdsc=null;

	/**
	 * @return Returns the Neuro/Bdsc.
	 */
	public Double getNeuro_bdsc() {
		try{
			if (_Neuro_bdsc==null){
				_Neuro_bdsc=getDoubleProperty("Neuro/Bdsc");
				return _Neuro_bdsc;
			}else {
				return _Neuro_bdsc;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/Bdsc.
	 * @param v Value to Set.
	 */
	public void setNeuro_bdsc(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/Bdsc",v);
		_Neuro_bdsc=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_memory=null;

	/**
	 * @return Returns the Neuro/CDR/memory.
	 */
	public Double getNeuro_cdr_memory() {
		try{
			if (_Neuro_cdr_memory==null){
				_Neuro_cdr_memory=getDoubleProperty("Neuro/CDR/memory");
				return _Neuro_cdr_memory;
			}else {
				return _Neuro_cdr_memory;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/memory.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_memory(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/memory",v);
		_Neuro_cdr_memory=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_orientation=null;

	/**
	 * @return Returns the Neuro/CDR/orientation.
	 */
	public Double getNeuro_cdr_orientation() {
		try{
			if (_Neuro_cdr_orientation==null){
				_Neuro_cdr_orientation=getDoubleProperty("Neuro/CDR/orientation");
				return _Neuro_cdr_orientation;
			}else {
				return _Neuro_cdr_orientation;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/orientation.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_orientation(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/orientation",v);
		_Neuro_cdr_orientation=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_judgmentProblemSolving=null;

	/**
	 * @return Returns the Neuro/CDR/judgment_problem_solving.
	 */
	public Double getNeuro_cdr_judgmentProblemSolving() {
		try{
			if (_Neuro_cdr_judgmentProblemSolving==null){
				_Neuro_cdr_judgmentProblemSolving=getDoubleProperty("Neuro/CDR/judgment_problem_solving");
				return _Neuro_cdr_judgmentProblemSolving;
			}else {
				return _Neuro_cdr_judgmentProblemSolving;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/judgment_problem_solving.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_judgmentProblemSolving(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/judgment_problem_solving",v);
		_Neuro_cdr_judgmentProblemSolving=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_communityAffairs=null;

	/**
	 * @return Returns the Neuro/CDR/community_affairs.
	 */
	public Double getNeuro_cdr_communityAffairs() {
		try{
			if (_Neuro_cdr_communityAffairs==null){
				_Neuro_cdr_communityAffairs=getDoubleProperty("Neuro/CDR/community_affairs");
				return _Neuro_cdr_communityAffairs;
			}else {
				return _Neuro_cdr_communityAffairs;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/community_affairs.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_communityAffairs(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/community_affairs",v);
		_Neuro_cdr_communityAffairs=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_homeHobbies=null;

	/**
	 * @return Returns the Neuro/CDR/home_hobbies.
	 */
	public Double getNeuro_cdr_homeHobbies() {
		try{
			if (_Neuro_cdr_homeHobbies==null){
				_Neuro_cdr_homeHobbies=getDoubleProperty("Neuro/CDR/home_hobbies");
				return _Neuro_cdr_homeHobbies;
			}else {
				return _Neuro_cdr_homeHobbies;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/home_hobbies.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_homeHobbies(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/home_hobbies",v);
		_Neuro_cdr_homeHobbies=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_personalCare=null;

	/**
	 * @return Returns the Neuro/CDR/personal_care.
	 */
	public Double getNeuro_cdr_personalCare() {
		try{
			if (_Neuro_cdr_personalCare==null){
				_Neuro_cdr_personalCare=getDoubleProperty("Neuro/CDR/personal_care");
				return _Neuro_cdr_personalCare;
			}else {
				return _Neuro_cdr_personalCare;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/personal_care.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_personalCare(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/personal_care",v);
		_Neuro_cdr_personalCare=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_sumbox=null;

	/**
	 * @return Returns the Neuro/CDR/sumbox.
	 */
	public Double getNeuro_cdr_sumbox() {
		try{
			if (_Neuro_cdr_sumbox==null){
				_Neuro_cdr_sumbox=getDoubleProperty("Neuro/CDR/sumbox");
				return _Neuro_cdr_sumbox;
			}else {
				return _Neuro_cdr_sumbox;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/sumbox.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_sumbox(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/sumbox",v);
		_Neuro_cdr_sumbox=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Neuro_cdr_rating=null;

	/**
	 * @return Returns the Neuro/CDR/rating.
	 */
	public Double getNeuro_cdr_rating() {
		try{
			if (_Neuro_cdr_rating==null){
				_Neuro_cdr_rating=getDoubleProperty("Neuro/CDR/rating");
				return _Neuro_cdr_rating;
			}else {
				return _Neuro_cdr_rating;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/CDR/rating.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_rating(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Neuro/CDR/rating",v);
		_Neuro_cdr_rating=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_thinkingproblemSbool=null;

	/**
	 * @return Returns the Neuro/ThinkingProblem_S_Bool.
	 */
	public Boolean getNeuro_thinkingproblemSbool() {
		try{
			if (_Neuro_thinkingproblemSbool==null){
				_Neuro_thinkingproblemSbool=getBooleanProperty("Neuro/ThinkingProblem_S_Bool");
				return _Neuro_thinkingproblemSbool;
			}else {
				return _Neuro_thinkingproblemSbool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/ThinkingProblem_S_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemSbool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/ThinkingProblem_S_Bool",v);
		_Neuro_thinkingproblemSbool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_thinkingproblemCsBool=null;

	/**
	 * @return Returns the Neuro/ThinkingProblem_CS_Bool.
	 */
	public Boolean getNeuro_thinkingproblemCsBool() {
		try{
			if (_Neuro_thinkingproblemCsBool==null){
				_Neuro_thinkingproblemCsBool=getBooleanProperty("Neuro/ThinkingProblem_CS_Bool");
				return _Neuro_thinkingproblemCsBool;
			}else {
				return _Neuro_thinkingproblemCsBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/ThinkingProblem_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemCsBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/ThinkingProblem_CS_Bool",v);
		_Neuro_thinkingproblemCsBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_consmemoryproblemBool=null;

	/**
	 * @return Returns the Neuro/ConsMemoryProblem_Bool.
	 */
	public Boolean getNeuro_consmemoryproblemBool() {
		try{
			if (_Neuro_consmemoryproblemBool==null){
				_Neuro_consmemoryproblemBool=getBooleanProperty("Neuro/ConsMemoryProblem_Bool");
				return _Neuro_consmemoryproblemBool;
			}else {
				return _Neuro_consmemoryproblemBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/ConsMemoryProblem_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_consmemoryproblemBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/ConsMemoryProblem_Bool",v);
		_Neuro_consmemoryproblemBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_strokebool=null;

	/**
	 * @return Returns the Neuro/StrokeBool.
	 */
	public Boolean getNeuro_strokebool() {
		try{
			if (_Neuro_strokebool==null){
				_Neuro_strokebool=getBooleanProperty("Neuro/StrokeBool");
				return _Neuro_strokebool;
			}else {
				return _Neuro_strokebool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/StrokeBool.
	 * @param v Value to Set.
	 */
	public void setNeuro_strokebool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/StrokeBool",v);
		_Neuro_strokebool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_sxStrokeBool=null;

	/**
	 * @return Returns the Neuro/Sx_Stroke_Bool.
	 */
	public Boolean getNeuro_sxStrokeBool() {
		try{
			if (_Neuro_sxStrokeBool==null){
				_Neuro_sxStrokeBool=getBooleanProperty("Neuro/Sx_Stroke_Bool");
				return _Neuro_sxStrokeBool;
			}else {
				return _Neuro_sxStrokeBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/Sx_Stroke_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxStrokeBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/Sx_Stroke_Bool",v);
		_Neuro_sxStrokeBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Neuro_sxTiaBool=null;

	/**
	 * @return Returns the Neuro/Sx_Tia_Bool.
	 */
	public Boolean getNeuro_sxTiaBool() {
		try{
			if (_Neuro_sxTiaBool==null){
				_Neuro_sxTiaBool=getBooleanProperty("Neuro/Sx_Tia_Bool");
				return _Neuro_sxTiaBool;
			}else {
				return _Neuro_sxTiaBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Neuro/Sx_Tia_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxTiaBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Neuro/Sx_Tia_Bool",v);
		_Neuro_sxTiaBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Movement_spasticityBool=null;

	/**
	 * @return Returns the Movement/Spasticity_Bool.
	 */
	public Boolean getMovement_spasticityBool() {
		try{
			if (_Movement_spasticityBool==null){
				_Movement_spasticityBool=getBooleanProperty("Movement/Spasticity_Bool");
				return _Movement_spasticityBool;
			}else {
				return _Movement_spasticityBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Movement/Spasticity_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_spasticityBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Movement/Spasticity_Bool",v);
		_Movement_spasticityBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Movement_rigid=null;

	/**
	 * @return Returns the Movement/Rigid.
	 */
	public Integer getMovement_rigid() {
		try{
			if (_Movement_rigid==null){
				_Movement_rigid=getIntegerProperty("Movement/Rigid");
				return _Movement_rigid;
			}else {
				return _Movement_rigid;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Movement/Rigid.
	 * @param v Value to Set.
	 */
	public void setMovement_rigid(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Movement/Rigid",v);
		_Movement_rigid=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Movement_bradykBool=null;

	/**
	 * @return Returns the Movement/Bradyk_Bool.
	 */
	public Boolean getMovement_bradykBool() {
		try{
			if (_Movement_bradykBool==null){
				_Movement_bradykBool=getBooleanProperty("Movement/Bradyk_Bool");
				return _Movement_bradykBool;
			}else {
				return _Movement_bradykBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Movement/Bradyk_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_bradykBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Movement/Bradyk_Bool",v);
		_Movement_bradykBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Movement_gait=null;

	/**
	 * @return Returns the Movement/Gait.
	 */
	public Integer getMovement_gait() {
		try{
			if (_Movement_gait==null){
				_Movement_gait=getIntegerProperty("Movement/Gait");
				return _Movement_gait;
			}else {
				return _Movement_gait;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Movement/Gait.
	 * @param v Value to Set.
	 */
	public void setMovement_gait(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Movement/Gait",v);
		_Movement_gait=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _Movement_abnormalgaitBool=null;

	/**
	 * @return Returns the Movement/AbnormalGait_Bool.
	 */
	public Boolean getMovement_abnormalgaitBool() {
		try{
			if (_Movement_abnormalgaitBool==null){
				_Movement_abnormalgaitBool=getBooleanProperty("Movement/AbnormalGait_Bool");
				return _Movement_abnormalgaitBool;
			}else {
				return _Movement_abnormalgaitBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Movement/AbnormalGait_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_abnormalgaitBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Movement/AbnormalGait_Bool",v);
		_Movement_abnormalgaitBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}
	 private ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication> _Medication =null;

	/**
	 * Medication
	 * @return Returns an List of org.nrg.xdat.om.ExtClinicalassessmentdataMedication
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> List<A> getMedication() {
		try{
			if (_Medication==null){
				_Medication=org.nrg.xdat.base.BaseElement.WrapItems(getChildItems("Medication"));
			}
			return (List<A>) _Medication;
		} catch (Exception e1) {return (List<A>) new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdataMedication>();}
	}

	/**
	 * Sets the value for Medication.
	 * @param v Value to Set.
	 */
	public void setMedication(ItemI v) throws Exception{
		_Medication =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/Medication",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/Medication",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * Medication
	 * Adds org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> void addMedication(A item) throws Exception{
	setMedication((ItemI)item);
	}

	/**
	 * Removes the Medication of the given index.
	 * @param index Index of child to remove.
	 */
	public void removeMedication(int index) throws java.lang.IndexOutOfBoundsException {
		_Medication =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/Medication",index);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _Weight=null;

	/**
	 * @return Returns the Weight.
	 */
	public Integer getWeight() {
		try{
			if (_Weight==null){
				_Weight=getIntegerProperty("Weight");
				return _Weight;
			}else {
				return _Weight;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Weight.
	 * @param v Value to Set.
	 */
	public void setWeight(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/Weight",v);
		_Weight=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _DiabetesBool=null;

	/**
	 * @return Returns the Diabetes_Bool.
	 */
	public Boolean getDiabetesBool() {
		try{
			if (_DiabetesBool==null){
				_DiabetesBool=getBooleanProperty("Diabetes_Bool");
				return _DiabetesBool;
			}else {
				return _DiabetesBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for Diabetes_Bool.
	 * @param v Value to Set.
	 */
	public void setDiabetesBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/Diabetes_Bool",v);
		_DiabetesBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _HeartproblemsBool=null;

	/**
	 * @return Returns the HeartProblems_Bool.
	 */
	public Boolean getHeartproblemsBool() {
		try{
			if (_HeartproblemsBool==null){
				_HeartproblemsBool=getBooleanProperty("HeartProblems_Bool");
				return _HeartproblemsBool;
			}else {
				return _HeartproblemsBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for HeartProblems_Bool.
	 * @param v Value to Set.
	 */
	public void setHeartproblemsBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/HeartProblems_Bool",v);
		_HeartproblemsBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Boolean _TobaccouseBool=null;

	/**
	 * @return Returns the TobaccoUse_Bool.
	 */
	public Boolean getTobaccouseBool() {
		try{
			if (_TobaccouseBool==null){
				_TobaccouseBool=getBooleanProperty("TobaccoUse_Bool");
				return _TobaccouseBool;
			}else {
				return _TobaccouseBool;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for TobaccoUse_Bool.
	 * @param v Value to Set.
	 */
	public void setTobaccouseBool(Object v){
		try{
		setBooleanProperty(SCHEMA_ELEMENT_NAME + "/TobaccoUse_Bool",v);
		_TobaccouseBool=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> getAllExtClinicalassessmentdatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> getExtClinicalassessmentdatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> getExtClinicalassessmentdatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata> al = new ArrayList<org.nrg.xdat.om.ExtClinicalassessmentdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExtClinicalassessmentdata getExtClinicalassessmentdatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ext:clinicalAssessmentData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExtClinicalassessmentdata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",this.getItem().getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //subjectAssessorData
	        XnatSubjectassessordata childSubjectassessordata = (XnatSubjectassessordata)this.getSubjectassessordata();
	            if (childSubjectassessordata!=null){
	              for(ResourceFile rf: ((XnatSubjectassessordata)childSubjectassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("subjectAssessorData[" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("subjectAssessorData/" + ((XnatSubjectassessordata)childSubjectassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	        //Diagnosis
	        for(org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI childDiagnosis : this.getDiagnosis()){
	            if (childDiagnosis!=null){
	              for(ResourceFile rf: ((ExtClinicalassessmentdataDiagnosis)childDiagnosis).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("Diagnosis[" + ((ExtClinicalassessmentdataDiagnosis)childDiagnosis).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("Diagnosis/" + ((ExtClinicalassessmentdataDiagnosis)childDiagnosis).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	        }
	
	        localLoop = preventLoop;
	
	        //Medication
	        for(org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI childMedication : this.getMedication()){
	            if (childMedication!=null){
	              for(ResourceFile rf: ((ExtClinicalassessmentdataMedication)childMedication).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("Medication[" + ((ExtClinicalassessmentdataMedication)childMedication).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("Medication/" + ((ExtClinicalassessmentdataMedication)childMedication).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	        }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
