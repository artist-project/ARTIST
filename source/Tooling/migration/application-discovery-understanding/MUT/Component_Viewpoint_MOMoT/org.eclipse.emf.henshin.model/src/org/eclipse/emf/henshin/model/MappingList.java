/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model;

import org.eclipse.emf.common.util.EList;

/**
 * Interface for {@link Mapping} lists. Provides helper methods.
 * 
 * @author Christian Krause
 *
 */
public interface MappingList extends EList<Mapping> {

	/**
	 * Find a mapping for a given node origin and image.
	 * @param origin Node origin.
	 * @param image Node image.
	 * @return The mapping if found, otherwise <code>null</code>.
	 */
	Mapping get(Node origin, Node image);

	/**
	 * Create and add a new mapping between the origin and image node.
	 * @param origin Origin node.
	 * @param image Image node.
	 * @return The newly created mapping.
	 */
	Mapping add(Node origin, Node image);

	/**
	 * Create and add a new mapping between the origin and image edge.
	 * This maps source to source and target to target.
	 * @param origin Origin edge.
	 * @param image Image edge.
	 */
	void add(Edge origin, Edge image);

	/**
	 * Create and add a new mapping between the origin and image attribute.
	 * @param origin Origin attribute.
	 * @param image Image attribute.
	 * @return The newly created mapping.
	 */
	Mapping add(Attribute origin, Attribute image);

	/**
	 * Create a mapping between two graph elements.
	 * @param origin Origin element.
	 * @param image Target element.
	 */
	<E extends GraphElement> void add(E origin, E image);

	/**
	 * Remove a mapping between the given origin and image node.
	 * @param origin Origin node.
	 * @param image Image node.
	 * @return The removed mapping.
	 */
	Mapping remove(Node origin, Node image);

	/**
	 * Remove a mapping between the given origin and image edge.
	 * @param origin Origin edge.
	 * @param image Image edge.
	 */
	void remove(Edge origin, Edge image);

	/**
	 * Remove a mapping between the given origin and image attribute.
	 * @param origin Origin attribute.
	 * @param image Image attribute.
	 * @return The removed mapping.
	 */
	Mapping remove(Attribute origin, Attribute image);

	/**
	 * Remove a mapping between two graph elements.
	 * @param origin Origin element.
	 * @param image Target element.
	 */
	<E extends GraphElement> void remove(E origin, E image);

	/**
	 * Find the origin of a node.
	 * @param image Image node.
	 * @return The origin of the node.
	 */
	Node getOrigin(Node image);

	/**
	 * Find the origin of an edge.
	 * @param image Image edge.
	 * @return Edge image.
	 */
	Edge getOrigin(Edge image);

	/**
	 * Get the origin of an attribute.
	 * @param image Image attribute.
	 * @return The origin attribute.
	 */
	Attribute getOrigin(Attribute image);

	/**
	 * Get the origin of an untyped object. This delegates to
	 * {@link #getOrigin(Node)}, {@link #getOrigin(Edge)} or
	 * {@link #getOrigin(Attribute)}. It throws an 
	 * {@link IllegalArgumentException} if the type of the
	 * object is unknown.
	 * @param object Image.
	 * @return The origin.
	 */
	<E extends GraphElement> E getOrigin(E object);

	/**
	 * Get the image of a node in a given target graph.
	 * @param origin Origin node.
	 * @param imageGraph Image graph.
	 * @return The image of the node.
	 */
	Node getImage(Node origin, Graph imageGraph);

	/**
	 * Get the image of an edge in a given target graph.
	 * @param origin Origin edge.
	 * @param imageGraph Image graph.
	 * @return Edge image.
	 */
	Edge getImage(Edge origin, Graph imageGraph);

	/**
	 * Get the image of an attribute in a given target graph.
	 * @param origin Origin attribute.
	 * @param imageGraph Image graph.
	 * @return The image attribute.
	 */
	Attribute getImage(Attribute origin, Graph imageGraph);

	/**
	 * Get the image of an untyped object in a target graph. 
	 * This delegates to {@link #getImage(Node)}, {@link #getImage(Edge)} 
	 * or {@link #getImage(Attribute)}. It throws an 
	 * {@link IllegalArgumentException} if the type of the object is unknown.
	 * @param origin Origin.
	 * @param imageGraph Image graph.
	 * @return The image.
	 */
	<E extends GraphElement> E getImage(E origin, Graph imageGraph);

	/**
	 * Check whether this map is 'onto' (surjective).
	 * This also checks whether the types of the mapped
	 * nodes and edge are strictly the same, and whether
	 * the attribute values are the same too.
	 * @param imageGraph The image graph.
	 * @return <code>true</code> if the map is onto.
	 */
	boolean isOnto(Graph imageGraph);
	
}
