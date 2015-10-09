/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:50 UTC 2015
 *
 */
package org.nrg.xdat.om.base.auto;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.*;
import org.nrg.xft.utils.ResourceFile;
import org.nrg.xft.exception.*;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class AutoExtSegmentationfastdata extends XnatMrassessordata implements org.nrg.xdat.model.ExtSegmentationfastdataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoExtSegmentationfastdata.class);
	public static String SCHEMA_ELEMENT_NAME="ext:segmentationFastData";

	public AutoExtSegmentationfastdata(ItemI item)
	{
		super(item);
	}

	public AutoExtSegmentationfastdata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExtSegmentationfastdata(UserI user)
	 **/
	public AutoExtSegmentationfastdata(){}

	public AutoExtSegmentationfastdata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ext:segmentationFastData";
	}
	 private org.nrg.xdat.om.XnatMrassessordata _Mrassessordata =null;

	/**
	 * mrAssessorData
	 * @return org.nrg.xdat.om.XnatMrassessordata
	 */
	public org.nrg.xdat.om.XnatMrassessordata getMrassessordata() {
		try{
			if (_Mrassessordata==null){
				_Mrassessordata=((XnatMrassessordata)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("mrAssessorData")));
				return _Mrassessordata;
			}else {
				return _Mrassessordata;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for mrAssessorData.
	 * @param v Value to Set.
	 */
	public void setMrassessordata(ItemI v) throws Exception{
		_Mrassessordata =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * mrAssessorData
	 * set org.nrg.xdat.model.XnatMrassessordataI
	 */
	public <A extends org.nrg.xdat.model.XnatMrassessordataI> void setMrassessordata(A item) throws Exception{
	setMrassessordata((ItemI)item);
	}

	/**
	 * Removes the mrAssessorData.
	 * */
	public void removeMrassessordata() {
		_Mrassessordata =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/mrAssessorData",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}
	 private org.nrg.xdat.om.XnatVolumetricregion _Brainvolume =null;

	/**
	 * brainVolume
	 * @return org.nrg.xdat.om.XnatVolumetricregion
	 */
	public org.nrg.xdat.om.XnatVolumetricregion getBrainvolume() {
		try{
			if (_Brainvolume==null){
				_Brainvolume=((XnatVolumetricregion)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("brainVolume")));
				return _Brainvolume;
			}else {
				return _Brainvolume;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for brainVolume.
	 * @param v Value to Set.
	 */
	public void setBrainvolume(ItemI v) throws Exception{
		_Brainvolume =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/brainVolume",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/brainVolume",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * brainVolume
	 * set org.nrg.xdat.model.XnatVolumetricregionI
	 */
	public <A extends org.nrg.xdat.model.XnatVolumetricregionI> void setBrainvolume(A item) throws Exception{
	setBrainvolume((ItemI)item);
	}

	/**
	 * Removes the brainVolume.
	 * */
	public void removeBrainvolume() {
		_Brainvolume =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/brainVolume",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _BrainvolumeFK=null;

	/**
	 * @return Returns the ext:segmentationFastData/brainvolume_xnat_volumetricregion_id.
	 */
	public Integer getBrainvolumeFK(){
		try{
			if (_BrainvolumeFK==null){
				_BrainvolumeFK=getIntegerProperty("ext:segmentationFastData/brainvolume_xnat_volumetricregion_id");
				return _BrainvolumeFK;
			}else {
				return _BrainvolumeFK;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for ext:segmentationFastData/brainvolume_xnat_volumetricregion_id.
	 * @param v Value to Set.
	 */
	public void setBrainvolumeFK(Integer v) {
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/brainvolume_xnat_volumetricregion_id",v);
		_BrainvolumeFK=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Brainpercent=null;

	/**
	 * @return Returns the brainPercent.
	 */
	public Double getBrainpercent() {
		try{
			if (_Brainpercent==null){
				_Brainpercent=getDoubleProperty("brainPercent");
				return _Brainpercent;
			}else {
				return _Brainpercent;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for brainPercent.
	 * @param v Value to Set.
	 */
	public void setBrainpercent(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/brainPercent",v);
		_Brainpercent=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> getAllExtSegmentationfastdatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> al = new ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> getExtSegmentationfastdatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> al = new ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> getExtSegmentationfastdatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata> al = new ArrayList<org.nrg.xdat.om.ExtSegmentationfastdata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExtSegmentationfastdata getExtSegmentationfastdatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ext:segmentationFastData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExtSegmentationfastdata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
			else
				 return null;
		} catch (Exception e) {
			logger.error("",e);
		}

		return null;
	}

	public static ArrayList wrapItems(ArrayList items)
	{
		ArrayList al = new ArrayList();
		al = org.nrg.xdat.base.BaseElement.WrapItems(items);
		al.trimToSize();
		return al;
	}

	public static ArrayList wrapItems(org.nrg.xft.collections.ItemCollection items)
	{
		return wrapItems(items.getItems());
	}

	public org.w3c.dom.Document toJoinedXML() throws Exception
	{
		ArrayList al = new ArrayList();
		al.add(this.getItem());
		XFTItem mr = org.nrg.xft.search.ItemSearch.GetItem("xnat:mrSessionData.ID",getItem().getProperty("ext:segmentationFastData.imageSession_ID"),getItem().getUser(),false);
		al.add(mr);
		al.add(org.nrg.xft.search.ItemSearch.GetItem("xnat:subjectData.ID",mr.getProperty("xnat:mrSessionData.subject_ID"),getItem().getUser(),false));
		al.trimToSize();
		return org.nrg.xft.schema.Wrappers.XMLWrapper.XMLWriter.ItemListToDOM(al);
	}
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	        localLoop = preventLoop;
	
	        //mrAssessorData
	        XnatMrassessordata childMrassessordata = (XnatMrassessordata)this.getMrassessordata();
	            if (childMrassessordata!=null){
	              for(ResourceFile rf: ((XnatMrassessordata)childMrassessordata).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("mrAssessorData[" + ((XnatMrassessordata)childMrassessordata).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("mrAssessorData/" + ((XnatMrassessordata)childMrassessordata).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	        //brainVolume
	        XnatVolumetricregion childBrainvolume = (XnatVolumetricregion)this.getBrainvolume();
	            if (childBrainvolume!=null){
	              for(ResourceFile rf: ((XnatVolumetricregion)childBrainvolume).getFileResources(rootPath, localLoop)) {
	                 rf.setXpath("brainVolume[" + ((XnatVolumetricregion)childBrainvolume).getItem().getPKString() + "]/" + rf.getXpath());
	                 rf.setXdatPath("brainVolume/" + ((XnatVolumetricregion)childBrainvolume).getItem().getPKString() + "/" + rf.getXpath());
	                 _return.add(rf);
	              }
	            }
	
	        localLoop = preventLoop;
	
	return _return;
}
}
