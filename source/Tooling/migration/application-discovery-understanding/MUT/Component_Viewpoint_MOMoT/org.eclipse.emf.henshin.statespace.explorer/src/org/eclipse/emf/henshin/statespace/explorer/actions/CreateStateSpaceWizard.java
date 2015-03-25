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

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * State space file creation wizard.
 * @author Christian Krause
 */
public class CreateStateSpaceWizard extends Wizard implements INewWizard {
	
	// First page:
	private CreateStateSpacePage creationPage;
	
	// Second page:
	// private ImportRulesWizardPage rulesPage;
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(creationPage);
		// Rules page does not work yet here:
		// addPage(rulesPage);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		creationPage = new CreateStateSpacePage(new ResourceSetImpl(), workbench, selection); 
		// rulesPage = new ImportRulesWizardPage();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		return creationPage.finish();
	}
	
}
