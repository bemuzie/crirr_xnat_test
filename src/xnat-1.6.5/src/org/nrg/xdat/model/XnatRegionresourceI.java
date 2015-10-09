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
public interface XnatRegionresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * file
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public org.nrg.xdat.model.XnatAbstractresourceI getFile();

	/**
	 * file
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void setFile(A item) throws Exception;

	/**
	 * @return Returns the xnat:regionResource/file_xnat_abstractresource_id.
	 */
	public Integer getFileFK();

	/**
	 * baseimage
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public org.nrg.xdat.model.XnatAbstractresourceI getBaseimage();

	/**
	 * baseimage
	 * @return org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void setBaseimage(A item) throws Exception;

	/**
	 * @return Returns the xnat:regionResource/baseimage_xnat_abstractresource_id.
	 */
	public Integer getBaseimageFK();

	/**
	 * @return Returns the creator/firstname.
	 */
	public String getCreator_firstname();

	/**
	 * Sets the value for creator/firstname.
	 * @param v Value to Set.
	 */
	public void setCreator_firstname(String v);

	/**
	 * @return Returns the creator/lastname.
	 */
	public String getCreator_lastname();

	/**
	 * Sets the value for creator/lastname.
	 * @param v Value to Set.
	 */
	public void setCreator_lastname(String v);

	/**
	 * subregionlabels/label
	 * @return Returns an List of org.nrg.xdat.model.XnatRegionresourceLabelI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceLabelI> List<A> getSubregionlabels_label();

	/**
	 * subregionlabels/label
	 * @return Returns an List of org.nrg.xdat.model.XnatRegionresourceLabelI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceLabelI> void addSubregionlabels_label(A item) throws Exception;

	/**
	 * @return Returns the name.
	 */
	public String getName();

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v);

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
	 * @return Returns the session_id.
	 */
	public String getSessionId();

	/**
	 * Sets the value for session_id.
	 * @param v Value to Set.
	 */
	public void setSessionId(String v);

	/**
	 * @return Returns the xnat_regionResource_id.
	 */
	public Integer getXnatRegionresourceId();
}
