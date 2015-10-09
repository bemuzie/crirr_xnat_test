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
public interface ValProtocoldataConditionI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the verified.
	 */
	public String getVerified();

	/**
	 * Sets the value for verified.
	 * @param v Value to Set.
	 */
	public void setVerified(String v);

	/**
	 * @return Returns the diagnosis.
	 */
	public String getDiagnosis();

	/**
	 * Sets the value for diagnosis.
	 * @param v Value to Set.
	 */
	public void setDiagnosis(String v);

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
	 * @return Returns the status.
	 */
	public String getStatus();

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v);

	/**
	 * @return Returns the xmlpath.
	 */
	public String getXmlpath();

	/**
	 * Sets the value for xmlpath.
	 * @param v Value to Set.
	 */
	public void setXmlpath(String v);

	/**
	 * @return Returns the val_protocolData_condition_id.
	 */
	public Integer getValProtocoldataConditionId();
}
