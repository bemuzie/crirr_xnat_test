/*
 * FilePathUpdater
 * XNAT http://www.xnat.org
 * Copyright (c) 2014, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 *
 * Last modified 7/1/13 9:12 AM
 */

import org.nrg.xdat.XDATTool;
import org.nrg.xft.XFT;
import org.nrg.xft.db.DBItemCache;
import org.nrg.xft.event.EventUtils;
import org.nrg.xft.exception.DBPoolException;
import org.nrg.xft.exception.ElementNotFoundException;
import org.nrg.xft.exception.XFTInitException;
import org.nrg.xft.utils.FileUtils;

import java.io.File;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tim
 *
 */
public class FilePathUpdater {
    public static void main(String[] args) {
		//elementName simple/select-grand file/console
			Map<String, String> hash = new HashMap<>();
	
			if (args.length <1){
				showUsage();
				return;
			}
			
			for(int i=0; i<args.length; i++){
							
				if (args[i].equalsIgnoreCase("-u")  || args[i].equalsIgnoreCase("-username")) {
					if (i+1 < args.length) 
					    hash.put("username",args[i+1]);
				}		
				if (args[i].equalsIgnoreCase("-instance")) {
					if (i+1 < args.length) 
					    hash.put("instance",args[i+1]);
				}			
				if (args[i].equalsIgnoreCase("-project")) {
					if (i+1 < args.length) 
					    hash.put("project",args[i+1]);
				}			
				if (args[i].equalsIgnoreCase("-xdir")) {
					if (i+1 < args.length) 
					    hash.put("xdir",args[i+1]);
				}		
				if (args[i].equalsIgnoreCase("-correct")) {
					if (i+1 < args.length) 
					    hash.put("correct",args[i+1]);
				}			

				if (args[i].equalsIgnoreCase("-p")  || args[i].equalsIgnoreCase("-password")) {
					if (i+1 < args.length) 
					    hash.put("password",args[i+1]);
				}				

				if (args[i].equalsIgnoreCase("-h")  || args[i].equalsIgnoreCase("-help")) {
					showUsage();
					return;
				}			

				if (args[i].equalsIgnoreCase("-quiet") ) {
					XFT.VERBOSE=false;
				}	
		
			}
						
			if (hash.get("username") == null || hash.get("password") == null)
			{
				System.out.println("No specified username and password.");
				System.exit(0);
			}
			
			Process(hash);
    }
	
	public static void showUsage()
	{
		System.out.println("Search");
		System.out.println("Function used to access particular sub-sets of the data in the database.\n");

		System.out.println("Options:");
		System.out.println("-xdir, File path to the xnat root directory (required with -project)");
		System.out.println("-project, Name of project to use. (required with -xdir)");
		System.out.println("-correct, true or false");
		System.out.println("-u,username (required) : username");
		System.out.println("-p,password (required) : password");
		System.out.println("-quiet (optional) : Disables un-necessary output.");
	}
	
	public static void Process(Map<String, String> hash)
	{
	    int _return = 0;
		try {
			//System.out.print(elementName + ":" + selectType + ":" + output);
		    if ((hash.get("xdir")!=null) && (hash.get("project")!=null))
			{
			    String xdir = hash.get("xdir");
			    String project = hash.get("project");
			    if (!xdir.endsWith(File.separator))
			    {
			        xdir += File.separator;
			    }
			    hash.put("instance",xdir + "deployments" + File.separator + project);
			}
		    
		    String directory;
		    if (hash.get("instance") == null)
		    {
				if (! (new File("InstanceSettings.xml")).exists())
				{
					System.out.println("\nERROR:  Missing instance document 'InstanceSettings.xml'");
					System.out.println("Use the -xdir and -project variables to specify the installation and project dir.");
					System.exit(0);
				}
				File f = new File("");
				directory = f.getAbsolutePath();
		    }else{
		        directory = hash.get("instance");
		        if (directory.endsWith("InstanceSettings.xml"))
		        {
		            directory = directory.substring(0,directory.length()-21);
		        }
		    }
		    
		    boolean correct = false;
		    if (hash.get("correct")!=null)
		    {
		        if (hash.get("correct").equalsIgnoreCase("true")){
		            correct = true;
		        }
		    }

			String username = hash.get("username");
			String password = hash.get("password");
			if (username==null || password==null)
			{
			    throw new Exception("Requires a username and password.");
			}
			
			XDATTool tool = new XDATTool(directory,username,password);
			tool.getWorkDirectory();
			
            DBItemCache cache =  new DBItemCache(null,EventUtils.DEFAULT_EVENT(tool.getUser(),"File Path Updater"));

            if (!correct)
			{
			    XFT.LogInsert(cache.getSQL(),"file_update");
			}
			
			FileUtils.OutputToFile("SESSION,OLD,NEW\n",tool.getWorkDirectory()+ "missing.csv");
			
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
			_return= 4;
		} catch (XFTInitException e) {
			e.printStackTrace();
			_return= 5;
		} catch (SQLException e) {
			e.printStackTrace();
			_return= 6;
		} catch (DBPoolException e) {
			e.printStackTrace();
			_return= 7;
		} catch (Exception e) {
			e.printStackTrace();
			_return= 9;
		}finally{
		    try {
	            XFT.closeConnections();
	        } catch (SQLException ignored) {
	        }
		}
		System.exit(_return);
	}
}
