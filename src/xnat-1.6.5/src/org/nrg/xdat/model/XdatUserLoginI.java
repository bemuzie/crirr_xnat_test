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
public interface XdatUserLoginI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the login_date.
	 */
	public Object getLoginDate();

	/**
	 * Sets the value for login_date.
	 * @param v Value to Set.
	 */
	public void setLoginDate(Object v);

	/**
	 * @return Returns the logout_date.
	 */
	public Object getLogoutDate();

	/**
	 * Sets the value for logout_date.
	 * @param v Value to Set.
	 */
	public void setLogoutDate(Object v);

	/**
	 * @return Returns the session_id.
	 */
	public String getSessionId();

	/**
	 * Sets the value for session_id.
	 * @param v Value to Set.
	 */
	public void setSessionId(String v);

	/**
	 * @return Returns the ip_address.
	 */
	public String getIpAddress();

	/**
	 * Sets the value for ip_address.
	 * @param v Value to Set.
	 */
	public void setIpAddress(String v);

	/**
	 * user
	 * @return org.nrg.xdat.model.XdatUserI
	 */
	public org.nrg.xdat.model.XdatUserI getuserProperty();

	/**
	 * user
	 * @return org.nrg.xdat.model.XdatUserI
	 */
	public <A extends org.nrg.xdat.model.XdatUserI> void setuserProperty(A item) throws Exception;

	/**
	 * @return Returns the xdat:user_login/user_xdat_user_id.
	 */
	public Integer getuserPropertyFK();

	/**
	 * @return Returns the xdat_user_login_id.
	 */
	public Integer getXdatUserLoginId();
}
