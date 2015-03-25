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

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;

/**
 * A monitor that can be used to track changes in a state space.
 * After creating it, make sure to activate it using {@link #setActive(boolean)}.
 * If you don't need it anymore deactivate, so that it can be garbage collected.
 * @author Christian Krause
 */
public class StateSpaceMonitor {
	
	// State space to be monitored.
	private final StateSpace stateSpace;
	
	// Set of states that have been added since the activation.
	private Collection<State> addedStates = new HashSet<State>();

	// List of states that have been removed since the activation.
	private Collection<State> removedStates = new HashSet<State>();
	
	/**
	 * Default constructor. This does not activate the monitor.
	 * @param stateSpace State space to be monitored.
	 */
	public StateSpaceMonitor(StateSpace stateSpace) {
		this.stateSpace = stateSpace;
	}
	
	/**
	 * Activate or de-activate this monitor.
	 * @param active Active flag.
	 */
	public void setActive(boolean active) {
		if (active && !stateSpace.eAdapters().contains(adapter)) {
			stateSpace.eAdapters().add(adapter);
		} else if (!active) {
			stateSpace.eAdapters().remove(adapter);
		}
	}
	
	/**
	 * Reset the tracked information.
	 */
	public void reset() {
		addedStates.clear();
		removedStates.clear();
	}
	
	/**
	 * Get the state space to be monitored.
	 * @return State space.
	 */
	public StateSpace getStateSpace() {
		return stateSpace;
	}
	
	/**
	 * Get the states that have been added to the state space 
	 * since the activation.
	 * @return The added states.
	 */
	public Collection<State> getAddedStates() {
		return addedStates;
	}
	
	/**
	 * Get the states that have been removed to the state space 
	 * since the activation.
	 * @return The removed states.
	 */
	public Collection<State> getRemovedStates() {
		return removedStates;
	}

	/*
	 * Internal adapter.
	 */
	private final Adapter adapter = new AdapterImpl() {
		
		@Override
		public void notifyChanged(Notification event) {
			
			// Get the id of the feature that has been changed.
			int featureId = event.getFeatureID(StateSpace.class);
			
			// We are interested in states.
			if (featureId==StateSpacePackage.STATE_SPACE__STATES) {
				if (event.getEventType()==Notification.ADD) {
					addedStates.add((State) event.getNewValue());
				}
				else if (event.getEventType()==Notification.REMOVE) {
					State removed = (State) event.getOldValue();
					if (addedStates.contains(removed)) {
						addedStates.remove(removed);
					} else {
						removedStates.add(removed);						
					}
				}				
			}
			
		}
		
	};
	
}
