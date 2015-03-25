/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.henshin.HenshinModelPlugin;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.ConditionalUnit;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.IteratedUnit;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.UnaryFormula;
import org.eclipse.emf.henshin.model.UnaryUnit;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.actions.MultiRuleMapEditor;

/**
 * Utilities methods for cleaning Henshin models.
 * @author Christian Krause
 */
public class HenshinModelCleaner {
	
	/**
	 * Clean a module. This cleans all rules and transformation
	 * units inside of the module.
	 * @param module Module to be cleaned.
	 */
	public static void cleanModule(Module module) {
		
		// Clean all units and remove invalid ones:
		List<Unit> remove = new ArrayList<Unit>();
		do {
			remove.clear();
			for (Unit unit : module.getUnits()) {
				if (cleanUnit(unit)==null) {
					remove.add(unit);
				}
			}
			for (Unit unit : remove) {
				module.getUnits().remove(unit);
				debug("removed invalid " + unit);
			}
		} while (!remove.isEmpty());
		
		// Make sure all used packages are imported:
		
	}
	
	/**
	 * Clean a transformation unit.
	 * @param unit Unit to be cleaned.
	 */
	public static Unit cleanUnit(Unit unit) {
		
		// Clean the unit itself:
		if (unit instanceof Rule) {
			cleanRule((Rule) unit);
		}
		if (unit instanceof UnaryUnit) {
			Unit subUnit = ((UnaryUnit) unit).getSubUnit();
			if (subUnit==null) {
				return null;
			}
		}
		if (unit instanceof ConditionalUnit) {
			ConditionalUnit cond = (ConditionalUnit) unit;
			if (cond.getIf()==null || cond.getThen()==null || cond.getElse()==null) {
				return null;
			}
		}
		if (unit instanceof IteratedUnit) {
			String iterations = ((IteratedUnit) unit).getIterations();
			if (iterations==null || iterations.trim().length()==0) {
				((IteratedUnit) unit).setIterations("1");
				debug("set iterations to 1 for " + unit);
			}
		}
		
		// Clean the parameter mappings:
		cleanParameterMappings(unit);
		
		// Everything ok:
		return unit;
		
	}
	
	
	/**
	 * Clean a rule. This cleans all graphs and multi-rules in the rule including
	 * their mappings, formulas etc.
	 * @param rule Rule to be cleaned.
	 */
	public static void cleanRule(Rule rule) {
		
		// Make sure the Lhs and Rhs are there:
		if (rule.getLhs()==null) {
			rule.setLhs(HenshinFactory.eINSTANCE.createGraph("Lhs"));
			debug("added missing Lhs for " + rule);
		}
		if (rule.getLhs()==null) {
			rule.setLhs(HenshinFactory.eINSTANCE.createGraph("Rhs"));
			debug("added missing Rhs for " + rule);
		}

		// RHS graph should have no formula:
		if (rule.getRhs().getFormula()!=null) {
			rule.getRhs().setFormula(null);
			debug("removed formula for Rhs of " + rule);
		}

		// Clean LHS and RHS:
		cleanGraph(rule.getLhs());
		cleanGraph(rule.getRhs());

		// Clean the LHS-RHS mappings:
		cleanMappingList(rule.getMappings(), rule.getLhs(), rule.getRhs());
		
		// Clean the multi-mappings:
		if (rule.isMultiRule()) {
			Rule kernel = rule.getKernelRule();
			cleanMappingList(rule.getMultiMappings(), kernel.getLhs(), rule.getLhs(), kernel.getRhs(), rule.getRhs());
		}
		else if (!rule.getMultiMappings().isEmpty()) {
			rule.getMultiMappings().clear();
			debug("removed unused multi-mappings of " + rule);
		}

		// Recursively clean the multi-rules:
		for (Rule multi : rule.getMultiRules()) {
			cleanRule(multi);
		}
		
		// Remove unnecessary nested conditions:
		for (NestedCondition cond : rule.getLhs().getNestedConditions()) {
			if (cond.isTrue() || cond.isFalse()) {
				rule.getLhs().removeNestedCondition(cond);
				debug("removed trivial nested condition " + cond);
			}
		}
		
		// Remove unnecessary multi-rules:
		Iterator<Rule> iterator = rule.getMultiRules().iterator();
		while (iterator.hasNext()) {
			Rule multi = iterator.next();
			if (canRemoveMultiRule(multi)) {
				iterator.remove();
				debug("removed unnecessary Multi-" + multi);
			}
		}
		
		// Synchronize parameters in multi-rules:
		synchronizeRuleParameters(rule);

	}
	
	/**
	 * Clean a graph. This cleans the contents of the graph and its formula.
	 * It removes invalid nodes and edges and tries to simplify the formula
	 * is that is possible.
	 * @param graph Graph to be cleaned.
	 */
	public static void cleanGraph(Graph graph) {
		
		// Check the nodes and whether there are illegal edges:
		Iterator<Edge> edges;
		Iterator<Node> nodes = graph.getNodes().iterator();
		while (nodes.hasNext()) {
			Node node = nodes.next();
			if (node.getType()==null) {
				node.setType(EcorePackage.eINSTANCE.getEObject());
				debug("setting EObject node type for " + node);
			}
			edges = node.getOutgoing().iterator();
			while (edges.hasNext()) {
				Edge edge = edges.next();
				if (edge.getGraph()!=graph) {
					edges.remove();
					debug("removed invalid " + edge);
				}
			}
			edges = node.getIncoming().iterator();
			while (edges.hasNext()) {
				Edge edge = edges.next();
				if (edge.getGraph()!=graph) {
					edges.remove();
					debug("removed invalid " + edge);
				}
			}
			
		}
		
		// Remove invalid edges:
		edges = graph.getEdges().iterator();
		while (edges.hasNext()) {
			Edge edge = edges.next();
			if (edge.getSource()==null || edge.getTarget()==null ||
				edge.getSource().getGraph()!=graph || edge.getTarget().getGraph()!=graph ||
				edge.getType()==null || !edge.getSource().getType().getEAllReferences().contains(edge.getType())) {
				
				edges.remove();
				debug("removed invalid " + edge);
			}
		}
		
		// Clean the graph formula:
		graph.setFormula(cleanFormula(graph.getFormula()));
		
	}
	
	/**
	 * Recursively clean a formula. Cleans all nested conditions and tries
	 * to simplify the formula.
	 * @param formula Formula to be cleaned.
	 * @return The cleaned formula (can be <code>null</code>).
	 */
	public static Formula cleanFormula(Formula formula) {
		if (formula==null) {
			return null;
		}
		if (formula instanceof UnaryFormula) {
			Formula child = cleanFormula(((UnaryFormula) formula).getChild());
			if (child==null) return null;
			return formula;
		}
		if (formula instanceof BinaryFormula) {
			BinaryFormula binary = (BinaryFormula) formula;
			Formula left = cleanFormula(binary.getLeft());
			Formula right = cleanFormula(binary.getRight());
			if (left==null) return right;
			if (right==null) return left;
			return binary;
		}
		if (formula instanceof NestedCondition) {
			NestedCondition condition = (NestedCondition) formula;
			cleanNestedCondition(condition);
			if (condition.isTrue()) {
				return null;
			}
			return condition;
		}
		return formula;
	}
	
	/**
	 * Clean a nested condition. This clean the conclusion graph and the mappings.
	 * @param condition Nested condition to be cleaned.
	 */
	public static void cleanNestedCondition(NestedCondition condition) {
		
		// Make sure the conclusion is set:
		Graph conclusion = condition.getConclusion();
		if (conclusion==null) {
			condition.setConclusion(conclusion = HenshinFactory.eINSTANCE.createGraph());
			debug("created missing conclusion graph for " + condition);
		}
		
		// Clean the conclusion graph:
		cleanGraph(conclusion);
		
		// All mappings must go from the host to the conclusion:
		Graph host = condition.getHost();
		if (host!=null) {
			cleanMappingList(condition.getMappings(), host, conclusion);
		}
		
	}
	
	/**
	 * Clean a mapping list. Removes invalid mappings.
	 * @param mappings Mapping list to be cleaned.
	 * @param signatures Signatures of the functions that the mapping list stands for.
	 */
	public static void cleanMappingList(MappingList mappings, Graph... graphs) {
		
		// Build the signatures:
		Map<Graph,Graph> signatures = new HashMap<Graph,Graph>();
		for (int i=0; i<graphs.length; i=i+2) {
			signatures.put(graphs[i], graphs[i+1]);
		}
		
		// Check which mappings are invalid:
		Iterator<Mapping> contents = mappings.iterator();		
		while (contents.hasNext()) {
			Mapping mapping = contents.next();
			String msg = "removed invalid mapping " + mapping;

			// Origin and image must be set:
			if (mapping.getOrigin()==null || mapping.getImage()==null) {
				contents.remove(); debug(msg); continue;
			}
			
			// Find out from where to where this mapping goes to:
			Graph from = mapping.getOrigin().getGraph();
			Graph to = mapping.getImage().getGraph();
			if (from==null || to==null) {
				contents.remove(); debug(msg); continue;
			}
			
			// Rule must be either same rule or multi- and kernel rule:
			Rule r1 = from.getRule();
			Rule r2 = to.getRule();
			if (r1==null || r2==null || (r1!=r2 && r1.getKernelRule()!=r2 && r1!=r2.getKernelRule())) {
				contents.remove(); debug(msg); continue;
			}
			
			// Make sure it is compliant with the signature:
			if (signatures.get(from)!=to) {
				contents.remove(); debug(msg); continue;
			}
			
			// Check whether the origin has a unique image in the target graph:
			boolean unique = true;
			for (Mapping other : mappings) {
				Node image = other.getImage();
				if (other!=mapping && other.getOrigin()==mapping.getOrigin() && image!=null && image.getGraph()==to) {
					unique = false; break;
				}
			}
			if (!unique) {
				contents.remove(); debug(msg); continue;
			}
			
		}
		
	}
	
	/**
	 * Clean the parameter mappings of a unit. This removes all invalid parameter mappings.
	 * @param unit The unit to be cleaned.
	 */
	public static void cleanParameterMappings(Unit unit) {
		
		// Get a list of units that the parameter mapping are allowed to use:
		ArrayList<Unit> validUnits = new ArrayList<Unit>();
		validUnits.add(unit);
		validUnits.addAll(unit.getSubUnits(false));
		
		// Check every single parameter mapping:
		Iterator<ParameterMapping> mappings = unit.getParameterMappings().iterator();
		while (mappings.hasNext()) {
			ParameterMapping pm = mappings.next();
			String msg = "removed invalid parameter mapping " + pm;
			
			// Source and target must be set!
			if (pm.getSource()==null || pm.getTarget()==null) {
				mappings.remove(); debug(msg); continue;
			}
			
			// Units of the source and targets must be set!
			if (pm.getSource().getUnit()==null || pm.getTarget().getUnit()==null) {
				mappings.remove(); debug(msg); continue;
			}
			
			// The referenced units must be either the base units, or direct children:
			if (!validUnits.contains(pm.getSource().getUnit()) || !validUnits.contains(pm.getTarget().getUnit())) {
				mappings.remove(); debug(msg); continue;				
			}
		}
		
	}
	
	/**
	 * Complete all multi-rules in a module. This invokes {@link #completeMultiRules(Rule)} on all
	 * rules directly or indirectly contained by the argument module.
	 * @param module A module.
	 */
	public static void completeMultiRules(Module module) {
		for (Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				completeMultiRules((Rule) unit);
			}
		}
		for (Module subModule : module.getSubModules()) {
			completeMultiRules(subModule);
		}
	}

	/**
	 * Complete a multi-rule and all its directly and indirectly contained multi-rules.
	 * This method can be used to ensure that the multi-mappings are complete.
	 * @param rule Rule to be completed.
	 */
	public static void completeMultiRules(Rule rule) {
		Rule kernel = rule.getKernelRule();
		if (kernel!=null) {
			MultiRuleMapEditor editor = new MultiRuleMapEditor(kernel, rule);
			editor.ensureCompleteness();
		}
		for (Rule multiRule : rule.getMultiRules()) {
			completeMultiRules(multiRule);
		}
	}
	
	/*
	 * Check whether a multi-rule can be safely removed.
	 */
	private static boolean canRemoveMultiRule(Rule rule) {
		
		// It must be a multi-rule:
		if (!rule.isMultiRule()) return false;
		
		// It must be also ok to remove its children:
		for (Rule multiRule : rule.getMultiRules()) {
			if (!canRemoveMultiRule(multiRule)) return false;
		}
		
		// The multi-map must be onto (surjective):
		if (!rule.getMultiMappings().isOnto(rule.getLhs()) || !rule.getMultiMappings().isOnto(rule.getRhs())) {
			return false;
		}
		
		// Non-trivial nested conditions?
		for (NestedCondition nestedCond : rule.getLhs().getNestedConditions()) {
			if (!nestedCond.isTrue()) return false;
		}

		// Safe to remove it:
		return true;
		
	}
	
	/*
	 * Print debug messages.
	 */
	private static void debug(String message) {
		HenshinModelPlugin.INSTANCE.logInfo("CleanUp: " + message);
	}
	
	public static void synchronizeRuleParameters(Rule rule) {
		Map<String, Parameter> parameters = new LinkedHashMap<String,Parameter>();
		collectRuleParameters(rule, parameters);
		updateRuleParameters(rule, parameters);
	}
	
	private static void collectRuleParameters(Rule rule, Map<String,Parameter> parameters) {
		for (Parameter param : rule.getParameters()) {
			if (param.getName() != null) {
				parameters.put(param.getName(), param);
			}
		}
		for (Rule multiRule : rule.getMultiRules()) {
			collectRuleParameters(multiRule, parameters);
		}
	}

	private static void updateRuleParameters(Rule rule, Map<String,Parameter> parameters) {
		List<Parameter> paramList = new ArrayList<Parameter>(parameters.values());
		while (rule.getParameters().size() < paramList.size()) {
			rule.getParameters().add(HenshinFactory.eINSTANCE.createParameter());
		}
		while (rule.getParameters().size() > paramList.size()) {
			rule.getParameters().remove(rule.getParameters().size()-1);
		}
		for (int i=0; i<paramList.size(); i++) {
			Parameter s = paramList.get(i);
			Parameter t = rule.getParameters().get(i);
			t.setName(s.getName());
			t.setType(s.getType());
			t.setDescription(s.getDescription());
		}
		for (Rule multiRule : rule.getMultiRules()) {
			updateRuleParameters(multiRule, parameters);
		}
	}

	
}
