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
public interface XnatPetscandataI extends XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the parameters/orientation.
	 */
	public Integer getParameters_orientation();

	/**
	 * Sets the value for xnat:petScanData/parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(Integer v) ;

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> List<A> getParameters_addparam();

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> void addParameters_addparam(A item) throws Exception;

	/**
	 * @return Returns the parameters/originalFileName.
	 */
	public String getParameters_originalfilename();

	/**
	 * Sets the value for parameters/originalFileName.
	 * @param v Value to Set.
	 */
	public void setParameters_originalfilename(String v);

	/**
	 * @return Returns the parameters/systemType.
	 */
	public Integer getParameters_systemtype();

	/**
	 * Sets the value for xnat:petScanData/parameters/systemType.
	 * @param v Value to Set.
	 */
	public void setParameters_systemtype(Integer v) ;

	/**
	 * @return Returns the parameters/fileType.
	 */
	public Integer getParameters_filetype();

	/**
	 * Sets the value for xnat:petScanData/parameters/fileType.
	 * @param v Value to Set.
	 */
	public void setParameters_filetype(Integer v) ;

	/**
	 * @return Returns the parameters/transaxialFOV.
	 */
	public Double getParameters_transaxialfov();

	/**
	 * Sets the value for parameters/transaxialFOV.
	 * @param v Value to Set.
	 */
	public void setParameters_transaxialfov(Double v);

	/**
	 * @return Returns the parameters/acqType.
	 */
	public Integer getParameters_acqtype();

	/**
	 * Sets the value for xnat:petScanData/parameters/acqType.
	 * @param v Value to Set.
	 */
	public void setParameters_acqtype(Integer v) ;

	/**
	 * @return Returns the parameters/facility.
	 */
	public String getParameters_facility();

	/**
	 * Sets the value for parameters/facility.
	 * @param v Value to Set.
	 */
	public void setParameters_facility(String v);

	/**
	 * @return Returns the parameters/numPlanes.
	 */
	public Integer getParameters_numplanes();

	/**
	 * Sets the value for xnat:petScanData/parameters/numPlanes.
	 * @param v Value to Set.
	 */
	public void setParameters_numplanes(Integer v) ;

	/**
	 * parameters/frames/frame
	 * @return Returns an List of org.nrg.xdat.model.XnatPetscandataFrameI
	 */
	public <A extends org.nrg.xdat.model.XnatPetscandataFrameI> List<A> getParameters_frames_frame();

	/**
	 * parameters/frames/frame
	 * @return Returns an List of org.nrg.xdat.model.XnatPetscandataFrameI
	 */
	public <A extends org.nrg.xdat.model.XnatPetscandataFrameI> void addParameters_frames_frame(A item) throws Exception;

	/**
	 * @return Returns the parameters/frames/numFrames.
	 */
	public Object getParameters_frames_numframes();

	/**
	 * Sets the value for parameters/frames/numFrames.
	 * @param v Value to Set.
	 */
	public void setParameters_frames_numframes(Object v);

	/**
	 * @return Returns the parameters/numGates.
	 */
	public Integer getParameters_numgates();

	/**
	 * Sets the value for xnat:petScanData/parameters/numGates.
	 * @param v Value to Set.
	 */
	public void setParameters_numgates(Integer v) ;

	/**
	 * @return Returns the parameters/planeSeparation.
	 */
	public Double getParameters_planeseparation();

	/**
	 * Sets the value for parameters/planeSeparation.
	 * @param v Value to Set.
	 */
	public void setParameters_planeseparation(Double v);

	/**
	 * @return Returns the parameters/binSize.
	 */
	public Double getParameters_binsize();

	/**
	 * Sets the value for parameters/binSize.
	 * @param v Value to Set.
	 */
	public void setParameters_binsize(Double v);

	/**
	 * @return Returns the parameters/dataType.
	 */
	public Integer getParameters_datatype();

	/**
	 * Sets the value for xnat:petScanData/parameters/dataType.
	 * @param v Value to Set.
	 */
	public void setParameters_datatype(Integer v) ;

	/**
	 * @return Returns the parameters/dimensions/x.
	 */
	public Integer getParameters_dimensions_x();

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_x(Integer v) ;

	/**
	 * @return Returns the parameters/dimensions/y.
	 */
	public Integer getParameters_dimensions_y();

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_y(Integer v) ;

	/**
	 * @return Returns the parameters/dimensions/z.
	 */
	public Integer getParameters_dimensions_z();

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_z(Integer v) ;

	/**
	 * @return Returns the parameters/dimensions/num.
	 */
	public Integer getParameters_dimensions_num();

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/num.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_num(Integer v) ;

	/**
	 * @return Returns the parameters/offset/x.
	 */
	public Double getParameters_offset_x();

	/**
	 * Sets the value for parameters/offset/x.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_x(Double v);

	/**
	 * @return Returns the parameters/offset/y.
	 */
	public Double getParameters_offset_y();

	/**
	 * Sets the value for parameters/offset/y.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_y(Double v);

	/**
	 * @return Returns the parameters/offset/z.
	 */
	public Double getParameters_offset_z();

	/**
	 * Sets the value for parameters/offset/z.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_z(Double v);

	/**
	 * @return Returns the parameters/reconZoom.
	 */
	public Double getParameters_reconzoom();

	/**
	 * Sets the value for parameters/reconZoom.
	 * @param v Value to Set.
	 */
	public void setParameters_reconzoom(Double v);

	/**
	 * @return Returns the parameters/pixelSize/x.
	 */
	public Double getParameters_pixelsize_x();

	/**
	 * Sets the value for parameters/pixelSize/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_x(Double v);

	/**
	 * @return Returns the parameters/pixelSize/y.
	 */
	public Double getParameters_pixelsize_y();

	/**
	 * Sets the value for parameters/pixelSize/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_y(Double v);

	/**
	 * @return Returns the parameters/pixelSize/z.
	 */
	public Double getParameters_pixelsize_z();

	/**
	 * Sets the value for parameters/pixelSize/z.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_z(Double v);

	/**
	 * @return Returns the parameters/filterCode.
	 */
	public Integer getParameters_filtercode();

	/**
	 * Sets the value for xnat:petScanData/parameters/filterCode.
	 * @param v Value to Set.
	 */
	public void setParameters_filtercode(Integer v) ;

	/**
	 * @return Returns the parameters/resolution/x.
	 */
	public Double getParameters_resolution_x();

	/**
	 * Sets the value for parameters/resolution/x.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_x(Double v);

	/**
	 * @return Returns the parameters/resolution/y.
	 */
	public Double getParameters_resolution_y();

	/**
	 * Sets the value for parameters/resolution/y.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_y(Double v);

	/**
	 * @return Returns the parameters/resolution/z.
	 */
	public Double getParameters_resolution_z();

	/**
	 * Sets the value for parameters/resolution/z.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_z(Double v);

	/**
	 * @return Returns the parameters/numRElements.
	 */
	public Double getParameters_numrelements();

	/**
	 * Sets the value for parameters/numRElements.
	 * @param v Value to Set.
	 */
	public void setParameters_numrelements(Double v);

	/**
	 * @return Returns the parameters/numAngles.
	 */
	public Double getParameters_numangles();

	/**
	 * Sets the value for parameters/numAngles.
	 * @param v Value to Set.
	 */
	public void setParameters_numangles(Double v);

	/**
	 * @return Returns the parameters/ZRotationAngle.
	 */
	public Double getParameters_zrotationangle();

	/**
	 * Sets the value for parameters/ZRotationAngle.
	 * @param v Value to Set.
	 */
	public void setParameters_zrotationangle(Double v);

	/**
	 * @return Returns the parameters/processingCode.
	 */
	public Integer getParameters_processingcode();

	/**
	 * Sets the value for xnat:petScanData/parameters/processingCode.
	 * @param v Value to Set.
	 */
	public void setParameters_processingcode(Integer v) ;

	/**
	 * @return Returns the parameters/gateDuration.
	 */
	public Integer getParameters_gateduration();

	/**
	 * Sets the value for xnat:petScanData/parameters/gateDuration.
	 * @param v Value to Set.
	 */
	public void setParameters_gateduration(Integer v) ;

	/**
	 * @return Returns the parameters/rWaveOffset.
	 */
	public Integer getParameters_rwaveoffset();

	/**
	 * Sets the value for xnat:petScanData/parameters/rWaveOffset.
	 * @param v Value to Set.
	 */
	public void setParameters_rwaveoffset(Integer v) ;

	/**
	 * @return Returns the parameters/numAcceptedBeats.
	 */
	public Integer getParameters_numacceptedbeats();

	/**
	 * Sets the value for xnat:petScanData/parameters/numAcceptedBeats.
	 * @param v Value to Set.
	 */
	public void setParameters_numacceptedbeats(Integer v) ;

	/**
	 * @return Returns the parameters/filter/cutoff.
	 */
	public Double getParameters_filter_cutoff();

	/**
	 * Sets the value for parameters/filter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_filter_cutoff(Double v);

	/**
	 * @return Returns the parameters/annotation.
	 */
	public String getParameters_annotation();

	/**
	 * Sets the value for parameters/annotation.
	 * @param v Value to Set.
	 */
	public void setParameters_annotation(String v);

	/**
	 * @return Returns the parameters/MT_1_1.
	 */
	public Double getParameters_mt11();

	/**
	 * Sets the value for parameters/MT_1_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt11(Double v);

	/**
	 * @return Returns the parameters/MT_1_2.
	 */
	public Double getParameters_mt12();

	/**
	 * Sets the value for parameters/MT_1_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt12(Double v);

	/**
	 * @return Returns the parameters/MT_1_3.
	 */
	public Double getParameters_mt13();

	/**
	 * Sets the value for parameters/MT_1_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt13(Double v);

	/**
	 * @return Returns the parameters/MT_1_4.
	 */
	public Double getParameters_mt14();

	/**
	 * Sets the value for parameters/MT_1_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt14(Double v);

	/**
	 * @return Returns the parameters/MT_2_1.
	 */
	public Double getParameters_mt21();

	/**
	 * Sets the value for parameters/MT_2_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt21(Double v);

	/**
	 * @return Returns the parameters/MT_2_2.
	 */
	public Double getParameters_mt22();

	/**
	 * Sets the value for parameters/MT_2_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt22(Double v);

	/**
	 * @return Returns the parameters/MT_2_3.
	 */
	public Double getParameters_mt23();

	/**
	 * Sets the value for parameters/MT_2_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt23(Double v);

	/**
	 * @return Returns the parameters/MT_2_4.
	 */
	public Double getParameters_mt24();

	/**
	 * Sets the value for parameters/MT_2_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt24(Double v);

	/**
	 * @return Returns the parameters/MT_3_1.
	 */
	public Double getParameters_mt31();

	/**
	 * Sets the value for parameters/MT_3_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt31(Double v);

	/**
	 * @return Returns the parameters/MT_3_2.
	 */
	public Double getParameters_mt32();

	/**
	 * Sets the value for parameters/MT_3_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt32(Double v);

	/**
	 * @return Returns the parameters/MT_3_3.
	 */
	public Double getParameters_mt33();

	/**
	 * Sets the value for parameters/MT_3_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt33(Double v);

	/**
	 * @return Returns the parameters/MT_3_4.
	 */
	public Double getParameters_mt34();

	/**
	 * Sets the value for parameters/MT_3_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt34(Double v);

	/**
	 * @return Returns the parameters/RFilter/cutoff.
	 */
	public Double getParameters_rfilter_cutoff();

	/**
	 * Sets the value for parameters/RFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_cutoff(Double v);

	/**
	 * @return Returns the parameters/RFilter/resolution.
	 */
	public Double getParameters_rfilter_resolution();

	/**
	 * Sets the value for parameters/RFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_resolution(Double v);

	/**
	 * @return Returns the parameters/RFilter/code.
	 */
	public Integer getParameters_rfilter_code();

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_code(Integer v) ;

	/**
	 * @return Returns the parameters/RFilter/order.
	 */
	public Integer getParameters_rfilter_order();

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_order(Integer v) ;

	/**
	 * @return Returns the parameters/ZFilter/cutoff.
	 */
	public Double getParameters_zfilter_cutoff();

	/**
	 * Sets the value for parameters/ZFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_cutoff(Double v);

	/**
	 * @return Returns the parameters/ZFilter/resolution.
	 */
	public Double getParameters_zfilter_resolution();

	/**
	 * Sets the value for parameters/ZFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_resolution(Double v);

	/**
	 * @return Returns the parameters/ZFilter/code.
	 */
	public Integer getParameters_zfilter_code();

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_code(Integer v) ;

	/**
	 * @return Returns the parameters/ZFilter/order.
	 */
	public Integer getParameters_zfilter_order();

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_order(Integer v) ;

	/**
	 * @return Returns the parameters/scatterType.
	 */
	public Integer getParameters_scattertype();

	/**
	 * Sets the value for xnat:petScanData/parameters/scatterType.
	 * @param v Value to Set.
	 */
	public void setParameters_scattertype(Integer v) ;

	/**
	 * @return Returns the parameters/reconType.
	 */
	public Integer getParameters_recontype();

	/**
	 * Sets the value for xnat:petScanData/parameters/reconType.
	 * @param v Value to Set.
	 */
	public void setParameters_recontype(Integer v) ;

	/**
	 * @return Returns the parameters/reconViews.
	 */
	public Integer getParameters_reconviews();

	/**
	 * Sets the value for xnat:petScanData/parameters/reconViews.
	 * @param v Value to Set.
	 */
	public void setParameters_reconviews(Integer v) ;

	/**
	 * @return Returns the parameters/bedPosition.
	 */
	public Double getParameters_bedposition();

	/**
	 * Sets the value for parameters/bedPosition.
	 * @param v Value to Set.
	 */
	public void setParameters_bedposition(Double v);

	/**
	 * @return Returns the parameters/ecatCalibrationFactor.
	 */
	public Double getParameters_ecatcalibrationfactor();

	/**
	 * Sets the value for parameters/ecatCalibrationFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_ecatcalibrationfactor(Double v);

	/**
	 * @return Returns the ecatValidation.
	 */
	public String getEcatvalidation();

	/**
	 * Sets the value for ecatValidation.
	 * @param v Value to Set.
	 */
	public void setEcatvalidation(String v);

	/**
	 * @return Returns the ecatValidation/status.
	 */
	public Boolean getEcatvalidation_status();

	/**
	 * Sets the value for ecatValidation/status.
	 * @param v Value to Set.
	 */
	public void setEcatvalidation_status(Object v);
}
