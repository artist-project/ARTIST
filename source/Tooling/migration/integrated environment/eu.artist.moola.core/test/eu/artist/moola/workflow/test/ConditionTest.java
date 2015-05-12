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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import eu.artist.moola.workflow.Arc;
import eu.artist.moola.workflow.ICondition;
import eu.artist.moola.workflow.OrSplitTransition;
import eu.artist.moola.workflow.Place;
import eu.artist.moola.workflow.Process;
import eu.artist.moola.workflow.Token;
import eu.artist.moola.workflow.Transition;

public class ConditionTest {
	
	private Process process;
	private Place start;
	private Place p1;
	private Place p2;
	private Place p3;
	private Place p4;
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
		this.end = new Place("End");
		
		Transition a = new Transition("A");
		Transition b = new Transition("B");
		Transition c1 = new OrSplitTransition("<c1>");
		Transition c = new OrSplitTransition("C");
		Transition d = new OrSplitTransition("D");
		
		// arcs to connect them
		Arc startToA = new Arc(start, a);
		Arc aToP1 = new Arc(a, p1);
		Arc p1ToC1 = new Arc(p1, c1);
		Arc c1ToP2 = new Arc(c1, p2);
		Arc c1ToP3 = new Arc(c1, p3);
		Arc c1ToP4 = new Arc(c1, p4);
		Arc p2ToB = new Arc(p2, b);
		Arc p3ToC = new Arc(p3, c);
		Arc p4ToD = new Arc(p4, d);
		Arc bToEnd = new Arc(b, end);
		Arc cToEnd = new Arc(c, end);
		Arc dToEnd = new Arc(d, end);
		
		
		c1ToP2.setCondition(new ICondition() {
			@Override
			public boolean evaluate(Collection<Token> tokens) {
				List<Token> t = new ArrayList<>(tokens);
				return t.get(0).getName().equals("routeB");
			}
		});

		c1ToP3.setCondition(new ICondition() {
			@Override
			public boolean evaluate(Collection<Token> tokens) {
				List<Token> t = new ArrayList<>(tokens);
				return t.get(0).getName().equals("routeC");
			}
		});
		
		// putting it together
		a.addInput(startToA);
		a.addOutput(aToP1);
		c1.addInput(p1ToC1);
		c1.addOutput(c1ToP2);
		c1.addOutput(c1ToP3);
		c1.addOutput(c1ToP4);
		b.addInput(p2ToB);
		b.addOutput(bToEnd);
		c.addInput(p3ToC);
		c.addOutput(cToEnd);
		d.addInput(p4ToD);
		d.addOutput(dToEnd);

		
		start.addOutput(startToA);
		p1.addInput(aToP1);
		p1.addOutput(p1ToC1);
		p2.addInput(c1ToP2);
		p2.addOutput(p2ToB);
		p3.addInput(c1ToP3);
		p3.addOutput(p3ToC);
		p4.addInput(c1ToP4);
		p4.addOutput(p4ToD);
		end.addInput(bToEnd);
		end.addInput(cToEnd);
		end.addInput(dToEnd);
		
		// set tokens for start
		start.addToken(new Token("routeB"));
		
		process.addTransitions(a);
		process.addTransitions(b);
		process.addTransitions(c);
		process.addTransitions(d);
		process.addTransitions(c1);
		process.addPlace(start);
		process.addPlace(p1);
		process.addPlace(p2);
		process.addPlace(p3);
		process.addPlace(p4);
		process.addPlace(end);
	}
	
	@Test
	public void test() {
		this.process.run();
		
		assertFalse(this.start.hasTokens());
		assertFalse(this.p1.hasTokens());
		assertFalse(this.p2.hasTokens());
		assertFalse(this.p3.hasTokens());
		assertFalse(this.p4.hasTokens());
		assertTrue(this.end.hasTokens());
	}

}
