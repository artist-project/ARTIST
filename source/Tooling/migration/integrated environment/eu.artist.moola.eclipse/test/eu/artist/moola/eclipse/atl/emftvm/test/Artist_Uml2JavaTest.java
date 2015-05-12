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
package eu.artist.moola.eclipse.atl.emftvm.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.junit.Test;


public class Artist_Uml2JavaTest {

	@Test
	public void test() throws IOException {
		System.out.println("isn leicht");
		run();
	}
	
	public void run() throws IOException {
		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();

		ResourceSet rs = new ResourceSetImpl();
		
		// Load metamodels
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(rs.getResource(URI.createURI("http://www.eclipse.org/uml2/4.0.0/UML"), true));
		env.registerMetaModel("UMLMM", metaModel);

		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI("platform:/plugin/eu.artist.migration.umlprofilestore/umlprofiles/objectify_profile.profile.uml", true), true));
		System.out.println("Model is: " + inModel);
		env.registerInputModel("OBJECTIFY", inModel);

		Model inOutModel = EmftvmFactory.eINSTANCE.createModel();
		inOutModel.setResource(rs.getResource(URI.createURI("test/resources/artist/model/petstore_domain_objectified.uml", true), true));
		env.registerInOutModel("UMLM", inOutModel);

		// Load and run module
		ResourceSet moduleRS = new ResourceSetImpl();
		moduleRS.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		DefaultModuleResolver mr = new DefaultModuleResolver("test/resources/artist/trafo/", rs);
		mr.resolveModule("DomainModelObjectificationDAO");
		
		TimingData td = new TimingData();
		env.loadModule(mr, "DomainModelObjectificationDAO");
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		FileOutputStream x = new FileOutputStream(new File("test/resources/artist/model/petstore_domain_objectified_dao.uml"));
		inOutModel.getResource().save(x, Collections.emptyMap());
		//outModel.getResource().save(Collections.emptyMap());
	}

}
