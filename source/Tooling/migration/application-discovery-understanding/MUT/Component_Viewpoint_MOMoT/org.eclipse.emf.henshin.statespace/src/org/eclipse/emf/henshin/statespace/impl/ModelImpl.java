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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;
import org.eclipse.emf.henshin.statespace.util.ObjectKeyHelper;

/**
 * Default implementation of {@link Model}.
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	
	/**
	 * Constructor.
	 * @param resource Resource for this model.
	 * @generated NOT
	 */
	public ModelImpl(Resource resource) {
		this.resource = resource;
	}

	/**
	 * Constructor.
	 * @param resource Resource for this model.
	 * @param emfGraph EmfGraph for this model.
	 * @generated NOT
	 */
	public ModelImpl(Resource resource, EGraph eGraph) {
		this.resource = resource;
		this.eGraph = eGraph;
	}

	/**
	 * @generated NOT
	 */
	public EGraph getEGraph() {
		if (eGraph==null) {
			eGraph = new EGraphImpl();
			for (EObject root : resource.getContents()) {
				eGraph.addTree(root);
			}
		}
		return eGraph;
	}

	/**
	 * @generated NOT
	 */
	public EMap<EObject, Integer> getObjectHashCodes() {
		if (objectHashCodes == null) {
			objectHashCodes = new EObjectIntegerMapImpl(StateSpacePackage.Literals.EOBJECT_INTEGER_MAP_ENTRY, EObjectIntegerMapEntryImpl.class, this, StateSpacePackage.MODEL__OBJECT_HASH_CODES);
		}
		return objectHashCodes;
	}

	/**
	 * @generated NOT
	 */
	public EMap<EObject, Integer> getObjectKeysMap() {
		if (objectKeysMap == null) {
			objectKeysMap = new EObjectIntegerMapImpl(StateSpacePackage.Literals.EOBJECT_INTEGER_MAP_ENTRY, EObjectIntegerMapEntryImpl.class, this, StateSpacePackage.MODEL__OBJECT_KEYS_MAP);
		}
		return objectKeysMap;
	}

	/**
	 * Get a copy of this model.
	 * @generated NOT
	 */
	public Model getCopy(Match match) {

		// Copy the resource.
		Resource copiedResource = new ResourceImpl();
		Copier copier = new Copier();
		copiedResource.getContents()
				.addAll(copier.copyAll(resource.getContents()));
		copier.copyReferences();

		// Copy the match.
		if (match != null) {
			updateMatch(match, copier);
		}
		
		// Copy the graph:
		EGraph copiedGraph = null;
		if (eGraph!=null) {
			copiedGraph = eGraph.copy(copier);
		}
		
		// Now create a new model.
		ModelImpl copy = new ModelImpl(copiedResource, copiedGraph);

		// Copy the object keys and hash codes.
		if (objectKeysMap != null) {
			TreeIterator<EObject> iterator = resource.getAllContents();
			while (iterator.hasNext()) {
				EObject object = iterator.next();
				copy.getObjectKeysMap().put(copier.get(object),
						objectKeysMap.get(object));
			}
		}
		if (objectHashCodes != null) {
			TreeIterator<EObject> iterator = resource.getAllContents();
			while (iterator.hasNext()) {
				EObject object = iterator.next();
				copy.getObjectHashCodes().put(copier.get(object),
						objectHashCodes.get(object));
			}
		}
		
		// Done.
		return copy;

	}

	/*
	 * Helper method for updating a match when copying a model.
	 */
	private void updateMatch(Match match, Copier copier) {
		for (Node node : match.getRule().getLhs().getNodes()) {
			EObject newImage = copier.get(match.getNodeTarget(node));
			match.setNodeTarget(node, newImage);
		}
		for (Rule rule : match.getRule().getMultiRules()) {
			for (Match nested : match.getMultiMatches(rule)) {
				updateMatch(nested, copier);
			}
		}
	}
	
	/**
	 * @generated NOT
	 */
	public boolean updateObjectKeys(EList<EClass> identityTypes) {

		// Make sure the object keys map is not null.
		getObjectKeysMap();
		
		// Remember whether there was a change:
		boolean changed = false;

		// Get the next free object Id:
		byte[] usedIds = getUsedIds();
		int nextId = 0;
		
		// Now set the keys for new objects:
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
				
			// Get the current Id:
			int currentId = ObjectKeyHelper.getObjectID(objectKeysMap.get(object));
			
			// Check if we need to create or change the key:
			if (currentId==0 && identityTypes.contains(object.eClass())) {
				
				// Get the next free Id:
				do {
					nextId++;
				} while (nextId<usedIds.length && usedIds[nextId]!=0);
				
				//System.out.println("Creating object id " + nextFreeId + " for object of type " + object.eClass().getName());
				int objectKey = ObjectKeyHelper.createObjectKey(object.eClass(), nextId, identityTypes);
				objectKeysMap.put(object, objectKey);
				changed = true;
			
			} else if (currentId!=0 && !identityTypes.contains(object.eClass())) {
				//System.out.println("Removing illegal object id for object of type " + object.eClass().getName());
				objectKeysMap.remove(object);
				changed = true;
			}
			
		}
		
		// Done.
		return changed;
		
	}
	
	/*
	 * Get the next free object Id.
	 */
/*	private int getNextFreeId() {
		
		// Make sure the keys map is not null.
		getObjectKeysMap();
		
		// Compute the next free object Id.
		int nextFreeId = 1;
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			int id = ObjectKeyHelper.getObjectID(objectKeysMap.get(iterator.next()));
			if (id>=nextFreeId) {
				nextFreeId = id+1;
			}
		}
		
		// Done.
		return nextFreeId;
		
	}
*/

	/*
	 * Get the used object Ids.
	 */
	private byte[] getUsedIds() {
		
		// Get the object keys as an array:
		int[] values = getObjectKeys();
		
		// Get the ids and the maximum id:
		int maxId = 0;
		for (int i=0; i<values.length; i++) {
			values[i] = ObjectKeyHelper.getObjectID(values[i]);
			if (values[i]>maxId) maxId = values[i];
		}
		
		// Create the used Ids array and mark the used Ids:
		byte[] used = new byte[maxId+1];
		for (int i=0; i<values.length; i++) {
			used[values[i]] = 1;
		}
				
		// Done.
		return used;
		
	}

	/**
	 * @generated NOT
	 */
	public void collectMissingRootObjects() {
		if (eGraph!=null) {
			for (EObject root : eGraph.getRoots()) {
				if (!resource.getContents().contains(root)) {
					System.out.println("Warning: collected missing root object");
					resource.getContents().add(root);
				}
			}
		}
	}

	/**
	 * @generated NOT
	 */
	public int[] getObjectKeys() {

		// Make sure the object keys map is not null.
		getObjectKeysMap();

		// Copy the map contents to an integer array:
		List<Integer> objectKeys = new ArrayList<Integer>(24);
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			objectKeys.add(objectKeysMap.get(iterator.next()));
		}
		int size = objectKeys.size();
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = objectKeys.get(i);
		}
		return result;

	}

	/**
	 * @generated NOT
	 */
	public void setObjectKeys(int[] objectKeys) {

		// Make sure the object keys map is not null and empty it.
		getObjectKeysMap().clear();
		
		// Copy the map contents of the integer array to the map:
		TreeIterator<EObject> iterator = resource.getAllContents();
		int index = 0;
		while (iterator.hasNext() && index<objectKeys.length) {
			EObject object = iterator.next();
			int key = objectKeys[index++];
			//System.out.println("Setting object id " + ObjectKeyHelper.getObjectID(key) + " for object of type " + object.eClass().getName());
			objectKeysMap.put(object, key);
		}

	}

	/**
	 * @generated NOT
	 */
	public int getObjectCount() {
		if (eGraph==null) {
			getEGraph();
		}
		return eGraph.size();
	}

	/*
	 * ----------------------------------------------------------------------- *
	 * GENERATED CODE. Do not edit below this line. If you need to edit, move  *
	 * it above this line and change the '@generated'-tag to '@generated NOT'. *
	 * ----------------------------------------------------------------------- *
	 */

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}'
	 * attribute.
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final Resource RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}'
	 * attribute.
	 * 
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource = RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEGraph() <em>EGraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGraph()
	 * @generated
	 * @ordered
	 */
	protected static final EGraph EGRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEGraph() <em>EGraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGraph()
	 * @generated
	 * @ordered
	 */
	protected EGraph eGraph = EGRAPH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectHashCodes() <em>Object Hash Codes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectHashCodes()
	 * @generated
	 * @ordered
	 */
	protected EMap<EObject, Integer> objectHashCodes;

	/**
	 * The cached value of the '{@link #getObjectKeysMap() <em>Object Keys Map</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObjectKeysMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<EObject, Integer> objectKeysMap;

	/**
	 * The default value of the '{@link #getObjectKeys() <em>Object Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectKeys()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OBJECT_KEYS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjectCount() <em>Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECT_COUNT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateSpacePackage.Literals.MODEL;
	}

	/**
	 * @generated
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateSpacePackage.MODEL__OBJECT_HASH_CODES:
				return ((InternalEList<?>)getObjectHashCodes()).basicRemove(otherEnd, msgs);
			case StateSpacePackage.MODEL__OBJECT_KEYS_MAP:
				return ((InternalEList<?>)getObjectKeysMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateSpacePackage.MODEL__RESOURCE:
				return getResource();
			case StateSpacePackage.MODEL__EGRAPH:
				return getEGraph();
			case StateSpacePackage.MODEL__OBJECT_HASH_CODES:
				if (coreType) return getObjectHashCodes();
				else return getObjectHashCodes().map();
			case StateSpacePackage.MODEL__OBJECT_KEYS_MAP:
				if (coreType) return getObjectKeysMap();
				else return getObjectKeysMap().map();
			case StateSpacePackage.MODEL__OBJECT_KEYS:
				return getObjectKeys();
			case StateSpacePackage.MODEL__OBJECT_COUNT:
				return getObjectCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateSpacePackage.MODEL__OBJECT_HASH_CODES:
				((EStructuralFeature.Setting)getObjectHashCodes()).set(newValue);
				return;
			case StateSpacePackage.MODEL__OBJECT_KEYS_MAP:
				((EStructuralFeature.Setting)getObjectKeysMap()).set(newValue);
				return;
			case StateSpacePackage.MODEL__OBJECT_KEYS:
				setObjectKeys((int[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateSpacePackage.MODEL__OBJECT_HASH_CODES:
				getObjectHashCodes().clear();
				return;
			case StateSpacePackage.MODEL__OBJECT_KEYS_MAP:
				getObjectKeysMap().clear();
				return;
			case StateSpacePackage.MODEL__OBJECT_KEYS:
				setObjectKeys(OBJECT_KEYS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateSpacePackage.MODEL__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
			case StateSpacePackage.MODEL__EGRAPH:
				return EGRAPH_EDEFAULT == null ? eGraph != null : !EGRAPH_EDEFAULT.equals(eGraph);
			case StateSpacePackage.MODEL__OBJECT_HASH_CODES:
				return objectHashCodes != null && !objectHashCodes.isEmpty();
			case StateSpacePackage.MODEL__OBJECT_KEYS_MAP:
				return objectKeysMap != null && !objectKeysMap.isEmpty();
			case StateSpacePackage.MODEL__OBJECT_KEYS:
				return OBJECT_KEYS_EDEFAULT == null ? getObjectKeys() != null : !OBJECT_KEYS_EDEFAULT.equals(getObjectKeys());
			case StateSpacePackage.MODEL__OBJECT_COUNT:
				return getObjectCount() != OBJECT_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resource: ");
		result.append(resource);
		result.append(", eGraph: ");
		result.append(eGraph);
		result.append(')');
		return result.toString();
	}

} // ModelImpl
