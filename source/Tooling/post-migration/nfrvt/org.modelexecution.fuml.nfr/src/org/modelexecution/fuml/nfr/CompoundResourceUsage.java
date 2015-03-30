/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.nfr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.simulation.internal.BasicResourceUsage;

public class CompoundResourceUsage extends BasicResourceUsage {

	private List<Resource> usedResources;
	private Collection<IResourceUsage> subUsages;

	public CompoundResourceUsage(NamedElement namedElement,
			ResourceUsage resourceUsage, Collection<IResourceUsage> subUsages) {
		super(namedElement, resourceUsage);
		this.subUsages = subUsages;
	}

	@Override
	public List<Resource> getUsedResources() {
		if (usedResources == null) {
			if (getUsedResourcesFromStereotype().size() > 0) {
				usedResources = getUsedResourcesFromStereotype();
			} else {
				usedResources = new ArrayList<Resource>();
				for (IResourceUsage subUsage : subUsages) {
					for (Resource resource : subUsage.getUsedResources()) {
						if (!usedResources.contains(resource)) {
							usedResources.add(resource);
						}
					}
				}
			}
		}
		return Collections.unmodifiableList(usedResources);
	}

	@Override
	public String getAllocatedMemory(Resource resource) {
		if (isVariableOrUndefined(super.getAllocatedMemory(resource))) {
			Collection<String> subValues = getSubAllocatedMemory(resource);
			return computeSumValue(super.getAllocatedMemory(resource),
					subValues);
		} else {
			return super.getAllocatedMemory(resource);
		}
	}

	protected Collection<String> getSubAllocatedMemory(Resource resource) {
		Collection<String> subAllocatedMemory = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getAllocatedMemory(resource);
			if (isDefined(subValue)) {
				subAllocatedMemory.add(subValue);
			}
		}
		return subAllocatedMemory;
	}

	private boolean isDefined(String value) {
		return value != null && !UNDEFINED.equals(value);
	}

	@Override
	public String getEnergy(Resource resource) {
		if (isVariableOrUndefined(super.getEnergy(resource))) {
			Collection<String> subValues = getSubEnergy(resource);
			return computeSumValue(super.getEnergy(resource), subValues);
		} else {
			return super.getEnergy(resource);
		}
	}

	protected Collection<String> getSubEnergy(Resource resource) {
		Collection<String> subEnergy = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getEnergy(resource);
			if (isDefined(subValue)) {
				subEnergy.add(subValue);
			}
		}
		return subEnergy;
	}

	@Override
	public String getExecTime(Resource resource) {
		if (isVariableOrUndefined(super.getExecTime(resource))) {
			Collection<String> subValues = getSubExecTime(resource);
			return computeSumValue(super.getExecTime(resource), subValues);
		} else {
			return super.getExecTime(resource);
		}
	}

	protected Collection<String> getSubExecTime(Resource resource) {
		Collection<String> subExecTime = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getExecTime(resource);
			if (isDefined(subValue)) {
				subExecTime.add(subValue);
			}
		}
		return subExecTime;
	}

	@Override
	public String getMsgSize(Resource resource) {
		if (isVariableOrUndefined(super.getMsgSize(resource))) {
			Collection<String> subValues = getSubMsgSize(resource);
			return computeSumValue(super.getMsgSize(resource), subValues);
		} else {
			return super.getMsgSize(resource);
		}
	}

	protected Collection<String> getSubMsgSize(Resource resource) {
		Collection<String> subMsgSize = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getMsgSize(resource);
			if (isDefined(subValue)) {
				subMsgSize.add(subValue);
			}
		}
		return subMsgSize;
	}

	@Override
	public String getPowerPeak(Resource resource) {
		if (isVariableOrUndefined(super.getPowerPeak(resource))) {
			Collection<String> subValues = getSubPowerPeak(resource);
			return computeSumValue(super.getPowerPeak(resource), subValues);
		} else {
			return super.getPowerPeak(resource);
		}
	}

	protected Collection<String> getSubPowerPeak(Resource resource) {
		Collection<String> subPowerPeak = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getPowerPeak(resource);
			if (isDefined(subValue)) {
				subPowerPeak.add(subValue);
			}
		}
		return subPowerPeak;
	}

	@Override
	public String getUsedMemory(Resource resource) {
		if (isVariableOrUndefined(super.getUsedMemory(resource))) {
			Collection<String> subValues = getSubUsedMemory(resource);
			return computeSumValue(super.getUsedMemory(resource), subValues);
		} else {
			return super.getUsedMemory(resource);
		}
	}

	protected Collection<String> getSubUsedMemory(Resource resource) {
		Collection<String> subUsedMemory = new ArrayList<String>();
		for (IResourceUsage subUsage : getSubUsages()) {
			String subValue = subUsage.getUsedMemory(resource);
			if (isDefined(subValue)) {
				subUsedMemory.add(subValue);
			}
		}
		return subUsedMemory;
	}

	private String computeSumValue(String variable, Collection<String> subValues) {
		return computeSum(subValues);
	}

	private String computeSum(Collection<String> subValues) {
		float sum = 0;
		for (String value : subValues) {
			float floatValue = safeGetFloatValue(value);
			sum += floatValue;
		}
		return String.valueOf(sum);
	}

	private Float safeGetFloatValue(String value) {
		if (value == null)
			return 0f;
		try {
			return Float.valueOf(value);
		} catch (NumberFormatException e) {
			return 0f;
		}
	}

	public Collection<IResourceUsage> getSubUsages() {
		return Collections.unmodifiableCollection(subUsages);
	}
}
