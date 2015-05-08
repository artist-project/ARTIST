/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * State space serializer.
 * 
 * @author Christian Krause
 * @see StateSpaceDeserializer
 */
public class StateSpaceSerializer {
	
	// Marker bytes (short): "HS"
	public static final int MARKER = 18515;
	
	// Output stream.
	private OutputStream out;
	
	/**
	 * Serialize a state space.
	 * @param stateSpace State space.
	 * @param out Output stream.
	 * @throws IOException on I/O errors.
	 */
	public void write(StateSpace stateSpace, OutputStream out) throws IOException {
		
		this.out = out;
		URI baseURI = stateSpace.eResource().getURI();
		
		// Reset state indizes:
		for (int i=0; i<stateSpace.getStates().size(); i++) {
			stateSpace.getStates().get(i).setIndex(i);
		}
		
		// Get the list of rules:
		List<Rule> rules = stateSpace.getRules();
		
		// Header:
		writeShort(MARKER); // Marker
		writeShort(3); // Version
				
		writeShort(rules.size()); // Rule count
		writeInt(stateSpace.getStates().size()); // State count
		writeInt(stateSpace.getTransitionCount()); // Transition count
		writeData(stateSpace.getData()); // Meta-data
		
		// Rules:
		for (Rule rule : stateSpace.getRules()) {
			URI uri = EcoreUtil.getURI(rule).deresolve(baseURI);
			writeString(uri.toString());
		}
		
		// States:
		for (State state : stateSpace.getStates()) {
			
			writeString(state.isInitial() ? 
					state.getModel().getResource().getURI().deresolve(baseURI).toString() : null);
			writeData(state.getData());
			
			// Transitions:
			writeShort(state.getOutgoing().size());
			
			for (Transition transition : state.getOutgoing()) {
				State target = transition.getTarget();
				if (target==null) 
					throw new IOException("Dangling transition");
				if (target.getStateSpace()!=stateSpace) 
					throw new IOException("Transition target not contained in state space");
				writeShort(rules.indexOf(transition.getRule()));
				writeData(transition.getData());
				writeInt(target.getIndex());
			}
		}		
		
		this.out = null;
		
	}
	
	/*
	 * Write a string to the stream.
	 */
	private void writeString(String string) throws IOException {
		if (string==null) {
			writeShort(0);
		} else {
			int length = string.length();
			writeShort(length);
			for (int i=0; i<length; i++) {
				out.write(string.charAt(i));
			}
		}
	}
	
	/*
	 * Write an integer array to the stream.
	 */
	private void writeData(int[] data) throws IOException {
		if (data==null) {
			writeShort(0);
		} else {
			writeShort(data.length);
			for (int i=0; i<data.length; i++) {
				writeInt(data[i]);
			}
		}
	}
	
	/*
	 * Write an integer to the stream.
	 */
	private void writeInt(int value) throws IOException {
		out.write(value >>> 24);
		out.write(value >>> 16);
		out.write(value >>> 8);
		out.write(value);
	}
	
	/*
	 * Write a short to the stream.
	 */
	private void writeShort(int value) throws IOException {
		out.write(value >>> 8);
		out.write(value);
	}
	
}
