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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Rule;

//TODO: add more support for non-injective interpreters

/**
 * Assertions for everything related to matches, e.g. matches produced by
 * {@link RuleApplication}s, {@link UnitApplication}s, (partial) matches on
 * element groups, etc.
 * 
 * @see Rules
 * @see Units
 * @see ElementGroups
 * @see Graphs
 * @see GraphTransformations
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * @author Christian Krause
 * 
 */
public class Matches {
	/**
	 * Assert that an object is contained in all of a {@link Rule}'s matches.
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the Rule will be applied to
	 * @param object
	 *            {@link EObject}
	 * @throws AssertionError
	 */
	public static void assertObjectContainedInAllMatches(Rule r, EGraph graph, Match partialMatch, Engine engine, EObject object)
			throws AssertionError {
		
		boolean foundMatch = false;
		for (Match match : engine.findMatches(r, graph, partialMatch)) {
			foundMatch = true;
			if (!match.getNodeTargets().contains(object)) {
				throw new AssertionError("expected: Object contained in every match, but it's not");
			}
			
		}
		if (!foundMatch) {
			throw new AssertionError(
					"expected: Object contained in every match, but Rule produces no matches");
		}
		
	}
	
	/**
	 * Assert that an object is contained in none of a {@link Rule}'s matches
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the {@link Rule} will be applied to
	 * @param object
	 *            {@link EObject}
	 * @throws AssertionError
	 */
	public static void assertObjectContainedInNoMatch(Rule r, EGraph graph, Match partialMatch, Engine engine, EObject object)
			throws AssertionError {

		for (Match match : engine.findMatches(r, graph, partialMatch)) {
			if (match.getNodeTargets().contains(object)) {
				throw new AssertionError(
						"expected: Object contained in no match, but contained in at least one");
			}
			
		}
	}
	
	/**
	 * Assert that an object is contained in exactly n of a {@link Rule}'s
	 * matches
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the {@link Rule} will be applied to
	 * @param object
	 *            {@link EObject}
	 * @param n
	 *            Number of expected matches
	 * @throws AssertionError
	 */
	public static void assertObjectContainedInNMatches(Rule r, EGraph graph, Match partialMatch, Engine engine, EObject object, int n)
			throws AssertionError {
		
		int num = 0;
		for (Match match : engine.findMatches(r, graph, partialMatch)) {
			if (match.getNodeTargets().contains(object)) {
				num++;
			}
		}
		if (num != n) {
			throw new AssertionError("expected: Object contained in " + n
					+ " matches, but contained in " + num);
		}
	}
	
	/**
	 * Assert that an object is contained in at least one of a {@link Rule}'s
	 * matches
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param engine
	 *            {@link Engine} by which the {@link Rule} will be executed
	 * @param object
	 *            {@link EObject}
	 * @throws AssertionError
	 */
	public static void assertObjectContainedInAtLeastOneMatch(Rule r, EGraph graph, Match partialMatch, Engine engine,
			EObject object) throws AssertionError {
		for (Match m : engine.findMatches(r, graph, partialMatch)) {
			if (m.getNodeTargets().contains(object)) {
				return;
			}
		}
		throw new AssertionError("expected: Object is contained in at least one match of "
				+ r.getName() + ", but is contained in none");
	}
		
	/**
	 * Assert that no element contained in the specified {@link Collection} is
	 * contained in any {@link Match} produced by executing the specified
	 * {@link Rule} on the {@link Engine}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param engine
	 *            {@link Engine} by which the {@link Rule} will be executed
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @throws AssertionError
	 */
	public static void assertNoObjectFromGroupContainedInAnyMatch(Rule r, EGraph graph, Match partialMatch, Engine engine,
			Collection<? extends EObject> group) throws AssertionError {
		
		for (Match m : engine.findMatches(r, graph, partialMatch)) {
			for (EObject eo : group) {
				if (m.getNodeTargets().contains(eo)) {
					throw new AssertionError(
							"expected: No object from group is contained in any match, but at least "
									+ eo + " is contained in at least one");
				}
			}
		}
	}
	
	/**
	 * Assert that the whole group is not contained in any {@link Match}
	 * produced by executing the {@link Rule} on the {@link Engine}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param engine
	 *            {@link Engine} by which the {@link Rule} will be executed
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @throws AssertionError
	 */
	public static void assertGroupContainedInNoMatch(Rule r, EGraph graph, Match partialMatch, Engine engine,
			Collection<? extends EObject> group) throws AssertionError {
		
		for (Match m : engine.findMatches(r, graph, partialMatch)) {
			if (m.getNodeTargets().containsAll(group)) {
				throw new AssertionError(
						"expected: Group is contained in no match, but is contained in at least one");
			}
		}
		
	}
	
	/**
	 * Assert that the whole group is contained in at least one {@link Match}
	 * produced by applying the specified {@link Rule} to the {@link EGraph}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the {@link Rule} will be applied to
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @throws AssertionError
	 */
	public static void assertGroupContainedInAtLeastOneMatch(Rule r, EGraph graph, Match partialMatch, Engine engine, 
			Collection<? extends EObject> group) throws AssertionError {
		
		for (Match m : engine.findMatches(r, graph, partialMatch)) {
			if (m.getNodeTargets().containsAll(group)) {
				return;
			}
		}
		
		throw new AssertionError("expected: Group is contained in at least one match of "
				+ r.getName() + ", but is contained in none");
	}
	
	/**
	 * Assert that at least one object from the group is contained in at least
	 * on {@link Match} produced by applying the specified {@link Rule} on the
	 * {@link EGraph}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph} the {@link Rule} will be applied to
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 */
	public static void assertAnyObjectFromGroupContainedInAtLeastOneMatch(Rule r, EGraph graph, Match partialMatch, Engine engine,
			Collection<? extends EObject> group) throws AssertionError {
		
		for (Match m : engine.findMatches(r, graph, partialMatch)) {
			for (EObject eo : group) {
				if (m.getNodeTargets().contains(eo)) {
					return;
				}
			}
		}
		
		throw new AssertionError(
				"expected: At least one object from group is contained in at least one match, but isn't.");
	}
	
//	/**
//	 * Asserts that an {@link EObject} is contained in at least one match
//	 * produced by the {@link RuleApplication}s created by executing the
//	 * {@link UnitApplication}.
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param element
//	 *            {@link EObject}
//	 * @throws AssertionError
//	 */
//	public static void assertElementMatchedByUnitApplication(UnitApplication ua, EObject element)
//			throws AssertionError {
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			if (ra.getMatch().getNodeMapping().containsValue(element)) {
//				return;
//			}
//		}
//		
//		throw new AssertionError("expected: Element " + element
//				+ " matched by a Rule in the UnitApplication, but wasn't.");
//	}
	
//	/**
//	 * Asserts that an {@link EObject} is not contained in any matches produced
//	 * by the {@link RuleApplication}s created by executing the
//	 * {@link UnitApplication}.
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param element
//	 *            {@link EObject}
//	 * @throws AssertionError
//	 */
//	public static void assertElementNotMatchedByUnitApplication(UnitApplication ua, EObject element)
//			throws AssertionError {
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			if (ra.getMatch().getNodeMapping().containsValue(element)) {
//				throw new AssertionError("expected: Element " + element
//						+ " not matched by a Rule in the UnitApplication, but was matched by "
//						+ (ra.getRule().getName()));
//			}
//		}
//	}
	
//	/**
//	 * Asserts that an {@link EObject} is contained in n matches produced by the
//	 * {@link RuleApplication}s created by executing the {@link UnitApplication}
//	 * .
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param element
//	 *            {@link EObject}
//	 * @param n
//	 *            number of times the element should be matched
//	 * @throws AssertionError
//	 */
//	public static void assertElementMatchedByUnitApplicationNTimes(UnitApplication ua,
//			EObject element, int n) throws AssertionError {
//		int ctr = n;
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			if (ra.getMatch().getNodeMapping().containsValue(element)) {
//				ctr--;
//			}
//		}
//		
//		if (ctr == 0) {
//			return;
//		} else {
//			throw new AssertionError("expected: Element " + element
//					+ " matched by a Rule in the UnitApplication " + n + " times, but was matched "
//					+ (n - ctr) + " times");
//		}
//	}
	
	// ---- 2010-11-23 ----vvv
	
//	/**
//	 * Assert that the group (as a whole) is matched by the any
//	 * {@link RuleApplication} executed by the {@link UnitApplication}
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param group
//	 *            {@link Collection} of {@link EObject}s
//	 * @throws AssertionError
//	 */
//	public static void assertGroupMatchedByUnitApplication(UnitApplication ua,
//			Collection<? extends EObject> group) throws AssertionError {
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			if (ra.getMatch().getNodeTargets().containsAll(group)) {
//				return;
//			}
//		}
//		
//		throw new AssertionError("expected: Group matched by unit application");
//	}
	
//	/**
//	 * Assert that the group (as a whole) is not matched by any
//	 * {@link RuleApplication} executed by the {@link UnitApplication}
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param group
//	 *            {@link Collection} of {@link EObject}s
//	 * @throws AssertionError
//	 */
//	public static void assertGroupNotMatchedByUnitApplication(UnitApplication ua,
//			Collection<? extends EObject> group) throws AssertionError {
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			if (ra.getMatch().getNodeTargets().containsAll(group)) {
//				throw new AssertionError("expected: Group not matched by unit application");
//			}
//		}
//	}
	
//	/**
//	 * Assert that no element in the specified group is matched by any
//	 * {@link RuleApplication} executed by the {@link UnitApplication}.
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param group
//	 *            {@link Collection} of {@link EObject}s
//	 * @throws AssertionError
//	 */
//	public static void assertNoElementInGroupMatchedByAnyRuleInUnitApplication(UnitApplication ua,
//			Collection<? extends EObject> group) throws AssertionError {
//		for (RuleApplication ra : ua.getAppliedRules()) {
//			for (EObject eo : group) {
//				if (ra.getMatch().getNodeMapping().containsValue(eo)) {
//					throw new AssertionError(
//							"Expected: No element from group matched by any RuleApplication, but <"
//									+ eo + "> was matched by <" + ra.getRule().getName() + ">");
//				}
//			}
//		}
//	}
	
//	/**
//	 * Assert that all elements contained in the specified group are matched by
//	 * the {@link UnitApplication}, i.e. each element is matched at least once
//	 * by at least one executed {@link RuleApplication}
//	 * 
//	 * @param ua
//	 *            {@link UnitApplication}
//	 * @param group
//	 *            {@link Collection} of {@link EObject}s
//	 * @throws AssertionError
//	 */
//	public static void assertAllElementsInGroupMatchedByUnitApplication(UnitApplication ua,
//			Collection<? extends EObject> group) throws AssertionError {
//		HashMap<EObject, Boolean> matchStatus = new HashMap<EObject, Boolean>(); // create
//																					// a
//																					// new
//																					// HashMap
//		for (EObject eo : group) {
//			matchStatus.put(eo, false); // add all objects from group, set value
//										// = false
//		}
//		
//		// iterate through the applied rules
//		for (RuleApplication ruleApp : ua.getAppliedRules()) {
//			for (EObject eo : ruleApp.getMatch().getNodeTargets()) {
//				if (matchStatus.containsKey(eo)) {
//					// if a matched object is contained in the group (and thus
//					// in the HashMap),
//					// change its corresponding value in the HashMap to true,
//					// indicating it was matched by a Rule
//					matchStatus.put(eo, true);
//				}
//			}
//		}
//		
//		if (matchStatus.containsValue(false)) {
//			throw new AssertionError(
//					"Expected: All elements from group are matched, but some are not.");
//		}
//	}
	
	// 2011-01-12
	/**
	 * Asserts that a RuleApplication matches all elements from the group (not
	 * neccessarily in one match; if this is desired, use
	 * {@link assertGroupContainedInAtLeastOneMatch})
	 * 
	 * @param ra
	 *            {@link RuleApplication}
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @throws AssertionError
	 */
	public static void assertGroupIsMatched(Rule rule, EGraph graph, Match partialMatch, Engine engine, Collection<? extends EObject> group)
			throws AssertionError {
		HashMap<EObject, Boolean> matchContained = new HashMap<EObject, Boolean>();
		for (EObject eo : group) {
			matchContained.put(eo, false);
		}
		
		for (Match m : engine.findMatches(rule, graph, partialMatch)) {
			for (EObject eo2 : m.getNodeTargets()) {
				matchContained.put(eo2, true);
			}
		}
		
		if (matchContained.containsValue(false)) {
			System.out.println("~~~~~~");
			for (Entry<EObject, Boolean> s : matchContained.entrySet()) {
				if (s.getValue() == false) {
					System.out.println(s.getKey() + " -> " + s.getValue());
				}
			}
			throw new AssertionError("expected: group is matched, but some elements aren't.");
		}
	}
	
	/**
	 * Asserts that a {@link RuleApplication} matches all elements from the
	 * group (not neccessarily in one match) and the match doesn't contain any
	 * objects not in the group.
	 * 
	 * @param ra
	 * @param group
	 * @throws AssertionError
	 */
	public static void assertOnlyGroupIsMatched(Rule rule, EGraph graph, Match partialMatch, Engine engine,
			Collection<? extends EObject> group) throws AssertionError {
		
		// Use injective matching?
		boolean injective = rule.isInjectiveMatching();
		Boolean inj = (Boolean) engine.getOptions().get(Engine.OPTION_INJECTIVE_MATCHING);
		if (inj!=null) {
			injective = inj;
		}
		
		if (!injective) {
			// non-injective mode:
			HashMap<EObject, Integer> matchContents = new HashMap<EObject, Integer>();	
			for (EObject eo : group) {
				if (matchContents.containsKey(eo)) {
					matchContents.put(eo, matchContents.get(eo) + 1);
				} else {
					matchContents.put(eo, 1);
				}
			}
			
			for (Match m : engine.findMatches(rule, graph, partialMatch)) {
				for (EObject eo : m.getNodeTargets()) {
					if (group.contains(eo)) {
						matchContents.put(eo, matchContents.get(eo) - 1);
					} else {
						throw new AssertionError(
								"expected: entire group + only elements from group are matched, but match contains elements not in group");
					}
				}
			}
			
			for (Integer i : matchContents.values()) {
				if (i != 0) {
					throw new AssertionError(
							"expected: group is matched, but some elements aren't.");
				}
			}
			
		} else {
			// injective mode:
			HashMap<EObject, Boolean> matchContents = new HashMap<EObject, Boolean>();
			for (EObject eo : group) {
				matchContents.put(eo, false);
			}
			
			for (Match m : engine.findMatches(rule, graph, partialMatch)) {
				for (EObject eo : m.getNodeTargets()) {
					if (group.contains(eo)) {
						matchContents.put(eo, true);
					} else {
						throw new AssertionError(
								"expected: entire group + only elements from group are matched, but match contains elements not in group");
					}
				}
			}
			
			if (matchContents.containsValue(false)) {
				throw new AssertionError("expected: group is matched, but some elements aren't.");
			}
		}
	}
	
	/**
	 * Assert that a {@link Match} contains only elements from the group.
	 * 
	 * @param match
	 * @param group
	 * @throws AssertionError
	 */
	public static void assertMatchIsGroup(Match match, Collection<? extends EObject> group)
			throws AssertionError {
		HashMap<EObject, Integer> matchContents = new HashMap<EObject, Integer>();
		
		for (EObject eo : group) {
			if (matchContents.containsKey(eo)) {
				matchContents.put(eo, matchContents.get(eo) + 1);
			} else {
				matchContents.put(eo, 1);
			}
		}
		
		for (EObject eo : match.getNodeTargets()) {
			if (group.contains(eo)) {
				matchContents.put(eo, matchContents.get(eo) - 1);
			} else {
				throw new AssertionError("match contains elements not in group");
			}
		}
		
		for (Integer i : matchContents.values()) {
			if (i != 0) {
				throw new AssertionError(
						"expected: match is group, but some elements in the group are not in the match");
			}
		}
	}
	
}
