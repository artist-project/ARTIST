/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;

/**
 * Transient container for {@link State} models.
 * 
 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	
	/**
	 * Get the resource that contains the actual model elements.
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(Resource)
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getModel_Resource()
	 * @model transient="true"
	 * @generated
	 */
	Resource getResource();
	
	/**
	 * Get the associated {@link EGraph} instance for this model.
	 * @return the value of the '<em>EGraph</em>' attribute.
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getModel_EmfGraph()
	 * @model dataType="org.eclipse.emf.henshin.statespace.EmfGraph" transient="true" changeable="false"
	 * @generated
	 */
	EGraph getEGraph();

	/**
	 * Get the object hash codes of this state model
	 * @return the value of the '<em>Object Hash Codes</em>' map.
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getModel_ObjectHashCodes()
	 * @model mapType="org.eclipse.emf.henshin.statespace.EObjectIntegerMapEntry<org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<EObject, Integer> getObjectHashCodes();

	/**
	 * Get the object keys map for this state model.
	 * @return the value of the '<em>Object Keys</em>' map.
	 * @model mapType="org.eclipse.emf.henshin.statespace.ObjectKey<org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<EObject, Integer> getObjectKeysMap();

	/**
	 * Get the object keys of this state model as an integer array.
	 * This is derived from {@link #getObjectKeysMap()}.
	 * @return the value of the '<em>Object Keys</em>' attribute.
	 * @model dataType="org.eclipse.emf.henshin.statespace.IntegerArray" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int[] getObjectKeys();

	/**
	 * Set the object keys of this state model as an integer array.
	 * This forwards to {@link #getObjectKeysMap()}.
	 * @param objectKeys the new value of the '<em>Object Keys</em>' attribute.
	 * @see #getObjectKeys()
	 * @generated
	 */
	void setObjectKeys(int[] value);

	/**
	 * Get the number of objects in this model.
	 * This is derived from {@link #getEmfGraph()}.
	 * @return the value of the '<em>Object Count</em>' attribute.
	 * @see org.eclipse.emf.henshin.statespace.StateSpacePackage#getModel_ObjectCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getObjectCount();

	/**
	 * Get a copy of this model.
	 * @param Optional match.
	 * @model matchDataType="org.eclipse.emf.henshin.statespace.Match"
	 * @generated
	 */
	Model getCopy(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model identityTypesMany="true"
	 * @generated
	 */
	boolean updateObjectKeys(EList<EClass> identityTypes);

	/**
	 * Collect missing root objects from the {@link EGraphImpl} of this model.
	 * New root objects will be added to this objects resource.
	 * @model
	 * @generated
	 */
	void collectMissingRootObjects();

} // Model
