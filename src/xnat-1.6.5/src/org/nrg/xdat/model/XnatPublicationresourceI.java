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
public interface XnatPublicationresourceI extends XnatAbstractresourceI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the title.
	 */
	public String getTitle();

	/**
	 * Sets the value for title.
	 * @param v Value to Set.
	 */
	public void setTitle(String v);

	/**
	 * @return Returns the citation.
	 */
	public String getCitation();

	/**
	 * Sets the value for citation.
	 * @param v Value to Set.
	 */
	public void setCitation(String v);

	/**
	 * @return Returns the abstract.
	 */
	public String getAbstract();

	/**
	 * Sets the value for abstract.
	 * @param v Value to Set.
	 */
	public void setAbstract(String v);

	/**
	 * @return Returns the commentary.
	 */
	public String getCommentary();

	/**
	 * Sets the value for commentary.
	 * @param v Value to Set.
	 */
	public void setCommentary(String v);

	/**
	 * @return Returns the isPrimary.
	 */
	public Boolean getIsprimary();

	/**
	 * Sets the value for isPrimary.
	 * @param v Value to Set.
	 */
	public void setIsprimary(Object v);

	/**
	 * @return Returns the doi.
	 */
	public String getDoi();

	/**
	 * Sets the value for doi.
	 * @param v Value to Set.
	 */
	public void setDoi(String v);

	/**
	 * @return Returns the pubmed.
	 */
	public String getPubmed();

	/**
	 * Sets the value for pubmed.
	 * @param v Value to Set.
	 */
	public void setPubmed(String v);

	/**
	 * @return Returns the medline.
	 */
	public String getMedline();

	/**
	 * Sets the value for medline.
	 * @param v Value to Set.
	 */
	public void setMedline(String v);

	/**
	 * @return Returns the uri.
	 */
	public String getUri();

	/**
	 * Sets the value for uri.
	 * @param v Value to Set.
	 */
	public void setUri(String v);

	/**
	 * @return Returns the other.
	 */
	public String getOther();

	/**
	 * Sets the value for other.
	 * @param v Value to Set.
	 */
	public void setOther(String v);

	/**
	 * @return Returns the type.
	 */
	public String getType();

	/**
	 * Sets the value for type.
	 * @param v Value to Set.
	 */
	public void setType(String v);
}
