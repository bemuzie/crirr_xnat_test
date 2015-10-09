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
public interface ArcPipelinedataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the displayText.
	 */
	public String getDisplaytext();

	/**
	 * Sets the value for displayText.
	 * @param v Value to Set.
	 */
	public void setDisplaytext(String v);

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
	 * @return Returns the location.
	 */
	public String getLocation();

	/**
	 * Sets the value for location.
	 * @param v Value to Set.
	 */
	public void setLocation(String v);

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
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.ArcPipelineparameterdataI
	 */
	public <A extends org.nrg.xdat.model.ArcPipelineparameterdataI> List<A> getParameters_parameter();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.ArcPipelineparameterdataI
	 */
	public <A extends org.nrg.xdat.model.ArcPipelineparameterdataI> void addParameters_parameter(A item) throws Exception;

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
	 * @return Returns the arc_pipelineData_id.
	 */
	public Integer getArcPipelinedataId();
}
