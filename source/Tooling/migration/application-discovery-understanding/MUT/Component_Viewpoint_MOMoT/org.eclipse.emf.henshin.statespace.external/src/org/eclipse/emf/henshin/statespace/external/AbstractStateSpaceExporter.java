/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.eclipse.emf.henshin.statespace.StateSpaceExporter;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;

/**
 * Abstract exporter class.
 * @author Christian Krause
 */
public abstract class AbstractStateSpaceExporter implements StateSpaceExporter {

	// The state space index:
	protected StateSpaceIndex stateSpaceIndex;

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceExporter#setStateSpaceIndex(org.eclipse.emf.henshin.statespace.StateSpaceIndex)
	 */
	@Override
	public void setStateSpaceIndex(StateSpaceIndex index) {
		this.stateSpaceIndex = index;
	}
	
	/**
	 * Create a new output stream writer.
	 * @param file File.
	 * @return The writer.
	 * @throws IOException On errors.
	 */
	protected static OutputStreamWriter createWriter(File file) throws IOException {
		OutputStream out = new BufferedOutputStream(new FileOutputStream(file), 32768);
		OutputStreamWriter writer = new OutputStreamWriter(out);
		return writer;
	}
	
}
