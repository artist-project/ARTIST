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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.henshin.statespace.StateSpace;

/**
 * Resource implementation for state spaces.
 * 
 * @author Christian Krause
 */
public class StateSpaceResource extends ResourceImpl {
	
	/**
	 * File extension for state space files.
	 */
	public static final String FILE_EXTENSION = "henshin_statespace";
	
	// Buffer capacity to be used for loading and saving.
	public static final int BUFFER_CAPACITY = 524288;	// 0.5 MB
	
	// File name for the binary state space data inside the Zip archive.
	private static final String STATESPACE_BIN = "statespace.bin";

	// File name for the textual properties file inside the Zip archive.
	private static final String PROPERTIES_TXT = "properties.txt";
	
	// Current entry in the Zip file.
	private String currentEntry = null;
	
	/**
	 * Default constructor.
	 */
	public StateSpaceResource() {
		super();
	}
	
	/**
	 * Convenience constructor.
	 * @param uri URI of the resource.
	 */
	public StateSpaceResource(URI uri) {
		super(uri);
	}
	
	/**
	 * Get the state space contained in this resource.
	 * @return The state space.
	 */
	public StateSpace getStateSpace() {
		for (EObject item : getContents()) {
			if (item instanceof StateSpace) return (StateSpace) item;
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doSave(java.io.OutputStream, java.util.Map)
	 */
	@Override
	protected void doSave(OutputStream out, Map<?, ?> options) throws IOException {
		
		// We need the Zip stream:
		ZipOutputStream zip = (ZipOutputStream) out;
		
		// Binary state space data:
		BufferedOutputStream buffered = new BufferedOutputStream(zip, BUFFER_CAPACITY);
		StateSpaceSerializer serializer = new StateSpaceSerializer();
		serializer.write(getStateSpace(), buffered);
		buffered.flush();
		
		// Properties file:
		zip.putNextEntry(new ZipEntry(PROPERTIES_TXT));
		Properties properties = new Properties();
		for (Entry<String,String> entry : getStateSpace().getProperties().entrySet()) {
			properties.put(entry.getKey(),entry.getValue());
		}
		properties.store(zip, "State space properties");
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#doLoad(java.io.InputStream, java.util.Map)
	 */
	@Override
	protected void doLoad(InputStream in, Map<?, ?> options) throws IOException {
		
		// We need the underlying Zip stream:
		ZipInputStream zip = (ZipInputStream) in;
		BufferedInputStream buffered = new BufferedInputStream(zip, BUFFER_CAPACITY);
		
		// Properties:
		Properties properties = new Properties();

		// Load state space data and properties:
		ZipEntry entry = null;
		do {
			if (STATESPACE_BIN.equals(currentEntry)) {
				StateSpaceDeserializer deserializer = new StateSpaceDeserializer();
				deserializer.read(this, buffered);
			}
			if (PROPERTIES_TXT.equals(currentEntry)) {
				properties.load(buffered);
			}
			entry = zip.getNextEntry();
			while (entry!=null && !isContentZipEntry(entry)) {
				entry = zip.getNextEntry();				
			}
		}
		while (entry!=null);
		
		// Trasfer the properties into the state space model.
		if (getStateSpace()==null) {
			throw new IOException("Zip entry '" + STATESPACE_BIN + "' not found");
		} else {
			for (String key : properties.stringPropertyNames()) {
				getStateSpace().getProperties().put(key, properties.getProperty(key));
			}
		}

	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#useZip()
	 */
	@Override
	protected boolean useZip() {
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#newContentZipEntry()
	 */
	@Override
	protected ZipEntry newContentZipEntry() {
		// This is the entry in the ZIP file that stores the binary state space data.
		return new ZipEntry(STATESPACE_BIN);
	}
	
	@Override
	protected boolean isContentZipEntry(ZipEntry entry) {
		if (STATESPACE_BIN.equals(entry.getName())) {
			currentEntry = STATESPACE_BIN;
		}
		else if (PROPERTIES_TXT.equals(entry.getName())) {
			currentEntry = PROPERTIES_TXT;
		}
		else {
			currentEntry = null;
		}
		return currentEntry!=null;
	}
	
}
