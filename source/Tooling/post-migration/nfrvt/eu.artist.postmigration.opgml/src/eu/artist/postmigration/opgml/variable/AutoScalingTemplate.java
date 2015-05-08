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

import org.moeaframework.core.variable.RealVariable;

import at.ac.tuwien.big.moea.util.TextUtil;
import at.ac.tuwien.big.moea.variable.RandomIntegerVariable;
import eu.artist.postmigration.opgml.gml.uml.UMLClass;
import eu.artist.postmigration.opgml.util.OPGMLUtil;

public class AutoScalingTemplate extends AbstractAppliedPatternTemplate {

	public static enum AutoScalingValue {
		Utilization,
		AverageQueueLength,
		MinimumQueueLength
	}
	
	private static final long serialVersionUID = 7585510161515534757L;
	
	protected static String getMinInstancesParameter() {
		return "minInstances";
	}

	protected static String getMaxInstancesParameter() {
		return "maxInstances";
	}
	
	protected static String getAutoScalingValueParameter() {
		return "autoScalingValueIndex";
	}
	
	protected static String getScaleInThresholdParameter() {
		return "scaleInThreshold";
	}
	
	protected static String getScaleOutThresholdParameter() {
		return "scaleOutThreshold";
	}
	
	private AutoScalingValue[] possibleAutoScalingValues;
	
	public AutoScalingTemplate(UMLClass[] possibleApplications, 
			RandomIntegerVariable minInstances,
			RandomIntegerVariable maxInstances,
			AutoScalingValue[] possibleAutoScalingValues,
			RealVariable scaleInThreshold,
			RealVariable scaleOutThreshold) {
		super("AutoScaling", new String[] { getApplicationParameter() }, possibleApplications);
		setParameter(getMinInstancesParameter(), minInstances);
		setParameter(getMaxInstancesParameter(), maxInstances);
		this.possibleAutoScalingValues = possibleAutoScalingValues;
		setParameter(getAutoScalingValueParameter(), new RandomIntegerVariable(0, possibleAutoScalingValues.length - 1));
		setParameter(getScaleInThresholdParameter(), scaleInThreshold);
		setParameter(getScaleOutThresholdParameter(), scaleOutThreshold);
	}
	
	public AutoScalingValue[] getPossibleAutoScalingValues() {
		return possibleAutoScalingValues;
	}
	
	protected RandomIntegerVariable getMinInstancesVariable() {
		return (RandomIntegerVariable) getParameterValue(getMinInstancesParameter());
	}
	
	public int getMinInstances() {
		return getMinInstancesVariable().getValue();
	}
	
	public AutoScalingTemplate setMinInstances(int minInstances) {
		getMinInstancesVariable().setValue(minInstances);
		return this;
	}
	
	protected RandomIntegerVariable getMaxInstancesVariable() {
		return (RandomIntegerVariable) getParameterValue(getMaxInstancesParameter());
	}
	
	public int getMaxInstances() {
		return getMaxInstancesVariable().getValue();
	}
	
	public AutoScalingTemplate setMaxInstances(int maxInstances) {
		getMaxInstancesVariable().setValue(maxInstances);
		return this;
	}
	
	public double getAvgInstances() {
		return (getMaxInstances() + getMinInstances()) / 2;
	}
	
	protected RandomIntegerVariable getAutoScalingValueIndexVariable() {
		return (RandomIntegerVariable) getParameterValue(getAutoScalingValueParameter());
	}
	
	protected int getAutoScalingValueIndex() {
		return getAutoScalingValueIndexVariable().getValue();
	}
	
	protected RealVariable getScaleInThresholdVariable() {
		return (RealVariable) getParameterValue(getScaleInThresholdParameter());
	}
	
	public double getScaleInThreshold() {
		return getScaleInThresholdVariable().getValue();
	}
	
	protected RealVariable getScaleOutThresholdVariable() {
		return (RealVariable) getParameterValue(getScaleOutThresholdParameter());
	}
	
	public double getScaleOutThreshold() {
		return getScaleOutThresholdVariable().getValue();
	}
	
	public AutoScalingValue getAutoScalingValue() {
		return getPossibleAutoScalingValues()[getAutoScalingValueIndex()];
	}
	
	@Override
	public UMLClass getApplication() {
		return (UMLClass) super.getApplication();
	}
	
	@Override
	protected UMLClass[] getPossibleApplications() {
		return (UMLClass[]) super.getPossibleApplications();
	}
	
	@Override
	public AutoScalingTemplate copy() {
		AutoScalingTemplate scaling = new AutoScalingTemplate(
				getPossibleApplications(),
				getMinInstancesVariable().copy(),
				getMaxInstancesVariable().copy(),
				getPossibleAutoScalingValues(), 
				getScaleInThresholdVariable().copy(),
				getScaleOutThresholdVariable().copy());
		copyParameterValues(this, scaling);
		return scaling;
	}
	
	@Override
	public AutoScalingTemplate randomize() {
		super.randomize();
		getMinInstancesVariable().randomize();
		getMaxInstancesVariable().randomize();
		getAutoScalingValueIndexVariable().randomize();
		OPGMLUtil.randomize(getScaleInThresholdVariable());
		OPGMLUtil.randomize(getScaleOutThresholdVariable());
		
		return repairedConfiguration(this);
	}
	
	@Override
	public String toString() {
		return getName() + "(" + 
			getApplication() + ", " + 
			getMinInstances() + ", " + 
			getMaxInstances() + ", " + 
			getAutoScalingValue() + ", " + 
			TextUtil.toString(getScaleInThreshold(), 4) + ", " +
			TextUtil.toString(getScaleOutThreshold(), 4) + ")";
	}
	
	public static boolean isValidConfiguration(AutoScalingTemplate config) {
		return config.getMinInstances() <= config.getMaxInstances();
	}
	
	public static AutoScalingTemplate repairedConfiguration(AutoScalingTemplate config) {
		if(isValidConfiguration(config))
			return config;
		int minInstances = config.getMinInstances();
		config.setMinInstances(config.getMaxInstances());
		config.setMaxInstances(minInstances);
		return config;
	}
}
