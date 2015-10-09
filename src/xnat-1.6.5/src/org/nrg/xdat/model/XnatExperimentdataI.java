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
public interface XnatExperimentdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatExperimentdataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataShareI> List<A> getSharing_share();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatExperimentdataShareI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataShareI> void addSharing_share(A item) throws Exception;

	/**
	 * @return Returns the date.
	 */
	public Object getDate();

	/**
	 * Sets the value for date.
	 * @param v Value to Set.
	 */
	public void setDate(Object v);

	/**
	 * @return Returns the time.
	 */
	public Object getTime();

	/**
	 * Sets the value for time.
	 * @param v Value to Set.
	 */
	public void setTime(Object v);

	/**
	 * @return Returns the duration.
	 */
	public Object getDuration();

	/**
	 * Sets the value for duration.
	 * @param v Value to Set.
	 */
	public void setDuration(Object v);

	/**
	 * @return Returns the delay.
	 */
	public Integer getDelay();

	/**
	 * Sets the value for xnat:experimentData/delay.
	 * @param v Value to Set.
	 */
	public void setDelay(Integer v) ;

	/**
	 * @return Returns the delay/ref_expt_id.
	 */
	public String getDelay_refExptId();

	/**
	 * Sets the value for delay/ref_expt_id.
	 * @param v Value to Set.
	 */
	public void setDelay_refExptId(String v);

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
	 * investigator
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public org.nrg.xdat.model.XnatInvestigatordataI getInvestigator();

	/**
	 * investigator
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void setInvestigator(A item) throws Exception;

	/**
	 * @return Returns the xnat:experimentData/investigator_xnat_investigatordata_id.
	 */
	public Integer getInvestigatorFK();

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
	 * @return Returns the xnat:experimentData/validation_xnat_validationdata_id.
	 */
	public Integer getValidationFK();

	/**
	 * resources/resource
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getResources_resource();

	/**
	 * resources/resource
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addResources_resource(A item) throws Exception;

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatExperimentdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataFieldI> List<A> getFields_field();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatExperimentdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatExperimentdataFieldI> void addFields_field(A item) throws Exception;

	/**
	 * @return Returns the acquisition_site.
	 */
	public String getAcquisitionSite();

	/**
	 * Sets the value for acquisition_site.
	 * @param v Value to Set.
	 */
	public void setAcquisitionSite(String v);

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
	 * @return Returns the project.
	 */
	public String getProject();

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v);

	/**
	 * @return Returns the visit_id.
	 */
	public String getVisitId();

	/**
	 * Sets the value for visit_id.
	 * @param v Value to Set.
	 */
	public void setVisitId(String v);

	/**
	 * @return Returns the visit.
	 */
	public String getVisit();

	/**
	 * Sets the value for visit.
	 * @param v Value to Set.
	 */
	public void setVisit(String v);

	/**
	 * @return Returns the version.
	 */
	public Integer getVersion();

	/**
	 * Sets the value for xnat:experimentData/version.
	 * @param v Value to Set.
	 */
	public void setVersion(Integer v) ;

	/**
	 * @return Returns the original.
	 */
	public String getOriginal();

	/**
	 * Sets the value for original.
	 * @param v Value to Set.
	 */
	public void setOriginal(String v);

	/**
	 * @return Returns the protocol.
	 */
	public String getProtocol();

	/**
	 * Sets the value for protocol.
	 * @param v Value to Set.
	 */
	public void setProtocol(String v);

	/**
	 * @return Returns the label.
	 */
	public String getLabel();

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v);
}
