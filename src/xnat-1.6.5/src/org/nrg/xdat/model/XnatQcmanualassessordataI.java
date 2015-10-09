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
public interface XnatQcmanualassessordataI extends XnatImageassessordataI {

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
	 * @return Returns the stereotacticMarker.
	 */
	public String getStereotacticmarker();

	/**
	 * Sets the value for stereotacticMarker.
	 * @param v Value to Set.
	 */
	public void setStereotacticmarker(String v);

	/**
	 * @return Returns the incidentalFindings.
	 */
	public String getIncidentalfindings();

	/**
	 * Sets the value for incidentalFindings.
	 * @param v Value to Set.
	 */
	public void setIncidentalfindings(String v);

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatQcscandataI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataI> List<A> getScans_scan();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatQcscandataI
	 */
	public <A extends org.nrg.xdat.model.XnatQcscandataI> void addScans_scan(A item) throws Exception;

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
	 * @return Returns the payable.
	 */
	public String getPayable();

	/**
	 * Sets the value for payable.
	 * @param v Value to Set.
	 */
	public void setPayable(String v);

	/**
	 * @return Returns the rescan.
	 */
	public String getRescan();

	/**
	 * Sets the value for rescan.
	 * @param v Value to Set.
	 */
	public void setRescan(String v);

	/**
	 * @return Returns the resolvable.
	 */
	public String getResolvable();

	/**
	 * Sets the value for resolvable.
	 * @param v Value to Set.
	 */
	public void setResolvable(String v);

	/**
	 * @return Returns the retrain.
	 */
	public String getRetrain();

	/**
	 * Sets the value for retrain.
	 * @param v Value to Set.
	 */
	public void setRetrain(String v);
}
