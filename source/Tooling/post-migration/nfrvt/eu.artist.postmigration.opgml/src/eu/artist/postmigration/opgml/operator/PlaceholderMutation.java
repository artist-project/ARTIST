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

import at.ac.tuwien.big.moea.operator.mutation.AbstractMutationVariation;
import at.ac.tuwien.big.moea.util.MathUtil;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;

public class PlaceholderMutation extends AbstractMutationVariation {
		
		public PlaceholderMutation(double probability) {
			super(probability);
		}

		@Override
		public Solution[] doEvolve(Solution[] parents) {
			Solution result = parents[0].copy();
			
			int randomVariable = MathUtil.randomInteger(result.getNumberOfVariables());
			result.setVariable(randomVariable, new PatternTemplatePlaceholder());
			
			return new Solution[] { result };
		} 
}
