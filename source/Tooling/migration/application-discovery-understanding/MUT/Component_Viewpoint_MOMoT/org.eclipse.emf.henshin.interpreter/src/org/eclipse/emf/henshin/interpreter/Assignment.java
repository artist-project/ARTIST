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

import java.util.List;

import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Interface for parameter assignments. Used for storing parameter values.
 * 
 * @author Christian Krause
 */
public interface Assignment {

	/**
	 * Get the unit that this assignment refers to.
	 * @return The unit.
	 */
	Unit getUnit();

	/**
	 * Get the value assigned to a parameter.
	 * @param param The parameter.
	 * @return The assigned value or <code>null</code>.
	 */
	Object getParameterValue(Parameter param);
	
	/**
	 * Set the assigned value for a parameter.
	 * @param param The parameter.
	 * @param value The value to be assigned with the parameter.
	 */
	void setParameterValue(Parameter param, Object value);
	
	/**
	 * Get all parameter values.
	 * @return List of all parameter values.
	 */
	List<Object> getParameterValues();
	
	/**
	 * Check whether this assignment is empty.
	 * @return <code>true</code> of no values are assigned.
	 */
	boolean isEmpty();

	/**
	 * Clear all values stored in this assignment.
	 */
	void clear();

	/**
	 * Checks whether this is an assignment for a result of a unit application. 
	 * @return <code>true</code> if it is a result assignment.
	 */
	boolean isResult();

}
