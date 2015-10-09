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
public interface ArcFieldspecificationI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the fieldSpecification.
	 */
	public String getFieldspecification();

	/**
	 * Sets the value for fieldSpecification.
	 * @param v Value to Set.
	 */
	public void setFieldspecification(String v);

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
	 * @return Returns the arc_fieldSpecification_id.
	 */
	public Integer getArcFieldspecificationId();
}
