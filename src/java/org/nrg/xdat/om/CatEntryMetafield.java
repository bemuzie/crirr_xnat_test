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
public class CatEntryMetafield extends BaseCatEntryMetafield {

	public CatEntryMetafield(ItemI item)
	{
		super(item);
	}

	public CatEntryMetafield(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatEntryMetafield(UserI user)
	 **/
	public CatEntryMetafield()
	{}

	public CatEntryMetafield(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
