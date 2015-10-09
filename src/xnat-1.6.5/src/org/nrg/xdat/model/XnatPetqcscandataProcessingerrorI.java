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
public interface XnatPetqcscandataProcessingerrorI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the processingError.
	 */
	public String getProcessingerror();

	/**
	 * Sets the value for processingError.
	 * @param v Value to Set.
	 */
	public void setProcessingerror(String v);

	/**
	 * @return Returns the xnat_petQcScanData_processingError_id.
	 */
	public Integer getXnatPetqcscandataProcessingerrorId();
}
