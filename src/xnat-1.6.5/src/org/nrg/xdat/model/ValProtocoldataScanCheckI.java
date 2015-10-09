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
public interface ValProtocoldataScanCheckI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * conditions/condition
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckConditionI> List<A> getConditions_condition();

	/**
	 * conditions/condition
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckConditionI> void addConditions_condition(A item) throws Exception;

	/**
	 * comments/comment
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckCommentI> List<A> getComments_comment();

	/**
	 * comments/comment
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckCommentI> void addComments_comment(A item) throws Exception;

	/**
	 * additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public org.nrg.xdat.model.ValAdditionalvalI getAdditionalval();

	/**
	 * additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public <A extends org.nrg.xdat.model.ValAdditionalvalI> void setAdditionalval(A item) throws Exception;

	/**
	 * @return Returns the val:protocolData_scan_check/additionalval_val_additionalval_id.
	 */
	public Integer getAdditionalvalFK();

	/**
	 * @return Returns the SCAN_ID.
	 */
	public String getScanId();

	/**
	 * Sets the value for SCAN_ID.
	 * @param v Value to Set.
	 */
	public void setScanId(String v);

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
	 * @return Returns the val_protocolData_scan_check_id.
	 */
	public Integer getValProtocoldataScanCheckId();
}
