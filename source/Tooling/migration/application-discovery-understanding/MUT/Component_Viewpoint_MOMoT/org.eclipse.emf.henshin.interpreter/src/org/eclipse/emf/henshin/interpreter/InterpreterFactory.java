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

import org.eclipse.emf.henshin.interpreter.impl.InterpreterFactoryImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Interface for the interpreter factory.
 * 
 * @author Christian Krause
 */
public interface InterpreterFactory {
	
	/**
	 * Static factory instance.
	 */
	final static InterpreterFactory INSTANCE = new InterpreterFactoryImpl();
	
	/**
	 * Create a new {@link EGraph} object.
	 * @return A new {@link EGraph}.
	 */
	EGraph createEGraph();

	/**
	 * Create an {@link Assignment} object.
	 * @param unit Target {@link Unit}.
	 * @param isResultAssignment Determines whether this is a result assignment.
	 * @return A new {@link Assignment}.
	 */
	Assignment createAssignment(Unit unit, boolean isResultAssignment);
	
	/**
	 * Create a {@link Match}.
	 * @param Rule to be matched.
	 * @param isResultMatch Determines whether this is a result match.
	 * @return A new {@link Match}.
	 */
	Match createMatch(Rule rule, boolean isResultMatch);

	/**
	 * Create an {@link Engine} object.
	 * @return A new {@link Engine}.
	 */
	Engine createEngine();
	
	/**
	 * Create a new {@link UnitApplication}.
	 * @param engine {@link Engine} to be used.
	 * @return A new {@link UnitApplication}.
	 */
	UnitApplication createUnitApplication(Engine engine);

	/**
	 * Create a new {@link RuleApplication}.
	 * @param engine {@link Engine} to be used.
	 * @return A new {@link RuleApplication}.
	 */
	RuleApplication createRuleApplication(Engine engine);
	
	/**
	 * Create an {@link ApplicationMonitor}.
	 * @return A new {@link ApplicationMonitor}.
	 */
	ApplicationMonitor createApplicationMonitor();
	
}
