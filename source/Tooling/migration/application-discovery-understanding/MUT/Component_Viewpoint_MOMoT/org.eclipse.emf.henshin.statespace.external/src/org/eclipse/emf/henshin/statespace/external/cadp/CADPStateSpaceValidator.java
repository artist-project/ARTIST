/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.cadp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.external.AbstractFileBasedValidator;
import org.eclipse.emf.henshin.statespace.util.StateSpaceSearch;

/**
 * CADP state space validator.
 * @author Christian Krause
 */
public class CADPStateSpaceValidator extends AbstractFileBasedValidator {
	
	/**
	 * ID of this validator.
	 */
	public static final String VALIDATOR_ID = "org.eclipse.emf.henshin.statespace.validator.cadp";
	
	/**
	 * Register this validator in the global validator registry in the state space plug-in.
	 */
	public static void register() {
		StateSpacePlugin.INSTANCE.getValidators().put(VALIDATOR_ID, new CADPStateSpaceValidator());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#validate(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public ValidationResult validate(StateSpace stateSpace, IProgressMonitor monitor) throws Exception {
		
		monitor.beginTask("Validating property...", 10);
		String basename = stateSpace.eResource().getURI().trimFileExtension().lastSegment();
		
		// Check the CADP path first:
		File cadpBin = getCADPBin();
		String suffix = isWindows() ? ".exe" : "";
		
		// Export the state space to an AUT file:
		File aut = exportAsAUT(stateSpace, new SubProgressMonitor(monitor, 4));
		if (monitor.isCanceled()) return null;									// 40%
		
		// Convert the AUT file to a BCG file:
		File bcg = File.createTempFile(basename, ".bcg");
		convertFile(aut, bcg, new SubProgressMonitor(monitor,2), 
					cadpBin.getAbsolutePath() + File.separator + "bcg_io" + suffix);	// 60%
		if (monitor.isCanceled()) return null;
		
		// Write the property to a MCL file:
		File mcl = createTempFile("property", ".mcl", property);
		monitor.worked(1);														// 70%
		
		// File for diagnostics output:
		File diag = File.createTempFile(basename, ".bcg");
				
		// Construct the command for running the evaluator:
		String[] command;
		String mclAbs = mcl.getAbsolutePath();
		String bcgAbs = bcg.getAbsolutePath();
		if (isWindows()) {
			if (mclAbs.charAt(1)==':') mclAbs = mclAbs.substring(2);
			if (bcgAbs.charAt(1)==':') bcgAbs = bcgAbs.substring(2);
			mclAbs = mclAbs.replace('\\', '/');
			bcgAbs = bcgAbs.replace('\\', '/');
			command = new String[] { 
					cadpBin.getAbsolutePath() + File.separator + "evaluator" + suffix, 
					"-diag",
					diag.getAbsolutePath(),
					mclAbs, 
					bcgAbs 
			};
		} else {
			command = new String[] { 
					cadpBin.getParent() + File.separator + "com" + File.separator + "bcg_open" + suffix, 
					bcgAbs, 
					"evaluator", 
					"-diag",
					diag.getAbsolutePath(),
					mclAbs 
			};
		}
		
		// Invoke the bcg_open script to run the evaluator:
		monitor.subTask("Running evaluator...");
		Process process = Runtime.getRuntime().exec(command);
		
		// Parse the output
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		Boolean result = null;
		boolean parsePath = false;
		List<String> path = new ArrayList<String>();
		monitor.worked(1);														// 80%
		
		String line;
		while ((line = reader.readLine())!=null) {
			line = line.trim();
			System.out.println(line);
			if (line.length()==0) continue;
			if (parsePath) {
				if (line.indexOf("<goal state>")>=0) {
					parsePath = false;
				} else {
					path.add(line.startsWith("\"") ? line.substring(1, line.length()-1) : line);
				}
			} else {
				if ("TRUE".equals(line)) {
					result = Boolean.TRUE;
				}
				else if ("FALSE".equals(line)) {
					result = Boolean.FALSE;
				}
				else if (line.indexOf("<initial state>")>=0) {
					parsePath = true;
				}
			}
			if (monitor.isCanceled()) {
				process.destroy();
				return null;
			}
		}
		monitor.worked(1);														// 90%
		
		// Clean up first. Don't delete the AUT file (cached).
		bcg.delete();
		mcl.delete();
		diag.delete();
		
		monitor.worked(1);														// 100%
		monitor.done();
		
		// Check the output:
		if (result==Boolean.TRUE) {
			return ValidationResult.VALID;
		}
		else if (result==Boolean.FALSE) {
			if (!path.isEmpty()) {
				return new ValidationResult(false,
						"Property not satisfied. See the explorer for a counterexample.",
						StateSpaceSearch.findPath(stateSpace, path));
			}
			return ValidationResult.INVALID;			
		}
		else {
			throw new RuntimeException("CADP evaluator produced unexpected output.");
		}
		
	}
	
	/**
	 * Get the CADP 'bin.*' directory.
	 * @return The directory.
	 * @throws FileNotFoundException If the directory was not found.
	 */
	public static File getCADPBin() throws FileNotFoundException {
		String path = System.getenv("CADP");
		if (path==null) {
			throw new FileNotFoundException("CADP environment variable not set.");
		}
		File cadp = new File(path);
		if (!cadp.isDirectory()) {
			throw new FileNotFoundException("CADP home not found. Check the CADP environment variable.");
		}
		File[] bin = cadp.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith("bin");
			}
		});
		if (bin.length==0) {
			throw new FileNotFoundException("Cannot find 'bin' directory in CADP home.");
		}
		return bin[0];
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.Validator#getName()
	 */
	@Override
	public String getName() {
		return "CADP";
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#usesProperty()
	 */
	@Override
	public boolean usesProperty() {
		return true;
	}

}
