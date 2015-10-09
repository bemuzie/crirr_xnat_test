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
public interface XnatExperimentdataShareI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the share.
	 */
	public String getShare();

	/**
	 * Sets the value for share.
	 * @param v Value to Set.
	 */
	public void setShare(String v);

	/**
	 * @return Returns the label.
	 */
	public String getLabel();

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v);

	/**
	 * @return Returns the project.
	 */
	public String getProject();

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v);

	/**
	 * @return Returns the visit.
	 */
	public String getVisit();

	/**
	 * Sets the value for visit.
	 * @param v Value to Set.
	 */
	public void setVisit(String v);

	/**
	 * @return Returns the protocol.
	 */
	public String getProtocol();

	/**
	 * Sets the value for protocol.
	 * @param v Value to Set.
	 */
	public void setProtocol(String v);

	/**
	 * @return Returns the xnat_experimentData_share_id.
	 */
	public Integer getXnatExperimentdataShareId();
}
