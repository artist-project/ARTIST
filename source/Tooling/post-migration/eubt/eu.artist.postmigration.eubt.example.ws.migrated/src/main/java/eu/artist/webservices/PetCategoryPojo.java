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

public class PetCategoryPojo {
	public String getCategoryId() {
		return categoryid;
	}
	public void setCategoryId(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryName() {
		return categoryname;
	}
	public void setCategoryName(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategoryDescription() {
		return categorydescription;
	}
	public void setCategoryDescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	public String getInStock() {
		return instock;
	}
	public void setInStock(String instock) {
		this.instock = instock;
	}
	private String categoryid;
	private String categoryname;	
	private String categorydescription;
	private String instock;	
}
