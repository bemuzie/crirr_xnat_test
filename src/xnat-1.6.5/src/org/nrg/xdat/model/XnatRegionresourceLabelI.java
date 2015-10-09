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
public interface XnatRegionresourceLabelI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the label.
	 */
	public String getLabel();

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v);

	/**
	 * @return Returns the id.
	 */
	public Object getId();

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(Object v);

	/**
	 * @return Returns the hemisphere.
	 */
	public String getHemisphere();

	/**
	 * Sets the value for hemisphere.
	 * @param v Value to Set.
	 */
	public void setHemisphere(String v);

	/**
	 * @return Returns the xnat_regionResource_label_id.
	 */
	public Integer getXnatRegionresourceLabelId();
}
