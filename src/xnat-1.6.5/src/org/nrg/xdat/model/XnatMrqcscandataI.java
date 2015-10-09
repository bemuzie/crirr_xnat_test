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
public interface XnatMrqcscandataI extends XnatQcscandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the blurring.
	 */
	public String getBlurring();

	/**
	 * Sets the value for blurring.
	 * @param v Value to Set.
	 */
	public void setBlurring(String v);

	/**
	 * @return Returns the flow.
	 */
	public String getFlow();

	/**
	 * Sets the value for flow.
	 * @param v Value to Set.
	 */
	public void setFlow(String v);

	/**
	 * @return Returns the imageContrast.
	 */
	public String getImagecontrast();

	/**
	 * Sets the value for imageContrast.
	 * @param v Value to Set.
	 */
	public void setImagecontrast(String v);

	/**
	 * @return Returns the inhomogeneity.
	 */
	public String getInhomogeneity();

	/**
	 * Sets the value for inhomogeneity.
	 * @param v Value to Set.
	 */
	public void setInhomogeneity(String v);

	/**
	 * @return Returns the wrap.
	 */
	public String getWrap();

	/**
	 * Sets the value for wrap.
	 * @param v Value to Set.
	 */
	public void setWrap(String v);

	/**
	 * @return Returns the susceptibility.
	 */
	public String getSusceptibility();

	/**
	 * Sets the value for susceptibility.
	 * @param v Value to Set.
	 */
	public void setSusceptibility(String v);

	/**
	 * @return Returns the interpacMotion.
	 */
	public String getInterpacmotion();

	/**
	 * Sets the value for interpacMotion.
	 * @param v Value to Set.
	 */
	public void setInterpacmotion(String v);
}
