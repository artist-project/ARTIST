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
package eu.artist.migration.modernization.uml2java.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.artist.migration.modernization.uml2java.repackaged.gen.java.main.Uml2java;
import eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.UML2JavaConfigurationHolder;
import eu.artist.migration.modernization.uml2java.repackaged.gen.java.utils.IUML2JavaConstants;

/**
 * @author abergmay
 * 
 */
public class UML2JavaTest {
	
	ResourceSet resSet;
	String modelPath;
	String projectName;
	String srcFolder;
	String outFolder;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		resSet = new ResourceSetImpl();
		// Set the values accordingly
		// TODO: Currently, the project is not automatically created
		// "model/petstore_domain_objectified_dao.uml", "model/export_objectified_dao.uml"; 
		modelPath = "model/petstore_domain_objectified_dao.uml";
		// "eu.artist.migration.reference.application", "eu.artist.migrations.usecases.lob"; 
		projectName = "eu.artist.migration.reference.application";
		srcFolder = "src-gen";
		outFolder = "bin";
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		resSet.getPackageRegistry().put(UMLPackage.eINSTANCE.getNsURI(),
				UMLPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		URI modelURI = URI.createFileURI(modelPath);
		File folder = new File("../");
		
		Uml2java generator = new Uml2java(modelURI, folder, new ArrayList<String>());
		UML2JavaConfigurationHolder configurationHolder = new UML2JavaConfigurationHolder();
		configurationHolder.put(IUML2JavaConstants.NOT_ORDERED_UNIQUE_TYPE, "java.util.List");
		configurationHolder.put(IUML2JavaConstants.GENERATE_GETTERS_AND_SETTERS, true);
		
		configurationHolder.put(IUML2JavaConstants.DEFAULT_PROJECT_NAME, projectName);		
		configurationHolder.put(IUML2JavaConstants.SOURCE_FOLDER_PATH, srcFolder);
		configurationHolder.put(IUML2JavaConstants.OUTPUT_FOLDER_PATH, outFolder);
		
		generator.setConfigurationHolder(configurationHolder);
		generator.doGenerate(new BasicMonitor());
		System.out.print("Code Generation Finished!");
	}

}
