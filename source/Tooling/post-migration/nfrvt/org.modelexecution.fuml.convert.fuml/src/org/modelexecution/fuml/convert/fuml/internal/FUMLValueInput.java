/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 */
package org.modelexecution.fuml.convert.fuml.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelexecution.fuml.Semantics.Classes.Kernel.FeatureValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.Value;
import org.modelexecution.fuml.Semantics.Loci.LociL1.Locus;

public class FUMLValueInput {

	private Object originalInput;
	private Collection<EObject> eObjectsToConvert;
	private Collection<Object> values;

	public FUMLValueInput(Object input) {
		super();
		this.originalInput = input;
		eObjectsToConvert = deriveEObjectsToConvertFromInput();
	}

	public Object getOriginalInput() {
		return originalInput;
	}

	public Collection<EObject> deriveEObjectsToConvertFromInput() {
		if (originalInput instanceof EObject) {
			return getEObjectsToConvertFromEObject((EObject) originalInput);
		} else if (originalInput instanceof Resource) {
			return getEObjectsToConvertFromResource((Resource) originalInput);
		} else {
			return Collections.emptyList();
		}
	}

	private Collection<EObject> getEObjectsToConvertFromEObject(EObject eObject) {
		if (eObject.eResource() != null) {
			return getEObjectsToConvertFromResource(eObject.eResource());
		} else {
			return Arrays.asList((new EObject[] { EcoreUtil.getRootContainer(
					eObject, true) }));
		}
	}

	private Collection<EObject> getEObjectsToConvertFromResource(
			Resource eResource) {
		if (eResource.getResourceSet() != null) {
			return getEObjectsToConvertFromResourceSet(eResource
					.getResourceSet());
		} else {
			return eResource.getContents();
		}
	}

	private Collection<EObject> getEObjectsToConvertFromResourceSet(
			ResourceSet resourceSet) {
		Collection<EObject> eObjectsToConvert = new HashSet<EObject>();
		for (Resource resource : resourceSet.getResources()) {
			eObjectsToConvert.addAll(resource.getContents());
		}
		return eObjectsToConvert;
	}

	public Collection<EObject> getValuesToConvert() {
		Collection<EObject> valuesToConvert = new HashSet<EObject>();
		for (EObject eObjectToConvert : eObjectsToConvert) {
			if (eObjectToConvert instanceof Value || eObjectToConvert instanceof FeatureValue || eObjectToConvert instanceof Locus) {
				valuesToConvert.add(eObjectToConvert);
			}
		}
		return valuesToConvert;
	}

	public boolean containsValues() {
		return !getValues().isEmpty();
	}
	
	private Collection<Object> getValues() {		
		if (values == null) {
			values = new HashSet<Object>();
			for (EObject eObject : eObjectsToConvert) {
				if (isValue(eObject)) {
					values.add((Value) eObject);
				}
				values.addAll(getContainedValues(eObject));
			}
		}
		return values;
	}
	
	private boolean isValue(EObject eObject) {
		return eObject instanceof Value || eObject instanceof FeatureValue;
	}

	private Collection<Object> getContainedValues(EObject eObject) {
		Collection<Object> containedValues = new HashSet<Object>();
		for (TreeIterator<EObject> contents = eObject.eAllContents(); contents
				.hasNext();) {
			EObject child = contents.next();
			if (isValue(child)) {
				containedValues.add(child);
			}
		}
		return containedValues;
	}
}
