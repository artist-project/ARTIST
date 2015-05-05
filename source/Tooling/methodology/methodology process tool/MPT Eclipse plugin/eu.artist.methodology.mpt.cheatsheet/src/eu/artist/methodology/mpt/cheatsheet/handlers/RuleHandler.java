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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import eu.artist.methodology.mpt.cheatsheet.util.MPTLogger;
import  eu.artist.premigration.tft.mpt.rules.RulesKey;
import  eu.artist.premigration.tft.mpt.rules.RulesVariable;

public class RuleHandler extends AbstractHandler {
	
	String rules = "";
	static MPTLogger logger;
	
	public RuleHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		try {
		
			String task_id = event.getParameter("eu.artist.methodology.mpt.ruleParameter");
			logger.log("Rule under examination refers to task: " + task_id);
				
			HashMap<RulesKey<Integer, String, String, Integer, Integer>, String> rules_map = RulesVariable.rules_map;
			
			logger.log("Rules map size is " + rules_map.size());
		
			StringBuilder rules_string = new StringBuilder();
		
			for (Map.Entry<RulesKey<Integer, String, String, Integer, Integer>, String> entry : rules_map.entrySet()) {
			    
				RulesKey<Integer, String, String, Integer, Integer> key = entry.getKey();
			    
			    //FIXME
			    if (key.getTask().equals(task_id)) {
			    	 String value = entry.getValue();

					 if (rules_string.length() != 0) {
					    	rules_string.append(',');
					 }
					    
					 rules_string.append(value);		    	
			    }
			}
			
			logger.log("Rules map string is: " + rules_string);
			rules = rules_string.toString();
			
		} catch (Exception e) {
			logger.log("An exception occurred", e);
			e.printStackTrace();
		}
		
		return rules;
	}
}
