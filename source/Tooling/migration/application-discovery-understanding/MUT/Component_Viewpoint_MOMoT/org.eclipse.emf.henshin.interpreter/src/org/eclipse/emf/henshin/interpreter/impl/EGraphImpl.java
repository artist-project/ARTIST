/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;

/**
 * Default {@link EGraph} implementation. Based on linked hash sets.
 */
public class EGraphImpl extends LinkedHashSet<EObject> implements EGraph {
	
	/**
	 * Generated serial ID.
	 */
	private static final long serialVersionUID = -1917534761444871093L;

	/**
	 * All involved EPackages.
	 */
	protected final Set<EPackage> packages;
	
	/**
	 * Mappings from each type to all its instances.
	 */
	protected final Map<EClass, List<EObject>> domainMap;
	
	/**
	 * Mappings from each type to all its extending subtypes.
	 */
	protected final Map<EClass, Set<EClass>> inheritanceMap;
	
	/**
	 * Cross reference adapter for determining cross references between registered objects.
	 */
	protected final ECrossReferenceAdapter crossReferenceAdapter;
	
	/**
	 * Default constructor.
	 */
	public EGraphImpl() {
		this(32);
	}
	
	/**
	 * Constructor.
	 * @param initialCapacity Initial capacity of the graph.
	 */
	public EGraphImpl(int initialCapacity) {
		super(initialCapacity);
		packages = new LinkedHashSet<EPackage>();
		domainMap = new LinkedHashMap<EClass, List<EObject>>();
		inheritanceMap = new LinkedHashMap<EClass, Set<EClass>>();
		crossReferenceAdapter = new ECrossReferenceAdapter();
	}

	/**
	 * Convenience constructor. Adds an object and all reachable objects to this graph. 
	 * @param object An object.
	 */
	public EGraphImpl(EObject object) {
		this();
		initializeContents(Collections.singleton(object));
	}

	/**
	 * Convenience constructor. Adds a collection of objects and all reachable objects to this graph.
	 * @param collection A collection of objects.
	 */
	public EGraphImpl(Collection<? extends EObject> collection) {
		this();
		initializeContents(collection);
	}

	/**
	 * Convenience constructor. Adds the contents of a resource and all reachable objects to this graph.
	 * @param resource A resource.
	 */
	public EGraphImpl(Resource resource) {
		this();
		initializeContents(resource.getContents());
	}
	
	/**
	 * Initialize this EGraph.
	 * @param collection Collection of objects to be added.
	 */
	protected void initializeContents(Collection<? extends EObject> collection) {
		// First add the collection as a normal tree:
		for (EObject object : collection) {
			if (!contains(object)) { // omit tree traversal if possible
				addTree(object);
			}
		}
		// And now again as a graph:
		addGraph(collection);
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.HashSet#add(java.lang.Object)
	 */
	@Override
	public final boolean add(EObject object) {
		boolean added = super.add(object);
		if (added) {
			didAdd(object);
		}
		return added;
	}
	
	/**
	 * Notify that an object has been added to the graph.
	 * @param object Added object.
	 */
	protected void didAdd(EObject object) {
		object.eAdapters().add(crossReferenceAdapter);
		EClass type = object.eClass();
		getDomain(type).add(object);
		addEPackage(type.getEPackage());
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.HashSet#remove(java.lang.Object)
	 */
	@Override
	public final boolean remove(Object object) {
		boolean removed = super.remove(object);
		if (removed && object instanceof EObject) {
			didRemove((EObject) object);
		}
		return removed;
	}

	/**
	 * Notify that an object has been removed from the graph.
	 * @param object Removed object.
	 */
	protected void didRemove(EObject object) {
		object.eAdapters().remove(crossReferenceAdapter);
		domainMap.get(object.eClass()).remove(object);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#addTree(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean addTree(EObject root) {
		boolean changed = add(root);
		for (Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
			if (add(it.next())) changed = true;
		}
		return changed;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#removeTree(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean removeTree(EObject root) {
		boolean changed = remove(root);
		for (final Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
			if (remove(it.next())) changed = true;
		}
		return changed;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#addGraph(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean addGraph(EObject object) {
		return addAll(computeTransitiveClosure(object));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#removeGraph(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean removeGraph(EObject object) {
		return removeAll(computeTransitiveClosure(object));
	}

	/*
	 * Add a graph. Internal helper.
	 */
	private void addGraph(Collection<? extends EObject> collection) {
		Set<EObject> visited = new HashSet<EObject>();
		for (EObject object : collection) {
			if (!visited.contains(object)) { // omit computing the transitive closure if possible
				Set<EObject> closure = computeTransitiveClosure(object);
				addAll(closure);
				visited.addAll(closure);
			}
		}
	}

	/**
	 * Compute the transitive closure of referenced {@link EObject}s.
	 * It is implemented iteratively to prevent stack overflows.
	 * @param start The start object.
	 * @return Set of transitively reachable objects.
	 */
	private Set<EObject> computeTransitiveClosure(EObject start) {
		
		// Initialize:
		Set<EObject> result = new LinkedHashSet<EObject>();
		Set<EObject> newObjects = new LinkedHashSet<EObject>();
		newObjects.add(start);
		
		// Loop:
		while (!newObjects.isEmpty()) {
			result.addAll(newObjects);
			// Compute references:
			Set<EObject> referencedObjects = new LinkedHashSet<EObject>();
			for (EObject object : newObjects) {
				for (EReference ref : object.eClass().getEAllReferences()) {
					if (ref.isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> targets = (EList<EObject>) object.eGet(ref);
						referencedObjects.addAll(targets);
					} else {
						EObject target = (EObject) object.eGet(ref);
						if (target!=null) {
							referencedObjects.add(target);
						}
					}
				}
			}
			
			// Check which of them are new:
			newObjects.clear();
			for (EObject object : referencedObjects) {
				if (!result.contains(object)) {
					newObjects.add(object);
				}
			}
		}
		
		// Finished.
		return result;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractCollection#addAll(java.util.Collection)
	 */
	@Override
	public boolean addAll(Collection<? extends EObject> objs) {
		boolean changed = false;
		for (EObject object : objs) {
			if (add(object)) changed = true;
		}
		return changed;
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractSet#removeAll(java.util.Collection)
	 */
	@Override
	public boolean removeAll(Collection<?> objs) {
		boolean changed = false;
		for (Object object : objs) {
			if (remove(object)) changed = true;
		}
		return changed;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.HashSet#clear()
	 */
	@Override
	public void clear() {
		for (EObject object : this) {
			object.eAdapters().remove(crossReferenceAdapter);
		}
		super.clear();
		packages.clear();
		domainMap.clear();
		inheritanceMap.clear();
	}
	
	/**
	 * Add an {@link EPackage}. Update the internal inheritance map.
	 * @param ePackage {@link EPackage} to be added.
	 * @return <code>true</code> if it is new.
	 */
	protected boolean addEPackage(EPackage ePackage) {
		boolean added = packages.add(ePackage);
		if (added) {
			for (EClassifier classifier : ePackage.getEClassifiers()) {
				if (classifier instanceof EClass) {
					EClass type = (EClass) classifier;
					addChildParentRelation(type, type);
					for (EClass parent : type.getEAllSuperTypes()) {
						addChildParentRelation(type, parent);
					}
				}
			}
		}
		return added;
	}
	
	/**
	 * Update the inheritance map. Add a child-parent relationship.
	 * @param child Child class.
	 * @param parent Parent class.
	 */
	protected void addChildParentRelation(EClass child, EClass parent) {
		Set<EClass> children = inheritanceMap.get(parent);
		if (children == null) {
			children = new LinkedHashSet<EClass>();
			inheritanceMap.put(parent, children);
		}
		children.add(child);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getDomain(org.eclipse.emf.ecore.EClass, boolean)
	 */
	@Override
	public List<EObject> getDomain(EClass type, boolean strict) {
		if (strict) {
			return new ArrayList<EObject>(getDomain(type));
		}
		List<EObject> domain = new ArrayList<EObject>();
		Set<EClass> inhMap = inheritanceMap.get(type);
		if (inhMap != null) {
			for (EClass child : inhMap) {
				domain.addAll(getDomain(child));
			}
		}
		return domain;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getDomainSize(org.eclipse.emf.ecore.EClass, boolean)
	 */
	@Override
	public int getDomainSize(EClass type, boolean strict) {
		if (strict) {
			return getDomain(type).size();
		}
		Set<EClass> inhMap = inheritanceMap.get(type);
		int size = 0;
		if (inhMap != null) {
			for (EClass child : inhMap) {
				size += getDomain(child).size();
			}
		}
		return size;
	}

	/*
	 * Get the domain for a given type.
	 */
	protected Collection<EObject> getDomain(EClass type) {
		List<EObject> domain = domainMap.get(type);
		if (domain == null) {
			domain = new ArrayList<EObject>();
			domainMap.put(type, domain);
		}
		return domain;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getCrossReferenceAdapter()
	 */
	@Override
	public ECrossReferenceAdapter getCrossReferenceAdapter() {
		return crossReferenceAdapter;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#copy(java.util.Map)
	 */
	@Override
	public EGraph copy(Map<EObject, EObject> copies) {
		if (copies==null) {
			Copier copier = new Copier();
			copier.copyAll(getRoots());
			copier.copyReferences();
			copies = copier;
		}
		EGraph copy = new EGraphImpl(size());
		for (EObject object : this) {
			copy.add(copies.get(object));
		}
		return copy;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.EGraph#getRoots()
	 */
	@Override
	public List<EObject> getRoots() {
		Set<EObject> roots = new LinkedHashSet<EObject>();
		for (EObject object : this) {
			while (object.eContainer()!=null) {
				object = object.eContainer();
			}
			roots.add(object);
		}
		return new ArrayList<EObject>(roots);
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractCollection#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + 
				" (nodes: " + size() + ", edges: " + InterpreterUtil.countEdges(this)+")";
	}
	
}