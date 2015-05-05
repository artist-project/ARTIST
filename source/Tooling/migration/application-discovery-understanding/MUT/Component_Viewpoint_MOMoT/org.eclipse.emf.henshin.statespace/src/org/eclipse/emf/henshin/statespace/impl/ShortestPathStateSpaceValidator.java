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

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpaceValidator;
import org.eclipse.emf.henshin.statespace.StateValidator;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.util.StateSpaceShortestPath;

/**
 * {@link StateSpaceValidator} that computes the shortest path to some target states.
 * The target states are defined by means of a {@link StateValidator}.
 * 
 * @author Christian Krause
 */
public class ShortestPathStateSpaceValidator implements StateSpaceValidator {
	
	// State validator to be used:
	private StateValidator validator;
	
	/**
	 * Default and only constructor.
	 */
	public ShortestPathStateSpaceValidator(StateValidator validator) {
		super();
		if (validator==null) {
			throw new IllegalArgumentException();
		}
		this.validator = validator;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#validate(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public ValidationResult validate(StateSpace stateSpace, IProgressMonitor monitor) throws Exception {
		
		monitor.beginTask("Finding shortest path...", stateSpace.getStateCount()*2);
		
		// Find target states:
		List<State> targetStates = new ArrayList<State>();
		for (State state : stateSpace.getStates()) {
			if (monitor.isCanceled()) {
				return null;
			}
			ValidationResult result = validator.validate(state, new SubProgressMonitor(monitor,1));
			if (result.isValid()) {
				targetStates.add(state);
			}
			monitor.worked(1);
		}
		if (targetStates.isEmpty()) {
			monitor.done();
			return new ValidationResult(false, "No matching state found.");
		}
		
		// Compute shortest paths:
		StateSpaceShortestPath shortestPath = new StateSpaceShortestPath();
		shortestPath.computeShortestPaths(stateSpace.getInitialStates());
		
		// Pick the shortest one:
		Path shortest = null;
		for (State target : targetStates) {
			Path path = shortestPath.getShortestPath(target);
			if (shortest==null || (path!=null && path.size()<shortest.size())) {
				shortest = path;
			}
		}
		if (shortest==null) {
			monitor.done();
			return new ValidationResult(false, "No matching state reachable.");			
		}
		
		monitor.done();
		return new ValidationResult(true, "Shortest path of length " + shortest.size() + " found (target state " + 
									shortest.getTarget() + ").", shortest);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.Validator#getName()
	 */
	public String getName() {
		return validator.getName() + " (shortest path)";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.Validator#setProperty(java.lang.String)
	 */
	public void setProperty(String property) throws ParseException {
		validator.setProperty(property);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.Validator#setStateSpaceIndex(org.eclipse.emf.henshin.statespace.StateSpaceIndex)
	 */
	public void setStateSpaceIndex(StateSpaceIndex index) {
		validator.setStateSpaceIndex(index);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#usesProperty()
	 */
	@Override
	public boolean usesProperty() {
		return true;
	}

}
