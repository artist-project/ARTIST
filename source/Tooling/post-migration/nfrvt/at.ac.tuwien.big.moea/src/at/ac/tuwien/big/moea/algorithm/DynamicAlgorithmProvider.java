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
package at.ac.tuwien.big.moea.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.moeaframework.core.Algorithm;
import org.moeaframework.core.Problem;
import org.moeaframework.core.spi.AlgorithmProvider;

public class DynamicAlgorithmProvider extends AlgorithmProvider {
	
	private static Map<String, IAlgorithmCreator<?>> registeredAlgorithms = new HashMap<String, IAlgorithmCreator<?>>();
	
	@Override
	public Algorithm getAlgorithm(String name, Properties properties,
			Problem problem) {
		IAlgorithmCreator<?> creator = registeredAlgorithms.get(name);
		if(creator == null)
			return null;
		Algorithm registered = creator.newInstance();
		if(registered != null)
			if(!registered.getProblem().getName().equals(problem.getName()))
				System.err.println("Algorithm retrieved for wrong problem: " + registered.getProblem().getName() + " vs " + problem.getName());
		return registered;
	}

	public static boolean registerAlgorithm(String name, IAlgorithmCreator<?> algorithm) {
		if(registeredAlgorithms.containsKey(name))
			return false;
		registeredAlgorithms.put(name, algorithm);
		return true;
	}
	
	public static IAlgorithmCreator<?> removeAlgorithm(String key) {
		return registeredAlgorithms.remove(key);
	}
	
	public static void clear() {
		registeredAlgorithms.clear();
	}
}
