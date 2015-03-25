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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.provider.descriptors.NodeTypePropertyDescriptor;
import org.eclipse.emf.henshin.provider.util.IconUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.Node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addIncomingPropertyDescriptor(object);
			addOutgoingPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Type feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new NodeTypePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Node_type_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Node_type_feature",
						"_UI_Node_type")));
	}
	
	/**
	 * This adds a property descriptor for the Incoming feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_incoming_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_incoming_feature", "_UI_Node_type"),
				 HenshinPackage.Literals.NODE__INCOMING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Outgoing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_outgoing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_outgoing_feature", "_UI_Node_type"),
				 HenshinPackage.Literals.NODE__OUTGOING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
	
	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HenshinPackage.Literals.NODE__ATTRIBUTES);
		}
		return childrenFeatures;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}
	
	/**
	 * <!-- begin-user-doc --> <br>
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Node node = (Node) object;
		
		// We use the kernel node:
		Node kernelNode = getKernelNode(node);
		if (kernelNode != null){
			return getImage(kernelNode);
		}
		
		// The default image:
		Object defaultImage = overlayImage(object,
				getResourceLocator().getImage("full/obj16/Node.gif"));
		
		if (node.eContainer()==null) {
			return defaultImage;
		}
		
		// Draw a red border around the icon if the node needs attention (i.e. has no type):
		boolean needsAttention = false;
		needsAttention |= (node.getType() == null);
		
		if (needsAttention) {
			Object attentionOverlay = getResourceLocator().getImage("full/ovr16/Attn_ovr.png");
			defaultImage = IconUtil.getCompositeImage(defaultImage, attentionOverlay);
		}
		return defaultImage;
	
	}
	
	/**
	 * This returns the label text for the adapted class. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// We use the pretty-printer in the node implementation:
		return ((Node) object).toString();
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
		updateChildren(notification);
		switch (notification.getFeatureID(Node.class)) {
			case HenshinPackage.NODE__ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
						true, false));
				break;
			case HenshinPackage.NODE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
						false, true));
				break;
			case HenshinPackage.NAMED_ELEMENT__NAME:
				Node node = (Node) notification.getNotifier();
				notifyEdges(node, notification);
				break;
		}
		super.notifyChanged(notification);
	}
	
	/*
	 * Notify edges.
	 */
	private void notifyEdges(Node node, Notification notification) {
		List<Edge> edgeList = new ArrayList<Edge>(node.getIncoming());
		edgeList.addAll(node.getOutgoing());
		if (!edgeList.isEmpty()) {
			ItemProviderAdapter adapter = (ItemProviderAdapter) this.adapterFactory.adapt(
					edgeList.get(0), null);
			for (Edge edge : edgeList) {
				Notification notif = new ViewerNotification(notification, edge, false, true);
				adapter.fireNotifyChanged(notif);
			}
		}
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

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.NODE__ATTRIBUTES,
				 HenshinFactory.eINSTANCE.createAttribute()));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object, int)
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {
		Node node = (Node) owner;
		CompoundCommand cmpCmd = new CompoundCommand(CompoundCommand.LAST_COMMAND_ALL);
		for (Node dependentNode : getDependentNodes(node)) {
			cmpCmd.append(createSetCommand(domain, dependentNode, feature, value, index));
		}
		cmpCmd.append(super.createSetCommand(domain, owner, feature, value, index));
		return cmpCmd.unwrap();
	}
	
	/*
	 * Get the kernel node of a node.
	 */
	private Node getKernelNode(Node node){
		if (node.getGraph() != null && (node.getGraph().isLhs() || node.getGraph().isRhs())) {
			Rule rule = node.getGraph().getRule();
			return rule.getMultiMappings().getOrigin(node);
		}
		return null;
	}
	
	private Collection<Node> getDependentNodes(Node node) {
		if (node.getGraph().isLhs() || node.getGraph().isRhs()) {
			Collection<Node> result = new ArrayList<Node>();
			Rule rule = node.getGraph().getRule();
			for (Rule mRule : rule.getMultiRules()) {
				Node imgNode = getDependentNodeInRule(node, mRule);
				if (imgNode != null)
					result.add(imgNode);
			}
			return result;
		}
		return Collections.emptyList();
	}
	
	private Node getDependentNodeInRule(Node node, Rule rule) {
		for (Mapping m : rule.getMultiMappings())
			if (m.getOrigin() == node)
				return m.getImage();
		return null;
	}
	
}
