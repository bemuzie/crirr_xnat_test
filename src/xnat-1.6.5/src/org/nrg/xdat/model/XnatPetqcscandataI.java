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
public interface XnatPetqcscandataI extends XnatQcscandataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the acquisition.
	 */
	public String getAcquisition();

	/**
	 * Sets the value for acquisition.
	 * @param v Value to Set.
	 */
	public void setAcquisition(String v);

	/**
	 * @return Returns the correctReconstructionAlgorithm.
	 */
	public String getCorrectreconstructionalgorithm();

	/**
	 * Sets the value for correctReconstructionAlgorithm.
	 * @param v Value to Set.
	 */
	public void setCorrectreconstructionalgorithm(String v);

	/**
	 * @return Returns the reconstructionAlgorithmUsed.
	 */
	public String getReconstructionalgorithmused();

	/**
	 * Sets the value for reconstructionAlgorithmUsed.
	 * @param v Value to Set.
	 */
	public void setReconstructionalgorithmused(String v);

	/**
	 * @return Returns the correctIterationsAndSubsets.
	 */
	public String getCorrectiterationsandsubsets();

	/**
	 * Sets the value for correctIterationsAndSubsets.
	 * @param v Value to Set.
	 */
	public void setCorrectiterationsandsubsets(String v);

	/**
	 * @return Returns the correctFilters.
	 */
	public String getCorrectfilters();

	/**
	 * Sets the value for correctFilters.
	 * @param v Value to Set.
	 */
	public void setCorrectfilters(String v);

	/**
	 * @return Returns the correctSliceThickness.
	 */
	public String getCorrectslicethickness();

	/**
	 * Sets the value for correctSliceThickness.
	 * @param v Value to Set.
	 */
	public void setCorrectslicethickness(String v);

	/**
	 * @return Returns the acceptableVoxelSize.
	 */
	public String getAcceptablevoxelsize();

	/**
	 * Sets the value for acceptableVoxelSize.
	 * @param v Value to Set.
	 */
	public void setAcceptablevoxelsize(String v);

	/**
	 * @return Returns the unacceptableFrames.
	 */
	public String getUnacceptableframes();

	/**
	 * Sets the value for unacceptableFrames.
	 * @param v Value to Set.
	 */
	public void setUnacceptableframes(String v);

	/**
	 * @return Returns the reasonFramesUnacceptable.
	 */
	public String getReasonframesunacceptable();

	/**
	 * Sets the value for reasonFramesUnacceptable.
	 * @param v Value to Set.
	 */
	public void setReasonframesunacceptable(String v);

	/**
	 * processingErrors/processingError
	 * @return Returns an List of org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI
	 */
	public <A extends org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI> List<A> getProcessingerrors_processingerror();

	/**
	 * processingErrors/processingError
	 * @return Returns an List of org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI
	 */
	public <A extends org.nrg.xdat.model.XnatPetqcscandataProcessingerrorI> void addProcessingerrors_processingerror(A item) throws Exception;

	/**
	 * @return Returns the qcOutcome.
	 */
	public String getQcoutcome();

	/**
	 * Sets the value for qcOutcome.
	 * @param v Value to Set.
	 */
	public void setQcoutcome(String v);

	/**
	 * @return Returns the qcOutcomeReason.
	 */
	public String getQcoutcomereason();

	/**
	 * Sets the value for qcOutcomeReason.
	 * @param v Value to Set.
	 */
	public void setQcoutcomereason(String v);

	/**
	 * @return Returns the topCutoff.
	 */
	public String getTopcutoff();

	/**
	 * Sets the value for topCutoff.
	 * @param v Value to Set.
	 */
	public void setTopcutoff(String v);

	/**
	 * @return Returns the bottomCutoff.
	 */
	public String getBottomcutoff();

	/**
	 * Sets the value for bottomCutoff.
	 * @param v Value to Set.
	 */
	public void setBottomcutoff(String v);
}
