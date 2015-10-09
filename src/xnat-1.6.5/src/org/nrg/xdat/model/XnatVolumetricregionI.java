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
public interface XnatVolumetricregionI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * subregions/subregion
	 * @return Returns an List of org.nrg.xdat.model.XnatVolumetricregionSubregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionSubregionI> List<A> getSubregions_subregion();

	/**
	 * subregions/subregion
	 * @return Returns an List of org.nrg.xdat.model.XnatVolumetricregionSubregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionSubregionI> void addSubregions_subregion(A item) throws Exception;

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
	 * @return Returns the units.
	 */
	public String getUnits();

	/**
	 * Sets the value for units.
	 * @param v Value to Set.
	 */
	public void setUnits(String v);

	/**
	 * @return Returns the voxels.
	 */
	public Integer getVoxels();

	/**
	 * Sets the value for xnat:volumetricRegion/voxels.
	 * @param v Value to Set.
	 */
	public void setVoxels(Integer v) ;

	/**
	 * @return Returns the hemisphere.
	 */
	public String getHemisphere();

	/**
	 * Sets the value for hemisphere.
	 * @param v Value to Set.
	 */
	public void setHemisphere(String v);

	/**
	 * @return Returns the xnat_volumetricRegion_id.
	 */
	public Integer getXnatVolumetricregionId();
}
