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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import eu.artist.premigration.tft.tft.model.ProgrammingLanguage;
import eu.artist.premigration.tft.tft.views.InventoryView;

/**
 * A custom dialog providing the user an interface to modify the migration strategies assigned to a certain component
 * 
 * @author Burak Karaboga
 *
 */
public class ModelSourceSelectionDialog extends TitleAreaDialog{

	final List<String> selectedFolders = new ArrayList<String>();

	public static ProgrammingLanguage programmingLanguage;

	private ListViewer viewer;

	/**
	 * Constructor for the Migration Strategy Selection Dialog
	 * <br>
	 * @param parentShell Parent of the dialog
	 * @param selectedComponent The component for which the migration strategy selection will be made.
	 */
	public ModelSourceSelectionDialog (Shell parentShell) {
		super(parentShell);
		initializeDialogData();
	}
	
	private void initializeDialogData(){
		//Removing previously selected programming language.
		programmingLanguage = null;
		//Loading previously saved source folder paths.
		selectedFolders.addAll(InventoryView.sourceFolderPaths);
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
		
		final Composite buttonsContainer = new Composite(container, SWT.NONE);
		buttonsContainer.setLayout(new RowLayout());
		
		final StringBuilder latestSelection = new StringBuilder("");

		Button addPathButton = new Button(buttonsContainer, SWT.NONE);
		addPathButton.setText("Add source path");
		
		final Button removePathButton = new Button(buttonsContainer, SWT.NONE);
		removePathButton.setText("Remove source path");
		removePathButton.setEnabled(false);
		
		final Button clearPathsButton = new Button(buttonsContainer, SWT.NONE);
		clearPathsButton.setText("Clear source paths");
		if (selectedFolders.size() <= 0){
			clearPathsButton.setEnabled(false);
		}
		
		addPathButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				DirectoryDialog dirDialog = new DirectoryDialog(new Shell(), SWT.MULTI);
				dirDialog.setText("Please select the source folder.");
				if (!"".equals(latestSelection.toString())){
					dirDialog.setFilterPath(latestSelection.toString());
				}
				String selectionString = dirDialog.open();
				//If cancel has been pressed
				if (selectionString != null){
					selectionString = selectionString.replace("\\", "/");
					selectionString = selectionString + "/";
					if (!selectedFolders.contains(selectionString)){
						selectedFolders.add(selectionString);
						latestSelection.replace(0, latestSelection.length(), selectionString);
						viewer.add(selectionString);
					}
					
					if (!clearPathsButton.isEnabled()){
						clearPathsButton.setEnabled(true);
					}
				}
			}
		});
		
		removePathButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				//User's selection
				IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				//Removing the selection from the list
				String selectedPath = (String) selection.getFirstElement();
				selectedFolders.remove(selectedPath);
				if (selectedFolders.size() <= 0) {
					clearPathsButton.setEnabled(false);
				}
				viewer.refresh();
			}
		});
		
		clearPathsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				selectedFolders.clear();
				clearPathsButton.setEnabled(false);
				viewer.refresh();
			}
		});
		
		
		//Selection changed listener for the source path list
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection)event.getSelection();
				if (!selection.isEmpty() && selection.getFirstElement() instanceof String){
					//Remove path button is enabled
					removePathButton.setEnabled(true);
				}
				else {
					//If there is no selection or the selected item is not a strategy (may be a category) the add button is disabled.
					removePathButton.setEnabled(false);
				}
			}
		});
		
		final Composite languageSelectionContainer = new Composite(container, SWT.NONE);
		languageSelectionContainer.setLayout(new RowLayout());
		
		Label label = new Label(languageSelectionContainer, SWT.NULL);
	    label.setText("Programming Language: ");
	    
	    final Button javaButton = new Button(languageSelectionContainer, SWT.RADIO);
	    javaButton.setText("Java");
	    
	    javaButton.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		super.widgetSelected(e);
	    		if (javaButton.getSelection()){
	    			programmingLanguage = ProgrammingLanguage.JAVA;
	    		}
	    	}
		});
	    
	    final Button cSharpButton = new Button(languageSelectionContainer, SWT.RADIO);
	    cSharpButton.setText("C#");
	    
	    cSharpButton.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    		super.widgetSelected(e);
	    		if (cSharpButton.getSelection()){
		    		programmingLanguage = ProgrammingLanguage.CSHARP;
	    		}
	    	}
		});
	    
	    viewer.setInput(selectedFolders);
	    
		return container;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(700, 500);
	}

	private void saveInput(){
		InventoryView.sourceFolderPaths.clear();
		InventoryView.sourceFolderPaths.addAll(selectedFolders);
	}

	public List<String> getSelectedFolders() {
		return selectedFolders;
	}

	@Override
	protected void okPressed() {
		
		boolean userWarned = false;
		
		if (selectedFolders == null || selectedFolders.size() <= 0) {
			MessageDialog.openWarning(this.getShell(), "No source path added", "Please add the source path(s) corresponding to the component model to continue.");
			userWarned = true;
		}
		if (programmingLanguage == null){
			MessageDialog.openWarning(this.getShell(), "Programming Language not selected", "Please select the source programming language to continue.");
			userWarned = true;
		}
		if (!userWarned) {
			saveInput();
			super.okPressed();
		}
	}

	//Overridden to set dialog title
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Source Path Selections");
	}
}
