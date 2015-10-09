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
public interface XnatImagesessiondataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * regions/region
	 * @return Returns an List of org.nrg.xdat.model.XnatRegionresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceI> List<A> getRegions_region();

	/**
	 * regions/region
	 * @return Returns an List of org.nrg.xdat.model.XnatRegionresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatRegionresourceI> void addRegions_region(A item) throws Exception;

	/**
	 * @return Returns the scanner.
	 */
	public String getScanner();

	/**
	 * Sets the value for scanner.
	 * @param v Value to Set.
	 */
	public void setScanner(String v);

	/**
	 * @return Returns the scanner/manufacturer.
	 */
	public String getScanner_manufacturer();

	/**
	 * Sets the value for scanner/manufacturer.
	 * @param v Value to Set.
	 */
	public void setScanner_manufacturer(String v);

	/**
	 * @return Returns the scanner/model.
	 */
	public String getScanner_model();

	/**
	 * Sets the value for scanner/model.
	 * @param v Value to Set.
	 */
	public void setScanner_model(String v);

	/**
	 * @return Returns the operator.
	 */
	public String getOperator();

	/**
	 * Sets the value for operator.
	 * @param v Value to Set.
	 */
	public void setOperator(String v);

	/**
	 * @return Returns the prearchivePath.
	 */
	public String getPrearchivepath();

	/**
	 * Sets the value for prearchivePath.
	 * @param v Value to Set.
	 */
	public void setPrearchivepath(String v);

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatImagescandataI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataI> List<A> getScans_scan();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatImagescandataI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataI> void addScans_scan(A item) throws Exception;

	/**
	 * reconstructions/reconstructedImage
	 * @return Returns an List of org.nrg.xdat.model.XnatReconstructedimagedataI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataI> List<A> getReconstructions_reconstructedimage();

	/**
	 * reconstructions/reconstructedImage
	 * @return Returns an List of org.nrg.xdat.model.XnatReconstructedimagedataI
	 */
	public <A extends org.nrg.xdat.model.XnatReconstructedimagedataI> void addReconstructions_reconstructedimage(A item) throws Exception;

	/**
	 * assessors/assessor
	 * @return Returns an List of org.nrg.xdat.model.XnatImageassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> List<A> getAssessors_assessor();

	/**
	 * assessors/assessor
	 * @return Returns an List of org.nrg.xdat.model.XnatImageassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatImageassessordataI> void addAssessors_assessor(A item) throws Exception;

	/**
	 * @return Returns the dcmAccessionNumber.
	 */
	public String getDcmaccessionnumber();

	/**
	 * Sets the value for dcmAccessionNumber.
	 * @param v Value to Set.
	 */
	public void setDcmaccessionnumber(String v);

	/**
	 * @return Returns the dcmPatientId.
	 */
	public String getDcmpatientid();

	/**
	 * Sets the value for dcmPatientId.
	 * @param v Value to Set.
	 */
	public void setDcmpatientid(String v);

	/**
	 * @return Returns the dcmPatientName.
	 */
	public String getDcmpatientname();

	/**
	 * Sets the value for dcmPatientName.
	 * @param v Value to Set.
	 */
	public void setDcmpatientname(String v);

	/**
	 * @return Returns the dcmPatientBirthDate.
	 */
	public Object getDcmpatientbirthdate();

	/**
	 * Sets the value for dcmPatientBirthDate.
	 * @param v Value to Set.
	 */
	public void setDcmpatientbirthdate(Object v);

	/**
	 * @return Returns the session_type.
	 */
	public String getSessionType();

	/**
	 * Sets the value for session_type.
	 * @param v Value to Set.
	 */
	public void setSessionType(String v);

	/**
	 * @return Returns the modality.
	 */
	public String getModality();

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v);

	/**
	 * @return Returns the UID.
	 */
	public String getUid();

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v);
}
