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
package eu.artist.reusevol.repo.server.security;

import java.security.Principal;

import javax.enterprise.context.Dependent;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;

import org.apache.log4j.Logger;

import eu.artist.repository.security.AuthorizationService;
import eu.artist.repository.security.exception.AuthorizationServiceException;
import eu.artist.repository.security.impl.AuthorizationServiceImpl;
import eu.artist.repository.security.model.AccessAttribute;
import eu.artist.repository.security.model.AccessRequest;
import eu.artist.repository.security.model.AccessResponse;
import eu.artist.repository.security.model.ActionAttributeIdentifier;
import eu.artist.repository.security.model.ActionAttributes;
import eu.artist.repository.security.model.DataTypeIdentifier;
import eu.artist.repository.security.model.EvaluationResult;
import eu.artist.repository.security.model.ResourceAttributeIdentifier;
import eu.artist.repository.security.model.ResourceAttributes;
import eu.artist.repository.security.model.Security_ModelFactory;
import eu.artist.repository.security.model.SubjectAttributeIdentifier;
import eu.artist.repository.security.model.SubjectAttributes;

@Interceptor
@Secured
@Dependent
public class AuthorizationInterceptor {

	private static final Logger LOGGER = Logger
			.getLogger(AuthorizationInterceptor.class);

	@Context
	private HttpServletRequest request;

	@AroundInvoke
	public Object authorizeMethodCall(InvocationContext ctx) throws Exception {

		String methodName = ctx.getMethod().getName();
		String className = ctx.getTarget().getClass().getSimpleName();
		Principal principal = request.getUserPrincipal();
		// Or use instead for JACC compliant server (from
		// http://stackoverflow.com/questions/834388/how-to-get-the-user-roles-in-servlet)
		/*
		 * Subject subject = (Subject)
		 * PolicyContext.getContext("javax.security.auth.Subject.container");
		 * for (Principal principal : subject.getPrincipals()) {
		 * LOG.debug("In subject: " + principal.getName()); }
		 */

		if (isAuthorized(className, methodName, principal)) {
			return ctx.proceed();
		} else {
			throw new WebApplicationException(403);
		}
	}

	private boolean isAuthorized(String className, String methodName,
			Principal principal) {
		String user = (principal != null) ? principal.getName() : "anonymous";
		LOGGER.debug(String.format(
				"*** Authorizing user %s calling method '%s' on class '%s'",
				user, methodName, className));

		// Gets the AuthorizationService instance
		AuthorizationService as = AuthorizationServiceImpl
				.getAuthorizationService();

		// Creates the access request for
		// - user "admin" (determined by the security principal)
		// - action "update" (determined e.g. from the service class and method)
		// - resource "..." (determined e.g. from the service parameter)
		AccessRequest accReq = createAccessRequest("admin",
				"ArtefactService.update",
				"artefact:eu.artist.dews!test_model!1.0.0");

		try {
			// Invokes the authorization request
			AccessResponse resp = as.authorize(accReq);
			EvaluationResult decision = resp.getDecision();
			if (decision == EvaluationResult.PERMIT) {
				// Allow access
			} else if (decision == EvaluationResult.DENY) {
				// Deny access
			} else if (decision == EvaluationResult.INDETERMINATE) {
				// Access rights can not be determined
			} else if (decision == EvaluationResult.NOT_APPLICABLE) {
				// Access rights can not be determined
			} else {
				// Unknow result
			}
		} catch (AuthorizationServiceException e) {
			// Handle exception, e.g. by denying access
		}

		return false;
	}

	/**
	 * Creates the access request for the specified subject, action and resource
	 * 
	 * @param subject
	 *            the user that wants to access the resourse
	 * @param action
	 *            the action that the user wants to perform on the resource
	 * @param resource
	 *            the resource that the user wants to access
	 * @return the {@link AccessRequest} instance
	 */

	private AccessRequest createAccessRequest(String subject, String action,
			String resource) {

		/**
		 * Creates the access request
		 * */
		AccessRequest accReq = Security_ModelFactory.eINSTANCE
				.createAccessRequest();

		// Adds the subject attributes to the access request
		accReq.setSubject(createSubjectAttributes(subject));

		// Adds the resource attributes to the access request
		accReq.setResource(createResourceAttributes(resource));

		// Adds the action attributes to the access request
		accReq.setAction(createActionAttributes(action));

		return accReq;
	}

	private ActionAttributes createActionAttributes(String action) {
		AccessAttribute actionAttribute = Security_ModelFactory.eINSTANCE
				.createAccessAttribute();
		actionAttribute.setId(ActionAttributeIdentifier.ACTION.toString());
		actionAttribute.setDataType(DataTypeIdentifier.STRING.toString());
		actionAttribute.setValue(action);

		ActionAttributes actionAttributes = Security_ModelFactory.eINSTANCE
				.createActionAttributes();
		actionAttributes.getAttributes().add(actionAttribute);
		return actionAttributes;
	}

	private ResourceAttributes createResourceAttributes(String resource) {
		AccessAttribute resourceAttribute = Security_ModelFactory.eINSTANCE
				.createAccessAttribute();
		resourceAttribute
				.setId(ResourceAttributeIdentifier.RESOURCE.toString());
		resourceAttribute.setDataType(DataTypeIdentifier.STRING.toString());
		resourceAttribute.setValue(resource);

		ResourceAttributes resourceAttributes = Security_ModelFactory.eINSTANCE
				.createResourceAttributes();
		resourceAttributes.getAttributes().add(resourceAttribute);
		return resourceAttributes;
	}

	private SubjectAttributes createSubjectAttributes(String subject) {
		// Creates the subject attributes
		AccessAttribute subjectAttribute = Security_ModelFactory.eINSTANCE
				.createAccessAttribute();
		subjectAttribute.setId(SubjectAttributeIdentifier.SUBJECT.toString());
		subjectAttribute.setDataType(DataTypeIdentifier.STRING.toString());
		subjectAttribute.setValue(subject);

		SubjectAttributes subjectAttributes = Security_ModelFactory.eINSTANCE
				.createSubjectAttributes();
		subjectAttributes.getAttributes().add(subjectAttribute);
		return subjectAttributes;
	}

}
