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
public interface PipePipelinedetailsParameterI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * @return Returns the values/schemaLink.
	 */
	public String getValues_schemalink();

	/**
	 * Sets the value for values/schemaLink.
	 * @param v Value to Set.
	 */
	public void setValues_schemalink(String v);

	/**
	 * @return Returns the values/csvValues.
	 */
	public String getValues_csvvalues();

	/**
	 * Sets the value for values/csvValues.
	 * @param v Value to Set.
	 */
	public void setValues_csvvalues(String v);

	/**
	 * @return Returns the description.
	 */
	public String getDescription();

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v);

	/**
	 * @return Returns the pipe_pipelineDetails_parameter_id.
	 */
	public Integer getPipePipelinedetailsParameterId();
}
