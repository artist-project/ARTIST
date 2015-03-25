/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.mcrl2;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.external.AbstractFileBasedValidator;
import org.eclipse.emf.henshin.statespace.util.ObjectKeyHelper;

/**
 * mCRL2 state space validator.
 * @author Christian Krause
 */
public class MCRL2StateSpaceValidator extends AbstractFileBasedValidator {
	
	/**
	 * ID of this validator.
	 */
	public static final String VALIDATOR_ID = "org.eclipse.emf.henshin.statespace.validator.mcrl2";
	
	/**
	 * Register this validator in the global validator registry in the state space plug-in.
	 */
	public static void register() {
		StateSpacePlugin.INSTANCE.getValidators().put(VALIDATOR_ID, new MCRL2StateSpaceValidator());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#validate(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public ValidationResult validate(StateSpace stateSpace, IProgressMonitor monitor) throws Exception {
		
		monitor.beginTask("Validating property...", 10);
		String name = stateSpace.eResource().getURI().trimFileExtension().lastSegment();
		
		// Export the state space to an AUT file:
		File aut = exportAsAUT(stateSpace, new SubProgressMonitor(monitor,4));	
		if (monitor.isCanceled()) return null;								// 40%
		
		// Minimize the LTS:
		File min = File.createTempFile(name, ".aut");
		convertFile(aut, min, new SubProgressMonitor(monitor,1), 
				"ltsconvert", "--equivalence=bisim");						// 50%
		if (monitor.isCanceled()) return null;
		
		// Create a dummy mCRL2 specification with the action declarations:
		String actions = createActions(stateSpace);
		System.out.println(actions + "\n");
		File act = createTempFile(name, ".mcrl2", actions);
		
		// Convert the LTS to a LPS:
		File lps = File.createTempFile(name, ".lps");
		convertFile(min, lps, new SubProgressMonitor(monitor,1), 
				"lts2lps", "--data=" + act.getAbsolutePath());				// 60%
		if (monitor.isCanceled()) return null;
		
		// Write the property to a MCL file:
		File mcl = createTempFile("property", ".mcl", property);
		
		// Generate a PBES from the LPS and the formula:
		File pbes = File.createTempFile(name, ".pbes");
		convertFile(lps, pbes, new SubProgressMonitor(monitor,2),
				"lps2pbes", "--formula=" + mcl.getAbsolutePath());			// 80%
		if (monitor.isCanceled()) return null;
		
		// Evaluate the PBES:
		monitor.subTask("Running pbes2bool...");
		String[] pbes2bool = new String[] { "pbes2bool", pbes.getAbsolutePath() };
		boolean isLinux = System.getProperty("os.name").startsWith("Linux");
		if (isLinux) {					// increase stack size
			pbes2bool = new String[] { "bash", "-c", "ulimit -s unlimited; pbes2bool " + pbes.getAbsolutePath() };
		}
		Process process = Runtime.getRuntime().exec(pbes2bool);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				isLinux ? process.getErrorStream() : process.getInputStream()));
		Boolean result = null;
		
		// Read the output:
		String line;
		while ((line = reader.readLine())!=null) {
			System.out.println("pbes2bool: " + line);
			if (line.indexOf("true") >= 0) {
				result = Boolean.TRUE; 
				break;
			}
			if (line.indexOf("false") >= 0) {
				result = Boolean.FALSE; 
				break;
			}
			if (monitor.isCanceled()) {
				process.destroy();
				return null;
			}
		}
		process.waitFor();
		monitor.worked(1);													// 90%
		
		// Clean up. Don't delete the AUT file cause it is cached.
		min.delete();
		act.delete();
		lps.delete();
		mcl.delete();
		pbes.delete();
		
		monitor.worked(1);													// 100%
		monitor.done();
		
		// Check the result:
		if (result==Boolean.TRUE) {
			return ValidationResult.VALID;
		} else if (result==Boolean.FALSE) {
			return ValidationResult.INVALID;
		} else {
			throw new RuntimeException("pbes2bool produced no output.");
		}
		
	}
	
	/*
	 * Create a string representations of the used actions.
	 */
	private String createActions(StateSpace stateSpace) throws StateSpaceException {
		StringBuffer actions = new StringBuffer();
		
		// Compute super types to be used:
		Map<EClass, EClass> superTypes = getSuperTypeMap(stateSpace);
		Map<EClass,Set<String>> superTypeParams = getUsedParameterNamesByType(stateSpace, superTypes);
		Map<EClass,Set<String>> basicTypeParams = getUsedParameterNamesByType(stateSpace, null);
		
		// Create the data types if required:
		if (!stateSpace.getEqualityHelper().getIdentityTypes().isEmpty()) {
			for (Map.Entry<EClass,Set<String>> entry : superTypeParams.entrySet()) {				
				actions.append("sort " + entry.getKey().getName() + " = struct ");
				Iterator<String> it = entry.getValue().iterator();
				while (it.hasNext()) {
					actions.append(it.next());
					if (it.hasNext()) {
						actions.append(" | ");
					}
				}
				actions.append( ";\n");
			}
		}
		
		// Create the actions (rule names):
		actions.append("act ");
		for (int i=0; i<stateSpace.getRules().size(); i++) {
			Rule rule = stateSpace.getRules().get(i);
			actions.append(rule.getName());
			if (!stateSpace.getEqualityHelper().getIdentityTypes().isEmpty()) {
				actions.append(" : ");
				List<Node> nodes = rule.getParameterNodes();
				for (int j=0; j<nodes.size(); j++) {
					EClass type = superTypes.get(nodes.get(j).getType());
					actions.append(type.getName());
					if (j<nodes.size()-1) actions.append(" # ");
				}
			}
			actions.append("; ");
		}
		actions.append("\n\n");
		
		// Create type functions:
		int var=1;
		if (!stateSpace.getEqualityHelper().getIdentityTypes().isEmpty()) {
			for (Map.Entry<EClass,Set<String>> entry : basicTypeParams.entrySet()) {	
				
				String variable = "xyz" + (var++); 
				String superType = superTypes.get(entry.getKey()).getName();
				String function = "is" + entry.getKey().getName();
				
				actions.append("map " + function + " : " + superType + " -> Bool;\n");
				actions.append("var " + variable + " : " + superType + ";\n");
				Iterator<String> it = entry.getValue().iterator();
				actions.append("eqn " + function + "(" + variable + ") = ");
				if (it.hasNext()) {
					while (it.hasNext()) {
						actions.append("(" + variable + "==" + it.next() + ")");
						if (it.hasNext()) {
							actions.append(" || ");
						}
					}
				} else {
					actions.append("false");
				}
				actions.append(";\n\n");
			}
		}
		
		// Done.
		return actions.toString();
		
	}

	/*
	 * Construct a super type map for a state space.
	 */
	private Map<EClass,EClass> getSuperTypeMap(StateSpace stateSpace) throws StateSpaceException {
		
		// Get all relevant types:
		Set<EClass> types = new LinkedHashSet<EClass>();
		types.addAll(stateSpace.getEqualityHelper().getIdentityTypes());
		for (Rule rule : stateSpace.getRules()) {
			List<Node> params = rule.getParameterNodes();
			for (Node param : params) {
				types.add(param.getType());
			}
		}
		
		// Initialize with the identity map:
		Map<EClass,EClass> superTypes = new HashMap<EClass,EClass>();
		for (EClass type : types) {
			superTypes.put(type, type);
		}
		
		// Now check for super types used in rules:
		for (Rule rule : stateSpace.getRules()) {
			List<Node> params = rule.getParameterNodes();
			for (Node param : params) {
				EClass superType2 = param.getType();
				for (EClass type : types) {
					EClass superType1 = superTypes.get(type);
					if (superType1!=superType2 && 
						superType2.isSuperTypeOf(superType1)) {
						superTypes.put(type, superType2);
					}
				}
			}
		}
		
		// Done.
		return superTypes;
		
	}
	
	/*
	 * Get all used parameter names sorted by their types.
	 */
	private Map<EClass,Set<String>> getUsedParameterNamesByType(
			StateSpace stateSpace, Map<EClass,EClass> superTypes) throws StateSpaceException {
		
		// Get all used parameter keys:
		int[] params = stateSpace.getAllParameterKeys();
		
		// Get the object types and prefixes:
		EList<EClass> types = stateSpace.getEqualityHelper().getIdentityTypes();
		
		// Now we build the map:
		Map<EClass,Set<String>> result = new HashMap<EClass,Set<String>>();
		for (int i=0; i<params.length; i++) {
			
			// Get the parameter type and compute the super types to be used:
			EClass type = ObjectKeyHelper.getObjectType(params[i], types);
			if (superTypes!=null && superTypes.containsKey(type)) {
				type = superTypes.get(type);
			}
			
			// Get the type prefix and the object id:
			String prefix = ObjectKeyHelper.getObjectTypePrefix(params[i]);
			int id = ObjectKeyHelper.getObjectID(params[i]);
			
			// Construct the name and store it:
			String name = prefix + id;
			Set<String> names = result.get(type);
			if (names==null) {
				names = new LinkedHashSet<String>();
				result.put(type, names);
			}
			names.add(name);
		}
		
		// Done.
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.Validator#getName()
	 */
	@Override
	public String getName() {
		return "mCRL2";
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
