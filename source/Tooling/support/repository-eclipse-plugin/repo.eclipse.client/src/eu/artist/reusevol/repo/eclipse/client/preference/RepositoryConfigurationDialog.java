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
package eu.artist.reusevol.repo.eclipse.client.preference;

import java.net.MalformedURLException;
import java.net.URL;

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

import com.google.common.base.Strings;

public class RepositoryConfigurationDialog extends TitleAreaDialog {

	private static final String WINDOW_TITLE = "ARTIST Repository Preferences";
	private static final String DIALOG_TITLE = "Create or edit an ARTIST repository configuration";
	
	private RepositoryConfigurationEntry configuration;
	
	private Text txtUsername;
	private Text txtPassword;
	private Text txtRepoName;
	private Text txtRepoURL;
	private Text txtClientId;
	private Text txtClientSecret;
	private Button cbxSavePassword;

	protected RepositoryConfigurationDialog(Shell shell,
			RepositoryConfigurationEntry configuration) {
		super(shell);
		
		if (configuration == null) {
			this.configuration = new RepositoryConfigurationEntry("", "");
		} else {
			this.configuration = configuration;
		}

		setShellStyle(SWT.DIALOG_TRIM);
	}

	public RepositoryConfigurationEntry getConfiguration() {
		return configuration;
	}
	
	public boolean savePassword() {
		return cbxSavePassword.getSelection();
	}
	
	/**
	 * Sets the window title.
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(WINDOW_TITLE);
	}

	/**
	 * Initializes the component and sets the dialog title.
	 */
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		
		setTitle(DIALOG_TITLE);
		setMessage("");
		getButton(IDialogConstants.OK_ID).setEnabled(false);
		
		return control;
	}

	/**
	 * Creates the dialog layout and registers listeners. 
	 */
	@Override
	protected Control createDialogArea(Composite parent) {

		String defaultName = (configuration != null) ? configuration.getName()
				: "";
		String defaultUrl = (configuration != null) ? configuration.getUrl()
				: "";
		String defaultUsername = (configuration != null) ? configuration.getUsername()
				: "";
		String defaultPassword = (configuration != null) ? configuration.getPassword()
				: "";
		String defaultClientId = (configuration != null) ? configuration.getOAuth2ClientId()
				: "";
		String defaultClientSecret = (configuration != null) ? configuration.getOAuth2ClientSecret()
				: "";

		ModifyListener modifyListener = new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				update();
			}
		};

		Composite dialogArea = (Composite) super.createDialogArea(parent);
		Composite contentArea = new Composite(dialogArea, SWT.NONE);
		GridData gd_composite = new GridData(SWT.FILL, SWT.TOP, true, false);
		// gd_composite.heightHint = 151;
		contentArea.setLayoutData(gd_composite);
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginTop = 7;
		gridLayout.marginWidth = 12;
		gridLayout.numColumns = 2;
		contentArea.setLayout(gridLayout);

		txtRepoName = createTextInput(contentArea, "Name", defaultName, modifyListener, false);
		txtRepoURL = createTextInput(contentArea, "Repository URL", defaultUrl, modifyListener, false);
		txtClientId = createTextInput(contentArea, "OAuth2 Client Id", defaultClientId, modifyListener, false);
		txtClientSecret = createTextInput(contentArea, "OAuth2 Client Secret", defaultClientSecret, modifyListener, true);
		txtUsername = createTextInput(contentArea, "Username", defaultUsername, modifyListener, false);
		txtPassword = createTextInput(contentArea, "Password", defaultPassword, modifyListener, true);

		new Label(contentArea, SWT.NONE);
		
		cbxSavePassword = new Button(contentArea, SWT.CHECK);
		cbxSavePassword.setText("Save Password");
		cbxSavePassword.setSelection(configuration.isSavePassowrd());
		
		return contentArea;
	}

	private Text createTextInput(Composite contentArea, String labelText,
			String value, ModifyListener modifyListener, boolean isPassword) {
		
		GridData labelLayout = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		labelLayout.widthHint = 117;
		Label label = new Label(contentArea, SWT.NONE);
		label.setLayoutData(labelLayout);
		label.setText(labelText);

		GridData textLayout = (isPassword) ? labelLayout : 
			new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		int properties = (isPassword) ? SWT.BORDER | SWT.PASSWORD : SWT.BORDER;
		Text textInput = new Text(contentArea, properties);
		textInput.setLayoutData(textLayout);
		
		if (value != null) {
			textInput.setText(value);
		}
		
		if (modifyListener != null) {
			textInput.addModifyListener(modifyListener);
		}

		return textInput;
	}

	protected void okPressed() {
		String reponame = txtRepoName.getText().trim();
		String location = txtRepoURL.getText().trim();
		String username = txtUsername.getText().trim();
		String password = txtPassword.getText().trim();
		boolean savePassword = cbxSavePassword.getSelection();
		String clientId = txtClientId.getText().trim();
		String clientSecret = txtClientSecret.getText().trim();
		
		// Validate fields
		try {
			new URL(location);
		} catch (MalformedURLException e) {
			setErrorMessage("Repository url is not a valid URL.");
		}
		
		// Update configuration
		configuration = new RepositoryConfigurationEntry(reponame, location,
				username, password);
		configuration.setSavePassowrd(savePassword);
		configuration.setOAuth2ClientId(clientId);
		configuration.setOAuth2ClientSecret(clientSecret);
		
		super.okPressed();
	}

	private void update() {
		setErrorMessage(null);
		getButton(IDialogConstants.OK_ID).setEnabled(isComplete());
	}

	private boolean isComplete() {
		boolean valid = true;
		valid = valid && !Strings.isNullOrEmpty(txtRepoName.getText());
		valid = valid && !Strings.isNullOrEmpty(txtRepoURL.getText());
		valid = valid && !Strings.isNullOrEmpty(txtUsername.getText());
		valid = valid && !Strings.isNullOrEmpty(txtPassword.getText());
		valid = valid && !Strings.isNullOrEmpty(txtClientId.getText());
		valid = valid && !Strings.isNullOrEmpty(txtClientSecret.getText());
		return valid;
	}
}
