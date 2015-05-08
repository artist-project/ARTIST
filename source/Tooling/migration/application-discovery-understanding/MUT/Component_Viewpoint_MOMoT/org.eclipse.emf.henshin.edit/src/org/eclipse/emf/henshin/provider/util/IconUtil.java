/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.provider.ComposedImage;

/**
 * Utility to handle Icon overlaying in a convenient way.
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 */
public class IconUtil {
	
	/**
	 * Overlays the <code>overlayImage</code> on top of <code>baseImage</code>.
	 * 
	 * @param baseImage
	 * @param overlayImage
	 * @return
	 */
	public static Object getCompositeImage(Object baseImage, Object overlayImage) {
		List<Object> images = new ArrayList<Object>(2);
		images.add(baseImage);
		images.add(overlayImage);
		
		Object image = new ComposedImage(images);
		return image;
	}// getCompositeImage
	
	/**
	 * 
	 * Overlays the <code>overlayImage</code> on top of <code>baseImage</code>
	 * at the given position.
	 * 
	 * @param baseImage
	 * @param overlayImage
	 * @param moveX
	 * @param moveY
	 * @return
	 */
	public static Object getCompositeImage(Object baseImage, Object overlayImage, final int moveX,
			final int moveY) {
		List<Object> images = new ArrayList<Object>(2);
		images.add(baseImage);
		images.add(overlayImage);
		
		Object image = new ComposedImage(images) {
			@Override
			public List<Point> getDrawPoints(Size size) {
				List<ComposedImage.Point> result = super.getDrawPoints(size);
				result.get(1).x = moveX;
				result.get(1).y = moveY;
				return result;
			}// getDrawPoints
		};
		return image;
	}// getCompositeImage
	
}// class
