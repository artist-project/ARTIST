/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Command to unset a graph and to remove mappings appropriately as well.
 * @author Stefan Jurack (sjurack)
 */
public class GraphComplexUnsetCommand extends CompoundCommand {
	
	private final EditingDomain domain;
	EObject owner;
	EStructuralFeature feature;
	
	public GraphComplexUnsetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature) {
		super();
		this.domain = domain;
		this.owner = owner;
		this.feature = feature;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		isPrepared = true;
		isExecutable = true;
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#execute()
	 */
	@Override
	public void execute() {
		processMappings();
		this.appendAndExecute(new SetCommand(domain, owner, feature, SetCommand.UNSET_VALUE));
	}
	
	/**
	 * Collects and removes all mappings which relate to the graph to be  deleted.
	 * <p>
	 * Note that we do not have to look for mappings below (i.e. in contained
	 * NestedConditions) as such mappings are disconnected from the tree
	 * (indirectly) anyway.
	 * <p>
	 */
	private void processMappings() {
		final Set<Mapping> mappingSet = new HashSet<Mapping>();
		Graph graph = (Graph) owner.eGet(feature);
		if (graph == null)
			return;
		List<Node> nodes = graph.getNodes();
		
		if (owner instanceof Rule) {
			Rule rule = (Rule) owner;
			filterMappings(rule.getMappings(), mappingSet, nodes);
		} else if (owner instanceof NestedCondition) {
			NestedCondition nc = (NestedCondition) owner;
			filterMappings(nc.getMappings(), mappingSet, nodes);
		}
		
		if (!mappingSet.isEmpty())
			this.appendAndExecute(new DeleteCommand(domain, mappingSet));
	}
	
	/**
	 * Iterates <code>unfilteredList</code> and put those mappings into
	 * <code>targetSet</code> which relate to a node in <code>nodes</code> .
	 * 
	 * @param unfilteredList
	 * @param targetSet
	 */
	private void filterMappings(List<Mapping> unfilteredList, Set<Mapping> targetSet,
			List<Node> nodes) {
		for (Mapping mapping : unfilteredList) {
			for (Node node : nodes) {
				if (mapping.getImage() == node || mapping.getOrigin() == node) {
					targetSet.add(mapping);
					break;
				}// if
			}// for
		}// for
	}
	
}
