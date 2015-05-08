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
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.commands.GraphComplexUnsetCommand;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.provider.trans.NestedConditionMappingItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.NestedCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedConditionItemProvider extends ModelElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	/**
	 * Number of mappings which are shown in an unfold way. 
	 * Any number above the given leads to a folding of them.
	 * @generated NOT
	 */
	public static final int MAX_UNFOLD_MAPPINGS = 5;
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedConditionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(HenshinPackage.Literals.NESTED_CONDITION__CONCLUSION);
			childrenFeatures.add(HenshinPackage.Literals.NESTED_CONDITION__MAPPINGS);
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
	 * This returns NestedCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NestedCondition"));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		@SuppressWarnings("unchecked")
		Collection<Object> childrenList = (Collection<Object>) super.getChildren(object);
		NestedCondition nc = (NestedCondition) object;
		if (nc.getMappings().size() > MAX_UNFOLD_MAPPINGS) {
			childrenList.removeAll(nc.getMappings());
			childrenList.add(new NestedConditionMappingItemProvider(adapterFactory, nc));
		}
		return childrenList;
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NestedCondition_type");
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
		
		switch (notification.getFeatureID(NestedCondition.class)) {
			case HenshinPackage.NESTED_CONDITION__CONCLUSION:
			case HenshinPackage.NESTED_CONDITION__MAPPINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
						true, false));
				notifyMappedNodes(notification);
				return;
		}
		super.notifyChanged(notification);
	}
	
	/*
	 * If a mapping is added or removed this directly affect the visualization
	 * of associated nodes in terms of preserve and forbid icons. Consequently,
	 * related nodes are notified to be refreshed visually.
	 */
	@SuppressWarnings("unchecked")
	private void notifyMappedNodes(Notification notification) {
		List<Mapping> mappings = new ArrayList<Mapping>();
		switch (notification.getEventType()) {
			case Notification.REMOVE:
				mappings.add((Mapping) notification.getOldValue());
				break;
			case Notification.ADD:
				mappings.add((Mapping) notification.getNewValue());
				break;
			case Notification.ADD_MANY:
				mappings.addAll((Collection<Mapping>) notification.getNewValue());
				break;
			case Notification.REMOVE_MANY:
				mappings.addAll((Collection<Mapping>) notification.getOldValue());
				break;
		}		
		if (!mappings.isEmpty()) {
			for (Mapping mapping : mappings) {
				if (mapping.getImage() != null) {
					notifyNodeForRefresh(notification, mapping.getImage());
				}
				if (mapping.getOrigin() != null) {
					notifyNodeForRefresh(notification, mapping.getOrigin());
				}
			}
		}
	}
	
	/*
	 * Notifies the given node to refresh its label (only). This affects the
	 * icon in particular, which shows if the node is created, deleted or
	 * preserve.
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
				(HenshinPackage.Literals.NESTED_CONDITION__CONCLUSION,
				 HenshinFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.NESTED_CONDITION__MAPPINGS,
				 HenshinFactory.eINSTANCE.createMapping()));
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == HenshinPackage.eINSTANCE.getNestedCondition_Conclusion()) {
			return UnexecutableCommand.INSTANCE;
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {		
		if (feature == HenshinPackage.Literals.NESTED_CONDITION__CONCLUSION) {
			if (value == SetCommand.UNSET_VALUE) {
				return new GraphComplexUnsetCommand(domain, owner, feature);
			}
		}
		return super.createSetCommand(domain, owner, feature, value);
	}
	
}
