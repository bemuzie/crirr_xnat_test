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
public interface XnatQcassessmentdataScanI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * sliceQC/slice
	 * @return Returns an List of org.nrg.xdat.model.XnatQcassessmentdataScanSliceI
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanSliceI> List<A> getSliceqc_slice();

	/**
	 * sliceQC/slice
	 * @return Returns an List of org.nrg.xdat.model.XnatQcassessmentdataScanSliceI
	 */
	public <A extends org.nrg.xdat.model.XnatQcassessmentdataScanSliceI> void addSliceqc_slice(A item) throws Exception;

	/**
	 * scanStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public org.nrg.xdat.model.XnatAbstractstatisticsI getScanstatistics();

	/**
	 * scanStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractstatisticsI> void setScanstatistics(A item) throws Exception;

	/**
	 * @return Returns the xnat:qcAssessmentData_scan/scanstatistics_xnat_abstractstatistics_id.
	 */
	public Integer getScanstatisticsFK();

	/**
	 * @return Returns the id.
	 */
	public String getId();

	/**
	 * Sets the value for id.
	 * @param v Value to Set.
	 */
	public void setId(String v);

	/**
	 * @return Returns the xnat_qcAssessmentData_scan_id.
	 */
	public Integer getXnatQcassessmentdataScanId();
}
