/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter;

/**
 * Interface for application monitors.
 * 
 * @see UnitApplication
 * @author Gregor Bonifer, Christian Krause
 */
public interface ApplicationMonitor {

	/**
	 * Check whether this application has been canceled.
	 * @return <code>true</code> if it is canceled.
	 */
	boolean isCanceled();
	
	/**
	 * Check whether this application should be undone. 
	 * @return <code>true</code> if it should be undone.
	 */
	boolean isUndo();
	
	/**
	 * Cancel the current application (no undo).
	 */
	void cancel();
	
	/**
	 * Cancel and undo the current application.
	 */
	void cancelAndUndo();
	
	/**
	 * Notify this monitor that a unit application has been executed.
	 * @param application Executed unit application.
	 * @param success Whether the unit application was successful.
	 */
	void notifyExecute(UnitApplication application, boolean success);

	/**
	 * Notify this monitor that a unit application has been undone.
	 * @param application Undone unit application.
	 * @param success Whether the unit application was successfully undone.
	 */
	void notifyUndo(UnitApplication application, boolean succeess);

	/**
	 * Notify this monitor that a unit application has been redone.
	 * @param application Redone unit application.
	 * @param success Whether the unit application was successfully redone.
	 */
	void notifyRedo(UnitApplication application, boolean success);

}
