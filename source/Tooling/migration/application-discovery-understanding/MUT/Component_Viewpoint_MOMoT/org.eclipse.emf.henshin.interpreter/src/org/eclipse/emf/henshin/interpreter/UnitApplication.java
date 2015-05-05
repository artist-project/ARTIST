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

import org.eclipse.emf.henshin.model.Unit;

/**
 * Interface for {@link Unit} applications. 
 * If you want to execute a rule, you can also use 
 * {@link RuleApplication} instead.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public interface UnitApplication {

	/**
	 * Get the unit to be applied.
	 * @return The unit.
	 */
	Unit getUnit();

	/**
	 * Set the unit to be applied.
	 * @param unit The transformation unit.
	 */
	void setUnit(Unit unit);
	
	/**
	 * Get the {@link EGraph} to be transformed.
	 * @return The object graph.
	 */
	EGraph getEGraph();
	
	/**
	 * Set the {@link EGraph} to be transformed.
	 * @param graph The object graph.
	 */
	void setEGraph(EGraph graph);
	
	/**
	 * Get the parameter assignment to be used.
	 * @return The parameter assignment.
	 */
	Assignment getAssignment();

	/**
	 * Set the parameter assignment to be used.
	 * @param assignment The parameter assignment.
	 */
	void setAssignment(Assignment assignment);

	/**
	 * Set the assigned value for a parameter. This is a convenience 
	 * method to directly access the assignment of this unit.
	 * This is possible only if the unit is set.
	 * @param paramName The name of the parameter.
	 * @param value The value to be assigned with the parameter.
	 */
	void setParameterValue(String paramName, Object value);

	/**
	 * Get the parameter assignment for the result.
	 * @return The result parameter assignment.
	 */
	Assignment getResultAssignment();

	/**
	 * Get the value assigned to a parameter. This is a convenience 
	 * method to directly access the result assignment of this unit.
	 * This is possible only if the unit is set and the unit is applied.
	 * @param paramName The name of the parameter.
	 * @return The assigned result value or <code>null</code>.
	 */
	Object getResultParameterValue(String paramName);

	/**
	 * Execute this unit application.
	 * @param monitor The application monitor or <code>null</code>.
	 * @return <code>true</code> if the unit was successfully applied.
	 */
	boolean execute(ApplicationMonitor monitor);
	
	/**
	 * Undo this unit application. This restores the original model as
	 * it was before calling {@link #execute()}.
	 * @param monitor The application monitor or <code>null</code>.
	 * @return <code>true</code> if the unit was successfully undone.
	 */
	boolean undo(ApplicationMonitor monitor);
	
	/**
	 * Redo this unit application. This method can be invoked after
	 * {@link #undo()} has been invoked. The effect is that the
	 * unit is executed again.
	 * @param monitor The application monitor or <code>null</code>.
	 * @return <code>true</code> if the unit was successfully redone.
	 */
	boolean redo(ApplicationMonitor monitor);
	
}
