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
 * A query for selecting {@link EObject}s based on a given fully qualified name.
 * @author Martin Fleck
 */
public class EObjectFQNQuery extends FQNQuery<EObject> {
	/**
	 * Creates a query for selecting {@link EObject}s based 
	 * on the given fully qualified name. 
	 * 
	 * @param fqn fully qualified name
	 */
	public EObjectFQNQuery(String fqn) {
		super(EObject.class, fqn);
	}
}
