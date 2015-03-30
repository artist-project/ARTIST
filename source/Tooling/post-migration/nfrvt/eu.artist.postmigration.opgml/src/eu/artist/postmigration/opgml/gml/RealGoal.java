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
package eu.artist.postmigration.opgml.gml;

import org.moeaframework.core.variable.RealVariable;

import at.ac.tuwien.big.moea.util.MathUtil;
import at.ac.tuwien.big.moea.util.TextUtil;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLModel;

public class RealGoal {
	
	private static RealVariable getTargetRange(double value, Property property) {
		if(property.isRange()) {
			if(value > property.getRange().getLowerBound())
				return new RealVariable(property.getRange().getLowerBound(), value);
			else
				return new RealVariable(value, property.getRange().getUpperBound());
		}
		if(property.isIncreasing())
			return new RealVariable(value, property.getRange().getUpperBound());
		else
			return new RealVariable(property.getRange().getLowerBound(), value);
	}
	
	private UMLElement umlElement;
	private Property property;
	private RealVariable goalRange;
	private int priority;
	
	public RealGoal(UMLElement umlElement, Property property, RealVariable goalRange, int priority) {
		setUMLElement(umlElement);
		setProperty(property);
		setGoalRange(goalRange);
		setPriority(priority);
	}
	
	public RealGoal(UMLElement umlElement, Property property, double lowerBound, double upperBound, int priority) {
		this(umlElement, property, new RealVariable(lowerBound, upperBound), priority);
	}
	
	public RealGoal(UMLElement umlElement, Property property, double targetValue, int priority) {
		this(umlElement, property, getTargetRange(targetValue, property), priority);
	}
	
	public UMLElement getUMLElement() {
		return umlElement;
	}

	public void setUMLElement(UMLElement element) {
		this.umlElement = element;
	}
	
	public boolean isApplicationGoal() {
		return UMLModel.COMPLETE_APPLICATION.equals(getUMLElement());
	}
	
	public Property getProperty() {
		return property;
	}

	public void setProperty(Property objective) {
		this.property = objective;
	}
	
	public RealVariable getGoalRange() {
		return goalRange;
	}

	public void setGoalRange(RealVariable goalRange) {
		double lowerBound = Math.max(goalRange.getLowerBound(), property.getRange().getLowerBound());
		double upperBound = Math.min(goalRange.getUpperBound(), property.getRange().getUpperBound());
		this.goalRange = new RealVariable(lowerBound, upperBound);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isFulfilled(double value) {
		return MathUtil.isWithin(value, getGoalRange());
	}
	
	public double calcAbsoluteDifferenceToGoal(double value) {
		if(isFulfilled(value))
			return 0.0;
		double diffUpper = Math.abs(getGoalRange().getUpperBound() - value);
		double diffLower = Math.abs(value - getGoalRange().getLowerBound());
		return Math.min(diffLower, diffUpper);
	}
	
	private double getTargetValue() {
		if(property.isRange())
			return (getGoalRange().getUpperBound() + getGoalRange().getLowerBound()) / 2;
		if(property.isIncreasing())
			return getGoalRange().getLowerBound();
		return getGoalRange().getUpperBound();
	}
	
	public double calcRelativeDifferenceToGoal(double value) {
		double absoluteDiff = calcAbsoluteDifferenceToGoal(value);
		if(absoluteDiff == 0.0)
			return 0.0;
		return  absoluteDiff / getTargetValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(obj == null || obj.getClass() != getClass())
			return false;
		
		RealGoal other = (RealGoal) obj;
		return getUMLElement().equals(other.getUMLElement()) && getProperty().equals(other.getProperty());
	}
	
	@Override
	public String toString() {
		return getUMLElement() + "(" + getProperty().getName() + ", " + TextUtil.toRangeString(getGoalRange()) + ")";
	}
}
