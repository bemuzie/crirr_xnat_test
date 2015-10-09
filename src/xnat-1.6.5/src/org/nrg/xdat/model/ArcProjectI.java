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
public interface ArcProjectI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * paths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public org.nrg.xdat.model.ArcPathinfoI getPaths();

	/**
	 * paths
	 * @return org.nrg.xdat.model.ArcPathinfoI
	 */
	public <A extends org.nrg.xdat.model.ArcPathinfoI> void setPaths(A item) throws Exception;

	/**
	 * @return Returns the arc:project/paths_arc_pathinfo_id.
	 */
	public Integer getPathsFK();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> List<A> getFieldspecifications_fieldspecification();

	/**
	 * fieldSpecifications/fieldSpecification
	 * @return Returns an List of org.nrg.xdat.model.ArcFieldspecificationI
	 */
	public <A extends org.nrg.xdat.model.ArcFieldspecificationI> void addFieldspecifications_fieldspecification(A item) throws Exception;

	/**
	 * properties/property
	 * @return Returns an List of org.nrg.xdat.model.ArcPropertyI
	 */
	public <A extends org.nrg.xdat.model.ArcPropertyI> List<A> getProperties_property();

	/**
	 * properties/property
	 * @return Returns an List of org.nrg.xdat.model.ArcPropertyI
	 */
	public <A extends org.nrg.xdat.model.ArcPropertyI> void addProperties_property(A item) throws Exception;

	/**
	 * pipelines/descendants/descendant
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectDescendantI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantI> List<A> getPipelines_descendants_descendant();

	/**
	 * pipelines/descendants/descendant
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectDescendantI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectDescendantI> void addPipelines_descendants_descendant(A item) throws Exception;

	/**
	 * pipelines/pipeline
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectPipelineI> List<A> getPipelines_pipeline();

	/**
	 * pipelines/pipeline
	 * @return Returns an List of org.nrg.xdat.model.ArcProjectPipelineI
	 */
	public <A extends org.nrg.xdat.model.ArcProjectPipelineI> void addPipelines_pipeline(A item) throws Exception;

	/**
	 * @return Returns the id.
	 */
	public String getId();

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(String v);

	/**
	 * @return Returns the current_arc.
	 */
	public String getCurrentArc();

	/**
	 * Sets the value for current_arc.
	 * @param v Value to Set.
	 */
	public void setCurrentArc(String v);

	/**
	 * @return Returns the quarantine_code.
	 */
	public Integer getQuarantineCode();

	/**
	 * Sets the value for arc:project/quarantine_code.
	 * @param v Value to Set.
	 */
	public void setQuarantineCode(Integer v) ;

	/**
	 * @return Returns the prearchive_code.
	 */
	public Integer getPrearchiveCode();

	/**
	 * Sets the value for arc:project/prearchive_code.
	 * @param v Value to Set.
	 */
	public void setPrearchiveCode(Integer v) ;

	/**
	 * @return Returns the arc_project_id.
	 */
	public Integer getArcProjectId();
}
