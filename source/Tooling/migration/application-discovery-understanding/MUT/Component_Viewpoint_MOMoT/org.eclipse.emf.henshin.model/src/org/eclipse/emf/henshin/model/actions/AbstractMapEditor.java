/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.actions;

import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.MappingList;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Rule;

public abstract class AbstractMapEditor<E extends GraphElement> implements MapEditor<E> {
	
	// Source graph.
	private Graph source;
	
	// Target graph.
	private Graph target;
	
	// Mappings: source to target.
	private MappingList mappings;
	
	/**
	 * Default constructor.
	 * @param source Source graph.
	 * @param target Target graph.
	 * @param mappings Mappings from source to target.
	 */
	public AbstractMapEditor(Graph source, Graph target, MappingList mappings) {
		setSourceAndTarget(source, target);
		this.mappings = mappings;		
	}
	
	/**
	 * Alternative constructor, which assumes that the given target graph
	 * is the RHS or a NAC of a rule.
	 * @param target Target graph.
	 */
	public AbstractMapEditor(Graph target) {
		
		// Check whether the graph is properly contained in a rule.
		Rule rule = target.getRule();
		if (rule==null) {
			throw new IllegalArgumentException("Source graph not contained in a rule");
		}
		
		// Set source and target:
		setSourceAndTarget(rule.getLhs(), target);
		
		// Determine the mappings to be used.
		if (target==rule.getRhs()) {
			this.mappings = rule.getMappings();
		} else if (target.eContainer() instanceof NestedCondition) {
			this.mappings = ((NestedCondition) target.eContainer()).getMappings();
		} else {
			throw new IllegalArgumentException("Target graph must be either the RHS or contained in a NestedCondition");
		}		
	}
	
	/**
	 * Alternative constructor.
	 */
	public AbstractMapEditor(MapEditor<?> mapEditor) {
		this(mapEditor.getSource(), mapEditor.getTarget(), mapEditor.getMappings());
	}

	/*
	 * Set source and target graph.
	 */
	private void setSourceAndTarget(Graph source, Graph target) {
		// Check whether the graphs are null or the same.
		if (source==null || target==null || source==target) {
			throw new IllegalArgumentException("Source and target graph cannot be the same or null");
		}
		this.source = source;
		this.target = target;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#getSource()
	 */
	public final Graph getSource() {
		return source;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#getTarget()
	 */
	public final Graph getTarget() {
		return target;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#getMappings()
	 */
	public final MappingList getMappings() {
		return mappings;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#getOpposite(java.lang.Object)
	 */
	public final E getOpposite(E e) {
		if (mappings==null) {
			return null;
		}
		Graph graph = e.getGraph();
		if (graph==null || (graph!=source && graph!=target)) {
			throw new IllegalArgumentException("Illegal element container: " + graph);
		}
		if (graph==source) {
			return mappings.getImage(e, target);
		} else {
			return mappings.getOrigin(e);			
		}
	}
	
	/*
	 * Get the opposite graph.
	 */
	protected final Graph getOpposite(Graph graph) {
		if (graph==source) return target;
		if (graph==target) return source;
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#move(java.lang.Object)
	 */
	public final void move(E e) {
		E opposite = getOpposite(e);
		if (opposite!=null) {
			replace(opposite);     // Rather replace the opposite if it exists already
			return;
		} 
		// Do the moving:
		doMove(e);
		// Now move in the multi-rules:
		if (getTarget().isRhs()) {
			for (Rule multi : getTarget().getRule().getMultiRules()) {
				E eImage = multi.getMultiMappings().getImage(e, null);
				if (eImage!=null) {
					newInstance(multi.getLhs(), multi.getRhs(), multi.getMappings()).move(eImage);
				}
			}
		}
	}
	
	/*
	 * Perform the move operation.
	 */
	protected abstract void doMove(E e);
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#remove(java.lang.Object)
	 */
	public final void remove(E e) {
		Graph container = e.getGraph();
		if (container!=source && container!=target) {
			throw new IllegalArgumentException();
		}
		// Remove the mapping first.
		E opposite = getOpposite(e);
		if (opposite!=null) {
			removeMapping(e, opposite);
		}
		// Do the removal:
		doRemove(e);
		// Now remove in the multi-rules:
		if (getTarget().isRhs()) {
			for (Rule multi : getTarget().getRule().getMultiRules()) {
				E eImage = multi.getMultiMappings().getImage(e, null);
				if (eImage!=null) {
					newInstance(multi.getLhs(), multi.getRhs(), multi.getMappings()).remove(eImage);
					multi.getMultiMappings().remove(e, eImage);
				}
			}
		}
	}

	/*
	 * Perform a remove operation.
	 */
	protected abstract void doRemove(E e);
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#replace(java.lang.Object)
	 */
	public final E replace(E e) {
		if (getOpposite(e)==null) {
			throw new IllegalArgumentException("Cannot replace an element that is not mapped: " + e);
		}
		// Do the replacement:
		E r = doReplace(e);
		// Now replace in the multi-rules:
		if (getTarget().isRhs()) {
			for (Rule multi : getTarget().getRule().getMultiRules()) {
				E eImage = multi.getMultiMappings().getImage(e, null);
				E rImage = multi.getMultiMappings().getImage(r, null);
				if (eImage!=null && rImage!=null) {
					newInstance(multi.getLhs(), multi.getRhs(), multi.getMappings()).replace(eImage);
					multi.getMultiMappings().remove(e, eImage);
				}
			}
		}
		return r;
	}

	/*
	 * Perform a replace operation.
	 */
	protected abstract E doReplace(E e);
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.diagram.edit.maps.MapEditor#copy(java.lang.Object)
	 */
	public final E copy(E e) {
		// Do the copy:
		E c = doCopy(e);
		// Now copy in the multi-rules:
		if (getTarget().isRhs()) {
			for (Rule multi : getTarget().getRule().getMultiRules()) {
				E eImage = multi.getMultiMappings().getImage(e, null);
				if (eImage!=null) {
					E cImage = newInstance(multi.getLhs(), multi.getRhs(), multi.getMappings()).copy(eImage);
					multi.getMultiMappings().add(c, cImage);
				}
			}
		}
		return c;
	}
	
	/*
	 * Perform a copy.
	 */
	protected abstract E doCopy(E e);
	
	/*
	 * Remove a mapping between two elements.
	 */
	protected final void removeMapping(E e1, E e2) {
		if (mappings==null) {
			return;
		}
		Graph g1 = e1.getGraph();
		Graph g2 = e2.getGraph();
		if (g1==source && g2==target) {
			doRemoveMapping(e1, e2);
		}
		else if (g1==target && g2==source) {
			doRemoveMapping(e2, e1);
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	/*
	 * Perform a removal of a mapping.
	 */
	protected void doRemoveMapping(E origin, E image) {
		// Default implementation assumes that mappings are implicit, so nothing to do here.
	}
	
	/*
	 * Create a mapping.
	 */
	protected final void createMapping(E e1, E e2) {
		if (mappings==null) {
			return;
		}
		Graph g1 = e1.getGraph();
		Graph g2 = e2.getGraph();
		if (g1==source && g2==target) {
			doCreateMapping(e1, e2);
		}
		else if (g1==target && g2==source) {
			doCreateMapping(e2, e1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	/*
	 * Perform a creation of a mapping.
	 */
	protected void doCreateMapping(E origin, E image) {
		// Default implementation assumes that mappings are implicit, so nothing to do here.
	}

	/*
	 * Create a new instance of the current map editor.
	 */
	@SuppressWarnings("unchecked")
	private MapEditor<E> newInstance(Graph source, Graph target, MappingList mappings) {
		try {
			return getClass().getConstructor(Graph.class, Graph.class, MappingList.class)
				.newInstance(source, target, mappings);
		} catch (Throwable t) {
			t.printStackTrace();
			return null;
		}
	}
}