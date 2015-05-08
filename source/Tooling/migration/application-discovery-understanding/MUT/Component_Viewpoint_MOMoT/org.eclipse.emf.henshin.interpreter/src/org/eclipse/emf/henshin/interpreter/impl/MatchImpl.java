/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Default {@link Match} implementation.
 */
public class MatchImpl extends AssignmentImpl implements Match {
	
	// Nodes to be matched:
	protected List<Node> nodes;

	/**
	 * Default constructor.
	 * @param rule Rule to be matched.
	 */
	public MatchImpl(Rule rule) {
		this (rule, false);
	}

	/**
	 * Constructor.
	 * @param rule The rule that this match is used for.
	 * @param isResultMatch Determines whether this is a result match.
	 */
	public MatchImpl(Rule rule, boolean isResultMatch) {
		super(rule, isResultMatch);
	}

	/**
	 * Constructor.
	 * @param assignment The assignment or match to be copied.
	 * @param isResultMatch Determines whether this is a result match.
	 */
	public MatchImpl(Assignment assignment, boolean isResultMatch) {
		super(assignment.getUnit(), isResultMatch);
		copyParameterValues(assignment);
		if (assignment instanceof Match) {
			Match match = (Match) assignment;
			for (Node node : nodes) {
				setNodeTarget(node, match.getNodeTarget(node));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl#setUnit(org.eclipse.emf.henshin.model.Unit)
	 */
	@Override
	protected void setUnit(Unit unit) {
		if (!(unit instanceof Rule)) {
			throw new IllegalArgumentException("Unit must be a rule");
		}
		this.unit = unit;
		// LHS or RHS nodes?
		this.nodes = isResult ? ((Rule) unit).getRhs().getNodes() : ((Rule) unit).getLhs().getNodes(); 
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#getRule()
	 */
	@Override
	public Rule getRule() {
		return (Rule) unit;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#getNodeTarget(org.eclipse.emf.henshin.model.Node)
	 */
	@Override
	public EObject getNodeTarget(Node node) {
		return (EObject) values.get(node);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#setNodeTarget(org.eclipse.emf.henshin.model.Node, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void setNodeTarget(Node node, EObject target) {
		setValue(node, target);
		// Check whether there is a parameter with the same name:
		if (unit!=null && node.getName()!=null) {
			Parameter param = unit.getParameter(node.getName());
			if (param!=null) {
				setValue(param, target);
			}
		}
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.impl.AssignmentImpl#setParameterValue(org.eclipse.emf.henshin.model.Parameter, java.lang.Object)
	 */
	@Override
	public void setParameterValue(Parameter param, Object value) {
		setValue(param, value);
		// Check whether there are nodes with the same name as the parameter:
		String name = param.getName();
		if (name!=null && nodes!=null && (value==null || value instanceof EObject)) {
			for (Node node : nodes) {
				if (name.equals(node.getName())) {
					setValue(node, value);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#getAllNodeTargets()
	 */
	@Override
	public List<EObject> getNodeTargets() {
		List<EObject> targets = new ArrayList<EObject>();
		if (nodes!=null) {
			for (Node node : nodes) {
				EObject tar = (EObject) values.get(node);
				if (tar!=null) {
					targets.add(tar);
				}
			}
		}
		return targets;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#getMultiMatches(org.eclipse.emf.henshin.model.Rule)
	 */
	@Override
	public List<Match> getMultiMatches(Rule multiRule) {
		@SuppressWarnings("unchecked")
		List<Match> nested = (List<Match>) values.get(multiRule);
		if (nested==null) {
			nested = new ArrayList<Match>();
			values.put(multiRule, nested);
		}
		return nested;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#overlapsWith(org.eclipse.emf.henshin.interpreter.Match)
	 */
	@Override
	public boolean overlapsWith(Match match) {
		List<EObject> common = getNodeTargets();
		common.retainAll(match.getNodeTargets());
		return !common.isEmpty();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#isComplete()
	 */
	@Override
	public boolean isComplete() {
		if (nodes==null || getRule()==null) {
			return false;
		}
		if (!values.keySet().containsAll(nodes)) {
			return false;
		}
		for (Rule multiRule : getRule().getMultiRules()) {
			for (Match nestedMatch : getMultiMatches(multiRule)) {
				if (!nestedMatch.isComplete()) {
					return false;
				}
			}
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Match#isValid()
	 */
	@Override
	public boolean isValid() {
		// Check completeness:
		if (!isComplete()) {
			return false;
		}
		// Check object types:
		for (Node node : nodes) {
			if (node.getType().isSuperTypeOf(((EObject) values.get(node)).eClass())) {
				return false;
			}
		}		
		// Check if all edges are present:
		for (Node node : nodes) {
			EObject source = (EObject) values.get(node);
			for (Edge edge : node.getOutgoing()) {
				EReference edgeType = edge.getType();
				EObject target = (EObject) values.get(edge.getTarget());
				if (edgeType.isMany()) {
					@SuppressWarnings("unchecked")
					List<EObject> targetObjects = (List<EObject>) source.eGet(edgeType);
					if (!targetObjects.contains(target)) {
						return false;
					}
				} else {
					if (source.eGet(edgeType)!=target) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj) || !(obj instanceof Match)) {
			return false;
		}
		Match match = (Match) obj;
		if (nodes!=null) {
			for (Node node : nodes) {
				if (values.get(node)!=match.getNodeTarget(node)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (isResult) {
			return "Result match for rule '" + unit.getName() + "':\n" + toStringWithIndent("");
		} else {
			return "Match for rule '" + unit.getName() + "':\n" + toStringWithIndent("");			
		}
	}

	/*
	 * toString helper.
	 */
	@Override
	protected String toStringWithIndent(String indent) {
		String result = super.toStringWithIndent(indent);
		String matchType = isResult ? "Result match" : "Match";
		int index = 1;
		if (nodes.isEmpty()) {
			result = result + indent + "- no nodes\n";
		} else {
			for (Node node : nodes) {
				String name = node.getName()!=null ? "'" + node.getName() + "'" : "#" + index;
				EObject target = getNodeTarget(node);
				if (target!=null) {
					result = result + indent + "- node " + name + " => " + 
							InterpreterUtil.objectToString(target) + "\n";
				}
				index++;
			}
		}
		index = 1;
		for (Rule multiRule : ((Rule) unit).getMultiRules()) {
			String name = multiRule.getName()!=null ? "'" + multiRule.getName() + "'" : "#" + index;
			result = result + "\n" + indent + "  Multi-rule " + name + ":\n";
			List<Match> matches = getMultiMatches(multiRule);
			for (int i=0; i<matches.size(); i++) {
				result = result + "\n" + indent + "  " + matchType + " #" + i + ":\n";
				Match match = matches.get(i);
				if (match instanceof MatchImpl) {
					result = result + ((MatchImpl) match).toStringWithIndent(indent + "  "); 
				} else {
					result = result + indent + "  " + match.toString();
				}
			}
			index++;
		}
		return result;
		
	}

}
