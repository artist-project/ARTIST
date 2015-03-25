/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import java.util.List;

/**
 * Interface for state space managers. State managers are used to
 * modify and explore state spaces. They extend the functionality
 * of state space indexes.
 * 
 * @author Christian Krause
 * @generated NOT
 */
public interface StateSpaceManager extends StateSpaceIndex {
	
	/**
	 * Debug flag: enforces deterministic behavior of state space manager.
	 */
	public static final boolean DEBUG_ENFORCE_DETERMINISM = false;

	/**
	 * Create a new initial state to the state space. This throws a 
	 * runtime exception if the state is not contained in a resource.
	 * If there is already a state for it, it is returned instead.
	 * @param model Model of the initial state.
	 * @return The newly created state.
	 * @exception StateSpaceException If the state space contains errors.
	 */
	State createInitialState(Model model) throws StateSpaceException;
	
	/**
	 * Remove a state from the state space. Unreachable states are automatically
	 * removed afterwards and the open-attributes are updated.
	 * @param state State to be removed.
	 * @return List of removed states.
	 * @exception StateSpaceException If the state space contains errors.
	 */
	List<State> removeState(State state) throws StateSpaceException;
	
	/**
	 * Merge all terminal states
	 * @return List of removed states.
	 * @throws StateSpaceException If the state space contains errors.
	 */
	List<State> mergeTerminalStates() throws StateSpaceException;

	
	/**
	 * Explore a state. This computes all outgoing transitions
	 * and their target states and adds them to the state space
	 * if they do not exist yet.
	 * @param state State to be explored.
	 * @param generateLocation Whether to generate a location for the new states.
	 * @return List of newly created successor states.
	 * @exception StateSpaceException If the state space contains errors.
	 */
	List<State> exploreStates(List<State> states, boolean generateLocations) throws StateSpaceException;
	
	/**
	 * Get the shortest distance of a state from an arbitrary initial state.
	 * Implementations should provide this method if the maximum state distance
	 * property of the state space is non-negative.
	 * @param state State.
	 * @return Its distance from an initial state.
	 */
	int getStateDistance(State state);
	
	/**
	 * Reset the state space managed by this instance.
	 * This removes all derived states and all transitions.
	 * @param remobeInitial Determines whether also initial states should be removed.
	 * @throws StateSpaceException On errors.
	 */
	void resetStateSpace(boolean removeInitial) throws StateSpaceException;
	
	/**
	 * Get the number of threads used by this state manager.
	 * @return The number of used threads.
	 */
	int getNumThreads();
	
	/**
	 * Shutdown this state space manager.
	 */
	void shutdown();
	
}
