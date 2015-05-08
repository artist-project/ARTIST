/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.time;

import java.util.Iterator;

public class PoissonArrivalTimeGenerator extends AbstractArrivalTimeGenerator implements IArrivalTimeGenerator, Iterator<Integer> {

	private double lambda;
	private double next = 0;
	
	public PoissonArrivalTimeGenerator() {
	}
	
	public PoissonArrivalTimeGenerator(int simulationTime, double lambda) {
		super(simulationTime);
		this.lambda = lambda;
	}
	
	private double nextPoisson() {
		double y = getRandom().nextDouble();
		double x = Math.log(1-y);
		double a = 1/y;
		return (-a) * x;
    }

	public double getLambda() {
		return lambda;
	}
	
	public PoissonArrivalTimeGenerator setLambda(double lambda) {
		this.lambda = lambda;
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return next <= getSimulationTime();
	}

	@Override
	public Integer next() {
		double curNext = next;
		next += nextPoisson() * 1000; // convert to ms
		return (int) curNext;
	}
}
