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
public abstract class BaseCatCatalogMetafield extends AutoCatCatalogMetafield {

	public BaseCatCatalogMetafield(ItemI item)
	{
		super(item);
	}

	public BaseCatCatalogMetafield(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseCatCatalogMetafield(UserI user)
	 **/
	public BaseCatCatalogMetafield()
	{}

	public BaseCatCatalogMetafield(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
