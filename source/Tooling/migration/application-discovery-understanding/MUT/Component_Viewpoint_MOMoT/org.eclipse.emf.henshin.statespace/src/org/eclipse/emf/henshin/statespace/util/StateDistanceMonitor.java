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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Utility class for keeping track of state distances.
 * @author Christian Krause
 */
public class StateDistanceMonitor {

	// The state space:
	private StateSpace stateSpace;
	
	// Distances of states from the initial states:
	private int[] distances;
	
	/**
	 * Default constructor.
	 * @param stateSpace The state space.
	 */
	public StateDistanceMonitor(StateSpace stateSpace) {
		this.stateSpace = stateSpace;
		this.distances = new int[0];
		updateDistances(stateSpace.getInitialStates());
	}
	
	/*
	 * Check whether the distances array is large enough and
	 * resize it if necessary.
	 */
	private void checkDistanceArraySize() {
		if (distances.length<stateSpace.getStates().size()) {
			int newSize = (stateSpace.getStates().size() * 2) + 4;
			int[] newDistances = Arrays.copyOf(distances, newSize);
			Arrays.fill(newDistances, distances.length, newDistances.length, -1);
			distances = newDistances;
		}
	}

	/**
	 * Update the distances of a of states and all its 
	 * successor states.
	 */
	public void updateDistance(State state) {
		updateDistances(Collections.singletonList(state));
	}

	/**
	 * Update the distances of a list of states and all their 
	 * successor states.
	 */
	public void updateDistances(Collection<State> states) {

		// Make sure the array is large enough.
		checkDistanceArraySize();

		// visited states and current:
		Set<State> visited = new HashSet<State>();
		Set<State> current = new HashSet<State>();
		for (State state : states) {
			if (state!=null) current.add(state);
		}
		
		// breadth-first search:
		while (!current.isEmpty()) {
			
			// compute the distance of the current states:
			for (State state : current) {
				int d = -1;
				int c;
				if (state.isInitial()) {
					d = 0;
				} else {
					for (Transition incoming : state.getIncoming()) {
						c = distances[incoming.getSource().getIndex()];
						if (c>=0 && (d<0 || d>c+1)) {
							d = c+1;   // +1 for the extra transition
						}
					}
				}
				distances[state.getIndex()] = d;
				visited.add(state);
			}
			
			// compute the successor states:
			Set<State> successors = new HashSet<State>();
			State target;
			for (State state : current) {
				for (Transition outgoing : state.getOutgoing()) {
					target = outgoing.getTarget();
					if (!visited.contains(target)) {
						successors.add(target);
					}
				}
			}
			current = successors;
		}
	}
	
	public int getDistance(State state) {
		int index = state.getIndex();
		if (index>=distances.length) {
			distances = new int[0];
			updateDistances(stateSpace.getInitialStates());
		}
		return distances[index];
	}

}
