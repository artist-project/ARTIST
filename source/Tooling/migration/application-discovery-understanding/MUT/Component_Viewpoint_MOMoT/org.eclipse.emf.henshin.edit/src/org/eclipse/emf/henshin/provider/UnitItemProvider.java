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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.provider.filter.IFilterProvider;
import org.eclipse.emf.henshin.provider.trans.GenericReferenceContainerItemProvider;
import org.eclipse.emf.henshin.provider.util.HenshinColorMode;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.Unit} object.
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	/**
	 * Number of parameters which are shown in an unfold way. Any number above
	 * the given leads to a folding of them.
	 */
	public static final int MAX_UNFOLD_PARAMETERS = 5;
	
	/**
	 * Number of parameter mappings which are shown in an unfold way. Any number
	 * above the given leads to a folding of them.
	 */
	public static final int MAX_UNFOLD_PARAMETERMAPPINGS = 5;
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitItemProvider(AdapterFactory adapterFactory) {
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

			addActivatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Name feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(
				0,
				createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
						HenshinPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}
	
	/**
	 * This adds a property descriptor for the Activated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Unit_activated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Unit_activated_feature", "_UI_Unit_type"),
				 HenshinPackage.Literals.UNIT__ACTIVATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(HenshinPackage.Literals.UNIT__PARAMETERS);
			childrenFeatures.add(HenshinPackage.Literals.UNIT__PARAMETER_MAPPINGS);
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
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Collection<?> getChildren(Object object) {
		Unit tu = (Unit) object;
		List childrenList = (List) super.getChildren(object);
		
		if (tu.getParameterMappings().size() > MAX_UNFOLD_PARAMETERS) {
			childrenList.removeAll(tu.getParameterMappings());
			int offset;
			for (offset = 0; offset < childrenList.size(); offset++) {
				Object currentItem = childrenList.get(offset);
				if (!(currentItem instanceof Parameter))
					break;
			}// for
			
			if (!isFiltered(HenshinPackage.eINSTANCE.getUnit_Parameters()))
				childrenList.add(offset, new GenericReferenceContainerItemProvider(adapterFactory,
						tu, HenshinPackage.eINSTANCE.getUnit_ParameterMappings(),
						"_UI_Unit_parameterMappings_feature",
						"full/obj16/ParameterMapping"));
			
		} else if (isFiltered(HenshinPackage.eINSTANCE.getUnit_ParameterMappings())) {
			childrenList.removeAll(tu.getParameterMappings());
		}
		
		if (tu.getParameters().size() > MAX_UNFOLD_PARAMETERMAPPINGS) {
			childrenList.removeAll(tu.getParameters());
			if (!isFiltered(HenshinPackage.eINSTANCE.getUnit_ParameterMappings()))
				childrenList.add(0, new GenericReferenceContainerItemProvider(adapterFactory, tu,
						HenshinPackage.eINSTANCE.getUnit_Parameters(),
						"_UI_Unit_parameters_feature", "full/obj16/Parameter"));
		} else if (isFiltered(HenshinPackage.eINSTANCE.getUnit_Parameters())) {
			childrenList.removeAll(tu.getParameters());
		}
		
		return childrenList;
	}
	
	protected boolean isFiltered(EStructuralFeature feature) {
		if (adapterFactory instanceof HenshinItemProviderAdapterFactory) {
			IFilterProvider fp = ((HenshinItemProviderAdapterFactory) adapterFactory)
					.getFilterProvider();
			return fp != null ? fp.isFiltered(feature) : false;
		}
		return false;
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// Use the pretty-printer in the unit implementation:
		return ((Unit) object).toString();
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

		switch (notification.getFeatureID(Unit.class)) {
			case HenshinPackage.UNIT__ACTIVATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HenshinPackage.UNIT__PARAMETERS:
			case HenshinPackage.UNIT__PARAMETER_MAPPINGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isWrappingNeeded(java.lang.Object)
	 */
	@Override
	protected boolean isWrappingNeeded(Object object) {
		/*
		 * In contrast to units, whose children units are
		 * referred to and thus need to be wrapped up, 
		 * rule have no such referee and do not need to wrap their children.
		 */
		return object instanceof Unit;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createWrapper(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object, int)
	 */
	@Override
	protected Object createWrapper(EObject object, EStructuralFeature feature, Object value,
			int index) {
		
		if (!isWrappingNeeded(object))
			return value;
		
		if (value instanceof Unit) {
			if (value instanceof Rule) {
				return new ReferencedRuleItemProvider((Rule) value, object, feature, index,
						adapterFactory);
			}
			return new DelegatingWrapperTrafoUnitItemProvider(value, object, feature, index,
					adapterFactory);
		}
		
		return super.createWrapper(object, feature, value, index);
	}// createWrapper
	
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
				(HenshinPackage.Literals.UNIT__PARAMETERS,
				 HenshinFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.UNIT__PARAMETER_MAPPINGS,
				 HenshinFactory.eINSTANCE.createParameterMapping()));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getFont(java.lang.Object)
	 */
	@Override
	public Object getFont(Object object) {
		return IItemFontProvider.ITALIC_FONT;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getBackground(java.lang.Object)
	 */
	@Override
	public Object getBackground(Object object) {
		
		// Get the default color mode:
		HenshinColorMode colorMode = HenshinColorMode.getDefaultColorMode();
		if (colorMode==null) {
			return super.getBackground(object);
		}
		HenshinColorMode.Color background = colorMode.getColor(HenshinColorMode.BG_UNIT);
		if (background!=null) {
			return background.toURI();
		}
		return super.getBackground(object);
		
	}
	
}
