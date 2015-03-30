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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;

public class ARTISTWorkspaceResourceDialog extends WorkspaceResourceDialog {

	public ARTISTWorkspaceResourceDialog(Shell parent, ILabelProvider labelProvider,
			ITreeContentProvider contentProvider) {
		super(parent, labelProvider, contentProvider);
	}
	
	@Override
	public IFile getFile() {
		String file = getFileText();
	    if (file.length() != 0) {
	      Object[] result = getResult();
	      if (result.length == 1) {
	        if (result[0] instanceof IFile) {
	        	IFile selectedFile = (IFile) result[0];
	        	if(selectedFile.getName().equals(file))
	        		return (IFile)result[0];
	        	else
	        		return selectedFile.getParent().getFile(new Path(file));
	        } else if (result[0] instanceof IContainer) {
	          IContainer container = (IContainer)result[0];
	          return container.getFile(new Path(file));
	        }
	      }
	    }
	    return null;
	}
	
	@Override
	public IFile[] getSelectedFiles() {
		List<IFile> files = new ArrayList<IFile>();
		Object[] result = getResult();
		String fileName = getFileText();
		boolean isFile = false;
		for (int i = 0; i < result.length; i++) {
			if(result[i] instanceof IFile) {
				IFile file = (IFile) result[i];
				files.add(file);
				if(file.getName().equals(fileName))
					isFile = true;
			}
		}
		if(!fileName.isEmpty() && !isFile && result.length > 0) {
			Object lastSelected = result[result.length -1];
			
			if(lastSelected instanceof IFile)
				files.add(((IFile)lastSelected).getParent().getFile(new Path(fileName)));
			else if(lastSelected instanceof IContainer)
				files.add(((IContainer)lastSelected).getFile(new Path(fileName)));
		}
		return files.toArray(new IFile[files.size()]);
	}
	
	@Override
	public void setInitialSelection(Object selection) {
		if(selection == null)
			return;
		if(selection instanceof IFile && !((IFile)selection).exists()) {
			IFile selected = (IFile) selection;
			IContainer parent = selected.getParent();
			super.setInitialSelection(parent);
			setFileText(selected.getName());
		} else {
			super.setInitialSelection(selection);
		}
	}
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
		for(Object selection : selectedElements) {
			if(selection instanceof IFile && !((IFile)selection).exists()) {
				IFile selected = (IFile) selection;
				IContainer parent = selected.getParent();
				super.setInitialSelection(parent);
				setFileText(selected.getName());
			}
		}
	}

}
