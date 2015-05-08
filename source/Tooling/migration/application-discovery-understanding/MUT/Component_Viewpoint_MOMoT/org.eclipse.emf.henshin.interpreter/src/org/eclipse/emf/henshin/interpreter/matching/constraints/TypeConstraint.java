/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.constraints;

import java.util.concurrent.ThreadFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.PartitionedEGraph;

/**
 * This constraint checks whether an node has a specific value.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public class TypeConstraint implements UnaryConstraint {
	
	/**
	 * Constants for no partition.
	 */
	public static final int NO_PARTITION = -1;
	
	/**
	 * Thread class for injecting partitioning information into
	 * the type constraint checking.
	 */
	public static class PartitionThread extends Thread {
		
		/**
		 * Factory for creating {@link PartitionThread}s.
		 */
		public static class Factory implements ThreadFactory {

			/**
			 * Static factory instance.
			 */
			public static final Factory INSTANCE = new Factory();

			/*
			 * (non-Javadoc)
			 * @see java.util.concurrent.ThreadFactory#newThread(java.lang.Runnable)
			 */
			@Override
			public Thread newThread(Runnable runnable) {
				return new PartitionThread(runnable);
			}
		}
		
		/**
		 * Partition to be used.
		 */
		public int partition = NO_PARTITION;
		
		/**
		 * First domain slot of the match finding.
		 */
		public DomainSlot firstDomainSlot = null;
		
		/**
		 * Constructor.
		 * @param runnable Runnable.
		 */
		public PartitionThread(Runnable runnable) {
			super(runnable);
		}
		
	}
	
	/**
	 * Type to be matched.
	 */
	public final EClass type;
	
	/**
	 * Whether to use strict typing.
	 */
	public final boolean strictTyping;

	/**
	 * Constructor.
	 * @param type Type to be matched.
	 * @param strictTyping Whether to use strict typing.
	 */
	public TypeConstraint(EClass type, boolean strictTyping) {
		this.type = type;
		this.strictTyping = strictTyping;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.constraints.UnaryConstraint#check(org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot)
	 */
	@Override
	public boolean check(DomainSlot slot) {
		return !slot.locked || isValid(slot.value);
	}
	
	/**
	 * Check whether the argument is a valid object according to this type constraint.
	 * @param object Object to be checked.
	 * @return <code>true</code> if it is valid.
	 */
	protected boolean isValid(EObject object) {
		return strictTyping ? (type==object.eClass()) : type.isSuperTypeOf(object.eClass());
	}
	
	/**
	 * Initialize a domain slot.
	 * @param slot Domain slot to be initialized.
	 * @param graph Target graph.
	 * @return <code>true</code> if it was initialized.
	 */
	public boolean initDomain(DomainSlot slot, EGraph graph) {
		
		// Already initialized:
		if (slot.domain==null) {
			int partition = getPartition(slot);
			if (partition!=NO_PARTITION) {
				slot.domain = ((PartitionedEGraph) graph).getDomain(type, strictTyping, partition);
			} else {
				slot.domain = graph.getDomain(type, strictTyping);
			}
			return !slot.domain.isEmpty();
		}
		
		// Domain empty?
		if (slot.domain.isEmpty()) {
			return false;
		} else {
			int size = slot.domain.size();
			for (int i=size-1; i>=0; i--) {
				EObject object = slot.domain.get(i);
				if (object==null || !isValid(object)) {
					slot.domain.remove(i);
				}
			}
			return !slot.domain.isEmpty();
		}
		
	}
	
	/**
	 * Check whether an instantiation could be possible.
	 * @param slot Domain slot.
	 * @param graph Target graph.
	 * @return <code>true</code> if an instantiation might be possible.
	 */
	public boolean instantiationPossible(DomainSlot slot, EGraph graph) {
		if (slot.locked) {
			return isValid(slot.value);
		} else {
			int partition = getPartition(slot);
			if (partition != NO_PARTITION) {
				return ((PartitionedEGraph) graph).getDomainSize(type, strictTyping, partition) > 0;
			} else {
				return graph.getDomainSize(type, strictTyping) > 0;
			}
		}
	}
	
	/**
	 * Get the partition to be used.
	 * @param slot The current domain slot.
	 * @return The partition.
	 */
	private int getPartition(DomainSlot slot) {
		if (Thread.currentThread() instanceof PartitionThread) {
			PartitionThread thread = (PartitionThread) Thread.currentThread();
			if (thread.firstDomainSlot==null) {
				throw new NullPointerException();
			}
			if (thread.firstDomainSlot==slot) {
				return thread.partition;
			}
		}
		return NO_PARTITION;
	}
	
}
