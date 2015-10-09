/*
 * GENERATED FILE
 * Created on Tue Oct 06 14:50:59 UTC 2015
 *
 */
package org.nrg.xdat.om;
import org.nrg.xft.*;
import org.nrg.xdat.om.base.*;
import org.nrg.xft.security.UserI;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class CatDcmentry extends BaseCatDcmentry {

	public CatDcmentry(ItemI item)
	{
		super(item);
	}

	public CatDcmentry(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatDcmentry(UserI user)
	 **/
	public CatDcmentry()
	{}

	public CatDcmentry(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
