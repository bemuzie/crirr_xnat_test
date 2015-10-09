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
public interface ProvProcessstepLibraryI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the library.
	 */
	public String getLibrary();

	/**
	 * Sets the value for library.
	 * @param v Value to Set.
	 */
	public void setLibrary(String v);

	/**
	 * @return Returns the version.
	 */
	public String getVersion();

	/**
	 * Sets the value for version.
	 * @param v Value to Set.
	 */
	public void setVersion(String v);

	/**
	 * @return Returns the prov_processStep_library_id.
	 */
	public Integer getProvProcessstepLibraryId();
}
