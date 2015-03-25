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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.ParameterMapping;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.provider.descriptors.ParameterMappingPropertyDescriptor;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.emf.henshin.model.ParameterMapping} object. 
 * <!-- begin-user-doc --> 
 * <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class ParameterMappingItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	
	// Parameter listener:
	private ParameterListener parameterListener = new ParameterListener();
	
	/**
	 * This constructs an instance from a factory and a notifier. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMappingItemProvider(AdapterFactory adapterFactory) {
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
			
			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Source feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ParameterMappingPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_ParameterMapping_source_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ParameterMapping_source_feature", "_UI_ParameterMapping_type"),
				HenshinPackage.Literals.PARAMETER_MAPPING__SOURCE));
	}
	
	/**
	 * This adds a property descriptor for the Target feature. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ParameterMappingPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_ParameterMapping_target_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ParameterMapping_target_feature", "_UI_ParameterMapping_type"),
				HenshinPackage.Literals.PARAMETER_MAPPING__TARGET));
	}
	
	/**
	 * This returns ParameterMapping.gif. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator()
				.getImage("full/obj16/ParameterMapping.gif"));
	}
	
	/**
	 * This returns the label text for the adapted class. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ParameterMapping pmapping = (ParameterMapping) object;
		Unit unit = (Unit) pmapping.eContainer();
		StringBuffer result = new StringBuffer(getString("_UI_ParameterMapping_type"));
		String src = calculateParameterString(pmapping.getSource(), unit);
		String trg = calculateParameterString(pmapping.getTarget(), unit);
		result.append(" ").append(src).append(" -> ").append(trg);
		return result.toString();
	}
	
	/*
	 * Helper.
	 */
	private String calculateParameterString(Parameter p, Unit owningUnit) {
		final String EMPTY_STRING = "_";
		final String UNSET_PARAMETER = "?";
		if (p != null) {
			StringBuffer buf = new StringBuffer();
			if (!p.getUnit().equals(owningUnit)) {
				final String n1 = p.getUnit().getName();
				buf.append((n1 == null || n1.trim().isEmpty()) ? EMPTY_STRING : n1);
				buf.append(".");
			}
			String n2 = p.getName();
			buf.append((n2 == null || n2.trim().isEmpty()) ? EMPTY_STRING : n2);
			return buf.toString();
		} else {
			return UNSET_PARAMETER;
		}
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
			ParameterMapping parmap = (ParameterMapping) notification.getNotifier();
			ItemProviderAdapter adapter = (ItemProviderAdapter) this.adapterFactory.adapt(parmap,
					null);
			Notification notif = new ViewerNotification(notification, parmap, false, true);
			adapter.fireNotifyChanged(notif);
			
			Parameter p_new = (Parameter) notification.getNewValue();
			Parameter p_old = (Parameter) notification.getOldValue();
			removeParameterListener(p_old);
			addParameterListener(p_new);
		}
		updateChildren(notification);
		super.notifyChanged(notification);
	}
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
	
	/**
	 * Return the resource locator for this item provider's resources. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HenshinEditPlugin.INSTANCE;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#setTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void setTarget(Notifier target) {
		super.setTarget(target);
		
		// Add parameter listeners to fetch parameter renamings in order to 
		// update the parameter mapping visualization:
		ParameterMapping mapping = (ParameterMapping) target;
		addParameterListener(mapping.getSource());
		addParameterListener(mapping.getTarget());
	
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#unsetTarget(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	public void unsetTarget(Notifier target) {
		super.unsetTarget(target);
		
		// Remove parameter listeners, if parameter mappings are no longer visible
		ParameterMapping mapping = (ParameterMapping) target;
		removeParameterListener(mapping.getSource());
		removeParameterListener(mapping.getTarget());
	
	}
	
	private void addParameterListener(Parameter parameter) {
		if (parameter != null) {
			ItemProviderAdapter parameterAdapter = (ItemProviderAdapter) this.adapterFactory.adapt(
					parameter, Parameter.class);
			parameterAdapter.addListener(parameterListener);
			
			ItemProviderAdapter ruleAdapter = (ItemProviderAdapter) this.adapterFactory.adapt(
					parameter.getUnit(), Unit.class);
			ruleAdapter.addListener(parameterListener);
		}
	}
	
	private void removeParameterListener(Parameter parameter) {
		if (parameter != null) {
			ItemProviderAdapter parameterAdapter = (ItemProviderAdapter) this.adapterFactory.adapt(
					parameter, Parameter.class);
			parameterAdapter.removeListener(parameterListener);
			
			/*
			 * Check if the parameter is still contained in a unit. This is not
			 * the case if source/target parameter is deleted from the model. If
			 * this is the case, we are not able to remove the listener.
			 */
			if (parameter.getUnit() != null) {
				ItemProviderAdapter ruleAdapter = (ItemProviderAdapter) this.adapterFactory.adapt(
						parameter.getUnit(), Unit.class);
				ruleAdapter.removeListener(parameterListener);
			}
		}
	}
	
	/**
	 * This Listener listens for renaming events on parameters and its container units.
	 * @author Stefan Jurack (sjurack)
	 * @author Felix Rieger
	 */
	private class ParameterListener implements INotifyChangedListener {
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.emf.edit.provider.INotifyChangedListener#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification notification) {
			
			// we care for renaming events only
			if (notification.getFeature() == HenshinPackage.Literals.NAMED_ELEMENT__NAME) {
				
				// ...especially renaming events of Parameters
				if (notification.getNotifier() instanceof Parameter) {
					List<ParameterMapping> pms = findParameterMappings((Parameter) notification
							.getNotifier());
					
					notifyParameterMappingItemProvider(notification, pms);
				}
				
				// ...and renaming events of parameter's Units
				if (notification.getNotifier() instanceof Unit) {
					
					Unit unit = (Unit) notification.getNotifier();
					for (Parameter param : unit.getParameters()) {
						List<ParameterMapping> pms = parameterListener.findParameterMappings(param);
						notifyParameterMappingItemProvider(notification, pms);
					}
				}
				
			}
			
		}
		
		private void notifyParameterMappingItemProvider(Notification notification,
				List<ParameterMapping> pms) {
			final AdapterFactory fac = ParameterMappingItemProvider.this.adapterFactory;
			for (ParameterMapping pm : pms) {
				// update the mapping visualization in the editor
				Notification notif = new ViewerNotification(notification, pm, false, true);
				ItemProviderAdapter adapter = (ItemProviderAdapter) fac.adapt(pm,
						ParameterMapping.class);
				adapter.fireNotifyChanged(notif);
			}
		}
		
		/*
		 * Finds all {@link ParameterMapping}s related to the given {@link Parameter}.
		 */
		private final List<ParameterMapping> findParameterMappings(Parameter para) {
			/*
			 * According to the semantics of our Henshin model, Parameters can
			 * only be mapped by a ParameterMapping contained in the same
			 * container as the Parameter or in a parent unit of that container.
			 */
			List<ParameterMapping> result = new ArrayList<ParameterMapping>();
			Unit tu = (Unit) para.eContainer();
			
			collectRelatedParameterMappings(tu, para, result);
			
			// check the parent unit
			Module module = (Module) tu.eContainer();
			for (Unit parent : module.getUnits()) {
				if (parent.getSubUnits(false).contains(tu)) {
					collectRelatedParameterMappings(parent, para, result);
				}
			}
			return result;
		}
		
		/**
		 * Return those {@link ParameterMapping}s contained in <code>unit</code>, 
		 * which refer to <code>para</code>.
		 */
		private void collectRelatedParameterMappings(Unit unit, Parameter para, List<ParameterMapping> result) {
			
			for (ParameterMapping pm : unit.getParameterMappings()) {
				if (pm.getSource() == para || pm.getTarget() == para)
					result.add(pm);
			}
		}

	}
	
}
