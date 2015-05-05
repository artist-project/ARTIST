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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * The state space plug-in implementation.
 * @generated
 */
public final class StateSpacePlugin extends EMFPlugin {
	
	/**
	 * Plug-in ID.
	 * @generated NOT
	 */
	public static final String PLUGIN_ID = "org.eclipse.emf.henshin.statespace";
	
	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	public static final StateSpacePlugin INSTANCE = new StateSpacePlugin();

	/**
	 * Keep track of the singleton.
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Registry for state and state space validators.
	 * @generated NOT
	 */	
	private Map<String,Validator> validators;

	/**
	 * Registry for state space exporters.
	 * @generated NOT
	 */	
	private Map<String,StateSpaceExporter> exporters;
	
	/**
	 * Create the instance.
	 * @generated
	 */
	public StateSpacePlugin() {
		super(new ResourceLocator [] {});
	}
	
	/**
	 * Get the map of registered state and state space validators.
	 * @return Validator registry.
	 * @generated NOT
	 */
	public Map<String,Validator> getValidators() {
		if (validators==null) {
			validators = new HashMap<String,Validator>();
			try {
				// Load the validators registered via the platform's extension point mechanism.
				StateSpacePluginInitializer.loadValidators();
			}
			catch (Throwable t) {
				// Not critical. Happens if the platform is not present.
			}
		}
		return validators;
	}

	/**
	 * Get the map of registered state space exporters.
	 * @return Exporter registry.
	 * @generated NOT
	 */
	public Map<String,StateSpaceExporter> getExporters() {
		if (exporters==null) {
			exporters = new HashMap<String,StateSpaceExporter>();
			try {
				// Load the exporters registered via the platform's extension point mechanism.
				StateSpacePluginInitializer.loadExporters();
			}
			catch (Throwable t) {
				// Not critical. Happens if the platform is not present.
			}
		}
		return exporters;
	}

	/**
	 * Log an error.
	 * @param message Error message.
	 * @param t Exception.
	 * @generated NOT
	 */
	public void logError(String message, Throwable t) {
		if (plugin!=null && plugin.getLog()!=null) {
			plugin.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, 0, message, t));
		} else {
			System.err.println(message);
			if (t!=null) t.printStackTrace();
		}
	}

	/**
	 * Log a warning.
	 * @param message Warning message.
	 * @generated NOT
	 */
	public void logWarning(String message) {
		if (plugin!=null && plugin.getLog()!=null) {
			plugin.getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, 0, message, null));
		} else {
			System.err.println(message);
		}
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		
		/**
		 * Creates an instance.
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
