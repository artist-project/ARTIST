/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.resources.constants;

import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;

public class AbstractResourceConstant {
	protected static MigrationResourceSet resourceSet = MigrationLibraryResourcesUtil.init(new MigrationResourceSet());
}
