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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.BinaryFormula;
import org.eclipse.emf.henshin.model.Formula;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.UnaryFormula;
import org.eclipse.emf.henshin.provider.descriptors.MappingImagePropertyDescriptor;
import org.eclipse.emf.henshin.provider.descriptors.MappingOriginPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.Mapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingItemProvider extends ModelElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	// We need a node listener:
	protected NodeListener nodeListener = new NodeListener();
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingItemProvider(AdapterFactory adapterFactory) {
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

			addOriginPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Origin feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOriginPropertyDescriptor(Object object) {
		
		itemPropertyDescriptors.add(new MappingOriginPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Mapping_origin_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Mapping_origin_feature",
						"_UI_Mapping_type"), HenshinPackage.Literals.MAPPING__ORIGIN));
		
	}
	
	/**
	 * This adds a property descriptor for the Image feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addImagePropertyDescriptor(Object object) {
		
		itemPropertyDescriptors.add(new MappingImagePropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Mapping_image_feature"), getString(
						"_UI_PropertyDescriptor_description", "_UI_Mapping_image_feature",
						"_UI_Mapping_type"), HenshinPackage.Literals.MAPPING__IMAGE));
		
	}
	
	/**
	 * This returns Mapping.gif.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mapping"));
	}
	
	/**
	 * This returns the label text for the adapted class. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Mapping mapping = (Mapping) object;
		String result = getString("_UI_Mapping_type");
		String origin = (mapping.getOrigin() != null) ? getShortNodeName(mapping.getOrigin()) : "?";
		String image = (mapping.getImage() != null) ? getShortNodeName(mapping.getImage()) : "?";
		origin = (origin.isEmpty()) ? "_" : origin;
		image = (image.isEmpty()) ? "_" : image;
		result = result + " " + origin + " -> " + image;
		return result;
	}
	
	/*
	 * Compute a short name for a node.
	 */
	private static String getShortNodeName(Node node) {
		String label = node.toString();
		if (label.startsWith("Node")) {
			label = label.replaceFirst("Node", "").trim();
		}
		return label;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		Object o = super.getParent(object);
		if (o instanceof Rule) {
			Rule rule = (Rule) o;
			Mapping mapping = (Mapping) object;
			RuleItemProvider rip = (RuleItemProvider) getRootAdapterFactory().adapt(rule, IEditingDomainItemProvider.class);
			if (mapping.eContainingFeature() == HenshinPackage.eINSTANCE.getRule_MultiMappings()) {
				return rip.getMultiMappingContainer(rule);
			}
			if (mapping.eContainingFeature() == HenshinPackage.eINSTANCE.getRule_Mappings()) {
				return rip.getLrMappingContainer(rule);
			}
			return super.getParent(object);
		}
		return super.getParent(object);
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
		
		/*
		 * Refresh the corresponding Nodes if the Mapping changes
		 */
		if (notification.getEventType() == Notification.SET) {
			
			Node n1 = (Node) notification.getNewValue();
			Node n2 = (Node) notification.getOldValue();
			
			// Refresh node labels:
			notifyNodeForRefresh(notification, n1);
			notifyNodeForRefresh(notification, n2);
			
			// Refresh the mapping label itself:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			
			// Update the listener:
			removeNodeListener(n2);
			addNodeListener(n1);
		}
		
		// Update the children and notify the rest:
		updateChildren(notification);
		super.notifyChanged(notification);
		
	}
	
	/*
	 * Add our node listener (helper method).
	 */
	private void addNodeListener(Node node) {
		if (node != null) {
			ItemProviderAdapter adapter = 
					(ItemProviderAdapter) this.adapterFactory.adapt(node, Node.class);
			adapter.addListener(nodeListener);
		}
	}	
	
	/*
	 * Remove our node listener (helper method).
	 */
	private void removeNodeListener(Node node) {
		if (node != null) {
			ItemProviderAdapter adapter = 
					(ItemProviderAdapter) this.adapterFactory.adapt(node, Node.class);
			adapter.removeListener(nodeListener);
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
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#unsetTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void unsetTarget(Notifier target) {
		super.unsetTarget(target);
		
		// Remove node listeners if mappings are no longer visible:
		Mapping mapping = (Mapping) target;
		removeNodeListener(mapping.getImage());
		removeNodeListener(mapping.getOrigin());
	
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void setTarget(Notifier target) {
		super.setTarget(target);
		
		// Add node listeners to fetch node renamings in order to update the mapping text:
		Mapping mapping = (Mapping) target;
		addNodeListener(mapping.getImage());
		addNodeListener(mapping.getOrigin());
	
	}
	
	/*
	 * Notifies the given node to refresh its label (only). This affects the
	 * icon in particular, which shows if the node is created, deleted or preserve.
	 */
	private void notifyNodeForRefresh(Notification notification, Node node) {
		if (node != null) {
			ItemProviderAdapter adapter = 
					(ItemProviderAdapter) this.adapterFactory.adapt(node, Node.class);
			Notification notif = new ViewerNotification(notification, node, false, true);
			adapter.fireNotifyChanged(notif);
		}
	}
	
	/**
	 * This listener listens for events on nodes.
	 * @author Stefan Jurack (sjurack)
	 */
	protected class NodeListener implements INotifyChangedListener {
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.edit.provider.INotifyChangedListener#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification notification) {
			
			// Listen for Node renaming events.
			if (notification.getFeature() == HenshinPackage.Literals.NAMED_ELEMENT__NAME
					|| notification.getFeature() == HenshinPackage.Literals.NODE__TYPE) {
				
				// Find the mappings:
				List<Mapping> mappings = findMappingsByNode((Node) notification.getNotifier());
				if (mappings == null) {
					return;
				}
				
				// Update the mapping texts in the editor:
				AdapterFactory fac = MappingItemProvider.this.adapterFactory;
				for (Mapping m : mappings) {
					Notification notif = new ViewerNotification(notification, m, false, true);
					ItemProviderAdapter adapter = (ItemProviderAdapter) fac.adapt(m, Mapping.class);
					adapter.fireNotifyChanged(notif);
				}
				
			}
		}
		
		/*
		 * Finds all mappings related to the given node.
		 */
		protected List<Mapping> findMappingsByNode(Node node) {
			
			List<Mapping> resultList = new ArrayList<Mapping>();
			Graph graph = node.getGraph();
			
			/*
			 * In the following some null-checks are included. While these shall
			 * never occur in normal cases, they might occur in very special
			 * cases, when other applications modify the model, e.g. delete/move
			 * model elements, in a inappropriate order while this editor is open.
			 */
			if (node.getGraph() == null) {
				return null;
			}
			
			if (graph.eContainer() instanceof Rule) {
				Rule rule = (Rule) graph.eContainer();
				collectMappingHelper(node, rule.getMappings(), resultList);
			}
			else if (graph.eContainer() instanceof NestedCondition) {
				NestedCondition nc = (NestedCondition) graph.eContainer();
				List<NestedCondition> allNestedConditions = new ArrayList<NestedCondition>();
				collectNestedConditions(nc, allNestedConditions);
				for (NestedCondition n : allNestedConditions) {
					collectMappingHelper(node, n.getMappings(), resultList);
				}
			}
			return resultList;
		}
		
		/*
		 * Iterates over the given mappingList and returns a resultList with all
		 * mappings the given node is related to, whether as origin or image.
		 */
		private void collectMappingHelper(Node node, List<Mapping> mappingList, List<Mapping> resultList) {
			for (Mapping m : mappingList) {
				if ((m.getImage() == node) || (m.getOrigin() == node)) {
					resultList.add(m);
				}
			}
		}
		
		/**
		 * Collects recursively all {@link NestedCondition}s the given
		 * <code>formula</code> is associated with, i.e. the hierarchy of the
		 * given <code>formula</code>. If the formula is a
		 * {@link NestedCondition} itself, it is added to the
		 * <code>resultList</code>.<br>
		 * Remark: Initially the resultList shall be not null. The given formula
		 * is included in the list if it is a NestedCondition itself.
		 */
		private void collectNestedConditions(Formula formula, List<NestedCondition> resultList) {
			
			if (formula instanceof BinaryFormula) {
				BinaryFormula bf = (BinaryFormula) formula;
				collectNestedConditions(bf.getLeft(), resultList);
				collectNestedConditions(bf.getRight(), resultList);
			}
			else if (formula instanceof UnaryFormula) {
				UnaryFormula uf = (UnaryFormula) formula;
				collectNestedConditions(uf.getChild(), resultList);
			}
			else if (formula instanceof NestedCondition) {
				resultList.add((NestedCondition) formula);
			}
		}
		
	}
	
}
