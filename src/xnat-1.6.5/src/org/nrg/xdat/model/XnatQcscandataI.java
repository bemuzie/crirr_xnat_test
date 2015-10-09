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
public interface XnatQcscandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the imageScan_ID.
	 */
	public String getImagescanId();

	/**
	 * Sets the value for imageScan_ID.
	 * @param v Value to Set.
	 */
	public void setImagescanId(String v);

	/**
	 * @return Returns the rater.
	 */
	public String getRater();

	/**
	 * Sets the value for rater.
	 * @param v Value to Set.
	 */
	public void setRater(String v);

	/**
	 * @return Returns the coverage.
	 */
	public String getCoverage();

	/**
	 * Sets the value for coverage.
	 * @param v Value to Set.
	 */
	public void setCoverage(String v);

	/**
	 * @return Returns the motion.
	 */
	public String getMotion();

	/**
	 * Sets the value for motion.
	 * @param v Value to Set.
	 */
	public void setMotion(String v);

	/**
	 * @return Returns the otherImageArtifacts.
	 */
	public String getOtherimageartifacts();

	/**
	 * Sets the value for otherImageArtifacts.
	 * @param v Value to Set.
	 */
	public void setOtherimageartifacts(String v);

	/**
	 * @return Returns the comments.
	 */
	public String getComments();

	/**
	 * Sets the value for comments.
	 * @param v Value to Set.
	 */
	public void setComments(String v);

	/**
	 * @return Returns the pass.
	 */
	public String getPass();

	/**
	 * Sets the value for pass.
	 * @param v Value to Set.
	 */
	public void setPass(String v);

	/**
	 * @return Returns the rating.
	 */
	public String getRating();

	/**
	 * Sets the value for rating.
	 * @param v Value to Set.
	 */
	public void setRating(String v);

	/**
	 * @return Returns the rating/scale.
	 */
	public String getRating_scale();

	/**
	 * Sets the value for rating/scale.
	 * @param v Value to Set.
	 */
	public void setRating_scale(String v);

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatQcscandataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataFieldI> List<A> getFields_field();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatQcscandataFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataFieldI> void addFields_field(A item) throws Exception;

	/**
	 * @return Returns the xnat_qcScanData_id.
	 */
	public Integer getXnatQcscandataId();
}
