/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;

/**
 * Default implementation of a map that associates {@link EObject}s with {@link Integer}s.
 * 
 * @author Christian Krause
 */
public class EObjectIntegerMapImpl extends EcoreEMap<EObject,Integer> {

	// Generated serial ID:
	private static final long serialVersionUID = 731163102737038198L;
	
	// Static zero integer object:
	private static final Integer ZERO = new Integer(0);

	/**
	 * Default constructor.
	 * @param entryEClass Entry eclass.
	 * @param entryClass  Entry class.
	 * @param owner Owner of the map. 
	 * @param featureID Feature ID.
	 */
	public EObjectIntegerMapImpl(
			EClass entryEClass, 
			Class<?> entryClass,
			InternalEObject owner, 
			int featureID) {
		super(entryEClass, entryClass, owner, featureID);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.util.BasicEMap#get(java.lang.Object)
	 */
	@Override
	public Integer get(Object object) {
		Integer key = super.get(object);
		return (key!=null) ? key : ZERO;
	}
	
}
