/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.descriptors;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Module;

/**
 * This PropertyDescriptor populates the combobox for the type of a node with
 * only imported classifiers. The default behavior listed all reachable
 * classifiers, thereby listing classifiers from used packages that are not
 * imported by the TransformationSystem (any more).
 * 
 * @author Gregor Bonifer(gbonifer)
 */
public class NodeTypePropertyDescriptor extends ItemPropertyDescriptor {

	public NodeTypePropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description) {
		super(adapterFactory, resourceLocator, displayName, description,
				HenshinPackage.eINSTANCE.getNode_Type(), true, false, true,
				null, null, null);
	}

	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		c: if (object instanceof Node) {
			Collection<EObject> result = new ArrayList<EObject>();
			EClassifier refType = HenshinPackage.eINSTANCE.getNode_Type()
					.getEType();
			Node node = (Node) object;
			Module module = node.getGraph().getRule().getModule();
			if (module == null)
				break c;
			for (EPackage pack : module.getImports()) {
				TreeIterator<EObject> iter = pack.eAllContents();
				while (iter.hasNext()) {
					EObject eo = iter.next();
					if (refType.isInstance(eo))
						result.add(eo);
				}
			}
			return result;
		}
		return super.getComboBoxObjects(object);
	}

}
