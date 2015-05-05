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

import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Action for resetting state space files.
 * @author Christian Krause
 */
public class ResetStateSpaceFileAction extends AbstractStateSpaceFileAction {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.actions.AbstractStateSpaceFileAction#doRun(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void doRun(IAction action) {
		
		boolean confirmed = MessageDialog.openConfirm(getShell(), "Reset State Space", "All derived states will be deleted. Really continue?");
		if (confirmed) {
			try {
				getStateSpaceManager().resetStateSpace(false);
				saveStateSpace();
			} catch (Throwable t) {
				StateSpaceExplorerPlugin.getInstance().logError("Error reseting state space", t);
				MessageDialog.openError(getShell(), "Error", "Error reseting state space. See the error log for more information.");
			}
		}
		
	}

}
