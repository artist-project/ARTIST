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

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.nfr.simulation.internal.BasicResourceUsage;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;

public class ResourceUsageAnalysis {

	private static final String RESOURCE_USAGE_QUALIFIED_NAME = "MARTE::MARTE_Foundations::GRM::ResourceUsage"; //$NON-NLS-1$

	private Trace trace;
	private IConversionResult mapping;
	private Collection<IResourceUsage> resourceUsages;

	public ResourceUsageAnalysis(Trace trace, IConversionResult mapping) {
		this.trace = trace;
		this.mapping = mapping;
		computeResourceUsages();
	}

	private void computeResourceUsages() {
		resourceUsages = new ArrayList<IResourceUsage>();
		ActivityExecution rootActivityExecution = getRootActivityExecution();
		resourceUsages.addAll(createResourceUsages(rootActivityExecution));
	}

	private ActivityExecution getRootActivityExecution() {
		for (ActivityExecution execution : trace.getActivityExecutions())
			if (execution.getCaller() == null)
				return execution;
		return null;
	}

	private Collection<IResourceUsage> createResourceUsages(
			ActivityExecution activityExecution) {
		Collection<IResourceUsage> usages = new ArrayList<IResourceUsage>();
		Collection<IResourceUsage> subUsages = createSubUsages(activityExecution);
		ResourceUsage rawResourceUsage = getRawResourceUsage(activityExecution);
		NamedElement activity = getNamedElement(activityExecution.getActivity());
		CompoundResourceUsage usage = new CompoundResourceUsage(activity,
				rawResourceUsage, subUsages);
		usages.add(usage);
		return usages;
	}

	private Collection<IResourceUsage> createSubUsages(
			ActivityExecution activityExecution) {
		return createResourceUsages(activityExecution.getNodeExecutions());
	}

	private Collection<IResourceUsage> createResourceUsages(
			List<ActivityNodeExecution> nodeExecutions) {
		Collection<IResourceUsage> usages = new ArrayList<IResourceUsage>();
		for (ActivityNodeExecution nodeExecution : nodeExecutions) {
			usages.add(createResourceUsage(nodeExecution));
		}
		return usages;
	}

	private IResourceUsage createResourceUsage(
			ActivityNodeExecution nodeExecution) {
		ResourceUsage rawResourceUsage = getRawResourceUsage(nodeExecution
				.getNode());
		NamedElement namedElement = getNamedElement(nodeExecution.getNode());
		IResourceUsage resourceUsage = null;
		if (nodeExecution instanceof CallActionExecution) {
			CallActionExecution callActionExecution = (CallActionExecution) nodeExecution;
			ActivityExecution calledExecution = callActionExecution.getCallee();
			Collection<IResourceUsage> subUsages = createResourceUsages(calledExecution);
			resourceUsage = new CompoundResourceUsage(namedElement,
					rawResourceUsage, subUsages);
		} else {
			resourceUsage = new BasicResourceUsage(namedElement,
					rawResourceUsage);
		}
		return resourceUsage;
	}

	private NamedElement getNamedElement(
			fUML.Syntax.Activities.IntermediateActivities.ActivityNode node) {
		return (NamedElement) mapping.getInputObject(node);
	}

	private NamedElement getNamedElement(
			fUML.Syntax.Activities.IntermediateActivities.Activity activity) {
		return (NamedElement) mapping.getInputObject(activity);
	}

	private ResourceUsage getRawResourceUsage(
			ActivityExecution activityExecution) {
		ResourceUsage rawResourceUsage = getRawResourceUsage(activityExecution
				.getActivity());
		if (rawResourceUsage == null && activityExecution.getCaller() != null) {
			rawResourceUsage = getResourceUsageOfCallingCallAction(activityExecution);
		}
		return rawResourceUsage;
	}

	private ResourceUsage getResourceUsageOfCallingCallAction(
			ActivityExecution activityExecution) {
		ResourceUsage rawResourceUsage;
		CallActionExecution caller = activityExecution.getCaller();
		rawResourceUsage = getRawResourceUsage(caller.getNode());
		return rawResourceUsage;
	}

	private ResourceUsage getRawResourceUsage(
			fUML.Syntax.Activities.IntermediateActivities.ActivityNode node) {
		return getRawResourceUsage(getNamedElement(node));
	}

	private ResourceUsage getRawResourceUsage(
			fUML.Syntax.Activities.IntermediateActivities.Activity activity) {
		return getRawResourceUsage(getNamedElement(activity));
	}

	private ResourceUsage getRawResourceUsage(Element umlElement) {
		Stereotype appliedStereotype = null;
		try {
			// this throws an exception the first time it is called?!?! *sigh*
			appliedStereotype = umlElement
					.getAppliedStereotype(RESOURCE_USAGE_QUALIFIED_NAME);
		} catch (Exception e) {
			appliedStereotype = umlElement
					.getAppliedStereotype(RESOURCE_USAGE_QUALIFIED_NAME);
		}
		return appliedStereotype != null ? (ResourceUsage) umlElement
				.getStereotypeApplication(appliedStereotype) : null;
	}

	public Collection<IResourceUsage> getResourceUsages() {
		return Collections.unmodifiableCollection(resourceUsages);
	}

}
