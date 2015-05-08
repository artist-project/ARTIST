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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

/**
 * Match finder variable. Internal representation of nodes.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public class Variable {
	
	// Type constraint:
	public final TypeConstraint typeConstraint;
	
	// Attribute constraints:
	public final List<AttributeConstraint> attributeConstraints;
	
	// Dangling constraints:
	public final List<DanglingConstraint> danglingConstraints;
	
	// Reference constraints:
	public final List<ReferenceConstraint> referenceConstraints;
	
	// Containment constraints:
	public final List<ContainmentConstraint> containmentConstraints;

	// Path constraints:
	public final List<PathConstraint> pathConstraints;

	// User-defined constraints:
	public final List<UnaryConstraint> userConstraints;
	
	// User-defined constraints for edges:
	public final Map<ReferenceConstraint, BinaryConstraint> binaryUserConstraints;

	// User-defined constraints for attributes:
	public final Map<AttributeConstraint, UnaryConstraint> attributeUserConstraints;

	// Whether this variable requires a final re-check:
	public boolean requiresFinalCheck;

	/**
	 * Constructor. Creates the related {@link TypeConstraint} already.
	 * @param type Type of the node to be matched.
	 */
	public Variable(EClass type) {
		this(type, false);
	}
	
	/**
	 * Constructor. Creates the related {@link TypeConstraint} already.
	 * @param type Type of the node to be matched.
	 * @param strictTyping Whether to use strict typing.
	 */
	public Variable(EClass type, boolean strictTyping) {
		typeConstraint = new TypeConstraint(type, strictTyping);
		attributeConstraints = new ArrayList<AttributeConstraint>();
		danglingConstraints = new ArrayList<DanglingConstraint>();
		referenceConstraints = new ArrayList<ReferenceConstraint>();
		containmentConstraints = new ArrayList<ContainmentConstraint>();
		pathConstraints = new ArrayList<PathConstraint>();
		userConstraints = new ArrayList<UnaryConstraint>();
		binaryUserConstraints = new LinkedHashMap<ReferenceConstraint,BinaryConstraint>();
		attributeUserConstraints = new LinkedHashMap<AttributeConstraint,UnaryConstraint>();
		requiresFinalCheck = false;		
	}
	
}
