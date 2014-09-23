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

public class CouplingExplorer {
	
	private List<String> searchParam= new ArrayList<String>();
	private HashMap<String, Integer> efferent= new HashMap<String, Integer>();
	private int couplingNumber=0;
	
	
	public void addParam(String obj) {
		searchParam.add(obj);
	}

	public void clearParam() {
		searchParam.clear();
	}

	public HashMap<String, Integer> getEfferent() {
		return efferent;
	}

	public int getCouplingNum() {
		return couplingNumber;
	}

	public void clearEfferent() {
		efferent.clear();
		couplingNumber=0;
	}
	public void searchReferences(File file) throws Exception{
		
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
					if(checkRefference(line, param))
				    {
	    	        	if (efferent.get(param)!=null){
	    	        		efferent.put(param, efferent.get(param)+1);
	    	        		couplingNumber++;
	    	        		//System.out.println(param);
    	        		}else{
	    	        		efferent.put(param, 1);
	    	        		couplingNumber++;
	    	        		//System.out.println(param);
	    	        	}
				    }
				}
			}
		}	
	}
	
	private boolean checkRefference(String line, String param){
		boolean retorno=false;
		int linePos=line.indexOf(param);
		if(linePos>=0)
	    {
			retorno=true;
			line=line.substring(linePos+param.length()+1);
			if(line.indexOf(".")>=0){
				retorno=false;
			}
	    }
		
		return retorno;
	}
	
	

}
