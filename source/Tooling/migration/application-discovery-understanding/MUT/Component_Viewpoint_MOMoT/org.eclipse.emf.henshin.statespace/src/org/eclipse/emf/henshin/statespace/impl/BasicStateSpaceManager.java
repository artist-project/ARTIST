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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.util.StateDistanceMonitor;
import org.eclipse.emf.henshin.statespace.util.StateSpaceSearch;

/**
 * Basic {@link StateSpaceManager} implementation.
 * 
 * @author Christian Krause
 * @generated NOT
 */
public class BasicStateSpaceManager extends StateSpaceIndexImpl implements StateSpaceManager {

	/** 
	 * State exploration helpers.
	 */
	protected final Stack<StateExplorer> explorers = new Stack<StateExplorer>();
	
	/** 
	 * A lock used when accessing the state space.
	 */
	protected final Object stateSpaceLock = new Object();

	/** 
	 * State distance monitor.
	 */
	protected StateDistanceMonitor stateDistanceMonitor;
	
	/**
	 * Maximum state distance.
	 */
	protected int maxStateDistance;
	
	/** 
	 * Flag indicating whether duplicate transitions with the same label should be ignored.
	 */
	protected boolean ignoreDuplicateTransitions;
	
	/**
	 * Default constructor.
	 * @param stateSpace State space.
	 */
	public BasicStateSpaceManager(StateSpace stateSpace) {
		super(stateSpace);
		refreshHelpers();
	}
	
	/*
	 * Refresh the helpers.
	 */
	protected void refreshHelpers() {
		getStateSpace().updateEqualityHelper();
		String ign = getStateSpace().getProperties().get(StateSpace.PROPERTY_IGNORE_DUPLICATE_TRANSITIONS);
		ignoreDuplicateTransitions = (ign!=null) && (ign.trim().equalsIgnoreCase("true") || ign.trim().equalsIgnoreCase("yes"));
		maxStateDistance = getStateSpace().getMaxStateDistance();
		if (maxStateDistance>=0) {
			stateDistanceMonitor = new StateDistanceMonitor(getStateSpace());
		} else {
			stateDistanceMonitor = null;
		}
		clearCache();
	}
	
	/*
	 * Decide whether a state is open.
	 */
	protected boolean isOpen(State state) throws StateSpaceException {
		
		// Do a dry exploration of the state:
		StateExplorer explorer = acquireExplorer();
		List<Transition> transitions = explorer.doExplore(state);
		Set<Transition> matched = new HashSet<Transition>();
		
		for (Transition current : transitions) {
			
			// Find the corresponding target state in the state space.
			State generated = current.getTarget();
			State target = getState(generated.getModel(), generated.getHashCode());
			if (target==null) {
				releaseExplorer(explorer);
				return true;
			}
			
			// Find the corresponding outgoing transition:
			Transition transition = state.getOutgoing(target, current.getRule(), current.getMatch(), current.getParameterKeys());
			if (transition==null) {
				releaseExplorer(explorer);
				return true;
			}
			matched.add(transition);
			
		}		
		releaseExplorer(explorer);

		// Check if there are extra transitions (illegal):
		if (!matched.containsAll(state.getOutgoing())) {
			throw new StateSpaceException("Illegal transition in state " + state.getIndex());
		}
		
		// State is not open:
		return false;
		
	}

	/**
	 * Create a new open state in the state space. Warning: this does not check if an 
	 * equivalent state exists already or whether the hash code is incorrect.
	 * @param model Its model.
	 * @param hash The model's hash code.
	 * @return The newly created state.
	 */
	protected final State createOpenState(Model model, int hash, State derivedFrom, int[] location) {
		
		// Create a new state instance:
		State state = new StateImpl();
		state.setIndex(getStateSpace().getStates().size());
		state.setHashCode(hash);
		state.setDerivedFrom(derivedFrom!=null ? derivedFrom.getIndex() : -1);
		state.setModel(model);
		state.setOpen(true);
		
		// Set the location, if set:
		if (location!=null) {
			state.setLocation(location);
		}
		
		// Set the object keys, if required:
		if (!getStateSpace().getEqualityHelper().getIdentityTypes().isEmpty()) {
			int[] objectKeys = model.getObjectKeys();
			state.setObjectKeys(objectKeys);
			state.setObjectCount(objectKeys.length);
		}
		
		// Add the state to the state space:
		getStateSpace().getStates().add(state);
		getStateSpace().getOpenStates().add(state);
		if (stateDistanceMonitor!=null) {
			stateDistanceMonitor.updateDistance(state);
		}
		
		// Add the state to the index:
		addToIndex(state);
		return state;

	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#createInitialState(org.eclipse.emf.ecore.resource.Resource)
	 */
	public final State createInitialState(Model model) throws StateSpaceException {
		
		// Check if the resource is persisted:
		Resource resource = model.getResource();
		if (resource==null || resource.getURI()==null) {
			throw new IllegalArgumentException("Model is not persisted");
		}
		
		// Resolve all objects in the model:
		EcoreUtil.resolveAll(model);
		
		// Make sure the objects keys are set:
		if (!getStateSpace().getEqualityHelper().getIdentityTypes().isEmpty()) {
			model.updateObjectKeys(getStateSpace().getEqualityHelper().getIdentityTypes());
		}
		
		// Compute the hash code of the model:
		int hash = getStateSpace().getEqualityHelper().hashCode(model);
		
		// Look for an existing state:
		State state = getState(model,hash);
		if (state!=null) return state;
		
		// Otherwise create a new state:
		State initial = createOpenState(model, hash, null, null);
		synchronized (stateSpaceLock) {
			getStateSpace().getInitialStates().add(initial);
			if (stateDistanceMonitor!=null) {
				stateDistanceMonitor.updateDistance(state);
			}
		}
		return initial;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#removeState(org.eclipse.emf.henshin.statespace.State)
	 */
	public final List<State> removeState(State state) throws StateSpaceException {
		
		// List of removed states:
		List<State> removed = new ArrayList<State>();
		
		// Remove state and all unreachable states:
		synchronized (stateSpaceLock) {
			
			// Remove the state and all reachable states:
			if (getStateSpace().removeState(state)) {
				removed.addAll(StateSpaceSearch.removeUnreachableStates(getStateSpace()));
				removed.add(state);
			}
			
			// Remove the states from the index and adjust the transition count:
			Set<Transition> transitions = new HashSet<Transition>();
			for (State current : removed) {
				
				// Remove from index:
				removeFromIndex(current);
				
				// Gather all transitions:
				transitions.addAll(current.getOutgoing());
				transitions.addAll(current.getIncoming());
				
			}
			
			// Update transition count:
			int number = getStateSpace().getTransitionCount() - transitions.size();
			getStateSpace().setTransitionCount(number);
			
		}
		
		// Done.
		return removed;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#mergeTerminalState()
	 */
	@Override
	public List<State> mergeTerminalStates() throws StateSpaceException {

		List<State> removed = new ArrayList<State>();

		synchronized (stateSpaceLock) {
			List<State> states = getStateSpace().getStates();
			
			// Sort of terminal state:
			State goal = null, pruned = null, deadlock = null;
			
			for (int i=0; i<states.size(); i++) {
				State state = states.get(i);
				
				// We need to update the index:
				state.setIndex(i);
				
				// Must be closed and terminal:
				if (!state.isOpen() && state.getOutgoing().isEmpty()) { 
					if (state.isGoal()) {
						goal = mergeTerminalStates(goal, state);
					}
					else if (state.isPruned()) {
						pruned = mergeTerminalStates(pruned, state);
					}
					else {
						deadlock = mergeTerminalStates(deadlock, state);	
					}
					if (i>=states.size() || states.get(i)!=state) {
						i--;
					}
				}
			}
		}
		return removed;
		
	}
	
	/*
	 * Private helper for merging terminal states.
	 */
	private State mergeTerminalStates(State base, State state) {
		if (base==null) {
			return state;
		}
		if (!state.isInitial()) {
			base.getIncoming().addAll(state.getIncoming());
			getStateSpace().removeState(state);
			removeFromIndex(state);
		}
		return base;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#resetStateSpace(boolean)
	 */
	public final void resetStateSpace(boolean removeInitial) throws StateSpaceException {
		
		// Remove derived states and all transitions:
		synchronized (stateSpaceLock) {
			
			// Remove all states except the initial ones:
			StateSpace stateSpace = getStateSpace();
			stateSpace.getStates().clear();
			stateSpace.getOpenStates().clear();
			if (removeInitial) {
				stateSpace.getInitialStates().clear();
			} else {
				stateSpace.getStates().addAll(stateSpace.getInitialStates());
			}

			// Refresh the helpers:
			refreshHelpers();

			// Reset the state index:
			resetIndex();
			
			EqualityHelper equalityHelper = stateSpace.getEqualityHelper();
			int stateIndex = 0;
			for (State state : stateSpace.getStates()) {
				
				// Reset the state index:
				state.setIndex(stateIndex++);
				
				// Remove transitions:
				state.getOutgoing().clear();
				state.getIncoming().clear();
				
				// Default flags:
				state.setOpen(true);
				state.setPruned(false);
				state.setGoal(false);
				
				// Derived from nowhere:
				state.setDerivedFrom(-1);
				
				// Reset the object keys:
				Model model = state.getModel();
				model.setObjectKeys(StorageImpl.EMPTY_DATA);
				if (!equalityHelper.getIdentityTypes().isEmpty()) {
					model.updateObjectKeys(equalityHelper.getIdentityTypes());
				}
				state.setObjectKeys(model.getObjectKeys());
				
				// Update object count:
				state.setObjectCount(model.getEGraph().size());

				// Update the hash code (also updates the object hash codes):
				int hash = equalityHelper.hashCode(model);
				if (getState(model,hash)!=null) {
					throw new StateSpaceException("Duplicate state: " + state.getIndex());
				}
				state.setHashCode(hash);

				// Add the state to the index:
				addToIndex(state);
			}
			
			// Reset the transition count:
			stateSpace.setTransitionCount(0);

		}
		
	}
	
	/*
	 * Helper method for finding a state in a list.
	 */
	protected State findState(Model model, int hashCode, Collection<State> states) throws StateSpaceException {
		for (State state : states) {
			if (hashCode==state.getHashCode() && 
				getStateSpace().getEqualityHelper().equals(model,getModel(state))) {
				return state;
			}
		}
		return null;
	}

	/**
	 * Get the distance of a state to an initial state.
	 * This returns the correct distance only if the
	 * maximum state distance of the state space is positive.
	 * Otherwise the distance is not relevant and therefore not stored.
	 * @param state The state.
	 * @return Its distance from an initial state, or -1 if not available.
	 */
	@Override
	public int getStateDistance(State state) {
		if (stateDistanceMonitor!=null) {
			return stateDistanceMonitor.getDistance(state);
		} else {
			return -1;
		}
	}
		
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.StateSpaceIndexImpl#deriveModel(org.eclipse.emf.henshin.statespace.State, boolean)
	 */
	@Override
	protected Model deriveModel(State state, boolean fromInitial) throws StateSpaceException {
		StateExplorer explorer = acquireExplorer();
		Model model = explorer.deriveModel(state, fromInitial);
		releaseExplorer(explorer);
		return model;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#exploreStates(java.util.List, boolean)
	 */
	public List<State> exploreStates(List<State> states, boolean generateLocation) throws StateSpaceException {
		List<State> result = new ArrayList<State>();
		try {
			for (State state : states) {
				result.addAll(exploreState(state, generateLocation));
			}
		} catch (Throwable t) {
			if (t instanceof StateSpaceException) {
				throw (StateSpaceException) t;
			} else {
				throw new StateSpaceException(t);
			}
		}
		return result;
	}

	/**
	 * Explore a given state.
	 * @param state State to be explored.
	 * @param generateLocation Whether to generate locations for the new state.
	 * @return List of newly created successor states.
	 * @throws StateSpaceException On errors.
	 */
	protected List<State> exploreState(State state, boolean generateLocation) throws StateSpaceException {
		
		// Check if we exceeded the maximum state distance:
		if (maxStateDistance>=0 && getStateDistance(state)>=maxStateDistance) {
			
			// START OF STATE SPACE LOCK
			synchronized (stateSpaceLock) {
				state.setOpen(false);
				state.setPruned(true);
			}
			// END OF STATE SPACE LOCK
			return Collections.emptyList();
		}

		// We need an explorer now:
		StateExplorer explorer = acquireExplorer();

		// Check if it is a goal state:
		if (explorer.isGoalState(state)) {
			
			// START OF STATE SPACE LOCK
			synchronized (stateSpaceLock) {
				state.setOpen(false);
				state.setPruned(true);
				state.setGoal(true);
			}
			// END OF STATE SPACE LOCK
			return Collections.emptyList();
		}
		
		// For debugging purposes:
		// checkEngineDeterminism(state);
		
		// Explore the state without changing the state space.
		// This can take some time. So no lock here.
		List<Transition> transitions = explorer.doExplore(state);
		
		if (transitions.isEmpty()) {
			releaseExplorer(explorer);
			
			// START OF STATE SPACE LOCK
			synchronized (stateSpaceLock) {
				// Mark the state as closed:
				state.setOpen(false);
			}
			// END OF STATE SPACE LOCK
			return Collections.emptyList();
		}

		// Initialize the result.
		int newStates = 0;
		List<State> result = new ArrayList<State>(transitions.size());

		// Now check which states or transitions need to be added.
		int count = transitions.size();
		for (int i=0;i<count; i++) {

			// Transition details:
			Transition t = transitions.get(i);
			Rule rule = t.getRule();
			int match = t.getMatch();
			int[] parameters = t.getParameterKeys();

			// Get the hash and model of the new target state:
			int hashCode = t.getTarget().getHashCode();
			Model transformed = t.getTarget().getModel();
			
			// New state? Generate location?
			boolean newState = false;
			int[] location = generateLocation ? shiftedLocation(state, newStates++) : null;

			// Try to find the target state without locking the state space:
			State target;
			try {
				target = getState(transformed, hashCode);
			} catch (Throwable e) {
				target = null;
			}

			// START OF STATE SPACE LOCK
			synchronized (stateSpaceLock) {

				// Check if an equivalent state has been added in the meantime.
				if (target==null) {
					target = getState(transformed, hashCode);
				} 
				// Check if the found state has been removed in the meantime.
				else if (target.getStateSpace()==null) {
					target = null;
				}

				// Ok, now we can create a new state if necessary.
				if (target==null) {
					target = createOpenState(transformed, hashCode, state, location);
					newState = true;
				}

				// Find or create the transition.
				int m = ignoreDuplicateTransitions ? -1 : match;
				if (newState || state.getOutgoing(target, rule, m, parameters)==null) {
					t.setSource(state);
					t.setTarget(target);
					getStateSpace().incTransitionCount();
					if (stateDistanceMonitor!=null) {
						stateDistanceMonitor.updateDistance(target);
					}
				}

				// Now that the transition is there, we can decide whether to cache the model.
				if (newState) {
					addToCache(target, transformed);
					result.add(target);
				}

				if (i==count-1) {
					// Mark the state as closed:
					state.setOpen(false);
				}
			}
			// END OF STATE SPACE LOCK

		}
		
		// Release the explorer again (not earlier).
		releaseExplorer(explorer);

		// Done: return the new states.
		return result;
		
	}	
		
	/*
	 * Acquire a state explorer.
	 */
	protected StateExplorer acquireExplorer() {
		synchronized (explorers) {
			try {
				return explorers.pop();
			} catch (Throwable t) {
				return new StateExplorer(this);
			}
		}
	}

	/*
	 * Release a state explorer again.
	 */
	protected void releaseExplorer(StateExplorer explorer) {
		synchronized (explorers) {
			explorers.push(explorer);
		}
	}
	
	/*
	 * Create a shifted location.
	 */
	protected static int[] shiftedLocation(State base, int index) {
		int[] location = base.getLocation();
		double angle = (Math.PI * index * 0.17d);
		location[0] += 60 * Math.cos(angle);
		location[1] += 60 * Math.sin(angle);
		return location;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#getNumThreads()
	 */
	@Override
	public int getNumThreads() {
		return 1;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#shutdown()
	 */
	@Override
	public void shutdown() {
		clearCache();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.impl.StateSpaceIndexImpl#clearCache()
	 */
	@Override
	public void clearCache() {
		super.clearCache();
		synchronized (explorers) {
			explorers.clear();
		}
		System.gc();
	}

}
