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
public interface XnatPvisitdataI extends XnatGenericdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * @return Returns the visit_type.
	 */
	public String getVisitType();

	/**
	 * Sets the value for visit_type.
	 * @param v Value to Set.
	 */
	public void setVisitType(String v);

	/**
	 * @return Returns the visit_name.
	 */
	public String getVisitName();

	/**
	 * Sets the value for visit_name.
	 * @param v Value to Set.
	 */
	public void setVisitName(String v);

	/**
	 * @return Returns the notes.
	 */
	public String getNotes();

	/**
	 * Sets the value for notes.
	 * @param v Value to Set.
	 */
	public void setNotes(String v);

	/**
	 * @return Returns the start_date.
	 */
	public Object getStartDate();

	/**
	 * Sets the value for start_date.
	 * @param v Value to Set.
	 */
	public void setStartDate(Object v);

	/**
	 * @return Returns the end_date.
	 */
	public Object getEndDate();

	/**
	 * Sets the value for end_date.
	 * @param v Value to Set.
	 */
	public void setEndDate(Object v);

	/**
	 * @return Returns the closed.
	 */
	public Boolean getClosed();

	/**
	 * Sets the value for closed.
	 * @param v Value to Set.
	 */
	public void setClosed(Object v);

	/**
	 * @return Returns the terminal.
	 */
	public Boolean getTerminal();

	/**
	 * Sets the value for terminal.
	 * @param v Value to Set.
	 */
	public void setTerminal(Object v);

	/**
	 * @return Returns the status.
	 */
	public String getStatus();

	/**
	 * Sets the value for status.
	 * @param v Value to Set.
	 */
	public void setStatus(String v);

	/**
	 * @return Returns the protocolVersion.
	 */
	public Integer getProtocolversion();

	/**
	 * Sets the value for xnat:pVisitData/protocolVersion.
	 * @param v Value to Set.
	 */
	public void setProtocolversion(Integer v) ;

	/**
	 * @return Returns the protocolId.
	 */
	public String getProtocolid();

	/**
	 * Sets the value for protocolId.
	 * @param v Value to Set.
	 */
	public void setProtocolid(String v);
}
