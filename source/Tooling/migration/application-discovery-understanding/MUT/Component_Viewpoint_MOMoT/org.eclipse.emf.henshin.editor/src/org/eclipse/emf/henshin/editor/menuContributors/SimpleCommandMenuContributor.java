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

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.henshin.editor.commands.CreateMappedNodeCommand;
import org.eclipse.emf.henshin.editor.commands.DeduceParametersCommand;
import org.eclipse.emf.henshin.editor.commands.MenuContributor;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.jface.action.IMenuManager;

/**
 * 
 * Contributes Actions which require too little code to justify an own
 * {@link MenuContributor}.
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public class SimpleCommandMenuContributor extends MenuContributor {
	
	public static MenuContributor INSTANCE = new SimpleCommandMenuContributor();
	
	private static final String COMMAND_LABEL_MAPPED_NODE = "CreateMappedNode";
	private static final String COMMAND_LABEL_DEDUCE_PARAMETERS = "DeduceParameters";
	
	@Override
	public void contributeActions(IMenuManager menuManager, List<?> selection) {
		buildCreateMappedNode(menuManager, selection, domain);
	}
	
	/**
	 * Contribute if {@link CreateMappedNodeCommand} is applicable.
	 * 
	 * @param menuManager
	 * @param selection
	 * @param domain
	 */
	private void buildCreateMappedNode(IMenuManager menuManager, List<?> selection,
			EditingDomain domain) {
		// selection is one Rule
		//
		if ((selection.size() == 1) && (selection.get(0) instanceof Rule)) {
			menuManager.add(createAction(getLabel(COMMAND_LABEL_MAPPED_NODE),
					new CreateMappedNodeCommand((Rule) selection.get(0))));
			menuManager.add(createAction(getLabel(COMMAND_LABEL_DEDUCE_PARAMETERS),
					new DeduceParametersCommand((Rule) selection.get(0))));
		}
	}
	
}
