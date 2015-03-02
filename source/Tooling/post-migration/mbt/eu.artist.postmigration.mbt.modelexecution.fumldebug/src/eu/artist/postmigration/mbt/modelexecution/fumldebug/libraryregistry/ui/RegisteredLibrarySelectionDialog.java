/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.RegisteredLibrary;

public class RegisteredLibrarySelectionDialog extends
		ElementListSelectionDialog {

	private Collection<RegisteredLibrary> registeredLibraries;
	private Collection<RegisteredLibrary> selectedLibraries;
	
	public RegisteredLibrarySelectionDialog(Shell parent) {
		super(parent, new RegisteredLibraryLabelProvider());
		registeredLibraries = RegisteredLibrary.getRegisteredLibraries();
		this.setTitle("Select library: ");
		this.setElements(registeredLibraries.toArray());
	}
	
	public void run() {
		this.open();
		
		Object[] result = this.getResult();
		if(result != null) {
			selectedLibraries = new ArrayList<RegisteredLibrary>();
			for(int i=0;i<result.length;++i) {
				RegisteredLibrary selectedLibrary = (RegisteredLibrary)result[i];
				selectedLibraries.add(selectedLibrary);
			}
		}
	}
	
	public Collection<RegisteredLibrary> getSelectedLibraries() {
		return selectedLibraries;
	}
	
	private static class RegisteredLibraryLabelProvider extends LabelProvider {
		public RegisteredLibraryLabelProvider() {
			
		}
		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			if(element instanceof RegisteredLibrary) {
				RegisteredLibrary registeredLibrary = (RegisteredLibrary) element;				
				return registeredLibrary.getName();				
			}
			return super.getText(element);
		}
	}

}
