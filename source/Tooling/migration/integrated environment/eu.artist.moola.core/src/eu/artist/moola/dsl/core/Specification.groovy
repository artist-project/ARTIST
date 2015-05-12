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


/**
 * Defines a transformation in terms of input and output elements
 */
class Specification {

	String name;
	List<Definition> inputs;
	List<Definition> outputs;
	
	public Specification() {
		inputs = [];
		outputs = [];
	}
	
	/**
	 * Inits the specification by invoking the closure on it
	 * @param initClosure The initialization closure
	 */
	void init(Closure initClosure) {
		initClosure.delegate = this
		initClosure.resolveStrategy = Closure.DELEGATE_FIRST
		initClosure.run()
	}
	
	/**
	 * Adds an input definition for each element in the map
	 * @param args A map consisting of key-value pairs. The key is the model type, the value the name of the input
	 */
	void inputs(args){
		def newInputs = args.collect { k, v -> [type: k, name: v] as Definition}
		inputs.addAll newInputs
	}
	
	/**
	 * Adds an output definition for each element in the map
	 * @param args A map consisting of key-value pairs. The key is the model type, the value the name of the output
	 */
	void outputs(args){
		def newOutputs = args.collect { k, v -> [type: k, name: v] as Definition}
		outputs.addAll newOutputs
	}
	
}
