/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface ProvProcessI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * processStep
	 * @return Returns an List of org.nrg.xdat.model.ProvProcessstepI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepI> List<A> getProcessstep();

	/**
	 * processStep
	 * @return Returns an List of org.nrg.xdat.model.ProvProcessstepI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepI> void addProcessstep(A item) throws Exception;

	/**
	 * @return Returns the prov_process_id.
	 */
	public Integer getProvProcessId();
}
