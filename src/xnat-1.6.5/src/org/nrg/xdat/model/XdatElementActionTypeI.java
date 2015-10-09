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
public interface XdatElementActionTypeI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the element_action_name.
	 */
	public String getElementActionName();

	/**
	 * Sets the value for element_action_name.
	 * @param v Value to Set.
	 */
	public void setElementActionName(String v);

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
	 * Sets the value for xdat:element_action_type/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(Integer v) ;

	/**
	 * @return Returns the image.
	 */
	public String getImage();

	/**
	 * Sets the value for image.
	 * @param v Value to Set.
	 */
	public void setImage(String v);

	/**
	 * @return Returns the popup.
	 */
	public String getPopup();

	/**
	 * Sets the value for popup.
	 * @param v Value to Set.
	 */
	public void setPopup(String v);

	/**
	 * @return Returns the secureAccess.
	 */
	public String getSecureaccess();

	/**
	 * Sets the value for secureAccess.
	 * @param v Value to Set.
	 */
	public void setSecureaccess(String v);

	/**
	 * @return Returns the secureFeature.
	 */
	public String getSecurefeature();

	/**
	 * Sets the value for secureFeature.
	 * @param v Value to Set.
	 */
	public void setSecurefeature(String v);

	/**
	 * @return Returns the parameterString.
	 */
	public String getParameterstring();

	/**
	 * Sets the value for parameterString.
	 * @param v Value to Set.
	 */
	public void setParameterstring(String v);

	/**
	 * @return Returns the grouping.
	 */
	public String getGrouping();

	/**
	 * Sets the value for grouping.
	 * @param v Value to Set.
	 */
	public void setGrouping(String v);

	/**
	 * @return Returns the xdat_element_action_type_id.
	 */
	public Integer getXdatElementActionTypeId();
}
