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

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.StateSpaceException;

/**
 * Command for deleting states.
 * @author Christian Krause
 */
public class DeleteStateCommand extends AbstractStateSpaceCommand {

	// State to be deleted.
	private State state;
	
	/**
	 * Default constructor.
	 * @param state State to be deleted.
	 * @param stateSpace State space.
	 */
	public DeleteStateCommand(State state, StateSpaceManager manager) {
		super("deleting state", manager);
		this.state = state;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return state!=null && getStateSpaceManager()!=null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.commands.AbstractStateSpaceCommand#doExecute()
	 */
	@Override
	public void doExecute() throws StateSpaceException {
		getStateSpaceManager().removeState(state);
	}
	
}