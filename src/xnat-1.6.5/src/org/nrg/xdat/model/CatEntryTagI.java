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
public interface CatEntryTagI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the tag.
	 */
	public String getTag();

	/**
	 * Sets the value for tag.
	 * @param v Value to Set.
	 */
	public void setTag(String v);

	/**
	 * @return Returns the cat_entry_tag_id.
	 */
	public Integer getCatEntryTagId();
}
