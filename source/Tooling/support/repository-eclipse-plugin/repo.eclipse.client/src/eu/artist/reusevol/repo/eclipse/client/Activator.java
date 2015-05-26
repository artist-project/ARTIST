/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client;

import java.io.File;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import eu.artist.reusevol.repo.eclipse.client.preference.RepositoryConfigurationManager;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.artist.reusevol.repo.eclipse.client"; //$NON-NLS-1$

	public static final String PREFS_REPO_INFO = "repositoryInfo.xml";
	public static final String POM_FILE = "pomartefact.xml";

	// The shared instance
	private static Activator plugin;

	private RepositoryConfigurationManager repositoryConfigurationManager;

	/**
	 * The constructor
	 */
	public Activator() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// TODO this is broken, need to make it lazy, otherwise we'll deadlock
		// or timeout... or both
		File stateLocationDir = getStateLocation().toFile();
		this.repositoryConfigurationManager = new RepositoryConfigurationManager(
				new File(stateLocationDir, PREFS_REPO_INFO));
		try {
			this.repositoryConfigurationManager.readConfigurations();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance of this Activator.
	 * 
	 * @return the shared Activator instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns the RepositoryConfigurationManager that manages the configured
	 * repository connections.
	 * 
	 * @return the RepositoryConfigurationManager
	 */
	public RepositoryConfigurationManager getRepositoryManager() {
		return this.repositoryConfigurationManager;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path to the image
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
