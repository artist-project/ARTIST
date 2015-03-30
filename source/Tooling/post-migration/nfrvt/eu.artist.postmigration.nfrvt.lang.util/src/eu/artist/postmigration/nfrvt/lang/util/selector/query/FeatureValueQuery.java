/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.util.selector.query;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A query selecting objects that have the given value for the specified
 * feature.
 * 
 * @author Martin Fleck
 *
 * @param <T> type of the selected objects
 */
public class FeatureValueQuery<T extends EObject> extends AbstractSelectionQuery<T> {

	private Object value;
	private EStructuralFeature feature;
	
	/**
	 * Creates a query selecting objects of the given type (clazz) that have 
	 * the given value for the specified feature.
	 * @param clazz type of the selected objects
	 * @param feature feature of the selected object
	 * @param value value the given feature must have
	 */
	public FeatureValueQuery(Class<T> clazz, EStructuralFeature feature, Object value) {
		super(clazz);
		if(feature == null)
			throw new IllegalArgumentException("feature cannot be null.");
		
		this.feature = feature;
		this.value = value;		
	}
	
	/**
	 * Feature the selected objects must have.
	 * @return feature
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}

	/**
	 * Value the selected objects must have for {@link #getFeature()}.
	 * @return feature value
	 */
	public Object getValue() {
		return value;
	}
	
	@Override
	public boolean shouldAccept(EObject object) {
		Object featureValue = object.eGet(getFeature());
		return featureValue != null && featureValue.equals(getValue());
	}

}
