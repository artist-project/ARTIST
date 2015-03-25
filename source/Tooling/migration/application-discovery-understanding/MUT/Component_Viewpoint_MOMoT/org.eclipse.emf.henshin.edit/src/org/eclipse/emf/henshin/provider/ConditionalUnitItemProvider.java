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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.ConditionalUnit;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.provider.trans.GenericReferenceContainerItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.ConditionalUnit} object.
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalUnitItemProvider extends UnitItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	protected GenericReferenceContainerItemProvider ifItemProvider;
	protected GenericReferenceContainerItemProvider thenItemProvider;
	protected GenericReferenceContainerItemProvider elseItemProvider;
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalUnitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * This returns the property descriptors for the adapted class. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			
			addIfPropertyDescriptor(object);
			addThenPropertyDescriptor(object);
			addElsePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the If feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ConditionalUnit_if_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConditionalUnit_if_feature",
						"_UI_ConditionalUnit_type"), HenshinPackage.Literals.CONDITIONAL_UNIT__IF,
				true, false, true, null, null, null));
	}
	
	/**
	 * This adds a property descriptor for the Then feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addThenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ConditionalUnit_then_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ConditionalUnit_then_feature", "_UI_ConditionalUnit_type"),
						HenshinPackage.Literals.CONDITIONAL_UNIT__THEN, true, false, true, null,
						null, null));
	}
	
	/**
	 * This adds a property descriptor for the Else feature. 
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addElsePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_ConditionalUnit_else_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ConditionalUnit_else_feature", "_UI_ConditionalUnit_type"),
						HenshinPackage.Literals.CONDITIONAL_UNIT__ELSE, true, false, true, null,
						null, null));
	}
	
	/**
	 * This returns ConditionalUnit.gif.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalUnit"));
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// Use the pretty-printer provided in the unit implementation:
		return ((ConditionalUnit) object).toString();
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConditionalUnit.class)) {
			case HenshinPackage.CONDITIONAL_UNIT__IF:
			case HenshinPackage.CONDITIONAL_UNIT__THEN:
			case HenshinPackage.CONDITIONAL_UNIT__ELSE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
	
	/**
	 * @generated NOT
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		@SuppressWarnings("unchecked")
		Collection<Object> childrenList = (Collection<Object>) super.getChildren(object);
		childrenList.add(getIfItemProvider((ConditionalUnit) object));
		childrenList.add(getThenItemProvider((ConditionalUnit) object));
		childrenList.add(getElseItemProvider((ConditionalUnit) object));
		return childrenList;
	}
	
	/**
	 * Finds and returns the item provider of a child by its feature literal.
	 * (Helper method)
	 * @generated NOT
	 */
	public Object findChildProvider(EStructuralFeature feature, EObject cu) {
		if (feature == HenshinPackage.Literals.CONDITIONAL_UNIT__IF)
			return getIfItemProvider(cu);
		if (feature == HenshinPackage.Literals.CONDITIONAL_UNIT__THEN)
			return getThenItemProvider(cu);
		if (feature == HenshinPackage.Literals.CONDITIONAL_UNIT__ELSE)
			return getElseItemProvider(cu);
		return null;
	}
	
	/**
	 * @generated NOT
	 */
	public Object getIfItemProvider(EObject unit) {
		if (ifItemProvider == null) {
			ifItemProvider = new GenericReferenceContainerItemProvider(adapterFactory, unit,
					HenshinPackage.eINSTANCE.getConditionalUnit_If(),
					"_UI_ConditionalUnit_if_feature", null);
			getDisposable().add(ifItemProvider);
		}
		return ifItemProvider;
	}
	
	/**
	 * @generated NOT
	 */
	public Object getThenItemProvider(EObject unit) {
		if (thenItemProvider == null) {
			thenItemProvider = new GenericReferenceContainerItemProvider(adapterFactory, unit,
					HenshinPackage.eINSTANCE.getConditionalUnit_Then(),
					"_UI_ConditionalUnit_then_feature", null);
			getDisposable().add(thenItemProvider);
		}
		return thenItemProvider;
	}
	
	/**
	 * @generated NOT
	 */
	public Object getElseItemProvider(EObject unit) {
		if (elseItemProvider == null) {
			elseItemProvider = new GenericReferenceContainerItemProvider(adapterFactory, unit,
					HenshinPackage.eINSTANCE.getConditionalUnit_Else(),
					"_UI_ConditionalUnit_else_feature", null);
			getDisposable().add(elseItemProvider);
		}	
		return elseItemProvider;
	}
	
	/**
	 * @generated NOT
	 */
	protected Command createWrappedCommand(Command command, final EObject owner, final EStructuralFeature feature) {
		if (feature == HenshinPackage.Literals.CONDITIONAL_UNIT__IF
				|| feature == HenshinPackage.Literals.CONDITIONAL_UNIT__THEN
				|| feature == HenshinPackage.Literals.CONDITIONAL_UNIT__ELSE) {
			return new CommandWrapper(command) {
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						affected = Collections.singleton(findChildProvider(feature, owner));
					}
					return affected;
				}
			};
		}
		return command;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass, CommandParameter commandParameter) {
		/*
		 * In case of wrappers and transient items, by default the commands are
		 * not always created adequately, i.e. the feature information of the
		 * transient items contained in the wrappers are often thrown away
		 * instead of taken into account. This is (not generically) fixed by the
		 * following code: The commands and especially command parameters are
		 * build up from scratch taking given information about owner, value and
		 * features into account.
		 */

		// The behavior has to be fixed only if the features refer elements
		if (commandParameter.collection != null && !commandParameter.collection.isEmpty()) {
			Object realObject = unwrap(commandParameter.collection.iterator().next());
			if (realObject != object) {
				CompoundCommand command = new CompoundCommand(CompoundCommand.MERGE_COMMAND_ALL);
				Iterator<?> iterator = commandParameter.collection.iterator();
				Object o;
				while (iterator.hasNext()) {
					o = iterator.next();
					CommandParameter cp = unwrapItemAndCreateCommandParameter(commandParameter, o);
					Command c = null;
					if (cp.feature != null && (cp.feature instanceof EStructuralFeature)
							&& !((EStructuralFeature) cp.feature).isMany()) {
						commandClass = SetCommand.class;
					}
					c = super.createCommand(object, domain, commandClass, cp);
					command.append(c);
					command.setLabel(c.getLabel());
				}
				return command;
			}
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	}
	
	/**
	 * If the given <code>collectionItem</code> implements
	 * {@link IWrapperItemProvider}, it is unwrapped by obtaining a value from
	 * {@link IWrapperItemProvider#getValue getValue}. The unwrapping continues
	 * until a non-wrapper value is returned. This iterative unwrapping is
	 * required because values may be repeatedly wrapped, as children of a
	 * delegating wrapper. Furthermore, the feature contained in the wrapper is
	 * extracted and used to create a CommandParameter. This is a workaround, see 
	 * <a href="http://www.eclipse.org/forums/index.php?t=msg&th=172187&start=0">this discussion</a>.
	 * @generated NOT
	 */
	private CommandParameter unwrapItemAndCreateCommandParameter(CommandParameter oldCP, Object collectionItem) {
		CommandParameter cp = new CommandParameter(oldCP.owner, oldCP.feature, oldCP.value, oldCP.index);
		while (collectionItem instanceof IWrapperItemProvider) {
			IWrapperItemProvider wrapper = (IWrapperItemProvider) collectionItem;
			collectionItem = wrapper.getValue();
			if ((cp.feature == null) && (wrapper.getFeature() != null)) {
				cp.feature = wrapper.getFeature();
			}
		}
		cp.collection = Collections.singletonList(collectionItem);
		return cp;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {	
		return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection),
				owner, feature);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		return createWrappedCommand(
				super.createAddCommand(domain, owner, feature, collection, index), owner, feature);
	}
	
}
