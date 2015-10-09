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
public interface XdatCriteriaSetI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * criteria
	 * @return Returns an List of org.nrg.xdat.model.XdatCriteriaI
	 */
	public <A extends org.nrg.xdat.model.XdatCriteriaI> List<A> getCriteria();

	/**
	 * criteria
	 * @return Returns an List of org.nrg.xdat.model.XdatCriteriaI
	 */
	public <A extends org.nrg.xdat.model.XdatCriteriaI> void addCriteria(A item) throws Exception;

	/**
	 * child_set
	 * @return Returns an List of org.nrg.xdat.model.XdatCriteriaSetI
	 */
	public <A extends org.nrg.xdat.model.XdatCriteriaSetI> List<A> getChildSet();

	/**
	 * child_set
	 * @return Returns an List of org.nrg.xdat.model.XdatCriteriaSetI
	 */
	public <A extends org.nrg.xdat.model.XdatCriteriaSetI> void addChildSet(A item) throws Exception;

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
	 * @return Returns the xdat_criteria_set_id.
	 */
	public Integer getXdatCriteriaSetId();
}
