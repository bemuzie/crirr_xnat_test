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
public interface XnatFielddefinitiongroupFieldPossiblevalueI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the possibleValue.
	 */
	public String getPossiblevalue();

	/**
	 * Sets the value for possibleValue.
	 * @param v Value to Set.
	 */
	public void setPossiblevalue(String v);

	/**
	 * @return Returns the display.
	 */
	public String getDisplay();

	/**
	 * Sets the value for display.
	 * @param v Value to Set.
	 */
	public void setDisplay(String v);

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_field_possibleValue_id.
	 */
	public Integer getXnatFielddefinitiongroupFieldPossiblevalueId();
}
