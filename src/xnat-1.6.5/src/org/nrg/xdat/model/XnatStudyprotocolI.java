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
public interface XnatStudyprotocolI extends XnatAbstractprotocolI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * acqConditions/condition
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolConditionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolConditionI> List<A> getAcqconditions_condition();

	/**
	 * acqConditions/condition
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolConditionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolConditionI> void addAcqconditions_condition(A item) throws Exception;

	/**
	 * subjectGroups/group
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolGroupI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolGroupI> List<A> getSubjectgroups_group();

	/**
	 * subjectGroups/group
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolGroupI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolGroupI> void addSubjectgroups_group(A item) throws Exception;

	/**
	 * subjectVariables/variable
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolVariableI> List<A> getSubjectvariables_variable();

	/**
	 * subjectVariables/variable
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolVariableI> void addSubjectvariables_variable(A item) throws Exception;

	/**
	 * imageSessionTypes/session
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolSessionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolSessionI> List<A> getImagesessiontypes_session();

	/**
	 * imageSessionTypes/session
	 * @return Returns an List of org.nrg.xdat.model.XnatStudyprotocolSessionI
	 */
	public <A extends org.nrg.xdat.model.XnatStudyprotocolSessionI> void addImagesessiontypes_session(A item) throws Exception;
}
