package eu.artist.reusevol.repo.eclipse.client.dialogs;

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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.util.Id;
import eu.artist.reusevol.repo.eclipse.client.provider.CategoryTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

public class ArtefactUploadDialog extends TitleAreaDialog {

	Combo repoLocationCombo;

	private String initialProjectName;
	private String initialPackageName;
	private String initialFileName;

	private String artefactLabel;
	private String artefactDescription;
	private String artefactName;

	private Text artefactLabelInput;
	private Text artefactDescriptionInput;
	private Text artefactNameInput;
	private List<RepoCategory> categoryList;
	private Shell parentShell;

	public ArtefactUploadDialog(Shell shell, String selectedPackage,
			String selectedProject, String filename) {
		super(shell);
		setShellStyle(SWT.DIALOG_TRIM);

		categoryList = new ArrayList<RepoCategory>();

		parentShell = shell;

		initialProjectName = (selectedProject != null) ? selectedProject : "";
		initialPackageName = (selectedPackage != null) ? selectedPackage : "";
		initialFileName = (filename != null) ? filename : "";
	}

	@Override
	public void create() {
		super.create();
		setTitle("Artefact upload");
		setMessage("Please provide the necessary information for uploading the artefact.");
		getButton(IDialogConstants.OK_ID).setEnabled(isValid());
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);

		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(createContainerGridData());
		container.setLayout(createContainerLayout());

		createLabeledInputField(container, "Project Name", initialProjectName,
				false);
		createLabeledInputField(container, "Package Name", initialPackageName,
				false);
		artefactNameInput = createLabeledInputField(container, "Artefact Name",
				initialFileName, true);
		artefactNameInput.setFocus();
		artefactLabelInput = createLabeledInputField(container,
				"Artefact Label", initialFileName, true);
		artefactDescriptionInput = createLabeledInputField(container,
				"Description", "", true);

		// Category selection
		Button selectCategoryButton = new Button(container, SWT.NONE);
		selectCategoryButton.setText("Select Categories");
		selectCategoryButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CategorySelectionDialog selectionDialogs = new CategorySelectionDialog(
						parentShell, new TreeLabelProvider(),
						new CategoryTreeContentProvider());

				selectionDialogs.open();
				Object[] results = selectionDialogs.getResult();

				categoryList.clear();
				if ((results != null) && (results.length > 0)) {
					for (Object cat : results) {
						if (cat instanceof RepoCategory) {
							categoryList.add((RepoCategory) cat);
						}
					}
				}
			}
		});

		updateDialogState();

		return container;
	}

	private Text createLabeledInputField(Composite container, String labelText,
			String initialValue, boolean editable) {
		Label label = new Label(container, SWT.NONE);
		label.setText(labelText);

		Text input = new Text(container, SWT.BORDER);
		input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		input.setText(initialValue);
		input.setEditable(editable);
		input.addModifyListener(modifyListener);
		return input;
	}

	private GridLayout createContainerLayout() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginTop = 7;
		gridLayout.marginWidth = 12;
		gridLayout.numColumns = 2;
		return gridLayout;
	}

	private GridData createContainerGridData() {
		GridData gdContainer = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gdContainer.heightHint = 200;
		return gdContainer;
	}

	@Override
	public void setErrorMessage(String message) {
		Button okButton = getButton(IDialogConstants.OK_ID);
		if (okButton != null)
			okButton.setEnabled(message == null);
		super.setErrorMessage(message);
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	private void saveInput() {
		artefactName = artefactNameInput.getText();
		artefactLabel = artefactLabelInput.getText();
		artefactDescription = artefactDescriptionInput.getText();
	}

	private void updateDialogState() {
		if (isValid()) {
			setErrorMessage(null);
			// getButton(IDialogConstants.OK_ID).setEnabled(true);
		} else {
			setErrorMessage("Artefact names can consist only of alphanumeric characters, '.', '-' and '_'.");
			// getButton(IDialogConstants.OK_ID).setEnabled(false);
		}
	}

	private boolean isValid() {
		try {
			String id = artefactNameInput.getText();
			Id.of(id);
			return true;
		} catch (IllegalArgumentException ex) {
			return false;
		}
	}

	private ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(final ModifyEvent e) {
			updateDialogState();
		}
	};

	/**
	 * @return the artefactLabel
	 */
	public String getArtefactLabel() {
		return artefactLabel;
	}

	/**
	 * @return the artefactDescription
	 */
	public String getArtefactDescription() {
		return artefactDescription;
	}

	/**
	 * @return the artefactName
	 */
	public String getArtefactName() {
		return artefactName;
	}

	/**
	 * @return the categoryList
	 */
	public List<RepoCategory> getCategoryList() {
		return categoryList;
	}
}
