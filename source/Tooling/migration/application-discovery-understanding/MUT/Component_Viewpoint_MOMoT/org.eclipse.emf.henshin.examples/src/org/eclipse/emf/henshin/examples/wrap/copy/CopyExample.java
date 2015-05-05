package org.eclipse.emf.henshin.examples.wrap.copy;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.util.TraceUtil;
import org.eclipse.emf.henshin.wrap.WObject;
import org.eclipse.emf.henshin.wrap.WrapFactory;
import org.eclipse.emf.henshin.wrap.util.WrapUtil;

/**
 * Henshin wrap model example: copying an arbitrary model.
 * @author Christian Krause
 */
public class CopyExample {

	/** 
	 * Relative path to the copy transformation files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/wrap/copy";
	
	/**
	 * Run the copy example.
	 * @param path Relative path to the copy files.
	 */
	public static void run(String path) {
		
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
				
		// Load the module:
		Module module = resourceSet.getModule("copy.henshin", false);

		// Load the example model:
		resourceSet.registerDynamicEPackages("../../bank/bank.ecore");
		List<EObject> model = resourceSet.getResource("../../bank/example-bank.xmi").getContents();
		
		// Build the wrap model:
		Map<EObject,WObject> wrappers = WrapFactory.eINSTANCE.createWModelTree(model, true);

		// Initialize the interpreter:
		EGraph graph = new EGraphImpl(wrappers.values());
		Engine engine = new EngineImpl();
		UnitApplication app = new UnitApplicationImpl(engine);
		app.setEGraph(graph);
		app.setUnit(module.getUnit("main"));
		
		// Execute the unit:
		if (!app.execute(null)) { // new LoggingApplicationMonitor()
			throw new RuntimeException("Error copying example model.");
		}
		
		// Extract the result:
		List<EObject> copy = WrapUtil.getEObjects(
							 TraceUtil.getTargets(
							 WrapUtil.getWObjects(model, wrappers), graph));
		
		// Check if it is correct:
		if (EcoreUtil.equals(model.get(0), copy.get(0))) {
			System.out.println("Successfully copied bank model.");
		} else {
			resourceSet.saveEObject(copy.get(0), "invalid-copy.xmi");
			throw new RuntimeException("Copied model is not the same as the original. Saved result to invalid-copy.xmi.");
		}
		
	}
	
	public static void main(String[] args) {
		run(PATH); // we assume the working directory is the root of the examples plug-in
	}
	
}
