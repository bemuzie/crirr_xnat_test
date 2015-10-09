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
public interface XnatCtscandataI extends XnatImagescandataI {

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
	 * Sets the value for xnat:ctScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) ;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y();

	/**
	 * Sets the value for xnat:ctScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) ;

	/**
	 * @return Returns the parameters/rescale/intercept.
	 */
	public String getParameters_rescale_intercept();

	/**
	 * Sets the value for parameters/rescale/intercept.
	 * @param v Value to Set.
	 */
	public void setParameters_rescale_intercept(String v);

	/**
	 * @return Returns the parameters/rescale/slope.
	 */
	public String getParameters_rescale_slope();

	/**
	 * Sets the value for parameters/rescale/slope.
	 * @param v Value to Set.
	 */
	public void setParameters_rescale_slope(String v);

	/**
	 * @return Returns the parameters/kvp.
	 */
	public Double getParameters_kvp();

	/**
	 * Sets the value for parameters/kvp.
	 * @param v Value to Set.
	 */
	public void setParameters_kvp(Double v);

	/**
	 * @return Returns the parameters/acquisitionNumber.
	 */
	public Integer getParameters_acquisitionnumber();

	/**
	 * Sets the value for xnat:ctScanData/parameters/acquisitionNumber.
	 * @param v Value to Set.
	 */
	public void setParameters_acquisitionnumber(Integer v) ;

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
	 * @return Returns the parameters/collectionDiameter.
	 */
	public Double getParameters_collectiondiameter();

	/**
	 * Sets the value for parameters/collectionDiameter.
	 * @param v Value to Set.
	 */
	public void setParameters_collectiondiameter(Double v);

	/**
	 * @return Returns the parameters/distanceSourceToDetector.
	 */
	public Double getParameters_distancesourcetodetector();

	/**
	 * Sets the value for parameters/distanceSourceToDetector.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetodetector(Double v);

	/**
	 * @return Returns the parameters/distanceSourceToPatient.
	 */
	public Double getParameters_distancesourcetopatient();

	/**
	 * Sets the value for parameters/distanceSourceToPatient.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetopatient(Double v);

	/**
	 * @return Returns the parameters/gantryTilt.
	 */
	public Double getParameters_gantrytilt();

	/**
	 * Sets the value for parameters/gantryTilt.
	 * @param v Value to Set.
	 */
	public void setParameters_gantrytilt(Double v);

	/**
	 * @return Returns the parameters/tableHeight.
	 */
	public Double getParameters_tableheight();

	/**
	 * Sets the value for parameters/tableHeight.
	 * @param v Value to Set.
	 */
	public void setParameters_tableheight(Double v);

	/**
	 * @return Returns the parameters/rotationDirection.
	 */
	public String getParameters_rotationdirection();

	/**
	 * Sets the value for parameters/rotationDirection.
	 * @param v Value to Set.
	 */
	public void setParameters_rotationdirection(String v);

	/**
	 * @return Returns the parameters/exposureTime.
	 */
	public Double getParameters_exposuretime();

	/**
	 * Sets the value for parameters/exposureTime.
	 * @param v Value to Set.
	 */
	public void setParameters_exposuretime(Double v);

	/**
	 * @return Returns the parameters/xrayTubeCurrent.
	 */
	public Double getParameters_xraytubecurrent();

	/**
	 * Sets the value for parameters/xrayTubeCurrent.
	 * @param v Value to Set.
	 */
	public void setParameters_xraytubecurrent(Double v);

	/**
	 * @return Returns the parameters/exposure.
	 */
	public Double getParameters_exposure();

	/**
	 * Sets the value for parameters/exposure.
	 * @param v Value to Set.
	 */
	public void setParameters_exposure(Double v);

	/**
	 * @return Returns the parameters/filter.
	 */
	public String getParameters_filter();

	/**
	 * Sets the value for parameters/filter.
	 * @param v Value to Set.
	 */
	public void setParameters_filter(String v);

	/**
	 * @return Returns the parameters/generatorPower.
	 */
	public Double getParameters_generatorpower();

	/**
	 * Sets the value for parameters/generatorPower.
	 * @param v Value to Set.
	 */
	public void setParameters_generatorpower(Double v);

	/**
	 * parameters/focalSpots/focalSpot
	 * @return Returns an List of org.nrg.xdat.model.XnatCtscandataFocalspotI
	 */
	public <A extends org.nrg.xdat.model.XnatCtscandataFocalspotI> List<A> getParameters_focalspots_focalspot();

	/**
	 * parameters/focalSpots/focalSpot
	 * @return Returns an List of org.nrg.xdat.model.XnatCtscandataFocalspotI
	 */
	public <A extends org.nrg.xdat.model.XnatCtscandataFocalspotI> void addParameters_focalspots_focalspot(A item) throws Exception;

	/**
	 * @return Returns the parameters/convolutionKernel.
	 */
	public String getParameters_convolutionkernel();

	/**
	 * Sets the value for parameters/convolutionKernel.
	 * @param v Value to Set.
	 */
	public void setParameters_convolutionkernel(String v);

	/**
	 * @return Returns the parameters/collimationWidth/single.
	 */
	public Double getParameters_collimationwidth_single();

	/**
	 * Sets the value for parameters/collimationWidth/single.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_single(Double v);

	/**
	 * @return Returns the parameters/collimationWidth/total.
	 */
	public Double getParameters_collimationwidth_total();

	/**
	 * Sets the value for parameters/collimationWidth/total.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_total(Double v);

	/**
	 * @return Returns the parameters/tableSpeed.
	 */
	public Double getParameters_tablespeed();

	/**
	 * Sets the value for parameters/tableSpeed.
	 * @param v Value to Set.
	 */
	public void setParameters_tablespeed(Double v);

	/**
	 * @return Returns the parameters/tableFeedPerRotation.
	 */
	public Double getParameters_tablefeedperrotation();

	/**
	 * Sets the value for parameters/tableFeedPerRotation.
	 * @param v Value to Set.
	 */
	public void setParameters_tablefeedperrotation(Double v);

	/**
	 * @return Returns the parameters/pitchFactor.
	 */
	public Double getParameters_pitchfactor();

	/**
	 * Sets the value for parameters/pitchFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_pitchfactor(Double v);

	/**
	 * @return Returns the parameters/estimatedDoseSaving/modulation.
	 */
	public String getParameters_estimateddosesaving_modulation();

	/**
	 * Sets the value for parameters/estimatedDoseSaving/modulation.
	 * @param v Value to Set.
	 */
	public void setParameters_estimateddosesaving_modulation(String v);

	/**
	 * @return Returns the parameters/estimatedDoseSaving.
	 */
	public Double getParameters_estimateddosesaving();

	/**
	 * Sets the value for parameters/estimatedDoseSaving.
	 * @param v Value to Set.
	 */
	public void setParameters_estimateddosesaving(Double v);

	/**
	 * @return Returns the parameters/ctDIvol.
	 */
	public Double getParameters_ctdivol();

	/**
	 * Sets the value for parameters/ctDIvol.
	 * @param v Value to Set.
	 */
	public void setParameters_ctdivol(Double v);

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
	 * @return Returns the xnat:ctScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 */
	public Integer getParameters_contrastbolusFK();

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
