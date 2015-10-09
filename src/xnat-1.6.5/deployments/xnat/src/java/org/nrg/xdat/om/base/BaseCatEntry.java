/*
 * GENERATED FILE
 * Created on Tue Oct 06 14:50:58 UTC 2015
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
public abstract class BaseCatEntry extends AutoCatEntry {

	public BaseCatEntry(ItemI item)
	{
		super(item);
	}

	public BaseCatEntry(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatEntry(UserI user)
	 **/
	public BaseCatEntry()
	{}

	public BaseCatEntry(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
