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
	public boolean createUser(@WebParam(name = "uid") String uid,
			@WebParam(name = "username") String username,
			@WebParam(name = "password") String password,
			@WebParam(name = "email") String email) {
		Entity employee = new Entity("User", uid);
		employee.setProperty("Uid", uid);
		employee.setProperty("Username", username);
		employee.setProperty("Password", password);
		employee.setProperty("Email", email);

		System.out.println("uid:" + uid + " Username: " + username
				+ " Password: " + password);

		Utils.updateEntity(employee);
		return true;
	}// createUser

	@WebMethod
	public UserPojo obtainUser(@WebParam(name = "uid") String uid) {
		Key key = KeyFactory.createKey("User", uid);
		UserPojo up = Utils.obtainUserEntity(key);
		return up;
	}// obtainUser
	
	@WebMethod
	public boolean updateUserAge(@WebParam(name = "uid") String uid,
			@WebParam(name = "age") String age) {
		// fetch already existing information
		Key key = KeyFactory.createKey("User", uid);
		UserPojo up = Utils.obtainUserEntity(key);
		
		Entity employee = new Entity("User", uid);
		employee.setProperty("Uid", uid);
		employee.setProperty("Age", age);
		// add previously existing information
		employee.setProperty("Username", up.getUsername());
		employee.setProperty("Password", up.getPassword());
		employee.setProperty("Email", up.getEmail());

		System.out.println("Uid:" + uid + " Username: " + up.getUsername()
				+ " Age: " + age);

		Utils.updateEntity(employee);
		return true;
	}// updateUserAge

	@WebMethod
	public boolean createPetCategory(@WebParam(name = "categoryid") String categoryid,
			@WebParam(name = "categoryname") String categoryname,
			@WebParam(name = "categorydescription") String categorydescription,			
			@WebParam(name = "instock") String instock) {
		Entity category = new Entity("PetCategory", categoryid);
		category.setProperty("Categoryid", categoryid);
		category.setProperty("Categoryname", categoryname);
		category.setProperty("Categorydescription", categorydescription);		
		category.setProperty("Instock", instock);

		System.out.println("Categoryid:" + categoryid + " Categoryname: " + categoryname
				+ " Categorydescription: " + categorydescription + " Instock: " + instock);

		Utils.updateEntity(category);
		return true;
	}// createPetCategory

	@WebMethod
	public PetCategoryPojo getPetCategory(@WebParam(name = "categoryid") String categoryid) {
		Key key = KeyFactory.createKey("PetCategory", categoryid);
		PetCategoryPojo up = Utils.getPetCategoryEntity(key);
		return up;
	}// getPetCategory
}
