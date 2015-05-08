/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;

/**
 * Helper class for registering platform validators and exporters.
 * 
 * @author Christian Krause
 * @generated NOT
 */
class StateSpacePluginInitializer {
	
	/**
	 * Load the state space validators registered via the platform.
	 * If the platform is not present, loading this class will throw an
	 * exception.
	 * @generated NOT
	 */
	public static void loadValidators() throws Throwable {
		
		// Get the extension point:
		IExtensionPoint point = Platform.getExtensionRegistry().getExtensionPoint(StateSpacePlugin.PLUGIN_ID + ".validators");
		
		// Load the validators:
		for (IConfigurationElement element : point.getConfigurationElements()) {
			if ("validator".equals(element.getName())) {
				String id = element.getAttribute("id");
				try {
					Validator validator = (Validator) element.createExecutableExtension("class");
					StateSpacePlugin.INSTANCE.getValidators().put(id, validator);
				} catch (Throwable t) {
					StateSpacePlugin.INSTANCE.logError("Error loading state space or state validator with id " + id, t);
				}
			}
		}
		
	}

	/**
	 * Load the state space exporters registered via the platform.
	 * If the platform is not present, loading this class will throw an
	 * exception.
	 * @generated NOT
	 */
	public static void loadExporters() throws Throwable {
		
		// Get the extension point:
		IExtensionPoint point = Platform.getExtensionRegistry().getExtensionPoint(StateSpacePlugin.PLUGIN_ID + ".exporters");
		
		// Load the exporters:
		for (IConfigurationElement element : point.getConfigurationElements()) {
			if ("exporter".equals(element.getName())) {
				String id = element.getAttribute("id");
				try {
					StateSpaceExporter exporter = (StateSpaceExporter) element.createExecutableExtension("class");
					StateSpacePlugin.INSTANCE.getExporters().put(id, exporter);
				} catch (Throwable t) {
					StateSpacePlugin.INSTANCE.logError("Error loading state space exporter with id " + id, t);
				}
			}
		}
		
	}
	
}
