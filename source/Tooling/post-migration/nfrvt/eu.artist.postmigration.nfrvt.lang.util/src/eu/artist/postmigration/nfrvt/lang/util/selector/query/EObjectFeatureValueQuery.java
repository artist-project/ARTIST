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
 * A query selecting {@link EObject}s that have the given value for the specified
 * feature.
 * 
 * @author Martin Fleck
 */
public class EObjectFeatureValueQuery extends FeatureValueQuery<EObject> {
	/**
	 * Creates a query selecting {@link EObject}s that have 
	 * the given value for the specified feature.
	 * @param feature feature of the selected object
	 * @param value value the given feature must have
	 */
	public EObjectFeatureValueQuery(EStructuralFeature feature, Object value) {
		super(EObject.class, feature, value);
	}
}
