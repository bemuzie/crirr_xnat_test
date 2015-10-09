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
public interface XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatImagescandataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataShareI> List<A> getSharing_share();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatImagescandataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatImagescandataShareI> void addSharing_share(A item) throws Exception;

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
	 * @return Returns the note.
	 */
	public String getNote();

	/**
	 * Sets the value for note.
	 * @param v Value to Set.
	 */
	public void setNote(String v);

	/**
	 * @return Returns the quality.
	 */
	public String getQuality();

	/**
	 * Sets the value for quality.
	 * @param v Value to Set.
	 */
	public void setQuality(String v);

	/**
	 * @return Returns the condition.
	 */
	public String getCondition();

	/**
	 * Sets the value for condition.
	 * @param v Value to Set.
	 */
	public void setCondition(String v);

	/**
	 * @return Returns the series_description.
	 */
	public String getSeriesDescription();

	/**
	 * Sets the value for series_description.
	 * @param v Value to Set.
	 */
	public void setSeriesDescription(String v);

	/**
	 * @return Returns the documentation.
	 */
	public String getDocumentation();

	/**
	 * Sets the value for documentation.
	 * @param v Value to Set.
	 */
	public void setDocumentation(String v);

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
	 * @return Returns the modality.
	 */
	public String getModality();

	/**
	 * Sets the value for modality.
	 * @param v Value to Set.
	 */
	public void setModality(String v);

	/**
	 * @return Returns the frames.
	 */
	public Integer getFrames();

	/**
	 * Sets the value for xnat:imageScanData/frames.
	 * @param v Value to Set.
	 */
	public void setFrames(Integer v) ;

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
	 * file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getFile();

	/**
	 * file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addFile(A item) throws Exception;

	/**
	 * validation
	 * @return org.nrg.xdat.model.XnatValidationdataI
	 */
	public org.nrg.xdat.model.XnatValidationdataI getValidation();

	/**
	 * validation
	 * @return org.nrg.xdat.model.XnatValidationdataI
	 */
	public <A extends org.nrg.xdat.model.XnatValidationdataI> void setValidation(A item) throws Exception;

	/**
	 * @return Returns the xnat:imageScanData/validation_xnat_validationdata_id.
	 */
	public Integer getValidationFK();

	/**
	 * @return Returns the startTime.
	 */
	public Object getStarttime();

	/**
	 * Sets the value for startTime.
	 * @param v Value to Set.
	 */
	public void setStarttime(Object v);

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
	 * @return Returns the UID.
	 */
	public String getUid();

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v);

	/**
	 * @return Returns the project.
	 */
	public String getProject();

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v);

	/**
	 * @return Returns the xnat_imageScanData_id.
	 */
	public Integer getXnatImagescandataId();
}
