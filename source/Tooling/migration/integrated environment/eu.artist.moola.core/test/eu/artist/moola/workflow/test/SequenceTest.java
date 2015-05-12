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

public class SequenceTest {

	private Process process;
	private Place start;
	private Place mid;
	private Place end;
	
	@Before
	public void setupProcess() {
		this.process = new Process();
		
		// two transitions, 3 states
		this.start = new Place("Start");
		this.mid = new Place("Middle");
		this.end = new Place("End");
		
		Transition trans1 = new Transition("A");
		Transition trans2 = new Transition("B");
		
		// arcs to connect them
		Arc startToA = new Arc(start, trans1);
		Arc aToMid = new Arc(trans1, mid);
		Arc midToB = new Arc(mid, trans2);
		Arc bToEnd = new Arc(trans2, end);
		
		// putting it together
		trans1.addInput(startToA);
		trans1.addOutput(aToMid);
		
		trans2.addInput(midToB);
		trans2.addOutput(bToEnd);
		
		start.addOutput(startToA);
		mid.addInput(aToMid);
		mid.addOutput(midToB);
		end.addInput(bToEnd);
		
		// set tokens for start
		start.addToken(new Token("Test Token"));
		
		process.addTransitions(trans1);
		process.addTransitions(trans2);
		process.addPlace(start);
		process.addPlace(mid);
		process.addPlace(end);
	}
	
	@Test
	public void test() {
		this.process.run();
		
		assertFalse(this.start.hasTokens());
		assertFalse(this.mid.hasTokens());
		assertTrue(this.end.hasTokens());
	}

}
