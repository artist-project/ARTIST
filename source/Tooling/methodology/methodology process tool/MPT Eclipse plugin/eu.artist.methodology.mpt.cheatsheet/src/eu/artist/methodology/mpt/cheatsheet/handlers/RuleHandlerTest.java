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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import eu.artist.methodology.mpt.cheatsheet.rules.Pair;
import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;

public class RuleHandlerTest extends AbstractHandler {
	
	String rules = "";
	
	public RuleHandlerTest() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
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
			
			HashMap<Pair<String, String>, String> rules_map = RulesVariable.rules_map;
			
			System.out.println("Rules map size is " + rules_map.size());
				
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
			
		} catch (Exception e) {
			e.printStackTrace();
			return rules;
		}
		
		return rules;
	}
}
