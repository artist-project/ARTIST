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

import at.ac.tuwien.big.moea.util.TextUtil;


public class Property implements Comparable<Property> {
	
	public enum Direction {
		Increasing,
		Decreasing,
		Range
	}
	
	private String name;
	private RealVariable range;
	private Direction direction;
	
	public Property(String name, RealVariable range, Direction direction) {
		this.name = name;
		this.range = range;
		this.setDirection(direction);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public RealVariable getRange() {
		return range;
	}
	
	public void setRange(RealVariable range) {
		this.range = range;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public double getFraction(double percentage) {
		if(percentage < 0.0 || percentage > 1.0)
			throw new IllegalArgumentException("Percentage must be [0.0, 1.0], provided: " + percentage);
		return getValueRange() * percentage;
	}
	
	private double getValueRange() {
		return getRange().getUpperBound() - getRange().getLowerBound();
	}
	
	public boolean isIncreasing() {
		return Direction.Increasing.equals(getDirection());
	}
	
	public boolean isDecreasing() {
		return Direction.Decreasing.equals(getDirection());
	}
	
	public boolean isRange() {
		return Direction.Range.equals(getDirection());
	}
	
	@Override
	public int compareTo(Property other) {
		return getName().compareTo(other.getName());
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this)
			return true;
		if(other == null || other.getClass() != getClass())
			return false;
		
		return getName().equals(((Property)other).getName());
	}
	
	@Override
	public String toString() {
		return getName() + "[" + TextUtil.toRangeString(getRange()) + "]";
	}
}
