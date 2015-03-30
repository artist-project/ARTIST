/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.util.run.ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.FrameworkUtil;

import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;

public class ModelSelectionTab extends AbstractLaunchConfigurationTab {
	public static final int UNLIMITED = -1;
	
	private String name = "Model Resources";
	private URL icon = FrameworkUtil.getBundle(getClass()).getEntry("icons/ModelSelectionTab.png");
	
	private MigrationResourceSet resourceSet = new MigrationResourceSet();
	private List<SelectionConfiguration> inputConfigurations = new ArrayList<>();	
	private List<Text> inputURIs = new ArrayList<>();
	private List<Button> inputBrowseButtons = new ArrayList<>();
	private List<Button> inputViewButtons = new ArrayList<>();
	private List<ModelTreeViewer> inputModelViewer = new ArrayList<>();
	
	private List<SelectionConfiguration> outputConfigurations = new ArrayList<>();
	private List<Text> outputURIs = new ArrayList<>();
	private List<Button> outputBrowseButtons = new ArrayList<>();
	private List<Button> outputViewButtons = new ArrayList<>();
	private List<ModelTreeViewer> outputModelViewer = new ArrayList<>();
	
	private boolean loadPreviewsOnStart = false;
	private String processFactoryId;
	
	protected abstract class SelectionConfiguration {
		protected String name;
		protected boolean allowMultiple;
		protected String attributeName;
		
		protected boolean allowCreation;
		protected int lowerBound;
		protected int upperBound;
		
		public SelectionConfiguration(String name, int lowerBound, int upperBound, boolean allowCreation, String attributeName) {
			this.name = name;
			this.lowerBound = lowerBound;
			this.upperBound = upperBound;
			this.allowMultiple = upperBound == UNLIMITED || upperBound > 1;
			this.allowCreation = allowCreation;
			this.attributeName = attributeName;
		}
		
		public String getName() {
			return name;
		}
		
		public String getLabel() {
			if(isAllowMultiple())
				return getName() + "s";
			return getName();
		}
		
		public int getLowerBound() {
			return lowerBound;
		}
		
		public int getUpperBound() {
			return upperBound;
		}
		
		public boolean isAllowMultiple() {
			return allowMultiple;
		}
		
		public boolean isAllowCreation() {
			return allowCreation;
		}
		
		public String getAttributeName() {
			return attributeName;
		}
		
		public abstract boolean isValid();
		
		public abstract String getErrorString();
		
		public abstract List<String> toAttributeList();
		
		public abstract ARTISTWorkspaceResourceDialog createDialog();
		
		public abstract boolean isPreview();
		
		public abstract String toTextString();
	}
	
	protected class ModelSelectionConfiguration extends SelectionConfiguration {		
		private List<String> extensions;
		private boolean preview;
		private Set<IFile> files = new HashSet<>();
		private String defaultExtension;
		
		public ModelSelectionConfiguration(String name, List<String> extensions, String defaultExtension, int lowerBound, int upperBound, boolean allowCreation, boolean preview, String attributeName) {
			super(name, lowerBound, upperBound, allowCreation, attributeName);
			this.extensions = extensions;
			this.defaultExtension = defaultExtension;
			this.preview = preview;
		}
		
		public List<String> getExtensions() {
			return extensions;
		}
		
		public String getDefaultExtension() {
			return defaultExtension;
		}
		
		public boolean isPreview() {
			return preview;
		}
		
		public Set<IFile> getFiles() {
			return files;
		}
		
		public ModelSelectionConfiguration addFile(IFile file) {
			files.add(file);
			return this;
		}
		
		public ModelSelectionConfiguration clearFiles() {
			files.clear();
			return this;
		}
		
		public ModelSelectionConfiguration addFiles(Collection<IFile> files) {
			this.files.addAll(files);
			return this;
		}
		
		public ModelSelectionConfiguration addFiles(List<String> files) {
			for(String file : files)
				this.files.add(
						ResourcesPlugin.getWorkspace().getRoot().getFile(
								new Path(URI.createURI(file).toPlatformString(true))));
			return this;
		}
		
		public boolean isValid() {
			return files.size() >= lowerBound && (files.size() <= getUpperBound() || getUpperBound() == UNLIMITED);
		}
		
		public String getErrorString() {
			boolean lowerBoundWrong = files.size() < getLowerBound();
			boolean upperBoundWrong = files.size() > getUpperBound() && !(getUpperBound() == UNLIMITED);
			
			if(!lowerBoundWrong && !upperBoundWrong)
				return "";
			
			String message = "Please select ";
			if(lowerBoundWrong) {
				if(lowerBound != upperBound)
					message += "at least ";
				message += + getLowerBound() + " " + getName();
			}
			if(lowerBoundWrong && upperBoundWrong)
				message += " and ";
			if(upperBoundWrong)
				message += "at most " + getUpperBound() + " " + getLabel();
			return message;
		}
		
		public List<String> toAttributeList() {
			List<String> fileNames = new ArrayList<>();
			for(IFile file : files) {
				fileNames.add(URI.decode(URI.createPlatformResourceURI(
						file.getFullPath().toString(), true).toString()));
			}
			return fileNames;
		}
		
		@Override
		public String toTextString() {
			String completeFileString = "";
			String delimiter = "";
			for(IFile file : files) {
				String fileString = file.getFullPath().toString();
				if(!getExtensions().contains(file.getFileExtension()))
					fileString += "." + getDefaultExtension();
				fileString = URI.decode(URI.createPlatformResourceURI(fileString, true).toString());
				completeFileString += delimiter + fileString;
				delimiter = "\n";
			}
			return completeFileString;
		}
		
		public ARTISTWorkspaceResourceDialog createDialog() {
			ARTISTWorkspaceResourceDialog dialog = ResourceDialogFactory.createModelResourceDialog(getShell(), getName(), isAllowMultiple(), getExtensions());
			dialog.setShowNewFolderControl(isAllowCreation());
			dialog.setShowFileControl(isAllowCreation());
			if(!getFiles().isEmpty()) {
				if(!isAllowMultiple())
					dialog.setInitialSelection(getFiles().iterator().next());
				else
					dialog.setInitialSelections(getFiles().toArray());
			}
			return dialog;
		}
	}
	
	public ModelSelectionTab(String processFactoryId) {
		this.processFactoryId = processFactoryId;
	}
	
	public ModelSelectionTab(String processFactoryId, URL iconURL) {
		this.processFactoryId = processFactoryId;
		this.icon = iconURL;
	}
	
	public String getProcessFactoryId() {
		return processFactoryId;
	}
	
	protected MigrationResourceSet getResourceSet() {
		return resourceSet;
	}
	
	protected String toAttributeName(String name, boolean input) {
		return "ATT_" + (input ? "INPUT_" : "OUTPUT_") + name.replace(" ", "_").toUpperCase();
	}
	
	public String addInput(String name, List<String> extensions, String defaultExtension, int lowerBound, int upperBound, boolean allowCreation, boolean preview) {
		return addInput(name, extensions, defaultExtension, lowerBound, upperBound, allowCreation, preview, toAttributeName(name, true));
	}
	
	public String addOutput(String name, List<String> extensions, String defaultExtension, int lowerBound, int upperBound, boolean allowCreation, boolean preview) {
		return addOutput(name, extensions, defaultExtension, lowerBound, upperBound, allowCreation, preview, toAttributeName(name, false));
	}

	public String addInput(String name, List<String> extensions, String defaultExtension, int lowerBound, int upperBound, boolean allowCreation, boolean preview, String attributeName) {
		inputConfigurations.add(new ModelSelectionConfiguration(name, extensions, defaultExtension, lowerBound, upperBound, allowCreation, preview, attributeName));
		return attributeName;
	}
	
	public String addOutput(String name, List<String> extensions, String defaultExtension, int lowerBound, int upperBound, boolean allowCreation, boolean preview, String attributeName) {
		outputConfigurations.add(new ModelSelectionConfiguration(name, extensions, defaultExtension, lowerBound, upperBound, allowCreation, preview, attributeName));
		return attributeName;
	}

	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_VERTICAL));

		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 7;
		composite.setLayout(layout);

		for(int i = 0; i < inputConfigurations.size(); i++) {
			inputURIs.add(null);
			inputBrowseButtons.add(null);
			inputViewButtons.add(null);
			inputModelViewer.add(null);
		}
		
		for(int i = 0; i < outputConfigurations.size(); i++) {
			outputURIs.add(null);
			outputBrowseButtons.add(null);
			outputViewButtons.add(null);
			outputModelViewer.add(null);
		}
		
		createUIControls(composite, "Input", inputConfigurations, inputURIs, inputBrowseButtons, inputViewButtons, inputModelViewer);
		createUIControls(composite, "Output", outputConfigurations, outputURIs, outputBrowseButtons, outputViewButtons, outputModelViewer);
		
		setControl(composite);
	}
	
	private void createUIControls(Composite parent, 
			String groupName, 
			List<SelectionConfiguration> configurations, 
			final List<Text> uris,
			final List<Button> browseButtons,
			final List<Button> viewButtons,
			final List<ModelTreeViewer> modelViewer) {
		
		Group group = new Group(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
		{	// block to avoid name collisions
			GridLayout layout = new GridLayout(1, false);
			layout.marginTop = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.marginBottom = 0;
			layout.verticalSpacing = 0;
			layout.horizontalSpacing = 0;
			group.setLayout(layout);
		}
		group.setText(groupName);
		
		for(int i = 0; i < configurations.size(); i++) {
			final int index = i;
			final SelectionConfiguration config = configurations.get(i);
			
			int nrColumns = config.isPreview() && !config.isAllowMultiple() ? 4 : 3;
			
			Composite row = new Composite(group, SWT.NONE);
			{ // block to avoid name collisions
				row.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
				GridLayout layout = new GridLayout(nrColumns, false);
				layout.marginTop = 0;
				layout.marginLeft = 0;
				layout.marginRight = 0;
				layout.marginBottom = 0;
				layout.verticalSpacing = 5;
				row.setLayout(layout);
			}
			
			// label
			Label label = new Label(row, SWT.LEFT | SWT.WRAP);
			label.setText(config.getLabel() + ":");
			GridData data = new GridData(GridData.BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING);
			data.verticalIndent = 5;
			label.setLayoutData(data);
			
			// uri text
			Text uriText = new Text(row, SWT.SIMPLE | SWT.BORDER);
			uriText.setEditable(false);
			uriText.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					resetMessages();
					updateLaunchConfigurationDialog();
				}
			});
			uriText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
			
//			if(!config.isPreview()) {
//				GridData gridData = new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL);
//				gridData.horizontalSpan = 2;
//				uriText.setLayoutData(gridData);
//			}
			uris.set(i, uriText);
			
			// browse button
			Button browseWorkspaceButton = new Button(row, SWT.PUSH);
			browseWorkspaceButton.setText("Browse Workspace...");
			browseWorkspaceButton.setLayoutData(new GridData(GridData.END));
			browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					ARTISTWorkspaceResourceDialog dialog = config.createDialog();
					if(config instanceof ModelSelectionConfiguration) {
						ModelSelectionConfiguration modelConfig = (ModelSelectionConfiguration) config;
						IFile[] files = dialog.open() == Window.OK ? dialog.getSelectedFiles() : null;
						if(files != null) {
							modelConfig.clearFiles();
							List<IFile> correctedFiles = new ArrayList<>();
							for(IFile file : files) {
								String fileString = file.getName().toString();
								if(!modelConfig.getExtensions().contains(file.getFileExtension())) {
									fileString += "." + modelConfig.getDefaultExtension();
									correctedFiles.add(file.getParent().getFile(new Path(fileString)));
								} else
									correctedFiles.add(file);
							}
							if(config.isAllowMultiple())
								modelConfig.addFiles(correctedFiles);
							else
								modelConfig.addFile(correctedFiles.get(correctedFiles.size() - 1));
							uris.get(index).setText(modelConfig.toTextString());
						}
					}
					
				}
			});
			browseWorkspaceButton.setFocus();
			browseButtons.set(index, browseWorkspaceButton);
			
			if(config.isPreview() && !config.isAllowMultiple()) {				
				Button viewButton = new Button(row, SWT.PUSH);
				viewButton.setText("View Model");
				viewButton.setLayoutData(new GridData(GridData.END));
				viewButtons.set(index, viewButton);
				
				ModelTreeViewer modelTreeViewer = new ModelTreeViewer(row);
				GridData treeLayoutData = new GridData(GridData.FILL_HORIZONTAL);
				treeLayoutData.horizontalSpan = nrColumns;
				treeLayoutData.heightHint = 300;
				modelTreeViewer.getTree().setLayoutData(treeLayoutData);
				modelTreeViewer.getTree().setEnabled(false);
				modelViewer.set(i, modelTreeViewer);
				
				
				viewButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String uri = uris.get(index).getText();
						ModelTreeViewer viewer = modelViewer.get(index);
						Resource modelResource = null;
						try {
//							if(uri.startsWith("platform:/")) 
								modelResource = getResourceSet().loadModel(uri);
						} catch(Exception ex) { }
						if(modelResource != null) {
							viewer.setInput(modelResource);
							viewer.getTree().setEnabled(true);
							viewer.refresh(true);
						}
					}
				});
			}
		}
	}

	/**
	 * Resets the message and error message label.
	 */
	private void resetMessages() {
		setErrorMessage(null);
		setMessage(null);
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		String errorMessages = "";
		for(SelectionConfiguration config : inputConfigurations)
			if(!config.isValid())
				errorMessages += config.getErrorString() + " as input. ";
		for(SelectionConfiguration config : outputConfigurations)
			if(!config.isValid())
				errorMessages += config.getErrorString() + " as output. ";
		if(!errorMessages.isEmpty())
			setErrorMessage(errorMessages);
		return errorMessages.isEmpty();
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@SuppressWarnings("unchecked")
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		if(inputConfigurations == null || outputConfigurations == null)
			return;
		try {
			for(int i = 0; i < inputConfigurations.size(); i++) {
				SelectionConfiguration config = inputConfigurations.get(i);
				List<String> files = (List<String>)configuration.getAttribute(config.getAttributeName(), new ArrayList<String>());
				if(config instanceof ModelSelectionConfiguration)
					((ModelSelectionConfiguration) config).addFiles(files);
				inputURIs.get(i).setText(config.toTextString());
			}
			
			for(int i = 0; i < outputConfigurations.size(); i++) {
				SelectionConfiguration config = outputConfigurations.get(i);
				List<String> files = (List<String>)configuration.getAttribute(config.getAttributeName(), new ArrayList<String>());
				if(config instanceof ModelSelectionConfiguration)
					((ModelSelectionConfiguration) config).addFiles(files);
				outputURIs.get(i).setText(config.toTextString());
			}
		} catch (CoreException e) {}
		updateLaunchConfigurationDialog();
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				DebugPlugin.ATTR_PROCESS_FACTORY_ID,
				getProcessFactoryId());
		
		for(SelectionConfiguration config : inputConfigurations)
			configuration.setAttribute(config.getAttributeName(), config.toAttributeList());
		
		for(SelectionConfiguration config : outputConfigurations) 
			configuration.setAttribute(config.getAttributeName(), config.toAttributeList());
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	public void setLoadPreviewsOnStart(boolean loadPreviewsOnStart) {
//		this.loadPreviewsOnStart = loadPreviewsOnStart;
//	}
	
	public boolean isLoadPreviewsOnStart() {
		return loadPreviewsOnStart;
	}
	
	public URL getIcon() {
		return icon;
	}
	
	public void setIcon(URL icon) {
		this.icon = icon;
	}
	
	@Override
	public Image getImage() {
		ImageDescriptor id = ImageDescriptor.createFromURL(getIcon());
		if (id != null)
			return id.createImage();
		return null;
	}
}
