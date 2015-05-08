/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.presentation;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheetSorter;

/**
 * This property sheet page provide a specialised sorting according to property
 * sheet entries given by Henshin related item providers.
 * 
 * @author Stefan Jurack
 * 
 */
public class HenshinPropertySheetPage extends ExtendedPropertySheetPage {
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.PropertySheetPage#createControl
	 * (org.eclipse.swt.widgets.Composite)
	 */
	public HenshinPropertySheetPage(AdapterFactoryEditingDomain editingDomain) {
		super(editingDomain);
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		/*
		 * Leave the order of properties as is, i.e. as it is predefined by
		 * ItemProviders
		 */
		setSorter(new PropertySheetSorter() {
			
			/*
			 * (non-Javadoc)
			 * @see org.eclipse.ui.views.properties.PropertySheetSorter #compare
			 * (org.eclipse.ui.views.properties.IPropertySheetEntry,
			 * org.eclipse.ui.views.properties.IPropertySheetEntry)
			 */
			@Override
			public int compare(IPropertySheetEntry entryA, IPropertySheetEntry entryB) {
				return 0;
			}// compare
			
			/*
			 * (non-Javadoc)
			 * @see org.eclipse.ui.views.properties.PropertySheetSorter
			 * #compareCategories(java.lang.String, java.lang.String)
			 */
			@Override
			public int compareCategories(String categoryA, String categoryB) {
				return 0;
			}// compareCategories
		});
		
	}
	
}
