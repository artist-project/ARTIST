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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

/**
 * Abstract JIT matcher compiler implementation.
 * 
 * @author Christian Krause
 */
public abstract class AbstractJITMatcherCompiler implements JITMatcherCompiler {
	
	protected class MatchingCodeGenerator {
		PrintWriter ruleFields; 
		PrintWriter ruleInitCode; 
		PrintWriter matcherFields;
		PrintWriter matcherCode;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.jit.JITCompiler#generateMatchFinder(org.eclipse.emf.henshin.model.Rule, java.util.Map)
	 */
	@Override
	public JITMatcher generateMatcher(Rule rule, Map<String,Object> options) {
		
		// Try to generate match finder code:
		StringWriter ruleFields = new StringWriter();
		StringWriter ruleInitCode = new StringWriter();
		StringWriter matcherFields = new StringWriter();
		StringWriter matcherCode = new StringWriter();
		
		MatchingCodeGenerator generator = new MatchingCodeGenerator();
		generator.ruleFields = new PrintWriter(ruleFields);
		generator.ruleInitCode = new PrintWriter(ruleInitCode);
		generator.matcherFields = new PrintWriter(matcherFields);
		generator.matcherCode = new PrintWriter(matcherCode);
		
		if (generateNextMatchMethod(rule, generator)) {
			
			// Generate the full class body and save it in a .java file:
			File root = new File("/tmp/henshin-jit");
			int rand = ((Long) (rule.hashCode() + System.currentTimeMillis())).intValue();
			if (rand<0) rand = -rand;
			String className = "JIT" + rand;
			File sourceFile = new File(root, className + ".java");
			try {
				sourceFile.getParentFile().mkdirs();
				PrintWriter out = new PrintWriter(new FileWriter(sourceFile));
				out.println("import java.util.*;");
				out.println("import org.eclipse.emf.ecore.*;");
				out.println("import org.eclipse.emf.henshin.model.*;");
				out.println("import org.eclipse.emf.henshin.interpreter.*;");
				out.println("import org.eclipse.emf.henshin.interpreter.impl.*;");
				out.println("import org.eclipse.emf.henshin.interpreter.matching.jit.*;");
				out.println();
				out.println("public class " + className + " implements JITMatchFinder {");
				out.println();
				out.println(ruleFields.toString());
				out.println();
				out.println("  public void init(Rule rule) {");
				out.println(ruleInitCode.toString());
				out.println("  }");
				out.println();
				out.println("  public Iterable<Match> findMatches(final EGraph graph) {");
				out.println("    return new Iterable<Match>() {");
				out.println("      public Iterator<Match> iterator() {");
				out.println("        return new Iterator<Match>() {");
				out.println();
				out.println("          private Match nextMatch;");
				out.println("          private boolean computedNext = false;");
				out.println(matcherFields.toString());
				out.println();
				out.println("          public boolean hasNext() {");
				out.println("            if (!computedNext) {");
				out.println("      	       nextMatch = nextMatch();");
				out.println("      	       computedNext = true;");
				out.println("            }");
				out.println("            return (nextMatch!=null);");
				out.println("          }");
				out.println();
				out.println("          public Match next() {");
				out.println("      	     if (hasNext()) {");
				out.println("      	       computedNext = false;");
				out.println("      	     }");
				out.println("      	     return nextMatch;");
				out.println("          }");
				out.println();
				out.println("          public void remove() {");
				out.println("            throw new UnsupportedOperationException();");
				out.println("          }");
				out.println();
				out.println("          public Match nextMatch() {");
				out.println(matcherCode.toString());
				out.println("          }");
				out.println();
				out.println("        }; // new Iterator");
				out.println("      } // iterator()");
				out.println("    }; // new Iterable");
				out.println("  } // findMatches()");
				out.println("} // JITMatchFinderImpl");
				out.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			// Compile the source file:
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			compiler.run(null, null, null, sourceFile.getPath());

			// Load, instantiate and initialize the compiled match finder class:
			try {
				URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
				JITMatcher matchFinder = (JITMatcher) Class.forName(className, true, classLoader).newInstance();
				Method init = matchFinder.getClass().getMethod("init", Rule.class);
				init.invoke(matchFinder, rule);
				return matchFinder;
			}
			catch (Throwable t) {
				throw new RuntimeException(t);
			}
		}
		return null; // rule is not supported by this compiler
	}

	protected void initRuleFields(Rule rule, MatchingCodeGenerator gen) {
		gen.ruleFields.println("  Rule " + objField(rule) + ";");
		gen.ruleInitCode.println("    " + objField(rule) + " = rule;");
		initChildFields(rule, gen);
	}
	
	@SuppressWarnings("unchecked")
	private void initChildFields(EObject parent, MatchingCodeGenerator gen) {
		for (EReference con : parent.eClass().getEAllContainments()) {
			String getter = objField(parent) + getter(con);
			List<EObject> children;
			if (con.isMany()) {
				children = (List<EObject>) parent.eGet(con);
				
			} else {
				children = new ArrayList<EObject>();
				if (parent.eGet(con)!=null) {
					children.add((EObject) parent.eGet(con));
				}
			}
			for (int i=0; i<children.size(); i++) {
				EObject child = children.get(i);
				String type = child.eClass().getName();
				gen.ruleFields.println("  " + type + " " + objField(child) + ";");
				gen.ruleInitCode.println("    " + objField(child) + " = (" + type + ") " + getter + (con.isMany() ? ".get(" + i + ");" : ";"));
				if (child instanceof Node) {
					gen.ruleFields.println("  EClass " + typeField(child) + ";");
					gen.ruleInitCode.println("    " + typeField(child) + " = " + objField(child) + ".getType();");
				}
				if (child instanceof Edge) {
					gen.ruleFields.println("  EReference " + typeField(child) + ";");
					gen.ruleInitCode.println("    " + typeField(child) + " = " + objField(child) + ".getType();");
				}
				if (child instanceof Attribute) {
					gen.ruleFields.println("  EAttribute " + typeField(child) + ";");
					gen.ruleInitCode.println("    " + typeField(child) + " = " + objField(child) + ".getType();");
				}
				initChildFields(children.get(i), gen);
			}
		}
	}
	
	protected String objField(EObject object) {
		return object.eClass().getName().toLowerCase() + object.hashCode();
	}

	protected String typeField(EObject object) {
		return "type" + object.hashCode();
	}

	protected String indexField(EObject object) {
		return "index" + object.hashCode();
	}

	protected String getter(EStructuralFeature feature) {
		return ".get" + feature.getName().substring(0,1).toUpperCase() + feature.getName().substring(1) + "()";
	}
	
	protected abstract boolean generateNextMatchMethod(Rule rule, MatchingCodeGenerator generator);

}
