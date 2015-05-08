/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.framework;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResource;
import org.junit.After;

/**
 * This is a class used for quickly creating Henshin tests. It features convenient methods for loading Henshin rules and
 * models. Some useful variables:
 * <ul>
 * <li>htModule -- {@link Module}</li>
 * <li>htEngine -- {@link Engine}</li>
 * <li>htEmfGraph -- {@link EGraph}</li>
 * <li>htRule -- {@link Rule}</li>
 * <li>htRuleApp -- corresponding {@link RuleApplication}</li>
 * <li>htUnit -- {@link Unit}</li>
 * <li>htUnitApp -- corresponding {@link UnitApplication}</li>
 * </ul>
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 */
public class HenshinTest {

	/**
	 * Module which has been automatically loaded and set-up for you to use.
	 */
	protected Module htModule;

	/**
	 * Engine which has been automatically loaded and set-up for you to use.
	 */
	protected Engine htEngine;

	/**
	 * EGraph.
	 */
	protected EGraph htEGraph;

	/**
	 * When calling loadRule(), this will be the loaded {@link Rule}.
	 */
	protected Rule htRule;

	/**
	 * When calling {@link #loadRule(String)}, this will be the {@link RuleApplication} created from engine and the
	 * loaded {@link Rule}.
	 */
	protected RuleApplication htRuleApp;

	/**
	 * When calling {@link #loadUnit(String)}, this will be the loaded {@link Unit}.
	 */
	protected Unit htUnit;

	/**
	 * When calling {@link #loadUnit(String)}, this will be the {@link UnitApplication} created from engine and the
	 * loaded {@link Unit}.
	 */
	protected UnitApplication htUnitApp;

	/**
	 * This gets prepended to the file name when loading a graph from file via {@link #loadEGraph(String)}.
	 */
	protected String graphBasePath = "";

	/**
	 * This gets appended to the file name when loading a graph from file via {@link #loadEGraph(String)}.
	 */
	protected String graphFileExtension = "";

	@After
	public void tearDown() {
		htModule = null;
		htEngine = null;
		htEGraph = null;
		htRule = null;
		htRuleApp = null;
		htUnit = null;
		htUnitApp = null;
	}

	/**
	 * Initialize the tests. Loads a module and creates an engine.
	 * 
	 * @param henshinFile Henshin file to be loaded.
	 */
	protected void init(String henshinFile) {
		htModule = (Module) HenshinLoaders.loadHenshin(henshinFile);
		htEngine = InterpreterFactory.INSTANCE.createEngine();
	}

	/**
	 * Initialize the tests. Loads a module, a model graph and creates an engine.
	 * 
	 * @param henshinFile Henshin file to be loaded.
	 * @param modelFile Model file to be loaded.
	 * @param modelFileExt Model file extension.
	 */
	protected void init(String henshinFile, String modelFile, String modelFileExt) {
		init(henshinFile);
		htEGraph = HenshinLoaders.loadGraph(modelFile, modelFileExt);
	}

	/**
	 * Initialize the tests. Loads a module, a model graph and creates an engine, and sets engine properties.
	 * 
	 * @param henshinFile Henshin file to be loaded.
	 * @param modelFile Model file to be loaded.
	 * @param modelFileExt Model file extension.
	 * @param options Options for the engine.
	 */
	protected void init(String henshinFile, String modelFile, String modelFileExt, Map<String, Object> options) {
		init(henshinFile, modelFile, modelFileExt);
		htEngine.getOptions().putAll(options);
	}

	/**
	 * Initialize the tests. Loads a model graph and creates an engine.
	 * 
	 * @param modelFile Model file to be loaded.
	 * @param modelFileExt Model file extension.
	 */
	protected void init(String modelFile, String modelFileExt) {
		htEGraph = HenshinLoaders.loadGraph(modelFile, modelFileExt);
		htEngine = InterpreterFactory.INSTANCE.createEngine();
	}

	/**
	 * Initialize the tests. Loads a model graph and creates an engine and sets engine options.
	 * 
	 * @param modelFile Model file to be loaded.
	 * @param modelFileExt Model file extension.
	 * @param options Options for the engine.
	 */
	protected void init(String modelFile, String modelFileExt, Map<String, Object> options) {
		htEGraph = HenshinLoaders.loadGraph(modelFile, modelFileExt);
		htEngine = InterpreterFactory.INSTANCE.createEngine();
		htEngine.getOptions().putAll(options);
	}

	/**
	 * Load a rule and create a rule application.
	 * 
	 * @param ruleName Rule name.
	 */
	protected void loadRule(String ruleName) {
		htRule = (Rule) htModule.getUnit(ruleName);
		htRuleApp = InterpreterFactory.INSTANCE.createRuleApplication(htEngine);
		htRuleApp.setRule(htRule);
		htRuleApp.setEGraph(htEGraph);
	}

	/**
	 * Load a rule and create a rule application and set a parameter.
	 * 
	 * @param ruleName Rule name.
	 * @param paramName Parameter name.
	 * @param paramValue Parameter value.
	 */
	protected void loadRule(String ruleName, String paramName, Object paramValue) {
		loadRule(ruleName);
		htRuleApp.setParameterValue(paramName, paramValue);
	}

	/**
	 * Load a rule and create a rule application and set parameters.
	 * 
	 * @param ruleName Rule name.
	 * @param paramMappings Parameter mappings.
	 */
	protected void loadRule(String ruleName, Map<String, Object> paramMappings) {
		loadRule(ruleName);
		if (paramMappings != null) {
			for (Entry<String, Object> entry : paramMappings.entrySet()) {
				htRuleApp.setParameterValue(entry.getKey(), entry.getValue());
			}
		}
	}

	/**
	 * Load a unit and create a unit application.
	 * 
	 * @param unitName Unit name.
	 */
	protected void loadUnit(String unitName) {
		htUnit = htModule.getUnit(unitName);
		htUnitApp = InterpreterFactory.INSTANCE.createUnitApplication(htEngine);
		htUnitApp.setUnit(htUnit);
		htUnitApp.setEGraph(htEGraph);
	}

	/**
	 * Load a unit and create a unit application and set a parameter value.
	 * 
	 * @param unitName Unit name.
	 * @param paramName Parameter name.
	 * @param paramValue Parameter value.
	 */
	protected void loadUnit(String unitName, String paramName, Object paramValue) {
		loadUnit(unitName);
		htUnitApp.setParameterValue(paramName, paramValue);
	}

	/**
	 * Load a unit and create a unit application and set parameter values.
	 * 
	 * @param unitName Unit name.
	 * @param paramMappings Parameter mappings.
	 */
	protected void loadUnit(String unitName, Map<String, Object> paramMappings) {
		loadUnit(unitName);
		if (paramMappings != null) {
			for (Entry<String, Object> entry : paramMappings.entrySet()) {
				htUnitApp.setParameterValue(entry.getKey(), entry.getValue());
			}
		}
	}

	/**
	 * Create an empty graph and an engine.
	 */
	protected void createEGraph() {
		htEGraph = InterpreterFactory.INSTANCE.createEGraph();
		htEngine = InterpreterFactory.INSTANCE.createEngine();
	}

	/**
	 * Load an EGraph and create a new engine.
	 * 
	 * @param graph EGraph.
	 */
	protected void loadEGraph(EGraph graph) {
		htEGraph = graph;
		htEngine = InterpreterFactory.INSTANCE.createEngine();
	}

	/**
	 * Load an EGraph and create a new engine.
	 * 
	 * @param graphName Name of the graph. Loaded graph is graphBasePath + graphName + "." + graphFileExtension
	 */
	protected void loadEGraph(String graphName) {
		URI graphURI = URI.createFileURI(new File(graphBasePath + graphName + "." + graphFileExtension)
				.getAbsolutePath());
		loadEGraph(HenshinLoaders.loadGraph(graphURI));
	}

	/**
	 * Set graph base path and file extension.
	 * 
	 * @param graphPath Path in which all graphs can be found.
	 * @param fileExtension Common file extension for all graphs.
	 */
	protected void setEGraphPath(String graphPath, String fileExtension) {
		graphBasePath = graphPath;
		graphFileExtension = fileExtension;
	}

	/**
	 * Recursively find Henshin files in a given path.
	 * 
	 * @param path Path where to look for Henshin files.
	 * @return List of full paths of the found Henshin files.
	 */
	protected List<File> findHenshinFiles(File path) {
		List<File> files = new ArrayList<File>();
		addHenshinFiles(path, files);
		Collections.sort(files);
		return files;
	}

	/*
	 * Recursively search for Henshin files.
	 */
	private void addHenshinFiles(File file, List<File> stateSpaceFiles) {
		if (file.isDirectory()) {
			for (File child : file.listFiles()) {
				addHenshinFiles(child, stateSpaceFiles);
			}
		} else {
			if (file.getName().endsWith("." + HenshinResource.FILE_EXTENSION)) {
				stateSpaceFiles.add(file);
			}
		}
	}

}
