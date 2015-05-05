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

package eu.artist.migration.mmc.metricexplorer;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import eu.artist.migration.mmc.structures.Method;
import eu.artist.migration.mmc.structures.SourceFile;



public class CSExplorer  implements ClassExplorer{
	private List<String> noMethodList = Arrays.asList(new String[]{"namespace", "class", "while", "using", "if", "for", "else", "get", "set", "try", "catch", "finally", "switch", "foreach", "do"});
	private String methodCode="";
	
	
	public SourceFile findMethodsParser(File file) throws Exception{
		return findMethodsParser(file, null);
	}

	public SourceFile findMethodsParser(File file, ArrayList<Integer> lines) throws Exception{
		SourceFile sf;
    	sf =getMethods(file, lines);
	    	
	    sf.setName(file.getName());
	    sf.setPath(file.getPath());
	    //TODO set package
		return sf;

	}

	private SourceFile getMethods (File file, ArrayList<Integer> lines) throws Exception{
		Scanner scanner = new Scanner(file);
		String line="";
		int linNumber=0;
		SourceFile retorno= new SourceFile();
		retorno.setTotalyReusable("true");
		
		boolean insideMethod=false;
		Method obj= new Method();
		int keyNum=0;
		while(scanner.hasNext())
		{
			linNumber++;
			line=scanner.nextLine();
			int linePos=line.indexOf("{");
			if(linePos>=0)
		    {
				if (insideMethod){
					keyNum++;
				}
				if (checkLine(line)){
					String name=getMethodName(line);
					if (!name.equals("")){
						insideMethod=true;
						obj.setName(name);
						//System.out.println("Method Name: "+name);
						obj.setBline(""+linNumber);	
						//System.out.println("Beginline: "+linNumber);
						keyNum++;
					}
				}
		    }
			if (insideMethod){
				linePos=line.indexOf("}");
				methodCode+=line;
				if(linePos>=0){
					keyNum--;
					if (keyNum==0){
						insideMethod=false;
						obj.setEline(""+linNumber);
						obj.setCode(methodCode);
						methodCode="";
						//System.out.println("Endline: "+linNumber);
	                    String reusable= "true";
	                    if (lines!=null){
		                    for (Integer lin: lines){
		                    	if (lin>Integer.parseInt(obj.getBline())&&lin<linNumber){
		                    		reusable="false";
		                    		System.out.println("Not reusable!!");
		                    		retorno.setTotalyReusable("false");
		                    	}
		                    }
	                    }
	                    obj.setReusable(reusable);
						retorno.addLinea(obj);
						
						obj= new Method();
						
					}
				}
			}
			linePos=line.indexOf("namespace");
			if(linePos>=0){
			    retorno.setPackageName(line);
			}

		}	
		return retorno;
		
	}	

	
	private boolean checkLine(String line){
		boolean retorno=true;
		if (line.indexOf("\"")>=0){
			return false;
		}
		
		for (String str :noMethodList){
			if (line.indexOf(str+" ")>=0){
				return false;
			}
			if (line.indexOf(str+"(")>=0){
				return false;
			}
			if (line.indexOf(str+"{")>=0){
				return false;
			}
		}
		
		return retorno;
	}

	private String getMethodName(String line){
		String retorno="";
		int end= line.indexOf("(");
		if (end>=0){
			line=line.substring(0, end);
			int begin=line.lastIndexOf(" ");
			retorno=line.substring(begin+1);
		}
		return retorno;
	}
	
}
