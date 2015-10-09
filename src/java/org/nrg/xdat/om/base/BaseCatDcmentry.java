/*
 * GENERATED FILE
 * Created on Tue Oct 06 14:50:59 UTC 2015
 *
 */
package org.nrg.xdat.om.base;
import org.nrg.xdat.om.base.auto.*;
import org.nrg.xft.*;
import org.nrg.xft.security.UserI;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class BaseCatDcmentry extends AutoCatDcmentry {

	public BaseCatDcmentry(ItemI item)
	{
		super(item);
	}

	public BaseCatDcmentry(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatDcmentry(UserI user)
	 **/
	public BaseCatDcmentry()
	{}

	public BaseCatDcmentry(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
