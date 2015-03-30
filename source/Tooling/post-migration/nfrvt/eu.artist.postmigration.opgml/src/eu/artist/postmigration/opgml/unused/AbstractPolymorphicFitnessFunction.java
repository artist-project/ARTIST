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
package eu.artist.postmigration.opgml.unused;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.moeaframework.core.Solution;
import org.moeaframework.core.variable.RealVariable;

import at.ac.tuwien.big.moea.util.MathUtil;
import at.ac.tuwien.big.moea.util.PolymorphicDispatcher;

import com.google.common.collect.Lists;

import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;

public abstract class AbstractPolymorphicFitnessFunction {
	
	protected static double ZERO = 0.0;
	
	private static Map<String, PolymorphicDispatcher<Double>> propertyDispatchers = new TreeMap<>();
	private static Map<String, PolymorphicDispatcher<Void>> solutionDispatchers = new TreeMap<>();

	private List<Property> properties;

	
	public AbstractPolymorphicFitnessFunction(Property[] properties) {
		this(Lists.newArrayList(properties));
	}
	
	public AbstractPolymorphicFitnessFunction(List<Property> properties) {
		this.properties = properties;
	}
	
	public void evaluate(Solution solution) {
		for(Property property : evaluatesProperties())
			evaluateProperty(property, solution);
	}
	
	public int getIndex(Property p) {
		return properties.indexOf(p);
	}
	
	private List<Property> evaluatesProperties() {
		return properties;
	}

	public void evaluateProperty(Property property, Solution solution) {
		if(property == null || solution == null)
			return;
		
		String propertyName = property.getName();
		PolymorphicDispatcher<Void> dispatcher = solutionDispatchers.get(propertyName);
		if(dispatcher == null) {
			dispatcher = new PolymorphicDispatcher<>(
					"evaluate" + propertyName, 2, 2,
					Collections.singletonList(this));
			solutionDispatchers.put(propertyName, dispatcher);
		}
		try {
			dispatcher.invoke(solution, property);
		} catch(Exception e) {
			System.out.println(e.getMessage()); // do nothing
		}
	}
	
	public Double evaluateProperty(Property property, IPatternTemplateVariable config) {
		if(property == null || config == null)
			return ZERO;
		
		String propertyName = property.getName();
		PolymorphicDispatcher<Double> dispatcher = propertyDispatchers.get(propertyName);
		if(dispatcher == null) {
			dispatcher = new PolymorphicDispatcher<>(
					"evaluate" + propertyName, 2, 2,
					Collections.singletonList(this));
			propertyDispatchers.put(propertyName, dispatcher);
		}
		try {
			return dispatcher.invoke(config, property);
		} catch(Exception e) {
			return ZERO;
		}
	}
	
	protected double rescaleZeroToOne(RealVariable value) {
		return MathUtil.rescale(value, MathUtil.ZERO_ONE_RANGE);
	}
}
