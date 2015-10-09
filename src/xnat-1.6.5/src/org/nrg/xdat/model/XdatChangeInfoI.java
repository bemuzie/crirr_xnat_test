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
public interface XdatChangeInfoI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * change_user
	 * @return org.nrg.xdat.model.XdatUserI
	 */
	public org.nrg.xdat.model.XdatUserI getChangeUser();

	/**
	 * change_user
	 * @return org.nrg.xdat.model.XdatUserI
	 */
	public <A extends org.nrg.xdat.model.XdatUserI> void setChangeUser(A item) throws Exception;

	/**
	 * @return Returns the xdat:change_info/change_user.
	 */
	public Integer getChangeUserFK();

	/**
	 * @return Returns the comment.
	 */
	public String getComment();

	/**
	 * Sets the value for comment.
	 * @param v Value to Set.
	 */
	public void setComment(String v);

	/**
	 * @return Returns the change_date.
	 */
	public Object getChangeDate();

	/**
	 * Sets the value for change_date.
	 * @param v Value to Set.
	 */
	public void setChangeDate(Object v);

	/**
	 * @return Returns the event_id.
	 */
	public Integer getEventId();

	/**
	 * Sets the value for xdat:change_info/event_id.
	 * @param v Value to Set.
	 */
	public void setEventId(Integer v) ;

	/**
	 * @return Returns the xdat_change_info_id.
	 */
	public Object getXdatChangeInfoId();

	/**
	 * Sets the value for xdat_change_info_id.
	 * @param v Value to Set.
	 */
	public void setXdatChangeInfoId(Object v);
}
