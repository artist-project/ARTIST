/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class RegisteredLibrary {
		
	private static Collection<RegisteredLibrary> registeredLibraries;
	
	private static String LIBRARY_EXTENSION_ID = "org.modelexecution.fuml.library";
	private static String LIBRARY_EXTENSION_ELEMENT_NAME = "library";
	private static String LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_NAME = "name";
	private static String LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_PATH = "path";
	private static String LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_DESCRIPTION = "description";
	private static String LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_PROVIDER = "provider";
		
	private String name;
	private String path;
	private String description;
	private String provider;
	
	public RegisteredLibrary(IConfigurationElement configurationElement) {
		name = configurationElement.getAttribute(LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_NAME);
		path = configurationElement.getAttribute(LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_PATH);
		description = configurationElement.getAttribute(LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_DESCRIPTION);
		provider = configurationElement.getAttribute(LIBRARY_EXTENSION_ATTRIBUTE_LIBRARY_PROVIDER);
	}
	
	public String getName() {
		return name;
	}
	
	public String getPath() {
		return path;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getProvider() {
		return provider;
	}	
	
	public static Collection<RegisteredLibrary> getRegisteredLibraries() {
		if(registeredLibraries != null) {
			return registeredLibraries;
		}
		
		registeredLibraries = new ArrayList<RegisteredLibrary>();
		
		IConfigurationElement[] configElements = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						LIBRARY_EXTENSION_ID);
		for (int i = 0; i < configElements.length; ++i) {
			IConfigurationElement configElement = configElements[i];
			if (LIBRARY_EXTENSION_ELEMENT_NAME.equals(configElement.getName())) {
				RegisteredLibrary registeredLibrary = new RegisteredLibrary(configElement);
				registeredLibraries.add(registeredLibrary);
			}
		}
		return registeredLibraries;
	}
}
