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
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Display;

/**
 * Explore open states job with display support.
 * @author Christian Krause
 */
public class ExploreStateSpaceJobWithDisplay extends ExploreStateSpaceJob {

	// Execution flag:
	private boolean executing;
	
	// Delay in milliseconds:
	private int delay = 750;
	
	/**
	 * Default constructor.
	 * @param manager State space manager.
	 * @param editDomain Edit domain.
	 */
	public ExploreStateSpaceJobWithDisplay(StateSpaceManager manager, EditDomain editDomain) {
		super(manager, editDomain, 80);
		
		// Always run in background:
		setUser(false);
		
		// No Log message in the end:
		logInfo = false;
		
		// We don't want automatic saves:
		setSaveInterval(-1);
		
		// We need to generate locations:
		getExplorationHelper().setGenerateLocations(true);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.jobs.ExploreOpenStatesJob#executeExploreCommand(org.eclipse.gef.commands.Command, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void executeExploreCommand(final Command command, IProgressMonitor monitor) {
		
		// Execute the command in the display-thread.
		executing = true;
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					editDomain.getCommandStack().execute(command);
				} catch (Throwable t) {
					StateSpaceExplorerPlugin.getInstance().logError("Error exploring state", t);
				} finally {
					executing = false;
				}
			}
		});

		// Sleep until done:
		do {
			int steps = (delay / 25);
			if (steps<1) steps = 1;
			for (int j=0; j<steps; j++) {
				try { Thread.sleep(25); } 
				catch (InterruptedException e) {}
				if (monitor.isCanceled()) break;
			}
		} while (executing);

	}
	
	/**
	 * Set the delay in milliseconds
	 * @param delay The delay.
	 */
	public void setDelay(int delay) {
		this.delay = delay;
	}
	
}
