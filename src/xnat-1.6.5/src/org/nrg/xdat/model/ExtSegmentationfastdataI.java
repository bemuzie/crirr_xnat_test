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
public interface ExtSegmentationfastdataI extends XnatMrassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * brainVolume
	 * @return org.nrg.xdat.model.XnatVolumetricregionI
	 */
	public org.nrg.xdat.model.XnatVolumetricregionI getBrainvolume();

	/**
	 * brainVolume
	 * @return org.nrg.xdat.model.XnatVolumetricregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionI> void setBrainvolume(A item) throws Exception;

	/**
	 * @return Returns the ext:segmentationFastData/brainvolume_xnat_volumetricregion_id.
	 */
	public Integer getBrainvolumeFK();

	/**
	 * @return Returns the brainPercent.
	 */
	public Double getBrainpercent();

	/**
	 * Sets the value for brainPercent.
	 * @param v Value to Set.
	 */
	public void setBrainpercent(Double v);
}
