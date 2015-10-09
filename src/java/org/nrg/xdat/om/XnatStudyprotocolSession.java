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
public class XnatStudyprotocolSession extends BaseXnatStudyprotocolSession {

	public XnatStudyprotocolSession(ItemI item)
	{
		super(item);
	}

	public XnatStudyprotocolSession(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseXnatStudyprotocolSession(UserI user)
	 **/
	public XnatStudyprotocolSession()
	{}

	public XnatStudyprotocolSession(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
