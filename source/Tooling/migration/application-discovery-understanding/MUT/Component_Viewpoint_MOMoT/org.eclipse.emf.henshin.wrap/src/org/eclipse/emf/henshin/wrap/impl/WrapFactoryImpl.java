/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.henshin.wrap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WrapFactoryImpl extends EFactoryImpl implements WrapFactory {
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WrapFactory init() {
		try {
			WrapFactory theWrapFactory = (WrapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/2013/Henshin/Wrap"); 
			if (theWrapFactory != null) {
				return theWrapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WrapPackage.WOBJECT: return createWObject();
			case WrapPackage.WLINK: return createWLink();
			case WrapPackage.WVALUE: return createWValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WObject createWObject() {
		WObjectImpl wObject = new WObjectImpl();
		return wObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WLink createWLink() {
		WLinkImpl wLink = new WLinkImpl();
		return wLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WValue createWValue() {
		WValueImpl wValue = new WValueImpl();
		return wValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Map<EObject,WObject> createWModel(Collection<EObject> eObjects, boolean activateSync) {
		
		// Linked hash map to make it deterministic: 
		Map<EObject,WObject> map = new LinkedHashMap<EObject,WObject>(); 
		
		// Create the corresponding WObject:
		for (EObject eObject : eObjects) {			
			WObject wObject = new WObjectImpl(false);
			wObject.setEObject(eObject);
			map.put(eObject, wObject);
		}

		// Now handle the members:
		for (EObject eObject : eObjects) {
			WObject wObject = map.get(eObject);

			// Create the WValues:
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.isMany()) {
					EList<Object> eValues = (EList<Object>) eObject.eGet(att);
					for (Object eValue : eValues) {
						WValue wValue = new WValueImpl(false);
						wValue.setEStructuralFeature(att);
						wValue.setEValue(eValue);
						wObject.getWMembers().add(wValue);
					}
				} else {
					Object eValue = eObject.eGet(att);
					if (eValue!=null) {
						WValue wValue = new WValueImpl(false);
						wValue.setEStructuralFeature(att);
						wValue.setEValue(eValue);
						wObject.getWMembers().add(wValue);
					}
				}
			}

			// Create the WLinks:
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (ref.isMany()) {
					EList<EObject> eTargets = (EList<EObject>) eObject.eGet(ref);
					for (EObject eTarget : eTargets) {
						WLink wLink = new WLinkImpl(false);
						wLink.setEStructuralFeature(ref);
						wLink.setWTarget(map.get(eTarget));
						wObject.getWMembers().add(wLink);
					}
				} else {
					EObject eTarget = (EObject) eObject.eGet(ref);
					if (eTarget!=null) {
						WLink wLink = new WLinkImpl(false);
						wLink.setEStructuralFeature(ref);
						wLink.setWTarget(map.get(eTarget));
						wObject.getWMembers().add(wLink);
					}
				}
			}
			
		}

		// Activate synchronization if necessary:
		if (activateSync) {
			for (WObject wObject : map.values()) {
				wObject.setSynchronize(true);
				for (WMember wMember : wObject.getWMembers()) {
					wMember.setSynchronize(true);
				}
			}
		}
			
		// Done.
		return map;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<EObject,WObject> createWModelTree(Collection<EObject> eObjects, boolean activateSync) {
		return createWModel(computeTransitiveClosure(eObjects, false), activateSync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<EObject,WObject> createWModelGraph(Collection<EObject> eObjects, boolean activateSync) {
		return createWModel(computeTransitiveClosure(eObjects, true), activateSync);
	}

	/*
	 * Compute the transitive closure of a set of eObjects.
	 */
	@SuppressWarnings("unchecked")
	private static Collection<EObject> computeTransitiveClosure(Collection<EObject> eObjects, boolean includeNonContainment) {
		
		// First we compute the transitive closure of the EObjects:
		Set<EObject> allEObjects = new LinkedHashSet<EObject>();
		List<EObject> newEObjects = new ArrayList<EObject>(eObjects);
		
		// As long as there are new objects...
		while (!newEObjects.isEmpty()) {
			
			// Copy the new objects to the main set:
			allEObjects.addAll(newEObjects);
			
			// Follow the links of the new objects:
			List<EObject> buffer = new ArrayList<EObject>();
			for (EObject obj : newEObjects) {
				for (EReference ref : includeNonContainment ? 
						obj.eClass().getEAllReferences() : 
						obj.eClass().getEAllContainments()) {
					if (ref.isMany()) {
						EList<EObject> targets = (EList<EObject>) obj.eGet(ref);
						for (EObject target : targets) {
							if (!allEObjects.contains(target)) {
								buffer.add(target);
							}
						}
					} else {
						EObject target = (EObject) obj.eGet(ref);
						if (target!=null && !allEObjects.contains(target)) {
							buffer.add(target);
						}
					}
				}
			}
			
			// Update the new EObjects:
			newEObjects = buffer;
			
		}

		// Done.
		return allEObjects;
				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapPackage getWrapPackage() {
		return (WrapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WrapPackage getPackage() {
		return WrapPackage.eINSTANCE;
	}

} //WrapFactoryImpl
