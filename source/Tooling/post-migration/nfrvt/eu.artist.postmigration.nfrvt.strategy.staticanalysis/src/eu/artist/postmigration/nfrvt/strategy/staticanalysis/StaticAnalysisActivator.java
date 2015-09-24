package eu.artist.postmigration.nfrvt.strategy.staticanalysis;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class StaticAnalysisActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.artist.postmigration.nfrvt.strategy.staticanalysis"; //$NON-NLS-1$

	public static String ATT_INPUT_MODEL_PATH = "ATT_INPUT_GOAL_MODEL"; //$NON-NLS-1$
	public static String ATT_OUTPUT_MODEL_PATH = "ATT_OUTPUT_MEASUREMENT_MODEL"; //$NON-NLS-1$
	
	public static final String PROCESS_FACTORY_ID = "eu.artist.postmigration.nfrvt.strategy.staticanalysis.run.processFactory"; //$NON-NLS-1$
	
	// The shared instance
	private static StaticAnalysisActivator plugin;
	
	/**
	 * The constructor
	 */
	public StaticAnalysisActivator() {
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
	public static StaticAnalysisActivator getDefault() {
		return plugin;
	}

}
