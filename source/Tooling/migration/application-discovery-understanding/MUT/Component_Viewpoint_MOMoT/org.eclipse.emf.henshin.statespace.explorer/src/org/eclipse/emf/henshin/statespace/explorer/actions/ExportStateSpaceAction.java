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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Action for exporting state spaces.
 * @author Christian Krause
 */
public class ExportStateSpaceAction extends AbstractStateSpaceAction {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		// Get the shell:
		Shell shell = getExplorer().getSite().getShell();

		// Create the wizard:
		ExportStateSpaceWizard wizard = new ExportStateSpaceWizard();
		wizard.setStateSpaceIndex(getExplorer().getStateSpaceManager());
		wizard.init(getExplorer().getEditorSite().getWorkbenchWindow().getWorkbench(), (IStructuredSelection) getSelection());
		
		// Wizard dialog:
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.setTitle("Export State Space");
		dialog.open();
		
	}

}
