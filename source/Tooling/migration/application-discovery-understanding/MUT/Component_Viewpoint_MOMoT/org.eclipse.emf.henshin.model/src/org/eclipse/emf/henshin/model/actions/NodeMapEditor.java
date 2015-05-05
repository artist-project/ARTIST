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

import java.util.ArrayList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * A helper class for editing node maps, e.g. for copying and 
 * mapping nodes from the source to the target graph etc.
 * 
 * @author Christian Krause
 */
public class NodeMapEditor extends AbstractMapEditor<Node> {
	
	// Edge map editor:
	private EdgeMapEditor edgeMapEditor;
	
	/**
	 * Default constructor.
	 */
	public NodeMapEditor(Graph source, Graph target, MappingList mappings) {
		super(source, target, mappings);
		edgeMapEditor = new EdgeMapEditor(this);
	}
	
	/**
	 * Alternative constructor.
	 */
	public NodeMapEditor(Graph target) {
		super(target);
		edgeMapEditor = new EdgeMapEditor(this);
	}
	
	/**
	 * Alternative constructor.
	 */
	public NodeMapEditor(EdgeMapEditor edgeMapEditor) {
		super(edgeMapEditor);
		this.edgeMapEditor = edgeMapEditor;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doRemove(java.lang.Object)
	 */
	protected void doRemove(Node node) {
		node.getGraph().removeNode(node);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doCopy(java.lang.Object)
	 */
	protected Node doCopy(Node node) {
		
		// Create the copy:
		Node copy = performCopy(node);
		
		// Copy the incoming and outgoing edges:
		for (Edge incoming : node.getIncoming()) {
			performCopy(incoming.getSource());
			edgeMapEditor.copy(incoming);
		}
		for (Edge outgoing : node.getOutgoing()) {
			performCopy(outgoing.getTarget());
			edgeMapEditor.copy(outgoing);
		}
		
		// Done.
		return copy;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doMove(java.lang.Object)
	 */
	protected void doMove(Node node) {
		
		// The graph where we move the node to:
		Graph newGraph = getOpposite(node.getGraph());
		
		// Move all incoming and outgoing edges:
		for (Edge incoming : node.getIncoming()) {
			incoming.setSource(performCopy(incoming.getSource()));
			incoming.setGraph(newGraph);
		}
		for (Edge outgoing : node.getOutgoing()) {
			outgoing.setTarget(performCopy(outgoing.getTarget()));
			outgoing.setGraph(newGraph);
		}
		
		// Move the node itself:
		node.setGraph(newGraph);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doReplace(java.lang.Object)
	 */
	protected Node doReplace(Node node) {
		
		Node opposite = getOpposite(node);
		Graph graph = node.getGraph();
				
		// Migrate the new edges:
		for (Edge incoming : opposite.getIncoming()) {
			
			// Remove old edges first:
			Edge oldEdge = edgeMapEditor.getOpposite(incoming);
			if (oldEdge!=null) {
				graph.removeEdge(oldEdge);
			}
			
			// Now wire the new edge and move it to the other graph:
			incoming.setSource(performCopy(incoming.getSource()));
			incoming.setGraph(graph);
			
		}	
		for (Edge outgoing : opposite.getOutgoing()) {

			// Remove old edges first:
			Edge oldEdge = edgeMapEditor.getOpposite(outgoing);
			if (oldEdge!=null) {
				graph.removeEdge(oldEdge);
			}
			
			// Now wire the new edge and move it to the other graph:
			outgoing.setTarget(performCopy(outgoing.getTarget()));
			outgoing.setGraph(graph);

		}

		// Take care of the old edges that are not mapped (the others are removed by now):
		
		for (Edge incoming : new ArrayList<Edge>(node.getIncoming())) {
			incoming.setTarget(opposite);
		}
		for (Edge outgoing : new ArrayList<Edge>(node.getOutgoing())) {
			outgoing.setSource(opposite);
		}		
		
		// Remove the mapping now (not earlier):
		removeMapping(node, opposite);

		// Replace the old node by the new node:
		int index = graph.getNodes().indexOf(node);
		graph.getNodes().set(index, opposite);
		
		// Update the multi-mappings:
		updateMappings(node, opposite);
		
		// Done.
		return opposite;
		
	}

	/*
	 * Update all related mappings.
	 */
	void updateMappings(Node oldNode, Node newNode) {
		Rule rule = newNode.getGraph().getRule();
		for (Mapping m : rule.getAllMappings()) {
			if (m.getOrigin()==oldNode) {
				m.setOrigin(newNode);
			}
			if (m.getImage()==oldNode) {
				m.setImage(newNode);
			}
		}
	}
	
	/*
	 * Perform a copy operation.
	 */
	Node performCopy(Node node) {
		Node opposite = getOpposite(node);
		if (opposite==null) {
			opposite = (Node) EcoreUtil.copy(node);
			opposite.setGraph(getOpposite(node.getGraph()));
			createMapping(node, opposite);
		}
		return opposite;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doRemoveMapping(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void doRemoveMapping(Node origin, Node image) {
		getMappings().remove(origin, image);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doCreateMapping(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void doCreateMapping(Node origin, Node image) {
		getMappings().add(origin, image);
	}
	
}
