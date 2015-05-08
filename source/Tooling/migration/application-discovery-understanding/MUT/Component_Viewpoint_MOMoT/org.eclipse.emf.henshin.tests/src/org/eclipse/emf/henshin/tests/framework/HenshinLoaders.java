/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.framework;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResource;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * Methods for loading henshin files, models and graphs.
 * 
 * @see Tools
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class HenshinLoaders {
	
	public final static String HENSHIN_FILE_EXTENSION = HenshinResource.FILE_EXTENSION;
	
	/*--------------------------------------
	 * LOADERS
	 * ------------------------------------- */

	/**
	 * Load a henshin file
	 * 
	 * @param fileName
	 *            Path to the henshin file
	 * @return Module
	 */
	public static Module loadHenshin(String fileName) {
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		return resourceSet.getModule(fileName, false);
	}
	
	/**
	 * Load model from file and create an {@link EGraph}
	 * 
	 * @param modelFileName
	 *            Path to the model file
	 * @param modelFileExt
	 *            model file extension
	 * @return EmfGraph
	 */
	public static EGraph loadGraph(String modelFileName, String modelFileExt) {
		HenshinResourceSet resourceSet = new HenshinResourceSet();
		resourceSet.registerXMIResourceFactories(modelFileExt);
		Resource resource = resourceSet.getResource(modelFileName);
		return new EGraphImpl(resource);
	}
	
	public static EGraph loadGraph(URI graphUri) {
		Resource resourceModel = new ResourceSetImpl().getResource(graphUri, true);
		EGraph egr = InterpreterFactory.INSTANCE.createEGraph();
		egr.addTree(resourceModel.getContents().get(0));
		return egr;
	}
	
}
