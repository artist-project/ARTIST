/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.convert;

import java.util.Collection;

import fUML.Semantics.Classes.Kernel.ExtensionalValue;
import fUML.Semantics.Classes.Kernel.Value;

/**
 * The result of a conversion performed by an {@link IConverter}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public interface IValueConversionResult {

	/**
	 * Returns the status of the conversion giving information on whether the
	 * conversion succeeded.
	 * 
	 * @return the conversion status.
	 */
	public IConversionStatus getStatus();

	/**
	 * Returns the values converted from the {@link #getInput() input}.
	 * 
	 * @return the values.
	 */
	public Collection<Value> getValues();

	/**
	 * Returns the extensional values converted from the {@link #getInput() input}.
	 * 
	 * @return the extensional values.
	 */
	public Collection<ExtensionalValue> getExtensionalValues();
	
	/**
	 * Returns the input of the conversion.
	 * 
	 * @return the input.
	 */
	public Object getInput();

	/**
	 * Returns the fUML element that has been created for the specified
	 * {@code input}.
	 * 
	 * @param input
	 *            to get corresponding fUML element for.
	 * @return the fUML element corresponding to {@code input}.
	 */
	public Object getFUMLElement(Object input);

	/**
	 * Returns the input element that corresponds to the specified fUML
	 * {@code output} element.
	 * 
	 * @param output
	 *            the fUML element to get corresponding input for..
	 * @return the corresponding input element.
	 */
	public Object getInputObject(Object output);

	/**
	 * Determines if conversion caused errors.
	 * 
	 * @return true if conversion caused errors, false otherwise
	 */
	public boolean hasErrors();
}
