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
public interface XnatDeriveddataI extends XnatExperimentdataI {

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
	 * @return Returns the xnat:derivedData/provenance_prov_process_id.
	 */
	public Integer getProvenanceFK();
}
