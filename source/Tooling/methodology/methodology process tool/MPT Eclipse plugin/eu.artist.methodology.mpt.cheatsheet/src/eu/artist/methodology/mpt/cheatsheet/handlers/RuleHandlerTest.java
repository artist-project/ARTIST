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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/*
import eu.artist.methodology.mpt.cheatsheet.rules.Pair;
import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;
*/


import  eu.artist.premigration.tft.mpt.rules.Pair;
import  eu.artist.premigration.tft.mpt.rules.RulesVariable;

public class RuleHandlerTest extends AbstractHandler {
	
	String rules = "";
	
	public RuleHandlerTest() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		File file = new File("C:\\mpt_logs\\ruleHandling.txt");
		file.getParentFile().mkdirs();
		FileWriter fw = null;
		try {
		    fw = new FileWriter(file, true);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Rule handler has been activated.");
		
		try {
			
			/*
			ArrayList <String> rules_array = RulesVariable.rules;
			System.out.println("Rules array size is " + rules_array.size());
			
	
			StringBuilder rules_string = new StringBuilder();
			Iterator<String> it = rules_array.iterator();
			if(it.hasNext()){
				rules_string.append(it.next());
				while(it.hasNext()){
					rules_string.append(',').append(it.next());
				}
			}
			
			System.out.println("Rules array string is " + rules_string);
			rules = rules_string.toString();
			*/
			
			String rule_id = event.getParameter("eu.artist.methodology.mpt.ruleParameter");
			System.out.println("Rule under examination refers to task: " + rule_id);
			pw.println("Rule under examination refers to task: " + rule_id);
			
			HashMap<Pair<String, String>, String> rules_map = RulesVariable.rules_map;
			
			System.out.println("Rules map size is " + rules_map.size());
			pw.println("Rules map size is " + rules_map.size());
				
			StringBuilder rules_string = new StringBuilder();
			/*
			for (Map.Entry<Pair<String, String>, String> entry : rules_map.entrySet()) {
			    Pair<String, String> key = entry.getKey();
			    String value = entry.getValue();
	
			    if (rules_string.length() != 0) {
			    	rules_string.append(',');
			    }
			    
			    rules_string.append(value);
			}
			*/
		
			for (Map.Entry<Pair<String, String>, String> entry : rules_map.entrySet()) {
			    Pair<String, String> key = entry.getKey();
			    
			    //System.out.println(key.getElement1());
			    
			    if (key.getElement1().equals(rule_id)) {
			    	 String value = entry.getValue();

					    if (rules_string.length() != 0) {
					    	rules_string.append(',');
					    }
					    
					    rules_string.append(value);		    	
			    }
			}
			
			System.out.println("Rules map string is " + rules_string);
			rules = rules_string.toString();
			
			pw.println("Rules map string is " + rules);
			
			pw.close();
			
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace(pw);
			pw.close();
			
			try {
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return rules;
		}
		
		return rules;
	}
}
