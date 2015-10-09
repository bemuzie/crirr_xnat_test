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
public class ExtClinicalassessmentdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.ExtClinicalassessmentdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ExtClinicalassessmentdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="ext:clinicalAssessmentData";

	public String getSchemaElementName(){
		return "clinicalAssessmentData";
	}

	public String getFullSchemaElementName(){
		return "ext:clinicalAssessmentData";
	}
	 private List<org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean> _Diagnosis =new ArrayList<org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean>();

	/**
	 * Diagnosis
	 * @return Returns an List of org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> List<A> getDiagnosis() {
		return (List<A>) _Diagnosis;
	}

	/**
	 * Sets the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(ArrayList<org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean> v){
		_Diagnosis=v;
	}

	/**
	 * Adds the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void addDiagnosis(org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean v){
		_Diagnosis.add(v);
	}

	/**
	 * Diagnosis
	 * Adds org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> void addDiagnosis(A item) throws Exception{
	_Diagnosis.add((org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean)item);
	}

	/**
	 * Adds the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void addDiagnosis(Object v){
		if (v instanceof org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean)
			_Diagnosis.add((org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean");
	}

	//FIELD

	private Boolean _Bloodpressure_highbpCsBool=null;

	/**
	 * @return Returns the BloodPressure/HighBP_CS_Bool.
	 */
	public Boolean getBloodpressure_highbpCsBool() {
		return _Bloodpressure_highbpCsBool;
	}

	/**
	 * Sets the value for BloodPressure/HighBP_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_highbpCsBool(Object v){
		if(v instanceof Boolean){
			_Bloodpressure_highbpCsBool=(Boolean)v;
		}else if(v instanceof String){
			_Bloodpressure_highbpCsBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _Bloodpressure_systolic=null;

	/**
	 * @return Returns the BloodPressure/systolic.
	 */
	public Integer getBloodpressure_systolic(){
		return _Bloodpressure_systolic;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/systolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_systolic(Integer v) {
		_Bloodpressure_systolic=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/systolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_systolic(String v)  {
		_Bloodpressure_systolic=formatInteger(v);
	}

	//FIELD

	private Integer _Bloodpressure_diastolic=null;

	/**
	 * @return Returns the BloodPressure/diastolic.
	 */
	public Integer getBloodpressure_diastolic(){
		return _Bloodpressure_diastolic;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/diastolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_diastolic(Integer v) {
		_Bloodpressure_diastolic=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/diastolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_diastolic(String v)  {
		_Bloodpressure_diastolic=formatInteger(v);
	}

	//FIELD

	private Integer _Neuro_sbt=null;

	/**
	 * @return Returns the Neuro/SBT.
	 */
	public Integer getNeuro_sbt(){
		return _Neuro_sbt;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/SBT.
	 * @param v Value to Set.
	 */
	public void setNeuro_sbt(Integer v) {
		_Neuro_sbt=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/SBT.
	 * @param v Value to Set.
	 */
	public void setNeuro_sbt(String v)  {
		_Neuro_sbt=formatInteger(v);
	}

	//FIELD

	private Integer _Neuro_mmse=null;

	/**
	 * @return Returns the Neuro/MMSE.
	 */
	public Integer getNeuro_mmse(){
		return _Neuro_mmse;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/MMSE.
	 * @param v Value to Set.
	 */
	public void setNeuro_mmse(Integer v) {
		_Neuro_mmse=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/MMSE.
	 * @param v Value to Set.
	 */
	public void setNeuro_mmse(String v)  {
		_Neuro_mmse=formatInteger(v);
	}

	//FIELD

	private Double _Neuro_bdsc=null;

	/**
	 * @return Returns the Neuro/Bdsc.
	 */
	public Double getNeuro_bdsc() {
		return _Neuro_bdsc;
	}

	/**
	 * Sets the value for Neuro/Bdsc.
	 * @param v Value to Set.
	 */
	public void setNeuro_bdsc(Double v){
		_Neuro_bdsc=v;
	}

	/**
	 * Sets the value for Neuro/Bdsc.
	 * @param v Value to Set.
	 */
	public void setNeuro_bdsc(String v)  {
		_Neuro_bdsc=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_memory=null;

	/**
	 * @return Returns the Neuro/CDR/memory.
	 */
	public Double getNeuro_cdr_memory() {
		return _Neuro_cdr_memory;
	}

	/**
	 * Sets the value for Neuro/CDR/memory.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_memory(Double v){
		_Neuro_cdr_memory=v;
	}

	/**
	 * Sets the value for Neuro/CDR/memory.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_memory(String v)  {
		_Neuro_cdr_memory=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_orientation=null;

	/**
	 * @return Returns the Neuro/CDR/orientation.
	 */
	public Double getNeuro_cdr_orientation() {
		return _Neuro_cdr_orientation;
	}

	/**
	 * Sets the value for Neuro/CDR/orientation.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_orientation(Double v){
		_Neuro_cdr_orientation=v;
	}

	/**
	 * Sets the value for Neuro/CDR/orientation.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_orientation(String v)  {
		_Neuro_cdr_orientation=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_judgmentProblemSolving=null;

	/**
	 * @return Returns the Neuro/CDR/judgment_problem_solving.
	 */
	public Double getNeuro_cdr_judgmentProblemSolving() {
		return _Neuro_cdr_judgmentProblemSolving;
	}

	/**
	 * Sets the value for Neuro/CDR/judgment_problem_solving.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_judgmentProblemSolving(Double v){
		_Neuro_cdr_judgmentProblemSolving=v;
	}

	/**
	 * Sets the value for Neuro/CDR/judgment_problem_solving.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_judgmentProblemSolving(String v)  {
		_Neuro_cdr_judgmentProblemSolving=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_communityAffairs=null;

	/**
	 * @return Returns the Neuro/CDR/community_affairs.
	 */
	public Double getNeuro_cdr_communityAffairs() {
		return _Neuro_cdr_communityAffairs;
	}

	/**
	 * Sets the value for Neuro/CDR/community_affairs.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_communityAffairs(Double v){
		_Neuro_cdr_communityAffairs=v;
	}

	/**
	 * Sets the value for Neuro/CDR/community_affairs.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_communityAffairs(String v)  {
		_Neuro_cdr_communityAffairs=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_homeHobbies=null;

	/**
	 * @return Returns the Neuro/CDR/home_hobbies.
	 */
	public Double getNeuro_cdr_homeHobbies() {
		return _Neuro_cdr_homeHobbies;
	}

	/**
	 * Sets the value for Neuro/CDR/home_hobbies.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_homeHobbies(Double v){
		_Neuro_cdr_homeHobbies=v;
	}

	/**
	 * Sets the value for Neuro/CDR/home_hobbies.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_homeHobbies(String v)  {
		_Neuro_cdr_homeHobbies=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_personalCare=null;

	/**
	 * @return Returns the Neuro/CDR/personal_care.
	 */
	public Double getNeuro_cdr_personalCare() {
		return _Neuro_cdr_personalCare;
	}

	/**
	 * Sets the value for Neuro/CDR/personal_care.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_personalCare(Double v){
		_Neuro_cdr_personalCare=v;
	}

	/**
	 * Sets the value for Neuro/CDR/personal_care.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_personalCare(String v)  {
		_Neuro_cdr_personalCare=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_sumbox=null;

	/**
	 * @return Returns the Neuro/CDR/sumbox.
	 */
	public Double getNeuro_cdr_sumbox() {
		return _Neuro_cdr_sumbox;
	}

	/**
	 * Sets the value for Neuro/CDR/sumbox.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_sumbox(Double v){
		_Neuro_cdr_sumbox=v;
	}

	/**
	 * Sets the value for Neuro/CDR/sumbox.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_sumbox(String v)  {
		_Neuro_cdr_sumbox=formatDouble(v);
	}

	//FIELD

	private Double _Neuro_cdr_rating=null;

	/**
	 * @return Returns the Neuro/CDR/rating.
	 */
	public Double getNeuro_cdr_rating() {
		return _Neuro_cdr_rating;
	}

	/**
	 * Sets the value for Neuro/CDR/rating.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_rating(Double v){
		_Neuro_cdr_rating=v;
	}

	/**
	 * Sets the value for Neuro/CDR/rating.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_rating(String v)  {
		_Neuro_cdr_rating=formatDouble(v);
	}

	//FIELD

	private Boolean _Neuro_thinkingproblemSbool=null;

	/**
	 * @return Returns the Neuro/ThinkingProblem_S_Bool.
	 */
	public Boolean getNeuro_thinkingproblemSbool() {
		return _Neuro_thinkingproblemSbool;
	}

	/**
	 * Sets the value for Neuro/ThinkingProblem_S_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemSbool(Object v){
		if(v instanceof Boolean){
			_Neuro_thinkingproblemSbool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_thinkingproblemSbool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Neuro_thinkingproblemCsBool=null;

	/**
	 * @return Returns the Neuro/ThinkingProblem_CS_Bool.
	 */
	public Boolean getNeuro_thinkingproblemCsBool() {
		return _Neuro_thinkingproblemCsBool;
	}

	/**
	 * Sets the value for Neuro/ThinkingProblem_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemCsBool(Object v){
		if(v instanceof Boolean){
			_Neuro_thinkingproblemCsBool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_thinkingproblemCsBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Neuro_consmemoryproblemBool=null;

	/**
	 * @return Returns the Neuro/ConsMemoryProblem_Bool.
	 */
	public Boolean getNeuro_consmemoryproblemBool() {
		return _Neuro_consmemoryproblemBool;
	}

	/**
	 * Sets the value for Neuro/ConsMemoryProblem_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_consmemoryproblemBool(Object v){
		if(v instanceof Boolean){
			_Neuro_consmemoryproblemBool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_consmemoryproblemBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Neuro_strokebool=null;

	/**
	 * @return Returns the Neuro/StrokeBool.
	 */
	public Boolean getNeuro_strokebool() {
		return _Neuro_strokebool;
	}

	/**
	 * Sets the value for Neuro/StrokeBool.
	 * @param v Value to Set.
	 */
	public void setNeuro_strokebool(Object v){
		if(v instanceof Boolean){
			_Neuro_strokebool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_strokebool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Neuro_sxStrokeBool=null;

	/**
	 * @return Returns the Neuro/Sx_Stroke_Bool.
	 */
	public Boolean getNeuro_sxStrokeBool() {
		return _Neuro_sxStrokeBool;
	}

	/**
	 * Sets the value for Neuro/Sx_Stroke_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxStrokeBool(Object v){
		if(v instanceof Boolean){
			_Neuro_sxStrokeBool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_sxStrokeBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Neuro_sxTiaBool=null;

	/**
	 * @return Returns the Neuro/Sx_Tia_Bool.
	 */
	public Boolean getNeuro_sxTiaBool() {
		return _Neuro_sxTiaBool;
	}

	/**
	 * Sets the value for Neuro/Sx_Tia_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxTiaBool(Object v){
		if(v instanceof Boolean){
			_Neuro_sxTiaBool=(Boolean)v;
		}else if(v instanceof String){
			_Neuro_sxTiaBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _Movement_spasticityBool=null;

	/**
	 * @return Returns the Movement/Spasticity_Bool.
	 */
	public Boolean getMovement_spasticityBool() {
		return _Movement_spasticityBool;
	}

	/**
	 * Sets the value for Movement/Spasticity_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_spasticityBool(Object v){
		if(v instanceof Boolean){
			_Movement_spasticityBool=(Boolean)v;
		}else if(v instanceof String){
			_Movement_spasticityBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _Movement_rigid=null;

	/**
	 * @return Returns the Movement/Rigid.
	 */
	public Integer getMovement_rigid(){
		return _Movement_rigid;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Rigid.
	 * @param v Value to Set.
	 */
	public void setMovement_rigid(Integer v) {
		_Movement_rigid=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Rigid.
	 * @param v Value to Set.
	 */
	public void setMovement_rigid(String v)  {
		_Movement_rigid=formatInteger(v);
	}

	//FIELD

	private Boolean _Movement_bradykBool=null;

	/**
	 * @return Returns the Movement/Bradyk_Bool.
	 */
	public Boolean getMovement_bradykBool() {
		return _Movement_bradykBool;
	}

	/**
	 * Sets the value for Movement/Bradyk_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_bradykBool(Object v){
		if(v instanceof Boolean){
			_Movement_bradykBool=(Boolean)v;
		}else if(v instanceof String){
			_Movement_bradykBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _Movement_gait=null;

	/**
	 * @return Returns the Movement/Gait.
	 */
	public Integer getMovement_gait(){
		return _Movement_gait;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Gait.
	 * @param v Value to Set.
	 */
	public void setMovement_gait(Integer v) {
		_Movement_gait=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Gait.
	 * @param v Value to Set.
	 */
	public void setMovement_gait(String v)  {
		_Movement_gait=formatInteger(v);
	}

	//FIELD

	private Boolean _Movement_abnormalgaitBool=null;

	/**
	 * @return Returns the Movement/AbnormalGait_Bool.
	 */
	public Boolean getMovement_abnormalgaitBool() {
		return _Movement_abnormalgaitBool;
	}

	/**
	 * Sets the value for Movement/AbnormalGait_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_abnormalgaitBool(Object v){
		if(v instanceof Boolean){
			_Movement_abnormalgaitBool=(Boolean)v;
		}else if(v instanceof String){
			_Movement_abnormalgaitBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}
	 private List<org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean> _Medication =new ArrayList<org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean>();

	/**
	 * Medication
	 * @return Returns an List of org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> List<A> getMedication() {
		return (List<A>) _Medication;
	}

	/**
	 * Sets the value for Medication.
	 * @param v Value to Set.
	 */
	public void setMedication(ArrayList<org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean> v){
		_Medication=v;
	}

	/**
	 * Adds the value for Medication.
	 * @param v Value to Set.
	 */
	public void addMedication(org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean v){
		_Medication.add(v);
	}

	/**
	 * Medication
	 * Adds org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> void addMedication(A item) throws Exception{
	_Medication.add((org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean)item);
	}

	/**
	 * Adds the value for Medication.
	 * @param v Value to Set.
	 */
	public void addMedication(Object v){
		if (v instanceof org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean)
			_Medication.add((org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean");
	}

	//FIELD

	private Integer _Weight=null;

	/**
	 * @return Returns the Weight.
	 */
	public Integer getWeight(){
		return _Weight;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Weight.
	 * @param v Value to Set.
	 */
	public void setWeight(Integer v) {
		_Weight=v;
	}

	/**
	 * Sets the value for ext:clinicalAssessmentData/Weight.
	 * @param v Value to Set.
	 */
	public void setWeight(String v)  {
		_Weight=formatInteger(v);
	}

	//FIELD

	private Boolean _DiabetesBool=null;

	/**
	 * @return Returns the Diabetes_Bool.
	 */
	public Boolean getDiabetesBool() {
		return _DiabetesBool;
	}

	/**
	 * Sets the value for Diabetes_Bool.
	 * @param v Value to Set.
	 */
	public void setDiabetesBool(Object v){
		if(v instanceof Boolean){
			_DiabetesBool=(Boolean)v;
		}else if(v instanceof String){
			_DiabetesBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _HeartproblemsBool=null;

	/**
	 * @return Returns the HeartProblems_Bool.
	 */
	public Boolean getHeartproblemsBool() {
		return _HeartproblemsBool;
	}

	/**
	 * Sets the value for HeartProblems_Bool.
	 * @param v Value to Set.
	 */
	public void setHeartproblemsBool(Object v){
		if(v instanceof Boolean){
			_HeartproblemsBool=(Boolean)v;
		}else if(v instanceof String){
			_HeartproblemsBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Boolean _TobaccouseBool=null;

	/**
	 * @return Returns the TobaccoUse_Bool.
	 */
	public Boolean getTobaccouseBool() {
		return _TobaccouseBool;
	}

	/**
	 * Sets the value for TobaccoUse_Bool.
	 * @param v Value to Set.
	 */
	public void setTobaccouseBool(Object v){
		if(v instanceof Boolean){
			_TobaccouseBool=(Boolean)v;
		}else if(v instanceof String){
			_TobaccouseBool=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("BloodPressure/HighBP_CS_Bool")){
			setBloodpressure_highbpCsBool(v);
		}else if (xmlPath.equals("BloodPressure/systolic")){
			setBloodpressure_systolic(v);
		}else if (xmlPath.equals("BloodPressure/diastolic")){
			setBloodpressure_diastolic(v);
		}else if (xmlPath.equals("Neuro/SBT")){
			setNeuro_sbt(v);
		}else if (xmlPath.equals("Neuro/MMSE")){
			setNeuro_mmse(v);
		}else if (xmlPath.equals("Neuro/Bdsc")){
			setNeuro_bdsc(v);
		}else if (xmlPath.equals("Neuro/CDR/memory")){
			setNeuro_cdr_memory(v);
		}else if (xmlPath.equals("Neuro/CDR/orientation")){
			setNeuro_cdr_orientation(v);
		}else if (xmlPath.equals("Neuro/CDR/judgment_problem_solving")){
			setNeuro_cdr_judgmentProblemSolving(v);
		}else if (xmlPath.equals("Neuro/CDR/community_affairs")){
			setNeuro_cdr_communityAffairs(v);
		}else if (xmlPath.equals("Neuro/CDR/home_hobbies")){
			setNeuro_cdr_homeHobbies(v);
		}else if (xmlPath.equals("Neuro/CDR/personal_care")){
			setNeuro_cdr_personalCare(v);
		}else if (xmlPath.equals("Neuro/CDR/sumbox")){
			setNeuro_cdr_sumbox(v);
		}else if (xmlPath.equals("Neuro/CDR/rating")){
			setNeuro_cdr_rating(v);
		}else if (xmlPath.equals("Neuro/ThinkingProblem_S_Bool")){
			setNeuro_thinkingproblemSbool(v);
		}else if (xmlPath.equals("Neuro/ThinkingProblem_CS_Bool")){
			setNeuro_thinkingproblemCsBool(v);
		}else if (xmlPath.equals("Neuro/ConsMemoryProblem_Bool")){
			setNeuro_consmemoryproblemBool(v);
		}else if (xmlPath.equals("Neuro/StrokeBool")){
			setNeuro_strokebool(v);
		}else if (xmlPath.equals("Neuro/Sx_Stroke_Bool")){
			setNeuro_sxStrokeBool(v);
		}else if (xmlPath.equals("Neuro/Sx_Tia_Bool")){
			setNeuro_sxTiaBool(v);
		}else if (xmlPath.equals("Movement/Spasticity_Bool")){
			setMovement_spasticityBool(v);
		}else if (xmlPath.equals("Movement/Rigid")){
			setMovement_rigid(v);
		}else if (xmlPath.equals("Movement/Bradyk_Bool")){
			setMovement_bradykBool(v);
		}else if (xmlPath.equals("Movement/Gait")){
			setMovement_gait(v);
		}else if (xmlPath.equals("Movement/AbnormalGait_Bool")){
			setMovement_abnormalgaitBool(v);
		}else if (xmlPath.equals("Weight")){
			setWeight(v);
		}else if (xmlPath.equals("Diabetes_Bool")){
			setDiabetesBool(v);
		}else if (xmlPath.equals("HeartProblems_Bool")){
			setHeartproblemsBool(v);
		}else if (xmlPath.equals("TobaccoUse_Bool")){
			setTobaccouseBool(v);
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
		if (xmlPath.equals("Diagnosis")){
			addDiagnosis(v);
		}else if (xmlPath.equals("Medication")){
			addMedication(v);
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
		if (xmlPath.equals("BloodPressure/HighBP_CS_Bool")){
			return getBloodpressure_highbpCsBool();
		}else if (xmlPath.equals("BloodPressure/systolic")){
			return getBloodpressure_systolic();
		}else if (xmlPath.equals("BloodPressure/diastolic")){
			return getBloodpressure_diastolic();
		}else if (xmlPath.equals("Neuro/SBT")){
			return getNeuro_sbt();
		}else if (xmlPath.equals("Neuro/MMSE")){
			return getNeuro_mmse();
		}else if (xmlPath.equals("Neuro/Bdsc")){
			return getNeuro_bdsc();
		}else if (xmlPath.equals("Neuro/CDR/memory")){
			return getNeuro_cdr_memory();
		}else if (xmlPath.equals("Neuro/CDR/orientation")){
			return getNeuro_cdr_orientation();
		}else if (xmlPath.equals("Neuro/CDR/judgment_problem_solving")){
			return getNeuro_cdr_judgmentProblemSolving();
		}else if (xmlPath.equals("Neuro/CDR/community_affairs")){
			return getNeuro_cdr_communityAffairs();
		}else if (xmlPath.equals("Neuro/CDR/home_hobbies")){
			return getNeuro_cdr_homeHobbies();
		}else if (xmlPath.equals("Neuro/CDR/personal_care")){
			return getNeuro_cdr_personalCare();
		}else if (xmlPath.equals("Neuro/CDR/sumbox")){
			return getNeuro_cdr_sumbox();
		}else if (xmlPath.equals("Neuro/CDR/rating")){
			return getNeuro_cdr_rating();
		}else if (xmlPath.equals("Neuro/ThinkingProblem_S_Bool")){
			return getNeuro_thinkingproblemSbool();
		}else if (xmlPath.equals("Neuro/ThinkingProblem_CS_Bool")){
			return getNeuro_thinkingproblemCsBool();
		}else if (xmlPath.equals("Neuro/ConsMemoryProblem_Bool")){
			return getNeuro_consmemoryproblemBool();
		}else if (xmlPath.equals("Neuro/StrokeBool")){
			return getNeuro_strokebool();
		}else if (xmlPath.equals("Neuro/Sx_Stroke_Bool")){
			return getNeuro_sxStrokeBool();
		}else if (xmlPath.equals("Neuro/Sx_Tia_Bool")){
			return getNeuro_sxTiaBool();
		}else if (xmlPath.equals("Movement/Spasticity_Bool")){
			return getMovement_spasticityBool();
		}else if (xmlPath.equals("Movement/Rigid")){
			return getMovement_rigid();
		}else if (xmlPath.equals("Movement/Bradyk_Bool")){
			return getMovement_bradykBool();
		}else if (xmlPath.equals("Movement/Gait")){
			return getMovement_gait();
		}else if (xmlPath.equals("Movement/AbnormalGait_Bool")){
			return getMovement_abnormalgaitBool();
		}else if (xmlPath.equals("Weight")){
			return getWeight();
		}else if (xmlPath.equals("Diabetes_Bool")){
			return getDiabetesBool();
		}else if (xmlPath.equals("HeartProblems_Bool")){
			return getHeartproblemsBool();
		}else if (xmlPath.equals("TobaccoUse_Bool")){
			return getTobaccouseBool();
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
		if (xmlPath.equals("Diagnosis")){
			return getDiagnosis();
		}else if (xmlPath.equals("Medication")){
			return getMedication();
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
		if (xmlPath.equals("Diagnosis")){
			return "http://nrg.wustl.edu/ext:clinicalAssessmentData_Diagnosis";
		}else if (xmlPath.equals("Medication")){
			return "http://nrg.wustl.edu/ext:clinicalAssessmentData_Medication";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("Diagnosis")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("BloodPressure/HighBP_CS_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("BloodPressure/systolic")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("BloodPressure/diastolic")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/SBT")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/MMSE")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/Bdsc")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/memory")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/orientation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/judgment_problem_solving")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/community_affairs")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/home_hobbies")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/personal_care")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/sumbox")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/CDR/rating")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/ThinkingProblem_S_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/ThinkingProblem_CS_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/ConsMemoryProblem_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/StrokeBool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/Sx_Stroke_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Neuro/Sx_Tia_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Movement/Spasticity_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Movement/Rigid")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Movement/Bradyk_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Movement/Gait")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Movement/AbnormalGait_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Medication")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("Weight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("Diabetes_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("HeartProblems_Bool")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("TobaccoUse_Bool")){
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
		all_fields.add("Diagnosis");
		all_fields.add("BloodPressure/HighBP_CS_Bool");
		all_fields.add("BloodPressure/systolic");
		all_fields.add("BloodPressure/diastolic");
		all_fields.add("Neuro/SBT");
		all_fields.add("Neuro/MMSE");
		all_fields.add("Neuro/Bdsc");
		all_fields.add("Neuro/CDR/memory");
		all_fields.add("Neuro/CDR/orientation");
		all_fields.add("Neuro/CDR/judgment_problem_solving");
		all_fields.add("Neuro/CDR/community_affairs");
		all_fields.add("Neuro/CDR/home_hobbies");
		all_fields.add("Neuro/CDR/personal_care");
		all_fields.add("Neuro/CDR/sumbox");
		all_fields.add("Neuro/CDR/rating");
		all_fields.add("Neuro/ThinkingProblem_S_Bool");
		all_fields.add("Neuro/ThinkingProblem_CS_Bool");
		all_fields.add("Neuro/ConsMemoryProblem_Bool");
		all_fields.add("Neuro/StrokeBool");
		all_fields.add("Neuro/Sx_Stroke_Bool");
		all_fields.add("Neuro/Sx_Tia_Bool");
		all_fields.add("Movement/Spasticity_Bool");
		all_fields.add("Movement/Rigid");
		all_fields.add("Movement/Bradyk_Bool");
		all_fields.add("Movement/Gait");
		all_fields.add("Movement/AbnormalGait_Bool");
		all_fields.add("Medication");
		all_fields.add("Weight");
		all_fields.add("Diabetes_Bool");
		all_fields.add("HeartProblems_Bool");
		all_fields.add("TobaccoUse_Bool");
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
		writer.write("\n<ext:ClinicalAssessment");
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
		writer.write("\n</ext:ClinicalAssessment>");
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
		//REFERENCE FROM clinicalAssessmentData -> subjectAssessorData
		//REFERENCE FROM clinicalAssessmentData -> Diagnosis
		java.util.Iterator iter0=_Diagnosis.iterator();
		while(iter0.hasNext()){
			org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean child = (org.nrg.xdat.bean.ExtClinicalassessmentdataDiagnosisBean)iter0.next();
			writer.write("\n" + createHeader(header++) + "<ext:Diagnosis");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("ext:clinicalAssessmentData_Diagnosis")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return1 =child.addXMLBody(writer,header);
				if(return1){
					writer.write("\n" + createHeader(--header) + "</ext:Diagnosis>");
				}else{
					writer.write("</ext:Diagnosis>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		TreeMap BloodpressureATTMap = new TreeMap();
		String BloodpressureATT = new String();
		if (_Bloodpressure_highbpCsBool!=null)
			BloodpressureATTMap.put("HighBP_CS_Bool",ValueParser(_Bloodpressure_highbpCsBool,"boolean"));
		if (_Bloodpressure_systolic!=null)
			BloodpressureATTMap.put("systolic",ValueParser(_Bloodpressure_systolic,"integer"));
		if (_Bloodpressure_diastolic!=null)
			BloodpressureATTMap.put("diastolic",ValueParser(_Bloodpressure_diastolic,"integer"));
		java.util.Iterator iter1 =BloodpressureATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			BloodpressureATT +=" " + key + "=\"" + BloodpressureATTMap.get(key) + "\"";
		}
		if(!BloodpressureATT.equals("")){
			writer.write("\n" + createHeader(header) + "<ext:BloodPressure");
			writer.write(BloodpressureATT);
			writer.write("/>");
		}

			int child2=0;
			int att2=0;
			if(_Neuro_sxTiaBool!=null)
			child2++;
			if(_Neuro_cdr_orientation!=null)
			child2++;
			if(_Neuro_cdr_homeHobbies!=null)
			child2++;
			if(_Neuro_consmemoryproblemBool!=null)
			child2++;
			if(_Neuro_mmse!=null)
			child2++;
			if(_Neuro_bdsc!=null)
			child2++;
			if(_Neuro_cdr_sumbox!=null)
			child2++;
			if(_Neuro_strokebool!=null)
			child2++;
			if(_Neuro_cdr_rating!=null)
			child2++;
			if(_Neuro_sbt!=null)
			child2++;
			if(_Neuro_cdr_judgmentProblemSolving!=null)
			child2++;
			if(_Neuro_cdr_memory!=null)
			child2++;
			if(_Neuro_thinkingproblemSbool!=null)
			child2++;
			if(_Neuro_sxStrokeBool!=null)
			child2++;
			if(_Neuro_cdr_communityAffairs!=null)
			child2++;
			if(_Neuro_thinkingproblemCsBool!=null)
			child2++;
			if(_Neuro_cdr_personalCare!=null)
			child2++;
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<ext:Neuro");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Neuro_sbt!=null){
			writer.write("\n" + createHeader(header++) + "<ext:SBT");
			writer.write(">");
			writer.write(ValueParser(_Neuro_sbt,"integer"));
			writer.write("</ext:SBT>");
			header--;
		}
		if (_Neuro_mmse!=null){
			writer.write("\n" + createHeader(header++) + "<ext:MMSE");
			writer.write(">");
			writer.write(ValueParser(_Neuro_mmse,"integer"));
			writer.write("</ext:MMSE>");
			header--;
		}
		if (_Neuro_bdsc!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Bdsc");
			writer.write(">");
			writer.write(ValueParser(_Neuro_bdsc,"float"));
			writer.write("</ext:Bdsc>");
			header--;
		}
		TreeMap Neuro_cdrATTMap = new TreeMap();
		String Neuro_cdrATT = new String();
		if (_Neuro_cdr_sumbox!=null)
			Neuro_cdrATTMap.put("sumbox",ValueParser(_Neuro_cdr_sumbox,"float"));
		if (_Neuro_cdr_rating!=null)
			Neuro_cdrATTMap.put("rating",ValueParser(_Neuro_cdr_rating,"float"));
		java.util.Iterator iter3 =Neuro_cdrATTMap.keySet().iterator();
		while(iter3.hasNext()){
			String key = (String)iter3.next();
			Neuro_cdrATT +=" " + key + "=\"" + Neuro_cdrATTMap.get(key) + "\"";
		}
			int child4=0;
			int att4=0;
			if(_Neuro_cdr_judgmentProblemSolving!=null)
			child4++;
			if(_Neuro_cdr_memory!=null)
			child4++;
			if(_Neuro_cdr_personalCare!=null)
			child4++;
			if(_Neuro_cdr_orientation!=null)
			child4++;
			if(_Neuro_cdr_sumbox!=null)
			att4++;
			if(_Neuro_cdr_rating!=null)
			att4++;
			if(_Neuro_cdr_homeHobbies!=null)
			child4++;
			if(_Neuro_cdr_communityAffairs!=null)
			child4++;
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<ext:CDR");
				writer.write(Neuro_cdrATT);
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Neuro_cdr_memory!=null){
			writer.write("\n" + createHeader(header++) + "<ext:memory");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_memory,"float"));
			writer.write("</ext:memory>");
			header--;
		}
		if (_Neuro_cdr_orientation!=null){
			writer.write("\n" + createHeader(header++) + "<ext:orientation");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_orientation,"float"));
			writer.write("</ext:orientation>");
			header--;
		}
		if (_Neuro_cdr_judgmentProblemSolving!=null){
			writer.write("\n" + createHeader(header++) + "<ext:judgment_problem_solving");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_judgmentProblemSolving,"float"));
			writer.write("</ext:judgment_problem_solving>");
			header--;
		}
		if (_Neuro_cdr_communityAffairs!=null){
			writer.write("\n" + createHeader(header++) + "<ext:community_affairs");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_communityAffairs,"float"));
			writer.write("</ext:community_affairs>");
			header--;
		}
		if (_Neuro_cdr_homeHobbies!=null){
			writer.write("\n" + createHeader(header++) + "<ext:home_hobbies");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_homeHobbies,"float"));
			writer.write("</ext:home_hobbies>");
			header--;
		}
		if (_Neuro_cdr_personalCare!=null){
			writer.write("\n" + createHeader(header++) + "<ext:personal_care");
			writer.write(">");
			writer.write(ValueParser(_Neuro_cdr_personalCare,"float"));
			writer.write("</ext:personal_care>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</ext:CDR>");
			}
			}

		if (_Neuro_thinkingproblemSbool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:ThinkingProblem_S_Bool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_thinkingproblemSbool,"boolean"));
			writer.write("</ext:ThinkingProblem_S_Bool>");
			header--;
		}
		if (_Neuro_thinkingproblemCsBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:ThinkingProblem_CS_Bool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_thinkingproblemCsBool,"boolean"));
			writer.write("</ext:ThinkingProblem_CS_Bool>");
			header--;
		}
		if (_Neuro_consmemoryproblemBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:ConsMemoryProblem_Bool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_consmemoryproblemBool,"boolean"));
			writer.write("</ext:ConsMemoryProblem_Bool>");
			header--;
		}
		if (_Neuro_strokebool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:StrokeBool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_strokebool,"boolean"));
			writer.write("</ext:StrokeBool>");
			header--;
		}
		if (_Neuro_sxStrokeBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Sx_Stroke_Bool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_sxStrokeBool,"boolean"));
			writer.write("</ext:Sx_Stroke_Bool>");
			header--;
		}
		if (_Neuro_sxTiaBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Sx_Tia_Bool");
			writer.write(">");
			writer.write(ValueParser(_Neuro_sxTiaBool,"boolean"));
			writer.write("</ext:Sx_Tia_Bool>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</ext:Neuro>");
			}
			}

			int child5=0;
			int att5=0;
			if(_Movement_gait!=null)
			child5++;
			if(_Movement_rigid!=null)
			child5++;
			if(_Movement_spasticityBool!=null)
			child5++;
			if(_Movement_abnormalgaitBool!=null)
			child5++;
			if(_Movement_bradykBool!=null)
			child5++;
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<ext:Movement");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Movement_spasticityBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Spasticity_Bool");
			writer.write(">");
			writer.write(ValueParser(_Movement_spasticityBool,"boolean"));
			writer.write("</ext:Spasticity_Bool>");
			header--;
		}
		if (_Movement_rigid!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Rigid");
			writer.write(">");
			writer.write(ValueParser(_Movement_rigid,"integer"));
			writer.write("</ext:Rigid>");
			header--;
		}
		if (_Movement_bradykBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Bradyk_Bool");
			writer.write(">");
			writer.write(ValueParser(_Movement_bradykBool,"boolean"));
			writer.write("</ext:Bradyk_Bool>");
			header--;
		}
		if (_Movement_gait!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Gait");
			writer.write(">");
			writer.write(ValueParser(_Movement_gait,"integer"));
			writer.write("</ext:Gait>");
			header--;
		}
		if (_Movement_abnormalgaitBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:AbnormalGait_Bool");
			writer.write(">");
			writer.write(ValueParser(_Movement_abnormalgaitBool,"boolean"));
			writer.write("</ext:AbnormalGait_Bool>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</ext:Movement>");
			}
			}

		//REFERENCE FROM clinicalAssessmentData -> Medication
		java.util.Iterator iter6=_Medication.iterator();
		while(iter6.hasNext()){
			org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean child = (org.nrg.xdat.bean.ExtClinicalassessmentdataMedicationBean)iter6.next();
			writer.write("\n" + createHeader(header++) + "<ext:Medication");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("ext:clinicalAssessmentData_Medication")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return7 =child.addXMLBody(writer,header);
				if(return7){
					writer.write("\n" + createHeader(--header) + "</ext:Medication>");
				}else{
					writer.write("</ext:Medication>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		if (_Weight!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Weight");
			writer.write(">");
			writer.write(ValueParser(_Weight,"integer"));
			writer.write("</ext:Weight>");
			header--;
		}
		if (_DiabetesBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:Diabetes_Bool");
			writer.write(">");
			writer.write(ValueParser(_DiabetesBool,"boolean"));
			writer.write("</ext:Diabetes_Bool>");
			header--;
		}
		if (_HeartproblemsBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:HeartProblems_Bool");
			writer.write(">");
			writer.write(ValueParser(_HeartproblemsBool,"boolean"));
			writer.write("</ext:HeartProblems_Bool>");
			header--;
		}
		if (_TobaccouseBool!=null){
			writer.write("\n" + createHeader(header++) + "<ext:TobaccoUse_Bool");
			writer.write(">");
			writer.write(ValueParser(_TobaccouseBool,"boolean"));
			writer.write("</ext:TobaccoUse_Bool>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if(_Diagnosis.size()>0) return true;
		if (_Bloodpressure_highbpCsBool!=null)
			return true;
		if (_Bloodpressure_systolic!=null)
			return true;
		if (_Bloodpressure_diastolic!=null)
			return true;
			if(_Neuro_sxTiaBool!=null) return true;
			if(_Neuro_cdr_orientation!=null) return true;
			if(_Neuro_cdr_homeHobbies!=null) return true;
			if(_Neuro_consmemoryproblemBool!=null) return true;
			if(_Neuro_mmse!=null) return true;
			if(_Neuro_bdsc!=null) return true;
			if(_Neuro_cdr_sumbox!=null) return true;
			if(_Neuro_strokebool!=null) return true;
			if(_Neuro_cdr_rating!=null) return true;
			if(_Neuro_sbt!=null) return true;
			if(_Neuro_cdr_judgmentProblemSolving!=null) return true;
			if(_Neuro_cdr_memory!=null) return true;
			if(_Neuro_thinkingproblemSbool!=null) return true;
			if(_Neuro_sxStrokeBool!=null) return true;
			if(_Neuro_cdr_communityAffairs!=null) return true;
			if(_Neuro_thinkingproblemCsBool!=null) return true;
			if(_Neuro_cdr_personalCare!=null) return true;
			if(_Movement_gait!=null) return true;
			if(_Movement_rigid!=null) return true;
			if(_Movement_spasticityBool!=null) return true;
			if(_Movement_abnormalgaitBool!=null) return true;
			if(_Movement_bradykBool!=null) return true;
		if(_Medication.size()>0) return true;
		if (_Weight!=null) return true;
		if (_DiabetesBool!=null) return true;
		if (_HeartproblemsBool!=null) return true;
		if (_TobaccouseBool!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
