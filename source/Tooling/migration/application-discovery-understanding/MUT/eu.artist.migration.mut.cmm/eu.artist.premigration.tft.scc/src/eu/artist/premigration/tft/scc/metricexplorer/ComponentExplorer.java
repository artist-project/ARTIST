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

package eu.artist.premigration.tft.scc.metricexplorer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ComponentExplorer {

	private List<String> componentList= new ArrayList<String>();
	private HashMap<String, List<String>> componentMap = new HashMap<String, List<String>>();

	
	public List<String> getComponetsList(File folder, String ext, String key, int type) throws Exception{
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	getComponetsList(fileEntry, ext, key, type);
	        } else {
	        		String extension = fileEntry.getName().substring((fileEntry.getName().lastIndexOf('.')+1));
	        		if(extension.equals(ext)){
	        			String name =getComponentName(fileEntry, key, type);
	        			boolean encontrado=false;
	        			if (!name.equals("")){
		    	        	for (String com : componentList) {
		    	        		if (com.equals(name)){
		    	        			encontrado=true;
		    	        		}
		    	        	}
		    	        	if (!encontrado){
		    	        		componentList.add(name);
		    	        	}
	        			}
	        			
	        		}
	    		}
	        
	    }
		return componentList;
	}
	
	public HashMap<String, List<String>> getComponetsMap(File folder, String ext, String key, int type) throws Exception{
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	getComponetsMap(fileEntry, ext, key, type);
	        } else {
	        		String extension = fileEntry.getName().substring((fileEntry.getName().lastIndexOf('.')+1));
	        		if(extension.equals(ext)){
	        			String name =getComponentName(fileEntry, key, type);
	        			if (!name.equals("")){
		    	        	if (componentMap.get(name)!=null){
		    	        		componentMap.get(name).add(fileEntry.getPath());
		    	        	}else{
		    	        		List<String> sourceList= new ArrayList<String>();
		    	        		sourceList.add(fileEntry.getPath());
		    	        		componentMap.put(name, sourceList);
		    	        	}
	        			}
	        			
	        		}
	    		}
	        
	    }
		return componentMap;
	}
	
	private String getComponentName(File file, String key, int type) throws Exception{
		
		String retorno="";
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext())
		{
			String line=scanner.nextLine();
			int linePos=line.indexOf(key);
			if(linePos>=0){
			    retorno=getPackageName(line, type);
				//System.out.println("Line: "+line);
			}
		}	
		return retorno;
	}
	
	
	public String getPackageName(String line, int type) throws Exception{
		String retorno="";
		int linePos;
		if (type==1){//java
			linePos=line.indexOf("package");
			retorno=line.substring(linePos+8);
		}
		if (type==2){//csharp
			linePos=line.indexOf("namespace");
			retorno=line.substring(linePos+10);
		}
		linePos=retorno.indexOf(" ");
		if(linePos>=0){
			retorno=retorno.substring(0, linePos);
		}
		linePos=retorno.indexOf("{");
		if(linePos>=0){
			retorno=retorno.substring(0, linePos);
		}
		linePos=retorno.indexOf(";");
		if(linePos>=0){
			retorno=retorno.substring(0, linePos);
		}
				
		return retorno;
	}
	
	
	
}
