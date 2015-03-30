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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.moeaframework.core.variable.RealVariable;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import eu.artist.postmigration.opgml.gml.uml.UMLElement;

public class GoalModel {
	private Multimap<UMLElement, RealGoal> elementToGoal = ArrayListMultimap.create();
	private Multimap<Property, RealGoal> propertyToGoal = ArrayListMultimap.create();
	private Multimap<Integer, RealGoal> priorityToGoal = ArrayListMultimap.create();
	
	private List<RealGoal> goals = new ArrayList<>();
	private List<Property> propertiesOfInterest = new ArrayList<Property>();
	
	private RealVariable priorityRange = new RealVariable(Double.MAX_VALUE, Double.MIN_VALUE);
	
	public GoalModel() { }
	
	public GoalModel(List<RealGoal> goals) {
		for(RealGoal goal : goals)
			addGoal(goal);
	}
	
	public GoalModel(RealGoal... goals) {
		for(RealGoal goal : goals)
			addGoal(goal);
	}
	
	private void addPropertyOfInterest(Property property) {
		if(!propertiesOfInterest.contains(property))
			propertiesOfInterest.add(property);
	}
	
	public void addGoal(RealGoal goal) {
		goals.add(goal);
		elementToGoal.put(goal.getUMLElement(), goal);
		propertyToGoal.put(goal.getProperty(), goal);
		priorityToGoal.put(goal.getPriority(), goal);
		addPropertyOfInterest(goal.getProperty());
		
		if(goal.getPriority() < priorityRange.getLowerBound())
			priorityRange = new RealVariable(goal.getPriority(), priorityRange.getUpperBound());
		if(goal.getPriority() > priorityRange.getUpperBound())
			priorityRange = new RealVariable(priorityRange.getLowerBound(), goal.getPriority());
	}
	
	public Collection<RealGoal> getGoals() {
		return goals;
	}
	
	public Collection<RealGoal> getGoals(UMLElement umlElement) {
		return elementToGoal.get(umlElement);
	}
	
	public Collection<RealGoal> getGoals(Property property) {
		return propertyToGoal.get(property);
	}
	
	public Collection<RealGoal> getGoals(int priority) {
		return priorityToGoal.get(priority);
	}

	public List<Property> getPropertiesOfInterest() {
		return propertiesOfInterest;
	}
	
	public Set<Property> getProperties() {
		return propertyToGoal.keySet();
	}
	
	public Set<Integer> getPriorities() {
		return priorityToGoal.keySet();
	}
	
	public RealVariable getPriorityRange() {
		return priorityRange;
	}
	
	public Set<UMLElement> getUMLElements() {
		return elementToGoal.keySet();
	}
	
	public RealGoal getGoal(UMLElement umlElement, Property property) {
		for(RealGoal goal : getGoals(umlElement))
			if(goal.getProperty().equals(property))
				return goal;
		return null;
	}
}
