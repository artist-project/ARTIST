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
import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.impl.ModelImpl;
import org.eclipse.emf.henshin.statespace.impl.StateImpl;

/**
 * State space deserializer.
 * 
 * @author Christian Krause
 */
public class StateSpaceDeserializer {
	
	// Input stream.
	private InputStream in;
	
	/**
	 * Deserialize a state space.
	 * @param in Input stream.
	 * @result State space.
	 * @throws IOException on I/O errors.
	 */
	public void read(StateSpaceResource resource, InputStream in) throws IOException {
		
		this.in = in;
		
		// Create a new state space:
		StateSpace stateSpace = StateSpaceFactory.eINSTANCE.createStateSpace();
		
		// Header:
		int marker = readShort(); // Marker
		if (marker!=StateSpaceSerializer.MARKER) throw new IOException("State space file marker not found"); // Marker
		
		int version = readShort(); // Version number
		if (version<0 || version>3) {
			throw new IOException("Unsupported format version: " + version);
		}
		
		// Before version 3, the equality type was set here:
		if (version<3) {
			int equalityType = readShort(); // Equality type
			boolean useGraphEquality = (equalityType & 1)==1;
			if (!useGraphEquality) {
				stateSpace.getProperties().put(StateSpace.PROPERTY_CHECK_LINK_ORDER, "true");
			}			
		}
		
		int ruleCount = readShort(); // Rule count
		int stateCount = readInt(); // State count
		int transitionCount = readInt(); // Transition count
		
		int[] data = readData(); // Meta-data
		stateSpace.setTransitionCount(transitionCount);
		stateSpace.setData(data);
		
		// Create states:
		List<State> states = stateSpace.getStates();
		for (int i=0; i<stateCount; i++) {
			states.add(new StateImpl(i));
		}
		
		// Load rules:
		for (int i=0; i<ruleCount; i++) {
			URI uri = resolveURI(URI.createURI(readString()),resource);
			Rule rule = (Rule) resource.getResourceSet().getEObject(uri,true);
			rule.eResource().setURI(uri.trimFragment());
			stateSpace.getRules().add(rule);
		}
			
		// Load states and transitions:
		transitionCount = 0;
		for (State state : states) {
			
			// Initial states have a model URI:
			String modelUri = readString();
			
			// Read meta-data:
			state.setData(readData());
			
			// Check if it was an initial state:
			if (modelUri!=null) {
				
				// Load the model:
				URI uri = resolveURI(URI.createURI(modelUri),resource);
				Resource contents = resource.getResourceSet().getResource(uri,true);
				contents.setURI(uri);
				Model model = new ModelImpl(contents);
				model.setObjectKeys(state.getObjectKeys());
				state.setModel(model);
				
				// Add it to the list of initial states:
				stateSpace.getInitialStates().add(state);
			}

			// Check if it is an open state:
			if (state.isOpen()) {
				stateSpace.getOpenStates().add(state);
			}
			
			// Transitions:
			int transitions = readShort();
			for (int i=0; i<transitions; i++) {
				Transition transition = StateSpaceFactory.eINSTANCE.createTransition();
				transition.setRule(stateSpace.getRules().get(readShort()));
				if (version==0) {
					transition.setMatch(readShort());	// In version 0, the match is stored here.
				} else {
					transition.setData(readData());		// Since version 1, transitions implement Storage.
				}
				transition.setTarget(stateSpace.getStates().get(readInt()));
				state.getOutgoing().add(transition);
			}
			transitionCount += transitions;

		}
		
		// Update transition count:
		stateSpace.setTransitionCount(transitionCount);
		
		// Update the equality helper:
		stateSpace.updateEqualityHelper();
		
		// We expect EOF now:
		if (in.read()>=0) {
			throw new IOException("Expected end of file");
		}
		
		// Attach the state space to the resource:
		resource.getContents().clear();
		resource.getContents().add(stateSpace);
		
		this.in = null;
		
	}
	
	/*
	 * Read a string from the stream.
	 */
	private String readString() throws IOException {
		int size = readShort();
		if (size==0) return null;
		char[] string = new char[size];
		for (int i=0; i<size; i++) {
			int value = in.read();
			if (value<0) throw new IOException("Unexpected end of file");
			string[i] = (char) value;
		}
		return new String(string);
	}
	
	/*
	 * Read an integer array from the stream.
	 */
	private int[] readData() throws IOException {
		int size = readShort();
		int[] data = new int[size];
		for (int i=0; i<size; i++) {
			data[i] = readInt();
		}
		return data;
	}
	
	/*
	 * Read an integer from the stream.
	 */
	private int readInt() throws IOException {
		int b0 = in.read();
		int b1 = in.read();
		int b2 = in.read();
		int b3 = in.read();
		if (b0<0 || b1<0 || b2<0 || b3<0) throw new IOException("Unexpected end of file");
		return (b0 << 24) + ((b1 & 0xFF) << 16) + ((b2 & 0xFF) << 8) + (b3 & 0xFF);
	}

	/*
	 * Read a short from the stream.
	 */
	private int readShort() throws IOException {
		int b0 = in.read();
		int b1 = in.read();
		if (b0<0 || b1<0) throw new IOException("Unexpected end of file");
		return (b0 << 8) + (b1 & 0xFF);
	}
	
	private URI resolveURI(URI uri, Resource resource) {
		if (resource.getResourceSet()!=null) {
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
		}
		if (!resource.getURI().isRelative()) {
			uri = uri.resolve(resource.getURI());
		}
		return uri;
	}
	
}
