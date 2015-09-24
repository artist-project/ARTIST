/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * David Madner (TU Wien)
 * Alexander Bergmayr (TU Wien)
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.modernization.uml2java.repackaged.gen.java.services;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;

public class SimpleImportServicesAnnotations extends ImportServices {
	@Override
	public String reqImport(Classifier aClassifier) {
		StringBuilder importedTypes = new StringBuilder();

		Package aPackage = aClassifier.getPackage();
		Set<Package> innerPackages = new HashSet<Package>();
		for (Profile aProfile : aPackage.getAllAppliedProfiles()) {
			for (Element aElement : aProfile.getOwnedElements()) {
				if (aElement.eClass().getClassifierID() == UMLPackage.PACKAGE) {
					Package thePackage = (Package)aElement;
					getInnerPackages(thePackage, innerPackages);
				}
			}
		}

		for (Package innerPackage : innerPackages) {
			importedTypes.append(convertQualifiedName(innerPackage.getQualifiedName()));

		}

		return importedTypes.toString();
	}

	public void getInnerPackages(Package thePackage, Set<Package> innerPackages) {
		for (Element aElement : thePackage.getOwnedElements()) {
			if (aElement instanceof Package) {
				Package aPackage = (Package)aElement;
				innerPackages.add(aPackage);
				getInnerPackages(aPackage, innerPackages);
			}
		}
	}
}
