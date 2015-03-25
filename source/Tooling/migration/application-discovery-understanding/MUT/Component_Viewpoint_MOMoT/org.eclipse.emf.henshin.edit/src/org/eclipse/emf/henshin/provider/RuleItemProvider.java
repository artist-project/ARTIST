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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.commands.NegligentRemoveCommand;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.provider.filter.IFilterProvider;
import org.eclipse.emf.henshin.provider.trans.GenericReferenceContainerItemProvider;
import org.eclipse.emf.henshin.provider.util.HenshinColorMode;
import org.eclipse.emf.henshin.provider.util.IconUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.henshin.model.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider extends UnitItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider {
	
	// Lhs-Rhs mapping container:
	protected GenericReferenceContainerItemProvider lrMappingContainer;
	
	// Multi mapping container:
	protected GenericReferenceContainerItemProvider multiMappingContainer;
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		return super.getParent(object);
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

			addCheckDanglingPropertyDescriptor(object);
			addInjectiveMatchingPropertyDescriptor(object);
			addJavaImportsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Check Dangling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckDanglingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_checkDangling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_checkDangling_feature", "_UI_Rule_type"),
				 HenshinPackage.Literals.RULE__CHECK_DANGLING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Injective Matching feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInjectiveMatchingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_injectiveMatching_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_injectiveMatching_feature", "_UI_Rule_type"),
				 HenshinPackage.Literals.RULE__INJECTIVE_MATCHING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Java Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJavaImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rule_javaImports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rule_javaImports_feature", "_UI_Rule_type"),
				 HenshinPackage.Literals.RULE__JAVA_IMPORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HenshinPackage.Literals.RULE__LHS);
			childrenFeatures.add(HenshinPackage.Literals.RULE__RHS);
			childrenFeatures.add(HenshinPackage.Literals.RULE__ATTRIBUTE_CONDITIONS);
			// childrenFeatures.add(HenshinPackage.Literals.RULE__MAPPINGS);
			childrenFeatures.add(HenshinPackage.Literals.RULE__MULTI_RULES);
			// childrenFeatures.add(HenshinPackage.Literals.RULE__MULTI_MAPPINGS);
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
	 * @see org.eclipse.emf.henshin.provider.TransformationUnitItemProvider#getChildren(java.lang.Object)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Collection<?> getChildren(Object object) {
		Collection childrenList = super.getChildren(object);
		Rule rule = (Rule) object;
		if (!isFiltered(HenshinPackage.eINSTANCE.getRule_Mappings()))
			childrenList.add(getLrMappingContainer(rule));
		
		if (//rule.getKernelRule()!=null &&
			!isFiltered(HenshinPackage.eINSTANCE.getRule_MultiMappings()))
			childrenList.add(getMultiMappingContainer(rule));
		
		// childrenList.add(new RuleMultiMappingItemProvider(adapterFactory,
		// rule));
		return childrenList;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.provider.TransformationUnitItemProvider#isFiltered(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	protected boolean isFiltered(EStructuralFeature feature) {
		if (adapterFactory instanceof HenshinItemProviderAdapterFactory) {
			IFilterProvider fp = ((HenshinItemProviderAdapterFactory) adapterFactory)
					.getFilterProvider();
			return fp != null ? fp.isFiltered(feature) : false;
		}
		return false;
	}
	
	/**
	 * This returns the image for rules. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Rule rule = (Rule) object;
		Object ruleImage = overlayImage(object, getResourceLocator().getImage("full/obj16/Rule.gif"));
		Object deactivatedImage = getResourceLocator().getImage("full/ovr16/Del_ovr.png");
		if (rule.isActivated() == false) {
			ruleImage = IconUtil.getCompositeImage(ruleImage, deactivatedImage);
		}
		return ruleImage;
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// Use the pretty-printer in the rule implementation:
		return ((Rule) object).toString();
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
		
		switch (notification.getFeatureID(Rule.class)) {
			case HenshinPackage.RULE__MAPPINGS:
			case HenshinPackage.RULE__MULTI_MAPPINGS:
				notifyMappedNodes(notification);
			case HenshinPackage.RULE__LHS:
			case HenshinPackage.RULE__RHS:
			case HenshinPackage.RULE__ATTRIBUTE_CONDITIONS:
			case HenshinPackage.RULE__MULTI_RULES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
						true, false));
				
				return;
		}
		super.notifyChanged(notification);
	}
	
	/*
	 * If a mapping is added or removed this directly affect the visualization
	 * of associated nodes in terms of preserve, create and delete icons.
	 * Consequently, related nodes are notified to be refreshed visually.
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
		}// switch
		
		if (!mappings.isEmpty()) {
			for (Mapping mapping : mappings) {
				Set<Edge> edges = new HashSet<Edge>();
				Set<Node> nodes = new HashSet<Node>();
				if (mapping.getImage() != null) {
					nodes.add(mapping.getImage());
					edges.addAll(mapping.getImage().getAllEdges());
				}
				if (mapping.getOrigin() != null) {
					nodes.add(mapping.getOrigin());
					edges.addAll(mapping.getOrigin().getAllEdges());
				}
				for (Node node : nodes)
					this.fireNotifyChanged(new ViewerNotification(notification, node, false, true));
				for (Edge edge : edges)
					this.fireNotifyChanged(new ViewerNotification(notification, edge, false, true));
			}
		}
	}
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		// super.collectNewChildDescriptors(newChildDescriptors, object);

 		newChildDescriptors.add(createChildParameter(
				HenshinPackage.Literals.UNIT__PARAMETERS,
				HenshinFactory.eINSTANCE.createParameter()));
				
		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.RULE__LHS,
				 HenshinFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.RULE__RHS,
				 HenshinFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.RULE__ATTRIBUTE_CONDITIONS,
				 HenshinFactory.eINSTANCE.createAttributeCondition()));

		//newChildDescriptors.add
		//	(createChildParameter
		//		(HenshinPackage.Literals.RULE__MAPPINGS,
		//		 HenshinFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(HenshinPackage.Literals.RULE__MULTI_RULES,
				 HenshinFactory.eINSTANCE.createRule()));

		//newChildDescriptors.add
		//	(createChildParameter
		//		(HenshinPackage.Literals.RULE__MULTI_MAPPINGS,
		//		 HenshinFactory.eINSTANCE.createMapping()));
	}
	
	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child,
			Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == HenshinPackage.Literals.RULE__LHS ||
			childFeature == HenshinPackage.Literals.RULE__RHS ||
			childFeature == HenshinPackage.Literals.RULE__MAPPINGS ||
			childFeature == HenshinPackage.Literals.RULE__MULTI_MAPPINGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createRemoveCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection)
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		
		if (feature == HenshinPackage.Literals.RULE__MAPPINGS)
			return new NegligentRemoveCommand(domain, owner, feature, collection);
		return super.createRemoveCommand(domain, owner, feature, collection);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createSetCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.lang.Object)
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {		
		if (feature == HenshinPackage.Literals.RULE__LHS || feature == HenshinPackage.Literals.RULE__RHS) {
			if (value == SetCommand.UNSET_VALUE) {
				return UnexecutableCommand.INSTANCE;
			}
		}
		return super.createSetCommand(domain, owner, feature, value);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.provider.HenshinItemProviderAdapter#getToolTip(java.lang.Object)
	 */
	@Override
	public Object getToolTip(Object object) {
		Rule rule = (Rule) object;
		String label = "<p><b>Rule \"" + rule.getName() + "\"</b>";
		if (rule.getDescription() != null && rule.getDescription().length() > 0)
			label += ": <br/> " + rule.getDescription();
		label += "</p>";
		if (!rule.getParameters().isEmpty()) {
			label += "<p><b>Parameters:</b><br/></p>";
			for (Parameter p : rule.getParameters())
				label += "<li><b>" + p.getName() + "</b>: " + p.getDescription() + "</li>";
		}
		return label;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.provider.TransformationUnitItemProvider#isWrappingNeeded(java.lang.Object)
	 */
	@Override
	protected boolean isWrappingNeeded(Object object) {
		return false;
	}
	
	public GenericReferenceContainerItemProvider getLrMappingContainer(Rule rule) {
		if (lrMappingContainer == null) {
			lrMappingContainer = new GenericReferenceContainerItemProvider(adapterFactory, rule,
					HenshinPackage.eINSTANCE.getRule_Mappings(), "_UI_Rule_mappings_feature",
					"full/obj16/Mapping");
			lrMappingContainer.setForceNoWrapping(true);
			getDisposable().add(lrMappingContainer);
		}
		
		return lrMappingContainer;
	}
	
	public GenericReferenceContainerItemProvider getMultiMappingContainer(Rule rule) {
		if (multiMappingContainer == null) {
			multiMappingContainer = new GenericReferenceContainerItemProvider(adapterFactory, rule,
					HenshinPackage.eINSTANCE.getRule_MultiMappings(),
					"_UI_Rule_multiMappings_feature", "full/obj16/Mapping");
			multiMappingContainer.setForceNoWrapping(true);
			getDisposable().add(multiMappingContainer);
		}
		
		return multiMappingContainer;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.provider.UnitItemProvider#getBackground(java.lang.Object)
	 */
	@Override
	public Object getBackground(Object object) {
		
		// Get the default color mode:
		HenshinColorMode colorMode = HenshinColorMode.getDefaultColorMode();
		if (colorMode==null) {
			return super.getBackground(object);
		}
		HenshinColorMode.Color background = colorMode.getColor(HenshinColorMode.BG_RULE);
		if (background!=null) {
			return background.toURI();
		}
		return super.getBackground(object);
		
	}
	
}
