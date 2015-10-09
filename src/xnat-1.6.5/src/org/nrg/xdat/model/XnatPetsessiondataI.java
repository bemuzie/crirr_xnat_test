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
public interface XnatPetsessiondataI extends XnatImagesessiondataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the stabilization.
	 */
	public String getStabilization();

	/**
	 * Sets the value for stabilization.
	 * @param v Value to Set.
	 */
	public void setStabilization(String v);

	/**
	 * @return Returns the studyType.
	 */
	public String getStudytype();

	/**
	 * Sets the value for studyType.
	 * @param v Value to Set.
	 */
	public void setStudytype(String v);

	/**
	 * @return Returns the patientID.
	 */
	public String getPatientid();

	/**
	 * Sets the value for patientID.
	 * @param v Value to Set.
	 */
	public void setPatientid(String v);

	/**
	 * @return Returns the patientName.
	 */
	public String getPatientname();

	/**
	 * Sets the value for patientName.
	 * @param v Value to Set.
	 */
	public void setPatientname(String v);

	/**
	 * @return Returns the tracer/dose/units.
	 */
	public String getTracer_dose_units();

	/**
	 * Sets the value for tracer/dose/units.
	 * @param v Value to Set.
	 */
	public void setTracer_dose_units(String v);

	/**
	 * @return Returns the tracer/dose.
	 */
	public Double getTracer_dose();

	/**
	 * Sets the value for tracer/dose.
	 * @param v Value to Set.
	 */
	public void setTracer_dose(Double v);

	/**
	 * @return Returns the tracer/specificActivity.
	 */
	public Double getTracer_specificactivity();

	/**
	 * Sets the value for tracer/specificActivity.
	 * @param v Value to Set.
	 */
	public void setTracer_specificactivity(Double v);

	/**
	 * @return Returns the tracer/totalMass/units.
	 */
	public String getTracer_totalmass_units();

	/**
	 * Sets the value for tracer/totalMass/units.
	 * @param v Value to Set.
	 */
	public void setTracer_totalmass_units(String v);

	/**
	 * @return Returns the tracer/totalMass.
	 */
	public Double getTracer_totalmass();

	/**
	 * Sets the value for tracer/totalMass.
	 * @param v Value to Set.
	 */
	public void setTracer_totalmass(Double v);

	/**
	 * @return Returns the tracer/intermediate/units.
	 */
	public String getTracer_intermediate_units();

	/**
	 * Sets the value for tracer/intermediate/units.
	 * @param v Value to Set.
	 */
	public void setTracer_intermediate_units(String v);

	/**
	 * @return Returns the tracer/intermediate.
	 */
	public Double getTracer_intermediate();

	/**
	 * Sets the value for tracer/intermediate.
	 * @param v Value to Set.
	 */
	public void setTracer_intermediate(Double v);

	/**
	 * @return Returns the tracer/isotope/half-life.
	 */
	public Double getTracer_isotope_halfLife();

	/**
	 * Sets the value for tracer/isotope/half-life.
	 * @param v Value to Set.
	 */
	public void setTracer_isotope_halfLife(Double v);

	/**
	 * @return Returns the tracer/isotope.
	 */
	public String getTracer_isotope();

	/**
	 * Sets the value for tracer/isotope.
	 * @param v Value to Set.
	 */
	public void setTracer_isotope(String v);

	/**
	 * @return Returns the tracer/transmissions.
	 */
	public Integer getTracer_transmissions();

	/**
	 * Sets the value for xnat:petSessionData/tracer/transmissions.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissions(Integer v) ;

	/**
	 * @return Returns the tracer/transmissions_starttime.
	 */
	public Object getTracer_transmissionsStarttime();

	/**
	 * Sets the value for tracer/transmissions_starttime.
	 * @param v Value to Set.
	 */
	public void setTracer_transmissionsStarttime(Object v);

	/**
	 * @return Returns the tracer/name.
	 */
	public String getTracer_name();

	/**
	 * Sets the value for tracer/name.
	 * @param v Value to Set.
	 */
	public void setTracer_name(String v);

	/**
	 * @return Returns the tracer/startTime.
	 */
	public Object getTracer_starttime();

	/**
	 * Sets the value for tracer/startTime.
	 * @param v Value to Set.
	 */
	public void setTracer_starttime(Object v);

	/**
	 * @return Returns the start_time.
	 */
	public Object getStartTime();

	/**
	 * Sets the value for start_time.
	 * @param v Value to Set.
	 */
	public void setStartTime(Object v);

	/**
	 * @return Returns the start_time_scan.
	 */
	public Object getStartTimeScan();

	/**
	 * Sets the value for start_time_scan.
	 * @param v Value to Set.
	 */
	public void setStartTimeScan(Object v);

	/**
	 * @return Returns the start_time_injection.
	 */
	public Object getStartTimeInjection();

	/**
	 * Sets the value for start_time_injection.
	 * @param v Value to Set.
	 */
	public void setStartTimeInjection(Object v);

	/**
	 * @return Returns the blood_glucose.
	 */
	public Double getBloodGlucose();

	/**
	 * Sets the value for blood_glucose.
	 * @param v Value to Set.
	 */
	public void setBloodGlucose(Double v);

	/**
	 * @return Returns the blood_glucose_units.
	 */
	public String getBloodGlucoseUnits();

	/**
	 * Sets the value for blood_glucose_units.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseUnits(String v);

	/**
	 * @return Returns the blood_glucose_time.
	 */
	public Object getBloodGlucoseTime();

	/**
	 * Sets the value for blood_glucose_time.
	 * @param v Value to Set.
	 */
	public void setBloodGlucoseTime(Object v);
}
