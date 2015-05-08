/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;

/**
 * Creates a copy of the sub{@link Graph} defined by the given {@link Node}s and
 * set it as {@link NestedCondition} of the containing {@link Graph}
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CopySubGraphToNestedConditionsCommand extends CompoundCommand {
	
	protected EditingDomain domain;
	protected Collection<Node> nodes;
	protected Collection<Edge> edges = new ArrayList<Edge>();
	protected NestedCondition condition;
	protected Graph conclusionGraph;
	protected EObject previousFormula;
	protected EObject owner;
	protected EStructuralFeature feature;
	
	/**
	 * @param domain
	 * @param nodes
	 * @param owner
	 * @param feature
	 */
	public CopySubGraphToNestedConditionsCommand(EditingDomain domain, Collection<Node> nodes,
			EObject owner, EStructuralFeature feature) {
		this.domain = domain;
		this.nodes = nodes;
		this.owner = owner;
		this.feature = feature;
	}
	
	/**
	 * @param domain
	 * @param nodes
	 */
	public CopySubGraphToNestedConditionsCommand(EditingDomain domain, Collection<Node> nodes) {
		this.domain = domain;
		this.nodes = nodes;
	}
	
	/**
	 * @param owner
	 */
	public void setOwner(EObject owner) {
		this.owner = owner;
	}
	
	/**
	 * @param feature
	 */
	public void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		if (nodes.isEmpty()) return false;
		
		// nodes must be contained in the same Graph
		Graph graph = null;
		for (Node node : nodes) {
			if (graph == null) {
				graph = node.getGraph();
			}
			if (node.getGraph() != graph) return false;
		}
		
		if (this.owner == null) {
			this.owner = graph;
			this.feature = HenshinPackage.Literals.GRAPH__FORMULA;
		}
		
		// // graph must be a LHS
		// if (graph.getContainerRule().getLhs() != graph)
		// return false;
		
		// collect all edges between the given nodes
		for (Edge edge : graph.getEdges()) {
			if (nodes.contains(edge.getSource()) && nodes.contains(edge.getTarget())) {
				edges.add(edge);
			}
		}
		
		return true;
	}// prepare
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#execute()
	 */
	@Override
	public void execute() {
		
		HenshinFactory factory = HenshinFactory.eINSTANCE;
		
		// create copy of nodes and edges
		Collection<Object> subGraphElements = new ArrayList<Object>();
		subGraphElements.addAll(nodes);
		subGraphElements.addAll(edges);
		Command copyCmd = CopyCommand.create(domain, subGraphElements);
		appendAndExecute(copyCmd);
		
		condition = factory.createNestedCondition();
		conclusionGraph = factory.createGraph();
		condition.setConclusion(conclusionGraph);
		
		Iterator<?> originalElementsIterator = subGraphElements.iterator();
		Iterator<?> copiedElementsIterator = copyCmd.getResult().iterator();
		
		// create mappings between original nodes and copies
		
		List<Node> conclusionNodeList = conclusionGraph.getNodes();
		List<Edge> conclusionEdgeList = conclusionGraph.getEdges();
		List<Mapping> conditionMappingList = condition.getMappings();
		while (originalElementsIterator.hasNext() && copiedElementsIterator.hasNext()) {
			Object originalObject = originalElementsIterator.next();
			Object copiedObject = copiedElementsIterator.next();
			if (copiedObject instanceof Node) {
				conclusionNodeList.add((Node) copiedObject);
				conditionMappingList.add(factory.createMapping((Node) originalObject,
						(Node) copiedObject));
			}
			if (copiedObject instanceof Edge) {
				conclusionEdgeList.add((Edge) copiedObject);
			}
		}
		redo();
	}
	
	@Override
	public void redo() {
		previousFormula = (Formula) owner.eGet(feature);
		owner.eSet(feature, condition);
		
	}
	
	@Override
	public void undo() {
		owner.eSet(feature, previousFormula);
	}
	
	@Override
	public boolean canUndo() {
		return true;
	}
	
	@Override
	public Collection<?> getAffectedObjects() {
		return Collections.singleton(condition);
	}
	
}
