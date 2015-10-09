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
public interface XnatReconstructedimagedataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the image_session_ID.
	 */
	public String getImageSessionId();

	/**
	 * Sets the value for image_session_ID.
	 * @param v Value to Set.
	 */
	public void setImageSessionId(String v);

	/**
	 * inScans/scanID
	 * @return Returns an List of org.nrg.xdat.model.XnatReconstructedimagedataScanidI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataScanidI> List<A> getInscans_scanid();

	/**
	 * inScans/scanID
	 * @return Returns an List of org.nrg.xdat.model.XnatReconstructedimagedataScanidI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataScanidI> void addInscans_scanid(A item) throws Exception;

	/**
	 * in/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getIn_file();

	/**
	 * in/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addIn_file(A item) throws Exception;

	/**
	 * out/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getOut_file();

	/**
	 * out/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addOut_file(A item) throws Exception;

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
	 * @return Returns the xnat:reconstructedImageData/provenance_prov_process_id.
	 */
	public Integer getProvenanceFK();

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> List<A> getParameters_addparam();

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> void addParameters_addparam(A item) throws Exception;

	/**
	 * computations/datum
	 * @return Returns an List of org.nrg.xdat.model.XnatComputationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatComputationdataI> List<A> getComputations_datum();

	/**
	 * computations/datum
	 * @return Returns an List of org.nrg.xdat.model.XnatComputationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatComputationdataI> void addComputations_datum(A item) throws Exception;

	/**
	 * @return Returns the ID.
	 */
	public String getId();

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v);

	/**
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);

	/**
	 * @return Returns the baseScanType.
	 */
	public String getBasescantype();

	/**
	 * Sets the value for baseScanType.
	 * @param v Value to Set.
	 */
	public void setBasescantype(String v);

	/**
	 * @return Returns the xnat_reconstructedImageData_id.
	 */
	public Integer getXnatReconstructedimagedataId();
}
