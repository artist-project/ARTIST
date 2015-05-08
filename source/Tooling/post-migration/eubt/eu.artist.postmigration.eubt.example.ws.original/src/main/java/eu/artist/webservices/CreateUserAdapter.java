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
import eu.artist.webservices.jaxws.GetUser;
import eu.artist.webservices.jaxws.GetUserResponse;

public class CreateUserAdapter {
	WebservicesDemo webservice = new WebservicesDemo();

	public CreateUserResponse createUser(CreateUser request) {
		String userid = request.getUserid();
		String username = request.getUsername();
		String password = request.getPassword();
		String email = request.getEmail();
		String age = request.getAge();
		boolean b = webservice.createUser(userid, username, password, email, age);

		CreateUserResponse response = new CreateUserResponse();
		response.setReturn(b);
		return response;
		
	}// createUser
	
	public GetUserResponse getUser(GetUser request) {
		String userid = request.getUserid();
		UserPojo up = webservice.getUser(userid);
		GetUserResponse response = new GetUserResponse();
		response.setReturn(up);
		
		return response;
	}// getUser
}
