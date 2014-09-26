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
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.client;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Program {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Too few arguments");
			System.out.println("Usage: java -jar sharepointmodel2uml.jar <config.xml>");
		}
		else if(args.length == 1) {
			System.out.println("Starting SP2UML Discovery (press CTRL-C to quit)");
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(String.format("%s -- Loading...", formatter.format(new Date())));
			
			File file = new File(args[0]);
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
				 
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Configuration config = (Configuration)jaxbUnmarshaller.unmarshal(file);
				System.out.println(String.format("%s -- Building...", formatter.format(new Date())));
				
				FeatureParser parser = new FeatureParser();
				
				ArrayList<String> resourceFiles = new ArrayList<String>();
				resourceFiles.add("res/core.resx");
				resourceFiles.addAll(config.getResources());
				//resourceFiles.add("in/SPTG.resx");
				
				parser.loadResources(resourceFiles);
				
				ArrayList<String> fieldsAndContentTypes = new ArrayList<String>();
				fieldsAndContentTypes.add("res/fieldswss.xml");
				fieldsAndContentTypes.add("res/fieldswss2.xml");
				fieldsAndContentTypes.add("res/fieldswss3.xml");
				fieldsAndContentTypes.add("res/ctypeswss.xml");
				fieldsAndContentTypes.add("res/ctypeswss2.xml");
				fieldsAndContentTypes.addAll(config.getTypes());
				//fieldsAndContentTypes.add("in/ContentTypes.xml");
				//fieldsAndContentTypes.add("in/SiteColumns.xml");
				parser.parse(fieldsAndContentTypes);
				
				ArrayList<String> listInstances = new ArrayList<String>();
				listInstances.addAll(config.getInstances());
				//listInstances.add("in/PendingNotificationsList.xml");
				//listInstances.add("in/WorkflowInstancesList.xml");
				//listInstances.add("in/WorkflowTracingList.xml");
				//listInstances.add("in/WRCDeploymentsList.xml");
				//listInstances.add("in/WRCDesignsList.xml");
				//listInstances.add("in/WRCInstancesList.xml");
				parser.parse(listInstances);
				
				HashMap<String, Object> elements = parser.getElements();
				System.out.println("There are " + elements.size() + " elements in the repository.");
				ModelBuilder builder = new ModelBuilder();
				builder.build(elements, config.getOutput());
				
			}
			catch (JAXBException e) {
				e.printStackTrace();
			}
			
			System.out.println(String.format("%s -- Done!", formatter.format(new Date())));
		}
		else {
			System.out.println("Too many arguments");
			System.out.println("Usage: java -jar sharepointmodel2uml.jar <config.xml>");
		}
		
		
		
		System.out.println("Done!");
		
	}
	
}
