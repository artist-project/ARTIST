package org.eclipse.emf.henshin.tests.partialmatch;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.interpreter.util.PartialMatchReport;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.eclipse.emf.henshin.tests.uml.Attribute;
import org.eclipse.emf.henshin.tests.uml.Class;
import org.eclipse.emf.henshin.tests.uml.UMLSpecification;
import org.eclipse.emf.henshin.tests.uml.UmlFactory;
import org.eclipse.emf.henshin.tests.uml.UmlPackage;

public class PartialMatchTest {

    private static final String RESOURCE_SET_PATH = "model/examples/";
    private static final String SOURCE_LANGUAGE_PATH = "../languagedefinition/uml.ecore";
    public static HenshinResourceSet resourceSet;
    private static Engine engine;

    @Before
    public void setUp() {
	// Create a Henshin resource set and register the packages needed for
	// testing
	resourceSet = new HenshinResourceSet(RESOURCE_SET_PATH);
	resourceSet.registerDynamicEPackages(SOURCE_LANGUAGE_PATH);
	resourceSet.getPackageRegistry().put(UmlPackage.eNS_URI,
		UmlPackage.eINSTANCE);
	engine = InterpreterFactory.INSTANCE.createEngine();
    }

    @Test
    // Model is large that the lhs, checking of dangling edges is enabled. No
    // partial match exists.
    public void testPartialMatch1() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testPartialMatch1");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	UMLSpecification spec = UmlFactory.eINSTANCE.createUMLSpecification();
	HenshinFactory.eINSTANCE.createNode(lhs, spec.eClass(), "umlSpec");
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, UmlFactory.eINSTANCE
		.createUMLSpecification().eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();
	Resource model = resourceSet.getResource("SpecClass.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 0 && report.getCoverage() == 0);
    }

    @Test
    // Model is smaller that the lhs, checking of dangling edges is enabled. A
    // partial match having 2 node and 1 edge out of 3 nodes and 2 edges exists.
    public void testPartialMatch2() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testPartialMatch2");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	UMLSpecification spec = UmlFactory.eINSTANCE.createUMLSpecification();
	Class c = UmlFactory.eINSTANCE.createClass();
	spec.getClasses().add(c);
	Attribute attr = UmlFactory.eINSTANCE.createAttribute();
	c.getAttrs().add(attr);

	Node source = HenshinFactory.eINSTANCE.createNode(lhs, spec.eClass(),
		"umlSpec");
	Node target = HenshinFactory.eINSTANCE.createNode(lhs, c.eClass(), "c");
	HenshinFactory.eINSTANCE.createEdge(source, target, spec.getClasses()
		.get(0).eContainmentFeature());
	Node target2 = HenshinFactory.eINSTANCE.createNode(lhs, attr.eClass(),
		"attr");
	HenshinFactory.eINSTANCE.createEdge(target, target2, c.getAttrs()
		.get(0).eContainmentFeature());
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, UmlFactory.eINSTANCE
		.createUMLSpecification().eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();
	Resource model = resourceSet.getResource("ClassAttribute.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 1 & report.getCoverage() == 0.6);
    }

    @Test
    // Model is smaller that the lhs, checking of dangling edges is enabled. A
    // partial match having 1 node out of 3 nodes and 2 edges exists.
    public void testPartialMatch3() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testPartialMatch2");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	UMLSpecification spec = UmlFactory.eINSTANCE.createUMLSpecification();
	Class c = UmlFactory.eINSTANCE.createClass();
	spec.getClasses().add(c);
	Attribute attr = UmlFactory.eINSTANCE.createAttribute();
	c.getAttrs().add(attr);

	Node source = HenshinFactory.eINSTANCE.createNode(lhs, spec.eClass(),
		"umlSpec");
	Node target = HenshinFactory.eINSTANCE.createNode(lhs, c.eClass(), "c");
	HenshinFactory.eINSTANCE.createEdge(source, target, spec.getClasses()
		.get(0).eContainmentFeature());
	Node target2 = HenshinFactory.eINSTANCE.createNode(lhs, attr.eClass(),
		"attr");
	HenshinFactory.eINSTANCE.createEdge(target, target2, c.getAttrs()
		.get(0).eContainmentFeature());
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, UmlFactory.eINSTANCE
		.createUMLSpecification().eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();
	Resource model = resourceSet.getResource("Spec.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 1 & report.getCoverage() == 0.2);
    }

}
