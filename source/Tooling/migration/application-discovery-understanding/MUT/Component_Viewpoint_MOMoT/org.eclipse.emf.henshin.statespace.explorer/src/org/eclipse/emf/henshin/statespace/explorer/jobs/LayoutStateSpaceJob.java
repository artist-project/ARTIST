/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.layout.StateSpaceSpringLayouter;
import org.eclipse.swt.widgets.Display;

/**
 * Layouter job for state spaces.
 * @author Christian Krause
 */
public class LayoutStateSpaceJob extends Job {
		
	// Layouter:
	private StateSpaceSpringLayouter layouter;
	
	// State space to be layouted:
	private StateSpace stateSpace;
	
	/**
	 * Default constructor.
	 * @param stateSpace State space.
	 * @param display Display.
	 */
	public LayoutStateSpaceJob(StateSpace stateSpace) {
		super("Layouting state space");
		setPriority(LONG);
		this.stateSpace = stateSpace;
		
		// Create layouter:
		layouter = new StateSpaceSpringLayouter();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		// Reinitialize the layouter:
		layouter.setStateSpace(stateSpace);

		while (!monitor.isCanceled()) {
			
			// Calculate new positions:
			try {
				layouter.update();
			} catch (Throwable t) {
				t.printStackTrace();
				return new Status(IStatus.ERROR, StateSpaceExplorerPlugin.ID, 0, "Error layouting state space", t);
			}
			
			// Update positions:
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						layouter.commit();
					} catch (Throwable t) {
						// Catch and ignore potential exceptions.
					}
				}
			});
			
			// Sleep:
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			
		}
		
		// Done.
		return new Status(IStatus.OK, StateSpaceExplorerPlugin.ID, 0, null, null);
		
	}
	
	public StateSpaceSpringLayouter getLayouter() {
		return layouter;
	}
	
}
