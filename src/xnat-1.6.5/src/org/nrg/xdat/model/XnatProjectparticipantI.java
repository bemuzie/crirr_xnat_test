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
public interface XnatProjectparticipantI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the label.
	 */
	public String getLabel();

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v);

	/**
	 * @return Returns the project.
	 */
	public String getProject();

	/**
	 * Sets the value for project.
	 * @param v Value to Set.
	 */
	public void setProject(String v);

	/**
	 * @return Returns the subject_ID.
	 */
	public String getSubjectId();

	/**
	 * Sets the value for subject_ID.
	 * @param v Value to Set.
	 */
	public void setSubjectId(String v);

	/**
	 * @return Returns the group.
	 */
	public String getGroup();

	/**
	 * Sets the value for group.
	 * @param v Value to Set.
	 */
	public void setGroup(String v);

	/**
	 * @return Returns the xnat_projectParticipant_id.
	 */
	public Integer getXnatProjectparticipantId();
}
