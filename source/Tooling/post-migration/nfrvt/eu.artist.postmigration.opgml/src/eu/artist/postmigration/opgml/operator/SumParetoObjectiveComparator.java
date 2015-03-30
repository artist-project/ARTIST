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
package eu.artist.postmigration.opgml.operator;

import org.moeaframework.core.Solution;
import org.moeaframework.core.comparator.ParetoObjectiveComparator;

public class SumParetoObjectiveComparator extends ParetoObjectiveComparator {

	private static final long serialVersionUID = 8083034807628759745L;

	private double sumSolution(Solution sol) {
		double sum = 0.0;
		for(double objective : sol.getObjectives())
			sum += objective;
		return sum;
	}
	
	@Override
	public int compare(Solution solution1, Solution solution2) {
		return new Double(sumSolution(solution1)).compareTo(sumSolution(solution2));
	}
}
