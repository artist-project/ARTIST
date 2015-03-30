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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ParameterList<T extends Object> {
	
	protected Map<String, T> parameters = new HashMap<>();
	
	public ParameterList() { }

	public void setParameter(String name, T value) {
		parameters.put(name, value);
	}
	
	public ParameterList<T> setParameters(ParameterList<T> parameterList) {
		this.parameters.putAll(parameterList.parameters);
		return this;
	}
	
	public T getParameterValue(String name) {
		return parameters.get(name);
	}
	
	public Set<Entry<String, T>> getParameterEntries() {
		return parameters.entrySet();
	}
	
	public Set<String> getParameterNames() {
		return parameters.keySet();
	}
	
	public Collection<T> getParameterValues() {
		return parameters.values();
	}
	
	public boolean hasParameter(String name) {
		return parameters.containsKey(name);
	}
}
