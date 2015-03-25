/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.henshin.provider.util.IItemToolTipProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * AdapterFactory-based LabelProvider which implements {@link IToolTipProvider}
 * by delegating to an adapter implementing {@link IItemToolTipProvider}.
 * 
 * @author Gregor Bonifer
 * 
 */
public class AdapterFactoryLabelFontColorToolTipProvider extends
		AdapterFactoryLabelProvider.FontAndColorProvider implements IColorProvider, IFontProvider,
		ITableColorProvider, ITableFontProvider, IToolTipProvider {
	
	public AdapterFactoryLabelFontColorToolTipProvider(AdapterFactory arg0, Viewer arg1) {
		super(arg0, arg1);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.editor.util.IToolTipProvider#getToolTip(java.lang.Object)
	 */
	@Override
	public Object getToolTip(Object object) {
		IItemToolTipProvider tipProvider = getItemToolTipProvider(object);
		return tipProvider == null ? null : tipProvider.getToolTip(object);
	}
	
	protected IItemToolTipProvider getItemToolTipProvider(Object object) {
		Object adapter = adapterFactory.adapt(object, IItemToolTipProvider.class);
		if (adapter instanceof IItemToolTipProvider)
			return ((IItemToolTipProvider) adapter);
		return null;
	}
	
}
