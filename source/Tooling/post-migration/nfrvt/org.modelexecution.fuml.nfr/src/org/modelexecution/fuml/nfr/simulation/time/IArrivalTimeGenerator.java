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

public interface IArrivalTimeGenerator extends Iterator<Integer>, Iterable<Integer> {
	IArrivalTimeGenerator setSimulationTime(int simulationTime);
	int getSimulationTime();
}
