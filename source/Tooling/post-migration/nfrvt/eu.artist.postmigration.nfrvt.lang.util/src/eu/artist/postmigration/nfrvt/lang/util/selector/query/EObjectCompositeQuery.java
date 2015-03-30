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
 * A query composed of other queries.
 * 
 * @author Martin Fleck
 */
public class EObjectCompositeQuery extends CompositeQuery<EObject> {

	/**
	 * Creates a new query for {@link EObject}s
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 */
	public EObjectCompositeQuery() {
		super(EObject.class);
	}
	
	/**
	 * Creates a new query for {@link EObject}s
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 * 
	 * @param queries sub-queries
	 */
	@SafeVarargs
	public EObjectCompositeQuery(ISelectionQuery<? extends EObject>... queries) {
		super(EObject.class, queries);
	}
	
	/**
	 * Creates a new query for {@link EObject}s
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 * 
	 * @param queries sub-queries
	 */
	public EObjectCompositeQuery(Iterable<ISelectionQuery<? extends EObject>> queries) {
		super(EObject.class, queries);
	}

}
