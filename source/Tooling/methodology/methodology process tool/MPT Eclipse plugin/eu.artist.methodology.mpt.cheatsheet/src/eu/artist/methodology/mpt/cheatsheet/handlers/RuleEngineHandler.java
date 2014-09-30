/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;

/*
import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;
import eu.artist.methodology.mpt.model.GlobalVariable;
import eu.artist.methodology.mpt.model.Result;
import eu.artist.methodology.mpt.rule.api.RuleEngine;
import eu.artist.premigration.tft.tft.views.MigrationGoalsView;
*/

import eu.artist.premigration.tft.mpt.rules.RulesVariable;
import eu.artist.premigration.tft.mpt.model.GlobalVariable;
import eu.artist.premigration.tft.mpt.model.Result;
import eu.artist.premigration.tft.mpt.api.RuleEngine;
import eu.artist.premigration.tft.tft.views.MigrationGoalsView;

public class RuleEngineHandler extends AbstractHandler {
	public RuleEngineHandler() {
	
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
	
	File file = new File("C:\\mpt_logs\\ruleEngineHandler.txt");
	file.getParentFile().mkdirs();
	FileWriter fw = null;
	
	try {
	    fw = new FileWriter(file, true);
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	PrintWriter pw = new PrintWriter(fw);
	pw.print("Rule Engine handler has been activated.");
	
	try {
		
	
		//Bundle bundle = Platform.getBundle("eu.artist.methodology.mpt.cheatsheet");
		//URL rulesFileURL = bundle.getEntry("resources/RuleSet_1.drl");
		
		URL rulesFileURL=null;
		
		try {
			rulesFileURL = new URL("platform:/plugin/eu.artist.methodology.mpt.cheatsheet/resources/RuleSet_3.drl");
		    /*
			InputStream inputStream = rulesFileURL.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		 
		    while ((inputLine = in.readLine()) != null) {
		        System.out.println(inputLine);
		    }
		 
		    in.close();
		    */
		 
		} catch (Exception e) {
		    e.printStackTrace(pw);
		    //return "error code x: " + e.getMessage();
		    return "error";
		}
		
		IFile ifile = null;
		try {
		  ifile = MigrationGoalsView.xmlFile;
		} catch (Exception exc) {
			exc.printStackTrace(pw);
			//return "error code 1: " + exc.getMessage();
			return "error";
		}
		
		if (ifile == null) {
			
			pw.println("IFile is null: selected file does not reside in the workspace");
			//return "error code 2: selected file does not reside in the workspace" ;
			return "error";
			
		} else {
		
			File mgFile = null, rulesFile = null;
			try {

				mgFile = ifile.getRawLocation().makeAbsolute().toFile();
				
				URL resolvedFileURL = FileLocator.toFileURL(rulesFileURL);
				URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
				rulesFile = new File(resolvedURI);
						   
				//rulesFile = new File(FileLocator.resolve(rulesFileURL).toURI());
			} catch (URISyntaxException e1) {
				e1.printStackTrace(pw);
				//return "error code 3: " + e1.getMessage();
				return "error";
			} catch (IOException e1) {
				e1.printStackTrace(pw);
				//return "error code 4: " + e1.getMessage();
				return "error";
			} catch (Exception e1) {
				e1.printStackTrace(pw);
				//return "error code 5: " + e1.getMessage();
				return "error";
			}
			
			try {
				RuleEngine.INSTANCE.loadMATReport(mgFile);
			} catch (Exception e) {
				e.printStackTrace(pw);
				//return "error code xx " + e.getMessage();
				return "error";
				
			}
			
			try {
				RuleEngine.INSTANCE.setRuleFile(rulesFile);
			} catch (Exception e) {
				e.printStackTrace(pw);
				//return "error code xxx " + e.getMessage();
				return "error";
			}
			
		
			//RulesVariable rules = new RulesVariable();
			List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
			try {
				
				RulesVariable.clearArray();
				RulesVariable.clearHashMap();
				GlobalVariable r_variable = new GlobalVariable("rulesVariable", new RulesVariable());
				//GlobalVariable r_variable = new GlobalVariable("rulesVariable", rules);
				//List<GlobalVariable> variables = new ArrayList<GlobalVariable>();
				variables.add(r_variable);
			} catch (Exception e) {
				e.printStackTrace(pw);
				//return "error code xxxx " + e.getMessage();
				return "error";
			}
			
			try {
		
				RuleEngine.INSTANCE.fireRules(variables);
				
			} catch (Exception e) {				
				e.printStackTrace (pw);
				//return "error code 5x " + e.getMessage() + "   " + mgFile.getPath() + "  " + rulesFile.getPath();
				return "error";
			}
			
			try {
				Result result = RuleEngine.INSTANCE.getResult();
				System.out.println("Result: " + result.getStringResult());
				pw.println("Result: " + result.getStringResult());
				//System.out.println(((RulesVariable)r_variable.getVariable()).getRuleString());
				//System.out.println(RulesVariable.rules);
				pw.close();
				
				fw.close();
				
			} catch (Exception e) {
				e.printStackTrace(pw);
				//return "error code 6x " + e.getMessage() + "   " + mgFile.getPath() + "  " + rulesFile.getPath();
				return "error";
			}
			
			return "pass";
		}
		
	} catch (Exception e) {
			e.printStackTrace(pw);
			//return "error code 6: " + e.getMessage();	
			
			return "error";
	}			
  }
}
