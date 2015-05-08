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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.edit.StateEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * @author Christian Krause
 */
public class OpenStateModelAction extends AbstractStateSpaceAction {
	
	// States to be opened:
	private List<State> states = new ArrayList<State>();
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		
		for (State state : states) {
			
			// Get the state model:
			Model model = null;
			try {
				model = getExplorer().getStateSpaceManager().getModel(state);
			} catch (StateSpaceException e) {
				StateSpaceExplorerPlugin.getInstance().logError("Error retrieving state model", e);
				continue;
			}
			URI base = state.eResource().getURI();
			IFile file = null;
			
			// For initial states, the file exists already. 
			// Otherwise we have to create it first.
			if (state.isInitial()) {
				
				// Build the absolute platform URI:
				URI resolved = model.getResource().getURI().resolve(base);

				IPath path = new Path(resolved.toPlatformString(true));
				file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				
			} else {
				
				// Save the model to a new file.
				String name = base.trimFileExtension().lastSegment();
				URI target = base.trimSegments(1)
								.appendSegment(name+"_state"+state.getIndex()+".xmi");
				try {
					
					// Do the saving:
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(target);
					resource.getContents().addAll(EcoreUtil.copyAll(model.getResource().getContents()));
					Map<Object,Object> options = new HashMap<Object,Object>();
					options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
					resource.save(options);
					
					// Don't forget to refresh the folder contents:
					IPath path = new Path(target.toPlatformString(true));
					IContainer folder = ResourcesPlugin.getWorkspace().getRoot().getFile(path).getParent();
					folder.refreshLocal(1, new NullProgressMonitor());
					file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					
				} catch (Throwable t) {
					StateSpaceExplorerPlugin.getInstance().logError("Error saving state resource", t);
				}
								
			}
			
			// Open the file.
			try {
				if (file!=null) {
					IWorkbenchPage page = getExplorer().getSite().getPage();
					IDE.openEditor(page, file, true);					
				}
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		states.clear();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structured = (IStructuredSelection) selection;
			for (Object selected : structured.toArray()) {
				if (selected instanceof StateEditPart) {
					State state = ((StateEditPart) selected).getState();
					states.add(state);
				}
			}
		}
		action.setEnabled(!states.isEmpty());
	}
	
}
