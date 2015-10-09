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
public interface ArcPathinfoI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the archivePath.
	 */
	public String getArchivepath();

	/**
	 * Sets the value for archivePath.
	 * @param v Value to Set.
	 */
	public void setArchivepath(String v);

	/**
	 * @return Returns the prearchivePath.
	 */
	public String getPrearchivepath();

	/**
	 * Sets the value for prearchivePath.
	 * @param v Value to Set.
	 */
	public void setPrearchivepath(String v);

	/**
	 * @return Returns the cachePath.
	 */
	public String getCachepath();

	/**
	 * Sets the value for cachePath.
	 * @param v Value to Set.
	 */
	public void setCachepath(String v);

	/**
	 * @return Returns the buildPath.
	 */
	public String getBuildpath();

	/**
	 * Sets the value for buildPath.
	 * @param v Value to Set.
	 */
	public void setBuildpath(String v);

	/**
	 * @return Returns the ftpPath.
	 */
	public String getFtppath();

	/**
	 * Sets the value for ftpPath.
	 * @param v Value to Set.
	 */
	public void setFtppath(String v);

	/**
	 * @return Returns the pipelinePath.
	 */
	public String getPipelinepath();

	/**
	 * Sets the value for pipelinePath.
	 * @param v Value to Set.
	 */
	public void setPipelinepath(String v);

	/**
	 * @return Returns the arc_pathInfo_id.
	 */
	public Integer getArcPathinfoId();
}
