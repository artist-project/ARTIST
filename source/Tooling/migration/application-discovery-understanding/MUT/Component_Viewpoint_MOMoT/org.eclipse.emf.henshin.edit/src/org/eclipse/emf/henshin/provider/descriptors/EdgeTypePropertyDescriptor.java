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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.henshin.model.Edge;

/**
 * Property descriptor for the <code>type</code> feature of model class
 * {@link Edge}. This descriptor looks if source and/or target is/are set and
 * shows related types only.
 * 
 * @author Stefan Jurack
 * 
 */
public class EdgeTypePropertyDescriptor extends ItemPropertyDescriptor {
	
	/**
	 * @param adapterFactory
	 * @param resourceLocator
	 * @param displayName
	 * @param description
	 * @param feature
	 */
	public EdgeTypePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description, feature, true, false,
				true, null, null, null);
	}// constructor
	
	/**
	 * Collects all types, being provided by the combo box in a related property
	 * sheet.<br>
	 * If the given <code>object</code>, which is an Edge instance, is equipped
	 * with a source and/or target, only corresponding types are returned.
	 * Otherwise any type is returned.
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		
		if (object instanceof Edge) {
			Edge edge = (Edge) object;
			
			Collection<EReference> edgeTypeList;
			
			if (edge.getSource() != null && edge.getSource().getType() != null) {
				// retrieve only references according to the given source...
				EClass sourceType = edge.getSource().getType();
				edgeTypeList = new ArrayList<EReference>(sourceType.getEAllReferences());
			} else {
				// ..or retrieve all possible references
				edgeTypeList = (Collection<EReference>) super.getComboBoxObjects(object);
			}// if else
			
			if (edge.getTarget() != null && edge.getTarget().getType() != null) {
				// filter those references whose type fits the target's type
				EClass targetType = edge.getTarget().getType();
				Iterator<EReference> it = edgeTypeList.iterator();
				while (it.hasNext()) {
					EClass ec = (EClass) it.next().getEType();
					/*
					 * Remove reference target types which do not fit. <br>
					 * Remark: Since EMF 2.6, EObject is no contained in the
					 * supertype-list and needs special treatment
					 */
					if ((ec != EcorePackage.Literals.EOBJECT) && (!ec.isSuperTypeOf(targetType)))
						it.remove();
				}// while
			}// if
			
			if (!edgeTypeList.contains(null)) edgeTypeList.add(null);
			return edgeTypeList;
		}// if
		
		return super.getComboBoxObjects(object);
	}// getComboBoxObjects
	
}// class
