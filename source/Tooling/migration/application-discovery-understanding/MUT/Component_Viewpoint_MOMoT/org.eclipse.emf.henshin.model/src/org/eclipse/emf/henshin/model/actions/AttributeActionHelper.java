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
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

public class AttributeActionHelper extends GenericActionHelper<Attribute,Node> {
	
	/**
	 * Static instance.
	 */
	public static final AttributeActionHelper INSTANCE = new AttributeActionHelper();

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.ActionHelper#getActionElements(java.lang.Object, org.eclipse.emf.henshin.diagram.edit.actions.Action)
	 */
	public List<Attribute> getActionElements(Node node, Action action) {		
		
		// Compute list of candidates:
		Rule rule = node.getGraph().getRule();
		if (rule.getKernelRule()!=null) {
			rule = rule.getKernelRule();
		}
		
		// First find all mapped nodes:
		Set<Node> mappedNodes = new LinkedHashSet<Node>(); 
		mappedNodes.add(node);
		boolean changed;
		do {
			changed = false;
			TreeIterator<EObject> it = rule.eAllContents();
			while (it.hasNext()) {
				EObject next = it.next();
				if (next instanceof Mapping) {
					Mapping m = (Mapping) next;
					if (m.getImage()==null || m.getOrigin()==null) continue;
					if (mappedNodes.contains(m.getOrigin())) {
						if (mappedNodes.add(m.getImage())) changed = true;
					}
					else if (mappedNodes.contains(m.getImage())) {
						if (mappedNodes.add(m.getOrigin())) changed = true;
					}
				}
			}
		} while (changed);
		
		// Now collect all attributes:
		List<Attribute> candidates = new ArrayList<Attribute>();
		for (Node n : mappedNodes) {
			candidates.addAll(n.getAttributes());
		}
				
		// Filter by action:
		List<Attribute> result = filterElementsByAction(candidates, action);
		
		// Sort:
		Collections.sort(result, new Comparator<Attribute>() {
			@Override
			public int compare(Attribute a1, Attribute a2) {
				if (a1.getType()==null) return -1;
				if (a2.getType()==null) return 1;
				String n1 = a1.getType().getName();
				String n2 = a2.getType().getName();
				if (n1==null) return -1;
				return n1.compareTo(n2);
			}
		});
		return result;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph)
	 */
	@Override
	protected MapEditor<Attribute> getMapEditor(Graph target) {
		return new AttributeMapEditor(target);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.actions.AbstractActionHelper#getMapEditor(org.eclipse.emf.henshin.model.Graph, org.eclipse.emf.henshin.model.Graph, java.util.List)
	 */
	@Override
	protected MapEditor<Attribute> getMapEditor(Graph source, Graph target, MappingList mappings) {
		return new AttributeMapEditor(source, target, mappings);
	}

}
