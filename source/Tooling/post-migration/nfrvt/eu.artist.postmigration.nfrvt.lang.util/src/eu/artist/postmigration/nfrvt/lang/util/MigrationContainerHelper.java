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
package eu.artist.postmigration.nfrvt.lang.util;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ISelectionQuery;

/**
 * A helper class that evaluates whether one EObject is included in one or
 * many other EObjects. This class is mostly used for {@link ISelectionQuery}
 * as it not only checks the containment relation, but also specific other
 * cases for the use in ARTIST, e.g., it follows the property reference of
 * an applied property.
 * 
 * @author Martin Fleck
 *
 */
public class MigrationContainerHelper {
	private MigrationComparator comparator = new MigrationComparator();
	
	private PolymorphicDispatcher<Boolean> checkAncestorDispatcher = new PolymorphicDispatcher<>(
			"checkWithin", 2, 2, Collections.singletonList(this));
	
	/**
	 * Returns true if the given eObject is included in the given container 
	 * objects, false otherwise.
	 * @param containers object contents to be searched
	 * @param eObject object to be searched for
	 * @return true, if eObject is included in the given containers
	 */
	public boolean isWithin(List<? extends EObject> containers, EObject eObject) {
		return checkAncestorDispatcher.invoke(containers, eObject); // delegate
	}
	
	/**
	 * Returns true if the given eObject is included in the given container 
	 * object, false otherwise.
	 * @param container object content to be searched
	 * @param eObject object to be searched for
	 * @return true, if eObject is included in the given container
	 */
	public boolean isWithin(EObject container, EObject eObject) {
		return checkAncestorDispatcher.invoke(container, eObject); // delegate
	}
	
	protected boolean checkWithin(List<? extends EObject> containers, EObject eObject) {
		if(eObject == null || containers == null || containers.isEmpty())
			return false;
		
		boolean isWithin = false;
		for(EObject container : containers) {
			isWithin = isWithin(container, eObject);
			if(isWithin)
				return true;
		}
		return false;
	}
	
	protected boolean checkWithin(EObject container, EObject eObject) {
		if(eObject == null || container == null)
			return false;
		
		try {
			if(comparator.equals(container, eObject)) 
				return true;
		} catch(Exception e) {
			;
		}
		
		for(EObject child : container.eContents()) {
			if(isWithin(child, eObject))
				return true;
		}
		return false;
	}
	
	protected boolean checkWithin(AppliedQuantitativePropertyExpression container, EObject eObject) {
		if(isWithin(container.getValue(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(AppliedProperty container, EObject eObject) {
		if(isWithin(container.getProperty(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(QualitativeProperty container, EObject eObject) {
		if(isWithin(container.getProperties(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(QuantitativeProperty container, EObject eObject) {
		if(isWithin(container.getType(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(QuantitativePropertyExpression container, EObject eObject) {
		if(isWithin(container.getValue(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(Workload container, EObject eObject) {
		if(isWithin(container.getActivity(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
	
	protected boolean checkWithin(PropertyImpact container, EObject eObject) {
		if(isWithin(container.getTarget(), eObject))
			return true;
		return checkWithin((EObject)container, eObject);
	}
}
