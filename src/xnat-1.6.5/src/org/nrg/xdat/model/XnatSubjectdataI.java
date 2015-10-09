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
public interface XnatSubjectdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectparticipantI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectparticipantI> List<A> getSharing_share();

	/**
	 * sharing/share
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectparticipantI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectparticipantI> void addSharing_share(A item) throws Exception;

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
	 * @return Returns the xnat:subjectData/investigator_xnat_investigatordata_id.
	 */
	public Integer getInvestigatorFK();

	/**
	 * demographics
	 * @return org.nrg.xdat.model.XnatAbstractdemographicdataI
	 */
	public org.nrg.xdat.model.XnatAbstractdemographicdataI getDemographics();

	/**
	 * demographics
	 * @return org.nrg.xdat.model.XnatAbstractdemographicdataI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractdemographicdataI> void setDemographics(A item) throws Exception;

	/**
	 * @return Returns the xnat:subjectData/demographics_xnat_abstractdemographicdata_id.
	 */
	public Integer getDemographicsFK();

	/**
	 * metadata
	 * @return org.nrg.xdat.model.XnatAbstractsubjectmetadataI
	 */
	public org.nrg.xdat.model.XnatAbstractsubjectmetadataI getMetadata();

	/**
	 * metadata
	 * @return org.nrg.xdat.model.XnatAbstractsubjectmetadataI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractsubjectmetadataI> void setMetadata(A item) throws Exception;

	/**
	 * @return Returns the xnat:subjectData/metadata_xnat_abstractsubjectmetadata_id.
	 */
	public Integer getMetadataFK();

	/**
	 * addID
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectdataAddidI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataAddidI> List<A> getAddid();

	/**
	 * addID
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectdataAddidI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataAddidI> void addAddid(A item) throws Exception;

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataFieldI> List<A> getFields_field();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectdataFieldI> void addFields_field(A item) throws Exception;

	/**
	 * experiments/experiment
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> List<A> getExperiments_experiment();

	/**
	 * experiments/experiment
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectassessordataI> void addExperiments_experiment(A item) throws Exception;

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
	 * @return Returns the group.
	 */
	public String getGroup();

	/**
	 * Sets the value for group.
	 * @param v Value to Set.
	 */
	public void setGroup(String v);

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
	 * @return Returns the src.
	 */
	public String getSrc();

	/**
	 * Sets the value for src.
	 * @param v Value to Set.
	 */
	public void setSrc(String v);

	/**
	 * @return Returns the initials.
	 */
	public String getInitials();

	/**
	 * Sets the value for initials.
	 * @param v Value to Set.
	 */
	public void setInitials(String v);
}
