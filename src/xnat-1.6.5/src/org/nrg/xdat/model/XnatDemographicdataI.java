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
public interface XnatDemographicdataI extends XnatAbstractdemographicdataI {

	public String getXSIType();

	public void toXML(java.io.Writer writer) throws java.lang.Exception;

	/**
	 * @return Returns the dob.
	 */
	public Object getDob();

	/**
	 * Sets the value for dob.
	 * @param v Value to Set.
	 */
	public void setDob(Object v);

	/**
	 * @return Returns the yob.
	 */
	public Integer getYob();

	/**
	 * Sets the value for xnat:demographicData/yob.
	 * @param v Value to Set.
	 */
	public void setYob(Integer v) ;

	/**
	 * @return Returns the age.
	 */
	public Integer getAge();

	/**
	 * Sets the value for xnat:demographicData/age.
	 * @param v Value to Set.
	 */
	public void setAge(Integer v) ;

	/**
	 * @return Returns the gender.
	 */
	public String getGender();

	/**
	 * Sets the value for gender.
	 * @param v Value to Set.
	 */
	public void setGender(String v);

	/**
	 * @return Returns the handedness.
	 */
	public String getHandedness();

	/**
	 * Sets the value for handedness.
	 * @param v Value to Set.
	 */
	public void setHandedness(String v);

	/**
	 * @return Returns the ses.
	 */
	public Integer getSes();

	/**
	 * Sets the value for xnat:demographicData/ses.
	 * @param v Value to Set.
	 */
	public void setSes(Integer v) ;

	/**
	 * @return Returns the employment.
	 */
	public Integer getEmployment();

	/**
	 * Sets the value for xnat:demographicData/employment.
	 * @param v Value to Set.
	 */
	public void setEmployment(Integer v) ;

	/**
	 * @return Returns the education.
	 */
	public Integer getEducation();

	/**
	 * Sets the value for xnat:demographicData/education.
	 * @param v Value to Set.
	 */
	public void setEducation(Integer v) ;

	/**
	 * @return Returns the educationDesc.
	 */
	public String getEducationdesc();

	/**
	 * Sets the value for educationDesc.
	 * @param v Value to Set.
	 */
	public void setEducationdesc(String v);

	/**
	 * @return Returns the race.
	 */
	public String getRace();

	/**
	 * Sets the value for race.
	 * @param v Value to Set.
	 */
	public void setRace(String v);

	/**
	 * @return Returns the race2.
	 */
	public String getRace2();

	/**
	 * Sets the value for race2.
	 * @param v Value to Set.
	 */
	public void setRace2(String v);

	/**
	 * @return Returns the race3.
	 */
	public String getRace3();

	/**
	 * Sets the value for race3.
	 * @param v Value to Set.
	 */
	public void setRace3(String v);

	/**
	 * @return Returns the race4.
	 */
	public String getRace4();

	/**
	 * Sets the value for race4.
	 * @param v Value to Set.
	 */
	public void setRace4(String v);

	/**
	 * @return Returns the race5.
	 */
	public String getRace5();

	/**
	 * Sets the value for race5.
	 * @param v Value to Set.
	 */
	public void setRace5(String v);

	/**
	 * @return Returns the race6.
	 */
	public String getRace6();

	/**
	 * Sets the value for race6.
	 * @param v Value to Set.
	 */
	public void setRace6(String v);

	/**
	 * @return Returns the ethnicity.
	 */
	public String getEthnicity();

	/**
	 * Sets the value for ethnicity.
	 * @param v Value to Set.
	 */
	public void setEthnicity(String v);

	/**
	 * @return Returns the weight.
	 */
	public Double getWeight();

	/**
	 * Sets the value for weight.
	 * @param v Value to Set.
	 */
	public void setWeight(Double v);

	/**
	 * @return Returns the weight/units.
	 */
	public String getWeight_units();

	/**
	 * Sets the value for weight/units.
	 * @param v Value to Set.
	 */
	public void setWeight_units(String v);

	/**
	 * @return Returns the height.
	 */
	public Double getHeight();

	/**
	 * Sets the value for height.
	 * @param v Value to Set.
	 */
	public void setHeight(Double v);

	/**
	 * @return Returns the height/units.
	 */
	public String getHeight_units();

	/**
	 * Sets the value for height/units.
	 * @param v Value to Set.
	 */
	public void setHeight_units(String v);

	/**
	 * @return Returns the gestational_age.
	 */
	public Double getGestationalAge();

	/**
	 * Sets the value for gestational_age.
	 * @param v Value to Set.
	 */
	public void setGestationalAge(Double v);

	/**
	 * @return Returns the post_menstrual_age.
	 */
	public Double getPostMenstrualAge();

	/**
	 * Sets the value for post_menstrual_age.
	 * @param v Value to Set.
	 */
	public void setPostMenstrualAge(Double v);

	/**
	 * @return Returns the birth_weight.
	 */
	public Double getBirthWeight();

	/**
	 * Sets the value for birth_weight.
	 * @param v Value to Set.
	 */
	public void setBirthWeight(Double v);
}
