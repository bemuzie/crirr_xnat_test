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
public interface XnatImageresourceseriesI extends XnatResourceseriesI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the dimensions/x.
	 */
	public Integer getDimensions_x();

	/**
	 * Sets the value for xnat:imageResourceSeries/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setDimensions_x(Integer v) ;

	/**
	 * @return Returns the dimensions/y.
	 */
	public Integer getDimensions_y();

	/**
	 * Sets the value for xnat:imageResourceSeries/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setDimensions_y(Integer v) ;

	/**
	 * @return Returns the dimensions/z.
	 */
	public Integer getDimensions_z();

	/**
	 * Sets the value for xnat:imageResourceSeries/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setDimensions_z(Integer v) ;

	/**
	 * @return Returns the dimensions/volumes.
	 */
	public Integer getDimensions_volumes();

	/**
	 * Sets the value for xnat:imageResourceSeries/dimensions/volumes.
	 * @param v Value to Set.
	 */
	public void setDimensions_volumes(Integer v) ;

	/**
	 * @return Returns the voxelRes/x.
	 */
	public Double getVoxelres_x();

	/**
	 * Sets the value for voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setVoxelres_x(Double v);

	/**
	 * @return Returns the voxelRes/y.
	 */
	public Double getVoxelres_y();

	/**
	 * Sets the value for voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setVoxelres_y(Double v);

	/**
	 * @return Returns the voxelRes/z.
	 */
	public Double getVoxelres_z();

	/**
	 * Sets the value for voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setVoxelres_z(Double v);

	/**
	 * @return Returns the voxelRes/units.
	 */
	public String getVoxelres_units();

	/**
	 * Sets the value for voxelRes/units.
	 * @param v Value to Set.
	 */
	public void setVoxelres_units(String v);

	/**
	 * @return Returns the orientation.
	 */
	public String getOrientation();

	/**
	 * Sets the value for orientation.
	 * @param v Value to Set.
	 */
	public void setOrientation(String v);
}
