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
public interface ValProtocoldataCommentI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * @return Returns the username.
	 */
	public String getUsername();

	/**
	 * Sets the value for username.
	 * @param v Value to Set.
	 */
	public void setUsername(String v);

	/**
	 * @return Returns the dateTime.
	 */
	public Object getDatetime();

	/**
	 * Sets the value for dateTime.
	 * @param v Value to Set.
	 */
	public void setDatetime(Object v);

	/**
	 * @return Returns the val_protocolData_comment_id.
	 */
	public Integer getValProtocoldataCommentId();
}
