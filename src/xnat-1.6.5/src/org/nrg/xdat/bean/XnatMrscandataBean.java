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
public class XnatMrscandataBean extends XnatImagescandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatMrscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatMrscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:mrScanData";

	public String getSchemaElementName(){
		return "mrScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:mrScanData";
	}

	//FIELD

	private String _Coil=null;

	/**
	 * @return Returns the coil.
	 */
	public String getCoil(){
		return _Coil;
	}

	/**
	 * Sets the value for coil.
	 * @param v Value to Set.
	 */
	public void setCoil(String v){
		_Coil=v;
	}

	//FIELD

	private String _Fieldstrength=null;

	/**
	 * @return Returns the fieldStrength.
	 */
	public String getFieldstrength(){
		return _Fieldstrength;
	}

	/**
	 * Sets the value for fieldStrength.
	 * @param v Value to Set.
	 */
	public void setFieldstrength(String v){
		_Fieldstrength=v;
	}

	//FIELD

	private String _Marker=null;

	/**
	 * @return Returns the marker.
	 */
	public String getMarker(){
		return _Marker;
	}

	/**
	 * Sets the value for marker.
	 * @param v Value to Set.
	 */
	public void setMarker(String v){
		_Marker=v;
	}

	//FIELD

	private String _Stabilization=null;

	/**
	 * @return Returns the stabilization.
	 */
	public String getStabilization(){
		return _Stabilization;
	}

	/**
	 * Sets the value for stabilization.
	 * @param v Value to Set.
	 */
	public void setStabilization(String v){
		_Stabilization=v;
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
	 * Sets the value for xnat:mrScanData/parameters/fov/x.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_x(Integer v) {
		_Parameters_fov_x=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/fov/x.
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
	 * Sets the value for xnat:mrScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(Integer v) {
		_Parameters_fov_y=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/fov/y.
	 * @param v Value to Set.
	 */
	public void setParameters_fov_y(String v)  {
		_Parameters_fov_y=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_matrix_x=null;

	/**
	 * @return Returns the parameters/matrix/x.
	 */
	public Integer getParameters_matrix_x(){
		return _Parameters_matrix_x;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/x.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_x(Integer v) {
		_Parameters_matrix_x=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/x.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_x(String v)  {
		_Parameters_matrix_x=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_matrix_y=null;

	/**
	 * @return Returns the parameters/matrix/y.
	 */
	public Integer getParameters_matrix_y(){
		return _Parameters_matrix_y;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/y.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_y(Integer v) {
		_Parameters_matrix_y=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/matrix/y.
	 * @param v Value to Set.
	 */
	public void setParameters_matrix_y(String v)  {
		_Parameters_matrix_y=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_partitions=null;

	/**
	 * @return Returns the parameters/partitions.
	 */
	public Integer getParameters_partitions(){
		return _Parameters_partitions;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/partitions.
	 * @param v Value to Set.
	 */
	public void setParameters_partitions(Integer v) {
		_Parameters_partitions=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/partitions.
	 * @param v Value to Set.
	 */
	public void setParameters_partitions(String v)  {
		_Parameters_partitions=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_tr=null;

	/**
	 * @return Returns the parameters/tr.
	 */
	public Double getParameters_tr() {
		return _Parameters_tr;
	}

	/**
	 * Sets the value for parameters/tr.
	 * @param v Value to Set.
	 */
	public void setParameters_tr(Double v){
		_Parameters_tr=v;
	}

	/**
	 * Sets the value for parameters/tr.
	 * @param v Value to Set.
	 */
	public void setParameters_tr(String v)  {
		_Parameters_tr=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_te=null;

	/**
	 * @return Returns the parameters/te.
	 */
	public Double getParameters_te() {
		return _Parameters_te;
	}

	/**
	 * Sets the value for parameters/te.
	 * @param v Value to Set.
	 */
	public void setParameters_te(Double v){
		_Parameters_te=v;
	}

	/**
	 * Sets the value for parameters/te.
	 * @param v Value to Set.
	 */
	public void setParameters_te(String v)  {
		_Parameters_te=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_ti=null;

	/**
	 * @return Returns the parameters/ti.
	 */
	public Double getParameters_ti() {
		return _Parameters_ti;
	}

	/**
	 * Sets the value for parameters/ti.
	 * @param v Value to Set.
	 */
	public void setParameters_ti(Double v){
		_Parameters_ti=v;
	}

	/**
	 * Sets the value for parameters/ti.
	 * @param v Value to Set.
	 */
	public void setParameters_ti(String v)  {
		_Parameters_ti=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_flip=null;

	/**
	 * @return Returns the parameters/flip.
	 */
	public Integer getParameters_flip(){
		return _Parameters_flip;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/flip.
	 * @param v Value to Set.
	 */
	public void setParameters_flip(Integer v) {
		_Parameters_flip=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/flip.
	 * @param v Value to Set.
	 */
	public void setParameters_flip(String v)  {
		_Parameters_flip=formatInteger(v);
	}

	//FIELD

	private String _Parameters_sequence=null;

	/**
	 * @return Returns the parameters/sequence.
	 */
	public String getParameters_sequence(){
		return _Parameters_sequence;
	}

	/**
	 * Sets the value for parameters/sequence.
	 * @param v Value to Set.
	 */
	public void setParameters_sequence(String v){
		_Parameters_sequence=v;
	}

	//FIELD

	private String _Parameters_origin=null;

	/**
	 * @return Returns the parameters/origin.
	 */
	public String getParameters_origin(){
		return _Parameters_origin;
	}

	/**
	 * Sets the value for parameters/origin.
	 * @param v Value to Set.
	 */
	public void setParameters_origin(String v){
		_Parameters_origin=v;
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

	private String _Parameters_scansequence=null;

	/**
	 * @return Returns the parameters/scanSequence.
	 */
	public String getParameters_scansequence(){
		return _Parameters_scansequence;
	}

	/**
	 * Sets the value for parameters/scanSequence.
	 * @param v Value to Set.
	 */
	public void setParameters_scansequence(String v){
		_Parameters_scansequence=v;
	}

	//FIELD

	private String _Parameters_seqvariant=null;

	/**
	 * @return Returns the parameters/seqVariant.
	 */
	public String getParameters_seqvariant(){
		return _Parameters_seqvariant;
	}

	/**
	 * Sets the value for parameters/seqVariant.
	 * @param v Value to Set.
	 */
	public void setParameters_seqvariant(String v){
		_Parameters_seqvariant=v;
	}

	//FIELD

	private String _Parameters_scanoptions=null;

	/**
	 * @return Returns the parameters/scanOptions.
	 */
	public String getParameters_scanoptions(){
		return _Parameters_scanoptions;
	}

	/**
	 * Sets the value for parameters/scanOptions.
	 * @param v Value to Set.
	 */
	public void setParameters_scanoptions(String v){
		_Parameters_scanoptions=v;
	}

	//FIELD

	private String _Parameters_acqtype=null;

	/**
	 * @return Returns the parameters/acqType.
	 */
	public String getParameters_acqtype(){
		return _Parameters_acqtype;
	}

	/**
	 * Sets the value for parameters/acqType.
	 * @param v Value to Set.
	 */
	public void setParameters_acqtype(String v){
		_Parameters_acqtype=v;
	}

	//FIELD

	private String _Parameters_coil=null;

	/**
	 * @return Returns the parameters/coil.
	 */
	public String getParameters_coil(){
		return _Parameters_coil;
	}

	/**
	 * Sets the value for parameters/coil.
	 * @param v Value to Set.
	 */
	public void setParameters_coil(String v){
		_Parameters_coil=v;
	}

	//FIELD

	private Integer _Parameters_dtiacqcount=null;

	/**
	 * @return Returns the parameters/dtiAcqCount.
	 */
	public Integer getParameters_dtiacqcount(){
		return _Parameters_dtiacqcount;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/dtiAcqCount.
	 * @param v Value to Set.
	 */
	public void setParameters_dtiacqcount(Integer v) {
		_Parameters_dtiacqcount=v;
	}

	/**
	 * Sets the value for xnat:mrScanData/parameters/dtiAcqCount.
	 * @param v Value to Set.
	 */
	public void setParameters_dtiacqcount(String v)  {
		_Parameters_dtiacqcount=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_pixelbandwidth=null;

	/**
	 * @return Returns the parameters/pixelBandwidth.
	 */
	public Double getParameters_pixelbandwidth() {
		return _Parameters_pixelbandwidth;
	}

	/**
	 * Sets the value for parameters/pixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelbandwidth(Double v){
		_Parameters_pixelbandwidth=v;
	}

	/**
	 * Sets the value for parameters/pixelBandwidth.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelbandwidth(String v)  {
		_Parameters_pixelbandwidth=formatDouble(v);
	}

	//FIELD

	private String _Parameters_diffusion_bvalues=null;

	/**
	 * @return Returns the parameters/diffusion/bValues.
	 */
	public String getParameters_diffusion_bvalues(){
		return _Parameters_diffusion_bvalues;
	}

	/**
	 * Sets the value for parameters/diffusion/bValues.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_bvalues(String v){
		_Parameters_diffusion_bvalues=v;
	}

	//FIELD

	private String _Parameters_diffusion_directionality=null;

	/**
	 * @return Returns the parameters/diffusion/directionality.
	 */
	public String getParameters_diffusion_directionality(){
		return _Parameters_diffusion_directionality;
	}

	/**
	 * Sets the value for parameters/diffusion/directionality.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_directionality(String v){
		_Parameters_diffusion_directionality=v;
	}

	//FIELD

	private String _Parameters_diffusion_orientations=null;

	/**
	 * @return Returns the parameters/diffusion/orientations.
	 */
	public String getParameters_diffusion_orientations(){
		return _Parameters_diffusion_orientations;
	}

	/**
	 * Sets the value for parameters/diffusion/orientations.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_orientations(String v){
		_Parameters_diffusion_orientations=v;
	}

	//FIELD

	private String _Parameters_diffusion_anisotropytype=null;

	/**
	 * @return Returns the parameters/diffusion/anisotropyType.
	 */
	public String getParameters_diffusion_anisotropytype(){
		return _Parameters_diffusion_anisotropytype;
	}

	/**
	 * Sets the value for parameters/diffusion/anisotropyType.
	 * @param v Value to Set.
	 */
	public void setParameters_diffusion_anisotropytype(String v){
		_Parameters_diffusion_anisotropytype=v;
	}
	 private List<org.nrg.xdat.bean.XnatAddfieldBean> _Parameters_addparam =new ArrayList<org.nrg.xdat.bean.XnatAddfieldBean>();

	/**
	 * parameters/addParam
	 * @return Returns an List of org.nrg.xdat.bean.XnatAddfieldBean
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> List<A> getParameters_addparam() {
		return (List<A>) _Parameters_addparam;
	}

	/**
	 * Sets the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void setParameters_addparam(ArrayList<org.nrg.xdat.bean.XnatAddfieldBean> v){
		_Parameters_addparam=v;
	}

	/**
	 * Adds the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void addParameters_addparam(org.nrg.xdat.bean.XnatAddfieldBean v){
		_Parameters_addparam.add(v);
	}

	/**
	 * parameters/addParam
	 * Adds org.nrg.xdat.model.XnatAddfieldI
	 */
	public <A extends org.nrg.xdat.model.XnatAddfieldI> void addParameters_addparam(A item) throws Exception{
	_Parameters_addparam.add((org.nrg.xdat.bean.XnatAddfieldBean)item);
	}

	/**
	 * Adds the value for parameters/addParam.
	 * @param v Value to Set.
	 */
	public void addParameters_addparam(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatAddfieldBean)
			_Parameters_addparam.add((org.nrg.xdat.bean.XnatAddfieldBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatAddfieldBean");
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
		if (xmlPath.equals("coil")){
			setCoil(v);
		}else if (xmlPath.equals("fieldStrength")){
			setFieldstrength(v);
		}else if (xmlPath.equals("marker")){
			setMarker(v);
		}else if (xmlPath.equals("stabilization")){
			setStabilization(v);
		}else if (xmlPath.equals("parameters/voxelRes/units")){
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
		}else if (xmlPath.equals("parameters/matrix/x")){
			setParameters_matrix_x(v);
		}else if (xmlPath.equals("parameters/matrix/y")){
			setParameters_matrix_y(v);
		}else if (xmlPath.equals("parameters/partitions")){
			setParameters_partitions(v);
		}else if (xmlPath.equals("parameters/tr")){
			setParameters_tr(v);
		}else if (xmlPath.equals("parameters/te")){
			setParameters_te(v);
		}else if (xmlPath.equals("parameters/ti")){
			setParameters_ti(v);
		}else if (xmlPath.equals("parameters/flip")){
			setParameters_flip(v);
		}else if (xmlPath.equals("parameters/sequence")){
			setParameters_sequence(v);
		}else if (xmlPath.equals("parameters/origin")){
			setParameters_origin(v);
		}else if (xmlPath.equals("parameters/imageType")){
			setParameters_imagetype(v);
		}else if (xmlPath.equals("parameters/scanSequence")){
			setParameters_scansequence(v);
		}else if (xmlPath.equals("parameters/seqVariant")){
			setParameters_seqvariant(v);
		}else if (xmlPath.equals("parameters/scanOptions")){
			setParameters_scanoptions(v);
		}else if (xmlPath.equals("parameters/acqType")){
			setParameters_acqtype(v);
		}else if (xmlPath.equals("parameters/coil")){
			setParameters_coil(v);
		}else if (xmlPath.equals("parameters/dtiAcqCount")){
			setParameters_dtiacqcount(v);
		}else if (xmlPath.equals("parameters/pixelBandwidth")){
			setParameters_pixelbandwidth(v);
		}else if (xmlPath.equals("parameters/diffusion/bValues")){
			setParameters_diffusion_bvalues(v);
		}else if (xmlPath.equals("parameters/diffusion/directionality")){
			setParameters_diffusion_directionality(v);
		}else if (xmlPath.equals("parameters/diffusion/orientations")){
			setParameters_diffusion_orientations(v);
		}else if (xmlPath.equals("parameters/diffusion/anisotropyType")){
			setParameters_diffusion_anisotropytype(v);
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
		if (xmlPath.equals("parameters/addParam")){
			addParameters_addparam(v);
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
		if (xmlPath.equals("coil")){
			return getCoil();
		}else if (xmlPath.equals("fieldStrength")){
			return getFieldstrength();
		}else if (xmlPath.equals("marker")){
			return getMarker();
		}else if (xmlPath.equals("stabilization")){
			return getStabilization();
		}else if (xmlPath.equals("parameters/voxelRes/units")){
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
		}else if (xmlPath.equals("parameters/matrix/x")){
			return getParameters_matrix_x();
		}else if (xmlPath.equals("parameters/matrix/y")){
			return getParameters_matrix_y();
		}else if (xmlPath.equals("parameters/partitions")){
			return getParameters_partitions();
		}else if (xmlPath.equals("parameters/tr")){
			return getParameters_tr();
		}else if (xmlPath.equals("parameters/te")){
			return getParameters_te();
		}else if (xmlPath.equals("parameters/ti")){
			return getParameters_ti();
		}else if (xmlPath.equals("parameters/flip")){
			return getParameters_flip();
		}else if (xmlPath.equals("parameters/sequence")){
			return getParameters_sequence();
		}else if (xmlPath.equals("parameters/origin")){
			return getParameters_origin();
		}else if (xmlPath.equals("parameters/imageType")){
			return getParameters_imagetype();
		}else if (xmlPath.equals("parameters/scanSequence")){
			return getParameters_scansequence();
		}else if (xmlPath.equals("parameters/seqVariant")){
			return getParameters_seqvariant();
		}else if (xmlPath.equals("parameters/scanOptions")){
			return getParameters_scanoptions();
		}else if (xmlPath.equals("parameters/acqType")){
			return getParameters_acqtype();
		}else if (xmlPath.equals("parameters/coil")){
			return getParameters_coil();
		}else if (xmlPath.equals("parameters/dtiAcqCount")){
			return getParameters_dtiacqcount();
		}else if (xmlPath.equals("parameters/pixelBandwidth")){
			return getParameters_pixelbandwidth();
		}else if (xmlPath.equals("parameters/diffusion/bValues")){
			return getParameters_diffusion_bvalues();
		}else if (xmlPath.equals("parameters/diffusion/directionality")){
			return getParameters_diffusion_directionality();
		}else if (xmlPath.equals("parameters/diffusion/orientations")){
			return getParameters_diffusion_orientations();
		}else if (xmlPath.equals("parameters/diffusion/anisotropyType")){
			return getParameters_diffusion_anisotropytype();
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
		if (xmlPath.equals("parameters/addParam")){
			return getParameters_addparam();
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
		if (xmlPath.equals("parameters/addParam")){
			return "http://nrg.wustl.edu/xnat:addField";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("coil")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("fieldStrength")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("marker")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("stabilization")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/voxelRes/units")){
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
		}else if (xmlPath.equals("parameters/matrix/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/matrix/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/partitions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/tr")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/te")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ti")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/flip")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/sequence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/origin")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/imageType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/scanSequence")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/seqVariant")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/scanOptions")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/acqType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/coil")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dtiAcqCount")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelBandwidth")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/diffusion/bValues")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/diffusion/directionality")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/diffusion/orientations")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/diffusion/anisotropyType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/addParam")){
			return BaseElement.field_NO_CHILD;
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
		all_fields.add("coil");
		all_fields.add("fieldStrength");
		all_fields.add("marker");
		all_fields.add("stabilization");
		all_fields.add("parameters/voxelRes/units");
		all_fields.add("parameters/voxelRes/x");
		all_fields.add("parameters/voxelRes/y");
		all_fields.add("parameters/voxelRes/z");
		all_fields.add("parameters/orientation");
		all_fields.add("parameters/fov/x");
		all_fields.add("parameters/fov/y");
		all_fields.add("parameters/matrix/x");
		all_fields.add("parameters/matrix/y");
		all_fields.add("parameters/partitions");
		all_fields.add("parameters/tr");
		all_fields.add("parameters/te");
		all_fields.add("parameters/ti");
		all_fields.add("parameters/flip");
		all_fields.add("parameters/sequence");
		all_fields.add("parameters/origin");
		all_fields.add("parameters/imageType");
		all_fields.add("parameters/scanSequence");
		all_fields.add("parameters/seqVariant");
		all_fields.add("parameters/scanOptions");
		all_fields.add("parameters/acqType");
		all_fields.add("parameters/coil");
		all_fields.add("parameters/dtiAcqCount");
		all_fields.add("parameters/pixelBandwidth");
		all_fields.add("parameters/diffusion/bValues");
		all_fields.add("parameters/diffusion/directionality");
		all_fields.add("parameters/diffusion/orientations");
		all_fields.add("parameters/diffusion/anisotropyType");
		all_fields.add("parameters/addParam");
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
		writer.write("\n<xnat:MRScan");
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
		writer.write("\n</xnat:MRScan>");
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
		//REFERENCE FROM mrScanData -> imageScanData
		if (_Coil!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:coil");
			writer.write(">");
			writer.write(ValueParser(_Coil,"string"));
			writer.write("</xnat:coil>");
			header--;
		}
		if (_Fieldstrength!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:fieldStrength");
			writer.write(">");
			writer.write(ValueParser(_Fieldstrength,"string"));
			writer.write("</xnat:fieldStrength>");
			header--;
		}
		if (_Marker!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:marker");
			writer.write(">");
			writer.write(ValueParser(_Marker,"string"));
			writer.write("</xnat:marker>");
			header--;
		}
		if (_Stabilization!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:stabilization");
			writer.write(">");
			writer.write(ValueParser(_Stabilization,"string"));
			writer.write("</xnat:stabilization>");
			header--;
		}
			int child0=0;
			int att0=0;
			if(_Parameters_diffusion_orientations!=null)
			child0++;
			if(_Parameters_diffusion_bvalues!=null)
			child0++;
			if(_Parameters_partitions!=null)
			child0++;
			if(_Parameters_seqvariant!=null)
			child0++;
			if(_Parameters_diffusion_directionality!=null)
			child0++;
			if(_Parameters_scanoptions!=null)
			child0++;
			if(_Parameters_dtiacqcount!=null)
			child0++;
			if(_Parameters_imagetype!=null)
			child0++;
			child0+=_Parameters_addparam.size();
			if(_Parameters_scansequence!=null)
			child0++;
			if(_Parameters_tr!=null)
			child0++;
			if(_Parameters_flip!=null)
			child0++;
			if(_Parameters_pixelbandwidth!=null)
			child0++;
			if(_Parameters_orientation!=null)
			child0++;
			if(_Parameters_origin!=null)
			child0++;
			if(_Parameters_ti!=null)
			child0++;
			if(_Parameters_diffusion_anisotropytype!=null)
			child0++;
			if(_Parameters_acqtype!=null)
			child0++;
			if(_Parameters_te!=null)
			child0++;
			if(_Parameters_fov_y!=null)
			child0++;
			if(_Parameters_coil!=null)
			child0++;
			if(_Parameters_fov_x!=null)
			child0++;
			if(_Parameters_voxelres_z!=null)
			child0++;
			if(_Parameters_voxelres_y!=null)
			child0++;
			if(_Parameters_voxelres_x!=null)
			child0++;
			if(_Parameters_sequence!=null)
			child0++;
			if(_Parameters_voxelres_units!=null)
			child0++;
			if(_Parameters_matrix_y!=null)
			child0++;
			if(_Parameters_matrix_x!=null)
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

		TreeMap Parameters_matrixATTMap = new TreeMap();
		String Parameters_matrixATT = new String();
		if (_Parameters_matrix_x!=null)
			Parameters_matrixATTMap.put("x",ValueParser(_Parameters_matrix_x,"integer"));
		if (_Parameters_matrix_y!=null)
			Parameters_matrixATTMap.put("y",ValueParser(_Parameters_matrix_y,"integer"));
		java.util.Iterator iter3 =Parameters_matrixATTMap.keySet().iterator();
		while(iter3.hasNext()){
			String key = (String)iter3.next();
			Parameters_matrixATT +=" " + key + "=\"" + Parameters_matrixATTMap.get(key) + "\"";
		}
		if(!Parameters_matrixATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:matrix");
			writer.write(Parameters_matrixATT);
			writer.write("/>");
		}

		if (_Parameters_partitions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:partitions");
			writer.write(">");
			writer.write(ValueParser(_Parameters_partitions,"integer"));
			writer.write("</xnat:partitions>");
			header--;
		}
		if (_Parameters_tr!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:tr");
			writer.write(">");
			writer.write(ValueParser(_Parameters_tr,"float"));
			writer.write("</xnat:tr>");
			header--;
		}
		if (_Parameters_te!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:te");
			writer.write(">");
			writer.write(ValueParser(_Parameters_te,"float"));
			writer.write("</xnat:te>");
			header--;
		}
		if (_Parameters_ti!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ti");
			writer.write(">");
			writer.write(ValueParser(_Parameters_ti,"float"));
			writer.write("</xnat:ti>");
			header--;
		}
		if (_Parameters_flip!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:flip");
			writer.write(">");
			writer.write(ValueParser(_Parameters_flip,"integer"));
			writer.write("</xnat:flip>");
			header--;
		}
		if (_Parameters_sequence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:sequence");
			writer.write(">");
			writer.write(ValueParser(_Parameters_sequence,"string"));
			writer.write("</xnat:sequence>");
			header--;
		}
		if (_Parameters_origin!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:origin");
			writer.write(">");
			writer.write(ValueParser(_Parameters_origin,"string"));
			writer.write("</xnat:origin>");
			header--;
		}
		if (_Parameters_imagetype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:imageType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_imagetype,"string"));
			writer.write("</xnat:imageType>");
			header--;
		}
		if (_Parameters_scansequence!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:scanSequence");
			writer.write(">");
			writer.write(ValueParser(_Parameters_scansequence,"string"));
			writer.write("</xnat:scanSequence>");
			header--;
		}
		if (_Parameters_seqvariant!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:seqVariant");
			writer.write(">");
			writer.write(ValueParser(_Parameters_seqvariant,"string"));
			writer.write("</xnat:seqVariant>");
			header--;
		}
		if (_Parameters_scanoptions!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:scanOptions");
			writer.write(">");
			writer.write(ValueParser(_Parameters_scanoptions,"string"));
			writer.write("</xnat:scanOptions>");
			header--;
		}
		if (_Parameters_acqtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acqType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_acqtype,"string"));
			writer.write("</xnat:acqType>");
			header--;
		}
		if (_Parameters_coil!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:coil");
			writer.write(">");
			writer.write(ValueParser(_Parameters_coil,"string"));
			writer.write("</xnat:coil>");
			header--;
		}
		if (_Parameters_dtiacqcount!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dtiAcqCount");
			writer.write(">");
			writer.write(ValueParser(_Parameters_dtiacqcount,"integer"));
			writer.write("</xnat:dtiAcqCount>");
			header--;
		}
		if (_Parameters_pixelbandwidth!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:pixelBandwidth");
			writer.write(">");
			writer.write(ValueParser(_Parameters_pixelbandwidth,"double"));
			writer.write("</xnat:pixelBandwidth>");
			header--;
		}
			int child4=0;
			int att4=0;
			if(_Parameters_diffusion_orientations!=null)
			child4++;
			if(_Parameters_diffusion_directionality!=null)
			child4++;
			if(_Parameters_diffusion_bvalues!=null)
			child4++;
			if(_Parameters_diffusion_anisotropytype!=null)
			child4++;
			if(child4>0 || att4>0){
				writer.write("\n" + createHeader(header++) + "<xnat:diffusion");
			if(child4==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Parameters_diffusion_bvalues!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:bValues");
			writer.write(">");
			writer.write(ValueParser(_Parameters_diffusion_bvalues,"string"));
			writer.write("</xnat:bValues>");
			header--;
		}
		if (_Parameters_diffusion_directionality!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:directionality");
			writer.write(">");
			writer.write(ValueParser(_Parameters_diffusion_directionality,"string"));
			writer.write("</xnat:directionality>");
			header--;
		}
		if (_Parameters_diffusion_orientations!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:orientations");
			writer.write(">");
			writer.write(ValueParser(_Parameters_diffusion_orientations,"string"));
			writer.write("</xnat:orientations>");
			header--;
		}
		if (_Parameters_diffusion_anisotropytype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:anisotropyType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_diffusion_anisotropytype,"string"));
			writer.write("</xnat:anisotropyType>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:diffusion>");
			}
			}

		//REFERENCE FROM mrScanData -> parameters/addParam
		java.util.Iterator iter5=_Parameters_addparam.iterator();
		while(iter5.hasNext()){
			org.nrg.xdat.bean.XnatAddfieldBean child = (org.nrg.xdat.bean.XnatAddfieldBean)iter5.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addParam");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:addField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return6 =child.addXMLBody(writer,header);
				if(return6){
					writer.write("\n" + createHeader(--header) + "</xnat:addParam>");
				}else{
					writer.write("</xnat:addParam>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

		TreeMap DcmvalidationATTMap = new TreeMap();
		String DcmvalidationATT = new String();
		if (_Dcmvalidation_status!=null)
			DcmvalidationATTMap.put("status",ValueParser(_Dcmvalidation_status,"boolean"));
		java.util.Iterator iter6 =DcmvalidationATTMap.keySet().iterator();
		while(iter6.hasNext()){
			String key = (String)iter6.next();
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
		if (_Coil!=null) return true;
		if (_Fieldstrength!=null) return true;
		if (_Marker!=null) return true;
		if (_Stabilization!=null) return true;
			if(_Parameters_diffusion_orientations!=null) return true;
			if(_Parameters_diffusion_bvalues!=null) return true;
			if(_Parameters_partitions!=null) return true;
			if(_Parameters_seqvariant!=null) return true;
			if(_Parameters_diffusion_directionality!=null) return true;
			if(_Parameters_scanoptions!=null) return true;
			if(_Parameters_dtiacqcount!=null) return true;
			if(_Parameters_imagetype!=null) return true;
			if(_Parameters_addparam.size()>0)return true;
			if(_Parameters_scansequence!=null) return true;
			if(_Parameters_tr!=null) return true;
			if(_Parameters_flip!=null) return true;
			if(_Parameters_pixelbandwidth!=null) return true;
			if(_Parameters_orientation!=null) return true;
			if(_Parameters_origin!=null) return true;
			if(_Parameters_ti!=null) return true;
			if(_Parameters_diffusion_anisotropytype!=null) return true;
			if(_Parameters_acqtype!=null) return true;
			if(_Parameters_te!=null) return true;
			if(_Parameters_fov_y!=null) return true;
			if(_Parameters_coil!=null) return true;
			if(_Parameters_fov_x!=null) return true;
			if(_Parameters_voxelres_z!=null) return true;
			if(_Parameters_voxelres_y!=null) return true;
			if(_Parameters_voxelres_x!=null) return true;
			if(_Parameters_sequence!=null) return true;
			if(_Parameters_voxelres_units!=null) return true;
			if(_Parameters_matrix_y!=null) return true;
			if(_Parameters_matrix_x!=null) return true;
		if (_Dcmvalidation_status!=null)
			return true;
		if (_Dcmvalidation!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
