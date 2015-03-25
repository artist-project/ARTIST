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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;

/**
 * Parallelized {@link StateSpaceManager} implementation.
 * 
 * @author Christian Krause
 * @generated NOT
 */
public class ParallelStateSpaceManager extends BasicStateSpaceManager {
	
	// Executor service.
	private ExecutorService executor;

	// Workers.
	private ExplorationWorker[] workers;

	// Future objects.
	private Future<StateSpaceException>[] futures;

	// States to be explored:
	private List<State> states;
	
	// Result list:
	private List<State> result;
	
	// Whether to generate locations:
	private boolean generateLocations;

	/**
	 * Default constructor.
	 * @param stateSpace State space.
	 * @param numThreads Number of threads to be used.
	 */
	@SuppressWarnings("unchecked")
	public ParallelStateSpaceManager(StateSpace stateSpace, int numThreads) {
		super(stateSpace);
		numThreads = Math.max(numThreads, 1);
		executor = Executors.newFixedThreadPool(numThreads);
		futures = new Future[numThreads];
		workers = new ExplorationWorker[numThreads];
		for (int i=0; i<workers.length; i++) {
			workers[i] = new ExplorationWorker();
		}
	}

	/**
	 * Default constructor.
	 * @param stateSpace State space.
	 */
	public ParallelStateSpaceManager(StateSpace stateSpace) {
		this(stateSpace, Runtime.getRuntime().availableProcessors());
	}

	/**
	 * Explore states concurrently.
	 * @param states States to be explored.
	 * @param generateLocations Whether to generate locations.
	 * @return Newly created successor states.
	 * @throws StateSpaceException On state space errors.
	 */
	@Override
	public synchronized List<State> exploreStates(List<State> states, boolean generateLocations) throws StateSpaceException {
		
		//System.out.println();
		
		// We use a new list for the states:
		this.generateLocations = generateLocations;
		this.states = Collections.synchronizedList(new LinkedList<State>(states));
		this.result = Collections.synchronizedList(new LinkedList<State>());
		
		try {
			// Launch the workers:
			for (int i=0; i<workers.length; i++) {
				futures[i] = executor.submit(workers[i]);
			}
			// Evaluate the results:
			for (int i=0; i<workers.length; i++) {
				StateSpaceException e = futures[i].get();
				if (e!=null) {
					throw e;
				}
			}
		} catch (Throwable t) {
			throw wrapException(t);
		}
		
		// Done:
		return result;
		
	}
	
	/*
	 * Wrap an exception.
	 */
	private StateSpaceException wrapException(Throwable t) {
		return (t instanceof StateSpaceException) ? (StateSpaceException) t : new StateSpaceException(t);
	}
	
	/*
	 * Private explorer worker class. Delegates to exploreState().
	 */
	private class ExplorationWorker implements Callable<StateSpaceException> {
		
		/*
		 * (non-Javadoc)
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public StateSpaceException call() {
			
			//System.out.println(Thread.currentThread().getId() + " starts...");

			while (true) {
								
				// Get the next state to be explored:
				State next;
				try {
					next = states.remove(0);
				}
				catch (IndexOutOfBoundsException e) {
					//System.out.println(Thread.currentThread().getId() + " stopped.");
					return null; // We are done.
				}

				// Now explore it:
				try {
					result.addAll(exploreState(next, generateLocations));
				}
				catch (Throwable t) {
					return wrapException(t);
				}
			}
			
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#getNumThreads()
	 */
	@Override
	public int getNumThreads() {
		return workers.length;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#shutdown()
	 */
	@Override
	public void shutdown() {
		super.shutdown();
		executor.shutdownNow();
	}

}
