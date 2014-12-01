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

package eu.artist.migration.modernization.uml2services.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.artist.migration.modernization.uml2services.main.Uml2services;

public class Uml2ServicesTest {
	
	private String modelPath;
	 
	 /**
	  * @throws java.lang.Exception
	  */
	 @Before
	 public void setUp() throws Exception {
	  modelPath = "model/export.uml";
	 }

	 /**
	  * @throws java.lang.Exception
	  */
	 @After
	 public void tearDown() throws Exception {
	 }

	 @Test
	 public void test() throws IOException {
	  URI modelURI = URI.createFileURI(modelPath);
	  File folder = new File("../eu.artist.migration.modernization.uml2services/gen");
	  
	  Uml2services generator = new Uml2services(modelURI, folder, new ArrayList<String>());
	  generator.doGenerate(new BasicMonitor());
	  System.out.print("Code Generation Finished!");
	 }
}
