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
public interface XnatProjectdataAliasI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the alias.
	 */
	public String getAlias();

	/**
	 * Sets the value for alias.
	 * @param v Value to Set.
	 */
	public void setAlias(String v);

	/**
	 * @return Returns the source.
	 */
	public String getSource();

	/**
	 * Sets the value for source.
	 * @param v Value to Set.
	 */
	public void setSource(String v);

	/**
	 * @return Returns the xnat_projectData_alias_id.
	 */
	public Integer getXnatProjectdataAliasId();
}
