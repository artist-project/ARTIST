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
package eu.artist.postmigration.nfrvt.lang.util.selector.query;

import org.eclipse.emf.ecore.EObject;

import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationModelSelector;

/**
 * Interface for queries used by the {@link MigrationModelSelector}.
 * 
 * @author Martin Fleck
 * @param <T> type of the selected objects
 */
public interface ISelectionQuery<T extends EObject> {
	/**
	 * Returns true if the given object fulfills the constraints defined by
	 * this query.
	 * 
	 * @param object object to be accepted or rejected
	 * @return true if object fulfills this query
	 */
	boolean shouldAccept(EObject object);
	
	/**
	 * Returns the given object if the object fulfills the constriants defined
	 * by this query and is of the expected type.
	 * 
	 * @param object object to be accepted or rejected
	 * @return the given object if the object fulfills this query or null if 
	 * the object does not
	 */
	T accept(EObject object);
}
