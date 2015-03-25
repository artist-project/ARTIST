/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter;

import java.util.Map;

import javax.script.ScriptEngine;

import org.eclipse.emf.henshin.model.Rule;

/**
 * Interface for interpreter engines.
 * 
 * @author Christian Krause, Enrico Biermann
 */
public interface Engine {

	/**
	 * Option for general injective rule matching.
	 */
	String OPTION_INJECTIVE_MATCHING = "INJECTIVE_MATCHING";

	/**
	 * Option for general checks for dangling edges.
	 */
	String OPTION_CHECK_DANGLING = "CHECK_DANGLING";

	/**
	 * Option for general deterministic engine behavior.
	 */
	String OPTION_DETERMINISTIC = "DETERMINISTIC";

	/**
	 * Option for enabling / disabling automatic variable sorting.
	 */
	String OPTION_SORT_VARIABLES = "SORT_VARIABLES";

	/**
	 * Option for enabling / disabling inverse matching order.
	 */
	String OPTION_INVERSE_MATCHING_ORDER = "INVERSE_MATCHING_ORDER";

	/**
	 * Option for allowing the engine to destroy matching in {@link #createChange(Rule, EGraph, Match, Match)}.
	 */
	String OPTION_DESTROY_MATCHES = "DESTROY_MATCHES";

	/**
	 * Option for setting the number of worker threads to be used.
	 */
	String OPTION_WORKER_THREADS = "WORKER_THREADS";

	/**
	 * Find matches for a {@link Rule} in an {@link EGraph}.
	 * 
	 * @param rule Rule to be matched.
	 * @param graph Graph where the match should be found.
	 * @param partialMatch Partial match (can be empty or <code>null</code>).
	 * @return An iterable list of matches.
	 */
	Iterable<Match> findMatches(Rule rule, EGraph graph, Match partialMatch);

	/**
	 * Create an {@link Change} for applying a rule.
	 * 
	 * @param rule Rule to be applied.
	 * @param graph Graph where the rule should be applied.
	 * @param completeMatch A <b>complete</b> match for the rule in the graph.
	 * @param resultMatch This result match will be initialized by the engine!
	 * @return An {@link Change} object that can be used to apply the rule
	 */
	Change createChange(Rule rule, EGraph graph, Match completeMatch, Match resultMatch);

	/**
	 * Get the used script engine.
	 * 
	 * @return Script engine.
	 */
	ScriptEngine getScriptEngine();

	/**
	 * Get or set the options for this engine.
	 * 
	 * @return Options map.
	 */
	Map<String, Object> getOptions();

	/**
	 * Shutdown this engine.
	 */
	void shutdown();

}
