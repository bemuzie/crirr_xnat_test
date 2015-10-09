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
public interface XnatOtherqcscandataI extends XnatQcscandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the other.
	 */
	public String getOther();

	/**
	 * Sets the value for other.
	 * @param v Value to Set.
	 */
	public void setOther(String v);
}
