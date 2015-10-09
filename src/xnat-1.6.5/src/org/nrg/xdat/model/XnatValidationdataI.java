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
public interface XnatValidationdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the method.
	 */
	public String getMethod();

	/**
	 * Sets the value for method.
	 * @param v Value to Set.
	 */
	public void setMethod(String v);

	/**
	 * @return Returns the date.
	 */
	public Object getDate();

	/**
	 * Sets the value for date.
	 * @param v Value to Set.
	 */
	public void setDate(Object v);

	/**
	 * @return Returns the notes.
	 */
	public String getNotes();

	/**
	 * Sets the value for notes.
	 * @param v Value to Set.
	 */
	public void setNotes(String v);

	/**
	 * @return Returns the validated_by.
	 */
	public String getValidatedBy();

	/**
	 * Sets the value for validated_by.
	 * @param v Value to Set.
	 */
	public void setValidatedBy(String v);

	/**
	 * @return Returns the status.
	 */
	public String getStatus();

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v);

	/**
	 * @return Returns the xnat_validationData_id.
	 */
	public Integer getXnatValidationdataId();
}
