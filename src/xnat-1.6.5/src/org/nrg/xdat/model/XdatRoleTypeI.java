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
public interface XdatRoleTypeI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * allowed_actions/allowed_action
	 * @return Returns an List of org.nrg.xdat.model.XdatActionTypeI
	 */
	public <A extends org.nrg.xdat.model.XdatActionTypeI> List<A> getAllowedActions_allowedAction();

	/**
	 * allowed_actions/allowed_action
	 * @return Returns an List of org.nrg.xdat.model.XdatActionTypeI
	 */
	public <A extends org.nrg.xdat.model.XdatActionTypeI> void addAllowedActions_allowedAction(A item) throws Exception;

	/**
	 * @return Returns the role_name.
	 */
	public String getRoleName();

	/**
	 * Sets the value for role_name.
	 * @param v Value to Set.
	 */
	public void setRoleName(String v);

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
	 * @return Returns the sequence.
	 */
	public Integer getSequence();

	/**
	 * Sets the value for xdat:role_type/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(Integer v) ;
}
