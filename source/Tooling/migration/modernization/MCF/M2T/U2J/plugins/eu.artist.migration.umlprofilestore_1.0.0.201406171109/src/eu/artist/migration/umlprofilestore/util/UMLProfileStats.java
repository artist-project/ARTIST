/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
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
package eu.artist.migration.umlprofilestore.util;
import java.io.File;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;


public class UMLProfileStats {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int numStereotypes = 0;
		int tempNumStereotypes = 0;
		int numExtensions = 0;
		int numProperties = 0;
		int numProfiles = 0;
		
		File directory = new File("../eu.artist.migration.umlprofilestore/umlprofiles");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		UMLPackage.eINSTANCE.eClass();
		
		for(File umlProfile : directory.listFiles()) {
			
			tempNumStereotypes = 0;
			
			if(umlProfile.getName().endsWith(UMLResource.FILE_EXTENSION)) {
				numProfiles++;
				
				Resource resource = resourceSet.getResource(URI.createFileURI(umlProfile.getAbsolutePath()), true);
				
				EcoreUtil.resolveAll(resource);
				
				TreeIterator<EObject> contentsIter = resource.getAllContents();
				while(contentsIter.hasNext()) {
					EObject eObj = contentsIter.next();
					
					if(eObj instanceof Stereotype) {
						numStereotypes++;
						tempNumStereotypes++;
						Stereotype stereotype = (Stereotype) eObj;
						
						for(Property property : stereotype.getAttributes()) {
						// property ... the convention is that all extensions start with base_
							if(!property.getName().startsWith("base_")) {
								numProperties++;
							}
							// extension
							else {
								numExtensions++;
							}
						}
					}
				}
			}
			
			System.out.println(umlProfile.getName() + "# stereotypes:" + tempNumStereotypes);
		}
		
		System.out.println("Total UMLProfiles: " + numProfiles + " total stereotypes: " + numStereotypes
				 + " total extensions: " + numExtensions + " total properties: " + numProperties);
	}

}
