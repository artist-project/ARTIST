/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
package eu.artist.migration.deployment.dialog;

import java.util.EnumSet;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import eu.artist.migration.deployment.targets.Target;

/**
 * This dialog prompts the user to select from the available Cloud deployment tools
 * and launch the deployment generator
 * @author Jesús Gorroñogoitia
 *
 */
public class DeploymentDialog extends TitleAreaDialog {

	private ListViewer lvDeployer;
	private IFile inputModel;
	private EnumSet<Target> selectedTargets = EnumSet
			.noneOf(Target.class);
	private IProject currentProject;
	private Path targetPath;
	private Label lbTargetProject;
	
	/**
	 * Default constructor
	 * @param parentShell Eclipse shell that display the dialog
	 */
	public DeploymentDialog(Shell parentShell, IProject currentProject) {
		super(parentShell);
		this.currentProject = currentProject;
	}

	@Override
	/**
	 * This superclass method has been override to set the title, message and disable the OK button
	 * upon the dialog pops up.
	 */
	public void create() {
		super.create();
		setTitle("Deployment Tool");
		setMessage("Cloud targets for selected deployment model:\n "
				+ inputModel.getName(), IMessageProvider.INFORMATION);
		//Disabling OK button by default
		enableOKButton(false);
	}

	private void enableOKButton(boolean enable) {
		getButton(IDialogConstants.OK_ID).setEnabled(enable);
	}

	@Override
	/**
	 * This method designs and renders the dialog visual controls.
	 */
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(2, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		createCloudTargetSelector(container);
		createSelectTargetProjectButton(container);
		
		
		return area;
	}
	
	/**
	 * This method renders the widget for selecting the target project 
	 * where to place the generated deployment descriptors
	 * @param container Composite where placing these widgets
	 */
	private void createSelectTargetProjectButton(Composite container) {
		
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Select target proyect:");

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = false;
		gridData.horizontalAlignment = GridData.BEGINNING;

		Button btSelectProject = new Button(container, SWT.PUSH);
		btSelectProject.setText("Browse");
		btSelectProject.setLayoutData(gridData);

		btSelectProject
			.addSelectionListener(new ProjectTargetSelectionAdapter(this) {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ContainerSelectionDialog dialog = new ContainerSelectionDialog(
						this.rootDialog.getShell(), currentProject, false, 
						"Select a target project where to place generated descriptors");
					
					int dialogRespose = dialog.open();
					if (dialogRespose == Window.OK){
						if (dialog.getResult().length >0){
							Path targetPath = (Path)dialog.getResult()[0];
							this.rootDialog.setTargetPath(targetPath);
							lbTargetProject.setText(targetPath.toOSString());
						}
					}else{
						this.rootDialog.setTargetPath(null);
						lbTargetProject.setText("");
					}
					
					validate();
				}
			});

		lbTargetProject = new Label(container, SWT.BORDER);
		lbTargetProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
	}


	

	/**
	 * This method renders the widgets for selecting available Cloud target deployment generators.
	 * @param container Composite where placing these widgets
	 */
	private void createCloudTargetSelector(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("Select deployment target:");

		lvDeployer = new ListViewer(container);
		lvDeployer.setContentProvider(ArrayContentProvider.getInstance());
		lvDeployer.setLabelProvider (
			new LabelProvider() {
				  @Override
				  public String getText(Object element) {
				    if (element instanceof Target) {
				    	Target generator = (Target) element;
				      return generator.getLabel();
				    }
				    return super.getText(element);
				  }
			}
		);

		Target cmTypes[] = Target.values();
		lvDeployer.setInput(cmTypes);
		
		lvDeployer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				selectedTargets.clear();
				Iterator abstractors = selection.iterator();
				while (abstractors.hasNext()){
					Target abstractor = (Target) abstractors.next();
					selectedTargets.add (abstractor);
				}
				validate();
			}
		});
	}

	/**
	 * This method validates whether or not the dialog form has been completely fulfilled 
	 * and OK button can be enabled.
	 */
	protected void validate() {
		boolean enable = true;
		
		if (getSelectedTargets().isEmpty()){
			enable = false;
		}
		
		enableOKButton(enable);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	/**
	 * This method enables this dialog caller to pass the input class model 
	 * for which a set of component models should be generated
	 * @param model Input class model selected by the user in the workspace
	 */
	public void setInputModel(IFile model) {
		this.inputModel = model;
	}
	
	
	/**
	 * It returns the collection of selected Cloud target deployers
	 * @return Collection of selected Cloud target deployer
	 */
	public EnumSet<Target> getSelectedTargets() {
		return this.selectedTargets;
	}
	
	protected void setTargetPath(Path path) {
		this.targetPath = path;
		
	}
	
	public Path getTargetPath (){
		return this.targetPath;
	}

	/**
	 * Helper class to pass the root dialog to the SelectionAdapter to those listeners that require it.
	 * @author Jesús Gorroñogoitia
	 *
	 */
	class ProjectTargetSelectionAdapter extends SelectionAdapter {
		DeploymentDialog rootDialog;

		public ProjectTargetSelectionAdapter(DeploymentDialog rootDialog) {
			this.rootDialog = rootDialog;
		}
	}

	
}