/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface XnatAygtssdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the filledOutBy.
	 */
	public String getFilledoutby();

	/**
	 * Sets the value for filledOutBy.
	 * @param v Value to Set.
	 */
	public void setFilledoutby(String v);

	/**
	 * @return Returns the period.
	 */
	public String getPeriod();

	/**
	 * Sets the value for period.
	 * @param v Value to Set.
	 */
	public void setPeriod(String v);

	/**
	 * @return Returns the worstEverAge.
	 */
	public Double getWorsteverage();

	/**
	 * Sets the value for worstEverAge.
	 * @param v Value to Set.
	 */
	public void setWorsteverage(Double v);

	/**
	 * @return Returns the motor/number.
	 */
	public Integer getMotor_number();

	/**
	 * Sets the value for xnat_a:ygtssData/motor/number.
	 * @param v Value to Set.
	 */
	public void setMotor_number(Integer v) ;

	/**
	 * @return Returns the motor/frequency.
	 */
	public Integer getMotor_frequency();

	/**
	 * Sets the value for xnat_a:ygtssData/motor/frequency.
	 * @param v Value to Set.
	 */
	public void setMotor_frequency(Integer v) ;

	/**
	 * @return Returns the motor/intensity.
	 */
	public Integer getMotor_intensity();

	/**
	 * Sets the value for xnat_a:ygtssData/motor/intensity.
	 * @param v Value to Set.
	 */
	public void setMotor_intensity(Integer v) ;

	/**
	 * @return Returns the motor/complexity.
	 */
	public Integer getMotor_complexity();

	/**
	 * Sets the value for xnat_a:ygtssData/motor/complexity.
	 * @param v Value to Set.
	 */
	public void setMotor_complexity(Integer v) ;

	/**
	 * @return Returns the motor/interference.
	 */
	public Integer getMotor_interference();

	/**
	 * Sets the value for xnat_a:ygtssData/motor/interference.
	 * @param v Value to Set.
	 */
	public void setMotor_interference(Integer v) ;

	/**
	 * @return Returns the motor/inventory.
	 */
	public String getMotor_inventory();

	/**
	 * Sets the value for motor/inventory.
	 * @param v Value to Set.
	 */
	public void setMotor_inventory(String v);

	/**
	 * @return Returns the phonic/number.
	 */
	public Integer getPhonic_number();

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/number.
	 * @param v Value to Set.
	 */
	public void setPhonic_number(Integer v) ;

	/**
	 * @return Returns the phonic/frequency.
	 */
	public Integer getPhonic_frequency();

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/frequency.
	 * @param v Value to Set.
	 */
	public void setPhonic_frequency(Integer v) ;

	/**
	 * @return Returns the phonic/intensity.
	 */
	public Integer getPhonic_intensity();

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/intensity.
	 * @param v Value to Set.
	 */
	public void setPhonic_intensity(Integer v) ;

	/**
	 * @return Returns the phonic/complexity.
	 */
	public Integer getPhonic_complexity();

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/complexity.
	 * @param v Value to Set.
	 */
	public void setPhonic_complexity(Integer v) ;

	/**
	 * @return Returns the phonic/interference.
	 */
	public Integer getPhonic_interference();

	/**
	 * Sets the value for xnat_a:ygtssData/phonic/interference.
	 * @param v Value to Set.
	 */
	public void setPhonic_interference(Integer v) ;

	/**
	 * @return Returns the phonic/inventory.
	 */
	public String getPhonic_inventory();

	/**
	 * Sets the value for phonic/inventory.
	 * @param v Value to Set.
	 */
	public void setPhonic_inventory(String v);

	/**
	 * @return Returns the impairment.
	 */
	public Integer getImpairment();

	/**
	 * Sets the value for xnat_a:ygtssData/impairment.
	 * @param v Value to Set.
	 */
	public void setImpairment(Integer v) ;
}
