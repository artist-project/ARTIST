/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

/**
 * Interface for state space exporters.
 * 
 * @author Christian Krause
 */
public interface StateSpaceExporter {
	
	/**
	 * Perform the export operation.
	 * @param stateSpace State space to be exported.
	 * @param uri URI where the state space should be exported to.
	 * @param monitor Progress monitor.
	 * @throws StateSpaceException On state space errors. 
	 * @throws Exception On I/O errors.
	 */
	void doExport(StateSpace stateSpace, URI uri, String parameters, IProgressMonitor monitor) throws IOException, StateSpaceException;
	
	/**
	 * Get the name of this exported.
	 * @return The name.
	 */
	String getName();
	
	/**
	 * Get the list of file extensions supported by this exporter.
	 * @return List of file extensions.
	 */
	String[] getFileExtensions();
	
	/**
	 * Set the state space index to be used.
	 * @param index State space index.
	 */
	void setStateSpaceIndex(StateSpaceIndex index);

}
