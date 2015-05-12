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

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import eu.artist.moola.workflow.Arc;
import eu.artist.moola.workflow.ICondition;
import eu.artist.moola.workflow.OrSplitTransition;
import eu.artist.moola.workflow.Place;
import eu.artist.moola.workflow.Process;
import eu.artist.moola.workflow.Token;
import eu.artist.moola.workflow.Transition;

public class IterationTest {
	
	private Process process;
	private Place start;
	private Place p1;
	private Place p2;
	private Place end;
	
	@Before
	public void setupProcess() {
		this.process = new Process();
		
		// two transitions, 3 states
		this.start = new Place("Start");
		this.p1 = new Place("P1");
		this.p2 = new Place("P2");
		this.end = new Place("End");
		
		Transition a = new Transition("A");
		Transition b = new Transition("B");
		Transition c = new OrSplitTransition("<c1>");
		
		// arcs to connect them
		Arc startToA = new Arc(start, a);
		Arc aToP1 = new Arc(a, p1);
		Arc p1ToB = new Arc(p1, b);
		Arc bToP2 = new Arc(b, p2);
		Arc p2ToC = new Arc(p2, c);
		Arc cToP1 = new Arc(c, p1);
		Arc cToEnd = new Arc(c, end);
		
		cToP1.setCondition(new ICondition() {
			private int count = 3;
			@Override
			public boolean evaluate(Collection<Token> tokens) {
				return --count != 0;
			}
		});
		
		// putting it together
		a.addInput(startToA);
		a.addOutput(aToP1);
		b.addInput(p1ToB);
		b.addOutput(bToP2);
		c.addInput(p2ToC);
		c.addOutput(cToP1);
		c.addOutput(cToEnd);
		
		start.addOutput(startToA);
		p1.addInput(aToP1);
		p1.addInput(cToP1);
		p1.addOutput(p1ToB);
		p2.addInput(bToP2);
		p2.addOutput(p2ToC);
		end.addInput(cToEnd);
		
		// set tokens for start
		start.addToken(new Token("Test Token"));
		
		process.addTransitions(a);
		process.addTransitions(b);
		process.addTransitions(c);
		process.addPlace(start);
		process.addPlace(p1);
		process.addPlace(p2);
		process.addPlace(end);
	}
	
	@Test
	public void test() {
		this.process.run();
		
		assertFalse(this.start.hasTokens());
		assertFalse(this.p1.hasTokens());
		assertFalse(this.p2.hasTokens());
		assertTrue(this.end.hasTokens());
	}

}
