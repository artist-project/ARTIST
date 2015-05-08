package org.eclipse.emf.henshin.tests.examples;

import org.eclipse.emf.henshin.examples.bank.BankExample;
import org.eclipse.emf.henshin.examples.bankmap.BankMapExample;
import org.eclipse.emf.henshin.examples.combpattern.CombBenchmark;
import org.eclipse.emf.henshin.examples.diningphils.DiningPhilsBenchmark;
import org.eclipse.emf.henshin.examples.ecore2genmodel.Ecore2GenmodelTrafo;
import org.eclipse.emf.henshin.examples.ecore2rdb.Ecore2Rdb;
import org.eclipse.emf.henshin.examples.gossipinggirls.GossipingGirls;
import org.eclipse.emf.henshin.examples.java2statemachine.Java2StateMachine;
import org.eclipse.emf.henshin.examples.javaimports.JavaImportsExample;
import org.eclipse.emf.henshin.examples.movies.MoviesBenchmark;
import org.eclipse.emf.henshin.examples.sierpinski.SierpinskiBenchmark;
import org.eclipse.emf.henshin.examples.sort.SortExample;
import org.eclipse.emf.henshin.examples.wrap.copy.CopyExample;
import org.eclipse.emf.henshin.examples.wrap.mme.PetriNetMME;
import org.junit.Test;

/**
 * Tests implemented in examples (see the examples plug-in).
 * 
 * @author Christian Krause
 *
 */
public class ExamplesTest {

	/**
	 * Relative path to the examples plug-in.
	 */
	public static final String EXAMPLES_PATH = "../org.eclipse.emf.henshin.examples/";

	/**
	 * Bank example.
	 */
	@Test
	public void testBank() {
		System.out.println();
		BankExample.run(EXAMPLES_PATH + BankExample.PATH, false);
	}

	/**
	 * Bank Map example.
	 */
	@Test
	public void testBankMap() {
		System.out.println();
		BankMapExample.run(EXAMPLES_PATH + BankMapExample.PATH);
	}

	/**
	 * Sierpinski triangle example.
	 */
	@Test
	public void testSierpinski() {
		System.out.println();
		SierpinskiBenchmark.run(EXAMPLES_PATH + SierpinskiBenchmark.PATH, 10);
	}

	/**
	 * Java2StateMachine example from TTC 2011.
	 */
	// @Test
	public void testJava2StateMachine() {
		System.out.println();
		Java2StateMachine.run(EXAMPLES_PATH + Java2StateMachine.PATH, Java2StateMachine.JAVA_MODEL_SMALL,
				Java2StateMachine.REFERENCE_STATE_MACHINE, false);
	}

	/**
	 * Comb-pattern example.
	 */
	@Test
	public void testCombPattern() {
		System.out.println();
		CombBenchmark.run(EXAMPLES_PATH + CombBenchmark.PATH);
	}

	/**
	 * Ecore2GenModel example.
	 */
	@Test
	public void testEcore2GenModel() {
		System.out.println();
		Ecore2GenmodelTrafo.runEcore2GenmodelExample(EXAMPLES_PATH + Ecore2GenmodelTrafo.PATH, false);
	}

	/**
	 * Oo2Rdb example.
	 */
	@Test
	public void testEcore2Rdb() {
		System.out.println();
		Ecore2Rdb.run(EXAMPLES_PATH + Ecore2Rdb.PATH, Ecore2Rdb.EXAMPLE_ECORE_MODEL, Ecore2Rdb.EXAMPLE_PACKAGE_NAME,
				Ecore2Rdb.EXAMPLE_RDB_MODEL, false);
	}

	/**
	 * Dining philosophers example (state space generation).
	 */
	@Test
	public void testDiningPhils() {
		System.out.println();
		DiningPhilsBenchmark.run(EXAMPLES_PATH + DiningPhilsBenchmark.PATH, 7, Runtime.getRuntime()
				.availableProcessors());
	}

	/**
	 * Gossiping girls example (state space generation).
	 */
	@Test
	public void testGossingGirls() {
		System.out.println();
		GossipingGirls.run(EXAMPLES_PATH + GossipingGirls.PATH, 6);
	}

	/**
	 * Wrap example: copy.
	 */
	@Test
	public void testWrapCopy() {
		System.out.println();
		CopyExample.run(EXAMPLES_PATH + CopyExample.PATH);
	}

	/**
	 * Wrap example: copy.
	 */
	@Test
	public void testWrapPetriMME() {
		System.out.println();
		PetriNetMME.run(EXAMPLES_PATH + PetriNetMME.PATH, false);
	}

	/**
	 * Sort example.
	 */
	@Test
	public void testSort() {
		System.out.println();
		SortExample.run(EXAMPLES_PATH + SortExample.PATH);
	}

	/**
	 * Movies example.
	 */
	@Test
	public void testMovies() {
		System.out.println();
		MoviesBenchmark.runSyntheticDataTest(EXAMPLES_PATH + MoviesBenchmark.PATH, 1000, 4);
	}

	/**
	 * Java imports example.
	 */
	@Test
	public void testJavaImports() {
		System.out.println();
		JavaImportsExample.run(EXAMPLES_PATH + JavaImportsExample.PATH);
	}

}
