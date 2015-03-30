/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fumldebug.ui.commons.provider.ActivityContentProvider;

import eu.artist.postmigration.nfrvt.strategy.fumlsimulation.FUMLSimulationActivator;

public abstract class UMLModelSelectionTab extends AbstractLaunchConfigurationTab {

	private static final String UML = "uml";
	private static final String PLATFORM_RESOURCE = "platform:/resource";

	protected Button browseWorkspaceButton;
	protected Text uriText;
	protected Button loadButton;
	private Label selectedModelElementLabel;
	private TreeViewer modelTreeViewer;

	private ResourceSet resourceSet;
	private Resource umlResource;	
	private EObject selectedModelElement;
	
	private List<EObject> selectableModelElements;

	private boolean restoringModelResource = false;
	
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

	protected void createURIControl(Composite parent) {
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

		browseWorkspaceButton = new Button(buttonComposite, SWT.PUSH);
		browseWorkspaceButton.setText("Browse Workspace");
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

		uriText = new Text(uriComposite, SWT.SINGLE | SWT.BORDER);
		uriText.setEditable(false);
		setURIText("");
		if (uriText.getText().length() > 0) {
			uriText.selectAll();
		}
		uriText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				uriTextModified(uriText.getText().trim());
			}
		});

		loadButton = new Button(uriComposite, SWT.PUSH);
		loadButton.setText("Load");
		loadButton.setLayoutData(new GridData(GridData.END));
		loadButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loadModel();
			}
		});

		{
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL
					| GridData.GRAB_HORIZONTAL);
			if (uriComposite.getChildren().length == 1) {
				gridData.horizontalSpan = 2;
			}
			uriText.setLayoutData(gridData);
		}

		selectedModelElementLabel = new Label(parent, SWT.LEFT);
		selectedModelElementLabel.setText(getModelElementLabelText());
		selectedModelElementLabel.setVisible(false);
		modelTreeViewer = new TreeViewer(parent);
		GridData treeLayoutData = new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL);
		treeLayoutData.heightHint = 400;
		modelTreeViewer.getTree().setLayoutData(treeLayoutData);
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		modelTreeViewer.setContentProvider(new ActivityContentProvider(true));
		modelTreeViewer.setLabelProvider(new ActivityLabelProvider());
		modelTreeViewer.getTree().setEnabled(false);
		modelTreeViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						String text = uriText.getText();
						loadButton.setEnabled(text != null
								&& text.trim().length() > 0);
						selectedModelElement = loadModelElementFromSelection(event.getSelection());
						if(!restoringModelResource) {
							updateLaunchConfigurationDialog();
						}
					}
				});
	}
	
	abstract protected String getModelElementLabelText();

	abstract protected EObject loadModelElementFromSelection(ISelection selection);	

	private void uriTextModified(String text) {
		setErrorMessage(null);
		setMessage(null);
	}

	private boolean browseWorkspace() {
		ViewerFilter extensionFilter = null;
		extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof IFile)
						|| UML.equals(((IFile) element).getFileExtension());
			}
		};

		IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(),
				null, null, false, null, extensionFilter == null ? null
						: Collections.singletonList(extensionFilter));
		if (files.length > 0) {
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < files.length; ++i) {
				text.append(URI.createPlatformResourceURI(files[i]
						.getFullPath().toString(), true));
				text.append("  ");
			}
			setURIText(URI.decode(text.toString()));
			return true;
		}
		return false;
	}

	private void setURIText(String uri) {
		uri = uri.trim();
		StringBuffer text = new StringBuffer(uriText.getText());
		if (!uri.equals(text)) {
			uriText.setText(uri.trim());
		}
	}

	private boolean loadModel() {
		if (uriText.getText().startsWith("platform:/")) {
			resourceSet = new ResourceSetImpl();
			umlResource = resourceSet.getResource(URI.createPlatformResourceURI(
					uriText.getText().replace(PLATFORM_RESOURCE, ""), true),
					true);
			selectableModelElements = obtainSelectableModelElements(umlResource);
		}
		updateEClassTreeViewer();
		return haveModel();
	}

	abstract protected List<EObject> obtainSelectableModelElements(Resource umlResource);	
	
	private void updateEClassTreeViewer() {
		if (haveModel()) {
			modelTreeViewer.getTree().setEnabled(true);			
			modelTreeViewer.setInput(selectableModelElements.toArray());
			modelTreeViewer.refresh(true);
			modelTreeViewer.getTree().setVisible(true);
			selectedModelElementLabel.setVisible(true);
		} else {
			modelTreeViewer.getTree().setEnabled(false);
			modelTreeViewer.getTree().setVisible(false);
			selectedModelElementLabel.setVisible(false);
		}
	}	

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		if (!haveModel()) {
			setErrorMessage("Select a umlPackage resource.");
			return false;
		} else if (!isModelElementSelected()) {
			setErrorMessage(getModelElementLabelText());
			return false;
		} else {
			setErrorMessage(null);
			setMessage(null);
			return super.isValid(launchConfig);
		}
	}
	
	private boolean haveModel() {
		return umlResource != null;
	}

	private boolean isModelElementSelected() {
		return selectedModelElement != null;
	}	

	@Override
	public String getName() {
		return "Model Resource";
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		restoringModelResource = true;
		
		String modelResource = "";
		try {
			modelResource = configuration.getAttribute(
					FUMLSimulationActivator.ATT_MODEL_PATH, "");
		} catch (CoreException e) {
		}

		uriText.setText(modelResource);
		
		boolean loaded = loadModel();
		restoringModelResource = false;
		if (loaded) {
			selectedModelElement = initializeSelectedModelElement(configuration);			
		}
		if (selectedModelElement != null) {
			ISelection selection = new StructuredSelection(selectedModelElement);
			modelTreeViewer.setSelection(selection);
		}
		updateLaunchConfigurationDialog();
	}

	abstract protected NamedElement initializeSelectedModelElement(
			ILaunchConfiguration configuration);
	
	public List<EObject> getSelectableModelElements() {
		return selectableModelElements;
	}
	
	public EObject getSelectedModelElement() {
		return selectedModelElement;
	}

}
