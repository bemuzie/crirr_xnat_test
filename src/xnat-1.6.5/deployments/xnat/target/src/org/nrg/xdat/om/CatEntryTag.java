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
public class CatEntryTag extends BaseCatEntryTag {

	public CatEntryTag(ItemI item)
	{
		super(item);
	}

	public CatEntryTag(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatEntryTag(UserI user)
	 **/
	public CatEntryTag()
	{}

	public CatEntryTag(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
