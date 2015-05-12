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
package eu.artist.moola.emf.acceleo.test;

import org.junit.Test;

import eu.artist.moola.Launcher;
import eu.artist.moola.TransformationRegistry;
import eu.artist.moola.emf.acceleo.AcceleoTransformation;
import eu.artist.moola.emf.atl.emftvm.AtlEmftvmTransformation;
import eu.artist.moola.emf.modisco.MoDiscoTransformation;

public class MoolaTest {

	@Test
	public void test() {

		String moolaFilePath = "test/resources/artist.moola";
		
		try {

			TransformationRegistry.register("MoDisco", MoDiscoTransformation.class);
			TransformationRegistry.register("Acceleo", AcceleoTransformation.class);
			TransformationRegistry.register("ATL/EMFTVM", AtlEmftvmTransformation.class);
			
			Launcher launcher = new Launcher(moolaFilePath);
			launcher.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
