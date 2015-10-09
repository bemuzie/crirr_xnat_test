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
public interface ScrScreeningscandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the imageScan_ID.
	 */
	public String getImagescanId();

	/**
	 * Sets the value for imageScan_ID.
	 * @param v Value to Set.
	 */
	public void setImagescanId(String v);

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
	 * @return Returns the pass.
	 */
	public String getPass();

	/**
	 * Sets the value for pass.
	 * @param v Value to Set.
	 */
	public void setPass(String v);

	/**
	 * @return Returns the scr_screeningScanData_id.
	 */
	public Integer getScrScreeningscandataId();
}
