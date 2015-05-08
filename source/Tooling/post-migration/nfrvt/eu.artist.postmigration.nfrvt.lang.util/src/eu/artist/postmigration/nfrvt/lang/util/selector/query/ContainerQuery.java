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

import eu.artist.postmigration.nfrvt.lang.util.MigrationContainerHelper;

/**
 * A query selecting objects containing other objects.
 * @author Martin Fleck
 *
 * @param <T> type of the selected objects
 */
public class ContainerQuery<T extends EObject> extends AbstractSelectionQuery<T> {

	private static MigrationContainerHelper ancestor = new MigrationContainerHelper();
	
	private EObject child;
	
	/**
	 * Creates a new query selecting objects the given type (class) containing 
	 * the given child object.
	 * @param clazz type of the selected objects
	 * @param child child object that needs to be contained by the selected
	 * objects
	 */
	public ContainerQuery(Class<T> clazz, EObject child) {
		this(clazz, child, false);
	}
	
	/**
	 * Creates a new query selecting objects the given type (class) containing 
	 * the given child object.
	 * @param clazz type of the selected objects
	 * @param child child object that needs to be contained by the selected
	 * objects
	 * @param strictType if true only objects that are direct instances of
	 * the given class are selected (no sub-types)
	 */
	public ContainerQuery(Class<T> clazz, EObject child, boolean strictType) {
		super(clazz, strictType);
		this.child = child;	
	}
	
	/**
	 * Child object that needs to be contained by the selected objects.
	 * @return child object
	 */
	public EObject getChild() {
		return child;
	}

	@Override
	public boolean shouldAccept(EObject object) {
		return ancestor.isWithin(object, getChild());
	}
	
}
