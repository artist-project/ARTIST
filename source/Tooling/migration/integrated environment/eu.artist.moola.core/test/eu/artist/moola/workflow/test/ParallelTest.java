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
package eu.artist.moola.workflow.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import eu.artist.moola.workflow.Arc;
import eu.artist.moola.workflow.Place;
import eu.artist.moola.workflow.Process;
import eu.artist.moola.workflow.Token;
import eu.artist.moola.workflow.Transition;

public class ParallelTest {

	private Process process;
	private Place start;
	private Place p1;
	private Place p2;
	private Place p3;
	private Place p4;
	private Place p5;
	private Place end;
	
	@Before
	public void setupProcess() {
		this.process = new Process();
		
		// two transitions, 3 states
		this.start = new Place("Start");
		this.p1 = new Place("P1");
		this.p2 = new Place("P2");
		this.p3 = new Place("P3");
		this.p4 = new Place("P4");
		this.p5 = new Place("P5");
		this.end = new Place("End");
		
		Transition a = new Transition("A");
		Transition b = new Transition("B");
		Transition c1 = new Transition("<c1>");
		Transition c = new Transition("C");
		Transition s1 = new Transition("<s1>");
		
		// arcs to connect them
		Arc startToA = new Arc(start, a);
		Arc aToP1 = new Arc(a, p1);
		Arc p1ToC1 = new Arc(p1, c1);
		Arc c1ToP2 = new Arc(c1, p2);
		Arc c1ToP3 = new Arc(c1, p3);
		Arc p2ToB = new Arc(p2, b);
		Arc p3ToC = new Arc(p3, c);
		Arc bToP4 = new Arc(b, p4);
		Arc cToP5 = new Arc(c, p5);
		Arc p4ToS1 = new Arc(p4, s1);
		Arc p5ToS1 = new Arc(p5, s1);
		Arc s1ToEnd = new Arc(s1, end);
		

		// putting it together
		a.addInput(startToA);
		a.addOutput(aToP1);
		c1.addInput(p1ToC1);
		c1.addOutput(c1ToP2);
		c1.addOutput(c1ToP3);
		b.addInput(p2ToB);
		b.addOutput(bToP4);
		c.addInput(p3ToC);
		c.addOutput(cToP5);
		s1.addInput(p4ToS1);
		s1.addInput(p5ToS1);
		s1.addOutput(s1ToEnd);
		
		start.addOutput(startToA);
		p1.addInput(aToP1);
		p1.addOutput(p1ToC1);
		p2.addInput(c1ToP2);
		p2.addOutput(p2ToB);
		p3.addInput(c1ToP3);
		p3.addOutput(p3ToC);
		p4.addInput(bToP4);
		p4.addOutput(p4ToS1);
		p5.addInput(cToP5);
		p5.addOutput(p5ToS1);
		s1.addInput(p4ToS1);
		s1.addInput(p5ToS1);
		s1.addOutput(s1ToEnd);
		end.addInput(s1ToEnd);

		
		// set tokens for start
		start.addToken(new Token("Test Token"));
		
		process.addTransitions(a);
		process.addTransitions(b);
		process.addTransitions(c1);
		process.addTransitions(c);
		process.addTransitions(s1);
		process.addPlace(start);
		process.addPlace(p1);
		process.addPlace(p2);
		process.addPlace(p3);
		process.addPlace(p4);
		process.addPlace(p5);
		process.addPlace(end);
	}
	
	@Test
	public void test() {
		this.process.run();
		
		assertFalse(this.start.hasTokens());
		assertFalse(this.p1.hasTokens());
		assertFalse(this.p2.hasTokens());
		assertFalse(this.p3.hasTokens());
		assertTrue(this.end.hasTokens());
	}
}
