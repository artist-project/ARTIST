/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fumldebug.ui.commons;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class FUMLUICommons extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.modelexecution.fumldebug.ui.commons"; //$NON-NLS-1$
	private final static String ICONS_PATH = "icons/"; //$NON-NLS-1$

	public final static String IMG_ACTIVITY = "IMG_ACTIVITY"; //$NON-NLS-1$

	// The shared instance
	private static FUMLUICommons plugin;

	public FUMLUICommons() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static FUMLUICommons getDefault() {
		return plugin;
	}

	protected void initializeImageRegistry(ImageRegistry reg) {
		declareImage(IMG_ACTIVITY, ICONS_PATH + "Activity.gif"); //$NON-NLS-1$
	}

	private void declareImage(String key, String path) {
		Bundle bundle = Platform.getBundle(PLUGIN_ID);
		if (path != null) {
			URL iconURL = FileLocator.find(bundle, new Path(path), null);
			if (iconURL != null) {
				ImageDescriptor descriptor = ImageDescriptor
						.createFromURL(iconURL);
				super.getImageRegistry().put(key, descriptor);
			}
		}
	}

	public static Image getImage(String key) {
		return getDefault().getImageRegistry().get(key);
	}

}
