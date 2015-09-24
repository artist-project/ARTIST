package eu.artist.reusevol.repo.eclipse.client.dialogs;

/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
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

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Strings;

import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

public class CategoryCreationDialog extends TitleAreaDialog {

	private static final String REJECTION_PATTERN = "[^a-z0-9_\\-]";

	private final Collection<RepoServer> servers;
	private String serverName;
	private String name;
	private String label;
	private String description;

	private Combo serverDropDown;
	private Text nameInput;
	private Text labelInput;
	private Text descriptionInput;

	public CategoryCreationDialog(Shell shell, Collection<RepoServer> servers) {
		super(shell);
		this.servers = servers;
		setShellStyle(SWT.DIALOG_TRIM);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Create Category");
		setMessage("Please provide the server on which the category shall be created as well as the logical name, optional label and description.");
		getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);

		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(createContainerGridData());
		container.setLayout(createContainerLayout());

		serverDropDown = createServerDropDown(container, "Server", servers);
		nameInput = createLabeledInputField(container, "Category Name", "",
				true);
		nameInput.setFocus();
		labelInput = createLabeledInputField(container, "Category Label", "",
				true);
		descriptionInput = createLabeledInputField(container, "Description",
				"", true);

		updateDialogState();

		return container;
	}

	private Combo createServerDropDown(Composite container, String labelText,
			Collection<RepoServer> servers2) {
		Label label = new Label(container, SWT.NONE);
		label.setText(labelText);

		Combo dropDown = new Combo(container, SWT.DROP_DOWN | SWT.BORDER);
		for (RepoServer server : servers) {
			dropDown.add(server.getName());
		}
		dropDown.select(0);

		return dropDown;
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
		serverName = serverDropDown.getText();
		name = nameInput.getText();
		label = labelInput.getText();
		description = descriptionInput.getText();
	}

	private void updateDialogState() {
		if (isValid()) {
			setErrorMessage(null);
		} else {
			setErrorMessage("Category names can consist only of alphanumeric characters, '-' and '_'.");
		}
	}

	private boolean isValid() {
		return !nameInput.getText().isEmpty() && isNameValid();
	}

	private boolean isNameValid() {
		String name = nameInput.getText();

		if (Strings.isNullOrEmpty(name))
			return false;

		Pattern allowedPattern = Pattern.compile(REJECTION_PATTERN,
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = allowedPattern.matcher(name);
		boolean illegalCharFound = matcher.find();
		return !illegalCharFound;
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

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

}
