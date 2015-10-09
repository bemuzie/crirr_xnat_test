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
public interface XnatComputationdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * @return Returns the value.
	 */
	public String getValue();

	/**
	 * Sets the value for value.
	 * @param v Value to Set.
	 */
	public void setValue(String v);

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
	 * @return Returns the units.
	 */
	public String getUnits();

	/**
	 * Sets the value for units.
	 * @param v Value to Set.
	 */
	public void setUnits(String v);

	/**
	 * @return Returns the xnat_computationData_id.
	 */
	public Integer getXnatComputationdataId();
}
