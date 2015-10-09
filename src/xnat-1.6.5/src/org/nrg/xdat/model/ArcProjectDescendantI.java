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
public interface ArcProjectDescendantI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * pipeline
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectDescendantPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantPipelineI> List<A> getPipeline();

	/**
	 * pipeline
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectDescendantPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantPipelineI> void addPipeline(A item) throws Exception;

	/**
	 * @return Returns the xsiType.
	 */
	public String getXsitype();

	/**
	 * Sets the value for xsiType.
	 * @param v Value to Set.
	 */
	public void setXsitype(String v);

	/**
	 * @return Returns the arc_project_descendant_id.
	 */
	public Integer getArcProjectDescendantId();
}
