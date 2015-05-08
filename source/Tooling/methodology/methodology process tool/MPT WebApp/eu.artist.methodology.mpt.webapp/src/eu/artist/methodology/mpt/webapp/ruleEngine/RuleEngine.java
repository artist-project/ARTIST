/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation  
 *  Liagouras Georgios Andreas
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.webapp.ruleEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import eu.artist.methodology.mpt.model.AnswerList;
import eu.artist.methodology.mpt.model.AnswerListContainer;
import eu.artist.methodology.mpt.model.Component;
import eu.artist.methodology.mpt.model.GlobalVariable;
import eu.artist.methodology.mpt.model.MigrationGoals;
import eu.artist.methodology.mpt.model.MigrationGoalsContainer;
import eu.artist.methodology.mpt.model.Result;

public enum RuleEngine {

	INSTANCE;

	private KnowledgeBase kbase;
	private Result result;
	private List<Component> tftComponents;

	/**
	 * Loads the MAT report from the passed {@link File} to the {@link MigrationGoalsContainer} instance.
	 * 
	 * @param matReport A {@link File} containing the MAT report
	 */
	public void loadMATReport(File matReport){
		InputStream input;
		MigrationGoals mGoals = new MigrationGoals();
		try {
			input = new FileInputStream(matReport);
			mGoals = (MigrationGoals) JAXBContext.newInstance(MigrationGoals.class).createUnmarshaller().unmarshal(input);

			
			MigrationGoalsContainer.INSTANCE.setMigrationGoals(mGoals);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadNewMATReport(File newMatReport){
		InputStream input;
		AnswerList answerList = new AnswerList();
		try {
			input = new FileInputStream(newMatReport);
			answerList = (AnswerList) JAXBContext.newInstance(AnswerList.class).createUnmarshaller().unmarshal(input);

			AnswerListContainer.INSTANCE.setAnswerList(answerList);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//This method loads the TFT reports of type CSV to the tftComponents field
	private void loadCSV(File tftReport) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(tftReport));
	    try {
	        br.readLine(); //Skipping the header line
	        String line = br.readLine();

	        tftComponents = new ArrayList<Component>();
	        
	        while (line != null) {
	        	
	        	Component component = new Component();
	        	String[]componentString = line.split(";");
	        	component.setName(componentString[0]);
	        	String[]migrationStrategies = componentString[1].split(",");
	        	for (String strategy : migrationStrategies) {
					component.getMigrationStrategies().add(strategy);
				}
	        	component.setComplexity(componentString[2]);
	        	component.setMigrationEffort(Integer.valueOf(componentString[3]));
	        	
	        	tftComponents.add(component);
	            line = br.readLine();
	        }
	    }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	        br.close();
	    }
	}
	
	/**
	 * Loads the TFT report file from the passed {@link File}. <br>
	 * Report file can be in CSV and XML format. CURRENTLY ONLY CSV FORMAT IS SUPPORTED
	 * 
	 * @param tftReport A {@link File} containing the TFT report.
	 * @throws IOException
	 */
	public void loadTFTReport (File tftReport) throws IllegalArgumentException, IOException{
		
		String[] fileName = tftReport.getName().split("\\.");
		String fileExtension = fileName[fileName.length-1];
		
		if ("CSV".equalsIgnoreCase(fileExtension)){
			loadCSV(tftReport);
		}
		else {
			IllegalArgumentException e = new IllegalArgumentException("XML file format not yet supported");
			throw e;
		}
	}

	/**
	 * Loads the knowledge base with the passed DRL file.
	 * 
	 * @param ruleFile The DRL {@link File}
	 */
	public void setRuleFile(File ruleFile) {
		try {
			// load up the knowledge base
			kbase = readKnowledgeBase(ruleFile);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	/**
	 * Fires all the rules in the rule file.
	 */
	public void fireRules(){
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		ksession.insert(MigrationGoalsContainer.INSTANCE.getMigrationGoals());
		ksession.insert(AnswerListContainer.INSTANCE.getAnswerList());
		result = new Result();
		ksession.setGlobal("result", result);
		ksession.fireAllRules();
	}
	
	/**
	 * Sets the passed global variables to the session and fires all the rules in the rule file. 
	 * 
	 * @param globals The {@link List} of global variables to be passed to the session.
	 */
	public void fireRules(List<GlobalVariable> globals){
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		if(MigrationGoalsContainer.INSTANCE.getMigrationGoals()!=null)
		ksession.insert(MigrationGoalsContainer.INSTANCE.getMigrationGoals());
		ksession.insert(AnswerListContainer.INSTANCE.getAnswerList());

		result = new Result();
		ksession.setGlobal("result", result);
		
		for (GlobalVariable variable : globals) {
			ksession.setGlobal(variable.getName(), variable.getVariable());
		}
		ksession.fireAllRules();
	}

	//Initialization of Drools knowledge base.
	private KnowledgeBase readKnowledgeBase(File ruleFile) throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newFileResource(ruleFile), ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error: errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}
	
	
	public void removeRules()
	{
		if(AnswerListContainer.INSTANCE.getAnswerList()!=null)
		AnswerListContainer.INSTANCE.setAnswerList(null);
		
		if (MigrationGoalsContainer.INSTANCE.getMigrationGoals()!=null)
		MigrationGoalsContainer.INSTANCE.setMigrationGoals(null);
	}
	
	/**
	 * Returns the result object
	 * 
	 * @return
	 */
	public Result getResult(){
		return result; 
	}
	
	/**
	 * Returns the TFT {@link Component}s loaded from the TFT report
	 * 
	 * @return A {@link} list of {@link Component}s
	 */
	public List<Component> getTFTComponents(){
		return tftComponents;
	}
}
