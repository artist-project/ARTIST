/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Interface for state validators.
 * 
 * @author Christian Krause
 * @generated NOT
 */
public interface StateValidator extends Validator {

	/**
	 * Perform the validation for the given state.
	 * @param state State to be validated.
	 * @param monitor Progress monitor.
	 * @return Validation result.
	 * @throws Exception If an error occurs during the validation.
	 */
	ValidationResult validate(State state, IProgressMonitor monitor) throws Exception;

}
