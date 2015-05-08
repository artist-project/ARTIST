package org.eclipse.emf.henshin.tests.partialmatch;

/**
 *  This is a test for the partial match functionality. 
 */

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
import org.eclipse.emf.henshin.tests.uml.UMLSpecification;
import org.eclipse.emf.henshin.tests.uml.UmlFactory;
import org.eclipse.emf.henshin.tests.uml.UmlPackage;
import org.eclipse.emf.henshin.tests.uml.Class;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Svetlana Arifulina
 */
public class FullMatchTest {
    /**
     * Path to example models for testing.
     */
    private static final String RESOURCE_SET_PATH = "model/examples/";
    /**
     * Path to the metamodel for models and model transformations.
     */
    private static final String SOURCE_LANGUAGE_PATH = "../languagedefinition/uml.ecore";
    /**
     * Henshin resource set for the tests.
     */
    private static HenshinResourceSet resourceSet;
    /**
     * Henshin engine for the tests.
     */
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
    // Same model and lhs with 1 model element
    public void testFullMatch1() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testFullMatch1");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	HenshinFactory.eINSTANCE.createNode(lhs, UmlFactory.eINSTANCE
		.createUMLSpecification().eClass(), "umlSpec");
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, UmlFactory.eINSTANCE
		.createUMLSpecification().eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	// Load the example model into an EGraph:
	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();

	Resource model = resourceSet.getResource("Spec.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 1 && report.getCoverage() == 1.0);
    }

    @Test
    // Same model and lhs with several modeling elements
    public void testFullMatch2() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testFullMatch2");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	UMLSpecification spec = UmlFactory.eINSTANCE.createUMLSpecification();
	Class c = UmlFactory.eINSTANCE.createClass();
	spec.getClasses().add(c);
	Node source = HenshinFactory.eINSTANCE.createNode(lhs, spec.eClass(),
		"umlSpec");
	Node target = HenshinFactory.eINSTANCE.createNode(lhs, c.eClass(),
		"class1");
	HenshinFactory.eINSTANCE.createEdge(source, target, spec.getClasses()
		.get(0).eContainmentFeature());
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, spec.eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	// Load the example model into an EGraph:
	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();

	Resource model = resourceSet.getResource("SpecClass.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 1 && report.getCoverage() == 1.0);
    }

    @Test
    // Model is large that the lhs, no checking of dangling edges in the rule
    public void testFullMatch3() throws IOException {

	// Create the Henshin model transformation
	Module module = HenshinFactory.eINSTANCE.createModule();
	module.setName("testFullMatch3");

	Rule rule = HenshinFactory.eINSTANCE.createRule();
	rule.setName("rule1");
	rule.setCheckDangling(false);

	Graph lhs = HenshinFactory.eINSTANCE.createGraph("lhs");
	UMLSpecification spec = UmlFactory.eINSTANCE.createUMLSpecification();
	HenshinFactory.eINSTANCE.createNode(lhs, spec.eClass(), "umlSpec");
	rule.setLhs(lhs);

	Graph rhs = HenshinFactory.eINSTANCE.createGraph("rhs");
	HenshinFactory.eINSTANCE.createNode(rhs, spec.eClass(), "umlSpec");
	rule.setRhs(rhs);

	module.getUnits().add(rule);

	// Load the example model into an EGraph:
	EGraph graph = InterpreterFactory.INSTANCE.createEGraph();

	Resource model = resourceSet.getResource("SpecClass.xmi");
	graph.addTree(model.getContents().get(0));

	List<Match> matches = InterpreterUtil.findMaximalPartialMatches(engine,
		module, graph);
	PartialMatchReport report = InterpreterUtil
		.findAndReportMaximalPartialMatches(engine, module, graph);

	System.out.println(report.getReport());

	Assert.assertTrue(matches.size() == 1 && report.getCoverage() == 1.0);
    }

}
