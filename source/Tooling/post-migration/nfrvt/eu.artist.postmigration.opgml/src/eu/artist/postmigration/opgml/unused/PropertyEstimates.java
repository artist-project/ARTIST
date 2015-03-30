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

import java.util.Map;
import java.util.TreeMap;

import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;

public class PropertyEstimates {
	
	private Map<Property, Map<UMLElement, Double>> propertyValues = new TreeMap<Property, Map<UMLElement,Double>>();
	private Map<UMLElement, Map<Property, Double>> elementValues = new TreeMap<UMLElement, Map<Property,Double>>();
	private Map<Property, Double> defaultValues = new TreeMap<Property, Double>();
	
	public PropertyEstimates addEstimate(UMLElement element, Property property, Double value) {
		Map<UMLElement, Double> elementMap = propertyValues.get(property);
		if(elementMap == null) {
			elementMap = new TreeMap<>();
			propertyValues.put(property, elementMap);
		}
		elementMap.put(element, value);
		
		Map<Property, Double> propertyMap = elementValues.get(element);
		if(propertyMap == null) {
			propertyMap = new TreeMap<>();
			elementValues.put(element, propertyMap);
		}
		propertyMap.put(property, value);
		
		return this;
	}
	
	public Double getEstimate(UMLElement element, Property property) {
		Map<UMLElement, Double> map = propertyValues.get(property);
		if(map == null)
			return getDefaultValue(property);
		Double value = map.get(element);
		if(value == null)
			return getDefaultValue(property);
		return value;
	}
	
	public PropertyEstimates setDefaultValue(Property property, Double defaultValue) {
		defaultValues.put(property, defaultValue);
		return this;
	}
	
	public Map<Property, Double> getPropertyValues(UMLElement element) {
		return elementValues.get(element);
	}
 
	public Double getDefaultValue(Property property) {
		return defaultValues.get(property);
	}
}
