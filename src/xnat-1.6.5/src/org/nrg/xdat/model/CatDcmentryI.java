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
public interface CatDcmentryI extends CatEntryI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the UID.
	 */
	public String getUid();

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v);

	/**
	 * @return Returns the instanceNumber.
	 */
	public Integer getInstancenumber();

	/**
	 * Sets the value for cat:dcmEntry/instanceNumber.
	 * @param v Value to Set.
	 */
	public void setInstancenumber(Integer v) ;
}
