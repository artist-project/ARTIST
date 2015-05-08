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

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@WebService
public class WebservicesDemo {
	
	@WebMethod
	public boolean createUser(@WebParam(name = "userid") String userid,
			@WebParam(name = "username") String username,
			@WebParam(name = "password") String password,
			@WebParam(name = "email") String email,
			@WebParam(name = "age") String age) {
		Entity employee = new Entity("User", userid);
		employee.setProperty("Userid", userid);
		employee.setProperty("Username", username);
		employee.setProperty("Password", password);
		employee.setProperty("Email", email);
		employee.setProperty("Age", age);

		System.out.println("Userid:" + userid + " Username: " + username
				+ " Password: " + password);

		Utils.updateEntity(employee);
		return true;
	}// createUser

	@WebMethod
	public UserPojo getUser(@WebParam(name = "userid") String userid) {
		Key key = KeyFactory.createKey("User", userid);
		UserPojo up = Utils.getUserEntity(key);
		return up;
	}// getUser

	@WebMethod
	public boolean createPetCategory(@WebParam(name = "categoryid") String categoryid,
			@WebParam(name = "categoryname") String categoryname,
			@WebParam(name = "categorydescription") String categorydescription) {
		Entity petCategory = new Entity("PetCategory", categoryid);
		petCategory.setProperty("Categoryid", categoryid);
		petCategory.setProperty("Categoryname", categoryname);
		petCategory.setProperty("Categorydescription", categorydescription);

		System.out.println("Categoryid:" + categoryid + " Categoryname: " + categoryname
				+ " Categorydescription: " + categorydescription);

		Utils.updateEntity(petCategory);
		return true;
	}// createPetCategory
	
	@WebMethod
	public boolean updatePetCategoryStock(@WebParam(name = "categoryid") String categoryid,
			@WebParam(name = "instock") String inStock) {
		// fetch already existing information
		Key key = KeyFactory.createKey("PetCategory", categoryid);
		PetCategoryPojo up = Utils.getPetCategoryEntity(key);
		
		Entity petCategory = new Entity("PetCategory", categoryid);
		petCategory.setProperty("Categoryid", categoryid);
		petCategory.setProperty("Instock", inStock);
		// add previously existing information
		petCategory.setProperty("Categoryname", up.getCategoryName());
		petCategory.setProperty("Categorydescription", up.getCategoryDescription());

		System.out.println("Categoryid:" + categoryid + " Categoryname: " + up.getCategoryName()
				+ " Categorydescription: " + up.getCategoryDescription() + " Instock: " + inStock);

		Utils.updateEntity(petCategory);
		return true;
	}// updatePetCategoryStock

	@WebMethod
	public PetCategoryPojo getPetCategory(@WebParam(name = "categoryid") String categoryid) {
		Key key = KeyFactory.createKey("PetCategory", categoryid);
		PetCategoryPojo up = Utils.getPetCategoryEntity(key);
		return up;
	}// getPetCategory
}
