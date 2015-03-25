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

import java.util.List;

import org.eclipse.emf.edit.provider.WrapperItemProvider;
import org.eclipse.emf.henshin.editor.commands.CreateMappingCommand;
import org.eclipse.emf.henshin.editor.commands.CreateParameterMappingCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.commands.QuantUtil;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;

/**
 * Contributes creation of {@link Mapping}s between nodes.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class CreateMappingCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CreateMappingCommandMenuContributor();
	
	private static final String COMMAND_LABEL = "CreateMapping";
	
	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions
	 * (org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@Override
	public void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.size() != 2)
			return;
		
		Object source = selection.get(0);
		Object target = selection.get(1);
		
		while (source instanceof WrapperItemProvider) {
			source = ((WrapperItemProvider) source).getValue();
		}
		
		while (target instanceof WrapperItemProvider) {
			target = ((WrapperItemProvider) target).getValue();
		}
		
		boolean bNodeMapping = QuantUtil.allInstancesOf(Node.class, source, target);
		boolean bParameterMapping = QuantUtil.allInstancesOf(Parameter.class, source, target);
		
		if (bNodeMapping) {
			Node sourceNode = (Node) source;
			Node targetNode = (Node) target;
			
			// Nodes must be contained in different graphs
			//
			if (QuantUtil.anyNull(sourceNode.getGraph(), targetNode.getGraph())
					|| QuantUtil.allIdentical(sourceNode.getGraph(), targetNode.getGraph()))
				return;
			
			// Nodes must have the same type.
			//
			// if (!QuantUtil.allIdenticalAndNotNull(sourceNode.getType(),
			// targetNode.getType())) return;
			
			CreateMappingCommand cmd = new CreateMappingCommand(domain, sourceNode, targetNode);
			if (cmd.canExecute())
				menuManager.add(createAction(getLabel(COMMAND_LABEL), cmd));
			
			cmd = new CreateMappingCommand(domain, targetNode, sourceNode);
			if (cmd.canExecute())
				menuManager.add(createAction(getLabel(COMMAND_LABEL), cmd));
			
		} else if (bParameterMapping) {
			
			Parameter sourceParameter = (Parameter) source;
			Parameter targetParameter = (Parameter) target;
			
			/*
			 * One parameter shall be in the "containing" unit, the other one in
			 * the "contained".
			 */
			Unit sourceUnit = sourceParameter.getUnit();
			Unit targetUnit = targetParameter.getUnit();
			
			if (!(sourceUnit.getSubUnits(false).contains(targetUnit) || targetUnit.getSubUnits(
					false).contains(sourceUnit)))
				return;
			
			String srcP = sourceUnit.getName() + "." + sourceParameter.getName();
			String trgP = targetUnit.getName() + "." + targetParameter.getName();
			
			String labelST = getLabel(COMMAND_LABEL) + "[" + srcP + " -> " + trgP + "]";
			String labelTS = getLabel(COMMAND_LABEL) + "[" + srcP + " <- " + trgP + "]";
			
			CreateParameterMappingCommand cmd = new CreateParameterMappingCommand(sourceParameter,
					targetParameter);
			if (cmd.canExecute()) {
				IAction action = createAction(labelST, cmd);
				action.setEnabled(cmd.isEnabled());
				menuManager.add(action);
			}
			
			cmd = new CreateParameterMappingCommand(targetParameter, sourceParameter);
			if (cmd.canExecute()) {
				IAction action = createAction(labelTS, cmd);
				action.setEnabled(cmd.isEnabled());
				menuManager.add(action);
			}
			
		} // if else
		
	}// contributeActions
}// class
