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
package eu.artist.postmigration.opgml.variable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.moeaframework.core.Variable;

import at.ac.tuwien.big.moea.solution.MOEASolution;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import eu.artist.postmigration.opgml.gml.uml.UMLElement;

public class PatternSelectionSolution extends MOEASolution {

	private static final long serialVersionUID = 5946985124531008216L;
	
	public PatternSelectionSolution(double[] objectives) {
		super(objectives);
	}

	public PatternSelectionSolution(int numberOfVariables,
			int numberOfObjectives, int numberOfConstraints) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints);
	}

	public PatternSelectionSolution(int numberOfVariables,
			int numberOfObjectives) {
		super(numberOfVariables, numberOfObjectives);
	}
	
	public PatternSelectionSolution(int numberOfVariables, int numberOfObjectives, IPatternTemplateVariable... configs) {
		this(numberOfVariables, numberOfObjectives, Lists.newArrayList(configs));
	}
	
	public PatternSelectionSolution(int numberOfVariables, int numberOfObjectives, int numberOfConstraints, IPatternTemplateVariable... configs) {
		this(numberOfVariables, numberOfObjectives, numberOfConstraints, Lists.newArrayList(configs));
	}
	
	public PatternSelectionSolution(int numberOfVariables, int numberOfObjectives, List<IPatternTemplateVariable> configs) {
		super(numberOfVariables, numberOfObjectives);
		int configIndex = 0;
		for(int i = 0; i < numberOfVariables; i++)
			if(configIndex < configs.size())
				setVariable(i, configs.get(configIndex++));
			else
				setVariable(i, new PatternTemplatePlaceholder());
	}
	
	public PatternSelectionSolution(int numberOfVariables, int numberOfObjectives, int numberOfConstraints, List<IPatternTemplateVariable> configs) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints);
		int configIndex = 0;
		for(int i = 0; i < numberOfVariables; i++)
			if(configIndex < configs.size())
				setVariable(i, configs.get(configIndex++));
			else
				setVariable(i, new PatternTemplatePlaceholder());
	}
	
	public PatternSelectionSolution(PatternSelectionSolution solution) {
		this(solution.getNumberOfVariables(), solution.getNumberOfObjectives(), solution.getNumberOfConstraints(), solution.getConfigurations());
	}

	public void fillRemainingVariables() {
		for(int i = getConfigurations().length; i < getNumberOfVariables(); i++)
			setVariable(i, new PatternTemplatePlaceholder());
	}
	
	@Override
	public void setVariable(int index, Variable variable) {
		if(variable instanceof IPatternTemplateVariable) {
			super.setVariable(index, variable);
			IPatternTemplateVariable config = (IPatternTemplateVariable) variable;
			elementToConfig.put(config.getApplication(), config);
			getConfigurations()[index] = config;
		}
	}
	
	private Multimap<UMLElement, IPatternTemplateVariable> elementToConfig = ArrayListMultimap.create();
	private IPatternTemplateVariable[] configs = null;
	
	public IPatternTemplateVariable[] getConfigurations() {
		if(configs == null)
			configs = new IPatternTemplateVariable[getNumberOfVariables()];
		return configs;
	}
	
	public Collection<IPatternTemplateVariable> getConfigurations(UMLElement element) {
		return elementToConfig.get(element);
	}
	
	public Collection<IPatternTemplateVariable> getNonEmptyConfigurations() {
		List<IPatternTemplateVariable> configs = new ArrayList<>();
		for(IPatternTemplateVariable config : getConfigurations())
			if(!(config instanceof PatternTemplatePlaceholder))
				configs.add(config);
		return configs;
	}
	
	public Set<UMLElement> getUMLElements() {
		return elementToConfig.keySet();
	}
	
	public int getSolutionLength() {
		int size = 0;
		for(IPatternTemplateVariable config : getConfigurations())
			if(!(config instanceof PatternTemplatePlaceholder))
				size++;
		return size;
	}
	
	@Override
	public String toString() {
		return toString("");
	}

	public String toString(String indent) {
		String configs = "";
		String delimiter = "";
		for(IPatternTemplateVariable config : getConfigurations()) {
//			if(!(config instanceof PatternTemplatePlaceholder)) {
				configs += delimiter + indent + config;
				delimiter = "\n";
//			}
		}
		return configs;
	}
		
	public PatternSelectionSolution repair() {
		Set<UMLElement> cached = new TreeSet<>();
		Set<UMLElement> scaled = new TreeSet<>();
		
		List<IPatternTemplateVariable> configs = Arrays.asList(getConfigurations());
		for(IPatternTemplateVariable config : getNonEmptyConfigurations())
			if(config instanceof CacheTemplate) {
				if(cached.contains(config.getApplication()))
					configs.remove(config);
				cached.add(config.getApplication());
			} else if(config instanceof FixedScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					configs.remove(config);
				scaled.add(config.getApplication());
			} else if(config instanceof AutoScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					configs.remove(config);
				scaled.add(config.getApplication());
			}
		this.configs = (IPatternTemplateVariable[]) configs.toArray();
		return this;
	}

	@Override
	public PatternSelectionSolution copy() {
		return new PatternSelectionSolution(this);
	}
}
