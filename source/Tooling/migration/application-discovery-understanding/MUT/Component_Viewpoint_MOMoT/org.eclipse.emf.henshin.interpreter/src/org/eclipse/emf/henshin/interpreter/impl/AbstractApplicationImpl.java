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

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Abstract base class for {@link UnitApplicationImpl} and {@link RuleApplicationImpl}.
 * 
 * @author Christian Krause
 */
public abstract class AbstractApplicationImpl implements UnitApplication {

	// Engine to be used:
	protected final Engine engine;
	
	// Unit to be applied:
	protected Unit unit;

	// Object graph to be transformed.
	protected EGraph graph;
	
	/**
	 * Default constructor.
	 * @param engine Engine (required).
	 */
	protected AbstractApplicationImpl(Engine engine) {
		if (engine==null) {
			throw new IllegalArgumentException("Engine cannot be null");
		}
		this.engine = engine;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getUnit()
	 */
	@Override
	public Unit getUnit() {
		return unit;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#setUnit(org.eclipse.emf.henshin.model.TransformationUnit)
	 */
	@Override
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#getEGraph()
	 */
	@Override
	public EGraph getEGraph() {
		return graph;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.UnitApplication#setEGraph(org.eclipse.emf.henshin.interpreter.EGraph)
	 */
	@Override
	public void setEGraph(EGraph graph) {
		this.graph = graph;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "'" + unit.getName() + "'"  + " application";
	}

}
