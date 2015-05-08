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
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Default {@link InterpreterFactory} implementation.
 * 
 * @author Christian Krause
 */
public class InterpreterFactoryImpl implements InterpreterFactory {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createEGraph()
	 */
	@Override
	public EGraph createEGraph() {
		return new EGraphImpl();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createAssignment(org.eclipse.emf.henshin.model.Unit, boolean)
	 */
	@Override
	public Assignment createAssignment(Unit unit, boolean isResultAssignment) {
		return new AssignmentImpl(unit, isResultAssignment);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createMatch(org.eclipse.emf.henshin.model.Rule, boolean)
	 */
	@Override
	public Match createMatch(Rule rule, boolean isResultMatch) {
		return new MatchImpl(rule, isResultMatch);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createEngine()
	 */
	@Override
	public Engine createEngine() {
		return new EngineImpl();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createUnitApplication(org.eclipse.emf.henshin.interpreter.Engine)
	 */
	@Override
	public UnitApplication createUnitApplication(Engine engine) {
		return new UnitApplicationImpl(engine);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createRuleApplication(org.eclipse.emf.henshin.interpreter.Engine)
	 */
	@Override
	public RuleApplication createRuleApplication(Engine engine) {
		return new RuleApplicationImpl(engine);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.InterpreterFactory#createApplicationMonitor()
	 */
	@Override
	public ApplicationMonitor createApplicationMonitor() {
		return new BasicApplicationMonitor();
	}

}
