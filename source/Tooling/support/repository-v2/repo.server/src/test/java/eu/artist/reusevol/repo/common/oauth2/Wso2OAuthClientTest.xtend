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
 
package eu.artist.reusevol.repo.common.oauth2

import eu.artist.reusevol.repo.client.wso2.Wso2Client
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class Wso2OAuthClientTest {
	
	@Before
	def void setup() {

	}
	
	@Test
	def void parseResponse() {
		val response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"><soapenv:Body><ns:validateResponse xmlns:ns=\"http://org.apache.axis2/xsd\"><ns:return xmlns:ax2331=\"http://dto.oauth2.identity.carbon.wso2.org/xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ax2331:OAuth2TokenValidationResponseDTO\"><ax2331:authorizationContextToken xsi:nil=\"true\"></ax2331:authorizationContextToken><ax2331:authorizedUser>strauss@carbon.super</ax2331:authorizedUser><ax2331:errorMsg xsi:nil=\"true\">error</ax2331:errorMsg><ax2331:expiryTime>3299</ax2331:expiryTime><ax2331:scope>scope</ax2331:scope><ax2331:valid>true</ax2331:valid></ns:return></ns:validateResponse></soapenv:Body></soapenv:Envelope>"
		val result = Wso2Client.parseValidationResponse(response)
		
		Assert.assertEquals("strauss@carbon.super", result.authorizedUser)
		Assert.assertEquals(3299, result.expiryTime)
		Assert.assertEquals(true, result.valid)
		Assert.assertEquals(null, result.authorizationContextToken)
		Assert.assertEquals("error", result.errorMsg)
		Assert.assertEquals("scope", result.scope)
	} 
	
}