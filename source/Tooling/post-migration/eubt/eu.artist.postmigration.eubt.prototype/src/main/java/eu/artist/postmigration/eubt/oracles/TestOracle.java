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
package eu.artist.postmigration.eubt.oracles;

import eu.artist.postmigration.eubt.executiontrace.IndependentTrace;

/**
 * Compares platform independent traces resulting from the individual trace
 * abstractors.
 * ONE-TO-(ONE OR MANY)
 * one migrated trace -> one or many original traces
 * 
 */
public interface TestOracle {

	public boolean isEqual(IndependentTrace independentMigratedTrace, IndependentTrace independentOriginalTraces, ASSERTION_LEVEL assertionLevel);

}
