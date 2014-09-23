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

import eu.artist.premigration.tft.scc.structures.SearchResult;


public class Searcher {
	
	private List<String> fileTypes= new ArrayList<String>();
	private List<String> searchParam= new ArrayList<String>();
	private List<SearchResult> searchResult= new ArrayList<SearchResult>();
	private List<SearchResult> searchNoResult= new ArrayList<SearchResult>();
	
	public void addType(String obj) {
		fileTypes.add(obj);
	}
	
	public void addParam(String obj) {
		searchParam.add(obj);
	}

	private void addResult(SearchResult obj) {
		searchResult.add(obj);
	}

	private void addNoResult(SearchResult obj) {
		searchNoResult.add(obj);
	}

	public List<SearchResult> getResult() {
		return searchResult;
	}
	public List<SearchResult> getNoResult() {
		return searchNoResult;
	}
	
	public void searchInFolder(File folder) throws Exception{
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	searchInFolder(fileEntry);
	        } else {
	        	for (String ext : fileTypes) {
	        		String extension = fileEntry.getName().substring((fileEntry.getName().lastIndexOf('.')+1));
	        		if(extension.equals(ext)){
	        			ArrayList<Integer> lines =searchInFile(fileEntry);
	        			SearchResult obj= new SearchResult();
	        			obj.setFileName(fileEntry.getPath());
	        			obj.setLines(lines);
	        			if(lines.size()>0){
		        			//System.out.println(fileEntry.getPath());
		        			addResult(obj);
	        			}else{
		        			addNoResult(obj);
	        			}
	        			
	        		}
	    		}
	        }
	    }
	}
	
	public void searchInClassList( List<String> classList) throws Exception{
	    for (String filename : classList) {
	    	File fileEntry= new File(filename);
			ArrayList<Integer> lines =searchInFile(fileEntry);
			SearchResult obj= new SearchResult();
			obj.setFileName(filename);
			obj.setLines(lines);
			if(lines.size()>0){
    			addResult(obj);
			}else{
    			addNoResult(obj);
			}
			
		}
	}	
	public ArrayList<Integer> searchInFile(File file) throws Exception{
		
		ArrayList<Integer> retorno= new ArrayList<Integer>();
		Scanner scanner = new Scanner(file);
		
		int linNum=0;
		boolean comented=false;
		while(scanner.hasNext())
		{
			linNum++;
			String line=scanner.nextLine();
			//search coments
    		int comentStart=0;
    		int linePos=line.indexOf("/*");
			if(linePos>=0)
		    {
				//Starts comented code
				comented= true;
				comentStart=linePos;
		    }
			if (comented){
				linePos=line.indexOf("*/");
				if(linePos>=0)
			    {
					//Ends comented code
					line= line.substring(0, comentStart)+line.substring(linePos);
					comented=false;
			    }					
			}
			if(comented==false){
				//search comented lines
				linePos=line.indexOf("//");
				if(linePos>=0)
			    {
					line= line.substring(0, linePos);
			    }        		
			
	        	for (String param : searchParam) {
					// search params
					linePos=line.indexOf(param);
					if(linePos>=0)
				    {
				        System.out.println("Line "+linNum+":  "+line);
				        retorno.add(linNum);
				    }
				}
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
	
}//EOF
