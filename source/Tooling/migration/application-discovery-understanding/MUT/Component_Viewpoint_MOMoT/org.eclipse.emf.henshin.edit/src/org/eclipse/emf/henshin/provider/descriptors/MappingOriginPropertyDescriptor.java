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
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Property descriptor for the <code>origin</code> feature of model class
 * {@link Mapping}. This descriptor collects nodes which are provided as a combo
 * box. In particular, only those nodes shall be collected, which are suitable
 * as origin i.e. nodes have to be located in a LHS graph.
 * 
 * @author Stefan Jurack
 * 
 */
public class MappingOriginPropertyDescriptor extends ItemPropertyDescriptor {
	
	/**
	 * @param adapterFactory
	 * @param resourceLocator
	 * @param displayName
	 * @param description
	 * @param feature
	 */
	public MappingOriginPropertyDescriptor(AdapterFactory adapterFactory,
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
	 * 
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
					result = rule.getLhs().getNodes();
				} else if (mapping.eContainingFeature() == HenshinPackage.eINSTANCE
						.getRule_MultiMappings()) {
					EObject ruleContainer = rule.eContainer();
					if (ruleContainer instanceof Rule) {
						Rule containerRule = (Rule) ruleContainer;
						result.addAll(containerRule.getLhs().getNodes());
						result.addAll(containerRule.getRhs().getNodes());
					}
				}
			} else if (eobject instanceof NestedCondition) {
				/*
				 * Origin in a nested condition may be any node in the
				 * containing graph of this nested condition
				 */
				Formula f = (Formula) eobject;
				/*
				 * nested conditions may be 'nested' ;-) so we have to find the
				 * container graph beyond (possibly) several formula nestings
				 */
				while (f.eContainer() instanceof Formula)
					f = (Formula) f.eContainer();
				
				Graph graph = (Graph) f.eContainer();
				result = graph.getNodes();
			}
		}// if
		
		if (result != null) {
			return Collections.unmodifiableCollection(result);
		} else {
			return super.getComboBoxObjects(object);
		}// if else
	}// getComboBoxObjects
	
}// class
