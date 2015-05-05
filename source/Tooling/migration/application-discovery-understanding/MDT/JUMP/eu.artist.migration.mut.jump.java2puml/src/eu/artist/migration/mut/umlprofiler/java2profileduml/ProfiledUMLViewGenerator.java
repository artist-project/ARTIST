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
package eu.artist.migration.mut.umlprofiler.java2profileduml;

import org.eclipse.emf.ecore.resource.Resource;


/**
 * @author Alexander Bergmayr
 *
 */
public interface ProfiledUMLViewGenerator {
	
	/**
	 * The singleton instance of the profiler.
	 */
	ProfiledUMLViewGenerator INSTANCE = eu.artist.migration.mut.umlprofiler.java2profileduml.impl.ProfiledUMLViewGeneratorImpl.init();
	
	/**
	 * 
	 * @param codeModel
	 * @param projectName
	 * @param path
	 */
	void generateProfiledUMLView(Resource codeModel, String projectName, String path);
}
