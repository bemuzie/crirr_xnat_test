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
public class XnatPetscandataBean extends XnatImagescandataBean implements java.io.Serializable, org.nrg.xdat.model.XnatPetscandataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XnatPetscandataBean.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:petScanData";

	public String getSchemaElementName(){
		return "petScanData";
	}

	public String getFullSchemaElementName(){
		return "xnat:petScanData";
	}

	//FIELD

	private Integer _Parameters_orientation=null;

	/**
	 * @return Returns the parameters/orientation.
	 */
	public Integer getParameters_orientation(){
		return _Parameters_orientation;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(Integer v) {
		_Parameters_orientation=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/orientation.
	 * @param v Value to Set.
	 */
	public void setParameters_orientation(String v)  {
		_Parameters_orientation=formatInteger(v);
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

	private String _Parameters_originalfilename=null;

	/**
	 * @return Returns the parameters/originalFileName.
	 */
	public String getParameters_originalfilename(){
		return _Parameters_originalfilename;
	}

	/**
	 * Sets the value for parameters/originalFileName.
	 * @param v Value to Set.
	 */
	public void setParameters_originalfilename(String v){
		_Parameters_originalfilename=v;
	}

	//FIELD

	private Integer _Parameters_systemtype=null;

	/**
	 * @return Returns the parameters/systemType.
	 */
	public Integer getParameters_systemtype(){
		return _Parameters_systemtype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/systemType.
	 * @param v Value to Set.
	 */
	public void setParameters_systemtype(Integer v) {
		_Parameters_systemtype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/systemType.
	 * @param v Value to Set.
	 */
	public void setParameters_systemtype(String v)  {
		_Parameters_systemtype=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_filetype=null;

	/**
	 * @return Returns the parameters/fileType.
	 */
	public Integer getParameters_filetype(){
		return _Parameters_filetype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/fileType.
	 * @param v Value to Set.
	 */
	public void setParameters_filetype(Integer v) {
		_Parameters_filetype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/fileType.
	 * @param v Value to Set.
	 */
	public void setParameters_filetype(String v)  {
		_Parameters_filetype=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_transaxialfov=null;

	/**
	 * @return Returns the parameters/transaxialFOV.
	 */
	public Double getParameters_transaxialfov() {
		return _Parameters_transaxialfov;
	}

	/**
	 * Sets the value for parameters/transaxialFOV.
	 * @param v Value to Set.
	 */
	public void setParameters_transaxialfov(Double v){
		_Parameters_transaxialfov=v;
	}

	/**
	 * Sets the value for parameters/transaxialFOV.
	 * @param v Value to Set.
	 */
	public void setParameters_transaxialfov(String v)  {
		_Parameters_transaxialfov=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_acqtype=null;

	/**
	 * @return Returns the parameters/acqType.
	 */
	public Integer getParameters_acqtype(){
		return _Parameters_acqtype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/acqType.
	 * @param v Value to Set.
	 */
	public void setParameters_acqtype(Integer v) {
		_Parameters_acqtype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/acqType.
	 * @param v Value to Set.
	 */
	public void setParameters_acqtype(String v)  {
		_Parameters_acqtype=formatInteger(v);
	}

	//FIELD

	private String _Parameters_facility=null;

	/**
	 * @return Returns the parameters/facility.
	 */
	public String getParameters_facility(){
		return _Parameters_facility;
	}

	/**
	 * Sets the value for parameters/facility.
	 * @param v Value to Set.
	 */
	public void setParameters_facility(String v){
		_Parameters_facility=v;
	}

	//FIELD

	private Integer _Parameters_numplanes=null;

	/**
	 * @return Returns the parameters/numPlanes.
	 */
	public Integer getParameters_numplanes(){
		return _Parameters_numplanes;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numPlanes.
	 * @param v Value to Set.
	 */
	public void setParameters_numplanes(Integer v) {
		_Parameters_numplanes=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numPlanes.
	 * @param v Value to Set.
	 */
	public void setParameters_numplanes(String v)  {
		_Parameters_numplanes=formatInteger(v);
	}
	 private List<org.nrg.xdat.bean.XnatPetscandataFrameBean> _Parameters_frames_frame =new ArrayList<org.nrg.xdat.bean.XnatPetscandataFrameBean>();

	/**
	 * parameters/frames/frame
	 * @return Returns an List of org.nrg.xdat.bean.XnatPetscandataFrameBean
	 */
	public <A extends org.nrg.xdat.model.XnatPetscandataFrameI> List<A> getParameters_frames_frame() {
		return (List<A>) _Parameters_frames_frame;
	}

	/**
	 * Sets the value for parameters/frames/frame.
	 * @param v Value to Set.
	 */
	public void setParameters_frames_frame(ArrayList<org.nrg.xdat.bean.XnatPetscandataFrameBean> v){
		_Parameters_frames_frame=v;
	}

	/**
	 * Adds the value for parameters/frames/frame.
	 * @param v Value to Set.
	 */
	public void addParameters_frames_frame(org.nrg.xdat.bean.XnatPetscandataFrameBean v){
		_Parameters_frames_frame.add(v);
	}

	/**
	 * parameters/frames/frame
	 * Adds org.nrg.xdat.model.XnatPetscandataFrameI
	 */
	public <A extends org.nrg.xdat.model.XnatPetscandataFrameI> void addParameters_frames_frame(A item) throws Exception{
	_Parameters_frames_frame.add((org.nrg.xdat.bean.XnatPetscandataFrameBean)item);
	}

	/**
	 * Adds the value for parameters/frames/frame.
	 * @param v Value to Set.
	 */
	public void addParameters_frames_frame(Object v){
		if (v instanceof org.nrg.xdat.bean.XnatPetscandataFrameBean)
			_Parameters_frames_frame.add((org.nrg.xdat.bean.XnatPetscandataFrameBean)v);
		else
			throw new IllegalArgumentException("Must be a valid org.nrg.xdat.bean.XnatPetscandataFrameBean");
	}

	//FIELD

	private Object _Parameters_frames_numframes=null;

	/**
	 * @return Returns the parameters/frames/numFrames.
	 */
	public Object getParameters_frames_numframes(){
		return _Parameters_frames_numframes;
	}

	/**
	 * Sets the value for parameters/frames/numFrames.
	 * @param v Value to Set.
	 */
	public void setParameters_frames_numframes(Object v){
		_Parameters_frames_numframes=v;
	}

	//FIELD

	private Integer _Parameters_numgates=null;

	/**
	 * @return Returns the parameters/numGates.
	 */
	public Integer getParameters_numgates(){
		return _Parameters_numgates;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numGates.
	 * @param v Value to Set.
	 */
	public void setParameters_numgates(Integer v) {
		_Parameters_numgates=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numGates.
	 * @param v Value to Set.
	 */
	public void setParameters_numgates(String v)  {
		_Parameters_numgates=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_planeseparation=null;

	/**
	 * @return Returns the parameters/planeSeparation.
	 */
	public Double getParameters_planeseparation() {
		return _Parameters_planeseparation;
	}

	/**
	 * Sets the value for parameters/planeSeparation.
	 * @param v Value to Set.
	 */
	public void setParameters_planeseparation(Double v){
		_Parameters_planeseparation=v;
	}

	/**
	 * Sets the value for parameters/planeSeparation.
	 * @param v Value to Set.
	 */
	public void setParameters_planeseparation(String v)  {
		_Parameters_planeseparation=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_binsize=null;

	/**
	 * @return Returns the parameters/binSize.
	 */
	public Double getParameters_binsize() {
		return _Parameters_binsize;
	}

	/**
	 * Sets the value for parameters/binSize.
	 * @param v Value to Set.
	 */
	public void setParameters_binsize(Double v){
		_Parameters_binsize=v;
	}

	/**
	 * Sets the value for parameters/binSize.
	 * @param v Value to Set.
	 */
	public void setParameters_binsize(String v)  {
		_Parameters_binsize=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_datatype=null;

	/**
	 * @return Returns the parameters/dataType.
	 */
	public Integer getParameters_datatype(){
		return _Parameters_datatype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dataType.
	 * @param v Value to Set.
	 */
	public void setParameters_datatype(Integer v) {
		_Parameters_datatype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dataType.
	 * @param v Value to Set.
	 */
	public void setParameters_datatype(String v)  {
		_Parameters_datatype=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_dimensions_x=null;

	/**
	 * @return Returns the parameters/dimensions/x.
	 */
	public Integer getParameters_dimensions_x(){
		return _Parameters_dimensions_x;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_x(Integer v) {
		_Parameters_dimensions_x=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/x.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_x(String v)  {
		_Parameters_dimensions_x=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_dimensions_y=null;

	/**
	 * @return Returns the parameters/dimensions/y.
	 */
	public Integer getParameters_dimensions_y(){
		return _Parameters_dimensions_y;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_y(Integer v) {
		_Parameters_dimensions_y=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/y.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_y(String v)  {
		_Parameters_dimensions_y=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_dimensions_z=null;

	/**
	 * @return Returns the parameters/dimensions/z.
	 */
	public Integer getParameters_dimensions_z(){
		return _Parameters_dimensions_z;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_z(Integer v) {
		_Parameters_dimensions_z=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/z.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_z(String v)  {
		_Parameters_dimensions_z=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_dimensions_num=null;

	/**
	 * @return Returns the parameters/dimensions/num.
	 */
	public Integer getParameters_dimensions_num(){
		return _Parameters_dimensions_num;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/num.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_num(Integer v) {
		_Parameters_dimensions_num=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/dimensions/num.
	 * @param v Value to Set.
	 */
	public void setParameters_dimensions_num(String v)  {
		_Parameters_dimensions_num=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_offset_x=null;

	/**
	 * @return Returns the parameters/offset/x.
	 */
	public Double getParameters_offset_x() {
		return _Parameters_offset_x;
	}

	/**
	 * Sets the value for parameters/offset/x.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_x(Double v){
		_Parameters_offset_x=v;
	}

	/**
	 * Sets the value for parameters/offset/x.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_x(String v)  {
		_Parameters_offset_x=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_offset_y=null;

	/**
	 * @return Returns the parameters/offset/y.
	 */
	public Double getParameters_offset_y() {
		return _Parameters_offset_y;
	}

	/**
	 * Sets the value for parameters/offset/y.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_y(Double v){
		_Parameters_offset_y=v;
	}

	/**
	 * Sets the value for parameters/offset/y.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_y(String v)  {
		_Parameters_offset_y=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_offset_z=null;

	/**
	 * @return Returns the parameters/offset/z.
	 */
	public Double getParameters_offset_z() {
		return _Parameters_offset_z;
	}

	/**
	 * Sets the value for parameters/offset/z.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_z(Double v){
		_Parameters_offset_z=v;
	}

	/**
	 * Sets the value for parameters/offset/z.
	 * @param v Value to Set.
	 */
	public void setParameters_offset_z(String v)  {
		_Parameters_offset_z=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_reconzoom=null;

	/**
	 * @return Returns the parameters/reconZoom.
	 */
	public Double getParameters_reconzoom() {
		return _Parameters_reconzoom;
	}

	/**
	 * Sets the value for parameters/reconZoom.
	 * @param v Value to Set.
	 */
	public void setParameters_reconzoom(Double v){
		_Parameters_reconzoom=v;
	}

	/**
	 * Sets the value for parameters/reconZoom.
	 * @param v Value to Set.
	 */
	public void setParameters_reconzoom(String v)  {
		_Parameters_reconzoom=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_pixelsize_x=null;

	/**
	 * @return Returns the parameters/pixelSize/x.
	 */
	public Double getParameters_pixelsize_x() {
		return _Parameters_pixelsize_x;
	}

	/**
	 * Sets the value for parameters/pixelSize/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_x(Double v){
		_Parameters_pixelsize_x=v;
	}

	/**
	 * Sets the value for parameters/pixelSize/x.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_x(String v)  {
		_Parameters_pixelsize_x=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_pixelsize_y=null;

	/**
	 * @return Returns the parameters/pixelSize/y.
	 */
	public Double getParameters_pixelsize_y() {
		return _Parameters_pixelsize_y;
	}

	/**
	 * Sets the value for parameters/pixelSize/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_y(Double v){
		_Parameters_pixelsize_y=v;
	}

	/**
	 * Sets the value for parameters/pixelSize/y.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_y(String v)  {
		_Parameters_pixelsize_y=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_pixelsize_z=null;

	/**
	 * @return Returns the parameters/pixelSize/z.
	 */
	public Double getParameters_pixelsize_z() {
		return _Parameters_pixelsize_z;
	}

	/**
	 * Sets the value for parameters/pixelSize/z.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_z(Double v){
		_Parameters_pixelsize_z=v;
	}

	/**
	 * Sets the value for parameters/pixelSize/z.
	 * @param v Value to Set.
	 */
	public void setParameters_pixelsize_z(String v)  {
		_Parameters_pixelsize_z=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_filtercode=null;

	/**
	 * @return Returns the parameters/filterCode.
	 */
	public Integer getParameters_filtercode(){
		return _Parameters_filtercode;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/filterCode.
	 * @param v Value to Set.
	 */
	public void setParameters_filtercode(Integer v) {
		_Parameters_filtercode=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/filterCode.
	 * @param v Value to Set.
	 */
	public void setParameters_filtercode(String v)  {
		_Parameters_filtercode=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_resolution_x=null;

	/**
	 * @return Returns the parameters/resolution/x.
	 */
	public Double getParameters_resolution_x() {
		return _Parameters_resolution_x;
	}

	/**
	 * Sets the value for parameters/resolution/x.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_x(Double v){
		_Parameters_resolution_x=v;
	}

	/**
	 * Sets the value for parameters/resolution/x.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_x(String v)  {
		_Parameters_resolution_x=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_resolution_y=null;

	/**
	 * @return Returns the parameters/resolution/y.
	 */
	public Double getParameters_resolution_y() {
		return _Parameters_resolution_y;
	}

	/**
	 * Sets the value for parameters/resolution/y.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_y(Double v){
		_Parameters_resolution_y=v;
	}

	/**
	 * Sets the value for parameters/resolution/y.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_y(String v)  {
		_Parameters_resolution_y=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_resolution_z=null;

	/**
	 * @return Returns the parameters/resolution/z.
	 */
	public Double getParameters_resolution_z() {
		return _Parameters_resolution_z;
	}

	/**
	 * Sets the value for parameters/resolution/z.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_z(Double v){
		_Parameters_resolution_z=v;
	}

	/**
	 * Sets the value for parameters/resolution/z.
	 * @param v Value to Set.
	 */
	public void setParameters_resolution_z(String v)  {
		_Parameters_resolution_z=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_numrelements=null;

	/**
	 * @return Returns the parameters/numRElements.
	 */
	public Double getParameters_numrelements() {
		return _Parameters_numrelements;
	}

	/**
	 * Sets the value for parameters/numRElements.
	 * @param v Value to Set.
	 */
	public void setParameters_numrelements(Double v){
		_Parameters_numrelements=v;
	}

	/**
	 * Sets the value for parameters/numRElements.
	 * @param v Value to Set.
	 */
	public void setParameters_numrelements(String v)  {
		_Parameters_numrelements=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_numangles=null;

	/**
	 * @return Returns the parameters/numAngles.
	 */
	public Double getParameters_numangles() {
		return _Parameters_numangles;
	}

	/**
	 * Sets the value for parameters/numAngles.
	 * @param v Value to Set.
	 */
	public void setParameters_numangles(Double v){
		_Parameters_numangles=v;
	}

	/**
	 * Sets the value for parameters/numAngles.
	 * @param v Value to Set.
	 */
	public void setParameters_numangles(String v)  {
		_Parameters_numangles=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_zrotationangle=null;

	/**
	 * @return Returns the parameters/ZRotationAngle.
	 */
	public Double getParameters_zrotationangle() {
		return _Parameters_zrotationangle;
	}

	/**
	 * Sets the value for parameters/ZRotationAngle.
	 * @param v Value to Set.
	 */
	public void setParameters_zrotationangle(Double v){
		_Parameters_zrotationangle=v;
	}

	/**
	 * Sets the value for parameters/ZRotationAngle.
	 * @param v Value to Set.
	 */
	public void setParameters_zrotationangle(String v)  {
		_Parameters_zrotationangle=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_processingcode=null;

	/**
	 * @return Returns the parameters/processingCode.
	 */
	public Integer getParameters_processingcode(){
		return _Parameters_processingcode;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/processingCode.
	 * @param v Value to Set.
	 */
	public void setParameters_processingcode(Integer v) {
		_Parameters_processingcode=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/processingCode.
	 * @param v Value to Set.
	 */
	public void setParameters_processingcode(String v)  {
		_Parameters_processingcode=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_gateduration=null;

	/**
	 * @return Returns the parameters/gateDuration.
	 */
	public Integer getParameters_gateduration(){
		return _Parameters_gateduration;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/gateDuration.
	 * @param v Value to Set.
	 */
	public void setParameters_gateduration(Integer v) {
		_Parameters_gateduration=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/gateDuration.
	 * @param v Value to Set.
	 */
	public void setParameters_gateduration(String v)  {
		_Parameters_gateduration=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_rwaveoffset=null;

	/**
	 * @return Returns the parameters/rWaveOffset.
	 */
	public Integer getParameters_rwaveoffset(){
		return _Parameters_rwaveoffset;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/rWaveOffset.
	 * @param v Value to Set.
	 */
	public void setParameters_rwaveoffset(Integer v) {
		_Parameters_rwaveoffset=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/rWaveOffset.
	 * @param v Value to Set.
	 */
	public void setParameters_rwaveoffset(String v)  {
		_Parameters_rwaveoffset=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_numacceptedbeats=null;

	/**
	 * @return Returns the parameters/numAcceptedBeats.
	 */
	public Integer getParameters_numacceptedbeats(){
		return _Parameters_numacceptedbeats;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numAcceptedBeats.
	 * @param v Value to Set.
	 */
	public void setParameters_numacceptedbeats(Integer v) {
		_Parameters_numacceptedbeats=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/numAcceptedBeats.
	 * @param v Value to Set.
	 */
	public void setParameters_numacceptedbeats(String v)  {
		_Parameters_numacceptedbeats=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_filter_cutoff=null;

	/**
	 * @return Returns the parameters/filter/cutoff.
	 */
	public Double getParameters_filter_cutoff() {
		return _Parameters_filter_cutoff;
	}

	/**
	 * Sets the value for parameters/filter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_filter_cutoff(Double v){
		_Parameters_filter_cutoff=v;
	}

	/**
	 * Sets the value for parameters/filter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_filter_cutoff(String v)  {
		_Parameters_filter_cutoff=formatDouble(v);
	}

	//FIELD

	private String _Parameters_annotation=null;

	/**
	 * @return Returns the parameters/annotation.
	 */
	public String getParameters_annotation(){
		return _Parameters_annotation;
	}

	/**
	 * Sets the value for parameters/annotation.
	 * @param v Value to Set.
	 */
	public void setParameters_annotation(String v){
		_Parameters_annotation=v;
	}

	//FIELD

	private Double _Parameters_mt11=null;

	/**
	 * @return Returns the parameters/MT_1_1.
	 */
	public Double getParameters_mt11() {
		return _Parameters_mt11;
	}

	/**
	 * Sets the value for parameters/MT_1_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt11(Double v){
		_Parameters_mt11=v;
	}

	/**
	 * Sets the value for parameters/MT_1_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt11(String v)  {
		_Parameters_mt11=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt12=null;

	/**
	 * @return Returns the parameters/MT_1_2.
	 */
	public Double getParameters_mt12() {
		return _Parameters_mt12;
	}

	/**
	 * Sets the value for parameters/MT_1_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt12(Double v){
		_Parameters_mt12=v;
	}

	/**
	 * Sets the value for parameters/MT_1_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt12(String v)  {
		_Parameters_mt12=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt13=null;

	/**
	 * @return Returns the parameters/MT_1_3.
	 */
	public Double getParameters_mt13() {
		return _Parameters_mt13;
	}

	/**
	 * Sets the value for parameters/MT_1_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt13(Double v){
		_Parameters_mt13=v;
	}

	/**
	 * Sets the value for parameters/MT_1_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt13(String v)  {
		_Parameters_mt13=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt14=null;

	/**
	 * @return Returns the parameters/MT_1_4.
	 */
	public Double getParameters_mt14() {
		return _Parameters_mt14;
	}

	/**
	 * Sets the value for parameters/MT_1_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt14(Double v){
		_Parameters_mt14=v;
	}

	/**
	 * Sets the value for parameters/MT_1_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt14(String v)  {
		_Parameters_mt14=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt21=null;

	/**
	 * @return Returns the parameters/MT_2_1.
	 */
	public Double getParameters_mt21() {
		return _Parameters_mt21;
	}

	/**
	 * Sets the value for parameters/MT_2_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt21(Double v){
		_Parameters_mt21=v;
	}

	/**
	 * Sets the value for parameters/MT_2_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt21(String v)  {
		_Parameters_mt21=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt22=null;

	/**
	 * @return Returns the parameters/MT_2_2.
	 */
	public Double getParameters_mt22() {
		return _Parameters_mt22;
	}

	/**
	 * Sets the value for parameters/MT_2_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt22(Double v){
		_Parameters_mt22=v;
	}

	/**
	 * Sets the value for parameters/MT_2_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt22(String v)  {
		_Parameters_mt22=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt23=null;

	/**
	 * @return Returns the parameters/MT_2_3.
	 */
	public Double getParameters_mt23() {
		return _Parameters_mt23;
	}

	/**
	 * Sets the value for parameters/MT_2_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt23(Double v){
		_Parameters_mt23=v;
	}

	/**
	 * Sets the value for parameters/MT_2_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt23(String v)  {
		_Parameters_mt23=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt24=null;

	/**
	 * @return Returns the parameters/MT_2_4.
	 */
	public Double getParameters_mt24() {
		return _Parameters_mt24;
	}

	/**
	 * Sets the value for parameters/MT_2_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt24(Double v){
		_Parameters_mt24=v;
	}

	/**
	 * Sets the value for parameters/MT_2_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt24(String v)  {
		_Parameters_mt24=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt31=null;

	/**
	 * @return Returns the parameters/MT_3_1.
	 */
	public Double getParameters_mt31() {
		return _Parameters_mt31;
	}

	/**
	 * Sets the value for parameters/MT_3_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt31(Double v){
		_Parameters_mt31=v;
	}

	/**
	 * Sets the value for parameters/MT_3_1.
	 * @param v Value to Set.
	 */
	public void setParameters_mt31(String v)  {
		_Parameters_mt31=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt32=null;

	/**
	 * @return Returns the parameters/MT_3_2.
	 */
	public Double getParameters_mt32() {
		return _Parameters_mt32;
	}

	/**
	 * Sets the value for parameters/MT_3_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt32(Double v){
		_Parameters_mt32=v;
	}

	/**
	 * Sets the value for parameters/MT_3_2.
	 * @param v Value to Set.
	 */
	public void setParameters_mt32(String v)  {
		_Parameters_mt32=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt33=null;

	/**
	 * @return Returns the parameters/MT_3_3.
	 */
	public Double getParameters_mt33() {
		return _Parameters_mt33;
	}

	/**
	 * Sets the value for parameters/MT_3_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt33(Double v){
		_Parameters_mt33=v;
	}

	/**
	 * Sets the value for parameters/MT_3_3.
	 * @param v Value to Set.
	 */
	public void setParameters_mt33(String v)  {
		_Parameters_mt33=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_mt34=null;

	/**
	 * @return Returns the parameters/MT_3_4.
	 */
	public Double getParameters_mt34() {
		return _Parameters_mt34;
	}

	/**
	 * Sets the value for parameters/MT_3_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt34(Double v){
		_Parameters_mt34=v;
	}

	/**
	 * Sets the value for parameters/MT_3_4.
	 * @param v Value to Set.
	 */
	public void setParameters_mt34(String v)  {
		_Parameters_mt34=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_rfilter_cutoff=null;

	/**
	 * @return Returns the parameters/RFilter/cutoff.
	 */
	public Double getParameters_rfilter_cutoff() {
		return _Parameters_rfilter_cutoff;
	}

	/**
	 * Sets the value for parameters/RFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_cutoff(Double v){
		_Parameters_rfilter_cutoff=v;
	}

	/**
	 * Sets the value for parameters/RFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_cutoff(String v)  {
		_Parameters_rfilter_cutoff=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_rfilter_resolution=null;

	/**
	 * @return Returns the parameters/RFilter/resolution.
	 */
	public Double getParameters_rfilter_resolution() {
		return _Parameters_rfilter_resolution;
	}

	/**
	 * Sets the value for parameters/RFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_resolution(Double v){
		_Parameters_rfilter_resolution=v;
	}

	/**
	 * Sets the value for parameters/RFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_resolution(String v)  {
		_Parameters_rfilter_resolution=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_rfilter_code=null;

	/**
	 * @return Returns the parameters/RFilter/code.
	 */
	public Integer getParameters_rfilter_code(){
		return _Parameters_rfilter_code;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_code(Integer v) {
		_Parameters_rfilter_code=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_code(String v)  {
		_Parameters_rfilter_code=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_rfilter_order=null;

	/**
	 * @return Returns the parameters/RFilter/order.
	 */
	public Integer getParameters_rfilter_order(){
		return _Parameters_rfilter_order;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_order(Integer v) {
		_Parameters_rfilter_order=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/RFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_rfilter_order(String v)  {
		_Parameters_rfilter_order=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_zfilter_cutoff=null;

	/**
	 * @return Returns the parameters/ZFilter/cutoff.
	 */
	public Double getParameters_zfilter_cutoff() {
		return _Parameters_zfilter_cutoff;
	}

	/**
	 * Sets the value for parameters/ZFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_cutoff(Double v){
		_Parameters_zfilter_cutoff=v;
	}

	/**
	 * Sets the value for parameters/ZFilter/cutoff.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_cutoff(String v)  {
		_Parameters_zfilter_cutoff=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_zfilter_resolution=null;

	/**
	 * @return Returns the parameters/ZFilter/resolution.
	 */
	public Double getParameters_zfilter_resolution() {
		return _Parameters_zfilter_resolution;
	}

	/**
	 * Sets the value for parameters/ZFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_resolution(Double v){
		_Parameters_zfilter_resolution=v;
	}

	/**
	 * Sets the value for parameters/ZFilter/resolution.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_resolution(String v)  {
		_Parameters_zfilter_resolution=formatDouble(v);
	}

	//FIELD

	private Integer _Parameters_zfilter_code=null;

	/**
	 * @return Returns the parameters/ZFilter/code.
	 */
	public Integer getParameters_zfilter_code(){
		return _Parameters_zfilter_code;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_code(Integer v) {
		_Parameters_zfilter_code=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/code.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_code(String v)  {
		_Parameters_zfilter_code=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_zfilter_order=null;

	/**
	 * @return Returns the parameters/ZFilter/order.
	 */
	public Integer getParameters_zfilter_order(){
		return _Parameters_zfilter_order;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_order(Integer v) {
		_Parameters_zfilter_order=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/ZFilter/order.
	 * @param v Value to Set.
	 */
	public void setParameters_zfilter_order(String v)  {
		_Parameters_zfilter_order=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_scattertype=null;

	/**
	 * @return Returns the parameters/scatterType.
	 */
	public Integer getParameters_scattertype(){
		return _Parameters_scattertype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/scatterType.
	 * @param v Value to Set.
	 */
	public void setParameters_scattertype(Integer v) {
		_Parameters_scattertype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/scatterType.
	 * @param v Value to Set.
	 */
	public void setParameters_scattertype(String v)  {
		_Parameters_scattertype=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_recontype=null;

	/**
	 * @return Returns the parameters/reconType.
	 */
	public Integer getParameters_recontype(){
		return _Parameters_recontype;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/reconType.
	 * @param v Value to Set.
	 */
	public void setParameters_recontype(Integer v) {
		_Parameters_recontype=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/reconType.
	 * @param v Value to Set.
	 */
	public void setParameters_recontype(String v)  {
		_Parameters_recontype=formatInteger(v);
	}

	//FIELD

	private Integer _Parameters_reconviews=null;

	/**
	 * @return Returns the parameters/reconViews.
	 */
	public Integer getParameters_reconviews(){
		return _Parameters_reconviews;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/reconViews.
	 * @param v Value to Set.
	 */
	public void setParameters_reconviews(Integer v) {
		_Parameters_reconviews=v;
	}

	/**
	 * Sets the value for xnat:petScanData/parameters/reconViews.
	 * @param v Value to Set.
	 */
	public void setParameters_reconviews(String v)  {
		_Parameters_reconviews=formatInteger(v);
	}

	//FIELD

	private Double _Parameters_bedposition=null;

	/**
	 * @return Returns the parameters/bedPosition.
	 */
	public Double getParameters_bedposition() {
		return _Parameters_bedposition;
	}

	/**
	 * Sets the value for parameters/bedPosition.
	 * @param v Value to Set.
	 */
	public void setParameters_bedposition(Double v){
		_Parameters_bedposition=v;
	}

	/**
	 * Sets the value for parameters/bedPosition.
	 * @param v Value to Set.
	 */
	public void setParameters_bedposition(String v)  {
		_Parameters_bedposition=formatDouble(v);
	}

	//FIELD

	private Double _Parameters_ecatcalibrationfactor=null;

	/**
	 * @return Returns the parameters/ecatCalibrationFactor.
	 */
	public Double getParameters_ecatcalibrationfactor() {
		return _Parameters_ecatcalibrationfactor;
	}

	/**
	 * Sets the value for parameters/ecatCalibrationFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_ecatcalibrationfactor(Double v){
		_Parameters_ecatcalibrationfactor=v;
	}

	/**
	 * Sets the value for parameters/ecatCalibrationFactor.
	 * @param v Value to Set.
	 */
	public void setParameters_ecatcalibrationfactor(String v)  {
		_Parameters_ecatcalibrationfactor=formatDouble(v);
	}

	//FIELD

	private String _Ecatvalidation=null;

	/**
	 * @return Returns the ecatValidation.
	 */
	public String getEcatvalidation(){
		return _Ecatvalidation;
	}

	/**
	 * Sets the value for ecatValidation.
	 * @param v Value to Set.
	 */
	public void setEcatvalidation(String v){
		_Ecatvalidation=v;
	}

	//FIELD

	private Boolean _Ecatvalidation_status=null;

	/**
	 * @return Returns the ecatValidation/status.
	 */
	public Boolean getEcatvalidation_status() {
		return _Ecatvalidation_status;
	}

	/**
	 * Sets the value for ecatValidation/status.
	 * @param v Value to Set.
	 */
	public void setEcatvalidation_status(Object v){
		if(v instanceof Boolean){
			_Ecatvalidation_status=(Boolean)v;
		}else if(v instanceof String){
			_Ecatvalidation_status=formatBoolean((String)v);
		}else if(v!=null){
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	public void setDataField(String xmlPath,String v) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/orientation")){
			setParameters_orientation(v);
		}else if (xmlPath.equals("parameters/originalFileName")){
			setParameters_originalfilename(v);
		}else if (xmlPath.equals("parameters/systemType")){
			setParameters_systemtype(v);
		}else if (xmlPath.equals("parameters/fileType")){
			setParameters_filetype(v);
		}else if (xmlPath.equals("parameters/transaxialFOV")){
			setParameters_transaxialfov(v);
		}else if (xmlPath.equals("parameters/acqType")){
			setParameters_acqtype(v);
		}else if (xmlPath.equals("parameters/facility")){
			setParameters_facility(v);
		}else if (xmlPath.equals("parameters/numPlanes")){
			setParameters_numplanes(v);
		}else if (xmlPath.equals("parameters/frames/numFrames")){
			setParameters_frames_numframes(v);
		}else if (xmlPath.equals("parameters/numGates")){
			setParameters_numgates(v);
		}else if (xmlPath.equals("parameters/planeSeparation")){
			setParameters_planeseparation(v);
		}else if (xmlPath.equals("parameters/binSize")){
			setParameters_binsize(v);
		}else if (xmlPath.equals("parameters/dataType")){
			setParameters_datatype(v);
		}else if (xmlPath.equals("parameters/dimensions/x")){
			setParameters_dimensions_x(v);
		}else if (xmlPath.equals("parameters/dimensions/y")){
			setParameters_dimensions_y(v);
		}else if (xmlPath.equals("parameters/dimensions/z")){
			setParameters_dimensions_z(v);
		}else if (xmlPath.equals("parameters/dimensions/num")){
			setParameters_dimensions_num(v);
		}else if (xmlPath.equals("parameters/offset/x")){
			setParameters_offset_x(v);
		}else if (xmlPath.equals("parameters/offset/y")){
			setParameters_offset_y(v);
		}else if (xmlPath.equals("parameters/offset/z")){
			setParameters_offset_z(v);
		}else if (xmlPath.equals("parameters/reconZoom")){
			setParameters_reconzoom(v);
		}else if (xmlPath.equals("parameters/pixelSize/x")){
			setParameters_pixelsize_x(v);
		}else if (xmlPath.equals("parameters/pixelSize/y")){
			setParameters_pixelsize_y(v);
		}else if (xmlPath.equals("parameters/pixelSize/z")){
			setParameters_pixelsize_z(v);
		}else if (xmlPath.equals("parameters/filterCode")){
			setParameters_filtercode(v);
		}else if (xmlPath.equals("parameters/resolution/x")){
			setParameters_resolution_x(v);
		}else if (xmlPath.equals("parameters/resolution/y")){
			setParameters_resolution_y(v);
		}else if (xmlPath.equals("parameters/resolution/z")){
			setParameters_resolution_z(v);
		}else if (xmlPath.equals("parameters/numRElements")){
			setParameters_numrelements(v);
		}else if (xmlPath.equals("parameters/numAngles")){
			setParameters_numangles(v);
		}else if (xmlPath.equals("parameters/ZRotationAngle")){
			setParameters_zrotationangle(v);
		}else if (xmlPath.equals("parameters/processingCode")){
			setParameters_processingcode(v);
		}else if (xmlPath.equals("parameters/gateDuration")){
			setParameters_gateduration(v);
		}else if (xmlPath.equals("parameters/rWaveOffset")){
			setParameters_rwaveoffset(v);
		}else if (xmlPath.equals("parameters/numAcceptedBeats")){
			setParameters_numacceptedbeats(v);
		}else if (xmlPath.equals("parameters/filter/cutoff")){
			setParameters_filter_cutoff(v);
		}else if (xmlPath.equals("parameters/annotation")){
			setParameters_annotation(v);
		}else if (xmlPath.equals("parameters/MT_1_1")){
			setParameters_mt11(v);
		}else if (xmlPath.equals("parameters/MT_1_2")){
			setParameters_mt12(v);
		}else if (xmlPath.equals("parameters/MT_1_3")){
			setParameters_mt13(v);
		}else if (xmlPath.equals("parameters/MT_1_4")){
			setParameters_mt14(v);
		}else if (xmlPath.equals("parameters/MT_2_1")){
			setParameters_mt21(v);
		}else if (xmlPath.equals("parameters/MT_2_2")){
			setParameters_mt22(v);
		}else if (xmlPath.equals("parameters/MT_2_3")){
			setParameters_mt23(v);
		}else if (xmlPath.equals("parameters/MT_2_4")){
			setParameters_mt24(v);
		}else if (xmlPath.equals("parameters/MT_3_1")){
			setParameters_mt31(v);
		}else if (xmlPath.equals("parameters/MT_3_2")){
			setParameters_mt32(v);
		}else if (xmlPath.equals("parameters/MT_3_3")){
			setParameters_mt33(v);
		}else if (xmlPath.equals("parameters/MT_3_4")){
			setParameters_mt34(v);
		}else if (xmlPath.equals("parameters/RFilter/cutoff")){
			setParameters_rfilter_cutoff(v);
		}else if (xmlPath.equals("parameters/RFilter/resolution")){
			setParameters_rfilter_resolution(v);
		}else if (xmlPath.equals("parameters/RFilter/code")){
			setParameters_rfilter_code(v);
		}else if (xmlPath.equals("parameters/RFilter/order")){
			setParameters_rfilter_order(v);
		}else if (xmlPath.equals("parameters/ZFilter/cutoff")){
			setParameters_zfilter_cutoff(v);
		}else if (xmlPath.equals("parameters/ZFilter/resolution")){
			setParameters_zfilter_resolution(v);
		}else if (xmlPath.equals("parameters/ZFilter/code")){
			setParameters_zfilter_code(v);
		}else if (xmlPath.equals("parameters/ZFilter/order")){
			setParameters_zfilter_order(v);
		}else if (xmlPath.equals("parameters/scatterType")){
			setParameters_scattertype(v);
		}else if (xmlPath.equals("parameters/reconType")){
			setParameters_recontype(v);
		}else if (xmlPath.equals("parameters/reconViews")){
			setParameters_reconviews(v);
		}else if (xmlPath.equals("parameters/bedPosition")){
			setParameters_bedposition(v);
		}else if (xmlPath.equals("parameters/ecatCalibrationFactor")){
			setParameters_ecatcalibrationfactor(v);
		}else if (xmlPath.equals("ecatValidation")){
			setEcatvalidation(v);
		}else if (xmlPath.equals("ecatValidation/status")){
			setEcatvalidation_status(v);
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
		}else if (xmlPath.equals("parameters/frames/frame")){
			addParameters_frames_frame(v);
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
		if (xmlPath.equals("parameters/orientation")){
			return getParameters_orientation();
		}else if (xmlPath.equals("parameters/originalFileName")){
			return getParameters_originalfilename();
		}else if (xmlPath.equals("parameters/systemType")){
			return getParameters_systemtype();
		}else if (xmlPath.equals("parameters/fileType")){
			return getParameters_filetype();
		}else if (xmlPath.equals("parameters/transaxialFOV")){
			return getParameters_transaxialfov();
		}else if (xmlPath.equals("parameters/acqType")){
			return getParameters_acqtype();
		}else if (xmlPath.equals("parameters/facility")){
			return getParameters_facility();
		}else if (xmlPath.equals("parameters/numPlanes")){
			return getParameters_numplanes();
		}else if (xmlPath.equals("parameters/frames/numFrames")){
			return getParameters_frames_numframes();
		}else if (xmlPath.equals("parameters/numGates")){
			return getParameters_numgates();
		}else if (xmlPath.equals("parameters/planeSeparation")){
			return getParameters_planeseparation();
		}else if (xmlPath.equals("parameters/binSize")){
			return getParameters_binsize();
		}else if (xmlPath.equals("parameters/dataType")){
			return getParameters_datatype();
		}else if (xmlPath.equals("parameters/dimensions/x")){
			return getParameters_dimensions_x();
		}else if (xmlPath.equals("parameters/dimensions/y")){
			return getParameters_dimensions_y();
		}else if (xmlPath.equals("parameters/dimensions/z")){
			return getParameters_dimensions_z();
		}else if (xmlPath.equals("parameters/dimensions/num")){
			return getParameters_dimensions_num();
		}else if (xmlPath.equals("parameters/offset/x")){
			return getParameters_offset_x();
		}else if (xmlPath.equals("parameters/offset/y")){
			return getParameters_offset_y();
		}else if (xmlPath.equals("parameters/offset/z")){
			return getParameters_offset_z();
		}else if (xmlPath.equals("parameters/reconZoom")){
			return getParameters_reconzoom();
		}else if (xmlPath.equals("parameters/pixelSize/x")){
			return getParameters_pixelsize_x();
		}else if (xmlPath.equals("parameters/pixelSize/y")){
			return getParameters_pixelsize_y();
		}else if (xmlPath.equals("parameters/pixelSize/z")){
			return getParameters_pixelsize_z();
		}else if (xmlPath.equals("parameters/filterCode")){
			return getParameters_filtercode();
		}else if (xmlPath.equals("parameters/resolution/x")){
			return getParameters_resolution_x();
		}else if (xmlPath.equals("parameters/resolution/y")){
			return getParameters_resolution_y();
		}else if (xmlPath.equals("parameters/resolution/z")){
			return getParameters_resolution_z();
		}else if (xmlPath.equals("parameters/numRElements")){
			return getParameters_numrelements();
		}else if (xmlPath.equals("parameters/numAngles")){
			return getParameters_numangles();
		}else if (xmlPath.equals("parameters/ZRotationAngle")){
			return getParameters_zrotationangle();
		}else if (xmlPath.equals("parameters/processingCode")){
			return getParameters_processingcode();
		}else if (xmlPath.equals("parameters/gateDuration")){
			return getParameters_gateduration();
		}else if (xmlPath.equals("parameters/rWaveOffset")){
			return getParameters_rwaveoffset();
		}else if (xmlPath.equals("parameters/numAcceptedBeats")){
			return getParameters_numacceptedbeats();
		}else if (xmlPath.equals("parameters/filter/cutoff")){
			return getParameters_filter_cutoff();
		}else if (xmlPath.equals("parameters/annotation")){
			return getParameters_annotation();
		}else if (xmlPath.equals("parameters/MT_1_1")){
			return getParameters_mt11();
		}else if (xmlPath.equals("parameters/MT_1_2")){
			return getParameters_mt12();
		}else if (xmlPath.equals("parameters/MT_1_3")){
			return getParameters_mt13();
		}else if (xmlPath.equals("parameters/MT_1_4")){
			return getParameters_mt14();
		}else if (xmlPath.equals("parameters/MT_2_1")){
			return getParameters_mt21();
		}else if (xmlPath.equals("parameters/MT_2_2")){
			return getParameters_mt22();
		}else if (xmlPath.equals("parameters/MT_2_3")){
			return getParameters_mt23();
		}else if (xmlPath.equals("parameters/MT_2_4")){
			return getParameters_mt24();
		}else if (xmlPath.equals("parameters/MT_3_1")){
			return getParameters_mt31();
		}else if (xmlPath.equals("parameters/MT_3_2")){
			return getParameters_mt32();
		}else if (xmlPath.equals("parameters/MT_3_3")){
			return getParameters_mt33();
		}else if (xmlPath.equals("parameters/MT_3_4")){
			return getParameters_mt34();
		}else if (xmlPath.equals("parameters/RFilter/cutoff")){
			return getParameters_rfilter_cutoff();
		}else if (xmlPath.equals("parameters/RFilter/resolution")){
			return getParameters_rfilter_resolution();
		}else if (xmlPath.equals("parameters/RFilter/code")){
			return getParameters_rfilter_code();
		}else if (xmlPath.equals("parameters/RFilter/order")){
			return getParameters_rfilter_order();
		}else if (xmlPath.equals("parameters/ZFilter/cutoff")){
			return getParameters_zfilter_cutoff();
		}else if (xmlPath.equals("parameters/ZFilter/resolution")){
			return getParameters_zfilter_resolution();
		}else if (xmlPath.equals("parameters/ZFilter/code")){
			return getParameters_zfilter_code();
		}else if (xmlPath.equals("parameters/ZFilter/order")){
			return getParameters_zfilter_order();
		}else if (xmlPath.equals("parameters/scatterType")){
			return getParameters_scattertype();
		}else if (xmlPath.equals("parameters/reconType")){
			return getParameters_recontype();
		}else if (xmlPath.equals("parameters/reconViews")){
			return getParameters_reconviews();
		}else if (xmlPath.equals("parameters/bedPosition")){
			return getParameters_bedposition();
		}else if (xmlPath.equals("parameters/ecatCalibrationFactor")){
			return getParameters_ecatcalibrationfactor();
		}else if (xmlPath.equals("ecatValidation")){
			return getEcatvalidation();
		}else if (xmlPath.equals("ecatValidation/status")){
			return getEcatvalidation_status();
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
		}else if (xmlPath.equals("parameters/frames/frame")){
			return getParameters_frames_frame();
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
		}else if (xmlPath.equals("parameters/frames/frame")){
			return "http://nrg.wustl.edu/xnat:petScanData_frame";
		}
		else{
			return super.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	public String getFieldType(String xmlPath) throws BaseElement.UnknownFieldException{
		if (xmlPath.equals("parameters/orientation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/addParam")){
			return BaseElement.field_NO_CHILD;
		}else if (xmlPath.equals("parameters/originalFileName")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/systemType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/fileType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/transaxialFOV")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/acqType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/facility")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/numPlanes")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/frames/frame")){
			return BaseElement.field_multi_reference;
		}else if (xmlPath.equals("parameters/frames/numFrames")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/numGates")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/planeSeparation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/binSize")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dataType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dimensions/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dimensions/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dimensions/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/dimensions/num")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/offset/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/offset/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/offset/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/reconZoom")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelSize/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelSize/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/pixelSize/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/filterCode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/resolution/x")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/resolution/y")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/resolution/z")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/numRElements")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/numAngles")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ZRotationAngle")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/processingCode")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/gateDuration")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/rWaveOffset")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/numAcceptedBeats")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/filter/cutoff")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/annotation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_1_1")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_1_2")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_1_3")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_1_4")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_2_1")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_2_2")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_2_3")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_2_4")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_3_1")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_3_2")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_3_3")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/MT_3_4")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/RFilter/cutoff")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/RFilter/resolution")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/RFilter/code")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/RFilter/order")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ZFilter/cutoff")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ZFilter/resolution")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ZFilter/code")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ZFilter/order")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/scatterType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/reconType")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/reconViews")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/bedPosition")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("parameters/ecatCalibrationFactor")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ecatValidation")){
			return BaseElement.field_data;
		}else if (xmlPath.equals("ecatValidation/status")){
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
		all_fields.add("parameters/orientation");
		all_fields.add("parameters/addParam");
		all_fields.add("parameters/originalFileName");
		all_fields.add("parameters/systemType");
		all_fields.add("parameters/fileType");
		all_fields.add("parameters/transaxialFOV");
		all_fields.add("parameters/acqType");
		all_fields.add("parameters/facility");
		all_fields.add("parameters/numPlanes");
		all_fields.add("parameters/frames/frame");
		all_fields.add("parameters/frames/numFrames");
		all_fields.add("parameters/numGates");
		all_fields.add("parameters/planeSeparation");
		all_fields.add("parameters/binSize");
		all_fields.add("parameters/dataType");
		all_fields.add("parameters/dimensions/x");
		all_fields.add("parameters/dimensions/y");
		all_fields.add("parameters/dimensions/z");
		all_fields.add("parameters/dimensions/num");
		all_fields.add("parameters/offset/x");
		all_fields.add("parameters/offset/y");
		all_fields.add("parameters/offset/z");
		all_fields.add("parameters/reconZoom");
		all_fields.add("parameters/pixelSize/x");
		all_fields.add("parameters/pixelSize/y");
		all_fields.add("parameters/pixelSize/z");
		all_fields.add("parameters/filterCode");
		all_fields.add("parameters/resolution/x");
		all_fields.add("parameters/resolution/y");
		all_fields.add("parameters/resolution/z");
		all_fields.add("parameters/numRElements");
		all_fields.add("parameters/numAngles");
		all_fields.add("parameters/ZRotationAngle");
		all_fields.add("parameters/processingCode");
		all_fields.add("parameters/gateDuration");
		all_fields.add("parameters/rWaveOffset");
		all_fields.add("parameters/numAcceptedBeats");
		all_fields.add("parameters/filter/cutoff");
		all_fields.add("parameters/annotation");
		all_fields.add("parameters/MT_1_1");
		all_fields.add("parameters/MT_1_2");
		all_fields.add("parameters/MT_1_3");
		all_fields.add("parameters/MT_1_4");
		all_fields.add("parameters/MT_2_1");
		all_fields.add("parameters/MT_2_2");
		all_fields.add("parameters/MT_2_3");
		all_fields.add("parameters/MT_2_4");
		all_fields.add("parameters/MT_3_1");
		all_fields.add("parameters/MT_3_2");
		all_fields.add("parameters/MT_3_3");
		all_fields.add("parameters/MT_3_4");
		all_fields.add("parameters/RFilter/cutoff");
		all_fields.add("parameters/RFilter/resolution");
		all_fields.add("parameters/RFilter/code");
		all_fields.add("parameters/RFilter/order");
		all_fields.add("parameters/ZFilter/cutoff");
		all_fields.add("parameters/ZFilter/resolution");
		all_fields.add("parameters/ZFilter/code");
		all_fields.add("parameters/ZFilter/order");
		all_fields.add("parameters/scatterType");
		all_fields.add("parameters/reconType");
		all_fields.add("parameters/reconViews");
		all_fields.add("parameters/bedPosition");
		all_fields.add("parameters/ecatCalibrationFactor");
		all_fields.add("ecatValidation");
		all_fields.add("ecatValidation/status");
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
		writer.write("\n<xnat:PETScan");
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
		writer.write("\n</xnat:PETScan>");
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
		//REFERENCE FROM petScanData -> imageScanData
			int child0=0;
			int att0=0;
			if(_Parameters_gateduration!=null)
			child0++;
			if(_Parameters_zfilter_resolution!=null)
			child0++;
			if(_Parameters_rfilter_cutoff!=null)
			child0++;
			if(_Parameters_mt24!=null)
			child0++;
			if(_Parameters_mt23!=null)
			child0++;
			if(_Parameters_rfilter_order!=null)
			child0++;
			if(_Parameters_mt22!=null)
			child0++;
			if(_Parameters_mt21!=null)
			child0++;
			child0+=_Parameters_frames_frame.size();
			if(_Parameters_reconviews!=null)
			child0++;
			if(_Parameters_transaxialfov!=null)
			child0++;
			if(_Parameters_offset_z!=null)
			child0++;
			if(_Parameters_rwaveoffset!=null)
			child0++;
			if(_Parameters_offset_y!=null)
			child0++;
			if(_Parameters_offset_x!=null)
			child0++;
			if(_Parameters_dimensions_z!=null)
			child0++;
			if(_Parameters_numacceptedbeats!=null)
			child0++;
			if(_Parameters_dimensions_y!=null)
			child0++;
			if(_Parameters_bedposition!=null)
			child0++;
			if(_Parameters_dimensions_x!=null)
			child0++;
			if(_Parameters_filtercode!=null)
			child0++;
			if(_Parameters_numrelements!=null)
			child0++;
			if(_Parameters_mt14!=null)
			child0++;
			if(_Parameters_mt13!=null)
			child0++;
			if(_Parameters_mt12!=null)
			child0++;
			if(_Parameters_mt11!=null)
			child0++;
			if(_Parameters_numplanes!=null)
			child0++;
			if(_Parameters_originalfilename!=null)
			child0++;
			if(_Parameters_scattertype!=null)
			child0++;
			if(_Parameters_rfilter_resolution!=null)
			child0++;
			if(_Parameters_numgates!=null)
			child0++;
			if(_Parameters_processingcode!=null)
			child0++;
			if(_Parameters_zrotationangle!=null)
			child0++;
			if(_Parameters_acqtype!=null)
			child0++;
			if(_Parameters_orientation!=null)
			child0++;
			if(_Parameters_systemtype!=null)
			child0++;
			if(_Parameters_rfilter_code!=null)
			child0++;
			if(_Parameters_filter_cutoff!=null)
			child0++;
			if(_Parameters_filetype!=null)
			child0++;
			if(_Parameters_binsize!=null)
			child0++;
			if(_Parameters_resolution_z!=null)
			child0++;
			if(_Parameters_ecatcalibrationfactor!=null)
			child0++;
			if(_Parameters_resolution_y!=null)
			child0++;
			if(_Parameters_resolution_x!=null)
			child0++;
			if(_Parameters_zfilter_order!=null)
			child0++;
			if(_Parameters_datatype!=null)
			child0++;
			if(_Parameters_planeseparation!=null)
			child0++;
			if(_Parameters_mt34!=null)
			child0++;
			if(_Parameters_mt33!=null)
			child0++;
			if(_Parameters_mt32!=null)
			child0++;
			if(_Parameters_reconzoom!=null)
			child0++;
			if(_Parameters_mt31!=null)
			child0++;
			if(_Parameters_pixelsize_z!=null)
			child0++;
			if(_Parameters_annotation!=null)
			child0++;
			if(_Parameters_pixelsize_y!=null)
			child0++;
			if(_Parameters_numangles!=null)
			child0++;
			if(_Parameters_pixelsize_x!=null)
			child0++;
			if(_Parameters_dimensions_num!=null)
			child0++;
			if(_Parameters_recontype!=null)
			child0++;
			if(_Parameters_zfilter_code!=null)
			child0++;
			if(_Parameters_zfilter_cutoff!=null)
			child0++;
			child0+=_Parameters_addparam.size();
			if(_Parameters_frames_numframes!=null)
			child0++;
			if(_Parameters_facility!=null)
			child0++;
			if(child0>0 || att0>0){
				writer.write("\n" + createHeader(header++) + "<xnat:parameters");
			if(child0==0){
				writer.write("/>");
			}else{
				writer.write(">");
		if (_Parameters_orientation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:orientation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_orientation,"integer"));
			writer.write("</xnat:orientation>");
			header--;
		}
		//REFERENCE FROM petScanData -> parameters/addParam
		java.util.Iterator iter1=_Parameters_addparam.iterator();
		while(iter1.hasNext()){
			org.nrg.xdat.bean.XnatAddfieldBean child = (org.nrg.xdat.bean.XnatAddfieldBean)iter1.next();
			writer.write("\n" + createHeader(header++) + "<xnat:addParam");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:addField")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return2 =child.addXMLBody(writer,header);
				if(return2){
					writer.write("\n" + createHeader(--header) + "</xnat:addParam>");
				}else{
					writer.write("</xnat:addParam>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
		if (_Parameters_originalfilename!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:originalFileName");
			writer.write(">");
			writer.write(ValueParser(_Parameters_originalfilename,"string"));
			writer.write("</xnat:originalFileName>");
			header--;
		}
		if (_Parameters_systemtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:systemType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_systemtype,"integer"));
			writer.write("</xnat:systemType>");
			header--;
		}
		if (_Parameters_filetype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:fileType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_filetype,"integer"));
			writer.write("</xnat:fileType>");
			header--;
		}
		if (_Parameters_transaxialfov!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:transaxialFOV");
			writer.write(">");
			writer.write(ValueParser(_Parameters_transaxialfov,"float"));
			writer.write("</xnat:transaxialFOV>");
			header--;
		}
		if (_Parameters_acqtype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:acqType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_acqtype,"integer"));
			writer.write("</xnat:acqType>");
			header--;
		}
		if (_Parameters_facility!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:facility");
			writer.write(">");
			writer.write(ValueParser(_Parameters_facility,"string"));
			writer.write("</xnat:facility>");
			header--;
		}
		if (_Parameters_numplanes!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:numPlanes");
			writer.write(">");
			writer.write(ValueParser(_Parameters_numplanes,"integer"));
			writer.write("</xnat:numPlanes>");
			header--;
		}
		TreeMap Parameters_framesATTMap = new TreeMap();
		String Parameters_framesATT = new String();
		if (_Parameters_frames_numframes!=null)
			Parameters_framesATTMap.put("numFrames",ValueParser(_Parameters_frames_numframes,"int"));
		java.util.Iterator iter2 =Parameters_framesATTMap.keySet().iterator();
		while(iter2.hasNext()){
			String key = (String)iter2.next();
			Parameters_framesATT +=" " + key + "=\"" + Parameters_framesATTMap.get(key) + "\"";
		}
			int child3=0;
			int att3=0;
			if(_Parameters_frames_numframes!=null)
			att3++;
			child3+=_Parameters_frames_frame.size();
			if(child3>0 || att3>0){
				writer.write("\n" + createHeader(header++) + "<xnat:frames");
				writer.write(Parameters_framesATT);
			if(child3==0){
				writer.write("/>");
			}else{
				writer.write(">");
		//REFERENCE FROM petScanData -> parameters/frames/frame
		java.util.Iterator iter4=_Parameters_frames_frame.iterator();
		while(iter4.hasNext()){
			org.nrg.xdat.bean.XnatPetscandataFrameBean child = (org.nrg.xdat.bean.XnatPetscandataFrameBean)iter4.next();
			writer.write("\n" + createHeader(header++) + "<xnat:frame");
			child.addXMLAtts(writer);
			if(!child.getFullSchemaElementName().equals("xnat:petScanData_frame")){
				writer.write(" xsi:type=\"" + child.getFullSchemaElementName() + "\"");
			}
			if (child.hasXMLBodyContent()){
				writer.write(">");
				boolean return5 =child.addXMLBody(writer,header);
				if(return5){
					writer.write("\n" + createHeader(--header) + "</xnat:frame>");
				}else{
					writer.write("</xnat:frame>");
					header--;
				}
			}else {writer.write("/>");header--;}
		}
				writer.write("\n" + createHeader(--header) + "</xnat:frames>");
			}
			}

		if (_Parameters_numgates!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:numGates");
			writer.write(">");
			writer.write(ValueParser(_Parameters_numgates,"integer"));
			writer.write("</xnat:numGates>");
			header--;
		}
		if (_Parameters_planeseparation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:planeSeparation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_planeseparation,"float"));
			writer.write("</xnat:planeSeparation>");
			header--;
		}
		if (_Parameters_binsize!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:binSize");
			writer.write(">");
			writer.write(ValueParser(_Parameters_binsize,"float"));
			writer.write("</xnat:binSize>");
			header--;
		}
		if (_Parameters_datatype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:dataType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_datatype,"integer"));
			writer.write("</xnat:dataType>");
			header--;
		}
		TreeMap Parameters_dimensionsATTMap = new TreeMap();
		String Parameters_dimensionsATT = new String();
		if (_Parameters_dimensions_x!=null)
			Parameters_dimensionsATTMap.put("x",ValueParser(_Parameters_dimensions_x,"integer"));
		if (_Parameters_dimensions_y!=null)
			Parameters_dimensionsATTMap.put("y",ValueParser(_Parameters_dimensions_y,"integer"));
		if (_Parameters_dimensions_z!=null)
			Parameters_dimensionsATTMap.put("z",ValueParser(_Parameters_dimensions_z,"integer"));
		if (_Parameters_dimensions_num!=null)
			Parameters_dimensionsATTMap.put("num",ValueParser(_Parameters_dimensions_num,"integer"));
		java.util.Iterator iter5 =Parameters_dimensionsATTMap.keySet().iterator();
		while(iter5.hasNext()){
			String key = (String)iter5.next();
			Parameters_dimensionsATT +=" " + key + "=\"" + Parameters_dimensionsATTMap.get(key) + "\"";
		}
		if(!Parameters_dimensionsATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:dimensions");
			writer.write(Parameters_dimensionsATT);
			writer.write("/>");
		}

		TreeMap Parameters_offsetATTMap = new TreeMap();
		String Parameters_offsetATT = new String();
		if (_Parameters_offset_x!=null)
			Parameters_offsetATTMap.put("x",ValueParser(_Parameters_offset_x,"float"));
		if (_Parameters_offset_y!=null)
			Parameters_offsetATTMap.put("y",ValueParser(_Parameters_offset_y,"float"));
		if (_Parameters_offset_z!=null)
			Parameters_offsetATTMap.put("z",ValueParser(_Parameters_offset_z,"float"));
		java.util.Iterator iter6 =Parameters_offsetATTMap.keySet().iterator();
		while(iter6.hasNext()){
			String key = (String)iter6.next();
			Parameters_offsetATT +=" " + key + "=\"" + Parameters_offsetATTMap.get(key) + "\"";
		}
		if(!Parameters_offsetATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:offset");
			writer.write(Parameters_offsetATT);
			writer.write("/>");
		}

		if (_Parameters_reconzoom!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:reconZoom");
			writer.write(">");
			writer.write(ValueParser(_Parameters_reconzoom,"float"));
			writer.write("</xnat:reconZoom>");
			header--;
		}
		TreeMap Parameters_pixelsizeATTMap = new TreeMap();
		String Parameters_pixelsizeATT = new String();
		if (_Parameters_pixelsize_x!=null)
			Parameters_pixelsizeATTMap.put("x",ValueParser(_Parameters_pixelsize_x,"float"));
		if (_Parameters_pixelsize_y!=null)
			Parameters_pixelsizeATTMap.put("y",ValueParser(_Parameters_pixelsize_y,"float"));
		if (_Parameters_pixelsize_z!=null)
			Parameters_pixelsizeATTMap.put("z",ValueParser(_Parameters_pixelsize_z,"float"));
		java.util.Iterator iter7 =Parameters_pixelsizeATTMap.keySet().iterator();
		while(iter7.hasNext()){
			String key = (String)iter7.next();
			Parameters_pixelsizeATT +=" " + key + "=\"" + Parameters_pixelsizeATTMap.get(key) + "\"";
		}
		if(!Parameters_pixelsizeATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:pixelSize");
			writer.write(Parameters_pixelsizeATT);
			writer.write("/>");
		}

		if (_Parameters_filtercode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:filterCode");
			writer.write(">");
			writer.write(ValueParser(_Parameters_filtercode,"integer"));
			writer.write("</xnat:filterCode>");
			header--;
		}
		TreeMap Parameters_resolutionATTMap = new TreeMap();
		String Parameters_resolutionATT = new String();
		if (_Parameters_resolution_x!=null)
			Parameters_resolutionATTMap.put("x",ValueParser(_Parameters_resolution_x,"float"));
		if (_Parameters_resolution_y!=null)
			Parameters_resolutionATTMap.put("y",ValueParser(_Parameters_resolution_y,"float"));
		if (_Parameters_resolution_z!=null)
			Parameters_resolutionATTMap.put("z",ValueParser(_Parameters_resolution_z,"float"));
		java.util.Iterator iter8 =Parameters_resolutionATTMap.keySet().iterator();
		while(iter8.hasNext()){
			String key = (String)iter8.next();
			Parameters_resolutionATT +=" " + key + "=\"" + Parameters_resolutionATTMap.get(key) + "\"";
		}
		if(!Parameters_resolutionATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:resolution");
			writer.write(Parameters_resolutionATT);
			writer.write("/>");
		}

		if (_Parameters_numrelements!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:numRElements");
			writer.write(">");
			writer.write(ValueParser(_Parameters_numrelements,"float"));
			writer.write("</xnat:numRElements>");
			header--;
		}
		if (_Parameters_numangles!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:numAngles");
			writer.write(">");
			writer.write(ValueParser(_Parameters_numangles,"float"));
			writer.write("</xnat:numAngles>");
			header--;
		}
		if (_Parameters_zrotationangle!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ZRotationAngle");
			writer.write(">");
			writer.write(ValueParser(_Parameters_zrotationangle,"float"));
			writer.write("</xnat:ZRotationAngle>");
			header--;
		}
		if (_Parameters_processingcode!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:processingCode");
			writer.write(">");
			writer.write(ValueParser(_Parameters_processingcode,"integer"));
			writer.write("</xnat:processingCode>");
			header--;
		}
		if (_Parameters_gateduration!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:gateDuration");
			writer.write(">");
			writer.write(ValueParser(_Parameters_gateduration,"integer"));
			writer.write("</xnat:gateDuration>");
			header--;
		}
		if (_Parameters_rwaveoffset!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:rWaveOffset");
			writer.write(">");
			writer.write(ValueParser(_Parameters_rwaveoffset,"integer"));
			writer.write("</xnat:rWaveOffset>");
			header--;
		}
		if (_Parameters_numacceptedbeats!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:numAcceptedBeats");
			writer.write(">");
			writer.write(ValueParser(_Parameters_numacceptedbeats,"integer"));
			writer.write("</xnat:numAcceptedBeats>");
			header--;
		}
		TreeMap Parameters_filterATTMap = new TreeMap();
		String Parameters_filterATT = new String();
		if (_Parameters_filter_cutoff!=null)
			Parameters_filterATTMap.put("cutoff",ValueParser(_Parameters_filter_cutoff,"float"));
		java.util.Iterator iter9 =Parameters_filterATTMap.keySet().iterator();
		while(iter9.hasNext()){
			String key = (String)iter9.next();
			Parameters_filterATT +=" " + key + "=\"" + Parameters_filterATTMap.get(key) + "\"";
		}
		if(!Parameters_filterATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:filter");
			writer.write(Parameters_filterATT);
			writer.write("/>");
		}

		if (_Parameters_annotation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:annotation");
			writer.write(">");
			writer.write(ValueParser(_Parameters_annotation,"string"));
			writer.write("</xnat:annotation>");
			header--;
		}
		if (_Parameters_mt11!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_1_1");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt11,"float"));
			writer.write("</xnat:MT_1_1>");
			header--;
		}
		if (_Parameters_mt12!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_1_2");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt12,"float"));
			writer.write("</xnat:MT_1_2>");
			header--;
		}
		if (_Parameters_mt13!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_1_3");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt13,"float"));
			writer.write("</xnat:MT_1_3>");
			header--;
		}
		if (_Parameters_mt14!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_1_4");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt14,"float"));
			writer.write("</xnat:MT_1_4>");
			header--;
		}
		if (_Parameters_mt21!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_2_1");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt21,"float"));
			writer.write("</xnat:MT_2_1>");
			header--;
		}
		if (_Parameters_mt22!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_2_2");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt22,"float"));
			writer.write("</xnat:MT_2_2>");
			header--;
		}
		if (_Parameters_mt23!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_2_3");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt23,"float"));
			writer.write("</xnat:MT_2_3>");
			header--;
		}
		if (_Parameters_mt24!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_2_4");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt24,"float"));
			writer.write("</xnat:MT_2_4>");
			header--;
		}
		if (_Parameters_mt31!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_3_1");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt31,"float"));
			writer.write("</xnat:MT_3_1>");
			header--;
		}
		if (_Parameters_mt32!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_3_2");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt32,"float"));
			writer.write("</xnat:MT_3_2>");
			header--;
		}
		if (_Parameters_mt33!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_3_3");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt33,"float"));
			writer.write("</xnat:MT_3_3>");
			header--;
		}
		if (_Parameters_mt34!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:MT_3_4");
			writer.write(">");
			writer.write(ValueParser(_Parameters_mt34,"float"));
			writer.write("</xnat:MT_3_4>");
			header--;
		}
		TreeMap Parameters_rfilterATTMap = new TreeMap();
		String Parameters_rfilterATT = new String();
		if (_Parameters_rfilter_cutoff!=null)
			Parameters_rfilterATTMap.put("cutoff",ValueParser(_Parameters_rfilter_cutoff,"float"));
		if (_Parameters_rfilter_resolution!=null)
			Parameters_rfilterATTMap.put("resolution",ValueParser(_Parameters_rfilter_resolution,"float"));
		if (_Parameters_rfilter_code!=null)
			Parameters_rfilterATTMap.put("code",ValueParser(_Parameters_rfilter_code,"integer"));
		if (_Parameters_rfilter_order!=null)
			Parameters_rfilterATTMap.put("order",ValueParser(_Parameters_rfilter_order,"integer"));
		java.util.Iterator iter10 =Parameters_rfilterATTMap.keySet().iterator();
		while(iter10.hasNext()){
			String key = (String)iter10.next();
			Parameters_rfilterATT +=" " + key + "=\"" + Parameters_rfilterATTMap.get(key) + "\"";
		}
		if(!Parameters_rfilterATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:RFilter");
			writer.write(Parameters_rfilterATT);
			writer.write("/>");
		}

		TreeMap Parameters_zfilterATTMap = new TreeMap();
		String Parameters_zfilterATT = new String();
		if (_Parameters_zfilter_cutoff!=null)
			Parameters_zfilterATTMap.put("cutoff",ValueParser(_Parameters_zfilter_cutoff,"float"));
		if (_Parameters_zfilter_resolution!=null)
			Parameters_zfilterATTMap.put("resolution",ValueParser(_Parameters_zfilter_resolution,"float"));
		if (_Parameters_zfilter_code!=null)
			Parameters_zfilterATTMap.put("code",ValueParser(_Parameters_zfilter_code,"integer"));
		if (_Parameters_zfilter_order!=null)
			Parameters_zfilterATTMap.put("order",ValueParser(_Parameters_zfilter_order,"integer"));
		java.util.Iterator iter11 =Parameters_zfilterATTMap.keySet().iterator();
		while(iter11.hasNext()){
			String key = (String)iter11.next();
			Parameters_zfilterATT +=" " + key + "=\"" + Parameters_zfilterATTMap.get(key) + "\"";
		}
		if(!Parameters_zfilterATT.equals("")){
			writer.write("\n" + createHeader(header) + "<xnat:ZFilter");
			writer.write(Parameters_zfilterATT);
			writer.write("/>");
		}

		if (_Parameters_scattertype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:scatterType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_scattertype,"integer"));
			writer.write("</xnat:scatterType>");
			header--;
		}
		if (_Parameters_recontype!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:reconType");
			writer.write(">");
			writer.write(ValueParser(_Parameters_recontype,"integer"));
			writer.write("</xnat:reconType>");
			header--;
		}
		if (_Parameters_reconviews!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:reconViews");
			writer.write(">");
			writer.write(ValueParser(_Parameters_reconviews,"integer"));
			writer.write("</xnat:reconViews>");
			header--;
		}
		if (_Parameters_bedposition!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:bedPosition");
			writer.write(">");
			writer.write(ValueParser(_Parameters_bedposition,"float"));
			writer.write("</xnat:bedPosition>");
			header--;
		}
		if (_Parameters_ecatcalibrationfactor!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ecatCalibrationFactor");
			writer.write(">");
			writer.write(ValueParser(_Parameters_ecatcalibrationfactor,"float"));
			writer.write("</xnat:ecatCalibrationFactor>");
			header--;
		}
				writer.write("\n" + createHeader(--header) + "</xnat:parameters>");
			}
			}

		TreeMap EcatvalidationATTMap = new TreeMap();
		String EcatvalidationATT = new String();
		if (_Ecatvalidation_status!=null)
			EcatvalidationATTMap.put("status",ValueParser(_Ecatvalidation_status,"boolean"));
		java.util.Iterator iter12 =EcatvalidationATTMap.keySet().iterator();
		while(iter12.hasNext()){
			String key = (String)iter12.next();
			EcatvalidationATT +=" " + key + "=\"" + EcatvalidationATTMap.get(key) + "\"";
		}
		if (_Ecatvalidation!=null){
			writer.write("\n" + createHeader(header++) + "<xnat:ecatValidation");
			writer.write(EcatvalidationATT);
			writer.write(">");
			writer.write(ValueParser(_Ecatvalidation,"string"));
			writer.write("</xnat:ecatValidation>");
			header--;
		}
		else if(!EcatvalidationATT.equals("")){
			writer.write("\n" + createHeader(header++) + "<xnat:ecatValidation");
			writer.write(EcatvalidationATT);
			writer.write("/>");
			header--;
		}

	return true;
	}


	protected boolean hasXMLBodyContent(){
			if(_Parameters_gateduration!=null) return true;
			if(_Parameters_zfilter_resolution!=null) return true;
			if(_Parameters_rfilter_cutoff!=null) return true;
			if(_Parameters_mt24!=null) return true;
			if(_Parameters_mt23!=null) return true;
			if(_Parameters_rfilter_order!=null) return true;
			if(_Parameters_mt22!=null) return true;
			if(_Parameters_mt21!=null) return true;
			if(_Parameters_frames_frame.size()>0)return true;
			if(_Parameters_reconviews!=null) return true;
			if(_Parameters_transaxialfov!=null) return true;
			if(_Parameters_offset_z!=null) return true;
			if(_Parameters_rwaveoffset!=null) return true;
			if(_Parameters_offset_y!=null) return true;
			if(_Parameters_offset_x!=null) return true;
			if(_Parameters_dimensions_z!=null) return true;
			if(_Parameters_numacceptedbeats!=null) return true;
			if(_Parameters_dimensions_y!=null) return true;
			if(_Parameters_bedposition!=null) return true;
			if(_Parameters_dimensions_x!=null) return true;
			if(_Parameters_filtercode!=null) return true;
			if(_Parameters_numrelements!=null) return true;
			if(_Parameters_mt14!=null) return true;
			if(_Parameters_mt13!=null) return true;
			if(_Parameters_mt12!=null) return true;
			if(_Parameters_mt11!=null) return true;
			if(_Parameters_numplanes!=null) return true;
			if(_Parameters_originalfilename!=null) return true;
			if(_Parameters_scattertype!=null) return true;
			if(_Parameters_rfilter_resolution!=null) return true;
			if(_Parameters_numgates!=null) return true;
			if(_Parameters_processingcode!=null) return true;
			if(_Parameters_zrotationangle!=null) return true;
			if(_Parameters_acqtype!=null) return true;
			if(_Parameters_orientation!=null) return true;
			if(_Parameters_systemtype!=null) return true;
			if(_Parameters_rfilter_code!=null) return true;
			if(_Parameters_filter_cutoff!=null) return true;
			if(_Parameters_filetype!=null) return true;
			if(_Parameters_binsize!=null) return true;
			if(_Parameters_resolution_z!=null) return true;
			if(_Parameters_ecatcalibrationfactor!=null) return true;
			if(_Parameters_resolution_y!=null) return true;
			if(_Parameters_resolution_x!=null) return true;
			if(_Parameters_zfilter_order!=null) return true;
			if(_Parameters_datatype!=null) return true;
			if(_Parameters_planeseparation!=null) return true;
			if(_Parameters_mt34!=null) return true;
			if(_Parameters_mt33!=null) return true;
			if(_Parameters_mt32!=null) return true;
			if(_Parameters_reconzoom!=null) return true;
			if(_Parameters_mt31!=null) return true;
			if(_Parameters_pixelsize_z!=null) return true;
			if(_Parameters_annotation!=null) return true;
			if(_Parameters_pixelsize_y!=null) return true;
			if(_Parameters_numangles!=null) return true;
			if(_Parameters_pixelsize_x!=null) return true;
			if(_Parameters_dimensions_num!=null) return true;
			if(_Parameters_recontype!=null) return true;
			if(_Parameters_zfilter_code!=null) return true;
			if(_Parameters_zfilter_cutoff!=null) return true;
			if(_Parameters_addparam.size()>0)return true;
			if(_Parameters_frames_numframes!=null) return true;
			if(_Parameters_facility!=null) return true;
		if (_Ecatvalidation_status!=null)
			return true;
		if (_Ecatvalidation!=null) return true;
		if(super.hasXMLBodyContent())return true;
		return false;
	}
}
