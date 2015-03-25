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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Dijkstra's shortest path algorithm for state spaces.
 * @generated NOT
 * @author Christian Krause
 */
public class StateSpaceShortestPath {
	
	// Settled states:
	private Set<State> settledStates;
	
	// Unsettled states:
	private Set<State> unsettledStates;
	
	// Predecessor states:
	private Map<State, State> predecessors;
	
	// State distances:
	private Map<State, Integer> distances;
	
	/**
	 * Default constructor.
	 */
	public StateSpaceShortestPath() {
		// nothing to do
	}
	
	/**
	 * Compute the shortest paths from a given set of start states.
	 * @param startStates Start states.
	 */
	public void computeShortestPaths(List<State> startStates) {
		settledStates = new HashSet<State>();
		unsettledStates = new HashSet<State>();
		distances = new HashMap<State, Integer>();
		predecessors = new HashMap<State, State>();
		unsettledStates.addAll(startStates);
		for (State start : startStates) {
			distances.put(start, 0);
		}
		while (!unsettledStates.isEmpty()) {
			State state = getMinimum(unsettledStates);
			settledStates.add(state);
			unsettledStates.remove(state);
			findSmallestDistances(state);
		}		
	}

	private void findSmallestDistances(State state) {
		List<State> unsettledNeighbors = new ArrayList<State>();
		for (Transition t : state.getOutgoing()) {
			if (!settledStates.contains(t.getTarget())) {
				unsettledNeighbors.add(t.getTarget());
			}
		}
		for (State target : unsettledNeighbors) {
			if (getShortestDistance(target) > getShortestDistance(state)+1) {
				distances.put(target, getShortestDistance(state)+1);
				predecessors.put(target, state);
				unsettledStates.add(target);
			}
		}
	}

	private State getMinimum(Set<State> vertexes) {
		State minimum = null;
		for (State vertex : vertexes) {
			if (minimum == null) {
				minimum = vertex;
			} else {
				if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
					minimum = vertex;
				}
			}
		}
		return minimum;
	}

	private int getShortestDistance(State destination) {
		Integer d = distances.get(destination);
		if (d == null) {
			return Integer.MAX_VALUE;
		} else {
			return d;
		}
	}

	/**
	 * Get the shortest path for a given target state.
	 * @param target Target state.
	 * @return Shortest path or <code>null</code>
	 */
	public Path getShortestPath(State target) {
		List<State> path = new LinkedList<State>();
		State step = target;
		if (predecessors.get(step) == null) {
			return null;
		}
		path.add(step);
		while (predecessors.get(step) != null) {
			step = predecessors.get(step);
			path.add(step);
		}
		// Put it into the correct order
		Collections.reverse(path);
		return StateSpaceSearch.findPath(path);
	}

}
