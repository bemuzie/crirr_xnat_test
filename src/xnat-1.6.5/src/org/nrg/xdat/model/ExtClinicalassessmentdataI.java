/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:37 UTC 2015
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface ExtClinicalassessmentdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * Diagnosis
	 * @return Returns an List of org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> List<A> getDiagnosis();

	/**
	 * Diagnosis
	 * @return Returns an List of org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataDiagnosisI> void addDiagnosis(A item) throws Exception;

	/**
	 * @return Returns the BloodPressure/HighBP_CS_Bool.
	 */
	public Boolean getBloodpressure_highbpCsBool();

	/**
	 * Sets the value for BloodPressure/HighBP_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_highbpCsBool(Object v);

	/**
	 * @return Returns the BloodPressure/systolic.
	 */
	public Integer getBloodpressure_systolic();

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/systolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_systolic(Integer v) ;

	/**
	 * @return Returns the BloodPressure/diastolic.
	 */
	public Integer getBloodpressure_diastolic();

	/**
	 * Sets the value for ext:clinicalAssessmentData/BloodPressure/diastolic.
	 * @param v Value to Set.
	 */
	public void setBloodpressure_diastolic(Integer v) ;

	/**
	 * @return Returns the Neuro/SBT.
	 */
	public Integer getNeuro_sbt();

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/SBT.
	 * @param v Value to Set.
	 */
	public void setNeuro_sbt(Integer v) ;

	/**
	 * @return Returns the Neuro/MMSE.
	 */
	public Integer getNeuro_mmse();

	/**
	 * Sets the value for ext:clinicalAssessmentData/Neuro/MMSE.
	 * @param v Value to Set.
	 */
	public void setNeuro_mmse(Integer v) ;

	/**
	 * @return Returns the Neuro/Bdsc.
	 */
	public Double getNeuro_bdsc();

	/**
	 * Sets the value for Neuro/Bdsc.
	 * @param v Value to Set.
	 */
	public void setNeuro_bdsc(Double v);

	/**
	 * @return Returns the Neuro/CDR/memory.
	 */
	public Double getNeuro_cdr_memory();

	/**
	 * Sets the value for Neuro/CDR/memory.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_memory(Double v);

	/**
	 * @return Returns the Neuro/CDR/orientation.
	 */
	public Double getNeuro_cdr_orientation();

	/**
	 * Sets the value for Neuro/CDR/orientation.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_orientation(Double v);

	/**
	 * @return Returns the Neuro/CDR/judgment_problem_solving.
	 */
	public Double getNeuro_cdr_judgmentProblemSolving();

	/**
	 * Sets the value for Neuro/CDR/judgment_problem_solving.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_judgmentProblemSolving(Double v);

	/**
	 * @return Returns the Neuro/CDR/community_affairs.
	 */
	public Double getNeuro_cdr_communityAffairs();

	/**
	 * Sets the value for Neuro/CDR/community_affairs.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_communityAffairs(Double v);

	/**
	 * @return Returns the Neuro/CDR/home_hobbies.
	 */
	public Double getNeuro_cdr_homeHobbies();

	/**
	 * Sets the value for Neuro/CDR/home_hobbies.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_homeHobbies(Double v);

	/**
	 * @return Returns the Neuro/CDR/personal_care.
	 */
	public Double getNeuro_cdr_personalCare();

	/**
	 * Sets the value for Neuro/CDR/personal_care.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_personalCare(Double v);

	/**
	 * @return Returns the Neuro/CDR/sumbox.
	 */
	public Double getNeuro_cdr_sumbox();

	/**
	 * Sets the value for Neuro/CDR/sumbox.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_sumbox(Double v);

	/**
	 * @return Returns the Neuro/CDR/rating.
	 */
	public Double getNeuro_cdr_rating();

	/**
	 * Sets the value for Neuro/CDR/rating.
	 * @param v Value to Set.
	 */
	public void setNeuro_cdr_rating(Double v);

	/**
	 * @return Returns the Neuro/ThinkingProblem_S_Bool.
	 */
	public Boolean getNeuro_thinkingproblemSbool();

	/**
	 * Sets the value for Neuro/ThinkingProblem_S_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemSbool(Object v);

	/**
	 * @return Returns the Neuro/ThinkingProblem_CS_Bool.
	 */
	public Boolean getNeuro_thinkingproblemCsBool();

	/**
	 * Sets the value for Neuro/ThinkingProblem_CS_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_thinkingproblemCsBool(Object v);

	/**
	 * @return Returns the Neuro/ConsMemoryProblem_Bool.
	 */
	public Boolean getNeuro_consmemoryproblemBool();

	/**
	 * Sets the value for Neuro/ConsMemoryProblem_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_consmemoryproblemBool(Object v);

	/**
	 * @return Returns the Neuro/StrokeBool.
	 */
	public Boolean getNeuro_strokebool();

	/**
	 * Sets the value for Neuro/StrokeBool.
	 * @param v Value to Set.
	 */
	public void setNeuro_strokebool(Object v);

	/**
	 * @return Returns the Neuro/Sx_Stroke_Bool.
	 */
	public Boolean getNeuro_sxStrokeBool();

	/**
	 * Sets the value for Neuro/Sx_Stroke_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxStrokeBool(Object v);

	/**
	 * @return Returns the Neuro/Sx_Tia_Bool.
	 */
	public Boolean getNeuro_sxTiaBool();

	/**
	 * Sets the value for Neuro/Sx_Tia_Bool.
	 * @param v Value to Set.
	 */
	public void setNeuro_sxTiaBool(Object v);

	/**
	 * @return Returns the Movement/Spasticity_Bool.
	 */
	public Boolean getMovement_spasticityBool();

	/**
	 * Sets the value for Movement/Spasticity_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_spasticityBool(Object v);

	/**
	 * @return Returns the Movement/Rigid.
	 */
	public Integer getMovement_rigid();

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Rigid.
	 * @param v Value to Set.
	 */
	public void setMovement_rigid(Integer v) ;

	/**
	 * @return Returns the Movement/Bradyk_Bool.
	 */
	public Boolean getMovement_bradykBool();

	/**
	 * Sets the value for Movement/Bradyk_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_bradykBool(Object v);

	/**
	 * @return Returns the Movement/Gait.
	 */
	public Integer getMovement_gait();

	/**
	 * Sets the value for ext:clinicalAssessmentData/Movement/Gait.
	 * @param v Value to Set.
	 */
	public void setMovement_gait(Integer v) ;

	/**
	 * @return Returns the Movement/AbnormalGait_Bool.
	 */
	public Boolean getMovement_abnormalgaitBool();

	/**
	 * Sets the value for Movement/AbnormalGait_Bool.
	 * @param v Value to Set.
	 */
	public void setMovement_abnormalgaitBool(Object v);

	/**
	 * Medication
	 * @return Returns an List of org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> List<A> getMedication();

	/**
	 * Medication
	 * @return Returns an List of org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI
	 */
	public <A extends org.nrg.xdat.model.ExtClinicalassessmentdataMedicationI> void addMedication(A item) throws Exception;

	/**
	 * @return Returns the Weight.
	 */
	public Integer getWeight();

	/**
	 * Sets the value for ext:clinicalAssessmentData/Weight.
	 * @param v Value to Set.
	 */
	public void setWeight(Integer v) ;

	/**
	 * @return Returns the Diabetes_Bool.
	 */
	public Boolean getDiabetesBool();

	/**
	 * Sets the value for Diabetes_Bool.
	 * @param v Value to Set.
	 */
	public void setDiabetesBool(Object v);

	/**
	 * @return Returns the HeartProblems_Bool.
	 */
	public Boolean getHeartproblemsBool();

	/**
	 * Sets the value for HeartProblems_Bool.
	 * @param v Value to Set.
	 */
	public void setHeartproblemsBool(Object v);

	/**
	 * @return Returns the TobaccoUse_Bool.
	 */
	public Boolean getTobaccouseBool();

	/**
	 * Sets the value for TobaccoUse_Bool.
	 * @param v Value to Set.
	 */
	public void setTobaccouseBool(Object v);
}
