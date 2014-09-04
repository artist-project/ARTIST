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

import eu.artist.webservices.jaxws.UpdatePetCategoryStock;
import eu.artist.webservices.jaxws.UpdatePetCategoryStockResponse;

public class UpdatePetCategoryStockAdapter {
	WebservicesDemo webservice = new WebservicesDemo();

	public UpdatePetCategoryStockResponse updatePetCategoryStock(UpdatePetCategoryStock request) {
		String categoryId = request.getCategoryId();
		String inStock = request.getInStock();
		boolean b = webservice.updatePetCategoryStock(categoryId, inStock);

		UpdatePetCategoryStockResponse response = new UpdatePetCategoryStockResponse();
		response.setReturn(b);
		return response;
		
	}// updatePetCategoryStock
	
}
