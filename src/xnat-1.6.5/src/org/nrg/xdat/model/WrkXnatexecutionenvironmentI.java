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
public interface WrkXnatexecutionenvironmentI extends WrkAbstractexecutionenvironmentI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the pipeline.
	 */
	public String getPipeline();

	/**
	 * Sets the value for pipeline.
	 * @param v Value to Set.
	 */
	public void setPipeline(String v);

	/**
	 * @return Returns the xnatuser.
	 */
	public String getXnatuser();

	/**
	 * Sets the value for xnatuser.
	 * @param v Value to Set.
	 */
	public void setXnatuser(String v);

	/**
	 * @return Returns the host.
	 */
	public String getHost();

	/**
	 * Sets the value for host.
	 * @param v Value to Set.
	 */
	public void setHost(String v);

	/**
	 * @return Returns the startAt.
	 */
	public String getStartat();

	/**
	 * Sets the value for startAt.
	 * @param v Value to Set.
	 */
	public void setStartat(String v);

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI> List<A> getParameters_parameter();

	/**
	 * parameters/parameter
	 * @return Returns an List of org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentParameterI> void addParameters_parameter(A item) throws Exception;

	/**
	 * notify
	 * @return Returns an List of org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI> List<A> getNotify();

	/**
	 * notify
	 * @return Returns an List of org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI
	 */
	public <A extends org.nrg.xdat.model.WrkXnatexecutionenvironmentNotifyI> void addNotify(A item) throws Exception;

	/**
	 * @return Returns the dataType.
	 */
	public String getDatatype();

	/**
	 * Sets the value for dataType.
	 * @param v Value to Set.
	 */
	public void setDatatype(String v);

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
	 * @return Returns the supressNotification.
	 */
	public Boolean getSupressnotification();

	/**
	 * Sets the value for supressNotification.
	 * @param v Value to Set.
	 */
	public void setSupressnotification(Object v);

	/**
	 * @return Returns the log.
	 */
	public String getLog();

	/**
	 * Sets the value for log.
	 * @param v Value to Set.
	 */
	public void setLog(String v);

	/**
	 * @return Returns the catalogPath.
	 */
	public String getCatalogpath();

	/**
	 * Sets the value for catalogPath.
	 * @param v Value to Set.
	 */
	public void setCatalogpath(String v);

	/**
	 * @return Returns the parameterFile/xml.
	 */
	public String getParameterfile_xml();

	/**
	 * Sets the value for parameterFile/xml.
	 * @param v Value to Set.
	 */
	public void setParameterfile_xml(String v);

	/**
	 * @return Returns the parameterFile/path.
	 */
	public String getParameterfile_path();

	/**
	 * Sets the value for parameterFile/path.
	 * @param v Value to Set.
	 */
	public void setParameterfile_path(String v);
}
