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
public interface XnatSubjectvariablesdataVariableI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the variable.
	 */
	public String getVariable();

	/**
	 * Sets the value for variable.
	 * @param v Value to Set.
	 */
	public void setVariable(String v);

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
	 * @return Returns the xnat_subjectVariablesData_variable_id.
	 */
	public Integer getXnatSubjectvariablesdataVariableId();
}
