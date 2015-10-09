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
public interface XnatAbstractresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the note.
	 */
	public String getNote();

	/**
	 * Sets the value for note.
	 * @param v Value to Set.
	 */
	public void setNote(String v);

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceTagI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceTagI> List<A> getTags_tag();

	/**
	 * tags/tag
	 * @return Returns an List of org.nrg.xdat.model.XnatAbstractresourceTagI
	 */
	public <A extends org.nrg.xdat.model.XnatAbstractresourceTagI> void addTags_tag(A item) throws Exception;

	/**
	 * @return Returns the label.
	 */
	public String getLabel();

	/**
	 * Sets the value for label.
	 * @param v Value to Set.
	 */
	public void setLabel(String v);

	/**
	 * @return Returns the file_count.
	 */
	public Integer getFileCount();

	/**
	 * Sets the value for xnat:abstractResource/file_count.
	 * @param v Value to Set.
	 */
	public void setFileCount(Integer v) ;

	/**
	 * @return Returns the file_size.
	 */
	public Object getFileSize();

	/**
	 * Sets the value for file_size.
	 * @param v Value to Set.
	 */
	public void setFileSize(Object v);

	/**
	 * @return Returns the xnat_abstractResource_id.
	 */
	public Integer getXnatAbstractresourceId();
}
