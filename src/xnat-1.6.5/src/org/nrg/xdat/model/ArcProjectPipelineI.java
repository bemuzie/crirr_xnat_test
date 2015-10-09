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
public interface ArcProjectPipelineI extends ArcPipelinedataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the stepId.
	 */
	public String getStepid();

	/**
	 * Sets the value for stepId.
	 * @param v Value to Set.
	 */
	public void setStepid(String v);

	/**
	 * @return Returns the dependent.
	 */
	public Boolean getDependent();

	/**
	 * Sets the value for dependent.
	 * @param v Value to Set.
	 */
	public void setDependent(Object v);
}
