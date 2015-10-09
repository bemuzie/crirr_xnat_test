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
public class XnatAscidresearchdataBean extends XnatSubjectassessordataBean implements java.io.Serializable, org.nrg.xdat.model.XnatAscidresearchdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatAscidresearchdataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat_a:scidResearchData";

	public String getSchemaElementName(){
		return "scidResearchData";
	}

	public String getFullSchemaElementName(){
		return "xnat_a:scidResearchData";
	}

	//FIELD

	private String _Administrator=null;

	/**
	 * @return Returns the administrator.
	 */
	public String getAdministrator(){
		return _Administrator;
	}

	/**
	 * Sets the value for administrator.
	 * @param v Value to Set.
	 */
	public void setAdministrator(String v){
		_Administrator=v;
	}

	//FIELD

	private Integer _Moodepisodes_currentmajordepressiveepisode=null;

	/**
	 * @return Returns the moodEpisodes/currentMajorDepressiveEpisode.
	 */
	public Integer getMoodepisodes_currentmajordepressiveepisode(){
		return _Moodepisodes_currentmajordepressiveepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmajordepressiveepisode(Integer v) {
		_Moodepisodes_currentmajordepressiveepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmajordepressiveepisode(String v)  {
		_Moodepisodes_currentmajordepressiveepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_pastmajordepressiveepisode=null;

	/**
	 * @return Returns the moodEpisodes/pastMajorDepressiveEpisode.
	 */
	public Integer getMoodepisodes_pastmajordepressiveepisode(){
		return _Moodepisodes_pastmajordepressiveepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmajordepressiveepisode(Integer v) {
		_Moodepisodes_pastmajordepressiveepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmajordepressiveepisode(String v)  {
		_Moodepisodes_pastmajordepressiveepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_currentmanicepisode=null;

	/**
	 * @return Returns the moodEpisodes/currentManicEpisode.
	 */
	public Integer getMoodepisodes_currentmanicepisode(){
		return _Moodepisodes_currentmanicepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmanicepisode(Integer v) {
		_Moodepisodes_currentmanicepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmanicepisode(String v)  {
		_Moodepisodes_currentmanicepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_pastmanicepisode=null;

	/**
	 * @return Returns the moodEpisodes/pastManicEpisode.
	 */
	public Integer getMoodepisodes_pastmanicepisode(){
		return _Moodepisodes_pastmanicepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmanicepisode(Integer v) {
		_Moodepisodes_pastmanicepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmanicepisode(String v)  {
		_Moodepisodes_pastmanicepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_currenthypomanicepisode=null;

	/**
	 * @return Returns the moodEpisodes/currentHypomanicEpisode.
	 */
	public Integer getMoodepisodes_currenthypomanicepisode(){
		return _Moodepisodes_currenthypomanicepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currenthypomanicepisode(Integer v) {
		_Moodepisodes_currenthypomanicepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currenthypomanicepisode(String v)  {
		_Moodepisodes_currenthypomanicepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_pasthypomanicepisode=null;

	/**
	 * @return Returns the moodEpisodes/pastHypomanicEpisode.
	 */
	public Integer getMoodepisodes_pasthypomanicepisode(){
		return _Moodepisodes_pasthypomanicepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pasthypomanicepisode(Integer v) {
		_Moodepisodes_pasthypomanicepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pasthypomanicepisode(String v)  {
		_Moodepisodes_pasthypomanicepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_currentdysthmicepisode=null;

	/**
	 * @return Returns the moodEpisodes/currentDysthmicEpisode.
	 */
	public Integer getMoodepisodes_currentdysthmicepisode(){
		return _Moodepisodes_currentdysthmicepisode;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentDysthmicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentdysthmicepisode(Integer v) {
		_Moodepisodes_currentdysthmicepisode=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentDysthmicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentdysthmicepisode(String v)  {
		_Moodepisodes_currentdysthmicepisode=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_currentmooddisorderduetomedicalcondition=null;

	/**
	 * @return Returns the moodEpisodes/currentMoodDisorderDueToMedicalCondition.
	 */
	public Integer getMoodepisodes_currentmooddisorderduetomedicalcondition(){
		return _Moodepisodes_currentmooddisorderduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmooddisorderduetomedicalcondition(Integer v) {
		_Moodepisodes_currentmooddisorderduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmooddisorderduetomedicalcondition(String v)  {
		_Moodepisodes_currentmooddisorderduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_pastmooddisorderduetomedicalcondition=null;

	/**
	 * @return Returns the moodEpisodes/pastMoodDisorderDueToMedicalCondition.
	 */
	public Integer getMoodepisodes_pastmooddisorderduetomedicalcondition(){
		return _Moodepisodes_pastmooddisorderduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmooddisorderduetomedicalcondition(Integer v) {
		_Moodepisodes_pastmooddisorderduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmooddisorderduetomedicalcondition(String v)  {
		_Moodepisodes_pastmooddisorderduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_currentsubstanceinducedmooddisorder=null;

	/**
	 * @return Returns the moodEpisodes/currentSubstanceInducedMoodDisorder.
	 */
	public Integer getMoodepisodes_currentsubstanceinducedmooddisorder(){
		return _Moodepisodes_currentsubstanceinducedmooddisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentsubstanceinducedmooddisorder(Integer v) {
		_Moodepisodes_currentsubstanceinducedmooddisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentsubstanceinducedmooddisorder(String v)  {
		_Moodepisodes_currentsubstanceinducedmooddisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Moodepisodes_pastsubstanceinducedmooddisorder=null;

	/**
	 * @return Returns the moodEpisodes/pastSubstanceInducedMoodDisorder.
	 */
	public Integer getMoodepisodes_pastsubstanceinducedmooddisorder(){
		return _Moodepisodes_pastsubstanceinducedmooddisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastsubstanceinducedmooddisorder(Integer v) {
		_Moodepisodes_pastsubstanceinducedmooddisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastsubstanceinducedmooddisorder(String v)  {
		_Moodepisodes_pastsubstanceinducedmooddisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_currentdelusions=null;

	/**
	 * @return Returns the psychoticSymptoms/currentDelusions.
	 */
	public Integer getPsychoticsymptoms_currentdelusions(){
		return _Psychoticsymptoms_currentdelusions;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdelusions(Integer v) {
		_Psychoticsymptoms_currentdelusions=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdelusions(String v)  {
		_Psychoticsymptoms_currentdelusions=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_pastdelusions=null;

	/**
	 * @return Returns the psychoticSymptoms/pastDelusions.
	 */
	public Integer getPsychoticsymptoms_pastdelusions(){
		return _Psychoticsymptoms_pastdelusions;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdelusions(Integer v) {
		_Psychoticsymptoms_pastdelusions=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdelusions(String v)  {
		_Psychoticsymptoms_pastdelusions=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_currenthallucinations=null;

	/**
	 * @return Returns the psychoticSymptoms/currentHallucinations.
	 */
	public Integer getPsychoticsymptoms_currenthallucinations(){
		return _Psychoticsymptoms_currenthallucinations;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currenthallucinations(Integer v) {
		_Psychoticsymptoms_currenthallucinations=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currenthallucinations(String v)  {
		_Psychoticsymptoms_currenthallucinations=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_pasthallucinations=null;

	/**
	 * @return Returns the psychoticSymptoms/pastHallucinations.
	 */
	public Integer getPsychoticsymptoms_pasthallucinations(){
		return _Psychoticsymptoms_pasthallucinations;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pasthallucinations(Integer v) {
		_Psychoticsymptoms_pasthallucinations=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pasthallucinations(String v)  {
		_Psychoticsymptoms_pasthallucinations=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_currentdisorganizedspeechbehavior=null;

	/**
	 * @return Returns the psychoticSymptoms/currentDisorganizedSpeechBehavior.
	 */
	public Integer getPsychoticsymptoms_currentdisorganizedspeechbehavior(){
		return _Psychoticsymptoms_currentdisorganizedspeechbehavior;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdisorganizedspeechbehavior(Integer v) {
		_Psychoticsymptoms_currentdisorganizedspeechbehavior=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdisorganizedspeechbehavior(String v)  {
		_Psychoticsymptoms_currentdisorganizedspeechbehavior=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_pastdisorganizedspeechbehavior=null;

	/**
	 * @return Returns the psychoticSymptoms/pastDisorganizedSpeechBehavior.
	 */
	public Integer getPsychoticsymptoms_pastdisorganizedspeechbehavior(){
		return _Psychoticsymptoms_pastdisorganizedspeechbehavior;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdisorganizedspeechbehavior(Integer v) {
		_Psychoticsymptoms_pastdisorganizedspeechbehavior=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdisorganizedspeechbehavior(String v)  {
		_Psychoticsymptoms_pastdisorganizedspeechbehavior=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_currentcatatonicbehavior=null;

	/**
	 * @return Returns the psychoticSymptoms/currentCatatonicBehavior.
	 */
	public Integer getPsychoticsymptoms_currentcatatonicbehavior(){
		return _Psychoticsymptoms_currentcatatonicbehavior;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentcatatonicbehavior(Integer v) {
		_Psychoticsymptoms_currentcatatonicbehavior=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentcatatonicbehavior(String v)  {
		_Psychoticsymptoms_currentcatatonicbehavior=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_pastcatatonicbehavior=null;

	/**
	 * @return Returns the psychoticSymptoms/pastCatatonicBehavior.
	 */
	public Integer getPsychoticsymptoms_pastcatatonicbehavior(){
		return _Psychoticsymptoms_pastcatatonicbehavior;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastcatatonicbehavior(Integer v) {
		_Psychoticsymptoms_pastcatatonicbehavior=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastcatatonicbehavior(String v)  {
		_Psychoticsymptoms_pastcatatonicbehavior=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_currentnegativesymptoms=null;

	/**
	 * @return Returns the psychoticSymptoms/currentNegativeSymptoms.
	 */
	public Integer getPsychoticsymptoms_currentnegativesymptoms(){
		return _Psychoticsymptoms_currentnegativesymptoms;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentnegativesymptoms(Integer v) {
		_Psychoticsymptoms_currentnegativesymptoms=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentnegativesymptoms(String v)  {
		_Psychoticsymptoms_currentnegativesymptoms=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticsymptoms_pastnegativesymptoms=null;

	/**
	 * @return Returns the psychoticSymptoms/pastNegativeSymptoms.
	 */
	public Integer getPsychoticsymptoms_pastnegativesymptoms(){
		return _Psychoticsymptoms_pastnegativesymptoms;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastnegativesymptoms(Integer v) {
		_Psychoticsymptoms_pastnegativesymptoms=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastnegativesymptoms(String v)  {
		_Psychoticsymptoms_pastnegativesymptoms=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentschizophrenia=null;

	/**
	 * @return Returns the psychoticDisorders/currentSchizophrenia.
	 */
	public Integer getPsychoticdisorders_currentschizophrenia(){
		return _Psychoticdisorders_currentschizophrenia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophrenia(Integer v) {
		_Psychoticdisorders_currentschizophrenia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophrenia(String v)  {
		_Psychoticdisorders_currentschizophrenia=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastschizophrenia=null;

	/**
	 * @return Returns the psychoticDisorders/pastSchizophrenia.
	 */
	public Integer getPsychoticdisorders_pastschizophrenia(){
		return _Psychoticdisorders_pastschizophrenia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophrenia(Integer v) {
		_Psychoticdisorders_pastschizophrenia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophrenia(String v)  {
		_Psychoticdisorders_pastschizophrenia=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentparanoidtype=null;

	/**
	 * @return Returns the psychoticDisorders/currentParanoidType.
	 */
	public Integer getPsychoticdisorders_currentparanoidtype(){
		return _Psychoticdisorders_currentparanoidtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentparanoidtype(Integer v) {
		_Psychoticdisorders_currentparanoidtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentparanoidtype(String v)  {
		_Psychoticdisorders_currentparanoidtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastparanoidtype=null;

	/**
	 * @return Returns the psychoticDisorders/pastParanoidType.
	 */
	public Integer getPsychoticdisorders_pastparanoidtype(){
		return _Psychoticdisorders_pastparanoidtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastparanoidtype(Integer v) {
		_Psychoticdisorders_pastparanoidtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastparanoidtype(String v)  {
		_Psychoticdisorders_pastparanoidtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentcatatonictype=null;

	/**
	 * @return Returns the psychoticDisorders/currentCatatonicType.
	 */
	public Integer getPsychoticdisorders_currentcatatonictype(){
		return _Psychoticdisorders_currentcatatonictype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentcatatonictype(Integer v) {
		_Psychoticdisorders_currentcatatonictype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentcatatonictype(String v)  {
		_Psychoticdisorders_currentcatatonictype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastcatatonictype=null;

	/**
	 * @return Returns the psychoticDisorders/pastCatatonicType.
	 */
	public Integer getPsychoticdisorders_pastcatatonictype(){
		return _Psychoticdisorders_pastcatatonictype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastcatatonictype(Integer v) {
		_Psychoticdisorders_pastcatatonictype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastcatatonictype(String v)  {
		_Psychoticdisorders_pastcatatonictype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentdisorganizedtype=null;

	/**
	 * @return Returns the psychoticDisorders/currentDisorganizedType.
	 */
	public Integer getPsychoticdisorders_currentdisorganizedtype(){
		return _Psychoticdisorders_currentdisorganizedtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdisorganizedtype(Integer v) {
		_Psychoticdisorders_currentdisorganizedtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdisorganizedtype(String v)  {
		_Psychoticdisorders_currentdisorganizedtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastdisorganizedtype=null;

	/**
	 * @return Returns the psychoticDisorders/pastDisorganizedType.
	 */
	public Integer getPsychoticdisorders_pastdisorganizedtype(){
		return _Psychoticdisorders_pastdisorganizedtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdisorganizedtype(Integer v) {
		_Psychoticdisorders_pastdisorganizedtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdisorganizedtype(String v)  {
		_Psychoticdisorders_pastdisorganizedtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentundifferentiatedtype=null;

	/**
	 * @return Returns the psychoticDisorders/currentUndifferentiatedType.
	 */
	public Integer getPsychoticdisorders_currentundifferentiatedtype(){
		return _Psychoticdisorders_currentundifferentiatedtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentundifferentiatedtype(Integer v) {
		_Psychoticdisorders_currentundifferentiatedtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentundifferentiatedtype(String v)  {
		_Psychoticdisorders_currentundifferentiatedtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastundifferentiatedtype=null;

	/**
	 * @return Returns the psychoticDisorders/pastUndifferentiatedType.
	 */
	public Integer getPsychoticdisorders_pastundifferentiatedtype(){
		return _Psychoticdisorders_pastundifferentiatedtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastundifferentiatedtype(Integer v) {
		_Psychoticdisorders_pastundifferentiatedtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastundifferentiatedtype(String v)  {
		_Psychoticdisorders_pastundifferentiatedtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentresidualtype=null;

	/**
	 * @return Returns the psychoticDisorders/currentResidualType.
	 */
	public Integer getPsychoticdisorders_currentresidualtype(){
		return _Psychoticdisorders_currentresidualtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentresidualtype(Integer v) {
		_Psychoticdisorders_currentresidualtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentresidualtype(String v)  {
		_Psychoticdisorders_currentresidualtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastresidualtype=null;

	/**
	 * @return Returns the psychoticDisorders/pastResidualType.
	 */
	public Integer getPsychoticdisorders_pastresidualtype(){
		return _Psychoticdisorders_pastresidualtype;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastresidualtype(Integer v) {
		_Psychoticdisorders_pastresidualtype=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastresidualtype(String v)  {
		_Psychoticdisorders_pastresidualtype=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentschizophreniformdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/currentSchizophreniformDisorder.
	 */
	public Integer getPsychoticdisorders_currentschizophreniformdisorder(){
		return _Psychoticdisorders_currentschizophreniformdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophreniformdisorder(Integer v) {
		_Psychoticdisorders_currentschizophreniformdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophreniformdisorder(String v)  {
		_Psychoticdisorders_currentschizophreniformdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastschizophreniformdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/pastSchizophreniformDisorder.
	 */
	public Integer getPsychoticdisorders_pastschizophreniformdisorder(){
		return _Psychoticdisorders_pastschizophreniformdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophreniformdisorder(Integer v) {
		_Psychoticdisorders_pastschizophreniformdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophreniformdisorder(String v)  {
		_Psychoticdisorders_pastschizophreniformdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentschizoaffectivedisorder=null;

	/**
	 * @return Returns the psychoticDisorders/currentSchizoaffectiveDisorder.
	 */
	public Integer getPsychoticdisorders_currentschizoaffectivedisorder(){
		return _Psychoticdisorders_currentschizoaffectivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizoaffectivedisorder(Integer v) {
		_Psychoticdisorders_currentschizoaffectivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizoaffectivedisorder(String v)  {
		_Psychoticdisorders_currentschizoaffectivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastschizoaffectivedisorder=null;

	/**
	 * @return Returns the psychoticDisorders/pastSchizoaffectiveDisorder.
	 */
	public Integer getPsychoticdisorders_pastschizoaffectivedisorder(){
		return _Psychoticdisorders_pastschizoaffectivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizoaffectivedisorder(Integer v) {
		_Psychoticdisorders_pastschizoaffectivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizoaffectivedisorder(String v)  {
		_Psychoticdisorders_pastschizoaffectivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentdelusionaldisorder=null;

	/**
	 * @return Returns the psychoticDisorders/currentDelusionalDisorder.
	 */
	public Integer getPsychoticdisorders_currentdelusionaldisorder(){
		return _Psychoticdisorders_currentdelusionaldisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdelusionaldisorder(Integer v) {
		_Psychoticdisorders_currentdelusionaldisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdelusionaldisorder(String v)  {
		_Psychoticdisorders_currentdelusionaldisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastdelusionaldisorder=null;

	/**
	 * @return Returns the psychoticDisorders/pastDelusionalDisorder.
	 */
	public Integer getPsychoticdisorders_pastdelusionaldisorder(){
		return _Psychoticdisorders_pastdelusionaldisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdelusionaldisorder(Integer v) {
		_Psychoticdisorders_pastdelusionaldisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdelusionaldisorder(String v)  {
		_Psychoticdisorders_pastdelusionaldisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentbriefpsychoticdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/currentBriefPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_currentbriefpsychoticdisorder(){
		return _Psychoticdisorders_currentbriefpsychoticdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentbriefpsychoticdisorder(Integer v) {
		_Psychoticdisorders_currentbriefpsychoticdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentbriefpsychoticdisorder(String v)  {
		_Psychoticdisorders_currentbriefpsychoticdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastbriefpsychoticdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/pastBriefPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_pastbriefpsychoticdisorder(){
		return _Psychoticdisorders_pastbriefpsychoticdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastbriefpsychoticdisorder(Integer v) {
		_Psychoticdisorders_pastbriefpsychoticdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastbriefpsychoticdisorder(String v)  {
		_Psychoticdisorders_pastbriefpsychoticdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition=null;

	/**
	 * @return Returns the psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition.
	 */
	public Integer getPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition(){
		return _Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition(Integer v) {
		_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition(String v)  {
		_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition=null;

	/**
	 * @return Returns the psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition.
	 */
	public Integer getPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition(){
		return _Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition(Integer v) {
		_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition(String v)  {
		_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentsubstanceinducedpsychoticdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/currentSubstanceInducedPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_currentsubstanceinducedpsychoticdisorder(){
		return _Psychoticdisorders_currentsubstanceinducedpsychoticdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentsubstanceinducedpsychoticdisorder(Integer v) {
		_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentsubstanceinducedpsychoticdisorder(String v)  {
		_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastsubstanceinducedpsychoticdisorder=null;

	/**
	 * @return Returns the psychoticDisorders/pastSubstanceInducedPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_pastsubstanceinducedpsychoticdisorder(){
		return _Psychoticdisorders_pastsubstanceinducedpsychoticdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastsubstanceinducedpsychoticdisorder(Integer v) {
		_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastsubstanceinducedpsychoticdisorder(String v)  {
		_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_currentpsychoticdisordernos=null;

	/**
	 * @return Returns the psychoticDisorders/currentPsychoticDisorderNOS.
	 */
	public Integer getPsychoticdisorders_currentpsychoticdisordernos(){
		return _Psychoticdisorders_currentpsychoticdisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisordernos(Integer v) {
		_Psychoticdisorders_currentpsychoticdisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisordernos(String v)  {
		_Psychoticdisorders_currentpsychoticdisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Psychoticdisorders_pastpsychoticdisordernos=null;

	/**
	 * @return Returns the psychoticDisorders/pastPsychoticDisorderNOS.
	 */
	public Integer getPsychoticdisorders_pastpsychoticdisordernos(){
		return _Psychoticdisorders_pastpsychoticdisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisordernos(Integer v) {
		_Psychoticdisorders_pastpsychoticdisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisordernos(String v)  {
		_Psychoticdisorders_pastpsychoticdisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_currentbipolar1disorder=null;

	/**
	 * @return Returns the moodDisorders/currentBipolar1Disorder.
	 */
	public Integer getMooddisorders_currentbipolar1disorder(){
		return _Mooddisorders_currentbipolar1disorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar1disorder(Integer v) {
		_Mooddisorders_currentbipolar1disorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar1disorder(String v)  {
		_Mooddisorders_currentbipolar1disorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_pastbipolar1disorder=null;

	/**
	 * @return Returns the moodDisorders/pastBipolar1Disorder.
	 */
	public Integer getMooddisorders_pastbipolar1disorder(){
		return _Mooddisorders_pastbipolar1disorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar1disorder(Integer v) {
		_Mooddisorders_pastbipolar1disorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar1disorder(String v)  {
		_Mooddisorders_pastbipolar1disorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_currentbipolar2disorder=null;

	/**
	 * @return Returns the moodDisorders/currentBipolar2Disorder.
	 */
	public Integer getMooddisorders_currentbipolar2disorder(){
		return _Mooddisorders_currentbipolar2disorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar2disorder(Integer v) {
		_Mooddisorders_currentbipolar2disorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar2disorder(String v)  {
		_Mooddisorders_currentbipolar2disorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_pastbipolar2disorder=null;

	/**
	 * @return Returns the moodDisorders/pastBipolar2Disorder.
	 */
	public Integer getMooddisorders_pastbipolar2disorder(){
		return _Mooddisorders_pastbipolar2disorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar2disorder(Integer v) {
		_Mooddisorders_pastbipolar2disorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar2disorder(String v)  {
		_Mooddisorders_pastbipolar2disorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_currentotherbipolardisorder=null;

	/**
	 * @return Returns the moodDisorders/currentOtherBipolarDisorder.
	 */
	public Integer getMooddisorders_currentotherbipolardisorder(){
		return _Mooddisorders_currentotherbipolardisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentotherbipolardisorder(Integer v) {
		_Mooddisorders_currentotherbipolardisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentotherbipolardisorder(String v)  {
		_Mooddisorders_currentotherbipolardisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_pastotherbipolardisorder=null;

	/**
	 * @return Returns the moodDisorders/pastOtherBipolarDisorder.
	 */
	public Integer getMooddisorders_pastotherbipolardisorder(){
		return _Mooddisorders_pastotherbipolardisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastotherbipolardisorder(Integer v) {
		_Mooddisorders_pastotherbipolardisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastotherbipolardisorder(String v)  {
		_Mooddisorders_pastotherbipolardisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_currentmajordepressivedisorder=null;

	/**
	 * @return Returns the moodDisorders/currentMajorDepressiveDisorder.
	 */
	public Integer getMooddisorders_currentmajordepressivedisorder(){
		return _Mooddisorders_currentmajordepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentmajordepressivedisorder(Integer v) {
		_Mooddisorders_currentmajordepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentmajordepressivedisorder(String v)  {
		_Mooddisorders_currentmajordepressivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_pastmajordepressivedisorder=null;

	/**
	 * @return Returns the moodDisorders/pastMajorDepressiveDisorder.
	 */
	public Integer getMooddisorders_pastmajordepressivedisorder(){
		return _Mooddisorders_pastmajordepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastmajordepressivedisorder(Integer v) {
		_Mooddisorders_pastmajordepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastmajordepressivedisorder(String v)  {
		_Mooddisorders_pastmajordepressivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_currentdepressivedisordernos=null;

	/**
	 * @return Returns the moodDisorders/currentDepressiveDisorderNOS.
	 */
	public Integer getMooddisorders_currentdepressivedisordernos(){
		return _Mooddisorders_currentdepressivedisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentdepressivedisordernos(Integer v) {
		_Mooddisorders_currentdepressivedisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentdepressivedisordernos(String v)  {
		_Mooddisorders_currentdepressivedisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Mooddisorders_pastdepressivedisordernos=null;

	/**
	 * @return Returns the moodDisorders/pastDepressiveDisorderNOS.
	 */
	public Integer getMooddisorders_pastdepressivedisordernos(){
		return _Mooddisorders_pastdepressivedisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastdepressivedisordernos(Integer v) {
		_Mooddisorders_pastdepressivedisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastdepressivedisordernos(String v)  {
		_Mooddisorders_pastdepressivedisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentalcoholdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentAlcoholDependence.
	 */
	public Integer getSubstanceusedisorders_currentalcoholdependence(){
		return _Substanceusedisorders_currentalcoholdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholdependence(Integer v) {
		_Substanceusedisorders_currentalcoholdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholdependence(String v)  {
		_Substanceusedisorders_currentalcoholdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastalcoholdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastAlcoholDependence.
	 */
	public Integer getSubstanceusedisorders_pastalcoholdependence(){
		return _Substanceusedisorders_pastalcoholdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholdependence(Integer v) {
		_Substanceusedisorders_pastalcoholdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholdependence(String v)  {
		_Substanceusedisorders_pastalcoholdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentalcoholabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentAlcoholAbuse.
	 */
	public Integer getSubstanceusedisorders_currentalcoholabuse(){
		return _Substanceusedisorders_currentalcoholabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholabuse(Integer v) {
		_Substanceusedisorders_currentalcoholabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholabuse(String v)  {
		_Substanceusedisorders_currentalcoholabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastalcoholabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastAlcoholAbuse.
	 */
	public Integer getSubstanceusedisorders_pastalcoholabuse(){
		return _Substanceusedisorders_pastalcoholabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholabuse(Integer v) {
		_Substanceusedisorders_pastalcoholabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholabuse(String v)  {
		_Substanceusedisorders_pastalcoholabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentamphetaminedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentAmphetamineDependence.
	 */
	public Integer getSubstanceusedisorders_currentamphetaminedependence(){
		return _Substanceusedisorders_currentamphetaminedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetaminedependence(Integer v) {
		_Substanceusedisorders_currentamphetaminedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetaminedependence(String v)  {
		_Substanceusedisorders_currentamphetaminedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastamphetaminedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastAmphetamineDependence.
	 */
	public Integer getSubstanceusedisorders_pastamphetaminedependence(){
		return _Substanceusedisorders_pastamphetaminedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetaminedependence(Integer v) {
		_Substanceusedisorders_pastamphetaminedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetaminedependence(String v)  {
		_Substanceusedisorders_pastamphetaminedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentamphetamineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentAmphetamineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentamphetamineabuse(){
		return _Substanceusedisorders_currentamphetamineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetamineabuse(Integer v) {
		_Substanceusedisorders_currentamphetamineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetamineabuse(String v)  {
		_Substanceusedisorders_currentamphetamineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastamphetamineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastAmphetamineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastamphetamineabuse(){
		return _Substanceusedisorders_pastamphetamineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetamineabuse(Integer v) {
		_Substanceusedisorders_pastamphetamineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetamineabuse(String v)  {
		_Substanceusedisorders_pastamphetamineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentcannabisdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentCannabisDependence.
	 */
	public Integer getSubstanceusedisorders_currentcannabisdependence(){
		return _Substanceusedisorders_currentcannabisdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisdependence(Integer v) {
		_Substanceusedisorders_currentcannabisdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisdependence(String v)  {
		_Substanceusedisorders_currentcannabisdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastcannabisdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastCannabisDependence.
	 */
	public Integer getSubstanceusedisorders_pastcannabisdependence(){
		return _Substanceusedisorders_pastcannabisdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisdependence(Integer v) {
		_Substanceusedisorders_pastcannabisdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisdependence(String v)  {
		_Substanceusedisorders_pastcannabisdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentcannabisabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentCannabisAbuse.
	 */
	public Integer getSubstanceusedisorders_currentcannabisabuse(){
		return _Substanceusedisorders_currentcannabisabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisabuse(Integer v) {
		_Substanceusedisorders_currentcannabisabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisabuse(String v)  {
		_Substanceusedisorders_currentcannabisabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastcannabisabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastCannabisAbuse.
	 */
	public Integer getSubstanceusedisorders_pastcannabisabuse(){
		return _Substanceusedisorders_pastcannabisabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisabuse(Integer v) {
		_Substanceusedisorders_pastcannabisabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisabuse(String v)  {
		_Substanceusedisorders_pastcannabisabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentcocainedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentCocaineDependence.
	 */
	public Integer getSubstanceusedisorders_currentcocainedependence(){
		return _Substanceusedisorders_currentcocainedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocainedependence(Integer v) {
		_Substanceusedisorders_currentcocainedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocainedependence(String v)  {
		_Substanceusedisorders_currentcocainedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastcocainedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastCocaineDependence.
	 */
	public Integer getSubstanceusedisorders_pastcocainedependence(){
		return _Substanceusedisorders_pastcocainedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocainedependence(Integer v) {
		_Substanceusedisorders_pastcocainedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocainedependence(String v)  {
		_Substanceusedisorders_pastcocainedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentcocaineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentCocaineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentcocaineabuse(){
		return _Substanceusedisorders_currentcocaineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocaineabuse(Integer v) {
		_Substanceusedisorders_currentcocaineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocaineabuse(String v)  {
		_Substanceusedisorders_currentcocaineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastcocaineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastCocaineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastcocaineabuse(){
		return _Substanceusedisorders_pastcocaineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocaineabuse(Integer v) {
		_Substanceusedisorders_pastcocaineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocaineabuse(String v)  {
		_Substanceusedisorders_pastcocaineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currenthallucinogendependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentHallucinogenDependence.
	 */
	public Integer getSubstanceusedisorders_currenthallucinogendependence(){
		return _Substanceusedisorders_currenthallucinogendependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogendependence(Integer v) {
		_Substanceusedisorders_currenthallucinogendependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogendependence(String v)  {
		_Substanceusedisorders_currenthallucinogendependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pasthallucinogendependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastHallucinogenDependence.
	 */
	public Integer getSubstanceusedisorders_pasthallucinogendependence(){
		return _Substanceusedisorders_pasthallucinogendependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogendependence(Integer v) {
		_Substanceusedisorders_pasthallucinogendependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogendependence(String v)  {
		_Substanceusedisorders_pasthallucinogendependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currenthallucinogenabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentHallucinogenAbuse.
	 */
	public Integer getSubstanceusedisorders_currenthallucinogenabuse(){
		return _Substanceusedisorders_currenthallucinogenabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogenabuse(Integer v) {
		_Substanceusedisorders_currenthallucinogenabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogenabuse(String v)  {
		_Substanceusedisorders_currenthallucinogenabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pasthallucinogenabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastHallucinogenAbuse.
	 */
	public Integer getSubstanceusedisorders_pasthallucinogenabuse(){
		return _Substanceusedisorders_pasthallucinogenabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogenabuse(Integer v) {
		_Substanceusedisorders_pasthallucinogenabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogenabuse(String v)  {
		_Substanceusedisorders_pasthallucinogenabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentopioiddependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentOpioidDependence.
	 */
	public Integer getSubstanceusedisorders_currentopioiddependence(){
		return _Substanceusedisorders_currentopioiddependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioiddependence(Integer v) {
		_Substanceusedisorders_currentopioiddependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioiddependence(String v)  {
		_Substanceusedisorders_currentopioiddependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastopioiddependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastOpioidDependence.
	 */
	public Integer getSubstanceusedisorders_pastopioiddependence(){
		return _Substanceusedisorders_pastopioiddependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioiddependence(Integer v) {
		_Substanceusedisorders_pastopioiddependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioiddependence(String v)  {
		_Substanceusedisorders_pastopioiddependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentopioidabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentOpioidAbuse.
	 */
	public Integer getSubstanceusedisorders_currentopioidabuse(){
		return _Substanceusedisorders_currentopioidabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioidabuse(Integer v) {
		_Substanceusedisorders_currentopioidabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioidabuse(String v)  {
		_Substanceusedisorders_currentopioidabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastopioidabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastOpioidAbuse.
	 */
	public Integer getSubstanceusedisorders_pastopioidabuse(){
		return _Substanceusedisorders_pastopioidabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioidabuse(Integer v) {
		_Substanceusedisorders_pastopioidabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioidabuse(String v)  {
		_Substanceusedisorders_pastopioidabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentphencyclidinedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentPhencyclidineDependence.
	 */
	public Integer getSubstanceusedisorders_currentphencyclidinedependence(){
		return _Substanceusedisorders_currentphencyclidinedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidinedependence(Integer v) {
		_Substanceusedisorders_currentphencyclidinedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidinedependence(String v)  {
		_Substanceusedisorders_currentphencyclidinedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastphencyclidinedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastPhencyclidineDependence.
	 */
	public Integer getSubstanceusedisorders_pastphencyclidinedependence(){
		return _Substanceusedisorders_pastphencyclidinedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidinedependence(Integer v) {
		_Substanceusedisorders_pastphencyclidinedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidinedependence(String v)  {
		_Substanceusedisorders_pastphencyclidinedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentphencyclidineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentPhencyclidineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentphencyclidineabuse(){
		return _Substanceusedisorders_currentphencyclidineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidineabuse(Integer v) {
		_Substanceusedisorders_currentphencyclidineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidineabuse(String v)  {
		_Substanceusedisorders_currentphencyclidineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastphencyclidineabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastPhencyclidineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastphencyclidineabuse(){
		return _Substanceusedisorders_pastphencyclidineabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidineabuse(Integer v) {
		_Substanceusedisorders_pastphencyclidineabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidineabuse(String v)  {
		_Substanceusedisorders_pastphencyclidineabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentsedativehypnoticanxiolyticdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence.
	 */
	public Integer getSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence(){
		return _Substanceusedisorders_currentsedativehypnoticanxiolyticdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence(Integer v) {
		_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence(String v)  {
		_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastsedativehypnoticanxiolyticdependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence.
	 */
	public Integer getSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence(){
		return _Substanceusedisorders_pastsedativehypnoticanxiolyticdependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence(Integer v) {
		_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence(String v)  {
		_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentsedativehypnoticanxiolyticabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse.
	 */
	public Integer getSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse(){
		return _Substanceusedisorders_currentsedativehypnoticanxiolyticabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse(Integer v) {
		_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse(String v)  {
		_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastsedativehypnoticanxiolyticabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse.
	 */
	public Integer getSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse(){
		return _Substanceusedisorders_pastsedativehypnoticanxiolyticabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse(Integer v) {
		_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse(String v)  {
		_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentpolysubstancedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentPolysubstanceDependence.
	 */
	public Integer getSubstanceusedisorders_currentpolysubstancedependence(){
		return _Substanceusedisorders_currentpolysubstancedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentpolysubstancedependence(Integer v) {
		_Substanceusedisorders_currentpolysubstancedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentpolysubstancedependence(String v)  {
		_Substanceusedisorders_currentpolysubstancedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastpolysubstancedependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastPolysubstanceDependence.
	 */
	public Integer getSubstanceusedisorders_pastpolysubstancedependence(){
		return _Substanceusedisorders_pastpolysubstancedependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastpolysubstancedependence(Integer v) {
		_Substanceusedisorders_pastpolysubstancedependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastpolysubstancedependence(String v)  {
		_Substanceusedisorders_pastpolysubstancedependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentotherorunknowndependence=null;

	/**
	 * @return Returns the substanceUseDisorders/currentOtherOrUnknownDependence.
	 */
	public Integer getSubstanceusedisorders_currentotherorunknowndependence(){
		return _Substanceusedisorders_currentotherorunknowndependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknowndependence(Integer v) {
		_Substanceusedisorders_currentotherorunknowndependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknowndependence(String v)  {
		_Substanceusedisorders_currentotherorunknowndependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastotherorunknowndependence=null;

	/**
	 * @return Returns the substanceUseDisorders/pastOtherOrUnknownDependence.
	 */
	public Integer getSubstanceusedisorders_pastotherorunknowndependence(){
		return _Substanceusedisorders_pastotherorunknowndependence;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknowndependence(Integer v) {
		_Substanceusedisorders_pastotherorunknowndependence=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknowndependence(String v)  {
		_Substanceusedisorders_pastotherorunknowndependence=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_currentotherorunknownabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/currentOtherOrUnknownAbuse.
	 */
	public Integer getSubstanceusedisorders_currentotherorunknownabuse(){
		return _Substanceusedisorders_currentotherorunknownabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknownabuse(Integer v) {
		_Substanceusedisorders_currentotherorunknownabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknownabuse(String v)  {
		_Substanceusedisorders_currentotherorunknownabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Substanceusedisorders_pastotherorunknownabuse=null;

	/**
	 * @return Returns the substanceUseDisorders/pastOtherOrUnknownAbuse.
	 */
	public Integer getSubstanceusedisorders_pastotherorunknownabuse(){
		return _Substanceusedisorders_pastotherorunknownabuse;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknownabuse(Integer v) {
		_Substanceusedisorders_pastotherorunknownabuse=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknownabuse(String v)  {
		_Substanceusedisorders_pastotherorunknownabuse=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentpanicwithagoraphobia=null;

	/**
	 * @return Returns the anxietyDisorders/currentPanicWithAgoraphobia.
	 */
	public Integer getAnxietydisorders_currentpanicwithagoraphobia(){
		return _Anxietydisorders_currentpanicwithagoraphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithagoraphobia(Integer v) {
		_Anxietydisorders_currentpanicwithagoraphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithagoraphobia(String v)  {
		_Anxietydisorders_currentpanicwithagoraphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastpanicwithagoraphobia=null;

	/**
	 * @return Returns the anxietyDisorders/pastPanicWithAgoraphobia.
	 */
	public Integer getAnxietydisorders_pastpanicwithagoraphobia(){
		return _Anxietydisorders_pastpanicwithagoraphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithagoraphobia(Integer v) {
		_Anxietydisorders_pastpanicwithagoraphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithagoraphobia(String v)  {
		_Anxietydisorders_pastpanicwithagoraphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentpanicwithoutagoraphobia=null;

	/**
	 * @return Returns the anxietyDisorders/currentPanicWithoutAgoraphobia.
	 */
	public Integer getAnxietydisorders_currentpanicwithoutagoraphobia(){
		return _Anxietydisorders_currentpanicwithoutagoraphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithoutagoraphobia(Integer v) {
		_Anxietydisorders_currentpanicwithoutagoraphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithoutagoraphobia(String v)  {
		_Anxietydisorders_currentpanicwithoutagoraphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastpanicwithoutagoraphobia=null;

	/**
	 * @return Returns the anxietyDisorders/pastPanicWithoutAgoraphobia.
	 */
	public Integer getAnxietydisorders_pastpanicwithoutagoraphobia(){
		return _Anxietydisorders_pastpanicwithoutagoraphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithoutagoraphobia(Integer v) {
		_Anxietydisorders_pastpanicwithoutagoraphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithoutagoraphobia(String v)  {
		_Anxietydisorders_pastpanicwithoutagoraphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentagoraphobiawithoutpanichx=null;

	/**
	 * @return Returns the anxietyDisorders/currentAgoraphobiaWithoutPanicHx.
	 */
	public Integer getAnxietydisorders_currentagoraphobiawithoutpanichx(){
		return _Anxietydisorders_currentagoraphobiawithoutpanichx;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentagoraphobiawithoutpanichx(Integer v) {
		_Anxietydisorders_currentagoraphobiawithoutpanichx=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentagoraphobiawithoutpanichx(String v)  {
		_Anxietydisorders_currentagoraphobiawithoutpanichx=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastagoraphobiawithoutpanichx=null;

	/**
	 * @return Returns the anxietyDisorders/pastAgoraphobiaWithoutPanicHx.
	 */
	public Integer getAnxietydisorders_pastagoraphobiawithoutpanichx(){
		return _Anxietydisorders_pastagoraphobiawithoutpanichx;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastagoraphobiawithoutpanichx(Integer v) {
		_Anxietydisorders_pastagoraphobiawithoutpanichx=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastagoraphobiawithoutpanichx(String v)  {
		_Anxietydisorders_pastagoraphobiawithoutpanichx=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentsocialphobia=null;

	/**
	 * @return Returns the anxietyDisorders/currentSocialPhobia.
	 */
	public Integer getAnxietydisorders_currentsocialphobia(){
		return _Anxietydisorders_currentsocialphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsocialphobia(Integer v) {
		_Anxietydisorders_currentsocialphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsocialphobia(String v)  {
		_Anxietydisorders_currentsocialphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastsocialphobia=null;

	/**
	 * @return Returns the anxietyDisorders/pastSocialPhobia.
	 */
	public Integer getAnxietydisorders_pastsocialphobia(){
		return _Anxietydisorders_pastsocialphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsocialphobia(Integer v) {
		_Anxietydisorders_pastsocialphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsocialphobia(String v)  {
		_Anxietydisorders_pastsocialphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentspecificphobia=null;

	/**
	 * @return Returns the anxietyDisorders/currentSpecificPhobia.
	 */
	public Integer getAnxietydisorders_currentspecificphobia(){
		return _Anxietydisorders_currentspecificphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentspecificphobia(Integer v) {
		_Anxietydisorders_currentspecificphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentspecificphobia(String v)  {
		_Anxietydisorders_currentspecificphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastspecificphobia=null;

	/**
	 * @return Returns the anxietyDisorders/pastSpecificPhobia.
	 */
	public Integer getAnxietydisorders_pastspecificphobia(){
		return _Anxietydisorders_pastspecificphobia;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastspecificphobia(Integer v) {
		_Anxietydisorders_pastspecificphobia=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastspecificphobia(String v)  {
		_Anxietydisorders_pastspecificphobia=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentocd=null;

	/**
	 * @return Returns the anxietyDisorders/currentOCD.
	 */
	public Integer getAnxietydisorders_currentocd(){
		return _Anxietydisorders_currentocd;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentocd(Integer v) {
		_Anxietydisorders_currentocd=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentocd(String v)  {
		_Anxietydisorders_currentocd=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastocd=null;

	/**
	 * @return Returns the anxietyDisorders/pastOCD.
	 */
	public Integer getAnxietydisorders_pastocd(){
		return _Anxietydisorders_pastocd;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastocd(Integer v) {
		_Anxietydisorders_pastocd=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastocd(String v)  {
		_Anxietydisorders_pastocd=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentptsd=null;

	/**
	 * @return Returns the anxietyDisorders/currentPTSD.
	 */
	public Integer getAnxietydisorders_currentptsd(){
		return _Anxietydisorders_currentptsd;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentptsd(Integer v) {
		_Anxietydisorders_currentptsd=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentptsd(String v)  {
		_Anxietydisorders_currentptsd=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastptsd=null;

	/**
	 * @return Returns the anxietyDisorders/pastPTSD.
	 */
	public Integer getAnxietydisorders_pastptsd(){
		return _Anxietydisorders_pastptsd;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastptsd(Integer v) {
		_Anxietydisorders_pastptsd=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastptsd(String v)  {
		_Anxietydisorders_pastptsd=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentgeneralizedanxietydisorder=null;

	/**
	 * @return Returns the anxietyDisorders/currentGeneralizedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_currentgeneralizedanxietydisorder(){
		return _Anxietydisorders_currentgeneralizedanxietydisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentGeneralizedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentgeneralizedanxietydisorder(Integer v) {
		_Anxietydisorders_currentgeneralizedanxietydisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentGeneralizedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentgeneralizedanxietydisorder(String v)  {
		_Anxietydisorders_currentgeneralizedanxietydisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentanxietyduetomedicalcondition=null;

	/**
	 * @return Returns the anxietyDisorders/currentAnxietyDueToMedicalCondition.
	 */
	public Integer getAnxietydisorders_currentanxietyduetomedicalcondition(){
		return _Anxietydisorders_currentanxietyduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietyduetomedicalcondition(Integer v) {
		_Anxietydisorders_currentanxietyduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietyduetomedicalcondition(String v)  {
		_Anxietydisorders_currentanxietyduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastanxietyduetomedicalcondition=null;

	/**
	 * @return Returns the anxietyDisorders/pastAnxietyDueToMedicalCondition.
	 */
	public Integer getAnxietydisorders_pastanxietyduetomedicalcondition(){
		return _Anxietydisorders_pastanxietyduetomedicalcondition;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietyduetomedicalcondition(Integer v) {
		_Anxietydisorders_pastanxietyduetomedicalcondition=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietyduetomedicalcondition(String v)  {
		_Anxietydisorders_pastanxietyduetomedicalcondition=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentsubstanceinducedanxietydisorder=null;

	/**
	 * @return Returns the anxietyDisorders/currentSubstanceInducedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_currentsubstanceinducedanxietydisorder(){
		return _Anxietydisorders_currentsubstanceinducedanxietydisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsubstanceinducedanxietydisorder(Integer v) {
		_Anxietydisorders_currentsubstanceinducedanxietydisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsubstanceinducedanxietydisorder(String v)  {
		_Anxietydisorders_currentsubstanceinducedanxietydisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastsubstanceinducedanxietydisorder=null;

	/**
	 * @return Returns the anxietyDisorders/pastSubstanceInducedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_pastsubstanceinducedanxietydisorder(){
		return _Anxietydisorders_pastsubstanceinducedanxietydisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsubstanceinducedanxietydisorder(Integer v) {
		_Anxietydisorders_pastsubstanceinducedanxietydisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsubstanceinducedanxietydisorder(String v)  {
		_Anxietydisorders_pastsubstanceinducedanxietydisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_currentanxietydisordernos=null;

	/**
	 * @return Returns the anxietyDisorders/currentAnxietyDisorderNOS.
	 */
	public Integer getAnxietydisorders_currentanxietydisordernos(){
		return _Anxietydisorders_currentanxietydisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietydisordernos(Integer v) {
		_Anxietydisorders_currentanxietydisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietydisordernos(String v)  {
		_Anxietydisorders_currentanxietydisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Anxietydisorders_pastanxietydisordernos=null;

	/**
	 * @return Returns the anxietyDisorders/pastAnxietyDisorderNOS.
	 */
	public Integer getAnxietydisorders_pastanxietydisordernos(){
		return _Anxietydisorders_pastanxietydisordernos;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietydisordernos(Integer v) {
		_Anxietydisorders_pastanxietydisordernos=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietydisordernos(String v)  {
		_Anxietydisorders_pastanxietydisordernos=formatInteger(v);
	}

	//FIELD

	private Integer _Somatoformdisorders_somatizationdisorder=null;

	/**
	 * @return Returns the somatoformDisorders/somatizationDisorder.
	 */
	public Integer getSomatoformdisorders_somatizationdisorder(){
		return _Somatoformdisorders_somatizationdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/somatizationDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_somatizationdisorder(Integer v) {
		_Somatoformdisorders_somatizationdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/somatizationDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_somatizationdisorder(String v)  {
		_Somatoformdisorders_somatizationdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Somatoformdisorders_undifferentiatedsomatformdisorder=null;

	/**
	 * @return Returns the somatoformDisorders/undifferentiatedSomatformDisorder.
	 */
	public Integer getSomatoformdisorders_undifferentiatedsomatformdisorder(){
		return _Somatoformdisorders_undifferentiatedsomatformdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/undifferentiatedSomatformDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_undifferentiatedsomatformdisorder(Integer v) {
		_Somatoformdisorders_undifferentiatedsomatformdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/undifferentiatedSomatformDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_undifferentiatedsomatformdisorder(String v)  {
		_Somatoformdisorders_undifferentiatedsomatformdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Somatoformdisorders_paindisorder=null;

	/**
	 * @return Returns the somatoformDisorders/painDisorder.
	 */
	public Integer getSomatoformdisorders_paindisorder(){
		return _Somatoformdisorders_paindisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/painDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_paindisorder(Integer v) {
		_Somatoformdisorders_paindisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/painDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_paindisorder(String v)  {
		_Somatoformdisorders_paindisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Somatoformdisorders_hypochondriasis=null;

	/**
	 * @return Returns the somatoformDisorders/hypochondriasis.
	 */
	public Integer getSomatoformdisorders_hypochondriasis(){
		return _Somatoformdisorders_hypochondriasis;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/hypochondriasis.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_hypochondriasis(Integer v) {
		_Somatoformdisorders_hypochondriasis=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/hypochondriasis.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_hypochondriasis(String v)  {
		_Somatoformdisorders_hypochondriasis=formatInteger(v);
	}

	//FIELD

	private Integer _Somatoformdisorders_bodydysmorphicdisorder=null;

	/**
	 * @return Returns the somatoformDisorders/bodyDysmorphicDisorder.
	 */
	public Integer getSomatoformdisorders_bodydysmorphicdisorder(){
		return _Somatoformdisorders_bodydysmorphicdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/bodyDysmorphicDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_bodydysmorphicdisorder(Integer v) {
		_Somatoformdisorders_bodydysmorphicdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/bodyDysmorphicDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_bodydysmorphicdisorder(String v)  {
		_Somatoformdisorders_bodydysmorphicdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_currentanorexianervosa=null;

	/**
	 * @return Returns the eatingDisorders/currentAnorexiaNervosa.
	 */
	public Integer getEatingdisorders_currentanorexianervosa(){
		return _Eatingdisorders_currentanorexianervosa;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentanorexianervosa(Integer v) {
		_Eatingdisorders_currentanorexianervosa=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentanorexianervosa(String v)  {
		_Eatingdisorders_currentanorexianervosa=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_pastanorexianervosa=null;

	/**
	 * @return Returns the eatingDisorders/pastAnorexiaNervosa.
	 */
	public Integer getEatingdisorders_pastanorexianervosa(){
		return _Eatingdisorders_pastanorexianervosa;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastanorexianervosa(Integer v) {
		_Eatingdisorders_pastanorexianervosa=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastanorexianervosa(String v)  {
		_Eatingdisorders_pastanorexianervosa=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_currentbulimianervosa=null;

	/**
	 * @return Returns the eatingDisorders/currentBulimiaNervosa.
	 */
	public Integer getEatingdisorders_currentbulimianervosa(){
		return _Eatingdisorders_currentbulimianervosa;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbulimianervosa(Integer v) {
		_Eatingdisorders_currentbulimianervosa=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbulimianervosa(String v)  {
		_Eatingdisorders_currentbulimianervosa=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_pastbulimianervosa=null;

	/**
	 * @return Returns the eatingDisorders/pastBulimiaNervosa.
	 */
	public Integer getEatingdisorders_pastbulimianervosa(){
		return _Eatingdisorders_pastbulimianervosa;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbulimianervosa(Integer v) {
		_Eatingdisorders_pastbulimianervosa=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbulimianervosa(String v)  {
		_Eatingdisorders_pastbulimianervosa=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_currentbingeeatingdisorder=null;

	/**
	 * @return Returns the eatingDisorders/currentBingeEatingDisorder.
	 */
	public Integer getEatingdisorders_currentbingeeatingdisorder(){
		return _Eatingdisorders_currentbingeeatingdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbingeeatingdisorder(Integer v) {
		_Eatingdisorders_currentbingeeatingdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbingeeatingdisorder(String v)  {
		_Eatingdisorders_currentbingeeatingdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Eatingdisorders_pastbingeeatingdisorder=null;

	/**
	 * @return Returns the eatingDisorders/pastBingeEatingDisorder.
	 */
	public Integer getEatingdisorders_pastbingeeatingdisorder(){
		return _Eatingdisorders_pastbingeeatingdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbingeeatingdisorder(Integer v) {
		_Eatingdisorders_pastbingeeatingdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbingeeatingdisorder(String v)  {
		_Eatingdisorders_pastbingeeatingdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Adjustmentdisorder=null;

	/**
	 * @return Returns the adjustmentDisorder.
	 */
	public Integer getAdjustmentdisorder(){
		return _Adjustmentdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/adjustmentDisorder.
	 * @param v Value to Set.
	 */
	public void setAdjustmentdisorder(Integer v) {
		_Adjustmentdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/adjustmentDisorder.
	 * @param v Value to Set.
	 */
	public void setAdjustmentdisorder(String v)  {
		_Adjustmentdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_currentacutestressdisorder=null;

	/**
	 * @return Returns the optional/currentAcuteStressDisorder.
	 */
	public Integer getOptional_currentacutestressdisorder(){
		return _Optional_currentacutestressdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentacutestressdisorder(Integer v) {
		_Optional_currentacutestressdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentacutestressdisorder(String v)  {
		_Optional_currentacutestressdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_pastacutestressdisorder=null;

	/**
	 * @return Returns the optional/pastAcuteStressDisorder.
	 */
	public Integer getOptional_pastacutestressdisorder(){
		return _Optional_pastacutestressdisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastacutestressdisorder(Integer v) {
		_Optional_pastacutestressdisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastacutestressdisorder(String v)  {
		_Optional_pastacutestressdisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_currentminordepressivedisorder=null;

	/**
	 * @return Returns the optional/currentMinorDepressiveDisorder.
	 */
	public Integer getOptional_currentminordepressivedisorder(){
		return _Optional_currentminordepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentminordepressivedisorder(Integer v) {
		_Optional_currentminordepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentminordepressivedisorder(String v)  {
		_Optional_currentminordepressivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_pastminordepressivedisorder=null;

	/**
	 * @return Returns the optional/pastMinorDepressiveDisorder.
	 */
	public Integer getOptional_pastminordepressivedisorder(){
		return _Optional_pastminordepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastminordepressivedisorder(Integer v) {
		_Optional_pastminordepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastminordepressivedisorder(String v)  {
		_Optional_pastminordepressivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_currentmixedanxietydepressivedisorder=null;

	/**
	 * @return Returns the optional/currentMixedAnxietyDepressiveDisorder.
	 */
	public Integer getOptional_currentmixedanxietydepressivedisorder(){
		return _Optional_currentmixedanxietydepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentmixedanxietydepressivedisorder(Integer v) {
		_Optional_currentmixedanxietydepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentmixedanxietydepressivedisorder(String v)  {
		_Optional_currentmixedanxietydepressivedisorder=formatInteger(v);
	}

	//FIELD

	private Integer _Optional_pastmixedanxietydepressivedisorder=null;

	/**
	 * @return Returns the optional/pastMixedAnxietyDepressiveDisorder.
	 */
	public Integer getOptional_pastmixedanxietydepressivedisorder(){
		return _Optional_pastmixedanxietydepressivedisorder;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastmixedanxietydepressivedisorder(Integer v) {
		_Optional_pastmixedanxietydepressivedisorder=v;
	}

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastmixedanxietydepressivedisorder(String v)  {
		_Optional_pastmixedanxietydepressivedisorder=formatInteger(v);
	}

	//FIELD

	private String _Optional_pastsympomaticdetails=null;

	/**
	 * @return Returns the optional/pastSympomaticDetails.
	 */
	public String getOptional_pastsympomaticdetails(){
		return _Optional_pastsympomaticdetails;
	}

	/**
	 * Sets the value for optional/pastSympomaticDetails.
	 * @param v Value to Set.
	 */
	public void setOptional_pastsympomaticdetails(String v){
		_Optional_pastsympomaticdetails=v;
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("administrator")){
			setAdministrator(v);
		}else if (xmlPath.equals("moodEpisodes/currentMajorDepressiveEpisode")){
			setMoodepisodes_currentmajordepressiveepisode(v);
		}else if (xmlPath.equals("moodEpisodes/pastMajorDepressiveEpisode")){
			setMoodepisodes_pastmajordepressiveepisode(v);
		}else if (xmlPath.equals("moodEpisodes/currentManicEpisode")){
			setMoodepisodes_currentmanicepisode(v);
		}else if (xmlPath.equals("moodEpisodes/pastManicEpisode")){
			setMoodepisodes_pastmanicepisode(v);
		}else if (xmlPath.equals("moodEpisodes/currentHypomanicEpisode")){
			setMoodepisodes_currenthypomanicepisode(v);
		}else if (xmlPath.equals("moodEpisodes/pastHypomanicEpisode")){
			setMoodepisodes_pasthypomanicepisode(v);
		}else if (xmlPath.equals("moodEpisodes/currentDysthmicEpisode")){
			setMoodepisodes_currentdysthmicepisode(v);
		}else if (xmlPath.equals("moodEpisodes/currentMoodDisorderDueToMedicalCondition")){
			setMoodepisodes_currentmooddisorderduetomedicalcondition(v);
		}else if (xmlPath.equals("moodEpisodes/pastMoodDisorderDueToMedicalCondition")){
			setMoodepisodes_pastmooddisorderduetomedicalcondition(v);
		}else if (xmlPath.equals("moodEpisodes/currentSubstanceInducedMoodDisorder")){
			setMoodepisodes_currentsubstanceinducedmooddisorder(v);
		}else if (xmlPath.equals("moodEpisodes/pastSubstanceInducedMoodDisorder")){
			setMoodepisodes_pastsubstanceinducedmooddisorder(v);
		}else if (xmlPath.equals("psychoticSymptoms/currentDelusions")){
			setPsychoticsymptoms_currentdelusions(v);
		}else if (xmlPath.equals("psychoticSymptoms/pastDelusions")){
			setPsychoticsymptoms_pastdelusions(v);
		}else if (xmlPath.equals("psychoticSymptoms/currentHallucinations")){
			setPsychoticsymptoms_currenthallucinations(v);
		}else if (xmlPath.equals("psychoticSymptoms/pastHallucinations")){
			setPsychoticsymptoms_pasthallucinations(v);
		}else if (xmlPath.equals("psychoticSymptoms/currentDisorganizedSpeechBehavior")){
			setPsychoticsymptoms_currentdisorganizedspeechbehavior(v);
		}else if (xmlPath.equals("psychoticSymptoms/pastDisorganizedSpeechBehavior")){
			setPsychoticsymptoms_pastdisorganizedspeechbehavior(v);
		}else if (xmlPath.equals("psychoticSymptoms/currentCatatonicBehavior")){
			setPsychoticsymptoms_currentcatatonicbehavior(v);
		}else if (xmlPath.equals("psychoticSymptoms/pastCatatonicBehavior")){
			setPsychoticsymptoms_pastcatatonicbehavior(v);
		}else if (xmlPath.equals("psychoticSymptoms/currentNegativeSymptoms")){
			setPsychoticsymptoms_currentnegativesymptoms(v);
		}else if (xmlPath.equals("psychoticSymptoms/pastNegativeSymptoms")){
			setPsychoticsymptoms_pastnegativesymptoms(v);
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophrenia")){
			setPsychoticdisorders_currentschizophrenia(v);
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophrenia")){
			setPsychoticdisorders_pastschizophrenia(v);
		}else if (xmlPath.equals("psychoticDisorders/currentParanoidType")){
			setPsychoticdisorders_currentparanoidtype(v);
		}else if (xmlPath.equals("psychoticDisorders/pastParanoidType")){
			setPsychoticdisorders_pastparanoidtype(v);
		}else if (xmlPath.equals("psychoticDisorders/currentCatatonicType")){
			setPsychoticdisorders_currentcatatonictype(v);
		}else if (xmlPath.equals("psychoticDisorders/pastCatatonicType")){
			setPsychoticdisorders_pastcatatonictype(v);
		}else if (xmlPath.equals("psychoticDisorders/currentDisorganizedType")){
			setPsychoticdisorders_currentdisorganizedtype(v);
		}else if (xmlPath.equals("psychoticDisorders/pastDisorganizedType")){
			setPsychoticdisorders_pastdisorganizedtype(v);
		}else if (xmlPath.equals("psychoticDisorders/currentUndifferentiatedType")){
			setPsychoticdisorders_currentundifferentiatedtype(v);
		}else if (xmlPath.equals("psychoticDisorders/pastUndifferentiatedType")){
			setPsychoticdisorders_pastundifferentiatedtype(v);
		}else if (xmlPath.equals("psychoticDisorders/currentResidualType")){
			setPsychoticdisorders_currentresidualtype(v);
		}else if (xmlPath.equals("psychoticDisorders/pastResidualType")){
			setPsychoticdisorders_pastresidualtype(v);
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophreniformDisorder")){
			setPsychoticdisorders_currentschizophreniformdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophreniformDisorder")){
			setPsychoticdisorders_pastschizophreniformdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/currentSchizoaffectiveDisorder")){
			setPsychoticdisorders_currentschizoaffectivedisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/pastSchizoaffectiveDisorder")){
			setPsychoticdisorders_pastschizoaffectivedisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/currentDelusionalDisorder")){
			setPsychoticdisorders_currentdelusionaldisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/pastDelusionalDisorder")){
			setPsychoticdisorders_pastdelusionaldisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/currentBriefPsychoticDisorder")){
			setPsychoticdisorders_currentbriefpsychoticdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/pastBriefPsychoticDisorder")){
			setPsychoticdisorders_pastbriefpsychoticdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition")){
			setPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition(v);
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition")){
			setPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition(v);
		}else if (xmlPath.equals("psychoticDisorders/currentSubstanceInducedPsychoticDisorder")){
			setPsychoticdisorders_currentsubstanceinducedpsychoticdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/pastSubstanceInducedPsychoticDisorder")){
			setPsychoticdisorders_pastsubstanceinducedpsychoticdisorder(v);
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderNOS")){
			setPsychoticdisorders_currentpsychoticdisordernos(v);
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderNOS")){
			setPsychoticdisorders_pastpsychoticdisordernos(v);
		}else if (xmlPath.equals("moodDisorders/currentBipolar1Disorder")){
			setMooddisorders_currentbipolar1disorder(v);
		}else if (xmlPath.equals("moodDisorders/pastBipolar1Disorder")){
			setMooddisorders_pastbipolar1disorder(v);
		}else if (xmlPath.equals("moodDisorders/currentBipolar2Disorder")){
			setMooddisorders_currentbipolar2disorder(v);
		}else if (xmlPath.equals("moodDisorders/pastBipolar2Disorder")){
			setMooddisorders_pastbipolar2disorder(v);
		}else if (xmlPath.equals("moodDisorders/currentOtherBipolarDisorder")){
			setMooddisorders_currentotherbipolardisorder(v);
		}else if (xmlPath.equals("moodDisorders/pastOtherBipolarDisorder")){
			setMooddisorders_pastotherbipolardisorder(v);
		}else if (xmlPath.equals("moodDisorders/currentMajorDepressiveDisorder")){
			setMooddisorders_currentmajordepressivedisorder(v);
		}else if (xmlPath.equals("moodDisorders/pastMajorDepressiveDisorder")){
			setMooddisorders_pastmajordepressivedisorder(v);
		}else if (xmlPath.equals("moodDisorders/currentDepressiveDisorderNOS")){
			setMooddisorders_currentdepressivedisordernos(v);
		}else if (xmlPath.equals("moodDisorders/pastDepressiveDisorderNOS")){
			setMooddisorders_pastdepressivedisordernos(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholDependence")){
			setSubstanceusedisorders_currentalcoholdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholDependence")){
			setSubstanceusedisorders_pastalcoholdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholAbuse")){
			setSubstanceusedisorders_currentalcoholabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholAbuse")){
			setSubstanceusedisorders_pastalcoholabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineDependence")){
			setSubstanceusedisorders_currentamphetaminedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineDependence")){
			setSubstanceusedisorders_pastamphetaminedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineAbuse")){
			setSubstanceusedisorders_currentamphetamineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineAbuse")){
			setSubstanceusedisorders_pastamphetamineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisDependence")){
			setSubstanceusedisorders_currentcannabisdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisDependence")){
			setSubstanceusedisorders_pastcannabisdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisAbuse")){
			setSubstanceusedisorders_currentcannabisabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisAbuse")){
			setSubstanceusedisorders_pastcannabisabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineDependence")){
			setSubstanceusedisorders_currentcocainedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineDependence")){
			setSubstanceusedisorders_pastcocainedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineAbuse")){
			setSubstanceusedisorders_currentcocaineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineAbuse")){
			setSubstanceusedisorders_pastcocaineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenDependence")){
			setSubstanceusedisorders_currenthallucinogendependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenDependence")){
			setSubstanceusedisorders_pasthallucinogendependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenAbuse")){
			setSubstanceusedisorders_currenthallucinogenabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenAbuse")){
			setSubstanceusedisorders_pasthallucinogenabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidDependence")){
			setSubstanceusedisorders_currentopioiddependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidDependence")){
			setSubstanceusedisorders_pastopioiddependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidAbuse")){
			setSubstanceusedisorders_currentopioidabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidAbuse")){
			setSubstanceusedisorders_pastopioidabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineDependence")){
			setSubstanceusedisorders_currentphencyclidinedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineDependence")){
			setSubstanceusedisorders_pastphencyclidinedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineAbuse")){
			setSubstanceusedisorders_currentphencyclidineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineAbuse")){
			setSubstanceusedisorders_pastphencyclidineabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence")){
			setSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence")){
			setSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse")){
			setSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse")){
			setSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentPolysubstanceDependence")){
			setSubstanceusedisorders_currentpolysubstancedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastPolysubstanceDependence")){
			setSubstanceusedisorders_pastpolysubstancedependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownDependence")){
			setSubstanceusedisorders_currentotherorunknowndependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownDependence")){
			setSubstanceusedisorders_pastotherorunknowndependence(v);
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownAbuse")){
			setSubstanceusedisorders_currentotherorunknownabuse(v);
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownAbuse")){
			setSubstanceusedisorders_pastotherorunknownabuse(v);
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithAgoraphobia")){
			setAnxietydisorders_currentpanicwithagoraphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithAgoraphobia")){
			setAnxietydisorders_pastpanicwithagoraphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithoutAgoraphobia")){
			setAnxietydisorders_currentpanicwithoutagoraphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithoutAgoraphobia")){
			setAnxietydisorders_pastpanicwithoutagoraphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/currentAgoraphobiaWithoutPanicHx")){
			setAnxietydisorders_currentagoraphobiawithoutpanichx(v);
		}else if (xmlPath.equals("anxietyDisorders/pastAgoraphobiaWithoutPanicHx")){
			setAnxietydisorders_pastagoraphobiawithoutpanichx(v);
		}else if (xmlPath.equals("anxietyDisorders/currentSocialPhobia")){
			setAnxietydisorders_currentsocialphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/pastSocialPhobia")){
			setAnxietydisorders_pastsocialphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/currentSpecificPhobia")){
			setAnxietydisorders_currentspecificphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/pastSpecificPhobia")){
			setAnxietydisorders_pastspecificphobia(v);
		}else if (xmlPath.equals("anxietyDisorders/currentOCD")){
			setAnxietydisorders_currentocd(v);
		}else if (xmlPath.equals("anxietyDisorders/pastOCD")){
			setAnxietydisorders_pastocd(v);
		}else if (xmlPath.equals("anxietyDisorders/currentPTSD")){
			setAnxietydisorders_currentptsd(v);
		}else if (xmlPath.equals("anxietyDisorders/pastPTSD")){
			setAnxietydisorders_pastptsd(v);
		}else if (xmlPath.equals("anxietyDisorders/currentGeneralizedAnxietyDisorder")){
			setAnxietydisorders_currentgeneralizedanxietydisorder(v);
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDueToMedicalCondition")){
			setAnxietydisorders_currentanxietyduetomedicalcondition(v);
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDueToMedicalCondition")){
			setAnxietydisorders_pastanxietyduetomedicalcondition(v);
		}else if (xmlPath.equals("anxietyDisorders/currentSubstanceInducedAnxietyDisorder")){
			setAnxietydisorders_currentsubstanceinducedanxietydisorder(v);
		}else if (xmlPath.equals("anxietyDisorders/pastSubstanceInducedAnxietyDisorder")){
			setAnxietydisorders_pastsubstanceinducedanxietydisorder(v);
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDisorderNOS")){
			setAnxietydisorders_currentanxietydisordernos(v);
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDisorderNOS")){
			setAnxietydisorders_pastanxietydisordernos(v);
		}else if (xmlPath.equals("somatoformDisorders/somatizationDisorder")){
			setSomatoformdisorders_somatizationdisorder(v);
		}else if (xmlPath.equals("somatoformDisorders/undifferentiatedSomatformDisorder")){
			setSomatoformdisorders_undifferentiatedsomatformdisorder(v);
		}else if (xmlPath.equals("somatoformDisorders/painDisorder")){
			setSomatoformdisorders_paindisorder(v);
		}else if (xmlPath.equals("somatoformDisorders/hypochondriasis")){
			setSomatoformdisorders_hypochondriasis(v);
		}else if (xmlPath.equals("somatoformDisorders/bodyDysmorphicDisorder")){
			setSomatoformdisorders_bodydysmorphicdisorder(v);
		}else if (xmlPath.equals("eatingDisorders/currentAnorexiaNervosa")){
			setEatingdisorders_currentanorexianervosa(v);
		}else if (xmlPath.equals("eatingDisorders/pastAnorexiaNervosa")){
			setEatingdisorders_pastanorexianervosa(v);
		}else if (xmlPath.equals("eatingDisorders/currentBulimiaNervosa")){
			setEatingdisorders_currentbulimianervosa(v);
		}else if (xmlPath.equals("eatingDisorders/pastBulimiaNervosa")){
			setEatingdisorders_pastbulimianervosa(v);
		}else if (xmlPath.equals("eatingDisorders/currentBingeEatingDisorder")){
			setEatingdisorders_currentbingeeatingdisorder(v);
		}else if (xmlPath.equals("eatingDisorders/pastBingeEatingDisorder")){
			setEatingdisorders_pastbingeeatingdisorder(v);
		}else if (xmlPath.equals("adjustmentDisorder")){
			setAdjustmentdisorder(v);
		}else if (xmlPath.equals("optional/currentAcuteStressDisorder")){
			setOptional_currentacutestressdisorder(v);
		}else if (xmlPath.equals("optional/pastAcuteStressDisorder")){
			setOptional_pastacutestressdisorder(v);
		}else if (xmlPath.equals("optional/currentMinorDepressiveDisorder")){
			setOptional_currentminordepressivedisorder(v);
		}else if (xmlPath.equals("optional/pastMinorDepressiveDisorder")){
			setOptional_pastminordepressivedisorder(v);
		}else if (xmlPath.equals("optional/currentMixedAnxietyDepressiveDisorder")){
			setOptional_currentmixedanxietydepressivedisorder(v);
		}else if (xmlPath.equals("optional/pastMixedAnxietyDepressiveDisorder")){
			setOptional_pastmixedanxietydepressivedisorder(v);
		}else if (xmlPath.equals("optional/pastSympomaticDetails")){
			setOptional_pastsympomaticdetails(v);
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
		if (xmlPath.equals("administrator")){
			return getAdministrator();
		}else if (xmlPath.equals("moodEpisodes/currentMajorDepressiveEpisode")){
			return getMoodepisodes_currentmajordepressiveepisode();
		}else if (xmlPath.equals("moodEpisodes/pastMajorDepressiveEpisode")){
			return getMoodepisodes_pastmajordepressiveepisode();
		}else if (xmlPath.equals("moodEpisodes/currentManicEpisode")){
			return getMoodepisodes_currentmanicepisode();
		}else if (xmlPath.equals("moodEpisodes/pastManicEpisode")){
			return getMoodepisodes_pastmanicepisode();
		}else if (xmlPath.equals("moodEpisodes/currentHypomanicEpisode")){
			return getMoodepisodes_currenthypomanicepisode();
		}else if (xmlPath.equals("moodEpisodes/pastHypomanicEpisode")){
			return getMoodepisodes_pasthypomanicepisode();
		}else if (xmlPath.equals("moodEpisodes/currentDysthmicEpisode")){
			return getMoodepisodes_currentdysthmicepisode();
		}else if (xmlPath.equals("moodEpisodes/currentMoodDisorderDueToMedicalCondition")){
			return getMoodepisodes_currentmooddisorderduetomedicalcondition();
		}else if (xmlPath.equals("moodEpisodes/pastMoodDisorderDueToMedicalCondition")){
			return getMoodepisodes_pastmooddisorderduetomedicalcondition();
		}else if (xmlPath.equals("moodEpisodes/currentSubstanceInducedMoodDisorder")){
			return getMoodepisodes_currentsubstanceinducedmooddisorder();
		}else if (xmlPath.equals("moodEpisodes/pastSubstanceInducedMoodDisorder")){
			return getMoodepisodes_pastsubstanceinducedmooddisorder();
		}else if (xmlPath.equals("psychoticSymptoms/currentDelusions")){
			return getPsychoticsymptoms_currentdelusions();
		}else if (xmlPath.equals("psychoticSymptoms/pastDelusions")){
			return getPsychoticsymptoms_pastdelusions();
		}else if (xmlPath.equals("psychoticSymptoms/currentHallucinations")){
			return getPsychoticsymptoms_currenthallucinations();
		}else if (xmlPath.equals("psychoticSymptoms/pastHallucinations")){
			return getPsychoticsymptoms_pasthallucinations();
		}else if (xmlPath.equals("psychoticSymptoms/currentDisorganizedSpeechBehavior")){
			return getPsychoticsymptoms_currentdisorganizedspeechbehavior();
		}else if (xmlPath.equals("psychoticSymptoms/pastDisorganizedSpeechBehavior")){
			return getPsychoticsymptoms_pastdisorganizedspeechbehavior();
		}else if (xmlPath.equals("psychoticSymptoms/currentCatatonicBehavior")){
			return getPsychoticsymptoms_currentcatatonicbehavior();
		}else if (xmlPath.equals("psychoticSymptoms/pastCatatonicBehavior")){
			return getPsychoticsymptoms_pastcatatonicbehavior();
		}else if (xmlPath.equals("psychoticSymptoms/currentNegativeSymptoms")){
			return getPsychoticsymptoms_currentnegativesymptoms();
		}else if (xmlPath.equals("psychoticSymptoms/pastNegativeSymptoms")){
			return getPsychoticsymptoms_pastnegativesymptoms();
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophrenia")){
			return getPsychoticdisorders_currentschizophrenia();
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophrenia")){
			return getPsychoticdisorders_pastschizophrenia();
		}else if (xmlPath.equals("psychoticDisorders/currentParanoidType")){
			return getPsychoticdisorders_currentparanoidtype();
		}else if (xmlPath.equals("psychoticDisorders/pastParanoidType")){
			return getPsychoticdisorders_pastparanoidtype();
		}else if (xmlPath.equals("psychoticDisorders/currentCatatonicType")){
			return getPsychoticdisorders_currentcatatonictype();
		}else if (xmlPath.equals("psychoticDisorders/pastCatatonicType")){
			return getPsychoticdisorders_pastcatatonictype();
		}else if (xmlPath.equals("psychoticDisorders/currentDisorganizedType")){
			return getPsychoticdisorders_currentdisorganizedtype();
		}else if (xmlPath.equals("psychoticDisorders/pastDisorganizedType")){
			return getPsychoticdisorders_pastdisorganizedtype();
		}else if (xmlPath.equals("psychoticDisorders/currentUndifferentiatedType")){
			return getPsychoticdisorders_currentundifferentiatedtype();
		}else if (xmlPath.equals("psychoticDisorders/pastUndifferentiatedType")){
			return getPsychoticdisorders_pastundifferentiatedtype();
		}else if (xmlPath.equals("psychoticDisorders/currentResidualType")){
			return getPsychoticdisorders_currentresidualtype();
		}else if (xmlPath.equals("psychoticDisorders/pastResidualType")){
			return getPsychoticdisorders_pastresidualtype();
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophreniformDisorder")){
			return getPsychoticdisorders_currentschizophreniformdisorder();
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophreniformDisorder")){
			return getPsychoticdisorders_pastschizophreniformdisorder();
		}else if (xmlPath.equals("psychoticDisorders/currentSchizoaffectiveDisorder")){
			return getPsychoticdisorders_currentschizoaffectivedisorder();
		}else if (xmlPath.equals("psychoticDisorders/pastSchizoaffectiveDisorder")){
			return getPsychoticdisorders_pastschizoaffectivedisorder();
		}else if (xmlPath.equals("psychoticDisorders/currentDelusionalDisorder")){
			return getPsychoticdisorders_currentdelusionaldisorder();
		}else if (xmlPath.equals("psychoticDisorders/pastDelusionalDisorder")){
			return getPsychoticdisorders_pastdelusionaldisorder();
		}else if (xmlPath.equals("psychoticDisorders/currentBriefPsychoticDisorder")){
			return getPsychoticdisorders_currentbriefpsychoticdisorder();
		}else if (xmlPath.equals("psychoticDisorders/pastBriefPsychoticDisorder")){
			return getPsychoticdisorders_pastbriefpsychoticdisorder();
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition")){
			return getPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition();
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition")){
			return getPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition();
		}else if (xmlPath.equals("psychoticDisorders/currentSubstanceInducedPsychoticDisorder")){
			return getPsychoticdisorders_currentsubstanceinducedpsychoticdisorder();
		}else if (xmlPath.equals("psychoticDisorders/pastSubstanceInducedPsychoticDisorder")){
			return getPsychoticdisorders_pastsubstanceinducedpsychoticdisorder();
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderNOS")){
			return getPsychoticdisorders_currentpsychoticdisordernos();
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderNOS")){
			return getPsychoticdisorders_pastpsychoticdisordernos();
		}else if (xmlPath.equals("moodDisorders/currentBipolar1Disorder")){
			return getMooddisorders_currentbipolar1disorder();
		}else if (xmlPath.equals("moodDisorders/pastBipolar1Disorder")){
			return getMooddisorders_pastbipolar1disorder();
		}else if (xmlPath.equals("moodDisorders/currentBipolar2Disorder")){
			return getMooddisorders_currentbipolar2disorder();
		}else if (xmlPath.equals("moodDisorders/pastBipolar2Disorder")){
			return getMooddisorders_pastbipolar2disorder();
		}else if (xmlPath.equals("moodDisorders/currentOtherBipolarDisorder")){
			return getMooddisorders_currentotherbipolardisorder();
		}else if (xmlPath.equals("moodDisorders/pastOtherBipolarDisorder")){
			return getMooddisorders_pastotherbipolardisorder();
		}else if (xmlPath.equals("moodDisorders/currentMajorDepressiveDisorder")){
			return getMooddisorders_currentmajordepressivedisorder();
		}else if (xmlPath.equals("moodDisorders/pastMajorDepressiveDisorder")){
			return getMooddisorders_pastmajordepressivedisorder();
		}else if (xmlPath.equals("moodDisorders/currentDepressiveDisorderNOS")){
			return getMooddisorders_currentdepressivedisordernos();
		}else if (xmlPath.equals("moodDisorders/pastDepressiveDisorderNOS")){
			return getMooddisorders_pastdepressivedisordernos();
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholDependence")){
			return getSubstanceusedisorders_currentalcoholdependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholDependence")){
			return getSubstanceusedisorders_pastalcoholdependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholAbuse")){
			return getSubstanceusedisorders_currentalcoholabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholAbuse")){
			return getSubstanceusedisorders_pastalcoholabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineDependence")){
			return getSubstanceusedisorders_currentamphetaminedependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineDependence")){
			return getSubstanceusedisorders_pastamphetaminedependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineAbuse")){
			return getSubstanceusedisorders_currentamphetamineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineAbuse")){
			return getSubstanceusedisorders_pastamphetamineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisDependence")){
			return getSubstanceusedisorders_currentcannabisdependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisDependence")){
			return getSubstanceusedisorders_pastcannabisdependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisAbuse")){
			return getSubstanceusedisorders_currentcannabisabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisAbuse")){
			return getSubstanceusedisorders_pastcannabisabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineDependence")){
			return getSubstanceusedisorders_currentcocainedependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineDependence")){
			return getSubstanceusedisorders_pastcocainedependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineAbuse")){
			return getSubstanceusedisorders_currentcocaineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineAbuse")){
			return getSubstanceusedisorders_pastcocaineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenDependence")){
			return getSubstanceusedisorders_currenthallucinogendependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenDependence")){
			return getSubstanceusedisorders_pasthallucinogendependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenAbuse")){
			return getSubstanceusedisorders_currenthallucinogenabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenAbuse")){
			return getSubstanceusedisorders_pasthallucinogenabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidDependence")){
			return getSubstanceusedisorders_currentopioiddependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidDependence")){
			return getSubstanceusedisorders_pastopioiddependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidAbuse")){
			return getSubstanceusedisorders_currentopioidabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidAbuse")){
			return getSubstanceusedisorders_pastopioidabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineDependence")){
			return getSubstanceusedisorders_currentphencyclidinedependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineDependence")){
			return getSubstanceusedisorders_pastphencyclidinedependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineAbuse")){
			return getSubstanceusedisorders_currentphencyclidineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineAbuse")){
			return getSubstanceusedisorders_pastphencyclidineabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence")){
			return getSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence")){
			return getSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse")){
			return getSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse")){
			return getSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse();
		}else if (xmlPath.equals("substanceUseDisorders/currentPolysubstanceDependence")){
			return getSubstanceusedisorders_currentpolysubstancedependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastPolysubstanceDependence")){
			return getSubstanceusedisorders_pastpolysubstancedependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownDependence")){
			return getSubstanceusedisorders_currentotherorunknowndependence();
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownDependence")){
			return getSubstanceusedisorders_pastotherorunknowndependence();
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownAbuse")){
			return getSubstanceusedisorders_currentotherorunknownabuse();
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownAbuse")){
			return getSubstanceusedisorders_pastotherorunknownabuse();
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithAgoraphobia")){
			return getAnxietydisorders_currentpanicwithagoraphobia();
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithAgoraphobia")){
			return getAnxietydisorders_pastpanicwithagoraphobia();
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithoutAgoraphobia")){
			return getAnxietydisorders_currentpanicwithoutagoraphobia();
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithoutAgoraphobia")){
			return getAnxietydisorders_pastpanicwithoutagoraphobia();
		}else if (xmlPath.equals("anxietyDisorders/currentAgoraphobiaWithoutPanicHx")){
			return getAnxietydisorders_currentagoraphobiawithoutpanichx();
		}else if (xmlPath.equals("anxietyDisorders/pastAgoraphobiaWithoutPanicHx")){
			return getAnxietydisorders_pastagoraphobiawithoutpanichx();
		}else if (xmlPath.equals("anxietyDisorders/currentSocialPhobia")){
			return getAnxietydisorders_currentsocialphobia();
		}else if (xmlPath.equals("anxietyDisorders/pastSocialPhobia")){
			return getAnxietydisorders_pastsocialphobia();
		}else if (xmlPath.equals("anxietyDisorders/currentSpecificPhobia")){
			return getAnxietydisorders_currentspecificphobia();
		}else if (xmlPath.equals("anxietyDisorders/pastSpecificPhobia")){
			return getAnxietydisorders_pastspecificphobia();
		}else if (xmlPath.equals("anxietyDisorders/currentOCD")){
			return getAnxietydisorders_currentocd();
		}else if (xmlPath.equals("anxietyDisorders/pastOCD")){
			return getAnxietydisorders_pastocd();
		}else if (xmlPath.equals("anxietyDisorders/currentPTSD")){
			return getAnxietydisorders_currentptsd();
		}else if (xmlPath.equals("anxietyDisorders/pastPTSD")){
			return getAnxietydisorders_pastptsd();
		}else if (xmlPath.equals("anxietyDisorders/currentGeneralizedAnxietyDisorder")){
			return getAnxietydisorders_currentgeneralizedanxietydisorder();
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDueToMedicalCondition")){
			return getAnxietydisorders_currentanxietyduetomedicalcondition();
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDueToMedicalCondition")){
			return getAnxietydisorders_pastanxietyduetomedicalcondition();
		}else if (xmlPath.equals("anxietyDisorders/currentSubstanceInducedAnxietyDisorder")){
			return getAnxietydisorders_currentsubstanceinducedanxietydisorder();
		}else if (xmlPath.equals("anxietyDisorders/pastSubstanceInducedAnxietyDisorder")){
			return getAnxietydisorders_pastsubstanceinducedanxietydisorder();
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDisorderNOS")){
			return getAnxietydisorders_currentanxietydisordernos();
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDisorderNOS")){
			return getAnxietydisorders_pastanxietydisordernos();
		}else if (xmlPath.equals("somatoformDisorders/somatizationDisorder")){
			return getSomatoformdisorders_somatizationdisorder();
		}else if (xmlPath.equals("somatoformDisorders/undifferentiatedSomatformDisorder")){
			return getSomatoformdisorders_undifferentiatedsomatformdisorder();
		}else if (xmlPath.equals("somatoformDisorders/painDisorder")){
			return getSomatoformdisorders_paindisorder();
		}else if (xmlPath.equals("somatoformDisorders/hypochondriasis")){
			return getSomatoformdisorders_hypochondriasis();
		}else if (xmlPath.equals("somatoformDisorders/bodyDysmorphicDisorder")){
			return getSomatoformdisorders_bodydysmorphicdisorder();
		}else if (xmlPath.equals("eatingDisorders/currentAnorexiaNervosa")){
			return getEatingdisorders_currentanorexianervosa();
		}else if (xmlPath.equals("eatingDisorders/pastAnorexiaNervosa")){
			return getEatingdisorders_pastanorexianervosa();
		}else if (xmlPath.equals("eatingDisorders/currentBulimiaNervosa")){
			return getEatingdisorders_currentbulimianervosa();
		}else if (xmlPath.equals("eatingDisorders/pastBulimiaNervosa")){
			return getEatingdisorders_pastbulimianervosa();
		}else if (xmlPath.equals("eatingDisorders/currentBingeEatingDisorder")){
			return getEatingdisorders_currentbingeeatingdisorder();
		}else if (xmlPath.equals("eatingDisorders/pastBingeEatingDisorder")){
			return getEatingdisorders_pastbingeeatingdisorder();
		}else if (xmlPath.equals("adjustmentDisorder")){
			return getAdjustmentdisorder();
		}else if (xmlPath.equals("optional/currentAcuteStressDisorder")){
			return getOptional_currentacutestressdisorder();
		}else if (xmlPath.equals("optional/pastAcuteStressDisorder")){
			return getOptional_pastacutestressdisorder();
		}else if (xmlPath.equals("optional/currentMinorDepressiveDisorder")){
			return getOptional_currentminordepressivedisorder();
		}else if (xmlPath.equals("optional/pastMinorDepressiveDisorder")){
			return getOptional_pastminordepressivedisorder();
		}else if (xmlPath.equals("optional/currentMixedAnxietyDepressiveDisorder")){
			return getOptional_currentmixedanxietydepressivedisorder();
		}else if (xmlPath.equals("optional/pastMixedAnxietyDepressiveDisorder")){
			return getOptional_pastmixedanxietydepressivedisorder();
		}else if (xmlPath.equals("optional/pastSympomaticDetails")){
			return getOptional_pastsympomaticdetails();
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
		if (xmlPath.equals("administrator")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentMajorDepressiveEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/pastMajorDepressiveEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentManicEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/pastManicEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentHypomanicEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/pastHypomanicEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentDysthmicEpisode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentMoodDisorderDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/pastMoodDisorderDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/currentSubstanceInducedMoodDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodEpisodes/pastSubstanceInducedMoodDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/currentDelusions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/pastDelusions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/currentHallucinations")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/pastHallucinations")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/currentDisorganizedSpeechBehavior")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/pastDisorganizedSpeechBehavior")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/currentCatatonicBehavior")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/pastCatatonicBehavior")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/currentNegativeSymptoms")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticSymptoms/pastNegativeSymptoms")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophrenia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophrenia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentParanoidType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastParanoidType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentCatatonicType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastCatatonicType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentDisorganizedType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastDisorganizedType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentUndifferentiatedType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastUndifferentiatedType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentResidualType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastResidualType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentSchizophreniformDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastSchizophreniformDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentSchizoaffectiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastSchizoaffectiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentDelusionalDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastDelusionalDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentBriefPsychoticDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastBriefPsychoticDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentSubstanceInducedPsychoticDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastSubstanceInducedPsychoticDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/currentPsychoticDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("psychoticDisorders/pastPsychoticDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/currentBipolar1Disorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/pastBipolar1Disorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/currentBipolar2Disorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/pastBipolar2Disorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/currentOtherBipolarDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/pastOtherBipolarDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/currentMajorDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/pastMajorDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/currentDepressiveDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("moodDisorders/pastDepressiveDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentAlcoholAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastAlcoholAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentAmphetamineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastAmphetamineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentCannabisAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastCannabisAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentCocaineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastCocaineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentHallucinogenAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastHallucinogenAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentOpioidAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastOpioidAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentPhencyclidineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastPhencyclidineAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentPolysubstanceDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastPolysubstanceDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownDependence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/currentOtherOrUnknownAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("substanceUseDisorders/pastOtherOrUnknownAbuse")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithAgoraphobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithAgoraphobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentPanicWithoutAgoraphobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastPanicWithoutAgoraphobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentAgoraphobiaWithoutPanicHx")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastAgoraphobiaWithoutPanicHx")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentSocialPhobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastSocialPhobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentSpecificPhobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastSpecificPhobia")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentOCD")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastOCD")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentPTSD")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastPTSD")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentGeneralizedAnxietyDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDueToMedicalCondition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentSubstanceInducedAnxietyDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastSubstanceInducedAnxietyDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/currentAnxietyDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("anxietyDisorders/pastAnxietyDisorderNOS")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("somatoformDisorders/somatizationDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("somatoformDisorders/undifferentiatedSomatformDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("somatoformDisorders/painDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("somatoformDisorders/hypochondriasis")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("somatoformDisorders/bodyDysmorphicDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/currentAnorexiaNervosa")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/pastAnorexiaNervosa")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/currentBulimiaNervosa")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/pastBulimiaNervosa")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/currentBingeEatingDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("eatingDisorders/pastBingeEatingDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("adjustmentDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/currentAcuteStressDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/pastAcuteStressDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/currentMinorDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/pastMinorDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/currentMixedAnxietyDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/pastMixedAnxietyDepressiveDisorder")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("optional/pastSympomaticDetails")){
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
		all_fields.add("administrator");
		all_fields.add("moodEpisodes/currentMajorDepressiveEpisode");
		all_fields.add("moodEpisodes/pastMajorDepressiveEpisode");
		all_fields.add("moodEpisodes/currentManicEpisode");
		all_fields.add("moodEpisodes/pastManicEpisode");
		all_fields.add("moodEpisodes/currentHypomanicEpisode");
		all_fields.add("moodEpisodes/pastHypomanicEpisode");
		all_fields.add("moodEpisodes/currentDysthmicEpisode");
		all_fields.add("moodEpisodes/currentMoodDisorderDueToMedicalCondition");
		all_fields.add("moodEpisodes/pastMoodDisorderDueToMedicalCondition");
		all_fields.add("moodEpisodes/currentSubstanceInducedMoodDisorder");
		all_fields.add("moodEpisodes/pastSubstanceInducedMoodDisorder");
		all_fields.add("psychoticSymptoms/currentDelusions");
		all_fields.add("psychoticSymptoms/pastDelusions");
		all_fields.add("psychoticSymptoms/currentHallucinations");
		all_fields.add("psychoticSymptoms/pastHallucinations");
		all_fields.add("psychoticSymptoms/currentDisorganizedSpeechBehavior");
		all_fields.add("psychoticSymptoms/pastDisorganizedSpeechBehavior");
		all_fields.add("psychoticSymptoms/currentCatatonicBehavior");
		all_fields.add("psychoticSymptoms/pastCatatonicBehavior");
		all_fields.add("psychoticSymptoms/currentNegativeSymptoms");
		all_fields.add("psychoticSymptoms/pastNegativeSymptoms");
		all_fields.add("psychoticDisorders/currentSchizophrenia");
		all_fields.add("psychoticDisorders/pastSchizophrenia");
		all_fields.add("psychoticDisorders/currentParanoidType");
		all_fields.add("psychoticDisorders/pastParanoidType");
		all_fields.add("psychoticDisorders/currentCatatonicType");
		all_fields.add("psychoticDisorders/pastCatatonicType");
		all_fields.add("psychoticDisorders/currentDisorganizedType");
		all_fields.add("psychoticDisorders/pastDisorganizedType");
		all_fields.add("psychoticDisorders/currentUndifferentiatedType");
		all_fields.add("psychoticDisorders/pastUndifferentiatedType");
		all_fields.add("psychoticDisorders/currentResidualType");
		all_fields.add("psychoticDisorders/pastResidualType");
		all_fields.add("psychoticDisorders/currentSchizophreniformDisorder");
		all_fields.add("psychoticDisorders/pastSchizophreniformDisorder");
		all_fields.add("psychoticDisorders/currentSchizoaffectiveDisorder");
		all_fields.add("psychoticDisorders/pastSchizoaffectiveDisorder");
		all_fields.add("psychoticDisorders/currentDelusionalDisorder");
		all_fields.add("psychoticDisorders/pastDelusionalDisorder");
		all_fields.add("psychoticDisorders/currentBriefPsychoticDisorder");
		all_fields.add("psychoticDisorders/pastBriefPsychoticDisorder");
		all_fields.add("psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition");
		all_fields.add("psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition");
		all_fields.add("psychoticDisorders/currentSubstanceInducedPsychoticDisorder");
		all_fields.add("psychoticDisorders/pastSubstanceInducedPsychoticDisorder");
		all_fields.add("psychoticDisorders/currentPsychoticDisorderNOS");
		all_fields.add("psychoticDisorders/pastPsychoticDisorderNOS");
		all_fields.add("moodDisorders/currentBipolar1Disorder");
		all_fields.add("moodDisorders/pastBipolar1Disorder");
		all_fields.add("moodDisorders/currentBipolar2Disorder");
		all_fields.add("moodDisorders/pastBipolar2Disorder");
		all_fields.add("moodDisorders/currentOtherBipolarDisorder");
		all_fields.add("moodDisorders/pastOtherBipolarDisorder");
		all_fields.add("moodDisorders/currentMajorDepressiveDisorder");
		all_fields.add("moodDisorders/pastMajorDepressiveDisorder");
		all_fields.add("moodDisorders/currentDepressiveDisorderNOS");
		all_fields.add("moodDisorders/pastDepressiveDisorderNOS");
		all_fields.add("substanceUseDisorders/currentAlcoholDependence");
		all_fields.add("substanceUseDisorders/pastAlcoholDependence");
		all_fields.add("substanceUseDisorders/currentAlcoholAbuse");
		all_fields.add("substanceUseDisorders/pastAlcoholAbuse");
		all_fields.add("substanceUseDisorders/currentAmphetamineDependence");
		all_fields.add("substanceUseDisorders/pastAmphetamineDependence");
		all_fields.add("substanceUseDisorders/currentAmphetamineAbuse");
		all_fields.add("substanceUseDisorders/pastAmphetamineAbuse");
		all_fields.add("substanceUseDisorders/currentCannabisDependence");
		all_fields.add("substanceUseDisorders/pastCannabisDependence");
		all_fields.add("substanceUseDisorders/currentCannabisAbuse");
		all_fields.add("substanceUseDisorders/pastCannabisAbuse");
		all_fields.add("substanceUseDisorders/currentCocaineDependence");
		all_fields.add("substanceUseDisorders/pastCocaineDependence");
		all_fields.add("substanceUseDisorders/currentCocaineAbuse");
		all_fields.add("substanceUseDisorders/pastCocaineAbuse");
		all_fields.add("substanceUseDisorders/currentHallucinogenDependence");
		all_fields.add("substanceUseDisorders/pastHallucinogenDependence");
		all_fields.add("substanceUseDisorders/currentHallucinogenAbuse");
		all_fields.add("substanceUseDisorders/pastHallucinogenAbuse");
		all_fields.add("substanceUseDisorders/currentOpioidDependence");
		all_fields.add("substanceUseDisorders/pastOpioidDependence");
		all_fields.add("substanceUseDisorders/currentOpioidAbuse");
		all_fields.add("substanceUseDisorders/pastOpioidAbuse");
		all_fields.add("substanceUseDisorders/currentPhencyclidineDependence");
		all_fields.add("substanceUseDisorders/pastPhencyclidineDependence");
		all_fields.add("substanceUseDisorders/currentPhencyclidineAbuse");
		all_fields.add("substanceUseDisorders/pastPhencyclidineAbuse");
		all_fields.add("substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence");
		all_fields.add("substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence");
		all_fields.add("substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse");
		all_fields.add("substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse");
		all_fields.add("substanceUseDisorders/currentPolysubstanceDependence");
		all_fields.add("substanceUseDisorders/pastPolysubstanceDependence");
		all_fields.add("substanceUseDisorders/currentOtherOrUnknownDependence");
		all_fields.add("substanceUseDisorders/pastOtherOrUnknownDependence");
		all_fields.add("substanceUseDisorders/currentOtherOrUnknownAbuse");
		all_fields.add("substanceUseDisorders/pastOtherOrUnknownAbuse");
		all_fields.add("anxietyDisorders/currentPanicWithAgoraphobia");
		all_fields.add("anxietyDisorders/pastPanicWithAgoraphobia");
		all_fields.add("anxietyDisorders/currentPanicWithoutAgoraphobia");
		all_fields.add("anxietyDisorders/pastPanicWithoutAgoraphobia");
		all_fields.add("anxietyDisorders/currentAgoraphobiaWithoutPanicHx");
		all_fields.add("anxietyDisorders/pastAgoraphobiaWithoutPanicHx");
		all_fields.add("anxietyDisorders/currentSocialPhobia");
		all_fields.add("anxietyDisorders/pastSocialPhobia");
		all_fields.add("anxietyDisorders/currentSpecificPhobia");
		all_fields.add("anxietyDisorders/pastSpecificPhobia");
		all_fields.add("anxietyDisorders/currentOCD");
		all_fields.add("anxietyDisorders/pastOCD");
		all_fields.add("anxietyDisorders/currentPTSD");
		all_fields.add("anxietyDisorders/pastPTSD");
		all_fields.add("anxietyDisorders/currentGeneralizedAnxietyDisorder");
		all_fields.add("anxietyDisorders/currentAnxietyDueToMedicalCondition");
		all_fields.add("anxietyDisorders/pastAnxietyDueToMedicalCondition");
		all_fields.add("anxietyDisorders/currentSubstanceInducedAnxietyDisorder");
		all_fields.add("anxietyDisorders/pastSubstanceInducedAnxietyDisorder");
		all_fields.add("anxietyDisorders/currentAnxietyDisorderNOS");
		all_fields.add("anxietyDisorders/pastAnxietyDisorderNOS");
		all_fields.add("somatoformDisorders/somatizationDisorder");
		all_fields.add("somatoformDisorders/undifferentiatedSomatformDisorder");
		all_fields.add("somatoformDisorders/painDisorder");
		all_fields.add("somatoformDisorders/hypochondriasis");
		all_fields.add("somatoformDisorders/bodyDysmorphicDisorder");
		all_fields.add("eatingDisorders/currentAnorexiaNervosa");
		all_fields.add("eatingDisorders/pastAnorexiaNervosa");
		all_fields.add("eatingDisorders/currentBulimiaNervosa");
		all_fields.add("eatingDisorders/pastBulimiaNervosa");
		all_fields.add("eatingDisorders/currentBingeEatingDisorder");
		all_fields.add("eatingDisorders/pastBingeEatingDisorder");
		all_fields.add("adjustmentDisorder");
		all_fields.add("optional/currentAcuteStressDisorder");
		all_fields.add("optional/pastAcuteStressDisorder");
		all_fields.add("optional/currentMinorDepressiveDisorder");
		all_fields.add("optional/pastMinorDepressiveDisorder");
		all_fields.add("optional/currentMixedAnxietyDepressiveDisorder");
		all_fields.add("optional/pastMixedAnxietyDepressiveDisorder");
		all_fields.add("optional/pastSympomaticDetails");
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
		writer.write("\n<xnat_a:SCID");
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
		writer.write("\n</xnat_a:SCID>");
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
		//REFERENCE FROM scidResearchData -> subjectAssessorData
		if (_Administrator!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:administrator");
			writer.write(">");
			writer.write(ValueParser(_Administrator,"string"));
			writer.write("</xnat_a:administrator>");
			header--;
		}
			int child0=0;
			int att0=0;
			if(_Moodepisodes_currentsubstanceinducedmooddisorder!=null)
			child0++;
			if(_Moodepisodes_currentmajordepressiveepisode!=null)
			child0++;
			if(_Moodepisodes_currenthypomanicepisode!=null)
			child0++;
			if(_Moodepisodes_pastsubstanceinducedmooddisorder!=null)
			child0++;
			if(_Moodepisodes_currentmanicepisode!=null)
			child0++;
			if(_Moodepisodes_pastmooddisorderduetomedicalcondition!=null)
			child0++;
			if(_Moodepisodes_currentmooddisorderduetomedicalcondition!=null)
			child0++;
			if(_Moodepisodes_pastmanicepisode!=null)
			child0++;
			if(_Moodepisodes_pasthypomanicepisode!=null)
			child0++;
			if(_Moodepisodes_currentdysthmicepisode!=null)
			child0++;
			if(_Moodepisodes_pastmajordepressiveepisode!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:moodEpisodes");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Moodepisodes_currentmajordepressiveepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentMajorDepressiveEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currentmajordepressiveepisode,"integer"));
			writer.write("</xnat_a:currentMajorDepressiveEpisode>");
			header--;
		}
		if (_Moodepisodes_pastmajordepressiveepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastMajorDepressiveEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_pastmajordepressiveepisode,"integer"));
			writer.write("</xnat_a:pastMajorDepressiveEpisode>");
			header--;
		}
		if (_Moodepisodes_currentmanicepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentManicEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currentmanicepisode,"integer"));
			writer.write("</xnat_a:currentManicEpisode>");
			header--;
		}
		if (_Moodepisodes_pastmanicepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastManicEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_pastmanicepisode,"integer"));
			writer.write("</xnat_a:pastManicEpisode>");
			header--;
		}
		if (_Moodepisodes_currenthypomanicepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentHypomanicEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currenthypomanicepisode,"integer"));
			writer.write("</xnat_a:currentHypomanicEpisode>");
			header--;
		}
		if (_Moodepisodes_pasthypomanicepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastHypomanicEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_pasthypomanicepisode,"integer"));
			writer.write("</xnat_a:pastHypomanicEpisode>");
			header--;
		}
		if (_Moodepisodes_currentdysthmicepisode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDysthmicEpisode");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currentdysthmicepisode,"integer"));
			writer.write("</xnat_a:currentDysthmicEpisode>");
			header--;
		}
		if (_Moodepisodes_currentmooddisorderduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentMoodDisorderDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currentmooddisorderduetomedicalcondition,"integer"));
			writer.write("</xnat_a:currentMoodDisorderDueToMedicalCondition>");
			header--;
		}
		if (_Moodepisodes_pastmooddisorderduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastMoodDisorderDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_pastmooddisorderduetomedicalcondition,"integer"));
			writer.write("</xnat_a:pastMoodDisorderDueToMedicalCondition>");
			header--;
		}
		if (_Moodepisodes_currentsubstanceinducedmooddisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSubstanceInducedMoodDisorder");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_currentsubstanceinducedmooddisorder,"integer"));
			writer.write("</xnat_a:currentSubstanceInducedMoodDisorder>");
			header--;
		}
		if (_Moodepisodes_pastsubstanceinducedmooddisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSubstanceInducedMoodDisorder");
			writer.write(">");
			writer.write(ValueParser(_Moodepisodes_pastsubstanceinducedmooddisorder,"integer"));
			writer.write("</xnat_a:pastSubstanceInducedMoodDisorder>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:moodEpisodes>");
			}
			}

			int child1=0;
			int att1=0;
			if(_Psychoticsymptoms_pastcatatonicbehavior!=null)
			child1++;
			if(_Psychoticsymptoms_pastnegativesymptoms!=null)
			child1++;
			if(_Psychoticsymptoms_pastdisorganizedspeechbehavior!=null)
			child1++;
			if(_Psychoticsymptoms_currentdelusions!=null)
			child1++;
			if(_Psychoticsymptoms_currenthallucinations!=null)
			child1++;
			if(_Psychoticsymptoms_currentcatatonicbehavior!=null)
			child1++;
			if(_Psychoticsymptoms_pastdelusions!=null)
			child1++;
			if(_Psychoticsymptoms_currentnegativesymptoms!=null)
			child1++;
			if(_Psychoticsymptoms_currentdisorganizedspeechbehavior!=null)
			child1++;
			if(_Psychoticsymptoms_pasthallucinations!=null)
			child1++;
			if(child1>0 || att1>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:psychoticSymptoms");
			if(child1==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Psychoticsymptoms_currentdelusions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDelusions");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_currentdelusions,"integer"));
			writer.write("</xnat_a:currentDelusions>");
			header--;
		}
		if (_Psychoticsymptoms_pastdelusions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastDelusions");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_pastdelusions,"integer"));
			writer.write("</xnat_a:pastDelusions>");
			header--;
		}
		if (_Psychoticsymptoms_currenthallucinations!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentHallucinations");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_currenthallucinations,"integer"));
			writer.write("</xnat_a:currentHallucinations>");
			header--;
		}
		if (_Psychoticsymptoms_pasthallucinations!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastHallucinations");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_pasthallucinations,"integer"));
			writer.write("</xnat_a:pastHallucinations>");
			header--;
		}
		if (_Psychoticsymptoms_currentdisorganizedspeechbehavior!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDisorganizedSpeechBehavior");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_currentdisorganizedspeechbehavior,"integer"));
			writer.write("</xnat_a:currentDisorganizedSpeechBehavior>");
			header--;
		}
		if (_Psychoticsymptoms_pastdisorganizedspeechbehavior!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastDisorganizedSpeechBehavior");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_pastdisorganizedspeechbehavior,"integer"));
			writer.write("</xnat_a:pastDisorganizedSpeechBehavior>");
			header--;
		}
		if (_Psychoticsymptoms_currentcatatonicbehavior!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCatatonicBehavior");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_currentcatatonicbehavior,"integer"));
			writer.write("</xnat_a:currentCatatonicBehavior>");
			header--;
		}
		if (_Psychoticsymptoms_pastcatatonicbehavior!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCatatonicBehavior");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_pastcatatonicbehavior,"integer"));
			writer.write("</xnat_a:pastCatatonicBehavior>");
			header--;
		}
		if (_Psychoticsymptoms_currentnegativesymptoms!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentNegativeSymptoms");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_currentnegativesymptoms,"integer"));
			writer.write("</xnat_a:currentNegativeSymptoms>");
			header--;
		}
		if (_Psychoticsymptoms_pastnegativesymptoms!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastNegativeSymptoms");
			writer.write(">");
			writer.write(ValueParser(_Psychoticsymptoms_pastnegativesymptoms,"integer"));
			writer.write("</xnat_a:pastNegativeSymptoms>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:psychoticSymptoms>");
			}
			}

			int child2=0;
			int att2=0;
			if(_Psychoticdisorders_currentdisorganizedtype!=null)
			child2++;
			if(_Psychoticdisorders_currentbriefpsychoticdisorder!=null)
			child2++;
			if(_Psychoticdisorders_currentundifferentiatedtype!=null)
			child2++;
			if(_Psychoticdisorders_pastresidualtype!=null)
			child2++;
			if(_Psychoticdisorders_currentcatatonictype!=null)
			child2++;
			if(_Psychoticdisorders_currentschizophrenia!=null)
			child2++;
			if(_Psychoticdisorders_pastcatatonictype!=null)
			child2++;
			if(_Psychoticdisorders_pastbriefpsychoticdisorder!=null)
			child2++;
			if(_Psychoticdisorders_pastschizophrenia!=null)
			child2++;
			if(_Psychoticdisorders_currentparanoidtype!=null)
			child2++;
			if(_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder!=null)
			child2++;
			if(_Psychoticdisorders_currentschizophreniformdisorder!=null)
			child2++;
			if(_Psychoticdisorders_currentdelusionaldisorder!=null)
			child2++;
			if(_Psychoticdisorders_currentresidualtype!=null)
			child2++;
			if(_Psychoticdisorders_currentpsychoticdisordernos!=null)
			child2++;
			if(_Psychoticdisorders_pastdisorganizedtype!=null)
			child2++;
			if(_Psychoticdisorders_pastpsychoticdisordernos!=null)
			child2++;
			if(_Psychoticdisorders_currentschizoaffectivedisorder!=null)
			child2++;
			if(_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition!=null)
			child2++;
			if(_Psychoticdisorders_pastundifferentiatedtype!=null)
			child2++;
			if(_Psychoticdisorders_pastschizophreniformdisorder!=null)
			child2++;
			if(_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder!=null)
			child2++;
			if(_Psychoticdisorders_pastparanoidtype!=null)
			child2++;
			if(_Psychoticdisorders_pastdelusionaldisorder!=null)
			child2++;
			if(_Psychoticdisorders_pastschizoaffectivedisorder!=null)
			child2++;
			if(_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition!=null)
			child2++;
			if(child2>0 || att2>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:psychoticDisorders");
			if(child2==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Psychoticdisorders_currentschizophrenia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSchizophrenia");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentschizophrenia,"integer"));
			writer.write("</xnat_a:currentSchizophrenia>");
			header--;
		}
		if (_Psychoticdisorders_pastschizophrenia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSchizophrenia");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastschizophrenia,"integer"));
			writer.write("</xnat_a:pastSchizophrenia>");
			header--;
		}
		if (_Psychoticdisorders_currentparanoidtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentParanoidType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentparanoidtype,"integer"));
			writer.write("</xnat_a:currentParanoidType>");
			header--;
		}
		if (_Psychoticdisorders_pastparanoidtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastParanoidType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastparanoidtype,"integer"));
			writer.write("</xnat_a:pastParanoidType>");
			header--;
		}
		if (_Psychoticdisorders_currentcatatonictype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCatatonicType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentcatatonictype,"integer"));
			writer.write("</xnat_a:currentCatatonicType>");
			header--;
		}
		if (_Psychoticdisorders_pastcatatonictype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCatatonicType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastcatatonictype,"integer"));
			writer.write("</xnat_a:pastCatatonicType>");
			header--;
		}
		if (_Psychoticdisorders_currentdisorganizedtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDisorganizedType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentdisorganizedtype,"integer"));
			writer.write("</xnat_a:currentDisorganizedType>");
			header--;
		}
		if (_Psychoticdisorders_pastdisorganizedtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastDisorganizedType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastdisorganizedtype,"integer"));
			writer.write("</xnat_a:pastDisorganizedType>");
			header--;
		}
		if (_Psychoticdisorders_currentundifferentiatedtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentUndifferentiatedType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentundifferentiatedtype,"integer"));
			writer.write("</xnat_a:currentUndifferentiatedType>");
			header--;
		}
		if (_Psychoticdisorders_pastundifferentiatedtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastUndifferentiatedType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastundifferentiatedtype,"integer"));
			writer.write("</xnat_a:pastUndifferentiatedType>");
			header--;
		}
		if (_Psychoticdisorders_currentresidualtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentResidualType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentresidualtype,"integer"));
			writer.write("</xnat_a:currentResidualType>");
			header--;
		}
		if (_Psychoticdisorders_pastresidualtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastResidualType");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastresidualtype,"integer"));
			writer.write("</xnat_a:pastResidualType>");
			header--;
		}
		if (_Psychoticdisorders_currentschizophreniformdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSchizophreniformDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentschizophreniformdisorder,"integer"));
			writer.write("</xnat_a:currentSchizophreniformDisorder>");
			header--;
		}
		if (_Psychoticdisorders_pastschizophreniformdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSchizophreniformDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastschizophreniformdisorder,"integer"));
			writer.write("</xnat_a:pastSchizophreniformDisorder>");
			header--;
		}
		if (_Psychoticdisorders_currentschizoaffectivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSchizoaffectiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentschizoaffectivedisorder,"integer"));
			writer.write("</xnat_a:currentSchizoaffectiveDisorder>");
			header--;
		}
		if (_Psychoticdisorders_pastschizoaffectivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSchizoaffectiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastschizoaffectivedisorder,"integer"));
			writer.write("</xnat_a:pastSchizoaffectiveDisorder>");
			header--;
		}
		if (_Psychoticdisorders_currentdelusionaldisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDelusionalDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentdelusionaldisorder,"integer"));
			writer.write("</xnat_a:currentDelusionalDisorder>");
			header--;
		}
		if (_Psychoticdisorders_pastdelusionaldisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastDelusionalDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastdelusionaldisorder,"integer"));
			writer.write("</xnat_a:pastDelusionalDisorder>");
			header--;
		}
		if (_Psychoticdisorders_currentbriefpsychoticdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentBriefPsychoticDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentbriefpsychoticdisorder,"integer"));
			writer.write("</xnat_a:currentBriefPsychoticDisorder>");
			header--;
		}
		if (_Psychoticdisorders_pastbriefpsychoticdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastBriefPsychoticDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastbriefpsychoticdisorder,"integer"));
			writer.write("</xnat_a:pastBriefPsychoticDisorder>");
			header--;
		}
		if (_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPsychoticDisorderDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition,"integer"));
			writer.write("</xnat_a:currentPsychoticDisorderDueToMedicalCondition>");
			header--;
		}
		if (_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPsychoticDisorderDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition,"integer"));
			writer.write("</xnat_a:pastPsychoticDisorderDueToMedicalCondition>");
			header--;
		}
		if (_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSubstanceInducedPsychoticDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder,"integer"));
			writer.write("</xnat_a:currentSubstanceInducedPsychoticDisorder>");
			header--;
		}
		if (_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSubstanceInducedPsychoticDisorder");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder,"integer"));
			writer.write("</xnat_a:pastSubstanceInducedPsychoticDisorder>");
			header--;
		}
		if (_Psychoticdisorders_currentpsychoticdisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPsychoticDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_currentpsychoticdisordernos,"integer"));
			writer.write("</xnat_a:currentPsychoticDisorderNOS>");
			header--;
		}
		if (_Psychoticdisorders_pastpsychoticdisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPsychoticDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Psychoticdisorders_pastpsychoticdisordernos,"integer"));
			writer.write("</xnat_a:pastPsychoticDisorderNOS>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:psychoticDisorders>");
			}
			}

			int child3=0;
			int att3=0;
			if(_Mooddisorders_pastdepressivedisordernos!=null)
			child3++;
			if(_Mooddisorders_currentbipolar2disorder!=null)
			child3++;
			if(_Mooddisorders_pastbipolar1disorder!=null)
			child3++;
			if(_Mooddisorders_currentdepressivedisordernos!=null)
			child3++;
			if(_Mooddisorders_pastotherbipolardisorder!=null)
			child3++;
			if(_Mooddisorders_pastbipolar2disorder!=null)
			child3++;
			if(_Mooddisorders_currentmajordepressivedisorder!=null)
			child3++;
			if(_Mooddisorders_pastmajordepressivedisorder!=null)
			child3++;
			if(_Mooddisorders_currentbipolar1disorder!=null)
			child3++;
			if(_Mooddisorders_currentotherbipolardisorder!=null)
			child3++;
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:moodDisorders");
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Mooddisorders_currentbipolar1disorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentBipolar1Disorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_currentbipolar1disorder,"integer"));
			writer.write("</xnat_a:currentBipolar1Disorder>");
			header--;
		}
		if (_Mooddisorders_pastbipolar1disorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastBipolar1Disorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_pastbipolar1disorder,"integer"));
			writer.write("</xnat_a:pastBipolar1Disorder>");
			header--;
		}
		if (_Mooddisorders_currentbipolar2disorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentBipolar2Disorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_currentbipolar2disorder,"integer"));
			writer.write("</xnat_a:currentBipolar2Disorder>");
			header--;
		}
		if (_Mooddisorders_pastbipolar2disorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastBipolar2Disorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_pastbipolar2disorder,"integer"));
			writer.write("</xnat_a:pastBipolar2Disorder>");
			header--;
		}
		if (_Mooddisorders_currentotherbipolardisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOtherBipolarDisorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_currentotherbipolardisorder,"integer"));
			writer.write("</xnat_a:currentOtherBipolarDisorder>");
			header--;
		}
		if (_Mooddisorders_pastotherbipolardisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOtherBipolarDisorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_pastotherbipolardisorder,"integer"));
			writer.write("</xnat_a:pastOtherBipolarDisorder>");
			header--;
		}
		if (_Mooddisorders_currentmajordepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentMajorDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_currentmajordepressivedisorder,"integer"));
			writer.write("</xnat_a:currentMajorDepressiveDisorder>");
			header--;
		}
		if (_Mooddisorders_pastmajordepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastMajorDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_pastmajordepressivedisorder,"integer"));
			writer.write("</xnat_a:pastMajorDepressiveDisorder>");
			header--;
		}
		if (_Mooddisorders_currentdepressivedisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentDepressiveDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_currentdepressivedisordernos,"integer"));
			writer.write("</xnat_a:currentDepressiveDisorderNOS>");
			header--;
		}
		if (_Mooddisorders_pastdepressivedisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastDepressiveDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Mooddisorders_pastdepressivedisordernos,"integer"));
			writer.write("</xnat_a:pastDepressiveDisorderNOS>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:moodDisorders>");
			}
			}

			int child4=0;
			int att4=0;
			if(_Substanceusedisorders_currentpolysubstancedependence!=null)
			child4++;
			if(_Substanceusedisorders_currentotherorunknownabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastcannabisabuse!=null)
			child4++;
			if(_Substanceusedisorders_pasthallucinogendependence!=null)
			child4++;
			if(_Substanceusedisorders_currentcocainedependence!=null)
			child4++;
			if(_Substanceusedisorders_currenthallucinogendependence!=null)
			child4++;
			if(_Substanceusedisorders_pastopioidabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastotherorunknowndependence!=null)
			child4++;
			if(_Substanceusedisorders_pastotherorunknownabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastamphetaminedependence!=null)
			child4++;
			if(_Substanceusedisorders_pastcocainedependence!=null)
			child4++;
			if(_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence!=null)
			child4++;
			if(_Substanceusedisorders_currentphencyclidinedependence!=null)
			child4++;
			if(_Substanceusedisorders_currentamphetamineabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastpolysubstancedependence!=null)
			child4++;
			if(_Substanceusedisorders_currentopioidabuse!=null)
			child4++;
			if(_Substanceusedisorders_currentopioiddependence!=null)
			child4++;
			if(_Substanceusedisorders_pastamphetamineabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse!=null)
			child4++;
			if(_Substanceusedisorders_currenthallucinogenabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastopioiddependence!=null)
			child4++;
			if(_Substanceusedisorders_currentphencyclidineabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastphencyclidineabuse!=null)
			child4++;
			if(_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse!=null)
			child4++;
			if(_Substanceusedisorders_pasthallucinogenabuse!=null)
			child4++;
			if(_Substanceusedisorders_currentamphetaminedependence!=null)
			child4++;
			if(_Substanceusedisorders_currentcannabisabuse!=null)
			child4++;
			if(_Substanceusedisorders_currentalcoholdependence!=null)
			child4++;
			if(_Substanceusedisorders_currentcannabisdependence!=null)
			child4++;
			if(_Substanceusedisorders_pastphencyclidinedependence!=null)
			child4++;
			if(_Substanceusedisorders_pastcannabisdependence!=null)
			child4++;
			if(_Substanceusedisorders_currentcocaineabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence!=null)
			child4++;
			if(_Substanceusedisorders_pastcocaineabuse!=null)
			child4++;
			if(_Substanceusedisorders_currentotherorunknowndependence!=null)
			child4++;
			if(_Substanceusedisorders_currentalcoholabuse!=null)
			child4++;
			if(_Substanceusedisorders_pastalcoholdependence!=null)
			child4++;
			if(_Substanceusedisorders_pastalcoholabuse!=null)
			child4++;
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:substanceUseDisorders");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Substanceusedisorders_currentalcoholdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAlcoholDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentalcoholdependence,"integer"));
			writer.write("</xnat_a:currentAlcoholDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastalcoholdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAlcoholDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastalcoholdependence,"integer"));
			writer.write("</xnat_a:pastAlcoholDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentalcoholabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAlcoholAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentalcoholabuse,"integer"));
			writer.write("</xnat_a:currentAlcoholAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastalcoholabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAlcoholAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastalcoholabuse,"integer"));
			writer.write("</xnat_a:pastAlcoholAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentamphetaminedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAmphetamineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentamphetaminedependence,"integer"));
			writer.write("</xnat_a:currentAmphetamineDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastamphetaminedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAmphetamineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastamphetaminedependence,"integer"));
			writer.write("</xnat_a:pastAmphetamineDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentamphetamineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAmphetamineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentamphetamineabuse,"integer"));
			writer.write("</xnat_a:currentAmphetamineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastamphetamineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAmphetamineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastamphetamineabuse,"integer"));
			writer.write("</xnat_a:pastAmphetamineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentcannabisdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCannabisDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentcannabisdependence,"integer"));
			writer.write("</xnat_a:currentCannabisDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastcannabisdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCannabisDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastcannabisdependence,"integer"));
			writer.write("</xnat_a:pastCannabisDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentcannabisabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCannabisAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentcannabisabuse,"integer"));
			writer.write("</xnat_a:currentCannabisAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastcannabisabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCannabisAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastcannabisabuse,"integer"));
			writer.write("</xnat_a:pastCannabisAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentcocainedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCocaineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentcocainedependence,"integer"));
			writer.write("</xnat_a:currentCocaineDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastcocainedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCocaineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastcocainedependence,"integer"));
			writer.write("</xnat_a:pastCocaineDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentcocaineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentCocaineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentcocaineabuse,"integer"));
			writer.write("</xnat_a:currentCocaineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastcocaineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastCocaineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastcocaineabuse,"integer"));
			writer.write("</xnat_a:pastCocaineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currenthallucinogendependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentHallucinogenDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currenthallucinogendependence,"integer"));
			writer.write("</xnat_a:currentHallucinogenDependence>");
			header--;
		}
		if (_Substanceusedisorders_pasthallucinogendependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastHallucinogenDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pasthallucinogendependence,"integer"));
			writer.write("</xnat_a:pastHallucinogenDependence>");
			header--;
		}
		if (_Substanceusedisorders_currenthallucinogenabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentHallucinogenAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currenthallucinogenabuse,"integer"));
			writer.write("</xnat_a:currentHallucinogenAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pasthallucinogenabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastHallucinogenAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pasthallucinogenabuse,"integer"));
			writer.write("</xnat_a:pastHallucinogenAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentopioiddependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOpioidDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentopioiddependence,"integer"));
			writer.write("</xnat_a:currentOpioidDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastopioiddependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOpioidDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastopioiddependence,"integer"));
			writer.write("</xnat_a:pastOpioidDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentopioidabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOpioidAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentopioidabuse,"integer"));
			writer.write("</xnat_a:currentOpioidAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastopioidabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOpioidAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastopioidabuse,"integer"));
			writer.write("</xnat_a:pastOpioidAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentphencyclidinedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPhencyclidineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentphencyclidinedependence,"integer"));
			writer.write("</xnat_a:currentPhencyclidineDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastphencyclidinedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPhencyclidineDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastphencyclidinedependence,"integer"));
			writer.write("</xnat_a:pastPhencyclidineDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentphencyclidineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPhencyclidineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentphencyclidineabuse,"integer"));
			writer.write("</xnat_a:currentPhencyclidineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastphencyclidineabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPhencyclidineAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastphencyclidineabuse,"integer"));
			writer.write("</xnat_a:pastPhencyclidineAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSedativeHypnoticAnxiolyticDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence,"integer"));
			writer.write("</xnat_a:currentSedativeHypnoticAnxiolyticDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSedativeHypnoticAnxiolyticDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence,"integer"));
			writer.write("</xnat_a:pastSedativeHypnoticAnxiolyticDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSedativeHypnoticAnxiolyticAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse,"integer"));
			writer.write("</xnat_a:currentSedativeHypnoticAnxiolyticAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSedativeHypnoticAnxiolyticAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse,"integer"));
			writer.write("</xnat_a:pastSedativeHypnoticAnxiolyticAbuse>");
			header--;
		}
		if (_Substanceusedisorders_currentpolysubstancedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPolysubstanceDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentpolysubstancedependence,"integer"));
			writer.write("</xnat_a:currentPolysubstanceDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastpolysubstancedependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPolysubstanceDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastpolysubstancedependence,"integer"));
			writer.write("</xnat_a:pastPolysubstanceDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentotherorunknowndependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOtherOrUnknownDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentotherorunknowndependence,"integer"));
			writer.write("</xnat_a:currentOtherOrUnknownDependence>");
			header--;
		}
		if (_Substanceusedisorders_pastotherorunknowndependence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOtherOrUnknownDependence");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastotherorunknowndependence,"integer"));
			writer.write("</xnat_a:pastOtherOrUnknownDependence>");
			header--;
		}
		if (_Substanceusedisorders_currentotherorunknownabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOtherOrUnknownAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_currentotherorunknownabuse,"integer"));
			writer.write("</xnat_a:currentOtherOrUnknownAbuse>");
			header--;
		}
		if (_Substanceusedisorders_pastotherorunknownabuse!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOtherOrUnknownAbuse");
			writer.write(">");
			writer.write(ValueParser(_Substanceusedisorders_pastotherorunknownabuse,"integer"));
			writer.write("</xnat_a:pastOtherOrUnknownAbuse>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:substanceUseDisorders>");
			}
			}

			int child5=0;
			int att5=0;
			if(_Anxietydisorders_pastsubstanceinducedanxietydisorder!=null)
			child5++;
			if(_Anxietydisorders_pastagoraphobiawithoutpanichx!=null)
			child5++;
			if(_Anxietydisorders_currentsocialphobia!=null)
			child5++;
			if(_Anxietydisorders_currentocd!=null)
			child5++;
			if(_Anxietydisorders_currentpanicwithagoraphobia!=null)
			child5++;
			if(_Anxietydisorders_currentagoraphobiawithoutpanichx!=null)
			child5++;
			if(_Anxietydisorders_currentanxietydisordernos!=null)
			child5++;
			if(_Anxietydisorders_pastanxietyduetomedicalcondition!=null)
			child5++;
			if(_Anxietydisorders_currentptsd!=null)
			child5++;
			if(_Anxietydisorders_pastocd!=null)
			child5++;
			if(_Anxietydisorders_pastpanicwithoutagoraphobia!=null)
			child5++;
			if(_Anxietydisorders_currentanxietyduetomedicalcondition!=null)
			child5++;
			if(_Anxietydisorders_pastspecificphobia!=null)
			child5++;
			if(_Anxietydisorders_pastpanicwithagoraphobia!=null)
			child5++;
			if(_Anxietydisorders_currentgeneralizedanxietydisorder!=null)
			child5++;
			if(_Anxietydisorders_pastanxietydisordernos!=null)
			child5++;
			if(_Anxietydisorders_pastsocialphobia!=null)
			child5++;
			if(_Anxietydisorders_currentpanicwithoutagoraphobia!=null)
			child5++;
			if(_Anxietydisorders_pastptsd!=null)
			child5++;
			if(_Anxietydisorders_currentsubstanceinducedanxietydisorder!=null)
			child5++;
			if(_Anxietydisorders_currentspecificphobia!=null)
			child5++;
			if(child5>0 || att5>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:anxietyDisorders");
			if(child5==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Anxietydisorders_currentpanicwithagoraphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPanicWithAgoraphobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentpanicwithagoraphobia,"integer"));
			writer.write("</xnat_a:currentPanicWithAgoraphobia>");
			header--;
		}
		if (_Anxietydisorders_pastpanicwithagoraphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPanicWithAgoraphobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastpanicwithagoraphobia,"integer"));
			writer.write("</xnat_a:pastPanicWithAgoraphobia>");
			header--;
		}
		if (_Anxietydisorders_currentpanicwithoutagoraphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPanicWithoutAgoraphobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentpanicwithoutagoraphobia,"integer"));
			writer.write("</xnat_a:currentPanicWithoutAgoraphobia>");
			header--;
		}
		if (_Anxietydisorders_pastpanicwithoutagoraphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPanicWithoutAgoraphobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastpanicwithoutagoraphobia,"integer"));
			writer.write("</xnat_a:pastPanicWithoutAgoraphobia>");
			header--;
		}
		if (_Anxietydisorders_currentagoraphobiawithoutpanichx!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAgoraphobiaWithoutPanicHx");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentagoraphobiawithoutpanichx,"integer"));
			writer.write("</xnat_a:currentAgoraphobiaWithoutPanicHx>");
			header--;
		}
		if (_Anxietydisorders_pastagoraphobiawithoutpanichx!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAgoraphobiaWithoutPanicHx");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastagoraphobiawithoutpanichx,"integer"));
			writer.write("</xnat_a:pastAgoraphobiaWithoutPanicHx>");
			header--;
		}
		if (_Anxietydisorders_currentsocialphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSocialPhobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentsocialphobia,"integer"));
			writer.write("</xnat_a:currentSocialPhobia>");
			header--;
		}
		if (_Anxietydisorders_pastsocialphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSocialPhobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastsocialphobia,"integer"));
			writer.write("</xnat_a:pastSocialPhobia>");
			header--;
		}
		if (_Anxietydisorders_currentspecificphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSpecificPhobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentspecificphobia,"integer"));
			writer.write("</xnat_a:currentSpecificPhobia>");
			header--;
		}
		if (_Anxietydisorders_pastspecificphobia!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSpecificPhobia");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastspecificphobia,"integer"));
			writer.write("</xnat_a:pastSpecificPhobia>");
			header--;
		}
		if (_Anxietydisorders_currentocd!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentOCD");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentocd,"integer"));
			writer.write("</xnat_a:currentOCD>");
			header--;
		}
		if (_Anxietydisorders_pastocd!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastOCD");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastocd,"integer"));
			writer.write("</xnat_a:pastOCD>");
			header--;
		}
		if (_Anxietydisorders_currentptsd!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentPTSD");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentptsd,"integer"));
			writer.write("</xnat_a:currentPTSD>");
			header--;
		}
		if (_Anxietydisorders_pastptsd!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastPTSD");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastptsd,"integer"));
			writer.write("</xnat_a:pastPTSD>");
			header--;
		}
		if (_Anxietydisorders_currentgeneralizedanxietydisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentGeneralizedAnxietyDisorder");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentgeneralizedanxietydisorder,"integer"));
			writer.write("</xnat_a:currentGeneralizedAnxietyDisorder>");
			header--;
		}
		if (_Anxietydisorders_currentanxietyduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAnxietyDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentanxietyduetomedicalcondition,"integer"));
			writer.write("</xnat_a:currentAnxietyDueToMedicalCondition>");
			header--;
		}
		if (_Anxietydisorders_pastanxietyduetomedicalcondition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAnxietyDueToMedicalCondition");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastanxietyduetomedicalcondition,"integer"));
			writer.write("</xnat_a:pastAnxietyDueToMedicalCondition>");
			header--;
		}
		if (_Anxietydisorders_currentsubstanceinducedanxietydisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentSubstanceInducedAnxietyDisorder");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentsubstanceinducedanxietydisorder,"integer"));
			writer.write("</xnat_a:currentSubstanceInducedAnxietyDisorder>");
			header--;
		}
		if (_Anxietydisorders_pastsubstanceinducedanxietydisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSubstanceInducedAnxietyDisorder");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastsubstanceinducedanxietydisorder,"integer"));
			writer.write("</xnat_a:pastSubstanceInducedAnxietyDisorder>");
			header--;
		}
		if (_Anxietydisorders_currentanxietydisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAnxietyDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_currentanxietydisordernos,"integer"));
			writer.write("</xnat_a:currentAnxietyDisorderNOS>");
			header--;
		}
		if (_Anxietydisorders_pastanxietydisordernos!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAnxietyDisorderNOS");
			writer.write(">");
			writer.write(ValueParser(_Anxietydisorders_pastanxietydisordernos,"integer"));
			writer.write("</xnat_a:pastAnxietyDisorderNOS>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:anxietyDisorders>");
			}
			}

			int child6=0;
			int att6=0;
			if(_Somatoformdisorders_somatizationdisorder!=null)
			child6++;
			if(_Somatoformdisorders_hypochondriasis!=null)
			child6++;
			if(_Somatoformdisorders_undifferentiatedsomatformdisorder!=null)
			child6++;
			if(_Somatoformdisorders_bodydysmorphicdisorder!=null)
			child6++;
			if(_Somatoformdisorders_paindisorder!=null)
			child6++;
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:somatoformDisorders");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Somatoformdisorders_somatizationdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:somatizationDisorder");
			writer.write(">");
			writer.write(ValueParser(_Somatoformdisorders_somatizationdisorder,"integer"));
			writer.write("</xnat_a:somatizationDisorder>");
			header--;
		}
		if (_Somatoformdisorders_undifferentiatedsomatformdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:undifferentiatedSomatformDisorder");
			writer.write(">");
			writer.write(ValueParser(_Somatoformdisorders_undifferentiatedsomatformdisorder,"integer"));
			writer.write("</xnat_a:undifferentiatedSomatformDisorder>");
			header--;
		}
		if (_Somatoformdisorders_paindisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:painDisorder");
			writer.write(">");
			writer.write(ValueParser(_Somatoformdisorders_paindisorder,"integer"));
			writer.write("</xnat_a:painDisorder>");
			header--;
		}
		if (_Somatoformdisorders_hypochondriasis!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:hypochondriasis");
			writer.write(">");
			writer.write(ValueParser(_Somatoformdisorders_hypochondriasis,"integer"));
			writer.write("</xnat_a:hypochondriasis>");
			header--;
		}
		if (_Somatoformdisorders_bodydysmorphicdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:bodyDysmorphicDisorder");
			writer.write(">");
			writer.write(ValueParser(_Somatoformdisorders_bodydysmorphicdisorder,"integer"));
			writer.write("</xnat_a:bodyDysmorphicDisorder>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:somatoformDisorders>");
			}
			}

			int child7=0;
			int att7=0;
			if(_Eatingdisorders_pastbulimianervosa!=null)
			child7++;
			if(_Eatingdisorders_currentbulimianervosa!=null)
			child7++;
			if(_Eatingdisorders_currentbingeeatingdisorder!=null)
			child7++;
			if(_Eatingdisorders_pastanorexianervosa!=null)
			child7++;
			if(_Eatingdisorders_currentanorexianervosa!=null)
			child7++;
			if(_Eatingdisorders_pastbingeeatingdisorder!=null)
			child7++;
			if(child7>0 || att7>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:eatingDisorders");
			if(child7==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Eatingdisorders_currentanorexianervosa!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAnorexiaNervosa");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_currentanorexianervosa,"integer"));
			writer.write("</xnat_a:currentAnorexiaNervosa>");
			header--;
		}
		if (_Eatingdisorders_pastanorexianervosa!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAnorexiaNervosa");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_pastanorexianervosa,"integer"));
			writer.write("</xnat_a:pastAnorexiaNervosa>");
			header--;
		}
		if (_Eatingdisorders_currentbulimianervosa!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentBulimiaNervosa");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_currentbulimianervosa,"integer"));
			writer.write("</xnat_a:currentBulimiaNervosa>");
			header--;
		}
		if (_Eatingdisorders_pastbulimianervosa!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastBulimiaNervosa");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_pastbulimianervosa,"integer"));
			writer.write("</xnat_a:pastBulimiaNervosa>");
			header--;
		}
		if (_Eatingdisorders_currentbingeeatingdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentBingeEatingDisorder");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_currentbingeeatingdisorder,"integer"));
			writer.write("</xnat_a:currentBingeEatingDisorder>");
			header--;
		}
		if (_Eatingdisorders_pastbingeeatingdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastBingeEatingDisorder");
			writer.write(">");
			writer.write(ValueParser(_Eatingdisorders_pastbingeeatingdisorder,"integer"));
			writer.write("</xnat_a:pastBingeEatingDisorder>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:eatingDisorders>");
			}
			}

		if (_Adjustmentdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:adjustmentDisorder");
			writer.write(">");
			writer.write(ValueParser(_Adjustmentdisorder,"integer"));
			writer.write("</xnat_a:adjustmentDisorder>");
			header--;
		}
			int child8=0;
			int att8=0;
			if(_Optional_pastsympomaticdetails!=null)
			child8++;
			if(_Optional_currentminordepressivedisorder!=null)
			child8++;
			if(_Optional_pastacutestressdisorder!=null)
			child8++;
			if(_Optional_currentacutestressdisorder!=null)
			child8++;
			if(_Optional_pastmixedanxietydepressivedisorder!=null)
			child8++;
			if(_Optional_currentmixedanxietydepressivedisorder!=null)
			child8++;
			if(_Optional_pastminordepressivedisorder!=null)
			child8++;
			if(child8>0 || att8>0){
				writer.write("\n" + createHeader(header++) + "<xnat_a:optional");
			if(child8==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Optional_currentacutestressdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentAcuteStressDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_currentacutestressdisorder,"integer"));
			writer.write("</xnat_a:currentAcuteStressDisorder>");
			header--;
		}
		if (_Optional_pastacutestressdisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastAcuteStressDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_pastacutestressdisorder,"integer"));
			writer.write("</xnat_a:pastAcuteStressDisorder>");
			header--;
		}
		if (_Optional_currentminordepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentMinorDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_currentminordepressivedisorder,"integer"));
			writer.write("</xnat_a:currentMinorDepressiveDisorder>");
			header--;
		}
		if (_Optional_pastminordepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastMinorDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_pastminordepressivedisorder,"integer"));
			writer.write("</xnat_a:pastMinorDepressiveDisorder>");
			header--;
		}
		if (_Optional_currentmixedanxietydepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:currentMixedAnxietyDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_currentmixedanxietydepressivedisorder,"integer"));
			writer.write("</xnat_a:currentMixedAnxietyDepressiveDisorder>");
			header--;
		}
		if (_Optional_pastmixedanxietydepressivedisorder!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastMixedAnxietyDepressiveDisorder");
			writer.write(">");
			writer.write(ValueParser(_Optional_pastmixedanxietydepressivedisorder,"integer"));
			writer.write("</xnat_a:pastMixedAnxietyDepressiveDisorder>");
			header--;
		}
		if (_Optional_pastsympomaticdetails!=null){
			writer.write("\n" + createHeader(header++) + "<xnat_a:pastSympomaticDetails");
			writer.write(">");
			writer.write(ValueParser(_Optional_pastsympomaticdetails,"string"));
			writer.write("</xnat_a:pastSympomaticDetails>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat_a:optional>");
			}
			}

	return true;
	}


	protected boolean hasXMLBodyContent(){
		if (_Administrator!=null) return true;
			if(_Moodepisodes_currentsubstanceinducedmooddisorder!=null) return true;
			if(_Moodepisodes_currentmajordepressiveepisode!=null) return true;
			if(_Moodepisodes_currenthypomanicepisode!=null) return true;
			if(_Moodepisodes_pastsubstanceinducedmooddisorder!=null) return true;
			if(_Moodepisodes_currentmanicepisode!=null) return true;
			if(_Moodepisodes_pastmooddisorderduetomedicalcondition!=null) return true;
			if(_Moodepisodes_currentmooddisorderduetomedicalcondition!=null) return true;
			if(_Moodepisodes_pastmanicepisode!=null) return true;
			if(_Moodepisodes_pasthypomanicepisode!=null) return true;
			if(_Moodepisodes_currentdysthmicepisode!=null) return true;
			if(_Moodepisodes_pastmajordepressiveepisode!=null) return true;
			if(_Psychoticsymptoms_pastcatatonicbehavior!=null) return true;
			if(_Psychoticsymptoms_pastnegativesymptoms!=null) return true;
			if(_Psychoticsymptoms_pastdisorganizedspeechbehavior!=null) return true;
			if(_Psychoticsymptoms_currentdelusions!=null) return true;
			if(_Psychoticsymptoms_currenthallucinations!=null) return true;
			if(_Psychoticsymptoms_currentcatatonicbehavior!=null) return true;
			if(_Psychoticsymptoms_pastdelusions!=null) return true;
			if(_Psychoticsymptoms_currentnegativesymptoms!=null) return true;
			if(_Psychoticsymptoms_currentdisorganizedspeechbehavior!=null) return true;
			if(_Psychoticsymptoms_pasthallucinations!=null) return true;
			if(_Psychoticdisorders_currentdisorganizedtype!=null) return true;
			if(_Psychoticdisorders_currentbriefpsychoticdisorder!=null) return true;
			if(_Psychoticdisorders_currentundifferentiatedtype!=null) return true;
			if(_Psychoticdisorders_pastresidualtype!=null) return true;
			if(_Psychoticdisorders_currentcatatonictype!=null) return true;
			if(_Psychoticdisorders_currentschizophrenia!=null) return true;
			if(_Psychoticdisorders_pastcatatonictype!=null) return true;
			if(_Psychoticdisorders_pastbriefpsychoticdisorder!=null) return true;
			if(_Psychoticdisorders_pastschizophrenia!=null) return true;
			if(_Psychoticdisorders_currentparanoidtype!=null) return true;
			if(_Psychoticdisorders_currentsubstanceinducedpsychoticdisorder!=null) return true;
			if(_Psychoticdisorders_currentschizophreniformdisorder!=null) return true;
			if(_Psychoticdisorders_currentdelusionaldisorder!=null) return true;
			if(_Psychoticdisorders_currentresidualtype!=null) return true;
			if(_Psychoticdisorders_currentpsychoticdisordernos!=null) return true;
			if(_Psychoticdisorders_pastdisorganizedtype!=null) return true;
			if(_Psychoticdisorders_pastpsychoticdisordernos!=null) return true;
			if(_Psychoticdisorders_currentschizoaffectivedisorder!=null) return true;
			if(_Psychoticdisorders_currentpsychoticdisorderduetomedicalcondition!=null) return true;
			if(_Psychoticdisorders_pastundifferentiatedtype!=null) return true;
			if(_Psychoticdisorders_pastschizophreniformdisorder!=null) return true;
			if(_Psychoticdisorders_pastsubstanceinducedpsychoticdisorder!=null) return true;
			if(_Psychoticdisorders_pastparanoidtype!=null) return true;
			if(_Psychoticdisorders_pastdelusionaldisorder!=null) return true;
			if(_Psychoticdisorders_pastschizoaffectivedisorder!=null) return true;
			if(_Psychoticdisorders_pastpsychoticdisorderduetomedicalcondition!=null) return true;
			if(_Mooddisorders_pastdepressivedisordernos!=null) return true;
			if(_Mooddisorders_currentbipolar2disorder!=null) return true;
			if(_Mooddisorders_pastbipolar1disorder!=null) return true;
			if(_Mooddisorders_currentdepressivedisordernos!=null) return true;
			if(_Mooddisorders_pastotherbipolardisorder!=null) return true;
			if(_Mooddisorders_pastbipolar2disorder!=null) return true;
			if(_Mooddisorders_currentmajordepressivedisorder!=null) return true;
			if(_Mooddisorders_pastmajordepressivedisorder!=null) return true;
			if(_Mooddisorders_currentbipolar1disorder!=null) return true;
			if(_Mooddisorders_currentotherbipolardisorder!=null) return true;
			if(_Substanceusedisorders_currentpolysubstancedependence!=null) return true;
			if(_Substanceusedisorders_currentotherorunknownabuse!=null) return true;
			if(_Substanceusedisorders_pastcannabisabuse!=null) return true;
			if(_Substanceusedisorders_pasthallucinogendependence!=null) return true;
			if(_Substanceusedisorders_currentcocainedependence!=null) return true;
			if(_Substanceusedisorders_currenthallucinogendependence!=null) return true;
			if(_Substanceusedisorders_pastopioidabuse!=null) return true;
			if(_Substanceusedisorders_pastotherorunknowndependence!=null) return true;
			if(_Substanceusedisorders_pastotherorunknownabuse!=null) return true;
			if(_Substanceusedisorders_pastamphetaminedependence!=null) return true;
			if(_Substanceusedisorders_pastcocainedependence!=null) return true;
			if(_Substanceusedisorders_currentsedativehypnoticanxiolyticdependence!=null) return true;
			if(_Substanceusedisorders_currentphencyclidinedependence!=null) return true;
			if(_Substanceusedisorders_currentamphetamineabuse!=null) return true;
			if(_Substanceusedisorders_pastpolysubstancedependence!=null) return true;
			if(_Substanceusedisorders_currentopioidabuse!=null) return true;
			if(_Substanceusedisorders_currentopioiddependence!=null) return true;
			if(_Substanceusedisorders_pastamphetamineabuse!=null) return true;
			if(_Substanceusedisorders_pastsedativehypnoticanxiolyticabuse!=null) return true;
			if(_Substanceusedisorders_currenthallucinogenabuse!=null) return true;
			if(_Substanceusedisorders_pastopioiddependence!=null) return true;
			if(_Substanceusedisorders_currentphencyclidineabuse!=null) return true;
			if(_Substanceusedisorders_pastphencyclidineabuse!=null) return true;
			if(_Substanceusedisorders_currentsedativehypnoticanxiolyticabuse!=null) return true;
			if(_Substanceusedisorders_pasthallucinogenabuse!=null) return true;
			if(_Substanceusedisorders_currentamphetaminedependence!=null) return true;
			if(_Substanceusedisorders_currentcannabisabuse!=null) return true;
			if(_Substanceusedisorders_currentalcoholdependence!=null) return true;
			if(_Substanceusedisorders_currentcannabisdependence!=null) return true;
			if(_Substanceusedisorders_pastphencyclidinedependence!=null) return true;
			if(_Substanceusedisorders_pastcannabisdependence!=null) return true;
			if(_Substanceusedisorders_currentcocaineabuse!=null) return true;
			if(_Substanceusedisorders_pastsedativehypnoticanxiolyticdependence!=null) return true;
			if(_Substanceusedisorders_pastcocaineabuse!=null) return true;
			if(_Substanceusedisorders_currentotherorunknowndependence!=null) return true;
			if(_Substanceusedisorders_currentalcoholabuse!=null) return true;
			if(_Substanceusedisorders_pastalcoholdependence!=null) return true;
			if(_Substanceusedisorders_pastalcoholabuse!=null) return true;
			if(_Anxietydisorders_pastsubstanceinducedanxietydisorder!=null) return true;
			if(_Anxietydisorders_pastagoraphobiawithoutpanichx!=null) return true;
			if(_Anxietydisorders_currentsocialphobia!=null) return true;
			if(_Anxietydisorders_currentocd!=null) return true;
			if(_Anxietydisorders_currentpanicwithagoraphobia!=null) return true;
			if(_Anxietydisorders_currentagoraphobiawithoutpanichx!=null) return true;
			if(_Anxietydisorders_currentanxietydisordernos!=null) return true;
			if(_Anxietydisorders_pastanxietyduetomedicalcondition!=null) return true;
			if(_Anxietydisorders_currentptsd!=null) return true;
			if(_Anxietydisorders_pastocd!=null) return true;
			if(_Anxietydisorders_pastpanicwithoutagoraphobia!=null) return true;
			if(_Anxietydisorders_currentanxietyduetomedicalcondition!=null) return true;
			if(_Anxietydisorders_pastspecificphobia!=null) return true;
			if(_Anxietydisorders_pastpanicwithagoraphobia!=null) return true;
			if(_Anxietydisorders_currentgeneralizedanxietydisorder!=null) return true;
			if(_Anxietydisorders_pastanxietydisordernos!=null) return true;
			if(_Anxietydisorders_pastsocialphobia!=null) return true;
			if(_Anxietydisorders_currentpanicwithoutagoraphobia!=null) return true;
			if(_Anxietydisorders_pastptsd!=null) return true;
			if(_Anxietydisorders_currentsubstanceinducedanxietydisorder!=null) return true;
			if(_Anxietydisorders_currentspecificphobia!=null) return true;
			if(_Somatoformdisorders_somatizationdisorder!=null) return true;
			if(_Somatoformdisorders_hypochondriasis!=null) return true;
			if(_Somatoformdisorders_undifferentiatedsomatformdisorder!=null) return true;
			if(_Somatoformdisorders_bodydysmorphicdisorder!=null) return true;
			if(_Somatoformdisorders_paindisorder!=null) return true;
			if(_Eatingdisorders_pastbulimianervosa!=null) return true;
			if(_Eatingdisorders_currentbulimianervosa!=null) return true;
			if(_Eatingdisorders_currentbingeeatingdisorder!=null) return true;
			if(_Eatingdisorders_pastanorexianervosa!=null) return true;
			if(_Eatingdisorders_currentanorexianervosa!=null) return true;
			if(_Eatingdisorders_pastbingeeatingdisorder!=null) return true;
		if (_Adjustmentdisorder!=null) return true;
			if(_Optional_pastsympomaticdetails!=null) return true;
			if(_Optional_currentminordepressivedisorder!=null) return true;
			if(_Optional_pastacutestressdisorder!=null) return true;
			if(_Optional_currentacutestressdisorder!=null) return true;
			if(_Optional_pastmixedanxietydepressivedisorder!=null) return true;
			if(_Optional_currentmixedanxietydepressivedisorder!=null) return true;
			if(_Optional_pastminordepressivedisorder!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
