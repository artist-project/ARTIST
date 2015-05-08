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

/**
 * Interface for binary constraints.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public interface BinaryConstraint extends Constraint {
	
	/**
	 * Evaluates the constraint between the given domain slots.
	 * BinaryConstraints may only be checked <i>after</i> the 
	 * source slot has been locked.
	 * 
	 * @param source The (locked) domain slot initiating the evaluation.
	 * @param target The domain slot which domain will be checked.
	 * @return <code>true</code>, if the constraint is compatible with the given slot pair.
	 */
	boolean check(DomainSlot source, DomainSlot target);
	
}
