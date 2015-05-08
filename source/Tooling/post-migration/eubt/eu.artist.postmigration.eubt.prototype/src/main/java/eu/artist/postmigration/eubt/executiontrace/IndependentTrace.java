/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.executiontrace;

import eu.artist.postmigration.eubt.oracles.ASSERTION_LEVEL;

/**
 * @author pneubaue
 * 
 */
public interface IndependentTrace {

	/**
	 * Evaluate equality with another independent trace
	 * 
	 * @param independentTrace other independent trace to compare with this
	 *            independent trace
	 * @param comparisonLevel level of comparison to which the independent trace is compared
	 * @return true if traces are equal, false otherwise
	 */
	public boolean equals(IndependentTrace independentTrace, ASSERTION_LEVEL comparisonLevel);
	
	/**
	 * Get the trace associated with this independent trace
	 * 
	 * @return a platform specific trace
	 */
	public Trace getTrace();

}
