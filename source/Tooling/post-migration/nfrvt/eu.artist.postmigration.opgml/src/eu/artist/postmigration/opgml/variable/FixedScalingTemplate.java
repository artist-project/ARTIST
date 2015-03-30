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

import at.ac.tuwien.big.moea.variable.RandomIntegerVariable;
import eu.artist.postmigration.opgml.gml.uml.UMLClass;


public class FixedScalingTemplate extends AbstractAppliedPatternTemplate {

	private static final long serialVersionUID = 7585510161515534757L;
	private static final RandomIntegerVariable DEFAULT_INSTANCES_VARIABLE = new RandomIntegerVariable(1, 10);
	
	public static String getInstancesParameter() {
		return "nrInstances";
	}

	public FixedScalingTemplate(UMLClass[] possibleApplications) {
		this(possibleApplications, DEFAULT_INSTANCES_VARIABLE);
	}
	
	public FixedScalingTemplate(UMLClass[] possibleApplications, RandomIntegerVariable instancesVariable) {
		super("FixedScaling", new String[] { getApplicationParameter() }, possibleApplications);
		setParameter(getInstancesParameter(), instancesVariable);
	}
	
	protected RandomIntegerVariable getInstancesVariable() {
		return (RandomIntegerVariable) getParameterValue(getInstancesParameter());
	}
	
	public int getInstances() {
		return getInstancesVariable().getValue();
	}
	
	public FixedScalingTemplate setInstances(int instances) {
		getInstancesVariable().setValue(instances);
		return this;
	}
	
	@Override
	protected UMLClass[] getPossibleApplications() {
		return (UMLClass[]) super.getPossibleApplications();
	}
	
	@Override
	public UMLClass getApplication() {
		return (UMLClass) super.getApplication();
	}
	
	@Override
	public FixedScalingTemplate copy() {
		FixedScalingTemplate scaling = new FixedScalingTemplate(getPossibleApplications(), getInstancesVariable());
		copyParameterValues(this, scaling);
		return scaling;
	}
	
	@Override
	public FixedScalingTemplate randomize() {
		super.randomize();
		getInstancesVariable().randomize();
		
		return this;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getApplication() + ", " + getInstances() + ")";
	}
}
