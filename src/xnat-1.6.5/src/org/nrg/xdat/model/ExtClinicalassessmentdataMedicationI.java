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
public interface ExtClinicalassessmentdataMedicationI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the name.
	 */
	public String getName();

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v);

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
	 * @return Returns the dose.
	 */
	public String getDose();

	/**
	 * Sets the value for dose.
	 * @param v Value to Set.
	 */
	public void setDose(String v);

	/**
	 * @return Returns the history.
	 */
	public String getHistory();

	/**
	 * Sets the value for history.
	 * @param v Value to Set.
	 */
	public void setHistory(String v);

	/**
	 * @return Returns the ext_clinicalAssessmentData_Medication_id.
	 */
	public Integer getExtClinicalassessmentdataMedicationId();
}
