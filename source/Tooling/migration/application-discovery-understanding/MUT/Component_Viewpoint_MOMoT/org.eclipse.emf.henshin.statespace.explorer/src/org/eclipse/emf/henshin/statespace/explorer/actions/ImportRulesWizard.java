/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.actions;

import java.util.List;

import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.commands.ResetStateSpaceCommand;
import org.eclipse.emf.henshin.statespace.explorer.commands.SetRulesCommand;
import org.eclipse.emf.henshin.statespace.explorer.parts.StateSpaceExplorer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

/**
 * A wizard for importing rules into a statespace.
 * @author Christian Krause
 */
public class ImportRulesWizard extends Wizard {
	
	// State space explorer to be used:
	private StateSpaceExplorer explorer;
	
	// Rules page:
	private ImportRulesPage rulesPage;
	
	/**
	 * Default constructor.
	 * @param explorer Explorer to be used.
	 */
	public ImportRulesWizard(StateSpaceExplorer explorer) {
		this.explorer = explorer;
		setNeedsProgressMonitor(false);
		setWindowTitle("Import Rules");
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
    public void addPages() {
		
		// The state space:
		StateSpace stateSpace = explorer.getStateSpaceManager().getStateSpace();
		
		// Create the rule page:
		rulesPage = new ImportRulesPage();
		rulesPage.setStateSpaceResource(stateSpace.eResource());
		rulesPage.getRules().addAll(stateSpace.getRules());
		addPage(rulesPage);
		
    }
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		
		StateSpaceManager manager = explorer.getStateSpaceManager();
		
		List<Rule> newRules = rulesPage.getRules();
		List<Rule> oldRules = manager.getStateSpace().getRules();
		boolean changed = oldRules.size()!=newRules.size() || !oldRules.containsAll(newRules);
		
		if (changed) {
			
			if (manager.getStateSpace().getTransitionCount()==0 ||
				MessageDialog.openConfirm(getShell(), "Reset", "State space needs to be reset. Really continue?")) {
				
				// Execute as command:
				explorer.executeCommand(new SetRulesCommand(manager, newRules));
				explorer.executeCommand(new ResetStateSpaceCommand(manager));
				
			}
			
		}
		
		return true;
	}
	
}
