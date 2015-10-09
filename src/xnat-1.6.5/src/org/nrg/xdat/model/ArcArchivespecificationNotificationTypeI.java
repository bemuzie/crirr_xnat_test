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
public interface ArcArchivespecificationNotificationTypeI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the notification_type.
	 */
	public String getNotificationType();

	/**
	 * Sets the value for notification_type.
	 * @param v Value to Set.
	 */
	public void setNotificationType(String v);

	/**
	 * @return Returns the email_addresses.
	 */
	public String getEmailAddresses();

	/**
	 * Sets the value for email_addresses.
	 * @param v Value to Set.
	 */
	public void setEmailAddresses(String v);

	/**
	 * @return Returns the arc_ArchiveSpecification_notification_type_id.
	 */
	public Integer getArcArchivespecificationNotificationTypeId();
}
