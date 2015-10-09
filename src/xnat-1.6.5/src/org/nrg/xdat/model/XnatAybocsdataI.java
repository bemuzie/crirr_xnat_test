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
public interface XnatAybocsdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the currentOrWorstEver.
	 */
	public String getCurrentorworstever();

	/**
	 * Sets the value for currentOrWorstEver.
	 * @param v Value to Set.
	 */
	public void setCurrentorworstever(String v);

	/**
	 * @return Returns the timeOccupiedWithThoughts.
	 */
	public Integer getTimeoccupiedwiththoughts();

	/**
	 * Sets the value for xnat_a:ybocsData/timeOccupiedWithThoughts.
	 * @param v Value to Set.
	 */
	public void setTimeoccupiedwiththoughts(Integer v) ;

	/**
	 * @return Returns the thoughtsInterfereFunctioning.
	 */
	public Integer getThoughtsinterferefunctioning();

	/**
	 * Sets the value for xnat_a:ybocsData/thoughtsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setThoughtsinterferefunctioning(Integer v) ;

	/**
	 * @return Returns the distressCaused.
	 */
	public Integer getDistresscaused();

	/**
	 * Sets the value for xnat_a:ybocsData/distressCaused.
	 * @param v Value to Set.
	 */
	public void setDistresscaused(Integer v) ;

	/**
	 * @return Returns the effortToResistThoughts.
	 */
	public Integer getEfforttoresistthoughts();

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistThoughts.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistthoughts(Integer v) ;

	/**
	 * @return Returns the controlOverThoughts.
	 */
	public Integer getControloverthoughts();

	/**
	 * Sets the value for xnat_a:ybocsData/controlOverThoughts.
	 * @param v Value to Set.
	 */
	public void setControloverthoughts(Integer v) ;

	/**
	 * @return Returns the timePerforming.
	 */
	public Integer getTimeperforming();

	/**
	 * Sets the value for xnat_a:ybocsData/timePerforming.
	 * @param v Value to Set.
	 */
	public void setTimeperforming(Integer v) ;

	/**
	 * @return Returns the behaviorsInterfereFunctioning.
	 */
	public Integer getBehaviorsinterferefunctioning();

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorsInterfereFunctioning.
	 * @param v Value to Set.
	 */
	public void setBehaviorsinterferefunctioning(Integer v) ;

	/**
	 * @return Returns the feelingIfPrevented.
	 */
	public Integer getFeelingifprevented();

	/**
	 * Sets the value for xnat_a:ybocsData/feelingIfPrevented.
	 * @param v Value to Set.
	 */
	public void setFeelingifprevented(Integer v) ;

	/**
	 * @return Returns the effortToResistBehaviors.
	 */
	public Integer getEfforttoresistbehaviors();

	/**
	 * Sets the value for xnat_a:ybocsData/effortToResistBehaviors.
	 * @param v Value to Set.
	 */
	public void setEfforttoresistbehaviors(Integer v) ;

	/**
	 * @return Returns the behaviorDriveStrength.
	 */
	public Integer getBehaviordrivestrength();

	/**
	 * Sets the value for xnat_a:ybocsData/behaviorDriveStrength.
	 * @param v Value to Set.
	 */
	public void setBehaviordrivestrength(Integer v) ;

	/**
	 * @return Returns the untilJustRight.
	 */
	public Boolean getUntiljustright();

	/**
	 * Sets the value for untilJustRight.
	 * @param v Value to Set.
	 */
	public void setUntiljustright(Object v);

	/**
	 * @return Returns the untilJustRightAwareness.
	 */
	public String getUntiljustrightawareness();

	/**
	 * Sets the value for untilJustRightAwareness.
	 * @param v Value to Set.
	 */
	public void setUntiljustrightawareness(String v);

	/**
	 * @return Returns the untilJustRightPerceptions.
	 */
	public String getUntiljustrightperceptions();

	/**
	 * Sets the value for untilJustRightPerceptions.
	 * @param v Value to Set.
	 */
	public void setUntiljustrightperceptions(String v);

	/**
	 * @return Returns the whenStartUntilJustRight.
	 */
	public String getWhenstartuntiljustright();

	/**
	 * Sets the value for whenStartUntilJustRight.
	 * @param v Value to Set.
	 */
	public void setWhenstartuntiljustright(String v);

	/**
	 * @return Returns the frequencyUntilJustRight.
	 */
	public String getFrequencyuntiljustright();

	/**
	 * Sets the value for frequencyUntilJustRight.
	 * @param v Value to Set.
	 */
	public void setFrequencyuntiljustright(String v);

	/**
	 * @return Returns the firstUntilJustRightAge.
	 */
	public Double getFirstuntiljustrightage();

	/**
	 * Sets the value for firstUntilJustRightAge.
	 * @param v Value to Set.
	 */
	public void setFirstuntiljustrightage(Double v);
}
