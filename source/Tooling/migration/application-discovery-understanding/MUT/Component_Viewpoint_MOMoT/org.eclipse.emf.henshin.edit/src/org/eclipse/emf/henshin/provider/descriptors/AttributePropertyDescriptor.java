/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.descriptors;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Node;

/**
 * Property descriptor for the <code>type</code> feature of model class
 * {@link Attribute}. This descriptor collects/provides only types according to
 * the type of this attributes owner {@link Node}.
 * 
 * @author Stefan Jurack
 * 
 */
public class AttributePropertyDescriptor extends ItemPropertyDescriptor {
	
	public AttributePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
				multiLine, sortChoices, staticImage, category, filterFlags);
	}// constructor
	
	/**
	 * Collects all entries, which are then provided by the combo box in a
	 * related property sheet.<br>
	 * If the given <code>object</code>, which is an Attribute instance, is
	 * contained by a node with a type, only those entries (or features) are
	 * collected, which relate to the type of the node. If a parent node or its
	 * type is not given, all possible features are provided in the combo box.
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(java.lang.Object)
	 */
	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		
		if (object instanceof Attribute) {
			Attribute attr = (Attribute) object;
			Node ownerNode = attr.getNode();
			if (ownerNode.getType() != null) {
				EClass owner = ownerNode.getType();
				return Collections.unmodifiableCollection(owner.getEAllAttributes());
			}// if
		}// if
		
		return super.getComboBoxObjects(object);
	}// getComboBoxObjects
	
}// class
