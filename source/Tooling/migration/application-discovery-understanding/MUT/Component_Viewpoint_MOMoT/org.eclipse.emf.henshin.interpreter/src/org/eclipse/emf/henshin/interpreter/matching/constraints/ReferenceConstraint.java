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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * This constraint checks whether the value of an EReference contains 
 * objects from the target domain.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public class ReferenceConstraint implements BinaryConstraint {
	
	// Target variable:
	final Variable targetVariable;
	
	// Reference:
	final EReference reference;
	
	// Index (either a constant or a parameter name):
	final Object index;

	// Whether the index is a constant or a parameter name:
	final boolean isConstantIndex;
	
	/**
	 * Default constructor.
	 * @param target Target variable.
	 * @param reference Reference.
	 * @param index Either a constant index (can be <code>null</code>) or a parameter name.
	 * @param isConstantIndex Whether the index a constant or a parameter name.
	 */
	public ReferenceConstraint(Variable target, EReference reference, Object index, boolean isConstantIndex) {
		this.targetVariable = target;
		this.reference = reference;
		this.index = index;
		this.isConstantIndex = isConstantIndex;
	}
	
	/**
	 * Convenience constructor.
	 * @param target Target variable.
	 * @param reference Reference.
	 */
	public ReferenceConstraint(Variable target, EReference reference) {
		this(target, reference, null, true);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.constraints.BinaryConstraint#check(org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot, org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public boolean check(DomainSlot source, DomainSlot target) {

		// Source variable must be locked:
		if (!source.locked) {
			return false;
		}

		// Get the target objects:
		List<EObject> targetObjects;
		if (reference.isMany()) {
			targetObjects = (List<EObject>) source.value.eGet(reference);
			
			// it is a map, so lets try if we have a key to use
			if (targetObjects instanceof EMap && targetVariable.typeConstraint != null && targetVariable.typeConstraint.type!= null) 
			{
				@SuppressWarnings("rawtypes")
				EMap map = (EMap) targetObjects;
				
				EAttribute keyAttribute = (EAttribute) targetVariable.typeConstraint.type.getEStructuralFeature("key");

				for (AttributeConstraint attributeConstraint : targetVariable.attributeConstraints) {
					if (keyAttribute == attributeConstraint.attribute)
					{
						Object to = null;
						try{
							if (attributeConstraint.isConstantValue)
							{
								to = getEntryFromMap(map,  attributeConstraint.value);
							} else {
								String paramName = (String) attributeConstraint.value;
								if (source.conditionHandler.isSet(paramName)) {
									Object paramValue = source.conditionHandler.getParameter(paramName);
									to = getEntryFromMap(map, paramValue);
								} //if not set, we simply fall back to the existing code to restrict the values of the domainslot 
							}
							targetObjects = Collections.singletonList((EObject) to);

						} catch (Exception ex){/* fail silently and simply use the complete targetObjects list */ }				
						break; // there will be only one "key" attribute constraint, thus we break the loop here.
					}
				}
			}
			
			if (targetObjects.isEmpty()) {
				return false;
			}
		} else {
			EObject obj = (EObject) source.value.eGet(reference);
			if (obj==null) {
				return false;
			}
			targetObjects = Collections.singletonList(obj);
		}

		// Calculate the index:
		Integer calculatedIndex = null;
		if (isConstantIndex) {
			calculatedIndex = (index!=null) ? ((Number) index).intValue() : null;
		} else {
			String parameterName = (String) index;
			if (source.conditionHandler.isSet(parameterName)) {
				calculatedIndex = ((Number) source.conditionHandler.getParameter(parameterName)).intValue();
			}
		}

		// Take care of negative indices:
		if (calculatedIndex!=null && calculatedIndex<0) {
			calculatedIndex = targetObjects.size() + calculatedIndex;
		}

		// Target domain slot locked?
		if (target.locked) {
			
			// Check if the parameter value still needs to be set:
			if (!isConstantIndex && !source.conditionHandler.isSet((String) index)) {
				
				// Try to initialize the parameter with real index. Might fail due to attribute conditions.
				calculatedIndex = targetObjects.indexOf(target.value);
				if (target.conditionHandler.setParameter((String) index, calculatedIndex)) {
					target.initializedParameters.add((String) index);
					return true;
				} else {
					target.conditionHandler.unsetParameter((String) index);
					return false;
				}
				
			} else {

				// Check if the reference constraint if fulfilled:
				return (calculatedIndex!=null) ?
						targetObjects.indexOf(target.value)==calculatedIndex :
						targetObjects.contains(target.value);
			}
			
		} else {
			
			// Target not locked yet. Create a domain change to restrict the target domain:
			DomainChange change = new DomainChange(target, target.temporaryDomain);
			source.remoteChangeMap.put(this, change);
			
			// Calculated temporary domain:
			if (calculatedIndex!=null) {
				if (calculatedIndex>=0 && calculatedIndex<targetObjects.size()) {
					target.temporaryDomain = Collections.singletonList(targetObjects.get(calculatedIndex));
				} else {
					target.temporaryDomain = Collections.emptyList();
				}
			} else {
				target.temporaryDomain = new ArrayList<EObject>(targetObjects);
			}
			if (change.originalValues!=null) {
				target.temporaryDomain.retainAll(change.originalValues);
			}
			
			// Temporary domain must not be empty:
			return !target.temporaryDomain.isEmpty();
			
		}

	}

	/*
	 * This method resembles the code in V BasicEMap::get(Object key) in order to get the entry (not only the value) from the map.
	 * Unfortunately, the public interface does not allow getting the entry. However, we need the entry to properly use the 
	 * ReferenceConstaint to filter the targetObjects (which is a set of entries). Thus, we revert back to reflection to call the
	 * protected methods directly which are used in the V BasicEMap::get(Object key) method.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Entry getEntryFromMap(EMap map, Object paramValue)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		
		Class mapClass = map.getClass();
		
		// we need to get the BasicEMap class since it contains the protected methods
		while (mapClass != null && !mapClass.equals(BasicEMap.class))
			{
				mapClass = mapClass.getSuperclass();
			}

		if (mapClass == null) throw new NoSuchMethodException("Map class does not subclass from BasicEMap which is required to call hashOf, indexOf and entryForKey methods");

		//       ensureEntryDataExists();

		Method ensureEntryDataExists = mapClass.getDeclaredMethod("ensureEntryDataExists");
		ensureEntryDataExists.setAccessible(true);
		ensureEntryDataExists.invoke(map);

		//       int hash = hashOf(key);

		Method hashOf = mapClass.getDeclaredMethod("hashOf", Object.class);
		hashOf.setAccessible(true);
		int hash = (Integer) hashOf.invoke(map, paramValue);

		//       int index = indexOf(hash);

		Method indexOf = mapClass.getDeclaredMethod("indexOf", int.class);
		indexOf.setAccessible(true);
		int index = (Integer) indexOf.invoke(map, hash);

		//      Entry<K, V> entry = entryForKey(index, hash, key);

		Method entryForKey = mapClass.getDeclaredMethod("entryForKey", int.class, int.class, Object.class);
		entryForKey.setAccessible(true);
		Entry entry = (Entry) entryForKey.invoke(map, index, hash, paramValue);

		return entry;
	}
	
}