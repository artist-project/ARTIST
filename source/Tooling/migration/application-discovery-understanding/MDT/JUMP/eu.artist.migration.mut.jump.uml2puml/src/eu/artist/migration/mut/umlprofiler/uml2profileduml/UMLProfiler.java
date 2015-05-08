/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mut.umlprofiler.uml2profileduml;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Alexander Bergmayr
 *
 */
public interface UMLProfiler {
	
	/**
	 * The singleton instance of the profiler.
	 */
	UMLProfiler INSTANCE = eu.artist.migration.mut.umlprofiler.uml2profileduml.impl.UMLProfilerImpl.init();

	/**
	 * 
	 * @param codeModel
	 * @param traceModel
	 * @param umlModel
	 * @param profileModels
	 */
	void runProfileApplication(Resource codeModel, Resource traceModel,
			Resource umlModel, Collection<Resource> profileModels, String umlProfileStoreDirectory);
	
	/**
	 * 
	 * @param codeModel
	 * @param traceModel
	 * @param umlModel
	 */
	void runProfileApplication(Resource codeModel, Resource traceModel,
			Resource umlModel, Collection<Resource> profileModels);

}
