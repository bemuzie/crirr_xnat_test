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
public interface CatCatalogI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogMetafieldI> List<A> getMetafields_metafield();

	/**
	 * metaFields/metaField
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogMetafieldI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogMetafieldI> void addMetafields_metafield(A item) throws Exception;

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogTagI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogTagI> List<A> getTags_tag();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogTagI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogTagI> void addTags_tag(A item) throws Exception;

	/**
	 * sets/entrySet
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogI> List<A> getSets_entryset();

	/**
	 * sets/entrySet
	 * @return Returns an List of org.nrg.xdat.model.CatCatalogI
	 */
	public <A extends org.nrg.xdat.model.CatCatalogI> void addSets_entryset(A item) throws Exception;

	/**
	 * entries/entry
	 * @return Returns an List of org.nrg.xdat.model.CatEntryI
	 */
	public <A extends org.nrg.xdat.model.CatEntryI> List<A> getEntries_entry();

	/**
	 * entries/entry
	 * @return Returns an List of org.nrg.xdat.model.CatEntryI
	 */
	public <A extends org.nrg.xdat.model.CatEntryI> void addEntries_entry(A item) throws Exception;

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
	 * @return Returns the cat_catalog_id.
	 */
	public Integer getCatCatalogId();
}
