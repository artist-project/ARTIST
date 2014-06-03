/*
 * Copyright (c) 2013, 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package eu.artist.postmigration.nfrvt.eval.run.ui.launch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

import eu.artist.postmigration.nfrvt.eval.run.Activator;
import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.util.GelAdapterFactory;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.util.GmlAdapterFactory;

public class GMLModelSelectionTab extends AbstractLaunchConfigurationTab {

	protected Button browseWorkspaceButton;
	protected Text uriText;
	protected Button loadButton;
	
	protected Button saveFileButton;
	protected Text saveUriText;
	
	private Label infoLabel;
	private TreeViewer modelTreeViewer;

	private Resource modelResource;	
	private GoalModel selectedModelElement;
	
	private List<EObject> selectableModelElements = new ArrayList<EObject>();

	private boolean restoringModelResource = false;
	protected ComposedAdapterFactory adapterFactory;
	
	private void createAdapterFacotry() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new GmlAdapterFactory());
		adapterFactory.addAdapterFactory(new GelAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UMLItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_VERTICAL));

		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 8;
		composite.setLayout(layout);

		createUIControls(composite);
		setControl(composite);
	}

	protected void createUIControls(Composite parent) {
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
		browseWorkspaceButton.setText("Browse Workspace...");
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
				autoUpdateSaveURIText();
			}
		});

		loadButton = new Button(uriComposite, SWT.PUSH);
		loadButton.setText("Load Model");
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
		
		

		infoLabel = new Label(parent, SWT.LEFT);
		infoLabel.setText(getSelectModelEvaluationText());
		infoLabel.setVisible(false);
		modelTreeViewer = new TreeViewer(parent);
		GridData treeLayoutData = new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL);
		treeLayoutData.heightHint = 380;
		modelTreeViewer.getTree().setLayoutData(treeLayoutData);
		
		createAdapterFacotry();
		
		modelTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		modelTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		new AdapterFactoryTreeEditor(modelTreeViewer.getTree(), adapterFactory);
		
		modelTreeViewer.getTree().setEnabled(false);		
		modelTreeViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						String text = uriText.getText();
						loadButton.setEnabled(text != null && text.trim().length() > 0);
						selectedModelElement = loadModelElementFromSelection(event.getSelection());
						if(!restoringModelResource) {
							updateLaunchConfigurationDialog();
						}
					}
				});
		
		Composite lowerComposite = new Composite(parent, SWT.NONE);
		lowerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		{
			FormLayout layout = new FormLayout();
			layout.marginTop = 20;
			layout.spacing = 10;
			lowerComposite.setLayout(layout);
		}

		Composite saveComposite = new Composite(lowerComposite, SWT.NONE);
		{
			FormData data = new FormData();
			data.left = new FormAttachment(0);
			data.right = new FormAttachment(100);
			saveComposite.setLayoutData(data);

			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = -5;
			layout.marginLeft = -5;
			layout.marginRight = -5;
			saveComposite.setLayout(layout);
		}
		
		saveUriText = new Text(saveComposite, SWT.SIMPLE | SWT.BORDER);
		saveUriText.setEditable(false);
		saveUriText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		setSaveURIText("");
		
		saveFileButton = new Button(saveComposite, SWT.PUSH);
		saveFileButton.setText("Save evaluated Model...");
		saveFileButton.setLayoutData(new GridData(GridData.END));
		saveFileButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveModel();
			}
		});
		
		{
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL
					| GridData.GRAB_HORIZONTAL);
			if (saveComposite.getChildren().length == 1) {
				gridData.horizontalSpan = 2;
			}
			saveUriText.setLayoutData(gridData);
		}
	}
	
	protected String getSelectModelEvaluationText() {
		return "Select a valid goal model evaluation to be evaluated.";
	}

	private GoalModel loadModelElementFromSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Iterator<?> iter = structuredSelection.iterator(); iter.hasNext();) {
				Object next = iter.next();
				if (next instanceof GoalModel) {						
					return (GoalModel) next;
				}
			}
		}
		return null;
	}

	private void uriTextModified(String text) {
		setErrorMessage(null);
		setMessage(null);
	}
	
	private boolean saveModel() {
		ViewerFilter extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof IFile)
						|| MigrationResourceUtil.getEvaluationFileExtension().equals(((IFile) element).getFileExtension());
			}
		};
		// new WorkbenchContentProvider();
		WorkspaceResourceDialog dialog = new WorkspaceResourceDialog(getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		dialog.setAllowMultiple(false);
		dialog.setShowFileControl(true);
		dialog.setShowNewFolderControl(true);
		dialog.addFilter(extensionFilter);
		dialog.loadContents();
		dialog.setTitle("Goal Model Browser");
		dialog.setMessage(getSaveMessage());

		IFile file = dialog.open() == Window.OK ? dialog.getFile() : null;
		if (file != null) {
			String fileString = file.getFullPath().toString();
			if(!MigrationResourceUtil.getEvaluationFileExtension().equals(file.getFileExtension()))
				fileString += "." + MigrationResourceUtil.getEvaluationFileExtension();
	
			setSaveURIText(URI.decode(URI.createPlatformResourceURI(fileString, true).toString() + "   "));
			return true;
		}
		return false;
	}

	private boolean browseWorkspace() {
		ViewerFilter extensionFilter = null;
		extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof IFile)
						|| MigrationResourceUtil.getGoalModelFileExtension().equals(((IFile) element).getFileExtension())
						|| MigrationResourceUtil.getEvaluationFileExtension().equals(((IFile) element).getFileExtension());
			}
		};

		IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(),
				"Model Browser", 
				"Select a goal model or partial evaluation to be evaluated.", false, null, extensionFilter == null ? null
						: Collections.singletonList(extensionFilter));
		if (files.length > 0) {
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < files.length; ++i) {
				text.append(URI.createPlatformResourceURI(files[i]
						.getFullPath().toString(), true));
				text.append("  ");
			}
			setURIText(URI.decode(text.toString()));
			modelTreeViewer.setInput(null);
			modelTreeViewer.getTree().setEnabled(false);
			modelTreeViewer.refresh(true);
			selectedModelElement = null;
			return true;
		}
		return false;
	}

	private void autoUpdateSaveURIText() {
		if(uriText.getText() == null)
			return;
		String uriTxt = uriText.getText().trim();
		if(uriTxt.length() <= 0 || !uriTxt.contains("."))
			return;
		setSaveURIText(uriTxt.substring(0, uriTxt.lastIndexOf('.')) + 
				".evaluated." + MigrationResourceUtil.getEvaluationFileExtension());
	}
	
	private void setSaveURIText(String uri) {
		uri = uri.trim();
		StringBuffer text = new StringBuffer(saveUriText.getText());
		if (!uri.equals(text)) {
			saveUriText.setText(uri.trim());
		}
	}
	
	private void setURIText(String uri) {
		uri = uri.trim();
		StringBuffer text = new StringBuffer(uriText.getText());
		if (!uri.equals(text)) {
			uriText.setText(uri.trim());
		}
		autoUpdateSaveURIText();
	}

	private boolean loadModel() {
		try {
			if (uriText.getText().startsWith("platform:/")) {
				MigrationResourceSet set = new MigrationResourceSet();
				if(MigrationResourceUtil.isGoalModel(uriText.getText()))
					modelResource = set.loadGoalModel(uriText.getText()).eResource();
				else if(MigrationResourceUtil.isEvaluation(uriText.getText()))
					modelResource = set.loadMigrationEvaluation(uriText.getText()).eResource();
			}
		} catch(Exception e) {
			modelResource = null;
		}
		if(haveModel()) {
			selectableModelElements.add(modelResource.getContents().get(0));
			modelTreeViewer.setInput(modelResource);
			modelTreeViewer.getTree().setEnabled(true);
			modelTreeViewer.refresh(true);
			infoLabel.setVisible(true);
		}
		return haveModel();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		if (!haveModel()) {
			setErrorMessage("Select a model.");
			return false;
			// }  else if (!isModelElementSelected()) {
			// setErrorMessage(getSelectModelEvaluationText());
			// return false;
		} else if(!isSaveUriSelected()) {
			setErrorMessage(getSaveMessage());
			return false;
		} else {
			setErrorMessage(null);
			setMessage(null);
			return super.isValid(launchConfig);
		}
	}
	
	private String getSaveMessage() {
		return "Select a destination to save your evaluated model.";
	}
	
	private boolean haveModel() {
		return modelResource != null;
	}

	private boolean isModelElementSelected() {
		return selectedModelElement != null;
	}
	
	private boolean isSaveUriSelected() {
		if(saveUriText.getText() == null)
			return false;
		return saveUriText.getText().trim().length() > 0;
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
		String outputModel = "";
		try {
			modelResource = configuration.getAttribute(
					Activator.ATT_INPUT_MODEL_PATH, "");
			outputModel = configuration.getAttribute(
					Activator.ATT_OUTPUT_MODEL_PATH, "");
		} catch (CoreException e) {
		}

		uriText.setText(modelResource);
		saveUriText.setText(outputModel);
		
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

	private GoalModel initializeSelectedModelElement(
			ILaunchConfiguration configuration) {
		String goalModelEvaluationName = "";
		try {
			goalModelEvaluationName = configuration.getAttribute(Activator.ATT_GOALMODELEVALUATION_NAME, "");
		} catch (CoreException e) {
		}
		
		for (EObject model: getSelectableModelElements()) {
			if(model.equals(goalModelEvaluationName)) {
				return null;
			}
		}
		return null;
	}
	
	public List<EObject> getSelectableModelElements() {
		return selectableModelElements;
	}
	
	public EObject getSelectedModelElement() {
		return selectedModelElement;
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DebugPlugin.ATTR_PROCESS_FACTORY_ID,
				Activator.GML_PROCESS_FACTORY_ID);
		configuration.setAttribute(Activator.ATT_INPUT_MODEL_PATH, 
				uriText.getText().trim());
		configuration.setAttribute(Activator.ATT_OUTPUT_MODEL_PATH,
				saveUriText.getText().trim());	
		configuration.setAttribute(Activator.ATT_GOALMODELEVALUATION_NAME,
				getSelectedModelElementName());		
	}
	
	private String getSelectedModelElementName() {
		EObject evaluation = getSelectedModelElement();
		if(evaluation != null)
			return evaluation.toString();
		return "";
	}

}
