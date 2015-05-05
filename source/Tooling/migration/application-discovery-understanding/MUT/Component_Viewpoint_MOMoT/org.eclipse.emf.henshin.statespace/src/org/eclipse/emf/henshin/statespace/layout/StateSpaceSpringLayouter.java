/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.layout;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;

/**
 * Spring layout algorithm for state spaces.
 * @author Christian Krause
 * @generated NOT
 */
public class StateSpaceSpringLayouter extends AdapterImpl {
	
	// State space to be layouted:
	private StateSpace stateSpace;
	
	// Cached list and number of states:
	private List<State> states;
	private int numStates;
	
	// Positions:
	private double[] posX, posY, posZ;
	
	// Center of the display:
	private double[] center;
	
	// Shift to the center:
	private double shiftX, shiftY, shiftZ;
	
	// Layouting parameters:
	private double repulsion = 50;
	private double attraction = 10;
	private double naturalLength = 30;
	private double shiftFactor = 0.1;
	
	/**
	 * Set the state space.
	 * @param stateSpace State space.
	 */
	public void setStateSpace(StateSpace stateSpace) {
		if (this.stateSpace!=null) {
			this.stateSpace.eAdapters().remove(this);
		}
		this.stateSpace = stateSpace;
		this.states = stateSpace.getStates();
		reloadPositions();
		this.stateSpace.eAdapters().add(this);
	}
	
	/*
	 * Load the positions from the states.
	 */
	private void reloadPositions() {
		
		// Initialize arrays:
		numStates = states.size();
		int size = arraySize(numStates);
		posX = new double[size];
		posY = new double[size];
		posZ = new double[size];
		
		// Load state positions into the cache:
		for (int i=0; i<numStates; i++) {
			int[] location = states.get(i).getLocation();
			posX[i] = location[0];
			posY[i] = location[1];
			posZ[i] = location[2];
		}
		
		// Reset the shift as well:
		shiftX = 0;
		shiftY = 0;
		shiftZ = 0;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public synchronized void notifyChanged(Notification event) {
		
		// States feature changed?
		if (event.getFeatureID(StateSpace.class)==StateSpacePackage.STATE_SPACE__STATES) {
			
			// State has been added?
			if (event.getEventType()==Notification.ADD) {
								
				// Resize arrays?
				if (numStates>=posX.length) {
					int size = arraySize(numStates+1);
					posX = Arrays.copyOf(posX, size);
					posY = Arrays.copyOf(posY, size);
					posZ = Arrays.copyOf(posZ, size);
				}
				
				int[] location = ((State) event.getNewValue()).getLocation();
				posX[numStates] = location[0];
				posY[numStates] = location[1];
				posZ[numStates] = location[2];
				
				// Increase states counter:
				numStates++;
				
			}

			// State has been removed?
			else if (event.getEventType()==Notification.REMOVE) {
				
				// We don't know the index of the removed state, so we reload:
				reloadPositions();
				
			}
		}
	}
	
	/**
	 * Calculate the new locations of the states.
	 */
	public synchronized void update() {
		
		// Compute the sum of all positions:
		double sumX = 0, sumY = 0, sumZ = 0;
		
		// Compute the new positions:
		numStates = Math.min(posX.length, states.size());
		for (int i=0; i<numStates; i++) {
			
			// Update the sum:
			sumX += posX[i];
			sumY += posY[i];
			sumZ += posZ[i];
			
			// The current state:
			State state = states.get(i);
			
			// It's force:
			double forceX = 0;
			double forceY = 0;
			double forceZ = 0;
			
			// State repulsion:
			for (int j=0; j<numStates; j++) {
				if (i==j) continue;
				double[] repulsion = stateRepulsion(i,j);
				forceX += repulsion[0];
				forceY += repulsion[1];
				forceZ += repulsion[2];
			}

			// Transition attraction:
			int incoming = state.getIncoming().size();
			int links = incoming + state.getOutgoing().size();
			for (int j=0; j<links; j++) {
				
				// Get the state on the other side of the transition:
				State otherState = (j<incoming) ? 
						state.getIncoming().get(j).getSource() : 
						state.getOutgoing().get(j-incoming).getTarget();
				
				// Check the other state:
				if (otherState==state || otherState==null) continue;
				
				// Calculate and add transition attraction:
				double[] attraction = transitionAttraction(i, otherState.getIndex());
				forceX += attraction[0];
				forceY += attraction[1];
				forceZ += attraction[2];
				
			}
			
			// Update the positions:
			posX[i] += forceX + shiftX;
			posY[i] += forceY + shiftY;
			posZ[i] += forceZ + shiftZ;
			
		}

		// Compute the new shift to the center (used in the next round):
		if (center!=null && numStates>0) {
			shiftX = (center[0] - (sumX / (double) numStates)) * shiftFactor;
			shiftY = (center[1] - (sumY / (double) numStates)) * shiftFactor;
			shiftZ = (center[2] - (sumZ / (double) numStates)) * shiftFactor;
		}

	}
	
	/**
	 * Commit the new state locations.
	 */
	public void commit() {
		for (int i=0; i<numStates; i++) {
			State state = states.get(i);
			int[] location = state.getLocation();
			location[0] = (int) posX[i];
			location[1] = (int) posY[i];
			location[2] = (int) posZ[i];
			state.setLocation(location);
		}
	}
	
	/*
	 * Compute the transition attraction between two states.
	 */
	private double[] transitionAttraction(int i1, int i2) {
		double[] direction = direction(i2, i1);
		double distance = length(direction);
		if (distance>1) {
			double factor = attraction * Math.log(distance / naturalLength) / distance;
			direction[0] *= factor;
			direction[1] *= factor;
			direction[2] *= factor;
		} else {
			direction[0] = 1;
			direction[1] = 1;
			direction[2] = 1;
		}
		return direction;
	}
	
	/*
	 * Compute the repulsion between two states.
	 */
	public double[] stateRepulsion(int i1, int i2) {
		double[] direction = direction(i1,i2);
		double distance = length(direction);
		if (distance>1) {
			double factor = (repulsion*repulsion) / (distance*distance*distance);
			direction[0] *= factor;
			direction[1] *= factor;
			direction[2] *= factor;
		} else {
			direction[0] = -1;
			direction[1] = -1;
			direction[2] = -1;
		}
		return direction;
	}
	
	/*
	 * Compute the direction vector between two states.
	 */
	private double[] direction(int i1, int i2) {
		return new double[] { posX[i1]-posX[i2], posY[i1]-posY[i2], posZ[i1]-posZ[i2] } ;
	}
	
	/*
	 * Compute the Euclidean distance between two states.
	 */
	private double length(double[] vector) {
		return Math.sqrt((vector[0] * vector[0]) + (vector[1] * vector[1]));
	}
	
	/*
	 * Compute the number of states to provide storage for.
	 */
	private int arraySize(int states) {
		return (int) (1.5 * states + 16);
	}
	
	/**
	 * Set the state repulsion force.
	 * @param repulsion State repulsion.
	 */
	public void setStateRepulsion(double repulsion) {
		this.repulsion  = repulsion;
	}
	
	/**
	 * Set the transition attraction force.
	 * @param attraction Attraction force.
	 */
	public void setTransitionAttraction(double attraction) {
		this.attraction = attraction;
	}
	
	/**
	 * Set the natural transition edge length to be used.
	 * @param naturalLength Natural transition length.
	 */
	public void setNaturalTransitionLength(int naturalLength) {
		this.naturalLength = naturalLength;
	}
	
	/**
	 * Set the center of the display.
	 * @param center Center.
	 */
	public void setCenter(double[] center) {
		// Make sure it is 3D.
		if (center!=null && center.length!=3) {
			center = Arrays.copyOf(center, 3);
		}
		this.center = center;
	}
	
	/**
	 * Set the position for a state.
	 * @param state State to be moved.
	 * @param position New position.
	 */
	public synchronized void setPosition(State state, int... position) {
		int index = state.getIndex();
		if (posX!=null && posX.length>index) {
			if (position.length>0) posX[index] = position[0];
			if (position.length>1) posY[index] = position[1];
			if (position.length>2) posZ[index] = position[2];
		}
	}
	
}
