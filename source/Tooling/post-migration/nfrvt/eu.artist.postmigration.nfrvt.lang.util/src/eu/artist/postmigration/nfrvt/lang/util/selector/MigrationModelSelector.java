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
package eu.artist.postmigration.nfrvt.lang.util.selector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import eu.artist.postmigration.nfrvt.lang.util.AbstractMigrationModelHandler;
import eu.artist.postmigration.nfrvt.lang.util.CollectionUtil;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.EObjectFQNQuery;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.FQNQuery;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery;

public class MigrationModelSelector<M extends EObject> extends AbstractMigrationModelHandler<M> {
	
	/**
	 * Creates a new model selector based on the given model.
	 * 
	 * @param model
	 */
	public MigrationModelSelector(M model) {
		super(model);
		if(model == null)
			throw new IllegalArgumentException("Model can not be null.");
	}
	
	/**
	 * Returns the resource in which the managed model is contained or null
	 * if no model has been set yet.
	 * @return resource or null
	 */
	protected Resource getResource() {
		if(this.model == null)
			return null;
		return this.model.eResource();
	}
	
	/**
	 * Returns the resource set in which the managed model is contained or null
	 * if no model has been set yet.
	 * @return resource set or null
	 */
	protected ResourceSet getResourceSet() {
		if(getResource() == null)
			return null;
		return getResource().getResourceSet();
	}
	
	/**
	 * Selects the objects from the managed models resource set that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return list of objects
	 */
	public <T extends EObject> List<T> selectFromResourceSet(ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.select(getResourceSet(), query);
	}
	
	/**
	 * Selects the objects from the managed models resource that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return list of objects
	 */
	public <T extends EObject> List<T> selectFromResource(ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.select(getResource(), query);
	}
	
	/**
	 * Selects the objects from the managed model set that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return list of objects
	 */
	public <T extends EObject> List<T> selectFromModel(ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.select(getModel(), query);
	}
	
	/**
	 * Selects the objects from the given object roots that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return list of objects
	 */
	public <T extends EObject> List<T> selectFrom(Iterable<? extends EObject> roots, ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.select(roots, query);
	}
	
	/**
	 * Selects the objects from the managed model set that fulfills 
	 * the criteria specified in the given query. If no such elements
	 * can be found, the whole resource set will be searched.
	 * 
	 * @param query query to select objects
	 * @return list of objects
	 * 
	 * @see #selectFromModel(ISelectionQuery)
	 * @see #selectFromResourceSet(ISelectionQuery)
	 */
	public <T extends EObject> List<T> select(ISelectionQuery<? extends T> query) {
		List<T> result = selectFromModel(query);
		if(result.isEmpty())
			result = selectFromResourceSet(query);
		return result;
	}
	
	/**
	 * Selects the first object from the managed models resource set that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return first object fulfilling the query or null if no such object is 
	 * found
	 */
	public <T extends EObject> T selectFirstFromResourceSet(ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.selectFirst(getResourceSet(), query);
	}
	
	/**
	 * Selects the first object from the managed model that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return first object fulfilling the query or null if no such object is 
	 * found
	 */
	public <T extends EObject> T selectFirstFromModel(ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.selectFirst(getModel(), query);
	}
		
	/**
	 * Selects the first objects from the given object roots that fulfills 
	 * the criteria specified in the given query.
	 * 
	 * @param query query to select objects
	 * @return first object fulfilling the query or null if no such object is 
	 * found
	 */
	public <T extends EObject> T selectFirstFrom(Iterable<? extends EObject> roots, ISelectionQuery<? extends T> query) { 
		return MigrationModelSelector.selectFirst(roots, query);
	}
	
	/**
	 * Selects the first object from the managed model that fulfills 
	 * the criteria specified in the given query. If no such element
	 * can be found, the whole resource set is searched.
	 * 
	 * @param query query to select objects
	 * @return first object fulfilling the query or null if no such object is 
	 * found
	 */
	public <T extends EObject> T selectFirst(ISelectionQuery<? extends T> query) {
		T result = selectFirstFromModel(query);
		if(result == null)
			result = selectFirstFromResourceSet(query);
		return result;
	}
	
	/**
	 * Selects the objects from the resource set with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public List<EObject> selectFromResourceSet(String fqn) { 
		return selectFromResourceSet(new EObjectFQNQuery(fqn));
	}
	
	/**
	 * Selects the objects from the resource with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public List<EObject> selectFromResource(String fqn) { 
		return selectFromResource(new EObjectFQNQuery(fqn));
	}
	
	/**
	 * Selects the objects from the resource set with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public List<EObject> selectFromModel(String fqn) { 
		return selectFromModel(new EObjectFQNQuery(toFQN(fqn)));
	}
	
	/**
	 * Selects the objects from the given object roots that have the given
	 * fully qualified name.
	 * 
	 * @param roots root objects
	 * @param fqn fully qualified name
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public List<EObject> selectFrom(Iterable<? extends EObject> roots, String fqn) { 
		return selectFrom(roots, new EObjectFQNQuery(fqn));
	}
	
	/**
	 * Selects the first object from the resource set with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @return object with the given fqn or null if no such object is found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public EObject selectFirstFromResourceSet(String fqn) { 
		return selectFirstFromResourceSet(new EObjectFQNQuery(fqn));
	}

	/**
	 * Selects the first object from the model with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @return object with the given fqn or null if no such object is found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public EObject selectFirstFromModel(String fqn) { 
		return selectFirstFromModel(new EObjectFQNQuery(toFQN(fqn)));
	}
	
	/**
	 * Selects the first object from the root objects with the given fully 
	 * qualified name.
	 * 
	 * @param roots root objects to be searched
	 * @param fqn fully qualified name
	 * @return object with the given fqn or null if no such object is found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see EObjectFQNQuery
	 */
	public EObject selectFirstFrom(Iterable<? extends EObject> roots, String fqn) { 
		return selectFirstFrom(roots, new EObjectFQNQuery(fqn));
	}
	
	/**
	 * Selects the first object with the given fully qualified name from the
	 * model. If no such element can be found the resource set will be 
	 * searched.
	 * 
	 * @param fqn fully qualified name
	 * @return object with the given fqn or null if no such object is found
	 */
	public EObject selectFirst(String fqn) {
		EObject result = selectFirstFromModel(fqn);
		if(result == null)
			result = selectFirstFromResourceSet(fqn);
		if(result == null)
			result = selectFirstFromResourceSet(toFQN(fqn));
		return result;
	}
	
	/**
	 * Selects the clazz objects from the resource set with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @param clazz type of the objects with the given fqn
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> List<E> selectFromResourceSet(String fqn, Class<E> clazz) { 
		return selectFromResourceSet(new FQNQuery<E>(clazz, fqn));
	}
	
	/**
	 * Selects the clazz objects from the resource with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @param clazz type of the objects with the given fqn
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> List<E> selectFromResource(String fqn, Class<E> clazz) { 
		return selectFromResource(new FQNQuery<E>(clazz, fqn));
	}
	
	/**
	 * Selects the clazz objects from the model with the given fully 
	 * qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @param clazz type of the objects with the given fqn
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> List<E> selectFromModel(String fqn, Class<E> clazz) { 
		return selectFromModel(new FQNQuery<E>(clazz, toFQN(fqn)));
	}
	
	/**
	 * Selects the clazz objects from the roots objects with the given fully 
	 * qualified name.
	 * 
	 * @param roots root objects to be searched
	 * @param fqn fully qualified name
	 * @param clazz type of the objects with the given fqn
	 * @return objects with the given fqn
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> List<E> selectFrom(Iterable<? extends EObject> roots, String fqn, Class<E> clazz) { 
		return selectFrom(roots, new FQNQuery<E>(clazz, fqn));
	}
	
	/**
	 * Selects the first clazz object from the resource set with the given 
	 * fully qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @param clazz type of the object with the fqn
	 * @return clazz object with the given fqn or null if no such object is 
	 * found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> E selectFirstFromResourceSet(String fqn, Class<E> clazz) { 
		return selectFirstFromResourceSet(new FQNQuery<E>(clazz, fqn));
	}
	
	/**
	 * Selects the first clazz object from the model with the given 
	 * fully qualified name.
	 * 
	 * @param fqn fully qualified name
	 * @param clazz type of the object with the fqn
	 * @return clazz object with the given fqn or null if no such object is 
	 * found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> E selectFirstFromModel(String fqn, Class<E> clazz) { 
		return selectFirstFromModel(new FQNQuery<E>(clazz, toFQN(fqn)));
	}
	
	/**
	 * Selects the first clazz object from the given roots objects with the 
	 * given fully qualified name.
	 * 
	 * @param roots roots objects to be searched
	 * @param fqn fully qualified name
	 * @param clazz type of the object with the fqn
	 * @return clazz object with the given fqn or null if no such object is 
	 * found
	 * @see MigrationResourceUtil#getFullyQualifiedName(EObject)
	 * @see FQNQuery
	 */
	public <E extends EObject> E selectFirstFrom(Iterable<? extends EObject> roots, String fqn, Class<E> clazz) { 
		return selectFirstFrom(roots, new FQNQuery<E>(clazz, fqn));
	}
	
	/**
	 * Selects the first clazz object with the given fully qualified name from 
	 * the model. If no such element can be found the resource set will be 
	 * searched.
	 * 
	 * @param clazz type of the object with the fqn
	 * @return clazz object with the given fqn or null if no such object is 
	 * found
	 */
	public <E extends EObject> E selectFirst(String fqn, Class<E> elementType) {
		E result = selectFirstFromModel(fqn, elementType);
		if(result == null)
			result = selectFirstFromResourceSet(fqn, elementType);
		if(result == null)
			result = selectFirstFromResourceSet(toFQN(fqn), elementType);
		return result;
	}
	
	// static methods
	
	/**
	 * Selects all objects from the given resource set that fulfill the 
	 * specified query.
	 * 
	 * @param set resource set to be searched
	 * @param query query selecting the respective objects
	 * @return list of objects fulfilling the query
	 */
	public static <T extends EObject> List<T> select(MigrationResourceSet set, ISelectionQuery<? extends T> query) {
		if(set == null)
			return new ArrayList<T>();
		return select(set.getResourceSet(), query);
	}
	
	/**
	 * Selects all objects from the given resource set that fulfill the 
	 * specified query.
	 * 
	 * @param set resource set to be searched
	 * @param query query selecting the respective objects
	 * @return list of objects fulfilling the query
	 */
	public static <T extends EObject> List<T> select(ResourceSet set, ISelectionQuery<? extends T> query) {
		List<T> list = new ArrayList<T>();
		if(set == null)
			return list;
		for(Resource res : set.getResources()) 
			CollectionUtil.add(select(res, query), list);
		return list;
	}
	
	/**
	 * Selects all objects from the given resource that fulfill the 
	 * specified query.
	 * 
	 * @param resource resource set to be searched
	 * @param query query selecting the respective objects
	 * @return list of objects fulfilling the query
	 */
	public static <T extends EObject> List<T> select(Resource resource, ISelectionQuery<? extends T> query) {
		if(resource == null || resource.getContents().isEmpty())
			return new ArrayList<T>();
		return select(resource.getContents().get(0), query);
	}
	
	/**
	 * Selects all objects from the given root objects that fulfill the 
	 * specified query.
	 * 
	 * @param roots root objects to be searched
	 * @param query query selecting the respective objects
	 * @return list of objects fulfilling the query
	 */
	public static <T extends EObject> List<T> select(Iterable<? extends EObject> roots, ISelectionQuery<? extends T> query) {
		List<T> list = new ArrayList<>();
		if(roots == null)
			return list;
		
		for(EObject root : roots)
			list.addAll(select(root, query));
		
		return list;
	}
	
	/**
	 * Selects all objects from the given root object that fulfill the 
	 * specified query.
	 * 
	 * @param root root object to be searched
	 * @param query query selecting the respective objects
	 * @return list of objects fulfilling the query
	 */
	public static <T extends EObject> List<T> select(EObject root, ISelectionQuery<? extends T> query) {
		List<T> list = new ArrayList<>();
		if(root == null)
			return list;
		CollectionUtil.add(query.accept(root), list);
		
		TreeIterator<EObject> contents = root.eAllContents();
		while(contents.hasNext()) 
			CollectionUtil.add(query.accept(contents.next()), list);
		
		return list;
	}
	
	/**
	 * Selects first object from the given resource set that fulfills the 
	 * specified query.
	 * 
	 * @param set resource set to be searched
	 * @param query query selecting the respective object
	 * @return object fulfilling the query or null if no such object is found
	 */
	public static <T extends EObject> T selectFirst(MigrationResourceSet set, ISelectionQuery<? extends T> query) {
		return selectFirst(set.getResourceSet(), query);
	}

	/**
	 * Selects first object from the given resource set that fulfills the 
	 * specified query.
	 * 
	 * @param set resource set to be searched
	 * @param query query selecting the respective object
	 * @return object fulfilling the query or null if no such object is found
	 */
	public static <T extends EObject> T selectFirst(ResourceSet set, ISelectionQuery<? extends T> query) {
		T selection = null;
		for(Resource res : set.getResources()) {
			selection = selectFirst(res, query);
			if(selection != null)
				return selection;
		}
		return null;
	}
	
	/**
	 * Selects first object from the given resource that fulfills the 
	 * specified query.
	 * 
	 * @param set resource set to be searched
	 * @param query query selecting the respective object
	 * @return object fulfilling the query or null if no such object is found
	 */
	public static <T extends EObject> T selectFirst(Resource resource, ISelectionQuery<? extends T> query) {
		if(resource == null || resource.getContents().isEmpty())
			return null;
		return selectFirst(resource.getContents().get(0), query);
	}
	
	/**
	 * Selects first object from the given root objects that fulfills the 
	 * specified query.
	 * 
	 * @param roots root objects to be searched
	 * @param query query selecting the respective object
	 * @return object fulfilling the query or null if no such object is found
	 */
	public static <T extends EObject> T selectFirst(Iterable<? extends EObject> roots, ISelectionQuery<? extends T> query) {
		T selection = null;
		
		for(EObject root : roots) {
			selection = selectFirst(root, query);
			if(selection != null)
				return selection;
		}
		return null;
	}

	/**
	 * Selects first object from the given root object that fulfills the 
	 * specified query.
	 * 
	 * @param root root object to be searched
	 * @param query query selecting the respective object
	 * @return object fulfilling the query or null if no such object is found
	 */
	public static <T extends EObject> T selectFirst(EObject root, ISelectionQuery<? extends T> query) {
		T selection = null;
		selection = query.accept(root);
		if(selection != null)
			return selection;
		
		TreeIterator<EObject> contents = root.eAllContents();
		while(contents.hasNext()) {
			selection = query.accept(contents.next());
			if(selection != null)
				return selection;
		}
		return null;
	}
}
