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

import java.text.ParseException;

/**
 * Interface for validators. Clients should not implement
 * this interface directly, but rather one of the following two:
 * <ul>
 * <li>{@link StateValidator}, or</li>
 * <li>{@link StateSpaceValidator}.</li>
 * </ul>
 * @author Christian Krause
 * @generated NOT
 */
public interface Validator {
	
	/**
	 * Determines whether this validator uses a property or not.
	 * The property is set using {@link #setProperty(String)}.
	 * @return <code>true</code> if it can use a property.
	 */
	boolean usesProperty();
	
	/**
	 * Set the property to be validated. It can be assumed
	 * that the state space has been set already before this 
	 * method is called.
	 * @param property Property.
	 * @throws ParseException If the property cannot be parsed.
	 */
	void setProperty(String property) throws ParseException;
	
	/**
	 * Set the state space index to be used.
	 * @param index State space index.
	 */
	void setStateSpaceIndex(StateSpaceIndex index);

	/**
	 * Get the name of this validator.
	 * @return Name of this validator.
	 */
	String getName();

}
