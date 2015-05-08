/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.parts;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.edit.StateSpaceEditPartFactory;
import org.eclipse.emf.henshin.statespace.explorer.jobs.StateSpaceJobManager;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResource;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResourceSet;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.FileEditorInput;

/**
 * State space explorer.
 * @author Christian Krause
 */
public class StateSpaceExplorer extends GraphicalEditor {
	
	// State space manager:
	private StateSpaceManager stateSpaceManager;
	
	// Job manager:
	private StateSpaceJobManager jobManager;
	
	// Tool menu:
	private StateSpaceToolsMenu toolsMenu;
	
	// Whether to display the content in the graphical viewer.
	private boolean displayContent;
	
	// Dirty flag:
	private boolean dirty;
	
	// Model listener:
	private Adapter dirtyUpdater = new AdapterImpl() {
		public void notifyChanged(Notification msg) {
			dirty = true;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	};
	
	/** 
	 * Create a new editor instance. 
	 * This is called by the workspace. 
	 */
	public StateSpaceExplorer() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		
		// Create a sash form:
		parent.setLayout(new FillLayout());
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
		sashForm.SASH_WIDTH = 2;
		sashForm.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY));
		
		// Create the graphical viewer:
		createGraphicalViewer(sashForm);
		ScrollingGraphicalViewer viewer = (ScrollingGraphicalViewer) getGraphicalViewer();
		ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) viewer.getRootEditPart();
		FigureCanvas canvas = (FigureCanvas) viewer.getControl();
		
		// Add the tools menu:
		toolsMenu = new StateSpaceToolsMenu(sashForm);
		toolsMenu.setZoomManager(root.getZoomManager());
		toolsMenu.setCanvas(canvas);
		if (jobManager!=null) {
			toolsMenu.setJobManager(jobManager);
		}
		toolsMenu.setExplorer(this);
		
		// Weights must be set at the end!
		sashForm.setWeights(new int[] { 5,2 });
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#configureGraphicalViewer()
	 */
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new StateSpaceEditPartFactory());
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
		
		// Configure the context menu provider:
		ContextMenuProvider provider = new StateSpaceContextMenuProvider(viewer, getActionRegistry());
		viewer.setContextMenu(provider);
		getSite().registerContextMenu(provider, viewer);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette#initializeGraphicalViewer()
	 */
	@Override
	protected void initializeGraphicalViewer() {
		updateGraphicalViewer(true);
	}
	
	/*
	 * Update the graphical viewer.
	 */
	private void updateGraphicalViewer(boolean force) {
		
		// Decide whether to display the content based on the number of states:
		boolean newDisplayContent = stateSpaceManager.getStateSpace().getStates().size()<3000;
		
		// Update the graphical viewer if necessary:
		if (newDisplayContent!=displayContent || force) {
			
			displayContent = newDisplayContent;
			GraphicalViewer viewer = getGraphicalViewer();
			
			// Set the state space manager in any case (always required).
			((StateSpaceEditPartFactory) viewer.getEditPartFactory()).setStateSpaceManager(stateSpaceManager);
			
			if (displayContent) {
				// Set the viewer content.
				getGraphicalViewer().setContents(stateSpaceManager.getStateSpace());
				viewer.getControl().setBackground(ColorConstants.white);
				jobManager.getExploreJob().setDelay(750);
			}
			else {
				// Don't display anything:
				viewer.setContents(StateSpaceFactory.eINSTANCE.createStateSpace());
				viewer.getControl().setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
				jobManager.getExploreJob().setDelay(0);
			}
		}
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#commandStackChanged(java.util.EventObject)
	 */
	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(IEditorPart.PROP_DIRTY);
		updateGraphicalViewer(false);
		super.commandStackChanged(event);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return dirty || super.isDirty();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		
		// Stop all background jobs first:
		jobManager.stopAllJobs();
		
		try {
			Resource resource = stateSpaceManager.getStateSpace().eResource();
			resource.save(null);
			dirty = false;
			getCommandStack().markSaveLocation();
		} catch (Exception e) { 
			MessageDialog.openError(getSite().getShell(), "Error", "Error saving file. See the error log for more info.");
			StateSpaceExplorerPlugin.getInstance().logError("Error saving file", e);
		}
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		
		// Stop all background jobs first:
		jobManager.stopAllJobs();
		
		// Show a SaveAs dialog
		Shell shell = getSite().getWorkbenchWindow().getShell();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		dialog.setOriginalFile(((IFileEditorInput) getEditorInput()).getFile());
		dialog.open();
		
		IPath path = dialog.getResult();	
		if (path != null) {
			
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			URI uri = URI.createPlatformResourceURI(path.toString(), false);
			
			try {
				// Save the file:
				StateSpaceResource resource = (StateSpaceResource) stateSpaceManager.getStateSpace().eResource();
				resource.setURI(uri);
				resource.save(null);
				
				// Set the new file as editor input:
				setInput(new FileEditorInput(file));
				dirty = false;
				getCommandStack().markSaveLocation();				
			
			} catch (Exception e) {
				MessageDialog.openError(getSite().getShell(), "Error", "Error saving file. See the error log for more info.");
				StateSpaceExplorerPlugin.getInstance().logError("Error saving file", e);
			}
			
		}
	}
	
	/**
	 * Get the used state space manager.
	 * @return State space manager.
	 */
	public StateSpaceManager getStateSpaceManager() {
		return stateSpaceManager;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.ISaveablePart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected void setInput(IEditorInput input) {
		
		super.setInput(input);
		
		// Set the editor name:
		final IFile file = ((IFileEditorInput) input).getFile();
		setPartName(file.getName());
		dirty = false;
		
		try {
			// Load the state space:
			ResourceSet resourceSet = new StateSpaceResourceSet();
	    	URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
			StateSpaceResource resource = (StateSpaceResource) resourceSet.getResource(uri, true);
			StateSpace stateSpace = resource.getStateSpace();
			
			// Shut down existing state space manager:
			if (stateSpaceManager!=null) { 
				stateSpaceManager.shutdown();
			}

			// Create a new state space manager. We cannot use multi-treaded managers in the explorer.
			stateSpaceManager = StateSpaceFactory.eINSTANCE.createStateSpaceManager(stateSpace, 1); // no multi-threading!
			jobManager = new StateSpaceJobManager(stateSpaceManager, getEditDomain());
			
			// Initialize tools menu:
			if (toolsMenu!=null) {
				toolsMenu.setJobManager(jobManager);
			}
			
			// Add a listener:
			stateSpace.eAdapters().add(dirtyUpdater);
			
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#dispose()
	 */
	@Override
	public void dispose() {
		if (jobManager!=null) {
			jobManager.stopAllJobs(); // stop all jobs first.
		}
		if (toolsMenu!=null) {
			toolsMenu.dispose(); // explicitly dispose tools menu.
		}
		if (stateSpaceManager!=null) { // shut down the state space manager
			stateSpaceManager.shutdown();
		}
		super.dispose(); // and dispose.
	}
	
	/**
	 * Execute a GEF command in this editor.
	 * @param command Command to be executed.
	 */
	public void executeCommand(Command command) {
		getCommandStack().execute(command);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#getGraphicalViewer()
	 */
	@Override
	public GraphicalViewer getGraphicalViewer() {
		return super.getGraphicalViewer();
	}

	/**
	 * Select a path in this explorer instance.
	 * @param path Path to be shown.
	 */
	public void selectPath(Path path) {
		Map<?,?> registry = getGraphicalViewer().getEditPartRegistry();
		List<EditPart> editparts = new ArrayList<EditPart>();
		if (registry.containsKey(path.getSource())) {
			editparts.add((EditPart) registry.get(path.getSource()));
			for (Transition transition : path) {
				editparts.add((EditPart) registry.get(transition));
				editparts.add((EditPart) registry.get(transition.getTarget()));
			}
		}
		getGraphicalViewer().setSelection(new StructuredSelection(editparts ));
	}

	public StateSpaceJobManager getJobManager() {
		return jobManager;
	}
	
}