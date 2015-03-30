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
package at.ac.tuwien.big.moea.fitness.comparator;

import java.io.Serializable;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.local.IFitnessComparator;

public abstract class AbstractFitnessComparator<C extends Comparable<C> & Serializable, S extends Solution> implements IFitnessComparator<C, S>  {

	@Override
	public int compare(S firstSolution, S secondSolution) {
		C firstValue = getValue(firstSolution);
		C secondValue = getValue(secondSolution);
		
		if(firstValue == null && secondValue == null)
			return 0;
		
		if(firstValue == null)
			return 1;
		
		if(secondValue == null)
			return -1;
		
		return firstValue.compareTo(secondValue);
	}
}
