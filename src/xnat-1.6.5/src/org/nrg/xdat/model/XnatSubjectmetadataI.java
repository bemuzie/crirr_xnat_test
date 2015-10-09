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
public interface XnatSubjectmetadataI extends XnatAbstractsubjectmetadataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the cohort.
	 */
	public String getCohort();

	/**
	 * Sets the value for cohort.
	 * @param v Value to Set.
	 */
	public void setCohort(String v);
}
