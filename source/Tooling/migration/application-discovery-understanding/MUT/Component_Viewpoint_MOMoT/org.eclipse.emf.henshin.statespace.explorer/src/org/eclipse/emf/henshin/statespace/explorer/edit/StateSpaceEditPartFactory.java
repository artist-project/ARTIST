/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.edit;

import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

/**
 * Factory that maps model elements to edit parts.
 * @author Christian Krause
 */
public class StateSpaceEditPartFactory implements EditPartFactory {
	
	// State space manager to be used:
	private StateSpaceManager manager;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
	 */
	public EditPart createEditPart(EditPart context, Object element) {
		
		EditPart editpart = null;
		
		if (element instanceof StateSpace) {
			if (manager==null) {
				throw new RuntimeException("No state space manager set");
			}
			editpart = new StateSpaceEditPart();			
			((StateSpaceEditPart) editpart).setStateSpaceManager(manager);
		}
		
		else if (element instanceof State) {
			editpart = new StateEditPart();
		}
		
		else if (element instanceof Transition) {
			editpart = new TransitionEditPart();
		}
		
		else throw new RuntimeException(
				"Can't create part for model element: "
				+ ((element != null) ? element.getClass().getName() : "null"));

		// Store the model element in the edit part.
		editpart.setModel(element);
		return editpart;
		
	}

	public void setStateSpaceManager(StateSpaceManager manager) {
		this.manager = manager;
	}

}