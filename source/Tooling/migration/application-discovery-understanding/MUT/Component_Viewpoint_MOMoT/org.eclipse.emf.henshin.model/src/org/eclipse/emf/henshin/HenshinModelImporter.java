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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.model.Module;

/**
 * Interface for Henshin model importers.
 * @author Christian Krause
 */
public interface HenshinModelImporter {

	/**
	 * Perform an import operation.
	 * @param module The target module.
	 * @param uri URI where the transformation system should be imported from.
	 * @param packages List of packages to be used for the import.
	 */
	IStatus doImport(Module module, URI uri, List<EPackage> packages);
	
	/**
	 * Get the name of this importer.
	 * @return The name.
	 */
	String getImporterName();
	
	/**
	 * Get the list of file extensions supported by this importer.
	 * @return List of file extensions.
	 */
	String[] getImportFileExtensions();

}
