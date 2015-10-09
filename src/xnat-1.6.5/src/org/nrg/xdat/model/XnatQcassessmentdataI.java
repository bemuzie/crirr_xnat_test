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
public interface XnatQcassessmentdataI extends XnatMrassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatQcassessmentdataScanI
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanI> List<A> getScans_scan();

	/**
	 * scans/scan
	 * @return Returns an List of org.nrg.xdat.model.XnatQcassessmentdataScanI
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanI> void addScans_scan(A item) throws Exception;

	/**
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);
}
