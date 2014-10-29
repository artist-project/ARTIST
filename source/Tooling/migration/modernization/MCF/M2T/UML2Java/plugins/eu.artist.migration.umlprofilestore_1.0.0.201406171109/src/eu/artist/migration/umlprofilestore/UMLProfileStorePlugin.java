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
package eu.artist.migration.umlprofilestore;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * @author Alexander Bergmayr
 *
 */
public class UMLProfileStorePlugin extends Plugin {

	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "eu.artist.migration.umlprofilestore";

	/**
	 * The shared instance.
	 */
	private static UMLProfileStorePlugin plugin;
	
	/**
	 * The constructor.
	 */
	public UMLProfileStorePlugin() {
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance
	 */
	public static UMLProfileStorePlugin getDefault() {
		return plugin;
	}
}
