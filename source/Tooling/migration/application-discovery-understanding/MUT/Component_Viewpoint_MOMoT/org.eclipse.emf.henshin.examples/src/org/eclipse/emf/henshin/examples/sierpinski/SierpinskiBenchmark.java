/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.sierpinski;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.PartitionedEGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * A benchmark constructing multiple levels of a Sierpinski triangle.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Sierpinski_triangle">Sierpinski Triangle</a>
 */
public class SierpinskiBenchmark {

	/**
	 * Relative path to the Sierpinski model files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/sierpinski";

	/**
	 * Run the Sierpinski benchmark.
	 * 
	 * @param path Relative path to the model files.
	 * @param iterations Number of iterations.
	 */
	public static void run(String path, int iterations) {

		// Determine number of threads to be used:
		int threads = Runtime.getRuntime().availableProcessors() / 2;

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Load the module and find the rule:
		Module module = resourceSet.getModule("sierpinski.henshin", false);
		Rule rule = (Rule) module.getUnit("AddTriangle");

		// Load the first level of the Sierpinski triangle into a graph:
		Resource resource = resourceSet.getResource("sierpinski-start.xmi");
		EGraph graph = new PartitionedEGraphImpl(resource, threads);

		// Remove the container object:
		EObject container = resource.getContents().get(0);
		graph.remove(container);

		// Create an engine:
		Engine engine = new EngineImpl();
		engine.getOptions().put(Engine.OPTION_WORKER_THREADS, threads);
		engine.getOptions().put(Engine.OPTION_DESTROY_MATCHES, true);

		try {

			RuleApplication application = new RuleApplicationImpl(engine);
			application.setRule(rule);
			application.setEGraph(graph);

			// Check how much memory is available:
			System.out.println("Starting Sierpinski benchmark...");
			System.out.println(Runtime.getRuntime().maxMemory() / (1024 * 1024) + "MB available memory");
			System.out.println("Using " + threads + " worker threads\n");
			System.out.println("Level\tMatches\tNodes\tMatTime\tAppTime\tTotTime");

			// For computing the expected number of nodes:
			int expectedNodes = 3;
			int expectedMatches = 1;

			// Iteratively compute the Sierpinski triangle:
			for (int i = 0; i < iterations; i++) {

				// Collect garbage:
				System.gc();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// Find match:
				long startTime = System.currentTimeMillis();
				Match match = engine.findMatches(rule, graph, null).iterator().next();
				long matchingTime = (System.currentTimeMillis() - startTime);

				// Count number of multi-matches:
				int matchCount = match.getMultiMatches(rule.getMultiRules().get(0)).size();

				// Apply rule:
				startTime = System.currentTimeMillis();
				application.setCompleteMatch(match);
				if (!application.execute(null)) {
					throw new RuntimeException("Error transforming Sierpinski model");
				}

				long runtime = (System.currentTimeMillis() - startTime);

				// Print info:
				System.out.println((i + 1) + "\t" + matchCount + "\t" + graph.size() + "\t" + matchingTime + "\t"
						+ runtime + "\t" + (matchingTime + runtime));

				// Check whether the number of matches and nodes is correct:
				if (matchCount != expectedMatches) {
					throw new RuntimeException("Expected " + expectedMatches + " matches instead of " + matchCount);
				}
				expectedMatches *= 3;
				expectedNodes += expectedMatches;
				if (graph.size() != expectedNodes) {
					throw new RuntimeException("Expected " + expectedNodes + " nodes instead of " + graph.size());
				}

			}
		} finally {
			engine.shutdown();
		}
	}

	public static void main(String[] args) {
		int iterations = args.length > 0 ? Integer.parseInt(args[0]) : 12;
		run(PATH, iterations); // we assume the working directory is the root of the examples plug-in
	}

}
