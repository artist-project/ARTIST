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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import eu.artist.reusevol.repo.common.util.Id;

public class ProjectCreationDialog extends TitleAreaDialog {

	private String name;
	private String label;
	private String description;

	private Text nameInput;
	private Text labelInput;
	private Text descriptionInput;

	public ProjectCreationDialog(Shell shell) {
		super(shell);
		setShellStyle(SWT.DIALOG_TRIM);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Create Project");
		setMessage("Please provide the logical name of the project as well as an optional label and description.");
		getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);

		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(createContainerGridData());
		container.setLayout(createContainerLayout());

		nameInput = createLabeledInputField(container, "Project Name", "", true);
		nameInput.setFocus();
		labelInput = createLabeledInputField(container, "Project Label", "",
				true);
		descriptionInput = createLabeledInputField(container, "Description",
				"", true);

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
		name = nameInput.getText();
		label = labelInput.getText();
		description = descriptionInput.getText();
	}

	private void updateDialogState() {
		if (isValid()) {
			setErrorMessage(null);
		} else {
			setErrorMessage("Project names can consist only of alphanumeric characters, '.', '-' and '_'.");
		}
	}

	private boolean isValid() {
		return !nameInput.getText().isEmpty() && isNameValid();
	}

	private boolean isNameValid() {
		try {
			String id = nameInput.getText();
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
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
