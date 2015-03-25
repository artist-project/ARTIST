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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.commands.CreateInitialStateCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * Action for creating a new initial state to the current state space.
 * @author Christian Krause
 */
public class CreateInitialStateAction extends AbstractStateSpaceAction {
	
	// Location of the new state:
	private int[] location;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		// Display a dialog:
		Shell shell = getExplorer().getSite().getShell();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
		dialog.setTitle("Load resource");
		dialog.setMessage("Select the resource to load:");
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		dialog.setInput(root);
		URI uri = getExplorer().getStateSpaceManager().getStateSpace().eResource().getURI().trimSegments(1);
		IResource container = root.findMember(uri.toPlatformString(true));
		if (container!=null) dialog.setInitialSelection(container);
		dialog.open();

		// Check whether the location was set:
		if (location==null) {
			location = new int[] { 50, 50, 0 };
		}
		
		// Load the selected files:
		if (dialog.getReturnCode()==Dialog.OK) {
			for (Object object : dialog.getResult()) {
				if (object instanceof IFile) load((IFile) object);
			}
		}
		
	}
	
	private void load(IFile file) {
		
		StateSpaceManager manager = getExplorer().getStateSpaceManager();
		StateSpace stateSpace = manager.getStateSpace();
		ResourceSet resourceSet = stateSpace.eResource().getResourceSet();
		URI absolute = URI.createPlatformResourceURI(file.getFullPath().toString(),true);
		URI relative = absolute.deresolve(stateSpace.eResource().getURI());
		
		try {
			
			// Load the model and assign the relative path to it:
			Resource resource = resourceSet.getResource(absolute, true);
			resource.setURI(relative);
			
			// Create the model instance:
			Model model = StateSpaceFactory.eINSTANCE.createModel(resource);
			
			// New command:
			CreateInitialStateCommand command = new CreateInitialStateCommand(model, manager);
			command.setLocation(location);
			
			// Execute the command:
			getExplorer().executeCommand(command);
			
		} catch (Throwable t) {
			Shell shell = getExplorer().getSite().getShell();
			MessageDialog.openError(shell, "Create Initial State", "Error creating initial state for " + file + ": " + t.getMessage());
		}
		
	}
	
	public void setLocation(int... location) {
		this.location = location;
	}
	
}
