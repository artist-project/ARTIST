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

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.BodyDeclaration;
import japa.parser.ast.body.ConstructorDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.TypeDeclaration;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import eu.artist.migration.mmc.structures.SourceFile;

public class JavaExplorer  implements ClassExplorer{
	
	private URLClassLoader classLoader;

	public SourceFile findMethodsParser(File file) throws Exception {
		return findMethodsParser(file, null);
	}

	public SourceFile findMethodsParser(File file, ArrayList<Integer> lines) throws Exception{
		CompilationUnit cu = JavaParser.parse(file);
		//new MethodVisitor().visit(cu, null);
		SourceFile sf;
    	sf =getMethods(cu, lines);
	    	
	    sf.setName(file.getName());
	    sf.setPath(file.getPath());
	    sf.setPackageName(cu.getPackage().toString());
		return sf;

	}

	
	private SourceFile getMethods(CompilationUnit cu, ArrayList<Integer> lines) {
		SourceFile retorno= new SourceFile();
		retorno.setTotalyReusable("true");
        List<TypeDeclaration> types = cu.getTypes();
        for (TypeDeclaration type : types) {
            List<BodyDeclaration> members = type.getMembers();
            for (BodyDeclaration member : members) {
                if (member instanceof MethodDeclaration) {
                	eu.artist.migration.mmc.structures.Method obj= new eu.artist.migration.mmc.structures.Method(); 
                	MethodDeclaration m = (MethodDeclaration) member;
                    obj.setName(m.getName());
                    obj.setCode(m.toString());
                    obj.setBline(""+m.getBeginLine());
                    obj.setEline(""+m.getEndLine());
                    String reusable= "true";
                    if (lines!=null){
	                    for (Integer line: lines){
	                    	if (line>m.getBeginLine()&&line<m.getEndLine()){
	                    		reusable="false";
	                    		retorno.setTotalyReusable("false");
	                    	}
	                    }
                    }
                    	
                    obj.setReusable(reusable);
                    retorno.addLinea(obj);
                }
                if (member instanceof ConstructorDeclaration) {
                	eu.artist.migration.mmc.structures.Method obj= new eu.artist.migration.mmc.structures.Method(); 
                	ConstructorDeclaration m = (ConstructorDeclaration) member;
                    obj.setName(m.getName());
                    obj.setCode(m.toString());
                    obj.setBline(""+m.getBeginLine());
                    obj.setEline(""+m.getEndLine());
                    String reusable= "true";
                    if (lines!=null){
	                    for (Integer line: lines){
	                    	if (line>m.getBeginLine()&&line<m.getEndLine()){
	                    		reusable="false";
	                    		retorno.setTotalyReusable("false");
	                    	}
	                    }
                    }
                    	
                    obj.setReusable(reusable);
                    retorno.addLinea(obj);
                }
            }
        }
        return retorno;
    }
	

	private void setPath(String path) throws Exception{
		classLoader = URLClassLoader.newInstance(new URL[] {new URL(path)});
	}
	
	private void findMethods(String className) throws Exception{

		Class<?> c = classLoader.loadClass(className);
		
	    System.out.println();
	    System.out.println("***** Methods in class "+className);
		for (Method method : c.getDeclaredMethods()) {
		    System.out.println(method.getName());
		}
		
	}


	
	private void findMethodsbyPath (File file) throws Exception{
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext())
		{
			String line=scanner.nextLine();
			int lineNum=line.indexOf("{");
			
			if(lineNum>=0)
		    {
				lineNum=line.indexOf("(");
				if(lineNum>=0)
			    {
					String methodName=getMethodName(line);
					if (!methodName.equals(" ")){
						System.out.println("Linea: "+line);
						System.out.println(getMethodName(line));
					}
			    }
		    }
		}	
		
	}

	private void analyzeClass (File file) throws Exception{
		Scanner scanner = new Scanner(file);
		String line="";
		while(scanner.hasNext())
		{
			line=scanner.nextLine();
			int linePos=line.indexOf("package");
			
			if(linePos>=0)
		    {
				System.out.println("package: "+line.substring(8, line.length()-1));
				break;
		    }
		}	
		
		while(scanner.hasNext())
		{
			line=scanner.nextLine();
			int linePos=line.indexOf("import");
			int linePos2=line.indexOf("class");
			if (linePos2>=0){
				System.out.println("class: "+line.substring(linePos2+6,line.length()-1));
				break;
			}
			
			if(linePos>=0)
		    {
				System.out.println("import: "+line.substring(7, line.length()-1));
		    }
		}
		
	}
	
	
	
	private String getMethodName(String line){
		StringTokenizer token = new StringTokenizer(line, " ");
		String retorno="";
		int j=token.countTokens();
		for (int i=0;i<j;i++){
			retorno= token.nextToken();
			int lineNum=retorno.indexOf("(");
			if(lineNum>=0)
		    {
				retorno=retorno.substring(0, lineNum);
				break;
		    }
			
		}
		return retorno;
	}
	
	
}
