/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.framework;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Assertions for Rules. Contains statistical assertions for matches (i.e.
 * hasMatch, hasNoMatch, etc.). For assertions on specific objects matched, see
 * {@link Matches}.
 * 
 * @see Matches
 * @see Units
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class Rules {
	
	// test number 1
	/**
	 * Assert that a rule produces a match
	 * 
	 * @param rule
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the rule should be applied to
	 * @throws AssertionError
	 */
	public static void assertRuleHasMatch(Rule rule, EGraph graph, Match partialMatch, Engine engine) throws AssertionError {
		if (!engine.findMatches(rule, graph, partialMatch).iterator().hasNext()) {
			throw new AssertionError("expected: Rule " + rule.getName() + " has matches, but has none");			
		}
	}
		
	// test number 2
	/**
	 * Assert that a {@link Rule} has no match
	 * 
	 * @param r
	 *            {@link Rule}
	 * @parem engine {@link Engine}
	 * @throws AssertionError
	 */
	public static void assertRuleHasNoMatch(Rule rule, EGraph graph, Match partialMatch, Engine engine) throws AssertionError {
		if (engine.findMatches(rule, graph, partialMatch).iterator().hasNext()) {
			throw new AssertionError("expected: Rule " + rule.getName() + " has no matches, but has one");			
		}
	}
	
	// test number 3
	/**
	 * Assert that a {@link Rule} produces exactly n matches
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param engine
	 *            {@link Engine}
	 * @param n
	 *            Number of expected matches
	 * @throws AssertionError
	 */
	@SuppressWarnings("unused")
	public static void assertRuleHasNMatches(Rule rule, EGraph graph, Match partialMatch, Engine engine, int n) throws AssertionError {
		int found = 0;
		for (Match match : engine.findMatches(rule, graph, partialMatch)) {
			found++;
		}
		if (found!=n) {
			throw new AssertionError("expected: Rule " + rule.getName() + " has " + n
					+ " matches, but has " + found);
		}
	}
	
	// test number 4	
	/**
	 * Assert that a {@link Rule} can be applied multiple times
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param engine
	 *            {@link Engine}
	 * @throws AssertionError
	 */
	public static void assertRuleCanBeAppliedMultipleTimes(Rule rule, EGraph graph, Engine engine)
			throws AssertionError {
		RuleApplication ra = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		ra.setEGraph(graph);
		ra.setRule(rule);
		assertRuleCanBeAppliedMultipleTimes(ra);
	}
		
	/**
	 * Assert that a {@link RuleApplication} can be applied multiple times
	 * 
	 * @param ra
	 *            {@link RuleApplication}
	 * @throws AssertionError
	 */
	public static void assertRuleCanBeAppliedMultipleTimes(RuleApplication ra)
			throws AssertionError {
		
		boolean success = ra.execute(null);
		if (success) {
			ra.setCompleteMatch(null);
			success = ra.execute(null);
		}
		if (!success) {
			throw new AssertionError("expected: Rule " + ra.getRule().getName()
					+ " can be applied multiple times.");
		}
		
	}
	
	// test number 5
	
	/**
	 * Assert that a {@link Rule} can be applied at least n times
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the rule should be applied to
	 * @param n
	 *            Number of applications
	 * @throws AssertionError
	 * @throws Exception
	 *             if n < 0
	 */
	public static void assertRuleCanBeAppliedNTimes(Rule r, EGraph graph, Engine engine, int n)
			throws AssertionError, Exception {
		RuleApplication ra = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		ra.setEGraph(graph);
		ra.setRule(r);
		assertRuleCanBeAppliedNTimes(ra, n);
	}
	
	/**
	 * Assert that a {@link RuleApplication} can be applied at least n times
	 * 
	 * @param ra
	 *            {@link RuleApplication}
	 * @param n
	 *            Number of applications
	 * @throws AssertionError
	 * @throws Exception
	 *             if n < 0
	 */
	public static void assertRuleCanBeAppliedNTimes(RuleApplication ra, int n)
			throws AssertionError, Exception {
		if (n < 0) {
			throw new Exception("n needs to be positive.");
		}
		boolean success = true;
		for (int i=0; i<n; i++) {
			success = ra.execute(null);
			if (!success) {
				break;
			}
			ra.setCompleteMatch(null);
		}
		if (!success) {
			throw new AssertionError("expected: Rule " + ra.getRule().getName()
					+ " can be applied at least " + n + " times");
		}
	}
		
	public static void assertRuleCanBeApplied(Rule r, EGraph graph, Engine engine) throws AssertionError {
		RuleApplication ra = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		ra.setEGraph(graph);
		ra.setRule(r);
		assertRuleCanBeApplied(ra);
	}
	
	public static void assertRuleCanBeApplied(RuleApplication ra) throws AssertionError {
		if (!ra.execute(null)) {
			throw new AssertionError("expected: Rule " + ra.getRule().getName()
					+ " can be applied.");
		}
	}
}
