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

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;

public class Utils {

	private static DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
	public static void updateEntity(Entity e) {
		ds.put(e);
	}// updateEntity
	
	public static UserPojo getUserEntity(Key id) {
		UserPojo up = new UserPojo();
		
		try {
			Entity e = ds.get(id);
			up.setUserid(e.getProperty("Userid").toString());
			up.setUsername(e.getProperty("Username").toString());
			up.setPassword(e.getProperty("Password").toString());
			up.setEmail(e.getProperty("Email").toString());
			up.setAge(e.getProperty("Age").toString());
			
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return up;
	}// getUserEntity
	
	public static PetCategoryPojo getPetCategoryEntity(Key id) {
		PetCategoryPojo up = new PetCategoryPojo();
		
		try {
			Entity e = ds.get(id);
			up.setCategoryId(e.getProperty("Categoryid").toString());
			up.setCategoryName(e.getProperty("Categoryname").toString());
			up.setCategoryDescription(e.getProperty("Categorydescription").toString());
			if (e.hasProperty("Instock")) {
				up.setInStock(e.getProperty("Instock").toString());
			}
			
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return up;
	}// getPetCategoryEntity
	
}// Utils
