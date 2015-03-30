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

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.operator.mutation.AbstractMutationVariation;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractMatchSolutionMutation extends AbstractMutationVariation {

	public AbstractMatchSolutionMutation() {
		super();
	}
	
	public AbstractMatchSolutionMutation(double probability) {
		super(probability);
	}

	@Override
	protected Solution[] doEvolve(Solution[] parents) {
		if(!(parents[0] instanceof MatchSolution))
			return new Solution[] { parents[0] };
		return new Solution[] { mutate(((MatchSolution)parents[0]).copy()) };
	}

	protected abstract MatchSolution mutate(MatchSolution mutant);

}
