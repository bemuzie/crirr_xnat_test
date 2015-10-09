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
public interface XnatQcassessmentdataScanSliceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * sliceStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public org.nrg.xdat.model.XnatAbstractstatisticsI getSlicestatistics();

	/**
	 * sliceStatistics
	 * @return org.nrg.xdat.model.XnatAbstractstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractstatisticsI> void setSlicestatistics(A item) throws Exception;

	/**
	 * @return Returns the xnat:qcAssessmentData_scan_slice/slicestatistics_xnat_abstractstatistics_id.
	 */
	public Integer getSlicestatisticsFK();

	/**
	 * @return Returns the number.
	 */
	public String getNumber();

	/**
	 * Sets the value for number.
	 * @param v Value to Set.
	 */
	public void setNumber(String v);

	/**
	 * @return Returns the xnat_qcAssessmentData_scan_slice_id.
	 */
	public Integer getXnatQcassessmentdataScanSliceId();
}
