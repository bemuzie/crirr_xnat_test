/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:49 UTC 2015
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
public abstract class AutoExtAtlasscalingfactordata extends XnatMrassessordata implements org.nrg.xdat.model.ExtAtlasscalingfactordataI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoExtAtlasscalingfactordata.class);
	public static String SCHEMA_ELEMENT_NAME="ext:atlasScalingFactorData";

	public AutoExtAtlasscalingfactordata(ItemI item)
	{
		super(item);
	}

	public AutoExtAtlasscalingfactordata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoExtAtlasscalingfactordata(UserI user)
	 **/
	public AutoExtAtlasscalingfactordata(){}

	public AutoExtAtlasscalingfactordata(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "ext:atlasScalingFactorData";
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

	//FIELD

	private Double _Scalingfactor=null;

	/**
	 * @return Returns the scalingFactor.
	 */
	public Double getScalingfactor() {
		try{
			if (_Scalingfactor==null){
				_Scalingfactor=getDoubleProperty("scalingFactor");
				return _Scalingfactor;
			}else {
				return _Scalingfactor;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for scalingFactor.
	 * @param v Value to Set.
	 */
	public void setScalingfactor(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/scalingFactor",v);
		_Scalingfactor=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Eta=null;

	/**
	 * @return Returns the eta.
	 */
	public Double getEta() {
		try{
			if (_Eta==null){
				_Eta=getDoubleProperty("eta");
				return _Eta;
			}else {
				return _Eta;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for eta.
	 * @param v Value to Set.
	 */
	public void setEta(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/eta",v);
		_Eta=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Double _Eicv=null;

	/**
	 * @return Returns the eICV.
	 */
	public Double getEicv() {
		try{
			if (_Eicv==null){
				_Eicv=getDoubleProperty("eICV");
				return _Eicv;
			}else {
				return _Eicv;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for eICV.
	 * @param v Value to Set.
	 */
	public void setEicv(Double v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/eICV",v);
		_Eicv=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Basescannumber=null;

	/**
	 * @return Returns the baseScanNumber.
	 */
	public String getBasescannumber(){
		try{
			if (_Basescannumber==null){
				_Basescannumber=getStringProperty("baseScanNumber");
				return _Basescannumber;
			}else {
				return _Basescannumber;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for baseScanNumber.
	 * @param v Value to Set.
	 */
	public void setBasescannumber(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/baseScanNumber",v);
		_Basescannumber=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> getAllExtAtlasscalingfactordatas(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> al = new ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> getExtAtlasscalingfactordatasByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> al = new ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> getExtAtlasscalingfactordatasByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata> al = new ArrayList<org.nrg.xdat.om.ExtAtlasscalingfactordata>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ExtAtlasscalingfactordata getExtAtlasscalingfactordatasById(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("ext:atlasScalingFactorData/id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ExtAtlasscalingfactordata) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
		XFTItem mr = org.nrg.xft.search.ItemSearch.GetItem("xnat:mrSessionData.ID",getItem().getProperty("ext:atlasScalingFactorData.imageSession_ID"),getItem().getUser(),false);
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
	
	return _return;
}
}
