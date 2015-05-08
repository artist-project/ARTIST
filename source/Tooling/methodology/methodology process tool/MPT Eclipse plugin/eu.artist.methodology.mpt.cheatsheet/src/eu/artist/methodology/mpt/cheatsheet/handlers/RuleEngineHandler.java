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

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

//import eu.artist.methodology.mpt.cheatsheet.Activator;
import eu.artist.methodology.mpt.cheatsheet.util.MPTLogger;
import eu.artist.premigration.tft.mpt.api.RuleEngine;
import eu.artist.premigration.tft.mpt.model.GlobalVariable;
import eu.artist.premigration.tft.mpt.rules.RulesVariable;
import eu.artist.premigration.tft.tft.views.MigrationGoalsView;
import eu.artist.suite.preferences.PreferenceConstants;
import eu.artist.suite.ARTISTSuite;


public class RuleEngineHandler extends AbstractHandler {
	String selected_file=null;
	String is_file_selected=null;
	IFile ifile = null;
	static MPTLogger logger = new MPTLogger();
	
	public RuleEngineHandler() {
	
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

	try {
		
	
		//Bundle bundle = Platform.getBundle("eu.artist.methodology.mpt.cheatsheet");
		//URL rulesFileURL = bundle.getEntry("resources/RuleSet_1.drl");
		
		URL rulesFileURL=null;
		
		try {
			
			rulesFileURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/resources/RuleSet_8.drl");
		    
			/*
			InputStream inputStream = rulesFileURL.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		 
		    while ((inputLine = in.readLine()) != null) {
		        System.out.println(inputLine);
		    }
		 
		    in.close();
		    */

			//Changed in order to avoid errors, this code will not be needed in the future
		    //ifile = MigrationGoalsView.xmlFile;
			//ifile = MigrationGoalsView.gmlFile;
		    
		} catch (Exception exc) {
			logger.log("An exception occured", exc);
			exc.printStackTrace();
			return "error";
		}
		
		/*
		if (ifile == null) {
			logger.log("IFile is null: selected file does not reside in the workspace");
			return "error";
			
		} else {
		*/
		
			//File mgFile = null, rulesFile = null;
			File rulesFile = null;
			
			try {

				//mgFile = ifile.getRawLocation().makeAbsolute().toFile();
				
				URL resolvedFileURL = FileLocator.toFileURL(rulesFileURL);
				URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
				rulesFile = new File(resolvedURI);
						   
				//rulesFile = new File(FileLocator.resolve(rulesFileURL).toURI());
			
				//RuleEngine.INSTANCE.loadMATReport(mgFile);
				
				String mptMatReport = ARTISTSuite.getDefault().getPreferenceStore().getString(PreferenceConstants.MPT_MAT_REPORT_PATH.getValue());
			    logger.log("MPT MAT report is located at: " + mptMatReport);
			    
			    if (mptMatReport == null || mptMatReport == "") {
			    	mptMatReport = loadMPTMATReport();
			    	
			    	IPreferenceStore store = ARTISTSuite.getDefault().getPreferenceStore();					
				    store.setValue(PreferenceConstants.MPT_MAT_REPORT_PATH.getValue(), mptMatReport);
			    }
				
				RuleEngine.INSTANCE.loadNewMATReport(new File(mptMatReport));
			    logger.log("The MAT report has been loaded in the Rule Engine.");
				RuleEngine.INSTANCE.setRuleFile(rulesFile);
				
			} catch (Exception e) {
				logger.log("An exception occurred", e);
				e.printStackTrace();
				return "error";
			}
			
			List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
			try {			
				RulesVariable.clearHashMap();
				GlobalVariable r_variable = new GlobalVariable("rulesVariable", new RulesVariable());
					
				variables.add(r_variable);
				RuleEngine.INSTANCE.fireRules(variables);
				//Result result = RuleEngine.INSTANCE.getResult();
			} catch (Exception e) {
				logger.log("An exception occurred", e);
				e.printStackTrace();
				return "error";
			}
			
			return "pass";
		//}
		
	} catch (Exception e) {
		    logger.log("An exception occurred", e);
			e.printStackTrace();
			return "error";
	}			
  }
	
  public String loadMPTMATReport() {
		 
		Display.getDefault().syncExec( new Runnable() {  
	    	public void run() { 
	    		
	    		//Shell shell = new Shell(display);
	    		Shell shell = new Shell();
		        // File standard dialog
		        FileDialog fileDialog = new FileDialog(shell);
		        // Set the text
		        fileDialog.setText("Select MAT report file");
		        // Set filter on .xml files
		        fileDialog.setFilterExtensions(new String[] { "*.xml" });
		        // Put in a readable name for the filter
		        fileDialog.setFilterNames(new String[] { "MAT reports(*.xml)" });
		        
		        IWorkspace workspace= ResourcesPlugin.getWorkspace();
		        
		        String workspace_path = workspace.getRoot().getLocation().toString();
		        logger.log("Workspace path is " + workspace_path);
		        
		        fileDialog.setFilterPath(workspace_path);
		        
		        // Open Dialog and save result of selection
		        selected_file = fileDialog.open();
			    logger.log("The selected MAT report is " + selected_file);  
		        
		        if (selected_file!=null && selected_file!="") {
		        	is_file_selected = "true";
		        	
		        } else {
		        	is_file_selected = "false";
		        }
		        logger.log("is file selected " + is_file_selected);
	    	} 
	    });
		
		return selected_file;				
	}
}
