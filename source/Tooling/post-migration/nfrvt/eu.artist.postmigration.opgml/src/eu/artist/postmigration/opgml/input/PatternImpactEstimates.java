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
package eu.artist.postmigration.opgml.input;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import at.ac.tuwien.big.moea.util.TextUtil;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.util.OPGMLUtil;

public class PatternImpactEstimates {
	
	public static final double NEUTRAL_COST = 0.0;
	public static final double NEUTRAL_SPEEDUP = 0.0;

	private double priceOfInstancePerTimeUnit = 0.0010;
	private double priceOfChachePerTimeUnit = 0.0015;
	
	private double defaultCacheSpeedUp = 0.9;
	private double defaultInstanceSpeedUp = 1.0;
	
	private Map<UMLElement, Double> cacheSpeedUp = new TreeMap<>();
	private Map<UMLElement, Double> instanceSpeedUp = new TreeMap<>(); 
	
	public double getPriceOfInstancePerTimeUnit() {
		return priceOfInstancePerTimeUnit;
	}
	
	public PatternImpactEstimates setPriceOfInstancePerTimeUnit(double priceOfInstancePerTimeUnit) {
		this.priceOfInstancePerTimeUnit = priceOfInstancePerTimeUnit;
		return this;
	}
	
	public double getPriceOfChachePerTimeUnit() {
		return priceOfChachePerTimeUnit;
	}
	
	public PatternImpactEstimates setPriceOfChachePerTimeUnit(double priceOfChachePerTimeUnit) {
		this.priceOfChachePerTimeUnit = priceOfChachePerTimeUnit;
		return this;
	}
	
	public PatternImpactEstimates addCacheSpeedUp(UMLElement element, double speedUp) {
		cacheSpeedUp.put(element, speedUp);
		return this;
	}
	
	public Set<Entry<UMLElement, Double>> getCacheSpeedUps() {
		return cacheSpeedUp.entrySet();
	}
	
	public Double getCacheSpeedUp(UMLElement element) {
		Double speedUp = cacheSpeedUp.get(element);
		if(speedUp == null)
			return NEUTRAL_SPEEDUP;
		return speedUp;
	}
	
	public PatternImpactEstimates addInstanceSpeedUp(UMLElement element, double speedUp) {
		instanceSpeedUp.put(element, speedUp);
		return this;
	}
	
	public Set<Entry<UMLElement, Double>> getInstanceSpeedUps() {
		return instanceSpeedUp.entrySet();
	}
	
	public Double getInstanceSpeedUp(UMLElement element) {
		Double speedUp = instanceSpeedUp.get(element);
		if(speedUp == null)
			return NEUTRAL_SPEEDUP;
		return speedUp;
	}
	
	public double getDefaultCacheSpeedUp() {
		return defaultCacheSpeedUp;
	}
	
	public double getDefaultInstanceSpeedUp() {
		return defaultInstanceSpeedUp;
	}
	
	public PatternImpactEstimates setDefaultCacheSpeedUp(double defaultCacheSpeedUp) {
		this.defaultCacheSpeedUp = defaultCacheSpeedUp;
		return this;
	}
	
	public PatternImpactEstimates setDefaultInstanceSpeedUp(double defaultInstanceSpeedUp) {
		this.defaultInstanceSpeedUp = defaultInstanceSpeedUp;
		return this;
	}
	
	@Override
	public String toString() {
		return toString("");
	}
	
	public String toString(String indent) {
		String settings = "";
		settings += indent + "Price / Instance / TimeUnit: " + TextUtil.toString(getPriceOfInstancePerTimeUnit(), 5) + "\n";
		settings += indent + "Price / Cache / TimeUnit: " + TextUtil.toString(getPriceOfChachePerTimeUnit(), 5) + "\n";
		settings += indent + "Cache SpeedUp (default: " + getDefaultCacheSpeedUp() + "):\n";
		settings += OPGMLUtil.toString(cacheSpeedUp, indent + "  ");
		settings += indent + "Instance SpeedUp (default: " + getDefaultInstanceSpeedUp() + "):\n";
		settings += OPGMLUtil.toString(instanceSpeedUp, indent + "  ");
		return settings;
	}
}
