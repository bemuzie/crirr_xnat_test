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
public interface XdatFieldMappingSetI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * allow
	 * @return Returns an List of org.nrg.xdat.model.XdatFieldMappingI
	 */
	public <A extends org.nrg.xdat.model.XdatFieldMappingI> List<A> getAllow();

	/**
	 * allow
	 * @return Returns an List of org.nrg.xdat.model.XdatFieldMappingI
	 */
	public <A extends org.nrg.xdat.model.XdatFieldMappingI> void addAllow(A item) throws Exception;

	/**
	 * sub_set
	 * @return Returns an List of org.nrg.xdat.model.XdatFieldMappingSetI
	 */
	public <A extends org.nrg.xdat.model.XdatFieldMappingSetI> List<A> getSubSet();

	/**
	 * sub_set
	 * @return Returns an List of org.nrg.xdat.model.XdatFieldMappingSetI
	 */
	public <A extends org.nrg.xdat.model.XdatFieldMappingSetI> void addSubSet(A item) throws Exception;

	/**
	 * @return Returns the method.
	 */
	public String getMethod();

	/**
	 * Sets the value for method.
	 * @param v Value to Set.
	 */
	public void setMethod(String v);

	/**
	 * @return Returns the xdat_field_mapping_set_id.
	 */
	public Integer getXdatFieldMappingSetId();
}
