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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageList;
import org.eclipse.papyrus.infra.core.sashwindows.di.SashWindowsMngr;
import org.eclipse.papyrus.infra.core.sashwindows.di.util.DiResourceFactoryImpl;
import org.eclipse.uml2.uml.NamedElement;
import org.junit.Test;
import org.modelexecution.fuml.convert.ConverterRegistry;
import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fuml.convert.IConverter;
import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.event.SuspendEvent;

import eu.artist.postmigration.mbt.modelexecution.fumldebug.papyrus.util.DiResourceUtil;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Activities.IntermediateActivities.Activity;

/**
 * The purpose of this class is to demonstrate how to execute a Papyrus activity
 * diagram using the Moliz fUML engine.
 * 
 * See also eu.artist.postmigration.mbt.modelexecution.fumldebug.papyrus.PapyrusModelExecutor
 * 
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * 
 */
public class PapyrusModelExecutor {

	/** The reference to the converter. */
	private static final ConverterRegistry converterRegistry = ConverterRegistry
			.getInstance();

	/** The resource set to be used for loading the model resource. */
	private ResourceSet resourceSet;

	/** The current di resource. */
	private Resource diResource;

	public PapyrusModelExecutor() {
		initializeResourceSet();
	}

	/**
	 * Initializes the resource set used by this class.
	 * 
	 * Basically, we may use a default {@link ResourceSetImpl}, but we set the
	 * papyrus-specific resource set factory {@link DiResourceFactoryImpl} for
	 * the file extension &quot;di&quot;.
	 */
	private void initializeResourceSet() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("di", new DiResourceFactoryImpl()); //$NON-NLS-1$
	}

	/**
	 * Loads, converts, and executes the {@link Activity} called
	 * &quot;CallBehaviorAD&quot; in the file &quot;models/PersonCD.di&quot;.
	 */
	@Test
	public void executeCallBehaviorActivity() {
		loadModel("models/PersonCD.di"); //$NON-NLS-1$
		executeActivity("CallBehaviorAD"); //$NON-NLS-1$
	}

	/**
	 * Load the model located at the specified {@code path}.
	 * 
	 * @param path
	 *            the path of the model to be loaded.
	 */
	private void loadModel(String path) {
		diResource = resourceSet.getResource(getFileURI(path), true);
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
	 * contained in the currently loaded {@link #diResource}.
	 * 
	 * @param name
	 *            name of the activity to be loaded.
	 */
	public void executeActivity(String name) {
		IConversionResult conversionResult = convertDiResource();
		Activity activity = conversionResult.getActivity(name);
		executeActivity(activity);
	}

	/**
	 * Converts the currently loaded {@link #diResource} into the fUML object
	 * representation.
	 * 
	 * @return the result of the conversion in terms of a
	 *         {@link IConversionResult}.
	 */
	private IConversionResult convertDiResource() {
		NamedElement namedElement = obtainFirstNamedElement();
		IConverter converter = getConverter(namedElement);
		return converter.convert(namedElement);
	}

	/**
	 * Obtains the first named element that is found in the {@link #diResource}.
	 * 
	 * Therefore, we first obtain the {@link SashWindowsMngr} of the di
	 * resource, read the contained page list, and obtain the first named
	 * element from the list. For these methods, we may use the
	 * {@link DiResourceUtil}.
	 * 
	 * @return the first {@link NamedElement} of the resource currently loaded.
	 */
	private NamedElement obtainFirstNamedElement() {
		SashWindowsMngr sashWindowMngr = DiResourceUtil
				.obtainSashWindowMngr(diResource);
		PageList pageList = sashWindowMngr.getPageList();
		return DiResourceUtil.obtainFirstNamedElement(pageList);
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
	private void executeActivity(Activity activity) {
		// register an anonymous event listener that prints the events
		// to system.out directly and calls resume after each step event.
		getExecutionContext().addEventListener(new ExecutionEventListener() {
			@Override
			public void notify(Event event) {
				System.out.println(event);
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
