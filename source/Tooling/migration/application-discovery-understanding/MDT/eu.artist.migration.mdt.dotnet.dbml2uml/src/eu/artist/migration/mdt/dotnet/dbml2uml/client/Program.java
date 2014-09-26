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
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Program {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Too few arguments");
			System.out.println("Usage: java -jar dbml2uml.jar <config.xml>");
		}
		else if(args.length == 1) {
			System.out.println("Starting DBML2UML Discovery (press CTRL-C to quit)");
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(String.format("%s -- Loading...", formatter.format(new Date())));
			
			File file = new File(args[0]);
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
				 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Configuration config = (Configuration)jaxbUnmarshaller.unmarshal(file);
				System.out.println(String.format("%s -- Building...", formatter.format(new Date())));
				ModelBuilder builder = new ModelBuilder();
				builder.build(config.getInput(), config.getOutput());
			}
			catch (JAXBException e) {
				e.printStackTrace();
			}
			
			System.out.println(String.format("%s -- Done!", formatter.format(new Date())));
		}
		else if(args.length == 2) {
			System.out.println("Starting DBML2UML Discovery (press CTRL-C to quit)");
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(String.format("%s -- Loading...", formatter.format(new Date())));
			
			ModelBuilder builder = new ModelBuilder();
			builder.build(args[0], args[1]);
			
			System.out.println(String.format("%s -- Done!", formatter.format(new Date())));
		}
		else {
			System.out.println("Too many arguments");
			System.out.println("Usage: java -jar dbml2uml.jar <config.xml>");
			System.out.println("Usage: java -jar <dbml-model> <uml-model>");
		}
	}

}
