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
 
package eu.artist.reusevol.repo.common.access

import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import java.util.List

interface AccessControllable<T extends JcrStorable> {
	def void setPermissions(T entity, List<PermissionEntry> localPermissions)
	def List<PermissionEntry> getPermissions(T entity)
}