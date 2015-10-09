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
public abstract class AutoXnatResourcecatalog extends XnatResource implements org.nrg.xdat.model.XnatResourcecatalogI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoXnatResourcecatalog.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:resourceCatalog";

	public AutoXnatResourcecatalog(ItemI item)
	{
		super(item);
	}

	public AutoXnatResourcecatalog(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoXnatResourcecatalog(UserI user)
	 **/
	public AutoXnatResourcecatalog(){}

	public AutoXnatResourcecatalog(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "xnat:resourceCatalog";
	}
	 private org.nrg.xdat.om.XnatResource _Resource =null;

	/**
	 * resource
	 * @return org.nrg.xdat.om.XnatResource
	 */
	public org.nrg.xdat.om.XnatResource getResource() {
		try{
			if (_Resource==null){
				_Resource=((XnatResource)org.nrg.xdat.base.BaseElement.GetGeneratedItem((XFTItem)getProperty("resource")));
				return _Resource;
			}else {
				return _Resource;
			}
		} catch (Exception e1) {return null;}
	}

	/**
	 * Sets the value for resource.
	 * @param v Value to Set.
	 */
	public void setResource(ItemI v) throws Exception{
		_Resource =null;
		try{
			if (v instanceof XFTItem)
			{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/resource",v,true);
			}else{
				getItem().setChild(SCHEMA_ELEMENT_NAME + "/resource",v.getItem(),true);
			}
		} catch (Exception e1) {logger.error(e1);throw e1;}
	}

	/**
	 * resource
	 * set org.nrg.xdat.model.XnatResourceI
	 */
	public <A extends org.nrg.xdat.model.XnatResourceI> void setResource(A item) throws Exception{
	setResource((ItemI)item);
	}

	/**
	 * Removes the resource.
	 * */
	public void removeResource() {
		_Resource =null;
		try{
			getItem().removeChild(SCHEMA_ELEMENT_NAME + "/resource",0);
		} catch (FieldNotFoundException e1) {logger.error(e1);}
		catch (java.lang.IndexOutOfBoundsException e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.XnatResourcecatalog> getAllXnatResourcecatalogs(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatResourcecatalog> al = new ArrayList<org.nrg.xdat.om.XnatResourcecatalog>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.XnatResourcecatalog> getXnatResourcecatalogsByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatResourcecatalog> al = new ArrayList<org.nrg.xdat.om.XnatResourcecatalog>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.XnatResourcecatalog> getXnatResourcecatalogsByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatResourcecatalog> al = new ArrayList<org.nrg.xdat.om.XnatResourcecatalog>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static XnatResourcecatalog getXnatResourcecatalogsByXnatAbstractresourceId(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("xnat:resourceCatalog/xnat_abstractresource_id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (XnatResourcecatalog) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
	public ArrayList<ResourceFile> getFileResources(String rootPath, boolean preventLoop){
ArrayList<ResourceFile> _return = new ArrayList<ResourceFile>();
	 boolean localLoop = preventLoop;
	              int counter=0;
	              for(java.io.File f: this.getCorrespondingFiles(rootPath)){
	                 ResourceFile rf = new ResourceFile(f);
	                 rf.setXpath("file/" + counter +"");
	                 rf.setXdatPath((counter++) +"");
	                 rf.setSize(f.length());
	                 rf.setAbsolutePath(f.getAbsolutePath());
	                 _return.add(rf);
	              }
	return _return;
}
}
