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
public interface XnatProjectdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * @return Returns the description.
	 */
	public String getDescription();

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v);

	/**
	 * @return Returns the keywords.
	 */
	public String getKeywords();

	/**
	 * Sets the value for keywords.
	 * @param v Value to Set.
	 */
	public void setKeywords(String v);

	/**
	 * aliases/alias
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectdataAliasI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataAliasI> List<A> getAliases_alias();

	/**
	 * aliases/alias
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectdataAliasI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataAliasI> void addAliases_alias(A item) throws Exception;

	/**
	 * publications/publication
	 * @return Returns an List of org.nrg.xdat.model.XnatPublicationresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatPublicationresourceI> List<A> getPublications_publication();

	/**
	 * publications/publication
	 * @return Returns an List of org.nrg.xdat.model.XnatPublicationresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatPublicationresourceI> void addPublications_publication(A item) throws Exception;

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
	 * studyProtocol
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractprotocolI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractprotocolI> List<A> getStudyprotocol();

	/**
	 * studyProtocol
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractprotocolI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractprotocolI> void addStudyprotocol(A item) throws Exception;

	/**
	 * PI
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public org.nrg.xdat.model.XnatInvestigatordataI getPi();

	/**
	 * PI
	 * @return org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void setPi(A item) throws Exception;

	/**
	 * @return Returns the xnat:projectData/pi_xnat_investigatordata_id.
	 */
	public Integer getPiFK();

	/**
	 * investigators/investigator
	 * @return Returns an List of org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> List<A> getInvestigators_investigator();

	/**
	 * investigators/investigator
	 * @return Returns an List of org.nrg.xdat.model.XnatInvestigatordataI
	 */
	public <A extends org.nrg.xdat.model.XnatInvestigatordataI> void addInvestigators_investigator(A item) throws Exception;

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataFieldI> List<A> getFields_field();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatProjectdataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatProjectdataFieldI> void addFields_field(A item) throws Exception;

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
	 * @return Returns the secondary_ID.
	 */
	public String getSecondaryId();

	/**
	 * Sets the value for secondary_ID.
	 * @param v Value to Set.
	 */
	public void setSecondaryId(String v);
}
