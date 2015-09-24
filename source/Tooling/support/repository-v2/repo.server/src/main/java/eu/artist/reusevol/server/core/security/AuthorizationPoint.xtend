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

import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.security.annotations.WriteOperation
import java.util.List
import org.aopalliance.intercept.MethodInvocation
import org.slf4j.LoggerFactory

/*
Notes:
	Kinds of users:
		- anonymous (either represented by null user of by some specific user role, e.g. "guest")
		- known
			- can belong to groups
			- each project is represented by a group => every user is in the "prj_public" group
			 
	One problem is filtering of search results. This can be done by Modeshape ACL or by walking the result sets
	prior to returning them.
	
	One model is the a(rw)g(rw)u(rw) scheme from linux. Here every resource has an owner and a group and every users
	has one or more groups. In the repository groups could be determined by resource and project for artefacts, e.g.
	"category" or "prj_public". Order of evaluation: a -> g -> u. If a allows then OK, else g is checked.
	 
 */
class AuthorizationPoint {
	
	private static val logger = LoggerFactory.getLogger(AuthorizationPoint)
	
	val List<Rule> rules
	
	new() {
		this.rules = newArrayList => [
			// Every user can access only the "public" project and the projects corresponding to their "prj_*" groups 
			add(new Rule("ProjectResource", "READ") [ user, method |
			])
		]
	}
	
	def AuthorizationResult authorize(User user, MethodInvocation operation) {
		val resourceClass = operation.method.declaringClass.simpleName
		logger.debug('''User «user?.realname» with groups «user?.groups» wants to perform '«operation?.method?.name»' on resoure «resourceClass».''')
		val ruleIterator = rules.iterator
		
		while(ruleIterator.hasNext) {
			val rule = ruleIterator.next
			if (rule.matches(resourceClass, operation)) {
				val result = rule.authorize(user, operation)
				if ((result == AuthorizationResult.ACCEPT) || (result == AuthorizationResult.DENY)) return result
			}
		}
		
		// Default, when no rule matches
		AuthorizationResult.ACCEPT
	}
	
	static class Rule {
		val String resourceClass
		val String operation
		val (User, MethodInvocation) => AuthorizationResult logic
		
		new(String resource, String op, (User, MethodInvocation) => AuthorizationResult testFunction) {
			this.resourceClass = resource
			this.operation = op
			this.logic = testFunction
		}
		
		def boolean matches(String resource, MethodInvocation op) {
			if ((resource == null) || (op == null)) return false
			
			val matchesResource = resourceClass.equals("*") || resource.equalsIgnoreCase(resourceClass)
			val matchesOperation = switch(operation) {
				case operation.equals("*"): true
				case operation.equalsIgnoreCase("READ"): op.method.annotations.contains(ReadOperation)
				case operation.equalsIgnoreCase("WRITE"): op.method.annotations.contains(WriteOperation)
				case operation.equalsIgnoreCase(op.method.name): true
				default: false
			} 
			
			matchesResource && matchesOperation
		}
		
		def AuthorizationResult authorize(User user, MethodInvocation operation) {
			if (user == null) return AuthorizationResult.UNDECIDED
			if (logic == null) return AuthorizationResult.UNDECIDED
			logic.apply(user, operation)
		}
/*		
		private def Optional<String> getId(MethodInvocation op) {
			val idArgs = op.arguments.filter[ it instanceof Id ]
			if (idArgs.size == 0) return Optional.absent
			val idArg = idArgs.head as Id
			return Optional.fromNullable(idArg.id)
		}

		private def boolean isReadOperation(MethodInvocation op) {
			op.method.annotations.contains(ReadOperation)
		}
		
		private def boolean isWriteOperation(MethodInvocation op) {
			op.method.annotations.contains(WriteOperation)
		}
*/	
	}
 	enum AuthorizationResult {
		ACCEPT, DENY, UNDECIDED
	}
}