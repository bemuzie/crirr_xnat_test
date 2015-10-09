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
public interface XnatDicomseriesI extends XnatAbstractresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the dimensions/x.
	 */
	public Integer getDimensions_x();

	/**
	 * Sets the value for xnat:dicomSeries/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setDimensions_x(Integer v) ;

	/**
	 * @return Returns the dimensions/y.
	 */
	public Integer getDimensions_y();

	/**
	 * Sets the value for xnat:dicomSeries/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setDimensions_y(Integer v) ;

	/**
	 * @return Returns the dimensions/z.
	 */
	public Integer getDimensions_z();

	/**
	 * Sets the value for xnat:dicomSeries/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setDimensions_z(Integer v) ;

	/**
	 * @return Returns the dimensions/volumes.
	 */
	public Integer getDimensions_volumes();

	/**
	 * Sets the value for xnat:dicomSeries/dimensions/volumes.
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

	/**
	 * imageSet/image
	 * @return Returns an List of org.nrg.xdat.model.XnatDicomseriesImageI
	 */
	public <A extends org.nrg.xdat.model.XnatDicomseriesImageI> List<A> getImageset_image();

	/**
	 * imageSet/image
	 * @return Returns an List of org.nrg.xdat.model.XnatDicomseriesImageI
	 */
	public <A extends org.nrg.xdat.model.XnatDicomseriesImageI> void addImageset_image(A item) throws Exception;

	/**
	 * @return Returns the format.
	 */
	public String getFormat();

	/**
	 * Sets the value for format.
	 * @param v Value to Set.
	 */
	public void setFormat(String v);

	/**
	 * @return Returns the description.
	 */
	public String getDescription();

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v);

	/**
	 * @return Returns the content.
	 */
	public String getContent();

	/**
	 * Sets the value for content.
	 * @param v Value to Set.
	 */
	public void setContent(String v);

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
	 * @return Returns the UID.
	 */
	public String getUid();

	/**
	 * Sets the value for UID.
	 * @param v Value to Set.
	 */
	public void setUid(String v);
}
