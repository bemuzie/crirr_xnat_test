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
public abstract class BaseCatEntryTag extends AutoCatEntryTag {

	public BaseCatEntryTag(ItemI item)
	{
		super(item);
	}

	public BaseCatEntryTag(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatEntryTag(UserI user)
	 **/
	public BaseCatEntryTag()
	{}

	public BaseCatEntryTag(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
