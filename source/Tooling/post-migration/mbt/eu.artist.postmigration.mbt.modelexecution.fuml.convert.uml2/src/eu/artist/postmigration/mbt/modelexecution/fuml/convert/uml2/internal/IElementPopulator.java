/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal;

import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

/**
 * Interface for a type-specific element populator.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public interface IElementPopulator {

	/**
	 * Populates the feature values of {@code uml2Element} to
	 * {@code fumlElement}.
	 * 
	 * @param fumlElement
	 *            to be populated.
	 * @param uml2Element
	 *            acting as input for the population.
	 * @param result
	 *            for accessing the mapping between other UML2 elements to fUML
	 *            elements.
	 */
	void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
			org.eclipse.uml2.uml.Element uml2Element,
			ConversionResultImpl result);

}
