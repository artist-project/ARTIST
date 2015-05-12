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
package eu.artist.moola.workflow;

import java.util.ArrayList;
import java.util.List;

import eu.artist.moola.logging.Log;
import eu.artist.moola.workflow.events.EventListener;

public class Process {

	protected List<Place> places;
	protected List<Transition> transitions;
	
	protected Log log;
	protected Object sync;
	
	public Process() {
		this.places = new ArrayList<>();
		this.transitions = new ArrayList<>();
		this.sync = new Object();
	}
	
	public void run() {
		log.verbose("Starting worflow process");
		log.verbose(this.toString());
		
		try {
			while(! this.processEnded()) {
				for(Transition trans : this.transitions) {
					// check if all input arcs are fulfilled
					if(trans.isRunnable() && !trans.isRunning()) {
						trans.execute();
					}
				}
				
				try {
					synchronized(this.sync) {
						this.sync.wait(1000); //ToDo: proper end condition and not busy waiting here
			        }
				} catch (InterruptedException ex) {
					log.verbose(ex.getMessage());
				}
			}	
		} catch(Exception ex) {
			log.error("Error in worflow", ex);
		}
	}
	
	/**
	 * Checks if a process has reached its end condition. Can be overridden in sub classes to
	 * specify different end conditions.
	 * @return True if the process has stopped, false otherwise
	 */
	protected boolean processEnded() {
		boolean hasEnded = true;
		for(Transition trans : this.transitions) {
			if(trans.isRunnable() || trans.isRunning()) {
				hasEnded = false;
			}
		}
		return hasEnded;
	}
	
	public void addPlace(Place place) {
		this.places.add(place);
	}
	
	public void addTransitions(Transition transition) {
		this.transitions.add(transition);
		transition.setLog(this.log);
		transition.addFinishListener(new EventListener<Transition, Object>() {
			@Override
			public void eventOccured(Transition source, Object args) {
				log.verbose(Process.this.toString());
				synchronized(Process.this.sync) {
					Process.this.sync.notifyAll();
		        }
			}
		});
	}

	@Override
	public String toString() {
		String ret = "Places: ";
		for(Place p : this.places) {
			ret += "[" + p.getName() + ": " + p.tokenCount() + "] "; 
		}

		ret += "; Transitions: ";
		for(Transition t : this.transitions) {
			ret += "[" + t.getName() + ": " + t.isRunnable() + ", " + t.isRunning() + "] "; 
		}
		return ret;
	}
	
	
	/**
	 * Sets the log instance for this process
	 * @param log the log
	 */
	public void setLog(Log log){
		this.log = log;
	}
}
