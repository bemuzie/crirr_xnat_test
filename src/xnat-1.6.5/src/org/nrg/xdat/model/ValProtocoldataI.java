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
public interface ValProtocoldataI extends XnatImageassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * check/conditions/condition
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataConditionI> List<A> getCheck_conditions_condition();

	/**
	 * check/conditions/condition
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataConditionI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataConditionI> void addCheck_conditions_condition(A item) throws Exception;

	/**
	 * check/comments/comment
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataCommentI> List<A> getCheck_comments_comment();

	/**
	 * check/comments/comment
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataCommentI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataCommentI> void addCheck_comments_comment(A item) throws Exception;

	/**
	 * check/additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public org.nrg.xdat.model.ValAdditionalvalI getCheck_additionalval();

	/**
	 * check/additionalVal
	 * @return org.nrg.xdat.model.ValAdditionalvalI
	 */
	public <A extends org.nrg.xdat.model.ValAdditionalvalI> void setCheck_additionalval(A item) throws Exception;

	/**
	 * @return Returns the val:protocolData/check_additionalval_val_additionalval_id.
	 */
	public Integer getCheck_additionalvalFK();

	/**
	 * @return Returns the check/status.
	 */
	public String getCheck_status();

	/**
	 * Sets the value for check/status.
	 * @param v Value to Set.
	 */
	public void setCheck_status(String v);

	/**
	 * scans/scan_check
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckI> List<A> getScans_scanCheck();

	/**
	 * scans/scan_check
	 * @return Returns an List of org.nrg.xdat.model.ValProtocoldataScanCheckI
	 */
	public <A extends org.nrg.xdat.model.ValProtocoldataScanCheckI> void addScans_scanCheck(A item) throws Exception;
}
