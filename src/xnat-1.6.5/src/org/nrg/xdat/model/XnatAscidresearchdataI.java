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
public interface XnatAscidresearchdataI extends XnatSubjectassessordataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the administrator.
	 */
	public String getAdministrator();

	/**
	 * Sets the value for administrator.
	 * @param v Value to Set.
	 */
	public void setAdministrator(String v);

	/**
	 * @return Returns the moodEpisodes/currentMajorDepressiveEpisode.
	 */
	public Integer getMoodepisodes_currentmajordepressiveepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmajordepressiveepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/pastMajorDepressiveEpisode.
	 */
	public Integer getMoodepisodes_pastmajordepressiveepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMajorDepressiveEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmajordepressiveepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/currentManicEpisode.
	 */
	public Integer getMoodepisodes_currentmanicepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmanicepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/pastManicEpisode.
	 */
	public Integer getMoodepisodes_pastmanicepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastManicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmanicepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/currentHypomanicEpisode.
	 */
	public Integer getMoodepisodes_currenthypomanicepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currenthypomanicepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/pastHypomanicEpisode.
	 */
	public Integer getMoodepisodes_pasthypomanicepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastHypomanicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pasthypomanicepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/currentDysthmicEpisode.
	 */
	public Integer getMoodepisodes_currentdysthmicepisode();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentDysthmicEpisode.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentdysthmicepisode(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/currentMoodDisorderDueToMedicalCondition.
	 */
	public Integer getMoodepisodes_currentmooddisorderduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentmooddisorderduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/pastMoodDisorderDueToMedicalCondition.
	 */
	public Integer getMoodepisodes_pastmooddisorderduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastMoodDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastmooddisorderduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/currentSubstanceInducedMoodDisorder.
	 */
	public Integer getMoodepisodes_currentsubstanceinducedmooddisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/currentSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_currentsubstanceinducedmooddisorder(Integer v) ;

	/**
	 * @return Returns the moodEpisodes/pastSubstanceInducedMoodDisorder.
	 */
	public Integer getMoodepisodes_pastsubstanceinducedmooddisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodEpisodes/pastSubstanceInducedMoodDisorder.
	 * @param v Value to Set.
	 */
	public void setMoodepisodes_pastsubstanceinducedmooddisorder(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/currentDelusions.
	 */
	public Integer getPsychoticsymptoms_currentdelusions();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdelusions(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/pastDelusions.
	 */
	public Integer getPsychoticsymptoms_pastdelusions();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDelusions.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdelusions(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/currentHallucinations.
	 */
	public Integer getPsychoticsymptoms_currenthallucinations();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currenthallucinations(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/pastHallucinations.
	 */
	public Integer getPsychoticsymptoms_pasthallucinations();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastHallucinations.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pasthallucinations(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/currentDisorganizedSpeechBehavior.
	 */
	public Integer getPsychoticsymptoms_currentdisorganizedspeechbehavior();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentdisorganizedspeechbehavior(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/pastDisorganizedSpeechBehavior.
	 */
	public Integer getPsychoticsymptoms_pastdisorganizedspeechbehavior();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastDisorganizedSpeechBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastdisorganizedspeechbehavior(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/currentCatatonicBehavior.
	 */
	public Integer getPsychoticsymptoms_currentcatatonicbehavior();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentcatatonicbehavior(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/pastCatatonicBehavior.
	 */
	public Integer getPsychoticsymptoms_pastcatatonicbehavior();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastCatatonicBehavior.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastcatatonicbehavior(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/currentNegativeSymptoms.
	 */
	public Integer getPsychoticsymptoms_currentnegativesymptoms();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/currentNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_currentnegativesymptoms(Integer v) ;

	/**
	 * @return Returns the psychoticSymptoms/pastNegativeSymptoms.
	 */
	public Integer getPsychoticsymptoms_pastnegativesymptoms();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticSymptoms/pastNegativeSymptoms.
	 * @param v Value to Set.
	 */
	public void setPsychoticsymptoms_pastnegativesymptoms(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentSchizophrenia.
	 */
	public Integer getPsychoticdisorders_currentschizophrenia();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophrenia(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastSchizophrenia.
	 */
	public Integer getPsychoticdisorders_pastschizophrenia();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophrenia.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophrenia(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentParanoidType.
	 */
	public Integer getPsychoticdisorders_currentparanoidtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentparanoidtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastParanoidType.
	 */
	public Integer getPsychoticdisorders_pastparanoidtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastParanoidType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastparanoidtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentCatatonicType.
	 */
	public Integer getPsychoticdisorders_currentcatatonictype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentcatatonictype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastCatatonicType.
	 */
	public Integer getPsychoticdisorders_pastcatatonictype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastCatatonicType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastcatatonictype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentDisorganizedType.
	 */
	public Integer getPsychoticdisorders_currentdisorganizedtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdisorganizedtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastDisorganizedType.
	 */
	public Integer getPsychoticdisorders_pastdisorganizedtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDisorganizedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdisorganizedtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentUndifferentiatedType.
	 */
	public Integer getPsychoticdisorders_currentundifferentiatedtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentundifferentiatedtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastUndifferentiatedType.
	 */
	public Integer getPsychoticdisorders_pastundifferentiatedtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastUndifferentiatedType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastundifferentiatedtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentResidualType.
	 */
	public Integer getPsychoticdisorders_currentresidualtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentresidualtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastResidualType.
	 */
	public Integer getPsychoticdisorders_pastresidualtype();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastResidualType.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastresidualtype(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentSchizophreniformDisorder.
	 */
	public Integer getPsychoticdisorders_currentschizophreniformdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizophreniformdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastSchizophreniformDisorder.
	 */
	public Integer getPsychoticdisorders_pastschizophreniformdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizophreniformDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizophreniformdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentSchizoaffectiveDisorder.
	 */
	public Integer getPsychoticdisorders_currentschizoaffectivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentschizoaffectivedisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastSchizoaffectiveDisorder.
	 */
	public Integer getPsychoticdisorders_pastschizoaffectivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSchizoaffectiveDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastschizoaffectivedisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentDelusionalDisorder.
	 */
	public Integer getPsychoticdisorders_currentdelusionaldisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentdelusionaldisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastDelusionalDisorder.
	 */
	public Integer getPsychoticdisorders_pastdelusionaldisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastDelusionalDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastdelusionaldisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentBriefPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_currentbriefpsychoticdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentbriefpsychoticdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastBriefPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_pastbriefpsychoticdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastBriefPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastbriefpsychoticdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition.
	 */
	public Integer getPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisorderduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition.
	 */
	public Integer getPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisorderduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentSubstanceInducedPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_currentsubstanceinducedpsychoticdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentsubstanceinducedpsychoticdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastSubstanceInducedPsychoticDisorder.
	 */
	public Integer getPsychoticdisorders_pastsubstanceinducedpsychoticdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastSubstanceInducedPsychoticDisorder.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastsubstanceinducedpsychoticdisorder(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/currentPsychoticDisorderNOS.
	 */
	public Integer getPsychoticdisorders_currentpsychoticdisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/currentPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_currentpsychoticdisordernos(Integer v) ;

	/**
	 * @return Returns the psychoticDisorders/pastPsychoticDisorderNOS.
	 */
	public Integer getPsychoticdisorders_pastpsychoticdisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/psychoticDisorders/pastPsychoticDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setPsychoticdisorders_pastpsychoticdisordernos(Integer v) ;

	/**
	 * @return Returns the moodDisorders/currentBipolar1Disorder.
	 */
	public Integer getMooddisorders_currentbipolar1disorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar1disorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/pastBipolar1Disorder.
	 */
	public Integer getMooddisorders_pastbipolar1disorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar1Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar1disorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/currentBipolar2Disorder.
	 */
	public Integer getMooddisorders_currentbipolar2disorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentbipolar2disorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/pastBipolar2Disorder.
	 */
	public Integer getMooddisorders_pastbipolar2disorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastBipolar2Disorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastbipolar2disorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/currentOtherBipolarDisorder.
	 */
	public Integer getMooddisorders_currentotherbipolardisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentotherbipolardisorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/pastOtherBipolarDisorder.
	 */
	public Integer getMooddisorders_pastotherbipolardisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastOtherBipolarDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastotherbipolardisorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/currentMajorDepressiveDisorder.
	 */
	public Integer getMooddisorders_currentmajordepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentmajordepressivedisorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/pastMajorDepressiveDisorder.
	 */
	public Integer getMooddisorders_pastmajordepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastMajorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastmajordepressivedisorder(Integer v) ;

	/**
	 * @return Returns the moodDisorders/currentDepressiveDisorderNOS.
	 */
	public Integer getMooddisorders_currentdepressivedisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/currentDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_currentdepressivedisordernos(Integer v) ;

	/**
	 * @return Returns the moodDisorders/pastDepressiveDisorderNOS.
	 */
	public Integer getMooddisorders_pastdepressivedisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/moodDisorders/pastDepressiveDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setMooddisorders_pastdepressivedisordernos(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentAlcoholDependence.
	 */
	public Integer getSubstanceusedisorders_currentalcoholdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastAlcoholDependence.
	 */
	public Integer getSubstanceusedisorders_pastalcoholdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentAlcoholAbuse.
	 */
	public Integer getSubstanceusedisorders_currentalcoholabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentalcoholabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastAlcoholAbuse.
	 */
	public Integer getSubstanceusedisorders_pastalcoholabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAlcoholAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastalcoholabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentAmphetamineDependence.
	 */
	public Integer getSubstanceusedisorders_currentamphetaminedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetaminedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastAmphetamineDependence.
	 */
	public Integer getSubstanceusedisorders_pastamphetaminedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetaminedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentAmphetamineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentamphetamineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentamphetamineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastAmphetamineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastamphetamineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastAmphetamineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastamphetamineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentCannabisDependence.
	 */
	public Integer getSubstanceusedisorders_currentcannabisdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastCannabisDependence.
	 */
	public Integer getSubstanceusedisorders_pastcannabisdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentCannabisAbuse.
	 */
	public Integer getSubstanceusedisorders_currentcannabisabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcannabisabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastCannabisAbuse.
	 */
	public Integer getSubstanceusedisorders_pastcannabisabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCannabisAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcannabisabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentCocaineDependence.
	 */
	public Integer getSubstanceusedisorders_currentcocainedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocainedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastCocaineDependence.
	 */
	public Integer getSubstanceusedisorders_pastcocainedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocainedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentCocaineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentcocaineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentcocaineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastCocaineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastcocaineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastCocaineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastcocaineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentHallucinogenDependence.
	 */
	public Integer getSubstanceusedisorders_currenthallucinogendependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogendependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastHallucinogenDependence.
	 */
	public Integer getSubstanceusedisorders_pasthallucinogendependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogendependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentHallucinogenAbuse.
	 */
	public Integer getSubstanceusedisorders_currenthallucinogenabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currenthallucinogenabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastHallucinogenAbuse.
	 */
	public Integer getSubstanceusedisorders_pasthallucinogenabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastHallucinogenAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pasthallucinogenabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentOpioidDependence.
	 */
	public Integer getSubstanceusedisorders_currentopioiddependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioiddependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastOpioidDependence.
	 */
	public Integer getSubstanceusedisorders_pastopioiddependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioiddependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentOpioidAbuse.
	 */
	public Integer getSubstanceusedisorders_currentopioidabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentopioidabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastOpioidAbuse.
	 */
	public Integer getSubstanceusedisorders_pastopioidabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOpioidAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastopioidabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentPhencyclidineDependence.
	 */
	public Integer getSubstanceusedisorders_currentphencyclidinedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidinedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastPhencyclidineDependence.
	 */
	public Integer getSubstanceusedisorders_pastphencyclidinedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidinedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentPhencyclidineAbuse.
	 */
	public Integer getSubstanceusedisorders_currentphencyclidineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentphencyclidineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastPhencyclidineAbuse.
	 */
	public Integer getSubstanceusedisorders_pastphencyclidineabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPhencyclidineAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastphencyclidineabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence.
	 */
	public Integer getSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence.
	 */
	public Integer getSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticdependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse.
	 */
	public Integer getSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentsedativehypnoticanxiolyticabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse.
	 */
	public Integer getSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastSedativeHypnoticAnxiolyticAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastsedativehypnoticanxiolyticabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentPolysubstanceDependence.
	 */
	public Integer getSubstanceusedisorders_currentpolysubstancedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentpolysubstancedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastPolysubstanceDependence.
	 */
	public Integer getSubstanceusedisorders_pastpolysubstancedependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastPolysubstanceDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastpolysubstancedependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentOtherOrUnknownDependence.
	 */
	public Integer getSubstanceusedisorders_currentotherorunknowndependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknowndependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastOtherOrUnknownDependence.
	 */
	public Integer getSubstanceusedisorders_pastotherorunknowndependence();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownDependence.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknowndependence(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/currentOtherOrUnknownAbuse.
	 */
	public Integer getSubstanceusedisorders_currentotherorunknownabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/currentOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_currentotherorunknownabuse(Integer v) ;

	/**
	 * @return Returns the substanceUseDisorders/pastOtherOrUnknownAbuse.
	 */
	public Integer getSubstanceusedisorders_pastotherorunknownabuse();

	/**
	 * Sets the value for xnat_a:scidResearchData/substanceUseDisorders/pastOtherOrUnknownAbuse.
	 * @param v Value to Set.
	 */
	public void setSubstanceusedisorders_pastotherorunknownabuse(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentPanicWithAgoraphobia.
	 */
	public Integer getAnxietydisorders_currentpanicwithagoraphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithagoraphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastPanicWithAgoraphobia.
	 */
	public Integer getAnxietydisorders_pastpanicwithagoraphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithagoraphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentPanicWithoutAgoraphobia.
	 */
	public Integer getAnxietydisorders_currentpanicwithoutagoraphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentpanicwithoutagoraphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastPanicWithoutAgoraphobia.
	 */
	public Integer getAnxietydisorders_pastpanicwithoutagoraphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPanicWithoutAgoraphobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastpanicwithoutagoraphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentAgoraphobiaWithoutPanicHx.
	 */
	public Integer getAnxietydisorders_currentagoraphobiawithoutpanichx();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentagoraphobiawithoutpanichx(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastAgoraphobiaWithoutPanicHx.
	 */
	public Integer getAnxietydisorders_pastagoraphobiawithoutpanichx();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAgoraphobiaWithoutPanicHx.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastagoraphobiawithoutpanichx(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentSocialPhobia.
	 */
	public Integer getAnxietydisorders_currentsocialphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsocialphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastSocialPhobia.
	 */
	public Integer getAnxietydisorders_pastsocialphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSocialPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsocialphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentSpecificPhobia.
	 */
	public Integer getAnxietydisorders_currentspecificphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentspecificphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastSpecificPhobia.
	 */
	public Integer getAnxietydisorders_pastspecificphobia();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSpecificPhobia.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastspecificphobia(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentOCD.
	 */
	public Integer getAnxietydisorders_currentocd();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentocd(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastOCD.
	 */
	public Integer getAnxietydisorders_pastocd();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastOCD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastocd(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentPTSD.
	 */
	public Integer getAnxietydisorders_currentptsd();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentptsd(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastPTSD.
	 */
	public Integer getAnxietydisorders_pastptsd();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastPTSD.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastptsd(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentGeneralizedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_currentgeneralizedanxietydisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentGeneralizedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentgeneralizedanxietydisorder(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentAnxietyDueToMedicalCondition.
	 */
	public Integer getAnxietydisorders_currentanxietyduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietyduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastAnxietyDueToMedicalCondition.
	 */
	public Integer getAnxietydisorders_pastanxietyduetomedicalcondition();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDueToMedicalCondition.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietyduetomedicalcondition(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentSubstanceInducedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_currentsubstanceinducedanxietydisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentsubstanceinducedanxietydisorder(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastSubstanceInducedAnxietyDisorder.
	 */
	public Integer getAnxietydisorders_pastsubstanceinducedanxietydisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastSubstanceInducedAnxietyDisorder.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastsubstanceinducedanxietydisorder(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/currentAnxietyDisorderNOS.
	 */
	public Integer getAnxietydisorders_currentanxietydisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/currentAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_currentanxietydisordernos(Integer v) ;

	/**
	 * @return Returns the anxietyDisorders/pastAnxietyDisorderNOS.
	 */
	public Integer getAnxietydisorders_pastanxietydisordernos();

	/**
	 * Sets the value for xnat_a:scidResearchData/anxietyDisorders/pastAnxietyDisorderNOS.
	 * @param v Value to Set.
	 */
	public void setAnxietydisorders_pastanxietydisordernos(Integer v) ;

	/**
	 * @return Returns the somatoformDisorders/somatizationDisorder.
	 */
	public Integer getSomatoformdisorders_somatizationdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/somatizationDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_somatizationdisorder(Integer v) ;

	/**
	 * @return Returns the somatoformDisorders/undifferentiatedSomatformDisorder.
	 */
	public Integer getSomatoformdisorders_undifferentiatedsomatformdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/undifferentiatedSomatformDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_undifferentiatedsomatformdisorder(Integer v) ;

	/**
	 * @return Returns the somatoformDisorders/painDisorder.
	 */
	public Integer getSomatoformdisorders_paindisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/painDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_paindisorder(Integer v) ;

	/**
	 * @return Returns the somatoformDisorders/hypochondriasis.
	 */
	public Integer getSomatoformdisorders_hypochondriasis();

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/hypochondriasis.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_hypochondriasis(Integer v) ;

	/**
	 * @return Returns the somatoformDisorders/bodyDysmorphicDisorder.
	 */
	public Integer getSomatoformdisorders_bodydysmorphicdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/somatoformDisorders/bodyDysmorphicDisorder.
	 * @param v Value to Set.
	 */
	public void setSomatoformdisorders_bodydysmorphicdisorder(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/currentAnorexiaNervosa.
	 */
	public Integer getEatingdisorders_currentanorexianervosa();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentanorexianervosa(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/pastAnorexiaNervosa.
	 */
	public Integer getEatingdisorders_pastanorexianervosa();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastAnorexiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastanorexianervosa(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/currentBulimiaNervosa.
	 */
	public Integer getEatingdisorders_currentbulimianervosa();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbulimianervosa(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/pastBulimiaNervosa.
	 */
	public Integer getEatingdisorders_pastbulimianervosa();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBulimiaNervosa.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbulimianervosa(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/currentBingeEatingDisorder.
	 */
	public Integer getEatingdisorders_currentbingeeatingdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/currentBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_currentbingeeatingdisorder(Integer v) ;

	/**
	 * @return Returns the eatingDisorders/pastBingeEatingDisorder.
	 */
	public Integer getEatingdisorders_pastbingeeatingdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/eatingDisorders/pastBingeEatingDisorder.
	 * @param v Value to Set.
	 */
	public void setEatingdisorders_pastbingeeatingdisorder(Integer v) ;

	/**
	 * @return Returns the adjustmentDisorder.
	 */
	public Integer getAdjustmentdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/adjustmentDisorder.
	 * @param v Value to Set.
	 */
	public void setAdjustmentdisorder(Integer v) ;

	/**
	 * @return Returns the optional/currentAcuteStressDisorder.
	 */
	public Integer getOptional_currentacutestressdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentacutestressdisorder(Integer v) ;

	/**
	 * @return Returns the optional/pastAcuteStressDisorder.
	 */
	public Integer getOptional_pastacutestressdisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastAcuteStressDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastacutestressdisorder(Integer v) ;

	/**
	 * @return Returns the optional/currentMinorDepressiveDisorder.
	 */
	public Integer getOptional_currentminordepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentminordepressivedisorder(Integer v) ;

	/**
	 * @return Returns the optional/pastMinorDepressiveDisorder.
	 */
	public Integer getOptional_pastminordepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMinorDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastminordepressivedisorder(Integer v) ;

	/**
	 * @return Returns the optional/currentMixedAnxietyDepressiveDisorder.
	 */
	public Integer getOptional_currentmixedanxietydepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/currentMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_currentmixedanxietydepressivedisorder(Integer v) ;

	/**
	 * @return Returns the optional/pastMixedAnxietyDepressiveDisorder.
	 */
	public Integer getOptional_pastmixedanxietydepressivedisorder();

	/**
	 * Sets the value for xnat_a:scidResearchData/optional/pastMixedAnxietyDepressiveDisorder.
	 * @param v Value to Set.
	 */
	public void setOptional_pastmixedanxietydepressivedisorder(Integer v) ;

	/**
	 * @return Returns the optional/pastSympomaticDetails.
	 */
	public String getOptional_pastsympomaticdetails();

	/**
	 * Sets the value for optional/pastSympomaticDetails.
	 * @param v Value to Set.
	 */
	public void setOptional_pastsympomaticdetails(String v);
}
