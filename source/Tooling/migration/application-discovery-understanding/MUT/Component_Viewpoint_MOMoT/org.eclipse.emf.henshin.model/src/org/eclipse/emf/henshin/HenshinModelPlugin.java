/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * Henshin model plug-in.
 * @author Christian Krause
 */
public class HenshinModelPlugin extends EMFPlugin {

	/**
	 * Henshin model plug-in ID.
	 */
	public static final String PLUGIN_ID = "org.eclipse.emf.henshin.model";

	/**
	 * Static plug-in instance.
	 */
	public static final HenshinModelPlugin INSTANCE = new HenshinModelPlugin();
	
	/**
	 * Internal implementation.
	 */
	private static Implementation plugin;	
	
	/**
	 * Importer registry.
	 */
	private Map<String,HenshinModelImporter> importers = new LinkedHashMap<String,HenshinModelImporter>();

	/**
	 * Exporter registry.
	 */
	private Map<String,HenshinModelExporter> exporters = new LinkedHashMap<String,HenshinModelExporter>();

	/**
	 * Flag indicating whether the adapters have been loaded.
	 */
	private boolean adaptersLoaded = false;
	
	/**
	 * Default constructor.
	 */
	public HenshinModelPlugin() {
		super
			(new ResourceLocator [] {
			});
	}	
	
	/**
	 * Constructor.
	 * @param delegateResourceLocators Resource locators.
	 */
	public HenshinModelPlugin(ResourceLocator[] delegateResourceLocators) {
		super(delegateResourceLocators);
	}

	/*
	 * Load the adapters (model plug-in extensions).
	 */
	private void loadAdapters() {
		if (!adaptersLoaded) {
			adaptersLoaded = true;
			try {
				HenshinModelPluginInitializer.loadAdapters();
			} catch (Throwable t) {
				// Not critical. Happens if the platform is not present.
			}
		}
	}

	/**
	 * Get the map of registered importers.
	 * @return Map of importers.
	 */
	public Map<String,HenshinModelImporter> getImporters() {
		loadAdapters();
		return importers;
	}

	/**
	 * Get the map of registered exporters.
	 * @return Map of exporters.
	 */
	public Map<String,HenshinModelExporter> getExporters() {
		loadAdapters();
		return exporters;
	}

	/**
	 * Log an info message.
	 * @param message The message.
	 */
	public void logInfo(String message) {
		log(IStatus.INFO, message, null);
	}

	/**
	 * Log a warning message.
	 * @param message The message.
	 * @param t Exception.
	 */
	public void logWarning(String message, Throwable t) {
		log(IStatus.WARNING, message, t);
	}

	/**
	 * Log an error message.
	 * @param message The message.
	 * @param t Exception.
	 */
	public void logError(String message, Throwable t) {
		log(IStatus.ERROR, message, null);
	}
	
	/*
	 * Log a message.
	 */
	private void log(int code, String message, Throwable t) {
		if (plugin!=null && plugin.getLog()!=null) {
			plugin.getLog().log(new Status(code, PLUGIN_ID, 0, message, t));
		} else {
			if (code==IStatus.ERROR) {
				System.err.print("ERROR: " + message);
			}
			else if (code==IStatus.WARNING) {
				System.out.print("WARNING: " + message);
			}
			else if (code==IStatus.INFO) {
				System.out.print("INFO: " + message);
			}
			if (t!=null) t.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.common.EMFPlugin#getPluginResourceLocator()
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
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
