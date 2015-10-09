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
public interface ProvProcessstepI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the program.
	 */
	public String getProgram();

	/**
	 * Sets the value for program.
	 * @param v Value to Set.
	 */
	public void setProgram(String v);

	/**
	 * @return Returns the program/version.
	 */
	public String getProgram_version();

	/**
	 * Sets the value for program/version.
	 * @param v Value to Set.
	 */
	public void setProgram_version(String v);

	/**
	 * @return Returns the program/arguments.
	 */
	public String getProgram_arguments();

	/**
	 * Sets the value for program/arguments.
	 * @param v Value to Set.
	 */
	public void setProgram_arguments(String v);

	/**
	 * @return Returns the timestamp.
	 */
	public Object getTimestamp();

	/**
	 * Sets the value for timestamp.
	 * @param v Value to Set.
	 */
	public void setTimestamp(Object v);

	/**
	 * @return Returns the cvs.
	 */
	public String getCvs();

	/**
	 * Sets the value for cvs.
	 * @param v Value to Set.
	 */
	public void setCvs(String v);

	/**
	 * @return Returns the user.
	 */
	public String getuserProperty();

	/**
	 * Sets the value for user.
	 * @param v Value to Set.
	 */
	public void setuserProperty(String v);

	/**
	 * @return Returns the machine.
	 */
	public String getMachine();

	/**
	 * Sets the value for machine.
	 * @param v Value to Set.
	 */
	public void setMachine(String v);

	/**
	 * @return Returns the platform.
	 */
	public String getPlatform();

	/**
	 * Sets the value for platform.
	 * @param v Value to Set.
	 */
	public void setPlatform(String v);

	/**
	 * @return Returns the platform/version.
	 */
	public String getPlatform_version();

	/**
	 * Sets the value for platform/version.
	 * @param v Value to Set.
	 */
	public void setPlatform_version(String v);

	/**
	 * @return Returns the compiler.
	 */
	public String getCompiler();

	/**
	 * Sets the value for compiler.
	 * @param v Value to Set.
	 */
	public void setCompiler(String v);

	/**
	 * @return Returns the compiler/version.
	 */
	public String getCompiler_version();

	/**
	 * Sets the value for compiler/version.
	 * @param v Value to Set.
	 */
	public void setCompiler_version(String v);

	/**
	 * library
	 * @return Returns an List of org.nrg.xdat.model.ProvProcessstepLibraryI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepLibraryI> List<A> getLibrary();

	/**
	 * library
	 * @return Returns an List of org.nrg.xdat.model.ProvProcessstepLibraryI
	 */
	public <A extends org.nrg.xdat.model.ProvProcessstepLibraryI> void addLibrary(A item) throws Exception;

	/**
	 * @return Returns the prov_processStep_id.
	 */
	public Integer getProvProcessstepId();
}
