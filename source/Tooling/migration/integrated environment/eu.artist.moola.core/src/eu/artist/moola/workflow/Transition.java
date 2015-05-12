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
import eu.artist.moola.workflow.events.EventSupport;
import eu.artist.moola.workflow.exceptions.TransitionFailedException;

public class Transition extends AbstractTokenHolder {

	protected Thread thread;
	protected Log log;
	protected EventSupport<Transition, Object> transitionStartedSupport;
	protected EventSupport<Transition, Object> transitionEndedSupport;
	
	private Thread.UncaughtExceptionHandler threadExceptionHandler;
	
	public Transition(String name) {
		super(name);
		this.transitionStartedSupport = new EventSupport<>();
		this.transitionEndedSupport = new EventSupport<>();
		this.threadExceptionHandler = new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread th, Throwable ex) {
				log.error("Uncaught exception: " + ex.getMessage());
				throw new RuntimeException(ex);
			}
		};
	}
	
	/**
	 * Executes the transition
	 */
	public void execute() {
		if(this.isRunning()) {
			throw new RuntimeException("Transition is already being exectued"); // change to TransitionAlreadyExecutingException
		}
		Runnable runnable = new TransitionRunner();
		this.thread = new Thread(runnable);
		this.thread.setUncaughtExceptionHandler(this.threadExceptionHandler);
		this.thread.start();
	}
	
	/**
	 * This method implements the actual work of the transition. Meant for overriding in sub classes.
	 * @return
	 */
	protected List<Token> process(List<Token> inputs) {
		try {
			int waitTime = (int )(Math.random() * 2000 + 1);
			log.verbose("Executing transition " + this.name + " for " + waitTime + "ms");
			
			Thread.sleep(waitTime); // to see concurrency
		} catch (InterruptedException ex) {
			log.verbose(ex.getMessage());
		} 
		return inputs;
	}

	public boolean isRunning() {
		return this.thread != null && this.thread.isAlive();
	}
	
	public boolean isRunnable() {
		boolean runnable = true;
		for(Arc arc : this.inputs) {
			if(!arc.isFulfilled()) {
				runnable = false;
			}
		}
		return runnable;
	}
	
	protected List<Token> collectInputTokens() {
		List<Token> inputs = new ArrayList<>();
		for(Arc arc : this.inputs) {
			inputs.addAll(arc.takeTokens());
		}
		return inputs;
	}
	
	protected void distributeOutputTokens(List<Token> outputs) {
		for(Arc arc : this.outputs) {
			arc.moveTokens(outputs);
		}
	}
	
	public void addStartListener(EventListener<Transition, Object> listener) {
		this.transitionStartedSupport.addListener(listener);
	}
	
	public void addFinishListener(EventListener<Transition, Object> listener) {
		this.transitionEndedSupport.addListener(listener);
	}
	
	public void setLog(Log log){
		this.log = log;
	}
	
	/**
	 * Runs the transition in a separate thread
	 */
	protected class TransitionRunner implements Runnable {

		@Override
		public void run() {
			try {
				List<Token> inputs, tokens;

				outer().log.verbose("Starting transition " + outer().name);
				transitionStartedSupport.fireEvent(outer(), null);
				
				inputs = collectInputTokens();
				tokens = process(inputs);
				distributeOutputTokens(tokens);

				outer().log.verbose("Finished transition " + outer().name);
				transitionEndedSupport.fireEvent(outer(), null);
			} catch(Exception ex) {
				outer().log.error(ex);
				throw new TransitionFailedException("Transition " + outer().name + " failed", ex);
			}
		}
		
		private Transition outer() {
			return Transition.this;
		}
		
	}
	
}
