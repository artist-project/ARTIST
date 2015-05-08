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
package at.ac.tuwien.big.moea.run.executor;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.moeaframework.Instrumenter;
import org.moeaframework.analysis.collector.Collector;
import org.moeaframework.analysis.collector.InstrumentedAlgorithm;

public class MOEAInstrumenter extends Instrumenter {
	@Override
	protected void instrument(InstrumentedAlgorithm algorithm, 
			final List<Collector> collectors, Set<Object> visited, 
			Stack<Object> parents, final Object object, Class<?> type) {
		
		if(object == null)
			return;
		if(type == null)
			type = object.getClass();
		if(type.equals(object.getClass()) && visited.contains(object))
			return;
		
		if(type.isAnnotation() || type.isEnum() || type.isPrimitive() || type.isArray() ||
				object instanceof Instrumenter ||
				object instanceof Collection ||
				type.getPackage() == null ||
				type.getPackage().getName().startsWith("org.moeaframework")) {
			try {
				super.instrument(algorithm, collectors, visited, parents, object, type);
			} catch(Exception e) {
				try {
					System.err.println("Encountered: " + e.getMessage() + ". Try to recover...");
					super.instrument(algorithm, collectors, visited, parents, object, type);
				} catch(Exception ex) {
					System.err.println("Encountered: " + ex.getMessage() + ". Try to continue...");
				}
			}
			return;
		}
		
		// handle types outside the org.moeaframework package just the same
		
		if (!visited.contains(object)) {
			//attach any matching collectors
			for (Collector collector : collectors) 
				if(collector.getAttachPoint().matches(parents, object)) 
					algorithm.addCollector(collector.attach(object));			
			visited.add(object);
		}
		
		//recursively walk superclass to enumerate all non-public fields
		Class<?> superclass = type.getSuperclass();	
		if (superclass != null) 
			instrument(algorithm, collectors, visited, parents, object, superclass);
		
		
		//recursively walk fields
		parents.push(object);
		for (Field field : type.getDeclaredFields()) {
			field.setAccessible(true);	
			try {
				instrument(algorithm, collectors, visited, parents, 
						field.get(object), null);
			} catch (IllegalArgumentException e) {
				//should never occur since object is of the specified type
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				//should never occur after setting field.setAccessible(true)
				e.printStackTrace();
			}
		}
		parents.pop();
	}
}
