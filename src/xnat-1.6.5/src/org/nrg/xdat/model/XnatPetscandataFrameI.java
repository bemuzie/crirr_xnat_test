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
public interface XnatPetscandataFrameI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the number.
	 */
	public Object getNumber();

	/**
	 * Sets the value for number.
	 * @param v Value to Set.
	 */
	public void setNumber(Object v);

	/**
	 * @return Returns the starttime.
	 */
	public Double getStarttime();

	/**
	 * Sets the value for starttime.
	 * @param v Value to Set.
	 */
	public void setStarttime(Double v);

	/**
	 * @return Returns the length.
	 */
	public Double getLength();

	/**
	 * Sets the value for length.
	 * @param v Value to Set.
	 */
	public void setLength(Double v);

	/**
	 * @return Returns the units.
	 */
	public String getUnits();

	/**
	 * Sets the value for units.
	 * @param v Value to Set.
	 */
	public void setUnits(String v);

	/**
	 * @return Returns the xnat_petScanData_frame_id.
	 */
	public Integer getXnatPetscandataFrameId();
}
