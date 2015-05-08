/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.commands;

import java.util.List;

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.util.StateSpaceExplorationHelper;

/**
 * Command for exploring states.
 * @author Christian Krause
 */
public class ExploreStatesCommand extends AbstractStateSpaceCommand {
	
	// Exploration helper:
	private StateSpaceExplorationHelper helper;

	// Alternatively: states to explore:
	private List<State> statesToExplore;

	// Whether to generate locations for new states:
	private boolean generateLocations;
	
	// Result:
	private boolean result = true;
	
	/**
	 * Constructor.
	 * @param helper State space exploration helper.
	 * @param generateLocations Whether to generate locations.
	 */
	public ExploreStatesCommand(StateSpaceExplorationHelper helper) {
		super("explore states", helper.getStateSpaceManager());
		this.helper = helper;
	}

	/**
	 * Constructor.
	 * @param states States to explore.
	 * @param generateLocations Whether to generate locations.
	 */
	public ExploreStatesCommand(StateSpaceManager manager, List<State> states, boolean generateLocations) {
		super("explore states", manager);
		this.statesToExplore = states;
		this.generateLocations = generateLocations;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.commands.AbstractStateSpaceCommand#doExecute()
	 */
	public void doExecute() throws StateSpaceException {
		if (helper!=null) {
			result = helper.doExplorationStep();
		} else {
			result = !statesToExplore.isEmpty();
			getStateSpaceManager().exploreStates(statesToExplore, generateLocations);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}
	
	public boolean getResult() {
		return result;
	}
	
}
