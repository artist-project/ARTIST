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

/**
 * A query for selecting objects based on a given fully qualified name.
 * @author Martin Fleck
 *
 * @param <T> type of the selected objects
 */
public class FQNQuery<T extends EObject> extends AbstractSelectionQuery<T> {

	private String fqn;
	
	/**
	 * Creates a query for selecting objects of the given type (clazz) based 
	 * on the given fully qualified name. 
	 * 
	 * @param clazz type of the selected objects
	 * @param fqn fully qualified name
	 */
	public FQNQuery(Class<T> clazz, String fqn) {
		super(clazz);
		if(fqn == null || fqn.replace("^", "").isEmpty())
			throw new IllegalArgumentException("Fully qualified name can not be empty.");
		this.fqn = fqn.replace("^", "");		
	}
	
	/**
	 * Fully qualified name the selected objects must have.
	 * 
	 * @return fully qualified name
	 */
	public String getFQN() {
		return fqn;
	}
	
	@Override
	public boolean shouldAccept(EObject object) {
		String fqn = MigrationResourceUtil.getFullyQualifiedName(object);
		return getFQN().equals(fqn);
	}

}
