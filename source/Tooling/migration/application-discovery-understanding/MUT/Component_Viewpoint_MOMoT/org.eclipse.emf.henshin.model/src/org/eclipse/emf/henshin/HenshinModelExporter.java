/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Module;

/**
 * Interface for Henshin model exporters.
 * @author Christian Krause
 */
public interface HenshinModelExporter {

	/**
	 * Perform an export operation.
	 * @param module Module to be exported.
	 * @param uri URI where the transformation system should be exported to.
	 */
	IStatus doExport(Module module, URI uri);
	
	/**
	 * Get the name of this exporter.
	 * @return The name.
	 */
	String getExporterName();
	
	/**
	 * Get the list of file extensions supported by this exporter.
	 * @return List of file extensions.
	 */
	String[] getExportFileExtensions();

}
