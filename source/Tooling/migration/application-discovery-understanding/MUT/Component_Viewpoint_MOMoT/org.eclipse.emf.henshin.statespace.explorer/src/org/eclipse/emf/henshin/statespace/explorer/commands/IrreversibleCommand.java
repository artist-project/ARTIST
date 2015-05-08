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

import org.eclipse.gef.commands.Command;

/**
 * A dummy command that cannot be undone.
 * @author Christian Krause.
 */
public class IrreversibleCommand extends Command {
	
	/**
	 * Constructor.
	 * @param name Name of the command.
	 */
	public IrreversibleCommand(String name) {
		super(name);
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
