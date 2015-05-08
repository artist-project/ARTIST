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
package eu.artist.postmigration.opgml.problem;

import at.ac.tuwien.big.moea.fitness.IFitnessFunction;
import at.ac.tuwien.big.moea.initialization.solution.ISolutionGenerator;
import at.ac.tuwien.big.moea.problem.MOEAProblem;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class PatternSelectionProblem extends MOEAProblem<PatternSelectionSolution> {

	public PatternSelectionProblem(
			IFitnessFunction<PatternSelectionSolution> fitnessFunction,
			ISolutionGenerator<PatternSelectionSolution> solutionGenerator) {
		super(fitnessFunction, solutionGenerator);
	}

}
