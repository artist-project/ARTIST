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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.provider.descriptors.EdgeSourcePropertyDescriptor;
import org.eclipse.emf.henshin.provider.descriptors.EdgeTargetPropertyDescriptor;
import org.eclipse.emf.henshin.provider.descriptors.EdgeTypePropertyDescriptor;
import org.eclipse.emf.henshin.provider.util.IconUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.Edge} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("unused")
public class EdgeItemProvider extends ModelElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActionPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphElement_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphElement_action_feature", "_UI_GraphElement_type"),
				 HenshinPackage.Literals.GRAPH_ELEMENT__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		
		itemPropertyDescriptors.add(new EdgeSourcePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Edge_source_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Edge_source_feature",
						"_UI_Edge_type"), HenshinPackage.Literals.EDGE__SOURCE));
	}
	
	/**
	 * This adds a property descriptor for the Target feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new EdgeTargetPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Edge_target_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Edge_target_feature",
						"_UI_Edge_type"), HenshinPackage.Literals.EDGE__TARGET));
	}
	
	/**
	 * This adds a property descriptor for the Type feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new EdgeTypePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Edge_type_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Edge_type_feature",
						"_UI_Edge_type"), HenshinPackage.Literals.EDGE__TYPE));
	}
	
	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Edge_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Edge_index_feature", "_UI_Edge_type"),
				 HenshinPackage.Literals.EDGE__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Edge.gif. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Edge kernelEdge = getKernelEdge((Edge) object);		
		if (kernelEdge != null){
			return getImage(kernelEdge);
		}
		Edge edge = (Edge) object;
		if (edge.eContainer() == null) {
			return getResourceLocator().getImage("full/obj16/Edge");
		}
		Object edgeImage = null;
		
		boolean needsAttention = false;
		needsAttention |= (edge.getType() == null);
		needsAttention |= (edge.getSource() == null);
		needsAttention |= (edge.getTarget() == null);
		
		if (edge.getType() != null && edge.getType().isContainment()) {
			edgeImage = getResourceLocator().getImage("full/obj16/ContainmentEdge.gif");
		} else if (edge.getType() != null && edge.getType().isMany()) {
			edgeImage = IconUtil.getCompositeImage(
					getResourceLocator().getImage("full/obj16/Edge"), 
					getResourceLocator().getImage("full/obj16/Edge"), 1, 2);
		} else {
			edgeImage = getResourceLocator().getImage("full/obj16/Edge");
		}
		
		if (needsAttention) {
			Object attentionOverlay = getResourceLocator().getImage("full/ovr16/Attn_ovr.png");
			edgeImage = IconUtil.getCompositeImage(edgeImage, attentionOverlay);
		}
		
		return edgeImage;
		
	}
		
	/**
	 * This returns the label text for the adapted class. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// We use the pretty-printer in the edge implementation:
		return ((Edge) object).toString();
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		
		if (notification.getEventType() == Notification.SET) {
			Edge edge = (Edge) notification.getNotifier();
			Notification notif = new ViewerNotification(notification, edge, false, true);
			this.fireNotifyChanged(notif);
			Graph graph = edge.getGraph();
			if (graph != null) {
				GraphItemProvider gip = (GraphItemProvider) adapterFactory
						.adapt(graph, Graph.class);
				gip.notifyCorrespondingEdges(graph, notification);
			}
		}
		updateChildren(notification);
		super.notifyChanged(notification);
	}
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
	
	/*
	 * Helper method: get the kernel edge of an edge.
	 */
	private Edge getKernelEdge(Edge edge){
		if (edge.getGraph() != null && (edge.getGraph().isLhs() || edge.getGraph().isRhs())) {
			Rule rule = edge.getGraph().getRule();
			return rule.getMultiMappings().getOrigin(edge);
		}
		return null;
	} 
		
}
