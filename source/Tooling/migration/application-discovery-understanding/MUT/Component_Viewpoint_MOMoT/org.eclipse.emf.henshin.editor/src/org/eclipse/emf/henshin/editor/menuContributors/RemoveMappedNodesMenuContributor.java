/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.menuContributors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

/**
 * Contributes removal of mapped origins and mapped images.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class RemoveMappedNodesMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new RemoveMappedNodesMenuContributor();
	
	private static final String COMMAND_LABEL_IMAGE = "RemoveImageNode";
	private static final String COMMAND_LABEL_IMAGE_RHS = "RemoveImageNode_FromRhs";
	private static final String COMMAND_LABEL_IMAGE_NC = "RemoveImageNode_FromNestedCondition";
	private static final String COMMAND_LABEL_IMAGE_ALL = "RemoveImageNode_All";
	private static final String COMMAND_LABEL_ORIGIN = "RemoveOriginNode";
	
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		buildRemoveMappingImages(menuManager, selection);
		buildRemoveMappingOrigin(menuManager, selection);
	}
	
	/**
	 * Contribute {@link RemoveCommand}s for {@link Node}s that the selected
	 * {@link Node} is mapped to.
	 * 
	 * @param menuManager
	 * @param selection
	 */
	private void buildRemoveMappingImages(IMenuManager menuManager, List<?> selection) {
		// selection is one Rule
		//
		if ((selection.size() != 1) || !(selection.get(0) instanceof Node)) return;
		
		Node node = (Node) selection.get(0);
		
		if (node.eContainer() == null) return;
		
		MenuManager subMenu = new MenuManager(getLabel(COMMAND_LABEL_IMAGE));
		
		Collection<Mapping> mappings;
		if (node.getGraph().isLhs() || node.getGraph().isRhs()) {
			mappings = node.getGraph().getRule().getMappings();
		} else if (node.getGraph().eContainer() instanceof NestedCondition) {
			mappings = ((NestedCondition) node.getGraph().eContainer()).getMappings();
		} else {
			// direct subgraph of TransformationSystem
			return;
		}
		
		Collection<Mapping> ruleMappings = new ArrayList<Mapping>();
		Collection<Mapping> conditionMappings = new ArrayList<Mapping>();
		for (Mapping mapping : mappings) {
			if ((mapping.getOrigin() == node) && (mapping.getImage() != null)) {
				if (mapping.getImage().getGraph().isRhs()) {
					ruleMappings.add(mapping);
				}
				if (mapping.getImage().getGraph().isNestedCondition()) {
					conditionMappings.add(mapping);
				}
			}
		}
		Collection<Command> cmds = new ArrayList<Command>();
		for (Mapping mapping : ruleMappings) {
			Command cmd = RemoveCommand.create(domain, mapping.getImage());
			cmds.add(cmd);
			subMenu.add(createAction(getLabel(COMMAND_LABEL_IMAGE_RHS) + ": "
					+ mapping.getImage().getName(), cmd));
		}
		
		if ((ruleMappings.size() > 0) && (conditionMappings.size() > 0)) {
			subMenu.add(new Separator());
		}
		
		for (Mapping mapping : conditionMappings) {
			Command cmd = RemoveCommand.create(domain, mapping.getImage());
			cmds.add(cmd);
			subMenu.add(createAction(getLabel(COMMAND_LABEL_IMAGE_NC) + ": "
					+ mapping.getImage().getGraph().getName(), cmd));
		}
		if (ruleMappings.size() + conditionMappings.size() > 1) {
			subMenu.add(new Separator());
			CompoundCommand removeAllCmd = new CompoundCommand();
			for (Command cmd : cmds) {
				removeAllCmd.append(cmd);
			}
			subMenu.add(createAction(getLabel(COMMAND_LABEL_IMAGE_ALL) + "(" + cmds.size() + ")",
					removeAllCmd));
		}
		
		if (subMenu.getSize() > 0) {
			menuManager.add(subMenu);
		}
		
	}
	
	/**
	 * Contribute {@link RemoveCommand}s for {@link Node}s that are mapped to
	 * selected {@link Node}.
	 * 
	 * @param menuManager
	 * @param selection
	 */
	private void buildRemoveMappingOrigin(IMenuManager menuManager, List<?> selection) {
		
		if (selection.size() != 1) return;
		if (!(selection.get(0) instanceof Node)) return;
		
		Node node = (Node) selection.get(0);
		
		if (node.eContainer() == null) return;
		
		// Nodes in lhs cannot be image of a mapping.
		//
		if (node.getGraph().isLhs()) return;
		
		if (node.getGraph().isRhs()) {
			for (Mapping mapping : node.getGraph().getRule().getMappings()) {
				if (mapping.getImage() == node && mapping.getOrigin() != null) {
					menuManager.add(createAction(getLabel(COMMAND_LABEL_ORIGIN) + ": "
							+ mapping.getOrigin().getName(),
							RemoveCommand.create(domain, mapping.getOrigin())));
					return;
				}
			}
		}
		
		if (node.getGraph().isNestedCondition()) {
			NestedCondition nc = (NestedCondition) node.getGraph().eContainer();
			for (Mapping mapping : getMappingsToFormula(nc)) {
				if (mapping.getImage() == node) {
					menuManager.add(createAction(getLabel(COMMAND_LABEL_ORIGIN) + ": "
							+ mapping.getOrigin().getName(),
							RemoveCommand.create(domain, mapping.getOrigin())));
					return;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param formula
	 * @return the collection that may contain mappings into the given formula
	 */
	protected Collection<Mapping> getMappingsToFormula(Formula formula) {
		if (formula.eContainer() instanceof Formula)
			return getMappingsToFormula((Formula) formula.eContainer());
		else if (formula.eContainer() instanceof Graph) {
			Graph graph = (Graph) formula.eContainer();
			if (graph.isNestedCondition())
				return ((NestedCondition) graph.eContainer()).getMappings();
			else if (graph.isLhs() || graph.isRhs())
				return graph.getRule().getMappings();
			else
				throw new IllegalArgumentException("Forumla not properly connected to model!");
		} else
			throw new IllegalArgumentException("Forumla not properly connected to model!");
	}
}
