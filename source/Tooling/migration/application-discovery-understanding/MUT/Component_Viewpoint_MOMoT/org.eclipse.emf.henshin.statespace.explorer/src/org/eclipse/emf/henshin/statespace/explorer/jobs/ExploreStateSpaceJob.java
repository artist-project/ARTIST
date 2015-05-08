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

import java.text.DecimalFormat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.explorer.StateSpaceExplorerPlugin;
import org.eclipse.emf.henshin.statespace.explorer.commands.ExploreStatesCommand;
import org.eclipse.emf.henshin.statespace.util.StateSpaceExplorationHelper;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.commands.Command;

/**
 * State space exploration job.
 * @author Christian Krause
 */
public class ExploreStateSpaceJob extends AbstractStateSpaceJob {
	
	// Exploration helper:
	private final StateSpaceExplorationHelper helper;
	
	// Edit domain.
	protected final EditDomain editDomain;

	// Clean up interval (default is 30 minutes):
	private int cleanupInterval = 1800;

	// Save interval (default is 30 minutes):
	private int saveInterval = 1800;
	
	// Whether to log some info after the exploration is finished.
	protected boolean logInfo = true;

	/**
	 * Default constructor.
	 * @param manager State space manager.
	 */
	public ExploreStateSpaceJob(StateSpaceManager manager, EditDomain editDomain, int stepDuration) {
		super("Exploring state space...", manager);
		this.editDomain = editDomain;
		this.helper = new StateSpaceExplorationHelper(manager, stepDuration);
		this.helper.setGenerateLocations(false);
		setUser(true);
		setPriority(LONG);
	}

	/**
	 * Default constructor.
	 * @param manager State space manager.
	 */
	public ExploreStateSpaceJob(StateSpaceManager manager, EditDomain editDomain) {
		this(manager, editDomain, 800);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		// Explore the state space...
		monitor.beginTask("Exploring state space...", IProgressMonitor.UNKNOWN);
		
		// State space manager and state space:
		StateSpaceManager manager = getStateSpaceManager();
		StateSpace stateSpace = manager.getStateSpace();
		
		DecimalFormat largeFormat = new DecimalFormat("#,###,###,##0");
		DecimalFormat speedFormat = new DecimalFormat("###,##0.0");
		
		// Measure how long it takes...
		long start = System.currentTimeMillis();
		long lastSave = start;
		long lastCleanup = start;
		int initialClosedStateCount = stateSpace.getStates().size() - stateSpace.getOpenStates().size();
		boolean moreStates = true;
		
		try {
			
			// Run until canceled or no more open states...
			while (moreStates && !monitor.isCanceled()) {
				
				// Execute the explore command:
				ExploreStatesCommand command = new ExploreStatesCommand(helper);
				command.setCallingJob(this);
				executeExploreCommand(command, monitor);
				moreStates = command.getResult();
				
				// Update the monitor:
				int states = stateSpace.getStates().size();
				double speed = helper.getCurrentSpeed();
				monitor.subTask(largeFormat.format(states) + " states ("
							+ largeFormat.format(stateSpace.getOpenStates().size()) + " open), " 
							+ largeFormat.format(stateSpace.getTransitionCount()) + " transitions. Exploring "
							+ speedFormat.format(speed) + " states/second...");

				// Should we stop?
				if (monitor.isCanceled()) break;

				// Perform a clean up?
				long current = System.currentTimeMillis();
				if (cleanupInterval>=0 && current > (lastCleanup + (cleanupInterval*1000))) {
					clearCache(monitor);
					lastCleanup = System.currentTimeMillis();
				}

				// Perform a save?
				if (saveInterval>=0 && current > (lastSave + (saveInterval*1000))) {
					monitor.subTask("Saving state space...");
					saveStateSpace();
					lastSave = System.currentTimeMillis();
				}
				
			}
		
		} catch (Throwable e) {
			return new Status(IStatus.ERROR, StateSpaceExplorerPlugin.ID, 0, "Error exploring state space", e);
		}
		
		// Measure time again:
		long end = System.currentTimeMillis();
		
		// Clear some memory before we do the saving:
		clearCache(monitor);
		
		// Save the state space:
		if (saveInterval>=0 && !isAborted()) {
			monitor.subTask("Saving state space...");
			saveStateSpace();
		}
		
		// Final message:
		if (logInfo && !isAborted()) {
			int finalClosedStateCount = stateSpace.getStates().size() - stateSpace.getOpenStates().size();
			int explored = finalClosedStateCount - initialClosedStateCount;
			String statesPerSec = "";
			if (end>start) {
				statesPerSec = " (" + speedFormat.format((double) (1000 * explored) / (double) (end-start)) + " states/second)";
			}
			StateSpaceExplorerPlugin.getInstance().logInfo(
					"Explored " + explored + " states in " + ((end-start)/1000) + " seconds" + statesPerSec);
		}
		
		// Now we are done:
		return new Status(IStatus.OK, StateSpaceExplorerPlugin.ID, 0, null, null);
		
	}
	
	/*
	 * Clear state model cache.
	 */
	private void clearCache(IProgressMonitor monitor) {
		monitor.subTask("Clearing state model cache...");
		getStateSpaceManager().clearCache();
	}
	
	/*
	 * Execute an explore command. Subclasses can override this.
	 */
	protected void executeExploreCommand(final Command command, IProgressMonitor monitor) {
		editDomain.getCommandStack().execute(command);
	}
	
	/**
	 * Set the save interval in seconds.
	 * @param seconds Save interval.
	 */
	public void setSaveInterval(int seconds) {
		this.saveInterval = seconds;
	}

	/**
	 * Set the cleanup interval in seconds.
	 * @param seconds Cleanup interval.
	 */
	public void setCleanupInterval(int seconds) {
		this.cleanupInterval = seconds;
	}
	
	public StateSpaceExplorationHelper getExplorationHelper() {
		return helper;
	}
	
}
