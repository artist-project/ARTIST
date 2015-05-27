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
package eu.artist.reusevol.server.core.security.privileges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.UnsupportedRepositoryOperationException;
import javax.jcr.security.AccessControlManager;
import javax.jcr.security.Privilege;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import eu.artist.reusevol.repo.common.access.Permission;

public enum AvailablePermissions {
	NONE("none", new ArrayList<String>()),
			
	VIEW("view", Lists.newArrayList(
			Privilege.JCR_READ
			)),
			
	MODIFIY("modify", Lists.newArrayList(
			Privilege.JCR_READ, 
			Privilege.JCR_WRITE,
			Privilege.JCR_VERSION_MANAGEMENT,
			Privilege.JCR_READ_ACCESS_CONTROL
			)),
			
	MANAGE("manage", Lists.newArrayList(
			Privilege.JCR_READ, 
			Privilege.JCR_WRITE,
			Privilege.JCR_VERSION_MANAGEMENT,
			Privilege.JCR_READ_ACCESS_CONTROL,
			Privilege.JCR_MODIFY_ACCESS_CONTROL
			));

	public static List<Privilege> convertPrivStringsToObj(Session session, List<String> privileges) throws UnsupportedRepositoryOperationException, RepositoryException {
		AccessControlManager acm = session.getAccessControlManager();
		List<Privilege> result = new ArrayList<Privilege>();
		for(String name : privileges) {
			result.add(acm.privilegeFromName(name));
		}
		return result;
	}

	public static AvailablePermissions fromName(String name) {
		if (name.equals(VIEW.name)) {
			return VIEW;
		} else if (name.equals(MODIFIY.name)) {
			return MODIFIY;
		} else if (name.equals(MANAGE.name)) {
			return MANAGE;
		}
		// Should never happen
		return null;
	}

	public static AvailablePermissions fromPermission(Permission permission) {
		if (permission == Permission.VIEW) {
			return VIEW;
		} else if (permission == Permission.MODIFY) {
			return MODIFIY;
		} else if (permission == Permission.MANAGE) {
			return MANAGE;
		}
		// Should never happen
		return null;
	}

	private String name;
	private List<String> privileges;
	
	AvailablePermissions(String name, List<String> privileges) {
		this.name = name;
		this.privileges = privileges;
	}
	
	public List<Privilege> getPrivileges(Session session) throws UnsupportedRepositoryOperationException, RepositoryException {
		return convertPrivStringsToObj(session, privileges);
	}
	
	public Set<String> getPrivilegeNames() {
		return Sets.newHashSet(privileges);
	}
	
	public String getName() {
		return name;
	}
	
//	public static RepoPermissions fromPrivileges(List<Privilege> privileges) {
//		return NONE;
//	}
}
