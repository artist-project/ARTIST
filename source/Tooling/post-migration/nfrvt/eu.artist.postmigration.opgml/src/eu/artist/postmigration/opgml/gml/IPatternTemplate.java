/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.opgml.gml;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

public interface IPatternTemplate<T extends Object> extends INamedElement {
	String getName();
	boolean hasParameter(String parameterName);
	T getParameterValue(String parameterName);
	void setParameter(String parameterName, T value);
	
	Collection<T> getParameterValues();
	Set<Entry<String, T>> getParameterEntries();
	Set<String> getParameterNames();
}
