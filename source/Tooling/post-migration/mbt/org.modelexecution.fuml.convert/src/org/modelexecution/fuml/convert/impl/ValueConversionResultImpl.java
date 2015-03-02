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
import org.modelexecution.fuml.convert.IValueConversionResult;

import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.Value;

/**
 * Default implementation of an {@link IConversionResult}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class ValueConversionResultImpl implements IValueConversionResult {

	private ConversionStatusImpl status;
	private Collection<ExtensionalValue> extensionalValues;
	private Collection<Value> values;
	private Object input;

	private Map<Object, Object> inputToOutputMap = new HashMap<>();
	private Map<Object, Object> outputToInputMap = new HashMap<>();

	public ValueConversionResultImpl() {
		initialize();
	}

	public ValueConversionResultImpl(Object input) {
		this.input = input;
		initialize();
	}

	private void initialize() {
		values = new HashSet<Value>();
	}

	public void addInOutMapping(Object input, Object output) {
		if(output instanceof Value) {
			values.add((Value)output);
		}
		inputToOutputMap.put(input, output);
		outputToInputMap.put(output, input);
	}

	public Collection<Entry<Object, Object>> getMappings() {
		return inputToOutputMap.entrySet();
	}

	public void setStatus(ConversionStatusImpl status) {
		this.status = status;
	}

	public void setInput(Object input) {
		this.input = input;
	}

	@Override
	public ConversionStatusImpl getStatus() {
		return status;
	}

	@Override
	public Collection<Value> getValues() {
		return Collections.unmodifiableCollection(values);
	}

	@Override
	public Collection<ExtensionalValue> getExtensionalValues() {
		if (extensionalValues == null) {
			extensionalValues = obtainExtensionalValues();
		}
		return Collections.unmodifiableCollection(extensionalValues);
	}

	private Collection<ExtensionalValue> obtainExtensionalValues() {
		Collection<ExtensionalValue> result = new HashSet<ExtensionalValue>();
		for (Object outputElement : outputToInputMap.keySet()) {
			if (outputElement instanceof ExtensionalValue) {
				result.add((ExtensionalValue) outputElement);
			}
		}
		return result;
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public Object getFUMLElement(Object input) {
		return inputToOutputMap.get(input);
	}

	@Override
	public Object getInputObject(Object output) {
		return outputToInputMap.get(output);
	}

	@Override
	public boolean hasErrors() {
		return this.getStatus().getSeverity() == IStatus.ERROR;
	}

}
