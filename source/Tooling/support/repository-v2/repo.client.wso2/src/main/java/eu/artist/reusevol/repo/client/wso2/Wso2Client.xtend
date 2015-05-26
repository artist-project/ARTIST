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
package eu.artist.reusevol.repo.client.wso2

import com.google.common.base.Joiner
import com.google.common.base.Optional
import com.google.common.base.Preconditions
import com.google.common.base.Splitter
import com.google.common.base.Strings
import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.GenericType
import com.sun.jersey.api.client.UniformInterfaceException
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter
import com.sun.jersey.api.client.filter.LoggingFilter
import eu.artist.reusevol.repo.client.ssl.SSLClientFactory
import eu.artist.reusevol.repo.client.wso2.dto.AccessTokenResponse
import eu.artist.reusevol.repo.client.wso2.dto.ScimError
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup
import eu.artist.reusevol.repo.client.wso2.dto.ScimIdAndName
import eu.artist.reusevol.repo.client.wso2.dto.ScimList
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser
import eu.artist.reusevol.repo.client.wso2.dto.TokenValidationResponse
import eu.artist.reusevol.repo.client.wso2.exceptions.ScimException
import eu.artist.reusevol.repo.config.Wso2Configuration
import java.io.ByteArrayInputStream
import java.util.List
import javax.validation.Validation
import javax.ws.rs.core.MediaType
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.xpath.XPathConstants
import javax.xml.xpath.XPathFactory
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory

import static eu.artist.reusevol.repo.client.wso2.Wso2Client.*

class Wso2Client {

	private static val logger = LoggerFactory.getLogger(Wso2Client)

	val Client client
	
	@Accessors
	val Wso2Configuration config

	new(Wso2Configuration config) {
		this.config = validateConfig(config)
		this.client = SSLClientFactory.getSSLClient(config.ssl)
		if (config.logMessagesForDebugging) {
			client.addFilter(new LoggingFilter(System.out))
		}
	}
	
	private def validateConfig(Wso2Configuration config) {
		val factory = Validation.buildDefaultValidatorFactory()
		val validator = factory.validator
		val violations = validator.validate(config)
		if (!violations.empty) {
			violations.forEach[
				logger.error("Error in configuration: {} {}", it.propertyPath, it.message)
			]
			throw new IllegalArgumentException(violations.size + " error(s) in configuration.")
		}
		config
	} 

	def AccessTokenResponse requestToken(String username, String password) throws UniformInterfaceException {
		Preconditions.checkNotNull(username)
		Preconditions.checkNotNull(password)

		val un = if(Strings.isNullOrEmpty(config.tenant) || (username.indexOf("@") != -1)) {
			username 
		} else {
			username + "@" + config.tenant
		}

		setUsernamePassword(config.getOAuthClientId, config.getOAuthClientSecret)

		client.resource(config.tokenRequestUrl).accept(MediaType.APPLICATION_JSON).type(
			MediaType.APPLICATION_FORM_URLENCODED).post(AccessTokenResponse,
			'''grant_type=password&username=«un»&password=«password»'''.toString)
	}

	def TokenValidationResponse validate(String token) throws UniformInterfaceException {
		Preconditions.checkNotNull(token)

		setUsernamePassword(config.adminUsername, config.adminPassword)

		val result = client.resource(config.tokenValidationUrl).type(MediaType.TEXT_XML).header("SOAPAction", "validate").
			post(String,
				'''
					<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
						<soap:Header/>
						<soap:Body>
						    <axis2:validate xmlns:axis2="http://org.apache.axis2/xsd">
						        <axis2:validationReqDTO>
						            <oauth2:accessToken xmlns:oauth2="http://dto.oauth2.identity.carbon.wso2.org/xsd">
						                <oauth2:identifier>«token»</oauth2:identifier>
						                <oauth2:tokenType>bearer</oauth2:tokenType>
						                <oauth2:context></oauth2:context>
						            </oauth2:accessToken>
						        </axis2:validationReqDTO>
						    </axis2:validate>
						</soap:Body>
					</soap:Envelope>
				'''.toString)

		parseValidationResponse(result)
	}

	def List<ScimUser> listUsers() {
		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(config.scimUserUrl).accept(MediaType.APPLICATION_JSON).get(
				new GenericType<ScimList<ScimUser>>(ScimList.USER_TYPE) {
				})

			if (result.resultCount > 0) {
				result.resources
			} else {
				newArrayList
			}

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			if ((error?.errors?.head.code == 404) && (error?.errors?.head?.message.startsWith("Users not found"))) {
				newArrayList
			} else {
				logger.warn(error.toString)
				throw new ScimException(error)
			}
		} catch (Exception ex) {
			logger.warn("Error getting SCIM users.", ex)
			newArrayList
		}
	}

	def Optional<ScimUser> getUserByUsername(String username) {
		Preconditions.checkNotNull(username)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource('''«config.scimUserUrl»?filter=userNameEq«username»''').accept(
				MediaType.APPLICATION_JSON).get(
				new GenericType<ScimList<ScimUser>>(ScimList.USER_TYPE) {
				})

			if (result.resultCount > 0) {
				Optional.fromNullable(result.resources.head)
			} else {
				Optional.absent
			}

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			Optional.absent
		}
	}

	def Optional<ScimUser> getUserById(String id) {
		Preconditions.checkNotNull(id)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource('''«config.scimUserUrl»/«id»''').accept(MediaType.APPLICATION_JSON).get(
				ScimUser)

			Optional.fromNullable(result)

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			Optional.absent
		} catch (Exception ex) {
			logger.warn('''Error getting SCIM user '«id»'.''', ex)
			Optional.absent
		}
	}

	def Optional<ScimUser> createUser(ScimUser user) throws ScimException {
		Preconditions.checkNotNull(user)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(config.scimUserUrl).accept(MediaType.APPLICATION_JSON).type(
				MediaType.APPLICATION_JSON).post(ScimUser, user)

			Optional.fromNullable(result)
		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error creating SCIM user '«user.username»'.''', ex)
			Optional.absent
		}
	}

	def Optional<ScimUser> updateUser(ScimUser user) {
		Preconditions.checkNotNull(user)
		Preconditions.checkNotNull(!Strings.isNullOrEmpty(user.scimId))

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(Joiner.on("/").join(config.scimUserUrl, user.scimId)).accept(
				MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(ScimUser, user)

			Optional.fromNullable(result)

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error updating SCIM user '«user.name»'.''', ex)
			Optional.absent
		}
	}

	def void deleteUser(ScimUser user) {
		Preconditions.checkNotNull(user)
		Preconditions.checkNotNull(!Strings.isNullOrEmpty(user.scimId))

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			client.resource(Joiner.on("/").join(config.scimUserUrl, user.scimId)).accept(MediaType.APPLICATION_JSON).
				type(MediaType.APPLICATION_JSON).delete()

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error updating SCIM user '«user.name»'.''', ex)
		}
	}

	def List<ScimGroup> listGroups() {
		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(config.scimGroupUrl).accept(MediaType.APPLICATION_JSON).get(
				new GenericType<ScimList<ScimGroup>>(ScimList.GROUP_TYPE) {
				})

			if (result.resultCount > 0) {
				result.resources.map[removeUserStoreFromName]
			} else {
				newArrayList
			}

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			if ((error?.errors?.head.code == 404) && (error?.errors?.head?.message.startsWith("Groups not found"))) {
				newArrayList
			} else {
				logger.warn(error.toString)
				throw new ScimException(error)
			}
		} catch (Exception ex) {
			logger.warn("Error getting SCIM groups.", ex)
			newArrayList
		}
	}

	def Optional<ScimGroup> getGroupByName(String name) {
		Preconditions.checkNotNull(name)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource('''«config.scimGroupUrl»?filter=displayNameEq«name»''').accept(
				MediaType.APPLICATION_JSON).get(
				new GenericType<ScimList<ScimGroup>>(ScimList.GROUP_TYPE) {
				})

			if (result.resultCount > 0) {
				Optional.fromNullable(removeUserStoreFromName(result.resources.head))
			} else {
				Optional.absent
			}

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			Optional.absent
		}
	}

	def Optional<ScimGroup> getGroupById(String id) {
		Preconditions.checkNotNull(id)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource('''«config.scimGroupUrl»/«id»''').accept(MediaType.APPLICATION_JSON).get(
				ScimGroup)

			Optional.fromNullable(result)

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			Optional.absent
		} catch (Exception ex) {
			logger.warn('''Error getting SCIM group '«id»'.''', ex)
			Optional.absent
		}
	}

	def Optional<ScimGroup> createGroup(ScimGroup group) throws ScimException {
		Preconditions.checkNotNull(group)

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(config.scimGroupUrl).accept(MediaType.APPLICATION_JSON).type(
				MediaType.APPLICATION_JSON).post(ScimGroup, group)

			Optional.fromNullable(removeUserStoreFromName(result))
		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error creating SCIM group '«group.name»'.''', ex)
			Optional.absent
		}
	}

	def Optional<ScimGroup> updateGroup(ScimGroup group) {
		Preconditions.checkNotNull(group)
		Preconditions.checkNotNull(!Strings.isNullOrEmpty(group.scimId))

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			val result = client.resource(Joiner.on("/").join(config.scimGroupUrl, group.scimId)).accept(
				MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(ScimGroup, group)

			Optional.fromNullable(result)

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error updating SCIM group 'group.name»'.''', ex)
			Optional.absent
		}
	}

	def void deleteGroup(ScimGroup group) {
		Preconditions.checkNotNull(group)
		Preconditions.checkNotNull(!Strings.isNullOrEmpty(group.scimId))

		try {

			setUsernamePassword(config.adminUsername, config.adminPassword)

			client.resource(Joiner.on("/").join(config.scimGroupUrl, group.scimId)).accept(MediaType.APPLICATION_JSON).
				type(MediaType.APPLICATION_JSON).delete()

		} catch (UniformInterfaceException ex) {
			val error = ex.response.getEntity(ScimError)
			logger.warn(error.toString)
			throw new ScimException(error)
		} catch (Exception ex) {
			logger.warn('''Error deleting SCIM group '«group.name»'.''', ex)
		}
	}

	def void addUserToGroup(ScimUser user, ScimGroup group) {
		Preconditions.checkNotNull(user)
		Preconditions.checkNotNull(group)

		addUserToGroup(user.username, group.name)
	}

	def void addUserToGroup(String username, String groupname) {
		Preconditions.checkNotNull(username)
		Preconditions.checkNotNull(groupname)

		val theUser = getUserByUsername(username)
		if(!theUser.present) throw new ScimException('''The user '«username»' does not exist.''', 404)
		val u = theUser.get

		val theGroup = getGroupByName(groupname)
		if(!theGroup.present) throw new ScimException('''The group '«groupname»' does not exist.''', 404)
		val g = theGroup.get

		val members = if(g.users != null) g.users else newArrayList
		val ids = members.map[it.id]

		if (!ids.contains(u.scimId)) {
			members.add(
				new ScimIdAndName => [
					id = u.scimId
					name = u.username
				])
			g.users = members
		}

		updateGroup(g)
	}

	def void removeUserFromGroup(ScimUser user, ScimGroup group) {
		Preconditions.checkNotNull(user)
		Preconditions.checkNotNull(group)

		removeUserFromGroup(user.username, group.name)
	}

	def void removeUserFromGroup(String user, String group) {
		Preconditions.checkNotNull(user)
		Preconditions.checkNotNull(group)

		val theUser = getUserByUsername(user)
		if(!theUser.present) throw new ScimException('''The user '«user»' does not exist.''', 404)
		val u = theUser.get

		val theGroup = getGroupByName(group)
		if(!theGroup.present) throw new ScimException('''The group '«group»' does not exist.''', 404)
		val g = theGroup.get

		val members = if(g.users != null) g.users else newArrayList
		val ids = members.map[it.id]

		if (ids.contains(u.scimId)) {
			members.remove(
				new ScimIdAndName => [
					id = u.scimId
					name = u.username
				])
			g.users = if(members.size > 0) members else null
		}

		updateGroup(g)
	}

	def void close() {
		client.destroy();
	}

	private def void setUsernamePassword(String username, String password) {
		client.addFilter(new HTTPBasicAuthFilter(username, password));
	}

	static def parseValidationResponse(String response) {
		val builder = DocumentBuilderFactory.newInstance.newDocumentBuilder
		val doc = builder.parse(new ByteArrayInputStream(response.bytes))
		val xpath = XPathFactory.newInstance.newXPath

		val user = xpath.compile("//*[local-name() = 'authorizedUser']").evaluate(doc, XPathConstants.STRING) as String
		val time = xpath.compile("//*[local-name() = 'expiryTime']").evaluate(doc, XPathConstants.STRING) as String
		val valid = xpath.compile("//*[local-name() = 'valid']").evaluate(doc, XPathConstants.STRING) as String

		val scope = xpath.compile("//*[local-name() = 'scope']").evaluate(doc, XPathConstants.STRING) as String
		val authorizationContextToken = xpath.compile("//*[local-name() = 'authorizationContextToken']").
			evaluate(doc, XPathConstants.STRING) as String
		val errorMsg = xpath.compile("//*[local-name() = 'errorMsg']").evaluate(doc, XPathConstants.STRING) as String

		val validationResponse = new TokenValidationResponse(user, Long.parseLong(time), Boolean.parseBoolean(valid))
		validationResponse.authorizationContextToken = if(authorizationContextToken.empty) null else authorizationContextToken
		validationResponse.scope = if(scope.empty) null else scope
		validationResponse.errorMsg = if(errorMsg.empty) null else errorMsg

		validationResponse
	}

	private def ScimGroup removeUserStoreFromName(ScimGroup group) {
		if(group == null) return null
		val segments = Splitter.on("/").split(group.name)
		val name = if(segments.size == 1) segments.get(0) else segments.get(1)
		group.name = name
		group
	}
}
