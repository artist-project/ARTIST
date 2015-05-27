/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.dialogs;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.Activator;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;

public class UploadTargetSelectionDialog extends ElementTreeSelectionDialog {

	public static final int OPEN = 9999;

	private LocalRepositoryModel model = LocalRepositoryModel.getInstance();
	private Button addPackageButton;
	private Button addArtefactButton;

	public UploadTargetSelectionDialog(Shell parent, ILabelProvider labelProvider,
			ITreeContentProvider contentProvider, TreeViewer tree) {
		super(parent, labelProvider, contentProvider);
	}

	protected void inputChanged(Object input, Object oldInput) {
		if (input != null)
			this.model = (LocalRepositoryModel) input;
	}

	public Object[] getElements(Object inputElement) {
		return model.getServers().values().toArray();
	}

	public void createButtonsForButtonBar(Composite parent) {

		// Create Open button
		final TreeViewer viewer = getTreeViewer();
		addPackageButton = createButton(parent, OPEN, "Add Package", true);
		addPackageButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object selectedObject = getFirstResult();

				if (selectedObject instanceof RepoProject) {
					RepoProject selectedProject = (RepoProject) selectedObject;

					PackageCreationDialog packageDialog = new PackageCreationDialog(
							getShell());
					packageDialog.open();

					String newPackageName = packageDialog.getpackageName();

					// Object oldInput = viewer.getInput();

					if (!packageExists(selectedProject, newPackageName)) {
						RepoPackage newPackage = new RepoPackage(newPackageName, newPackageName);
						selectedProject.getPackages().add(newPackage);
					}

					// inputChanged(oldInput, viewer.getInput());

					viewer.collapseAll();
					viewer.expandAll();
				}
			}

		});

		addArtefactButton = createButton(parent, IDialogConstants.OK_ID,
				"Add Artefact", false);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);

		setValidator(new ISelectionStatusValidator() {
			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length < 1) {
					addPackageButton.setEnabled(false);
					addArtefactButton.setEnabled(false);
					return new Status(IStatus.OK, Activator.PLUGIN_ID,
							"Please make a selection.");
				} else if (selection.length == 1) {
					if (selection[0] instanceof RepoPackage) {
						addPackageButton.setEnabled(false);
						addArtefactButton.setEnabled(true);
						return new Status(IStatus.OK, Activator.PLUGIN_ID,
								"Package selected.");
					} else if (selection[0] instanceof RepoProject) {
						addPackageButton.setEnabled(true);
						addArtefactButton.setEnabled(false);
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Please select or create a package.");
					} else {
						addPackageButton.setEnabled(false);
						addArtefactButton.setEnabled(false);
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Please select a package.");
					}
				} else {
					return new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Please select only one package.");
				}
			}
		});
	}

	private boolean packageExists(RepoProject selectedProject,
			String newPackageName) {
		for (RepoPackage pkg : selectedProject.getPackages()) {
			if (pkg.getId().equals(newPackageName)) {
				return true;
			}
		}
		return false;
	}
}
