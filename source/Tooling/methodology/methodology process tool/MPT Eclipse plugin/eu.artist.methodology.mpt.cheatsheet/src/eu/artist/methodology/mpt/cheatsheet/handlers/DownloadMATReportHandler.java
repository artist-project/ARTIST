/*******************************************************************************
 *  Copyright (c) 2014 - 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *  
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.cheatsheet.handlers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


import eu.artist.suite.ARTISTSuite;
//import eu.artist.methodology.mpt.cheatsheet.Activator;
import eu.artist.suite.preferences.PreferenceConstants;

public class DownloadMATReportHandler extends AbstractHandler {
	String mat_report_path = "";
	
	String strXml = "";
	
	protected Shell shlLoginToMat;   

    private final static String HEXES = "0123456789abcdef";
	
	public DownloadMATReportHandler() {
	
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		   try {
                 
			     String user = getValueFromPreferenceStore(PreferenceConstants.MAT_USERNAME.getValue());

			     String pwd = getValueFromPreferenceStore(PreferenceConstants.MAT_PASSWORD.getValue());
			     
			     strXml = downloadMATReport(user, pwd);
                 
                 System.out.println("Received MAT report XML string:" + strXml);
                         
                 final IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
                                 
                 Display.getDefault().syncExec( new Runnable() {  
         	    	public void run() { 
         	    		
         	    		Shell shell = new Shell();
         	    	    DirectoryDialog dirDialog = new DirectoryDialog(shell);
         	    	    dirDialog.setText("Select where to store the MAT report");               	    	    
         	    	    dirDialog.setFilterPath(workspace.getLocation().toString());
         	    	    
         	    	    String selectedDir = dirDialog.open();
         	    	    System.out.println("The selected directory is: " + selectedDir);
         	    	            	    	    
         	    	    //p.makeRelativeTo(ResourcesPlugin.getWorkspace().getRoot().getRawLocation());
         	    	    String selectedDirRelative = new File(workspace.getLocation().toString()).toURI().relativize(new File(selectedDir).toURI()).getPath();
         	    	    IPath p = new Path(selectedDirRelative);
         	    	    System.out.println("The relative path to the workspace directory is: " + p.toString());
         	    	     
         	    	    IFolder folder = workspace.getFolder(p);
         	    	                                   
         	    	    if (folder.exists()) {
                          	
                         	System.out.println("Going to store MAT report at selected directory.");
                         	
                         	String timestamp = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
                          	IFile file = folder.getFile("MAT_report_" + timestamp + ".xml"); 
                          
                          	InputStream source = new ByteArrayInputStream(strXml.getBytes());
                          	try {
									file.create(source, false, null);
									mat_report_path = file.getFullPath().toOSString().toString();
									
									IPreferenceStore store = ARTISTSuite.getDefault().getPreferenceStore();
									
								    store.setValue(PreferenceConstants.MPT_MAT_REPORT_PATH.getValue(), file.getRawLocation().makeAbsolute().toOSString());
								    
							} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
							}
                         }   
         		        
         	    	} 
         	    });
                 
               
	        } catch (Exception e) {
	            e.printStackTrace();
	        }	
	    
	    return mat_report_path;
	    
	}
	
	private String getValueFromPreferenceStore(String parameter) {
		
		String value = ARTISTSuite.getDefault().getPreferenceStore().getString(parameter);
	    System.out.println("Parameter value: " + value);
	    
		return value;
	}
	
	private String downloadMATReport(String user, String password) {

	    String params = getParams();
    
	    String uri = getValueFromPreferenceStore(PreferenceConstants.MAT_URL.getValue()) + "webresources/question/getmpt";
	    
	    String matReportString = null;

	    try {

	         uri += "?login=" + user + "&params=" + params + "&hash=" + getHash(user, password, params);

	         System.out.println(uri);

	         URL url = new URL(uri);

	         HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	         connection.setRequestMethod("GET");

	         connection.setRequestProperty("Accept", "application/xml");

	         String output;

	         String strXml;

	         StringBuilder builder = new StringBuilder();

	         BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));              

	         while ((output = br.readLine()) != null) {                        
	               builder.append(output);
	         }

	         strXml = builder.toString();
	         matReportString = strXml;
	      
	         connection.disconnect();

	    } catch (Exception e) {                                    
	         e.printStackTrace();
	    }
	    
	    return matReportString;

	} 

	private static String getParams() {

	      Date date= new Date();

	      String params = "";

	      params = "{\"ts\":\"" + date.getTime() + "\"}";

	      return params;

	}

	public static String getHash(String login, String password, String params) throws Exception {

	      String hash = login + "$" + password;

	      final MessageDigest md = MessageDigest.getInstance("SHA-512");

	      ByteArrayOutputStream pwsalt = new ByteArrayOutputStream();

	      pwsalt.write(hash.getBytes("UTF-8"));

	      byte[] unhashedBytes = pwsalt.toByteArray();

	      byte[] digestVonPassword = md.digest(unhashedBytes);

	      String ihash = getHex(digestVonPassword);

	      hash = login + "$" + params + "$" + ihash;

	      pwsalt.reset();

	      pwsalt.write(hash.getBytes("UTF-8"));

	      unhashedBytes = pwsalt.toByteArray();

	      digestVonPassword = md.digest(unhashedBytes);

	      ihash = getHex(digestVonPassword);

	      return ihash;

	 }

	 private static String getHex(byte[] raw) {

	      if (raw == null) {

	         return null;

	      }

	      final StringBuilder hex = new StringBuilder(2 * raw.length);

	      for (final byte b : raw) {

	          hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));

	      }

	      return hex.toString();
	}	
}
