/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.momot.match;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.model.Rule;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.engine.MomotEngine;
import at.ac.tuwien.big.momot.rule.ParameterManager;

public class MatchFinder {	
	public static final int UNLIMITED = -1;
	
	protected Engine engine;
	protected ParameterManager parameterManager;
	
	public MatchFinder(Engine engine, ParameterManager parameterManager) {
		if(parameterManager == null)
			throw new IllegalArgumentException("ParameterManager can not be null.");
		
		this.engine = engine;
		this.parameterManager = parameterManager;
	}
	
	public MatchFinder(ParameterManager parameterManager) {
		this(new MomotEngine(false), parameterManager);
	}

	public Engine getEngine() {
		return engine;
	}
	
	protected ParameterManager getParameterManager() {
		return parameterManager;
	}
	
	protected Match createPartialMatch(Rule rule) {
		return getParameterManager().populateMatch(new MatchImpl(rule));
	}
	
	protected List<Rule> getRules() {
		return parameterManager.getRuleManager().getRules();
	}
	
	public Match findMatch(EGraph graph) {
		return findMatch(graph, 5);
	}
	
	public Match findMatch(EGraph graph, int nrTriesPerRule) {
		List<Rule> rules = new ArrayList<>(getRules());
		
		Rule chosenRule = CollectionUtil.getRandomElement(rules);
		int nrRuleTries = nrTriesPerRule;
		
		while(chosenRule != null) {
			Match partialMatch = createPartialMatch(chosenRule);
			Iterator<Match> foundMatches = getEngine().findMatches(chosenRule, graph, partialMatch).iterator();
			
			if(foundMatches != null && foundMatches.hasNext()) 
				return getParameterManager().cleanMatch(foundMatches.next());
			
			if(partialMatch.isEmpty()) {
				// user has not assigned any parameters for this rule
				nrRuleTries = 0; // skip further tries for this rule
				rules.remove(chosenRule); // don't try this rule again
			}
			
			if(--nrRuleTries <= 0) {
				// try other rule
				rules.remove(chosenRule); // don't try this rule again
				chosenRule = CollectionUtil.getRandomElement(rules);
				nrRuleTries = nrTriesPerRule;
			}
		}
		return null; // not match found with the number of tries
	}
	
	public List<Match> findMatches(EGraph graph) {
		return findMatches(graph, 5);
	}
	
	public List<Match> findMatches(EGraph graph, int nrTriesPerRule) {
		List<Match> matches = new ArrayList<Match>();
		List<Rule> rules = new ArrayList<>(getRules());
		
		Rule chosenRule = CollectionUtil.getRandomElement(rules);
		int nrRuleTries = nrTriesPerRule;
		
		while(chosenRule != null) {
			Match partialMatch = createPartialMatch(chosenRule);
			Iterator<Match> foundMatches = getEngine().findMatches(chosenRule, graph, partialMatch).iterator();
			
			while(foundMatches != null && foundMatches.hasNext()) 
				matches.add(foundMatches.next());
			
			if(partialMatch.isEmpty()) {
				// user has not assigned any parameters for this rule
				nrRuleTries = 0; // skip further tries for this rule
				rules.remove(chosenRule); // don't try this rule again
			}
			
			if(--nrRuleTries <= 0) {
				// try other rule
				rules.remove(chosenRule); // don't try this rule again
				chosenRule = CollectionUtil.getRandomElement(rules);
				nrRuleTries = nrTriesPerRule;
			}
		}
		return matches; // not match found with the number of tries
	}
}
