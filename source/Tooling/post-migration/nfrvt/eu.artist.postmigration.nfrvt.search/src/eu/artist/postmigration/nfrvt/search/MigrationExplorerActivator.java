package eu.artist.postmigration.nfrvt.search;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class MigrationExplorerActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.artist.postmigration.nfrvt.search"; //$NON-NLS-1$

	public static String ATT_INPUT_GOAL_MODEL_PATH = "ATT_INPUT_GOAL_MODEL"; //$NON-NLS-1$
	public static String ATT_INPUT_UML_MODEL_PATH = "ATT_INPUT_UML_MODEL"; //$NON-NLS-1$
	public static String ATT_OUTPUT_MODEL_PATH = "ATT_OUTPUT_MEASUREMENT_MODEL"; //$NON-NLS-1$
	
	public static String ATT_SETTINGS_PRECISION = "ATT_SETTINGS_PRECISION"; //$NON-NLS-1$
	public static String ATT_SETTINGS_ROUNDING = "ATT_SETTINGS_ROUNDING"; //$NON-NLS-1$
	
	public static final String ATT_QN_RESULT_PATH = "ATT_RESULT_PATH"; //$NON-NLS-1$
	public static final String ATT_QN_SIMULATION_TIME = "ATT_SIMULATION_TIME"; //$NON-NLS-1$
	
	public static final String ATT_PATTERN_FIXED_MIN = "ATT_PATTERN_FIXED_MIN"; //$NON-NLS-1$
	public static final String ATT_PATTERN_FIXED_MAX = "ATT_PATTERN_FIXED_MAX"; //$NON-NLS-1$
	
	public static final String ATT_PATTERN_AUTO_MIN_MIN = "ATT_PATTERN_AUTO_MIN_MIN"; //$NON-NLS-1$
	public static final String ATT_PATTERN_AUTO_MIN_MAX = "ATT_PATTERN_AUTO_MIN_MAX"; //$NON-NLS-1$
	public static final String ATT_PATTERN_AUTO_MAX_MIN = "ATT_PATTERN_AUTO_MAX_MIN"; //$NON-NLS-1$
	public static final String ATT_PATTERN_AUTO_MAX_MAX = "ATT_PATTERN_AUTO_MAX_MAX"; //$NON-NLS-1$
	
	public static final String ATT_PATTERN_SPEEDUP_CACHE = "ATT_PATTERN_SPEEDUP_CACHE"; //$NON-NLS-1$
	public static final String ATT_PATTERN_SPEEDUP_INSTANCE = "ATT_PATTERN_SPEEDUP_INSTANCE"; //$NON-NLS-1$
	
	public static final String ATT_PATTERN_PRICE_CACHE = "ATT_PATTERN_PRICE_CACHE"; //$NON-NLS-1$
	public static final String ATT_PATTERN_PRICE_INSTANCE = "ATT_PATTERN_PRICE_INSTANCE"; //$NON-NLS-1$
	
	
	public static final String PROCESS_FACTORY_ID = "eu.artist.postmigration.nfrvt.search.run.processFactory"; //$NON-NLS-1$
	
	// The shared instance
	private static MigrationExplorerActivator plugin;
	
	/**
	 * The constructor
	 */
	public MigrationExplorerActivator() {
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
	public static MigrationExplorerActivator getDefault() {
		return plugin;
	}

}
