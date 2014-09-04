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

import eu.artist.webservices.jaxws.CreatePetCategory;
import eu.artist.webservices.jaxws.CreatePetCategoryResponse;
import eu.artist.webservices.jaxws.GetPetCategory;
import eu.artist.webservices.jaxws.GetPetCategoryResponse;

public class CreatePetCategoryAdapter {
	WebservicesDemo webservice = new WebservicesDemo();

	public CreatePetCategoryResponse createPetCategory(CreatePetCategory request) {
		String categoryid = request.getCategoryId();
		String categoryname = request.getCategoryName();
		String categorydescription = request.getCategoryDescription();
		boolean b = webservice.createPetCategory(categoryid, categoryname, categorydescription);

		CreatePetCategoryResponse response = new CreatePetCategoryResponse();
		response.setReturn(b);
		return response;
		
	}// createUser
	
	public GetPetCategoryResponse getPetCategory(GetPetCategory request) {
		String categoryid = request.getCategoryId();
		PetCategoryPojo up = webservice.getPetCategory(categoryid);
		GetPetCategoryResponse response = new GetPetCategoryResponse();
		response.setReturn(up);
		
		return response;
	}// getPetCategory
}
