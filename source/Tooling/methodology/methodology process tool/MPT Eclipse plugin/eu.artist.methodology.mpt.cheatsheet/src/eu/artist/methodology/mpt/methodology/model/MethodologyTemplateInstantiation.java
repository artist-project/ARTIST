/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.methodology.model;

import java.util.Arrays;
import java.util.Set;

public class MethodologyTemplateInstantiation {
	
	static Task TECHEVA;
	static Task TECHFEAS;
	
	static Task rootTask = TECHEVA; //From root task we should be able to traverse the entire methodology

	public static void main (String arg[]){
		
		Methodology methodology = new Methodology();
		
		//TECHEVA Task
		TECHEVA = new Task (TaskID.TECHEVA)
			.setName("Evaluate the technical situation of the application to be migrated")
			.setDescription("Analyse the application to be migrated in order to characterize the technical situation of the current legacy application as well as the characteristics that the migrated application should have from the technical perspective.")
			.setPredecessor(null);
		
		Activity TECHEVA_A1 = new Activity ("TECHEVA.A1", TaskID.TECHEVA)
			.setName("Analyse programming language and architecture")
			.setDescription("Analyse the programming language and architecture of the legacy application and the requirements regarding architecture and programming language of the future application. Here aspects such as programming language, data base requirements, etc. should be considered.")
			.setTaxonomy("MAT_REPORT")
			.addOutput("MAT_REPORT")
			.addTool(Tool.MAT);
		
		Activity TECHEVA_A2 = new Activity ("TECHEVA.A2", TaskID.TECHEVA)
			.setName("Analyse operating system and interoperability")
			.setDescription("Analyse the operating system and the interoperability requirements of the legacy and the future application. Here aspects such as how the application is installed in different OS, specific hardware needs, and how the application interacts with others should be considered.")
			.setTaxonomy(null)
			.addOutput("MAT_REPORT")
			.addTool(Tool.MAT);
		
		Activity TECHEVA_A3 = new Activity ("TECHEVA.A3", TaskID.TECHEVA)
			.setName("Analyse platform")
			.setDescription("Analyse the platform where the migrated application will be deployed or the requirements for it. Here aspects such as migrated application deployment requirements, hybrid, public or private cloud implementations, etc. should be considered.")
			.setTaxonomy(null)
			.addOutput("MAT_REPORT")
			.addTool(Tool.MAT);
		
		Activity TECHEVA_A4 = new Activity ("TECHEVA.A4", TaskID.TECHEVA)
			.setName("Analyse user control and security")
			.setDescription("Analyse the security and user control requirements that the legacy and the migrated application has. Here aspects such as user profiles management, resiliency, security requirements, etc. should be considered.")
			.setTaxonomy(null)
			.addOutput("MAT_REPORT")
			.addTool(Tool.MAT);
		
		TECHEVA.getActivities().addAll(Arrays.asList(new Activity[]{TECHEVA_A1, TECHEVA_A2, TECHEVA_A3, TECHEVA_A4}));
			
		// TECHFEAS task
		
		TECHFEAS = new Task (TaskID.TECHFEAS)
			.setName("Analyse the technical feasibility of the migration")
			.setDescription("Evaluate how difficult it is to migrate the application and how much effort could potentially cost.")
			.setPredecessor(TECHEVA)
			.setSuccessor(null);
		Activity TECHFEAS_A1 = null, TECHFEAS_A2 = null, TECHFEAS_A3 = null, TECHFEAS_A4 = null, TECHFEAS_A5 = null, TECHFEAS_A6 = null;
		
		TECHFEAS_A1 = new Activity ("TECHFEAS.A1", TaskID.TECHFEAS)
			.setName("Identify components")
			.setDescription("dentify the different high level model representations of the application, from which to elaborate a detailed breakdown analysis into components or features. A feature (or functionality) is implemented by one or several components (physical implementations).")
			.setTaxonomy(null)
			.addInput ("UML Component model")
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHEVA_A1).addPredecessor(TECHEVA_A2).addPredecessor(TECHEVA_A3).addPredecessor(TECHEVA_A4)
			.addSuccessor(TECHFEAS_A2);
		
		TECHFEAS_A2 = new Activity ("TECHFEAS.A2", TaskID.TECHFEAS)
			.setName("Identify migration strategy on each component")
			.setDescription("Identify migration strategy on each component. This tasks have to cover different possible migration strategy such as: i) Installation and configuration tasks: examples and complexity depend on the target Cloud provider, whether this is an IaaS or a PaaS. b)Database migration strategy, comprising data schemas, data population and querying migration, depending on compatible legacy and cloud data bases. c) Software migration, including adaptation to new Cloud programming paradigms. d)Components connectivity migration.")
			.setTaxonomy(null)
			.addInput ("UML Component model").addInput("MAT Report")
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHFEAS_A1)
			.addSuccessor(TECHFEAS_A3);
		
		TECHFEAS_A3 = new Activity ("TECHFEAS.A3", TaskID.TECHFEAS)
			.setName("Identify potentially reusable components")
			.setDescription("Identify snippets of code from the legacy application that are reusable in the migrated application.")
			.setTaxonomy(null)
			.addInput ("Source Code")
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHFEAS_A2)
			.addSuccessor(TECHFEAS_A4);
		
		TECHFEAS_A4 = new Activity ("TECHFEAS.A4", TaskID.TECHFEAS)
			.setName("Estimate the complexity of the component")
			.setDescription("Calculate the complexity associated to each of the component. This complexity will include several aspects such as: a)Complexity inherent to the legacy code b) Reusability index")
			.setTaxonomy(null)
			.addInput ("UML Component model").addInput ("UML Class model")
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHFEAS_A3)
			.addSuccessor(TECHFEAS_A5);
		
		TECHFEAS_A5 = new Activity ("TECHFEAS.A5", TaskID.TECHFEAS)
			.setName("Estimate the complexity of the task")
			.setDescription("Calculate the complexity associated to the migration task. This complexity will also include the complexity associated to the component")
			.setTaxonomy(null)
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHFEAS_A4)
			.addSuccessor(TECHFEAS_A6);
		
		TECHFEAS_A6 = new Activity ("TECHFEAS.A6", TaskID.TECHFEAS)
			.setName("Estimate the total complexity")
			.setDescription("Calculate the total complexity of the migration project and determine the efforts required to complete every selected task for each component.")
			.setTaxonomy(null)
			.addInput ("UML Component model")
			.addOutput("TFT_REPORT")
			.addTool(Tool.TFT)
			.addPredecessor(TECHFEAS_A5)
			.addSuccessor(null);
		
		TECHFEAS.getActivities().addAll(Arrays.asList(new Activity[]{TECHFEAS_A1, TECHFEAS_A2, TECHFEAS_A3, TECHFEAS_A5, TECHFEAS_A6}));
		
		TECHEVA.setSuccessor(TECHFEAS);
		
		methodology.getTasks().add(TECHEVA);
		methodology.getTasks().add(TECHFEAS);
		
		Set<Task> startTasks = methodology.getStartTasks();
		for (Task t: startTasks){
			System.out.println ("Start task: " + t.getName());
			for (Activity a: t.getActivities()){
				System.out.println ("\tActivity: " + a.getName());
			}
			System.out.println ("Sucessor task: " + t.getSuccessor().getName());
		}
		
	}
}


