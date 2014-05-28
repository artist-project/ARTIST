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
package eu.artist.migration.umlprofilestore.impl;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.osgi.framework.Bundle;

import eu.artist.migration.umlprofilestore.UMLProfileStoreManager;
import eu.artist.migration.umlprofilestore.UMLProfileStorePlugin;

/**
 * @author Alexander Bergmayr
 *
 */
public class UMLProfileStoreManagerImpl implements UMLProfileStoreManager {
	
	/**
	 * 
	 */
	private static boolean IS_INTIALIZED = false;
	
	/**
	 * 
	 */
	private UMLProfileStoreManagerImpl() { }
	
	/**
	 * 
	 * @return the {@link JavaDiscoverer}
	 */
	public static UMLProfileStoreManager init() {
		if(!IS_INTIALIZED) {
			IS_INTIALIZED = true;
			return new UMLProfileStoreManagerImpl();
		} 
		return UMLProfileStoreManager.INSTANCE;
	}

	@Override
	public Collection<Resource> getUMLProfiles() {
		Bundle umlProfileStore = Platform.getBundle(UMLProfileStorePlugin.PLUGIN_ID);
		URL fileURL = umlProfileStore.getEntry("./umlprofiles");
		
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		UMLPackage.eINSTANCE.eClass();
		
		Collection<Resource> umlProfiles = new ArrayList<Resource>();
		
		for(File umlProfile : file.listFiles()) {			
			if(umlProfile.getName().endsWith(UMLResource.FILE_EXTENSION)) {
				
				// System.out.println("Current Profile: " + URI.createFileURI(umlProfile.getAbsolutePath()).lastSegment());
				
				String profileName = URI.createFileURI(umlProfile.getAbsolutePath()).lastSegment();
				
				
				String mapping = "pathmap://UML_PROFILE_STORE/PROFILES/";
				URI profileURI = URI.createURI(mapping.concat(profileName)).trimFragment();
				URI normalizedProfileURI = resourceSet.getURIConverter().normalize(profileURI);
				
				// System.out.println(normalizedProfileURI);		
				Resource profileResource = resourceSet.getResource(normalizedProfileURI, true);
				// System.out.println(profileResource.getContents().get(0));
				
				
				
				//Resource resource = resourceSet.getResource(URI.
				//		createPlatformResourceURI(umlProfile.getAbsolutePath(), true), true);
				umlProfiles.add(profileResource);
			}
		}
		
		return umlProfiles;
	}	

}
