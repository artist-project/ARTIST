/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Element;

/**
 * Represents the input of a UML2 to fUML conversion and obtains its elements to
 * be converted.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class UML2Input {

	private Object originalInput;
	private Collection<EObject> eObjectsToConvert;
	private Collection<Activity> allActivities;

	public UML2Input(Object input) {
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

	public boolean containsActivities() {
		return !getAllActivites().isEmpty();
	}

	public Collection<Element> getElementsToConvert() {
		Collection<Element> elementsToConvert = new HashSet<Element>();
		for (EObject eObjectToConvert : eObjectsToConvert) {
			if (eObjectToConvert instanceof Element) {
				elementsToConvert.add((Element) eObjectToConvert);
			}
		}
		return elementsToConvert;
	}

	public Collection<Activity> getMainActivities() {
		Collection<Activity> mainActivities = new HashSet<Activity>();
		if (originalInput instanceof Activity) {
			mainActivities.add((Activity) originalInput);
		} else {
			mainActivities.addAll(getAllActivites());
		}
		return mainActivities;
	}

	private Collection<Activity> getAllActivites() {
		if (allActivities == null) {
			allActivities = new HashSet<Activity>();
			for (EObject eObject : eObjectsToConvert) {
				if (isActivity(eObject)) {
					allActivities.add((Activity) eObject);
				}
				allActivities.addAll(getContainedActivities(eObject));
			}
		}
		return allActivities;
	}

	private boolean isActivity(EObject eObject) {
		return eObject instanceof Activity;
	}

	private Collection<Activity> getContainedActivities(EObject eObject) {
		Collection<Activity> containedActivities = new HashSet<Activity>();
		for (TreeIterator<EObject> contents = eObject.eAllContents(); contents
				.hasNext();) {
			EObject child = contents.next();
			if (isActivity(child)) {
				containedActivities.add((Activity) child);
			}
		}
		return containedActivities;
	}

	public boolean containsBehavior() {
		for (EObject eObject : eObjectsToConvert)
			if (isBehavior(eObject)) 
				return true;
			else if(containsBehavior(eObject))
					return true;
		return false;
	}
	
	private boolean containsBehavior(EObject eObject) {
		for(TreeIterator<EObject> eObjectAllContents = eObject.eAllContents();eObjectAllContents.hasNext();) {
			EObject eObjectContained = eObjectAllContents.next();
			if(isBehavior(eObjectContained))
				return true;
			else if(containsBehavior(eObjectContained))
				return true;
		}
		return false;
	}
	
	private boolean isBehavior(EObject eObject) {
		return eObject instanceof org.eclipse.uml2.uml.Behavior;
	}

}
