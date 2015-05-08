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

import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Classes.Kernel.Element;

/**
 * The result of a conversion performed by an {@link IConverter}.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public interface IConversionResult {

	/**
	 * Returns the status of the conversion giving information on whether the
	 * conversion succeeded.
	 * 
	 * @return the conversion status.
	 */
	public IConversionStatus getStatus();

	/**
	 * Returns the main activities converted from the {@link #getInput() input}.
	 * 
	 * @return the main activities.
	 */
	public Collection<Activity> getActivities();

	/**
	 * Returns all created activities that have been created during the
	 * conversion.
	 * 
	 * @return all created activities.
	 */
	public Collection<Activity> getAllActivities();

	/**
	 * Returns the {@link Activity} from {@link #getAllActivities() all
	 * activities} with the specified {@code name}.
	 * 
	 * If no {@link Activity} with the specified {@code name} could be found,
	 * this method returns <code>null</code>.
	 * 
	 * @param name
	 *            either the name or the qualified name.
	 * @return the {@link Activity} with the specified {@code name} or
	 *         <code>null</code>.
	 */
	public Activity getActivity(String name);

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
	public fUML.Syntax.Classes.Kernel.Element getFUMLElement(Object input);

	/**
	 * Returns the input element that corresponds to the specified fUML
	 * {@code output} element.
	 * 
	 * @param output
	 *            the fUML element to get corresponding input for..
	 * @return the corresponding input element.
	 */
	public Object getInputObject(Element output);

	/**
	 * Determines if conversion caused errors.
	 * 
	 * @return true if conversion caused errors, false otherwise
	 */
	public boolean hasErrors();
}
