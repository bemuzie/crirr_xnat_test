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
public interface XdatPrimarySecurityFieldI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the primary_security_field.
	 */
	public String getPrimarySecurityField();

	/**
	 * Sets the value for primary_security_field.
	 * @param v Value to Set.
	 */
	public void setPrimarySecurityField(String v);

	/**
	 * @return Returns the xdat_primary_security_field_id.
	 */
	public Integer getXdatPrimarySecurityFieldId();
}
