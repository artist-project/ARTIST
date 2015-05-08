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

import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.commands.ResetStateSpaceCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Action for resetting the state space.
 * @author Christian Krause
 */
public class ResetStateSpaceAction extends AbstractStateSpaceAction {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		// Display a confirmation dialog:
		Shell shell = getExplorer().getSite().getShell();
		boolean confirmed = MessageDialog.openConfirm(shell, "Reset State Space", "All derived states will be deleted. Really continue?");
		if (confirmed) {
			
			// Create and execute Reset command:
			StateSpaceManager manager = getExplorer().getStateSpaceManager();
			ResetStateSpaceCommand command = new ResetStateSpaceCommand(manager);
			
			try {
				getExplorer().executeCommand(command);
			} catch (Throwable t) {
				StateSpaceExplorerPlugin.getInstance().logError("Error reseting state space", t);
				MessageDialog.openError(shell, "Error", "Error reseting state space. See the error log for more information.");
			}
		}
		
	}
	
}
