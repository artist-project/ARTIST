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

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.GenericType
import com.sun.jersey.api.client.UniformInterfaceException
import com.sun.jersey.api.client.config.DefaultClientConfig
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter
import com.sun.jersey.client.urlconnection.HTTPSProperties
import eu.artist.reusevol.repo.client.ssl.CustomKeyManager
import eu.artist.reusevol.repo.client.ssl.CustomTrustManager
import eu.artist.reusevol.repo.client.wso2.dto.AccessTokenResponse
import eu.artist.reusevol.repo.client.wso2.dto.ScimList
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser
import java.security.GeneralSecurityException
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.KeyManager
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession
import javax.net.ssl.TrustManager
import javax.ws.rs.core.MediaType

class OAuth2TokenValidationClient {
	val Client client

	private static val truststore_path = "classpath:/etc/keystores/client-truststore.jks"
	private static val truststore_password = "wso2carbon"
	private static val keystore_path = "classpath:/etc/keystores/client-truststore.jks"
	private static val keystore_password = "wso2carbon"
	private static val validationUrl = "https://artist-demo.iao.fraunhofer.de/services/OAuth2TokenValidationService"
	
	private static val clientId = "KscfJOSkZ9ICNafXhBgXpJV7Wb4a"
	private static val clientSecret = "plgexRyF5AcFPi837XlAAY54slAa"
	private static val tokenUrl = "https://artist-demo.iao.fraunhofer.de/oauth2/token"
	
	private static val scimUserUrl = "https://artist-demo.iao.fraunhofer.de/wso2/scim/Users"
	// private static val scimGroupUrl = "https://artist-demo.iao.fraunhofer.de/wso2/scim/Groups"

	static def void main(String[] args) {
		val OAuth2TokenValidationClient client = new OAuth2TokenValidationClient();

		client.setUsernamePassword(clientId, clientSecret);
		val response = client.requestToken(clientId, clientSecret, "demo@test.artist-demo.eu", "demo123")
		System.out.println("Response: " + response);

//		 System.out.println("Token: " + extractToken(response));
//		client.setUsernamePassword("admin@repo.artist.eu", "ar60s1Js");
//		val result = client.validate(response.accessToken);
//		System.out.println("Result: " + result);

		System.out.println("Users: " + client.getScimUsers)

		client.close
	}

	public new() {
		val config = new DefaultClientConfig(); // SSL

		config.properties.put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
			new HTTPSProperties(hostnameVerifier, SSLTheContext))
			
		client = Client.create(config);
	}
	
	def String validate(String token) throws UniformInterfaceException {
		return client.resource(validationUrl).type(MediaType.TEXT_XML).header("SOAPAction", "validate").post(String,
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
	}

	def AccessTokenResponse requestToken(String id, String secret, String username, String password) throws UniformInterfaceException {
		setUsernamePassword(id, secret)
		return client.resource(tokenUrl).accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_FORM_URLENCODED).post(AccessTokenResponse,
			'''grant_type=password&username=«username»&password=«password»'''.toString)
	}
	
	def getScimUsers() {
		setUsernamePassword("admin@repo.artist.eu", "ar60s1Js")
		client.resource(scimUserUrl).accept(MediaType.APPLICATION_JSON).get(new GenericType<ScimList<ScimUser>>(ScimList.USER_TYPE) { })
		// client.resource(scimUserUrl).accept(MediaType.APPLICATION_JSON).get(String)
		// client.resource(scimGroupUrl).accept(MediaType.APPLICATION_JSON).get(new GenericType<ScimList<ScimGroup>>(ScimList.GROUP_TYPE) { })
		// client.resource(scimGroupUrl).accept(MediaType.APPLICATION_JSON).get(String)
	}

	def void close() {
		client.destroy();
	}

	def void setUsernamePassword(String username, String password) {
		client.addFilter(new HTTPBasicAuthFilter(username, password));
	}

	private def HostnameVerifier getHostnameVerifier() {
		return new HostnameVerifier() {
			override boolean verify(String hostname, SSLSession sslSession) {
				return true;
			}
		}
	}

	private def SSLContext getSSLTheContext() {

		var TrustManager[] mytm = null;
		var KeyManager[] mykm = null;

		try {
			mytm = #[new CustomTrustManager(truststore_path, truststore_password.toCharArray())]
			mykm = #[new CustomKeyManager(keystore_path, keystore_password.toCharArray())]
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		var SSLContext ctx = null;
		try {
			ctx = SSLContext.getInstance("SSL")
			ctx.init(mykm, mytm, null);
		} catch (GeneralSecurityException ex) {
		}
		return ctx
	}
}
