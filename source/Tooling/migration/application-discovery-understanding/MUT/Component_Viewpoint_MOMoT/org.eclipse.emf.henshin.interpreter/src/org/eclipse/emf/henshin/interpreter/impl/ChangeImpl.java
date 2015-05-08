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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.interpreter.Change;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;

/**
 * Default implementation of {@link Change} and its sub-interfaces.
 * @author Christian Krause
 */
public abstract class ChangeImpl implements Change {

	/**
	 * Flag indicating whether warnings should be printed.
	 */
	public static boolean PRINT_WARNINGS = true;
	
	/** 
	 * {@link EGraph} to be changed.
	 */
	protected final EGraph graph;

	/**
	 * Default constructor.
	 * @param graph {@link EGraph} to be changed.
	 */
	public ChangeImpl(EGraph graph) {
		this.graph = graph;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.Change#getEGraph()
	 */
	@Override
	public EGraph getEGraph() {
		return graph;
	}
	
	/**
	 * Default implementation of {@link ObjectChange}.
	 * @author Christian Krause
	 */
	public static final class ObjectChangeImpl extends ChangeImpl implements ObjectChange {

		private final EObject object;
		private boolean create;
		
		public ObjectChangeImpl(EGraph graph, EObject object, boolean create) {
			super(graph);
			this.object = object;
			this.create = create;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change#applyAndReverse()
		 */
		@Override
		public void applyAndReverse() {
			if (create) {
				graph.add(object);
			} else {
				graph.remove(object);
			}
			create = !create;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ObjectChange#getObject()
		 */
		@Override
		public EObject getObject() {
			return object;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ObjectChange#isCreate()
		 */
		@Override
		public boolean isCreate() {
			return create;
		}
		
	}
	
	/**
	 * Default implementation of {@link AttributeChange}.
	 * @author Christian Krause
	 */
	public static final class AttributeChangeImpl extends ChangeImpl implements AttributeChange {

		private final EObject object;
		private EAttribute attribute;
		private Object oldValue;
		private Object newValue;
		private boolean initialized;

		public AttributeChangeImpl(EGraph graph, EObject object, EAttribute attribute, Object newValue) {
			super(graph);
			this.object = object;
			this.attribute = attribute;
			this.newValue = newValue;
			this.initialized = false;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change#applyAndReverse()
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public void applyAndReverse() {
			// Need to initialize?
			if (!initialized) {
				oldValue = object.eGet(attribute);
				if ((oldValue==null && newValue==null) ||
					(oldValue!=null && oldValue.equals(newValue))) {
					attribute = null;
				}
			}
			// Nothing to do?
			if (attribute==null) {
				return;
			}
			if (attribute.isMany()) {
				List values = (List) object.eGet(attribute);
				values.clear();
				if (newValue instanceof List) {
					values.addAll((List) newValue);
				} else {
					values.add(newValue);
				}
			} else {
				object.eSet(attribute, newValue);
			}
			java.lang.Object dummy = oldValue;
			oldValue = newValue;
			newValue = dummy;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.AttributeChange#getObject()
		 */
		@Override
		public EObject getObject() {
			return object;
		}
	
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.AttributeChange#getAttribute()
		 */
		@Override
		public EAttribute getAttribute() {
			return attribute;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.AttributeChange#getOldValue()
		 */
		@Override
		public Object getOldValue() {
			return oldValue;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.AttributeChange#getNewValue()
		 */
		@Override
		public Object getNewValue() {
			return newValue;
		}
		
	}
	
	/**
	 * Default implementation of {@link ReferenceChange}.
	 * @author Christian Krause
	 */
	public static final class ReferenceChangeImpl extends ChangeImpl implements ReferenceChange {
		
		private final EObject source;
		private EReference reference;
		private int index;
		private EObject target, oldTarget; 
		private boolean create;
		private boolean initialized;
		
		public ReferenceChangeImpl(EGraph graph, EObject source, EObject target, EReference reference, boolean create) {
			super(graph);
			this.source = source;
			this.target = target;
			this.create = create;
			this.reference = reference;
			this.initialized = false;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change#applyAndReverse()
		 */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public void applyAndReverse() {
			// Need to initialize ?
			if (!initialized) {
				if (reference.isMany()) {
					List values = (List) source.eGet(reference);
					index = values.indexOf(target);
					if ((create && index>=0) || (!create && index<0)) {
						reference = null; // nothing to do
					}
					if (create && index<0) {
						index = values.size(); // append the new element at the end
					}
					// TODO: add a warning for containment side effects
				} else {
					oldTarget = (EObject) source.eGet(reference);
					// reference is redirected to the same target
					if (((create && target==oldTarget) || (!create && target!=oldTarget))) {
						if (PRINT_WARNINGS){
							System.out.println("WARNING (Hidden step): recreating '" + reference.getName() + "'-edge from " +
									InterpreterUtil.objectToString(source) + " to " +
									InterpreterUtil.objectToString(oldTarget));
						}
						reference = null; // nothing to do
					}
					// reference is redirected to a new target
					if (create && oldTarget!=null && reference!=null && PRINT_WARNINGS) {
						System.out.println("WARNING (Side effect):  deleting '" + reference.getName() + "'-edge from " +
											InterpreterUtil.objectToString(source) + " to " +
											InterpreterUtil.objectToString(oldTarget));
					}
					// reference is containment and new child (target) already has a parent
					if (create && reference!=null && reference.isContainment() && target.eContainer()!=null && PRINT_WARNINGS) {
						System.out.println("WARNING (Side effect):  deleting '" + reference.getName() + "'-edge from " +
											InterpreterUtil.objectToString(target.eContainer()) + " to " +
											InterpreterUtil.objectToString(target));
					}
					if (!create) {
						target = null; // we want to remove it
					}
				}
				initialized = true;
			}
			// Nothing to do?
			if (reference==null) {
				return;
			}
			// Otherwise do the change:
			if (reference.isMany()) {
				List values = (List) source.eGet(reference);
				if (create) {
					values.add(index, target);
				} else {
					values.remove(index);
				}
				create = !create;
			} else {
				source.eSet(reference, target); // set the new target
				EObject dummy = target; // switch target and old target
				target = oldTarget;
				oldTarget = dummy;
			}
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ReferenceChange#getSource()
		 */
		@Override
		public EObject getSource() {
			return source;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ReferenceChange#getTarget()
		 */
		@Override
		public EObject getTarget() {
			return target;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ReferenceChange#getReference()
		 */
		@Override
		public EReference getReference() {
			return reference;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ReferenceChange#isCreate()
		 */
		@Override
		public boolean isCreate() {
			return create;
		}
		
	}

	/**
	 * Default implementation of {@link IndexChange}.
	 * @author Christian Krause
	 */
	public static final class IndexChangeImpl extends ChangeImpl implements IndexChange {
		
		private final EObject source;
		private final EObject target; 
		private final EReference reference;
		private int oldIndex;
		private int newIndex;
		private boolean initialized;
		
		public IndexChangeImpl(EGraph graph, EObject source, EObject target, EReference reference, int newIndex) {
			super(graph);
			this.source = source;
			this.target = target;
			this.reference = reference;
			this.newIndex = newIndex;
			this.initialized = false;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change#applyAndReverse()
		 */
		@SuppressWarnings({ "rawtypes" })
		@Override
		public void applyAndReverse() {
			// Need to initialize ?
			if (!initialized) {
				if (reference.isMany()) {
					List values = (List) source.eGet(reference);
					oldIndex = values.indexOf(target);
				} else {
					if (target==source.eGet(reference)) {
						oldIndex = 0;
					} else {
						oldIndex = -1;
					}
				}
				if (oldIndex<0) {
					throw new RuntimeException("Error changing edge index for reference "
							+ reference + " in object " + source + ": target " + target + " not found");
				}
				initialized = true;
			}
			// Try to move the element to the new position:
			if (reference.isMany()) {
				EList values = (EList) source.eGet(reference);
				values.move(newIndex, oldIndex);
			} else if (newIndex!=0) {
				throw new RuntimeException("Cannot move element to position " + newIndex
						+ " in the non-multi reference" + reference);
			}
			// Revert the change:
			int dummy = oldIndex;
			oldIndex = newIndex;
			newIndex = dummy;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.IndexChange#getSource()
		 */
		@Override
		public EObject getSource() {
			return source;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.IndexChange#getTarget()
		 */
		@Override
		public EObject getTarget() {
			return target;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.IndexChange#getReference()
		 */
		@Override
		public EReference getReference() {
			return reference;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.IndexChange#getOldIndex()
		 */
		@Override
		public int getOldIndex() {
			return oldIndex;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.IndexChange#getNewIndex()
		 */
		@Override
		public int getNewIndex() {
			return newIndex;
		}
		
	}
	
	/**
	 * Default implementation of {@link CompoundChange}.
	 * @author Christian Krause
	 */
	public static final class CompoundChangeImpl extends ChangeImpl implements CompoundChange {

		// The list of changes:
		private final List<Change> changes;
		
		// Whether to apply them in reverse order:
		private boolean reverse;
		
		/**
		 * Default constructor.
		 * @param graph EGraph to be changed.
		 */
		public CompoundChangeImpl(EGraph graph) {
			super(graph);
			changes = new ArrayList<Change>();
			reverse = false;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change#applyAndReverse()
		 */
		@Override
		public void applyAndReverse() {
			int size = changes.size();
			if (reverse) {
				for (int i=size-1; i>=0; i--) {
					changes.get(i).applyAndReverse();
				}
			} else {
				for (int i=0; i<size; i++) {
					changes.get(i).applyAndReverse();
				}
			}
			reverse = !reverse;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.henshin.interpreter.Change.ComplexChange#getChanges()
		 */
		@Override
		public List<Change> getChanges() {
			return changes;
		}
		
	}

}
