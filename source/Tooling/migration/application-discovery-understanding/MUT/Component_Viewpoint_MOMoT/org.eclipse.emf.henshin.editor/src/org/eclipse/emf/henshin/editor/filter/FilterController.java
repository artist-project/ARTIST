/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.editor.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.presentation.HenshinEditorPlugin;
import org.eclipse.emf.henshin.provider.filter.IFilterProvider;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Controller for the filtering of certain elements in the henshin editor. Is
 * passed to HenshinItemProviderAdapterFactory as {@link IFilterProvider} so it
 * can be retrieved in the ItemProviderAdapters.
 * @author Gregor Bonifer
 * 
 */
public class FilterController implements IFilterProvider {
	
	private Collection<IFilterChangeListener> listeners = new ArrayList<IFilterChangeListener>();
	private String prefPrefix = "filterEClassifier_";
	private IPreferenceStore store;
	private Map<EClass, Boolean> filterMap = new HashMap<EClass, Boolean>();
	
	public FilterController() {
		store = HenshinEditorPlugin.getPlugin().getPreferenceStore();
	}
	
	public void addFilterListener(IFilterChangeListener iFilterListener) {
		listeners.add(iFilterListener);
	}
	
	@Override
	public boolean isFiltered(EStructuralFeature feature) {
		if (feature instanceof EReference)
			return isFiltered(((EReference) feature).getEReferenceType());
		return false;
	}
	
	public boolean isFiltered(EClass eClass) {
		if (!filterMap.containsKey(eClass))
			filterMap.put(eClass, load(eClass));
		return filterMap.get(eClass);
	}
	
	protected void setFiltered(boolean isFiltered, EClass eClass) {
		filterMap.put(eClass, isFiltered);
		save(eClass, isFiltered);
		for (IFilterChangeListener listener : listeners)
			listener.filterChanged();
	}
	
	public boolean load(EClass eClass) {
		return store.getBoolean(getKey(eClass));
	}
	
	public void save(EClass classifier, boolean filtered) {
		store.setValue(getKey(classifier), filtered);
	}
	
	private String getKey(EClassifier cl) {
		return prefPrefix + cl.getName();
	}
	
}