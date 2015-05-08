/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.equality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Helper class for navigating through resource contents.
 * Supports depth-first traversal, skipping of subtrees, and back-tracking.
 * 
 * @author Christian Krause
 */
public class ResourceNavigator {
	
	/*
	 * Data object for storing links between EObjects.
	 */
	static class Link {
		
		// Source object:
		EObject source;
		
		// EReference of the source object:
		EReference reference;
		
		// Target objects:
		List<EObject> targets;
		
		// Index of the currently selected target object:
		int index;
		
		// Whether this link was visited:
		boolean visited;
		
		// Previous link:
		Link previous;	
		
	}
	
	// Whether we want to traverse non-containment links:
	private final boolean withNonContainment;
	
	// Whether we shall include derived features:
	private final boolean withDerived;

	// The last known link:
	Link last;

	// Remember whether we reached the start or the end:
	boolean start, end;
	
	// Cache reference lists:
	private final Map<EClass,List<EReference>> referenceCache;
	
	/**
	 * Default constructor.
	 * @param resource Resource to be traversed.
	 * @param withNonContainment Whether we want to traverse non-containment links.
	 * @param withDerived Whether we shall include derived features.
	 */
	public ResourceNavigator(Resource resource, boolean withNonContainment, boolean withDerived) {
		this.withNonContainment = withNonContainment;
		this.withDerived = withDerived;
		this.referenceCache = new HashMap<EClass,List<EReference>>();
		if (resource.getContents().isEmpty()) {
			start = true;
			end = true;
		} else {
			start = false;
			end = false;
			last = new Link();
			last.targets = resource.getContents();
			last.index = 0;  // source=null, reference=null, visited=false, previous=null
		}
	}
	
	/**
	 * Get the source object of the currently selected link.
	 * @return The source object of the link (can be <code>null</code>).
	 */
	public EObject getSource() {
		if (start || end) {
			return null;
		} else {
			return last.source;			
		}
	}
	
	/**
	 * Get the target object of the currently selected link.
	 * @return The target object of the link (can be <code>null</code>).
	 */
	public EObject getTarget() {
		if (start || end) {
			return null;
		} else {
			return last.targets.get(last.index);
		}
	}

	/**
	 * Get the reference of the currently selected link.
	 * @return The current reference.
	 */
	public EReference getReference() {
		if (start || end) {
			return null;
		} else {
			return last.reference;
		}
	}

	/**
	 * Get the index of the currently selected link.
	 * @return The current index.
	 */
	public int getIndex() {
		if (start || end) {
			return -1;
		} else {
			return last.index;
		}
	}

	/**
	 * Returns <code>true</code> is the start was reached.
	 * @return <code>true</code> if we are at the start.
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * Returns <code>true</code> is the end was reached.
	 * @return <code>true</code> if we are at the end.
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * Follow the first outgoing link in the current target object.
	 * If that is no possible, the method invokes {@link #skip()}
	 * and returns the result of this invocation.
	 * @return The new target object.
	 */
	public EObject forward() {
		
		// Reached the start or the end?
		if (end) {
			return null;
		}
		if (start) {
			start = false;
			return getTarget();
		}
		
		// Try to find an outgoing edge of the current target:
		EObject target = getTarget();
		for (EReference reference : getReferences(target)) {
			Link link = createLink(target, reference, 0);
			if (link!=null) {
				link.previous = last;
				last = link;
				return getTarget(); // a new target!
			}			
		}

		// We did not find any outgoing edge, so we skip.
		return skip();
		
	}
	
	/**
	 * Skip the current target and proceed with the rest.
	 * @return The new target.
	 */
	public EObject skip() {
		
		// Reached the start or the end already?
		if (end) {
			return null;
		}
		if (start) {
			start = false;
			return getTarget();
		}
				
		// Skip the current target and continue with the rest:
		Link link = last;
		Link next = null;
		while (link!=null) {
			if (!link.visited) {
				next = nextLink(link);
				if (next!=null) {
					break;
				}
			}
			link = link.previous;
		}
		
		// Next link found?
		if (next!=null) {
			link.visited = true;	// Mark the old link as visited.
			next.previous = last;
			last = next;
			return getTarget();
		} else {
			end = true;		// We reached the end.
			return null;
		}
		
	}

	
	/**
	 * Go one step backward.
	 * @return The previous target.
	 */
	public EObject backward() {
		
		// Reached the start or the end already?
		if (start) {
			return null;
		}
		if (end) {
			end = false;
			return getTarget();
		}
		
		// Otherwise try to go one step backward:
		if (last.previous!=null) {
			// Mark the last known link from the same source as not visited:
			Link link = last.previous;
			while (link!=null) {
				if (link.source==last.source) {
					link.visited = false;
					break;
				} else {
					link = link.previous;
				}
			}
			// Now we can safely step back:
			last = last.previous;
			return getTarget();			
		} else {
			start = true;		// Otherwise we reached the start
			return null;
		}
		
	}

	/*
	 * Get cached reference lists.
	 */
	private List<EReference> getReferences(EObject object) {
		List<EReference> references = referenceCache.get(object.eClass());
		if (references==null) {
			references = new ArrayList<EReference>();
			for (EReference ref : object.eClass().getEAllReferences()) {
				if (!(withNonContainment || ref.isContainment())) {
					continue;
				}
				if (!(withDerived || !ref.isDerived())) {
					continue;
				}
				references.add(ref);
			}
			referenceCache.put(object.eClass(), references);
		}
		return references;
	}
	
	/*
	 * Get the next link or null. Does not set the previous link or the visited flag.
	 */
	private Link nextLink(Link link) {
		if (link.index<link.targets.size()-1) {
			Link next = new Link();
			next.reference = link.reference;
			next.index = link.index+1;
			next.source = link.source;
			next.targets = link.targets;
			return next;
		}
		else if (link.reference!=null) {
			List<EReference> refs = getReferences(link.source);
			for (int i=refs.indexOf(link.reference)+1; i<refs.size(); i++) {
				Link next = createLink(link.source, refs.get(i), 0);
				if (next!=null) {
					return next;
				}
			}
		}
		return null;
	}
	
	/*
	 * Try to create a link.
	 */
	private Link createLink(EObject source, EReference reference, int index) {
		Link link = null;
		if (reference.isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> values = (List<EObject>) source.eGet(reference);
			if (index < values.size()) {
				link = new Link();
				link.reference = reference;
				link.index = index;
				link.source = source;
				link.targets = values;
			}
		} else {
			EObject value = (EObject) source.eGet(reference);
			if (value!=null && index==0) {
				link = new Link();
				link.reference = reference;
				link.index = index;
				link.source = source;
				link.targets = (List<EObject>) Collections.singletonList(value);
			}
		}
		return link;
	}
	
}
