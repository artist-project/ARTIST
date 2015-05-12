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

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.junit.Test;

import eu.artist.moola.emf.atl.Direction;
import eu.artist.moola.emf.atl.GenericATLRunner;
import eu.artist.moola.emf.atl.ModelConfig;
import eu.artist.moola.emf.atl.RunConfiguration;

public class JavaSource2TableTest {

	@Test
	public void test() throws FileNotFoundException, ATLCoreException {
		RunConfiguration config = new RunConfiguration();
		config.setTransformation("test/resources/JavaSource2Table/JavaSource2Table.asm");
		//config.setRefinement(true);
		
		//test/resources/JavaSource2Table

		ModelConfig m1 = new ModelConfig();
		m1.setAlias("IN");
		m1.setName("JavaSource");
		m1.setDirection(Direction.In);
		m1.setMetaModel("test/resources/JavaSource2Table/JavaSource.ecore");
		m1.setModel("test/resources/JavaSource2Table/javasource-example.xmi");
		config.getModelConfigs().add(m1);
		
		ModelConfig m2 = new ModelConfig();
		m2.setAlias("OUT");
		m2.setName("Table");
		m2.setDirection(Direction.Out);
		m2.setMetaModel("test/resources/JavaSource2Table/Table.ecore");
		m2.setModel("test/resources/JavaSource2Table/table-example.xmi");
		m2.setTarget("test/resources/JavaSource2Table/table-example.xmi");
		config.getModelConfigs().add(m2);

		GenericATLRunner runner = new GenericATLRunner(config);
		runner.transform();
	}

}
