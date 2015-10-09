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
public interface XnatContrastbolusI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the agent.
	 */
	public String getAgent();

	/**
	 * Sets the value for agent.
	 * @param v Value to Set.
	 */
	public void setAgent(String v);

	/**
	 * @return Returns the route.
	 */
	public String getRoute();

	/**
	 * Sets the value for route.
	 * @param v Value to Set.
	 */
	public void setRoute(String v);

	/**
	 * @return Returns the volume.
	 */
	public Double getVolume();

	/**
	 * Sets the value for volume.
	 * @param v Value to Set.
	 */
	public void setVolume(Double v);

	/**
	 * @return Returns the totalDose.
	 */
	public Double getTotaldose();

	/**
	 * Sets the value for totalDose.
	 * @param v Value to Set.
	 */
	public void setTotaldose(Double v);

	/**
	 * @return Returns the flowRate.
	 */
	public Double getFlowrate();

	/**
	 * Sets the value for flowRate.
	 * @param v Value to Set.
	 */
	public void setFlowrate(Double v);

	/**
	 * @return Returns the flowDuration.
	 */
	public Double getFlowduration();

	/**
	 * Sets the value for flowDuration.
	 * @param v Value to Set.
	 */
	public void setFlowduration(Double v);

	/**
	 * @return Returns the activeIngredient.
	 */
	public String getActiveingredient();

	/**
	 * Sets the value for activeIngredient.
	 * @param v Value to Set.
	 */
	public void setActiveingredient(String v);

	/**
	 * @return Returns the concentration.
	 */
	public Double getConcentration();

	/**
	 * Sets the value for concentration.
	 * @param v Value to Set.
	 */
	public void setConcentration(Double v);

	/**
	 * @return Returns the xnat_contrastBolus_id.
	 */
	public Integer getXnatContrastbolusId();
}
