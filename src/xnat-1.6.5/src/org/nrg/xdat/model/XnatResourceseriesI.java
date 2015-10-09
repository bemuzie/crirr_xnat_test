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
public interface XnatResourceseriesI extends XnatAbstractresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the path.
	 */
	public String getPath();

	/**
	 * Sets the value for path.
	 * @param v Value to Set.
	 */
	public void setPath(String v);

	/**
	 * @return Returns the pattern.
	 */
	public String getPattern();

	/**
	 * Sets the value for pattern.
	 * @param v Value to Set.
	 */
	public void setPattern(String v);

	/**
	 * @return Returns the count.
	 */
	public Integer getCount();

	/**
	 * Sets the value for xnat:resourceSeries/count.
	 * @param v Value to Set.
	 */
	public void setCount(Integer v) ;

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
}
