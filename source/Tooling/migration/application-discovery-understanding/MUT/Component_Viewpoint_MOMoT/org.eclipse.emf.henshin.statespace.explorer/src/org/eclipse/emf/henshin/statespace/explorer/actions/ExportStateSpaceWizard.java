/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceExporter;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.edit.StateSpaceEditPart;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Wizard for exporting state spaces.
 * @author Christian Krause
 */
public class ExportStateSpaceWizard extends Wizard implements IExportWizard {
	
	// Wizard pages:
	private ChooseExporterPage chooseExporterPage;
	private ParametersPage parametersPage;
	private FileCreationPage fileCreationPage;
	
	// The workbench:
	private IWorkbench workbench;
	
	// State space to be exported:
	private StateSpace stateSpace;
	private StateSpaceIndex index;
	
	// Selection:
	private IStructuredSelection selection;
	
	// Default base file name (without extension):
	private String baseName;

	// Image for the wizard:
	private ImageDescriptor wizban;//, icon;
	
	
	/**
	 * Default constructor.
	 */
	public ExportStateSpaceWizard() {
		wizban = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.ui", "$nl$/icons/full/wizban/export_wiz.png");
		//icon = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.ui", "/icons/full/etool16/export_wiz.gif");
		setNeedsProgressMonitor(true);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
		setWindowTitle("Export State Space");
		this.workbench = workbench;
		this.selection = selection;
		
		// Try to extract the state space out of the selection:
		if (selection!=null) {
			Iterator<?> iterator = selection.iterator();
			while (iterator.hasNext() && stateSpace==null) {
				Object current = iterator.next();
				if (current instanceof StateSpaceEditPart) {
					stateSpace = ((StateSpaceEditPart) current).getStateSpace();
				} else if (current instanceof IFile) {
					URI fileURI = URI.createPlatformResourceURI(((IFile) current).getFullPath().toString(), true);
					try {
						StateSpaceResourceSet resourceSet = new StateSpaceResourceSet();
						stateSpace = (StateSpace) resourceSet.getResource(fileURI, true).getContents().get(0);
					} catch (Throwable t) {
						StateSpaceExplorerPlugin.getInstance().logError("Error loading state space from file " + fileURI.toFileString(), t);
					}
				}
			}
		}
		
		// State space must be set by now.
		if (stateSpace==null) {
			throw new RuntimeException("State space not found");
		}
		
		// Initialize the default file name for the export:
		baseName = stateSpace.eResource().getURI().trimFileExtension().lastSegment();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(chooseExporterPage = new ChooseExporterPage("exporter-selection"));
		addPage(parametersPage = new ParametersPage("parameters"));
		addPage(fileCreationPage = new FileCreationPage("file-creation", selection));
	}

	/*
	 * Update the file name for the file creation page.
	 */
	private void updateFileName(String ext) {
		
		String directory = stateSpace.eResource().getURI().trimSegments(1).toPlatformString(true);
		IContainer container = (IContainer) ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(directory));
		fileCreationPage.setContainerFullPath(container.getFullPath());
		
		// Check if the file exists already:
		String filename = baseName + "." + ext;
		for (int i=1; container.findMember(filename)!=null; ++i) {
			filename = baseName + i + "." + ext;
		}
		fileCreationPage.setFileName(filename);

	}

	/*
	 * Pretty print allowed extensions.
	 */
	private static String printAllowedExtensions(StateSpaceExporter exporter) {
		String[] allowed = exporter.getFileExtensions();
		String pretty = "";
		for (int i=0; i<allowed.length; i++) {
			pretty = pretty + "*." + allowed[i];
			if (i<allowed.length-1) pretty = pretty + ", ";
		}
		return pretty;
	}
	
	public void setStateSpaceIndex(StateSpaceIndex index) {
		this.index = index;
		this.stateSpace = index.getStateSpace();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			final IFile file = getFile();
			final StateSpaceExporter exporter = getExporter();
			final String parameters = parametersPage.parameters;
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) {
					try {
						performExport(exporter, file, parameters, monitor);
					} catch (Throwable t) {
						MessageDialog.openError(getShell(), "Error exporting state space", t.getMessage());
						StateSpaceExplorerPlugin.getInstance().logError("Error exporting state space", t);
					} finally {
						monitor.done();
					}
				}
			};
			getContainer().run(false, false, operation);
			// Refresh:
			file.getParent().refreshLocal(2, new NullProgressMonitor());
			if (file.exists()) {
				openExportedFile(file);
			}
			return true;
		}
		catch (Throwable t) {
			StateSpaceExplorerPlugin.getInstance().logError("Error exporting state space", t);
			return false;
		}
	}
	
	/*
	 * Perform the export operation.
	 */
	protected void performExport(StateSpaceExporter exporter, IFile file, String parameters, IProgressMonitor monitor) throws Throwable {
		
		monitor.beginTask("Exporting state space...", 20);
		URI fileURI = URI.createFileURI(file.getLocation().toOSString());

		exporter.setStateSpaceIndex(index);
		exporter.doExport(stateSpace, fileURI, parameters, new SubProgressMonitor(monitor,19));
				
	}
	
	
	/* 
	 * Open the new file resource in the current window.
	 */
	protected void openExportedFile(IFile file) {
		try {
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = window.getActivePage();
			IDE.openEditor(page, file, true);
		}
		catch (Throwable t) {
			StateSpaceExplorerPlugin.getInstance().logError("Error opening exported file.", t);
		}
	}
		
	/**
	 * Get the file from the page.
	 * @return the target file.
	 */
	public IFile getFile() {
		return fileCreationPage.getFile();
	}
	
	/**
	 * Get the exporter to be used.
	 * @return The exporter.
	 */
	public StateSpaceExporter getExporter() {
		return chooseExporterPage.getExporter();
	}
	
	/*
	 * Choose exporter page.
	 */
	protected class ChooseExporterPage extends WizardPage {
		
		// List of registered exporters.
		private java.util.List<StateSpaceExporter> exporters;
		
		// Currently selected exporter.
		private int current = 0;
		
		/*
		 * Constructor.
		 */
		public ChooseExporterPage(String pageId) {
			super(pageId);
			setDescription("Choose a state space exporter");
			if (wizban!=null) {
				setImageDescriptor(wizban);
			}
			exporters = new ArrayList<StateSpaceExporter>(StateSpacePlugin.INSTANCE.getExporters().values());
			Collections.sort(exporters, new Comparator<StateSpaceExporter>() {
				@Override
				public int compare(StateSpaceExporter o1, StateSpaceExporter o2) {
					return String.valueOf(o1.getName()).compareTo(String.valueOf(o2.getName()));
				}
			});
		}
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public void createControl(Composite parent) {
			
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(new FillLayout());			
			final List list = new List(container, SWT.BORDER);
			for (StateSpaceExporter exporter : exporters) {
				list.add(exporter.getName() + " (" + printAllowedExtensions(exporter) + ")");
			}
			list.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					current = list.getSelectionIndex();
					updateFilePage();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
					getContainer().showPage(parametersPage);
				}
			});
			list.select(current);
			updateFilePage();
			setControl(container);
		}
		
		private void updateFilePage() {
			if (fileCreationPage!=null && current<exporters.size()) {
				String[] fileExts = exporters.get(current).getFileExtensions();
				if (fileExts.length>0) {
					updateFileName(fileExts[0]);
				}
			}
		}
		
		public StateSpaceExporter getExporter() {
			return exporters.get(current);
		}
		
	}

	/*
	 * Parameters page
	 */
	protected class ParametersPage extends WizardPage {
		
		String parameters;
		
		/*
		 * Constructor.
		 */
		public ParametersPage(String pageId) {
			super(pageId);
			setDescription("Enter parameters (optional)");
			if (wizban!=null) {
				setImageDescriptor(wizban);
			}
		}
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public void createControl(Composite parent) {
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(new FillLayout());
			final Text text = new Text(container, SWT.BORDER | SWT.MULTI);
			text.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					parameters = text.getText();
				}
			});
			setControl(container);
		}		
	}

	/*
	 * File creation page.
	 */
	protected class FileCreationPage extends WizardNewFileCreationPage {
		
		/*
		 * Constructor.
		 */
		public FileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
			setDescription("Choose the target file for the export ");
			if (wizban!=null) {
				setImageDescriptor(wizban);
			}
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validatePage()
		 */
		@Override
		protected boolean validatePage() {
			if (!super.validatePage()) return false;
			String extension = new Path(getFileName()).getFileExtension();
			String[] allowed = getExporter().getFileExtensions();
			boolean ok = false;
			for (int i=0; i<allowed.length; i++) {
				if (String.valueOf(allowed[i]).equals(extension)) ok = true;
			}
			if (!ok) {
				setErrorMessage("Invalid file extension, should be one of " + 
						printAllowedExtensions(getExporter()));
				return false;
			}
			return true;
		}
		
		public IFile getFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}
	

}
