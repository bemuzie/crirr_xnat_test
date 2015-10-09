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
public interface XnatSubjectassessordataI extends XnatExperimentdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the subject_ID.
	 */
	public String getSubjectId();

	/**
	 * Sets the value for subject_ID.
	 * @param v Value to Set.
	 */
	public void setSubjectId(String v);

	/**
	 * @return Returns the age.
	 */
	public Double getAge();

	/**
	 * Sets the value for age.
	 * @param v Value to Set.
	 */
	public void setAge(Double v);
}
