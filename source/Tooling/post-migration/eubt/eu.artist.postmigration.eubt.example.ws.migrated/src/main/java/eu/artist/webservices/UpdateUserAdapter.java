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

import eu.artist.webservices.jaxws.UpdateUserAge;
import eu.artist.webservices.jaxws.UpdateUserAgeResponse;

public class UpdateUserAdapter {
	WebservicesDemo webservice = new WebservicesDemo();

	public UpdateUserAgeResponse updateUserAge(UpdateUserAge request) {
		String uid = request.getUid();
		String age = request.getAge();
		boolean b = webservice.updateUserAge(uid, age);

		UpdateUserAgeResponse response = new UpdateUserAgeResponse();
		response.setReturn(b);
		return response;
		
	}// updateUserAge
	
}
