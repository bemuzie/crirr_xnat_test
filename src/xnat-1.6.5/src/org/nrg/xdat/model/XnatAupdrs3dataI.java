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
public interface XnatAupdrs3dataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the inScanner.
	 */
	public Boolean getInscanner();

	/**
	 * Sets the value for inScanner.
	 * @param v Value to Set.
	 */
	public void setInscanner(Object v);

	/**
	 * @return Returns the clicker/right.
	 */
	public Integer getClicker_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/right.
	 * @param v Value to Set.
	 */
	public void setClicker_right(Integer v) ;

	/**
	 * @return Returns the clicker/left.
	 */
	public Integer getClicker_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/left.
	 * @param v Value to Set.
	 */
	public void setClicker_left(Integer v) ;

	/**
	 * @return Returns the clicker/interval.
	 */
	public Integer getClicker_interval();

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/interval.
	 * @param v Value to Set.
	 */
	public void setClicker_interval(Integer v) ;

	/**
	 * @return Returns the tremorRest/face.
	 */
	public String getTremorrest_face();

	/**
	 * Sets the value for tremorRest/face.
	 * @param v Value to Set.
	 */
	public void setTremorrest_face(String v);

	/**
	 * @return Returns the tremorRest/rue.
	 */
	public String getTremorrest_rue();

	/**
	 * Sets the value for tremorRest/rue.
	 * @param v Value to Set.
	 */
	public void setTremorrest_rue(String v);

	/**
	 * @return Returns the tremorRest/lue.
	 */
	public String getTremorrest_lue();

	/**
	 * Sets the value for tremorRest/lue.
	 * @param v Value to Set.
	 */
	public void setTremorrest_lue(String v);

	/**
	 * @return Returns the tremorRest/rle.
	 */
	public String getTremorrest_rle();

	/**
	 * Sets the value for tremorRest/rle.
	 * @param v Value to Set.
	 */
	public void setTremorrest_rle(String v);

	/**
	 * @return Returns the tremorRest/lle.
	 */
	public String getTremorrest_lle();

	/**
	 * Sets the value for tremorRest/lle.
	 * @param v Value to Set.
	 */
	public void setTremorrest_lle(String v);

	/**
	 * @return Returns the rigidity/neck.
	 */
	public String getRigidity_neck();

	/**
	 * Sets the value for rigidity/neck.
	 * @param v Value to Set.
	 */
	public void setRigidity_neck(String v);

	/**
	 * @return Returns the rigidity/rue.
	 */
	public String getRigidity_rue();

	/**
	 * Sets the value for rigidity/rue.
	 * @param v Value to Set.
	 */
	public void setRigidity_rue(String v);

	/**
	 * @return Returns the rigidity/lue.
	 */
	public String getRigidity_lue();

	/**
	 * Sets the value for rigidity/lue.
	 * @param v Value to Set.
	 */
	public void setRigidity_lue(String v);

	/**
	 * @return Returns the rigidity/rle.
	 */
	public String getRigidity_rle();

	/**
	 * Sets the value for rigidity/rle.
	 * @param v Value to Set.
	 */
	public void setRigidity_rle(String v);

	/**
	 * @return Returns the rigidity/lle.
	 */
	public String getRigidity_lle();

	/**
	 * Sets the value for rigidity/lle.
	 * @param v Value to Set.
	 */
	public void setRigidity_lle(String v);

	/**
	 * @return Returns the handMovementsGrip/right.
	 */
	public Integer getHandmovementsgrip_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/right.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_right(Integer v) ;

	/**
	 * @return Returns the handMovementsGrip/left.
	 */
	public Integer getHandmovementsgrip_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/left.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_left(Integer v) ;

	/**
	 * @return Returns the facialExpression.
	 */
	public Integer getFacialexpression();

	/**
	 * Sets the value for xnat_a:updrs3Data/facialExpression.
	 * @param v Value to Set.
	 */
	public void setFacialexpression(Integer v) ;

	/**
	 * @return Returns the gait.
	 */
	public Integer getGait();

	/**
	 * Sets the value for xnat_a:updrs3Data/gait.
	 * @param v Value to Set.
	 */
	public void setGait(Integer v) ;

	/**
	 * @return Returns the speech.
	 */
	public Integer getSpeech();

	/**
	 * Sets the value for xnat_a:updrs3Data/speech.
	 * @param v Value to Set.
	 */
	public void setSpeech(Integer v) ;

	/**
	 * @return Returns the writing.
	 */
	public Integer getWriting();

	/**
	 * Sets the value for xnat_a:updrs3Data/writing.
	 * @param v Value to Set.
	 */
	public void setWriting(Integer v) ;

	/**
	 * @return Returns the ariseFromChair.
	 */
	public Integer getArisefromchair();

	/**
	 * Sets the value for xnat_a:updrs3Data/ariseFromChair.
	 * @param v Value to Set.
	 */
	public void setArisefromchair(Integer v) ;

	/**
	 * @return Returns the actionPosturalTremor/right.
	 */
	public Integer getActionposturaltremor_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/right.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_right(Integer v) ;

	/**
	 * @return Returns the actionPosturalTremor/left.
	 */
	public Integer getActionposturaltremor_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/left.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_left(Integer v) ;

	/**
	 * @return Returns the handsRAM/right.
	 */
	public Integer getHandsram_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/right.
	 * @param v Value to Set.
	 */
	public void setHandsram_right(Integer v) ;

	/**
	 * @return Returns the handsRAM/left.
	 */
	public Integer getHandsram_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/left.
	 * @param v Value to Set.
	 */
	public void setHandsram_left(Integer v) ;

	/**
	 * @return Returns the fingerTaps/right.
	 */
	public Integer getFingertaps_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/right.
	 * @param v Value to Set.
	 */
	public void setFingertaps_right(Integer v) ;

	/**
	 * @return Returns the fingerTaps/left.
	 */
	public Integer getFingertaps_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/left.
	 * @param v Value to Set.
	 */
	public void setFingertaps_left(Integer v) ;

	/**
	 * @return Returns the posture.
	 */
	public Integer getPosture();

	/**
	 * Sets the value for xnat_a:updrs3Data/posture.
	 * @param v Value to Set.
	 */
	public void setPosture(Integer v) ;

	/**
	 * @return Returns the posturalStability.
	 */
	public Integer getPosturalstability();

	/**
	 * Sets the value for xnat_a:updrs3Data/posturalStability.
	 * @param v Value to Set.
	 */
	public void setPosturalstability(Integer v) ;

	/**
	 * @return Returns the footTaps/right.
	 */
	public Integer getFoottaps_right();

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/right.
	 * @param v Value to Set.
	 */
	public void setFoottaps_right(Integer v) ;

	/**
	 * @return Returns the footTaps/left.
	 */
	public Integer getFoottaps_left();

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/left.
	 * @param v Value to Set.
	 */
	public void setFoottaps_left(Integer v) ;

	/**
	 * @return Returns the bodyBradykinesiaHypokinesia.
	 */
	public Integer getBodybradykinesiahypokinesia();

	/**
	 * Sets the value for xnat_a:updrs3Data/bodyBradykinesiaHypokinesia.
	 * @param v Value to Set.
	 */
	public void setBodybradykinesiahypokinesia(Integer v) ;

	/**
	 * @return Returns the problem.
	 */
	public Boolean getProblem();

	/**
	 * Sets the value for problem.
	 * @param v Value to Set.
	 */
	public void setProblem(Object v);
}
