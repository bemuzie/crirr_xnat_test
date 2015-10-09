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
public interface XnatStatisticsdataI extends XnatAbstractstatisticsI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the mean.
	 */
	public Double getMean();

	/**
	 * Sets the value for mean.
	 * @param v Value to Set.
	 */
	public void setMean(Double v);

	/**
	 * @return Returns the snr.
	 */
	public Double getSnr();

	/**
	 * Sets the value for snr.
	 * @param v Value to Set.
	 */
	public void setSnr(Double v);

	/**
	 * @return Returns the min.
	 */
	public Double getMin();

	/**
	 * Sets the value for min.
	 * @param v Value to Set.
	 */
	public void setMin(Double v);

	/**
	 * @return Returns the max.
	 */
	public Double getMax();

	/**
	 * Sets the value for max.
	 * @param v Value to Set.
	 */
	public void setMax(Double v);

	/**
	 * @return Returns the stddev.
	 */
	public Double getStddev();

	/**
	 * Sets the value for stddev.
	 * @param v Value to Set.
	 */
	public void setStddev(Double v);

	/**
	 * @return Returns the no_of_voxels.
	 */
	public Integer getNoOfVoxels();

	/**
	 * Sets the value for xnat:statisticsData/no_of_voxels.
	 * @param v Value to Set.
	 */
	public void setNoOfVoxels(Integer v) ;

	/**
	 * additionalStatistics
	 * @return Returns an List of org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI> List<A> getAdditionalstatistics();

	/**
	 * additionalStatistics
	 * @return Returns an List of org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAdditionalstatisticsI> void addAdditionalstatistics(A item) throws Exception;

	/**
	 * addField
	 * @return Returns an List of org.nrg.xdat.model.XnatStatisticsdataAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAddfieldI> List<A> getAddfield();

	/**
	 * addField
	 * @return Returns an List of org.nrg.xdat.model.XnatStatisticsdataAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatStatisticsdataAddfieldI> void addAddfield(A item) throws Exception;
}
