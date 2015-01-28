package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class UML2ConverterPlugin implements BundleActivator {

	public static final String ID = "org.modelexecution.fuml.convert.uml2";
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		UML2ConverterPlugin.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		UML2ConverterPlugin.context = null;
	}

}
