/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.test.model;

import java.util.ArrayList;
import java.util.List;

public enum ModelProvider {
	INSTANCE;

	private List<Person> persons;

	private ModelProvider() {
		persons = new ArrayList<Person>();
		// Image here some fancy database access to read the persons and to
		// put them into the model
		persons.add(new Person("Rainer", "Zufall", "male", true));
		persons.add(new Person("Reiner", "Babbel", "male", true));
		persons.add(new Person("Marie", "Dortmund", "female", false));
		persons.add(new Person("Holger", "Adams", "male", true));
		persons.add(new Person("Juliane", "Adams", "female", true));
	}

	public List<Person> getPersons() {
		return persons;
	}

}
