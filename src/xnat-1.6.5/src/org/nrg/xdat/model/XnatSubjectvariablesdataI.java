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
public interface XnatSubjectvariablesdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * variables/variable
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectvariablesdataVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectvariablesdataVariableI> List<A> getVariables_variable();

	/**
	 * variables/variable
	 * @return Returns an List of org.nrg.xdat.model.XnatSubjectvariablesdataVariableI
	 */
	public <A extends org.nrg.xdat.model.XnatSubjectvariablesdataVariableI> void addVariables_variable(A item) throws Exception;
}
