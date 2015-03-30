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
import org.moeaframework.core.Variable;
import org.moeaframework.core.operator.binary.BitFlip;
import org.moeaframework.core.operator.grammar.GrammarMutation;
import org.moeaframework.core.operator.permutation.Swap;
import org.moeaframework.core.operator.real.UM;
import org.moeaframework.core.variable.BinaryVariable;
import org.moeaframework.core.variable.Grammar;
import org.moeaframework.core.variable.Permutation;
import org.moeaframework.core.variable.RealVariable;

import at.ac.tuwien.big.moea.operator.mutation.AbstractMutationVariation;
import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.moea.variable.RandomIntegerVariable;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;

public class PatternTemplateMutation extends AbstractMutationVariation {
	
	public PatternTemplateMutation() {
		super(0.15);
	}
	
	public PatternTemplateMutation(double probability) {
		super(probability);
	}
	
	private static void evolve(Variable variable, double probability) {
		if (variable instanceof BinaryVariable)
			evolve((BinaryVariable)variable, probability);
		if (variable instanceof Grammar)
			evolve((Grammar)variable, probability);
		if (variable instanceof Permutation)
			evolve((Permutation)variable, probability);
		if (variable instanceof RealVariable)
			evolve((RealVariable)variable, probability);
		if (variable instanceof RandomIntegerVariable)
			evolve((RandomIntegerVariable)variable, probability);
		if (variable instanceof IPatternTemplateVariable)
			evolve((IPatternTemplateVariable)variable, probability);
	}
	
	public static void evolve(IPatternTemplateVariable variable, double probability) {
		if(variable instanceof PatternTemplatePlaceholder)
			return;
		Variable value = CollectionUtil.getRandomElement(variable.getParameterEntries()).getValue();
		evolve(value, probability);
	}
	
	private static void evolve(BinaryVariable variable, double probability) {
		BitFlip.evolve(variable, probability);
	}
	
	private static void evolve(Grammar variable, double probability) {
		GrammarMutation.evolve(variable, probability);
	}
	
	private static void evolve(Permutation variable, double probability) {
		if(shouldEvolve(probability))
			Swap.evolve(variable);
	}
	
	private static void evolve(RealVariable variable, double probability) {
		if(shouldEvolve(probability))
			UM.evolve(variable);
	}
	
	private static void evolve(RandomIntegerVariable variable, double probability) {
		variable.randomize();
	}

	@Override
	public Solution[] doEvolve(Solution[] parents) {
		Solution result = parents[0].copy();
		for (int i = 0; i < result.getNumberOfVariables(); i++)
			evolve(result.getVariable(i), getProbability());
	
		return new Solution[] { result };
	}
}
