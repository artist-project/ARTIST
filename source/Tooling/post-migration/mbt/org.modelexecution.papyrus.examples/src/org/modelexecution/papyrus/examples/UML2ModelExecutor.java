/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.papyrus.examples;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.modelexecution.fuml.convert.ConverterRegistry;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConverter;
import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.SuspendEvent;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActionExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.Output;
import org.modelexecution.fumldebug.core.trace.tracemodel.OutputValue;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;

import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Actions.IntermediateActions.CreateObjectAction;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import fUML.Syntax.Activities.IntermediateActivities.InitialNode;

/**
 * The purpose of this class is to demonstrate how to execute a UML2 activities
 * using the Moliz fUML engine.
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class UML2ModelExecutor {

	/** The reference to the converter. */
	private static final ConverterRegistry converterRegistry = ConverterRegistry
			.getInstance();

	/** The resource set to be used for loading the model resource. */
	private ResourceSet resourceSet;

	/** The current resource. */
	private Resource resource;

	private int executionID = -1;
	
	private IConversionResult conversionResult;

	public UML2ModelExecutor() {
		initializeResourceSet();
	}

	@Before
	public void before() {
		executionID = -1;
	}

	/**
	 * Initializes the resource set used by this class.
	 */
	private void initializeResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI,
				UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
	}

	/**
	 * Loads, converts, and executes the {@link Activity} called
	 * &quot;CreateATMActivity&quot; in the file &quot;models/model.uml&quot;.
	 */
	@Test
	public void executeCallBehaviorActivity() {
		loadModel("models/model.uml"); //$NON-NLS-1$
		Trace trace = executeActivity("CreateATMActivity"); //$NON-NLS-1$

		Assert.assertNotNull(trace);

		// one activity called "CrateATMActivity" has been executed
		Assert.assertEquals(1, trace.getActivityExecutions().size());
		ActivityExecution activityExecution = trace.getActivityExecutions()
				.get(0);
		Assert.assertEquals("CreateATMActivity",
				activityExecution.getActivity().name);

		// three activity nodes have been executed
		Assert.assertEquals(3, activityExecution.getNodeExecutions().size());

		// the first executed node was the initial node
		Assert.assertTrue(activityExecution.getNodeExecutions().get(0)
				.getNode() instanceof InitialNode);
		ActivityNodeExecution initialNodeExecution = activityExecution
				.getNodeExecutions().get(0);
		Assert.assertEquals("initCreateATM",
				initialNodeExecution.getNode().name);
		Assert.assertNull(initialNodeExecution.getChronologicalPredecessor());

		// the second executed node was the create object action
		Assert.assertTrue(activityExecution.getNodeExecutions().get(1)
				.getNode() instanceof CreateObjectAction);
		ActionExecution createObjectActionExecution = (ActionExecution) activityExecution
				.getNodeExecutions().get(1);
		Assert.assertEquals("CreateATMAction",
				createObjectActionExecution.getNode().name);
		Assert.assertEquals(initialNodeExecution,
				createObjectActionExecution.getChronologicalPredecessor());

		// the third executed node was the activity final node
		Assert.assertTrue(activityExecution.getNodeExecutions().get(2)
				.getNode() instanceof ActivityFinalNode);
		ActivityNodeExecution finalNodeExecution = activityExecution
				.getNodeExecutions().get(2);
		Assert.assertEquals("finalCreateATM", finalNodeExecution.getNode().name);
		Assert.assertEquals(createObjectActionExecution,
				finalNodeExecution.getChronologicalPredecessor());

		// the create object action had no input, but an object of the type ATM
		// as output
		Assert.assertEquals(0, createObjectActionExecution.getInputs().size());
		Assert.assertEquals(1, createObjectActionExecution.getOutputs().size());
		Output output = createObjectActionExecution.getOutputs().get(0);
		Assert.assertEquals(1, output.getOutputValues().size());
		OutputValue outputValue = output.getOutputValues().get(0);
		Assert.assertTrue(outputValue.getValueSnapshot().getValue() instanceof Object_);
		Object_ atmObject = (Object_) outputValue.getValueSnapshot()
				.getValue();
		Assert.assertEquals("ATM", atmObject.types.get(0).name);

		// the trace model refers to the fUML objects representing the executed
		// UML model, if you want to know which UML model element was
		// represented by such an fUML object you can use the conversion result
		CreateObjectAction fUMLAction = (CreateObjectAction)createObjectActionExecution.getNode();
		org.eclipse.uml2.uml.CreateObjectAction umlAction = (org.eclipse.uml2.uml.CreateObjectAction) conversionResult.getInputObject(fUMLAction);
		Assert.assertNotNull(umlAction);
		Assert.assertEquals("CreateATMAction", umlAction.getName());
	}

	/**
	 * Load the model located at the specified {@code path}.
	 * 
	 * @param path
	 *            the path of the model to be loaded.
	 */
	private void loadModel(String path) {
		resource = resourceSet.getResource(getFileURI(path), true);
	}

	/**
	 * Returns a {@link URI} from the specified {@code path}.
	 * 
	 * @param path
	 *            path to get {@link URI} for.
	 * @return the {@link URI} representing the specified {@code path}.
	 */
	private URI getFileURI(String path) {
		return URI.createFileURI(new File(path).getAbsolutePath());
	}

	/**
	 * Executes the {@link Activity} with the specified {@code name}, which is
	 * contained in the currently loaded {@link #resource}.
	 * 
	 * @param name
	 *            name of the activity to be loaded.
	 */
	private Trace executeActivity(String name) {
		conversionResult = convertResource();
		Activity activity = conversionResult.getActivity(name);
		return executeActivity(activity);
	}

	/**
	 * Converts the currently loaded {@link #resource} into the fUML object
	 * representation.
	 * 
	 * @return the result of the conversion in terms of a
	 *         {@link IConversionResult}.
	 */
	private IConversionResult convertResource() {
		NamedElement namedElement = obtainFirstNamedElement();
		IConverter converter = getConverter(namedElement);
		return converter.convert(namedElement);
	}

	/**
	 * Obtains the first named element that is found in the {@link #resource}.
	 * 
	 * @return the first {@link NamedElement} of the resource currently loaded.
	 */
	private NamedElement obtainFirstNamedElement() {
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof NamedElement)
				return (NamedElement) eObject;
		}
		return null;
	}

	/**
	 * Obtains a converter for the specified {@code namedElement} from the
	 * converter registry.
	 * 
	 * @param namedElement
	 *            to get the converter for.
	 * @return the obtained {@link IConverter}.
	 */
	private IConverter getConverter(NamedElement namedElement) {
		return converterRegistry.getConverter(namedElement);
	}

	/**
	 * Executes the specified {@code activity}.
	 */
	private Trace executeActivity(Activity activity) {
		// register an anonymous event listener that prints the events
		// to system.out directly and calls resume after each step event.
		getExecutionContext().addEventListener(new ExecutionEventListener() {
			@Override
			public void notify(Event event) {
				System.out.println(event);
				if (event instanceof ActivityEntryEvent && executionID == -1) {
					executionID = ((ActivityEntryEvent) event)
							.getActivityExecutionID();
				}
				if (event instanceof SuspendEvent) {
					SuspendEvent suspendEvent = (SuspendEvent) event;
					getExecutionContext().resume(
							suspendEvent.getActivityExecutionID());
				}
			}
		});

		// start the execution
		getExecutionContext().executeStepwise(activity, null,
				new ParameterValueList());
		return getExecutionContext().getTrace(executionID);
	}

	/**
	 * Obtains the singleton {@link ExecutionContext}.
	 * 
	 * @return the {@link ExecutionContext}.
	 */
	private ExecutionContext getExecutionContext() {
		return ExecutionContext.getInstance();
	}

}
