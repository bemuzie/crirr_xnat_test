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
public interface XnatFielddefinitiongroupFieldI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * possibleValues/possibleValue
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI> List<A> getPossiblevalues_possiblevalue();

	/**
	 * possibleValues/possibleValue
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupFieldPossiblevalueI> void addPossiblevalues_possiblevalue(A item) throws Exception;

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
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);

	/**
	 * @return Returns the datatype.
	 */
	public String getDatatype();

	/**
	 * Sets the value for datatype.
	 * @param v Value to Set.
	 */
	public void setDatatype(String v);

	/**
	 * @return Returns the required.
	 */
	public Boolean getRequired();

	/**
	 * Sets the value for required.
	 * @param v Value to Set.
	 */
	public void setRequired(Object v);

	/**
	 * @return Returns the sequence.
	 */
	public Integer getSequence();

	/**
	 * Sets the value for xnat:fieldDefinitionGroup_field/sequence.
	 * @param v Value to Set.
	 */
	public void setSequence(Integer v) ;

	/**
	 * @return Returns the xmlPath.
	 */
	public String getXmlpath();

	/**
	 * Sets the value for xmlPath.
	 * @param v Value to Set.
	 */
	public void setXmlpath(String v);

	/**
	 * @return Returns the group.
	 */
	public String getGroup();

	/**
	 * Sets the value for group.
	 * @param v Value to Set.
	 */
	public void setGroup(String v);

	/**
	 * @return Returns the xnat_fieldDefinitionGroup_field_id.
	 */
	public Integer getXnatFielddefinitiongroupFieldId();
}
