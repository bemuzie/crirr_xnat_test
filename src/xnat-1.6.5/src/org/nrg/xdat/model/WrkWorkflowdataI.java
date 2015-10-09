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
public interface WrkWorkflowdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * executionEnvironment
	 * @return org.nrg.xdat.model.WrkAbstractexecutionenvironmentI
	 */
	public org.nrg.xdat.model.WrkAbstractexecutionenvironmentI getExecutionenvironment();

	/**
	 * executionEnvironment
	 * @return org.nrg.xdat.model.WrkAbstractexecutionenvironmentI
	 */
	public <A extends org.nrg.xdat.model.WrkAbstractexecutionenvironmentI> void setExecutionenvironment(A item) throws Exception;

	/**
	 * @return Returns the wrk:workflowData/executionenvironment_wrk_abstractexecutionenvironment_id.
	 */
	public Integer getExecutionenvironmentFK();

	/**
	 * @return Returns the comments.
	 */
	public String getComments();

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v);

	/**
	 * @return Returns the details.
	 */
	public String getDetails();

	/**
	 * Sets the value for details.
	 * @param v Value to Set.
	 */
	public void setDetails(String v);

	/**
	 * @return Returns the justification.
	 */
	public String getJustification();

	/**
	 * Sets the value for justification.
	 * @param v Value to Set.
	 */
	public void setJustification(String v);

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
	 * @return Returns the src.
	 */
	public String getSrc();

	/**
	 * Sets the value for src.
	 * @param v Value to Set.
	 */
	public void setSrc(String v);

	/**
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);

	/**
	 * @return Returns the category.
	 */
	public String getCategory();

	/**
	 * Sets the value for category.
	 * @param v Value to Set.
	 */
	public void setCategory(String v);

	/**
	 * @return Returns the data_type.
	 */
	public String getDataType();

	/**
	 * Sets the value for data_type.
	 * @param v Value to Set.
	 */
	public void setDataType(String v);

	/**
	 * @return Returns the ID.
	 */
	public String getId();

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v);

	/**
	 * @return Returns the ExternalID.
	 */
	public String getExternalid();

	/**
	 * Sets the value for ExternalID.
	 * @param v Value to Set.
	 */
	public void setExternalid(String v);

	/**
	 * @return Returns the current_step_launch_time.
	 */
	public Object getCurrentStepLaunchTime();

	/**
	 * Sets the value for current_step_launch_time.
	 * @param v Value to Set.
	 */
	public void setCurrentStepLaunchTime(Object v);

	/**
	 * @return Returns the current_step_id.
	 */
	public String getCurrentStepId();

	/**
	 * Sets the value for current_step_id.
	 * @param v Value to Set.
	 */
	public void setCurrentStepId(String v);

	/**
	 * @return Returns the status.
	 */
	public String getStatus();

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v);

	/**
	 * @return Returns the create_user.
	 */
	public String getCreateUser();

	/**
	 * Sets the value for create_user.
	 * @param v Value to Set.
	 */
	public void setCreateUser(String v);

	/**
	 * @return Returns the pipeline_name.
	 */
	public String getPipelineName();

	/**
	 * Sets the value for pipeline_name.
	 * @param v Value to Set.
	 */
	public void setPipelineName(String v);

	/**
	 * @return Returns the next_step_id.
	 */
	public String getNextStepId();

	/**
	 * Sets the value for next_step_id.
	 * @param v Value to Set.
	 */
	public void setNextStepId(String v);

	/**
	 * @return Returns the step_description.
	 */
	public String getStepDescription();

	/**
	 * Sets the value for step_description.
	 * @param v Value to Set.
	 */
	public void setStepDescription(String v);

	/**
	 * @return Returns the launch_time.
	 */
	public Object getLaunchTime();

	/**
	 * Sets the value for launch_time.
	 * @param v Value to Set.
	 */
	public void setLaunchTime(Object v);

	/**
	 * @return Returns the percentageComplete.
	 */
	public String getPercentagecomplete();

	/**
	 * Sets the value for percentageComplete.
	 * @param v Value to Set.
	 */
	public void setPercentagecomplete(String v);

	/**
	 * @return Returns the jobID.
	 */
	public String getJobid();

	/**
	 * Sets the value for jobID.
	 * @param v Value to Set.
	 */
	public void setJobid(String v);

	/**
	 * @return Returns the wrk_workflowData_id.
	 */
	public Integer getWrkWorkflowdataId();
}
