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

import eu.artist.premigration.tft.scc.metricexplorer.ComponentExplorer;
import eu.artist.premigration.tft.scc.metricexplorer.CouplingExplorer;
import eu.artist.premigration.tft.scc.metricexplorer.Searcher;

public class EfferentTest {
	public static void main(String[] args) throws Exception {
		File folder = new File("D:/Proyectos/Artist/javapetstore-2.0-ea5/src");
		
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Efferent Coupling Test");
		HashMap<String, List<String>> componentMap=s.getComponetsMap(folder, "java", "package", 1);
    	Iterator<String> keySetIterator = componentMap.keySet().iterator();

    	List<String> componentList=s.getComponetsList(folder, "java", "package", 1);

    	CouplingExplorer ce= new CouplingExplorer(); 
		for (String com: componentList){
			ce.addParam("import "+com);
		}
    	
		while(keySetIterator.hasNext()){
			ce.clearEfferent();
    		String key = keySetIterator.next();
    		List<String> sourceFiles=componentMap.get(key);
    		for (String sf: sourceFiles){
    			File src = new File(sf);
    			ce.searchReferences(src);
    		}
			System.out.println("Component: "+key+" Efferent Coupling: "+ce.getCouplingNum());
			System.out.println("Component: "+key+" Efferent Unique Coupling: "+ce.getEfferent().size());
    	}

	}


}
