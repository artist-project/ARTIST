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
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Element;
import org.modelexecution.fuml.convert.FUMLConvertPlugin;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConversionStatus;
import org.modelexecution.fuml.convert.IConverter;
import org.modelexecution.fuml.convert.fuml.internal.FUMLInput;
import org.modelexecution.fuml.convert.fuml.internal.gen.ElementFactory;
import org.modelexecution.fuml.convert.fuml.internal.gen.ElementPopulatorSuite;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.impl.ConversionStatusImpl;

public class FUMLConverter implements IConverter {

	private FUMLInput fumlInput;
	private ConversionResultImpl result;
	private ConversionStatusImpl status;

	@Override
	public boolean canConvert(Object input) {
		if (input == null)
			return false;
		initializeFUMLInput(input);
		return fumlInput.containsActivities();
	}

	private void initializeFUMLInput(Object input) {
		if (needToInitializeFUMLInput(input)) {
			fumlInput = new FUMLInput(input);
		}
	}

	private boolean needToInitializeFUMLInput(Object input) {
		return fumlInput == null || !fumlInput.getOriginalInput().equals(input);
	}

	@Override
	public IConversionResult convert(Object input) {
		if (!canConvert(input))
			return createCannotConvertResult(input);
		initializeFUMLInput(input);
		return startConversion();
	}

	private IConversionResult createCannotConvertResult(Object input) {
		ConversionResultImpl result = new ConversionResultImpl(input);
		ConversionStatusImpl status = new ConversionStatusImpl(
				FUMLConverterPlugin.ID,
				IConversionStatus.CANNOT_CONVERT_INPUT_ERROR, "Cannot convert "
						+ input.toString(), new IllegalArgumentException(
						"Cannot convert " + input.toString()));
		result.setStatus(status);
		return result;
	}

	protected ConversionResultImpl startConversion() {
		initializeResult();
		instantiateModel();
		populateModelValues();
		setMainActivitiesToResult();
		return result;
	}

	private void initializeResult() {
		result = new ConversionResultImpl(fumlInput.getOriginalInput());
		status = new ConversionStatusImpl(FUMLConverterPlugin.ID,
				IConversionStatus.OK, "Initializing OK", null);
		result.setStatus(status);
	}

	private void instantiateModel() {
		ElementFactory factory = new ElementFactory();
		for (Element inputElement : fumlInput.getElementsToConvert()) {
			instantiateElement(factory, inputElement);
			for (TreeIterator<EObject> treeIterator = inputElement
					.eAllContents(); treeIterator.hasNext();) {
				EObject inputElementChild = treeIterator.next();
				if (inputElementChild instanceof Element) {
					instantiateElement(factory, (Element) inputElementChild);
				}
			}
		}
	}

	private void instantiateElement(ElementFactory factory, Element inputElement) {
		fUML.Syntax.Classes.Kernel.Element element = factory
				.create(inputElement);
		if (element != null) {
			result.addInOutMapping(inputElement, element);
		} else {
			addWarningToResult("Could not convert " + inputElement.toString());
		}
	}

	private void populateModelValues() {
		ElementPopulatorSuite populator = new ElementPopulatorSuite(result);
		for (Iterator<Entry<Object, fUML.Syntax.Classes.Kernel.Element>> iterator = result
				.getMappings().iterator(); iterator.hasNext();) {
			Entry<Object, fUML.Syntax.Classes.Kernel.Element> mapping = iterator
					.next();
			applyPopulator(populator, mapping.getValue(),
					(Element) mapping.getKey());
		}
	}

	private void applyPopulator(ElementPopulatorSuite populator,
			fUML.Syntax.Classes.Kernel.Element fUMLElement, Element uml2Element) {
		try {
			populator.populate(fUMLElement, uml2Element);
		} catch (Exception e) {
			addErrorToResult(IConversionStatus.ERROR_WHILE_CONVERSION,
					"Exception while applying feature values.", e);
		}
	}

	private void setMainActivitiesToResult() {
		for (Activity activity : fumlInput.getMainActivities()) {
			fUML.Syntax.Classes.Kernel.Element fumlElement = result
					.getFUMLElement(activity);
			if (fumlElement != null
					&& fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.Activity) {
				result.addActivity((fUML.Syntax.Activities.IntermediateActivities.Activity) fumlElement);
			}
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
