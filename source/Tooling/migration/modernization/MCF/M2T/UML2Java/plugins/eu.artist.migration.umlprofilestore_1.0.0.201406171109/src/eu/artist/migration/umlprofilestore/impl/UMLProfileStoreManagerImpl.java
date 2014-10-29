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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
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
	 * Path to the profiles in the store
	 */
	private final String mapping = "pathmap://UML_PROFILE_STORE/PROFILES/";
	
	/**
	 * The resource set of the profiles in the store
	 */
	private static ResourceSet resourceSet;
	
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
			
			// init the resource set
			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
			UMLPackage.eINSTANCE.eClass();
			
			return new UMLProfileStoreManagerImpl();
		} 
		return UMLProfileStoreManager.INSTANCE;
	}
	
	/* (non-Javadoc)
	 * @see eu.artist.migration.umlprofilestore.UMLProfileStoreManager#getUMLProfiles()
	 */
	@Override
	public Collection<Resource> getUMLProfiles() {
		return getCollectUMLProfiles().values();
	}

	/* (non-Javadoc)
	 * @see eu.artist.migration.umlprofilestore.UMLProfileStoreManager#addProfile(org.eclipse.emf.ecore.resource.Resource)
	 */
	@Override
	public void addProfile(Resource profile) throws IOException {
		String profileName = profile.getURI().lastSegment();
		
		System.out.println("Profile-Name: " + profileName);
		
		Map<String, Resource> collectedProfiles = getCollectUMLProfiles();
		System.out.println(collectedProfiles.size());
		
		// we do have to adapt the plugin.xml if the profile
		// is not yet in the store
		if(!collectedProfiles.containsKey(profileName)) {
			
			for (IPluginModelBase modelBase : PluginRegistry.getWorkspaceModels()) {
				System.out.println(modelBase);
			}
			
			// Platform.getExtensionRegistry().addContribution(is, contributor, persist, name, translationBundle, token)
		}
		
		// write the profile to the store
		URI profileURI = URI.createURI(mapping.concat(profileName)).trimFragment();
		URI normalizedProfileURI = resourceSet.getURIConverter().normalize(profileURI);
		profile.setURI(normalizedProfileURI);
		
		System.out.println("URI: " + profile.getURI());
		
		// profile.save(null);
	}
	
	private Map<String, Resource> getCollectUMLProfiles() {
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
		
		Map<String, Resource> umlProfiles = new HashMap<String, Resource>();
		
		for(File umlProfile : file.listFiles()) {			
			if(umlProfile.getName().endsWith(UMLResource.FILE_EXTENSION)) {
				String profileName = URI.createFileURI(umlProfile.getAbsolutePath()).lastSegment();
				URI profileURI = URI.createURI(mapping.concat(profileName)).trimFragment();
				URI normalizedProfileURI = resourceSet.getURIConverter().normalize(profileURI);
						
				Resource profileResource = resourceSet.getResource(normalizedProfileURI, true);
				umlProfiles.put(profileName, profileResource);
			}
		}
		
		return umlProfiles;
	}

}
