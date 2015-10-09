/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
 *
 */
package org.nrg.xdat.model;

import java.util.List;

/**
 * @author XDAT
 *
 */
public interface XdatUsergroupI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * element_access
	 * @return Returns an List of org.nrg.xdat.model.XdatElementAccessI
	 */
	public <A extends org.nrg.xdat.model.XdatElementAccessI> List<A> getElementAccess();

	/**
	 * element_access
	 * @return Returns an List of org.nrg.xdat.model.XdatElementAccessI
	 */
	public <A extends org.nrg.xdat.model.XdatElementAccessI> void addElementAccess(A item) throws Exception;

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
	 * @return Returns the displayName.
	 */
	public String getDisplayname();

	/**
	 * Sets the value for displayName.
	 * @param v Value to Set.
	 */
	public void setDisplayname(String v);

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
	 * @return Returns the xdat_userGroup_id.
	 */
	public Integer getXdatUsergroupId();
}
