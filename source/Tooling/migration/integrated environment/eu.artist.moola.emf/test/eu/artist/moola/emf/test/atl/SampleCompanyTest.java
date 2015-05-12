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
package eu.artist.moola.emf.test.atl;

import java.io.FileNotFoundException;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.junit.Test;

import eu.artist.moola.emf.atl.Direction;
import eu.artist.moola.emf.atl.GenericATLRunner;
import eu.artist.moola.emf.atl.ModelConfig;
import eu.artist.moola.emf.atl.RunConfiguration;

public class SampleCompanyTest {

	@Test
	public void generateJavaXMI() throws FileNotFoundException,
			ATLCoreException {
		RunConfiguration config = new RunConfiguration();
		config.setTransformation("test/resources/Transformations/Cut.asm");
		config.setRefinement(true);

		ModelConfig m1 = new ModelConfig();
		m1.setAlias("IN");
		m1.setName("Company");
		m1.setDirection(Direction.InOut);
		m1.setMetaModel("test/resources/Metamodels/Company.ecore");
		m1.setModel("test/resources/Models/sampleCompany.xmi");
		m1.setTarget("test/resources/build/Java/sampleCompany_Cut.xmi");
		config.getModelConfigs().add(m1);

		GenericATLRunner runner = new GenericATLRunner(config);
		runner.transform();
	}

}
