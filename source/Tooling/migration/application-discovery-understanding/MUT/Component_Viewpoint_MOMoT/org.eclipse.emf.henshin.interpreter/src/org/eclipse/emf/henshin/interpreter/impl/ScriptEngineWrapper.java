/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Script engine wrapper for automatic handling of Java imports.
 */
public class ScriptEngineWrapper {

	/**
	 * Wildcard pattern
	 */
	private static final Pattern WILDCARD_PATTERN = Pattern.compile("(.*)\\.\\*$");

	/**
	 * The original scripting engine to delegate to.
	 */
	private final ScriptEngine engine;

	/**
	 * List of global imports.
	 */
	private final List<String> globalImports;

	/**
	 * Constructor.
	 * 
	 * @param engine Script engine to be used.
	 * @param globalImports List of global Java imports.
	 */
	public ScriptEngineWrapper(ScriptEngine engine, String[] globalImports) {
		this.engine = engine;
		this.globalImports = new ArrayList<String>();
		if (globalImports != null) {
			for (int i = 0; i < globalImports.length; i++) {
				this.globalImports.add(globalImports[i]);
			}
		}
		if (engine == null) {
			System.err.println("Warning: cannot find JavaScript engine");
		}
	}

	/**
	 * Constructor.
	 * 
	 * @param globalImports List of global Java imports.
	 */
	public ScriptEngineWrapper(String[] globalImports) {
		this(new ScriptEngineManager().getEngineByName("JavaScript"), globalImports);
	}

	/**
	 * Get the wrapped JavaScript engine.
	 * 
	 * @return The wrapped JavaScript engine.
	 */
	public ScriptEngine getEngine() {
		return engine;
	}

	/**
	 * Evaluates a given expression in a context which is extended with the provided imports. The imports are on purpose
	 * not added to the global scope to prevent pollution of the namespace.
	 * 
	 * @param script Script to be executed.
	 * @param localImports List of imports.
	 * @return The result.
	 * @throws ScriptException On script execution errors.
	 */
	@SuppressWarnings("unchecked")
	public Object eval(String script, List<String> localImports) throws ScriptException {
		if (!globalImports.isEmpty() || !localImports.isEmpty()) {
			script = "with (new JavaImporter(" + toImportString(globalImports, localImports) + ")) { " + script + " }";
		}
		return engine.eval(script);
	}

	/**
	 * Converts a list of imports like List("foo.Foo", "foo.bar.*") into one string "foo.Foo, foo.bar"
	 */
	private static String toImportString(List<String>... imports) {
		StringBuffer out = new StringBuffer();
		String delim = "";
		for (int i = 0; i < imports.length; i++) {
			for (String entry : imports[i]) {
				out.append(delim).append(stripWildcard(entry));
				delim = ", ";
			}
		}
		return out.toString();
	}

	private static String stripWildcard(String imp) {
		return isWildcard(imp) ? imp.substring(0, imp.length() - 2) : imp;
	}

	private static boolean isWildcard(String imp) {
		return WILDCARD_PATTERN.matcher(imp).matches();
	}

}
