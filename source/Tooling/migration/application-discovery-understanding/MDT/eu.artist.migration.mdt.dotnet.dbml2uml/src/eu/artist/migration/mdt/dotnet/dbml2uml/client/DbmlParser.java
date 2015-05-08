/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.dbml2uml.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import eu.artist.migration.mdt.dotnet.dbml2uml.model.Database;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.ObjectFactory;

public class DbmlParser {

	public DbmlParser() {
		
	}
	
	public Database parse(String fileName) {
		ObjectFactory factory = new ObjectFactory();
		Database db = factory.createDatabase();
		try {
			File file = new File(fileName);
			JAXBContext jaxbContext = JAXBContext.newInstance(Database.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			JAXBElement<Database> root = jaxbUnmarshaller.unmarshal(new StreamSource(file), Database.class);
			db = root.getValue();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}
}
