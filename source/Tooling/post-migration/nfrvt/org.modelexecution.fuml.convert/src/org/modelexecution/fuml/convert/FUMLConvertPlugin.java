package org.modelexecution.fuml.convert;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class FUMLConvertPlugin implements BundleActivator {

	private static BundleContext context;
	public static FUMLConvertPlugin instance;

	private ServiceTracker<Object, Object> logServiceTracker;
	private LogService logService;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		FUMLConvertPlugin.context = bundleContext;
		FUMLConvertPlugin.instance = this;
		logServiceTracker = new ServiceTracker<>(context,
				LogService.class.getName(), null);
		logServiceTracker.open();
		logService = (LogService) logServiceTracker.getService();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		FUMLConvertPlugin.context = null;
		logServiceTracker.close();
		logServiceTracker = null;
	}

	public LogService getLog() {
		return logService;
	}

	public static void log(int level, String message) {
		if (FUMLConvertPlugin.instance != null
				&& FUMLConvertPlugin.instance.getLog() != null)
			FUMLConvertPlugin.instance.getLog().log(level, message);
	}

}
