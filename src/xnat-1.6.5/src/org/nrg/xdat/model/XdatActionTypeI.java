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
public interface XdatActionTypeI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the action_name.
	 */
	public String getActionName();

	/**
	 * Sets the value for action_name.
	 * @param v Value to Set.
	 */
	public void setActionName(String v);

	/**
	 * @return Returns the display_name.
	 */
	public String getDisplayName();

	/**
	 * Sets the value for display_name.
	 * @param v Value to Set.
	 */
	public void setDisplayName(String v);

	/**
	 * @return Returns the sequence.
	 */
	public Integer getSequence();

	/**
	 * Sets the value for xdat:action_type/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(Integer v) ;
}
