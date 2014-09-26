/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.dbml2uml.client;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

public abstract class AbstractUMLBuilder {

	public static boolean DEBUG = true;

	protected ResourceSet RESOURCE_SET = new ResourceSetImpl();

	protected void out(String output) {

		if (DEBUG) {
			System.out.println(output);
		}
	}

	protected void err(String error) {
		System.err.println(error);
	}

	public void registerResourceFactories() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
	}

	public void registerPathmaps(URI uri) {
		URIConverter.URI_MAP.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),
			uri.appendSegment("libraries").appendSegment(""));

		URIConverter.URI_MAP.put(URI.createURI(UMLResource.METAMODELS_PATHMAP),
			uri.appendSegment("metamodels").appendSegment(""));

		URIConverter.URI_MAP.put(URI.createURI(UMLResource.PROFILES_PATHMAP),
			uri.appendSegment("profiles").appendSegment(""));
	}

	public void save(org.eclipse.uml2.uml.Package package_, URI uri) {
		Resource resource = RESOURCE_SET.createResource(uri);
		EList<EObject> contents = resource.getContents();

		contents.add(package_);

		for (TreeIterator<Object> allContents = UMLUtil.getAllContents(package_, true,
			false); allContents.hasNext();) {

			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof Element) {
				contents
					.addAll(((Element) eObject).getStereotypeApplications());
			}
		}

		try {
			resource.save(null);

			out("Done.");
		} catch (IOException ioe) {
			err(ioe.getMessage());
		}
	}

	public org.eclipse.uml2.uml.Package load(URI uri) {
		org.eclipse.uml2.uml.Package package_ = null;

		try {
			Resource resource = RESOURCE_SET.getResource(uri, true);

			package_ = (org.eclipse.uml2.uml.Package) EcoreUtil
				.getObjectByType(resource.getContents(),
					UMLPackage.Literals.PACKAGE);
		} catch (WrappedException we) {
			err(we.getMessage());
			System.exit(1);
		}

		return package_;
	}

}
