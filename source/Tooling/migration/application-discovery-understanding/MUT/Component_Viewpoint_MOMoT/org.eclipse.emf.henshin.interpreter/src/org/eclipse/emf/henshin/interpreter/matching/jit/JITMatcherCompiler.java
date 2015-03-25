/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.jit;

import java.util.Map;

import org.eclipse.emf.henshin.model.Rule;

/**
 * JIT matcher compiler class. Use the INSTANCE field to generate 
 * match finders using the default JIT matcher compilers.
 * 
 * @author Christian Krause
 */
public interface JITMatcherCompiler {
	
	/**
	 * Static instance. Use this to generate match finders.
	 */
	public static JITMatcherCompiler INSTANCE = new JITMatcherCompiler() {
		
		/*
		 * JITCompilers to be used:
		 */
		private final JITMatcherCompiler[] COMPILERS = new JITMatcherCompiler[] {
				new TreeJITMatcherCompiler()
		};
		
		@Override
		public JITMatcher generateMatcher(Rule rule, Map<String,Object> options) {
			for (JITMatcherCompiler compiler : COMPILERS) {
				JITMatcher matchFinder = compiler.generateMatcher(rule, options);
				if (matchFinder!=null) {
					return matchFinder;
				}
			}
			return null; // no match finder generated
		}

	};
	
	/**
	 * Generate a JIT matcher.
	 * @param rule Rule to be matched.
	 * @param options Engine options.
	 * @return The JIT matcher or <code>null</code>.
	 */
	JITMatcher generateMatcher(Rule rule, Map<String,Object> options);
	
}
