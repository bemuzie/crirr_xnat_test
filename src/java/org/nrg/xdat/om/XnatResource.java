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
public class XnatResource extends BaseXnatResource {

	public XnatResource(ItemI item)
	{
		super(item);
	}

	public XnatResource(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseXnatResource(UserI user)
	 **/
	public XnatResource()
	{}

	public XnatResource(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
