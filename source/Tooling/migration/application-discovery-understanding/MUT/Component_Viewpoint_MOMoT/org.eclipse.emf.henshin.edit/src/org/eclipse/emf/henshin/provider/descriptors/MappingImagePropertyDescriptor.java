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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Property descriptor for the <code>image</code> feature of model class
 * {@link Mapping}. This descriptor collects nodes which are provided as a combo
 * box. In particular, only those nodes shall be collected, which are suitable
 * as image according to a certain (pre-selected) origin.
 * 
 * @author Stefan Jurack
 * 
 */
public class MappingImagePropertyDescriptor extends ItemPropertyDescriptor {
	
	/**
	 * @param adapterFactory
	 * @param resourceLocator
	 * @param displayName
	 * @param description
	 * @param feature
	 * 
	 * @see ItemPropertyDescriptor
	 */
	public MappingImagePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature) {
		super(adapterFactory, resourceLocator, displayName, description, feature, true, false,
				true, null, null, null);
		
		this.itemDelegator = new ItemDelegator(adapterFactory, resourceLocator) {
			public String getText(Object object) {
				if (object instanceof Node) {
					Node node = (Node) object;
					String nodeLabel = node.getName() == null || node.getName().equals("") ? "_"
							: node.getName();
					String typeLabel = node.getType() != null ? node.getType().getName() : "_";
					String nodeContainerLabel = node.getGraph().getName() == null
							|| node.getGraph().getName().equals("") ? "_" : node.getGraph()
							.getName();
					return nodeLabel + ":" + typeLabel + " [" + nodeContainerLabel + "]";
				}
				return super.getText(object);
			}
		};
	}// constructor
	
	/**
	 * Collects all nodes, which are provided by the combo box in a related
	 * property sheet.
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemPropertyDescriptor#getComboBoxObjects(Object)
	 */
	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		
		Collection<Node> result = new ArrayList<Node>();
		
		if (object instanceof Mapping) {
			Mapping mapping = (Mapping) object;
			
			EObject eobject = mapping.eContainer();
			if (eobject instanceof Rule) {
				Rule rule = (Rule) eobject;
				if (mapping.eContainingFeature() == HenshinPackage.eINSTANCE.getRule_Mappings()) {
					result = rule.getRhs().getNodes();
				} else if (mapping.eContainingFeature() == HenshinPackage.eINSTANCE
						.getRule_MultiMappings()) {
					result.addAll(rule.getLhs().getNodes());
					result.addAll(rule.getRhs().getNodes());
				}
				
			} else if (eobject instanceof NestedCondition) {
				/*
				 * The image of a mapping contained in a nested condition may be
				 * any node in this nested condition.
				 */
				NestedCondition ncond = (NestedCondition) eobject;
				result = ncond.getConclusion().getNodes();
			}
		}// if
		
		return result;
	}// getComboBoxObjects
}// class
