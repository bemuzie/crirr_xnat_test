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
public interface XnatXascandataI extends XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the parameters/pixelRes/units.
	 */
	public String getParameters_pixelres_units();

	/**
	 * Sets the value for parameters/pixelRes/units.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_units(String v);

	/**
	 * @return Returns the parameters/pixelRes/x.
	 */
	public Integer getParameters_pixelres_x();

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_x(Integer v) ;

	/**
	 * @return Returns the parameters/pixelRes/y.
	 */
	public Integer getParameters_pixelres_y();

	/**
	 * Sets the value for xnat:xaScanData/parameters/pixelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelres_y(Integer v) ;

	/**
	 * @return Returns the parameters/orientation.
	 */
	public String getParameters_orientation();

	/**
	 * Sets the value for parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(String v);

	/**
	 * @return Returns the parameters/fov/x.
	 */
	public Integer getParameters_fov_x();

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) ;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y();

	/**
	 * Sets the value for xnat:xaScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) ;

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
	 * @return Returns the parameters/options.
	 */
	public String getParameters_options();

	/**
	 * Sets the value for parameters/options.
	 * @param v Value to Set.
	 */
	public void setParameters_options(String v);

	/**
	 * @return Returns the parameters/derivation.
	 */
	public String getParameters_derivation();

	/**
	 * Sets the value for parameters/derivation.
	 * @param v Value to Set.
	 */
	public void setParameters_derivation(String v);

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.model.XnatContrastbolusI
	 */
	public org.nrg.xdat.model.XnatContrastbolusI getParameters_contrastbolus();

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.model.XnatContrastbolusI
	 */
	public <A extends org.nrg.xdat.model.XnatContrastbolusI> void setParameters_contrastbolus(A item) throws Exception;

	/**
	 * @return Returns the xnat:xaScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 */
	public Integer getParameters_contrastbolusFK();
}
