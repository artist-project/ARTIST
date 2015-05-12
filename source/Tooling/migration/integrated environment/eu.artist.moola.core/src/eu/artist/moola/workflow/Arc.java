/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.workflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arc {
	
	private ITokenHolder start;
	private ITokenHolder end;
	
	private List<String> tokenRestrictors;
	
	// move to special sub-type (?)
	private ICondition condition;
	
	public Arc() {
		this.tokenRestrictors = new ArrayList<String>();
	}
	
	public Arc(ITokenHolder start, ITokenHolder end) {
		this();
		this.start = start;
		this.end = end;
	}

	public void moveTokens(Collection<Token> tokens) {
		for(Token token : tokens) {
			end.addToken(token);
		}
	}

	public ICondition getCondition() {
		return this.condition;
	}
	
	public void setCondition(ICondition condition) {
		this.condition = condition;
	}
	
	public boolean isElseArc() {
		return this.condition == null;
	}
	
	/**
	 * 
	 * @param tokens
	 * @return
	 */
	public boolean evaluateCondition(Collection<Token> tokens) {
		if(condition == null) {
			return false; // "else" arc
		} else {
			return condition.evaluate(tokens);
		}
	}

	/**
	 * Consuming read
	 * @return
	 */
	public Collection<Token> takeTokens() {
		if(this.hasRestrictions()) {
			// take the ones we need
			List<Token> ret = new ArrayList<>();
			for(String name : this.tokenRestrictors){
				ret.add(this.start.takeToken(name));
			}
			return ret;	
		} else {
			// take all
			return this.start.takeAllTokens();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasRestrictions() {
		return this.tokenRestrictors.size() > 0;
	}
	
	/**
	 * Checks if all required tokens are present and that all 
	 * conditions are met (if there are conditions)
	 * @return True if the arc is fulfilled, false otherwise
	 */
	public boolean isFulfilled() {
		if(this.hasRestrictions()) {
			// we need all required ones
			boolean hasRequired = true;
			for(String name : this.tokenRestrictors){
				if(!this.start.hasToken(name)) {
					hasRequired = false;
				}
			}
			return hasRequired;	
		} else {
			// any token is enough
			return start.hasTokens(); 
		}
	}

	@Override
	public String toString() {
		return "Arc from " + start.getName() + " to " + end.getName();
	}
	
	/**
	 * Creates a new arc instance connection a and b
	 * @return A new arc instance
	 */
	public static Arc connect(ITokenHolder a, ITokenHolder b) {
		Arc arc = new Arc(a, b);
		a.addOutput(arc);
		b.addInput(arc);
		return arc;
	}

	/**
	 * Creates a new arc instance connection a and b
	 * @return A new arc instance
	 */
	public static Arc connect(ITokenHolder a, ITokenHolder b, ICondition condition) {
		Arc arc = connect(a, b);
		arc.setCondition(condition);
		return arc;
	}
	
}
