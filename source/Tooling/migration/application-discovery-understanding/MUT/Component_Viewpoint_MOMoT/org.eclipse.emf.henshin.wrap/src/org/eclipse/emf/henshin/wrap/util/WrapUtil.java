/**
 * <copyright>
 * Copyright (c) 2010-2013 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.wrap.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.wrap.WObject;

/**
 * Utility methods for the Henshin wrap model.
 * @author Christian Krause
 */
public class WrapUtil {

	public static List<WObject> getWObjects(List<EObject> eObjects, Map<EObject,WObject> map) {
		List<WObject> wObjects = new ArrayList<WObject>();
		for (EObject eObject : eObjects) {
			WObject wObject = map.get(eObject);
			if (wObject!=null) {
				wObjects.add(wObject);
			}
		}
		return wObjects;
	}

	public static List<EObject> getEObjects(List<EObject> wObjects) {
		List<EObject> eObjects = new ArrayList<EObject>();
		for (EObject eObject : wObjects) {
			if (eObject instanceof WObject) {
				eObject = ((WObject) eObject).getEObject();
			}
			if (eObject!=null) {
				eObjects.add(eObject);
			}
		}
		return eObjects;
	}
	
}
