/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import eu.artist.premigration.tft.scc.metricexplorer.UMLExplorer;
import eu.artist.premigration.tft.scc.structures.UmlElement;
import eu.artist.premigration.tft.scc.structures.Project;


public class UMLTest {

	public static void main(String[] args) throws Exception{

		
		UMLExplorer ue= new UMLExplorer();

		File umlfile = new File("D:/Proyectos/Artist/Desarrollo/UML/PetStore.uml");
		ue.exploreUML(umlfile);
		
        System.out.println();
        System.out.println("File name: "+umlfile.getName());
        System.out.println("Aggregations number: "+ue.getAggregationNumber());
        System.out.println("Generalizations number: "+ue.getGeneralizationsNumber());
        System.out.println("Hierarchies number: "+ue.getHierarchiesNumber());
        System.out.println();

		umlfile = new File("D:/Proyectos/Artist/Desarrollo/UML/DEWS-SecondMixedModel.uml");
		ue.exploreXML(umlfile);
		
        System.out.println();
        System.out.println("XML name: "+umlfile.getName());
        System.out.println("Aggregations number: "+ue.getAggregationNumber());
        System.out.println("Generalizations number: "+ue.getGeneralizationsNumber());
        System.out.println("Hierarchies number: "+ue.getHierarchiesNumber());
        System.out.println();
		
		umlfile = new File("D:/Proyectos/Artist/Desarrollo/UML/export.uml");
		ue.exploreXML(umlfile);
		
        System.out.println();
        System.out.println("XML name: "+umlfile.getName());
        System.out.println("Aggregations number: "+ue.getAggregationNumber());
        System.out.println("Generalizations number: "+ue.getGeneralizationsNumber());
        System.out.println("Hierarchies number: "+ue.getHierarchiesNumber());
        System.out.println();
		
	}

	
}
