/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
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
package eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.util;

import java.net.URL;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.ResourcesPlugin;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

/**
 * @author Alexander Bergmayr
 * 
 * In order to deal with pathmaps, we need to initialize some
 * UML stuff. Maybe in future releases of UML2 these steps
 * might get unnecessary. So, this util class is seen as
 * a work around for bugs / forum discussions reported in:
 * 
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=401682 and
 * http://www.eclipse.org/forums/index.php?t=msg&goto=644027&S=8c6cc70ec33284ed1683fba507e8904f#msg_644027
 */
public class ModelUtil {
	
	/**
	 * 
	 * @param factory
	 * 			From which we get the resource set that requires information
	 *   		about the UML pathmaps
	 */
	public static void loadUMLResources(EMFModelFactory factory) {
		// TODO this should also work with the 
		
		ResourceSet resourceSet = factory.getResourceSet();
		UMLResourcesUtil.init(resourceSet);
		
		String uml = "metamodels/UML.metamodel.uml";
	    URL url = ResourcesPlugin.class.getClassLoader().getResource(uml);
	    
	    String baseUrl = url.toString();
	    baseUrl = baseUrl.substring( 0, baseUrl.length() - uml.length() );
	    
	    URI baseUri = URI.createURI(baseUrl);    
	    Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
	    
	    uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), baseUri.appendSegment("libraries").appendSegment(""));
	    uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), baseUri.appendSegment("metamodels").appendSegment(""));
	    uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), baseUri.appendSegment("libraries").appendSegment("")); 
	}

}
