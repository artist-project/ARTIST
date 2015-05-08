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

public class PeriodicArrivalTimeGenerator extends AbstractArrivalTimeGenerator {

	private int start;
	private int period;
	private int next;
	
	public PeriodicArrivalTimeGenerator(int simulationTime, int period) {
		super(simulationTime);
		this.start = 0;
		this.period = period;
		this.next = start + period;
	}
	
	@Override
	public boolean hasNext() {
		return next <= getSimulationTime();
	}

	@Override
	public Integer next() {
		int curNext = next;
		this.next += period;
		return curNext;
	}
}
