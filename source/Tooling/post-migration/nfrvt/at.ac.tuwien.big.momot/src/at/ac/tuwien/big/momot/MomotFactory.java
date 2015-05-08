/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package at.ac.tuwien.big.momot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.momot.engine.MomotEngine;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.match.monitor.RuleApplicationMonitor;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.rule.RuleManager;

public class MomotFactory {
	
	private final String path;
	private final String moduleFile;
	private final HenshinResourceSet resourceSet;
	private final Module module;
	
	private Engine engine;
	
	public MomotFactory(Engine engine, String path, String moduleFile) {
		this.path = path;
		this.moduleFile = moduleFile;
		this.engine = engine;
		this.resourceSet = new HenshinResourceSet(path);
//		this.resourceSet.registerDynamicEPackages(ecorePath);
		this.module = resourceSet.getModule(moduleFile, false);
		Registry packageRegistry = this.resourceSet.getPackageRegistry();
		for (EPackage ePackage : module.getImports()) 
			packageRegistry.put(ePackage.getNsURI(), ePackage);
	}
	
	public MomotFactory(String path, String moduleFile) {
		this(new MomotEngine(false), path, moduleFile);
	}
	
	public String getPath() {
		return path;
	}
	
	public String getModuleFile() {
		return moduleFile;
	}
	
	public HenshinResourceSet getResourceSet() {
		return resourceSet;
	}

	public Module getModule() {
		return module;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public MomotFactory setEngine(Engine engine) {
		this.engine = engine;
		return this;
	}

	public RuleManager createModuleRules() {
		return new RuleManager(module);
	}

	public ParameterManager createParameterManager() {
		return createParameterManager(createModuleRules());
	}
	
	public ParameterManager createParameterManager(RuleManager manager) {
		return new ParameterManager(manager);
	}
	
	public MatchHelper createMatchHelper() {
		return new MatchHelper(getEngine(), createParameterManager());
	}
	
	public MatchHelper createMatchHelper(ParameterManager parameterManager) {
		return new MatchHelper(getEngine(), parameterManager);
	}
	
	public RuleApplicationMonitor createRuleApplicationMonitor() {
		return new RuleApplicationMonitor();
	}
	
	public RuleApplication createRuleApplication() {
		return InterpreterFactory.INSTANCE.createRuleApplication(engine);
	}
	
	public RuleApplication createRuleApplication(Rule rule) {
		RuleApplication app = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		app.setRule(rule);
		return app;
	}
	
	public RuleApplication createRuleApplication(Rule rule, EGraph graph) {
		RuleApplication app = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		app.setRule(rule);
		app.setEGraph(graph);
		return app;
	}
	
	public RuleApplication createRuleApplication(String ruleName) {
		Rule rule = (Rule) getModule().getUnit(ruleName);
		return createRuleApplication(rule);
	}
	
	public RuleApplication createRuleApplication(String ruleName, EGraph graph) {
		Rule rule = (Rule) getModule().getUnit(ruleName);
		return createRuleApplication(rule, graph);
	}
	
	public EGraph loadGraph(String resource) {
		return MomotFactory.loadGraph(this.getResourceSet(), resource);
	}
	
	public void saveGraph(EGraph graph, String targetResource) {
		saveGraph(getResourceSet(), graph, targetResource);
	}
	
	public EClassifier getEClassifier(String name) {
		EClassifier classifier = null;
		for(EPackage imported : getModule().getImports()) {
			classifier = imported.getEClassifier(name);
			if(classifier != null)
				return classifier;
		}
		return classifier;
	}
	
	public EClass getEClass(String name) {
		return CastUtil.asClass(getEClassifier(name), EClass.class); 
	}

	public static EGraph loadGraph(HenshinResourceSet set, String resource) {
		Resource model = set.getResource(resource);
		return new EGraphImpl(model);
	}
	
	public static void saveGraph(HenshinResourceSet set, EGraph graph, String targetResource) {
		if(targetResource != null)
			set.saveEObject(graph.getRoots().get(0), targetResource);
	}
}
