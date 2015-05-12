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

package eu.artist.moola.dsl.core

import eu.artist.moola.logging.Log

class Transformation {
	
	// these fields are public to enable setting them in the DSL
	String name = ""
	Map<String, Closure<?>> dependsOn = [:] // dependencies and their condition (or null if no condition)
	Closure work
	
	Specification spec
	List<ModelLink> dependencies = []
	Map<String, Model> outputs = [:]
	
	// these fields are manipulated by operator overloading
	protected List<Closure> preActions = []
	protected List<Closure> postActions = []
	
	protected List inputs = [];
	
	
	/**
	 * Creates a new transformation
	 */
	Transformation() { }
	
	/**
	 * Sets the specification for this transformation. This is done as one-time setter rather than in the
	 * constructor to have easier sub-classing for transformations.
	 * @param spec The spec
	 */
	public void setSpec(Specification spec) {
		if(this.spec != null) {
			throw new RuntimeException("Specifications can only be applied once")
		}
		this.spec = spec
		//applySpecification()
	}
	
	/**
	 * Applies the spec by adding getter (for each output) and setter (for each input) methods
	 */
	protected void applySpecification(){
		// getter for outputs
		this.spec.outputs.each { element ->
			def propertyName = element.name.capitalize();
			this.metaClass."get$propertyName" = {
				return [trafo: this, outputIdentifier: element.name] as ModelLink
			}
		}
		// setter for inputs
		this.spec.inputs.each { element ->
			def propertyName = element.name.capitalize();
			this.metaClass."set$propertyName" = { link -> 
				if(link instanceof ModelLink) {
					establishLink(link)
				} else if(link instanceof List) {
					link.each { establishLink(it) }
				} else if(link instanceof ModelTrafo) {
					establishLink(link as ModelLink)
				} else {
					throw new RuntimeException("Cannot establish link from trafo $name to $link")
				}
			}
		}
	}
	
	private void establishLink(ModelLink link) {
		dependencies.add(link)
	}
	
	/**
	 * Method for creating internal specs in the config closure.
	 * @param configureSpec The closure initializing the spec
	 */
	protected void spec(Closure configureSpec) {
		def spec = new Specification()
		spec.name = this.name + "\$internal"
		spec.init(configureSpec)
		setSpec(spec)
	}
	
	
	def runtimeProperties = [:]
	
	def propertyMissing(String name) {
		if( runtimeProperties[ name ] != null ) {
			runtimeProperties[ name ]
		}
	}

	def propertyMissing(String name, def value) {
		runtimeProperties[ name ] = value
	}
	

	
	/**
	 * Configures this transformation by invoking a config closure in its scope
	 * @param configClosure The closure doing the configuration
	 */
	protected void init(Closure config) {
		if(config != null) {
			config.delegate = this
			config.resolveStrategy = Closure.DELEGATE_FIRST
			config()
		}
		runConfigFinished();
	}
	
	/**
	 * This method is executed after the transformation has been fully configurated.
	 * Can be overriden to perform start-up actions in sub classes
	 */
	protected void runConfigFinished() { }
		
	
	/**
	 * Runs the transformation by executing all pre- and post-actions.
	 * Execution order:
	 * 1) pre-actions in order of their definition
	 * 2) work item (if defined) or (overridden) execute() method
	 * 3) post-actions in order of their definition
	 */
	public def run() {
		try {
			this.executePreActions()
			
			// execute work, if defined
			if(work != null) {
				work.delegate = this
				work.resolveStrategy = Closure.DELEGATE_FIRST
				work()
			} else {
				this.execute()
			}
			
			this.executePostActions()
			
			return runtimeProperties.collect { k, v -> v}
		} catch(Exception ex){
			ex.printStackTrace()
			throw ex
		}
	}
	
	
	public def setInput(args){
		if(args.size() != spec.inputs.size()){
			throw RuntimeException("Illegal number of arguments for $name. Expected: ${spec.inputs.size()}. Got: ${args.size()}");
		}
		spec.inputs.eachWithIndex { definition, idx ->
			runtimeProperties[definition.name] = args[idx];
		}
	}
	
	protected def emit(String name, def value){
		runtimeProperties[name] = value;
	}
	
	
	/**
	 * Executes all pre-actions in the order of their definition.
	 * Can be overridden in sub classes to change pre-action execution
	 */
	protected void executePreActions() {
		preActions.each() { action ->
			action.delegate = this
			action.resolveStrategy = Closure.DELEGATE_FIRST
			action()
		}
	}
	
	
	/**
	 * Executes all post-actions in the order of their definition.
	 * Can be overridden in sub classes to change post-action execution
	 */
	protected void executePostActions() {
		postActions.each() { action ->
			action.delegate = this
			action.resolveStrategy = Closure.DELEGATE_FIRST
			action() 
		}
	}
	
	
	/**
	 * Executes the main activity of this transformation. Can be overridden in sub transformations
	 * to specify specialized execution (e.g. call special libraries). Is not executed, if the work
	 * delegate is defined
	 */
	protected void execute() { }
	
	
	/**
	 * Adds a pre-action to the list of pre-actions
	 * @param c The action to add
	 */
	def leftShift(Closure c) {
		preActions.add(c)
	}
	
	
	/**
	 * Adds a post-action to the list of post-actions
	 * @param c The action to add
	 */
	def rightShift(Closure c) {
		postActions.add(c)
	}
	
}
