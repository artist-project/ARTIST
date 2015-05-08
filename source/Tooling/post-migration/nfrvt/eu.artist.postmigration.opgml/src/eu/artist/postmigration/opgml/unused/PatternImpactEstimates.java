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
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;

public class PatternImpactEstimates {
	private Map<String, PropertyEstimates> estimates = new TreeMap<>();
	
	public void addEstimate(Class<? extends IPatternTemplateVariable> config, UMLElement element, Property property, Double value) {
		PropertyEstimates configEstimates = estimates.get(config.getCanonicalName());
		if(configEstimates == null) {
			configEstimates = new PropertyEstimates();
			estimates.put(config.getCanonicalName(), configEstimates);
		}
		configEstimates.addEstimate(element, property, value);
	}
	
	public void setDefaultValue(Class<? extends IPatternTemplateVariable> config, Property property, Double defaultValue) {
		PropertyEstimates configEstimates = estimates.get(config.getCanonicalName());
		if(configEstimates == null) {
			configEstimates = new PropertyEstimates();
			estimates.put(config.getCanonicalName(), configEstimates);
		}
		configEstimates.setDefaultValue(property, defaultValue);
	}
	
	public Double getEstimate(Class<? extends IPatternTemplateVariable> config, UMLElement element, Property property) {
		PropertyEstimates configEstimates = estimates.get(config.getCanonicalName());
		if(configEstimates != null)
			return configEstimates.getEstimate(element, property);
		return 0.0;
	}
	
	public Map<Property, Double> getPropertyValues(Class<? extends IPatternTemplateVariable> config, UMLElement element) {
		PropertyEstimates configEstimates = estimates.get(config.getCanonicalName());
		if(configEstimates != null)
			return configEstimates.getPropertyValues(element);
		return new TreeMap<>();
	}
	
	public PropertyEstimates getPropertyEstimates(Class<? extends IPatternTemplateVariable> config) {
		return estimates.get(config.getCanonicalName());
	}
}
