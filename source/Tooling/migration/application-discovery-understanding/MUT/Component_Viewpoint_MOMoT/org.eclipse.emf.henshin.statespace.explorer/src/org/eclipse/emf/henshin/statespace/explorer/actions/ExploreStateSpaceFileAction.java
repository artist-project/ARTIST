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

import org.eclipse.emf.henshin.statespace.explorer.jobs.ExploreStateSpaceJob;
import org.eclipse.gef.EditDomain;
import org.eclipse.jface.action.IAction;

/**
 * Action for exploring open states in a state space file.
 * @author Christian Krause
 */
public class ExploreStateSpaceFileAction extends AbstractStateSpaceFileAction {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.actions.AbstractStateSpaceFileAction#doRun(org.eclipse.jface.action.IAction)
	 */
	public void doRun(IAction action) {
		
		// Run exploration job.
		ExploreStateSpaceJob job = new ExploreStateSpaceJob(getStateSpaceManager(), new EditDomain());
		job.schedule();
		
		// We don't need the state space anymore.
		setStateSpaceManager(null);
		
	}
	
}
