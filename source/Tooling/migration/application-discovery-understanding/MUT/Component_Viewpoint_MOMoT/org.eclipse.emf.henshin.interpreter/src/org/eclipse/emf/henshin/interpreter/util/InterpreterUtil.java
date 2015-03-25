/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Common utility methods for the Henshin interpreter.
 * 
 * @author Christian Krause, Svetlana Arifulina
 */
public class InterpreterUtil {

	/**
	 * Class Loader implementation that can delegate the class loading to multiple additional class loaders. <br>
	 * <b>WARNING: This class loader delegates only the methods {@link #loadClass(String)}!</b>
	 * 
	 * @author Christian Krause
	 *
	 */
	public static class DelegatingClassLoader extends ClassLoader {

		/**
		 * Array of additional class loaders.
		 */
		private ClassLoader[] additionalClassLoaders;

		/**
		 * Default constructor.
		 * 
		 * @param parent Parent class loader.
		 * @param additionalClassLoaders Additional class loaders.
		 */
		public DelegatingClassLoader(ClassLoader parent, ClassLoader... additionalClassLoaders) {
			super(parent);
			this.additionalClassLoaders = additionalClassLoaders;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.ClassLoader#loadClass(java.lang.String)
		 */
		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {
			Class<?> clazz;
			try {
				clazz = super.loadClass(name);
			} catch (ClassNotFoundException e) {
				clazz = null;
			}
			if (clazz == null) {
				for (ClassLoader other : additionalClassLoaders) {
					try {
						clazz = other.loadClass(name);
						break;
					} catch (ClassNotFoundException e) {
						clazz = null;
					}
				}
			}
			if (clazz == null) {
				throw new ClassNotFoundException();
			}
			return clazz;
		}

	}

	/**
	 * Find all matches for a rule.
	 * 
	 * @param engine Engine.
	 * @param rule Rule to be matched.
	 * @param graph Target graph.
	 * @param partialMatch Partial match or <code>null</code>.
	 * @return List of found matches.
	 */
	public static List<Match> findAllMatches(Engine engine, Rule rule, EGraph graph, Match partialMatch) {
		List<Match> matches = new ArrayList<Match>();
		for (Match match : engine.findMatches(rule, graph, partialMatch)) {
			matches.add(match);
		}
		return matches;
	}

	/**
	 * Find all matches of all rules in a module. This does not consider submodules.
	 * 
	 * @param engine Engine to be used.
	 * @param module Module to be used.
	 * @param graph Target graph.
	 * @return List of matches.
	 */
	public static List<Match> findAllMatches(Engine engine, Module module, EGraph graph) {
		List<Match> matches = new ArrayList<Match>();
		for (Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				matches.addAll(findAllMatches(engine, (Rule) unit, graph, null));
			}
		}
		return matches;
	}

	/**
	 * This method calculates a complete match for rules of the given model transformation with a given model. If a
	 * complete match does not exist, the method calculates a partial match, if it exists. For that a rule is reduced
	 * till a complete match for a reduced rule is found. For reduced rules having the same size, all matches are
	 * searched. If a match is found for a reduced rule, this rule is not reduced further.
	 * 
	 * @param engine Engine to be used.
	 * @param module Module to be used.
	 * @param graph Target graph.
	 * @return List of matches (both complete and partial per rule)
	 */
	public static List<Match> findMaximalPartialMatches(Engine engine, Module module, EGraph graph) {
		List<Match> matches = new ArrayList<Match>();

		for (Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				List<Match> newMatches = new ArrayList<Match>();

				// Check for a complete match
				newMatches = findAllMatches(engine, (Rule) unit, graph, null);

				// If there are no complete matches, check for partial matches
				if (newMatches.isEmpty()) {
					newMatches = findPartialMatchesPerRule((Rule) unit, engine, graph);
				}

				// If any partial matches were found then remove empty and
				// duplicate matches, which arise during the rule reduction
				if (!newMatches.isEmpty()) {
					matches.addAll(removeEmptyAndDuplicatedMatches(newMatches));

				}
			}
		}

		return matches;
	}

	/**
	 * This method is similar to the method findMasimalPartialMatches but outputs a report instead of a list of matches.
	 * 
	 * This method calculates a complete match for rules of the given model transformation with a given model. If a
	 * complete match does not exist, the method calculates a partial match, if it exists. For that a rule is reduced
	 * till a complete match for a reduced rule is found. For reduced rules having the same size, all matches are
	 * searched. If a match is found for a reduced rule, this rule is not reduced further. If partial matches are found,
	 * then a report object is created based on the list of found partial matches.
	 * 
	 * @param engine Engine to be used.
	 * @param module Module to be used.
	 * @param graph Target graph.
	 * @return List of matches (both complete and partial per rule)
	 */
	public static PartialMatchReport findAndReportMaximalPartialMatches(Engine engine, Module module, EGraph graph) {
		List<Match> matches = new ArrayList<Match>();
		PartialMatchReport partialMatchReport = new PartialMatchReport(module, matches);

		for (Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {

				List<Match> newMatches = new ArrayList<Match>();

				// Check for a complete match
				newMatches = findAllMatches(engine, (Rule) unit, graph, null);

				// Check whether disabling of the dangling edges check would
				// lead to a match
				if (newMatches.isEmpty()) {
					// Check for partial matches
					newMatches = findPartialMatchesPerRule((Rule) unit, engine, graph);
				}

				if (!newMatches.isEmpty()) {
					newMatches = removeEmptyAndDuplicatedMatches(newMatches);
				}

				partialMatchReport.collectPartialMatchInfos((Rule) unit, newMatches);
				matches.addAll(newMatches);
			}
		}

		return partialMatchReport;

	}

	/**
	 * Method for removing empty and duplicated matches, which appear during the rule reduction.
	 * 
	 * @param matches Matches to reduce
	 * @return A reduced list of matches without duplicates and empty entries
	 */
	private static List<Match> removeEmptyAndDuplicatedMatches(List<Match> matches) {
		List<Match> resultingMatches = new ArrayList<Match>();

		// When computing partial matches, matches with no matching elements are
		// sometimes added into the resulting list of matches. Here these
		// matches are deleted from the list.
		for (Match match : matches) {
			if (!match.getNodeTargets().isEmpty()) {
				boolean addMatch = true;
				// Ignore duplicates
				for (Match resultingMatch : resultingMatches) {
					if (match.getNodeTargets().containsAll(resultingMatch.getNodeTargets())
							& resultingMatch.getNodeTargets().containsAll(match.getNodeTargets())) {
						addMatch = false;
						break;
					}
				}
				if (addMatch) {
					resultingMatches.add(match);
				}
			}
		}

		return resultingMatches;
	}

	/**
	 * This method finds a partial match per rule from the given module or for an already reduced rule.
	 * 
	 * @param rule Rule to find partial matches for.
	 * @param engine Engine to be used.
	 * @param graph Target graph.
	 * @return The list of partial matches.
	 */
	private static List<Match> findPartialMatchesPerRule(Rule rule, Engine engine, EGraph graph) {
		List<Match> matches = new ArrayList<Match>();

		// Reduce the rule and get as a result a list of rules, each having 1
		// node less and the input rule
		List<Rule> newRules = reduceRule(rule);

		// Find matches for the reduced rules
		for (Rule newRule : newRules) {
			matches.addAll(findAllMatches(engine, newRule, graph, null));
		}

		// If no matches for the reduced rules were found, call the method
		// recursively for these reduced rules
		while (matches.isEmpty()) {
			for (Rule newRule : newRules) {
				matches.addAll(findPartialMatchesPerRule(newRule, engine, graph));
			}
		}

		// if a rule has only 1 node than no reduction possible and null is
		// returned
		return matches;
	}

	/**
	 * Reduce the input rule and output a list of rules, in which each rule is exactly 1 node smaller than the input
	 * rule. The size of the list equals to the number of nodes of the input rule.
	 * 
	 * @param rule Rule to reduce.
	 * @return List of reduced rules.
	 */
	private static List<Rule> reduceRule(Rule rule) {
		// If the input rule has N nodes in the LHS, then output a set of N
		// rules, in which each rule is exactly 1 node less that the input rule
		// has (the size of each rule in the set is N-1)
		List<Rule> newRules = new ArrayList<Rule>();
		EList<Node> nodes = rule.getLhs().getNodes();

		// Copy all the nodes from the input rule in the N rules of the output
		// set
		for (int i = 0; i < nodes.size(); i++) {
			// Create a new reduced rule by copying the original one
			Rule newRule = EcoreUtil.copy(rule);
			// Remove the current node from the reduced rule
			newRule.getLhs().removeNode(newRule.getLhs().getNodes().get(i));
			// Add the new rule to the list of new rules
			newRules.add(newRule);
		}

		return newRules;
	}

	/**
	 * Execute the given unit application and throws an {@link AssertionError} if it could not be successfully applied
	 * (if {@link UnitApplication#execute(ApplicationMonitor)} returns <code>false</code>). This is just a convenience
	 * method.
	 * 
	 * @param application A unit application.
	 */
	public static void executeOrDie(UnitApplication application) {
		if (!application.execute(null)) {
			if (application instanceof RuleApplication) {
				throw new AssertionError("Error executing rule '" + application.getUnit().getName() + "'");
			} else {
				throw new AssertionError("Error executing unit '" + application.getUnit().getName() + "'");
			}
		}
	}

	/**
	 * Apply a unit to the contents of a resource. This automatically creates an {@link EGraph} and updates the contents
	 * of the resource.
	 * 
	 * @param unit Unit to be applied.
	 * @param engine Engine to be used.
	 * @param resource Resource containing the model to be transformed.
	 * @return <code>true</code> if the unit was successfully applied.
	 */
	public static boolean applyToResource(Unit unit, Engine engine, Resource resource) {
		return applyToResource(new AssignmentImpl(unit), engine, resource, null);
	}

	/**
	 * Apply a unit to the contents of a resource. This automatically creates an {@link EGraph} and updates the contents
	 * of the resource.
	 * 
	 * @param assignment Assignment to be used.
	 * @param engine Engine to be used.
	 * @param resource Resource containing the model to be transformed.
	 * @return <code>true</code> if the unit was successfully applied.
	 */
	public static boolean applyToResource(Assignment assignment, Engine engine, Resource resource,
			ApplicationMonitor monitor) {

		// Create the graph and the unit application:
		EGraph graph = new EGraphImpl(resource);
		UnitApplication application = new UnitApplicationImpl(engine, graph, assignment.getUnit(), assignment);

		// Remember the old root objects:
		Set<EObject> oldRoots = new HashSet<EObject>();
		oldRoots.addAll(graph.getRoots());

		// Apply the unit:
		boolean result = application.execute(monitor);

		// Sync root objects:
		List<EObject> roots = graph.getRoots();
		Iterator<EObject> it = resource.getContents().iterator();
		while (it.hasNext()) {
			if (!roots.contains(it.next())) {
				it.remove();
			}
		}
		for (EObject root : roots) {
			if (!oldRoots.contains(root)) {
				resource.getContents().add(root);
			}
		}
		return result;

	}

	/**
	 * Check whether two {@link EGraph}s are isomorphic.
	 * 
	 * @param graph1 First graph.
	 * @param graph2 Second graph.
	 * @return <code>true</code> if they are isomorphic.
	 */
	public static boolean areIsomorphic(EGraph graph1, EGraph graph2) {
		return new EGraphIsomorphyChecker(graph1, null).isIsomorphicTo(graph2, null);
	}

	/**
	 * Check whether the contents of two resources are isomorphic.
	 * 
	 * @param resource1 First resource.
	 * @param resource2 Second resource.
	 * @return <code>true</code> if they are isomorphic.
	 */
	public static boolean areIsomorphic(Resource resource1, Resource resource2) {
		return areIsomorphic(new EGraphImpl(resource1), new EGraphImpl(resource2));
	}

	/**
	 * Count the number of edges/links in a graph.
	 * 
	 * @param graph An {@link EGraph}
	 * @return Number of edges/links in that graph.
	 */
	public static int countEdges(EGraph graph) {
		int links = 0;
		for (EObject object : graph) {
			for (EReference ref : object.eClass().getEAllReferences()) {
				if (ref.isMany()) {
					links += ((EList<?>) object.eGet(ref)).size();
				} else {
					if (object.eGet(ref) != null)
						links++;
				}
			}
		}
		return links;
	}

	/**
	 * Get a string representation of an object.
	 * 
	 * @param object An object.
	 * @return A readable string representation.
	 */
	public static String objectToString(Object object) {
		if (object instanceof String) {
			return "'" + object + "'";

		}
		if (object instanceof DynamicEObjectImpl) {
			EClass eclass = ((DynamicEObjectImpl) object).eClass();
			if (eclass != null) {
				String type = eclass.getName();
				EPackage epackage = eclass.getEPackage();
				while (epackage != null) {
					type = epackage.getName() + "." + type;
					epackage = epackage.getESuperPackage();
				}
				String args = "";
				for (EAttribute att : eclass.getEAllAttributes()) {
					args = args + ", " + att.getName() + "=" + objectToString(((DynamicEObjectImpl) object).eGet(att));
				}

				return type + "@" + Integer.toHexString(object.hashCode()) + " (dynamic" + args + ")";
			}
		}
		return String.valueOf(object); // object could be null
	}

}
