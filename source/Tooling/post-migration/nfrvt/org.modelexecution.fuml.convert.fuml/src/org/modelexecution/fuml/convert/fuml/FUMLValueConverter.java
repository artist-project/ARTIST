/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package org.modelexecution.fuml.convert.fuml;

import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Value;
import org.modelexecution.fuml.convert.FUMLConvertPlugin;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConversionStatus;
import org.modelexecution.fuml.convert.IValueConversionResult;
import org.modelexecution.fuml.convert.IValueConverter;
import org.modelexecution.fuml.convert.fuml.internal.FUMLValueInput;
import org.modelexecution.fuml.convert.fuml.internal.gen.ValueFactory;
import org.modelexecution.fuml.convert.fuml.internal.gen.ValuePopulatorSuite;
import org.modelexecution.fuml.convert.impl.ConversionStatusImpl;
import org.modelexecution.fuml.convert.impl.ValueConversionResultImpl;

public class FUMLValueConverter implements IValueConverter {

	private FUMLValueInput fumlValueInput;
	private ValueConversionResultImpl result;
	private ConversionStatusImpl status;

	private IConversionResult conversionResult;

	public FUMLValueConverter(IConversionResult conversionResult) {
		this.conversionResult = conversionResult;
	}

	@Override
	public boolean canConvert(Object input) {
		if (input == null)
			return false;
		initializeFUMLValueInput(input);
		return fumlValueInput.containsValues();
	}

	private void initializeFUMLValueInput(Object input) {
		if (needToInitializeFUMLInput(input)) {
			fumlValueInput = new FUMLValueInput(input);
		}
	}

	private boolean needToInitializeFUMLInput(Object input) {
		return fumlValueInput == null
				|| !fumlValueInput.getOriginalInput().equals(input);
	}

	@Override
	public IValueConversionResult convert(Object input) {
		if (!canConvert(input))
			return createCannotConvertResult(input);
		initializeFUMLValueInput(input);
		return startConversion();
	}

	private IValueConversionResult createCannotConvertResult(Object input) {
		ValueConversionResultImpl result = new ValueConversionResultImpl(input);
		ConversionStatusImpl status = new ConversionStatusImpl(
				FUMLConverterPlugin.ID,
				IConversionStatus.CANNOT_CONVERT_INPUT_ERROR, "Cannot convert "
						+ input.toString(), new IllegalArgumentException(
						"Cannot convert " + input.toString()));
		result.setStatus(status);
		return result;
	}

	protected ValueConversionResultImpl startConversion() {
		initializeResult();
		instantiateModel();
		populateModelValues();
		return result;
	}

	private void initializeResult() {
		result = new ValueConversionResultImpl(
				fumlValueInput.getOriginalInput());
		status = new ConversionStatusImpl(FUMLConverterPlugin.ID,
				IConversionStatus.OK, "Initializing OK", null);
		result.setStatus(status);
	}

	private void instantiateModel() {
		ValueFactory factory = new ValueFactory();
		for (EObject inputValue : fumlValueInput.getValuesToConvert()) {
			instantiateValue(factory, inputValue);
			for (TreeIterator<EObject> treeIterator = inputValue
					.eAllContents(); treeIterator.hasNext();) {
				EObject inputElementChild = treeIterator.next();
				if (inputElementChild instanceof Value || inputElementChild instanceof FeatureValue) {
					instantiateValue(factory, inputElementChild);
				}
			}
		}
	}

	private void instantiateValue(ValueFactory factory, EObject inputValue) {
		Object value = factory.create(inputValue);
		if (value != null) {
			result.addInOutMapping(inputValue, value);
		} else {
			addWarningToResult("Could not convert " + inputValue.toString());
		}
	}

	private void populateModelValues() {
		ValuePopulatorSuite populator = new ValuePopulatorSuite(
				conversionResult, result);
		for (Iterator<Entry<Object, Object>> iterator = result.getMappings()
				.iterator(); iterator.hasNext();) {
			Entry<Object, Object> mapping = iterator.next();
			applyPopulator(populator, mapping.getValue(), mapping.getKey());
		}
	}

	private void applyPopulator(ValuePopulatorSuite populator,
			Object fUMLElement, Object fumlElement_) {
		try {
			populator.populate(fUMLElement, fumlElement_);
		} catch (Exception e) {
			addErrorToResult(IConversionStatus.ERROR_WHILE_CONVERSION,
					"Exception while applying feature values.", e);
		}
	}

	protected void addErrorToResult(int code, String message,
			Throwable throwable) {
		status.add(new Status(IStatus.ERROR, FUMLConverterPlugin.ID, code,
				message, throwable));
		FUMLConvertPlugin.instance.getLog().log(IStatus.ERROR, message,
				throwable);
	}

	protected void addInfoToResult(String message) {
		status.add(new Status(IStatus.INFO, FUMLConverterPlugin.ID, message));
	}

	protected void addWarningToResult(String message) {
		status.add(new Status(IStatus.WARNING, FUMLConverterPlugin.ID, message));
		FUMLConvertPlugin.instance.getLog().log(IStatus.WARNING, message);
	}

}
