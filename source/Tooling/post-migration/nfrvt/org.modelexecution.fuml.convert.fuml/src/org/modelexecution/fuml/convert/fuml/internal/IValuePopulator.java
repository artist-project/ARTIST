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
package org.modelexecution.fuml.convert.fuml.internal;

import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IValueConversionResult;

public interface IValuePopulator {

	/**
	 * Populates the feature values of {@code uml2Element} to
	 * {@code fumlElement}.
	 * 
	 * @param fumlElement
	 *            to be populated.
	 * @param fumlElement_
	 *            acting as input for the population.
	 * @param syntaxConversionResult
	 *            for accessing the mapping between other input elements to fUML
	 *            elements.
	 */
	void populate(Object fumlElement, Object fumlElement_,
			IConversionResult conversionResult, IValueConversionResult valueConversionResult);

}
