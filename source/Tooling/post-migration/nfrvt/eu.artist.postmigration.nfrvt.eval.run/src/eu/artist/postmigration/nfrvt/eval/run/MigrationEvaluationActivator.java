/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.eval.run;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MigrationEvaluationActivator extends AbstractUIPlugin {

	public static String ATT_INPUT_MODEL_PATH = "ATT_INPUT_GOAL_OR_EVALUATION_MODEL"; //$NON-NLS-1$
	public static String ATT_INPUT_MEASUREMENT_MODELS_PATHS = "ATT_INPUT_MEASUREMENT_MODEL"; //$NON-NLS-1$
	public static String ATT_OUTPUT_MODEL_PATH = "ATT_OUTPUT_MIGRATION_EVALUATION"; //$NON-NLS-1$
	
	public static String ATT_SETTINGS_PRECISION = "ATT_SETTINGS_PRECISION"; //$NON-NLS-1$
	public static String ATT_SETTINGS_ROUNDING = "ATT_SETTINGS_ROUNDING"; //$NON-NLS-1$
	
	public static final String GML_PROCESS_FACTORY_ID = "eu.artist.postmigration.nfrvt.eval.run.process.processFactory"; //$NON-NLS-1$
	
	// The plug-in ID
	public static final String PLUGIN_ID = "eu.artist.postmigration.nfrvt.eval.run"; //$NON-NLS-1$

	// The shared instance
	private static MigrationEvaluationActivator plugin;
	
	/**
	 * The constructor
	 */
	public MigrationEvaluationActivator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MigrationEvaluationActivator getDefault() {
		return plugin;
	}

}
