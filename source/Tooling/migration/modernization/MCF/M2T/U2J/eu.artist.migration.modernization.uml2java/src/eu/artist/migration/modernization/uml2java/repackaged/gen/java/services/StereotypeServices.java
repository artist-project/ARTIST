/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.modernization.uml2java.repackaged.gen.java.services;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * Service class to add annotations based on applied stereotypes.
 * 
 * @author <a href="mailto:bergmayr@big.tuwien.ac.at">Alexander Bergmayr</a>
 */
public class StereotypeServices {

	@SuppressWarnings("unchecked")
	public String reqAnnotationMember(Element aElement, Stereotype aStereotype) {
		// collection for annotation members
		Map<String, String> annotationMembers = new HashMap<String, String>();

		for (Property aProperty : aStereotype.getAllAttributes()) {
			Object value = aElement.getValue(aStereotype, aProperty.getName());

			// we are only interested in properties that have a value and do
			// not refer to the metaclass extended by the stereotype
			if (!(value == null || value == aElement)) {

				// multi-valued property
				if (aProperty.isMultivalued()) {
					// System.out.println("MultiValued: " + value.getClass());
					// System.out.println("MultiValued: " + value);

					StringBuilder arrayMembers = new StringBuilder();
					for (Object obj : (EList<Object>)value) {
						arrayMembers.append(",");
						arrayMembers.append(getStringRepresentationFromValue(obj));
					}

					arrayMembers.replace(0, 1, "{");
					arrayMembers.append("}");

					annotationMembers.put(aProperty.getName(), arrayMembers.toString());
				}

				// single-valued property
				else {
					annotationMembers.put(aProperty.getName(), getStringRepresentationFromValue(aProperty
							.getType(), value));
				}
			}
		}

		return getAnnotationMemberValue(annotationMembers);
	}

	public String reqAnnotationMember(EObject eObj) {
		// collection for annotation members
		Map<String, String> annotationMembers = new HashMap<String, String>();

		for (EStructuralFeature feature : eObj.eClass().getEAllStructuralFeatures()) {

			// base_: refers to an extension end
			// value_: refers to an association end
			if (!(feature.getName().startsWith("base_") || feature.getName().startsWith("value_") || eObj
					.eGet(feature) == null)) {
				if (feature.isMany()) {

				}

				else {
					annotationMembers.put(feature.getName(), getStringRepresentationFromValue(eObj
							.eGet(feature)));
				}
			}

			// System.out.println("EObject: " + feature.getName() + ": " + eObj.eGet(feature) + " -> Type: "
			// + feature.getEType().getInstanceClassName());
		}

		return getAnnotationMemberValue(annotationMembers);
	}

	/**
	 * @param annotationMembers
	 * @return
	 */
	public String getAnnotationMemberValue(Map<String, String> annotationMembers) {
		StringBuilder annotationMemberValue = new StringBuilder();

		for (String annotationMember : annotationMembers.keySet()) {
			annotationMemberValue.append(',');
			annotationMemberValue.append(annotationMember);
			annotationMemberValue.append(" = ");
			annotationMemberValue.append(annotationMembers.get(annotationMember));
		}

		if (annotationMemberValue.length() > 0) {
			// remove the first comma
			annotationMemberValue.replace(0, 1, "(");
			annotationMemberValue.append(')');
		}

		// System.out.println("MemberValues: " + annotationMemberValue.toString());
		return annotationMemberValue.toString().trim();
	}

	/**
	 * @param type
	 * @param value
	 * @return
	 */
	public String getStringRepresentationFromValue(Object value) {
		String stringValue = "";

		// Primitive Type - String
		if (value instanceof String) {
			stringValue = getJavaStringfromUMLString(value.toString());
		}

		// Primitive Type - Integer
		else if (value instanceof Integer) {
			stringValue = value.toString();
		}

		// Class
		else if (value instanceof Class) {
			stringValue = getJavaClassFromUMLClass((Class)value);
		}

		// Enumeration
		else if (value instanceof Enumeration) {

		}

		// Stereotype
		else if (value instanceof EObject) {
			stringValue = getJavaAnnotationFromStereotype((EObject)value)
					+ reqAnnotationMember((EObject)value);
		}

		return stringValue;
	}

	/**
	 * @param type
	 * @param value
	 * @return
	 */
	public String getStringRepresentationFromValue(Type type, Object value) {
		String stringValue = "";

		// Primitive Type
		if (type.eClass().getClassifierID() == UMLPackage.PRIMITIVE_TYPE) {
			String primitiveType = type.getName();

			// String Type
			if (primitiveType.equals("String")) {
				stringValue = getJavaStringfromUMLString(value.toString());
			}
			// int value
			else if(primitiveType.equals("int") || primitiveType.equals("boolean")) {
				stringValue = value.toString();
			}
		}

		// Enumeration Type
		else if (type.eClass().getClassifierID() == UMLPackage.ENUMERATION) {
			stringValue = getJavaLiteralFromUMLLiteral((EnumerationLiteral)value);
		}

		// Stereotype / Annotation Type
		else if (type.eClass().getClassifierID() == UMLPackage.STEREOTYPE) {

		}

		return stringValue;
	}

	/**
	 * @param value
	 * @return
	 */
	public String getJavaStringfromUMLString(String value) {
		return '"' + value.toString() + '"';
	}

	/**
	 * @param value
	 * @return
	 */
	public String getJavaLiteralFromUMLLiteral(EnumerationLiteral value) {
		return value.getEnumeration().getName() + "." + value.getName();
	}

	/**
	 * @param value
	 * @return
	 */
	public String getJavaClassFromUMLClass(Class value) {
		return value.getName() + ".class";
	}

	public String getJavaAnnotationFromStereotype(EObject stereotype) {
		return "@" + stereotype.eClass().getName();
	}

}
