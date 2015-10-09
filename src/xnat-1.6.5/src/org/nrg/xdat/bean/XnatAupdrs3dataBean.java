/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:38 UTC 2015
 *
 */
package org.nrg.xdat.bean;
import org.nrg.xdat.bean.base.BaseElement;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class XnatAupdrs3dataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatAupdrs3dataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatAupdrs3dataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat_a:updrs3Data";

	public String getSchemaElementName(){
		return "updrs3Data";
	}

	public String getFullSchemaElementName(){
		return "xnat_a:updrs3Data";
	}

	//FIELD

	private Boolean _Inscanner=null;

	/**
	 * @return Returns the inScanner.
	 */
	public Boolean getInscanner() {
		return _Inscanner;
	}

	/**
	 * Sets the value for inScanner.
	 * @param v Value to Set.
	 */
	public void setInscanner(Object v){
		if(v instanceof Boolean){
			_Inscanner=(Boolean)v;
		}else if(v instanceof String){
			_Inscanner=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	//FIELD

	private Integer _Clicker_right=null;

	/**
	 * @return Returns the clicker/right.
	 */
	public Integer getClicker_right(){
		return _Clicker_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/right.
	 * @param v Value to Set.
	 */
	public void setClicker_right(Integer v) {
		_Clicker_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/right.
	 * @param v Value to Set.
	 */
	public void setClicker_right(String v)  {
		_Clicker_right=formatInteger(v);
	}

	//FIELD

	private Integer _Clicker_left=null;

	/**
	 * @return Returns the clicker/left.
	 */
	public Integer getClicker_left(){
		return _Clicker_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/left.
	 * @param v Value to Set.
	 */
	public void setClicker_left(Integer v) {
		_Clicker_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/left.
	 * @param v Value to Set.
	 */
	public void setClicker_left(String v)  {
		_Clicker_left=formatInteger(v);
	}

	//FIELD

	private Integer _Clicker_interval=null;

	/**
	 * @return Returns the clicker/interval.
	 */
	public Integer getClicker_interval(){
		return _Clicker_interval;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/interval.
	 * @param v Value to Set.
	 */
	public void setClicker_interval(Integer v) {
		_Clicker_interval=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/clicker/interval.
	 * @param v Value to Set.
	 */
	public void setClicker_interval(String v)  {
		_Clicker_interval=formatInteger(v);
	}

	//FIELD

	private String _Tremorrest_face=null;

	/**
	 * @return Returns the tremorRest/face.
	 */
	public String getTremorrest_face(){
		return _Tremorrest_face;
	}

	/**
	 * Sets the value for tremorRest/face.
	 * @param v Value to Set.
	 */
	public void setTremorrest_face(String v){
		_Tremorrest_face=v;
	}

	//FIELD

	private String _Tremorrest_rue=null;

	/**
	 * @return Returns the tremorRest/rue.
	 */
	public String getTremorrest_rue(){
		return _Tremorrest_rue;
	}

	/**
	 * Sets the value for tremorRest/rue.
	 * @param v Value to Set.
	 */
	public void setTremorrest_rue(String v){
		_Tremorrest_rue=v;
	}

	//FIELD

	private String _Tremorrest_lue=null;

	/**
	 * @return Returns the tremorRest/lue.
	 */
	public String getTremorrest_lue(){
		return _Tremorrest_lue;
	}

	/**
	 * Sets the value for tremorRest/lue.
	 * @param v Value to Set.
	 */
	public void setTremorrest_lue(String v){
		_Tremorrest_lue=v;
	}

	//FIELD

	private String _Tremorrest_rle=null;

	/**
	 * @return Returns the tremorRest/rle.
	 */
	public String getTremorrest_rle(){
		return _Tremorrest_rle;
	}

	/**
	 * Sets the value for tremorRest/rle.
	 * @param v Value to Set.
	 */
	public void setTremorrest_rle(String v){
		_Tremorrest_rle=v;
	}

	//FIELD

	private String _Tremorrest_lle=null;

	/**
	 * @return Returns the tremorRest/lle.
	 */
	public String getTremorrest_lle(){
		return _Tremorrest_lle;
	}

	/**
	 * Sets the value for tremorRest/lle.
	 * @param v Value to Set.
	 */
	public void setTremorrest_lle(String v){
		_Tremorrest_lle=v;
	}

	//FIELD

	private String _Rigidity_neck=null;

	/**
	 * @return Returns the rigidity/neck.
	 */
	public String getRigidity_neck(){
		return _Rigidity_neck;
	}

	/**
	 * Sets the value for rigidity/neck.
	 * @param v Value to Set.
	 */
	public void setRigidity_neck(String v){
		_Rigidity_neck=v;
	}

	//FIELD

	private String _Rigidity_rue=null;

	/**
	 * @return Returns the rigidity/rue.
	 */
	public String getRigidity_rue(){
		return _Rigidity_rue;
	}

	/**
	 * Sets the value for rigidity/rue.
	 * @param v Value to Set.
	 */
	public void setRigidity_rue(String v){
		_Rigidity_rue=v;
	}

	//FIELD

	private String _Rigidity_lue=null;

	/**
	 * @return Returns the rigidity/lue.
	 */
	public String getRigidity_lue(){
		return _Rigidity_lue;
	}

	/**
	 * Sets the value for rigidity/lue.
	 * @param v Value to Set.
	 */
	public void setRigidity_lue(String v){
		_Rigidity_lue=v;
	}

	//FIELD

	private String _Rigidity_rle=null;

	/**
	 * @return Returns the rigidity/rle.
	 */
	public String getRigidity_rle(){
		return _Rigidity_rle;
	}

	/**
	 * Sets the value for rigidity/rle.
	 * @param v Value to Set.
	 */
	public void setRigidity_rle(String v){
		_Rigidity_rle=v;
	}

	//FIELD

	private String _Rigidity_lle=null;

	/**
	 * @return Returns the rigidity/lle.
	 */
	public String getRigidity_lle(){
		return _Rigidity_lle;
	}

	/**
	 * Sets the value for rigidity/lle.
	 * @param v Value to Set.
	 */
	public void setRigidity_lle(String v){
		_Rigidity_lle=v;
	}

	//FIELD

	private Integer _Handmovementsgrip_right=null;

	/**
	 * @return Returns the handMovementsGrip/right.
	 */
	public Integer getHandmovementsgrip_right(){
		return _Handmovementsgrip_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/right.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_right(Integer v) {
		_Handmovementsgrip_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/right.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_right(String v)  {
		_Handmovementsgrip_right=formatInteger(v);
	}

	//FIELD

	private Integer _Handmovementsgrip_left=null;

	/**
	 * @return Returns the handMovementsGrip/left.
	 */
	public Integer getHandmovementsgrip_left(){
		return _Handmovementsgrip_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/left.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_left(Integer v) {
		_Handmovementsgrip_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handMovementsGrip/left.
	 * @param v Value to Set.
	 */
	public void setHandmovementsgrip_left(String v)  {
		_Handmovementsgrip_left=formatInteger(v);
	}

	//FIELD

	private Integer _Facialexpression=null;

	/**
	 * @return Returns the facialExpression.
	 */
	public Integer getFacialexpression(){
		return _Facialexpression;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/facialExpression.
	 * @param v Value to Set.
	 */
	public void setFacialexpression(Integer v) {
		_Facialexpression=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/facialExpression.
	 * @param v Value to Set.
	 */
	public void setFacialexpression(String v)  {
		_Facialexpression=formatInteger(v);
	}

	//FIELD

	private Integer _Gait=null;

	/**
	 * @return Returns the gait.
	 */
	public Integer getGait(){
		return _Gait;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/gait.
	 * @param v Value to Set.
	 */
	public void setGait(Integer v) {
		_Gait=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/gait.
	 * @param v Value to Set.
	 */
	public void setGait(String v)  {
		_Gait=formatInteger(v);
	}

	//FIELD

	private Integer _Speech=null;

	/**
	 * @return Returns the speech.
	 */
	public Integer getSpeech(){
		return _Speech;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/speech.
	 * @param v Value to Set.
	 */
	public void setSpeech(Integer v) {
		_Speech=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/speech.
	 * @param v Value to Set.
	 */
	public void setSpeech(String v)  {
		_Speech=formatInteger(v);
	}

	//FIELD

	private Integer _Writing=null;

	/**
	 * @return Returns the writing.
	 */
	public Integer getWriting(){
		return _Writing;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/writing.
	 * @param v Value to Set.
	 */
	public void setWriting(Integer v) {
		_Writing=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/writing.
	 * @param v Value to Set.
	 */
	public void setWriting(String v)  {
		_Writing=formatInteger(v);
	}

	//FIELD

	private Integer _Arisefromchair=null;

	/**
	 * @return Returns the ariseFromChair.
	 */
	public Integer getArisefromchair(){
		return _Arisefromchair;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/ariseFromChair.
	 * @param v Value to Set.
	 */
	public void setArisefromchair(Integer v) {
		_Arisefromchair=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/ariseFromChair.
	 * @param v Value to Set.
	 */
	public void setArisefromchair(String v)  {
		_Arisefromchair=formatInteger(v);
	}

	//FIELD

	private Integer _Actionposturaltremor_right=null;

	/**
	 * @return Returns the actionPosturalTremor/right.
	 */
	public Integer getActionposturaltremor_right(){
		return _Actionposturaltremor_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/right.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_right(Integer v) {
		_Actionposturaltremor_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/right.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_right(String v)  {
		_Actionposturaltremor_right=formatInteger(v);
	}

	//FIELD

	private Integer _Actionposturaltremor_left=null;

	/**
	 * @return Returns the actionPosturalTremor/left.
	 */
	public Integer getActionposturaltremor_left(){
		return _Actionposturaltremor_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/left.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_left(Integer v) {
		_Actionposturaltremor_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/actionPosturalTremor/left.
	 * @param v Value to Set.
	 */
	public void setActionposturaltremor_left(String v)  {
		_Actionposturaltremor_left=formatInteger(v);
	}

	//FIELD

	private Integer _Handsram_right=null;

	/**
	 * @return Returns the handsRAM/right.
	 */
	public Integer getHandsram_right(){
		return _Handsram_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/right.
	 * @param v Value to Set.
	 */
	public void setHandsram_right(Integer v) {
		_Handsram_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/right.
	 * @param v Value to Set.
	 */
	public void setHandsram_right(String v)  {
		_Handsram_right=formatInteger(v);
	}

	//FIELD

	private Integer _Handsram_left=null;

	/**
	 * @return Returns the handsRAM/left.
	 */
	public Integer getHandsram_left(){
		return _Handsram_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/left.
	 * @param v Value to Set.
	 */
	public void setHandsram_left(Integer v) {
		_Handsram_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/handsRAM/left.
	 * @param v Value to Set.
	 */
	public void setHandsram_left(String v)  {
		_Handsram_left=formatInteger(v);
	}

	//FIELD

	private Integer _Fingertaps_right=null;

	/**
	 * @return Returns the fingerTaps/right.
	 */
	public Integer getFingertaps_right(){
		return _Fingertaps_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/right.
	 * @param v Value to Set.
	 */
	public void setFingertaps_right(Integer v) {
		_Fingertaps_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/right.
	 * @param v Value to Set.
	 */
	public void setFingertaps_right(String v)  {
		_Fingertaps_right=formatInteger(v);
	}

	//FIELD

	private Integer _Fingertaps_left=null;

	/**
	 * @return Returns the fingerTaps/left.
	 */
	public Integer getFingertaps_left(){
		return _Fingertaps_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/left.
	 * @param v Value to Set.
	 */
	public void setFingertaps_left(Integer v) {
		_Fingertaps_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/fingerTaps/left.
	 * @param v Value to Set.
	 */
	public void setFingertaps_left(String v)  {
		_Fingertaps_left=formatInteger(v);
	}

	//FIELD

	private Integer _Posture=null;

	/**
	 * @return Returns the posture.
	 */
	public Integer getPosture(){
		return _Posture;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/posture.
	 * @param v Value to Set.
	 */
	public void setPosture(Integer v) {
		_Posture=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/posture.
	 * @param v Value to Set.
	 */
	public void setPosture(String v)  {
		_Posture=formatInteger(v);
	}

	//FIELD

	private Integer _Posturalstability=null;

	/**
	 * @return Returns the posturalStability.
	 */
	public Integer getPosturalstability(){
		return _Posturalstability;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/posturalStability.
	 * @param v Value to Set.
	 */
	public void setPosturalstability(Integer v) {
		_Posturalstability=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/posturalStability.
	 * @param v Value to Set.
	 */
	public void setPosturalstability(String v)  {
		_Posturalstability=formatInteger(v);
	}

	//FIELD

	private Integer _Foottaps_right=null;

	/**
	 * @return Returns the footTaps/right.
	 */
	public Integer getFoottaps_right(){
		return _Foottaps_right;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/right.
	 * @param v Value to Set.
	 */
	public void setFoottaps_right(Integer v) {
		_Foottaps_right=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/right.
	 * @param v Value to Set.
	 */
	public void setFoottaps_right(String v)  {
		_Foottaps_right=formatInteger(v);
	}

	//FIELD

	private Integer _Foottaps_left=null;

	/**
	 * @return Returns the footTaps/left.
	 */
	public Integer getFoottaps_left(){
		return _Foottaps_left;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/left.
	 * @param v Value to Set.
	 */
	public void setFoottaps_left(Integer v) {
		_Foottaps_left=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/footTaps/left.
	 * @param v Value to Set.
	 */
	public void setFoottaps_left(String v)  {
		_Foottaps_left=formatInteger(v);
	}

	//FIELD

	private Integer _Bodybradykinesiahypokinesia=null;

	/**
	 * @return Returns the bodyBradykinesiaHypokinesia.
	 */
	public Integer getBodybradykinesiahypokinesia(){
		return _Bodybradykinesiahypokinesia;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/bodyBradykinesiaHypokinesia.
	 * @param v Value to Set.
	 */
	public void setBodybradykinesiahypokinesia(Integer v) {
		_Bodybradykinesiahypokinesia=v;
	}

	/**
	 * Sets the value for xnat_a:updrs3Data/bodyBradykinesiaHypokinesia.
	 * @param v Value to Set.
	 */
	public void setBodybradykinesiahypokinesia(String v)  {
		_Bodybradykinesiahypokinesia=formatInteger(v);
	}

	//FIELD

	private Boolean _Problem=null;

	/**
	 * @return Returns the problem.
	 */
	public Boolean getProblem() {
		return _Problem;
	}

	/**
	 * Sets the value for problem.
	 * @param v Value to Set.
	 */
	public void setProblem(Object v){
		if(v instanceof Boolean){
			_Problem=(Boolean)v;
		}else if(v instanceof String){
			_Problem=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("inScanner")){
			setInscanner(v);
		}else if (xmlPath.equals("clicker/right")){
			setClicker_right(v);
		}else if (xmlPath.equals("clicker/left")){
			setClicker_left(v);
		}else if (xmlPath.equals("clicker/interval")){
			setClicker_interval(v);
		}else if (xmlPath.equals("tremorRest/face")){
			setTremorrest_face(v);
		}else if (xmlPath.equals("tremorRest/rue")){
			setTremorrest_rue(v);
		}else if (xmlPath.equals("tremorRest/lue")){
			setTremorrest_lue(v);
		}else if (xmlPath.equals("tremorRest/rle")){
			setTremorrest_rle(v);
		}else if (xmlPath.equals("tremorRest/lle")){
			setTremorrest_lle(v);
		}else if (xmlPath.equals("rigidity/neck")){
			setRigidity_neck(v);
		}else if (xmlPath.equals("rigidity/rue")){
			setRigidity_rue(v);
		}else if (xmlPath.equals("rigidity/lue")){
			setRigidity_lue(v);
		}else if (xmlPath.equals("rigidity/rle")){
			setRigidity_rle(v);
		}else if (xmlPath.equals("rigidity/lle")){
			setRigidity_lle(v);
		}else if (xmlPath.equals("handMovementsGrip/right")){
			setHandmovementsgrip_right(v);
		}else if (xmlPath.equals("handMovementsGrip/left")){
			setHandmovementsgrip_left(v);
		}else if (xmlPath.equals("facialExpression")){
			setFacialexpression(v);
		}else if (xmlPath.equals("gait")){
			setGait(v);
		}else if (xmlPath.equals("speech")){
			setSpeech(v);
		}else if (xmlPath.equals("writing")){
			setWriting(v);
		}else if (xmlPath.equals("ariseFromChair")){
			setArisefromchair(v);
		}else if (xmlPath.equals("actionPosturalTremor/right")){
			setActionposturaltremor_right(v);
		}else if (xmlPath.equals("actionPosturalTremor/left")){
			setActionposturaltremor_left(v);
		}else if (xmlPath.equals("handsRAM/right")){
			setHandsram_right(v);
		}else if (xmlPath.equals("handsRAM/left")){
			setHandsram_left(v);
		}else if (xmlPath.equals("fingerTaps/right")){
			setFingertaps_right(v);
		}else if (xmlPath.equals("fingerTaps/left")){
			setFingertaps_left(v);
		}else if (xmlPath.equals("posture")){
			setPosture(v);
		}else if (xmlPath.equals("posturalStability")){
			setPosturalstability(v);
		}else if (xmlPath.equals("footTaps/right")){
			setFoottaps_right(v);
		}else if (xmlPath.equals("footTaps/left")){
			setFoottaps_left(v);
		}else if (xmlPath.equals("bodyBradykinesiaHypokinesia")){
			setBodybradykinesiahypokinesia(v);
		}else if (xmlPath.equals("problem")){
			setProblem(v);
		}
		else{
			super.setDataField(xmlPath,v);
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setReferenceField(String xmlPath,BaseElement v) throws BaseElement.UnknownFieldException{
			super.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("inScanner")){
			return getInscanner();
		}else if (xmlPath.equals("clicker/right")){
			return getClicker_right();
		}else if (xmlPath.equals("clicker/left")){
			return getClicker_left();
		}else if (xmlPath.equals("clicker/interval")){
			return getClicker_interval();
		}else if (xmlPath.equals("tremorRest/face")){
			return getTremorrest_face();
		}else if (xmlPath.equals("tremorRest/rue")){
			return getTremorrest_rue();
		}else if (xmlPath.equals("tremorRest/lue")){
			return getTremorrest_lue();
		}else if (xmlPath.equals("tremorRest/rle")){
			return getTremorrest_rle();
		}else if (xmlPath.equals("tremorRest/lle")){
			return getTremorrest_lle();
		}else if (xmlPath.equals("rigidity/neck")){
			return getRigidity_neck();
		}else if (xmlPath.equals("rigidity/rue")){
			return getRigidity_rue();
		}else if (xmlPath.equals("rigidity/lue")){
			return getRigidity_lue();
		}else if (xmlPath.equals("rigidity/rle")){
			return getRigidity_rle();
		}else if (xmlPath.equals("rigidity/lle")){
			return getRigidity_lle();
		}else if (xmlPath.equals("handMovementsGrip/right")){
			return getHandmovementsgrip_right();
		}else if (xmlPath.equals("handMovementsGrip/left")){
			return getHandmovementsgrip_left();
		}else if (xmlPath.equals("facialExpression")){
			return getFacialexpression();
		}else if (xmlPath.equals("gait")){
			return getGait();
		}else if (xmlPath.equals("speech")){
			return getSpeech();
		}else if (xmlPath.equals("writing")){
			return getWriting();
		}else if (xmlPath.equals("ariseFromChair")){
			return getArisefromchair();
		}else if (xmlPath.equals("actionPosturalTremor/right")){
			return getActionposturaltremor_right();
		}else if (xmlPath.equals("actionPosturalTremor/left")){
			return getActionposturaltremor_left();
		}else if (xmlPath.equals("handsRAM/right")){
			return getHandsram_right();
		}else if (xmlPath.equals("handsRAM/left")){
			return getHandsram_left();
		}else if (xmlPath.equals("fingerTaps/right")){
			return getFingertaps_right();
		}else if (xmlPath.equals("fingerTaps/left")){
			return getFingertaps_left();
		}else if (xmlPath.equals("posture")){
			return getPosture();
		}else if (xmlPath.equals("posturalStability")){
			return getPosturalstability();
		}else if (xmlPath.equals("footTaps/right")){
			return getFoottaps_right();
		}else if (xmlPath.equals("footTaps/left")){
			return getFoottaps_left();
		}else if (xmlPath.equals("bodyBradykinesiaHypokinesia")){
			return getBodybradykinesiahypokinesia();
		}else if (xmlPath.equals("problem")){
			return getProblem();
		}
		else{
			return super.getDataFieldValue(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getReferenceField(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceField(xmlPath);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
			return super.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("inScanner")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("clicker/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("clicker/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("clicker/interval")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tremorRest/face")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tremorRest/rue")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tremorRest/lue")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tremorRest/rle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("tremorRest/lle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rigidity/neck")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rigidity/rue")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rigidity/lue")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rigidity/rle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("rigidity/lle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("handMovementsGrip/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("handMovementsGrip/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("facialExpression")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("gait")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("speech")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("writing")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ariseFromChair")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("actionPosturalTremor/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("actionPosturalTremor/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("handsRAM/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("handsRAM/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fingerTaps/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fingerTaps/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("posture")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("posturalStability")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("footTaps/right")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("footTaps/left")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("bodyBradykinesiaHypokinesia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("problem")){
			return BaseElement.field_data;
		}
		else{
			return super.getFieldType(xmlPath);
		}
	}

	/**
	 * Returns arraylist of all fields
	 */
	public ArrayList getAllFields() {
		ArrayList all_fields=new ArrayList();
		all_fields.add("inScanner");
		all_fields.add("clicker/right");
		all_fields.add("clicker/left");
		all_fields.add("clicker/interval");
		all_fields.add("tremorRest/face");
		all_fields.add("tremorRest/rue");
		all_fields.add("tremorRest/lue");
		all_fields.add("tremorRest/rle");
		all_fields.add("tremorRest/lle");
		all_fields.add("rigidity/neck");
		all_fields.add("rigidity/rue");
		all_fields.add("rigidity/lue");
		all_fields.add("rigidity/rle");
		all_fields.add("rigidity/lle");
		all_fields.add("handMovementsGrip/right");
		all_fields.add("handMovementsGrip/left");
		all_fields.add("facialExpression");
		all_fields.add("gait");
		all_fields.add("speech");
		all_fields.add("writing");
		all_fields.add("ariseFromChair");
		all_fields.add("actionPosturalTremor/right");
		all_fields.add("actionPosturalTremor/left");
		all_fields.add("handsRAM/right");
		all_fields.add("handsRAM/left");
		all_fields.add("fingerTaps/right");
		all_fields.add("fingerTaps/left");
		all_fields.add("posture");
		all_fields.add("posturalStability");
		all_fields.add("footTaps/right");
		all_fields.add("footTaps/left");
		all_fields.add("bodyBradykinesiaHypokinesia");
		all_fields.add("problem");
		all_fields.addAll(super.getAllFields());
		return all_fields;
	}


	public String toString(){
		java.io.StringWriter sw = new java.io.StringWriter();
		try{this.toXML(sw,true);}catch(java.io.IOException e){}
		return sw.toString();
	}


	public void toXML(java.io.Writer writer,boolean prettyPrint) throws java.io.IOException{
		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.write("\n<xnat_a:UPDRS3");
		TreeMap map = new TreeMap();
		map.putAll(getXMLAtts());
		map.put("xmlns:arc","http://nrg.wustl.edu/arc");
		map.put("xmlns:cat","http://nrg.wustl.edu/catalog");
		map.put("xmlns:ext","http://nrg.wustl.edu/ext");
		map.put("xmlns:pipe","http://nrg.wustl.edu/pipe");
		map.put("xmlns:prov","http://www.nbirn.net/prov");
		map.put("xmlns:scr","http://nrg.wustl.edu/scr");
		map.put("xmlns:val","http://nrg.wustl.edu/val");
		map.put("xmlns:wrk","http://nrg.wustl.edu/workflow");
		map.put("xmlns:xdat","http://nrg.wustl.edu/security");
		map.put("xmlns:xnat","http://nrg.wustl.edu/xnat");
		map.put("xmlns:xnat_a","http://nrg.wustl.edu/xnat_assessments");
		map.put("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
		int header = 0;
		if (prettyPrint)header++;
		writer.write(">");
		addXMLBody(writer,header);
		if (prettyPrint)header--;
		writer.write("\n</xnat_a:UPDRS3>");
	}


	protected void addXMLAtts(java.io.Writer writer) throws java.io.IOException{
		TreeMap map = this.getXMLAtts();
		java.util.Iterator iter =map.keySet().iterator();
		while(iter.hasNext()){
			String key = (String)iter.next();
			writer.write(" " + key + "=\"" + map.get(key) + "\"");
		}
	}


	protected TreeMap getXMLAtts() {
		TreeMap map = super.getXMLAtts();
		return map;
	}


	protected boolean addXMLBody(java.io.Writer writer, int header) throws java.io.IOException{
		super.addXMLBody(writer,header);
		//REFERENCE FROM updrs3Data -> subjectAssessorData
		if (_Inscanner!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:inScanner");
			writer.write(">");
			writer.write(ValueParser(_Inscanner,"boolean"));
			writer.write("</xnat_a:inScanner>");
			header--;
		}
			int child0=0;
			int att0=0;
			if(_Clicker_interval!=null)
			child0++;
			if(_Clicker_left!=null)
			child0++;
			if(_Clicker_right!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:clicker");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Clicker_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Clicker_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Clicker_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Clicker_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
		if (_Clicker_interval!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:interval");
			writer.write(">");
			writer.write(ValueParser(_Clicker_interval,"integer"));
			writer.write("</xnat_a:interval>");
			header--;
		}
		else{
			writer.write("\n" + createHeader(header++) + "<xnat_a:interval");
			writer.write("/>");
			header--;
		}

				writer.write("\n" + createHeader(--header) + "</xnat_a:clicker>");
			}
			}

			int child1=0;
			int att1=0;
			if(_Tremorrest_rle!=null)
			child1++;
			if(_Tremorrest_lle!=null)
			child1++;
			if(_Tremorrest_rue!=null)
			child1++;
			if(_Tremorrest_face!=null)
			child1++;
			if(_Tremorrest_lue!=null)
			child1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:tremorRest");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Tremorrest_face!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:face");
			writer.write(">");
			writer.write(ValueParser(_Tremorrest_face,"string"));
			writer.write("</xnat_a:face>");
			header--;
		}
		if (_Tremorrest_rue!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:rue");
			writer.write(">");
			writer.write(ValueParser(_Tremorrest_rue,"string"));
			writer.write("</xnat_a:rue>");
			header--;
		}
		if (_Tremorrest_lue!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:lue");
			writer.write(">");
			writer.write(ValueParser(_Tremorrest_lue,"string"));
			writer.write("</xnat_a:lue>");
			header--;
		}
		if (_Tremorrest_rle!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:rle");
			writer.write(">");
			writer.write(ValueParser(_Tremorrest_rle,"string"));
			writer.write("</xnat_a:rle>");
			header--;
		}
		if (_Tremorrest_lle!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:lle");
			writer.write(">");
			writer.write(ValueParser(_Tremorrest_lle,"string"));
			writer.write("</xnat_a:lle>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:tremorRest>");
			}
			}

			int child2=0;
			int att2=0;
			if(_Rigidity_lle!=null)
			child2++;
			if(_Rigidity_rue!=null)
			child2++;
			if(_Rigidity_lue!=null)
			child2++;
			if(_Rigidity_neck!=null)
			child2++;
			if(_Rigidity_rle!=null)
			child2++;
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:rigidity");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Rigidity_neck!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:neck");
			writer.write(">");
			writer.write(ValueParser(_Rigidity_neck,"string"));
			writer.write("</xnat_a:neck>");
			header--;
		}
		if (_Rigidity_rue!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:rue");
			writer.write(">");
			writer.write(ValueParser(_Rigidity_rue,"string"));
			writer.write("</xnat_a:rue>");
			header--;
		}
		if (_Rigidity_lue!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:lue");
			writer.write(">");
			writer.write(ValueParser(_Rigidity_lue,"string"));
			writer.write("</xnat_a:lue>");
			header--;
		}
		if (_Rigidity_rle!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:rle");
			writer.write(">");
			writer.write(ValueParser(_Rigidity_rle,"string"));
			writer.write("</xnat_a:rle>");
			header--;
		}
		if (_Rigidity_lle!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:lle");
			writer.write(">");
			writer.write(ValueParser(_Rigidity_lle,"string"));
			writer.write("</xnat_a:lle>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:rigidity>");
			}
			}

			int child3=0;
			int att3=0;
			if(_Handmovementsgrip_right!=null)
			child3++;
			if(_Handmovementsgrip_left!=null)
			child3++;
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:handMovementsGrip");
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Handmovementsgrip_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Handmovementsgrip_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Handmovementsgrip_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Handmovementsgrip_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:handMovementsGrip>");
			}
			}

		if (_Facialexpression!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:facialExpression");
			writer.write(">");
			writer.write(ValueParser(_Facialexpression,"integer"));
			writer.write("</xnat_a:facialExpression>");
			header--;
		}
		if (_Gait!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:gait");
			writer.write(">");
			writer.write(ValueParser(_Gait,"integer"));
			writer.write("</xnat_a:gait>");
			header--;
		}
		if (_Speech!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:speech");
			writer.write(">");
			writer.write(ValueParser(_Speech,"integer"));
			writer.write("</xnat_a:speech>");
			header--;
		}
		if (_Writing!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:writing");
			writer.write(">");
			writer.write(ValueParser(_Writing,"integer"));
			writer.write("</xnat_a:writing>");
			header--;
		}
		if (_Arisefromchair!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:ariseFromChair");
			writer.write(">");
			writer.write(ValueParser(_Arisefromchair,"integer"));
			writer.write("</xnat_a:ariseFromChair>");
			header--;
		}
			int child4=0;
			int att4=0;
			if(_Actionposturaltremor_right!=null)
			child4++;
			if(_Actionposturaltremor_left!=null)
			child4++;
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:actionPosturalTremor");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Actionposturaltremor_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Actionposturaltremor_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Actionposturaltremor_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Actionposturaltremor_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:actionPosturalTremor>");
			}
			}

			int child5=0;
			int att5=0;
			if(_Handsram_left!=null)
			child5++;
			if(_Handsram_right!=null)
			child5++;
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:handsRAM");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Handsram_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Handsram_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Handsram_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Handsram_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:handsRAM>");
			}
			}

			int child6=0;
			int att6=0;
			if(_Fingertaps_right!=null)
			child6++;
			if(_Fingertaps_left!=null)
			child6++;
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:fingerTaps");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Fingertaps_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Fingertaps_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Fingertaps_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Fingertaps_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:fingerTaps>");
			}
			}

		if (_Posture!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:posture");
			writer.write(">");
			writer.write(ValueParser(_Posture,"integer"));
			writer.write("</xnat_a:posture>");
			header--;
		}
		if (_Posturalstability!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:posturalStability");
			writer.write(">");
			writer.write(ValueParser(_Posturalstability,"integer"));
			writer.write("</xnat_a:posturalStability>");
			header--;
		}
			int child7=0;
			int att7=0;
			if(_Foottaps_left!=null)
			child7++;
			if(_Foottaps_right!=null)
			child7++;
			if(child7>0 || att7>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:footTaps");
			if(child7==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Foottaps_right!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:right");
			writer.write(">");
			writer.write(ValueParser(_Foottaps_right,"integer"));
			writer.write("</xnat_a:right>");
			header--;
		}
		if (_Foottaps_left!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:left");
			writer.write(">");
			writer.write(ValueParser(_Foottaps_left,"integer"));
			writer.write("</xnat_a:left>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:footTaps>");
			}
			}

		if (_Bodybradykinesiahypokinesia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:bodyBradykinesiaHypokinesia");
			writer.write(">");
			writer.write(ValueParser(_Bodybradykinesiahypokinesia,"integer"));
			writer.write("</xnat_a:bodyBradykinesiaHypokinesia>");
			header--;
		}
		if (_Problem!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:problem");
			writer.write(">");
			writer.write(ValueParser(_Problem,"boolean"));
			writer.write("</xnat_a:problem>");
			header--;
		}
	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Inscanner!=null) return true;
			if(_Clicker_interval!=null) return true;
			if(_Clicker_left!=null) return true;
			if(_Clicker_right!=null) return true;
			if(_Tremorrest_rle!=null) return true;
			if(_Tremorrest_lle!=null) return true;
			if(_Tremorrest_rue!=null) return true;
			if(_Tremorrest_face!=null) return true;
			if(_Tremorrest_lue!=null) return true;
			if(_Rigidity_lle!=null) return true;
			if(_Rigidity_rue!=null) return true;
			if(_Rigidity_lue!=null) return true;
			if(_Rigidity_neck!=null) return true;
			if(_Rigidity_rle!=null) return true;
			if(_Handmovementsgrip_right!=null) return true;
			if(_Handmovementsgrip_left!=null) return true;
		if (_Facialexpression!=null) return true;
		if (_Gait!=null) return true;
		if (_Speech!=null) return true;
		if (_Writing!=null) return true;
		if (_Arisefromchair!=null) return true;
			if(_Actionposturaltremor_right!=null) return true;
			if(_Actionposturaltremor_left!=null) return true;
			if(_Handsram_left!=null) return true;
			if(_Handsram_right!=null) return true;
			if(_Fingertaps_right!=null) return true;
			if(_Fingertaps_left!=null) return true;
		if (_Posture!=null) return true;
		if (_Posturalstability!=null) return true;
			if(_Foottaps_left!=null) return true;
			if(_Foottaps_right!=null) return true;
		if (_Bodybradykinesiahypokinesia!=null) return true;
		if (_Problem!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
