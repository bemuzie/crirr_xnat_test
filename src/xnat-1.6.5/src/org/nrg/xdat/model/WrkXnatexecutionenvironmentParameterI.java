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
public interface WrkXnatexecutionenvironmentParameterI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the parameter.
	 */
	public String getParameter();

	/**
	 * Sets the value for parameter.
	 * @param v Value to Set.
	 */
	public void setParameter(String v);

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
	 * @return Returns the wrk_xnatExecutionEnvironment_parameter_id.
	 */
	public Integer getWrkXnatexecutionenvironmentParameterId();
}
