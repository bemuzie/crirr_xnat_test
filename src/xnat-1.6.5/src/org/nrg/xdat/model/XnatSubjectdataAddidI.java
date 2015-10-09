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
public interface XnatSubjectdataAddidI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the addID.
	 */
	public String getAddid();

	/**
	 * Sets the value for addID.
	 * @param v Value to Set.
	 */
	public void setAddid(String v);

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
	 * @return Returns the xnat_subjectData_addID_id.
	 */
	public Integer getXnatSubjectdataAddidId();
}
