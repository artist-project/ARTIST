/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.importers;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.HenshinModelImporter;
import org.eclipse.emf.henshin.model.Module;

/**
 * Henshin model importer for AGG.
 * @author Christian Krause
 */
public class HenshinAGGImporter implements HenshinModelImporter {

	/**
	 * ID of this model importer.
	 */
	public static final String EXPORTER_ID = "org.eclipse.emf.henshin.agg2henshin";
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.HenshinModelImporter#doImport(org.eclipse.emf.henshin.model.Module, org.eclipse.emf.common.util.URI, java.util.List)
	 */
	@Override
	public IStatus doImport(Module module, URI uri, List<EPackage> packages) {
		return Status.OK_STATUS;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.HenshinModelImporter#getImporterName()
	 */
	@Override
	public String getImporterName() {
		return "AGG";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.HenshinModelImporter#getImportFileExtensions()
	 */
	@Override
	public String[] getImportFileExtensions() {
		return new String[] { "ggx" };
	}

}
