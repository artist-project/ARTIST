/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.nfr.simulation.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.IResourceUsage;

public class BasicResourceUsage implements IResourceUsage {

	private NamedElement namedElement;
	private ResourceUsage resourceUsage;

	private Map<Resource, String> execTime;
	private Map<Resource, String> allocatedMemory;
	private Map<Resource, String> usedMemory;
	private Map<Resource, String> powerPeak;
	private Map<Resource, String> energy;
	private Map<Resource, String> msgSize;

	public BasicResourceUsage(NamedElement namedElement,
			ResourceUsage resourceUsage) {
		this.namedElement = namedElement;
		if (resourceUsage != null) {
			this.resourceUsage = resourceUsage;
			this.obtainValues();
		} else {
			createEmtpyMaps();
		}
	}

	private void obtainValues() {
		execTime = createMap(resourceUsage.getExecTime());
		allocatedMemory = createMap(resourceUsage.getAllocatedMemory());
		usedMemory = createMap(resourceUsage.getUsedMemory());
		powerPeak = createMap(resourceUsage.getPowerPeak());
		energy = createMap(resourceUsage.getEnergy());
		msgSize = createMap(resourceUsage.getMsgSize());
	}

	private void createEmtpyMaps() {
		execTime = createMap(new BasicEList<String>());
		allocatedMemory = createMap(new BasicEList<String>());
		usedMemory = createMap(new BasicEList<String>());
		powerPeak = createMap(new BasicEList<String>());
		energy = createMap(new BasicEList<String>());
		msgSize = createMap(new BasicEList<String>());
	}

	private Map<Resource, String> createMap(EList<String> values) {
		Map<Resource, String> map = new HashMap<Resource, String>();
		for (Resource resource : getUsedResourcesFromStereotype()) {
			map.put(resource, getValue(values, resource));
		}
		return map;
	}

	private String getValue(EList<String> values, Resource resource) {
		int index = getResourceIndex(resource);
		return getValue(values, index);
	}

	private int getResourceIndex(Resource resource) {
		return getUsedResourcesFromStereotype().indexOf(resource);
	}

	private String getValue(EList<String> values, int index) {
		if (hasValue(values, index)) {
			return values.get(index);
		} else if (isVariable(values)) {
			return getVariable(values);
		}
		return UNDEFINED;
	}

	private boolean hasValue(EList<String> values, int index) {
		return isNotNullAndNotEmpty(values) && values.size() > index;
	}

	protected boolean isVariable(EList<String> values) {
		return isNotNullAndNotEmpty(values) && isVariable(values.get(0));
	}

	protected boolean isVariable(String value) {
		return value != null && value.startsWith(VARIABLE_CHAR);
	}

	protected boolean isVariableOrUndefined(String value) {
		return isVariable(value) || isUndefined(value);
	}

	protected boolean isUndefined(String value) {
		return value == null || UNDEFINED.equals(value);
	}

	private boolean isNotNullAndNotEmpty(EList<String> values) {
		return values != null && !values.isEmpty();
	}

	private String getVariable(EList<String> values) {
		return isVariable(values) ? values.get(0) : null;
	}

	@Override
	public ResourceUsage getRawResourceUsage() {
		return resourceUsage;
	}

	@Override
	public List<Resource> getUsedResources() {
		return getUsedResourcesFromStereotype();
	}

	protected List<Resource> getUsedResourcesFromStereotype() {
		return resourceUsage != null ? Collections
				.unmodifiableList(resourceUsage.getUsedResources())
				: Collections.unmodifiableList(new ArrayList<Resource>());
	}

	@Override
	public String getExecTime(Resource resource) {
		return execTime.get(resource);
	}

	@Override
	public String getAllocatedMemory(Resource resource) {
		return allocatedMemory.get(resource);
	}

	@Override
	public String getUsedMemory(Resource resource) {
		return usedMemory.get(resource);
	}

	@Override
	public String getPowerPeak(Resource resource) {
		return powerPeak.get(resource);
	}

	@Override
	public String getEnergy(Resource resource) {
		return energy.get(resource);
	}

	@Override
	public String getMsgSize(Resource resource) {
		return msgSize.get(resource);
	}

	@Override
	public NamedElement getElement() {
		return namedElement;
	}

}
