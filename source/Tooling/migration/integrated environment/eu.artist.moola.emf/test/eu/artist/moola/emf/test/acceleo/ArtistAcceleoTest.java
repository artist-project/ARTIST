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

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

public class ArtistAcceleoTest {

	@Test
	public void test() {
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
		
		
		Resource r = rs.getResource(URI.createURI("test/resources/artist/model/petstore_domain_objectified_dao.uml"), true);
		EObject content = r.getContents().get(0);
		
		
		System.out.println(this.getClass().getClassLoader().getClass().getName());
		
		/*
		AcceleoLaunchConfiguration config = new AcceleoLaunchConfiguration();
		config.setProject("test/resources/artist/bin");
		config.setMainClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.main.Uml2java");
		config.setModel(content);
		config.setTarget("test/resources/artist/src-gen");
		*/
		try {
			
			ClassLoader currentThreadClassLoader = Thread.currentThread().getContextClassLoader();
			System.out.println(currentThreadClassLoader);
			
			//URLClassLoader cl = loadClassLoader();
			
			//addURL(new File("C:/GitRepo/transformation-orchestration/libs/eu.artist.migration.modernization.uml2java.jar").toURI().toURL());
			
			//Thread.currentThread().setContextClassLoader(cl);
			//currentThreadClassLoader = Thread.currentThread().getContextClassLoader();
			//System.out.println(currentThreadClassLoader);

			//Class acceleoLauncher = cl.loadClass("eu.artist.moola.emf.acceleo.AcceleoLauncher");
			
			//Class x = cl.loadClass("eu.artist.migration.modernization.uml2java.repackaged.gen.java.services.UML2JavaConfigurationHolder");
			//System.out.println(x.getName());
			
			
			//Constructor<?> ctor = acceleoLauncher.getConstructor(AcceleoLaunchConfiguration.class);
			//AcceleoLauncher launcher = (AcceleoLauncher) ctor.newInstance(new Object[] { config });
			
			//AcceleoLauncher launcher = new AcceleoLauncher(config);
			//launcher.run();	
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void addURL(URL url) throws Exception {
		  URLClassLoader classLoader
		         = (URLClassLoader) ClassLoader.getSystemClassLoader();
		  Class clazz= URLClassLoader.class;

		  // Use reflection
		  Method method= clazz.getDeclaredMethod("addURL", new Class[] { URL.class });
		  method.setAccessible(true);
		  method.invoke(classLoader, new Object[] { url });
		}


		
	protected URLClassLoader loadClassLoader() {
		try {
			File file = new File("C:/GitRepo/transformation-orchestration/libs/eu.artist.migration.modernization.uml2java.jar");
			
		    URL url = file.toURI().toURL();
		    URL[] urls = new URL[]{url};

		    return new URLClassLoader(urls, Thread.currentThread().getContextClassLoader());
		} catch(Exception ex) {
			throw new RuntimeException("Could not create class loader for Acceleo generator", ex);
		}
	}

}
