/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.UnitApplication;

/**
 * Basic {@link ApplicationMonitor} implementation.
 * 
 * @author Gregor Bonifer, Christian Krause
 */
public class BasicApplicationMonitor implements ApplicationMonitor {
	
	// Canceled flag:
	protected boolean canceled = false;
	
	// Undoing flag:
	protected boolean undo = false;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#isCanceled()
	 */
	@Override
	public boolean isCanceled() {
		return canceled;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#isUndo()
	 */
	@Override
	public boolean isUndo() {
		return undo;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#cancel()
	 */
	@Override
	public void cancel() {
		canceled = true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#cancelAndUndo()
	 */
	@Override
	public void cancelAndUndo() {
		canceled = true;
		undo = true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#notifyExecute(org.eclipse.emf.henshin.interpreter.UnitApplication)
	 */
	@Override
	public void notifyExecute(UnitApplication application, boolean success) {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#notifyUndo(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyUndo(UnitApplication application, boolean success) {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#notifyRedo(org.eclipse.emf.henshin.interpreter.UnitApplication, boolean)
	 */
	@Override
	public void notifyRedo(UnitApplication application, boolean success) {
		// do nothing
	}

}
