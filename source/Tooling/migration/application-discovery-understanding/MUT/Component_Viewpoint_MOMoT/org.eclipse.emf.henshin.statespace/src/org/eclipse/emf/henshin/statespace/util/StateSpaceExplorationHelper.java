/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;

/**
 * An exploration helper class.
 * 
 * @author Christian Krause
 */
public class StateSpaceExplorationHelper {
	
	// Minimum amount of free memory that should be available: approx. 20%.
	private static final double MIN_FREE_MEMORY_PERC = 30;
	
	// Minimum and maximum intervals for the free memory checks (in seconds):
	private static final int MIN_FREE_MEM_CHECK_INTERVAL = 10;
	private static final int MAX_FREE_MEM_CHECK_INTERVAL = 900;
	
	// State space manager:
	private final StateSpaceManager manager;

	// Expected duration of an exploration step in milliseconds:
	private int expectedDuration;
	
	// Duration of the last exploration step:
	private int lastDuration = expectedDuration;
	
	// Last and next free memory checks:
	private long lastFreeMemCheck, nextFreeMemCheck;
	private double lastFreeMemPerc;
	
	// Number of states to be explored at once:
	private int blockSize, minBlockSize, maxBlockSize;
	
	// Next states to be explored:
	private Set<State> nextStates;
	
	// Whether to generate locations:
	private boolean generateLocations;
	
	// Count the number of steps performed:
	private int steps;
	
	// Record how fast we were during the last steps:
	private double[] lastSpeeds;
	
	/**
	 * Constructor.
	 * @param manager State space manager.
	 */
	public StateSpaceExplorationHelper(StateSpaceManager manager, int stepDuration) {
		
		this.manager = manager;
		this.expectedDuration = stepDuration;
		this.generateLocations = false;
		this.nextStates = new LinkedHashSet<State>();
		this.lastSpeeds = new double[10];
		this.steps = 0;
		
		// Block sizes:
		this.blockSize = 10;
		this.minBlockSize = manager.getNumThreads() * 4;
		this.maxBlockSize = 2000;
		
		// Free memory checks:
		System.gc();
		this.lastFreeMemPerc = getFreeMemPerc();
		this.lastFreeMemCheck = System.currentTimeMillis();
		this.nextFreeMemCheck = lastFreeMemCheck + 60000;  // first check after 1 minute
		//System.out.println("Free memory: " + lastFreeMemPerc + "%");
		
	}
	
	/**
	 * Constructor.
	 * @param manager State space manager.
	 */
	public StateSpaceExplorationHelper(StateSpaceManager manager) {
		this(manager, 2000);
	}

	
	/**
	 * Do an exploration step.
	 * @throws StateSpaceException On state space errors.
	 */
	public boolean doExplorationStep() throws StateSpaceException {
		
		// Measure how long it takes:
		long startTime = System.currentTimeMillis();
		
		// Adjust the number of states to be explored in one step:
		double speedChange = rangeCheck((double) expectedDuration / (double) lastDuration, 0.5, 2);
		if (!StateSpaceManager.DEBUG_ENFORCE_DETERMINISM) {
			blockSize = rangeCheck((int) ((double) blockSize * speedChange), minBlockSize, maxBlockSize);
		}
		
		/* Update the list of next states to be explored. */
		
		// Remove explored states:
		Iterator<State> iterator = nextStates.iterator();
		while (iterator.hasNext()) {
			State state = iterator.next();
			if (!state.isOpen()) {
				iterator.remove();
			}
		}
		
		// Remove too distant states if necessary:
		int maxStateDistance = manager.getStateSpace().getMaxStateDistance();
		if (maxStateDistance>=0) {
			iterator = nextStates.iterator();
			while (iterator.hasNext()) {
				State state = iterator.next();
				if (maxStateDistance<=manager.getStateDistance(state)) {
					iterator.remove();
				}
			}
		}

		// Add new states to be explored:
		for (State open : manager.getStateSpace().getOpenStates()) {
			if (nextStates.size()>=blockSize) {
				break;
			}
			if (maxStateDistance<0 || maxStateDistance>manager.getStateDistance(open)) {
				nextStates.add(open);
			}
		}
		
		// Nothing left to do?
		if (nextStates.isEmpty()) {
			return false;
		}
		
		// How many state we can really explore:
		int realSize = Math.min(blockSize, nextStates.size());	
		
		// States to be explored right now:
		List<State> exploreNow = new ArrayList<State>(realSize);
		Iterator<State> it = nextStates.iterator();
		for (int i=0; i<realSize; i++) {
			exploreNow.add(it.next());
			it.remove();
		}
		
		// Explore the next states:
		List<State> result = manager.exploreStates(exploreNow, generateLocations);
		
		// We want to use the new states in the next step:
		Set<State> oldNextStates = nextStates;
		nextStates = new LinkedHashSet<State>();
		nextStates.addAll(result);
		it = oldNextStates.iterator();
		int maxStates = 2 * blockSize;
		while (it.hasNext() && nextStates.size()<maxStates) {
			nextStates.add(it.next());
		}
		//System.out.println(nextStates.size());
		
		// Update the last duration value:
		long endTime = System.currentTimeMillis();

		// Record the speed:
		lastDuration = rangeCheck((int) (endTime - startTime), 1, 10*expectedDuration);
		lastSpeeds[steps % lastSpeeds.length] = (1000.0d * (double) realSize) / (double) lastDuration;

		// Free memory check?
		if (endTime>=nextFreeMemCheck) {
			
			System.gc();
			double freeMemPerc = getFreeMemPerc();
			double lostPerc = Math.max(lastFreeMemPerc - freeMemPerc, 0);

			// Percent of free memory that we lose per second:
			double percPerSec = lostPerc / ((((double) (endTime - lastFreeMemCheck)) / 1000));
			
			// Check if we reached the threshold:
			System.out.print("Free memory: " + freeMemPerc + "%");
			if (freeMemPerc < MIN_FREE_MEMORY_PERC) {
				System.out.print(" Clearing cache.");
				manager.clearCache();
				System.gc();
				freeMemPerc = getFreeMemPerc();
			}
			
			// Now estimate the next time where we should check the free memory.
			
			// Percent of memory that we need to lose until we reach the threshold:
			double percToLose = freeMemPerc - (MIN_FREE_MEMORY_PERC * 0.5);
			
			// Amount of seconds until we lose them:
			long expectedSec = Math.min(Math.max((int) (percToLose / percPerSec), MIN_FREE_MEM_CHECK_INTERVAL), MAX_FREE_MEM_CHECK_INTERVAL);
			System.out.println(" (checking again in " + expectedSec + " seconds)");
			
			lastFreeMemPerc = freeMemPerc;
			lastFreeMemCheck = endTime;
			nextFreeMemCheck = endTime + (expectedSec*1000);
			
		}
		
		// Increase steps count:
		steps++;
				
		// Done for this cycle.
		return true;
		
	}
	
	private double getFreeMemPerc() {
		return 100.0 * ((double) Runtime.getRuntime().freeMemory() / (double) Runtime.getRuntime().maxMemory());
	}
	
	private int rangeCheck(int value, int min, int max) {
		return (value<min) ? min : ((value>max) ? max : value);
	}

	private double rangeCheck(double value, double min, double max) {
		return (value<min) ? min : ((value>max) ? max : value);
	}

	public StateSpaceManager getStateSpaceManager() {
		return manager;
	}
	
	public void setGenerateLocations(boolean generateLocations) {
		this.generateLocations = generateLocations;
	}
	
	public double getCurrentSpeed() {
		if (steps<=0) {
			return 0d;
		} else {
			double speed = 0d;
			int count = Math.min(steps, lastSpeeds.length);
			for (int i=0; i<count; i++) {
				speed += lastSpeeds[i];
			}
			return speed / (double) count;
		}
	}
	
	/**
	 * Automatically do a state space exploration.
	 * @param maxStates Maximum total number of states.
	 * @param monitor Progress monitor.
	 * @throws StateSpaceException On errors.
	 */
	public void doExploration(int maxStates, IProgressMonitor monitor) throws StateSpaceException {
		
		if (monitor==null) {
			monitor = new NullProgressMonitor();
		}
		monitor.beginTask("Exploring state space...", maxStates);
		
		// Number of explored states:
		int explored = manager.getStateSpace().getStateCount();
		boolean changed = true;
		monitor.worked(explored);
		
		// Explore until finished, canceled or maximum state count is reached:
		while (changed && !monitor.isCanceled() && 
				(maxStates<0 || manager.getStateSpace().getStateCount()<=maxStates)) {
			
			// Do an exp0loration step:
			changed = doExplorationStep();
			monitor.worked(manager.getStateSpace().getStateCount() - explored);
			explored = manager.getStateSpace().getStateCount();
		}
		
		// Done.
		monitor.done();
		
	}
	
}
