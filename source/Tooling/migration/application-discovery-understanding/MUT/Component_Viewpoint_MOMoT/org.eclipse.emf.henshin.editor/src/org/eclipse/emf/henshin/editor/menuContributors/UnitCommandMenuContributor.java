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

import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.editor.commands.ChangeUnitTypeCommand;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.PriorityUnit;
import org.eclipse.emf.henshin.model.SequentialUnit;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.jface.action.IMenuManager;

public class UnitCommandMenuContributor extends MenuContributor {

	public static MenuContributor INSTANCE = new UnitCommandMenuContributor();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.editor.commands.MenuContributor#contributeActions(org.eclipse.jface.action.IMenuManager, java.util.List)
	 */
	@Override
	protected void contributeActions(IMenuManager menuManager, List<?> selection) {
		if ((selection.size() == 1) && (selection.get(0) instanceof Unit)
				&& ((selection.get(0) instanceof IndependentUnit) || (selection.get(0) instanceof SequentialUnit) || (selection.get(0) instanceof PriorityUnit))) {
			String replaceBy = getLabel("ReplaceBy") + " ";
			menuManager.add(createAction(replaceBy + getLabel("ReplaceBy_IndependentUnit"), new ChangeUnitTypeCommand((Unit) selection.get(0), 1)));
			menuManager.add(createAction(replaceBy + getLabel("ReplaceBy_SequentialUnit"), new ChangeUnitTypeCommand((Unit) selection.get(0), 2)));
			menuManager.add(createAction(replaceBy + getLabel("ReplaceBy_PriorityUnit"), new ChangeUnitTypeCommand((Unit) selection.get(0), 3)));
		}

	}

}