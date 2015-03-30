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
package eu.artist.postmigration.opgml.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.moeaframework.core.PRNG;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.variable.BinaryVariable;
import org.moeaframework.core.variable.Grammar;
import org.moeaframework.core.variable.Permutation;
import org.moeaframework.core.variable.Program;
import org.moeaframework.core.variable.RealVariable;
import org.moeaframework.util.tree.Node;
import org.moeaframework.util.tree.Rules;

import at.ac.tuwien.big.moea.util.TextUtil;
import at.ac.tuwien.big.moea.util.random.IRandomizable;
import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.variable.AppliedTransformationSet;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;

public class OPGMLUtil {
	
	public static AppliedTransformationSet convert(Solution solution) {
		AppliedTransformationSet set = new AppliedTransformationSet();
		for(int i = 0; i < solution.getNumberOfVariables(); i++) 
			set.addConfiguration(solution.getVariable(i));
		return set;
	}
	
	public static Solution convert(AppliedTransformationSet set, List<Property> properties, int numberOfConfigurationsPerSolution) {
		Solution solution = new Solution(numberOfConfigurationsPerSolution, properties.size(), 1);
		List<IPatternTemplateVariable> configs = new ArrayList<>(set.getConfigurations());
		int configI = 0;
		for(int i = 0; i < solution.getNumberOfVariables(); i++)
			if(configI < configs.size())
				solution.setVariable(i, configs.get(configI++));
			else
				solution.setVariable(i, new PatternTemplatePlaceholder());
		return solution;
	}
	
	public static String toString(Map<? extends UMLElement, Double> map) {
		return toString(map, "");
	}
	
	public static String toString(Map<? extends UMLElement, Double> map, String indent) {
		String str = "";
		for(Entry<? extends UMLElement, Double> entry : map.entrySet()) 
			str += indent + entry.getKey().getName() + ": " + TextUtil.toString(entry.getValue()) + "\n";
		return str;
	}
	
	/**
	 * Initializes the specified decision variable randomly. This method
	 * supports all built-in types, and can be extended to support custom types.
	 * 
	 * @param variable the variable to be initialized
	 */
	public static void randomize(Variable variable) {
		if(variable instanceof IRandomizable<?>) {
			((IRandomizable<?>)variable).randomize();
		} else if (variable instanceof RealVariable) {
			RealVariable real = (RealVariable)variable;
			real.setValue(PRNG.nextDouble(real.getLowerBound(), real
					.getUpperBound()));
		} else if (variable instanceof BinaryVariable) {
			BinaryVariable binary = (BinaryVariable)variable;

			for (int i = 0; i < binary.getNumberOfBits(); i++) {
				binary.set(i, PRNG.nextBoolean());
			}
		} else if (variable instanceof Permutation) {
			Permutation permutation = (Permutation)variable;

			int[] array = permutation.toArray();
			PRNG.shuffle(array);
			permutation.fromArray(array);
		} else if (variable instanceof Grammar) {
			Grammar grammar = (Grammar)variable;

			int[] array = grammar.toArray();
			for (int i = 0; i < array.length; i++) {
				array[i] = PRNG.nextInt(grammar.getMaximumValue());
			}
			grammar.fromArray(array);
		} else if (variable instanceof Program) {
			// ramped half-and-half initialization
			Program program = (Program)variable;
			Rules rules = program.getRules();
			int depth = PRNG.nextInt(2, rules.getMaxInitializationDepth());
			boolean isFull = PRNG.nextBoolean();
			Node root = null;
			
			if (isFull) {
				if (rules.getScaffolding() == null) {
					root = rules.buildTreeFull(rules.getReturnType(), depth);
				} else {
					root = rules.buildTreeFull(rules.getScaffolding(), depth);
				}
			} else {
				if (rules.getScaffolding() == null) {
					root = rules.buildTreeGrow(rules.getReturnType(), depth);
				} else {
					root = rules.buildTreeGrow(rules.getScaffolding(), depth);
				}
			}
			
			program.setArgument(0, root);
		} else {
			System.err.println("can not initialize unknown type");
		}
	}
}
