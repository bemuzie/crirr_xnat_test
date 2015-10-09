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
public interface XnatDicomseriesImageI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the URI.
	 */
	public String getUri();

	/**
	 * Sets the value for URI.
	 * @param v Value to Set.
	 */
	public void setUri(String v);

	/**
	 * @return Returns the sop_instance_UID.
	 */
	public String getSopInstanceUid();

	/**
	 * Sets the value for sop_instance_UID.
	 * @param v Value to Set.
	 */
	public void setSopInstanceUid(String v);

	/**
	 * @return Returns the instance_number.
	 */
	public Integer getInstanceNumber();

	/**
	 * Sets the value for xnat:dicomSeries_image/instance_number.
	 * @param v Value to Set.
	 */
	public void setInstanceNumber(Integer v) ;

	/**
	 * @return Returns the xnat_dicomSeries_image_id.
	 */
	public Integer getXnatDicomseriesImageId();
}
