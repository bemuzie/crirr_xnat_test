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
public interface XnatDatatypeprotocolI extends XnatAbstractprotocolI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * definitions/definition
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupI> List<A> getDefinitions_definition();

	/**
	 * definitions/definition
	 * @return Returns an List of org.nrg.xdat.model.XnatFielddefinitiongroupI
	 */
	public <A extends org.nrg.xdat.model.XnatFielddefinitiongroupI> void addDefinitions_definition(A item) throws Exception;
}
