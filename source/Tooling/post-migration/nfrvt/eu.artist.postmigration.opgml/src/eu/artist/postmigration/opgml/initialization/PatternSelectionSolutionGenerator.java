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
package eu.artist.postmigration.opgml.initialization;

import org.moeaframework.core.PRNG;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.initialization.solution.AbstractRandomSolutionGenerator;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;

public class PatternSelectionSolutionGenerator extends AbstractRandomSolutionGenerator<PatternSelectionSolution> {

	
	private IPatternTemplateVariable[] possibleConfigurations;

	public PatternSelectionSolutionGenerator(int nrVariables, int nrObjectives,
			int nrConstraints, IPatternTemplateVariable[] possibleConfigurations) {
		super(nrVariables, nrObjectives, nrConstraints);
		this.possibleConfigurations = possibleConfigurations;
	}
	
	public PatternSelectionSolutionGenerator(int nrVariables, int nrObjectives,
			IPatternTemplateVariable[] possibleConfigurations) {
		super(nrVariables, nrObjectives, 0);
		this.possibleConfigurations = possibleConfigurations;
	}

	public IPatternTemplateVariable[] getPossibleConfigurations() {
		return possibleConfigurations;
	}
	
	private IPatternTemplateVariable getRandomConfiguration() {
		if(PRNG.nextDouble() < 0.1)
			return new PatternTemplatePlaceholder();
		IPatternTemplateVariable configuration = getPossibleConfigurations()[PRNG.nextInt(getPossibleConfigurations().length)];
		configuration.randomize();
		return configuration;
	}
	
	public Solution repairSolution(PatternSelectionSolution solution) {
		PatternSelectionSolution repaired = createNewSolution();
		int index = 0;
		for(IPatternTemplateVariable config : solution.repair().getConfigurations())
			repaired.setVariable(index++, config); 
		repaired.fillRemainingVariables();
		return repaired;
	}

	@Override
	public PatternSelectionSolution createRandomSolution(int nrVariables,
			int nrObjectives, int nrConstraints) {
		PatternSelectionSolution newSolution = createNewSolution(nrVariables, nrObjectives, nrConstraints);
		for(int i = 0; i < newSolution.getNumberOfVariables(); i++) 
			newSolution.setVariable(i, getRandomConfiguration()); 
		
		return newSolution;
	}

	@Override
	public PatternSelectionSolution createNewSolution(int nrVariables, int nrObjectives, int nrConstraints) {
		return new PatternSelectionSolution(nrVariables, nrObjectives, nrConstraints);
	}
}
