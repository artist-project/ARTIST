/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.actions;

import java.util.List;

import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.GraphElement;

/**
 * Action helper.
 */
public interface ActionHelper<E extends GraphElement,C> {
	
	/**
	 * Determine the action for an element. If this returns <code>null</code>
	 * the element is not considered to be a proper action element and hence
	 * should not be displayed in an integrated rule view.
	 * @param element Element.
	 * @return Action or <code>null</code>.
	 */
	Action getAction(E e);
	
	/**
	 * Set the action for a given element.
	 * @param e Element.
	 * @param action Action.
	 */
	void setAction(E e, Action action);
	
	/**
	 * Get all elements in a container that are associated with the given action.
	 * @param container container.
	 * @param action Action or <code>null</code> for any action.
	 * @return List of elements.
	 */
	List<E> getActionElements(C container, Action action);
	
}
