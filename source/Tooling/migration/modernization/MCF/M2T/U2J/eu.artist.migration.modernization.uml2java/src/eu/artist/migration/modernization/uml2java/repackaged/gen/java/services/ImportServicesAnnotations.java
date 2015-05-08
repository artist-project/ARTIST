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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Service class to import libraries for annotations.
 * 
 * @author <a href="mailto:bergmayr@big.tuwien.ac.at">Alexander Bergmayr</a>
 */
public class ImportServicesAnnotations extends ImportServices {

	Set<String> importedTypes;

	@Override
	public String reqImport(Classifier aClassifier) {
		importedTypes = new HashSet<String>();

		// applied stereotypes to classifier
		stereotypeImports(aClassifier);

		// applied stereotypes to features
		for (Feature aFeature : aClassifier.getFeatures()) {
			stereotypeImports(aFeature);
		}

		// applied stereotypes to operations
		for (Operation aOperation : aClassifier.getOperations()) {
			stereotypeImports(aOperation);

			for (Parameter aParameter : aOperation.getOwnedParameters()) {
				stereotypeImports(aParameter);
			}
		}

		// System.out.println("ImportedTypes: " + importedTypes);

		StringBuilder builder = new StringBuilder();
		for (String importStatement : importedTypes) {
			builder.append(importStatement);
		}

		return builder.toString();
	}

	@SuppressWarnings("unchecked")
	public void stereotypeImports(Element aElement) {
		for (Stereotype appliedStereotype : aElement.getAppliedStereotypes()) {
			importedTypes.add(convertQualifiedName(appliedStereotype.getQualifiedName()));

			// we do also have to traverse the stereotype property for types
			// which require import statements
			for (Property aProperty : appliedStereotype.getAllAttributes()) {
				Object value = aElement.getValue(appliedStereotype, aProperty.getName());

				// we are only interested in properties that have a value and do
				// not refer to the metaclass extended by the stereotype
				if (!(value == null || value == aElement)) {
					// multi-valued property
					if (aProperty.isMultivalued()) {

						for (Object obj : (EList<Object>)value) {
							checkInnerStereotypes(obj);
						}
					}

					// single-valued property
					else {
						checkInnerStereotypes(value);
					}
				}
			}
		}
	}

	public void stereotypeImports(EObject eObj) {
		for (EStructuralFeature feature : eObj.eClass().getEAllStructuralFeatures()) {
			// base_: refers to an extension end
			// value_: refers to an association end
			if (!(feature.getName().startsWith("base_") || feature.getName().startsWith("value_") || eObj
					.eGet(feature) == null)) {
				if (feature.isMany()) {

				}

				else {
					checkInnerStereotypes(eObj.eGet(feature));
				}
			}

		}
	}

	public String convertQualifiedName(String qualifiedName) {
		StringBuilder javaQualifiedName = new StringBuilder();

		// prepare import statement
		javaQualifiedName.append(IMPORT);
		qualifiedName = qualifiedName.substring(qualifiedName.indexOf("::") + 2);
		qualifiedName = qualifiedName.replaceAll("::", ".");
		javaQualifiedName.append(qualifiedName);
		javaQualifiedName.append(END_IMPORT);

		return javaQualifiedName.toString();
	}

	public void checkInnerStereotypes(Object value) {
		if (isStereotype(value)) {
			importedTypes.add(getQualifiedName((EObject)value));
			stereotypeImports((EObject)value);
		}

		else if (value instanceof EnumerationLiteral) {
			EnumerationLiteral aLiteral = (EnumerationLiteral)value;
			Enumeration aEnumeration = aLiteral.getEnumeration();
			importedTypes.add(convertQualifiedName(aEnumeration.getQualifiedName()));
		}
	}

	public boolean isStereotype(Object value) {
		return value instanceof EObjectImpl;
	}

	public String getQualifiedName(EObject eObj) {
		return IMPORT
				+ eObj.eClass().getEPackage().getNsPrefix().substring(
						eObj.eClass().getEPackage().getNsPrefix().indexOf(".") + 1) + "."
				+ eObj.eClass().getName() + END_IMPORT;
	}
}
