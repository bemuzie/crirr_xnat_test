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
public interface XnatInvestigatordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the title.
	 */
	public String getTitle();

	/**
	 * Sets the value for title.
	 * @param v Value to Set.
	 */
	public void setTitle(String v);

	/**
	 * @return Returns the firstname.
	 */
	public String getFirstname();

	/**
	 * Sets the value for firstname.
	 * @param v Value to Set.
	 */
	public void setFirstname(String v);

	/**
	 * @return Returns the lastname.
	 */
	public String getLastname();

	/**
	 * Sets the value for lastname.
	 * @param v Value to Set.
	 */
	public void setLastname(String v);

	/**
	 * @return Returns the institution.
	 */
	public String getInstitution();

	/**
	 * Sets the value for institution.
	 * @param v Value to Set.
	 */
	public void setInstitution(String v);

	/**
	 * @return Returns the department.
	 */
	public String getDepartment();

	/**
	 * Sets the value for department.
	 * @param v Value to Set.
	 */
	public void setDepartment(String v);

	/**
	 * @return Returns the email.
	 */
	public String getEmail();

	/**
	 * Sets the value for email.
	 * @param v Value to Set.
	 */
	public void setEmail(String v);

	/**
	 * @return Returns the phone.
	 */
	public String getPhone();

	/**
	 * Sets the value for phone.
	 * @param v Value to Set.
	 */
	public void setPhone(String v);

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
	 * @return Returns the xnat_investigatorData_id.
	 */
	public Integer getXnatInvestigatordataId();
}
