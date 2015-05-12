/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.moola.dsl.workflow;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.artist.moola.dsl.core.Definition;
import eu.artist.moola.dsl.core.ModelLink;
import eu.artist.moola.dsl.core.Project;
import eu.artist.moola.dsl.core.Specification;
import eu.artist.moola.dsl.core.Transformation;
import eu.artist.moola.logging.Log;
import eu.artist.moola.workflow.Arc;
import eu.artist.moola.workflow.OrSplitTransition;
import eu.artist.moola.workflow.Place;
import eu.artist.moola.workflow.Token;
import eu.artist.moola.workflow.Transition;
import groovy.lang.Closure;

public class ProcessFactory {

//	public static MoolaProcess generateProcess1(Project project, Log log) {		
//		Map<String, TrafoTransition> transitions = new HashMap<>();
//		Map<String, OrSplitTransition> orSplits = new HashMap<>();
//
//		//Place start = new Place("Start");
//		Place end = new Place("End");
//		
//		List<Place> startPlaces = new ArrayList<>();
//
//		boolean autoDetectStart = project.getStartTrafos() == null || 
//				                  project.getStartTrafos().size() == 0;
//				
//		MoolaProcess process = new MoolaProcess();
//		process.setLog(log);
//		//process.addPlace(start);
//		process.addPlace(end);
//		
//		// we need to first create all transitions
//		for(Transformation trafo : project.getTransformations()) {
//			TrafoTransition trans = new TrafoTransition(trafo.getName(), trafo);
//			transitions.put(trafo.getName(), trans);
//			process.addTransitions(trans);
//		}
//		
//		// determine, which trafos need a OR split in front
//		for(Transformation trafo : project.getTransformations()) {
//			Map<String, Closure<?>> dependsOn = trafo.getDependsOn();
//			TrafoTransition trans = transitions.get(trafo.getName());
//			
//			for(String dependency : dependsOn.keySet()) {
//				if(dependsOn.get(dependency) == null) {
//					// no condition
//					continue;
//				}
//				
//				if(!orSplits.containsKey(dependency)){
//					String transitionName = "OR-" + dependency; 
//					
//					Transition d = transitions.get(dependency);
//					OrSplitTransition orSplit = new OrSplitTransition(transitionName);
//					orSplits.put(dependency, orSplit);
//					process.addTransitions(orSplit);
//
//					// construct: dependency -> place -> OR_split
//					String placeName = "p_" + d.getName() + "_" + orSplit.getName(); 
//					Place p = new Place(placeName);
//					Arc.connect(d, p);
//					Arc.connect(p, orSplit);
//					process.addPlace(p);
//
//					// construct: OR_split -> place (= OR_merge) -> current trafo
////					Place orMerge = trans.getInputPlace();
////					if(orMerge == null) {
////						String name = "p_Pre-" + trafo.getName();
////						orMerge = new Place(name);
////						Arc.connect(orMerge, trans);
////						process.addPlace(orMerge);
////						trans.setInputPlace(orMerge);
////					}
////					Arc.connect(orSplit, orMerge);
//				}
//			}
//		}
//		
//		// connect transitions
//		for(Transformation trafo : project.getTransformations()) {
//			TrafoTransition trans = transitions.get(trafo.getName());
//
//			// generate one input place for each transition
//			if(trans.getInputPlace() == null) {
//				String name = "Pre-" + trafo.getName();
//				Place inputPlace = new Place(name);
//				Arc.connect(inputPlace, trans);
//				process.addPlace(inputPlace);
//				trans.setInputPlace(inputPlace);
//			}
//			
//			// construct places and arcs to dependencies
//			for(String dependency : trafo.getDependsOn().keySet()) {
//				Transition d = null;
//				Closure<?> condition = trafo.getDependsOn().get(dependency);
//
//				// check if there is a OR split for this dependency
//				if(orSplits.containsKey(dependency)){
//					d = orSplits.get(dependency);
//				} else {
//					d = transitions.get(dependency);
//				}
//
//				Place p = trans.getInputPlace();
//				p.setName(d.getName() + "_to_" + p.getName()); // append all input transitions to generate a meaningful name
//				
//				if(condition == null) {
//					Arc.connect(d, p);	
//				} else {
//					Arc.connect(d, p, new CodeCondition(condition));
//				}
//			}
//			
//			if(autoDetectStart) {
//				// if there are no dependencies, we can exec it right from the start
//				if(trafo.getDependsOn().isEmpty()) {
//					startPlaces.add(trans.getInputPlace()); //Arc.connect(start, trans);
//				} 
//			} else {
//				// if it is defined as start trafo in the project, register the input place to receive a token
//				if(project.getStartTrafos().contains(trafo.getName())){
//					startPlaces.add(trans.getInputPlace());
//					//Arc.connect(start, trans);
//				}
//			}
//		}
//		
//		for(Transition trans : transitions.values()) {
//			if(!trans.hasOutput()) {
//				// nothing depends on this trans => can link to end place
//				Arc.connect(trans, end);
//			}
//		}
//
////		if(autoDetectStart) {
////			startPlaces.add(start);
////		}
//		
//		// add tokens to start places
//		for(Place startPlace : startPlaces) {
//			startPlace.addToken(new Token("ControlFlow"));
//		}
//		
//		return process;
//	}
	
	

	public static MoolaProcess generateProcess(Project project, Log log) {		

		Place source = new Place("Start");
		Place sink = new Place("End");
		
		// create basic process structure (incl. source and sink)
		MoolaProcess process = new MoolaProcess();
		process.setLog(log);
		process.addPlace(source);
		process.addPlace(sink);
		
		// create all transitions up front
		Map<String, TrafoTransition> transitions = new HashMap<>();
		for(Transformation trafo : project.getTransformations()) {
			TrafoTransition trans = new TrafoTransition(trafo.getName(), trafo);
			transitions.put(trafo.getName(), trans);
			process.addTransitions(trans);
			log.verbose("Transition for " + trafo.getName());
		}
		
		// create place for each input of trafo
		for(Transformation trafo : project.getTransformations()) {
			Transition trans = transitions.get(trafo.getName());
			for(ModelLink modelLink : trafo.getDependencies()) {
				Transition dependOnTrafo = transitions.get(modelLink.getTrafo().getName());
				String placeName = "in_" + trafo.getName() + "_" + modelLink.getOutputIdentifier();
				Place inPlace = new Place(placeName);
				Arc.connect(inPlace, trans);
				Arc.connect(dependOnTrafo, inPlace);
				process.addPlace(inPlace);
				log.verbose("Connecting " + trafo.getName() + " with " + modelLink.getTrafo().getName());
			}
			
			// no dependencies -> can be used as start
			if(trafo.getDependencies().isEmpty()){
				Place startPlace = new Place("start_" + trafo.getName());
				Arc.connect(startPlace, trans);
				process.addPlace(startPlace);
				startPlace.addToken(new Token());
				log.verbose("Created start for " + trafo.getName());
			}
		}
		
		return process;
	}
}
