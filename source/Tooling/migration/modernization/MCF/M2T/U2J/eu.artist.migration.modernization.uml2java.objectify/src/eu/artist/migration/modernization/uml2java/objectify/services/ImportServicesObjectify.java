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
package eu.artist.migration.modernization.uml2java.objectify.services;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;

import eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.ImportServices;

/**
 * Service class to compute the imports of a given classifier.
 * 
 * @author <a href="mailto:stephane.begaudeau@obeo.fr">Stephane Begaudeau</a>
 * @since 2.0
 */
public class ImportServicesObjectify extends ImportServices {

	Set<String> importedTypes;

	@Override
	public String reqImport(Classifier aClassifier) {
		importedTypes = new HashSet<String>();

		// we need mainly to make sure that the Ref Types is
		// imported if required:
		// -> Properties with a complex type
		// -> Multivalued-Properties with a complex type
		for (Property aProperty : aClassifier.getAttributes()) {
			if (!(aProperty.getType() instanceof PrimitiveType)
					&& aProperty.getType().getApplicableStereotype(
							"objectify::com::googlecode::objectify::annotation::Entity") != null) {
				importedTypes.add(IMPORT + "com.googlecode.objectify.Ref" + END_IMPORT);
			}

			if (aProperty.isMultivalued()) {
				importedTypes.add(IMPORT + "java.util.ArrayList" + END_IMPORT);
			}
		}

		StringBuilder builder = new StringBuilder();
		for (String importStatement : importedTypes) {
			builder.append(importStatement);
		}

		return builder.toString();
	}
}
