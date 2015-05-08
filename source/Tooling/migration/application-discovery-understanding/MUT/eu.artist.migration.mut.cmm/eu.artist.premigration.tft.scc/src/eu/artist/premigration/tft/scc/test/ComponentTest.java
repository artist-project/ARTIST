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

public class ComponentTest {

	public static void main(String[] args) throws Exception{
		
		UMLExplorer ue= new UMLExplorer();
		File umlfile = new File("D:/Proyectos/Artist/Desarrollo/UML/DEWS-ComponentModel.uml");

        System.out.println("XML Component: "+umlfile.getName());
        System.out.println();
        UmlElement result=ue.exploreComponents(umlfile);
//Marshall the result objet
       /*
        JAXBContext jc = JAXBContext.newInstance(UmlElement.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 
		marshaller.marshal(result, System.out);
*/
		umlfile = new File("D:/Proyectos/Artist/Desarrollo/UML/DEWS-SecondMixedModel.uml");
        System.out.println("XML name: "+umlfile.getName());

		for(UmlElement e : result.getChilds()){
			ue.exploreComponent(umlfile, e.getChilds());
	        System.out.println();
	        System.out.println("Component name: "+e.getName());
	        System.out.println("Aggregations number: "+ue.getAggregationNumber());
	        System.out.println("Generalizations number: "+ue.getGeneralizationsNumber());
	        System.out.println("Hierarchies number: "+ue.getHierarchiesNumber());
	        System.out.println();
			
		}
		
	}

}
