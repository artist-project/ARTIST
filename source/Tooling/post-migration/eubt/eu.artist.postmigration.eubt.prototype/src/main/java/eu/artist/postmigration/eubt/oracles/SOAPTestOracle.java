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

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.executiontrace.IndependentTrace;

/**
 * @author pneubaue
 * 
 */
public class SOAPTestOracle implements TestOracle {

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.oracles.TestOracle#isEqual(eu.artist.postmigration.eubt.executiontrace.IndependentTrace, eu.artist.postmigration.eubt.executiontrace.IndependentTrace)
	 */
	@Override
	public boolean isEqual(final IndependentTrace independentMigratedTrace, final IndependentTrace independentOriginalTrace, ASSERTION_LEVEL assertionLevel) {
		/**
		 * At this point both traces have already been successfully validated against their respective schema.
		 * Hence, as the final step, the content of the independent traces are compared.
		 */
		boolean assertionResult = independentMigratedTrace.equals(independentOriginalTrace, assertionLevel);
		if (assertionResult) {
			Debug.out(this, "VERDICT based on a assertion at '" + assertionLevel + "': PASS.");
		} else {
			Debug.out(this, "VERDICT based on a assertion at '" + assertionLevel + "': FAIL.");
		}
		
		return assertionResult;		
	}

}
