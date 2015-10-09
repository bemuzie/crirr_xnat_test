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
public interface XnatReconstructedimagedataScanidI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the scanID.
	 */
	public String getScanid();

	/**
	 * Sets the value for scanID.
	 * @param v Value to Set.
	 */
	public void setScanid(String v);

	/**
	 * @return Returns the xnat_reconstructedImageData_scanID_id.
	 */
	public Integer getXnatReconstructedimagedataScanidId();
}
