/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import eu.artist.premigration.tft.tft.model.query.ComponentModelQuery;

/**
 * A custom dialog providing the user an interface to modify the migration strategies assigned to a certain component
 * 
 * @author Burak Karaboga
 *
 */
public class ModelSourceSelectionDialog extends TitleAreaDialog{

	final List<String> selectedFolders = new ArrayList<String>();


	private ListViewer viewer;

	/**
	 * Constructor for the Migration Strategy Selection Dialog
	 * <br>
	 * @param parentShell Parent of the dialog
	 * @param selectedComponent The component for which the migration strategy selection will be made.
	 */
	public ModelSourceSelectionDialog (Shell parentShell) {
		super(parentShell);

	}

	@Override
	public void create() {
		super.create();

		setTitle("Source Path Selection");
		setMessage("Please select the source path(s) for the selected component model.", IMessageProvider.INFORMATION);
	}
	/**
	 * Creates the dialog area 
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout = new GridLayout(1, false);
		container.setLayout(layout);

		viewer = new ListViewer(container, SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.getList().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		final StringBuilder latestSelection = new StringBuilder("");

		Button fileSelectionButton = new Button(container, SWT.NONE);
		fileSelectionButton.setText("Add source path");
		fileSelectionButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				DirectoryDialog dirDialog = new DirectoryDialog(new Shell(), SWT.MULTI);
				dirDialog.setText("Please select the source folder.");
				if (!"".equals(latestSelection.toString())){
					dirDialog.setFilterPath(latestSelection.toString());
				}
				String selectionString = dirDialog.open();
				selectionString = selectionString.replace("\\", "/");
				selectionString = selectionString + "/";
				if (!selectedFolders.contains(selectionString)){
					selectedFolders.add(selectionString);
					latestSelection.replace(0, latestSelection.length(), selectionString);
					viewer.add(selectionString);
				}
			}
		});
		return container;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(700, 500);
	}

	private void saveInput(){
		ComponentModelQuery.INSTANCE.sourceFolderPaths.addAll(selectedFolders);
	}

	public List<String> getSelectedFolders() {
		return selectedFolders;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	//Overridden to set dialog title
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Source Path Selections");
	}
}
