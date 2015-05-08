/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.util;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Delegates calls to a given IItemPropertyDescritor. This class is intended for
 * easy overriding of methods without sub-classing a specific implementation.
 * This is particularly convenient since ItemPropertyDescriptor provides a large
 * variety of different constructors.
 * 
 * @author Gregor Bonifer
 * 
 */
public class ItemPropertyDescriptorDecorator implements IItemPropertyDescriptor {
	
	IItemPropertyDescriptor propertyDescriptor;
	
	public ItemPropertyDescriptorDecorator(IItemPropertyDescriptor propertyDescriptor) {
		super();
		this.propertyDescriptor = propertyDescriptor;
	}
	
	public Object getPropertyValue(Object object) {
		return propertyDescriptor.getPropertyValue(object);
	}
	
	public boolean isPropertySet(Object object) {
		return propertyDescriptor.isPropertySet(object);
	}
	
	public boolean canSetProperty(Object object) {
		return propertyDescriptor.canSetProperty(object);
	}
	
	public void resetPropertyValue(Object object) {
		propertyDescriptor.resetPropertyValue(object);
	}
	
	public void setPropertyValue(Object object, Object value) {
		propertyDescriptor.setPropertyValue(object, value);
	}
	
	public String getCategory(Object object) {
		return propertyDescriptor.getCategory(object);
	}
	
	public String getDescription(Object object) {
		return propertyDescriptor.getDescription(object);
	}
	
	public String getDisplayName(Object object) {
		return propertyDescriptor.getDisplayName(object);
	}
	
	public String[] getFilterFlags(Object object) {
		return propertyDescriptor.getFilterFlags(object);
	}
	
	public Object getHelpContextIds(Object object) {
		return propertyDescriptor.getHelpContextIds(object);
	}
	
	public String getId(Object object) {
		return propertyDescriptor.getId(object);
	}
	
	public IItemLabelProvider getLabelProvider(Object object) {
		return propertyDescriptor.getLabelProvider(object);
	}
	
	public boolean isCompatibleWith(Object object, Object anotherObject,
			IItemPropertyDescriptor anotherPropertyDescriptor) {
		return propertyDescriptor
				.isCompatibleWith(object, anotherObject, anotherPropertyDescriptor);
	}
	
	public Object getFeature(Object object) {
		return propertyDescriptor.getFeature(object);
	}
	
	public boolean isMany(Object object) {
		return propertyDescriptor.isMany(object);
	}
	
	public Collection<?> getChoiceOfValues(Object object) {
		return propertyDescriptor.getChoiceOfValues(object);
	}
	
	public boolean isMultiLine(Object object) {
		return propertyDescriptor.isMultiLine(object);
	}
	
	public boolean isSortChoices(Object object) {
		return propertyDescriptor.isSortChoices(object);
	}
	
}
