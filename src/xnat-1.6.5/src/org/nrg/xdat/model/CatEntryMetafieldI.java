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
public interface CatEntryMetafieldI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the metaField.
	 */
	public String getMetafield();

	/**
	 * Sets the value for metaField.
	 * @param v Value to Set.
	 */
	public void setMetafield(String v);

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
	 * @return Returns the cat_entry_metaField_id.
	 */
	public Integer getCatEntryMetafieldId();
}
