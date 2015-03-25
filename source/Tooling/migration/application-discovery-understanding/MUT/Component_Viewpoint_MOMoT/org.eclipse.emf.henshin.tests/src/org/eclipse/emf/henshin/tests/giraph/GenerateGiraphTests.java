package org.eclipse.emf.henshin.tests.giraph;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.henshin.interpreter.giraph.GiraphRuleTemplate;
import org.eclipse.emf.henshin.interpreter.giraph.GiraphUtil;
import org.eclipse.emf.henshin.interpreter.giraph.HenshinUtilTemplate;
import org.eclipse.emf.henshin.model.IteratedUnit;
import org.eclipse.emf.henshin.model.LoopUnit;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.SequentialUnit;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class GenerateGiraphTests {

	public static void generateComputeClass(Unit mainUnit, boolean vertexLogging, boolean useUUIDs) {
		try {
			String className = mainUnit.getName();
			if (mainUnit instanceof IteratedUnit) {
				className = className + ((IteratedUnit) mainUnit).getIterations();
			}
			Map<String,Object> args = new HashMap<String,Object>();
			args.put("ruleData", GiraphUtil.generateRuleData(mainUnit));
			args.put("mainUnit", mainUnit);
			args.put("className", className);
			args.put("packageName", "org.apache.giraph.examples");
			args.put("masterLogging", true);
			args.put("vertexLogging", vertexLogging);
			args.put("useUUIDs", useUUIDs);
			args.put("segmentCount", 1);

			GiraphRuleTemplate ruleTemplate = GiraphRuleTemplate.create("\n");
			String giraphCode = ruleTemplate.generate(args);
			save(new File("giraph/classes/" + className + ".java"), giraphCode);

			HenshinUtilTemplate utilTemplate = HenshinUtilTemplate.create("\n");
			String utilCode = utilTemplate.generate(args);
			save(new File("giraph/classes/HenshinUtil.java"), utilCode);
		} catch (Exception e) {
			System.err.println("Error generating compute class for " + mainUnit);
			e.printStackTrace();
		}
	}

	public static void generateInputGraph(Rule rule) {
		try {
			String graphCode = GiraphUtil.getInstanceCode(rule);
			save(new File("giraph/graphs/" + rule.getName() + ".json"), graphCode);
		} catch (Exception e) {
			System.err.println("Error generating graph for rule " + rule.getName());			
		}
	}

	private static void save(File file, String content) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(content);
		writer.close();
	}


	public static void main(String[] args) {
		
		HenshinResourceSet resourceSet = new HenshinResourceSet("src/org/eclipse/emf/henshin/tests/giraph");
		Module module = resourceSet.getModule("GiraphTests.henshin");

		// Sierpinski
		Rule sierpinskiRule = (Rule) module.getUnit("Sierpinski");
		generateInputGraph(sierpinskiRule);
		generateComputeClass(sierpinskiRule, true, false);		
		IteratedUnit sierpinskiMain = (IteratedUnit) module.getUnit("SierpinskiMain");
		for (int i=1; i<=18; i++) {
			sierpinskiMain.setIterations(""+i);
			generateComputeClass(sierpinskiMain, false, true);
		}
		
		// Wheel
		Rule wheelStart = (Rule) module.getUnit("WheelStart");
		generateInputGraph(wheelStart);
		LoopUnit wheel = (LoopUnit) module.getUnit("WheelMain");
		generateComputeClass(wheel, true, false);
		
		// Star
		Rule starStart = (Rule) module.getUnit("StarStart");
		generateInputGraph(starStart);
		SequentialUnit starMain = (SequentialUnit) module.getUnit("StarMain");
		generateComputeClass(starMain, true, false);

		// Fork
		Rule forkStart = (Rule) module.getUnit("ForkStart");
		generateInputGraph(forkStart);
		LoopUnit forkMain = (LoopUnit) module.getUnit("ForkMain");
		generateComputeClass(forkMain, true, false);

		// Require
		Rule requireStart = (Rule) module.getUnit("RequireStart");
		generateInputGraph(requireStart);
		Rule requireOne = (Rule) module.getUnit("RequireOne");
		generateComputeClass(requireOne, true, false);
		Rule requireTwo = (Rule) module.getUnit("RequireTwo");
		generateComputeClass(requireTwo, true, false);
		
		// TwoTimesThree
		Rule twoTimesThree = (Rule) module.getUnit("TwoTimesThree");
		generateInputGraph(twoTimesThree);
		generateComputeClass(twoTimesThree, false, false);

		// TwoTimesTwo
		Rule twoTimesTwo = (Rule) module.getUnit("TwoTimesTwo");
		Rule twoTimesTwoStart1 = (Rule) module.getUnit("TwoTimesTwoStart1");
		Rule twoTimesTwoStart2 = (Rule) module.getUnit("TwoTimesTwoStart2");
		Rule twoTimesTwoStart3 = (Rule) module.getUnit("TwoTimesTwoStart3");
		generateInputGraph(twoTimesTwoStart1);
		generateInputGraph(twoTimesTwoStart2);
		generateInputGraph(twoTimesTwoStart3);
		generateComputeClass(twoTimesTwo, true, true);

		// ParallelNodes
		Rule parallelNodes = (Rule) module.getUnit("ParallelNodes");
		Rule parallelNodesStart = (Rule) module.getUnit("ParallelNodesStart");
		generateInputGraph(parallelNodesStart);
		generateComputeClass(parallelNodes, true, false);

		// ParallelEdges
		Rule parallelEdges = (Rule) module.getUnit("ParallelEdges");
		Rule parallelEdgesStart = (Rule) module.getUnit("ParallelEdgesStart");
		generateInputGraph(parallelEdgesStart);
		generateComputeClass(parallelEdges, true, false);

		// ParallelTriangles
		Rule parallelTriangles = (Rule) module.getUnit("ParallelTriangles");
		Rule parallelTrianglesStart = (Rule) module.getUnit("ParallelTrianglesStart");
		generateInputGraph(parallelTrianglesStart);
		generateComputeClass(parallelTriangles, true, false);
		
		// ParallelV
		Rule parallelV = (Rule) module.getUnit("ParallelV");
		Rule parallelVStart = (Rule) module.getUnit("ParallelVStart");
		generateInputGraph(parallelVStart);
		generateComputeClass(parallelV, true, false);

	}

}
