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

import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * A map editor for multi-rule elements. Used for multi-rules.
 * This does not implement {@link MapEditor}.
 * @author Christian Krause
 */
public class MultiRuleMapEditor {
	
	// Kernel and multi-rule.
	private final Rule kernel, multi;
	
	// Node map editors:
	private final NodeMapEditor lhsNodeMapEditor, rhsNodeMapEditor;

	// Edge map editors:
	private final EdgeMapEditor lhsEdgeMapEditor, rhsEdgeMapEditor;

	public MultiRuleMapEditor(Rule kernel, Rule multi) {
		
		// Source, target and the image graphs:
		this.kernel = kernel;
		this.multi = multi;

		// Node and edge map editors:
		lhsNodeMapEditor = new NodeMapEditor(kernel.getLhs(), multi.getLhs(), multi.getMultiMappings());
		lhsEdgeMapEditor = new EdgeMapEditor(kernel.getLhs(), multi.getLhs(), multi.getMultiMappings());
		rhsNodeMapEditor = new NodeMapEditor(kernel.getRhs(), multi.getRhs(), multi.getMultiMappings());
		rhsEdgeMapEditor = new EdgeMapEditor(kernel.getRhs(), multi.getRhs(), multi.getMultiMappings());
		
	}
	
	/**
	 * Move a mapped node.
	 * @param node Node to be moved.
	 */
	public void moveMappedNode(Node node) {
		
		// Get the opposite node and the mapping.
		Node opposite = getOppositeNode(node);
		Graph graph = node.getGraph();
		if (opposite==null || graph==null) return;
		
		// Move the mapping:
		if (graph.getRule()==kernel) {
			multi.getMappings().add( getHorizontalMapping(node, opposite) );
		} else if (graph.getRule()==multi) {
			kernel.getMappings().add( getHorizontalMapping(node, opposite) );
		}

		// Move the node and the opposite node:
		if (graph==kernel.getLhs() || graph==multi.getLhs()) {
			rhsNodeMapEditor.move(opposite);				
			lhsNodeMapEditor.move(node);
		}
		else if (graph==kernel.getRhs() || graph==multi.getRhs()) {
			rhsNodeMapEditor.move(node);				
			lhsNodeMapEditor.move(opposite);
		}
		
		// It could be that we left an old mapping instance in the multi-rule.
		removeInvalidMappings(multi.getMappings(), multi.getLhs(), multi.getRhs());
		
	}

	private static void removeInvalidMappings(List<Mapping> mappings, Graph source, Graph target) {
		for (int i=0; i<mappings.size(); i++) {
			Mapping mapping = mappings.get(i);
			if (mapping.getOrigin().getGraph()!=source ||
				mapping.getImage().getGraph()!=target) {
				mappings.remove(i--);
			}
		}
	}

	/**
	 * Copy a mapped node.
	 * @param node Node to be copied.
	 */
	public void copyMappedNode(Node node) {
		
		// Get the opposite node and the mapping.
		Node opposite = getOppositeNode(node);
		Graph graph = node.getGraph();
		if (opposite==null || graph==null) return;

		// Copy the node and the opposite node:
		Node copiedNode, copiedOpposite;
		if (graph==kernel.getLhs() || graph==multi.getLhs()) {
			copiedOpposite = rhsNodeMapEditor.copy(opposite);				
			copiedNode = lhsNodeMapEditor.copy(node);
		}
		else if (graph==kernel.getRhs() || graph==multi.getRhs()) {
			copiedNode = rhsNodeMapEditor.copy(node);
			copiedOpposite = lhsNodeMapEditor.copy(opposite);
		}
		else {
			return;
		}
		
		// Create a copy of the mapping:
		Mapping mapping = getHorizontalMapping(node, opposite);
		if (graph.getRule()==kernel) {
			copyMapping(mapping, node, opposite, copiedNode, copiedOpposite, multi);
		} else if (graph.getRule()==multi) {
			copyMapping(mapping, node, opposite, copiedNode, copiedOpposite, kernel);
		}
	
	}

	
	/**
	 * Move a mapped edge.
	 * @param edge Edge to be moved.
	 */
	public void moveMappedEdge(Edge edge) {
		
		// Get the opposite edge first:
		Edge opposite = getOppositeEdge(edge);
		Graph graph = edge.getGraph();
		if (opposite==null || graph==null) return;
		
		// Find out from where to where we move...
		Rule from;
		if (graph==kernel.getLhs() || graph==kernel.getRhs()) {
			from = kernel;
		} else if (graph==multi.getLhs() || graph==multi.getRhs()) {
			from = multi;
		} else {
			return;
		}
		
		// If the edge is mapped, then so is its source and target
		copyMappedNode(edge.getSource());
		copyMappedNode(edge.getTarget());
		
		// Now we move the edge to the new graph
		if (graph==from.getLhs()) {
			lhsEdgeMapEditor.move(edge);
			rhsEdgeMapEditor.move(opposite);
		} else if (graph==from.getRhs()) {
			lhsEdgeMapEditor.move(opposite);
			rhsEdgeMapEditor.move(edge);
		}
		
	}

	/**
	 * Move a mapped element. This can be either a node or
	 * an edge. If it is neither, nothing hapens.
	 * @param element Element to be moved.
	 */
	public void moveMappedElement(Object element) {
		if (element instanceof Node) {
			moveMappedNode((Node) element);
		} else if (element instanceof Edge) {
			moveMappedEdge((Edge) element);
		}
	}
	
	public void ensureCompleteness() {
		for (Node node : kernel.getLhs().getNodes()) {
			copyNodeToTarget(node);
		}
		for (Edge edge : kernel.getLhs().getEdges()) {
			copyEdgeToTarget(edge);
		}
	}
	
	private void copyNodeToTarget(Node node) {
		if (getOppositeNode(node)!=null) {
			copyMappedNode(node);
		} else {
			if (node.getGraph()==kernel.getLhs()) {
				lhsNodeMapEditor.copy(node);
			} else if (node.getGraph()==kernel.getRhs()) {
				rhsNodeMapEditor.copy(node);
			}
		}
	}

	private void copyEdgeToTarget(Edge edge) {
		Edge opposite = getOppositeEdge(edge);
		if (edge.getGraph()==kernel.getLhs()) {
			lhsEdgeMapEditor.copy(edge);
			if (opposite!=null) {
				rhsEdgeMapEditor.copy(opposite);				
			}
		}
		else if (edge.getGraph()==kernel.getRhs()) {
			rhsEdgeMapEditor.copy(edge);
			if (opposite!=null) {
				lhsEdgeMapEditor.copy(opposite);				
			}
		}
	}

	
	/*
	 * Get the opposite node.
	 */
	private Node getOppositeNode(Node node) {
		if (node.getGraph().getRule()==kernel) {
			return new NodeMapEditor(kernel.getRhs()).getOpposite(node);
		} else if (node.getGraph().getRule()==multi) {
			return new NodeMapEditor(multi.getRhs()).getOpposite(node);
		} else {
			return null;
		}
	}

	/*
	 * Get the opposite edge.
	 */
	private Edge getOppositeEdge(Edge edge) {
		if (edge.getGraph().getRule()==kernel) {
			return new EdgeMapEditor(kernel.getRhs()).getOpposite(edge);
		} else if (edge.getGraph().getRule()==multi) {
			return new EdgeMapEditor(multi.getRhs()).getOpposite(edge);
		} else {
			return null;
		}
	}
	
	// Get the LHS-RHS mapping for two nodes.
	private Mapping getHorizontalMapping(Node n1, Node n2) {
		Mapping mapping = kernel.getMappings().get(n1, n2);
		if (mapping==null) {
			mapping = multi.getMappings().get(n1, n2);
		}
		return mapping;
	}
	
	private void copyMapping(Mapping mapping, Node old1, Node old2, Node new1, Node new2, Rule rule) {
		if (mapping.getOrigin()==old1 && mapping.getImage()==old2) {
			rule.getMappings().add(new1, new2);
		} else if (mapping.getOrigin()==old2 && mapping.getImage()==old1) {
			rule.getMappings().add(new2, new1);
		}
	}
	
}
