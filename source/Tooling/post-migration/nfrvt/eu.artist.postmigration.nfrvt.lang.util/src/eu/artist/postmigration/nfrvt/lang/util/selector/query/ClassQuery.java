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

/**
 * A query selecting objects of the given type (class).
 * 
 * @author Martin Fleck
 *
 * @param <T> type of the selected objects
 */
public class ClassQuery<T extends EObject> extends AbstractSelectionQuery<T> {

	private Class<T> clazz;
	
	/**
	 * Creates a new query selecting objects of the given type (class)
	 * @param clazz type of the selected objects
	 */
	public ClassQuery(Class<T> clazz) {
		super(clazz);
		if(clazz == null)
			throw new IllegalArgumentException("clazz cannot be null.");
		this.clazz = clazz;	
	}
	
	@Override
	public boolean shouldAccept(EObject object) {
		return clazz.isInstance(object);
	}

}
