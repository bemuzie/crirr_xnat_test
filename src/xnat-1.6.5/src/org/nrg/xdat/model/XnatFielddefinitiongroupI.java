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
public interface XnatFielddefinitiongroupI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldI> List<A> getFields_field();

	/**
	 * fields/field
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupFieldI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldI> void addFields_field(A item) throws Exception;

	/**
	 * @return Returns the ID.
	 */
	public String getId();

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v);

	/**
	 * @return Returns the data-type.
	 */
	public String getDataType();

	/**
	 * Sets the value for data-type.
	 * @param v Value to Set.
	 */
	public void setDataType(String v);

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
	 * @return Returns the shareable.
	 */
	public Boolean getShareable();

	/**
	 * Sets the value for shareable.
	 * @param v Value to Set.
	 */
	public void setShareable(Object v);

	/**
	 * @return Returns the project-specific.
	 */
	public Boolean getProjectSpecific();

	/**
	 * Sets the value for project-specific.
	 * @param v Value to Set.
	 */
	public void setProjectSpecific(Object v);

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_id.
	 */
	public Integer getXnatFielddefinitiongroupId();
}
