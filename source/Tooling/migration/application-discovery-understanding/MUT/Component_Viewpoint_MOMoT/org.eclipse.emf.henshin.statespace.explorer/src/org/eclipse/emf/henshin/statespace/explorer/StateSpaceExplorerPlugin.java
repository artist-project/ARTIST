/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * State space plug-in activator.
 * @author Christian Krause
 */
public class StateSpaceExplorerPlugin extends AbstractUIPlugin {
	
	/**
	 * Plug-In ID.
	 */
	public static final String ID = "org.eclipse.emf.henshin.statespace.explorer";
	
	// Static instance:
	private static StateSpaceExplorerPlugin instance;

	/** 
	 * Default constructor. 
	 */
	public StateSpaceExplorerPlugin() {
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
    public void start(BundleContext context) throws Exception {
    	super.start(context);
    	instance = this;
    }
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
    public void stop(BundleContext context) throws Exception {
    	instance = null;
    	super.stop(context);
    }

	/**
	 * Returns the shared plug-in instance.
	 */
	public static StateSpaceExplorerPlugin getInstance() {
		return instance;
	}
	
	/**
	 * Returns an image descriptor for the image file 
	 * at the given plug-in relative path.
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}
	
	/**
	 * Returns an image for the image file at the given plug-in 
	 * relative path. Client do not need to dispose this image. 
	 * Images will be disposed automatically.
	 */
	public Image getImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image==null) {
			getImageRegistry().put(path, getImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}
	
	/**
	 * Log an error.
	 * @param message Error message.
	 * @param t Optional exception.
	 */
	public void logError(String message, Throwable t) {
		if (message==null && t!=null) {
			message = t.getMessage();
		}
		getLog().log(new Status(IStatus.ERROR, ID, IStatus.OK, message, t));
	}

	/**
	 * Log an info.
	 * @param message Message.
	 */
	public void logInfo(String message) {
		getLog().log(new Status(IStatus.INFO, ID, IStatus.OK, message, null));
	}

}