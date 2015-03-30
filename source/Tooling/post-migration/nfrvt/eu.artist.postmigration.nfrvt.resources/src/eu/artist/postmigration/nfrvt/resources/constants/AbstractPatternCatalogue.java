/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.resources.constants;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import com.google.common.base.CaseFormat;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

public class AbstractPatternCatalogue extends AbstractResourceConstant {
public static URI CATALOGUE_URI;
	
	public final MigrationModelElement<PatternCatalogue> CATALOGUE;
		
	protected PatternCatalogue catalogue;
	protected Map<String, Pattern> nameToPattern = new HashMap<>();
	
	public AbstractPatternCatalogue(String uriString) {
		CATALOGUE_URI = URI.createURI(uriString);
		this.catalogue = resourceSet.loadPatternCatalogue(CATALOGUE_URI);
		CATALOGUE = new MigrationModelElement<PatternCatalogue>(catalogue);
		collectPatterns();
	}
	
	protected void generateConstantCode() {		
		// element constants
		System.out.println("public interface Element {");
		for(Pattern pattern : getCatalogue().getPatterns()) {
			System.out.println("final "+pattern.eClass().getName()+" "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+" = "+ this.getClass().getSimpleName() +".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+".getElement();");
		}
		System.out.println("}");
		System.out.println();
		
		// fqn constants
		System.out.println("public interface FQN {");
		for(Pattern pattern : getCatalogue().getPatterns()) {
			System.out.println("final String "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+" = "+this.getClass().getSimpleName()+".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+".getFullyQualifiedName();");
		}
		System.out.println("}");
		System.out.println();
		
		// uri constants
		System.out.println("public interface Uri {");
		for(Pattern pattern : getCatalogue().getPatterns()) {
			System.out.println("final String "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+" = "+this.getClass().getSimpleName()+".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName())+".getUri();");
		}
		System.out.println("}");
		System.out.println();
		
		// singleton code
		System.out.println("private static "+this.getClass().getSimpleName()+" instance;");
		System.out.println();
		System.out.println("public static "+this.getClass().getSimpleName()+" getInstance() {");
		System.out.println("if(instance == null)");
		System.out.println("instance = new "+this.getClass().getSimpleName()+"();");
		System.out.println("return instance;");
		System.out.println("}");
		
		// migration umlPackage element fields 
		for(Pattern pattern : getCatalogue().getPatterns()) {
			System.out.println("public final MigrationModelElement<"+pattern.eClass().getName()+"> " + CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName()) + ";");
		}
		System.out.println();
		
		// constructor initialization
		System.out.println("for(Pattern pattern : getCatalogue().getPatterns())");
		System.out.println("setPattern(pattern.getName(), pattern);");
		for(Pattern pattern : getCatalogue().getPatterns()) {
			System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, pattern.getName()) + " = new MigrationModelElement<"+pattern.eClass().getName()+">"
					+ "(get" + pattern.eClass().getName() + "ByName(\"" + pattern.getName() + "\"));");
		}
	}
	
	protected void setPattern(String name, Pattern pattern) {
		nameToPattern.put(name, pattern);
	}
	
	protected PatternCatalogue getCatalogue() {
		return catalogue;
	}
	
	protected void collectPatterns() {
		for(Pattern pattern : getCatalogue().getPatterns())
			setPattern(pattern.getName(), pattern);
	}
	
	public Pattern getPatternByName(String name) {
		return nameToPattern.get(name);
	}
}
