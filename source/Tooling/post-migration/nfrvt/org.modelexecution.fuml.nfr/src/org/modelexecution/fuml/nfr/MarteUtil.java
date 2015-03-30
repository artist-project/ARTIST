/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;

public class MarteUtil {

	/***
	 * Returns the qualified name for the given Papyrus class (Marte, SoaML).
	 * @param clazz class object
	 * @return qualified name for given class object
	 */
	public static String getQualifiedName(Class<? extends EObject> clazz) {
		return clazz.getName().replace("org.eclipse.papyrus.", "").replace(".", "::");
	}
	
	/***
	 * Retrieves all stereotype applications from the given UML element which 
	 * are instances of the given class object. This also includes sub-classes. 
	 * If no stereotype applications are found, an empty list is returned.
	 * 
	 * @param umlElement
	 * @param clazz
	 * @return list of matching stereotype applications
	 */
	public static <T extends EObject> List<T> getAllStereotypes(Element umlElement, java.lang.Class<T> clazz) {
		List<T> stereotypeApplications = new ArrayList<T>();
		for(EObject stereotypeApplication : umlElement.getStereotypeApplications())
			if(clazz.isInstance(stereotypeApplication))
				stereotypeApplications.add(clazz.cast(stereotypeApplication));
		return stereotypeApplications;
	}
	
	/***
	 * Retrieves the first stereotype applications from the given UML element 
	 * which is an instance of the given class object. This also includes 
	 * sub-classes. If no matching stereotype application is found, null is 
	 * returned.
	 * 
	 * @param umlElement
	 * @param clazz
	 * @return matching stereotype application or null
	 */
	public static <T extends EObject> T getFirstStereotype(Element umlElement, java.lang.Class<T> clazz) {
		if(umlElement == null)
			return null;
		for(EObject stereotypeApplication : umlElement.getStereotypeApplications())
			if(clazz.isInstance(stereotypeApplication))
				return clazz.cast(stereotypeApplication);
		return null;
	}
	
	/***
	 * Retrieves the first stereotype applications from the given UML element which 
	 * are exact instances of the given class object. This does not includes 
	 * sub-classes. If no stereotype applications are found, an empty list is 
	 * returned.
	 * 
	 * @param umlElement
	 * @param clazz
	 * @return matching stereotype application or null
	 */
	public static <T extends EObject> T getExactStereotype(Element umlElement, java.lang.Class<T> clazz) {
		Stereotype appliedStereotype = null;
		String stereotype = getQualifiedName(clazz);
				
		try {
			// this throws an exception the first time it is called?!?! *sigh*
			appliedStereotype = umlElement.getAppliedStereotype(stereotype);
		} catch (Exception e) {
			appliedStereotype = umlElement.getAppliedStereotype(stereotype);
		}
		
		return appliedStereotype != null ? 
				clazz.cast(umlElement.getStereotypeApplication(appliedStereotype)) :
				null;
	}
	
	/***
	 * Retrieves all stereotype applications from the given UML element which 
	 * are exact instances of the given class object. This also includes 
	 * sub-classes. If no stereotype applications are found, an empty list is 
	 * returned.
	 * 
	 * @param rootElement
	 * @param clazz
	 * @return list of matching stereotype applications
	 */
	public static <T extends EObject> List<T> getAllExactStereotypes(Element rootElement, java.lang.Class<T> clazz) {
		List<T> stereotypeApplications = new ArrayList<T>();
		TreeIterator<EObject> iterator = rootElement.eAllContents();
		
		while(iterator.hasNext()) {
			EObject object = iterator.next();
			if(object instanceof Element) {
				T application = getExactStereotype((Element)object, clazz);
				if(application != null)
					stereotypeApplications.add(application);
			}
		}
		return stereotypeApplications;
	}

	/***
	 * Retrieves the first stereotype applications from the given UML element which 
	 * are exact instances of the given class object. This also includes 
	 * sub-classes. If no stereotype applications are found, an empty list is 
	 * returned.
	 * 
	 * @param rootElement
	 * @param clazz
	 * @return list of matching stereotype applications
	 */
	public static <T extends EObject> T getFirstExactStereotypes(Element rootElement, java.lang.Class<T> clazz) {
		TreeIterator<EObject> iterator = rootElement.eAllContents();
		
		while(iterator.hasNext()) {
			EObject object = iterator.next();
			if(object instanceof Element) {
				T application = getExactStereotype((Element)object, clazz);
				if(application != null)
					return application;
			}
		}
		return null;
	}

	
	/***
	 * Searches all children of the given element for a child with the given 
	 * qualified name. If no such child is found, null is returned.
	 * @param rootElement
	 * @param qualifiedName
	 * @return Element with given name or null
	 */
	public static NamedElement findNamedElement(Element rootElement, String qualifiedName) {
		TreeIterator<EObject> modelContents = rootElement.eAllContents();
		while(modelContents.hasNext()) {
			EObject eObject = modelContents.next();			
			if(eObject instanceof NamedElement) {
				NamedElement element = (NamedElement)eObject;
				if(qualifiedName.equals(element.getQualifiedName())) 
					return element;
			}			
		}		
		return null;
	}
	
	/***
	 * This methods applies a stereotype of the given clazz to the given 
	 * umlElement and sets the feature of with featureName to the specified
	 * value. The given value must correspond to the feature type. If present,
	 * old values are overwritten, except when the feature type is EList. 
	 * In that case, a given value is added to the list or all elements of the
	 * given value list are added.
	 *  
	 * @param umlElement
	 * @param stereotypeClazz
	 * @param featureName feature that is set
	 * @param value new value for feature
	 * @return updated stereotype application or null if stereotype is not 
	 * applicable
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T setOrUpdateFeature(NamedElement umlElement, Class<T> stereotypeClazz, String featureName, Object value) {
		T appliedStereotype = MarteUtil.getExactStereotype(umlElement, stereotypeClazz);
		
		if(appliedStereotype == null) {
			// apply stereotype
			Stereotype newStereotype = umlElement.getApplicableStereotype(MarteUtil.getQualifiedName(stereotypeClazz));
			if(newStereotype == null)
				// stereotype is not applicable
				return null;
			umlElement.applyStereotype(newStereotype);
			umlElement.setValue(newStereotype, featureName, value);
		} else {
			Object existingValue = appliedStereotype.eGet(appliedStereotype.eClass().getEStructuralFeature(featureName));
			Object newValue = value;
			if(existingValue instanceof EList) {
				// do not work on existing list as all content will be cleared when trying to set it as feature value
				EList<Object> newValues = new BasicEList<Object>((EList<Object>)existingValue);
				if(value instanceof EList)
					newValues.addAll((EList<Object>) value);
				else
					((EList<Object>)existingValue).add(value);
				newValue = newValues;
			}	
			appliedStereotype.eSet(appliedStereotype.eClass().getEStructuralFeature(featureName), newValue);
		}
		
		return MarteUtil.getExactStereotype(umlElement, stereotypeClazz);
	}
}
