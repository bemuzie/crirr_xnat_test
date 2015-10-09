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
public interface XdatSearchI extends XdatStoredSearchI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the page.
	 */
	public Integer getPage();

	/**
	 * Sets the value for xdat:Search/page.
	 * @param v Value to Set.
	 */
	public void setPage(Integer v) ;
}
