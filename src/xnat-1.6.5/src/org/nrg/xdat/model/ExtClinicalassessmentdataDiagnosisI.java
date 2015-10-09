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
public interface ExtClinicalassessmentdataDiagnosisI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the Diagnosis.
	 */
	public String getDiagnosis();

	/**
	 * Sets the value for Diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v);

	/**
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);

	/**
	 * @return Returns the number.
	 */
	public Integer getNumber();

	/**
	 * Sets the value for ext:clinicalAssessmentData_Diagnosis/number.
	 * @param v Value to Set.
	 */
	public void setNumber(Integer v) ;

	/**
	 * @return Returns the ext_clinicalAssessmentData_Diagnosis_id.
	 */
	public Integer getExtClinicalassessmentdataDiagnosisId();
}
