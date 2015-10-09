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
public interface XnatCtscandataFocalspotI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the focalSpot.
	 */
	public Double getFocalspot();

	/**
	 * Sets the value for focalSpot.
	 * @param v Value to Set.
	 */
	public void setFocalspot(Double v);

	/**
	 * @return Returns the xnat_ctScanData_focalSpot_id.
	 */
	public Integer getXnatCtscandataFocalspotId();
}
