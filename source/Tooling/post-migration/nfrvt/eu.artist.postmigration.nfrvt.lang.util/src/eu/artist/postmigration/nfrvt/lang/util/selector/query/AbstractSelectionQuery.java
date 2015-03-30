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

import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;

public abstract class AbstractSelectionQuery<T extends EObject> implements ISelectionQuery<T> {
	
	protected Class<T> selectionType;
	private boolean strictType;

	public AbstractSelectionQuery(Class<T> selectionType, boolean strictType) {
		if(selectionType == null)
			throw new IllegalArgumentException("Selection type cannot be null.");
		this.selectionType = selectionType;
		this.strictType = strictType;		
	}
	
	public AbstractSelectionQuery(Class<T> selectionType) {
		this(selectionType, false);
	}
	
	public boolean isStrictType() {
		return strictType;
	}
	
	public ISelectionQuery<T> setStrictType(boolean strictType) {
		this.strictType = strictType;
		return this;
	}
	
	protected T toSelectionType(EObject object) {
		return ObjectUtil.asClass(object, selectionType);
	}
	
	protected boolean isSelectionType(EObject object) {
		return selectionType.isInstance(object);
	}
	
	protected boolean isDirectSelectionType(EObject object) {
		if(!isSelectionType(object))
			return false;
		
		if(object.getClass().equals(getSelectionType()))
			return true;
		
		if(getSelectionType().isInterface()) {
			for(Class<?> face : object.getClass().getInterfaces())
				if(face.equals(getSelectionType())) 
					return true;
		}		
		return false;
	}
	
	protected String toFQN(EObject object) {
		return MigrationResourceUtil.getFullyQualifiedName(object);
	}
	
	protected T accept(EObject object, boolean strictType) {
		if(object == null)
			return null;
		if(strictType)
			return isDirectSelectionType(object) && shouldAccept(object) ? toSelectionType(object) : null;
		return isSelectionType(object) && shouldAccept(object) ? toSelectionType(object) : null;		
	}
	
	@Override
	public T accept(EObject object) {
		return accept(object, isStrictType());
	}

	/**
	 * Returns the type of the objects that need to be selected.
	 * @return type of the selected objects
	 */
	public Class<T> getSelectionType() {
		return selectionType;
	}
}
