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
package at.ac.tuwien.big.momot.operator.mutation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Parameter;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.IMatchVariable;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchParameterMutation extends AbstractMatchSolutionMutation {

	private ParameterManager parameterManager;

	public MatchParameterMutation(ParameterManager parameterManager) {
		super();
		this.parameterManager = parameterManager;
	}
	
	public MatchParameterMutation(double probability, ParameterManager parameterManager) {
		super(probability);
		this.parameterManager = parameterManager;
	}
	
	public ParameterManager getParameterManager() {
		return parameterManager;
	}

	@Override
	protected MatchSolution mutate(MatchSolution mutant) {
		IMatchVariable randomMatch = CollectionUtil.getRandomElement(mutant.getMatchVariables());
		int nrTries = 0;
		while(randomMatch instanceof MatchPlaceholderVariable) {
			if(++nrTries == 3)
				return mutant;
			randomMatch = CollectionUtil.getRandomElement(mutant.getMatchVariables());
		}
		
		EList<Parameter> ruleParameters = randomMatch.getUnit().getParameters();
		for(Parameter parameter : ruleParameters) {
			Object value = randomMatch.getParameterValue(parameter);
			if(value != null) {
				Object paramValue = getParameterManager().nextParameterValue(parameter);
				if(paramValue != null) {
					randomMatch.setParameterValue(parameter, paramValue);
					break;
				}
			}
				
		}
		return mutant;
	}
}
