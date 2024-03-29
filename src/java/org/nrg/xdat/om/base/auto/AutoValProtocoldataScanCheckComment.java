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
public abstract class AutoValProtocoldataScanCheckComment extends org.nrg.xdat.base.BaseElement implements org.nrg.xdat.model.ValProtocoldataScanCheckCommentI {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AutoValProtocoldataScanCheckComment.class);
	public static String SCHEMA_ELEMENT_NAME="val:protocolData_scan_check_comment";

	public AutoValProtocoldataScanCheckComment(ItemI item)
	{
		super(item);
	}

	public AutoValProtocoldataScanCheckComment(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use AutoValProtocoldataScanCheckComment(UserI user)
	 **/
	public AutoValProtocoldataScanCheckComment(){}

	public AutoValProtocoldataScanCheckComment(Hashtable properties,UserI user)
	{
		super(properties,user);
	}

	public String getSchemaElementName(){
		return "val:protocolData_scan_check_comment";
	}

	//FIELD

	private String _Comment=null;

	/**
	 * @return Returns the comment.
	 */
	public String getComment(){
		try{
			if (_Comment==null){
				_Comment=getStringProperty("comment");
				return _Comment;
			}else {
				return _Comment;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for comment.
	 * @param v Value to Set.
	 */
	public void setComment(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/comment",v);
		_Comment=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private String _Username=null;

	/**
	 * @return Returns the username.
	 */
	public String getUsername(){
		try{
			if (_Username==null){
				_Username=getStringProperty("username");
				return _Username;
			}else {
				return _Username;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for username.
	 * @param v Value to Set.
	 */
	public void setUsername(String v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/username",v);
		_Username=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Object _Datetime=null;

	/**
	 * @return Returns the dateTime.
	 */
	public Object getDatetime(){
		try{
			if (_Datetime==null){
				_Datetime=getProperty("dateTime");
				return _Datetime;
			}else {
				return _Datetime;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for dateTime.
	 * @param v Value to Set.
	 */
	public void setDatetime(Object v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/dateTime",v);
		_Datetime=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	//FIELD

	private Integer _ValProtocoldataScanCheckCommentId=null;

	/**
	 * @return Returns the val_protocolData_scan_check_comment_id.
	 */
	public Integer getValProtocoldataScanCheckCommentId() {
		try{
			if (_ValProtocoldataScanCheckCommentId==null){
				_ValProtocoldataScanCheckCommentId=getIntegerProperty("val_protocolData_scan_check_comment_id");
				return _ValProtocoldataScanCheckCommentId;
			}else {
				return _ValProtocoldataScanCheckCommentId;
			}
		} catch (Exception e1) {logger.error(e1);return null;}
	}

	/**
	 * Sets the value for val_protocolData_scan_check_comment_id.
	 * @param v Value to Set.
	 */
	public void setValProtocoldataScanCheckCommentId(Integer v){
		try{
		setProperty(SCHEMA_ELEMENT_NAME + "/val_protocolData_scan_check_comment_id",v);
		_ValProtocoldataScanCheckCommentId=null;
		} catch (Exception e1) {logger.error(e1);}
	}

	public static ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> getAllValProtocoldataScanCheckComments(org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> al = new ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment>();

		try{
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetAllItems(SCHEMA_ELEMENT_NAME,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> getValProtocoldataScanCheckCommentsByField(String xmlPath, Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> al = new ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(xmlPath,value,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> getValProtocoldataScanCheckCommentsByField(org.nrg.xft.search.CriteriaCollection criteria, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment> al = new ArrayList<org.nrg.xdat.om.ValProtocoldataScanCheckComment>();
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems(criteria,user,preLoad);
			al = org.nrg.xdat.base.BaseElement.WrapItems(items.getItems());
		} catch (Exception e) {
			logger.error("",e);
		}

		al.trimToSize();
		return al;
	}

	public static ValProtocoldataScanCheckComment getValProtocoldataScanCheckCommentsByValProtocoldataScanCheckCommentId(Object value, org.nrg.xft.security.UserI user,boolean preLoad)
	{
		try {
			org.nrg.xft.collections.ItemCollection items = org.nrg.xft.search.ItemSearch.GetItems("val:protocolData_scan_check_comment/val_protocolData_scan_check_comment_id",value,user,preLoad);
			ItemI match = items.getFirst();
			if (match!=null)
				return (ValProtocoldataScanCheckComment) org.nrg.xdat.base.BaseElement.GetGeneratedItem(match);
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
