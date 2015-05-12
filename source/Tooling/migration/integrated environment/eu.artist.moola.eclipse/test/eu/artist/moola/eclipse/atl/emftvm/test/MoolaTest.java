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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

import org.eclipse.acceleo.common.AcceleoServicesRegistry;
import org.eclipse.acceleo.common.internal.utils.AcceleoServicesEclipseUtil;
import org.junit.Test;

import eu.artist.moola.Launcher;

public class MoolaTest {

	@Test
	public void test() {

		String emftvmMoolaFilePath = "test/resources/artist.moola";
		

		try {
			File file = new File("C:/GitRepo/transformation-orchestration/eu.artist.moola.eclipse/libs/eu.artist.migration.modernization.uml2java.jar");
			
		    URL url = file.toURI().toURL();
		    URL[] urls = new URL[]{url};

			URLClassLoader cl = new URLClassLoader(urls, this.getClass().getClassLoader());
			
			Class x = cl.loadClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.UML2JavaConfigurationHolder");
			Class y = cl.loadClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.WorkspaceServices");
			Class z = cl.loadClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.ImportServices");
			Class a = cl.loadClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.CommonServices");
			

			Field f = AcceleoServicesEclipseUtil.class.getDeclaredField("REGISTERED_CLASSES");
			f.setAccessible(true);
			Map<String, Class<?>> map = (Map<String, Class<?>>) f.get(null);
			map.put("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.UML2JavaConfigurationHolder", x);
			map.put("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.WorkspaceServices", y);
			map.put("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.ImportServices", z);
			map.put("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.CommonServices", a);
			
			
			Class launcherClass = cl.loadClass("eu.artist.moola.Launcher");
			Constructor<?> ctor = launcherClass.getConstructor(String.class);
			Launcher launcher = (Launcher) ctor.newInstance(emftvmMoolaFilePath);
			
			launcher.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
