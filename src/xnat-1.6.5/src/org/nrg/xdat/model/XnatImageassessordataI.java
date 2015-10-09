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
public interface XnatImageassessordataI extends XnatDeriveddataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * in/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getIn_file();

	/**
	 * in/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addIn_file(A item) throws Exception;

	/**
	 * out/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> List<A> getOut_file();

	/**
	 * out/file
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceI> void addOut_file(A item) throws Exception;

	/**
	 * @return Returns the imageSession_ID.
	 */
	public String getImagesessionId();

	/**
	 * Sets the value for imageSession_ID.
	 * @param v Value to Set.
	 */
	public void setImagesessionId(String v);

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
}
