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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

/**
 * Wizard page for state space creation wizard.
 * @author Christian Krause
 */
public class CreateStateSpacePage extends WizardNewFileCreationPage {
	
	// Workbench:
	private final IWorkbench workbench;
	
	// State space resource.
	private Resource stateSpaceResource;
	
	// ResourceSet to be used.
	private ResourceSet resourceSet;
	
	// Initial set of rules to be used.
	private List<Rule> rules;
	
	/**
	 * Create a new wizard page instance.
	 * @param resourceSet Resource set.
	 * @param workbench the current workbench
	 * @param selection the current object selection
	 * @see CreateStateSpaceWizard#init(IWorkbench, IStructuredSelection)
	 */
	public CreateStateSpacePage(ResourceSet resourceSet, IWorkbench workbench, IStructuredSelection selection) {
		super("Create State Space", selection);
		this.workbench = workbench;
		this.resourceSet = resourceSet;
		this.rules = new ArrayList<Rule>();
		setTitle("Create Henshin State Space");
		setDescription("Select the file that will contain the Henshin state space.");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName("default." + StateSpaceResource.FILE_EXTENSION);
		setPageComplete(validatePage());
	}

	/**
	 * This method will be invoked, when the "Finish" button is pressed.
	 * @see CreateStateSpaceWizard#performFinish()
	 */
	protected boolean finish() {
		
		// create a new file, result != null if successful
		IFile newFile = createNewFile();

		// open newly created file in the editor
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		if (newFile != null && page != null) {
			try {
				IDE.openEditor(page, newFile, true);
			} catch (PartInitException e) {
				StateSpaceExplorerPlugin.getInstance().logError("Error opening exported file.", e);
				return false;
			}
		}
		return true;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		
		// Get the file path:
		final IPath containerPath = getContainerFullPath();
		IPath filePath = containerPath.append(getFileName());
		
		try {
			
			// Create the new state space:
			StateSpace stateSpace = StateSpaceFactory.eINSTANCE.createStateSpace();
			stateSpace.getRules().addAll(rules);
		
			// Save it:
			URI uri = URI.createPlatformResourceURI(filePath.toString(), false);
			stateSpaceResource = resourceSet.createResource(uri);
			stateSpaceResource.getContents().add(stateSpace);
			stateSpaceResource.save(null);

			// Refresh and load the created file:
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);
			file.refreshLocal(1, new NullProgressMonitor());
			return file.getContents();
			
		} catch (Throwable t) {
			MessageDialog.openError(getShell(), "Create new state space file", "Error creating file: " + t.getMessage());
			return null;
		}
		
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validatePage()
	 */
	protected boolean validatePage() {
		if (!super.validatePage()) return false; 
		String fileName = getFileName();
		if (fileName==null || !fileName.endsWith("." + StateSpaceResource.FILE_EXTENSION)) {
			setErrorMessage("The file name must end with " + StateSpaceResource.FILE_EXTENSION);
			return false;
		}
		return true;
	}

	public Resource getStateSpaceResource() {
		return stateSpaceResource;
	}

	public List<Rule> getRules() {
		return rules;
	}
	
}