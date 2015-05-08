/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpacePackage;

/**
 * A resource set implementation for state spaces. 
 * Provides some convenience methods for easy use and supports 
 * automatic resolving of relative file URIs using a base 
 * directory as implemented in {@link HenshinResourceSet}.
 * 
 * @author Christian Krause
 */
public class StateSpaceResourceSet extends HenshinResourceSet {
	
	/**
	 * Constructor which sets the base directory for this resource set.
	 * @param baseDir Base directory (can be also <code>null</code>).
	 */
	public StateSpaceResourceSet(String baseDir) {
		super(baseDir);
		StateSpacePackage.eINSTANCE.getName();
		getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				StateSpaceResource.FILE_EXTENSION, new StateSpaceResourceFactory());
	}

	/**
	 * Constructor without base directory.
	 */
	public StateSpaceResourceSet() {
		this(null);
	}

	/**
	 * Convenience method for loading a {@link StateSpace} from a 
	 * file given as a path and file name.
	 * @param path Possibly relative path and file name of a state space resource.
	 * @return The contained {@link StateSpace}.
	 */
	public StateSpace getStateSpace(String path) {
		Resource resource = getResource(path);
		if (resource!=null) {
			for (EObject object : resource.getContents()) {
				if (object instanceof StateSpace) {
					return (StateSpace) object;
				}
			}
		}
		return null;
	}
	
	/**
	 * Convenience method for loading a {@link Model} from a
	 * file given as a path and file name.
	 * @param path Possibly relative path and file name of a model resource.
	 * @return The loaded model.
	 */
	public Model getModel(String path) {
		Resource resource = getResource(path);
		if (resource!=null) {
			return StateSpaceFactory.eINSTANCE.createModel(resource);
		} else {
			return null;
		}
	}

}
