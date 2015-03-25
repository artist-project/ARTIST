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

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;

/**
 * Default implementation of {@link StateSpaceIndex}.
 * 
 * @generated NOT
 * @author Christian Krause
 */
public class StateSpaceIndexImpl implements StateSpaceIndex {
	
	// Initial size of the index. We use a prime number.
	private static final int INITIAL_INDEX_SIZE = 4093;
	
	// State model cache:
	private final Map<State,Model> stateModelCache = 
			Collections.synchronizedMap(new StateSpaceCache<State,Model>());
	
	// The state space index:
	private State[][] index;
	
	// State space:
	private StateSpace stateSpace;
	
	// Number of entries in the index:
	private int entries;
	
	/**
	 * Default constructor. This fills the state index.
	 */
	public StateSpaceIndexImpl(StateSpace stateSpace) {
		if (stateSpace==null) {
			throw new NullPointerException();
		}
		this.stateSpace = stateSpace;
		resetIndex();
		for (State state : getStateSpace().getStates()) {
			addToIndex(state);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceIndex#getModel(org.eclipse.emf.henshin.statespace.State)
	 */
	@Override
	public Model getModel(State state) throws StateSpaceException {
		Model model = getCachedModel(state);
		if (model==null) {	
			model = deriveModel(state, false);
			if (model!=null) {
				addToCache(state, model);
			}
		}
		return model;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceIndex#getCachedModel(org.eclipse.emf.henshin.statespace.State)
	 */
	@Override
	public Model getCachedModel(State state) {
		Model model = state.getModel();
		if (model!=null) {
			return model;
		}
		return stateModelCache.get(state);
	}
	
	/*
	 * Add a model to a cache.
	 */
	protected void addToCache(State state, Model model) throws StateSpaceException {
		
		// Never lose initial state models!!!
		if (state.isInitial()) return;
		
		// Debug:
		// Compare real hash code with state hash code: 
		//Model derived = deriveModel(state, true);
		//int hashCode = getStateSpace().getEqualityHelper().hashCode(model);
		//int hashCode2 = getStateSpace().getEqualityHelper().hashCode(derived);	
		//if (hashCode!=state.getHashCode() || hashCode!=hashCode2) {
		//	throw new StateSpaceException("Attempted to store an invalid model for state " + state.getIndex());
		//}

		// Add the model to the cache:
		stateModelCache.put(state, model);

		// Number of states and index of the current state:
		int states = getStateSpace().getStateCount();
		int index = state.getIndex() + 1;	// always greater or equal 1

		//      States:  Stored:
		//      < 1,000     100%
		//     >= 1,000      50%
		//    >= 10,000      33%
		//   >= 100,000      25%
		int threshold = 5000;
		int stored = 1;
		while (states>=threshold) {
			threshold *= 10;
			stored++;
		}

		// Unset the model by chance:
		if (index % stored != 0) {
			model = null;
		}
					
		// Update the state:
		state.setModel(model);
		
	}
	
	/*
	 * Derive a model. Should be overridden by subclasses.
	 */
	protected Model deriveModel(State state, boolean fromInitial) throws StateSpaceException {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceManager#getState(org.eclipse.emf.henshin.statespace.Model)
	 */
	@Override
	public final State getState(Model model) throws StateSpaceException {
		return getState(model, stateSpace.getEqualityHelper().hashCode(model));
	}

	/**
	 * Get the state for a given model and its hash code.
	 * @param model State model.
	 * @param hash Its hash code.
	 * @return The corresponding state if it exists.
	 */
	protected State getState(Model model, int hash) throws StateSpaceException {
		
		// Check if the model is set:
		if (model==null) {
			throw new NullPointerException("Cannot look up state for null model");
		}
		
		// Find all possibly matching states:
		int position = hash2position(hash);
		State[] matched = index[position];
		if (matched==null) return null;
		
		// Check if one of them is the correct one:
		for (int i=0; i<matched.length; i++) {
			State cand = matched[i];
			if (cand==null || cand.getHashCode()!=hash) continue;
			Model current = getModel(cand);
			if (stateSpace.getEqualityHelper().equals(model, current)) {
				return cand;
			}
		}
		
		// Not found:
		return null;
		
	}
	
	/**
	 * Add a state to the index.
	 * @param state State to be added.
	 */
	public void addToIndex(State state) {
		
		// We resize if the index 50% filled:
		if (index.length < (2 * entries)) {
			grow();
		}
		
		// Get the hash code of the state:
		int hashcode = state.getHashCode();
		int position = hash2position(hashcode);
		
		// Need to create a new slot?
		if (index[position]==null) {
			index[position] = new State[4];
		}
		
		// Find the first free minor index:
		int minor = index[position].length;
		
		// Find an empty cell in the slot:
		for (int i=0; i<index[position].length; i++) {
			if (index[position][i]==null) {
				minor = i;
			}
		}

		// Check if the array needs to be expanded:
		if (minor>=index[position].length) {
			index[position] = Arrays.copyOf(index[position], index[position].length*2);
		}
		
		// Add the state to the index:
		index[position][minor] = state;
		entries++;
		
	}
	
	/**
	 * Remove a state from the index.
	 * @param state State to be removed.
	 */
	public void removeFromIndex(State state) {
		
		// Find all possibly matching states:
		int position = hash2position(state.getHashCode());
		State[] matched = index[position];		
		if (matched==null) return;
		
		// Check if one of them is the correct one:
		for (int i=0; i<matched.length; i++) {
			if (matched[i]==state) {
				matched[i] = null;
				entries--;
				return;
			}
		}
		
	}
	
	/**
	 * Reset this state space index.
	 */
	public void resetIndex() {
		index = new State[optimalSize()][];
		entries = 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceIndex#getStateSpace()
	 */
	@Override
	public StateSpace getStateSpace() {
		return stateSpace;
	}
	
	/*
	 * Grow the index. This method is linear in the
	 * number of indexed states and does not compute any models.
	 */
	private void grow() {
		
		// Create a new array, but remember the old one:
		State[][] oldIndex = index;
		resetIndex();

		// Add all states of the old index to the new index:
		for (int i=0; i<oldIndex.length; i++) {
			if (oldIndex[i]==null) continue;
			for (int j=0; j<oldIndex[i].length; j++) {
				if (oldIndex[i][j]!=null) addToIndex(oldIndex[i][j]);
			}
		}
	}
	
	/*
	 * Convert a hash to an index position.
	 */
	private int hash2position(int hash) {
		return Math.abs(hash) % index.length;
	}
	
	/*
	 * Compute the optimal size of the index.
	 */
	private int optimalSize() {
		int size = (stateSpace.getStates().size() * 4) + 1; // should be filled to 25%
		return (size<INITIAL_INDEX_SIZE) ? INITIAL_INDEX_SIZE : size;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceIndex#clearCache()
	 */
	@Override
	public void clearCache() {
		for (State state : getStateSpace().getStates()) {
			if (!state.isInitial()) {
				state.setModel(null);
			}
		}
		stateModelCache.clear();
		System.gc();
	}

}
