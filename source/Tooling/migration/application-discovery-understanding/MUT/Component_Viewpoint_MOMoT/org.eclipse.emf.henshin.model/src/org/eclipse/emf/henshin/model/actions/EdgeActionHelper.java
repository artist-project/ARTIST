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
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Rule;

public class EdgeActionHelper extends GenericActionHelper<Edge,Rule> {
	
	/**
	 * Static instance.
	 */
	public static final EdgeActionHelper INSTANCE = new EdgeActionHelper();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.ActionHelper#getActionElements(java.lang.Object, org.eclipse.emf.henshin.diagram.edit.actions.Action)
	 */
	public List<Edge> getActionElements(Rule rule, Action action) {
		List<Edge> candidates =  ActionElementFinder.getRuleElementCandidates(rule, action, HenshinPackage.eINSTANCE.getGraph_Edges());
		return filterElementsByAction(candidates, action);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	protected MapEditor<Edge> getMapEditor(Graph target) {
		return new EdgeMapEditor(target);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph, org.eclipse.emf.henshin.model.Graph, java.util.List)
	 */
	@Override
	protected MapEditor<Edge> getMapEditor(Graph source, Graph target, MappingList mappings) {
		return new EdgeMapEditor(source, target, mappings);
	}

	/**
	 * For an arbitrary edge in a rule graph, find the corresponding action edge.
	 * @param edge Some edge.
	 * @return The corresponding action edge.
	 */
	public Edge getActionEdge(Edge edge) {
		return ActionElementFinder.getActionElement(edge, INSTANCE);
	}

}
