/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.moea.initialization;

import org.apache.commons.lang3.time.StopWatch;
import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.operator.RandomInitialization;

import at.ac.tuwien.big.moea.util.random.IRandomizable;

public class ExtendedRandomInitialization extends RandomInitialization implements ITimeLogger {
	
	private boolean logTime = false;
	private int populationSize;
	
	public ExtendedRandomInitialization(Problem problem, int populationSize) {
		super(problem, populationSize);
		this.populationSize = populationSize;
	}
	
	public int getPopulationSize() {
		return populationSize;
	}
	
	@Override
	public Solution[] initialize() {
		StopWatch watch = null;
		if(logsTime()) {
			watch = new StopWatch();
			watch.start();
		}
		Solution[] init = super.initialize();
		
		if(logsTime()) {
			watch.stop();
			System.err.println("Random Initialization of " + getPopulationSize() + " solutions with length " + init[0].getNumberOfVariables() + " created in: " + watch);
		}
		
		return init;
	}

	@Override
	protected void initialize(Variable variable) {
		if(variable instanceof IRandomizable<?>) {
			((IRandomizable<?>)variable).randomize();
		} else {
			super.initialize(variable);
		}
	}

	@Override
	public ExtendedRandomInitialization logTime(boolean logTime) {
		this.logTime = logTime;
		return this;
	}

	@Override
	public boolean logsTime() {
		return logTime;
	}
}
