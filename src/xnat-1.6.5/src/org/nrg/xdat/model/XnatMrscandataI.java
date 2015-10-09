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
public interface XnatMrscandataI extends XnatImagescandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the coil.
	 */
	public String getCoil();

	/**
	 * Sets the value for coil.
	 * @param v Value to Set.
	 */
	public void setCoil(String v);

	/**
	 * @return Returns the fieldStrength.
	 */
	public String getFieldstrength();

	/**
	 * Sets the value for fieldStrength.
	 * @param v Value to Set.
	 */
	public void setFieldstrength(String v);

	/**
	 * @return Returns the marker.
	 */
	public String getMarker();

	/**
	 * Sets the value for marker.
	 * @param v Value to Set.
	 */
	public void setMarker(String v);

	/**
	 * @return Returns the stabilization.
	 */
	public String getStabilization();

	/**
	 * Sets the value for stabilization.
	 * @param v Value to Set.
	 */
	public void setStabilization(String v);

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
	 * Sets the value for xnat:mrScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) ;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y();

	/**
	 * Sets the value for xnat:mrScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) ;

	/**
	 * @return Returns the parameters/matrix/x.
	 */
	public Integer getParameters_matrix_x();

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/x.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_x(Integer v) ;

	/**
	 * @return Returns the parameters/matrix/y.
	 */
	public Integer getParameters_matrix_y();

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/y.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_y(Integer v) ;

	/**
	 * @return Returns the parameters/partitions.
	 */
	public Integer getParameters_partitions();

	/**
	 * Sets the value for xnat:mrScanData/parameters/partitions.
	 * @param v Value to Set.
	 */
	public void setParameters_partitions(Integer v) ;

	/**
	 * @return Returns the parameters/tr.
	 */
	public Double getParameters_tr();

	/**
	 * Sets the value for parameters/tr.
	 * @param v Value to Set.
	 */
	public void setParameters_tr(Double v);

	/**
	 * @return Returns the parameters/te.
	 */
	public Double getParameters_te();

	/**
	 * Sets the value for parameters/te.
	 * @param v Value to Set.
	 */
	public void setParameters_te(Double v);

	/**
	 * @return Returns the parameters/ti.
	 */
	public Double getParameters_ti();

	/**
	 * Sets the value for parameters/ti.
	 * @param v Value to Set.
	 */
	public void setParameters_ti(Double v);

	/**
	 * @return Returns the parameters/flip.
	 */
	public Integer getParameters_flip();

	/**
	 * Sets the value for xnat:mrScanData/parameters/flip.
	 * @param v Value to Set.
	 */
	public void setParameters_flip(Integer v) ;

	/**
	 * @return Returns the parameters/sequence.
	 */
	public String getParameters_sequence();

	/**
	 * Sets the value for parameters/sequence.
	 * @param v Value to Set.
	 */
	public void setParameters_sequence(String v);

	/**
	 * @return Returns the parameters/origin.
	 */
	public String getParameters_origin();

	/**
	 * Sets the value for parameters/origin.
	 * @param v Value to Set.
	 */
	public void setParameters_origin(String v);

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
	 * @return Returns the parameters/scanSequence.
	 */
	public String getParameters_scansequence();

	/**
	 * Sets the value for parameters/scanSequence.
	 * @param v Value to Set.
	 */
	public void setParameters_scansequence(String v);

	/**
	 * @return Returns the parameters/seqVariant.
	 */
	public String getParameters_seqvariant();

	/**
	 * Sets the value for parameters/seqVariant.
	 * @param v Value to Set.
	 */
	public void setParameters_seqvariant(String v);

	/**
	 * @return Returns the parameters/scanOptions.
	 */
	public String getParameters_scanoptions();

	/**
	 * Sets the value for parameters/scanOptions.
	 * @param v Value to Set.
	 */
	public void setParameters_scanoptions(String v);

	/**
	 * @return Returns the parameters/acqType.
	 */
	public String getParameters_acqtype();

	/**
	 * Sets the value for parameters/acqType.
	 * @param v Value to Set.
	 */
	public void setParameters_acqtype(String v);

	/**
	 * @return Returns the parameters/coil.
	 */
	public String getParameters_coil();

	/**
	 * Sets the value for parameters/coil.
	 * @param v Value to Set.
	 */
	public void setParameters_coil(String v);

	/**
	 * @return Returns the parameters/dtiAcqCount.
	 */
	public Integer getParameters_dtiacqcount();

	/**
	 * Sets the value for xnat:mrScanData/parameters/dtiAcqCount.
	 * @param v Value to Set.
	 */
	public void setParameters_dtiacqcount(Integer v) ;

	/**
	 * @return Returns the parameters/pixelBandwidth.
	 */
	public Double getParameters_pixelbandwidth();

	/**
	 * Sets the value for parameters/pixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelbandwidth(Double v);

	/**
	 * @return Returns the parameters/diffusion/bValues.
	 */
	public String getParameters_diffusion_bvalues();

	/**
	 * Sets the value for parameters/diffusion/bValues.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_bvalues(String v);

	/**
	 * @return Returns the parameters/diffusion/directionality.
	 */
	public String getParameters_diffusion_directionality();

	/**
	 * Sets the value for parameters/diffusion/directionality.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_directionality(String v);

	/**
	 * @return Returns the parameters/diffusion/orientations.
	 */
	public String getParameters_diffusion_orientations();

	/**
	 * Sets the value for parameters/diffusion/orientations.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_orientations(String v);

	/**
	 * @return Returns the parameters/diffusion/anisotropyType.
	 */
	public String getParameters_diffusion_anisotropytype();

	/**
	 * Sets the value for parameters/diffusion/anisotropyType.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_anisotropytype(String v);

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
