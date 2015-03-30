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
package eu.artist.postmigration.nfrvt.lang.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class CollectionUtil {
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
			cur = ObjectUtil.asClass(obj, clazz);
			if(cur != null)
				list.add(cur);
		}
		return list;
	}
	
	/**
	 * Adds all non-null elements from the first collection into the second 
	 * collection WITHOUT copying the elements.
	 * 
	 * @param from elements to be added
	 * @param to list where elements should be added.
	 */
	public static <T extends EObject> void add(Iterable<? extends T> from, List<T> to) {
		add(from, to, false);
	}
	
	/**
	 * Adds all non-null elements from the first collection into the second 
	 * collection. If copy is true, a new copy of each element will be 
	 * produced, otherwise not.
	 * 
	 * @param from elements to be added
	 * @param to list where elements should be added
	 * @param copy 
	 */
	public static <T extends EObject> void add(Iterable<? extends T> from, List<T> to, boolean copy) {
		if(from == null || to == null)
			return;
		for(T obj : from)
			add(obj, to, copy);
	}
	
	/**
	 * Adds the object to the given list if the object is not null.
	 * 
	 * @param object element to add
	 * @param to list where elements should be added
	 */
	public static <T extends EObject> void add(T object, List<T> to) {
		add(object, to, false);
	}
	
	/**
	 * Adds the object to the given list if the object is not null.
	 * 
	 * @param object element to add
	 * @param to list where elements should be added
	 * @param copy if true, a copy of the element will be added to the list
	 */
	public static <T extends EObject> void add(T object, List<T> to, boolean copy) {
		if(object == null)
			return;
		if(copy)
			to.add(ObjectUtil.copy(object));
		else
			to.add(object);
	}
}
