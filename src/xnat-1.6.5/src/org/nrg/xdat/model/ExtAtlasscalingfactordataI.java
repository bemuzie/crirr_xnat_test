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
public interface ExtAtlasscalingfactordataI extends XnatMrassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the scalingFactor.
	 */
	public Double getScalingfactor();

	/**
	 * Sets the value for scalingFactor.
	 * @param v Value to Set.
	 */
	public void setScalingfactor(Double v);

	/**
	 * @return Returns the eta.
	 */
	public Double getEta();

	/**
	 * Sets the value for eta.
	 * @param v Value to Set.
	 */
	public void setEta(Double v);

	/**
	 * @return Returns the eICV.
	 */
	public Double getEicv();

	/**
	 * Sets the value for eICV.
	 * @param v Value to Set.
	 */
	public void setEicv(Double v);

	/**
	 * @return Returns the baseScanNumber.
	 */
	public String getBasescannumber();

	/**
	 * Sets the value for baseScanNumber.
	 * @param v Value to Set.
	 */
	public void setBasescannumber(String v);
}
