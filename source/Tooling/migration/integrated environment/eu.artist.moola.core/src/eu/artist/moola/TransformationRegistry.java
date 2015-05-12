/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.moola;

import java.util.HashMap;
import java.util.Map;

import eu.artist.moola.dsl.core.Transformation;

public final class TransformationRegistry {

	public final static Map<String, Class<? extends Transformation>> registry;
	
	static {
		registry = new HashMap<>();
	}
	
	public static void register(String key, Class<? extends Transformation> trafo) {
		registry.put(key.toLowerCase(), trafo);
	}

	public static boolean has(String key) {
		return key != null && registry.containsKey(key.toLowerCase());
	}
	
	public static Class<? extends Transformation> resolve(String key) {
		if(key == null || !registry.containsKey(key.toLowerCase())){
			throw new RuntimeException("No trafo registered for type " + key + ". Please check you dependencies");
		}
		return registry.get(key.toLowerCase());
	}
}
