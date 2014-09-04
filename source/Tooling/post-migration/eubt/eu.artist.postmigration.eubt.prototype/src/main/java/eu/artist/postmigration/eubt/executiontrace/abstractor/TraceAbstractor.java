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
package eu.artist.postmigration.eubt.executiontrace.abstractor;

import eu.artist.postmigration.eubt.executiontrace.IndependentTrace;
import eu.artist.postmigration.eubt.executiontrace.Trace;

/**
 * @author pneubaue
 * 
 */
public interface TraceAbstractor {

	/**
	 * Abstract trace to an independent form
	 * 
	 * @param trace trace to be abstracted
	 * @param migrationTraceModelLocation file system location of the migration
	 *            trace model
	 * @return the given trace in an independent form
	 */
	public IndependentTrace abstractTrace(Trace trace, String migrationTraceModelLocation);

}
