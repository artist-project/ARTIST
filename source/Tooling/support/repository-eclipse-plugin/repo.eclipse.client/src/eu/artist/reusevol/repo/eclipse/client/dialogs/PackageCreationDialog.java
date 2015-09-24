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

import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import eu.artist.reusevol.repo.common.util.Id;
import eu.artist.reusevol.repo.eclipse.client.Activator;

public class PackageCreationDialog extends TitleAreaDialog {

	private static final String DIALOG_SETTINGS = ArtefactUploadDialog.class
			.getName();

	private String title;
	private String message;
	private IDialogSettings dialogSettings;

	private Text packageName;
	private String updatedPackageName;

	public PackageCreationDialog(Shell parentShell) {
		super(parentShell);

		this.title = "Create a new package";
		this.message = "Please enter the name of the new package. Only alphanumeric characters, '-', '.' and '_' are allowed";
		this.updatedPackageName = "";
		setShellStyle(SWT.DIALOG_TRIM);

		IDialogSettings pluginSettings = Activator.getDefault()
				.getDialogSettings();
		dialogSettings = pluginSettings.getSection(DIALOG_SETTINGS);
		if (dialogSettings == null) {
			dialogSettings = new DialogSettings(DIALOG_SETTINGS);
			pluginSettings.addSection(dialogSettings);
		}
	}

	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		setTitle(title);
		setMessage(message);
		return control;
	}

	protected Control createDialogArea(Composite parent) {
		Composite composite1 = (Composite) super.createDialogArea(parent);

		Composite composite = new Composite(composite1, SWT.NONE);
		GridData gd_composite = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd_composite.heightHint = 200;
		composite.setLayoutData(gd_composite);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginTop = 7;
		gridLayout.marginWidth = 12;
		composite.setLayout(gridLayout);

		Label lblEnterPackageName = new Label(composite, SWT.NONE);

		lblEnterPackageName.setText("Enter the package name:");
		lblEnterPackageName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));

		packageName = new Text(composite, SWT.BORDER);
		packageName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		packageName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				update();
			}
		});
		packageName.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				packageName.clearSelection();
			}
		});

		return composite;
	}

	void update() {
		boolean isValid = true;
		try {
			Id.of(packageName.getText());
			isValid = true;
		} catch (IllegalArgumentException ex) {
			isValid = false;
		}
		getButton(IDialogConstants.OK_ID).setEnabled(isValid);
	}

	protected void okPressed() {
		updatedPackageName = packageName.getText();
		super.okPressed();
	}

	public String getpackageName() {
		return updatedPackageName;
	}
}
