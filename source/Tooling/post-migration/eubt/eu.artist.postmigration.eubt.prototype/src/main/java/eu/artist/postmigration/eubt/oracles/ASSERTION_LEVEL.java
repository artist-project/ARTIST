/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.oracles;

/**
 * @author pneubaue
 *
 */
public enum ASSERTION_LEVEL {
	
	/**
	 * Comparison based on operation names.
	 */
	OPERATION_LEVEL,
	/**
	 * Comparison based on operation names and attribute names.
	 */
	ATTRIBUTE_LEVEL,
	/**
	 * Comparison based on operation names, attribute names, and attribute values.
	 */
	ATTRIBUTE_VALUE_LEVEL

}
