/*
 * GENERATED FILE
 * Created on Tue Oct 06 14:50:58 UTC 2015
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
public class CatCatalog extends BaseCatCatalog {

	public CatCatalog(ItemI item)
	{
		super(item);
	}

	public CatCatalog(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatCatalog(UserI user)
	 **/
	public CatCatalog()
	{}

	public CatCatalog(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
