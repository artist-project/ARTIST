/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
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
package eu.artist.postmigration.nfrvt.lang.util.selector;

import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;

public class MigrationEvaluationSelector extends MigrationModelSelector<MigrationEvaluation> {
	
	/**
	 * Creates a new migration evaluation selector providing queries to handle
	 * a migration evaluation.
	 * 
	 * @param evaluation migration evaluation on which queries can be placed
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationSelector(MigrationEvaluation evaluation) {
		super(evaluation);
	}
	
	/**
	 * Migration evaluation handled by this selector.
	 * @return migration evaluation
	 */
	public MigrationEvaluation getMigrationEvaluation() {
		return (MigrationEvaluation) super.getModel();
	}

}
