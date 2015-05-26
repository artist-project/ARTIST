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
 
package eu.artist.reusevol.server.core.security.privileges

import com.google.common.base.Splitter
import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.PermissionEntry
import java.security.Principal
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import javax.jcr.RepositoryException
import javax.jcr.Session
import javax.jcr.UnsupportedRepositoryOperationException
import javax.jcr.security.AccessControlEntry
import javax.jcr.security.AccessControlList
import javax.jcr.security.AccessControlManager
import javax.jcr.security.Privilege
import org.modeshape.jcr.security.SimplePrincipal
import org.modeshape.jcr.security.acl.JcrAccessControlList
import org.slf4j.LoggerFactory

class PermissionUtils {
	
	public static val JCR_READ = "jcr:read"
	public static val JCR_WRITE = "jcr:write"
	public static val JCR_VERSION_MANAGEMENT = "jcr:versionManagement"
	public static val JCR_READ_ACCESS_CONTROL = "jcr:readAccessControl"
	public static val JCR_MODIFY_ACCESS_CONTROL = "jcr:modifyAccessControl"

	private static val logger = LoggerFactory.getLogger(PermissionUtils)
	
	static def List<Privilege> convertPrivStringsToObj(Session session, List<String> privileges) throws UnsupportedRepositoryOperationException, RepositoryException {
		val AccessControlManager acm = session.accessControlManager
		val result = new ArrayList<Privilege>()
		for(String name : privileges) {
			result.add(acm.privilegeFromName(name))
		}
		return result
	}

	static def setPermission(Session session, String absolutePath, Principal principal, Permission permission) {
		val acm = session.accessControlManager
		val acl = getACL(session, absolutePath)
		
		// Remove existing ACL entries for the given principal
		acl.accessControlEntries.filter[ it.principal.name.equals(principal.name) ].forEach[
			acl.removeAccessControlEntry(it)
		]
		// Add the new entry
		val result = if (permission != Permission.NONE) {
			acl.addAccessControlEntry(SimplePrincipal.newInstance(principal.name), AvailablePermissions.fromPermission(permission).getPrivileges(session))
		} else false
		
		acm.setPolicy(absolutePath, acl)
		session.save
		
		result
	}

	static def setPermissions(Session session, String absolutePath, List<PermissionEntry> permissions) {
		val acm = session.accessControlManager
		val Map<String, Privilege[]> permissionHash = newHashMap()
		var hasChanged = false

		// Add permissions from upstream in the path (including the current node)
		getAggregatedACE(session, absolutePath).forEach[ permissionHash.put(it.principal.name, it.privileges) ]

		for(entry : permissions) {
			if (entry.permission != Permission.NONE) {
				// Add the new entry / overwrite existing with new one
				val privileges = AvailablePermissions.fromPermission(entry.permission).getPrivileges(session)
				permissionHash.put(entry.principalName, privileges)
				hasChanged = true
			} else {
				// Permission.NONE
				if (permissionHash.containsKey(entry.permission)) {
					// Remove the existing permissions for this principal
					permissionHash.remove(entry.principalName)
					hasChanged = true
				}
			}
		}
				
		// Replace the old permissions with the new ones
		val aclList = new JcrAccessControlList(absolutePath)
		permissionHash.forEach[ key, value |
			val principal = SimplePrincipal.newInstance(key)
			aclList.addAccessControlEntry(principal, value)
		]
		
		acm.setPolicy(absolutePath, aclList)
		session.save
		
		hasChanged
	}

	static def List<PermissionEntry> getPermissions(Session session, String absolutePath) {
		val aces = getAccessControlEntries(session, absolutePath)
		
		aces.map[
			val privNames = privileges.map[name].toSet
			new PermissionEntry(principal.name, getPermissionFromPrivileges(privNames))
		]
	}
	
	static def List<PermissionEntry> getInheritedPermissions(Session session, String absolutePath) {
		val permissionsOnPath = new HashMap<String, PermissionEntry>
		
		val pathSegments = Splitter.on("/").omitEmptyStrings.split(absolutePath)
		var path = "/"
		
		for(segment : pathSegments) {
			val permissions = getPermissions(session, path)
			logger.debug("Permissions for path {}: {}", path, permissions.map['''«principalName» : «permission»'''])
			permissions.forEach[ permissionsOnPath.put(it.principalName, it) ]
			path = path + segment + "/" 
		}
		
		permissionsOnPath.values.toList
	}

	static def List<AccessControlEntry> getAggregatedACE(Session session, String absolutePath) {
		val permissionsOnPath = new HashMap<String, AccessControlEntry>
		
		val pathSegments = Splitter.on("/").omitEmptyStrings.split(absolutePath)		
		var path = "/"
		val rootPermissions = getAccessControlEntries(session, path)
		rootPermissions.forEach[ permissionsOnPath.put(it.principal.name, it) ]
		
		for(segment : pathSegments) {
			path = path + segment + "/" 
			val permissions = getAccessControlEntries(session, path)
			logger.debug("Permissions for path {}: {}", path, permissions.map['''«principal.name» : «privileges»'''])
			permissions.forEach[ permissionsOnPath.put(it.principal.name, it) ]
		}
		
		permissionsOnPath.values.toList
	}
	
	static def Permission getPermissionFromPrivileges(Set<String> privNames) {
		if (privNames.contains(JCR_READ)) {
			if (privNames.contains(JCR_WRITE) && privNames.contains(JCR_VERSION_MANAGEMENT)) {
				if (privNames.contains(JCR_READ_ACCESS_CONTROL) && privNames.contains(JCR_MODIFY_ACCESS_CONTROL)) {
					return Permission.MANAGE
				}
				return Permission.MODIFY
			}
			return Permission.VIEW
		}
		return Permission.NONE
	}
	
	static def List<AccessControlEntry> getAccessControlEntries(Session session, String absolutePath) {
		val acl = getACL(session, absolutePath)
		acl.accessControlEntries
	}

	static private def AccessControlList getACL(Session session, String absolutePath) {
		val acm = session.accessControlManager
		val iter = acm.getApplicablePolicies(absolutePath)
		if (iter.hasNext()) {
			iter.next as AccessControlList
		} else {
    		acm.getPolicies(absolutePath).head as AccessControlList
		}
	} 
}