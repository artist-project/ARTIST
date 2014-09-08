/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
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
package eu.artist.postmigration.nfrvt.eval.util;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

/**
 * This class provides some convenience methods for converting and 
 * casting objects between different types.
 * 
 * @author Martin Fleck
 *
 */
public class ObjectUtil {
	/**
	 * Provides a exception-safe class casts that returns the given object as
	 * instance of the given class if possible. Otherwise null is returned.
	 * 
	 * @param obj object to be cast to the given class
	 * @param clazz class the object should be cast to.
	 * @return object as instance of the given class or null if no cast is 
	 * possible.
	 */
	public static <T extends Object> T asClass(Object obj, Class<T> clazz) {
		if(obj == null || clazz == null)
			return null;
		try {
			return clazz.cast(obj);
		} catch(ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Creates a copy of the given object using 
	 * {@link EcoreUtil2#copy(EObject)}.
	 * 
	 * @param v object to be copied
	 * @return copy of the given object
	 */
	public static <T extends EObject> T copy(T v) {
		return EcoreUtil2.copy(v);
	}
	
	/**
	 * Provides the given object array as {@link Iterable}. 
	 * Null-objects are filtered during this process.
	 * 
	 * @param objects objects packed into an iterable
	 * @return iterable containing all non-null objects
	 */
	@SafeVarargs
	public static <T extends EObject> Iterable<T> asIterable(T... objects) {
		ArrayList<T> list = new ArrayList<>();
		for(T obj : objects)
			if(obj != null)
				list.add(obj);
		return list;
	}
	
	/**
	 * Provides the given object array as {@link Iterable}. 
	 * Objects that are not an instance of the given class and null-objects 
	 * are filtered during this process.
	 * 
	 * @param clazz class the objects in the iterable should have
	 * @param objects objects packed into an iterable
	 * @return iterable containing all non-null objects of the given class
	 */
	public static <T extends EObject> Iterable<T> asIterable(Class<T> clazz, EObject... objects) {
		ArrayList<T> list = new ArrayList<>();
		T cur = null;
		for(EObject obj : objects) {
			cur = asClass(obj, clazz);
			if(cur != null)
				list.add(cur);
		}
		return list;
	}
}
