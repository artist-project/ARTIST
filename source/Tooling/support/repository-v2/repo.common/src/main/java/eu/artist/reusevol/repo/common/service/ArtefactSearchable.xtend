/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
 
package eu.artist.reusevol.repo.common.service

import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.util.Depth
import java.util.List

interface ArtefactSearchable {
	def List<RepoArtefact> findInAllProjects(Depth depth)
	def List<RepoArtefact> findInAllProjects(Permission permission, Depth depth)
	def List<RepoArtefact> findByFiqlInAllProjects(String fiqlQuery, Depth depth)
	def List<RepoArtefact> findByFiqlInAllProjects(String fiqlQuery, Permission permission, Depth depth)
}