/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider;
import org.eclipse.emf.henshin.commands.dnd.DelegatingWrapperFeatureDragAndDropCommand;

/**
 * This class wraps TransformationUnits representing tree-editor items which are
 * referred to instead of contained in. In particular, the icon is extended by a
 * link icon.
 * 
 * @author Stefan Jurack, Christian Krause
 */
public class DelegatingWrapperTrafoUnitItemProvider extends DelegatingWrapperItemProvider {
	
	// Overlay image for links:
	private static final Object LINK_OVR = HenshinEditPlugin.INSTANCE.getImage("full/ovr16/link_ovr");
	
	/**
	 * Default constructor.
	 */
	public DelegatingWrapperTrafoUnitItemProvider(Object value, Object owner,
			EStructuralFeature feature, int index, AdapterFactory adapterFactory) {
		super(value, owner, feature, index, adapterFactory);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.DelegatingWrapperItemProvider#getImage(java.lang.Object)
	 */
	@Override
	public Object getImage(Object object) {
		Object image = super.getImage(object);
		List<Object> images = new ArrayList<Object>(2);
		images.add(image);
		images.add(LINK_OVR);
		image = new ComposedImage(images);
		return image;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.WrapperItemProvider#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location,
			int operations, int operation, Collection<?> collection) {
		return new DelegatingWrapperFeatureDragAndDropCommand(domain, owner, location, collection);
	}
		
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(" (Value:" + this.value + ")");
		sb.append(" (Owner:" + this.owner + ")");
		sb.append(" (Feature:" + this.feature + ")");
		sb.append(" (Index:" + this.index + ")");
		return sb.toString();
	}
	
}