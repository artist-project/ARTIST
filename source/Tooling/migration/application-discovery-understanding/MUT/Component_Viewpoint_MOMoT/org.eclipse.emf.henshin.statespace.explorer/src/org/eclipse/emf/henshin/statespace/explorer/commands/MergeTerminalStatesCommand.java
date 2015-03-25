package org.eclipse.emf.henshin.statespace.explorer.commands;

import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;

/**
 * Command for merging terminal states.
 * @author Christian Krause
 */
public class MergeTerminalStatesCommand extends AbstractStateSpaceCommand {
	
	/**
	 * Default constructor.
	 */
	public MergeTerminalStatesCommand(StateSpaceManager manager) {
		super("merge terminal states", manager);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.explorer.commands.AbstractStateSpaceCommand#doExecute()
	 */
	@Override
	public void doExecute() throws StateSpaceException { 
		getStateSpaceManager().mergeTerminalStates();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}

}
