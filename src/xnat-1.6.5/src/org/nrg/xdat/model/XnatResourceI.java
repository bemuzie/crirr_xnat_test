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
public interface XnatResourceI extends XnatAbstractresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * provenance
	 * @return org.nrg.xdat.model.ProvProcessI
	 */
	public org.nrg.xdat.model.ProvProcessI getProvenance();

	/**
	 * provenance
	 * @return org.nrg.xdat.model.ProvProcessI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessI> void setProvenance(A item) throws Exception;

	/**
	 * @return Returns the xnat:resource/provenance_prov_process_id.
	 */
	public Integer getProvenanceFK();

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
	 * @return Returns the format.
	 */
	public String getFormat();

	/**
	 * Sets the value for format.
	 * @param v Value to Set.
	 */
	public void setFormat(String v);

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
	 * @return Returns the content.
	 */
	public String getContent();

	/**
	 * Sets the value for content.
	 * @param v Value to Set.
	 */
	public void setContent(String v);

	/**
	 * @return Returns the cachePath.
	 */
	public String getCachepath();

	/**
	 * Sets the value for cachePath.
	 * @param v Value to Set.
	 */
	public void setCachepath(String v);
}
