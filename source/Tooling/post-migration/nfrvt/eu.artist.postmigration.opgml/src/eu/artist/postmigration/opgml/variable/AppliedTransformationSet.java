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
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import eu.artist.postmigration.opgml.gml.uml.UMLElement;

public class AppliedTransformationSet {
	private Multimap<UMLElement, IPatternTemplateVariable> elementToConfig = ArrayListMultimap.create();
	private List<IPatternTemplateVariable> configs = new ArrayList<>();
	
	public AppliedTransformationSet() { }
	
	public AppliedTransformationSet(List<IPatternTemplateVariable> configs) {
		for(IPatternTemplateVariable config : configs)
			addConfiguration(config);
	}
	
	public AppliedTransformationSet(IPatternTemplateVariable... configs) {
		for(IPatternTemplateVariable config : configs)
			addConfiguration(config);
	}
	
	public AppliedTransformationSet addConfiguration(Object config) {
		if(config instanceof IPatternTemplateVariable)
			return addConfiguration((IPatternTemplateVariable)config);
		return this;
	}
	
	public AppliedTransformationSet addConfiguration(IPatternTemplateVariable config) {
		elementToConfig.put(config.getApplication(), config);
		configs.add(config);
		return this;
	}
	
	public Collection<IPatternTemplateVariable> getConfigurations() {
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
	

	
	@Override
	public String toString() {
		return toString("");
	}

	public String toString(String indent) {
		String configs = "";
		String delimiter = "";
		for(IPatternTemplateVariable config : getConfigurations()) {
			if(!(config instanceof PatternTemplatePlaceholder)) {
				configs += delimiter + indent + config;
				delimiter = "\n";
			}
		}
		return configs;
	}
	
	public boolean isValid() {
		Set<UMLElement> cached = new TreeSet<>();
		Set<UMLElement> scaled = new TreeSet<>();
		
		for(IPatternTemplateVariable config : getNonEmptyConfigurations())
			if(config instanceof CacheTemplate) {
				if(cached.contains(config.getApplication()))
					return false;
				cached.add(config.getApplication());
			} else if(config instanceof FixedScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					return false;
				scaled.add(config.getApplication());
			} else if(config instanceof AutoScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					return false;
				scaled.add(config.getApplication());
			}
		return true;
	}
	
	public AppliedTransformationSet repair() {
		Set<UMLElement> cached = new TreeSet<>();
		Set<UMLElement> scaled = new TreeSet<>();
		
//		System.out.println("TO REPAIR: " + this);
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
//		System.out.println("REPAIRED: " + this);
		return this;
	}
}