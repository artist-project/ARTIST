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

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Action for editing the properties of a state space.
 * @author Christian Krause
 */
public class EditPropertiesAction extends AbstractStateSpaceAction {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		
		// Create a new import wizard:
		IWizard wizard = new EditPropertiesWizard(getExplorer());
		
		// Display a dialog:
		Shell shell = getExplorer().getSite().getShell();
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("Edit State Space Properties");
		dialog.open();
		
	}
	
}
