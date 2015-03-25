/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

/**
 * Interface for storing {@link EObject} graphs.
 * 
 * @author Christian Krause, Enrico Biermann
 */
public interface EGraph extends Collection<EObject> {
	
	/**
	 * Adds an {@link EObject} and all its children to this graph.
	 * @param root The root object of the tree.
	 * @return <code>true</code> if an object was added.
	 */
	boolean addTree(EObject root);
	
	/**
	 * Adds an {@link EObject} and all reachable objects to this graph.
	 * In contrast to {@link #addTree(EObject)} this method adds all
	 * referenced objects to the graph, and not just the children of
	 * the containment tree.
	 * @param object An arbitrary object.
	 * @return <code>true</code> if at least one object was added.
	 */
	boolean addGraph(EObject object);
	
	/**
	 * Removes an {@link EObject} and all its children from this graph.
	 * @param root The root object of the tree.
	 * @return <code>true</code> if any object was removed.
	 * @see #addTree(EObject)
	 */
	boolean removeTree(EObject root);

	/**
	 * Removes an {@link EObject} and all reachable objects from this graph.
	 * @param object An arbitrary object.
	 * @return <code>true</code> if any object was removed.
	 * @see #addGraph(EObject)
	 */
	boolean removeGraph(EObject object);

	/**
	 * Copy this object graph. If the parameter map is <code>null</code>
	 * the objects in the graph will be copied too. If the map is not
	 * <code>null</code>, the images of the map will be used as the new
	 * objects.
	 * @param copies Map associating object of this graph to copies. Can be <code>null</code>.
	 * @return The copied version of this {@link EGraph}.
	 */
	EGraph copy(Map<EObject,EObject> copies);
	
	/**
	 * Get all {@link EObject}s of this graph which are compatible with the given type.
	 * This returns a fresh and modifiable list.
	 * @param type The type of the objects.
	 * @param strict Whether subtypes are excluded from the result.
	 * @return A set of {@link EObject}s compatible with the type.
	 */
	List<EObject> getDomain(EClass type, boolean strict);
	
	/**
	 * Returns the size of the domain for a type. The returned number
	 * equals the size of the list returned by {@link #getDomain(EClass, boolean)}.
	 * This method should be used whenever the actual objects are not needed.
	 * @param type The type.
	 * @param strict Whether subtypes are excluded.
	 * @return The size of the domain.
	 */
	int getDomainSize(EClass type, boolean strict);
	
	/**
	 * Get the root objects in this graph. This returns a fresh and modifiable list.
	 * @return The root objects.
	 */
	List<EObject> getRoots();

	/**
	 * Get the cross reference adapter of this graph.
	 * @return The cross reference adapter.
	 */
	ECrossReferenceAdapter getCrossReferenceAdapter();

}
