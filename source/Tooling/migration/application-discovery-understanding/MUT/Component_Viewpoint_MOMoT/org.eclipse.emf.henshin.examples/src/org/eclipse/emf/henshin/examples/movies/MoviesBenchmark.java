/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.movies;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.PartitionedEGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * Movies benchmark.
 * @author Christian Krause
 */
public class MoviesBenchmark {

	/** 
	 * Relative path to the movie example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/movies";

	public static void runSyntheticDataTest(String modelPath, int factor, int numPartitions) {
		
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(modelPath);
		
		// Load the module and the required units:
		Module module = resourceSet.getModule("movies.henshin", false);
		Unit createExampleUnit = module.getUnit("createExample");
		Unit findCouplesUnit = module.getUnit("findCouples");

		// Create an engine:
		Engine engine = createEngine(numPartitions);

		System.out.println("Nodes\tCouples\tTime (ms)");
		for (int i=1; i<=5; i++) {
			int n = (i+5) * factor;

			// Create an EGraph:
			EGraph graph = createEGraph(numPartitions, null);
			
			// Create test example:
			UnitApplication createExample = new UnitApplicationImpl(engine, graph, createExampleUnit, null);
			createExample.setParameterValue("n", n);
			InterpreterUtil.executeOrDie(createExample);
			int inputSize = graph.size();
			
			// Find couples:
			long millis = System.currentTimeMillis();
			UnitApplication findCouples = new UnitApplicationImpl(engine, graph, findCouplesUnit, null);
			InterpreterUtil.executeOrDie(findCouples);
			millis = System.currentTimeMillis() - millis;
			
			// Check if it is correct:
			EClass coupleClass = (EClass) module.getImports().get(0).getEClassifier("Couple");
			int foundCouples = graph.getDomainSize(coupleClass, true);
			int expected = 2*n; // doubled because of symmetries
			if (foundCouples != expected) {
				throw new AssertionError("Expected to find " + expected + " couples, but actually found " + foundCouples);
			}
			
			System.out.println(inputSize + "\t" + n + "\t" + millis);
			
		}

		// Shutdown engine:
		engine.shutdown();
		engine = null;
		System.gc();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}

	}

	public static void runRealDataTest(String modelPath, String moviesPath, String fileExtension, int numPartitions) {
		
		// Create an engine:
		Engine engine = createEngine(numPartitions);
		
		System.out.println("Nodes\tCouples\tTime (ms)");
		
		// Iterate over all movie files:
		for (File file : new File(moviesPath).listFiles()) {
			
			// Must be an XMI file:
			if (!file.getName().endsWith("." + fileExtension)) {
				continue;
			}

			// Create a resource set with a base directory:
			HenshinResourceSet resourceSet = new HenshinResourceSet(modelPath);
			
			// Load the module and the required units:
			Module module = resourceSet.getModule("movies.henshin", false);
			Unit findCouplesUnit = module.getUnit("findCouples");

			// Register XMI resource factory and the movies package:
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
			resourceSet.getPackageRegistry().put(module.getImports().get(0).getNsURI(), module.getImports().get(0));
			
			// Load the movies file:
			System.gc();
			Resource movies = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			
			// Create an EGraph:
			EGraph graph = createEGraph(numPartitions, movies);
			System.out.print(graph.size());
			
			// Find couples:
			long millis = System.currentTimeMillis();
			UnitApplication findCouples = new UnitApplicationImpl(engine, graph, findCouplesUnit, null);
			InterpreterUtil.executeOrDie(findCouples);
			millis = System.currentTimeMillis() - millis;

			// Number of found couples:
			EClass coupleClass = (EClass) module.getImports().get(0).getEClassifier("Couple");
			int foundCouples = graph.getDomainSize(coupleClass, true);
			System.out.println("\t" + (foundCouples / 2) + "\t" + millis);
			
		}
		
		// Shutdown engine:
		engine.shutdown();
		engine = null;
		System.gc();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}

	}
	
	private static Engine createEngine(int numPartitions) {
		Engine engine = new EngineImpl();
		if (numPartitions > 1) {
			engine.getOptions().put(Engine.OPTION_WORKER_THREADS, numPartitions);
		}
		return engine;
	}
	
	private static EGraph createEGraph(int numPartitions, Resource resource) {
		if (resource!=null) {
			return (numPartitions > 1) ? new PartitionedEGraphImpl(resource, numPartitions) : new EGraphImpl(resource);			
		}
		return (numPartitions > 1) ? new PartitionedEGraphImpl(numPartitions) : new EGraphImpl();
	}
	

	public static void main(String[] args) {
		
		// We assume the working directory is the root of the examples plug-in.
		
//		for (int p=4; p>=0; p=p-2) {
//			System.out.println("\n*** SYNTHETIC DATA BENCHMARK WITH " + p + " PARTITIONS ***\n");
//			runSyntheticDataTest(PATH, 20000, p);
//		}
		
		for (int p=12; p>=0; p=p-2) {
			System.out.println("\n*** REAL DATA BENCHMARK WITH " + p + " PARTITIONS ***\n");
			runRealDataTest(PATH, System.getProperty("user.home") + File.separator + "movies", "movies", p);
		}
		
	}
	
}
