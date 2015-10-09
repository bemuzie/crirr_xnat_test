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
public interface ScrScreeningassessmentI extends XnatImageassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

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
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.ScrScreeningscandataI
	 */
	public <A extends org.nrg.xdat.model.ScrScreeningscandataI> List<A> getScans_scan();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.ScrScreeningscandataI
	 */
	public <A extends org.nrg.xdat.model.ScrScreeningscandataI> void addScans_scan(A item) throws Exception;
}
