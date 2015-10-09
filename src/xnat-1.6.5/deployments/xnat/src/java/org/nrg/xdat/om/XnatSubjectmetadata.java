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
public class XnatSubjectmetadata extends BaseXnatSubjectmetadata {

	public XnatSubjectmetadata(ItemI item)
	{
		super(item);
	}

	public XnatSubjectmetadata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BaseXnatSubjectmetadata(UserI user)
	 **/
	public XnatSubjectmetadata()
	{}

	public XnatSubjectmetadata(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

}
