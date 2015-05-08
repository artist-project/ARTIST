/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.server.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import eu.artist.reusevol.repo.common.rest.ArtefactResource;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.rest.ProjectResource;

@ApplicationPath("/api1")
public class RepositoryApplication extends Application {
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(Arrays.asList(ProjectResource.class,
				ProjectResourceImpl.class, ArtefactResource.class,
				ArtefactResourceImpl.class, CategoryResource.class,
				CategoryResourceImpl.class));

	}
}
