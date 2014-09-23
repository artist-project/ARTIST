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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import  eu.artist.premigration.tft.scc.metricexplorer.CSExplorer;
import eu.artist.premigration.tft.scc.metricexplorer.ComponentExplorer;
import eu.artist.premigration.tft.scc.metricexplorer.Searcher;
import eu.artist.premigration.tft.scc.structures.SearchResult;

public class ClassNumberTest {

	public static void main(String[] args) throws Exception{
		
		File folder = new File("D:/Proyectos/Artist/PetShop/dotNet/Pet Shop 4");
		
		
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Components Found in project");
		HashMap<String, List<String>> componentMap=s.getComponetsMap(folder, "cs", "namespace", 2);
    	Iterator<String> keySetIterator = componentMap.keySet().iterator();

    	while(keySetIterator.hasNext()){
    		String key = keySetIterator.next();
    		System.out.println("Component: " + key + " Class Number: " + componentMap.get(key).size());
    	}
		List<String> componentList=s.getComponetsList(folder, "cs", "namespace", 2);
    	
		System.out.println();
		System.out.println("****** Components List in project");
		for (String com: componentList){
    		System.out.println("Component: " + com);
			
		}

		folder = new File("D:/Proyectos/Artist/javapetstore-2.0-ea5/src");
		s= new ComponentExplorer();  

		System.out.println();
		System.out.println("****** Components Found in project");
		componentMap=s.getComponetsMap(folder, "java", "package", 1);
    	keySetIterator = componentMap.keySet().iterator();

    	while(keySetIterator.hasNext()){
    		String key = keySetIterator.next();
    		System.out.println("Component: " + key + " Class Number: " + componentMap.get(key).size());
    	}

		
	}

}
