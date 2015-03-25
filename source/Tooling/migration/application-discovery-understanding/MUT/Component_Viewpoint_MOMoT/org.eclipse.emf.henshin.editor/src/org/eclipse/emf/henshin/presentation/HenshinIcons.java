/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.presentation;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Henshin and Ecore icons.
 * 
 * @author Christian Krause
 */
public class HenshinIcons {
	
	// Ecore edit plugin id:
	private static final String ECORE_EDIT = "org.eclipse.emf.ecore.edit";
	
	// Henshin edit plugin id:
	private static final String HENSHIN_EDIT = "org.eclipse.emf.henshin.edit";
	
	// Ecore icons:
	public static final Image EPACKAGE = load(ECORE_EDIT, "icons/full/obj16/EPackage.gif");
	public static final Image ECLASS = load(ECORE_EDIT, "icons/full/obj16/EClass.gif");
	public static final Image EREFERENCE = load(ECORE_EDIT, "icons/full/obj16/EReference.gif");
	
	// Henshin icons:
	public static final Image RULE = load(HENSHIN_EDIT, "icons/full/obj16/Rule.gif");
	public static final Image NODE = load(HENSHIN_EDIT, "icons/full/obj16/Node.gif");
	public static final Image EDGE = load(HENSHIN_EDIT, "icons/full/obj16/Edge.gif");
	
	/*
	 * Load an image.
	 */
	private static Image load(String pluginId, String path) {
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(pluginId, path);
		return (descriptor != null) ? descriptor.createImage() : null;
	}
	
}
