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

public class AfferentTest {

	public static void main(String[] args) throws Exception {
		File folder = new File("D:/Proyectos/Artist/javapetstore-2.0-ea5/src");
		
		ComponentExplorer s= new ComponentExplorer(); 

		System.out.println();
		System.out.println("****** Afferent Coupling Test");
		HashMap<String, List<String>> componentMap=s.getComponetsMap(folder, "java", "package", 1);

    	List<String> componentList=s.getComponetsList(folder, "java", "package", 1);

    	CouplingExplorer ce= new CouplingExplorer(); 
		for (String com: componentList){
			ce.clearParam();
			ce.clearEfferent();
			ce.addParam("import "+com);
			for (String com2: componentList){
	    		List<String> sourceFiles=componentMap.get(com2);
	    		for (String sf: sourceFiles){
	    			File src = new File(sf);
	    			ce.searchReferences(src);
	    		}
	    	}
			System.out.println("Component: "+com+" Afferent Coupling: "+ce.getCouplingNum());
		}

	}

}
