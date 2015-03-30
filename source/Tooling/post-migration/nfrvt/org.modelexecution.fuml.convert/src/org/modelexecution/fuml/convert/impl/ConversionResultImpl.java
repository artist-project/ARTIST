/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.convert.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IStatus;
import org.modelexecution.fuml.convert.IConversionResult;

import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.Element;

/**
 * Default implementation of an {@link IConversionResult}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class ConversionResultImpl implements IConversionResult {

	private ConversionStatusImpl status;
	private Collection<Activity> activities;
	private Collection<Activity> allActivities;
	private Object input;

	private Map<Object, Element> inputToOutputMap = new HashMap<>();
	private Map<Element, Object> outputToInputMap = new HashMap<>();

	public ConversionResultImpl() {
		initialize();
	}

	public ConversionResultImpl(Object input) {
		this.input = input;
		initialize();
	}

	private void initialize() {
		activities = new HashSet<Activity>();
	}

	public void addInOutMapping(Object input, Element output) {
		inputToOutputMap.put(input, output);
		outputToInputMap.put(output, input);
	}

	public Collection<Entry<Object, Element>> getMappings() {
		return inputToOutputMap.entrySet();
	}

	public void setStatus(ConversionStatusImpl status) {
		this.status = status;
	}

	public void addActivity(Activity activity) {
		this.activities.add(activity);
	}

	public void setInput(Object input) {
		this.input = input;
	}

	@Override
	public ConversionStatusImpl getStatus() {
		return status;
	}

	@Override
	public Collection<Activity> getActivities() {
		return Collections.unmodifiableCollection(activities);
	}

	@Override
	public Collection<Activity> getAllActivities() {
		if (allActivities == null) {
			allActivities = obtainAllActivities();
		}
		return Collections.unmodifiableCollection(allActivities);
	}

	private Collection<Activity> obtainAllActivities() {
		Collection<Activity> allActivities = new HashSet<Activity>();
		for (Object outputElement : outputToInputMap.keySet()) {
			if (outputElement instanceof Activity) {
				allActivities.add((Activity) outputElement);
			}
		}
		return allActivities;
	}

	@Override
	public Activity getActivity(String name) {
		for (Activity activity : obtainAllActivities()) {
			if (name.equals(activity.name)
					|| name.equals(activity.qualifiedName)) {
				return activity;
			}
		}
		return null;
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public Element getFUMLElement(Object input) {
		return inputToOutputMap.get(input);
	}

	@Override
	public Object getInputObject(Element output) {
		return outputToInputMap.get(output);
	}

	@Override
	public boolean hasErrors() {
		return this.getStatus().getSeverity() == IStatus.ERROR;
	}

}
