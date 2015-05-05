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

import org.eclipse.emf.henshin.statespace.explorer.parts.StateSpaceExplorer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * @author Christian Krause
 */
public abstract class AbstractStateSpaceAction implements IEditorActionDelegate {
	
	// Currently action state space explorer:
	private StateSpaceExplorer explorer;
	
	// Current selection;
	private ISelection selection;
	
	protected StateSpaceExplorer getExplorer() {
		return explorer;
	}
	
	public void setExplorer(StateSpaceExplorer explorer) {
		this.explorer = explorer;
	}
	
	protected ISelection getSelection() {
		return selection;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart editor) {
		explorer = null;
		if (editor instanceof StateSpaceExplorer) {
			explorer = (StateSpaceExplorer) editor;
		}
		action.setEnabled(explorer!=null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		action.setEnabled(true);
	}
	
}
