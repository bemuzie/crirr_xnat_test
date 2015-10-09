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
public interface PipePipelinerepositoryI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * pipeline
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsI> List<A> getPipeline();

	/**
	 * pipeline
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsI> void addPipeline(A item) throws Exception;

	/**
	 * @return Returns the pipe_PipelineRepository_id.
	 */
	public Integer getPipePipelinerepositoryId();
}
