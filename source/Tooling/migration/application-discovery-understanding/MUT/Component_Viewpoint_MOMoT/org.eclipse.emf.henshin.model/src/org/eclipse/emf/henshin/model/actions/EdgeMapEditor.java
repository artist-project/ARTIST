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

import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;

public class EdgeMapEditor extends AbstractMapEditor<Edge> {
	
	// Node map editor:
	private NodeMapEditor nodeMapEditor;
	
	/**
	 * Default constructor.
	 */
	public EdgeMapEditor(Graph source, Graph target, MappingList mappings) {
		super(source, target, mappings);
		nodeMapEditor = new NodeMapEditor(this);
	}
	
	/**
	 * Alternative constructor.
	 */
	public EdgeMapEditor(Graph target) {
		super(target);
		nodeMapEditor = new NodeMapEditor(this);
	}
	
	/**
	 * Alternative constructor.
	 */
	public EdgeMapEditor(NodeMapEditor nodeMapEditor) {
		super(nodeMapEditor);
		this.nodeMapEditor = nodeMapEditor;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doCopy(java.lang.Object)
	 */
	@Override
	protected Edge doCopy(Edge edge) {
		Edge opposite = getOpposite(edge);
		if (opposite==null) {
			opposite = HenshinFactory.eINSTANCE.createEdge();
			opposite.setType( edge.getType() );
			opposite.setSource( nodeMapEditor.performCopy(edge.getSource()) );
			opposite.setTarget( nodeMapEditor.performCopy(edge.getTarget()) );
			opposite.setGraph( getOpposite(edge.getGraph()) );
		}
		return opposite;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doMove(java.lang.Object)
	 */
	@Override
	protected void doMove(Edge edge) {
		Node newSource = nodeMapEditor.performCopy(edge.getSource());
		Node newTarget = nodeMapEditor.performCopy(edge.getTarget());
		if (newSource!=null && newTarget!=null) {
			edge.setSource(newSource);
			edge.setTarget(newTarget);
			edge.setGraph(getOpposite(edge.getGraph()));
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.AbstractMapEditor#doRemove(java.lang.Object)
	 */
	@Override
	protected void doRemove(Edge edge) {
		edge.setSource(null);
		edge.setTarget(null);
		edge.setGraph(null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.model.actions.impl.AbstractMapEditor#doReplace(org.eclipse.emf.henshin.model.GraphElement)
	 */
	@Override
	protected Edge doReplace(Edge edge) {
		Edge opposite = getOpposite(edge);
		opposite.setSource(edge.getSource());
		opposite.setTarget(edge.getTarget());
		opposite.setGraph(edge.getGraph());
		edge.getGraph().removeEdge(edge);
		return opposite;
	}
	
}
