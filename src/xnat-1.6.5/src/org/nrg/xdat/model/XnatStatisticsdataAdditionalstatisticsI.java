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
public interface XnatStatisticsdataAdditionalstatisticsI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the additionalStatistics.
	 */
	public Double getAdditionalstatistics();

	/**
	 * Sets the value for additionalStatistics.
	 * @param v Value to Set.
	 */
	public void setAdditionalstatistics(Double v);

	/**
	 * @return Returns the name.
	 */
	public String getName();

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v);

	/**
	 * @return Returns the xnat_statisticsData_additionalStatistics_id.
	 */
	public Integer getXnatStatisticsdataAdditionalstatisticsId();
}
