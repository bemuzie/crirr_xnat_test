/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:49 UTC 2015
 *
 */
package org.nrg.xdat.turbine.modules.screens;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.screens.SecureReport;

/**
 * @author XDAT
 *
 */
public class XDATScreen_report_ext_atlasScalingFactorData extends SecureReport {
	public static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(XDATScreen_report_ext_atlasScalingFactorData.class);
	/* (non-Javadoc)
	 * @see org.nrg.xdat.turbine.modules.screens.SecureReport#finalProcessing(org.apache.turbine.util.RunData, org.apache.velocity.context.Context)
	 */
	public void finalProcessing(RunData data, Context context) {
		try{
			org.nrg.xdat.om.ExtAtlasscalingfactordata om = new org.nrg.xdat.om.ExtAtlasscalingfactordata(item);
			org.nrg.xdat.om.XnatMrsessiondata mr = om.getMrSessionData();
			context.put("om",om);
			System.out.println("Loaded om object (org.nrg.xdat.om.ExtAtlasscalingfactordata) as context parameter 'om'.");
			context.put("mr",mr);
			System.out.println("Loaded mr session object (org.nrg.xdat.om.XnatMrsessiondata) as context parameter 'mr'.");
			context.put("subject",mr.getSubjectData());
			System.out.println("Loaded subject object (org.nrg.xdat.om.XnatSubjectdata) as context parameter 'subject'.");
		} catch(Exception e){}
	}}
