/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.webservices;

import eu.artist.webservices.jaxws.CreateUser;
import eu.artist.webservices.jaxws.CreateUserResponse;
import eu.artist.webservices.jaxws.ObtainUser;
import eu.artist.webservices.jaxws.ObtainUserResponse;

public class CreateUserAdapter {
	WebservicesDemo webservice = new WebservicesDemo();

	public CreateUserResponse createUser(CreateUser request) {
		String uid = request.getUid();
		String username = request.getUsername();
		String password = request.getPassword();
		String email = request.getEmail();		
		boolean b = webservice.createUser(uid, username, password, email);

		CreateUserResponse response = new CreateUserResponse();
		response.setReturn(b);
		return response;
		
	}// createUser
	
	public ObtainUserResponse obtainUser(ObtainUser request) {
		String uid = request.getUid();
		UserPojo up = webservice.obtainUser(uid);	
		ObtainUserResponse response = new ObtainUserResponse();
		response.setReturn(up);
		
		return response;
	}// obtainUser
}
