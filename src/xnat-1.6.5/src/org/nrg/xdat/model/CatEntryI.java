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
public interface CatEntryI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.model.CatEntryMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatEntryMetafieldI> List<A> getMetafields_metafield();

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.model.CatEntryMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatEntryMetafieldI> void addMetafields_metafield(A item) throws Exception;

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.CatEntryTagI
	 */
	public <A extends org.nrg.xdat.model.CatEntryTagI> List<A> getTags_tag();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.CatEntryTagI
	 */
	public <A extends org.nrg.xdat.model.CatEntryTagI> void addTags_tag(A item) throws Exception;

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
	 * @return Returns the ID.
	 */
	public String getId();

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v);

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
	 * @return Returns the format.
	 */
	public String getFormat();

	/**
	 * Sets the value for format.
	 * @param v Value to Set.
	 */
	public void setFormat(String v);

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

	/**
	 * @return Returns the createdTime.
	 */
	public Object getCreatedtime();

	/**
	 * Sets the value for createdTime.
	 * @param v Value to Set.
	 */
	public void setCreatedtime(Object v);

	/**
	 * @return Returns the createdBy.
	 */
	public String getCreatedby();

	/**
	 * Sets the value for createdBy.
	 * @param v Value to Set.
	 */
	public void setCreatedby(String v);

	/**
	 * @return Returns the createdEventId.
	 */
	public Integer getCreatedeventid();

	/**
	 * Sets the value for cat:entry/createdEventId.
	 * @param v Value to Set.
	 */
	public void setCreatedeventid(Integer v) ;

	/**
	 * @return Returns the modifiedTime.
	 */
	public Object getModifiedtime();

	/**
	 * Sets the value for modifiedTime.
	 * @param v Value to Set.
	 */
	public void setModifiedtime(Object v);

	/**
	 * @return Returns the modifiedBy.
	 */
	public String getModifiedby();

	/**
	 * Sets the value for modifiedBy.
	 * @param v Value to Set.
	 */
	public void setModifiedby(String v);

	/**
	 * @return Returns the modifiedEventId.
	 */
	public Integer getModifiedeventid();

	/**
	 * Sets the value for cat:entry/modifiedEventId.
	 * @param v Value to Set.
	 */
	public void setModifiedeventid(Integer v) ;

	/**
	 * @return Returns the digest.
	 */
	public String getDigest();

	/**
	 * Sets the value for digest.
	 * @param v Value to Set.
	 */
	public void setDigest(String v);

	/**
	 * @return Returns the cat_entry_id.
	 */
	public Integer getCatEntryId();
}
