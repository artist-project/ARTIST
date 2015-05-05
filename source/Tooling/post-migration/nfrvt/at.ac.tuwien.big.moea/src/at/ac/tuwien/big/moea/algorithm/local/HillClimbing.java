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
package at.ac.tuwien.big.moea.algorithm.local;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;

public class HillClimbing<S extends Solution> extends AbstractLocalSearchAlgorithm<S> {

	private int noImprovement = 0;
	
	public HillClimbing(Problem problem, S initialSolution,
			INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> fitnessComparator) {
		super(problem, initialSolution, neighborhoodFunction, fitnessComparator);
		if(neighborhoodFunction.getMaxNeighbors() == INeighborhoodFunction.UNLIMITED)
			System.err.println("Warning: Neighborhood-Function may produce infinite neighbors, Hill-Climbing may get stuck in infinite loop.");
	}

	@Override
	protected void iterate() {
		List<S> neighbors = new ArrayList<>();
		for(S neighbor : generateCurrentNeighbors()) {
			evaluate(neighbor);
			neighbors.add(neighbor);
		}
		Collections.sort(neighbors, getFitnessComparator());
		S bestNeighbor = neighbors.get(0);
		boolean isImprovement = update(bestNeighbor);
		if(!isImprovement)
			noImprovement++;
	}
	
	protected boolean update(S solutionCandidate) {
		boolean isImprovement = false;
		if(isImprovementToCurrent(solutionCandidate)) {
			setCurrentSolution(solutionCandidate);
			isImprovement = true;
		}
		if(isImprovementToBest(solutionCandidate)) {
			setBestSolution(solutionCandidate);
			isImprovement = true;
		}
		return isImprovement;
	}
}
