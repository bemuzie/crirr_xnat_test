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
public class XnatGenericdata extends BaseXnatGenericdata {

	public XnatGenericdata(ItemI item)
	{
		super(item);
	}

	public XnatGenericdata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseXnatGenericdata(UserI user)
	 **/
	public XnatGenericdata()
	{}

	public XnatGenericdata(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
