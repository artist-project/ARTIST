/**
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 * Alexander Bergmayr - implementation
 * 
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mut.umlprofiler.ui.launch;

import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import eu.artist.migration.mut.umlprofiler.ui.util.J2PUMLLaunchUtil;

public class JavaProjectSelectionTab extends AbstractLaunchConfigurationTab {	
	
	/**
	 * Holds the name of the selected Java project
	 */
	private Text projectText;	
	
	/**
	 * Holds the selected Java project, which is the input for the discovery
	 */
	public IProject selectedJavaProject = null;

	/**
	 * Allows browsing the workspace  
	 */
	private Button browseWorkspaceButton;	
	
	/**
	 * Allows selecting the discoverer: UML Profile Discoverer or Profiled UML Model Discoverer
	 */
	protected Button[] discovererChoice = null;
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_VERTICAL));

		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 8;
		composite.setLayout(layout);

		createURIControl(composite);
		setControl(composite);
	}

	/**
	 * 
	 * @param parent
	 */
	public void createURIControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		{
			FormLayout layout = new FormLayout();
			layout.marginTop = 10;
			layout.spacing = 10;
			composite.setLayout(layout);
		}

		Label uriLabel = new Label(composite, SWT.LEFT);
		{
			FormData data = new FormData();
			data.left = new FormAttachment(0);
			uriLabel.setLayoutData(data);
		}
		uriLabel.setText("");

		Composite uriComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 5);
			data.left = new FormAttachment(0);
			data.right = new FormAttachment(100);
			uriComposite.setLayoutData(data);

			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = -5;
			layout.marginLeft = -5;
			layout.marginRight = -5;
			uriComposite.setLayout(layout);
		}

		Composite buttonComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 0, SWT.CENTER);
			data.left = new FormAttachment(uriLabel, 0);
			data.right = new FormAttachment(100);
			buttonComposite.setLayoutData(data);

			FormLayout layout = new FormLayout();
			layout.marginTop = 0;
			layout.marginBottom = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.spacing = 5;
			buttonComposite.setLayout(layout);
		}

		// allows us browsing the workspace and selecting a Java project
		browseWorkspaceButton = new Button(buttonComposite, SWT.PUSH);
		browseWorkspaceButton.setText(J2PUMLLaunchUtil.BROWSE_WORKSPACE_BUTTON_TEXT);
		browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				browseWorkspace();
			}
		});
		browseWorkspaceButton.setFocus();

		{
			FormData data = new FormData();
			data.right = new FormAttachment(100);
			browseWorkspaceButton.setLayoutData(data);
		}

		
		projectText = new Text(uriComposite, SWT.SINGLE | SWT.BORDER);
		projectText.setEditable(false);
		setProjectText("");
		if (projectText.getText().length() > 0) {
			projectText.selectAll();
		}	

		{
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL
					| GridData.GRAB_HORIZONTAL);
			if (uriComposite.getChildren().length == 1) {
				gridData.horizontalSpan = 2;
			}
			projectText.setLayoutData(gridData);
		}
		
		// the radio buttons for the discoverer selection
		discovererChoice = new Button[2];
		discovererChoice[0] = new Button(uriComposite, SWT.RADIO);
		// discovererChoice[0].setSelection(true);
		discovererChoice[0].setText(J2PUMLLaunchUtil.UML_PROFILE_DISCOVERY_SELECTTION_BUTTON_TEXT);
		discovererChoice[0].setLayoutData(new GridData(GridData.CENTER));
		discovererChoice[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		discovererChoice[1] = new Button(uriComposite, SWT.RADIO);
		discovererChoice[1].setText(J2PUMLLaunchUtil.PROFILED_UML_MODEL_DISCOVERY_SELECTION_BUTTON_TEXT);
		discovererChoice[1].setLayoutData(new GridData(GridData.CENTER));
		discovererChoice[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
	}
	
	/**
	 * 
	 * @return the selected discoverer: UML Profile Discoverer or Profiled UML Model Discoverer
	 */
	public String getSelectedDiscoverer() {
		if(this.discovererChoice[0].getSelection()) {
			return J2PUMLLaunchUtil.UML_PROFILE_DISCOVERY_SELECTION;
		}
		else if(this.discovererChoice[1].getSelection()) {
			return J2PUMLLaunchUtil.PROFILED_UML_MODEL_DISCOVERY_SELECTION;
		}
		else {
			return J2PUMLLaunchUtil.NO_DISCOVERY_SELECTION;
		}
	}

	/**
	 * 
	 * @param project
	 * @return if the project is a Java project
	 */
	public boolean isJavaProject(IProject project) {
		boolean isJavaProject = false;
		
		try {
			isJavaProject = project.getNature(J2PUMLLaunchUtil.JAVA_PROJECT_NATURE) != null;
		} catch (CoreException e) {
			// TODO: logging!
		}
		
		return isJavaProject;
	}
	
	private void browseWorkspace() {
		ViewerFilter extensionFilter = null;
		extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				// we are interested in Java projects only
				return (element instanceof IProject) && isJavaProject((IProject) element);  
			}
		};
		
		IContainer[] container = WorkspaceResourceDialog.openFolderSelection(getShell(),
				null, null, false, null, extensionFilter == null ? null
						: Collections.singletonList(extensionFilter));
		
		// the container should contain exactly one project
		this.selectedJavaProject = (IProject) container[0];
		setProjectText(this.selectedJavaProject.getName());
		updateLaunchConfigurationDialog();
	}

	private void setProjectText(String projectName) {
		projectText.setText(projectName);
	}	

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		if (!isProjectSelected()) {
			setErrorMessage(J2PUMLLaunchUtil.JAVA_PROJECT_TAB_ERROR_MESSAGE);
			return false;
		}
		else {
			setErrorMessage(null);
			setMessage(null);
			return super.isValid(launchConfig);
		}
	}
	
	/**
	 * 
	 * @return if a project has been selected
	 */
	public boolean isProjectSelected() {
		return selectedJavaProject != null;
	}	

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return J2PUMLLaunchUtil.JAVA_PROJECT_TAB_NAME;
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		
		try {
			IResource[] resources = configuration.getMappedResources();
			
			if(resources != null && resources.length == 1) {
				this.selectedJavaProject = (IProject) configuration.getMappedResources()[0];
				setProjectText(this.selectedJavaProject.getName());
				
				String discovererChoice = configuration.
						getAttribute(J2PUMLLaunchUtil.SELECTED_DISCOVERER, J2PUMLLaunchUtil.NO_DISCOVERY_SELECTION);
				
				System.out.println(discovererChoice);
				
				if(discovererChoice.equalsIgnoreCase(J2PUMLLaunchUtil.UML_PROFILE_DISCOVERY_SELECTION)) {
					this.discovererChoice[0].setSelection(true);
					this.discovererChoice[1].setSelection(false);
				}
				else if(discovererChoice.equalsIgnoreCase(J2PUMLLaunchUtil.PROFILED_UML_MODEL_DISCOVERY_SELECTION)) {
					this.discovererChoice[0].setSelection(false);
					this.discovererChoice[1].setSelection(true);
				}
				
				updateLaunchConfigurationDialog();
			}
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// System.out.println("Perform Apply ...");
		
		IResource[] resources = new IResource[1];
		resources[0] = this.selectedJavaProject;
		configuration.setMappedResources(resources);
		
		configuration.setAttribute(J2PUMLLaunchUtil.SELECTED_DISCOVERER, this.getSelectedDiscoverer());		
	}	

}
