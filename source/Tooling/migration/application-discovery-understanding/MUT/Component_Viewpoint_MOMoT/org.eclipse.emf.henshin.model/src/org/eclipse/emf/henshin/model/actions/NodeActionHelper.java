/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.actions;

import java.util.List;

import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

public class NodeActionHelper extends GenericActionHelper<Node,Rule> {
	
	/**
	 * Static instance.
	 */
	public static final NodeActionHelper INSTANCE = new NodeActionHelper();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.ActionHelper#getActionElements(java.lang.Object, org.eclipse.emf.henshin.diagram.edit.actions.Action)
	 */
	public List<Node> getActionElements(Rule rule, Action action) {
		List<Node> candidates = ActionElementFinder.getRuleElementCandidates(rule, action, HenshinPackage.eINSTANCE.getGraph_Nodes());
		return filterElementsByAction(candidates, action);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	protected MapEditor<Node> getMapEditor(Graph target) {
		return new NodeMapEditor(target);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph, org.eclipse.emf.henshin.model.Graph, java.util.List)
	 */
	@Override
	protected MapEditor<Node> getMapEditor(Graph source, Graph target, MappingList mappings) {
		return new NodeMapEditor(source, target, mappings);
	}

	/**
	 * For an arbitrary node in a rule graph, find the corresponding action node.
	 * @param node Some node.
	 * @return The corresponding action node.
	 */
	public Node getActionNode(Node node) {
		return ActionElementFinder.getActionElement(node, INSTANCE);
	}

	/**
	 * For an arbitrary node in a rule graph, find the corresponding Lhs node.
	 * @param node Some node.
	 * @return The corresponding Lhs node.
	 */
	public Node getLhsNode(Node node) {
		Graph lhs = node.getGraph().getRule().getLhs();
		if (node.getGraph()==lhs) {
			return node;
		}
		Node opposite = getActionNode(node);
		if (opposite.getGraph()==lhs) {
			return opposite;
		}
		// No corresponding Lhs node:
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.actions.GenericActionHelper#getOrCreateAC(org.eclipse.emf.henshin.model.Action, org.eclipse.emf.henshin.model.Rule)
	 */
	@Override
	protected NestedCondition getOrCreateAC(Action action, Rule rule) {
		// Ensure node completeness of the nested condition:
		NestedCondition nestedCond = super.getOrCreateAC(action, rule);
		MapEditor<Node> editor = getMapEditor(rule.getLhs(), nestedCond.getConclusion(), nestedCond.getMappings());
		for (Node node : rule.getLhs().getNodes()) {
			editor.copy(node);
		}
		return nestedCond;
	}
	
}
