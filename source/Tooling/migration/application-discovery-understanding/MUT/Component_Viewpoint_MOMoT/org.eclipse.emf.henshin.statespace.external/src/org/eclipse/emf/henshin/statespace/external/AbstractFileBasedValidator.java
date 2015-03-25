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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceExporter;
import org.eclipse.emf.henshin.statespace.external.cadp.AUTStateSpaceExporter;
import org.eclipse.emf.henshin.statespace.impl.AbstractStateSpaceValidator;

/**
 * Abstract state space validator implementation that is based
 * on invoking external tools on files derived from the state space.
 * Contains some helper methods for invoking commands and converting files.
 * 
 * @author Christian Krause
 */
public abstract class AbstractFileBasedValidator extends AbstractStateSpaceValidator {
	
	/**
	 * A key used for exported AUT files. Used for caching.
	 */
	public static final String AUT_FILE_EXPORT_KEY = "aut-export";
	
	// File cache map (used internally):
	private Map<StateSpace,Map<String,File>> fileCache = new HashMap<StateSpace,Map<String,File>>();
	
	// Adapter that makes sure changed state spaces are removed from the file cache:
	private Adapter cacheAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification event) {
			clearCachedFiles((StateSpace) event.getNotifier());
		}
	};	
	
	/**
	 * Cache a file that is associated to a state space.
	 * @param stateSpace The state space.
	 * @param key Unique key for the file type.
	 * @param file The file to be cached.
	 */
	protected void addCachedFile(StateSpace stateSpace, String key, File file) {
		Map<String,File> files = fileCache.get(stateSpace);
		if (files==null) {
			files = new HashMap<String,File>();
			fileCache.put(stateSpace, files);
		}
		// Delete existing file:
		if (files.containsKey(key)) {
			files.get(key).delete();
		}
		files.put(key, file);
		if (!stateSpace.eAdapters().contains(cacheAdapter)) {
			stateSpace.eAdapters().add(cacheAdapter);			
		}
	}
	
	/**
	 * Get a cached file.
	 * @param stateSpace State space.
	 * @param key Unique key.
	 * @return Cached file.
	 */
	protected File getCachedFile(StateSpace stateSpace, String key) {
		Map<String,File> files = fileCache.get(stateSpace);
		if (files==null) {
			return null;
		}
		File file = files.get(key);
		if (file!=null && file.exists()) {
			return file;
		} else {
			files.remove(key);
			return null;
		}
	}

	/**
	 * Clear the file cache for the argument state space.
	 * This deletes all files associated to this state space.
	 * @param stateSpace The state space.
	 */
	protected void clearCachedFiles(StateSpace stateSpace) {
		Map<String,File> files = fileCache.remove(stateSpace);
		if (files!=null) {
			for (File file : files.values()) {
				file.delete();
			}
		}
		stateSpace.eAdapters().remove(cacheAdapter);
	}
	
	/**
	 * Export a state space as an AUT file.
	 * @param stateSpace State space.
	 * @param aut The AUT file.
	 * @throws IOException On I/O errors.
	 */
	protected File exportAsAUT(StateSpace stateSpace, IProgressMonitor monitor) throws IOException {
				
		// Check the cached AUT file.
		File cached = getCachedFile(stateSpace, AUT_FILE_EXPORT_KEY);
		if (cached!=null) {
			monitor.done();
			return cached;
		}
		
		// Get the base name of the state space file:
		String basename = stateSpace.eResource().getURI().trimFileExtension().lastSegment();
		File aut = File.createTempFile(basename, ".aut");
		URI uri = URI.createFileURI(aut.getAbsolutePath());
		
		// Do the export:
		AUTStateSpaceExporter exporter = new AUTStateSpaceExporter();
		exporter.doExport(stateSpace, uri, null, monitor);
		
		// We cache the file so that we don't have to generate it again:
		addCachedFile(stateSpace, AUT_FILE_EXPORT_KEY, aut);
		return aut;
		
	}

	protected File export(StateSpace stateSpace, StateSpaceExporter exporter, String parameters, String fileext, IProgressMonitor monitor) throws Exception {

		// Temporary file.
		String filename = stateSpace.eResource()!=null ? 
				stateSpace.eResource().getURI().trimFileExtension().lastSegment() : "statespace";
		File tmp = createTempFile(filename, "." + fileext, null);
		URI uri = URI.createFileURI(tmp.getAbsolutePath());
		
		// Do the export:
		exporter.setStateSpaceIndex(index);
		exporter.doExport(stateSpace, uri, parameters, monitor);
		return tmp;
		
	}
	
	/**
	 * Convert a file using a given command.
	 * @param input Input file.
	 * @param output Output file.
	 * @param command Command.
	 * @throws Exception On 
	 */
	protected void convertFile(File input, File output, IProgressMonitor monitor, String... command) throws Exception {
		
		String label = "Running " + command[0] + "...";
		monitor.beginTask(label,1);
		monitor.subTask(label);
		
		command = Arrays.copyOf(command, command.length + 2);
		command[command.length-2] = input.getAbsolutePath();
		command[command.length-1] = output.getAbsolutePath();
		
		// Increase stack size on Linux machines:
		if (isLinux()) {
			String mergedCommand = "";
			for (String part : command) {
				mergedCommand = mergedCommand + " " + part;
			}
			command = new String[] { "bash", "-c", "ulimit -s unlimited;" + mergedCommand };
		}
		
		// Print some debug info:
		for (String part : command) {
			System.out.print(part + " ");
		}
		System.out.println();
		
		// Now start the process:
		Process process = Runtime.getRuntime().exec(command);
		int exit;
		int wait = 50;
		while (true) {
			
			// Canceled?
			if (monitor.isCanceled()) {
				process.destroy();
				exit = 0;
				break;
			}
			
			// Poll:
			try {
				exit = process.exitValue();
				break;
			} catch (IllegalThreadStateException e) {}
			
			// Wait:
			try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {}
			
			// Increase the waiting time gradually:
			wait = (int) (wait * 1.1);
			
		}
		
		// Correct exit code?
		if (exit!=0) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String out = "";
			while (true) {
				String line = reader.readLine();
				if (line==null) break;
				else out = out + "\n" + line;
			}
			throw new RuntimeException(command[0] + " returned exit code " + exit + ":\n" + out);
		}
		
		// Clean up.		
		process.destroy();
		monitor.worked(1);
		monitor.done();
		
	}

	/**
	 * Simple helper method for creating temporary files. 
	 * @param content Content.
	 * @throws IOException I/O errors.
	 */
	protected File createTempFile(String prefix, String suffix, String content) throws IOException {
		File temp = File.createTempFile(prefix, suffix);
		if (content!=null) {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(temp)));
			writer.write(content);
			writer.close();
		}
		return temp;
	}
	
	/**
	 * Check whether the current platform is Windows.
	 * @return <code>true</code> if it is Windows.
	 */
	protected boolean isWindows() {
		return Platform.OS_WIN32.equals(Platform.getOS());
	}
	
	/**
	 * Check whether the current platform is Linux.
	 * @return <code>true</code> if it is Linux.
	 */
	protected boolean isLinux() {
		return Platform.OS_LINUX.equals(Platform.getOS());
	}
	
}
