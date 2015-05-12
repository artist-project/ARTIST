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

import eu.artist.moola.TransformationRegistry

class Project {

	// settings
	Settings proj = null

	// properties
	def trafos = [:]
	def specs = [:]
	def runClosure = null

	public Project() {
		proj = new Settings()
	}
	
	
	def model(args, configClosure) {
		def trafo = new ModelTrafo()
		trafo.name = args.name;
		trafo.conformsTo = args.conformsTo;

		if(configClosure != null) {
			trafo.init(configClosure)
		}

		trafos[args.name] = trafo
		return trafo
	}


	def spec(args, configClosure) {
		def spec = new Specification()
		spec.name = args.name
		spec.init(configClosure)
		specs[spec.name] = spec
	}

	def propertyMissing(String name){
		trafos[name]
	}




	/**
	 * Defines a new transformation
	 * @param args The arguments specifying name and type of transformation
	 * @param configClosure An optional closure used for configuration of the new trafo
	 * @return An object representing the transformation
	 */
	def trafo(args, configClosure) {
		def trafoType = args.of
		def trafo = null;

		// look-up type in registry
		if(TransformationRegistry.has(trafoType)) {
			Class<Transformation> trafoClass = TransformationRegistry.resolve(trafoType)
			trafo = trafoClass.newInstance()
		} else {
			trafo = new Transformation()
		}

		// set trafo values
		trafo.name = args.name;


		// extract spec if possible
		if(args.spec != null){
			trafo.spec = specs[args.spec]
		}

		if(configClosure != null) {
			trafo.init(configClosure)
		}

		trafos[args.name] = trafo
		return trafo
	}


	/**
	 * Returns a list of transformations
	 * @return
	 */
	List<Transformation> getTransformations() {
		return trafos.collect { k, v -> v }
	}


	/**
	 * 
	 */
	void run(closure) {
		this.runClosure = closure
	}


	/**
	 * Sets the log level for the process
	 * @param level The new log level
	 */
	void logLevel(String level) {
		proj.logLevel = level
	}


	/**
	 * A class representing settings for the current project
	 */
	class Settings {
		String path = ""
		String title = ""
		String moolaFile = ""
		String logLevel = "info"
	}
}
