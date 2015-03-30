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

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.moeaframework.core.Variable;

import eu.artist.postmigration.opgml.gml.PatternTemplate;

public abstract class AbstractPatternTemplate extends PatternTemplate<Variable> implements IPatternTemplateVariable, Comparable<IPatternTemplateVariable> {
	
	private static final long serialVersionUID = -7837360549952451019L;
	
	private Set<String> uniquenessParameters = new TreeSet<>();
	
	public AbstractPatternTemplate() { }
	
	public AbstractPatternTemplate(String name) {
		super(name);
	}
	
	public AbstractPatternTemplate(String[] uniquenessParameters) {
		setUniquenessParameters(uniquenessParameters);
	}
	
	public AbstractPatternTemplate(String name, String[] uniquenessParameters) {
		super(name);
		setUniquenessParameters(uniquenessParameters);
	}	
	
	protected Set<String> getUniquenessParameters() {
		return uniquenessParameters;
	}

	protected AbstractPatternTemplate setUniquenessParameters(String[] uniquenessParameters) {
		this.uniquenessParameters.clear();
		this.uniquenessParameters.addAll(Arrays.asList(uniquenessParameters));
		return this;
	}
	
	protected AbstractPatternTemplate addUniquenessParameter(String parameter) {
		getUniquenessParameters().add(parameter);
		return this;
	}	

	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;
		
		AbstractPatternTemplate other = (AbstractPatternTemplate) obj;
		if(!getName().equals(other.getName()))
			return false;
		
		for(String uniqueParameter : getUniquenessParameters()) {
			Variable myValue = getParameterValue(uniqueParameter);
			Variable otherValue = other.getParameterValue(uniqueParameter);
			if(!equals(myValue, otherValue))
				return false;
		}
		return true;
	}
	
	public static boolean equals(Variable left, Variable right) {
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		return left.equals(right);
	}
	
	public AbstractPatternTemplate newRandomInstance() {
		AbstractPatternTemplate config = ((AbstractPatternTemplate) copy());
		config.randomize();
		return config;
	}
	
	protected static void copyParameterValues(
			AbstractPatternTemplate from, AbstractPatternTemplate to) {
		for(Entry<String, Variable> parameter : from.getParameterEntries())
			to.setParameter(parameter.getKey(), parameter.getValue().copy());
	}
	
	@Override
	public int compareTo(IPatternTemplateVariable o) {
		if(this.equals(o))
			return 0;
		else
			return this.toString().compareTo(o.toString());
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getParameterValues() + ")";
	}
	
	@Override
	public abstract IPatternTemplateVariable randomize();
}
