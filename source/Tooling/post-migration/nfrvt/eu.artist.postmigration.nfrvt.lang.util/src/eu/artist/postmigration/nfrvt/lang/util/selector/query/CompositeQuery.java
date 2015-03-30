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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

/**
 * A query composed of other queries.
 * 
 * @author Martin Fleck
 *
 * @param <T> type of the selected objects
 */
public class CompositeQuery<T extends EObject> extends AbstractSelectionQuery<T> {

	private List<ISelectionQuery<? extends T>> queries;

	/**
	 * Creates a new query for objects of the given type (objectClazz) 
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 * 
	 * @param objectClazz type of the selected objects
	 */
	public CompositeQuery(Class<T> objectClazz) {
		this(objectClazz, new ArrayList<ISelectionQuery<? extends T>>());
	}
	
	/**
	 * Creates a new query for objects of the given type (objectClazz) 
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 * 
	 * @param objectClazz type of the selected objects
	 * @param queries sub queries
	 */
	@SafeVarargs
	public CompositeQuery(Class<T> objectClazz, ISelectionQuery<? extends T>... queries) {
		this(objectClazz, Lists.newArrayList(queries));
	}
	
	/**
	 * Creates a new query for objects of the given type (objectClazz) 
	 * composed of other queries. 
	 * Only objects that fulfill all queries are selected.
	 * 
	 * @param objectClazz type of the selected objects
	 * @param queries sub queries
	 */
	public CompositeQuery(Class<T> objectClazz, Iterable<ISelectionQuery<? extends T>> queries) {
		super(objectClazz);
		this.queries = Lists.newArrayList(queries);
	}
	
	/**
	 * Adds a new sub-query that must be fulfilled by selected objects.
	 * 
	 * @param query query to be added
	 * @return this query
	 */
	public CompositeQuery<T> addQuery(ISelectionQuery<? extends T> query) {
		this.queries.add(query);
		return this;
	}
	
	/**
	 * Removes one of the sub-queries.
	 * 
	 * @param query query to be removed
	 * @return this query
	 */
	public CompositeQuery<T> removeQuery(ISelectionQuery<? extends T> query) {
		this.queries.remove(query);
		return this;
	}
	
	/**
	 * Returns all sub-queries of this composite query.
	 * 
	 * @return sub queries
	 */
	public List<ISelectionQuery<? extends T>> getQueries() {
		return queries;
	}

	@Override
	public boolean shouldAccept(EObject object) {
		for(ISelectionQuery<? extends T> acceptor : getQueries())
			if(!acceptor.shouldAccept(object))
				return false;
		return true;
	}

}
