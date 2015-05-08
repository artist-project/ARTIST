/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * {@link StateSpaceManager} implementation for gathering profiling statistics.
 * 
 * @author Christian Krause
 */
public class ProfilingStateSpaceManager extends BasicStateSpaceManager {
	
	// Time needed for exploring states:
	protected long explorationTime = 0;
	
	// Time needed for deriving state models:
	protected long derivationTime = 0;
	
	// Time needed for finding states:
	protected long stateFindingTime = 0;
	
	// Last time when we printed out the stats:
	protected long lastPrintTime = System.currentTimeMillis();
	
	// Interval in which we print stats:
	protected long printInterval = 5000; // 5 seconds
	
	/**
	 * State explorer implementation with profiling support.
	 */
	private class ProfilingStateExplorer extends StateExplorer {

		/**
		 * Default constructor
		 * @param manager State space manager.
		 */
		public ProfilingStateExplorer(StateSpaceManager manager) {
			super(manager);
		}
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.statespace.impl.StateExplorer#doExplore(org.eclipse.emf.henshin.statespace.State)
		 */
		@Override
		public List<Transition> doExplore(State state) throws StateSpaceException {
			long time = System.currentTimeMillis();			
			List<Transition> result = super.doExplore(state);
			explorationTime += (System.currentTimeMillis() - time);
			if (time > lastPrintTime + printInterval) {
				printStats();
			}
			return result;			
		}
		
	};
	
	/**
	 * Default constructor.
	 * @param stateSpace State space.
	 */
	public ProfilingStateSpaceManager(StateSpace stateSpace) {
		super(stateSpace);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.StateSpaceIndexImpl#getState(org.eclipse.emf.henshin.statespace.Model, int)
	 */
	@Override
	protected State getState(Model model, int hash) throws StateSpaceException {
		long time = System.currentTimeMillis();
		State state = super.getState(model, hash);
		stateFindingTime += (System.currentTimeMillis() - time);		
		return state;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.SingleThreadedStateSpaceManager#findState(org.eclipse.emf.henshin.statespace.Model, int, java.util.Collection)
	 */
	@Override
	protected State findState(Model model, int hashCode, Collection<State> states) throws StateSpaceException {
		long time = System.currentTimeMillis();
		State state = super.findState(model, hashCode, states);
		stateFindingTime += (System.currentTimeMillis() - time);		
		return state;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.SingleThreadedStateSpaceManager#deriveModel(org.eclipse.emf.henshin.statespace.State, boolean)
	 */
	@Override
	protected Model deriveModel(State state, boolean fromInitial) throws StateSpaceException {
		long time = System.currentTimeMillis();		
		Model model = super.deriveModel(state, fromInitial);
		derivationTime += (System.currentTimeMillis() - time);		
		return model;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.SingleThreadedStateSpaceManager#acquireExplorer()
	 */
	@Override
	protected StateExplorer acquireExplorer() {
		synchronized (explorers) {
			try {
				return explorers.pop();
			} catch (Throwable t) {
				return new ProfilingStateExplorer(this);
			}
		}
	}

	public void printStats() {
		System.out.println("Exploration time:   " + explorationTime);
		System.out.println("State finding time: " + stateFindingTime);
		System.out.println("Derivation time:    " + derivationTime + "\n");
		lastPrintTime = System.currentTimeMillis();
	}
	
}
