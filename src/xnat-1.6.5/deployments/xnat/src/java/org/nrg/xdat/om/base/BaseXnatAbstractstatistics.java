/*
 * org.nrg.xdat.om.base.BaseXnatAbstractstatistics
 * XNAT http://www.xnat.org
 * Copyright (c) 2014, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 *
 * Last modified 7/10/13 9:04 PM
 */
package org.nrg.xdat.om.base;

import org.nrg.xdat.om.base.auto.AutoXnatAbstractstatistics;
import org.nrg.xft.ItemI;
import org.nrg.xft.security.UserI;

import java.util.Hashtable;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({"unchecked","rawtypes"})
public abstract class BaseXnatAbstractstatistics extends AutoXnatAbstractstatistics {

	public BaseXnatAbstractstatistics(ItemI item)
	{
		super(item);
	}

	public BaseXnatAbstractstatistics(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseXnatAbstractstatistics(UserI user)
	 **/
	public BaseXnatAbstractstatistics()
	{}

	public BaseXnatAbstractstatistics(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
