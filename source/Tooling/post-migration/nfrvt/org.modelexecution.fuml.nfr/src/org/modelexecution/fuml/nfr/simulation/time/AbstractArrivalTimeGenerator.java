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
import java.util.Random;

public abstract class AbstractArrivalTimeGenerator implements IArrivalTimeGenerator {
	
	private int simulationTime;
	private Random random;
	
	public AbstractArrivalTimeGenerator() {
		random = new Random(System.currentTimeMillis());
	}
	
	public AbstractArrivalTimeGenerator(int simulationTime) {
		this();
		this.simulationTime = simulationTime;
	}

	@Override
	public IArrivalTimeGenerator setSimulationTime(int simulationTime) {
		this.simulationTime = simulationTime;
		return this;
	}

	@Override
	public int getSimulationTime() {
		return simulationTime;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return this;
	}
	
	@Override
	public void remove() {
		; // do nothing
	}
	
	protected Random getRandom() {
		return random;
	}
	
	protected int roundDouble(double time) {
		return (int) Math.round(time * 100);
	}
	
	/**
     * Return real number uniformly in [0, 1).
     */
    public double uniform() {
        return random.nextDouble();
    }

    /**
     * Return an integer uniformly between 0 (inclusive) and N (exclusive).
     */
    public int uniform(int N) {
        return random.nextInt(N);
    }
	
///////////////////////////////////////////////////////////////////////////
//  STATIC METHODS BELOW RELY ON JAVA.UTIL.RANDOM ONLY INDIRECTLY VIA
//  THE STATIC METHODS ABOVE.
///////////////////////////////////////////////////////////////////////////

	/**
	* Return real number uniformly in [0, 1).
	*/
	public double random() {
		return uniform();
	}

	/**
	* Return int uniformly in [a, b).
	*/
	public int uniform(int a, int b) {
		return a + uniform(b - a);
	}

	/**
	* Return real number uniformly in [a, b).
	*/
	public double uniform(double a, double b) {
		return a + uniform() * (b-a);
	}
}
