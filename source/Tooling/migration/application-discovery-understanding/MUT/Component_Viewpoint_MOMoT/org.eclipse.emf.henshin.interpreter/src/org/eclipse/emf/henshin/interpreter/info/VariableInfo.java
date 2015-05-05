/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.info;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.matching.constraints.AttributeConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.BinaryConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.ContainmentConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DanglingConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.PathConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.ReferenceConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.UnaryConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Variable;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.UnaryFormula;
import org.eclipse.emf.henshin.model.staticanalysis.PathFinder;

public class VariableInfo {
	
	// variables which represent nodes when they are first introduced, e.g. if a
	// mapped node occurs in the LHS and in one condition, only the variable
	// representing the LHS node will be in this collection
	private Collection<Variable> mainVariables;
	
	// node-variable pair
	private Map<Node, Variable> node2variable;
	
	// variable-node pair
	private Map<Variable, Node> variable2node;
	
	// map between a graph and all variables corresponding to nodes of that
	// graph
	private Map<Graph, List<Variable>> graph2variables;
	
	// map between a key variable and its main variable, e.g. there is a mapping
	// chain from the node belonging to the main variable to the key variable
	private Map<Variable, Variable> variable2mainVariable;
	
	private Rule rule;
	private EngineImpl engine;
	
	public VariableInfo(RuleInfo ruleInfo, EngineImpl engine) {
		this.rule = ruleInfo.getRule();
		this.engine = engine;
		
		this.node2variable = new HashMap<Node, Variable>();
		this.variable2node = new HashMap<Variable, Node>();
		
		this.graph2variables = new HashMap<Graph, List<Variable>>();
		this.variable2mainVariable = new HashMap<Variable, Variable>();
		
		createVariables(rule.getLhs(), null);
		
		for (Node node : rule.getLhs().getNodes()) {
			if (rule.getMappings().getImage(node,rule.getRhs())==null)
				createDanglingConstraints(node);
		}
		
		mainVariables = variable2mainVariable.values();
	}
	
	private void createVariables(Graph g, Collection<Mapping> mappings) {
		List<Variable> variables = new ArrayList<Variable>();
		
		for (Node node : g.getNodes()) {
			EClass type = node.getType();
			Variable var = new Variable(type);
			variables.add(var);
			node2variable.put(node, var);
			variable2node.put(var, node);
			
			Variable mainVariable = var;
			if (mappings != null) {
				for (Mapping mapping : mappings) {
					if (node == mapping.getImage()) {
						mainVariable = variable2mainVariable.get(node2variable.get(mapping
								.getOrigin()));
					}
				}
			}
			
			variable2mainVariable.put(var, mainVariable);
		}
		
		for (Node node : g.getNodes()) {
			createConstraints(node);
		}
		
		graph2variables.put(g, variables);
		
		createVariables(g.getFormula());
	}
	
	private void createVariables(Formula formula) {
		if (formula instanceof BinaryFormula) {
			createVariables(((BinaryFormula) formula).getLeft());
			createVariables(((BinaryFormula) formula).getRight());
		} else if (formula instanceof UnaryFormula)
			createVariables(((UnaryFormula) formula).getChild());
		else if (formula instanceof NestedCondition) {
			NestedCondition nc = (NestedCondition) formula;
			createVariables(nc.getConclusion(), nc.getMappings());
		}
	}
	
	private void createConstraints(Node node) {
		Variable var = node2variable.get(node);
		
		// User-defined node constraints:
		UnaryConstraint userConstraint = engine.createUserConstraints(node);
		if (userConstraint != null){
			var.userConstraints.add(userConstraint);
		}
		
		// Outgoing edges:
		for (Edge edge : node.getOutgoing()) {
			Variable target = node2variable.get(edge.getTarget());
			ReferenceConstraint constraint;
			String index = edge.getIndex();
			if (index!=null && index.length()>0) {
				if (rule.getParameter(index)!=null) {
					constraint = new ReferenceConstraint(target, edge.getType(), index, false);
					var.requiresFinalCheck = true;
				} else {
					try {
						Number constant = (Number) engine.getScriptEngine().eval(index);
						constraint = new ReferenceConstraint(target, edge.getType(), constant, true);
					} catch (Exception e) {
						throw new RuntimeException("Error evaluating index expression: " + index);
					}
				}
			} else {
				constraint = new ReferenceConstraint(target, edge.getType(), null, true);
			}
			var.referenceConstraints.add(constraint);
			BinaryConstraint binaryUserConstraint = engine.createUserConstraints(edge);
			if (binaryUserConstraint != null){
				var.binaryUserConstraints.put(constraint, binaryUserConstraint);
			}
			
		}
		
		// Incoming edges:
		for (Edge edge : node.getIncoming()) {
			if (edge.getType().isContainment()) {
				Variable target = node2variable.get(edge.getSource());
				ContainmentConstraint constraint = new ContainmentConstraint(target);
				var.containmentConstraints.add(constraint);
			} else if (edge.getType().getEOpposite() != null) {
				Variable target = node2variable.get(edge.getSource());
				ReferenceConstraint constraint = new ReferenceConstraint(target, edge.getType().getEOpposite(), null, true);
				var.referenceConstraints.add(constraint);
			}
		}
		
		// Attributes:
		for (Attribute attribute : node.getAttributes()) {
			String value = attribute.getValue();
			AttributeConstraint constraint;
			if (rule.getParameter(value)!=null) {
				constraint = new AttributeConstraint(attribute.getType(), value, false);
			} else {
				Object constant = engine.evalAttributeExpression(attribute, rule);
				constraint = new AttributeConstraint(attribute.getType(), constant, true);
			}
			var.attributeConstraints.add(constraint);
			UnaryConstraint unaryUserConstraint = engine.createUserConstraints(attribute);
			if (unaryUserConstraint != null){
				var.attributeUserConstraints.put(constraint, unaryUserConstraint);
			}
		}
		
		// Path constraints:
		if (!rule.getLhs().getPACs().isEmpty()) {
			for (Node target : node.getGraph().getNodes()) {
				if (node==target) continue;
				for (Entry<List<EReference>,Integer> entry : PathFinder.findReferencePaths(node, target, true, true).entrySet()) {
					if (entry.getKey().size() > 1) { // only paths of length > 1
						Variable targetVar = node2variable.get(target);
						PathConstraint constraint = new PathConstraint(targetVar, entry.getKey(), entry.getValue());
						var.pathConstraints.add(constraint);
					}
				}
			}
		}
		
	}
	
	private void createDanglingConstraints(Node node) {
		Variable var = node2variable.get(node);
		DanglingConstraint constraint = 
				new DanglingConstraint(getEdgeCounts(node, false), getEdgeCounts(node, true));
		var.danglingConstraints.add(constraint);
	}
	
	private Map<EReference, Integer> getEdgeCounts(Node node, boolean incoming) {
		Collection<Edge> edges = incoming ? node.getIncoming() : node.getOutgoing();
		Collection<Edge> oppositeEdges = incoming ? node.getOutgoing() : node.getIncoming();
		
		if (edges.size() == 0)
			return null;
		
		Map<EReference, Integer> edgeCount = new HashMap<EReference, Integer>();
		for (Edge edge : edges) {
			EReference type = edge.getType();
			Integer count = edgeCount.get(type);
			if (count == null) {
				count = ONE;
			} else {
				count = count + 1;
			}
			edgeCount.put(type, count);
		}
		
		for (Edge edge : oppositeEdges) {
			if (edge.getType().getEOpposite() == null)
				continue;
			
			EReference oppType = edge.getType().getEOpposite();
			
			if (incoming) {
				// opposite edges are outgoing from the PoV of the node
				Node remoteNode = edge.getTarget();
				if (remoteNode.getOutgoing(oppType, node) == null) {
					Integer count = edgeCount.get(oppType);
					if (count == null) {
						count = ONE;
					} else {
						count = count + 1;
					}
					edgeCount.put(oppType, count);
				}
			} else {
				// opposite edges are incoming from the PoV of the node
				Node remoteNode = edge.getSource();
				if (node.getOutgoing(oppType, remoteNode) == null) {
					Integer count = edgeCount.get(oppType);
					if (count == null) {
						count = ONE;
					} else {
						count = count + 1;
					}
					edgeCount.put(oppType, count);
				}
			}
		}
		
		return edgeCount;
	}
	
	public Node getVariableForNode(Variable variable) {
		return variable2node.get(variable);
	}
	
	public Collection<Variable> getDependendVariables(Variable mainVariable) {
		Collection<Variable> dependendVariables = new HashSet<Variable>();
		for (Variable var : variable2mainVariable.keySet()) {
			if (variable2mainVariable.get(var) == mainVariable)
				dependendVariables.add(var);
		}
		
		return dependendVariables;
	}
	
	public Collection<Variable> getMainVariables() {
		return mainVariables;
	}
	
	/**
	 * @return the graph2variables
	 */
	public Map<Graph, List<Variable>> getGraph2variables() {
		return graph2variables;
	}
	
	/**
	 * @return the node2variable
	 */
	public Map<Node, Variable> getNode2variable() {
		// TODO: change Solution to get rid of this method
		return node2variable;
	}
		
	private static final Integer ONE = new Integer(1);
	
}
