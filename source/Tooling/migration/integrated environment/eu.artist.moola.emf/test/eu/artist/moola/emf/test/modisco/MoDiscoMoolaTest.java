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
package eu.artist.moola.emf.test.modisco;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import eu.artist.moola.Launcher;
import eu.artist.moola.emf.test.AbstractEmfTest;

public class MoDiscoMoolaTest
	extends AbstractEmfTest {
	
	@Test
	public void test() throws CoreException {
		Launcher launcher = new Launcher("test/resources/MoDisco/modisco_simple.moola");
		launcher.run();
	}
	
}
