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
package eu.artist.moola.test;

import org.junit.Test;

import eu.artist.moola.Launcher;

public class LauncherSimpleTest {

	@Test
	public void test() {
		String simpleMoolaFilePath = "test/resources/simple.moola";
		//String simpleMoolaFilePath = "test/resources/chain.moola";
		//String simpleMoolaFilePath = "test/resources/conditional.moola";
		//String simpleMoolaFilePath = "test/resources/iterational.moola";
		Launcher launcher = new Launcher(simpleMoolaFilePath);
		launcher.run();
	}

}
