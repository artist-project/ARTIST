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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.henshin.editor.commands.CopySubGraphToNestedConditionsCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.commands.QuantUtil;
import org.eclipse.emf.henshin.editor.commands.WrapFormulaInJunctionCommand;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;

/**
 * 
 * Contributes creation of {@link NestedCondition}s.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CreateNestedConditionMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CreateNestedConditionMenuContributor();
	private static final String COMMAND_LABEL = "CopySubGraphToNestedConditions";
	private static final String COMMAND_LABEL_SUBMENU = "CopySubGraphToNestedConditions_Submenu";
	private static final String COMMAND_LABEL_REPLACE = "CopySubGraphToNestedConditions_ReplaceCurrent";
	
	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions
	 * (org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		// selection is a not empty set of nodes from the same graph
		//
		if ((selection.size() > 0) && QuantUtil.allInstancesOf(Node.class, selection.toArray())) {
			Graph graph = null;
			boolean initialized = false;
			boolean applicable = true;
			Node node;
			for (Object selObject : selection) {
				node = (Node) selObject;
				if (!initialized) {
					graph = node.getGraph();
					initialized = true;
				}
				if ((graph == null) || (node.getGraph() != graph)) {
					applicable = false;
					break;
				}
			}
			if (applicable) {
				if (graph.getFormula() == null) {
					menuManager.add(createAction(getLabel(COMMAND_LABEL),
							new CopySubGraphToNestedConditionsCommand(domain,
									(Collection<Node>) selection)));
				} else {
					
					MenuManager subMenu = new MenuManager(getLabel(COMMAND_LABEL_SUBMENU));
					
					subMenu.add(createAction(getLabel(COMMAND_LABEL_REPLACE),
							new CopySubGraphToNestedConditionsCommand(domain,
									(Collection<Node>) selection)));
					
					final WrapFormulaInJunctionCommand wrapCmd = WrapFormulaInJunctionCommand
							.createWrapInAndCommand(graph.getFormula());
					
					final CopySubGraphToNestedConditionsCommand copycmd = new CopySubGraphToNestedConditionsCommand(
							domain, (Collection<Node>) selection);
					
					Command cmd = new CompoundCommand() {
						@Override
						public boolean canExecute() {
							return true;
						}
						
						@Override
						public void execute() {
							appendAndExecute(wrapCmd);
							Object[] aObj = wrapCmd.getAffectedObjects().toArray();
							if ((aObj.length < 1) || !(aObj[0] instanceof BinaryFormula)) {
								this.appendAndExecute(UnexecutableCommand.INSTANCE);
								return;
							}
							
							BinaryFormula wrapFormula = (BinaryFormula) aObj[0];
							copycmd.setOwner(wrapFormula);
							copycmd.setFeature(wrapFormula.eClass().getEStructuralFeature(
									HenshinPackage.BINARY_FORMULA__RIGHT));
							appendAndExecute(copycmd);
						}
					};
					
					subMenu.add(createAction(
							getLabel("CopySubGraphToNestedConditions_WrapWithCurrent"), cmd));
					menuManager.add(subMenu);
				}
				
			}
		}
		
	}
	
}
