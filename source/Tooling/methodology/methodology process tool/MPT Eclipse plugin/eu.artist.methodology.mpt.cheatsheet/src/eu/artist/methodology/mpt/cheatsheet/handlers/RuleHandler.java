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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

//import eu.artist.methodology.mpt.cheatsheet.rules.RulesVariable;

import eu.artist.premigration.tft.mpt.rules.RulesVariable;

public class RuleHandler extends AbstractHandler {
	
	String is_rule_satisfied = "false";
	
	public RuleHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		try {
			
			//re-initialize boolean to false
			is_rule_satisfied = "false";
			String rule_id = event.getParameter("eu.artist.methodology.mpt.ruleParameter");
			//Map map = event.getParameters();
			//System.out.println("The parameters map size is " + map.size());
			System.out.println("Rule under examination is: " + rule_id);
	
			ArrayList <String> rules_array = RulesVariable.rules;
			System.out.println("Rules array size is " + rules_array.size());
			
			if (rules_array.contains(rule_id)) {
				
				System.out.println("The rule is satisfied: " + rule_id);
				is_rule_satisfied = "true";
				
			}
			
			System.out.println("Returning " + is_rule_satisfied); 
			
		} catch (Exception e) {
			e.printStackTrace();
			return is_rule_satisfied;
		}
		
		return is_rule_satisfied;
	}
}
