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
public interface PipePipelinedetailsI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the path.
	 */
	public String getPath();

	/**
	 * Sets the value for path.
	 * @param v Value to Set.
	 */
	public void setPath(String v);

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
	 * generatesElements/element
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsElementI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsElementI> List<A> getGenerateselements_element();

	/**
	 * generatesElements/element
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsElementI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsElementI> void addGenerateselements_element(A item) throws Exception;

	/**
	 * @return Returns the customwebpage.
	 */
	public String getCustomwebpage();

	/**
	 * Sets the value for customwebpage.
	 * @param v Value to Set.
	 */
	public void setCustomwebpage(String v);

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsParameterI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsParameterI> List<A> getParameters_parameter();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.PipePipelinedetailsParameterI
	 */
	public <A extends org.nrg.xdat.model.PipePipelinedetailsParameterI> void addParameters_parameter(A item) throws Exception;

	/**
	 * @return Returns the appliesTo.
	 */
	public String getAppliesto();

	/**
	 * Sets the value for appliesTo.
	 * @param v Value to Set.
	 */
	public void setAppliesto(String v);
}
