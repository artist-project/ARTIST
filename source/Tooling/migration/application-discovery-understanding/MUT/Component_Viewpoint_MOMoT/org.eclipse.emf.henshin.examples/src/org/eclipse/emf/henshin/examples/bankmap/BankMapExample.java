/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.bankmap;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * Bank example for the Henshin interpreter version using Maps. Shows the usage of the interpreter.
 * 
 * @author Christian Krause, Matthias Tichy
 */
public class BankMapExample {

	/** 
	 * Relative path to the bank model files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/bankmap";
	
	
	
	/**
	 * Run the bank example.
	 * @param path Relative path to the model files.
	 * @param saveResult Whether the result should be saved.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void run(String path) {
		
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Load the example model into an EGraph:
		Resource resource = resourceSet.getResource("mapping_bank.xmi");
		
		EObject bank = resource.getContents().get(0);
		assert bank.eClass().getName().equals("Bank");
		
		EReference accounts = (EReference) bank.eClass().getEStructuralFeature("accounts");
		EMap map = (EMap) bank.eGet(accounts);
		EObject account = (EObject) map.get(new Integer(10));
		EClass accountClass = account.eClass();
		EAttribute credits = (EAttribute) accountClass.getEStructuralFeature("credit");
		
		EGraph graph = new EGraphImpl(resource);
		
		// Load the module:
		Module module = resourceSet.getModule("bankmap.henshin", false);
		
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		engine.getOptions().put(Engine.OPTION_SORT_VARIABLES, false);
		UnitApplication app = new UnitApplicationImpl(engine);
		
		app.setEGraph(graph);
		
		System.out.println("Starting Banking Example with Map Support");
		
		System.out.println("Single transfer on small model");
		
		// Transferring some money:
		app.setUnit(module.getUnit("transferMoney"));
		app.setParameterValue("fromID", 10);
		app.setParameterValue("toID", 50);
		app.setParameterValue("money", 20.0d);
				
		if (!app.execute(null)) { 
			throw new RuntimeException("Error transferring money");
		}
		
		// enlarge the model by creating a lot of new accounts 
		final int maxAccounts = 1000;
		
		for (int i = 100; i < 100+maxAccounts; i++) {
			EObject newAccount = accountClass.getEPackage().getEFactoryInstance().create(accountClass);
			newAccount.eSet(credits, 42d);
			map.put(new Integer(i), newAccount);	
		}		
		graph = new EGraphImpl(resource);
		
		final int transfers = 100;
		
		System.out.println(transfers + " money transfers on model with " + maxAccounts + " accounts");
		
		// run many money transfers between random accounts
		long start = System.currentTimeMillis();
		for (int i = 0; i < transfers; i++) {	
			app = new UnitApplicationImpl(engine);
			app.setEGraph(graph);

			// Transferring some money:
			app.setUnit(module.getUnit("transferMoney"));
			int from = (int) (maxAccounts*Math.random()+100);
			int to = (int) (maxAccounts*Math.random()+100);
			app.setParameterValue("fromID", from);
			app.setParameterValue("toID", to);
			app.setParameterValue("money", 20.0d);
			
			// if from == to, the rule is not applicable --> the execution should be false, if it is not --> exception
			if (app.execute(null) == (from == to)) { 
				throw new RuntimeException("Error transferring money from " + from + " to " + to);
			}
			
			//System.out.println("transfer from " + from + " to " + to + ": " + result);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("run time with map support: " + (end - start) + "ms");
		
		//emptying the graph and testing that case
		map.clear();
		graph = new EGraphImpl(resource);
		app = new UnitApplicationImpl(engine);
		app.setUnit(module.getUnit("transferMoney"));
		app.setParameterValue("fromID", 10);
		app.setParameterValue("toID", 50);
		app.setParameterValue("money", 20.0d);
		app.setEGraph(graph);
		if (app.execute(null)) { 
			throw new RuntimeException("this should not apply as there are no bank2accountentries to match");
		}
	}
	
	public static void main(String[] args) {
		run(PATH); // we assume the working directory is the root of the examples plug-in
	}
	
}
