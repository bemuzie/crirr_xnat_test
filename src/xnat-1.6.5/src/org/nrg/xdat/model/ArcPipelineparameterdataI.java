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
public interface ArcPipelineparameterdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the schemaLink.
	 */
	public String getSchemalink();

	/**
	 * Sets the value for schemaLink.
	 * @param v Value to Set.
	 */
	public void setSchemalink(String v);

	/**
	 * @return Returns the csvValues.
	 */
	public String getCsvvalues();

	/**
	 * Sets the value for csvValues.
	 * @param v Value to Set.
	 */
	public void setCsvvalues(String v);

	/**
	 * @return Returns the csvValues/selected.
	 */
	public String getCsvvalues_selected();

	/**
	 * Sets the value for csvValues/selected.
	 * @param v Value to Set.
	 */
	public void setCsvvalues_selected(String v);

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
	 * @return Returns the name.
	 */
	public String getName();

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v);

	/**
	 * @return Returns the multipleValues.
	 */
	public Boolean getMultiplevalues();

	/**
	 * Sets the value for multipleValues.
	 * @param v Value to Set.
	 */
	public void setMultiplevalues(Object v);

	/**
	 * @return Returns the editable.
	 */
	public Boolean getEditable();

	/**
	 * Sets the value for editable.
	 * @param v Value to Set.
	 */
	public void setEditable(Object v);

	/**
	 * @return Returns the batchParam.
	 */
	public Boolean getBatchparam();

	/**
	 * Sets the value for batchParam.
	 * @param v Value to Set.
	 */
	public void setBatchparam(Object v);

	/**
	 * @return Returns the arc_pipelineParameterData_id.
	 */
	public Integer getArcPipelineparameterdataId();
}
