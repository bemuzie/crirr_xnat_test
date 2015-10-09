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
public interface XnatOptscandataI extends XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the parameters/voxelRes/units.
	 */
	public String getParameters_voxelres_units();

	/**
	 * Sets the value for parameters/voxelRes/units.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_units(String v);

	/**
	 * @return Returns the parameters/voxelRes/x.
	 */
	public Double getParameters_voxelres_x();

	/**
	 * Sets the value for parameters/voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_x(Double v);

	/**
	 * @return Returns the parameters/voxelRes/y.
	 */
	public Double getParameters_voxelres_y();

	/**
	 * Sets the value for parameters/voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_y(Double v);

	/**
	 * @return Returns the parameters/voxelRes/z.
	 */
	public Double getParameters_voxelres_z();

	/**
	 * Sets the value for parameters/voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_z(Double v);

	/**
	 * @return Returns the parameters/fov/x.
	 */
	public Integer getParameters_fov_x();

	/**
	 * Sets the value for xnat:optScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) ;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y();

	/**
	 * Sets the value for xnat:optScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) ;

	/**
	 * @return Returns the parameters/laterality.
	 */
	public String getParameters_laterality();

	/**
	 * Sets the value for parameters/laterality.
	 * @param v Value to Set.
	 */
	public void setParameters_laterality(String v);

	/**
	 * @return Returns the parameters/illumination_wavelength.
	 */
	public String getParameters_illuminationWavelength();

	/**
	 * Sets the value for parameters/illumination_wavelength.
	 * @param v Value to Set.
	 */
	public void setParameters_illuminationWavelength(String v);

	/**
	 * @return Returns the parameters/illumination_power.
	 */
	public String getParameters_illuminationPower();

	/**
	 * Sets the value for parameters/illumination_power.
	 * @param v Value to Set.
	 */
	public void setParameters_illuminationPower(String v);

	/**
	 * @return Returns the parameters/imageType.
	 */
	public String getParameters_imagetype();

	/**
	 * Sets the value for parameters/imageType.
	 * @param v Value to Set.
	 */
	public void setParameters_imagetype(String v);

	/**
	 * @return Returns the dcmValidation.
	 */
	public String getDcmvalidation();

	/**
	 * Sets the value for dcmValidation.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation(String v);

	/**
	 * @return Returns the dcmValidation/status.
	 */
	public Boolean getDcmvalidation_status();

	/**
	 * Sets the value for dcmValidation/status.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation_status(Object v);
}
