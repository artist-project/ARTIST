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
 
package eu.artist.reusevol.server.core.security

import eu.artist.reusevol.repo.common.model.Group
import org.modeshape.jcr.ModeShapeRoles

class RepoGroups {
	public static val GROUP_PREFIX = "prj_"
	
	// Default JCR groups
	public static val READONLY_GROUP = new Group(ModeShapeRoles.READONLY) 
	public static val READWRITE_GROUP = new Group(ModeShapeRoles.READWRITE) 
	public static val ADMIN_GROUP = new Group(ModeShapeRoles.ADMIN) 
	
	public static val ANONYMOUS_GROUP = new Group("anonymous") 
	public static val PUBLIC_GROUP = new Group(GROUP_PREFIX + "public") 
}