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
public abstract class AutoXnatStudyprotocolVariable extends org.nrg.xdat.base.BaseElement implements org.nrg.xdat.model.XnatStudyprotocolVariableI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoXnatStudyprotocolVariable.class);
	public static String SCHEMA_ELEMENT_NAME="xnat:studyProtocol_variable";

	public AutoXnatStudyprotocolVariable(ItemI item)
	{
		super(item);
	}

	public AutoXnatStudyprotocolVariable(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoXnatStudyprotocolVariable(UserI user)
	 **/
	public AutoXnatStudyprotocolVariable(){}

	public AutoXnatStudyprotocolVariable(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "xnat:studyProtocol_variable";
	}

	//FIELD

	private String _Id=null;

	/**
	 * @return Returns the ID.
	 */
	public String getId(){
		try{
			if (_Id==null){
				_Id=getStringProperty("ID");
				return _Id;
			}else {
				return _Id;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for ID.
	 * @param v Value to Set.
	 */
	public void setId(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/ID",v);
		_Id=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Name=null;

	/**
	 * @return Returns the name.
	 */
	public String getName(){
		try{
			if (_Name==null){
				_Name=getStringProperty("name");
				return _Name;
			}else {
				return _Name;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for name.
	 * @param v Value to Set.
	 */
	public void setName(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/name",v);
		_Name=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Description=null;

	/**
	 * @return Returns the description.
	 */
	public String getDescription(){
		try{
			if (_Description==null){
				_Description=getStringProperty("description");
				return _Description;
			}else {
				return _Description;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for description.
	 * @param v Value to Set.
	 */
	public void setDescription(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/description",v);
		_Description=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _XnatStudyprotocolVariableId=null;

	/**
	 * @return Returns the xnat_studyProtocol_variable_id.
	 */
	public Integer getXnatStudyprotocolVariableId() {
		try{
			if (_XnatStudyprotocolVariableId==null){
				_XnatStudyprotocolVariableId=getIntegerProperty("xnat_studyProtocol_variable_id");
				return _XnatStudyprotocolVariableId;
			}else {
				return _XnatStudyprotocolVariableId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for xnat_studyProtocol_variable_id.
	 * @param v Value to Set.
	 */
	public void setXnatStudyprotocolVariableId(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/xnat_studyProtocol_variable_id",v);
		_XnatStudyprotocolVariableId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> getAllXnatStudyprotocolVariables(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> al = new ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> getXnatStudyprotocolVariablesByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> al = new ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> getXnatStudyprotocolVariablesByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable> al = new ArrayList<org.nrg.xdat.om.XnatStudyprotocolVariable>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static XnatStudyprotocolVariable getXnatStudyprotocolVariablesByXnatStudyprotocolVariableId(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("xnat:studyProtocol_variable/xnat_studyProtocol_variable_id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (XnatStudyprotocolVariable) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
	        localLoop = preventLoop;
	
	return _return;
}
}
