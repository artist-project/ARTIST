/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.emf.test.acceleo;

import org.eclipse.acceleo.engine.internal.utils.AcceleoTraceabilityRegistryListenerUils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import eu.artist.moola.Launcher;
import eu.artist.moola.TransformationRegistry;
import eu.artist.moola.emf.acceleo.AcceleoTransformation;
import eu.artist.moola.emf.atl.AtlTransformation;
import eu.artist.moola.emf.atl.emftvm.AtlEmftvmTransformation;
import eu.artist.moola.emf.modisco.MoDiscoTransformation;
import eu.artist.moola.emf.test.AbstractEmfTest;

public class UMLtoJavaAcceleoTest 
	extends AbstractEmfTest {

	@Test
	public void test() throws CoreException {
		Launcher launcher = new Launcher("test/resources/Acceleo/acceleo_simple.moola");
		launcher.run();
		
		System.out.println("Moola test successful");
	}
	
	
//	@Test
//	public void testWithURI() {
//
//		AcceleoTransformation trafo = new AcceleoTransformation();
//		trafo.project = "Acceleo_UML2Java";
//		trafo.main = "Acceleo_UML2Java.common.Generate";
//		trafo.model = URI.createURI("/Acceleo_UML2Java/resources/Zoo.uml");
//		trafo.target = "/Acceleo_UML2Java/src-gen";
//		trafo.run();
//		
//		/*
//		AcceleoLaunchConfiguration config = new AcceleoLaunchConfiguration();
//		config.setProject("test/resources/UML_to_Java_Acceleo/bin");
//		config.setMainClass("UML_to_Java_Acceleo.common.Generate");
//		config.setModel(URI.createURI("test/resources/UML_to_Java_Acceleo/Zoo.uml"));
//		config.setTarget("test/resources/UML_to_Java_Acceleo/src-gen");
//		
//		AcceleoLauncher launcher = new AcceleoLauncher(config);
//		launcher.run();
//		*/
//	}
	
	@Test
	public void testWithModel() {
		/*
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getNsURI(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
		rs.getPackageRegistry().put(EmftvmPackage.eNS_URI,	EmftvmPackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Map uriMap = rs.getURIConverter().getURIMap();
		URI uri = URI.createURI("jar:file:/C:/Software/eclipse/plugins/org.eclipse.uml2.uml.resources_4.1.0.v20140202-2055.jar!/"); // for example
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
		
		
		Resource r = rs.getResource(URI.createURI("test/resources/UML_to_Java_Acceleo/Zoo.uml"), true);
		EObject content = r.getContents().get(0);
		
		AcceleoLaunchConfiguration config = new AcceleoLaunchConfiguration();
		config.setProject("test/resources/UML_to_Java_Acceleo/bin");
		config.setMainClass("UML_to_Java_Acceleo.common.Generate");
		config.setModel(content);
		config.setTarget("test/resources/UML_to_Java_Acceleo/src-gen-model");
		
		AcceleoLauncher launcher = new AcceleoLauncher(config);
		launcher.run();
		*/
	}

}
