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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.editor.commands.CreateOppositeEdgeCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.jface.action.IMenuManager;

/**
 * Contributes CreateOppositeCommand to menu.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 * 
 */
public class CreateOppositeEdgeCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new CreateOppositeEdgeCommandMenuContributor();
	
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		
		if (selection.size() != 1) return;
		
		if (!(selection.get(0) instanceof Edge)) return;
		
		Edge edge = (Edge) selection.get(0);
		
		if (edge.getType() == null) return;
		
		if (edge.getType().getEOpposite() == null) return;
		
		EReference oRef = edge.getType().getEOpposite();
		
		for (Edge iEdge : edge.getSource().getIncoming()) {
			if (iEdge.getSource() == edge.getTarget() && iEdge.getType() == oRef) return;
		}
		CreateOppositeEdgeCommand cmd = new CreateOppositeEdgeCommand();
		cmd.setEdge(edge);
		menuManager.add(createAction(getLabel("CreateOppositeEdge") + ": " + oRef.getName(), cmd));
	}
}
