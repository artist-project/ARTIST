package org.eclipse.emf.henshin.examples.wrap.mme;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapFactory;

/**
 * Petri net meta-model evolution example for Henshin.
 * @author Christian Krause
 */
public class PetriNetMME {

	/**
	 * Relative path to the meta-model evolution example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/wrap/mme";
	
	/**
	 * Run the Petri net meta-model evolution example.
	 * @param path Relative path to the transformation files.
	 * @param saveResult <code>true</code> if the results should be saved (not overriding the original models).
	 */
	public static void run(String path, boolean saveResult) {
		
		// Create the resource set:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		
		// Load the transformation:
		Module module = resourceSet.getModule("mme.henshin", false);
		
		// Load and register the Petri net meta-model:
		EPackage petriMetamodel = resourceSet.registerDynamicEPackages("petri.ecore").get(0);
		
		// Load the instance model:
		EObject petriModel = resourceSet.getEObject("net.xmi");
		
		// Wrap the instance model:
		Map<EObject,WObject> wrappedPetriNet = 
				WrapFactory.eINSTANCE.createWModelTree(Collections.singleton(petriModel), true);
		WObject petriNetWrapper = wrappedPetriNet.get(petriModel);
		
		// Build the EGraph for the transformation:
		EGraph graph = new EGraphImpl();
		graph.addGraph(petriMetamodel);
		for (WObject wrapper : wrappedPetriNet.values()) {
			graph.addGraph(wrapper);
		}
		
		// Initialize the interpreter:
		Engine engine = new EngineImpl();
		Unit main = module.getUnit("main");
		UnitApplication app = new UnitApplicationImpl(engine, graph, main, null);
		
		// Execute the transformation:
		if (!app.execute(new LoggingApplicationMonitor())) { // new LoggingApplicationMonitor()
			throw new RuntimeException("Cannot apply transformation");
		} else {
			System.out.println("Petri net meta-model evolution finished.");
		}
		
		// Save the changed meta-model and instance model:
		if (saveResult) {
			resourceSet.saveEObject(petriMetamodel, "petri1.ecore");
			resourceSet.saveEObject(petriNetWrapper.getEObject(), "net1.xmi");
			System.out.println("Results saved to petri1.ecore and net1.xmi.");
		}
		
	}
	
	public static void main(String[] args) {
		run(PATH, true);
	}

}
