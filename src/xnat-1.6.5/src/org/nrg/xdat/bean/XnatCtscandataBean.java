/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:45:37 UTC 2015
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
public class XnatCtscandataBean extends XnatImagescandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatCtscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatCtscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:ctScanData";

	public String getSchemaElementName(){
		return "ctScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:ctScanData";
	}

	//FIELD

	private String _Parameters_voxelres_units=null;

	/**
	 * @return Returns the parameters/voxelRes/units.
	 */
	public String getParameters_voxelres_units(){
		return _Parameters_voxelres_units;
	}

	/**
	 * Sets the value for parameters/voxelRes/units.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_units(String v){
		_Parameters_voxelres_units=v;
	}

	//FIELD

	private Double _Parameters_voxelres_x=null;

	/**
	 * @return Returns the parameters/voxelRes/x.
	 */
	public Double getParameters_voxelres_x() {
		return _Parameters_voxelres_x;
	}

	/**
	 * Sets the value for parameters/voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_x(Double v){
		_Parameters_voxelres_x=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/x.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_x(String v)  {
		_Parameters_voxelres_x=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_voxelres_y=null;

	/**
	 * @return Returns the parameters/voxelRes/y.
	 */
	public Double getParameters_voxelres_y() {
		return _Parameters_voxelres_y;
	}

	/**
	 * Sets the value for parameters/voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_y(Double v){
		_Parameters_voxelres_y=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/y.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_y(String v)  {
		_Parameters_voxelres_y=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_voxelres_z=null;

	/**
	 * @return Returns the parameters/voxelRes/z.
	 */
	public Double getParameters_voxelres_z() {
		return _Parameters_voxelres_z;
	}

	/**
	 * Sets the value for parameters/voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_z(Double v){
		_Parameters_voxelres_z=v;
	}

	/**
	 * Sets the value for parameters/voxelRes/z.
	 * @param v Value to Set.
	 */
	public void setParameters_voxelres_z(String v)  {
		_Parameters_voxelres_z=formatDouble(v);
	}

	//FIELD

	private String _Parameters_orientation=null;

	/**
	 * @return Returns the parameters/orientation.
	 */
	public String getParameters_orientation(){
		return _Parameters_orientation;
	}

	/**
	 * Sets the value for parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(String v){
		_Parameters_orientation=v;
	}

	//FIELD

	private Integer _Parameters_fov_x=null;

	/**
	 * @return Returns the parameters/fov/x.
	 */
	public Integer getParameters_fov_x(){
		return _Parameters_fov_x;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) {
		_Parameters_fov_x=v;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(String v)  {
		_Parameters_fov_x=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_fov_y=null;

	/**
	 * @return Returns the parameters/fov/y.
	 */
	public Integer getParameters_fov_y(){
		return _Parameters_fov_y;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) {
		_Parameters_fov_y=v;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(String v)  {
		_Parameters_fov_y=formatInteger(v);
	}

	//FIELD

	private String _Parameters_rescale_intercept=null;

	/**
	 * @return Returns the parameters/rescale/intercept.
	 */
	public String getParameters_rescale_intercept(){
		return _Parameters_rescale_intercept;
	}

	/**
	 * Sets the value for parameters/rescale/intercept.
	 * @param v Value to Set.
	 */
	public void setParameters_rescale_intercept(String v){
		_Parameters_rescale_intercept=v;
	}

	//FIELD

	private String _Parameters_rescale_slope=null;

	/**
	 * @return Returns the parameters/rescale/slope.
	 */
	public String getParameters_rescale_slope(){
		return _Parameters_rescale_slope;
	}

	/**
	 * Sets the value for parameters/rescale/slope.
	 * @param v Value to Set.
	 */
	public void setParameters_rescale_slope(String v){
		_Parameters_rescale_slope=v;
	}

	//FIELD

	private Double _Parameters_kvp=null;

	/**
	 * @return Returns the parameters/kvp.
	 */
	public Double getParameters_kvp() {
		return _Parameters_kvp;
	}

	/**
	 * Sets the value for parameters/kvp.
	 * @param v Value to Set.
	 */
	public void setParameters_kvp(Double v){
		_Parameters_kvp=v;
	}

	/**
	 * Sets the value for parameters/kvp.
	 * @param v Value to Set.
	 */
	public void setParameters_kvp(String v)  {
		_Parameters_kvp=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_acquisitionnumber=null;

	/**
	 * @return Returns the parameters/acquisitionNumber.
	 */
	public Integer getParameters_acquisitionnumber(){
		return _Parameters_acquisitionnumber;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/acquisitionNumber.
	 * @param v Value to Set.
	 */
	public void setParameters_acquisitionnumber(Integer v) {
		_Parameters_acquisitionnumber=v;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters/acquisitionNumber.
	 * @param v Value to Set.
	 */
	public void setParameters_acquisitionnumber(String v)  {
		_Parameters_acquisitionnumber=formatInteger(v);
	}

	//FIELD

	private String _Parameters_imagetype=null;

	/**
	 * @return Returns the parameters/imageType.
	 */
	public String getParameters_imagetype(){
		return _Parameters_imagetype;
	}

	/**
	 * Sets the value for parameters/imageType.
	 * @param v Value to Set.
	 */
	public void setParameters_imagetype(String v){
		_Parameters_imagetype=v;
	}

	//FIELD

	private String _Parameters_options=null;

	/**
	 * @return Returns the parameters/options.
	 */
	public String getParameters_options(){
		return _Parameters_options;
	}

	/**
	 * Sets the value for parameters/options.
	 * @param v Value to Set.
	 */
	public void setParameters_options(String v){
		_Parameters_options=v;
	}

	//FIELD

	private Double _Parameters_collectiondiameter=null;

	/**
	 * @return Returns the parameters/collectionDiameter.
	 */
	public Double getParameters_collectiondiameter() {
		return _Parameters_collectiondiameter;
	}

	/**
	 * Sets the value for parameters/collectionDiameter.
	 * @param v Value to Set.
	 */
	public void setParameters_collectiondiameter(Double v){
		_Parameters_collectiondiameter=v;
	}

	/**
	 * Sets the value for parameters/collectionDiameter.
	 * @param v Value to Set.
	 */
	public void setParameters_collectiondiameter(String v)  {
		_Parameters_collectiondiameter=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_distancesourcetodetector=null;

	/**
	 * @return Returns the parameters/distanceSourceToDetector.
	 */
	public Double getParameters_distancesourcetodetector() {
		return _Parameters_distancesourcetodetector;
	}

	/**
	 * Sets the value for parameters/distanceSourceToDetector.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetodetector(Double v){
		_Parameters_distancesourcetodetector=v;
	}

	/**
	 * Sets the value for parameters/distanceSourceToDetector.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetodetector(String v)  {
		_Parameters_distancesourcetodetector=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_distancesourcetopatient=null;

	/**
	 * @return Returns the parameters/distanceSourceToPatient.
	 */
	public Double getParameters_distancesourcetopatient() {
		return _Parameters_distancesourcetopatient;
	}

	/**
	 * Sets the value for parameters/distanceSourceToPatient.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetopatient(Double v){
		_Parameters_distancesourcetopatient=v;
	}

	/**
	 * Sets the value for parameters/distanceSourceToPatient.
	 * @param v Value to Set.
	 */
	public void setParameters_distancesourcetopatient(String v)  {
		_Parameters_distancesourcetopatient=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_gantrytilt=null;

	/**
	 * @return Returns the parameters/gantryTilt.
	 */
	public Double getParameters_gantrytilt() {
		return _Parameters_gantrytilt;
	}

	/**
	 * Sets the value for parameters/gantryTilt.
	 * @param v Value to Set.
	 */
	public void setParameters_gantrytilt(Double v){
		_Parameters_gantrytilt=v;
	}

	/**
	 * Sets the value for parameters/gantryTilt.
	 * @param v Value to Set.
	 */
	public void setParameters_gantrytilt(String v)  {
		_Parameters_gantrytilt=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_tableheight=null;

	/**
	 * @return Returns the parameters/tableHeight.
	 */
	public Double getParameters_tableheight() {
		return _Parameters_tableheight;
	}

	/**
	 * Sets the value for parameters/tableHeight.
	 * @param v Value to Set.
	 */
	public void setParameters_tableheight(Double v){
		_Parameters_tableheight=v;
	}

	/**
	 * Sets the value for parameters/tableHeight.
	 * @param v Value to Set.
	 */
	public void setParameters_tableheight(String v)  {
		_Parameters_tableheight=formatDouble(v);
	}

	//FIELD

	private String _Parameters_rotationdirection=null;

	/**
	 * @return Returns the parameters/rotationDirection.
	 */
	public String getParameters_rotationdirection(){
		return _Parameters_rotationdirection;
	}

	/**
	 * Sets the value for parameters/rotationDirection.
	 * @param v Value to Set.
	 */
	public void setParameters_rotationdirection(String v){
		_Parameters_rotationdirection=v;
	}

	//FIELD

	private Double _Parameters_exposuretime=null;

	/**
	 * @return Returns the parameters/exposureTime.
	 */
	public Double getParameters_exposuretime() {
		return _Parameters_exposuretime;
	}

	/**
	 * Sets the value for parameters/exposureTime.
	 * @param v Value to Set.
	 */
	public void setParameters_exposuretime(Double v){
		_Parameters_exposuretime=v;
	}

	/**
	 * Sets the value for parameters/exposureTime.
	 * @param v Value to Set.
	 */
	public void setParameters_exposuretime(String v)  {
		_Parameters_exposuretime=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_xraytubecurrent=null;

	/**
	 * @return Returns the parameters/xrayTubeCurrent.
	 */
	public Double getParameters_xraytubecurrent() {
		return _Parameters_xraytubecurrent;
	}

	/**
	 * Sets the value for parameters/xrayTubeCurrent.
	 * @param v Value to Set.
	 */
	public void setParameters_xraytubecurrent(Double v){
		_Parameters_xraytubecurrent=v;
	}

	/**
	 * Sets the value for parameters/xrayTubeCurrent.
	 * @param v Value to Set.
	 */
	public void setParameters_xraytubecurrent(String v)  {
		_Parameters_xraytubecurrent=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_exposure=null;

	/**
	 * @return Returns the parameters/exposure.
	 */
	public Double getParameters_exposure() {
		return _Parameters_exposure;
	}

	/**
	 * Sets the value for parameters/exposure.
	 * @param v Value to Set.
	 */
	public void setParameters_exposure(Double v){
		_Parameters_exposure=v;
	}

	/**
	 * Sets the value for parameters/exposure.
	 * @param v Value to Set.
	 */
	public void setParameters_exposure(String v)  {
		_Parameters_exposure=formatDouble(v);
	}

	//FIELD

	private String _Parameters_filter=null;

	/**
	 * @return Returns the parameters/filter.
	 */
	public String getParameters_filter(){
		return _Parameters_filter;
	}

	/**
	 * Sets the value for parameters/filter.
	 * @param v Value to Set.
	 */
	public void setParameters_filter(String v){
		_Parameters_filter=v;
	}

	//FIELD

	private Double _Parameters_generatorpower=null;

	/**
	 * @return Returns the parameters/generatorPower.
	 */
	public Double getParameters_generatorpower() {
		return _Parameters_generatorpower;
	}

	/**
	 * Sets the value for parameters/generatorPower.
	 * @param v Value to Set.
	 */
	public void setParameters_generatorpower(Double v){
		_Parameters_generatorpower=v;
	}

	/**
	 * Sets the value for parameters/generatorPower.
	 * @param v Value to Set.
	 */
	public void setParameters_generatorpower(String v)  {
		_Parameters_generatorpower=formatDouble(v);
	}
	 private List<org.nrg.xdat.bean.XnatCtscandataFocalspotBean> _Parameters_focalspots_focalspot =new ArrayList<org.nrg.xdat.bean.XnatCtscandataFocalspotBean>();

	/**
	 * parameters/focalSpots/focalSpot
	 * @return Returns an List of org.nrg.xdat.bean.XnatCtscandataFocalspotBean
	 */
	public <A extends org.nrg.xdat.model.XnatCtscandataFocalspotI> List<A> getParameters_focalspots_focalspot() {
		return (List<A>) _Parameters_focalspots_focalspot;
	}

	/**
	 * Sets the value for parameters/focalSpots/focalSpot.
	 * @param v Value to Set.
	 */
	public void setParameters_focalspots_focalspot(ArrayList<org.nrg.xdat.bean.XnatCtscandataFocalspotBean> v){
		_Parameters_focalspots_focalspot=v;
	}

	/**
	 * Adds the value for parameters/focalSpots/focalSpot.
	 * @param v Value to Set.
	 */
	public void addParameters_focalspots_focalspot(org.nrg.xdat.bean.XnatCtscandataFocalspotBean v){
		_Parameters_focalspots_focalspot.add(v);
	}

	/**
	 * parameters/focalSpots/focalSpot
	 * Adds org.nrg.xdat.model.XnatCtscandataFocalspotI
	 */
	public <A extends org.nrg.xdat.model.XnatCtscandataFocalspotI> void addParameters_focalspots_focalspot(A item) throws Exception{
	_Parameters_focalspots_focalspot.add((org.nrg.xdat.bean.XnatCtscandataFocalspotBean)item);
	}

	/**
	 * Adds the value for parameters/focalSpots/focalSpot.
	 * @param v Value to Set.
	 */
	public void addParameters_focalspots_focalspot(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatCtscandataFocalspotBean)
			_Parameters_focalspots_focalspot.add((org.nrg.xdat.bean.XnatCtscandataFocalspotBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatCtscandataFocalspotBean");
	}

	//FIELD

	private String _Parameters_convolutionkernel=null;

	/**
	 * @return Returns the parameters/convolutionKernel.
	 */
	public String getParameters_convolutionkernel(){
		return _Parameters_convolutionkernel;
	}

	/**
	 * Sets the value for parameters/convolutionKernel.
	 * @param v Value to Set.
	 */
	public void setParameters_convolutionkernel(String v){
		_Parameters_convolutionkernel=v;
	}

	//FIELD

	private Double _Parameters_collimationwidth_single=null;

	/**
	 * @return Returns the parameters/collimationWidth/single.
	 */
	public Double getParameters_collimationwidth_single() {
		return _Parameters_collimationwidth_single;
	}

	/**
	 * Sets the value for parameters/collimationWidth/single.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_single(Double v){
		_Parameters_collimationwidth_single=v;
	}

	/**
	 * Sets the value for parameters/collimationWidth/single.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_single(String v)  {
		_Parameters_collimationwidth_single=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_collimationwidth_total=null;

	/**
	 * @return Returns the parameters/collimationWidth/total.
	 */
	public Double getParameters_collimationwidth_total() {
		return _Parameters_collimationwidth_total;
	}

	/**
	 * Sets the value for parameters/collimationWidth/total.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_total(Double v){
		_Parameters_collimationwidth_total=v;
	}

	/**
	 * Sets the value for parameters/collimationWidth/total.
	 * @param v Value to Set.
	 */
	public void setParameters_collimationwidth_total(String v)  {
		_Parameters_collimationwidth_total=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_tablespeed=null;

	/**
	 * @return Returns the parameters/tableSpeed.
	 */
	public Double getParameters_tablespeed() {
		return _Parameters_tablespeed;
	}

	/**
	 * Sets the value for parameters/tableSpeed.
	 * @param v Value to Set.
	 */
	public void setParameters_tablespeed(Double v){
		_Parameters_tablespeed=v;
	}

	/**
	 * Sets the value for parameters/tableSpeed.
	 * @param v Value to Set.
	 */
	public void setParameters_tablespeed(String v)  {
		_Parameters_tablespeed=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_tablefeedperrotation=null;

	/**
	 * @return Returns the parameters/tableFeedPerRotation.
	 */
	public Double getParameters_tablefeedperrotation() {
		return _Parameters_tablefeedperrotation;
	}

	/**
	 * Sets the value for parameters/tableFeedPerRotation.
	 * @param v Value to Set.
	 */
	public void setParameters_tablefeedperrotation(Double v){
		_Parameters_tablefeedperrotation=v;
	}

	/**
	 * Sets the value for parameters/tableFeedPerRotation.
	 * @param v Value to Set.
	 */
	public void setParameters_tablefeedperrotation(String v)  {
		_Parameters_tablefeedperrotation=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_pitchfactor=null;

	/**
	 * @return Returns the parameters/pitchFactor.
	 */
	public Double getParameters_pitchfactor() {
		return _Parameters_pitchfactor;
	}

	/**
	 * Sets the value for parameters/pitchFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_pitchfactor(Double v){
		_Parameters_pitchfactor=v;
	}

	/**
	 * Sets the value for parameters/pitchFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_pitchfactor(String v)  {
		_Parameters_pitchfactor=formatDouble(v);
	}

	//FIELD

	private String _Parameters_estimateddosesaving_modulation=null;

	/**
	 * @return Returns the parameters/estimatedDoseSaving/modulation.
	 */
	public String getParameters_estimateddosesaving_modulation(){
		return _Parameters_estimateddosesaving_modulation;
	}

	/**
	 * Sets the value for parameters/estimatedDoseSaving/modulation.
	 * @param v Value to Set.
	 */
	public void setParameters_estimateddosesaving_modulation(String v){
		_Parameters_estimateddosesaving_modulation=v;
	}

	//FIELD

	private Double _Parameters_estimateddosesaving=null;

	/**
	 * @return Returns the parameters/estimatedDoseSaving.
	 */
	public Double getParameters_estimateddosesaving() {
		return _Parameters_estimateddosesaving;
	}

	/**
	 * Sets the value for parameters/estimatedDoseSaving.
	 * @param v Value to Set.
	 */
	public void setParameters_estimateddosesaving(Double v){
		_Parameters_estimateddosesaving=v;
	}

	/**
	 * Sets the value for parameters/estimatedDoseSaving.
	 * @param v Value to Set.
	 */
	public void setParameters_estimateddosesaving(String v)  {
		_Parameters_estimateddosesaving=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_ctdivol=null;

	/**
	 * @return Returns the parameters/ctDIvol.
	 */
	public Double getParameters_ctdivol() {
		return _Parameters_ctdivol;
	}

	/**
	 * Sets the value for parameters/ctDIvol.
	 * @param v Value to Set.
	 */
	public void setParameters_ctdivol(Double v){
		_Parameters_ctdivol=v;
	}

	/**
	 * Sets the value for parameters/ctDIvol.
	 * @param v Value to Set.
	 */
	public void setParameters_ctdivol(String v)  {
		_Parameters_ctdivol=formatDouble(v);
	}

	//FIELD

	private String _Parameters_derivation=null;

	/**
	 * @return Returns the parameters/derivation.
	 */
	public String getParameters_derivation(){
		return _Parameters_derivation;
	}

	/**
	 * Sets the value for parameters/derivation.
	 * @param v Value to Set.
	 */
	public void setParameters_derivation(String v){
		_Parameters_derivation=v;
	}
	 private org.nrg.xdat.bean.XnatContrastbolusBean _Parameters_contrastbolus =null;

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.bean.XnatContrastbolusBean
	 */
	public org.nrg.xdat.bean.XnatContrastbolusBean getParameters_contrastbolus() {
		return _Parameters_contrastbolus;
	}

	/**
	 * Sets the value for parameters/contrastBolus.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolus(org.nrg.xdat.bean.XnatContrastbolusBean v){
		_Parameters_contrastbolus =v;
	}

	/**
	 * Sets the value for parameters/contrastBolus.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolus(Object v) {
		if (v instanceof org.nrg.xdat.bean.XnatContrastbolusBean)
			_Parameters_contrastbolus =(org.nrg.xdat.bean.XnatContrastbolusBean)v;
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatContrastbolusBean");
	}

	/**
	 * parameters/contrastBolus
	 * @return org.nrg.xdat.model.XnatContrastbolusI
	 */
	public <A extends org.nrg.xdat.model.XnatContrastbolusI> void setParameters_contrastbolus(A item) throws Exception{
	setParameters_contrastbolus((org.nrg.xdat.bean.XnatContrastbolusBean)item);
	}

	//FIELD

	private Integer _Parameters_contrastbolusFK=null;

	/**
	 * @return Returns the xnat:ctScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 */
	public Integer getParameters_contrastbolusFK(){
		return _Parameters_contrastbolusFK;
	}

	/**
	 * Sets the value for xnat:ctScanData/parameters_contrastbolus_xnat_contrastbolus_id.
	 * @param v Value to Set.
	 */
	public void setParameters_contrastbolusFK(Integer v) {
		_Parameters_contrastbolusFK=v;
	}

	//FIELD

	private String _Dcmvalidation=null;

	/**
	 * @return Returns the dcmValidation.
	 */
	public String getDcmvalidation(){
		return _Dcmvalidation;
	}

	/**
	 * Sets the value for dcmValidation.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation(String v){
		_Dcmvalidation=v;
	}

	//FIELD

	private Boolean _Dcmvalidation_status=null;

	/**
	 * @return Returns the dcmValidation/status.
	 */
	public Boolean getDcmvalidation_status() {
		return _Dcmvalidation_status;
	}

	/**
	 * Sets the value for dcmValidation/status.
	 * @param v Value to Set.
	 */
	public void setDcmvalidation_status(Object v){
		if(v instanceof Boolean){
			_Dcmvalidation_status=(Boolean)v;
		}else if(v instanceof String){
			_Dcmvalidation_status=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/voxelRes/units")){
			setParameters_voxelres_units(v);
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			setParameters_voxelres_x(v);
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			setParameters_voxelres_y(v);
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			setParameters_voxelres_z(v);
		}else if (xmlPath.equals("parameters/orientation")){
			setParameters_orientation(v);
		}else if (xmlPath.equals("parameters/fov/x")){
			setParameters_fov_x(v);
		}else if (xmlPath.equals("parameters/fov/y")){
			setParameters_fov_y(v);
		}else if (xmlPath.equals("parameters/rescale/intercept")){
			setParameters_rescale_intercept(v);
		}else if (xmlPath.equals("parameters/rescale/slope")){
			setParameters_rescale_slope(v);
		}else if (xmlPath.equals("parameters/kvp")){
			setParameters_kvp(v);
		}else if (xmlPath.equals("parameters/acquisitionNumber")){
			setParameters_acquisitionnumber(v);
		}else if (xmlPath.equals("parameters/imageType")){
			setParameters_imagetype(v);
		}else if (xmlPath.equals("parameters/options")){
			setParameters_options(v);
		}else if (xmlPath.equals("parameters/collectionDiameter")){
			setParameters_collectiondiameter(v);
		}else if (xmlPath.equals("parameters/distanceSourceToDetector")){
			setParameters_distancesourcetodetector(v);
		}else if (xmlPath.equals("parameters/distanceSourceToPatient")){
			setParameters_distancesourcetopatient(v);
		}else if (xmlPath.equals("parameters/gantryTilt")){
			setParameters_gantrytilt(v);
		}else if (xmlPath.equals("parameters/tableHeight")){
			setParameters_tableheight(v);
		}else if (xmlPath.equals("parameters/rotationDirection")){
			setParameters_rotationdirection(v);
		}else if (xmlPath.equals("parameters/exposureTime")){
			setParameters_exposuretime(v);
		}else if (xmlPath.equals("parameters/xrayTubeCurrent")){
			setParameters_xraytubecurrent(v);
		}else if (xmlPath.equals("parameters/exposure")){
			setParameters_exposure(v);
		}else if (xmlPath.equals("parameters/filter")){
			setParameters_filter(v);
		}else if (xmlPath.equals("parameters/generatorPower")){
			setParameters_generatorpower(v);
		}else if (xmlPath.equals("parameters/convolutionKernel")){
			setParameters_convolutionkernel(v);
		}else if (xmlPath.equals("parameters/collimationWidth/single")){
			setParameters_collimationwidth_single(v);
		}else if (xmlPath.equals("parameters/collimationWidth/total")){
			setParameters_collimationwidth_total(v);
		}else if (xmlPath.equals("parameters/tableSpeed")){
			setParameters_tablespeed(v);
		}else if (xmlPath.equals("parameters/tableFeedPerRotation")){
			setParameters_tablefeedperrotation(v);
		}else if (xmlPath.equals("parameters/pitchFactor")){
			setParameters_pitchfactor(v);
		}else if (xmlPath.equals("parameters/estimatedDoseSaving/modulation")){
			setParameters_estimateddosesaving_modulation(v);
		}else if (xmlPath.equals("parameters/estimatedDoseSaving")){
			setParameters_estimateddosesaving(v);
		}else if (xmlPath.equals("parameters/ctDIvol")){
			setParameters_ctdivol(v);
		}else if (xmlPath.equals("parameters/derivation")){
			setParameters_derivation(v);
		}else if (xmlPath.equals("dcmValidation")){
			setDcmvalidation(v);
		}else if (xmlPath.equals("dcmValidation/status")){
			setDcmvalidation_status(v);
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
		if (xmlPath.equals("parameters/focalSpots/focalSpot")){
			addParameters_focalspots_focalspot(v);
		}else if (xmlPath.equals("parameters/contrastBolus")){
			setParameters_contrastbolus(v);
		}
		else{
			super.setReferenceField(xmlPath,v);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public Object getDataFieldValue(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/voxelRes/units")){
			return getParameters_voxelres_units();
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			return getParameters_voxelres_x();
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			return getParameters_voxelres_y();
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			return getParameters_voxelres_z();
		}else if (xmlPath.equals("parameters/orientation")){
			return getParameters_orientation();
		}else if (xmlPath.equals("parameters/fov/x")){
			return getParameters_fov_x();
		}else if (xmlPath.equals("parameters/fov/y")){
			return getParameters_fov_y();
		}else if (xmlPath.equals("parameters/rescale/intercept")){
			return getParameters_rescale_intercept();
		}else if (xmlPath.equals("parameters/rescale/slope")){
			return getParameters_rescale_slope();
		}else if (xmlPath.equals("parameters/kvp")){
			return getParameters_kvp();
		}else if (xmlPath.equals("parameters/acquisitionNumber")){
			return getParameters_acquisitionnumber();
		}else if (xmlPath.equals("parameters/imageType")){
			return getParameters_imagetype();
		}else if (xmlPath.equals("parameters/options")){
			return getParameters_options();
		}else if (xmlPath.equals("parameters/collectionDiameter")){
			return getParameters_collectiondiameter();
		}else if (xmlPath.equals("parameters/distanceSourceToDetector")){
			return getParameters_distancesourcetodetector();
		}else if (xmlPath.equals("parameters/distanceSourceToPatient")){
			return getParameters_distancesourcetopatient();
		}else if (xmlPath.equals("parameters/gantryTilt")){
			return getParameters_gantrytilt();
		}else if (xmlPath.equals("parameters/tableHeight")){
			return getParameters_tableheight();
		}else if (xmlPath.equals("parameters/rotationDirection")){
			return getParameters_rotationdirection();
		}else if (xmlPath.equals("parameters/exposureTime")){
			return getParameters_exposuretime();
		}else if (xmlPath.equals("parameters/xrayTubeCurrent")){
			return getParameters_xraytubecurrent();
		}else if (xmlPath.equals("parameters/exposure")){
			return getParameters_exposure();
		}else if (xmlPath.equals("parameters/filter")){
			return getParameters_filter();
		}else if (xmlPath.equals("parameters/generatorPower")){
			return getParameters_generatorpower();
		}else if (xmlPath.equals("parameters/convolutionKernel")){
			return getParameters_convolutionkernel();
		}else if (xmlPath.equals("parameters/collimationWidth/single")){
			return getParameters_collimationwidth_single();
		}else if (xmlPath.equals("parameters/collimationWidth/total")){
			return getParameters_collimationwidth_total();
		}else if (xmlPath.equals("parameters/tableSpeed")){
			return getParameters_tablespeed();
		}else if (xmlPath.equals("parameters/tableFeedPerRotation")){
			return getParameters_tablefeedperrotation();
		}else if (xmlPath.equals("parameters/pitchFactor")){
			return getParameters_pitchfactor();
		}else if (xmlPath.equals("parameters/estimatedDoseSaving/modulation")){
			return getParameters_estimateddosesaving_modulation();
		}else if (xmlPath.equals("parameters/estimatedDoseSaving")){
			return getParameters_estimateddosesaving();
		}else if (xmlPath.equals("parameters/ctDIvol")){
			return getParameters_ctdivol();
		}else if (xmlPath.equals("parameters/derivation")){
			return getParameters_derivation();
		}else if (xmlPath.equals("dcmValidation")){
			return getDcmvalidation();
		}else if (xmlPath.equals("dcmValidation/status")){
			return getDcmvalidation_status();
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
		if (xmlPath.equals("parameters/focalSpots/focalSpot")){
			return getParameters_focalspots_focalspot();
		}else if (xmlPath.equals("parameters/contrastBolus")){
			return getParameters_contrastbolus();
		}
		else{
			return super.getReferenceField(xmlPath);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public String getReferenceFieldName(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/focalSpots/focalSpot")){
			return "http://nrg.wustl.edu/xnat:ctScanData_focalSpot";
		}else if (xmlPath.equals("parameters/contrastBolus")){
			return "http://nrg.wustl.edu/xnat:contrastBolus";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/voxelRes/units")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/orientation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fov/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/rescale/intercept")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/rescale/slope")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/kvp")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/acquisitionNumber")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/imageType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/options")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/collectionDiameter")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/distanceSourceToDetector")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/distanceSourceToPatient")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/gantryTilt")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/tableHeight")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/rotationDirection")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/exposureTime")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/xrayTubeCurrent")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/exposure")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/filter")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/generatorPower")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/focalSpots/focalSpot")){
			return BaseElement.field_inline_repeater;
		}else if (xmlPath.equals("parameters/convolutionKernel")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/collimationWidth/single")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/collimationWidth/total")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/tableSpeed")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/tableFeedPerRotation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pitchFactor")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/estimatedDoseSaving/modulation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/estimatedDoseSaving")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ctDIvol")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/derivation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/contrastBolus")){
			return BaseElement.field_single_reference;
		}else if (xmlPath.equals("dcmValidation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("dcmValidation/status")){
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
		all_fields.add("parameters/voxelRes/units");
		all_fields.add("parameters/voxelRes/x");
		all_fields.add("parameters/voxelRes/y");
		all_fields.add("parameters/voxelRes/z");
		all_fields.add("parameters/orientation");
		all_fields.add("parameters/fov/x");
		all_fields.add("parameters/fov/y");
		all_fields.add("parameters/rescale/intercept");
		all_fields.add("parameters/rescale/slope");
		all_fields.add("parameters/kvp");
		all_fields.add("parameters/acquisitionNumber");
		all_fields.add("parameters/imageType");
		all_fields.add("parameters/options");
		all_fields.add("parameters/collectionDiameter");
		all_fields.add("parameters/distanceSourceToDetector");
		all_fields.add("parameters/distanceSourceToPatient");
		all_fields.add("parameters/gantryTilt");
		all_fields.add("parameters/tableHeight");
		all_fields.add("parameters/rotationDirection");
		all_fields.add("parameters/exposureTime");
		all_fields.add("parameters/xrayTubeCurrent");
		all_fields.add("parameters/exposure");
		all_fields.add("parameters/filter");
		all_fields.add("parameters/generatorPower");
		all_fields.add("parameters/focalSpots/focalSpot");
		all_fields.add("parameters/convolutionKernel");
		all_fields.add("parameters/collimationWidth/single");
		all_fields.add("parameters/collimationWidth/total");
		all_fields.add("parameters/tableSpeed");
		all_fields.add("parameters/tableFeedPerRotation");
		all_fields.add("parameters/pitchFactor");
		all_fields.add("parameters/estimatedDoseSaving/modulation");
		all_fields.add("parameters/estimatedDoseSaving");
		all_fields.add("parameters/ctDIvol");
		all_fields.add("parameters/derivation");
		all_fields.add("parameters/contrastBolus");
		all_fields.add("dcmValidation");
		all_fields.add("dcmValidation/status");
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
		writer.write("\n<xnat:CTScan");
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
		writer.write("\n</xnat:CTScan>");
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
		//REFERENCE FROM ctScanData -> imageScanData
			int child0=0;
			int att0=0;
			child0+=_Parameters_focalspots_focalspot.size();
			if(_Parameters_derivation!=null)
			child0++;
			if(_Parameters_ctdivol!=null)
			child0++;
			if(_Parameters_rescale_intercept!=null)
			child0++;
			if(_Parameters_imagetype!=null)
			child0++;
			if(_Parameters_acquisitionnumber!=null)
			child0++;
			if(_Parameters_fov_y!=null)
			child0++;
			if(_Parameters_fov_x!=null)
			child0++;
			if(_Parameters_estimateddosesaving!=null)
			child0++;
			if(_Parameters_collimationwidth_total!=null)
			child0++;
			if(_Parameters_contrastbolus!=null)
			child0++;
			if(_Parameters_pitchfactor!=null)
			child0++;
			if(_Parameters_rescale_slope!=null)
			child0++;
			if(_Parameters_filter!=null)
			child0++;
			if(_Parameters_exposuretime!=null)
			child0++;
			if(_Parameters_convolutionkernel!=null)
			child0++;
			if(_Parameters_collimationwidth_single!=null)
			child0++;
			if(_Parameters_distancesourcetodetector!=null)
			child0++;
			if(_Parameters_collectiondiameter!=null)
			child0++;
			if(_Parameters_exposure!=null)
			child0++;
			if(_Parameters_voxelres_z!=null)
			child0++;
			if(_Parameters_tableheight!=null)
			child0++;
			if(_Parameters_voxelres_y!=null)
			child0++;
			if(_Parameters_generatorpower!=null)
			child0++;
			if(_Parameters_voxelres_x!=null)
			child0++;
			if(_Parameters_distancesourcetopatient!=null)
			child0++;
			if(_Parameters_rotationdirection!=null)
			child0++;
			if(_Parameters_kvp!=null)
			child0++;
			if(_Parameters_xraytubecurrent!=null)
			child0++;
			if(_Parameters_orientation!=null)
			child0++;
			if(_Parameters_estimateddosesaving_modulation!=null)
			child0++;
			if(_Parameters_options!=null)
			child0++;
			if(_Parameters_tablefeedperrotation!=null)
			child0++;
			if(_Parameters_voxelres_units!=null)
			child0++;
			if(_Parameters_tablespeed!=null)
			child0++;
			if(_Parameters_gantrytilt!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:parameters");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		TreeMap Parameters_voxelresATTMap = new TreeMap();
		String Parameters_voxelresATT = new String();
		if (_Parameters_voxelres_units!=null)
			Parameters_voxelresATTMap.put("units",ValueParser(_Parameters_voxelres_units,"string"));
		if (_Parameters_voxelres_x!=null)
			Parameters_voxelresATTMap.put("x",ValueParser(_Parameters_voxelres_x,"float"));
		if (_Parameters_voxelres_y!=null)
			Parameters_voxelresATTMap.put("y",ValueParser(_Parameters_voxelres_y,"float"));
		if (_Parameters_voxelres_z!=null)
			Parameters_voxelresATTMap.put("z",ValueParser(_Parameters_voxelres_z,"float"));
		java.util.Iterator iter1 =Parameters_voxelresATTMap.keySet().iterator();
		while(iter1.hasNext()){
			String key = (String)iter1.next();
			Parameters_voxelresATT +=" " + key + "=\"" + Parameters_voxelresATTMap.get(key) + "\"";
		}
		if(!Parameters_voxelresATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:voxelRes");
			writer.write(Parameters_voxelresATT);
			writer.write("/>");
		}

		if (_Parameters_orientation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:orientation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_orientation,"string"));
			writer.write("</xnat:orientation>");
			header--;
		}
		TreeMap Parameters_fovATTMap = new TreeMap();
		String Parameters_fovATT = new String();
		if (_Parameters_fov_x!=null)
			Parameters_fovATTMap.put("x",ValueParser(_Parameters_fov_x,"integer"));
		if (_Parameters_fov_y!=null)
			Parameters_fovATTMap.put("y",ValueParser(_Parameters_fov_y,"integer"));
		java.util.Iterator iter2 =Parameters_fovATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			Parameters_fovATT +=" " + key + "=\"" + Parameters_fovATTMap.get(key) + "\"";
		}
		if(!Parameters_fovATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:fov");
			writer.write(Parameters_fovATT);
			writer.write("/>");
		}

			int child3=0;
			int att3=0;
			if(_Parameters_rescale_intercept!=null)
			child3++;
			if(_Parameters_rescale_slope!=null)
			child3++;
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat:rescale");
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Parameters_rescale_intercept!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:intercept");
			writer.write(">");
			writer.write(ValueParser(_Parameters_rescale_intercept,"string"));
			writer.write("</xnat:intercept>");
			header--;
		}
		if (_Parameters_rescale_slope!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:slope");
			writer.write(">");
			writer.write(ValueParser(_Parameters_rescale_slope,"string"));
			writer.write("</xnat:slope>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:rescale>");
			}
			}

		if (_Parameters_kvp!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:kvp");
			writer.write(">");
			writer.write(ValueParser(_Parameters_kvp,"float"));
			writer.write("</xnat:kvp>");
			header--;
		}
		if (_Parameters_acquisitionnumber!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acquisitionNumber");
			writer.write(">");
			writer.write(ValueParser(_Parameters_acquisitionnumber,"integer"));
			writer.write("</xnat:acquisitionNumber>");
			header--;
		}
		if (_Parameters_imagetype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_imagetype,"string"));
			writer.write("</xnat:imageType>");
			header--;
		}
		if (_Parameters_options!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:options");
			writer.write(">");
			writer.write(ValueParser(_Parameters_options,"string"));
			writer.write("</xnat:options>");
			header--;
		}
		if (_Parameters_collectiondiameter!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:collectionDiameter");
			writer.write(">");
			writer.write(ValueParser(_Parameters_collectiondiameter,"float"));
			writer.write("</xnat:collectionDiameter>");
			header--;
		}
		if (_Parameters_distancesourcetodetector!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:distanceSourceToDetector");
			writer.write(">");
			writer.write(ValueParser(_Parameters_distancesourcetodetector,"float"));
			writer.write("</xnat:distanceSourceToDetector>");
			header--;
		}
		if (_Parameters_distancesourcetopatient!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:distanceSourceToPatient");
			writer.write(">");
			writer.write(ValueParser(_Parameters_distancesourcetopatient,"float"));
			writer.write("</xnat:distanceSourceToPatient>");
			header--;
		}
		if (_Parameters_gantrytilt!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:gantryTilt");
			writer.write(">");
			writer.write(ValueParser(_Parameters_gantrytilt,"float"));
			writer.write("</xnat:gantryTilt>");
			header--;
		}
		if (_Parameters_tableheight!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:tableHeight");
			writer.write(">");
			writer.write(ValueParser(_Parameters_tableheight,"float"));
			writer.write("</xnat:tableHeight>");
			header--;
		}
		if (_Parameters_rotationdirection!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rotationDirection");
			writer.write(">");
			writer.write(ValueParser(_Parameters_rotationdirection,"string"));
			writer.write("</xnat:rotationDirection>");
			header--;
		}
		if (_Parameters_exposuretime!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:exposureTime");
			writer.write(">");
			writer.write(ValueParser(_Parameters_exposuretime,"float"));
			writer.write("</xnat:exposureTime>");
			header--;
		}
		if (_Parameters_xraytubecurrent!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:xrayTubeCurrent");
			writer.write(">");
			writer.write(ValueParser(_Parameters_xraytubecurrent,"float"));
			writer.write("</xnat:xrayTubeCurrent>");
			header--;
		}
		if (_Parameters_exposure!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:exposure");
			writer.write(">");
			writer.write(ValueParser(_Parameters_exposure,"float"));
			writer.write("</xnat:exposure>");
			header--;
		}
		if (_Parameters_filter!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:filter");
			writer.write(">");
			writer.write(ValueParser(_Parameters_filter,"string"));
			writer.write("</xnat:filter>");
			header--;
		}
		if (_Parameters_generatorpower!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:generatorPower");
			writer.write(">");
			writer.write(ValueParser(_Parameters_generatorpower,"float"));
			writer.write("</xnat:generatorPower>");
			header--;
		}
			int child4=0;
			int att4=0;
			child4+=_Parameters_focalspots_focalspot.size();
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:focalSpots");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM ctScanData -> parameters/focalSpots/focalSpot
		//IN-LINE REPEATER
		java.util.Iterator iter5=_Parameters_focalspots_focalspot.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatCtscandataFocalspotBean child = (org.nrg.xdat.bean.XnatCtscandataFocalspotBean)iter5.next();
			child.addXMLBody(writer,header);
		}
				writer.write("\n" + createHeader(--header) + "</xnat:focalSpots>");
			}
			}

		if (_Parameters_convolutionkernel!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:convolutionKernel");
			writer.write(">");
			writer.write(ValueParser(_Parameters_convolutionkernel,"string"));
			writer.write("</xnat:convolutionKernel>");
			header--;
		}
			int child6=0;
			int att6=0;
			if(_Parameters_collimationwidth_single!=null)
			child6++;
			if(_Parameters_collimationwidth_total!=null)
			child6++;
			if(child6>0 || att6>0){
				writer.write("\n" + createHeader(header++) + "<xnat:collimationWidth");
			if(child6==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Parameters_collimationwidth_single!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:single");
			writer.write(">");
			writer.write(ValueParser(_Parameters_collimationwidth_single,"float"));
			writer.write("</xnat:single>");
			header--;
		}
		if (_Parameters_collimationwidth_total!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:total");
			writer.write(">");
			writer.write(ValueParser(_Parameters_collimationwidth_total,"float"));
			writer.write("</xnat:total>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:collimationWidth>");
			}
			}

		if (_Parameters_tablespeed!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:tableSpeed");
			writer.write(">");
			writer.write(ValueParser(_Parameters_tablespeed,"float"));
			writer.write("</xnat:tableSpeed>");
			header--;
		}
		if (_Parameters_tablefeedperrotation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:tableFeedPerRotation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_tablefeedperrotation,"float"));
			writer.write("</xnat:tableFeedPerRotation>");
			header--;
		}
		if (_Parameters_pitchfactor!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:pitchFactor");
			writer.write(">");
			writer.write(ValueParser(_Parameters_pitchfactor,"float"));
			writer.write("</xnat:pitchFactor>");
			header--;
		}
		TreeMap Parameters_estimateddosesavingATTMap = new TreeMap();
		String Parameters_estimateddosesavingATT = new String();
		if (_Parameters_estimateddosesaving_modulation!=null)
			Parameters_estimateddosesavingATTMap.put("modulation",ValueParser(_Parameters_estimateddosesaving_modulation,"string"));
		java.util.Iterator iter7 =Parameters_estimateddosesavingATTMap.keySet().iterator();
		while(iter7.hasNext()){
			String key = (String)iter7.next();
			Parameters_estimateddosesavingATT +=" " + key + "=\"" + Parameters_estimateddosesavingATTMap.get(key) + "\"";
		}
		if (_Parameters_estimateddosesaving!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:estimatedDoseSaving");
			writer.write(Parameters_estimateddosesavingATT);
			writer.write(">");
			writer.write(ValueParser(_Parameters_estimateddosesaving,"float"));
			writer.write("</xnat:estimatedDoseSaving>");
			header--;
		}
		else if(!Parameters_estimateddosesavingATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:estimatedDoseSaving");
			writer.write(Parameters_estimateddosesavingATT);
			writer.write("/>");
			header--;
		}

		if (_Parameters_ctdivol!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ctDIvol");
			writer.write(">");
			writer.write(ValueParser(_Parameters_ctdivol,"float"));
			writer.write("</xnat:ctDIvol>");
			header--;
		}
		if (_Parameters_derivation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:derivation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_derivation,"string"));
			writer.write("</xnat:derivation>");
			header--;
		}
		//REFERENCE FROM ctScanData -> parameters/contrastBolus
		//DATA-FIELD FROM ctScanData -> parameters/contrastBolus
		if (_Parameters_contrastbolus!=null){
		//NEW ELEMENT
			writer.write("\n" + createHeader(header++) + "<xnat:contrastBolus");
			_Parameters_contrastbolus.addXMLAtts(writer);
			if(!_Parameters_contrastbolus.getFullSchemaElementName().equals("xnat:contrastBolus")){
				writer.write(" xsi:type=\"" + _Parameters_contrastbolus.getFullSchemaElementName() + "\"");
			}
			if (_Parameters_contrastbolus.hasXMLBodyContent()){
				writer.write(">");
				boolean return8 =_Parameters_contrastbolus.addXMLBody(writer,header);
				if(return8){
					writer.write("\n" + createHeader(--header) + "</xnat:contrastBolus>");
				}else{
					writer.write("</xnat:contrastBolus>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		//NOT REQUIRED

				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

		TreeMap DcmvalidationATTMap = new TreeMap();
		String DcmvalidationATT = new String();
		if (_Dcmvalidation_status!=null)
			DcmvalidationATTMap.put("status",ValueParser(_Dcmvalidation_status,"boolean"));
		java.util.Iterator iter8 =DcmvalidationATTMap.keySet().iterator();
		while(iter8.hasNext()){
			String key = (String)iter8.next();
			DcmvalidationATT +=" " + key + "=\"" + DcmvalidationATTMap.get(key) + "\"";
		}
		if (_Dcmvalidation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmValidation");
			writer.write(DcmvalidationATT);
			writer.write(">");
			writer.write(ValueParser(_Dcmvalidation,"string"));
			writer.write("</xnat:dcmValidation>");
			header--;
		}
		else if(!DcmvalidationATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:dcmValidation");
			writer.write(DcmvalidationATT);
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Parameters_focalspots_focalspot.size()>0)return true;
			if(_Parameters_derivation!=null) return true;
			if(_Parameters_ctdivol!=null) return true;
			if(_Parameters_rescale_intercept!=null) return true;
			if(_Parameters_imagetype!=null) return true;
			if(_Parameters_acquisitionnumber!=null) return true;
			if(_Parameters_fov_y!=null) return true;
			if(_Parameters_fov_x!=null) return true;
			if(_Parameters_estimateddosesaving!=null) return true;
			if(_Parameters_collimationwidth_total!=null) return true;
			if(_Parameters_contrastbolus!=null) return true;
			if(_Parameters_pitchfactor!=null) return true;
			if(_Parameters_rescale_slope!=null) return true;
			if(_Parameters_filter!=null) return true;
			if(_Parameters_exposuretime!=null) return true;
			if(_Parameters_convolutionkernel!=null) return true;
			if(_Parameters_collimationwidth_single!=null) return true;
			if(_Parameters_distancesourcetodetector!=null) return true;
			if(_Parameters_collectiondiameter!=null) return true;
			if(_Parameters_exposure!=null) return true;
			if(_Parameters_voxelres_z!=null) return true;
			if(_Parameters_tableheight!=null) return true;
			if(_Parameters_voxelres_y!=null) return true;
			if(_Parameters_generatorpower!=null) return true;
			if(_Parameters_voxelres_x!=null) return true;
			if(_Parameters_distancesourcetopatient!=null) return true;
			if(_Parameters_rotationdirection!=null) return true;
			if(_Parameters_kvp!=null) return true;
			if(_Parameters_xraytubecurrent!=null) return true;
			if(_Parameters_orientation!=null) return true;
			if(_Parameters_estimateddosesaving_modulation!=null) return true;
			if(_Parameters_options!=null) return true;
			if(_Parameters_tablefeedperrotation!=null) return true;
			if(_Parameters_voxelres_units!=null) return true;
			if(_Parameters_tablespeed!=null) return true;
			if(_Parameters_gantrytilt!=null) return true;
		if (_Dcmvalidation_status!=null)
			return true;
		if (_Dcmvalidation!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
