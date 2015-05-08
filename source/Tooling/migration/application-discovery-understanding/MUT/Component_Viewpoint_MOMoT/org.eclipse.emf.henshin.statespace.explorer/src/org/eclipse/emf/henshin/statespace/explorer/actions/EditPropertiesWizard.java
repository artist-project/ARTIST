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

import java.util.Map;

import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.commands.ResetStateSpaceCommand;
import org.eclipse.emf.henshin.statespace.explorer.commands.SetPropertiesCommand;
import org.eclipse.emf.henshin.statespace.explorer.parts.StateSpaceExplorer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

/**
 * Wizard for editing state space properties.
 * @author Christian Krause
 */
public class EditPropertiesWizard extends Wizard {
	
	// State space explorer to be used:
	private StateSpaceExplorer explorer;
	
	// Properties page:
	private EditPropertiesPage propertiesPage;
	
	/**
	 * Default constructor.
	 * @param explorer Explorer to be used.
	 */
	public EditPropertiesWizard(StateSpaceExplorer explorer) {
		this.explorer = explorer;
		setNeedsProgressMonitor(false);
		setWindowTitle("Edit State Space Properties");
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
		propertiesPage = new EditPropertiesPage(stateSpace);
		addPage(propertiesPage);
		
    }
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		
		// Only do something if it is dirty:
		if (propertiesPage.isDirty()) {
			
			// Commit the changes to the model:
			StateSpaceManager manager = explorer.getStateSpaceManager();
			Map<String,String> props = propertiesPage.getResult();
			SetPropertiesCommand setProps = new SetPropertiesCommand(manager,props);
			setProps.setMaxStateDistance(propertiesPage.getNewMaxStateDistance());
			explorer.executeCommand(setProps);
			
			// Ask whether we should do a reset:
			if (MessageDialog.openQuestion(getShell(), "Reset", 
					"Changing the properties may affect the state space generation. " +
					"Therefore we highly recommend to reset the state space now. Should the state space be reset now?")) {
				explorer.getJobManager().stopAllJobs();
				explorer.executeCommand(new ResetStateSpaceCommand(manager));
			}
		}
		return true;
		
	}
	
}
