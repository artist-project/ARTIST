/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Change model for Henshin. Stores information about changes and provides
 * functionality to apply these changes to an {@link EGraph}.
 * 
 * @see Engine#createChange(org.eclipse.emf.henshin.model.Rule, EGraph, Match, Match)
 * @author Christian Krause
 */
public interface Change {
	
	/**
	 * Change for creating or deleting an object.
	 */
	public interface ObjectChange extends Change {
		
		EObject getObject();

		boolean isCreate();
		
	}

	/**
	 * Change for modifying an attribute.
	 */
	public interface AttributeChange extends Change {
		
		EObject getObject();
		
		EAttribute getAttribute();
		
		Object getOldValue();
		
		Object getNewValue();
		
	}

	/**
	 * Change for creating or deleting a reference (link) between two objects.
	 */
	public interface ReferenceChange extends Change {
		
		EObject getSource();
		
		EObject getTarget();
		
		EReference getReference();
		
		boolean isCreate();
		
	}

	/**
	 * Change for modifying the index of a reference (link) between two objects.
	 */
	public interface IndexChange extends Change {
		
		EObject getSource();
		
		EObject getTarget();
		
		EReference getReference();
		
		int getOldIndex();

		int getNewIndex();

	}

	/**
	 * Compound change (an ordered list of {@link Change}s).
	 */
	public interface CompoundChange extends Change {
		
		List<Change> getChanges();
		
	}
	
	/**
	 * Get the {@link EGraph} to be changed.
	 * @return The {@link EGraph}.
	 */
	EGraph getEGraph();
	
	/**
	 * Apply this change description and reverse it so that
	 * is can be undone / redone.
	 */
	void applyAndReverse();
	
}
