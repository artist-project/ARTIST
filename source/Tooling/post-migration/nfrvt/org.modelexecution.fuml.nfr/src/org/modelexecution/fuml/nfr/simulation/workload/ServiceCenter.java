/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.workload;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.SchedPolicyKind;
import org.eclipse.uml2.uml.NamedElement;

/***
 * A service center represents an entity with limited resources. A service
 * center offers different services (operations of the uml element), that
 * can be requested. The resource demands of the service is annotated 
 * directly on the operations. Additionally a default service time can
 * be specified. 
 * A service center can have multiple instances of itself that all share 
 * the same characteristics. A scheduling policy / balancing strategy decides 
 * how requests are  divided among these instances.
 * Additionally a service center might change the number of instances 
 * dynamically.
 * 
 * @author Martin Fleck
 *
 */
public class ServiceCenter {
	private NamedElement umlElement;
	private int multiplicity;
	private SchedPolicyKind schedulingPolicy;
	private boolean isDynamic = false;
	private int defaultServiceTime = 1000; // ms

	public ServiceCenter() {
	}
	
	public ServiceCenter(NamedElement umlElement, int multiplicity, SchedPolicyKind schedulingPolicy) {
		setUmlElement(umlElement);
		setMultiplicity(multiplicity);
		setSchedulingPolicy(schedulingPolicy);
	}
	
	public NamedElement getUmlElement() {
		return umlElement;
	}

	public ServiceCenter setUmlElement(NamedElement umlElement) {
		this.umlElement = umlElement;
		return this;
	}

	public String getName() {
		if(getUmlElement() == null)
			return "";
		return getUmlElement().getName();
	}

	public int getMultiplicity() {
		return multiplicity;
	}

	public ServiceCenter setMultiplicity(int multiplicity) {
		this.multiplicity = multiplicity;
		return this;
	}

	public SchedPolicyKind getSchedulingPolicy() {
		return schedulingPolicy;
	}

	public ServiceCenter setSchedulingPolicy(SchedPolicyKind schedulingPolicy) {
		this.schedulingPolicy = schedulingPolicy;
		return this;
	}
	
	public int getDefaultServiceTime() {
		return defaultServiceTime;
	}

	public ServiceCenter setDefaultServiceTime(int defaultServiceTime) {
		this.defaultServiceTime = defaultServiceTime;
		return this;
	}
	
	public boolean isDynamic() {
		return isDynamic;
	}
	
	public ServiceCenter setDynamic(boolean isDynamic) {
		this.isDynamic = isDynamic;
		return this;
	}
	
	@Override
	public String toString() {
		return getMultiplicity() + " x " + getName() + " with " + getSchedulingPolicy() + " (default service time: " + getDefaultServiceTime() + "ms), dynamic: " + isDynamic();
	}
}
