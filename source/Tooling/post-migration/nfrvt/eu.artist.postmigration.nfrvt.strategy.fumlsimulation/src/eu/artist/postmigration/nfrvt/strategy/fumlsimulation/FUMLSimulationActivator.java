package eu.artist.postmigration.nfrvt.strategy.fumlsimulation;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class FUMLSimulationActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.artist.postmigration.nfrvt.strategy.fumlsimulation"; //$NON-NLS-1$
	
	public static final String PROCESS_FACTORY_ID = "eu.artist.postmigration.nfrvt.strategy.fumlsimulation.run.processFactory"; //$NON-NLS-1$

	// The shared instance
	private static FUMLSimulationActivator plugin;
	
	// QN analysis specific attributes
	public static final String ATT_MODEL_PATH = "ATT_MODEL_PATH";
	public static final String ATT_QN_ANALYIS_CONTEXT = "ATT_ANALYIS_CONTEXT"; //$NON-NLS-1$
	public static final String ATT_QN_RESULT_PATH = "ATT_RESULT_PATH"; //$NON-NLS-1$
	public static final String ATT_QN_SIMULATION_TIME = "ATT_SIMULATION_TIME"; //$NON-NLS-1$
	
	/**
	 * The constructor
	 */
	public FUMLSimulationActivator() {
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
	public static FUMLSimulationActivator getDefault() {
		return plugin;
	}

}
