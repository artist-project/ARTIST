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

package eu.artist.migration.mmc.test;

import java.io.File;
import java.util.HashMap;

import eu.artist.migration.mmc.metricexplorer.ClassExplorer;
import eu.artist.migration.mmc.metricexplorer.CyclomaticExplorer;
import eu.artist.migration.mmc.metricexplorer.JavaExplorer;
import eu.artist.migration.mmc.metricexplorer.Searcher;
import eu.artist.migration.mmc.structures.Method;
import eu.artist.migration.mmc.structures.Project;
import eu.artist.migration.mmc.structures.SearchResult;
import eu.artist.migration.mmc.structures.SourceFile;

public class CyclomaticComplexityTest {

	public static void main(String[] args) throws Exception {
		File folder = new File("D:/Proyectos/Artist/javapetstore-2.0-ea5/src");
		
		
		//Buscar objetos no reutilizables
		Searcher s= new Searcher(); 
		s.addType("java");
		s.searchInFolder(folder);
		
		ClassExplorer ce= new JavaExplorer();

		//Creacion del objeto Project
		Project p= new Project();
		
		for (SearchResult sr : s.getNoResult()) {
			File sampleFile = new File(sr.getFileName());
			p.addSourceFile(ce.findMethodsParser(sampleFile));
			
		}
		CyclomaticExplorer cy= new CyclomaticExplorer();
		HashMap<String, Float> ComMap= new HashMap<String, Float>();
		String comName="";
		float sfNum=0;
		float ccc=0;
		for (SourceFile sf : p.getSourceFile()) {
			String actualName=s.getPackageName(sf.getPackageName(),1);
			if (!comName.equals(actualName)){
				if (!comName.equals("")){
					ccc=ccc/sfNum;
					ComMap.put(comName,ccc);
					System.out.println("Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
					ccc=0;
					sfNum=0;
				}
				comName=actualName;
			}
			//System.out.println();
			//System.out.println("Component name: "+actualName+" Class name: "+sf.getName());
			float cyNum=0;
			for (Method mt : sf.getMethods()) {
				int mcc=cy.getCyclomatic((mt.getCode()));
				cyNum+=mcc;
				//System.out.println(mt.getName()+" Cyclomatic level: "+mcc);
			}
			float sfcc=0;
			if (sf.getMethods().size()>0){
				sfcc=cyNum/sf.getMethods().size();
			}
					
			System.out.println("Source file level: "+cyNum+" Method number: "+sf.getMethods().size()+" Cyclomatic Complexity number: "+sfcc);
			sfNum++;
			ccc+=sfcc;
			
		}
		if (!comName.equals("")){
			ccc=ccc/sfNum;
			System.out.println("********Component:"+comName+" file number: "+sfNum+" Cyclomatic Complexity number: "+ccc);
		}
		

	}

}
